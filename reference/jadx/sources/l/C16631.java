package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16631 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f53355 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f53356 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f53354 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m39101(Resources resources, int i, Resources.Theme theme) {
        return C8164.m21473(resources, i, theme);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39095(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C19453.m44502(resources, i, theme);
        }
        return resources.getColor(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m39102(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListM49440;
        ColorStateList colorStateList;
        C8870 c8870;
        C10281 c10281 = new C10281(resources, theme);
        synchronized (f53354) {
            SparseArray sparseArray = (SparseArray) f53356.get(c10281);
            colorStateListM49440 = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (c8870 = (C8870) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (c8870.f30421.equals(resources.getConfiguration()) && ((theme == null && c8870.f30423 == 0) || (theme != null && c8870.f30423 == theme.hashCode()))) {
                colorStateList = c8870.f30422;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f53355;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM49440 = C22275.m49440(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM49440 != null) {
            m39100(c10281, i, colorStateListM49440, theme);
            return colorStateListM49440;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C19453.m44503(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39100(C10281 c10281, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f53354) {
            WeakHashMap weakHashMap = f53356;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c10281);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c10281, sparseArray);
            }
            sparseArray.append(i, new C8870(colorStateList, c10281.f35024.getConfiguration(), theme));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Typeface m39103(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m39098(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m39096(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m39098(context, i, new TypedValue(), 0, null, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39099(Context context, int i, AbstractC20864 abstractC20864) {
        if (context.isRestricted()) {
            abstractC20864.callbackFailAsync(-4, null);
        } else {
            m39098(context, i, new TypedValue(), 0, abstractC20864, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m39097(Context context, int i, TypedValue typedValue, int i2, AbstractC20864 abstractC20864) {
        if (context.isRestricted()) {
            return null;
        }
        return m39098(context, i, typedValue, i2, abstractC20864, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m39098(Context context, int i, TypedValue typedValue, int i2, AbstractC20864 abstractC20864, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM32722 = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM32725 = C13248.m32725(resources, i, string, typedValue.assetCookie, i2);
            if (typefaceM32725 != null) {
                if (abstractC20864 != null) {
                    abstractC20864.callbackSuccessAsync(typefaceM32725, null);
                }
                typefaceM32722 = typefaceM32725;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC3929 interfaceC3929M48286 = C21569.m48286(resources.getXml(i), resources);
                        if (interfaceC3929M48286 != null) {
                            typefaceM32722 = C13248.m32722(context, interfaceC3929M48286, resources, i, string, typedValue.assetCookie, i2, abstractC20864, z);
                        } else if (abstractC20864 != null) {
                            abstractC20864.callbackFailAsync(-3, null);
                        }
                    } else {
                        Typeface typefaceM32721 = C13248.m32721(context, resources, i, string, typedValue.assetCookie, i2);
                        if (abstractC20864 != null) {
                            if (typefaceM32721 != null) {
                                abstractC20864.callbackSuccessAsync(typefaceM32721, null);
                            } else {
                                abstractC20864.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceM32722 = typefaceM32721;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC20864 != null) {
                        abstractC20864.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (abstractC20864 != null) {
            abstractC20864.callbackFailAsync(-3, null);
        }
        if (typefaceM32722 != null || abstractC20864 != null || z2) {
            return typefaceM32722;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
