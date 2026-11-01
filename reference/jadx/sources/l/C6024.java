package l;

import bin.mt.plus.R;
import java.util.Arrays;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۛۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: CB5W */
/* JADX INFO: loaded from: classes3.dex */
public final class C6024 extends C18225 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C6024 f20490 = new C6024();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C6024 m16344() {
        return f20490;
    }

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        return m16342(((C10964) interfaceC2557).m27721());
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985()) {
            return m16343(((C10964) interfaceC2557).m27721());
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16343(C18334 c18334) {
        if (!c18334.m42574() && !c18334.m42581()) {
            String strM48172 = C21512.m48172(c18334.m42568());
            long jM42577 = c18334.m42577();
            if (strM48172.equals("image/svg+xml")) {
                return jM42577 <= 819200 ? 2 : 0;
            }
            if (strM48172.equals("text/xml")) {
                return jM42577 <= 153600 ? 3 : 0;
            }
            if (strM48172.startsWith("image/") && jM42577 <= X931RNG.BLOCK128_RESEED_MAX) {
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
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ۡ᩻᩹] */
    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        ?? M23742;
        C3555 c3555;
        ?? r7 = (C9221) abstractC11462;
        C10964 c10964 = (C10964) interfaceC2557;
        C3555 c3556 = null;
        ?? r1 = 0;
        try {
            M23742 = r7.m23742();
            try {
                C0099 c0099 = new C0099((int) c10964.m27721().m42577());
                if (M23742.extractSlow(c10964.m27721().m42575(), c0099) == ExtractOperationResult.OK) {
                    r7.m23739(M23742);
                    c3555 = new C3555(c0099.m1063());
                } else {
                    c3555 = null;
                    r1 = M23742;
                }
                C19431.m44468(r1);
                c3556 = c3555;
            } catch (Throwable unused) {
                C19431.m44468(M23742);
            }
        } catch (Throwable unused2) {
            M23742 = null;
        }
        String strM16342 = m16342(c10964.m27721());
        if (i == 1 || i == 2) {
            return C18225.m42373(strM16342, C0690.f2920, true, new C13455(c3556));
        }
        if (i == 3) {
            C0690 c0690 = C0690.f2939;
            C14600 c14600M42373 = C18225.m42373(strM16342, c0690, true, new C0297(c3556));
            if (c14600M42373 != c0690.f2943) {
                interfaceC2557.mo7976(R.id.MT_Protector, Boolean.TRUE);
            }
            return c14600M42373;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16342(C18334 c18334) {
        int iHashCode;
        Integer numM42578 = c18334.m42578();
        if (numM42578 != null) {
            iHashCode = numM42578.intValue();
        } else {
            iHashCode = Arrays.hashCode(new long[]{c18334.m42571(), c18334.m42570(), c18334.m42573().hashCode()});
        }
        return C22253.m49423("archive:" + Long.toHexString(((long) iHashCode) & 4294967295L) + c18334.m42577()).toLowerCase();
    }
}
