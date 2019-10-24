var app = angular.module('bfCodeTest', []);

app.controller('studentCtrl', function($scope, $location, $http) {
	console.log("StudentCtrl loaded.");
	
	$http.get('http://localhost:8080/api/getStudents')
	.then(function(responseStudent) {
		$http.get('http://localhost:8080/api/getSubjects')
		.then(function(responseSubject) {
		$scope.students = responseStudent.data;
		$scope.subjects = responseSubject.data;
	});
	});
});
	

app.controller('examCtrl', function($scope, $location, $http) {
	console.log("ExamCtrl loaded.");
	
	$http.get('http://localhost:8080/api/getExams')
	.then(function(responseExam) {
		$http.get('http://localhost:8080/api/getStudents')
		.then(function(responseStudent) {
		$scope.exams = responseExam.data;
		$scope.students = responseStudent.data;
	});
});
});

app.controller('gradeCtrl', function($scope, $location, $http) {
	console.log("GradeCtrl loaded.");
	
	$http.get('http://localhost:8080/api/getExams')
	.then(function(responseExam) {
		$http.get('http://localhost:8080/api/getStudents')
		.then(function(responseStudent) {
			$http.get('http://localhost:8080/api/getGrades')
			.then(function(responseGrade) {
		$scope.exams = responseExam.data;
		$scope.students = responseStudent.data;
		$scope.grades = responseGrade.data;
	});
	});
	});
});




