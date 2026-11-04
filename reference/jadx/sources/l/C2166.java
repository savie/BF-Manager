package l;

import android.graphics.Bitmap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.֫᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D27M */
/* JADX INFO: loaded from: classes3.dex */
public class C2166 implements InterfaceC0895 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0884 f7143 = new C0884(500);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C0884 f7144 = new C0884(500);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C2166 f7145 = new C2166();

    /* JADX INFO: renamed from: ۙ */
    public String mo2784(InterfaceC2386 interfaceC2386, int i) {
        return null;
    }

    @Override // l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public int mo2786(InterfaceC2386 interfaceC2386) {
        return 0;
    }

    @Override // l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public C20613 mo3626(InterfaceC2386 interfaceC2386) {
        return C8153.m22060(interfaceC2386);
    }

    @Override // l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11983 m7455(InterfaceC2386 interfaceC2386, int i, boolean z) {
        String strMo2784;
        if ((i == 1 || i == 2) && (strMo2784 = mo2784(interfaceC2386, i)) != null) {
            return C11983.m30076(z ? C0217.m1670(strMo2784) : C0217.m1666(strMo2784));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7450(String str) {
        if (m7453(str)) {
            return true;
        }
        return C0217.m1669(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11983 m7448(String str, C20613 c20613, boolean z, InterfaceC21100 interfaceC21100) {
        if (z && m7453(str)) {
            return c20613.f66114;
        }
        Bitmap bitmapM1666 = C0217.m1666(str);
        if (bitmapM1666 == null) {
            Future futureSubmit = C5261.f18537.submit(new CallableC3946(interfaceC21100));
            try {
                bitmapM1666 = (Bitmap) futureSubmit.get(5L, TimeUnit.SECONDS);
            } catch (TimeoutException unused) {
                futureSubmit.cancel(true);
            } catch (Exception unused2) {
            }
            if (bitmapM1666 != null) {
                C0217.m1668(str, bitmapM1666);
            }
        }
        C11983 c11983M30076 = C11983.m30076(bitmapM1666);
        if (c11983M30076 == null) {
            c11983M30076 = c20613.f66114;
            if (z) {
                f7143.m3589(str, Boolean.TRUE);
            }
        }
        return c11983M30076;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m7454(String str) {
        f7143.m3589(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m7453(String str) {
        return f7143.m3588(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7449() {
        f7144.m3591(-1);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7452(String str) {
        C0884 c0884 = f7144;
        C5895 c5895 = (C5895) c0884.m3588(str);
        if (c5895 == null) {
            c5895 = new C5895(0);
            c0884.m3589(str, c5895);
        }
        c5895.f20188++;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7451(String str) {
        C5895 c5895 = (C5895) f7144.m3588(str);
        return c5895 != null && c5895.f20188 >= 2;
    }
}
