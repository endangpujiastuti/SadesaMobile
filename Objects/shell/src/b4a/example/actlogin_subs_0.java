package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actlogin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firesultsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_create", _firesultsttime);}
Debug.locals.put("FiResultStTime", _firesultsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FiResultStTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"Login\")";
Debug.ShouldStop(268435456);
actlogin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),actlogin.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,50);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnlogin_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="If txtnama.Text = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",actlogin.mostCurrent._txtnama.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="MsgboxAsync(\"Masukkan Username\",\"Info\")";
Debug.ShouldStop(1048576);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Username")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 54;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 56;BA.debugLine="If txtpass.Text = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",actlogin.mostCurrent._txtpass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 57;BA.debugLine="MsgboxAsync(\"Masukkan Password\",\"Info\")";
Debug.ShouldStop(16777216);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukkan Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 58;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 61;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(268435456);
actlogin.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,actlogin.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="p = txtpass.Text";
Debug.ShouldStop(1073741824);
actlogin.mostCurrent._p = actlogin.mostCurrent._txtpass.runMethod(true,"getText");
 BA.debugLineNum = 65;BA.debugLine="enkripsi";
Debug.ShouldStop(1);
_enkripsi();
 BA.debugLineNum = 68;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(8);
actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_admindesa WHERE username='"),actlogin.mostCurrent._txtnama.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 69;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT";
Debug.ShouldStop(64);
actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_admindesa WHERE username='"),actlogin.mostCurrent._txtnama.runMethod(true,"getText"),RemoteObject.createImmutable("' and password='"),actlogin.mostCurrent._epass,RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 72;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",actlogin.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 74;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(512);
actlogin.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 76;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
actlogin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 77;BA.debugLine="StartActivity(AkunPenduduk)";
Debug.ShouldStop(4096);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._akunpenduduk.getObject())));
 }else {
 BA.debugLineNum = 79;BA.debugLine="MsgboxAsync(\"Password tidak ditemukan\",\"Info\")";
Debug.ShouldStop(16384);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Password tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 80;BA.debugLine="txtpass.Text = \"\"";
Debug.ShouldStop(32768);
actlogin.mostCurrent._txtpass.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 81;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 84;BA.debugLine="MsgboxAsync(\"Username tidak ditemukan\",\"Info\")";
Debug.ShouldStop(524288);
actlogin.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Username tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),actlogin.processBA);
 BA.debugLineNum = 85;BA.debugLine="txtnama.Text = \"\"";
Debug.ShouldStop(1048576);
actlogin.mostCurrent._txtnama.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 86;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnregis_click() throws Exception{
try {
		Debug.PushSubsStack("btnRegis_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,41);
if (RapidSub.canDelegate("btnregis_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnregis_click");}
 BA.debugLineNum = 41;BA.debugLine="Sub btnRegis_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="StartActivity(actRegister)";
Debug.ShouldStop(1024);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actregister.getObject())));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnresetsandi_click() throws Exception{
try {
		Debug.PushSubsStack("BtnResetSandi_Click (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,46);
if (RapidSub.canDelegate("btnresetsandi_click")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","btnresetsandi_click");}
 BA.debugLineNum = 46;BA.debugLine="Sub BtnResetSandi_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(actLupaKataSandi)";
Debug.ShouldStop(32768);
actlogin.mostCurrent.__c.runVoidMethod ("StartActivity",actlogin.processBA,(Object)((actlogin.mostCurrent._actlupakatasandi.getObject())));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enkripsi() throws Exception{
try {
		Debug.PushSubsStack("enkripsi (actlogin) ","actlogin",2,actlogin.mostCurrent.activityBA,actlogin.mostCurrent,90);
if (RapidSub.canDelegate("enkripsi")) { return b4a.example.actlogin.remoteMe.runUserSub(false, "actlogin","enkripsi");}
 BA.debugLineNum = 90;BA.debugLine="Sub enkripsi";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="passwordhash = md.GetMessageDigest(p.GetBytes(\"UT";
Debug.ShouldStop(67108864);
actlogin._passwordhash = actlogin.mostCurrent._md.runMethod(false,"GetMessageDigest",(Object)(actlogin.mostCurrent._p.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));
 BA.debugLineNum = 92;BA.debugLine="epass = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(134217728);
actlogin.mostCurrent._epass = actlogin.mostCurrent._bytecon.runMethod(true,"HexFromBytes",(Object)(actlogin._passwordhash));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtnama As EditText";
actlogin.mostCurrent._txtnama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtpass As EditText";
actlogin.mostCurrent._txtpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim md As MessageDigest";
actlogin.mostCurrent._md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ByteCon As ByteConverter";
actlogin.mostCurrent._bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 21;BA.debugLine="Dim passwordhash() As Byte";
actlogin._passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 22;BA.debugLine="Dim epass As String";
actlogin.mostCurrent._epass = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim p As String";
actlogin.mostCurrent._p = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}