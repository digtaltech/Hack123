package dt.prot.tourkras

import android.view.View

class DataModel(_id:Int,_name:String,_text:MutableList<String>,_time:MutableList<String>,_timeIcon:MutableList<Boolean>) {
    val id:Int = _id
    val name:String = _name
    val text:MutableList<String> = _text
    val time:MutableList<String> = _time
    val timeIcon:MutableList<Boolean> = _timeIcon

}

class DataModelCreate (_name: String,_pointStart:String,_pointEnd:String,_timeStart:String,_timeEnd:String){
    val name:String = _name
    val pointStart:String = _pointStart
    val pointEnd:String = _pointEnd
    val timeStart:String = _timeStart
    val timeEnd:String = _timeEnd
}

class DataModelCreatItem (view: View,mutableList: MutableList<View>){
    val _view:View = view
    val _mutableList:MutableList<View> = mutableList
}

class DataModelHome (_name: String,_text: String,_text2: String){
    val name:String = _name
    val text:String = _text
    val text2:String = _text2
}

class DataModel2(id:Int,dataModel: DataModel,name:String){
    val _id:Int = id
    val _dataModel:DataModel = dataModel
    val _name:String = name
}


