B4A=true
Group=Modul Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtnama As EditText
	Private txtpass As EditText
	
	Dim md As MessageDigest
	Dim ByteCon As ByteConverter
	Dim passwordhash() As Byte
	Dim epass As String
	Dim p As String
	
End Sub

Sub Activity_Create(FiResultStTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Login")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'==================================================
Sub btnRegis_Click
	'Activity.Finish
	StartActivity(actRegister)
End Sub

Sub BtnResetSandi_Click
	'Activity.Finish
	StartActivity(actLupaKataSandi)
End Sub
Private Sub BtnLogin_Click
	'cek input
	If txtnama.Text = "" Then
		MsgboxAsync("Masukkan Username","Info")
		Return
	End If
	If txtpass.Text = "" Then
		MsgboxAsync("Masukkan Password","Info")
		Return
	End If
	
	ModulKoneksi.koneksi
	
	p = txtpass.Text
	
	enkripsi
	
	'cek usename
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_admindesa WHERE username='" & txtnama.Text & "'")
	If ModulKoneksi.rs.RowCount > 0 Then
		'cek password
		ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_admindesa WHERE username='" & txtnama.Text & "' and password='" & epass & "'")
		If ModulKoneksi.rs.RowCount > 0 Then
			
			ModulKoneksi.mh.Close
			
			Activity.Finish
			StartActivity(AkunPenduduk)
		Else
			MsgboxAsync("Password tidak ditemukan","Info")
			txtpass.Text = ""
			Return
		End If
	Else
		MsgboxAsync("Username tidak ditemukan","Info")
		txtnama.Text = ""
		Return
	End If
End Sub

Sub enkripsi
	passwordhash = md.GetMessageDigest(p.GetBytes("UTF8"),"MD5")
	epass = ByteCon.HexFromBytes(passwordhash)
End Sub