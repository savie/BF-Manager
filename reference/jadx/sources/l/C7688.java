package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.۟ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7688 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18129 f25374;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC0230 f25378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f25376 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f25377 = new ArrayDeque();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f25375 = new PriorityQueue();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25379 = -1;

    public C7688(InterfaceC0230 interfaceC0230) {
        this.f25378 = interfaceC0230;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20960(int i) {
        C20782.m47568(i >= 0);
        this.f25379 = i;
        m20958(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m20962() {
        return this.f25379;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r9 < r0.f59297) goto L32;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m20961(long r9, l.C21287 r11) {
        /*
            r8 = this;
            int r0 = r8.f25379
            if (r0 == 0) goto L9c
            r1 = -1
            java.util.PriorityQueue r2 = r8.f25375
            if (r0 == r1) goto L21
            int r0 = r2.size()
            int r3 = r8.f25379
            if (r0 < r3) goto L21
            java.lang.Object r0 = r2.peek()
            l.ܿۛۙ r0 = (l.C18129) r0
            java.lang.String r3 = l.C7116.f23455
            long r3 = r0.f59297
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L9c
        L21:
            java.util.ArrayDeque r0 = r8.f25376
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            l.᩶ۨۙ r0 = new l.᩶ۨۙ
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            l.᩶ۨۙ r0 = (l.C21287) r0
        L35:
            int r3 = r11.m48486()
            r0.m48496(r3)
            byte[] r3 = r11.m48497()
            int r11 = r11.m48516()
            byte[] r4 = r0.m48497()
            int r5 = r0.m48486()
            r6 = 0
            java.lang.System.arraycopy(r3, r11, r4, r6, r5)
            l.ܿۛۙ r11 = r8.f25374
            if (r11 == 0) goto L60
            long r3 = r11.f59297
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L60
            java.util.ArrayList r9 = r11.f59296
            r9.add(r0)
            return
        L60:
            java.util.ArrayDeque r11 = r8.f25377
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L6e
            l.ܿۛۙ r11 = new l.ܿۛۙ
            r11.<init>()
            goto L74
        L6e:
            java.lang.Object r11 = r11.pop()
            l.ܿۛۙ r11 = (l.C18129) r11
        L74:
            java.util.ArrayList r3 = r11.f59296
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L80
            r6 = 1
        L80:
            l.C20782.m47565(r6)
            boolean r4 = r3.isEmpty()
            l.C20782.m47568(r4)
            r11.f59297 = r9
            r3.add(r0)
            r2.add(r11)
            r8.f25374 = r11
            int r9 = r8.f25379
            if (r9 == r1) goto L9b
            r8.m20958(r9)
        L9b:
            return
        L9c:
            l.֡ۛۙ r0 = r8.f25378
            r0.mo1704(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7688.m20961(long, l.᩶ۨۙ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20959() {
        this.f25375.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20963() {
        m20958(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m20958(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f25375;
            if (priorityQueue.size() <= i) {
                return;
            }
            C18129 c18129 = (C18129) priorityQueue.poll();
            String str = C7116.f23455;
            int i2 = 0;
            while (true) {
                arrayList = c18129.f59296;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f25378.mo1704(c18129.f59297, (C21287) arrayList.get(i2));
                this.f25376.push((C21287) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C18129 c181210 = this.f25374;
            if (c181210 != null && c181210.f59297 == c18129.f59297) {
                this.f25374 = null;
            }
            this.f25377.push(c18129);
        }
    }
}
