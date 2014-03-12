<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Welcome to TodoApp</title>

</head>
<body>

	<div id="page-body" role="main">
		<h1>Welcome to Grails</h1>
		<p>
			${welcomeMessage}
		</p>
		<p>
			Hello user:
			${username}
		</p>
		<p>
			Your tasks are: <br />
		<ul>
			<g:each var="task" in="${usersTasks}">
				<li>
					${task.description}, ${task.priority}
				</li>
			</g:each>
		</ul>
		</p>
	</div>
</body>
</html>
