package model

import com.google.gson.annotations.SerializedName
import constant.Constants

data class MainClassJson (
    @SerializedName(Constants.TagXml.FIELD_NAME)
    var name: String = "No Name",
    @SerializedName(Constants.TagXml.FIELD_DESCRIPTION)
    var description: String = "Empty Template Description",
    @SerializedName(Constants.TagXml.FIELD_PATH)
    var path: String = "",
    @SerializedName(Constants.TagXml.FIELD_PARAMETERS)
    var param: List<String> = listOf("name"),
    @SerializedName(Constants.TagXml.FIELD_ADD_FILE)
    var fileTemplate: List<FileTemplate> = listOf(FileTemplate())

)