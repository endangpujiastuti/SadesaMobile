package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class opsilainya_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"OpsiLainnya\")";
Debug.ShouldStop(16777216);
opsilainya.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OpsiLainnya")),opsilainya.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _akunwarga_click() throws Exception{
try {
		Debug.PushSubsStack("AkunWarga_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,66);
if (RapidSub.canDelegate("akunwarga_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","akunwarga_click");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub AkunWarga_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 68;BA.debugLine="StartActivity(AkunPenduduk)";
Debug.ShouldStop(8);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._akunpenduduk.getObject())));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arsipdokumen_click() throws Exception{
try {
		Debug.PushSubsStack("ArsipDokumen_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,62);
if (RapidSub.canDelegate("arsipdokumen_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","arsipdokumen_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub ArsipDokumen_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _beranda_click() throws Exception{
try {
		Debug.PushSubsStack("Beranda_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,57);
if (RapidSub.canDelegate("beranda_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","beranda_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub Beranda_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 59;BA.debugLine="StartActivity(actBeranda)";
Debug.ShouldStop(67108864);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._actberanda.getObject())));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datapenduduk_click() throws Exception{
try {
		Debug.PushSubsStack("DataPenduduk_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,52);
if (RapidSub.canDelegate("datapenduduk_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","datapenduduk_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub DataPenduduk_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 54;BA.debugLine="StartActivity(DataPenduduk)";
Debug.ShouldStop(2097152);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._datapenduduk.getObject())));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 16;BA.debugLine="Private AkunWarga As Button";
opsilainya.mostCurrent._akunwarga = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ArsipDokumen As Button";
opsilainya.mostCurrent._arsipdokumen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Beranda As Button";
opsilainya.mostCurrent._beranda = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private JenisDokumen As Button";
opsilainya.mostCurrent._jenisdokumen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Keluar As Button";
opsilainya.mostCurrent._keluar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jenisdokumen_click() throws Exception{
try {
		Debug.PushSubsStack("JenisDokumen_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,47);
if (RapidSub.canDelegate("jenisdokumen_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","jenisdokumen_click");}
 BA.debugLineNum = 47;BA.debugLine="Private Sub JenisDokumen_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 49;BA.debugLine="StartActivity(TambahDataJenisDokumen)";
Debug.ShouldStop(65536);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._tambahdatajenisdokumen.getObject())));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _keluar_click() throws Exception{
try {
		Debug.PushSubsStack("Keluar_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,42);
if (RapidSub.canDelegate("keluar_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","keluar_click");}
 BA.debugLineNum = 42;BA.debugLine="Private Sub Keluar_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 44;BA.debugLine="StartActivity(actLogin)";
Debug.ShouldStop(2048);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._actlogin.getObject())));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pengajuan_click() throws Exception{
try {
		Debug.PushSubsStack("Pengajuan_Click (opsilainya) ","opsilainya",11,opsilainya.mostCurrent.activityBA,opsilainya.mostCurrent,37);
if (RapidSub.canDelegate("pengajuan_click")) { return b4a.example.opsilainya.remoteMe.runUserSub(false, "opsilainya","pengajuan_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub Pengajuan_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
opsilainya.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 39;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(64);
opsilainya.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainya.processBA,(Object)((opsilainya.mostCurrent._main.getObject())));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}