B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Dim mh As MysqlHandler
	Dim rs As ResultSet
End Sub

Sub koneksi
	mh.Initialize("meniti.id","u7753801_sadesa","u7753801_nurjaman","Nurjaman24")
	
	If mh.isConnected = False Then
		MsgboxAsync("Koneksi Erorr","Info")
		ExitApplication
	End If
End Sub