<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="StudentMatchJavascript.js"></script>
		<link rel="stylesheet" href="style.css">
		
<title>Educator Registration</title>
</head>
<body>
		<div id="banner"><!-- Banner -->
			<img class="logo" src="images/smatchnobkg.png" height="150px">
		</div> 
		<nav>
			<ul>
				<li></li>
				<li> <span class="caret"></span></li>
				<li></li>
				<li></li>
			</ul>
		</nav>
		<div id="contentArea">
	<br>
	<div id="titleMargin"><h1>Please Register Educator</h1></div>
	<div class="formWrapper">
		<form method="post" name="educatorRegistration" action="Registration" >
		<br><Br>
				<!-- <div class="required"><label>Username: </label></div>		
				<input type="text" name="username" placeholder="Username" maxlength="20"/><font color="red" id ="checkusr"></font><br><br><br>
				 -->
				 
				<div class="required"><label>First Name: </label></div>		
				<input type="text" name="firstname" placeholder="First name" maxlength="25"/><font color="red" id ="checkusr"></font><br><br><br>
		
				<div class="required"><label>Last Name: </label></div>		
				<input type="text" name="lastname" placeholder="Last name" maxlength="25"/><font color="red" id ="checkusr"></font><br><br><br>
				
				<div class="required"><label>Email: </label></div>		
				<input type="text" name="email" placeholder="Email address" onblur = "checkConfirmEmail()" maxlength="25"/><font color="red" id ="checkusr"></font><br><br><br>
				
				<div class="required"><label>Confirm Email: </label></div>		
				<input type="text" name="conemail" placeholder="Email address" onblur = "checkConfirmEmail()" maxlength="25"/><font color="red" id ="checkusr"></font><br><br><br>
				
				<div class="required"><label>Password: </label></div>
				<input type="password" name="passw" onblur="CheckPass(this.form)" placeholder="Password" maxlength="20"/><br><br><br>
				
				<div class="required"><label>Confirm Password: </label></div>
				<input type="password" name="passwTwo" onblur="CheckPass(this.form)" onfocus="ResetPassErr()" placeholder="Confirm Password" maxlength="20"/><font color="red" id ="checkpw"></font>
				<input type="hidden" name="classification" value="Educator" />
				<br><br>
				<br><br><br>
					
				<h3>Smatch Policies</h3>
				<textarea  class="textarea" rows="5" cols="50" readonly="yes" wrap="hard">
PLEASE READ THIS USER AGREEMENT AND THESE TERMS AND CONDITIONS CAREFULLY BEFORE USING THIS SITE.

Thank you for using products and services provided by Smatch Inc. &#40;&#34;Smatch&#34;&#41;. You, a person or entity agree to these terms by registering and purchasing a Service Plan or by using free products and services of Smatch.
Terms and conditions of are subject to change with or without notice from us. However, you may view the current version of our terms and conditions via our website.
Please read the following carefully.
Terms of Services
We will provide customer access to Smatch to be operated and hosted on Smatch&#39;s computer servers, any device with a web browser and any applicable additional services in accordance with the terms of the Plan the Customer selects from the Plans and Billing Page.
Customers may use our Services only as permitted by law, including applicable export and re&#45;export control laws and regulations.
Customers are responsible for obtaining access to Smatch, and that access may involve third&#45;party fees &#40;such as Internet service provider or airtime charges&#41;. You are responsible for those fees, including those fees associated with the display or delivery of advertisements. In addition, you must provide and are responsible for all equipment necessary to access Smatch.
Customers understand that the technical processing and transmission of Smatch Services, including your Content, may involve &#40;a&#41; transmissions over various networks; and &#40;b&#41; changes to conform and adapt to technical requirements of connecting networks or devices.
We may review content to determine whether it is illegal or violates our policies, and we may remove or refuse to display content that we reasonably believe violates our policies or the law. However, that does not mean we will review personal content.
Smatch does not own any of the Customer&#39;s Data. You are solely responsible for the accuracy, integrity, and legality of your Data.
Notwithstanding anything to the contrary in this Agreement, Smatch is not responsible or liable for the deletion, corruption, correction, destruction, damage, loss or failure to any of Customer&#39;s Data. Customer shall not knowingly send or store spam, unlawful, infringing, obscene, or libelous material, or viruses, worms, Trojan horses and other harmful code, or data which violates the rights of any individual or entity established in any jurisdiction including, without limitation, medical information, credit card information or social security numbers, driver&#39;s license or personal identification numbers or account numbers on, to or from Smatch Services. Suspected misuse of any product or services provided by Smatch will result in suspension of your accounts and our service provisions.
 
