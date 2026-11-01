package l;

/* JADX INFO: renamed from: l.ܳ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14213 extends C5487 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6055 f46600;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18111 f46601;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9315 f46602;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12842 f46603;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34308(C12842 c12842) {
        this.f46603 = c12842;
        this.f46601 = c12842.f16198;
        this.f46602 = null;
        this.f46600 = null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34310(EnumC2300 enumC2300) {
        this.f46602 = null;
        this.f46600 = null;
        m15162(enumC2300);
        C6055 c6055 = this.f46600;
        if (c6055 != null) {
            throw c6055;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9315 m34309() {
        return this.f46602;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m34307(EnumC2300 enumC2300) {
        C12842 c12842 = this.f46603;
        if (c12842.f42721 != EnumC20934.f68154) {
            this.f46600 = C7997.m21056(this.f46601, c12842.f42728, "Incorrect TypeAnnotation \"{0}\" argument: (expected Integer),  \"{1}\"", new Object[]{enumC2300.m7039(), this.f46603.f42721});
            return -1;
        }
        int i = c12842.f42726;
        try {
            c12842.m31840();
            return i;
        } catch (C6055 e) {
            this.f46600 = e;
            return i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m34306() {
        return this.f46600 != null;
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۘ */
    public final void mo15161(EnumC2300 enumC2300) {
        this.f46601.m2146("Type Param Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C1552(enumC2300, iM34307);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ֨ */
    public final void mo15159(EnumC2300 enumC2300) {
        this.f46601.m2146("SuperType Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C5786(enumC2300, iM34307);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ᩺ */
    public final void mo15169(EnumC2300 enumC2300) {
        this.f46601.m2146("TypeParam Bound Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        int iM34308 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C14254(enumC2300, iM34307, iM34308);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۨ */
    public final void mo15165(EnumC2300 enumC2300) {
        this.f46601.m2146("Empty Target: ", new Object[0]);
        if (m34306()) {
            return;
        }
        this.f46602 = new C15665(enumC2300);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۚ */
    public final void mo15163(EnumC2300 enumC2300) {
        this.f46601.m2146("MethodParam Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C19898(enumC2300, iM34307);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۬ */
    public final void mo15166(EnumC2300 enumC2300) {
        this.f46601.m2146("Throws Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C10726(enumC2300, iM34307);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۖ */
    public final void mo15160(EnumC2300 enumC2300) {
        this.f46601.m2146("LocalVar Target: ", new Object[0]);
        C12137 c12137 = new C12137(enumC2300, 0);
        this.f46602 = c12137;
        do {
            C12842 c12842 = this.f46603;
            EnumC20934 enumC20934 = c12842.f42721;
            if (enumC20934 == EnumC20934.f68179 || enumC20934 == EnumC20934.f68195) {
                return;
            }
            try {
                c12842.m31848(EnumC20934.f68039);
            } catch (C6055 e) {
                this.f46600 = e;
            }
            if (m34306()) {
                return;
            }
            int iM34307 = m34307(enumC2300);
            if (m34306()) {
                return;
            }
            int iM34308 = m34307(enumC2300);
            if (m34306()) {
                return;
            }
            c12137.m30211(iM34307, iM34308, m34307(enumC2300));
            try {
                this.f46603.m31848(EnumC20934.f68195);
            } catch (C6055 e2) {
                this.f46600 = e2;
            }
        } while (!m34306());
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ܰ */
    public final void mo15167(EnumC2300 enumC2300) {
        this.f46601.m2146("Catch Target: ", new Object[0]);
        this.f46602 = new C20603(enumC2300, m34307(enumC2300));
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ᩹ */
    public final void mo15168(EnumC2300 enumC2300) {
        this.f46601.m2146("Offset Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C17075(enumC2300, iM34307);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۜ */
    public final void mo15164(EnumC2300 enumC2300) {
        this.f46601.m2146("TypeArg Target: ", new Object[0]);
        int iM34307 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        int iM34308 = m34307(enumC2300);
        if (m34306()) {
            return;
        }
        this.f46602 = new C23426(enumC2300, iM34307, iM34308);
    }
}
