package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ܿۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17169 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54735 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C10157 f54736 = new C0235(Math.min((int) (Runtime.getRuntime().maxMemory() / 6), 10485760));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40093(String str, Bitmap bitmap) {
        C9314 c9314M33229 = null;
        if (str == null || bitmap == null) {
            throw null;
        }
        f54736.m25801(str, bitmap);
        try {
            c9314M33229 = C12231.f40866.m33229(str);
            if (c9314M33229 == null) {
                return;
            }
            InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c9314M33229.m23887(0));
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, interfaceC10983M3436.mo16430());
            interfaceC10983M3436.close();
            c9314M33229.m23890();
        } catch (IOException unused) {
            if (c9314M33229 != null) {
                try {
                    c9314M33229.m23888();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40092(String str, InterfaceC16464 interfaceC16464, int i) throws TimeoutException {
        Bitmap bitmapM40091 = m40091(str);
        if (bitmapM40091 != null) {
            return bitmapM40091;
        }
        Future futureSubmit = C4716.f16635.submit(new CallableC19992(interfaceC16464));
        try {
            bitmapM40091 = (Bitmap) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            futureSubmit.cancel(true);
            throw e;
        } catch (Exception unused) {
        }
        if (bitmapM40091 != null) {
            m40093(str, bitmapM40091);
        }
        return bitmapM40091;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40095(String str) {
        return (Bitmap) f54736.m25800(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m40094(String str) {
        str.getClass();
        try {
            return (f54736.m25800(str) == null && C12231.f40866.m33234(str) == null) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40091(String str) {
        str.getClass();
        C10157 c10157 = f54736;
        Bitmap bitmapDecodeStream = (Bitmap) c10157.m25800(str);
        if (bitmapDecodeStream == null) {
            try {
                C4424 c4424M33234 = C12231.f40866.m33234(str);
                if (c4424M33234 != null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(C0834.m3437(c4424M33234.m12357(0)).mo16433());
                    c4424M33234.close();
                    if (bitmapDecodeStream != null) {
                        c10157.m25801(str, bitmapDecodeStream);
                    }
                }
            } catch (IOException unused) {
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40090(Bitmap bitmap) {
        int i;
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == Bitmap.Config.ALPHA_8) {
            i = 1;
        } else {
            i = (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.RGB_565) ? 2 : 4;
        }
        return width * height * i;
    }
}
