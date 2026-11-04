package l;

/* JADX INFO: renamed from: l.۟ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7971 implements InterfaceC19533 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11328 f26501 = new C11328();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo21693(long j, int i, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21694(C14902 c14902) {
        mo23549(AbstractC1928.of((Object) c14902));
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo21703(int i) {
        return mo23573().m14423(i);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo21702() {
        mo23554(true);
    }

    @Override // l.InterfaceC19533
    public final void pause() {
        mo23554(false);
    }

    @Override // l.InterfaceC19533
    public final boolean isPlaying() {
        return mo23580() == 3 && mo23570() && mo23572() == 0;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo21705() {
        mo21693(-9223372036854775807L, mo23566(), false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21704() {
        long currentPosition = getCurrentPosition() + (-mo23567());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo21693(Math.max(currentPosition, 0L), mo23566(), false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void mo21696() {
        long currentPosition = getCurrentPosition() + mo23560();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo21693(Math.max(currentPosition, 0L), mo23566(), false);
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo21700() {
        int iMo15541;
        int iMo15542;
        if (mo23565().m55264() || mo23542()) {
            m21690(7);
            return;
        }
        boolean zM21695 = m21695();
        if (m21697() && !m21706()) {
            if (!zM21695) {
                m21690(7);
                return;
            }
            AbstractC24755 abstractC24755Mo23565 = mo23565();
            if (abstractC24755Mo23565.m55264()) {
                iMo15542 = -1;
            } else {
                int iMo23566 = mo23566();
                int iMo23556 = mo23556();
                if (iMo23556 == 1) {
                    iMo23556 = 0;
                }
                iMo15542 = abstractC24755Mo23565.mo15541(iMo23566, iMo23556, mo23555());
            }
            if (iMo15542 == -1) {
                m21690(7);
                return;
            } else if (iMo15542 == mo23566()) {
                mo21693(-9223372036854775807L, mo23566(), true);
                return;
            } else {
                mo21693(-9223372036854775807L, iMo15542, false);
                return;
            }
        }
        if (!zM21695 || getCurrentPosition() > mo23540()) {
            mo21693(0L, mo23566(), false);
            return;
        }
        AbstractC24755 abstractC24755Mo23566 = mo23565();
        if (abstractC24755Mo23566.m55264()) {
            iMo15541 = -1;
        } else {
            int iMo23567 = mo23566();
            int iMo23557 = mo23556();
            if (iMo23557 == 1) {
                iMo23557 = 0;
            }
            iMo15541 = abstractC24755Mo23566.mo15541(iMo23567, iMo23557, mo23555());
        }
        if (iMo15541 == -1) {
            m21690(7);
        } else if (iMo15541 == mo23566()) {
            mo21693(-9223372036854775807L, mo23566(), true);
        } else {
            mo21693(-9223372036854775807L, iMo15541, false);
        }
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo21692() {
        int iMo15533;
        if (mo23565().m55264() || mo23542()) {
            m21690(9);
            return;
        }
        if (!m21698()) {
            if (!m21697() || !m21691()) {
                m21690(9);
                return;
            } else {
                mo21693(-9223372036854775807L, mo23566(), false);
                return;
            }
        }
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            iMo15533 = -1;
        } else {
            int iMo23566 = mo23566();
            int iMo23556 = mo23556();
            if (iMo23556 == 1) {
                iMo23556 = 0;
            }
            iMo15533 = abstractC24755Mo23565.mo15533(iMo23566, iMo23556, mo23555());
        }
        if (iMo15533 == -1) {
            m21690(9);
        } else if (iMo15533 != mo23566()) {
            mo21693(-9223372036854775807L, iMo15533, false);
        } else {
            mo21693(-9223372036854775807L, mo23566(), true);
        }
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21698() {
        int iMo15533;
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            iMo15533 = -1;
        } else {
            int iMo23566 = mo23566();
            int iMo23556 = mo23556();
            if (iMo23556 == 1) {
                iMo23556 = 0;
            }
            iMo15533 = abstractC24755Mo23565.mo15533(iMo23566, iMo23556, mo23555());
        }
        return iMo15533 != -1;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21695() {
        int iMo15541;
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            iMo15541 = -1;
        } else {
            int iMo23566 = mo23566();
            int iMo23556 = mo23556();
            if (iMo23556 == 1) {
                iMo23556 = 0;
            }
            iMo15541 = abstractC24755Mo23565.mo15541(iMo23566, iMo23556, mo23555());
        }
        return iMo15541 != -1;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14902 mo21699() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            return null;
        }
        return abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).f35699;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21691() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        return !abstractC24755Mo23565.m55264() && abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).f35695;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21697() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        return !abstractC24755Mo23565.m55264() && abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).m28620();
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21706() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        return !abstractC24755Mo23565.m55264() && abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).f35690;
    }

    @Override // l.InterfaceC19533
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo21701() {
        AbstractC24755 abstractC24755Mo23565 = mo23565();
        if (abstractC24755Mo23565.m55264()) {
            return -9223372036854775807L;
        }
        return C7116.m19506(abstractC24755Mo23565.mo1592(mo23566(), this.f26501, 0L).f35696);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m21690(int i) {
        mo21693(-9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC19533
    public final void seekTo(long j) {
        mo21693(j, mo23566(), false);
    }
}
