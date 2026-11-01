package l;

import bin.mt.plus.R;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23936 extends C18225 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C23936 f77522 = new C23936();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23936 m52769() {
        return f77522;
    }

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        return m52768(((C14764) interfaceC2557).m35382());
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        if (!interfaceC2557.mo7985()) {
            return 0;
        }
        String strMo7967 = ((C14764) interfaceC2557).mo7967();
        if (strMo7967.equals("image/svg+xml")) {
            return 2;
        }
        if (strMo7967.equals("text/xml")) {
            return 3;
        }
        return strMo7967.startsWith("image/") ? 1 : 0;
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        C23085 c23085 = (C23085) abstractC11462;
        C10049 c10049M35382 = ((C14764) interfaceC2557).m35382();
        try {
            C10755 c10755M27052 = C10755.m27052(C5553.m15313(c23085.m51086(), new String[0]));
            try {
                String strM52768 = m52768(c10049M35382);
                C11236 c11236 = new C11236(c10755M27052, c10049M35382);
                if (i == 1 || i == 2) {
                    C14600 c14600M42373 = C18225.m42373(strM52768, C0690.f2920, true, new C5672(2, c11236));
                    c10755M27052.close();
                    return c14600M42373;
                }
                if (i == 3) {
                    C0690 c0690 = C0690.f2939;
                    C14600 c14600M42374 = C18225.m42373(strM52768, c0690, true, new C23527(1, c11236));
                    if (c14600M42374 != c0690.f2943) {
                        interfaceC2557.mo7976(R.id.MT_Protector, Boolean.TRUE);
                    }
                    c10755M27052.close();
                    return c14600M42374;
                }
                c10755M27052.close();
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c10755M27052.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52768(C10049 c10049) {
        return C22253.m49423("tar:" + Long.toHexString(((long) Arrays.hashCode(new long[]{c10049.m25417(), c10049.m25429().getTime(), c10049.m25433().hashCode()})) & 4294967295L) + c10049.m25435()).toLowerCase();
    }
}
