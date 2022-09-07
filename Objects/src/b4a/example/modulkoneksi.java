package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class modulkoneksi {
private static modulkoneksi mostCurrent = new modulkoneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _mh = null;
public static mysql.mysqlhandler.ResultSetWrapper _rs = null;
public b4a.example.main _main = null;
public b4a.example.actlogin _actlogin = null;
public b4a.example.actberanda _actberanda = null;
public b4a.example.actregister _actregister = null;
public b4a.example.actlupakatasandi _actlupakatasandi = null;
public b4a.example.starter _starter = null;
public b4a.example.akunpenduduk _akunpenduduk = null;
public b4a.example.datapenduduk _datapenduduk = null;
public b4a.example.tambahdatajenisdokumen _tambahdatajenisdokumen = null;
public b4a.example.pengajuan _pengajuan = null;
public b4a.example.opsilainya _opsilainya = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="modulkoneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="mh.Initialize(\"meniti.id\",\"u7753801_sadesa\",\"u775";
_mh.Initialize("meniti.id","u7753801_sadesa","u7753801_nurjaman","Nurjaman24");
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="If mh.isConnected = False Then";
if (_mh.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="MsgboxAsync(\"Koneksi Erorr\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Erorr"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return "";
}
}