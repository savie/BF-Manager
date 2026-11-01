package l;

/* JADX INFO: renamed from: l.᩻ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23456 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75963;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75965;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C23456(int i) {
        this();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m51701(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m51701(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m51701(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m51701(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46281;
        c6956.m18696(C14284.class, C23456.class);
        return c6956;
    }

    public C23456() {
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC0584 mo2777clear() {
        super.mo2777clear();
        this.f75964 = 0;
        this.f75963 = 0;
        this.f75965 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC3967 mo2777clear() {
        super.mo2777clear();
        this.f75964 = 0;
        this.f75963 = 0;
        this.f75965 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC6977 mo2777clear() {
        super.mo2777clear();
        this.f75964 = 0;
        this.f75963 = 0;
        this.f75965 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC22500 mo2777clear() {
        super.mo2777clear();
        this.f75964 = 0;
        this.f75963 = 0;
        this.f75965 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46273;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C14284.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C14284.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C14284 c14284BuildPartial = buildPartial();
        if (c14284BuildPartial.isInitialized()) {
            return c14284BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c14284BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C14284 c14284BuildPartial = buildPartial();
        if (c14284BuildPartial.isInitialized()) {
            return c14284BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c14284BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C14284 buildPartial() {
        int i = 0;
        C14284 c14284 = new C14284(this, 0);
        int i2 = this.f75964;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c14284.f46814 = this.f75963;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c14284.f46815 = this.f75965;
                i |= 2;
            }
            c14284.f46813 = i | c14284.f46813;
        }
        onBuilt();
        return c14284;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C14284) {
            m51702((C14284) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C14284) {
            m51702((C14284) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51702(C14284 c14284) {
        if (c14284 == C14284.getDefaultInstance()) {
            return;
        }
        if (c14284.m34521()) {
            this.f75963 = c14284.m34518();
            this.f75964 |= 1;
            onChanged();
        }
        if (c14284.m34519()) {
            this.f75965 = c14284.m34520();
            this.f75964 |= 2;
            onChanged();
        }
        mo2781mergeUnknownFields(c14284.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51701(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f75963 = abstractC3262.mo6040();
                            this.f75964 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f75965 = abstractC3262.mo6040();
                            this.f75964 |= 2;
                        } else if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                        }
                    }
                    z = true;
                } catch (C4529 e) {
                    throw e.m12650();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }
}