Registration
Customers will need to create a user account in order to have access to Smatch services. You may create your own Smatch Account, or your Smatch Account may be assigned to you by an administrator, such as your employer or educational institution.
Customers who register for Smatch shall be deemed the Account owner unless the Customer designates another Customer as the Account Owner. You are responsible for all activity occurring under your account. Each Account will be associated with one Plan. Smatch reserves the right to modify any of its Plans.
In compliance to this agreement, you represent that you are of legal age to form a binding contract and are not a person barred from receiving Smatch under the laws of the United States or other applicable jurisdiction. You also agree to: &#40;a&#41; provide true, accurate, current and complete information about yourself as prompted by Smatch&#39;s registration page and &#40;b&#41; maintain and promptly update the Registration Data to keep it true, accurate, current and complete. If you provide any information that is untrue, inaccurate, not current or incomplete, or Smatch has reasonable grounds to suspect that such information is untrue, inaccurate, not current or incomplete, Smatch has the right to suspend or terminate your account and refuse any and all current or future use of Smatch &#40;or any portion thereof&#41;.
Privacy Policy
We respond to notices of alleged copyright infringement and terminate accounts of repeat infringes according to the process set out in the U.S. Digital Millennium Copyright Act.
You understand that through your use of Smatch Services you consent to the collection and use &#40;as set forth in the applicable privacy policy&#41; of this information, including the transfer of this information to the United States and/or other countries for storage, processing and use by Smatch and its affiliates.
Our Privacy Policy applies to all of the services offered by Smatch Inc. and its affiliates, including services offered on other sites &#40;such as our advertising services&#41;, but excludes services that have separate privacy policies that do not incorporate this Privacy Policy.
Customers may not use Smatch in any way that violates applicable federal, state, or international law, or for any unlawful purpose. Customers may not use Smatch to send, receive, or download messages or materials that are inappropriate or violate the intellectual property rights of Smatch or others. Customers are entirely responsible for the content of, and any harm resulting from any of their postings or submissions to the Smatch Site and Smatch   &#40;collectively, &#34;Contributions&#34;&#41;. When you create or make available a Contribution, you represent and warrant that you:
    &#40;a&#41; will not attempt to harm, disrupt, or otherwise engage in activity that diminishes, the Smatch Site, computer systems and network, or Smatch   and will not post Contributions that constitute, contain, install or promote spyware, malware or other computer code, whether on Smatch&#39;s or others&#39; computers or equipment, designated to enable you or others to gather information about or monitor the online or other activities of another party;
    &#40;b&#41; will not attempt to interfere with any other person&#39;s use of Smatch  ;
    &#40;c&#41; will not misrepresent your identity or impersonate any person or entity, sell or let others use your profile or password, provide false or misleading identification or address information, or invade the privacy, or violate the personal or proprietary right, of any person or entity;
    &#40;d&#41; will not attempt to gain access to any account, computers or networks related to Smatch   without authorization;
    &#40;e&#41; will not attempt to obtain any data through any means from Smatch, except if we intend to provide or make it available to you;
    &#40;f&#41; will not attempt to charge others to use Smatch   either directly or indirectly;
    &#40;g&#41; will not use Smatch to participate in pyramid schemes or to transmit chain letters, or to create an undue burden on the Smatch Site or the networks or services connected to the Smatch Site, including, without limitation, hacking into the Smatch Site, or using the system to send unsolicited or commercial emails, bulletins, comments or other communications;
    &#40;h&#41; will not use Smatch for any unauthorized purpose including collecting usernames and/or email addresses of other users by electronic or other means for the purpose of sending unsolicited e&#45;mail or communications or unsolicited commercial e&#45;mail or other communications or engaging in unauthorized faming of, or linking to, the Smatch Site without the express written consent of Smatch;
    &#40;i&#41; will not post Contributions that &#40;1&#41; are defamatory, damaging, disruptive, unlawful, inaccurate, pornographic, vulgar, indecent, profane, hateful, racially or ethnically offensive, obscene, lewd, lascivious, filthy, threatening, excessively violent, harassing, or otherwise objectionable or incite, encourage or threaten immediate physical harm against another, including but not limited to Contributions that promote racism, bigotry, sexism, religious intolerance or harm against any group or individual, or &#40;2&#41; contain material that solicits personal information from anyone under 13 or exploits anyone in a sexual or violent manner;
    &#40;j&#41; will not use Smatch  to send or otherwise make available, any Contribution unless you own or have sufficient rights to such Contribution or have received all necessary consents to post such Contribution;
    &#40;k&#41; will not post Contributions that violate the privacy rights, publicity rights, copyrights, contract rights or any other rights of Smatch or any other person;
    &#40;l&#41; have fully complied with any third&#45;party licenses relating to Contributions, agree to pay for all royalties, fees and any other monies owning any person by reason of Contributions that you posted to or through the Smatch Site;
    &#40;m&#41; will not use Smatch to send or otherwise making available any material that contains viruses, Trojan horses, worms, corrupted files, or any other similar software that may damage the operation of another&#39;s computer or property;
    &#40;n&#41; will not use Smatch to download any material sent by another user of Smatch that you know, or reasonably should know, cannot be legally distributed in such manner;
    &#40;o&#41; will not use  Smatch   to violate any code of conduct or other guidelines which may be applicable to Smatch   or the Smatch Site;
    &#40;p&#41; will not attempt to modify, translate, adapt, edit, copy, decompile, disassemble, or reverse engineer any software used or provided by Smatch in connection with the Smatch Site;
    &#40;q&#41; will not post Contributions that contain advertisements or solicit any person to buy or sell any products or services &#40;other than Smatch products and services&#41;.
