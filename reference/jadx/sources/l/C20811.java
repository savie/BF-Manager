package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩵᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes5.dex */
public final class C20811 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f66645 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47604(C3034 c3034, C9622 c9622) {
        C11983 c11983M25124 = c9622.m25124();
        if (c11983M25124 != null) {
            c3034.m9864(c11983M25124);
            c3034.setTag(null);
            return;
        }
        C8877 c8877M25121 = c9622.m25121();
        if (c8877M25121 != null) {
            C20613 c20613M22060 = c8877M25121.m23754() ? C20613.f66109 : C8153.m22060(new C13352(C11293.m28558(c9622.m25117()), "/", null, 0L, 0L, true));
            C11983 c11983 = c20613M22060.f66114;
            c9622.m25114(c20613M22060, c11983);
            c3034.m9864(c11983);
            c3034.setTag(null);
            return;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c9622.m25117(), new String[0]);
        if (!abstractC22044M35193.mo4295()) {
            C20613 c20613M25104 = c9622.m25104();
            if (c20613M25104 == null) {
                c20613M25104 = C20613.f66045;
            }
            c3034.m9864(c20613M25104.f66114);
            C12606 c12606M18577 = C6641.m18577(c9622);
            c3034.setTag(c12606M18577.m31318());
            C6641.m18579(c9622, c12606M18577, c3034);
            if (c12606M18577.m31319()) {
                C5261.f18540.submit(new RunnableC3657(c9622, abstractC22044M35193, c12606M18577));
                return;
            }
            return;
        }
        C6004 c6004 = abstractC22044M35193.mo2934() ? new C6004(abstractC22044M35193) : null;
        if (c6004 == null) {
            C20613 c20613 = C20613.f66045;
            C11983 c11984 = c20613.f66114;
            c9622.m25114(c20613, c11984);
            c3034.m9864(c11984);
            c3034.setTag(null);
            return;
        }
        C13461 c13461 = C13461.f42854;
        C20613 c20613Mo3626 = c13461.mo3626(c6004);
        c9622.m25113(c20613Mo3626);
        C11983 c11985 = c20613Mo3626.f66114;
        c3034.m9864(c11985);
        int iMo2786 = c13461.mo2786(c6004);
        if (iMo2786 == 0) {
            c9622.m25114(c20613Mo3626, c11985);
            c3034.setTag(null);
            return;
        }
        C12606 c12606M18578 = C6641.m18577(c9622);
        c3034.setTag(c12606M18578.m31318());
        C6641.m18579(c9622, c12606M18578, c3034);
        if (c12606M18578.m31319()) {
            f66645.submit(new RunnableC17827(c9622, c6004, iMo2786, c20613Mo3626, c12606M18578));
        }
    }
}
