package l;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC13309 implements Runnable {

    /* JADX INFO: renamed from: ۡ۫ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f44179 = {7810, 6167, 6242, 6146, 6171, 6144, 6148, 4624, 32755, 32680, 32697, 32687, 32680, 32750, 32698, 32701, 32687, 32680, 32643, 32681, 32686, 32688, 32687, 32672, 32698, 32701, 32687, 32680, 32643, 32681, 32686, 32688, 32687, 32643, 32697, 32676, 32684, 32693, 32686, 32697, 32696, 32652, 32659, 32655, 32648};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC2787 f44180;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18485 f44181;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44182;

    /* JADX WARN: Code duplicated, block: B:82:0x031d A[PHI: r16 r20 r21
      0x031d: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v6 short[]) binds: [B:81:0x031b, B:76:0x02e8, B:11:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r20v32 java.lang.String) = (r20v10 java.lang.String), (r20v11 java.lang.String), (r20v31 java.lang.String), (r20v36 java.lang.String) binds: [B:81:0x031b, B:76:0x02e8, B:11:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:81:0x031b, B:76:0x02e8, B:11:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (l.C3577.f13150 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (l.CallableC1627.f6528 != false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m32815(l.C18485 r24, byte[] r25) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractRunnableC13309.m32815(l.ᩴۗ۠, byte[]):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C18485 c18485;
        short s = f44179[7];
        int i = (s * 26366) - ((s * s) + 173791489) > 0 ? 29982 : 32732;
        try {
            byte[] bArr = new byte[1024];
            for (int i2 = 0; i2 < 1024; i2++) {
                bArr[i2] = (byte) (i2 & 255);
            }
            C6490 c6490 = new C6490();
            c6490.m17686(this.f44180.mo8462(RunnableC1895.m6164(f44179, 8, 6, i)));
            c6490.m17681(RunnableC1564.m5344(f44179, 41, 4, i), AbstractC21307.m47777(C2724.f10483, bArr));
            C22719 c22719M17678 = c6490.m17678();
            C1460.m5059();
            C18485 c18485Execute = C2724.m8312().m14157(c22719M17678).execute();
            this.f44181 = c18485Execute;
            if (m32815(c18485Execute, bArr)) {
                AbstractC0464.m2311();
                C13638.toString(this.f44180);
                int i3 = C23187.f75239;
                this.f44182 = true;
            } else {
                C13638.toString(this.f44180);
                int i4 = C23187.f75239;
            }
        } catch (SocketTimeoutException unused) {
            C13638.toString(this.f44180);
            int i5 = C23187.f75239;
        } catch (Throwable th) {
            C13638.toString(this.f44180);
            C2124.m6674(th);
            int i6 = C23187.f75239;
        }
        C4135 c4135 = (C4135) this;
        c4135.f15139.getAndIncrement();
        if (!c4135.f44182) {
            if (ViewGroupOnHierarchyChangeListenerC1916.m6238(c4135.f15140) != 0 || (c18485 = c4135.f44181) == null) {
                return;
            }
            AbstractC2787.m8461(c18485);
            return;
        }
        int andIncrement = c4135.f15140.getAndIncrement();
        if (andIncrement >= C23187.f75241) {
            return;
        }
        if (andIncrement == 0) {
            AbstractC2787.m8461(c4135.f44181);
            synchronized (c4135.f15141.f23389) {
                c4135.f15141.f23389.addFirst(c4135.f44180);
            }
        }
        c4135.f15142[andIncrement] = c4135.f44180;
        if (andIncrement == C23187.f75241 - 1) {
            LinkedList linkedList = new LinkedList();
            Collections.addAll(linkedList, c4135.f15142);
            C23187.f75242.edit().putString(C3743.m10964(f44179, 14, 9, i), C6851.m18456(linkedList, C2477.m7604(f44179, 23, 1, i))).putLong(C2704.m8240(f44179, 24, 17, i), AbstractC0464.m2311() + 604800000).apply();
            c4135.f15141.f23389 = linkedList;
            Arrays.toString(c4135.f15142);
        }
    }
}
