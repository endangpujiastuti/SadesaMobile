
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class opsilainyaa implements IRemote{
	public static opsilainyaa mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public opsilainyaa() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("opsilainyaa"), "b4a.example.opsilainyaa");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, opsilainyaa.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _btnakunwarga = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnarsipdokumen = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnberanda = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndatapenduduk = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnjenisdokumen = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnkeluar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnpengajuan = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.actlogin _actlogin = null;
public static b4a.example.actberanda _actberanda = null;
public static b4a.example.actregister _actregister = null;
public static b4a.example.starter _starter = null;
public static b4a.example.akunpenduduk _akunpenduduk = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.datapenduduk _datapenduduk = null;
public static b4a.example.pengajuan _pengajuan = null;
public static b4a.example.actlupakatasandi _actlupakatasandi = null;
public static b4a.example.tambahdatajenisdokumen _tambahdatajenisdokumen = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBeranda",Debug.moduleToString(b4a.example.actberanda.class),"Activity",opsilainyaa.mostCurrent._activity,"actLogin",Debug.moduleToString(b4a.example.actlogin.class),"actLupaKataSandi",Debug.moduleToString(b4a.example.actlupakatasandi.class),"actRegister",Debug.moduleToString(b4a.example.actregister.class),"AkunPenduduk",Debug.moduleToString(b4a.example.akunpenduduk.class),"btnAkunWarga",opsilainyaa.mostCurrent._btnakunwarga,"btnArsipDokumen",opsilainyaa.mostCurrent._btnarsipdokumen,"btnBeranda",opsilainyaa.mostCurrent._btnberanda,"btnDataPenduduk",opsilainyaa.mostCurrent._btndatapenduduk,"btnJenisDokumen",opsilainyaa.mostCurrent._btnjenisdokumen,"btnKeluar",opsilainyaa.mostCurrent._btnkeluar,"btnPengajuan",opsilainyaa.mostCurrent._btnpengajuan,"DataPenduduk",Debug.moduleToString(b4a.example.datapenduduk.class),"Main",Debug.moduleToString(b4a.example.main.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"Pengajuan",Debug.moduleToString(b4a.example.pengajuan.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"TambahDataJenisDokumen",Debug.moduleToString(b4a.example.tambahdatajenisdokumen.class)};
}
}