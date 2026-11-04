package l;

import android.util.Pair;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7181 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23712;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f23713;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21287 f23714;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21287 f23715 = new C21287(3);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f23716;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1793 f23717;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13892 f23718;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f23719;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23721;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jM19754 = m19754();
        long jM19755 = ((C7181) obj).m19754();
        if (jM19754 == jM19755) {
            return 0;
        }
        if (jM19754 == -9223372036854775807L) {
            return 1;
        }
        if (jM19755 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(jM19754, jM19755);
    }

    public C7181(int i, int i2, C21287 c21287, C1793 c1793) {
        this.f23721 = i;
        this.f23713 = i2;
        this.f23714 = c21287;
        this.f23717 = c1793;
        C13892 c13892 = new C13892();
        c13892.m33841();
        this.f23718 = c13892;
        ArrayList arrayList = new ArrayList();
        this.f23720 = arrayList;
        this.f23712 = Integer.MIN_VALUE;
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m19754() {
        C13892 c13892 = this.f23718;
        if (!c13892.m33839()) {
            return -9223372036854775807L;
        }
        return this.f23719 + m19753(this.f23720, c13892.f44054, this.f23716, this.f23713);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19755(InterfaceC22024 interfaceC22024, boolean z) {
        C13892 c13892 = this.f23718;
        if (c13892.m33839()) {
            long j = this.f23719;
            long j2 = c13892.f44054;
            long j3 = this.f23716;
            int i = this.f23713;
            ArrayList arrayList = this.f23720;
            this.f23719 = j + m19753(arrayList, j2, j3, i);
            C21287 c21287 = this.f23714;
            if (z) {
                int i2 = c13892.f44055;
                int i3 = i2 >>> 4;
                if (i2 != 255 && i2 != 240 && (i3 == 8 || i3 == 9)) {
                    c21287.m48503(c13892.f44057);
                    this.f23712 = c13892.f44055;
                    c13892.m33841();
                    return;
                }
            }
            int i4 = c13892.f44057;
            int i5 = c13892.f44053;
            int i6 = i4 - i5;
            c21287.m48503(i5);
            int i7 = c13892.f44055;
            if (i7 != 255 && i7 != 240) {
                c21287.m48503(i6);
                c21287 = this.f23715;
                c21287.m48510(0);
                c13892.m33838(c21287.m48497());
                i6 = c13892.f44059;
            } else if (i7 == 255) {
                long j4 = c13892.f44051;
                if (j4 != -9223372036854775807L) {
                    int i8 = (int) (60000000 / j4);
                    long j5 = this.f23716;
                    if (this.f23721 == 2) {
                        m19757(i8, j5);
                    } else {
                        C0469.m2288((C0469) this.f23717.f6126, i8, j5);
                    }
                }
            }
            int i9 = i6;
            interfaceC22024.mo14381(i9, c21287);
            interfaceC22024.mo14383(this.f23719, 0, i9, 0, null);
            if (arrayList.size() > 1) {
                Pair pair = (Pair) C16625.m39339(arrayList);
                arrayList.clear();
                arrayList.add(pair);
            }
            this.f23712 = c13892.f44055;
            c13892.m33841();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m19758() {
        C13892 c13892 = this.f23718;
        if (c13892.m33839()) {
            return;
        }
        if (c13892.m33840(this.f23712, this.f23714)) {
            this.f23716 += c13892.f44054;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19757(int i, long j) {
        this.f23720.add(Pair.create(Long.valueOf(j), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m19756() {
        this.f23719 = 0L;
        this.f23716 = 0L;
        this.f23712 = Integer.MIN_VALUE;
        this.f23714.m48510(0);
        this.f23715.m48510(0);
        this.f23718.m33841();
        ArrayList arrayList = this.f23720;
        arrayList.clear();
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m19753(ArrayList arrayList, long j, long j2, int i) {
        long jIntValue = 0;
        long j3 = j;
        long j4 = j2;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Pair pair = (Pair) arrayList.get(size);
            long jMin = Math.min(j3, j4 - ((Long) pair.first).longValue());
            C20782.m47568(jMin >= 0);
            jIntValue += (60000000 * jMin) / (((long) ((Integer) pair.second).intValue()) * ((long) i));
            j3 -= jMin;
            j4 -= jMin;
        }
        return ((j3 * 60000000) / (((long) ((Integer) ((Pair) C16625.m39339(arrayList)).second).intValue()) * ((long) i))) + jIntValue;
    }
}
