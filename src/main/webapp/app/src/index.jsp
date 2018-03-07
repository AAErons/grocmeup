<script type="text/javascript" language="javascript">

    function send()
    {
        var urlvariable;

        urlvariable = document.getElementById("valueField").value;

        var ItemJSON;

        ItemJSON = '[  {    "Id": 1,    "ProductID": "1",    "Quantity": 1,  },  {    "Id": 1,    "ProductID": "2",    "Quantity": 2,  }]';

        URL = "http://localhost:8080/grocmeup/service/getValue/" + urlvariable;  //Your URL

        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = callbackFunction(xmlhttp);
        xmlhttp.open("GET", URL, false);
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.setRequestHeader('Authorization', 'Basic ' + window.btoa('apiusername:apiuserpassword')); //in prod, you should encrypt user name and password and provide encrypted keys here instead
        xmlhttp.onreadystatechange = callbackFunction(xmlhttp);
        xmlhttp.send();
        alert(xmlhttp.responseText);
        document.getElementById("div").innerHTML = xmlhttp.statusText + ":" + xmlhttp.status + "<BR><textarea rows='100' cols='100'>" + xmlhttp.responseText + "</textarea>";
    }

    function callbackFunction(xmlhttp)
    {
        //alert(xmlhttp.responseXML);
    }
</script>


<html>
<body id='bod'>
<input id="valueField" type="text" name="valueField" value="Mickey">
<button type="submit" onclick="javascript:send()">call</button>
<div id='div'>

</div></body>
</html>