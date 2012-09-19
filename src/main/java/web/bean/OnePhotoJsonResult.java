package web.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.model.LongFormatPhoto;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OnePhotoJsonResult {
	LongFormatPhoto photo;

	public OnePhotoJsonResult(){}
	
	public LongFormatPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(LongFormatPhoto photo) {
		this.photo = photo;
	}
}
