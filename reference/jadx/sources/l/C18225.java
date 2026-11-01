package l;

import android.graphics.Bitmap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ᩳᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D27M */
/* JADX INFO: loaded from: classes5.dex */
public class C18225 implements InterfaceC13848 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10157 f58199 = new C10157(500);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C10157 f58200 = new C10157(500);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C18225 f58201 = new C18225();

    /* JADX INFO: renamed from: ۙ */
    public String mo7923(InterfaceC2557 interfaceC2557, int i) {
        return null;
    }

    @Override // l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public int mo7926(InterfaceC2557 interfaceC2557) {
        return 0;
    }

    @Override // l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public C0690 mo7924(InterfaceC2557 interfaceC2557) {
        return C12560.m31247(interfaceC2557);
    }

    @Override // l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14600 m42379(InterfaceC2557 interfaceC2557, int i, boolean z) {
        String strMo7923;
        if ((i == 1 || i == 2) && (strMo7923 = mo7923(interfaceC2557, i)) != null) {
            return C14600.m35070(z ? C17169.m40095(strMo7923) : C17169.m40091(strMo7923));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42375(String str) {
        if (m42378(str)) {
            return true;
        }
        return C17169.m40094(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14600 m42373(String str, C0690 c0690, boolean z, InterfaceC16464 interfaceC16464) {
        if (z && m42378(str)) {
            return c0690.f2943;
        }
        Bitmap bitmapM40091 = C17169.m40091(str);
        if (bitmapM40091 == null) {
            Future futureSubmit = C4716.f16633.submit(new CallableC19992(interfaceC16464));
            try {
                bitmapM40091 = (Bitmap) futureSubmit.get(5L, TimeUnit.SECONDS);
            } catch (TimeoutException unused) {
                futureSubmit.cancel(true);
            } catch (Exception unused2) {
            }
            if (bitmapM40091 != null) {
                C17169.m40093(str, bitmapM40091);
            }
        }
        C14600 c14600M35070 = C14600.m35070(bitmapM40091);
        if (c14600M35070 == null) {
            c14600M35070 = c0690.f2943;
            if (z) {
                f58199.m25801(str, Boolean.TRUE);
            }
        }
        return c14600M35070;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m42372(String str) {
        f58199.m25801(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m42378(String str) {
        return f58199.m25800(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42374() {
        f58200.m25803(-1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m42376(String str) {
        C10157 c10157 = f58200;
        C21753 c21753 = (C21753) c10157.m25800(str);
        if (c21753 == null) {
            c21753 = new C21753(0);
            c10157.m25801(str, c21753);
        }
        c21753.f70495++;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m42377(String str) {
        C21753 c21753 = (C21753) f58200.m25800(str);
        return c21753 != null && c21753.f70495 >= 2;
    }
}
