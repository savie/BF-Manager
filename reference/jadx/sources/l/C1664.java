package l;

import android.util.SparseArray;
import java.util.Calendar;

/* JADX INFO: renamed from: l.֫ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1MH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1664 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5765;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f5766;

    public String toString() {
        switch (this.f5765) {
            case 0:
                return String.valueOf(this.f5766);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m5989(long j) {
        long[] jArr = (long[]) this.f5766;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j > jArr[i]) {
                return i;
            }
        }
        return length;
    }

    public C1664(int i) {
        this.f5765 = i;
        switch (i) {
            case 2:
                long jCurrentTimeMillis = System.currentTimeMillis();
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis();
                calendar.add(10, -24);
                this.f5766 = new long[]{jCurrentTimeMillis - 600000, jCurrentTimeMillis - 3600000, timeInMillis, calendar.getTimeInMillis(), jCurrentTimeMillis - 604800000, jCurrentTimeMillis - 2592000000L};
                break;
            default:
                this.f5766 = new SparseArray();
                break;
        }
    }

    public C1664(C16579 c16579) {
        this.f5765 = 0;
        this.f5766 = c16579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1150 m5991(int i) {
        SparseArray sparseArray = (SparseArray) this.f5766;
        C1150 c1150 = (C1150) sparseArray.get(i);
        if (c1150 != null) {
            return c1150;
        }
        C1150 c1151 = new C1150(9223372036854775806L);
        sparseArray.put(i, c1151);
        return c1151;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m5992() {
        ((SparseArray) this.f5766).clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m5990() {
        return this.f5766;
    }
}
