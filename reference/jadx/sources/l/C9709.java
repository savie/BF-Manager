package l;

import java.util.Calendar;

/* JADX INFO: renamed from: l.ۡ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: WADD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9709 extends AbstractC20042 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C9097 f31344;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9709(C17388 c17388, String str) {
        int i;
        String strM40834 = c17388.m40834();
        String strM40841 = c17388.m40841();
        long jM40839 = c17388.m40839();
        Calendar calendarM40838 = c17388.m40838();
        super(strM40834, str, strM40841, jM40839, calendarM40838 == null ? 0L : calendarM40838.getTimeInMillis(), c17388.m40836());
        int iM40837 = c17388.m40837();
        if (iM40837 == 0) {
            i = 32768;
        } else if (iM40837 != 1) {
            i = iM40837 != 2 ? 0 : 40960;
        } else {
            i = 16384;
        }
        i = c17388.m40832(0, 0) ? i | 256 : i;
        i = c17388.m40832(0, 1) ? i | 128 : i;
        i = c17388.m40832(0, 2) ? i | 64 : i;
        i = c17388.m40832(1, 0) ? i | 32 : i;
        i = c17388.m40832(1, 1) ? i | 16 : i;
        i = c17388.m40832(1, 2) ? i | 8 : i;
        i = c17388.m40832(2, 0) ? i | 4 : i;
        i = c17388.m40832(2, 1) ? i | 2 : i;
        this.f31344 = new C9097(c17388.m40832(2, 2) ? i | 1 : i, c17388.m40833(), c17388.m40826());
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷ */
    public final C9097 mo5155() {
        return this.f31344;
    }

    @Override // l.AbstractC20042
    /* JADX INFO: renamed from: ۙ */
    public final void mo5154(C9097 c9097) {
        this.f31344 = c9097;
    }
}
