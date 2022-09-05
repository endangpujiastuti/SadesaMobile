package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actlupakatasandi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actlupakatasandi) ","actlupakatasandi",6,actlupakatasandi.mostCurrent.activityBA,actlupakatasandi.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actlupakatasandi.remoteMe.runUserSub(false, "actlupakatasandi","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"LupaKataSandi\")";
Debug.ShouldStop(1048576);
actlupakatasandi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LupaKataSandi")),actlupakatasandi.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (actlupakatasandi) ","actlupakatasandi",6,actlupakatasandi.mostCurrent.activityBA,actlupakatasandi.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actlupakatasandi.remoteMe.runUserSub(false, "actlupakatasandi","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actlupakatasandi) ","actlupakatasandi",6,actlupakatasandi.mostCurrent.activityBA,actlupakatasandi.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actlupakatasandi.remoteMe.runUserSub(false, "actlupakatasandi","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhubadmin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnHubAdmin_Click (actlupakatasandi) ","actlupakatasandi",6,actlupakatasandi.mostCurrent.activityBA,actlupakatasandi.mostCurrent,32);
if (RapidSub.canDelegate("btnhubadmin_click")) { return b4a.example.actlupakatasandi.remoteMe.runUserSub(false, "actlupakatasandi","btnhubadmin_click");}
 BA.debugLineNum = 32;BA.debugLine="Private Sub BtnHubAdmin_Click";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private BtnHubAdmin As Button";
actlupakatasandi.mostCurrent._btnhubadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}