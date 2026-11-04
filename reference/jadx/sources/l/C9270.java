package l;

import bin.mt.plus.R;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9270 extends C2166 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9270 f30153 = new C9270();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9270 m24461() {
        return f30153;
    }

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        return m24460(((C2559) interfaceC2386).m8594());
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        if (!interfaceC2386.mo8090()) {
            return 0;
        }
        String strMo8114 = ((C2559) interfaceC2386).mo8114();
        if (strMo8114.equals("image/svg+xml")) {
            return 2;
        }
        if (strMo8114.equals("text/xml")) {
            return 3;
        }
        return strMo8114.startsWith("image/") ? 1 : 0;
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        C3109 c3109 = (C3109) abstractC7364;
        C7450 c7450M8594 = ((C2559) interfaceC2386).m8594();
        try {
            C5368 c5368M28596 = c3109.mo10174().m28596();
            try {
                String strM24460 = m24460(c7450M8594);
                C1068 c1068 = new C1068(c5368M28596, c7450M8594);
                if (i == 1 || i == 2) {
                    C11983 c11983M7448 = C2166.m7448(strM24460, C20613.f66070, true, new C19411(3, c1068));
                    c5368M28596.close();
                    return c11983M7448;
                }
                if (i == 3) {
                    C20613 c20613 = C20613.f66051;
                    C11983 c11983M7449 = C2166.m7448(strM24460, c20613, true, new C1793(c1068));
                    if (c11983M7449 != c20613.f66114) {
                        interfaceC2386.mo8110(R.id.MT_Protector, Boolean.TRUE);
                    }
                    c5368M28596.close();
                    return c11983M7449;
                }
                c5368M28596.close();
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c5368M28596.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24460(C7450 c7450) {
        return C15022.m36181("tar:" + Long.toHexString(((long) Arrays.hashCode(new long[]{c7450.m20449(), c7450.m20445().getTime(), c7450.m20456().hashCode()})) & 4294967295L) + c7450.m20439()).toLowerCase();
    }
}
