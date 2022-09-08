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
	Private btnRegis As Button
	Private txtNama As EditText
	Private txtUsername As EditText
	Private txtPassword As EditText
	Private txtRePassword As EditText
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Register")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnLogin_Click
	'Activity.Finish
	StartActivity(actLogin)
End Sub

Private Sub btnRegis_Click
	If txtUsername.Text = "" Then
		MsgboxAsync("Masukan Username","Info")
		Return
	End If
	If txtRePassword.Text = "" Then
		MsgboxAsync("Masukkan Password","Info")
		Return
	End If
	If txtRePassword.Text = "" Then
		MsgboxAsync("Masukkan Ulang Password","Info")
		Return
	End If
	'START KONEKSI
	ModulKoneksi.koneksi
	
	'cek username
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_admindesa WHERE username='" & txtUsername.Text & "'")
	If ModulKoneksi.rs.RowCount > 0 Then
	MsgboxAsync("Username Sudah Digunakan","info")
		
		ModulKoneksi.mh.close
		End If
	ModulKoneksi.mh.Exec("INSERT INTO tb_admindesa VALUES('" & txtNama.Text & "','" & txtUsername.Text & "','" & txtPassword.Text & "','" & txtRePassword.Text & "')")
	
	
	
End Sub


