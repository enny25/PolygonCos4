/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validateBuildingName(){
    var x = document.forms["Servlet"]["name"].value;
    if (x==null||x==""){
        alert("Name must be filled out");
        return false;
    }
}
function validateInt(){
    var x = document.forms["Servlet"][""]
}