package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.֡ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1419 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0884 f1420 = new C14386(Math.min((int) (Runtime.getRuntime().maxMemory() / 6), 10485760));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1668(String str, Bitmap bitmap) {
        C16092 c16092M47155 = null;
        if (str == null || bitmap == null) {
            throw null;
        }
        f1420.m3589(str, bitmap);
        try {
            c16092M47155 = C18116.f59279.m47155(str);
            if (c16092M47155 == null) {
                return;
            }
            InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c16092M47155.m38246(0));
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, interfaceC11573M35106.mo6445());
            interfaceC11573M35106.close();
            c16092M47155.m38249();
        } catch (IOException unused) {
            if (c16092M47155 != null) {
                try {
                    c16092M47155.m38247();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m1667(String str, InterfaceC21100 interfaceC21100, int i) throws TimeoutException {
        Bitmap bitmapM1666 = m1666(str);
        if (bitmapM1666 != null) {
            return bitmapM1666;
        }
        Future futureSubmit = C5261.f18538.submit(new CallableC3946(interfaceC21100));
        try {
            bitmapM1666 = (Bitmap) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            futureSubmit.cancel(true);
            throw e;
        } catch (Exception unused) {
        }
        if (bitmapM1666 != null) {
            m1668(str, bitmapM1666);
        }
        return bitmapM1666;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m1670(String str) {
        return (Bitmap) f1420.m3588(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1669(String str) {
        str.getClass();
        try {
            return (f1420.m3588(str) == null && C18116.f59279.m47161(str) == null) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m1666(String str) {
        str.getClass();
        C0884 c0884 = f1420;
        Bitmap bitmapDecodeStream = (Bitmap) c0884.m3588(str);
        if (bitmapDecodeStream == null) {
            try {
                C3414 c3414M47161 = C18116.f59279.m47161(str);
                if (c3414M47161 != null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(C14556.m35108(c3414M47161.m11164(0)).mo4183());
                    c3414M47161.close();
                    if (bitmapDecodeStream != null) {
                        c0884.m3589(str, bitmapDecodeStream);
                    }
                }
            } catch (IOException unused) {
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1665(Bitmap bitmap) {
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
