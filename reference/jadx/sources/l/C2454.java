package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ۖۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2454 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C0963 f7874 = new C0963();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f7875;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f7877;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m8278(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C2454(int[] iArr) {
        C9165 c9165;
        int[] iArr2 = new int[32768];
        this.f7877 = iArr2;
        for (int i : iArr) {
            int iM8278 = m8278(Color.blue(i), 8, 5) | (m8278(Color.red(i), 8, 5) << 10) | (m8278(Color.green(i), 8, 5) << 5);
            iArr2[iM8278] = iArr2[iM8278] + 1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 32768; i3++) {
            if (iArr2[i3] > 0) {
                i2++;
            }
        }
        int[] iArr3 = new int[i2];
        this.f7875 = iArr3;
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                iArr3[i4] = i5;
                i4++;
            }
        }
        if (i2 <= 1) {
            this.f7876 = new ArrayList();
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr3[i6];
                this.f7876.add(new C3751(m8276((i7 >> 10) & 31, (i7 >> 5) & 31, i7 & 31), iArr2[i7]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(1, f7874);
        priorityQueue.offer(new C9165(this, 0, this.f7875.length - 1));
        while (priorityQueue.size() < 1 && (c9165 = (C9165) priorityQueue.poll()) != null && c9165.m24292()) {
            priorityQueue.offer(c9165.m24294());
            priorityQueue.offer(c9165);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9165) it.next()).m24293());
        }
        this.f7876 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8277(int i, int i2, int i3, int[] iArr) {
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
    public static int m8276(int i, int i2, int i3) {
        return Color.rgb(m8278(i, 5, 8), m8278(i2, 5, 8), m8278(i3, 5, 8));
    }
}
