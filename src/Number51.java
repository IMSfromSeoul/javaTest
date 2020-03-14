<html>
<head>
<title>SW마에스트로 11기 선발 코딩 테스트 - ToDo 리스트 완성하기</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="lib/materialize/materialize.min.css"  media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
<h5 class="center-align">
        It is your To-Do List!
</h5>
<div class="container">
<div class="row">
<div class="col s4 m4">
<div class="card">
<div class="card-content">
<div class="row">
<div class="input-field col s12">
<input id="name" type="text" class="validate">
<label for="name">Name</label>
</div>
<div class="input-field col s12">
<input id="description" type="text" class="validate">
<label for="description">Description</label>
</div>
<div class="col s12">
<a class="addBtn waves-effect waves-light btn-small">등록</a>
</div>
</div>
</div>
</div>
</div>
<div class="col s8 m8">
<div class="card card-table-container">
<div class="card-content">
<table id="todo-table">
<tr>
<th class="th-name">Name</th>
<th class="th-description">Description</th>
<th class="th-button"></th>
</tr>
<tr index="e5gdulp0wq4">
<td>1일 1문제 풀기</td>
<td>알고리즘 사이트에 접속하여 문제 풀기</td>
<td>
<a class="removeBtn waves-effect waves-light btn-small">삭제</a>
</td>
</tr>
</table>
</div>
</div>
</div>
</div>
</div>
</body>
<script type="text/javascript" src="lib/materialize/materialize.min.js"></script>
<script src="main.js"></script>
<script>
      const goorm = new goormModule();
              goorm.init();
</script>
</html>