Account Security
Customers are responsible for maintaining the confidentiality of their password and their account and are fully responsible for all activities that occur under their password or account. You agree to &#40;a&#41; immediately notify Smatch of any unauthorized use of your password or account or any other breach of security, and &#40;b&#41; ensure that you exit from your account at the end of each session. Smatch cannot and will not be liable for any loss or damage arising from your failure to comply with this Section.
When you upload, submit, store, send or receive content to or through our Services, you give Smatch &#40;and those we work with&#41; a worldwide license to use, host, store, reproduce, modify, create derivative works &#40;such as those resulting from translations, adaptations or other changes we make so that your content works better with our Services&#41;, communicate, publish, publicly perform, publicly display and distribute such content. The rights you grant in this license are for the limited purpose of operating, promoting, and improving our Services, and to develop new ones. This license continues even if you stop using our Services Some Services may offer you ways to access and remove content that has been provided to that Service. Also, in some of our Services, there are terms or settings that narrow the scope of our use of the content submitted in those Services. Make sure you have the necessary rights to grant us this license for any content that you submit to our Services.
Restrictions Regarding Use
Customer shall not: &#40;a&#41; rent, lease or loan Smatch; &#40;b&#41; conduct automated functionality tests or load tests on Smatch; &#40;c&#41; attempt to gain access to data that is not Customer&#39;s Data, or use a disproportionate amount of Smatch that interrupts or degrades Smatch; or &#40;d&#41; use Smatch in any manner that violates any applicable law or regulation, including without limitation any third party copyright or other intellectual property or proprietary right.
    Modifications
Smatch reserves the right at any time and from time to time to modify or discontinue, temporarily or permanently, Smatch &#40;or any part thereof&#41; with or without notice. You agree that Smatch shall not be liable to you or to any third party for any modification, suspension or discontinuance of the Smatch &#40;or any part thereof&#41;.
Disclaimer Warranty
OTHER THAN AS EXPRESSLY SET OUT IN THESE TERMS OR ADDITIONAL TERMS, NEITHER SMATCH NOR ITS SUPPLIERS OR DISTRIBUTORS MAKE ANY SPECIFIC PROMISES ABOUT THE SERVICES. FOR EXAMPLE, WE DON&#39;T MAKE ANY COMMITMENTS ABOUT THE CONTENT WITHIN THE SERVICES, THE SPECIFIC FUNCTIONS OF THE SERVICES, OR THEIR RELIABILITY, AVAILABILITY, OR ABILITY TO MEET YOUR NEEDS. WE PROVIDE THE SERVICES &#34;AS IS&#34;.
Liabilities
YOU EXPRESSLY UNDERSTAND AND AGREE THAT SMATCH AND ITS SUBSIDIARIES, AFFILIATES, OFFICERS, EMPLOYEES, AGENTS, PARTNERS AND LICENSORS SHALL NOT BE LIABLE TO YOU FOR ANY PUNITIVE, INDIRECT, INCIDENTAL, SPECIAL, CONSEQUENTIAL OR EXEMPLARY DAMAGES, INCLUDING, BUT NOT LIMITED TO, DAMAGES FOR LOSS OF PROFITS, GOODWILL, USE, DATA OR OTHER INTANGIBLE LOSSES &#40;EVEN IF SMATCH HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES&#41;, RESULTING FROM: &#40;a&#41; THE USE OR THE INABILITY TO USE SMATCH; &#40;b&#41; THE COST OF PROCUREMENT OF SUBSTITUTE GOODS AND SERVICES; &#40;c&#41; UNAUTHORIZED ACCESS TO OR ALTERATION OF YOUR TRANSMISSIONS OR DATA; &#40;d&#41; STATEMENTS OR CONDUCT OF ANY THIRD PARTY ON THE SMATCH SERVICE; OR &#40;e&#41; ANY OTHER MATTER RELATING TO SMATCH.
General Information
This Agreement is the entire agreement between the parties on the subject matter hereof. No amendment or modification hereof will be valid or binding upon the parties unless made in writing and signed by the duly authorized representatives of both parties. The relationship of the parties hereunder is that of independent contractors, and this Agreement will not be construed to imply that either party is the agent, employee, or joint venturer of the other. In the event that any provision of this Agreement is held to be unenforceable, this Agreement will continue in full force and effect without said provision and will be interpreted to reflect the original intent of the parties. Customer may not assign this Agreement &#40;by operation of law or otherwise&#41; without the prior written consent of Smatch and any prohibited assignment will be null and void. This Agreement will be binding upon and will inure to the benefit of the parties permitted successors and/or assignees. Waiver by either party of a breach of any provision of this Agreement or the failure by either party to exercise any right hereunder will not operate or be construed as a waiver of any subsequent breach of that right or as a waiver of any other right.


