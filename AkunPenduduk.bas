B4A=true
Group=Modul Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
   
	Private lv As ListView
	Private search As EditText
	Private btnadd As Button
	Private pnlakun As Panel
	Private pnladd As Panel
	Private txtnmpengguna As EditText
	Private txtpwd As EditText
	Private btnSave As Button
	Private spnnik As Spinner
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("AkunWarga")
	
	showList
	
	isiSpinner
	
	lv.TwoLinesLayout.Label.TextColor = Colors.Black
	lv.TwoLinesLayout.Label.TextSize = 15
	
	pnlakun.Visible = True
	pnladd.Visible = False
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'------------------ Search
Private Sub search_EnterPressed
	FilterList
End Sub

'------------------ Read
Sub showList
	ModulKoneksi.koneksi
	
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")
	
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		ModulKoneksi.rs.Position  = i
		lv.AddTwoLines(ModulKoneksi.rs.GetString2("id_akun_warga"),ModulKoneksi.rs.GetString2("username"))
	Next
	
	ModulKoneksi.mh.Close
End Sub

Sub FilterList
	ModulKoneksi.koneksi
	
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga WHERE username LIKE '%" & search.Text & "%' ORDER BY id_akun_warga ASC")
	
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		lv.AddSingleLine(ModulKoneksi.rs.GetString2("username"))
	Next
	
	ModulKoneksi.mh.Close
End Sub

'------------------ Create
Private Sub btnadd_Click
	pnlakun.Visible = False
	pnladd.Visible = True
End Sub

Private Sub btnBack_Click
	
	pnlakun.Visible = True
	pnladd.Visible = False
End Sub

Sub isiSpinner
	spnnik.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga ORDER BY id_akun_warga ASC")
End Sub

Private Sub btnSave_Click
	'cek input
	If spnnik.SelectedItem = "" Then
		MsgboxAsync("Masukkan NIK | Nama Lengkap","Info")
		Return
	End If
	
	If txtnmpengguna.Text = "" Then
		MsgboxAsync("Masukkan Nama Pengguna","Info")
		Return
	End If
	
	If txtpwd.Text = "" Then
		MsgboxAsync("Masukkan Password","Info")
		Return
	End If
	
	If btnSave.Text = "Simpan" Then
		
		ModulKoneksi.koneksi
		
		'validasi nik
		ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_akunwarga WHERE username='" & spnnik.SelectedIndex & "'")
		If ModulKoneksi.rs.RowCount > 0 Then  
			MsgboxAsync("Akun telah digunakan","Info")
			Return
		End If
		
		'proses simpan
		ModulKoneksi.mh.Exec("INSERT INTO tb_akunwarga VALUES('" & spnnik.SelectedIndex & "', '" & txtnmpengguna.Text & "', '" & txtpwd.Text & "')")
	Else
		
	End If
	
		tampilanAwal
End Sub

Sub tampilanAwal
	spnnik.SelectedIndex = ""
	txtnmpengguna.Text = ""
	txtpwd.Text = ""
	
	'refresh listview
	showList
	
	pnlakun.Visible = True
	pnladd.Visible = False
End Sub

Private Sub btnkembali_Click
	Activity.Finish
	StartActivity(actBeranda)
End Sub

Private Sub spnnik_ItemClick (Position As Int, Value As Object)
	
End Sub