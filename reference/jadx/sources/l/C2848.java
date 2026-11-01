package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2848 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f10763;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f10764;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f10765;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f10766;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Object f10767;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10768;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f10769;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12727 f10770;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f10771;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f10772;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f10773;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f10774;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15135 f10775;

    public /* synthetic */ C2848(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m8615();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m8615();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m8615();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m8615();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m8616(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m8616(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m8616(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m8616(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46326;
        c6956.m18696(C4259.class, C2848.class);
        return c6956;
    }

    public C2848() {
        this.f10773 = "";
        this.f10769 = 1;
        this.f10765 = 1;
        this.f10767 = "";
        this.f10763 = "";
        this.f10774 = "";
        this.f10772 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m8614();
        }
    }

    public C2848(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f10773 = "";
        this.f10769 = 1;
        this.f10765 = 1;
        this.f10767 = "";
        this.f10763 = "";
        this.f10774 = "";
        this.f10772 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m8614();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8615() {
        super.mo2777clear();
        this.f10771 = 0;
        this.f10773 = "";
        this.f10766 = 0;
        this.f10769 = 1;
        this.f10765 = 1;
        this.f10767 = "";
        this.f10763 = "";
        this.f10774 = "";
        this.f10768 = 0;
        this.f10772 = "";
        this.f10770 = null;
        C15135 c15135 = this.f10775;
        if (c15135 != null) {
            c15135.m36296();
            this.f10775 = null;
        }
        this.f10764 = false;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46292;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C4259.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C4259.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C4259 c4259BuildPartial = buildPartial();
        if (c4259BuildPartial.isInitialized()) {
            return c4259BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4259BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C4259 c4259BuildPartial = buildPartial();
        if (c4259BuildPartial.isInitialized()) {
            return c4259BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4259BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C4259 buildPartial() {
        C12727 c12727;
        int i = 0;
        C4259 c4259 = new C4259(this, 0);
        int i2 = this.f10771;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4259.f15378 = this.f10773;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c4259.f15380 = this.f10766;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c4259.f15381 = this.f10769;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c4259.f15377 = this.f10765;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c4259.f15379 = this.f10767;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c4259.f15375 = this.f10763;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c4259.f15386 = this.f10774;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c4259.f15387 = this.f10768;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c4259.f15384 = this.f10772;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C15135 c15135 = this.f10775;
                if (c15135 == null) {
                    c12727 = this.f10770;
                } else {
                    c12727 = (C12727) c15135.m36297();
                }
                c4259.f15382 = c12727;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c4259.f15376 = this.f10764;
                i |= 1024;
            }
            c4259.f15383 = i | c4259.f15383;
        }
        onBuilt();
        return c4259;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4259) {
            m8617((C4259) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4259) {
            m8617((C4259) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8617(C4259 c4259) {
        C12727 c12727;
        if (c4259 == C4259.getDefaultInstance()) {
            return;
        }
        if (c4259.hasName()) {
            this.f10773 = c4259.f15378;
            this.f10771 |= 1;
            onChanged();
        }
        if (c4259.m12053()) {
            this.f10766 = c4259.m12046();
            this.f10771 |= 2;
            onChanged();
        }
        if (c4259.m12041()) {
            EnumC22605 enumC22605M12055 = c4259.m12055();
            enumC22605M12055.getClass();
            this.f10771 |= 4;
            this.f10769 = enumC22605M12055.getNumber();
            onChanged();
        }
        if (c4259.hasType()) {
            EnumC13433 type = c4259.getType();
            type.getClass();
            this.f10771 |= 8;
            this.f10765 = type.getNumber();
            onChanged();
        }
        if (c4259.m12048()) {
            this.f10767 = c4259.f15379;
            this.f10771 |= 16;
            onChanged();
        }
        if (c4259.m12043()) {
            this.f10763 = c4259.f15375;
            this.f10771 |= 32;
            onChanged();
        }
        if (c4259.m12051()) {
            this.f10774 = c4259.f15386;
            this.f10771 |= 64;
            onChanged();
        }
        if (c4259.m12047()) {
            this.f10768 = c4259.m12054();
            this.f10771 |= 128;
            onChanged();
        }
        if (c4259.m12044()) {
            this.f10772 = c4259.f15384;
            this.f10771 |= 256;
            onChanged();
        }
        if (c4259.m12052()) {
            C12727 c12727M12049 = c4259.m12049();
            C15135 c15135 = this.f10775;
            if (c15135 == null) {
                if ((this.f10771 & 512) == 0 || (c12727 = this.f10770) == null || c12727 == C12727.getDefaultInstance()) {
                    this.f10770 = c12727M12049;
                } else {
                    this.f10771 |= 512;
                    onChanged();
                    ((C23311) m8614().m36293()).m51391(c12727M12049);
                }
            } else {
                c15135.m36294(c12727M12049);
            }
            if (this.f10770 != null) {
                this.f10771 |= 512;
                onChanged();
            }
        }
        if (c4259.m12038()) {
            this.f10764 = c4259.m12050();
            this.f10771 |= 1024;
            onChanged();
        }
        mo2781mergeUnknownFields(c4259.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8616(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    switch (iMo6048) {
                        case 0:
                            break;
                        case 10:
                            this.f10773 = abstractC3262.mo6050();
                            this.f10771 |= 1;
                            continue;
                        case 18:
                            this.f10763 = abstractC3262.mo6050();
                            this.f10771 |= 32;
                            continue;
                        case 24:
                            this.f10766 = abstractC3262.mo6040();
                            this.f10771 |= 2;
                            continue;
                        case 32:
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC22605.m50106(iMo6037) == null) {
                                mergeUnknownVarintField(4, iMo6037);
                            } else {
                                this.f10769 = iMo6037;
                                this.f10771 |= 4;
                                continue;
                            }
                            break;
                        case 40:
                            int iMo6038 = abstractC3262.mo6037();
                            if (EnumC13433.m32925(iMo6038) == null) {
                                mergeUnknownVarintField(5, iMo6038);
                            } else {
                                this.f10765 = iMo6038;
                                this.f10771 |= 8;
                                continue;
                            }
                            break;
                        case 50:
                            this.f10767 = abstractC3262.mo6050();
                            this.f10771 |= 16;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            this.f10774 = abstractC3262.mo6050();
                            this.f10771 |= 64;
                            continue;
                        case 66:
                            abstractC3262.mo6027(m8614().m36293(), c2701);
                            this.f10771 |= 512;
                            continue;
                        case 72:
                            this.f10768 = abstractC3262.mo6040();
                            this.f10771 |= 128;
                            continue;
                        case 82:
                            this.f10772 = abstractC3262.mo6050();
                            this.f10771 |= 256;
                            continue;
                        case 136:
                            this.f10764 = abstractC3262.mo6028();
                            this.f10771 |= 1024;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                                break;
                            }
                            break;
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

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        C12727 defaultInstance;
        if ((this.f10771 & 512) == 0) {
            return true;
        }
        C15135 c15135 = this.f10775;
        if (c15135 == null) {
            defaultInstance = this.f10770;
            if (defaultInstance == null) {
                defaultInstance = C12727.getDefaultInstance();
            }
        } else {
            defaultInstance = (C12727) c15135.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m8614() {
        C12727 defaultInstance;
        C15135 c15135 = this.f10775;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f10770;
                if (defaultInstance == null) {
                    defaultInstance = C12727.getDefaultInstance();
                }
            } else {
                defaultInstance = (C12727) c15135.m36295();
            }
            this.f10775 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f10770 = null;
        }
        return this.f10775;
    }
}
