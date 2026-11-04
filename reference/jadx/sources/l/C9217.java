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

/* JADX INFO: renamed from: l.ۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9217 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30035 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f30036 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f30034 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m24392(Resources resources, int i, Resources.Theme theme) {
        return C14438.m34861(resources, i, theme);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24386(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C21152.m48256(resources, i, theme);
        }
        return resources.getColor(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ColorStateList m24393(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListM39394;
        ColorStateList colorStateList;
        C18168 c18168;
        C0269 c0269 = new C0269(resources, theme);
        synchronized (f30034) {
            SparseArray sparseArray = (SparseArray) f30036.get(c0269);
            colorStateListM39394 = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (c18168 = (C18168) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (c18168.f59393.equals(resources.getConfiguration()) && ((theme == null && c18168.f59395 == 0) || (theme != null && c18168.f59395 == theme.hashCode()))) {
                colorStateList = c18168.f59394;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f30035;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM39394 = C16676.m39394(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM39394 != null) {
            m24391(c0269, i, colorStateListM39394, theme);
            return colorStateListM39394;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C21152.m48257(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24391(C0269 c0269, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f30034) {
            WeakHashMap weakHashMap = f30036;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c0269);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c0269, sparseArray);
            }
            sparseArray.append(i, new C18168(colorStateList, c0269.f1559.getConfiguration(), theme));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Typeface m24394(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m24389(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m24387(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m24389(context, i, new TypedValue(), 0, null, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24390(Context context, int i, AbstractC7727 abstractC7727) {
        if (context.isRestricted()) {
            abstractC7727.callbackFailAsync(-4, null);
        } else {
            m24389(context, i, new TypedValue(), 0, abstractC7727, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m24388(Context context, int i, TypedValue typedValue, int i2, AbstractC7727 abstractC7727) {
        if (context.isRestricted()) {
            return null;
        }
        return m24389(context, i, typedValue, i2, abstractC7727, true, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m24389(Context context, int i, TypedValue typedValue, int i2, AbstractC7727 abstractC7727, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM41561 = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM41564 = C17750.m41564(resources, i, string, typedValue.assetCookie, i2);
            if (typefaceM41564 != null) {
                if (abstractC7727 != null) {
                    abstractC7727.callbackSuccessAsync(typefaceM41564, null);
                }
                typefaceM41561 = typefaceM41564;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC23390 interfaceC23390M17859 = C6236.m17859(resources.getXml(i), resources);
                        if (interfaceC23390M17859 != null) {
                            typefaceM41561 = C17750.m41561(context, interfaceC23390M17859, resources, i, string, typedValue.assetCookie, i2, abstractC7727, z);
                        } else if (abstractC7727 != null) {
                            abstractC7727.callbackFailAsync(-3, null);
                        }
                    } else {
                        Typeface typefaceM41560 = C17750.m41560(context, resources, i, string, typedValue.assetCookie, i2);
                        if (abstractC7727 != null) {
                            if (typefaceM41560 != null) {
                                abstractC7727.callbackSuccessAsync(typefaceM41560, null);
                            } else {
                                abstractC7727.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceM41561 = typefaceM41560;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC7727 != null) {
                        abstractC7727.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (abstractC7727 != null) {
            abstractC7727.callbackFailAsync(-3, null);
        }
        if (typefaceM41561 != null || abstractC7727 != null || z2) {
            return typefaceM41561;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
