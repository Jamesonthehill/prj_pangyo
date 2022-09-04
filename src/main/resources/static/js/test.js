(function (){
	'use strict'

	const init = function(){


		var t = document.getElementById('target');

		var t1 = document.getElementById('target1');

		var t2 = document.getElementById('target2');

		var t3 = document.getElementById('target3');


		function btn_numbering(event){
			switch (event.target.id){
				case 'target1':
					alert('타켓 1')
					break;
				case 'target2':
					alert('타켓 2')
					break;
				// case 'target3':
				// 	alert('타켓 3')
				// 	break;
				case 'target':
					alert('타켓 0')
					break;
			}
		}

		t1.addEventListener('click', btn_numbering);
		t2.addEventListener('click', btn_numbering);

		t3.addEventListener('click', function(event){
				alert("이건 내가 따로만든 것");
		});

		t.addEventListener('click', function(event){
			alert("hello world" + event.target.id);
		})

		}
	init();
})();