package l;

/* JADX INFO: renamed from: l.᩸ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes.dex */
public final class C22715 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11526 f73713;

    public C22715(C11526 c11526) {
        this.f73713 = c11526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5056 m51223(C5056 c5056) {
        C5056 c5056M15292 = C5056.m15292(c5056.mo37098());
        C15496 c15496M15302 = c5056.m15302();
        C18723.m43536(new C21969(this, c15496M15302, c5056M15292.m15302()), c15496M15302);
        c5056M15292.m15301(c5056.m15300().clone());
        return c5056M15292;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10780 m51221(C22715 c22715, C15496 c15496) {
        C11526 c11526 = c22715.f73713;
        String strM37066 = c15496.m37066();
        C10363 c10363 = new C10363();
        C15496 c15497 = new C15496(C6023.m17487(strM37066, C20193.f64826), c15496.mo37098(), c10363);
        int i = 0;
        for (C8127 c8127 : c15496.mo37069()) {
            if (c11526.m29025(strM37066, c15496, c8127)) {
                c10363.m26653(c8127);
            } else {
                i++;
            }
        }
        c10363.m26654(c11526.m29019(strM37066));
        if (c15496.m41537().m47387()) {
            c15496.m41537().m47385(c15497, true);
        }
        if (c15496.m37067().m47387()) {
            c15496.m37067().m47385(c15497, false);
        }
        C10780 c10780 = new C10780();
        c10780.f34210 = c15497;
        c10780.f34211 = i;
        return c10780;
    }
}
