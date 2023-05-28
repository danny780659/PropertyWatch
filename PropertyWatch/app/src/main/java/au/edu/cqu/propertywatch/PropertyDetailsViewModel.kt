package au.edu.cqu.propertywatch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PropertyDetailsViewModel : ViewModel() {
    val selectedProperty = MutableLiveData<Property>()
}