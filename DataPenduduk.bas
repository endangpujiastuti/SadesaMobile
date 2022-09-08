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

	Private btnTambah As Button
	Private Lv As ListView
	Private Label1 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DataPenduduk")
	
	showList

	Lv.TwoLinesLayout.Label.TextColor = Colors.Black
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	

End Sub


Private Sub btnTambah_Click
	StartActivity(Pengajuan)
End Sub

Sub showList
	ModulKoneksi.koneksi
	
	Lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_penduduk ORDER BY no_kk ASC")
	
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		ModulKoneksi.rs.Position  = i
		Lv.AddTwoLines(ModulKoneksi.rs.GetString2("no_kk"),ModulKoneksi.rs.GetString2("nama"))
	Next
	
	ModulKoneksi.mh.Close
End Sub


