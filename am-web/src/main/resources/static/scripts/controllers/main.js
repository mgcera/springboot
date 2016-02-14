angular.module('amApp')
  .controller('MainCtrl', function ($scope, $http) {     
	  
	  $http({
          method: 'GET',
          url: 'http://localhost:8082/assets'
      }).then(function(response) {
    	  $scope.races = response.data;
      }, function(response) {
    	  console.error('Error requesting assets');
      });
	  
  });