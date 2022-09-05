package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulkoneksi_subs_0 {


public static RemoteObject  _koneksi(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("koneksi (modulkoneksi) ","modulkoneksi",3,_ba,modulkoneksi.mostCurrent,12);
if (RapidSub.canDelegate("koneksi")) { return b4a.example.modulkoneksi.remoteMe.runUserSub(false, "modulkoneksi","koneksi", _ba);}
;
 BA.debugLineNum = 12;BA.debugLine="Sub koneksi";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="mh.Initialize(\"meniti.id\", \"u7753801_sadesa\", \"u7";
Debug.ShouldStop(8192);
modulkoneksi._mh.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("meniti.id")),(Object)(BA.ObjectToString("u7753801_sadesa")),(Object)(BA.ObjectToString("u7753801_nurjaman")),(Object)(RemoteObject.createImmutable("Nurjaman24")));
 BA.debugLineNum = 17;BA.debugLine="If mh.isConnected = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",modulkoneksi._mh.getField(true,"isConnected"),modulkoneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 18;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
Debug.ShouldStop(131072);
modulkoneksi.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Koneksi Terputus")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 19;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
modulkoneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim mh As MysqlHandler";
modulkoneksi._mh = RemoteObject.createNew ("mysql.mysqlhandler");
 //BA.debugLineNum = 9;BA.debugLine="Dim rs As ResultSet";
modulkoneksi._rs = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}