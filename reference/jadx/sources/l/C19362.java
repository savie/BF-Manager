package l;

import bin.mt.plus.R;
import java.util.Arrays;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ᩳ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CB5W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19362 extends C2166 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C19362 f62536 = new C19362();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C19362 m44776() {
        return f62536;
    }

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        return m44774(((C10411) interfaceC2386).m26722());
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090()) {
            return m44775(((C10411) interfaceC2386).m26722());
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m44775(C1997 c1997) {
        if (!c1997.m6837() && !c1997.m6844()) {
            String strM23965 = C8969.m23965(c1997.m6838());
            long jM6834 = c1997.m6834();
            if (strM23965.equals("image/svg+xml")) {
                return jM6834 <= 819200 ? 2 : 0;
            }
            if (strM23965.equals("text/xml")) {
                return jM6834 <= 153600 ? 3 : 0;
            }
            if (strM23965.startsWith("image/") && jM6834 <= X931RNG.BLOCK128_RESEED_MAX) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.sf.sevenzipjbinding.IInArchive] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.᩵ᩴ۫] */
    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        ?? M47477;
        C18716 c18716;
        ?? r7 = (C20766) abstractC7364;
        C10411 c10411 = (C10411) interfaceC2386;
        C18716 c18717 = null;
        ?? r1 = 0;
        try {
            M47477 = r7.m47477();
            try {
                C15543 c15543 = new C15543((int) c10411.m26722().m6834());
                if (M47477.extractSlow(c10411.m26722().m6835(), c15543) == ExtractOperationResult.OK) {
                    r7.m47476(M47477);
                    c18716 = new C18716(c15543.m37226());
                } else {
                    c18716 = null;
                    r1 = M47477;
                }
                C20244.m46520(r1);
                c18717 = c18716;
            } catch (Throwable unused) {
                C20244.m46520(M47477);
            }
        } catch (Throwable unused2) {
            M47477 = null;
        }
        String strM44774 = m44774(c10411.m26722());
        if (i == 1 || i == 2) {
            return C2166.m7448(strM44774, C20613.f66070, true, new C5612(c18717));
        }
        if (i == 3) {
            C20613 c20613 = C20613.f66051;
            C11983 c11983M7448 = C2166.m7448(strM44774, c20613, true, new C2429(c18717));
            if (c11983M7448 != c20613.f66114) {
                interfaceC2386.mo8110(R.id.MT_Protector, Boolean.TRUE);
            }
            return c11983M7448;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44774(C1997 c1997) {
        int iHashCode;
        Integer numM6841 = c1997.m6841();
        if (numM6841 != null) {
            iHashCode = numM6841.intValue();
        } else {
            iHashCode = Arrays.hashCode(new long[]{c1997.m6832(), c1997.m6831(), c1997.m6840().hashCode()});
        }
        return C15022.m36181("archive:" + Long.toHexString(((long) iHashCode) & 4294967295L) + c1997.m6834()).toLowerCase();
    }
}
