package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pengajuan_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pengajuan) ","pengajuan",8,pengajuan.mostCurrent.activityBA,pengajuan.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.pengajuan.remoteMe.runUserSub(false, "pengajuan","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"Pengajuan\")";
Debug.ShouldStop(1048576);
pengajuan.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Pengajuan")),pengajuan.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="showList";
Debug.ShouldStop(4194304);
_showlist();
 BA.debugLineNum = 25;BA.debugLine="lv.SingleLineLayout.Label.TextColor = Colors.Blac";
Debug.ShouldStop(16777216);
pengajuan.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",pengajuan.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 26;BA.debugLine="lv.SingleLineLayout.Label.TextSize = 15";
Debug.ShouldStop(33554432);
pengajuan.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
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
		Debug.PushSubsStack("Activity_Pause (pengajuan) ","pengajuan",8,pengajuan.mostCurrent.activityBA,pengajuan.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.pengajuan.remoteMe.runUserSub(false, "pengajuan","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (pengajuan) ","pengajuan",8,pengajuan.mostCurrent.activityBA,pengajuan.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.pengajuan.remoteMe.runUserSub(false, "pengajuan","activity_resume");}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private lv As ListView";
pengajuan.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("showList (pengajuan) ","pengajuan",8,pengajuan.mostCurrent.activityBA,pengajuan.mostCurrent,38);
if (RapidSub.canDelegate("showlist")) { return b4a.example.pengajuan.remoteMe.runUserSub(false, "pengajuan","showlist");}
int _i = 0;
 BA.debugLineNum = 38;BA.debugLine="Sub showList";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(64);
pengajuan.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,pengajuan.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="lv.Clear";
Debug.ShouldStop(256);
pengajuan.mostCurrent._lv.runVoidMethod ("Clear");
 BA.debugLineNum = 42;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
Debug.ShouldStop(512);
pengajuan.mostCurrent._modulkoneksi._rs /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), pengajuan.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.createImmutable("SELECT * FROM tb_pengajuan ORDER BY id_jenis ASC"))));
 BA.debugLineNum = 44;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {pengajuan.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"RowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 45;BA.debugLine="ModulKoneksi.rs.Position  = i";
Debug.ShouldStop(4096);
pengajuan.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 46;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"tgl";
Debug.ShouldStop(8192);
pengajuan.mostCurrent._lv.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(pengajuan.mostCurrent._modulkoneksi._rs /*RemoteObject*/ .runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("tgl_pengajuan"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="ModulKoneksi.mh.Close";
Debug.ShouldStop(65536);
pengajuan.mostCurrent._modulkoneksi._mh /*RemoteObject*/ .runVoidMethod ("Close");
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
}