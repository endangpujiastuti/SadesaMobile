package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class opsilainyaa_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"Opsi\")";
Debug.ShouldStop(67108864);
opsilainyaa.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Opsi")),opsilainyaa.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnakunwarga_click() throws Exception{
try {
		Debug.PushSubsStack("btnAkunWarga_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,64);
if (RapidSub.canDelegate("btnakunwarga_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnakunwarga_click");}
 BA.debugLineNum = 64;BA.debugLine="Private Sub btnAkunWarga_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="StartActivity(AkunPenduduk)";
Debug.ShouldStop(1);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._akunpenduduk.getObject())));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnarsipdokumen_click() throws Exception{
try {
		Debug.PushSubsStack("btnArsipDokumen_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,60);
if (RapidSub.canDelegate("btnarsipdokumen_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnarsipdokumen_click");}
 BA.debugLineNum = 60;BA.debugLine="Private Sub btnArsipDokumen_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnberanda_click() throws Exception{
try {
		Debug.PushSubsStack("btnBeranda_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,56);
if (RapidSub.canDelegate("btnberanda_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnberanda_click");}
 BA.debugLineNum = 56;BA.debugLine="Private Sub btnBeranda_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="StartActivity(actBeranda)";
Debug.ShouldStop(16777216);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._actberanda.getObject())));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndatapenduduk_click() throws Exception{
try {
		Debug.PushSubsStack("btnDataPenduduk_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,52);
if (RapidSub.canDelegate("btndatapenduduk_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btndatapenduduk_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub btnDataPenduduk_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="StartActivity(DataPenduduk)";
Debug.ShouldStop(1048576);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._datapenduduk.getObject())));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnjenisdokumen_click() throws Exception{
try {
		Debug.PushSubsStack("btnJenisDokumen_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,48);
if (RapidSub.canDelegate("btnjenisdokumen_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnjenisdokumen_click");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub btnJenisDokumen_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="StartActivity(TambahDataJenisDokumen)";
Debug.ShouldStop(65536);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._tambahdatajenisdokumen.getObject())));
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
public static RemoteObject  _btnkeluar_click() throws Exception{
try {
		Debug.PushSubsStack("btnKeluar_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,44);
if (RapidSub.canDelegate("btnkeluar_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnkeluar_click");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub btnKeluar_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4096);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._main.getObject())));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpengajuan_click() throws Exception{
try {
		Debug.PushSubsStack("btnPengajuan_Click (opsilainyaa) ","opsilainyaa",11,opsilainyaa.mostCurrent.activityBA,opsilainyaa.mostCurrent,40);
if (RapidSub.canDelegate("btnpengajuan_click")) { return b4a.example.opsilainyaa.remoteMe.runUserSub(false, "opsilainyaa","btnpengajuan_click");}
 BA.debugLineNum = 40;BA.debugLine="Private Sub btnPengajuan_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(Pengajuan)";
Debug.ShouldStop(256);
opsilainyaa.mostCurrent.__c.runVoidMethod ("StartActivity",opsilainyaa.processBA,(Object)((opsilainyaa.mostCurrent._pengajuan.getObject())));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btnAkunWarga As Button";
opsilainyaa.mostCurrent._btnakunwarga = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnArsipDokumen As Button";
opsilainyaa.mostCurrent._btnarsipdokumen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnBeranda As Button";
opsilainyaa.mostCurrent._btnberanda = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btnDataPenduduk As Button";
opsilainyaa.mostCurrent._btndatapenduduk = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnJenisDokumen As Button";
opsilainyaa.mostCurrent._btnjenisdokumen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnKeluar As Button";
opsilainyaa.mostCurrent._btnkeluar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnPengajuan As Button";
opsilainyaa.mostCurrent._btnpengajuan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}