B4A=true
Group=Default Group
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

	Private btnAkunWarga As Button
	Private btnArsipDokumen As Button
	Private btnBeranda As Button
	Private btnDataPenduduk As Button
	Private btnJenisDokumen As Button
	Private btnKeluar As Button
	Private btnPengajuan As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Opsi")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnPengajuan_Click
	StartActivity(Pengajuan)
End Sub

Private Sub btnKeluar_Click
	StartActivity(Main)
End Sub

Private Sub btnJenisDokumen_Click
	StartActivity(TambahDataJenisDokumen)
End Sub

Private Sub btnDataPenduduk_Click
	StartActivity(DataPenduduk)
End Sub

Private Sub btnBeranda_Click
	StartActivity(actBeranda)
End Sub

Private Sub btnArsipDokumen_Click
	
End Sub

Private Sub btnAkunWarga_Click
	StartActivity(AkunPenduduk)
End Sub