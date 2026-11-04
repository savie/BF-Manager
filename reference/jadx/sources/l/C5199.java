package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5199 extends AbstractC11164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17043 f18124;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f18125;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f18126;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f18127;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f18128;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f18129;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f18130;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f18131;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f18132;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC14542 f18133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f18134;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long f18135;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f18136;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f18137;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0404 f18138;

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo5259() {
        return null;
    }

    public C5199(C16549 c16549, int[] iArr, InterfaceC17043 interfaceC17043, long j, long j2, long j3, AbstractC1928 abstractC1928) {
        super(c16549, iArr);
        if (j3 < j) {
            C1896.m6517("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f18124 = interfaceC17043;
        this.f18135 = j * 1000;
        this.f18132 = j2 * 1000;
        this.f18130 = j3 * 1000;
        this.f18125 = 1279;
        this.f18136 = 719;
        this.f18127 = 0.7f;
        this.f18129 = 0.75f;
        this.f18131 = AbstractC1928.copyOf((Collection) abstractC1928);
        this.f18138 = InterfaceC14814.f48448;
        this.f18128 = 1.0f;
        this.f18137 = 0;
        this.f18134 = -9223372036854775807L;
    }

    @Override // l.AbstractC11164, l.InterfaceC1470
    /* JADX INFO: renamed from: ܳ */
    public final void mo5258() {
        this.f18134 = -9223372036854775807L;
        this.f18133 = null;
    }

    @Override // l.AbstractC11164, l.InterfaceC1470
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5261() {
        this.f18133 = null;
    }

    @Override // l.AbstractC11164, l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final void mo5249(float f) {
        this.f18128 = f;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final void mo5250(long j, long j2, long j3, List list, InterfaceC18272[] interfaceC18272Arr) {
        long jM15621;
        long jMo42426;
        long jMo42425;
        int i;
        int i2;
        int iM28108;
        int iM15620;
        long jMin;
        int i3;
        int i4;
        long j4;
        this.f18138.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.f18126;
        if (i5 < interfaceC18272Arr.length && interfaceC18272Arr[i5].next()) {
            InterfaceC18272 interfaceC18272 = interfaceC18272Arr[this.f18126];
            jMo42426 = interfaceC18272.mo42426();
            jMo42425 = interfaceC18272.mo42425();
        } else {
            int length = interfaceC18272Arr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    InterfaceC18272 interfaceC18273 = interfaceC18272Arr[i6];
                    if (interfaceC18273.next()) {
                        jMo42426 = interfaceC18273.mo42426();
                        jMo42425 = interfaceC18273.mo42425();
                    } else {
                        i6++;
                    }
                } else {
                    jM15621 = m15621(list);
                    break;
                }
            }
            i = this.f18137;
            if (i == 0) {
                this.f18137 = 1;
                this.f18126 = m15620(jElapsedRealtime, jM15621);
                return;
            }
            i2 = this.f18126;
            if (list.isEmpty()) {
                iM28108 = -1;
            } else {
                iM28108 = m28108(((AbstractC14542) C16625.m39339(list)).f78511);
            }
            if (iM28108 != -1) {
                i = ((AbstractC14542) C16625.m39339(list)).f78508;
                i2 = iM28108;
            }
            iM15620 = m15620(jElapsedRealtime, jM15621);
            if (iM15620 != i2 && !mo5252(i2, jElapsedRealtime)) {
                C15648 c15648Mo17235 = mo17235(i2);
                C15648 c15648Mo17236 = mo17235(iM15620);
                jMin = this.f18135;
                if (j3 != -9223372036854775807L) {
                    if (jM15621 != -9223372036854775807L) {
                        j4 = j3 - jM15621;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.f18129), jMin);
                }
                i3 = c15648Mo17236.f50849;
                i4 = c15648Mo17235.f50849;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.f18132)) {
                }
            }
            if (iM15620 != i2) {
                i = 3;
            }
            this.f18137 = i;
            this.f18126 = iM15620;
        }
        jM15621 = jMo42426 - jMo42425;
        i = this.f18137;
        if (i == 0) {
            this.f18137 = 1;
            this.f18126 = m15620(jElapsedRealtime, jM15621);
            return;
        }
        i2 = this.f18126;
        if (list.isEmpty()) {
            iM28108 = -1;
        } else {
            iM28108 = m28108(((AbstractC14542) C16625.m39339(list)).f78511);
        }
        if (iM28108 != -1) {
            i = ((AbstractC14542) C16625.m39339(list)).f78508;
            i2 = iM28108;
        }
        iM15620 = m15620(jElapsedRealtime, jM15621);
        if (iM15620 != i2) {
            C15648 c15648Mo17237 = mo17235(i2);
            C15648 c15648Mo17238 = mo17235(iM15620);
            jMin = this.f18135;
            if (j3 != -9223372036854775807L) {
                if (jM15621 != -9223372036854775807L) {
                    j4 = j3 - jM15621;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.f18129), jMin);
            }
            i3 = c15648Mo17238.f50849;
            i4 = c15648Mo17237.f50849;
            iM15620 = i3 <= i4 ? i2 : i2;
        }
        if (iM15620 != i2) {
            i = 3;
        }
        this.f18137 = i;
        this.f18126 = iM15620;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final int mo5247() {
        return this.f18126;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ֫ */
    public final int mo5246() {
        return this.f18137;
    }

    @Override // l.AbstractC11164, l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final int mo5248(long j, List list) {
        int i;
        int i2;
        this.f18138.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f18134;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC14542) C16625.m39339(list)).equals(this.f18133))) {
            return list.size();
        }
        this.f18134 = jElapsedRealtime;
        this.f18133 = list.isEmpty() ? null : (AbstractC14542) C16625.m39339(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM19507 = C7116.m19507(((AbstractC14542) list.get(size - 1)).f78512 - j, this.f18128);
        long j3 = this.f18130;
        if (jM19507 >= j3) {
            C15648 c15648Mo17235 = mo17235(m15620(jElapsedRealtime, m15621(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC14542 abstractC14542 = (AbstractC14542) list.get(i3);
                C15648 c15648 = abstractC14542.f78511;
                if (C7116.m19507(abstractC14542.f78512 - j, this.f18128) >= j3 && c15648.f50849 < c15648Mo17235.f50849 && (i = c15648.f50852) != -1 && i <= this.f18136 && (i2 = c15648.f50814) != -1 && i2 <= this.f18125 && i < c15648Mo17235.f50852) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m15621(List list) {
        if (!list.isEmpty()) {
            AbstractC14542 abstractC14542 = (AbstractC14542) C16625.m39339(list);
            long j = abstractC14542.f78512;
            if (j != -9223372036854775807L) {
                long j2 = abstractC14542.f78509;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15620(long j, long j2) {
        long jMo11748 = (long) (((long) (this.f18124.mo11748() * this.f18127)) / this.f18128);
        AbstractC1928 abstractC1928 = this.f18131;
        if (!abstractC1928.isEmpty()) {
            int i = 1;
            while (i < abstractC1928.size() - 1 && ((C7085) abstractC1928.get(i)).f23354 < jMo11748) {
                i++;
            }
            C7085 c7085 = (C7085) abstractC1928.get(i - 1);
            C7085 c7086 = (C7085) abstractC1928.get(i);
            long j3 = c7085.f23354;
            float f = (jMo11748 - j3) / (c7086.f23354 - j3);
            long j4 = c7085.f23353;
            jMo11748 = ((long) (f * (c7086.f23353 - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35158; i3++) {
            if (j == Long.MIN_VALUE || !mo5252(i3, j)) {
                if (mo17235(i3).f50849 <= jMo11748) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m15622(C10418[] c10418Arr) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= c10418Arr.length) {
                break;
            }
            C10418 c10418 = c10418Arr[i2];
            if (c10418 != null && c10418.f33116.length > 1) {
                int i3 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                c22811.m19807(new C7085(0L, 0L));
                arrayList.add(c22811);
            } else {
                arrayList.add(null);
            }
            i2++;
        }
        int length = c10418Arr.length;
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= c10418Arr.length) {
                break;
            }
            C10418 c10419 = c10418Arr[i4];
            if (c10419 != null) {
                int[] iArr = c10419.f33116;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = c10419.f33115.m39194(iArr[i5]).f50849;
                    long[] jArr2 = jArr[i4];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i5] = j2;
                }
                Arrays.sort(jArr[i4]);
            } else {
                jArr[i4] = new long[0];
            }
            i4++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        m15623(arrayList, jArr3);
        InterfaceC18863 interfaceC18863Mo17587 = AbstractC14277.m34689().m12376().mo17587();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length > i) {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    long j3 = jArr6[i8];
                    if (j3 != j) {
                        dLog = Math.log(j3);
                    }
                    dArr[i8] = dLog;
                    i8++;
                }
                int i9 = length2 - 1;
                double d = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d2 = dArr[i10];
                    i10++;
                    interfaceC18863Mo17587.mo46065(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            i = 1;
            j = -1;
        }
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf(interfaceC18863Mo17587.values());
        for (int i11 = 0; i11 < abstractC1928CopyOf.size(); i11++) {
            int iIntValue = ((Integer) abstractC1928CopyOf.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            m15623(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < c10418Arr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        m15623(arrayList, jArr3);
        C22811 c22812 = new C22811();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C22811 c22813 = (C22811) arrayList.get(i14);
            c22812.m19807(c22813 == null ? AbstractC1928.of() : c22813.m51441());
        }
        return c22812.m51441();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15623(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C22811 c22811 = (C22811) arrayList.get(i);
            if (c22811 != null) {
                c22811.m19807(new C7085(j, jArr[i]));
            }
        }
    }
}
