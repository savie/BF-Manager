package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.֨۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5200 f3792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22134 f3795;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f3796 = new ArrayDeque();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f3793 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f3794 = new PriorityQueue();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f3791 = -1;

    public C0966(InterfaceC22134 interfaceC22134) {
        this.f3795 = interfaceC22134;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3759(int i) {
        C2023.m6510(i >= 0);
        this.f3791 = i;
        m3757(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m3761() {
        return this.f3791;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r9 < r0.f18032) goto L32;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3760(long r9, l.C2460 r11) {
        /*
            r8 = this;
            int r0 = r8.f3791
            if (r0 == 0) goto L9c
            r1 = -1
            java.util.PriorityQueue r2 = r8.f3794
            if (r0 == r1) goto L21
            int r0 = r2.size()
            int r3 = r8.f3791
            if (r0 < r3) goto L21
            java.lang.Object r0 = r2.peek()
            l.ۚ۟ۙ r0 = (l.C5200) r0
            java.lang.String r3 = l.C17983.f57504
            long r3 = r0.f18032
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L9c
        L21:
            java.util.ArrayDeque r0 = r8.f3796
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            l.ۖۤۙ r0 = new l.ۖۤۙ
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            l.ۖۤۙ r0 = (l.C2460) r0
        L35:
            int r3 = r11.m7503()
            r0.m7517(r3)
            byte[] r3 = r11.m7518()
            int r11 = r11.m7500()
            byte[] r4 = r0.m7518()
            int r5 = r0.m7503()
            r6 = 0
            java.lang.System.arraycopy(r3, r11, r4, r6, r5)
            l.ۚ۟ۙ r11 = r8.f3792
            if (r11 == 0) goto L60
            long r3 = r11.f18032
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L60
            java.util.ArrayList r9 = r11.f18031
            r9.add(r0)
            return
        L60:
            java.util.ArrayDeque r11 = r8.f3793
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L6e
            l.ۚ۟ۙ r11 = new l.ۚ۟ۙ
            r11.<init>()
            goto L74
        L6e:
            java.lang.Object r11 = r11.pop()
            l.ۚ۟ۙ r11 = (l.C5200) r11
        L74:
            java.util.ArrayList r3 = r11.f18031
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L80
            r6 = 1
        L80:
            l.C2023.m6507(r6)
            boolean r4 = r3.isEmpty()
            l.C2023.m6510(r4)
            r11.f18032 = r9
            r3.add(r0)
            r2.add(r11)
            r8.f3792 = r11
            int r9 = r8.f3791
            if (r9 == r1) goto L9b
            r8.m3757(r9)
        L9b:
            return
        L9c:
            l.᩹۟ۙ r0 = r8.f3795
            r0.mo22853(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0966.m3760(long, l.ۖۤۙ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3758() {
        this.f3794.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3762() {
        m3757(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m3757(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f3794;
            if (priorityQueue.size() <= i) {
                return;
            }
            C5200 c5200 = (C5200) priorityQueue.poll();
            String str = C17983.f57504;
            int i2 = 0;
            while (true) {
                arrayList = c5200.f18031;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f3795.mo22853(c5200.f18032, (C2460) arrayList.get(i2));
                this.f3796.push((C2460) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C5200 c5201 = this.f3792;
            if (c5201 != null && c5201.f18032 == c5200.f18032) {
                this.f3792 = null;
            }
            this.f3793.push(c5200);
        }
    }
}
