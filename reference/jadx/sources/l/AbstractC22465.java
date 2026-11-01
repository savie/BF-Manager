package l;

/* JADX INFO: renamed from: l.᩹ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8IO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22465 implements InterfaceC10161 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0282 f73340 = new C0282();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36794(long j, int i, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49966(C13689 c13689) {
        mo25816(AbstractC22433.of((Object) c13689));
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo25841(int i) {
        return mo25850().m43075(i);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۚ */
    public final void mo25822() {
        mo25820(true);
    }

    @Override // l.InterfaceC10161
    public final void pause() {
        mo25820(false);
    }

    @Override // l.InterfaceC10161
    public final boolean isPlaying() {
        return mo25808() == 3 && mo25806() && mo25849() == 0;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩺ */
    public final void mo25855() {
        mo36794(-9223372036854775807L, mo25810(), false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۖۙ */
    public final void mo25809() {
        long currentPosition = getCurrentPosition() + (-mo25854());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo36794(Math.max(currentPosition, 0L), mo25810(), false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۨۙ */
    public final void mo25833() {
        long currentPosition = getCurrentPosition() + mo25807();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo36794(Math.max(currentPosition, 0L), mo25810(), false);
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܶ */
    public final void mo25844() {
        int iMo24008;
        int iMo24009;
        if (mo25828().m38828() || mo25811()) {
            m49963(7);
            return;
        }
        boolean zM49968 = m49968();
        if (m49967() && !m49969()) {
            if (!zM49968) {
                m49963(7);
                return;
            }
            AbstractC16511 abstractC16511Mo25828 = mo25828();
            if (abstractC16511Mo25828.m38828()) {
                iMo24009 = -1;
            } else {
                int iMo25810 = mo25810();
                int iMo25835 = mo25835();
                if (iMo25835 == 1) {
                    iMo25835 = 0;
                }
                iMo24009 = abstractC16511Mo25828.mo24008(iMo25810, iMo25835, mo25821());
            }
            if (iMo24009 == -1) {
                m49963(7);
                return;
            } else if (iMo24009 == mo25810()) {
                mo36794(-9223372036854775807L, mo25810(), true);
                return;
            } else {
                mo36794(-9223372036854775807L, iMo24009, false);
                return;
            }
        }
        if (!zM49968 || getCurrentPosition() > mo25845()) {
            mo36794(0L, mo25810(), false);
            return;
        }
        AbstractC16511 abstractC16511Mo25829 = mo25828();
        if (abstractC16511Mo25829.m38828()) {
            iMo24008 = -1;
        } else {
            int iMo25811 = mo25810();
            int iMo25836 = mo25835();
            if (iMo25836 == 1) {
                iMo25836 = 0;
            }
            iMo24008 = abstractC16511Mo25829.mo24008(iMo25811, iMo25836, mo25821());
        }
        if (iMo24008 == -1) {
            m49963(7);
        } else if (iMo24008 == mo25810()) {
            mo36794(-9223372036854775807L, mo25810(), true);
        } else {
            mo36794(-9223372036854775807L, iMo24008, false);
        }
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25851() {
        int iMo24006;
        if (mo25828().m38828() || mo25811()) {
            m49963(9);
            return;
        }
        if (!m49964()) {
            if (!m49967() || !m49965()) {
                m49963(9);
                return;
            } else {
                mo36794(-9223372036854775807L, mo25810(), false);
                return;
            }
        }
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            iMo24006 = -1;
        } else {
            int iMo25810 = mo25810();
            int iMo25835 = mo25835();
            if (iMo25835 == 1) {
                iMo25835 = 0;
            }
            iMo24006 = abstractC16511Mo25828.mo24006(iMo25810, iMo25835, mo25821());
        }
        if (iMo24006 == -1) {
            m49963(9);
        } else if (iMo24006 != mo25810()) {
            mo36794(-9223372036854775807L, iMo24006, false);
        } else {
            mo36794(-9223372036854775807L, mo25810(), true);
        }
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49964() {
        int iMo24006;
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            iMo24006 = -1;
        } else {
            int iMo25810 = mo25810();
            int iMo25835 = mo25835();
            if (iMo25835 == 1) {
                iMo25835 = 0;
            }
            iMo24006 = abstractC16511Mo25828.mo24006(iMo25810, iMo25835, mo25821());
        }
        return iMo24006 != -1;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49968() {
        int iMo24008;
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            iMo24008 = -1;
        } else {
            int iMo25810 = mo25810();
            int iMo25835 = mo25835();
            if (iMo25835 == 1) {
                iMo25835 = 0;
            }
            iMo24008 = abstractC16511Mo25828.mo24008(iMo25810, iMo25835, mo25821());
        }
        return iMo24008 != -1;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩹ */
    public final C13689 mo25853() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            return null;
        }
        return abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).f1594;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49965() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        return !abstractC16511Mo25828.m38828() && abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).f1583;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49967() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        return !abstractC16511Mo25828.m38828() && abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).m1798();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49969() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        return !abstractC16511Mo25828.m38828() && abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).f1579;
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ܿ */
    public final long mo25846() {
        AbstractC16511 abstractC16511Mo25828 = mo25828();
        if (abstractC16511Mo25828.m38828()) {
            return -9223372036854775807L;
        }
        return C17983.m41856(abstractC16511Mo25828.mo14810(mo25810(), this.f73340, 0L).f1588);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m49963(int i) {
        mo36794(-9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC10161
    public final void seekTo(long j) {
        mo36794(j, mo25810(), false);
    }
}
