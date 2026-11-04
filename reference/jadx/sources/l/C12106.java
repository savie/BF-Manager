package l;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.ۨۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12106 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        Calendar calendar = (Calendar) obj;
        return new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15748(long[] jArr) {
        long j = jArr[0];
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = jArr[1];
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        long j3 = jArr[2];
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        long j4 = jArr[3];
        int i4 = (int) j4;
        if (j4 != i4) {
            throw new ArithmeticException();
        }
        long j5 = jArr[4];
        int i5 = (int) j5;
        if (j5 != i5) {
            throw new ArithmeticException();
        }
        long j6 = jArr[5];
        int i6 = (int) j6;
        if (j6 == i6) {
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }
        throw new ArithmeticException();
    }
}
