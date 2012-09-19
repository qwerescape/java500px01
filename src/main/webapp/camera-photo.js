Ext.onReady(function(){
	//get the container element
	var container = Ext.get('photo-container');
	container.setOpacity(0, false);
	var loading = Ext.get('loading-mask');
	//fire an ajax event to get the list of photos;
	Ext.Ajax.request({
		   url: photoJsonUrl,
		   success: function(response){
			   var photos = Ext.util.JSON.decode(response.responseText);
			   var length = photos.length;
			   for (var i= 0; i < length; i++){
				   var camera = photos[i].camera;
				   var url = photos[i].image_url;
				   var longUrl = 'http://www.500px.com/photo/'+photos[i].id;
				   var html = String.format('<div class="photo-container">'+
						   '<div><a href="{2}"><img src="{0}"/></a></div>'+
						   '<div class="gear">{1}</div>'+
						   '</div>', url, camera, longUrl);
				   
				   Ext.DomHelper.append(container, html, false);
			   }
			   container.setOpacity(1, true);
			   loading.setOpacity(0, true);
		   },
		   failure: function(){},
		});
});