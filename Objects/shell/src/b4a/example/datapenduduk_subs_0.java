package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class datapenduduk_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (datapenduduk) ","datapenduduk",8,datapenduduk.mostCurrent.activityBA,datapenduduk.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.datapenduduk.remoteMe.runUserSub(false, "datapenduduk","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"DataPenduduk\")";
Debug.ShouldStop(4194304);
datapenduduk.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DataPenduduk")),datapenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="showList";
Debug.ShouldStop(16777216);
_showlist();
 BA.debugLineNum = 27;BA.debugLine="Lv.TwoLinesLayout.Label.TextColor = Colors.Black";
Debug.ShouldStop(67108864);
datapenduduk.mostCurrent._lv.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",datapenduduk.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (datapenduduk) ","datapenduduk",8,datapenduduk.mostCurrent.activityBA,datapenduduk.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.datapenduduk.remoteMe.runUserSub(false, "datapenduduk","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (datapenduduk) ","datapenduduk",8,datapenduduk.mostCurrent.activityBA,datapenduduk.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.datapenduduk.remoteMe.runUserSub(false, "datapenduduk","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntambah_click() throws Exception{
try {
		Debug.PushSubsStack("btnTambah_Click (datapenduduk) ","datapenduduk",8,datapenduduk.mostCurrent.activityBA,datapenduduk.mostCurrent,40);
if (RapidSub.canDelegate("btntambah_click")) { return b4a.example.datapenduduk.remoteMe.runUserSub(false, "datapenduduk","btntambah_click");}
 BA.debugLineNum = 40;BA.debugLine="Private Sub btnTambah_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
datapenduduk.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 42;BA.debugLine="StartActivity(Pengajuan)";
Debug.ShouldStop(512);
datapenduduk.mostCurrent.__c.runVoidMethod ("StartActivity",datapenduduk.processBA,(Object)((datapenduduk.mostCurrent._pengajuan.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btnTambah As Button";
datapenduduk.mostCurrent._btntambah = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Lv As ListView";
datapenduduk.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
datapenduduk.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("showList (datapenduduk) ","datapenduduk",8,datapenduduk.mostCurrent.activityBA,datapenduduk.mostCurrent,45);
if (RapidSub.canDelegate("showlist")) { return b4a.example.datapenduduk.remoteMe.runUserSub(false, "datapenduduk","showlist");}
int _i = 0;
 BA.debugLineNum = 45;BA.debugLine="Sub showList";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(8192);
datapenduduk.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,datapenduduk.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="Lv.Clear";
Debug.ShouldStop(32768);
datapenduduk.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 49;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(65536);
datapenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), datapenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT * FROM tb_penduduk ORDER BY no_kk ASC"))));
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {datapenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="ModulKoneksi.rs.Position  = i";
Debug.ShouldStop(524288);
datapenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 53;BA.debugLine="Lv.AddTwoLines(ModulKoneksi.rs.GetString2(\"no_kk";
Debug.ShouldStop(1048576);
datapenduduk.mostCurrent._lv.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(datapenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("no_kk"))))),(Object)(BA.ObjectToCharSequence(datapenduduk.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("nama"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 56;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(8388608);
datapenduduk.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}