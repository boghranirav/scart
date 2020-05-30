function userRegValidation()
{
    if(document.getElementById("rgfrm:uname").value==="")
    {
        document.getElementById("erruname").style.display="block";
    }else if(document.getElementById("rgfrm:fname").value==="")
    { 
        document.getElementById("erruname").style.display="none";
        document.getElementById("errfname").style.display="block";
    }else if(document.getElementById("rgfrm:lname").value==="")
    {
        document.getElementById("errfname").style.display="none";
         document.getElementById("errlname").style.display="block";
    }else if(document.getElementById("rgfrm:email").value==="")
    {
            document.getElementById("errlname").style.display="none";
        
        document.getElementById("erremail").style.display="block";
    }
    else if(document.getElementById("rgfrm:pnumber").value==="")
    {
         document.getElementById("erremail").style.display="none";
         document.getElementById("errpnumber").style.display="block";
    }else if(document.getElementById("rgfrm:address").value==="")
    {
        document.getElementById("errpnumber").style.display="none";
        document.getElementById("erraddress").style.display="block";
    }else if(document.getElementById("rgfrm:pcode").value==="")
    {
            document.getElementById("erraddress").style.display="none";
    document.getElementById("errpcode").style.display="block";
    }else if(document.getElementById("rgfrm:pcode").value==="0")
    {
             document.getElementById("erraddress").style.display="none";
        document.getElementById("errpcode").style.display="block";
    }
    else if(document.getElementById("rgfrm:state").value==="")
    {
        document.getElementById("errpcode").style.display="none";
        document.getElementById("errstate").style.display="block";
    }else if(document.getElementById("rgfrm:city").value==="")
    {
        document.getElementById("errstate").style.display="none";
        document.getElementById("errcity").style.display="block";
    }else{
        document.getElementById("erruname").style.display="none";
         document.getElementById("errfname").style.display="none";
          document.getElementById("errlname").style.display="none";
           document.getElementById("errpword").style.display="none";
            document.getElementById("errrpword").style.display="none";

        document.getElementById("errrpword2").style.display="none";
             document.getElementById("erremail").style.display="none";
             document.getElementById("errpnumber").style.display="none";
    document.getElementById("errcity").style.display="none";
     document.getElementById("errpcode").style.display="none";
     document.getElementById("erraddress").style.display="none";
      document.getElementById("errstate").style.display="none";
    }    

    
}