package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18470 extends AbstractC19176 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f58849;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17142 f58850;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f58851;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f58852;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f58853;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f58854;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f58855;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f58856;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AbstractC13532 f58857;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f58858;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f58859;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long f58860;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f58861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f58862;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22217 f58863;

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ܰ */
    public final Object mo17796() {
        return null;
    }

    public C18470(C17216 c17216, int[] iArr, InterfaceC17142 interfaceC17142, long j, long j2, long j3, AbstractC22433 abstractC22433) {
        super(c17216, iArr);
        if (j3 < j) {
            C0303.m1848("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f58850 = interfaceC17142;
        this.f58860 = j * 1000;
        this.f58858 = j2 * 1000;
        this.f58854 = j3 * 1000;
        this.f58853 = 1279;
        this.f58859 = 719;
        this.f58856 = 0.7f;
        this.f58851 = 0.75f;
        this.f58849 = AbstractC22433.copyOf((Collection) abstractC22433);
        this.f58863 = InterfaceC11593.f38960;
        this.f58855 = 1.0f;
        this.f58852 = 0;
        this.f58862 = -9223372036854775807L;
    }

    @Override // l.AbstractC19176, l.InterfaceC6558
    /* JADX INFO: renamed from: ᩹ */
    public final void mo17798() {
        this.f58862 = -9223372036854775807L;
        this.f58857 = null;
    }

    @Override // l.AbstractC19176, l.InterfaceC6558
    /* JADX INFO: renamed from: ۖ */
    public final void mo17784() {
        this.f58857 = null;
    }

    @Override // l.AbstractC19176, l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final void mo17788(float f) {
        this.f58855 = f;
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
    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final void mo17789(long j, long j2, long j3, List list, InterfaceC2241[] interfaceC2241Arr) {
        long jM42829;
        long jMo6885;
        long jMo6884;
        int i;
        int i2;
        int iM44003;
        int iM42828;
        long jMin;
        int i3;
        int i4;
        long j4;
        this.f58863.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.f58861;
        if (i5 < interfaceC2241Arr.length && interfaceC2241Arr[i5].next()) {
            InterfaceC2241 interfaceC2241 = interfaceC2241Arr[this.f58861];
            jMo6885 = interfaceC2241.mo6885();
            jMo6884 = interfaceC2241.mo6884();
        } else {
            int length = interfaceC2241Arr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    InterfaceC2241 interfaceC2242 = interfaceC2241Arr[i6];
                    if (interfaceC2242.next()) {
                        jMo6885 = interfaceC2242.mo6885();
                        jMo6884 = interfaceC2242.mo6884();
                    } else {
                        i6++;
                    }
                } else {
                    jM42829 = m42829(list);
                    break;
                }
            }
            i = this.f58852;
            if (i == 0) {
                this.f58852 = 1;
                this.f58861 = m42828(jElapsedRealtime, jM42829);
                return;
            }
            i2 = this.f58861;
            if (list.isEmpty()) {
                iM44003 = -1;
            } else {
                iM44003 = m44003(((AbstractC13532) C22808.m50475(list)).f12017);
            }
            if (iM44003 != -1) {
                i = ((AbstractC13532) C22808.m50475(list)).f12015;
                i2 = iM44003;
            }
            iM42828 = m42828(jElapsedRealtime, jM42829);
            if (iM42828 != i2 && !mo17791(i2, jElapsedRealtime)) {
                C7648 c7648Mo37958 = mo37958(i2);
                C7648 c7648Mo37959 = mo37958(iM42828);
                jMin = this.f58860;
                if (j3 != -9223372036854775807L) {
                    if (jM42829 != -9223372036854775807L) {
                        j4 = j3 - jM42829;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.f58851), jMin);
                }
                i3 = c7648Mo37959.f25242;
                i4 = c7648Mo37958.f25242;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.f58858)) {
                }
            }
            if (iM42828 != i2) {
                i = 3;
            }
            this.f58852 = i;
            this.f58861 = iM42828;
        }
        jM42829 = jMo6885 - jMo6884;
        i = this.f58852;
        if (i == 0) {
            this.f58852 = 1;
            this.f58861 = m42828(jElapsedRealtime, jM42829);
            return;
        }
        i2 = this.f58861;
        if (list.isEmpty()) {
            iM44003 = -1;
        } else {
            iM44003 = m44003(((AbstractC13532) C22808.m50475(list)).f12017);
        }
        if (iM44003 != -1) {
            i = ((AbstractC13532) C22808.m50475(list)).f12015;
            i2 = iM44003;
        }
        iM42828 = m42828(jElapsedRealtime, jM42829);
        if (iM42828 != i2) {
            C7648 c7648Mo379510 = mo37958(i2);
            C7648 c7648Mo379511 = mo37958(iM42828);
            jMin = this.f58860;
            if (j3 != -9223372036854775807L) {
                if (jM42829 != -9223372036854775807L) {
                    j4 = j3 - jM42829;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.f58851), jMin);
            }
            i3 = c7648Mo379511.f25242;
            i4 = c7648Mo379510.f25242;
            iM42828 = i3 <= i4 ? i2 : i2;
        }
        if (iM42828 != i2) {
            i = 3;
        }
        this.f58852 = i;
        this.f58861 = iM42828;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final int mo17786() {
        return this.f58861;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۘ */
    public final int mo17785() {
        return this.f58852;
    }

    @Override // l.AbstractC19176, l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final int mo17787(long j, List list) {
        int i;
        int i2;
        this.f58863.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f58862;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC13532) C22808.m50475(list)).equals(this.f58857))) {
            return list.size();
        }
        this.f58862 = jElapsedRealtime;
        this.f58857 = list.isEmpty() ? null : (AbstractC13532) C22808.m50475(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM41857 = C17983.m41857(((AbstractC13532) list.get(size - 1)).f12013 - j, this.f58855);
        long j3 = this.f58854;
        if (jM41857 >= j3) {
            C7648 c7648Mo37958 = mo37958(m42828(jElapsedRealtime, m42829(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC13532 abstractC13532 = (AbstractC13532) list.get(i3);
                C7648 c7648 = abstractC13532.f12017;
                if (C17983.m41857(abstractC13532.f12013 - j, this.f58855) >= j3 && c7648.f25242 < c7648Mo37958.f25242 && (i = c7648.f25253) != -1 && i <= this.f58859 && (i2 = c7648.f25246) != -1 && i2 <= this.f58853 && i < c7648Mo37958.f25253) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42829(List list) {
        if (!list.isEmpty()) {
            AbstractC13532 abstractC13532 = (AbstractC13532) C22808.m50475(list);
            long j = abstractC13532.f12013;
            if (j != -9223372036854775807L) {
                long j2 = abstractC13532.f12014;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m42828(long j, long j2) {
        long jMo34558 = (long) (((long) (this.f58850.mo34558() * this.f58856)) / this.f58855);
        AbstractC22433 abstractC22433 = this.f58849;
        if (!abstractC22433.isEmpty()) {
            int i = 1;
            while (i < abstractC22433.size() - 1 && ((C21292) abstractC22433.get(i)).f69288 < jMo34558) {
                i++;
            }
            C21292 c21292 = (C21292) abstractC22433.get(i - 1);
            C21292 c21293 = (C21292) abstractC22433.get(i);
            long j3 = c21292.f69288;
            float f = (jMo34558 - j3) / (c21293.f69288 - j3);
            long j4 = c21292.f69287;
            jMo34558 = ((long) (f * (c21293.f69287 - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f61925; i3++) {
            if (j == Long.MIN_VALUE || !mo17791(i3, j)) {
                if (mo37958(i3).f25242 <= jMo34558) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m42830(C3735[] c3735Arr) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= c3735Arr.length) {
                break;
            }
            C3735 c3735 = c3735Arr[i2];
            if (c3735 != null && c3735.f13564.length > 1) {
                int i3 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                c4793.m52163(new C21292(0L, 0L));
                arrayList.add(c4793);
            } else {
                arrayList.add(null);
            }
            i2++;
        }
        int length = c3735Arr.length;
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= c3735Arr.length) {
                break;
            }
            C3735 c3736 = c3735Arr[i4];
            if (c3736 != null) {
                int[] iArr = c3736.f13564;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = c3736.f13563.m40159(iArr[i5]).f25242;
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
        m42831(arrayList, jArr3);
        InterfaceC12225 interfaceC12225Mo37809 = AbstractC0374.m2106().m45496().mo37809();
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
                    interfaceC12225Mo37809.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            i = 1;
            j = -1;
        }
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf(interfaceC12225Mo37809.values());
        for (int i11 = 0; i11 < abstractC22433CopyOf.size(); i11++) {
            int iIntValue = ((Integer) abstractC22433CopyOf.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            m42831(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < c3735Arr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        m42831(arrayList, jArr3);
        C4793 c4794 = new C4793();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C4793 c4795 = (C4793) arrayList.get(i14);
            c4794.m52163(c4795 == null ? AbstractC22433.of() : c4795.m13309());
        }
        return c4794.m13309();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42831(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C4793 c4793 = (C4793) arrayList.get(i);
            if (c4793 != null) {
                c4793.m52163(new C21292(j, jArr[i]));
            }
        }
    }
}
