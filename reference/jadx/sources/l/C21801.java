package l;

import android.util.Pair;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21801 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f70600;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23648 f70601;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f70602;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2460 f70603 = new C2460(3);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2460 f70604;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18273 f70605;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f70606;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70607;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f70608;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f70609;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jM48564 = m48564();
        long jM48565 = ((C21801) obj).m48564();
        if (jM48564 == jM48565) {
            return 0;
        }
        if (jM48564 == -9223372036854775807L) {
            return 1;
        }
        if (jM48565 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(jM48564, jM48565);
    }

    public C21801(int i, int i2, C2460 c2460, C23648 c23648) {
        this.f70608 = i;
        this.f70602 = i2;
        this.f70604 = c2460;
        this.f70601 = c23648;
        C18273 c18273 = new C18273();
        c18273.m42463();
        this.f70605 = c18273;
        ArrayList arrayList = new ArrayList();
        this.f70607 = arrayList;
        this.f70606 = Integer.MIN_VALUE;
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48564() {
        C18273 c18273 = this.f70605;
        if (!c18273.m42461()) {
            return -9223372036854775807L;
        }
        return this.f70600 + m48563(this.f70607, c18273.f58305, this.f70609, this.f70602);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48565(InterfaceC8011 interfaceC8011, boolean z) {
        C18273 c18273 = this.f70605;
        if (c18273.m42461()) {
            long j = this.f70600;
            long j2 = c18273.f58305;
            long j3 = this.f70609;
            int i = this.f70602;
            ArrayList arrayList = this.f70607;
            this.f70600 = j + m48563(arrayList, j2, j3, i);
            C2460 c2460 = this.f70604;
            if (z) {
                int i2 = c18273.f58300;
                int i3 = i2 >>> 4;
                if (i2 != 255 && i2 != 240 && (i3 == 8 || i3 == 9)) {
                    c2460.m7535(c18273.f58304);
                    this.f70606 = c18273.f58300;
                    c18273.m42463();
                    return;
                }
            }
            int i4 = c18273.f58304;
            int i5 = c18273.f58306;
            int i6 = i4 - i5;
            c2460.m7535(i5);
            int i7 = c18273.f58300;
            if (i7 != 255 && i7 != 240) {
                c2460.m7535(i6);
                c2460 = this.f70603;
                c2460.m7510(0);
                c18273.m42460(c2460.m7518());
                i6 = c18273.f58301;
            } else if (i7 == 255) {
                long j4 = c18273.f58302;
                if (j4 != -9223372036854775807L) {
                    int i8 = (int) (60000000 / j4);
                    long j5 = this.f70609;
                    if (this.f70608 == 2) {
                        m48568(i8, j5);
                    } else {
                        C5573.m15388((C5573) this.f70601.f76574, i8, j5);
                    }
                }
            }
            int i9 = i6;
            interfaceC8011.mo8112(i9, c2460);
            interfaceC8011.mo8114(this.f70600, 0, i9, 0, null);
            if (arrayList.size() > 1) {
                Pair pair = (Pair) C22808.m50475(arrayList);
                arrayList.clear();
                arrayList.add(pair);
            }
            this.f70606 = c18273.f58300;
            c18273.m42463();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48567() {
        C18273 c18273 = this.f70605;
        if (c18273.m42461()) {
            return;
        }
        if (c18273.m42462(this.f70606, this.f70604)) {
            this.f70609 += c18273.f58305;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48568(int i, long j) {
        this.f70607.add(Pair.create(Long.valueOf(j), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m48566() {
        this.f70600 = 0L;
        this.f70609 = 0L;
        this.f70606 = Integer.MIN_VALUE;
        this.f70604.m7510(0);
        this.f70603.m7510(0);
        this.f70605.m42463();
        ArrayList arrayList = this.f70607;
        arrayList.clear();
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m48563(ArrayList arrayList, long j, long j2, int i) {
        long jIntValue = 0;
        long j3 = j;
        long j4 = j2;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Pair pair = (Pair) arrayList.get(size);
            long jMin = Math.min(j3, j4 - ((Long) pair.first).longValue());
            C2023.m6510(jMin >= 0);
            jIntValue += (60000000 * jMin) / (((long) ((Integer) pair.second).intValue()) * ((long) i));
            j3 -= jMin;
            j4 -= jMin;
        }
        return ((j3 * 60000000) / (((long) ((Integer) ((Pair) C22808.m50475(arrayList)).second).intValue()) * ((long) i))) + jIntValue;
    }
}
