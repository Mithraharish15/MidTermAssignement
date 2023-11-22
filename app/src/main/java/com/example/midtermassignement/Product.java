package com.example.midtermassignement;

import android.media.MediaMetadataRetriever;

public class Product {
    private String Product;
    private MediaMetadataRetriever.BitmapParams imageparm;

    public String getProduct() {
        return Product;
    }

    public MediaMetadataRetriever.BitmapParams getImageparm() {
        return imageparm;
    }

    public Product(String product, MediaMetadataRetriever.BitmapParams imageparm) {
        Product = product;
        this.imageparm = imageparm;
    }
}
