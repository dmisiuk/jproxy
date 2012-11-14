<!DOCTYPE html>
<html>
<head>
    <title>test jproxy</title>
    <meta charset="UTF-8">
</head>

<body>
<h2>jproxy test</h2>
</body>

<form action="/json" method="post">
    <textarea rows="20" cols="50" name="json">
    </textarea>
    <input type="submit" value="send to servlet">
</form>
<form action="/json" method="get">
    <input type="hidden" name="json" value="{method: 'by.minsler.rpc.dao.getAllFilm', params: {}}">
    <input type="submit" value="get all film">
</form>

</form>
</html>
