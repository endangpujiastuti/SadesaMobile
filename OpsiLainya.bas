B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False 
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private AkunWarga As Button
	Private ArsipDokumen As Button
	Private Beranda As Button
	Private JenisDokumen As Button
	Private Keluar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("OpsiLainya")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Pengajuan_Click
	Activity.Finish
	StartActivity(Main)
End Sub

Private Sub Keluar_Click
	Activity.Finish
	StartActivity(actLogin)
End Sub

Private Sub JenisDokumen_Click
	Activity.Finish
	StartActivity(TambahDataJenisDokumen)
End Sub

Private Sub DataPenduduk_Click
	Activity.Finish
	StartActivity(DataPenduduk)
End Sub

Private Sub Beranda_Click
	Activity.Finish
	StartActivity(actBeranda)
End Sub

Private Sub ArsipDokumen_Click
	
End Sub

Private Sub AkunWarga_Click
    Activity.Finish
	StartActivity(AkunPenduduk)
End Sub