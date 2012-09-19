package web.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.model.ShortFormatPhoto;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PhotosJsonResultWrapper {
	List<ShortFormatPhoto> photos;

	public PhotosJsonResultWrapper(){}
	
	public List<ShortFormatPhoto> getPhotos() {
		return photos;
	}

	public void setPhotos(List<ShortFormatPhoto> photos) {
		this.photos = photos;
	}
}
