package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩺֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23931 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f77468;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f77469;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5504 f77470;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object f77471;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f77472;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f77473;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C9998 f77474;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f77475;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f77476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f77478;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f77479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f77480;

    public /* synthetic */ C23931(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m53446();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m53446();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m53446();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m53446();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m53448(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m53448(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m53448(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m53448(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40267;
        c7544.m20621(C0064.class, C23931.class);
        return c7544;
    }

    public C23931() {
        this.f77479 = "";
        this.f77472 = 1;
        this.f77476 = 1;
        this.f77471 = "";
        this.f77478 = "";
        this.f77480 = "";
        this.f77468 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m53445();
        }
    }

    public C23931(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f77479 = "";
        this.f77472 = 1;
        this.f77476 = 1;
        this.f77471 = "";
        this.f77478 = "";
        this.f77480 = "";
        this.f77468 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m53445();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53446() {
        super.mo2313clear();
        this.f77477 = 0;
        this.f77479 = "";
        this.f77475 = 0;
        this.f77472 = 1;
        this.f77476 = 1;
        this.f77471 = "";
        this.f77478 = "";
        this.f77480 = "";
        this.f77469 = 0;
        this.f77468 = "";
        this.f77470 = null;
        C9998 c9998 = this.f77474;
        if (c9998 != null) {
            c9998.m25851();
            this.f77474 = null;
        }
        this.f77473 = false;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40249;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C0064.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C0064.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C0064 c0064BuildPartial = buildPartial();
        if (c0064BuildPartial.isInitialized()) {
            return c0064BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c0064BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C0064 c0064BuildPartial = buildPartial();
        if (c0064BuildPartial.isInitialized()) {
            return c0064BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c0064BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C0064 buildPartial() {
        C5504 c5504;
        int i = 0;
        C0064 c0064 = new C0064(this, 0);
        int i2 = this.f77477;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c0064.f958 = this.f77479;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c0064.f952 = this.f77475;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c0064.f955 = this.f77472;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c0064.f959 = this.f77476;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c0064.f954 = this.f77471;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c0064.f961 = this.f77478;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c0064.f963 = this.f77480;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c0064.f957 = this.f77469;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c0064.f951 = this.f77468;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C9998 c9998 = this.f77474;
                if (c9998 == null) {
                    c5504 = this.f77470;
                } else {
                    c5504 = (C5504) c9998.m25854();
                }
                c0064.f953 = c5504;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c0064.f956 = this.f77473;
                i |= 1024;
            }
            c0064.f960 = i | c0064.f960;
        }
        onBuilt();
        return c0064;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C0064) {
            m53447((C0064) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C0064) {
            m53447((C0064) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53447(C0064 c0064) {
        C5504 c5504;
        if (c0064 == C0064.getDefaultInstance()) {
            return;
        }
        if (c0064.hasName()) {
            this.f77479 = c0064.f958;
            this.f77477 |= 1;
            onChanged();
        }
        if (c0064.m1063()) {
            this.f77475 = c0064.m1070();
            this.f77477 |= 2;
            onChanged();
        }
        if (c0064.m1076()) {
            EnumC14233 enumC14233M1077 = c0064.m1077();
            enumC14233M1077.getClass();
            this.f77477 |= 4;
            this.f77472 = enumC14233M1077.getNumber();
            onChanged();
        }
        if (c0064.hasType()) {
            EnumC17963 type = c0064.getType();
            type.getClass();
            this.f77477 |= 8;
            this.f77476 = type.getNumber();
            onChanged();
        }
        if (c0064.m1060()) {
            this.f77471 = c0064.f954;
            this.f77477 |= 16;
            onChanged();
        }
        if (c0064.m1067()) {
            this.f77478 = c0064.f961;
            this.f77477 |= 32;
            onChanged();
        }
        if (c0064.m1073()) {
            this.f77480 = c0064.f963;
            this.f77477 |= 64;
            onChanged();
        }
        if (c0064.m1068()) {
            this.f77469 = c0064.m1071();
            this.f77477 |= 128;
            onChanged();
        }
        if (c0064.m1065()) {
            this.f77468 = c0064.f951;
            this.f77477 |= 256;
            onChanged();
        }
        if (c0064.m1074()) {
            C5504 c5504M1069 = c0064.m1069();
            C9998 c9998 = this.f77474;
            if (c9998 == null) {
                if ((this.f77477 & 512) == 0 || (c5504 = this.f77470) == null || c5504 == C5504.getDefaultInstance()) {
                    this.f77470 = c5504M1069;
                } else {
                    this.f77477 |= 512;
                    onChanged();
                    ((C18709) m53445().m25856()).m43516(c5504M1069);
                }
            } else {
                c9998.m25850(c5504M1069);
            }
            if (this.f77470 != null) {
                this.f77477 |= 512;
                onChanged();
            }
        }
        if (c0064.m1072()) {
            this.f77473 = c0064.m1075();
            this.f77477 |= 1024;
            onChanged();
        }
        mo2317mergeUnknownFields(c0064.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53448(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    switch (iMo11876) {
                        case 0:
                            break;
                        case 10:
                            this.f77479 = abstractC3660.mo11890();
                            this.f77477 |= 1;
                            continue;
                        case 18:
                            this.f77478 = abstractC3660.mo11890();
                            this.f77477 |= 32;
                            continue;
                        case 24:
                            this.f77475 = abstractC3660.mo11892();
                            this.f77477 |= 2;
                            continue;
                        case 32:
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC14233.m34550(iMo11882) == null) {
                                mergeUnknownVarintField(4, iMo11882);
                            } else {
                                this.f77472 = iMo11882;
                                this.f77477 |= 4;
                                continue;
                            }
                            break;
                        case 40:
                            int iMo11883 = abstractC3660.mo11882();
                            if (EnumC17963.m41916(iMo11883) == null) {
                                mergeUnknownVarintField(5, iMo11883);
                            } else {
                                this.f77476 = iMo11883;
                                this.f77477 |= 8;
                                continue;
                            }
                            break;
                        case 50:
                            this.f77471 = abstractC3660.mo11890();
                            this.f77477 |= 16;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            this.f77480 = abstractC3660.mo11890();
                            this.f77477 |= 64;
                            continue;
                        case 66:
                            abstractC3660.mo11881(m53445().m25856(), c24215);
                            this.f77477 |= 512;
                            continue;
                        case 72:
                            this.f77469 = abstractC3660.mo11892();
                            this.f77477 |= 128;
                            continue;
                        case 82:
                            this.f77468 = abstractC3660.mo11890();
                            this.f77477 |= 256;
                            continue;
                        case 136:
                            this.f77473 = abstractC3660.mo11894();
                            this.f77477 |= 1024;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                                break;
                            }
                            break;
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

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        C5504 defaultInstance;
        if ((this.f77477 & 512) == 0) {
            return true;
        }
        C9998 c9998 = this.f77474;
        if (c9998 == null) {
            defaultInstance = this.f77470;
            if (defaultInstance == null) {
                defaultInstance = C5504.getDefaultInstance();
            }
        } else {
            defaultInstance = (C5504) c9998.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m53445() {
        C5504 defaultInstance;
        C9998 c9998 = this.f77474;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f77470;
                if (defaultInstance == null) {
                    defaultInstance = C5504.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5504) c9998.m25853();
            }
            this.f77474 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f77470 = null;
        }
        return this.f77474;
    }
}
