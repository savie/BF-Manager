package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44006 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C8309 f44007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C10157 f44008;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f44007 = new C21714();
        } else if (i >= 28) {
            f44007 = new C15365();
        } else if (i >= 26) {
            f44007 = new C23126();
        } else if (i >= 24 && C6897.m18511()) {
            f44007 = new C6897();
        } else {
            f44007 = new C4074();
        }
        f44008 = new C10157(16);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Typeface m32725(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f44008.m25800(m32724(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32724(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m32722(Context context, InterfaceC3929 interfaceC3929, Resources resources, int i, String str, int i2, int i3, AbstractC20864 abstractC20864, boolean z) {
        Typeface typefaceMo11608;
        Typeface typefaceCreate;
        if (interfaceC3929 instanceof C15220) {
            C15220 c15220 = (C15220) interfaceC3929;
            String strM36432 = c15220.m36432();
            if (strM36432 == null || strM36432.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(strM36432, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC20864 != null) {
                    abstractC20864.callbackSuccessAsync(typefaceCreate, null);
                }
                return typefaceCreate;
            }
            typefaceMo11608 = C1066.m4026(context, c15220.m36433(), i3, !z ? abstractC20864 != null : c15220.m36431() != 0, z ? c15220.m36430() : -1, AbstractC20864.m46898((Handler) null), new C1252(abstractC20864));
        } else {
            typefaceMo11608 = f44007.mo11608(context, (C6752) interfaceC3929, resources, i3);
            if (abstractC20864 != null) {
                if (typefaceMo11608 != null) {
                    abstractC20864.callbackSuccessAsync(typefaceMo11608, null);
                } else {
                    abstractC20864.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceMo11608 != null) {
            f44008.m25801(m32724(resources, i, str, i2, i3), typefaceMo11608);
        }
        return typefaceMo11608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m32721(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo21735 = f44007.mo21735(context, resources, i, str, i3);
        if (typefaceMo21735 != null) {
            f44008.m25801(m32724(resources, i, str, i2, i3), typefaceMo21735);
        }
        return typefaceMo21735;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m32723(Context context, C5300[] c5300Arr, int i) {
        return f44007.mo11609(context, c5300Arr, i);
    }
}
