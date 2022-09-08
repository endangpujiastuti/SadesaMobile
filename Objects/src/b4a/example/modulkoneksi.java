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
public b4a.example.starter _starter = null;
public b4a.example.akunpenduduk _akunpenduduk = null;
public b4a.example.datapenduduk _datapenduduk = null;
public b4a.example.pengajuan _pengajuan = null;
public b4a.example.actlupakatasandi _actlupakatasandi = null;
public b4a.example.tambahdatajenisdokumen _tambahdatajenisdokumen = null;
public b4a.example.opsilainyaa _opsilainyaa = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="modulkoneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="mh.Initialize(\"meniti.id\",\"u7753801_sadesa\",\"u775";
_mh.Initialize("meniti.id","u7753801_sadesa","u7753801_nurjaman","Nurjaman24");
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="If mh.isConnected = False Then";
if (_mh.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="MsgboxAsync(\"Koneksi Erorr\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Erorr"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="End Sub";
return "";
}
}