<%@ include file="commen/heder.jspf" %>
<%@ include file="commen/navbar.jspf" %>
<div class="container pt-5">
	<h1>Enter Todo Details</h1>
	
	<form:form method="post" modelAttribute="todo">
	  <fieldset class="mb-3">
	     <form:label path="descrption" >Descrption</form:label>
	     <form:input type="text" path="descrption" />
	  </fieldset>
	  <fieldset class="mb-3">
	     <form:label path="targetDate">Target Date</form:label>
	     <form:input type="text" path="targetDate"/>
	  </fieldset>
  
    	<input type="submit" class="btn btn-success">
     </form:form>
</div>
<%@ include file="commen/footer.jspf" %>
<script type="text/javascript">
		$('#targetDate').datepicker({
			format: 'yyyy-mm-dd'
		});
</script>

