package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.۫۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12266 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Comparator f41024 = new C0270();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41025;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f41026;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float[] f41027 = new float[3];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f41028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10855[] f41029;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m30492(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C12266(int[] iArr, int i, InterfaceC10855[] interfaceC10855Arr) {
        C16499 c16499;
        this.f41029 = interfaceC10855Arr;
        int[] iArr2 = new int[32768];
        this.f41028 = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iM30492 = m30492(Color.blue(i3), 8, 5) | (m30492(Color.red(i3), 8, 5) << 10) | (m30492(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iM30492;
            iArr2[iM30492] = iArr2[iM30492] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iM30490 = m30490((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.f41027;
                C3224.m9667(iM30490, fArr);
                InterfaceC10855[] interfaceC10855Arr2 = this.f41029;
                if (interfaceC10855Arr2 != null && interfaceC10855Arr2.length > 0) {
                    for (InterfaceC10855 interfaceC10855 : interfaceC10855Arr2) {
                        if (!interfaceC10855.mo27205(fArr)) {
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
        this.f41026 = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f41025 = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f41025.add(new C23555(m30490((i9 >> 10) & 31, (i9 >> 5) & 31, i9 & 31), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f41024);
        priorityQueue.offer(new C16499(this, 0, this.f41026.length - 1));
        while (priorityQueue.size() < i && (c16499 = (C16499) priorityQueue.poll()) != null && c16499.m38772()) {
            priorityQueue.offer(c16499.m38773());
            priorityQueue.offer(c16499);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C23555 c23555M38774 = ((C16499) it.next()).m38774();
            float[] fArrM51918 = c23555M38774.m51918();
            InterfaceC10855[] interfaceC10855Arr3 = this.f41029;
            if (interfaceC10855Arr3 != null && interfaceC10855Arr3.length > 0) {
                int length = interfaceC10855Arr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (!interfaceC10855Arr3[i10].mo27205(fArrM51918)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            arrayList.add(c23555M38774);
        }
        this.f41025 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30491(int i, int i2, int i3, int[] iArr) {
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
    public static int m30490(int i, int i2, int i3) {
        return Color.rgb(m30492(i, 5, 8), m30492(i2, 5, 8), m30492(i3, 5, 8));
    }
}
