package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes5.dex */
public final class C16985 extends C18225 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16985 f54320 = new C16985();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16985 m39772() {
        return f54320;
    }

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        return m39771(((C5696) interfaceC2557).m15713());
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C0690 mo7924(InterfaceC2557 interfaceC2557) {
        C0690 c0690M31247 = C12560.m31247(interfaceC2557);
        if (c0690M31247 == C0690.f2896) {
            String lowerCase = interfaceC2557.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C0690.f2917;
            }
        }
        return c0690M31247;
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        if (!interfaceC2557.mo7985()) {
            return 0;
        }
        C5696 c5696 = (C5696) interfaceC2557;
        if (c5696.mo7987()) {
            return 0;
        }
        String strMo7967 = c5696.mo7967();
        long size = c5696.getSize();
        if (strMo7967.equals("image/svg+xml")) {
            return size <= 819200 ? 2 : 0;
        }
        if (strMo7967.equals("text/xml")) {
            return size <= 153600 ? 3 : 0;
        }
        return (!strMo7967.startsWith("image/") || size > X931RNG.BLOCK128_RESEED_MAX) ? 0 : 1;
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        final C3555 c3555;
        String strM39771;
        C14600 c14600M42373;
        C13810 c13810 = (C13810) abstractC11462;
        C5696 c5696 = (C5696) interfaceC2557;
        C3555 c3556 = null;
        try {
            String strM33624 = c13810.m33624();
            C2455 c2455M7448 = C2455.m7448(C5553.m15313(strM33624, new String[0]), c13810.m33620());
            try {
                c3555 = new C3555(c2455M7448.m7475(c5696.m15713(), (C8516) null));
                try {
                    c2455M7448.close();
                } catch (Throwable unused) {
                    c3556 = c3555;
                    c3555 = c3556;
                }
                strM39771 = m39771(c5696.m15713());
                if (i != 1 || i == 2) {
                    return C18225.m42373(strM39771, C0690.f2920, true, new C0051(c3555));
                }
                if (i == 3) {
                    final C6037 c6037M21717 = c13810.mo13029().m21717();
                    if (c6037M21717 != null && c3555 != null) {
                        c14600M42373 = C18225.m42373(strM39771, C0690.f2939, true, new InterfaceC16464(this) { // from class: l.ܽ֡֨
                            @Override // l.InterfaceC16464
                            /* JADX INFO: renamed from: ۙ */
                            public final Bitmap mo947() {
                                return C5443.m15057(new C12047(c6037M21717, c3555));
                            }
                        });
                    } else {
                        c14600M42373 = C18225.m42373(strM39771, C0690.f2939, true, new C12686(4, c3555));
                    }
                    if (c14600M42373 != C0690.f2939.f2943) {
                        interfaceC2557.mo7976(R.id.MT_Protector, Boolean.TRUE);
                    }
                    return c14600M42373;
                }
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c2455M7448.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused2) {
            c3555 = c3556;
            strM39771 = m39771(c5696.m15713());
            if (i != 1) {
            }
            return C18225.m42373(strM39771, C0690.f2920, true, new C0051(c3555));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39771(C12107 c12107) {
        return C22253.m49423("zip:" + Long.toHexString(c12107.m30113()) + c12107.getSize()).toLowerCase();
    }
}