</textarea>
<br><br>
                <div class="required">
                  <label>
                    <input type="checkbox" name="iagree" id="iagree"/>
                  	Yes, I agree to Smatch Terms and Conditions above.
                  </label>
                </div>
			
			<br><br><br>
			<input type="button" value="Cancel" onclick="location.href='Login.jsp'">
			<input type="button" value="Create My Account" onclick="CheckFields()"><br><br><!-- "CheckFields()" -->
			</form>
	</div>
	<br><br><br>
	</div>
	<div id="footer">
		<small> &copy; 2014 Smatch, Inc. All Rights Reserved				
	            <table align="center">
					<tr>
						<td><a href="terms.jsp">Terms</a></td>
						<td><a href="siteMap.jsp">Sitemap</a></td>
						<td><a href="aboutUs.jsp">About Us</a></td>
						<td><a href="help.jsp">Help</a></td>
					</tr>
				</table>
		</small>
		<br>
	</div>
<script>		
function CheckPass(form){
	passw = document.educatorRegistration.passw.value;
	passwTwo = document.educatorRegistration.passwTwo.value;
	if(passw!=passwTwo){
		document.getElementById("checkpw").innerHTML = "\tPasswords do not match!";
		//form.passw.value = "";
		//form.passwTwo.value = "";
	}
	else{
		document.getElementById("checkpw").innerHTML = "";
	}
	
}

function ResetPassErr(){
		document.getElementById("checkpw").innerHTML = "";
	
}

function CheckFields(){
	x = false;
	email = document.educatorRegistration.email.value;
	conemail = document.educatorRegistration.conemail.value;
	name = document.educatorRegistration.firstname.value;
	lname = document.educatorRegistration.lastname.value;
	passw = document.educatorRegistration.passw.value;
	passwTwo = document.educatorRegistration.passwTwo.value;
	iagree = document.educatorRegistration.iagree.checked;
	
	dotpos=email.lastIndexOf("@uncc.edu");
	
	if(name == null || name.trim() == ""){
		alert("Name field is required!");
	}
	else if	( lname == null || lname.trim() == ""){
		alert("Last name field is required!");
	}
	else if(email == null || email.trim() == ""){
		alert("Email field is required!");
	}
	else if(dotpos < (email.length-10) || dotpos < 1){
		alert("Invalid email address: Only UNCC accounts are accepted eg xx@uncc.edu");
	}
	else if(conemail == null || conemail.trim() == ""){
		alert("Confirmation Email field is required!");
	}
	else if(email != conemail){
		alert("Email address do not match");
		document.educatorRegistration.email.value = "";
		document.educatorRegistration.conemail.value = "";
		checkConfirmEmail();
	}
	else if(passw == null || passw.trim() == ""){
		alert("Password field is required!");
	}
	else if(passwTwo == null || passwTwo.trim() == ""){
		alert("Password Confirmation field is required");
	}
	else if(passw != passwTwo){
		alert("Passwords do not match");
		document.educatorRegistration.passw.value = "";
		document.educatorRegistration.passwTwo.value = "";
		ResetPassErr();
	}
	else if(!iagree){
		alert("You must agree to the Terms and Conditions to Register");
	}
	else{
		document.educatorRegistration.submit();
		x=true;
	}
	return x;
}
</script>