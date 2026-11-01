package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ۢۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9409 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C14348 f31889 = new C14348();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f31890;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31891;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f31892;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m24154(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C9409(int[] iArr) {
        C1646 c1646;
        int[] iArr2 = new int[32768];
        this.f31892 = iArr2;
        for (int i : iArr) {
            int iM24154 = m24154(Color.blue(i), 8, 5) | (m24154(Color.red(i), 8, 5) << 10) | (m24154(Color.green(i), 8, 5) << 5);
            iArr2[iM24154] = iArr2[iM24154] + 1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 32768; i3++) {
            if (iArr2[i3] > 0) {
                i2++;
            }
        }
        int[] iArr3 = new int[i2];
        this.f31890 = iArr3;
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                iArr3[i4] = i5;
                i4++;
            }
        }
        if (i2 <= 1) {
            this.f31891 = new ArrayList();
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr3[i6];
                this.f31891.add(new C23555(m24152((i7 >> 10) & 31, (i7 >> 5) & 31, i7 & 31), iArr2[i7]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(1, f31889);
        priorityQueue.offer(new C1646(this, 0, this.f31890.length - 1));
        while (priorityQueue.size() < 1 && (c1646 = (C1646) priorityQueue.poll()) != null && c1646.m5537()) {
            priorityQueue.offer(c1646.m5538());
            priorityQueue.offer(c1646);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1646) it.next()).m5539());
        }
        this.f31891 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24153(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24152(int i, int i2, int i3) {
        return Color.rgb(m24154(i, 5, 8), m24154(i2, 5, 8), m24154(i3, 5, 8));
    }
}
