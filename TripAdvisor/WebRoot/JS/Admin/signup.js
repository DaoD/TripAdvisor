$(function(){
	$('#signupForm').form({
		fields: {
			password2: 'match[password]',
			email: 'email',
		}
	});
})