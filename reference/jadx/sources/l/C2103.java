package l;

/* JADX INFO: renamed from: l.֫ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2103 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f6964;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f6965;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6966;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1072 f6967;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f6968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f6969;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C2103(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m7276();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m7276();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m7276();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m7276();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7277(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7277(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7277(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7277(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40280;
        c7544.m20621(C11797.class, C2103.class);
        return c7544;
    }

    public C2103() {
        this.f6964 = AbstractC9035.m24122();
        this.f6965 = AbstractC9035.m24122();
        this.f6969 = "";
        this.f6968 = "";
        this.f6967 = C1072.m4023();
    }

    public C2103(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f6964 = AbstractC9035.m24122();
        this.f6965 = AbstractC9035.m24122();
        this.f6969 = "";
        this.f6968 = "";
        this.f6967 = C1072.m4023();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7276() {
        super.mo2313clear();
        this.f6966 = 0;
        this.f6964 = AbstractC9035.m24122();
        this.f6965 = AbstractC9035.m24122();
        this.f6969 = "";
        this.f6968 = "";
        this.f6967 = C1072.m4023();
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40256;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C11797.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C11797.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C11797 c11797BuildPartial = buildPartial();
        if (c11797BuildPartial.isInitialized()) {
            return c11797BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c11797BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C11797 c11797BuildPartial = buildPartial();
        if (c11797BuildPartial.isInitialized()) {
            return c11797BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c11797BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C11797 buildPartial() {
        int i = 0;
        C11797 c11797 = new C11797(this, 0);
        int i2 = this.f6966;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                this.f6964.mo23372();
                c11797.f38113 = this.f6964;
            }
            if ((i2 & 2) != 0) {
                this.f6965.mo23372();
                c11797.f38107 = this.f6965;
            }
            if ((i2 & 4) != 0) {
                c11797.f38114 = this.f6969;
                i = 1;
            }
            if ((i2 & 8) != 0) {
                c11797.f38109 = this.f6968;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f6967.mo23372();
                c11797.f38112 = this.f6967;
            }
            c11797.f38111 = i | c11797.f38111;
        }
        onBuilt();
        return c11797;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C11797) {
            m7278((C11797) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C11797) {
            m7278((C11797) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7278(C11797 c11797) {
        if (c11797 == C11797.getDefaultInstance()) {
            return;
        }
        if (!c11797.f38113.isEmpty()) {
            if (this.f6964.isEmpty()) {
                InterfaceC16733 interfaceC16733 = c11797.f38113;
                this.f6964 = interfaceC16733;
                interfaceC16733.mo23372();
                this.f6966 |= 1;
            } else {
                m7275();
                this.f6964.addAll(c11797.f38113);
            }
            onChanged();
        }
        if (!c11797.f38107.isEmpty()) {
            if (this.f6965.isEmpty()) {
                InterfaceC16733 interfaceC16734 = c11797.f38107;
                this.f6965 = interfaceC16734;
                interfaceC16734.mo23372();
                this.f6966 |= 2;
            } else {
                m7274();
                this.f6965.addAll(c11797.f38107);
            }
            onChanged();
        }
        if (c11797.m29642()) {
            this.f6969 = c11797.f38114;
            this.f6966 |= 4;
            onChanged();
        }
        if (c11797.m29643()) {
            this.f6968 = c11797.f38109;
            this.f6966 |= 8;
            onChanged();
        }
        if (!c11797.f38112.isEmpty()) {
            if (this.f6967.isEmpty()) {
                this.f6967 = c11797.f38112;
                this.f6966 |= 16;
            } else {
                if (!this.f6967.mo23371()) {
                    this.f6967 = new C1072(this.f6967);
                }
                this.f6966 |= 16;
                this.f6967.addAll(c11797.f38112);
            }
            onChanged();
        }
        mo2317mergeUnknownFields(c11797.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7277(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            int iMo11892 = abstractC3660.mo11892();
                            m7275();
                            this.f6964.mo39511(iMo11892);
                        } else if (iMo11876 == 10) {
                            int iMo11885 = abstractC3660.mo11885(abstractC3660.mo11891());
                            m7275();
                            while (abstractC3660.mo11897() > 0) {
                                this.f6964.mo39511(abstractC3660.mo11892());
                            }
                            abstractC3660.mo11898(iMo11885);
                        } else if (iMo11876 == 16) {
                            int iMo11893 = abstractC3660.mo11892();
                            m7274();
                            this.f6965.mo39511(iMo11893);
                        } else if (iMo11876 == 18) {
                            int iMo11886 = abstractC3660.mo11885(abstractC3660.mo11891());
                            m7274();
                            while (abstractC3660.mo11897() > 0) {
                                this.f6965.mo39511(abstractC3660.mo11892());
                            }
                            abstractC3660.mo11898(iMo11886);
                        } else if (iMo11876 == 26) {
                            this.f6969 = abstractC3660.mo11890();
                            this.f6966 |= 4;
                        } else if (iMo11876 == 34) {
                            this.f6968 = abstractC3660.mo11890();
                            this.f6966 |= 8;
                        } else if (iMo11876 == 50) {
                            AbstractC17084 abstractC17084Mo11890 = abstractC3660.mo11890();
                            if (!this.f6967.mo23371()) {
                                this.f6967 = new C1072(this.f6967);
                            }
                            this.f6966 |= 16;
                            this.f6967.mo4028(abstractC17084Mo11890);
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                        }
                    }
                    z = true;
                } catch (C20463 e) {
                    throw e.m46971();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m7275() {
        if (!this.f6964.mo23371()) {
            this.f6964 = (InterfaceC16733) AbstractC9035.m24104((InterfaceC15987) this.f6964);
        }
        this.f6966 |= 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m7274() {
        if (!this.f6965.mo23371()) {
            this.f6965 = (InterfaceC16733) AbstractC9035.m24104((InterfaceC15987) this.f6965);
        }
        this.f6966 |= 2;
    }
}
