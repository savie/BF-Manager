package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۡۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes4.dex */
public final class C9205 extends C2166 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9205 f30014 = new C9205();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9205 m24360() {
        return f30014;
    }

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        return m24359(((C2494) interfaceC2386).m8382());
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C20613 mo3626(InterfaceC2386 interfaceC2386) {
        C20613 c20613M22060 = C8153.m22060(interfaceC2386);
        if (c20613M22060 == C20613.f66060) {
            String lowerCase = interfaceC2386.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C20613.f66102;
            }
        }
        return c20613M22060;
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        if (!interfaceC2386.mo8090()) {
            return 0;
        }
        C2494 c2494 = (C2494) interfaceC2386;
        if (c2494.mo8113()) {
            return 0;
        }
        String strMo8114 = c2494.mo8114();
        long size = c2494.getSize();
        if (strMo8114.equals("image/svg+xml")) {
            return size <= 819200 ? 2 : 0;
        }
        if (strMo8114.equals("text/xml")) {
            return size <= 153600 ? 3 : 0;
        }
        return (!strMo8114.startsWith("image/") || size > X931RNG.BLOCK128_RESEED_MAX) ? 0 : 1;
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        final C18716 c18716;
        String strM24359;
        C11983 c11983M7448;
        C15102 c15102 = (C15102) abstractC7364;
        C2494 c2494 = (C2494) interfaceC2386;
        C18716 c18717 = null;
        try {
            String strM36371 = c15102.m36371();
            C22941 c22941M51705 = C22941.m51705(C14584.m35193(strM36371, new String[0]), c15102.m36370());
            try {
                c18716 = new C18716(c22941M51705.m51731(c2494.m8382(), (C3374) null));
                try {
                    c22941M51705.close();
                } catch (Throwable unused) {
                    c18717 = c18716;
                    c18716 = c18717;
                }
                strM24359 = m24359(c2494.m8382());
                if (i != 1 || i == 2) {
                    return C2166.m7448(strM24359, C20613.f66070, true, new C6259(c18716));
                }
                if (i == 3) {
                    final C21246 c21246M54364 = c15102.mo10174().m54364();
                    if (c21246M54364 != null && c18716 != null) {
                        c11983M7448 = C2166.m7448(strM24359, C20613.f66051, true, new InterfaceC21100(this) { // from class: l.ۢۜ۫
                            @Override // l.InterfaceC21100
                            /* JADX INFO: renamed from: ᩷ */
                            public final Bitmap mo6272() {
                                return C8275.m22351(new C1003(c21246M54364, c18716));
                            }
                        });
                    } else {
                        c11983M7448 = C2166.m7448(strM24359, C20613.f66051, true, new C17299(4, c18716));
                    }
                    if (c11983M7448 != C20613.f66051.f66114) {
                        interfaceC2386.mo8110(R.id.MT_Protector, Boolean.TRUE);
                    }
                    return c11983M7448;
                }
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c22941M51705.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused2) {
            c18716 = c18717;
            strM24359 = m24359(c2494.m8382());
            if (i != 1) {
            }
            return C2166.m7448(strM24359, C20613.f66070, true, new C6259(c18716));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24359(C8002 c8002) {
        return C15022.m36181("zip:" + Long.toHexString(c8002.m21830()) + c8002.getSize()).toLowerCase();
    }
}
