package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10381 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f35549;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f35550;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f35551;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f35552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20259 f35553;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22190 f35554;

    public /* synthetic */ C10381(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m26271();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m26271();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m26271();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m26271();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m26272(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m26272(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m26272(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m26272(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46288;
        c6956.m18696(C7558.class, C10381.class);
        return c6956;
    }

    public C10381() {
        this.f35552 = "";
        this.f35549 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m26270();
            m26269();
        }
    }

    public C10381(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f35552 = "";
        this.f35549 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m26270();
            m26269();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26271() {
        super.mo2777clear();
        this.f35551 = 0;
        this.f35552 = "";
        C22190 c22190 = this.f35554;
        if (c22190 == null) {
            this.f35549 = Collections.EMPTY_LIST;
        } else {
            this.f35549 = null;
            c22190.m49245();
        }
        this.f35551 &= -3;
        this.f35553 = null;
        C15135 c15135 = this.f35550;
        if (c15135 != null) {
            c15135.m36296();
            this.f35550 = null;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46315;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C7558.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C7558.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C7558 c7558BuildPartial = buildPartial();
        if (c7558BuildPartial.isInitialized()) {
            return c7558BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c7558BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C7558 c7558BuildPartial = buildPartial();
        if (c7558BuildPartial.isInitialized()) {
            return c7558BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c7558BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C7558 buildPartial() {
        C20259 c20259;
        int i = 0;
        C7558 c7558 = new C7558(this, 0);
        C22190 c22190 = this.f35554;
        if (c22190 != null) {
            c7558.f25062 = c22190.m49248();
        } else {
            if ((this.f35551 & 2) != 0) {
                this.f35549 = C0561.unmodifiableList(this.f35549);
                this.f35551 &= -3;
            }
            c7558.f25062 = this.f35549;
        }
        int i2 = this.f35551;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c7558.f25065 = this.f35552;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f35550;
                if (c15135 == null) {
                    c20259 = this.f35553;
                } else {
                    c20259 = (C20259) c15135.m36297();
                }
                c7558.f25063 = c20259;
                i |= 2;
            }
            c7558.f25064 = i | c7558.f25064;
        }
        onBuilt();
        return c7558;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C7558) {
            m26273((C7558) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C7558) {
            m26273((C7558) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26273(C7558 c7558) {
        C20259 c20259;
        if (c7558 == C7558.getDefaultInstance()) {
            return;
        }
        if (c7558.hasName()) {
            this.f35552 = c7558.f25065;
            this.f35551 |= 1;
            onChanged();
        }
        if (this.f35554 == null) {
            if (!c7558.f25062.isEmpty()) {
                if (this.f35549.isEmpty()) {
                    this.f35549 = c7558.f25062;
                    this.f35551 &= -3;
                } else {
                    if ((this.f35551 & 2) == 0) {
                        this.f35549 = new ArrayList(this.f35549);
                        this.f35551 |= 2;
                    }
                    this.f35549.addAll(c7558.f25062);
                }
                onChanged();
            }
        } else if (!c7558.f25062.isEmpty()) {
            if (!this.f35554.m49238()) {
                this.f35554.m49242(c7558.f25062);
            } else {
                this.f35554.m49236();
                this.f35554 = null;
                this.f35549 = c7558.f25062;
                this.f35551 &= -3;
                this.f35554 = AbstractC18245.alwaysUseFieldBuilders ? m26270() : null;
            }
        }
        if (c7558.m20077()) {
            C20259 c20259M20075 = c7558.m20075();
            C15135 c15135 = this.f35550;
            if (c15135 == null) {
                if ((this.f35551 & 4) == 0 || (c20259 = this.f35553) == null || c20259 == C20259.getDefaultInstance()) {
                    this.f35553 = c20259M20075;
                } else {
                    this.f35551 |= 4;
                    onChanged();
                    ((C16026) m26269().m36293()).m38006(c20259M20075);
                }
            } else {
                c15135.m36294(c20259M20075);
            }
            if (this.f35553 != null) {
                this.f35551 |= 4;
                onChanged();
            }
        }
        mo2781mergeUnknownFields(c7558.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26272(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f35552 = abstractC3262.mo6050();
                            this.f35551 |= 1;
                        } else if (iMo6048 == 18) {
                            C22375 c22375 = (C22375) abstractC3262.mo6024(C22375.parser(), c2701);
                            C22190 c22190 = this.f35554;
                            if (c22190 != null) {
                                c22190.m49251(c22375);
                            } else {
                                if ((this.f35551 & 2) == 0) {
                                    this.f35549 = new ArrayList(this.f35549);
                                    this.f35551 |= 2;
                                }
                                this.f35549.add(c22375);
                            }
                        } else if (iMo6048 == 26) {
                            abstractC3262.mo6027(m26269().m36293(), c2701);
                            this.f35551 |= 4;
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

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int iM49252;
        C20259 defaultInstance;
        C22375 c22375;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f35554;
            if (c22190 == null) {
                iM49252 = this.f35549.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i < iM49252) {
                C22190 c22191 = this.f35554;
                if (c22191 == null) {
                    c22375 = (C22375) this.f35549.get(i);
                } else {
                    c22375 = (C22375) c22191.m49249(i);
                }
                if (!c22375.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f35551 & 4) == 0) {
                    return true;
                }
                C15135 c15135 = this.f35550;
                if (c15135 == null) {
                    defaultInstance = this.f35553;
                    if (defaultInstance == null) {
                        defaultInstance = C20259.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C20259) c15135.m36295();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C22190 m26270() {
        if (this.f35554 == null) {
            this.f35554 = new C22190(this.f35549, (this.f35551 & 2) != 0, getParentForChildren(), isClean());
            this.f35549 = null;
        }
        return this.f35554;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C15135 m26269() {
        C20259 defaultInstance;
        C15135 c15135 = this.f35550;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f35553;
                if (defaultInstance == null) {
                    defaultInstance = C20259.getDefaultInstance();
                }
            } else {
                defaultInstance = (C20259) c15135.m36295();
            }
            this.f35550 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f35553 = null;
        }
        return this.f35550;
    }
}
