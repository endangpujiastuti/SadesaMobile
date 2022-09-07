package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class akunpenduduk extends Activity implements B4AActivity{
	public static akunpenduduk mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.akunpenduduk");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (akunpenduduk).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.akunpenduduk");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.akunpenduduk", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (akunpenduduk) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (akunpenduduk) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return akunpenduduk.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (akunpenduduk) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (akunpenduduk) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            akunpenduduk mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (akunpenduduk) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _search = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadd = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlakun = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnladd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnmpengguna = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpwd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnnik = null;
public b4a.example.main _main = null;
public b4a.example.actlogin _actlogin = null;
public b4a.example.actberanda _actberanda = null;
public b4a.example.actregister _actregister = null;
public b4a.example.actlupakatasandi _actlupakatasandi = null;
public b4a.example.starter _starter = null;
public b4a.example.modulkoneksi _modulkoneksi = null;
public b4a.example.datapenduduk _datapenduduk = null;
public b4a.example.tambahdatajenisdokumen _tambahdatajenisdokumen = null;
public b4a.example.pengajuan _pengajuan = null;
public b4a.example.opsilainya _opsilainya = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Activity.LoadLayout(\"AkunWarga\")";
mostCurrent._activity.LoadLayout("AkunWarga",mostCurrent.activityBA);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="showList";
_showlist();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="isiSpinner";
_isispinner();
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="lv.TwoLinesLayout.Label.TextColor = Colors.Black";
mostCurrent._lv.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="lv.TwoLinesLayout.Label.TextSize = 15";
mostCurrent._lv.getTwoLinesLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="End Sub";
return "";
}
public static String  _showlist() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showlist", null));}
int _i = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub showList";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="lv.Clear";
mostCurrent._lv.Clear();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")));
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="ModulKoneksi.rs.Position  = i";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .setPosition(_i);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="lv.AddTwoLines(ModulKoneksi.rs.GetString2(\"id_ak";
mostCurrent._lv.AddTwoLines(BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("id_akun_warga")),BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("username")));
 }
};
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="ModulKoneksi.mh.Close";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Close();
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="End Sub";
return "";
}
public static String  _isispinner() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "isispinner", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "isispinner", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub isiSpinner";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="spnnik.Clear";
mostCurrent._spnnik.Clear();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnadd_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub btnadd_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="pnlakun.Visible = False";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="pnladd.Visible = True";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return "";
}
public static String  _btnkembali_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnkembali_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnkembali_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub btnkembali_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="StartActivity(actBeranda)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._actberanda.getObject()));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub btnSave_Click";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If spnnik.SelectedItem = \"\" Then";
if ((mostCurrent._spnnik.getSelectedItem()).equals("")) { 
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="MsgboxAsync(\"Masukkan NIK | Nama Lengkap\",\"Info\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan NIK | Nama Lengkap"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="If txtnmpengguna.Text = \"\" Then";
if ((mostCurrent._txtnmpengguna.getText()).equals("")) { 
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="MsgboxAsync(\"Masukkan Nama Pengguna\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan Nama Pengguna"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="If txtpwd.Text = \"\" Then";
if ((mostCurrent._txtpwd.getText()).equals("")) { 
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="MsgboxAsync(\"Masukkan Password\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Masukkan Password"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="If btnSave.Text = \"Simpan\" Then";
if ((mostCurrent._btnsave.getText()).equals("Simpan")) { 
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga WHERE username='"+BA.NumberToString(mostCurrent._spnnik.getSelectedIndex())+"'")));
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="If ModulKoneksi.rs.RowCount > 0 Then";
if (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()>0) { 
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="MsgboxAsync(\"Akun telah digunakan\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Akun telah digunakan"),BA.ObjectToCharSequence("Info"),processBA);
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="ModulKoneksi.mh.Exec(\"INSERT INTO tb_akunwarga V";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Exec("INSERT INTO tb_akunwarga VALUES('"+BA.NumberToString(mostCurrent._spnnik.getSelectedIndex())+"', '"+mostCurrent._txtnmpengguna.getText()+"', '"+mostCurrent._txtpwd.getText()+"')");
 }else {
 };
RDebugUtils.currentLine=3276834;
 //BA.debugLineNum = 3276834;BA.debugLine="tampilanAwal";
_tampilanawal();
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="End Sub";
return "";
}
public static String  _tampilanawal() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tampilanawal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tampilanawal", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub tampilanAwal";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="spnnik.SelectedIndex = \"\"";
mostCurrent._spnnik.setSelectedIndex((int)(Double.parseDouble("")));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="txtnmpengguna.Text = \"\"";
mostCurrent._txtnmpengguna.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="txtpwd.Text = \"\"";
mostCurrent._txtpwd.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="showList";
_showlist();
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="pnlakun.Visible = True";
mostCurrent._pnlakun.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="pnladd.Visible = False";
mostCurrent._pnladd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return "";
}
public static String  _filterlist() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "filterlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "filterlist", null));}
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub FilterList";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="ModulKoneksi.koneksi";
mostCurrent._modulkoneksi._koneksi /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="lv.Clear";
mostCurrent._lv.Clear();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="ModulKoneksi.rs = ModulKoneksi.mh.Query(\"SELECT *";
mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/  = (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Query("SELECT * FROM tb_akunwarga WHERE username LIKE '%"+mostCurrent._search.getText()+"%' ORDER BY id_akun_warga ASC")));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="For i = 0 To ModulKoneksi.rs.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .RowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="lv.AddSingleLine(ModulKoneksi.rs.GetString2(\"use";
mostCurrent._lv.AddSingleLine(BA.ObjectToCharSequence(mostCurrent._modulkoneksi._rs /*mysql.mysqlhandler.ResultSetWrapper*/ .GetString2("username")));
 }
};
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="ModulKoneksi.mh.Close";
mostCurrent._modulkoneksi._mh /*mysql.mysqlhandler*/ .Close();
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="End Sub";
return "";
}
public static String  _search_enterpressed() throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "search_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "search_enterpressed", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub search_EnterPressed";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="FilterList";
_filterlist();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _spnnik_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="akunpenduduk";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spnnik_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spnnik_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub spnnik_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
}