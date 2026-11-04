package l;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۙ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC4568 implements Runnable {

    /* JADX INFO: renamed from: ۜۖ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f16245 = {4197, -23840, -23915, -23819, -23828, -23817, -23821, 608, 12210, 12265, 12280, 12270, 12265, 12207, 12283, 12284, 12270, 12265, 12226, 12264, 12271, 12273, 12270, 12257, 12283, 12284, 12270, 12265, 12226, 12264, 12271, 12273, 12270, 12226, 12280, 12261, 12269, 12276, 12271, 12280, 12281, 12237, 12242, 12238, 12233};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9444 f16246;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC13887 f16247;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f16248;

    /* JADX WARN: Code duplicated, block: B:74:0x02b0 A[PHI: r3 r4 r5 r19
      0x02b0: PHI (r3v4 char) = (r3v3 char), (r3v2 char) binds: [B:73:0x02ae, B:69:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:73:0x02ae, B:69:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r5v3 short) = (r5v2 short), (r5v4 short) binds: [B:73:0x02ae, B:69:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r19v13 java.lang.String) = (r19v12 java.lang.String), (r19v14 java.lang.String) binds: [B:73:0x02ae, B:69:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (l.C1519.f5300 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14345(l.C9444 r23, byte[] r24) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractRunnableC4568.m14345(l.ۡܳۨ, byte[]):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9444 c9444;
        short s = f16245[7];
        int i = s + 17089;
        int i2 = (s * s) + 292033921;
        int i3 = (i2 + i2) - (i * i) < 0 ? 24264 : 12189;
        try {
            byte[] bArr = new byte[1024];
            for (int i4 = 0; i4 < 1024; i4++) {
                bArr[i4] = (byte) (i4 & 255);
            }
            C0496 c0496 = new C0496();
            c0496.m2397(this.f16247.mo19750(C3492.m11486(f16245, 8, 6, i3)));
            c0496.m2392(C2375.m8069(f16245, 41, 4, i3), AbstractC10190.m26309(C2592.f8324, bArr));
            C7954 c7954M2389 = c0496.m2389();
            C3448.m11251();
            C9444 c9444Execute = C2592.m8670().m54450(c7954M2389).execute();
            this.f16246 = c9444Execute;
            if (m14345(c9444Execute, bArr)) {
                C2834.m9342();
                C17359.toString(this.f16247);
                int i5 = C22468.f72704;
                this.f16248 = true;
            } else {
                C17359.toString(this.f16247);
                int i6 = C22468.f72704;
            }
        } catch (SocketTimeoutException unused) {
            C17359.toString(this.f16247);
            int i7 = C22468.f72704;
        } catch (Throwable th) {
            C17359.toString(this.f16247);
            C1080.m4058(th);
            int i8 = C22468.f72704;
        }
        C21722 c21722 = (C21722) this;
        c21722.f69318.getAndIncrement();
        if (!c21722.f16248) {
            if (RunnableC0334.m2051(c21722.f69317) != 0 || (c9444 = c21722.f16246) == null) {
                return;
            }
            AbstractC13887.m33832(c9444);
            return;
        }
        int andIncrement = c21722.f69317.getAndIncrement();
        if (andIncrement >= C22468.f72705) {
            return;
        }
        if (andIncrement == 0) {
            AbstractC13887.m33832(c21722.f16246);
            synchronized (c21722.f69316.f33501) {
                c21722.f69316.f33501.addFirst(c21722.f16247);
            }
        }
        c21722.f69319[andIncrement] = c21722.f16247;
        if (andIncrement == C22468.f72705 - 1) {
            LinkedList linkedList = new LinkedList();
            Collections.addAll(linkedList, c21722.f69319);
            C22468.f72706.edit().putString(C3492.m11486(f16245, 14, 9, i3), C24276.m54283(linkedList, AbstractC0641.m2820(f16245, 23, 1, i3))).putLong(C0269.m1785(f16245, 24, 17, i3), C3448.m11251() + 604800000).apply();
            c21722.f69316.f33501 = linkedList;
            Arrays.toString(c21722.f69319);
        }
    }
}
