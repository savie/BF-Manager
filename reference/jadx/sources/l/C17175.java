package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܺ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17175 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Comparator f55984 = new C11954();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f55985;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f55986;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float[] f55987 = new float[3];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23889[] f55988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f55989;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m40342(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C17175(int[] iArr, int i, InterfaceC23889[] interfaceC23889Arr) {
        C25381 c25381;
        this.f55988 = interfaceC23889Arr;
        int[] iArr2 = new int[32768];
        this.f55986 = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iM40342 = m40342(Color.blue(i3), 8, 5) | (m40342(Color.red(i3), 8, 5) << 10) | (m40342(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iM40342;
            iArr2[iM40342] = iArr2[iM40342] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iM40340 = m40340((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.f55987;
                C19988.m45963(iM40340, fArr);
                InterfaceC23889[] interfaceC23889Arr2 = this.f55988;
                if (interfaceC23889Arr2 != null && interfaceC23889Arr2.length > 0) {
                    for (InterfaceC23889 interfaceC23889 : interfaceC23889Arr2) {
                        if (!interfaceC23889.mo41835(fArr)) {
                            iArr2[i5] = 0;
                            break;
                        }
                    }
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f55985 = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f55989 = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f55989.add(new C3751(m40340((i9 >> 10) & 31, (i9 >> 5) & 31, i9 & 31), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f55984);
        priorityQueue.offer(new C25381(this, 0, this.f55985.length - 1));
        while (priorityQueue.size() < i && (c25381 = (C25381) priorityQueue.poll()) != null && c25381.m56742()) {
            priorityQueue.offer(c25381.m56744());
            priorityQueue.offer(c25381);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C3751 c3751M56743 = ((C25381) it.next()).m56743();
            float[] fArrM12186 = c3751M56743.m12186();
            InterfaceC23889[] interfaceC23889Arr3 = this.f55988;
            if (interfaceC23889Arr3 != null && interfaceC23889Arr3.length > 0) {
                int length = interfaceC23889Arr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (!interfaceC23889Arr3[i10].mo41835(fArrM12186)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            arrayList.add(c3751M56743);
        }
        this.f55989 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40341(int i, int i2, int i3, int[] iArr) {
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
    public static int m40340(int i, int i2, int i3) {
        return Color.rgb(m40342(i, 5, 8), m40342(i2, 5, 8), m40342(i3, 5, 8));
    }
}
