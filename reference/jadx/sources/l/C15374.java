package l;

/* JADX INFO: renamed from: l.ܶܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C15374 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8753 f50060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50061;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10164 f50062;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f50063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16826 f50064;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
    }

    public C15374(C21017 c21017, C4603 c4603, C8753 c8753, C10164 c10164) {
        this.f50063 = c21017;
        this.f50060 = c8753;
        this.f50062 = c10164;
        this.f50064 = ((C22990) c4603.f16299).f74715;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        if (C21017.m47234(this.f50063, (AbstractC23903) c23195.f75263)) {
            C16826 c16826 = this.f50064;
            try {
                C16826 c16826M39465 = c16826.m39465(c23195.f75263);
                this.f50064 = c16826M39465;
                if (c16826M39465.m39467(EnumC0597.EXPORTS)) {
                    super.mo3961(c23195);
                }
            } finally {
                this.f50064 = c16826;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        if (C21017.m47234(this.f50063, c6656.f22475) || c6656.f22475.f77448.f77452 == EnumC10477.f35879) {
            C16826 c16826 = this.f50064;
            try {
                C16826 c16826M39465 = c16826.m39465(c6656.f22475);
                this.f50064 = c16826M39465;
                if (c16826M39465.m39467(EnumC0597.EXPORTS)) {
                    mo7248(c6656.f22476);
                    mo7248(c6656.f22477);
                }
            } finally {
                this.f50064 = c16826;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        if (c8753 == this.f50060 && C21017.m47234(this.f50063, c8753.f30086)) {
            C16826 c16826 = this.f50064;
            try {
                C16826 c16826M39465 = c16826.m39465(c8753.f30086);
                this.f50064 = c16826M39465;
                if (c16826M39465.m39467(EnumC0597.EXPORTS)) {
                    mo7248(c8753.f30089);
                    m49334(c8753.f30088);
                    try {
                        this.f50061 = true;
                        mo7248(c8753.f30092);
                        m49334(c8753.f30087);
                        this.f50061 = false;
                        m49334(c8753.f30090);
                    } catch (Throwable th) {
                        this.f50061 = false;
                        throw th;
                    }
                }
                this.f50064 = c16826;
            } catch (Throwable th2) {
                this.f50064 = c16826;
                throw th2;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        mo7248(c11596.f38963);
        boolean z = this.f50061;
        try {
            this.f50061 = false;
            m49334(c11596.f38962);
        } finally {
            this.f50061 = z;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        AbstractC23903 abstractC23903M9471 = C3128.m9471(c3107);
        if (abstractC23903M9471.f77452 != EnumC10477.f35865 || abstractC23903M9471.f77449.m39001(EnumC6617.TYPEVAR)) {
            return;
        }
        C21017.m47221(this.f50063, c3107, abstractC23903M9471, this.f50062.f34721, this.f50061);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        AbstractC23903 abstractC23903M9471 = C3128.m9471(c23570);
        AbstractC23903 abstractC23903M9472 = C3128.m9471(c23570.f76357);
        if (abstractC23903M9471.f77452 != EnumC10477.f35865 || abstractC23903M9472.f77452 != EnumC10477.f35867) {
            mo7248(c23570.f76357);
            return;
        }
        C21017.m47221(this.f50063, c23570, abstractC23903M9471, this.f50062.f34721, this.f50061);
    }
}
