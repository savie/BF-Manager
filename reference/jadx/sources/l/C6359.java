package l;

import java.util.Calendar;

/* JADX INFO: renamed from: l.ۛ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: WADD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6359 extends AbstractC5362 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C11731 f21424;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6359(C11086 c11086, String str) {
        int i;
        String strM27956 = c11086.m27956();
        String strM27959 = c11086.m27959();
        long jM27953 = c11086.m27953();
        Calendar calendarM27961 = c11086.m27961();
        super(strM27956, str, strM27959, jM27953, calendarM27961 == null ? 0L : calendarM27961.getTimeInMillis(), c11086.m27955());
        int iM27942 = c11086.m27942();
        if (iM27942 == 0) {
            i = 32768;
        } else if (iM27942 != 1) {
            i = iM27942 != 2 ? 0 : 40960;
        } else {
            i = 16384;
        }
        i = c11086.m27952(0, 0) ? i | 256 : i;
        i = c11086.m27952(0, 1) ? i | 128 : i;
        i = c11086.m27952(0, 2) ? i | 64 : i;
        i = c11086.m27952(1, 0) ? i | 32 : i;
        i = c11086.m27952(1, 1) ? i | 16 : i;
        i = c11086.m27952(1, 2) ? i | 8 : i;
        i = c11086.m27952(2, 0) ? i | 4 : i;
        i = c11086.m27952(2, 1) ? i | 2 : i;
        this.f21424 = new C11731(c11086.m27952(2, 2) ? i | 1 : i, c11086.m27958(), c11086.m27946());
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public final C11731 mo7971() {
        return this.f21424;
    }

    @Override // l.AbstractC5362
    /* JADX INFO: renamed from: ۙ */
    public final void mo14868(C11731 c11731) {
        this.f21424 = c11731;
    }
}
