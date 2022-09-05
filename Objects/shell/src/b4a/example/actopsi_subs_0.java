package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actopsi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actopsi) ","actopsi",1,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"OpsiLogin\")";
Debug.ShouldStop(2097152);
actopsi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OpsiLogin")),actopsi.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (actopsi) ","actopsi",1,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actopsi) ","actopsi",1,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _admindesa_click() throws Exception{
try {
		Debug.PushSubsStack("AdminDesa_Click (actopsi) ","actopsi",1,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,34);
if (RapidSub.canDelegate("admindesa_click")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","admindesa_click");}
 BA.debugLineNum = 34;BA.debugLine="Private Sub AdminDesa_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="StartActivity(actLogin)";
Debug.ShouldStop(8);
actopsi.mostCurrent.__c.runVoidMethod ("StartActivity",actopsi.processBA,(Object)((actopsi.mostCurrent._actlogin.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private AdminDesa As Button";
actopsi.mostCurrent._admindesa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Warga As Button";
actopsi.mostCurrent._warga = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _warga_click() throws Exception{
try {
		Debug.PushSubsStack("Warga_Click (actopsi) ","actopsi",1,actopsi.mostCurrent.activityBA,actopsi.mostCurrent,39);
if (RapidSub.canDelegate("warga_click")) { return b4a.example.actopsi.remoteMe.runUserSub(false, "actopsi","warga_click");}
 BA.debugLineNum = 39;BA.debugLine="Private Sub Warga_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}