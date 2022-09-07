package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tambahdatajenisdokumen_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tambahdatajenisdokumen) ","tambahdatajenisdokumen",9,tambahdatajenisdokumen.mostCurrent.activityBA,tambahdatajenisdokumen.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tambahdatajenisdokumen.remoteMe.runUserSub(false, "tambahdatajenisdokumen","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"TambahDataJenisDokumen\")";
Debug.ShouldStop(524288);
tambahdatajenisdokumen.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("TambahDataJenisDokumen")),tambahdatajenisdokumen.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (tambahdatajenisdokumen) ","tambahdatajenisdokumen",9,tambahdatajenisdokumen.mostCurrent.activityBA,tambahdatajenisdokumen.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tambahdatajenisdokumen.remoteMe.runUserSub(false, "tambahdatajenisdokumen","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (tambahdatajenisdokumen) ","tambahdatajenisdokumen",9,tambahdatajenisdokumen.mostCurrent.activityBA,tambahdatajenisdokumen.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tambahdatajenisdokumen.remoteMe.runUserSub(false, "tambahdatajenisdokumen","activity_resume");}
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}