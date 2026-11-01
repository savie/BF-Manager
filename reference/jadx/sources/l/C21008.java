package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21008 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m47181(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20303.m45824(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            C13638.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            C13638.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            C13638.toString(obj);
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m47182(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20303.m45825(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47178(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20303.m45823(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Uri m47177(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20303.m45822(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Icon m47180(C16775 c16775, Context context) {
        Icon iconCreateWithBitmap;
        switch (c16775.f53695) {
            case -1:
                return (Icon) c16775.f53691;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) c16775.f53691);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(c16775.m39343(), c16775.f53698);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) c16775.f53691, c16775.f53698, c16775.f53696);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) c16775.f53691);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    iconCreateWithBitmap = C16070.m38072((Bitmap) c16775.f53691);
                } else {
                    iconCreateWithBitmap = Icon.createWithBitmap(C16775.m39333((Bitmap) c16775.f53691, false));
                }
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = C0546.m2558(c16775.m39342());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + c16775.m39342());
                    }
                    InputStream inputStreamM39340 = c16775.m39340(context);
                    if (inputStreamM39340 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + c16775.m39342());
                    }
                    if (i >= 26) {
                        iconCreateWithBitmap = C16070.m38072(BitmapFactory.decodeStream(inputStreamM39340));
                    } else {
                        iconCreateWithBitmap = Icon.createWithBitmap(C16775.m39333(BitmapFactory.decodeStream(inputStreamM39340), false));
                    }
                }
                break;
        }
        ColorStateList colorStateList = c16775.f53690;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = c16775.f53697;
        if (mode != C16775.f53688) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m47179(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }
}
