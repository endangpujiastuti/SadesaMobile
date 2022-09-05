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

'	Private Button3 As Button
'	Private Button2 As Button
'	Private Button4 As Button
	
	Private btnadd As Button
	Private btnanother As Button
	Private btnarsip As Button
	Private btnback As Button
	Private btnhome As Button
	Private btnout As Button
	Private btnpengajuan As Button
	Private btnsave As Button
	Private pnladd As Panel
	Private pnlarsip As Panel
	Private lv As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ArsipDokumen")
	
	pnlarsip.Visible = True
	pnladd.Visible = False
	
	ShowList
	
	lv.SingleLineLayout.Label.TextColor = Colors.Black
	lv.SingleLineLayout.Label.TextSize = 15



End Sub

Sub ShowList
	ModulKoneksi.koneksi
	lv.Clear
	ModulKoneksi.rs = ModulKoneksi.mh.Query("SELECT * FROM tb_arsip ORDER BY id_arsip_dokumen ASC")
	For i = 0 To ModulKoneksi.rs.RowCount - 1
		lv.AddSingleLine(ModulKoneksi.rs.GetString2("file_dokumen"))
	Next
	ModulKoneksi.mh.Close
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub btnadd_Click
	pnlarsip.Visible = False
	pnladd.Visible = True
End Sub

Private Sub btnback_Click
	pnlarsip.Visible = True
	pnladd.Visible = False
End Sub

Private Sub btnsave_Click
	
End Sub

Private Sub btnpengajuan_Click
	
End Sub

Private Sub btnout_Click
	
End Sub

Private Sub btnhome_Click
	
End Sub

Private Sub btnarsip_Click
	
End Sub

Private Sub btnanother_Click
	
End Sub