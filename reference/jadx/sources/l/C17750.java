package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17750 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58298 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C4326 f58299;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0884 f58300;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f58299 = new C12529();
        } else if (i >= 28) {
            f58299 = new C20734();
        } else if (i >= 26) {
            f58299 = new C3580();
        } else if (i >= 24 && C23718.m52969()) {
            f58299 = new C23718();
        } else {
            f58299 = new C16258();
        }
        f58300 = new C0884(16);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Typeface m41564(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f58300.m3588(m41563(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41563(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m41561(Context context, InterfaceC23390 interfaceC23390, Resources resources, int i, String str, int i2, int i3, AbstractC7727 abstractC7727, boolean z) {
        Typeface typefaceMo11637;
        Typeface typefaceCreate;
        if (interfaceC23390 instanceof C12201) {
            C12201 c12201 = (C12201) interfaceC23390;
            String strM30477 = c12201.m30477();
            if (strM30477 == null || strM30477.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(strM30477, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC7727 != null) {
                    abstractC7727.callbackSuccessAsync(typefaceCreate, null);
                }
                return typefaceCreate;
            }
            typefaceMo11637 = C16479.m39106(context, c12201.m30478(), i3, !z ? abstractC7727 != null : c12201.m30476() != 0, z ? c12201.m30479() : -1, AbstractC7727.m21010((Handler) null), new C17004(abstractC7727));
        } else {
            typefaceMo11637 = f58299.mo11637(context, (C3252) interfaceC23390, resources, i3);
            if (abstractC7727 != null) {
                if (typefaceMo11637 != null) {
                    abstractC7727.callbackSuccessAsync(typefaceMo11637, null);
                } else {
                    abstractC7727.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceMo11637 != null) {
            f58300.m3589(m41563(resources, i, str, i2, i3), typefaceMo11637);
        }
        return typefaceMo11637;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m41560(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo11636 = f58299.mo11636(context, resources, i, str, i3);
        if (typefaceMo11636 != null) {
            f58300.m3589(m41563(resources, i, str, i2, i3), typefaceMo11636);
        }
        return typefaceMo11636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m41562(Context context, C11258[] c11258Arr, int i) {
        return f58299.mo11638(context, c11258Arr, i);
    }
}
