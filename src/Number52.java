const challenge = {
        /*
         * addData 함수를 완성시켜주세요.
         */
        addData: async function(name, description) {
        // 먼저 서버 쪽에 데이터를 등록합니다.
        //
        fetch('/api/todolist', {
        method: 'PUT',
        headers: {
        'Content-Type': 'application/json'
        },
        body: JSON.stringify({
        name: name,
        description: description
        })
        }).then(function(response) {
        return response.json();
        }).then(function(data) {
        var table = document.getElementById("todo-table");
        var row = table.insertRow(-1);
        row.setAttribute("index",data);
        var nameCell = row.insertCell(0);
        var descriptionCell = row.insertCell(1);
        var removeBtnCell = row.insertCell(2);
        nameCell.innerHTML = name;
        descriptionCell.innerHTML = description;
        var removeBtn = document.createElement("A");
        removeBtn.className = "removeBtn waves-effect waves-light btn-small";
        removeBtn.innerHTML = '삭제';
        removeBtnCell.appendChild(removeBtn);
        });
        },

        /*
         * removeData 함수를 완성시켜주세요.
         */
        removeData: function(index) {
        // 먼저 서버 쪽에 데이터 삭제 요청을 합니다.
        //
        fetch(`/api/todolist/${index}`, {
        method: 'DELETE',
        headers: {
        'Content-Type': 'application/json'
        },
        body: JSON.stringify({

        })
        }).then(function(response) {
        return response.json();
        }).then(function(data) {
        var table = document.getElementById("todo-table");

        for (var i = 1; i < table.rows.length; i++) {
        var row = table.rows[i];
        const index = row.getAttribute('index');
        if (index === data) {
        table.deleteRow(i);
        break;
        }
        }
        });
        }
        }