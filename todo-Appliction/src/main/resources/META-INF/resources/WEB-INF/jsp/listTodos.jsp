
<%@ include file="commen/heder.jspf" %>
<%@ include file="commen/navbar.jspf" %>
<div class="container">
 <h1>Your Todos </h1>

<table class="table">
  <thead>
    <tr>
      
       
       <th>Description</th>
       <th>Date</th>
       <th>Done</th>
       <th></th>
       <th></th>
    </tr>
  
  </thead>
  <tbody>
    <c:forEach items="${todos}" var="todo">
     <tr>
        
        <td>${todo.descrption}</td>
        <td>${todo.targetDate}</td>
        <td>${todo.done}</td>
        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
     </tr>
    </c:forEach>
  </tbody>

</table>
<a href="add-todo" class="btn btn-primary">Add Todo</a>
</div>
<%@ include file="commen/footer.jspf" %>