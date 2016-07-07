package com.example.hoge.testreflete.utils;

import android.content.Context;

/**
 * Created by Silence on 16/7/7.
 * 利用反射方式获取资源文件的id.(ids,style,color,string,drawable,mipmap,dimen等)
 */
public class LResourcesHelper {

    public static final String RESOURCES_TYPE_LAYOUT = "layout";
    public static final String RESOURCES_TYPE_STRING = "string";
    public static final String RESOURCES_TYPE_DRAWABLE = "drawable";
    public static final String RESOURCES_TYPE_STYLE = "style";
    public static final String RESOURCES_TYPE_ID = "id";
    public static final String RESOURCES_TYPE_COLOR = "color";
    public static final String RESOURCES_TYPE_ARRAY = "array";
    public static final String RESOURCES_TYPE_DIMEN = "dimen";
    public static final String RESOURCES_TYPE_MIPMAP = "mipmap";

    public static int getLayoutID(Context context, String layoutResourceName) {
        return context.getResources().getIdentifier(layoutResourceName, RESOURCES_TYPE_LAYOUT, context.getPackageName());
    }

    public static int getStringID(Context context, String stringResourceName) {
        return context.getResources().getIdentifier(stringResourceName, RESOURCES_TYPE_STRING, context.getPackageName());
    }

    public static int getDrawableID(Context context, String drawableResourceName) {
        return context.getResources().getIdentifier(drawableResourceName, RESOURCES_TYPE_DRAWABLE, context.getPackageName());
    }
    public static int getMipmapID(Context context, String mipmapResourceName) {
        return context.getResources().getIdentifier(mipmapResourceName, RESOURCES_TYPE_MIPMAP, context.getPackageName());
    }

    public static int getStyleID(Context context, String styleResourceName) {
        return context.getResources().getIdentifier(styleResourceName, RESOURCES_TYPE_STYLE, context.getPackageName());
    }

    public static int getID(Context context, String idsResourceName) {
        return context.getResources().getIdentifier(idsResourceName, RESOURCES_TYPE_ID, context.getPackageName());
    }

    public static int getColorID(Context context, String colorResourceName) {
        return context.getResources().getIdentifier(colorResourceName, RESOURCES_TYPE_COLOR, context.getPackageName());
    }

    public static int getArrayID(Context context, String arrayResourceName) {
        return context.getResources().getIdentifier(arrayResourceName, RESOURCES_TYPE_ARRAY, context.getPackageName());
    }

    public static int getDimenID(Context context, String dimenResourceName) {
        return context.getResources().getIdentifier(dimenResourceName, RESOURCES_TYPE_DIMEN, context.getPackageName());
    }

}
