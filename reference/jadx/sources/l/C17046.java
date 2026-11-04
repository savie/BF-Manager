package l;

/* JADX INFO: renamed from: l.ܺᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17046 extends C5224 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC3425 f55688;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1122 f55689;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C24866 f55690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7965 f55691;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40170(C7965 c7965) {
        this.f55691 = c7965;
        this.f55689 = c7965.f12426;
        this.f55688 = null;
        this.f55690 = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m40171(EnumC24309 enumC24309) {
        this.f55688 = null;
        this.f55690 = null;
        m15715(enumC24309);
        C24866 c24866 = this.f55690;
        if (c24866 != null) {
            throw c24866;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3425 m40169() {
        return this.f55688;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m40167(EnumC24309 enumC24309) {
        C7965 c7965 = this.f55691;
        if (c7965.f26465 != EnumC5202.f18162) {
            this.f55690 = C10185.m26296(this.f55689, c7965.f26464, "Incorrect TypeAnnotation \"{0}\" argument: (expected Integer),  \"{1}\"", new Object[]{enumC24309.m54353(), this.f55691.f26465});
            return -1;
        }
        int i = c7965.f26459;
        try {
            c7965.m21671();
            return i;
        } catch (C24866 e) {
            this.f55690 = e;
            return i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m40168() {
        return this.f55690 != null;
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ֫ */
    public final void mo15714(EnumC24309 enumC24309) {
        this.f55689.m32315("Type Param Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C23563(enumC24309, iM40167);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۫ */
    public final void mo15719(EnumC24309 enumC24309) {
        this.f55689.m32315("SuperType Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C25055(enumC24309, iM40167);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩻ */
    public final void mo15724(EnumC24309 enumC24309) {
        this.f55689.m32315("TypeParam Bound Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        int iM40168 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C16103(enumC24309, iM40167, iM40168);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۤ */
    public final void mo15717(EnumC24309 enumC24309) {
        this.f55689.m32315("Empty Target: ", new Object[0]);
        if (m40168()) {
            return;
        }
        this.f55688 = new C15357(enumC24309);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩴ */
    public final void mo15721(EnumC24309 enumC24309) {
        this.f55689.m32315("MethodParam Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C13120(enumC24309, iM40167);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۚ */
    public final void mo15716(EnumC24309 enumC24309) {
        this.f55689.m32315("Throws Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C16849(enumC24309, iM40167);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩸ */
    public final void mo15723(EnumC24309 enumC24309) {
        this.f55689.m32315("LocalVar Target: ", new Object[0]);
        C1934 c1934 = new C1934(enumC24309, 0);
        this.f55688 = c1934;
        do {
            C7965 c7965 = this.f55691;
            EnumC5202 enumC5202 = c7965.f26465;
            if (enumC5202 == EnumC5202.f18303 || enumC5202 == EnumC5202.f18314) {
                return;
            }
            try {
                c7965.m21679(EnumC5202.f18213);
            } catch (C24866 e) {
                this.f55690 = e;
            }
            if (m40168()) {
                return;
            }
            int iM40167 = m40167(enumC24309);
            if (m40168()) {
                return;
            }
            int iM40168 = m40167(enumC24309);
            if (m40168()) {
                return;
            }
            c1934.m6634(iM40167, iM40168, m40167(enumC24309));
            try {
                this.f55691.m21679(EnumC5202.f18314);
            } catch (C24866 e2) {
                this.f55690 = e2;
            }
        } while (!m40168());
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15722(EnumC24309 enumC24309) {
        this.f55689.m32315("Catch Target: ", new Object[0]);
        this.f55688 = new C19833(enumC24309, m40167(enumC24309));
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ܳ */
    public final void mo15720(EnumC24309 enumC24309) {
        this.f55689.m32315("Offset Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C11628(enumC24309, iM40167);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۧ */
    public final void mo15718(EnumC24309 enumC24309) {
        this.f55689.m32315("TypeArg Target: ", new Object[0]);
        int iM40167 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        int iM40168 = m40167(enumC24309);
        if (m40168()) {
            return;
        }
        this.f55688 = new C17595(enumC24309, iM40167, iM40168);
    }
}
