package l;

/* JADX INFO: renamed from: l.ᩳۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C18912 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61360;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f61361;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19113 f61362;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15400 f61363;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7926 f61364;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
    }

    public C18912(C22092 c22092, C3168 c3168, C7926 c7926, C19113 c19113) {
        this.f61361 = c22092;
        this.f61364 = c7926;
        this.f61362 = c19113;
        this.f61363 = ((C7768) c3168.f10272).f25558;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        if (C22092.m49936(this.f61361, (AbstractC11781) c6633.f22152)) {
            C15400 c15400 = this.f61363;
            try {
                C15400 c15400M36876 = c15400.m36876(c6633.f22152);
                this.f61363 = c15400M36876;
                if (c15400M36876.m36878(EnumC19876.EXPORTS)) {
                    super.mo1503(c6633);
                }
            } finally {
                this.f61363 = c15400;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        if (C22092.m49936(this.f61361, c12510.f40168) || c12510.f40168.f38069.f38066 == EnumC13603.f43218) {
            C15400 c15400 = this.f61363;
            try {
                C15400 c15400M36876 = c15400.m36876(c12510.f40168);
                this.f61363 = c15400M36876;
                if (c15400M36876.m36878(EnumC19876.EXPORTS)) {
                    mo5474(c12510.f40170);
                    mo5474(c12510.f40166);
                }
            } finally {
                this.f61363 = c15400;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        if (c7926 == this.f61364 && C22092.m49936(this.f61361, c7926.f26345)) {
            C15400 c15400 = this.f61363;
            try {
                C15400 c15400M36876 = c15400.m36876(c7926.f26345);
                this.f61363 = c15400M36876;
                if (c15400M36876.m36878(EnumC19876.EXPORTS)) {
                    mo5474(c7926.f26341);
                    m52092(c7926.f26343);
                    try {
                        this.f61360 = true;
                        mo5474(c7926.f26348);
                        m52092(c7926.f26347);
                        this.f61360 = false;
                        m52092(c7926.f26344);
                    } catch (Throwable th) {
                        this.f61360 = false;
                        throw th;
                    }
                }
                this.f61363 = c15400;
            } catch (Throwable th2) {
                this.f61363 = c15400;
                throw th2;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        mo5474(c25191.f81425);
        boolean z = this.f61360;
        try {
            this.f61360 = false;
            m52092(c25191.f81424);
        } finally {
            this.f61360 = z;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        AbstractC11781 abstractC11781M28352 = C11239.m28352(c5887);
        if (abstractC11781M28352.f38066 != EnumC13603.f43213 || abstractC11781M28352.f38067.m51067(EnumC21172.TYPEVAR)) {
            return;
        }
        C22092.m49929(this.f61361, c5887, abstractC11781M28352, this.f61362.f61858, this.f61360);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        AbstractC11781 abstractC11781M28352 = C11239.m28352(c23041);
        AbstractC11781 abstractC11781M28353 = C11239.m28352(c23041.f74776);
        if (abstractC11781M28352.f38066 != EnumC13603.f43213 || abstractC11781M28353.f38066 != EnumC13603.f43219) {
            mo5474(c23041.f74776);
            return;
        }
        C22092.m49929(this.f61361, c23041, abstractC11781M28352, this.f61362.f61858, this.f61360);
    }
}
