package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8055 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m21945(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C10291.m26525(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Icon m21944(C9545 c9545, Context context) {
        Icon iconCreateWithBitmap;
        switch (c9545.f30901) {
            case -1:
                return (Icon) c9545.f30906;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) c9545.f30906);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(c9545.m24966(), c9545.f30905);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) c9545.f30906, c9545.f30905, c9545.f30900);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) c9545.f30906);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    iconCreateWithBitmap = C19242.m44577((Bitmap) c9545.f30906);
                } else {
                    iconCreateWithBitmap = Icon.createWithBitmap(C9545.m24959((Bitmap) c9545.f30906, false));
                }
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = C1343.m4940(c9545.m24967());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + c9545.m24967());
                    }
                    InputStream inputStreamM24964 = c9545.m24964(context);
                    if (inputStreamM24964 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + c9545.m24967());
                    }
                    if (i >= 26) {
                        iconCreateWithBitmap = C19242.m44577(BitmapFactory.decodeStream(inputStreamM24964));
                    } else {
                        iconCreateWithBitmap = Icon.createWithBitmap(C9545.m24959(BitmapFactory.decodeStream(inputStreamM24964), false));
                    }
                }
                break;
        }
        ColorStateList colorStateList = c9545.f30902;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = c9545.f30899;
        if (mode != C9545.f30895) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
