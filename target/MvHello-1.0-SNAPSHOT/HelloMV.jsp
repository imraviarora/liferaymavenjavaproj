<%-- 
    Document   : HelloMV
    Created on : Oct 15, 2019, 11:13:10 AM
    Author     : badree.tiwari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=request.getAttribute("name")%>
    
        <FORM  ACTION="SubmitDetail" METHOD="doGet">
<TABLE BORDER="1">
    <h1>Please Submit Your Name</h1>
    <TR>
    <TD>Your name</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="name" SIZE="20">
    </TD>
  </TR>
  
</TABLE>
<P><INPUT TYPE="SUBMIT" VALUE="Submit" NAME="B1"></P>
</FORM>
    </body>
</html>
