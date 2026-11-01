package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ܺᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f52090 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38142(C11072 c11072, C11897 c11897) {
        C14600 c14600M29679 = c11897.m29679();
        if (c14600M29679 != null) {
            c11072.m27921(c14600M29679);
            c11072.setTag(null);
            return;
        }
        C5546 c5546M29659 = c11897.m29659();
        if (c5546M29659 != null) {
            C0690 c0690M31247 = c5546M29659.m15295() ? C0690.f2900 : C12560.m31247(new C15404(C6730.m18175(c11897.m29678()), "/", null, 0L, 0L, true));
            C14600 c14600 = c0690M31247.f2943;
            c11897.m29666(c0690M31247, c14600);
            c11072.m27921(c14600);
            c11072.setTag(null);
            return;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c11897.m29678(), new String[0]);
        if (!abstractC20745M15313.mo36912()) {
            C0690 c0690M29661 = c11897.m29661();
            if (c0690M29661 == null) {
                c0690M29661 = C0690.f2873;
            }
            c11072.m27921(c0690M29661.f2943);
            C20342 c20342M2784 = C0585.m2784(c11897);
            c11072.setTag(c20342M2784.m45905());
            C0585.m2786(c11897, c20342M2784, c11072);
            if (c20342M2784.m45906()) {
                C4716.f16636.submit(new RunnableC21047(c11897, abstractC20745M15313, c20342M2784));
                return;
            }
            return;
        }
        C6794 c6794 = abstractC20745M15313.mo33975() ? new C6794(abstractC20745M15313) : null;
        if (c6794 == null) {
            C0690 c0690 = C0690.f2873;
            C14600 c14601 = c0690.f2943;
            c11897.m29666(c0690, c14601);
            c11072.m27921(c14601);
            c11072.setTag(null);
            return;
        }
        C3971 c3971 = C3971.f14739;
        C0690 c0690Mo7924 = c3971.mo7924(c6794);
        c11897.m29665(c0690Mo7924);
        C14600 c14602 = c0690Mo7924.f2943;
        c11072.m27921(c14602);
        int iMo7926 = c3971.mo7926(c6794);
        if (iMo7926 == 0) {
            c11897.m29666(c0690Mo7924, c14602);
            c11072.setTag(null);
            return;
        }
        C20342 c20342M2785 = C0585.m2784(c11897);
        c11072.setTag(c20342M2785.m45905());
        C0585.m2786(c11897, c20342M2785, c11072);
        if (c20342M2785.m45906()) {
            f52090.submit(new RunnableC9054(c11897, c6794, iMo7926, c0690Mo7924, c20342M2785));
        }
    }
}
