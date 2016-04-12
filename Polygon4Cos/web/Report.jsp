<%-- 
    Document   : AddReport
    Created on : Apr 4, 2016, 10:34:38 AM
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>

            body{
                position: relative;
                width: 100%;
                display: block;
            }

            body > *  {
                margin: auto;
                width: auto;
                display: block;
                overflow: auto;
            }

            body > script {
                display: none
            }

            table{
                border: 1px solid black;
                border-collapse: collapse;
                white-space: nowrap;
                display: table;
            }
            .first{
                border: 1px solid black;
                justify-content: center;
                text-align: center;
                display: flex;
                width: 50%;
                height: 130px;
                background-color: lightgrey;
            }


            .second{
                width: 100%;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box; 
            }

            .secondText{
                font-size: 80%
            }

            .gI{
                background-color: lightblue;
                text-align: center;
                height: auto;
                width: 500px;
            }

            .gInfo{
                text-align: center;
                font-family: Verdana;  
                font-size: 1em;
            }

            .rTableBody{
                display:table;         
                width:auto;         
                background-color:#eee;         
                border:1px solid  #666666;         
                border-spacing:5px;/*cellspacing:poor IE support for  this*/
            }
            .rTableRow{
                display:table-row;
                width:auto;
                clear:both;
            }
            .rTableCell{
                float:left;/*fix for  buggy browsers*/
                display:table-column;         
                width:200px;  
                border: 1px solid black;
                background-color:#ccc;  
            }
        </style>





    </head>
    <body>

        <h1>Building Review</h1>


        <div class="first">
            <div class="second">
                <input type="text" name="buildingName" value=""><br>
                Name on building<br>
                <input type="text" name="address" value=""><br>
                Address<br>
                <input type="text" name="zipCity" value=""><br>
                Zipcode / City<br>
            </div>
            <div class="second">
                <input type="text" name="date" value=""><br>
                Date<br>
                <div class="secondText">
                    Polygon<br>
                    Rypevang 5<br>
                    3450 Allerød<br>
                    <br>
                    Tlf.4814 0555<br>
                    Sundebygninger@polygon.dk
                </div>
            </div>    


        </div>

        &gt;&gt;&gt;&gt;&gt;Insert picture here&lt;&lt;&lt;&lt;&lt;
        <br>
        <br>
        <div class="gI">
            <h3>General information about the building</h3><br>  
            Build year 
            <div class="gInfo"><input type="text" name="buildYear" value="" size="30"></div><br>
            Building areal in m2(Every floor is separate) 
            <div class="gInfo"><input type="text" name="buildingAreal" value=""></div><br>
            What is the building used for / what was the building used for ? 
            <div class="gInfo"><input type="text" name="buildingUsedFor" value=""></div><br>
        </div>

        <h2>Review of building outside<br></h2>   

        <div class="rTable">         
            <div class="rTableBody">
                <div class="rTableRow">
                    <div class="rTableCell">Roof</div>
                    <div class="rTableCell">Remarks</div>
                    <div class="rTableCell">No remarks</div>
                    <div class="rTableCell">Pictures</div>
                </div>
                <div class="rTableRow">
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                </div>
                <div class="rTableRow">
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                    <div class="rTableCell">&nbsp;</div>
                </div>
            </div>
        </div>



        <br><table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>Roof</td>
                    <td>Remarks</td>
                    <td>No remarks</td>
                    <td>Pictures</td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td><input type="checkbox" name="remarks" value="ON"></td>
                    <td><input type="checkbox" name="noRemarks" value="ON"></td>
                    <td><input type="checkbox" name="pictures" value="ON"></td>
                </tr>

                <tr>                
                    <td colspan = "4"><input type="text" name="test" value="" size="100%" /></td>
                </tr>           
            </tbody></table><br>
        <table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>Outerwalls</td>
                    <td>Remarks</td>
                    <td>No remarks</td>
                    <td>Pictures</td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td><input type="checkbox" name="remarks" value="ON"></td>
                    <td><input type="checkbox" name="noRemarks" value="ON"></td>
                    <td><input type="checkbox" name="pictures" value="ON"></td>
                </tr>

                <tr>                
                    <td colspan="4"><input type="text" name="Roof" value=""></td>
                </tr>           
            </tbody></table><br>
        Room<input type="text" name="Room" value="">
        <table border="1" style="width :30%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td><input type="checkbox" name="remarksRoom" value="ON">Remarks</td>
                    <td><input type="checkbox" name="noRemarksRoom" value="ON">No remarks</td>
                </tr>
            </tbody></table>

        Damage and repair<br>
        <table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>Was there damage in the room?</td>
                    <td><input type="checkbox" name="yes" value="ON"><br>
                        <input type="checkbox" name="no" value="ON"></td>
                </tr>

                <tr>
                    <td>When?</td>
                    <td><input type="text" name="when" value=""></td>
                    <td>Where?</td>
                    <td><input type="text" name="where" value=""></td>
                </tr>

                <tr>
                    <td>What has happened?</td>
                    <td><input type="text" name="whatHappened" value=""></td>
                    <td>What was repaired?</td>
                    <td><input type="text" name="whatRepaired" value=""></td>
                </tr>

                <tr>
                    <td>Damage</td>
                    <td>
                        Moist<input type="checkbox" name="moist" value="ON"><br>
                        Sponge<input type="checkbox" name="sponge" value="ON"><br>
                        Mold<input type="checkbox" name="mold" value="ON"><br>
                        Fire<input type="checkbox" name="fire" value="ON"><br>
                        Other damage<input type="checkbox" name="other" value="ON">
                        <input type="text" name="otherDamage" value="">
                    </td>
                </tr>
            </tbody></table><br>


        Review of...
        <table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>&nbsp;</td>
                    <td>Remarks</td>
                    <td>No remarks</td>
                    <td>Pictures</td>
                </tr>

                <tr>
                    <td>Walls</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>Roof</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>Floor</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>Windows / Doors</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td><input type="checkbox" name="remark" value="ON"></td>
                    <td><input type="checkbox" name="noRemark" value="ON"></td>
                    <td><input type="checkbox" name="picture" value="ON"></td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>
            </tbody></table>

        Moisture scanning
        <br><br><table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>Has a moisture scanning been conducted?</td>
                    <td><input type="checkbox" name="yes" value="ON"> Yes
                        <input type="checkbox" name="no" value="ON"> No
                    </td>

                </tr>

                <tr>
                    <td>Moisture scanning</td>
                    <td>&nbsp;</td>
                    <td>Measurement point</td>
                    <td>&nbsp;</td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                </tr>
            </tbody></table>

        Conclusion
        <br><br><br><br><br><br><table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>Room</td>
                    <td>Remarks</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>

            </tbody></table><br>

        The building review have been made by: <input type="text" name="review" value="">, Polygon<br>
        in cooperation with <input type="text" name="person" value=""> (Building responsible).

        The building is categorised as:
        <br><br><br><br><table border="1" style="width :50%" cellpadding="0" cellspacing="0">
            <tbody><tr>
                    <td>State</td>
                    <td>Description of the building</td>
                    <td>Function of the building</td>
                    <td>State level</td>
                </tr>

                <tr>
                    <td>State level 0</td>
                    <td>The building is new and as build</td>
                    <td>The function is as described</td>
                    <td><input type="checkbox" name="sLZero" value="ON"></td>
                </tr>

                <tr>
                    <td>State level 1</td>
                    <td>The building is intact, but start of wear and visible damages (Only cosmetic damages)</td>
                    <td>The function is a described</td>
                    <td><input type="checkbox" name="sLOne" value="ON"></td>
                </tr>

                <tr>
                    <td>State level 2</td>
                    <td>The building has started decaying with a few defect components</td>
                    <td>The function is decreased - risk of consequential damages</td>
                    <td><input type="checkbox" name="sLTwo" value="ON"></td>
                </tr>

                <tr>
                    <td>State level 3</td>
                    <td>The building is element is degraded and must be replaced</td>
                    <td>The function has ceased - risk of consequential damages</td>
                    <td><input type="checkbox" name="sLThree" value="ON"></td>
                </tr>
            </tbody></table><br>




    </body>
</html>
