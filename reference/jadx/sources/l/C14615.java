package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14615 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f47816;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f47817;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f47818;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22190 f47819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f47820;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f47821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f47822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f47823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC23725 f47824;

    public /* synthetic */ C14615(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m35091();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m35091();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m35091();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m35091();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m35092(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m35092(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m35092(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m35092(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46280;
        c6956.m18696(C4923.class, C14615.class);
        return c6956;
    }

    public C14615() {
        this.f47822 = Collections.EMPTY_LIST;
        this.f47821 = "";
        this.f47824 = AbstractC23725.f76778;
        this.f47820 = "";
    }

    public C14615(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f47822 = Collections.EMPTY_LIST;
        this.f47821 = "";
        this.f47824 = AbstractC23725.f76778;
        this.f47820 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35091() {
        super.mo2777clear();
        this.f47823 = 0;
        C22190 c22190 = this.f47819;
        if (c22190 == null) {
            this.f47822 = Collections.EMPTY_LIST;
        } else {
            this.f47822 = null;
            c22190.m49245();
        }
        this.f47823 &= -2;
        this.f47821 = "";
        this.f47818 = 0L;
        this.f47817 = 0L;
        this.f47816 = 0.0d;
        this.f47824 = AbstractC23725.f76778;
        this.f47820 = "";
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46309;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C4923.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C4923.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C4923 c4923BuildPartial = buildPartial();
        if (c4923BuildPartial.isInitialized()) {
            return c4923BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4923BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C4923 c4923BuildPartial = buildPartial();
        if (c4923BuildPartial.isInitialized()) {
            return c4923BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4923BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C4923 buildPartial() {
        int i = 0;
        C4923 c4923 = new C4923(this, 0);
        C22190 c22190 = this.f47819;
        if (c22190 != null) {
            c4923.f17250 = c22190.m49248();
        } else {
            if ((this.f47823 & 1) != 0) {
                this.f47822 = C0561.unmodifiableList(this.f47822);
                this.f47823 &= -2;
            }
            c4923.f17250 = this.f47822;
        }
        int i2 = this.f47823;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c4923.f17249 = this.f47821;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c4923.f17246 = this.f47818;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                c4923.f17245 = this.f47817;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                c4923.f17244 = this.f47816;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                c4923.f17252 = this.f47824;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                c4923.f17248 = this.f47820;
                i |= 32;
            }
            c4923.f17251 = i | c4923.f17251;
        }
        onBuilt();
        return c4923;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4923) {
            m35093((C4923) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4923) {
            m35093((C4923) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35093(C4923 c4923) {
        if (c4923 == C4923.getDefaultInstance()) {
            return;
        }
        if (this.f47819 == null) {
            if (!c4923.f17250.isEmpty()) {
                if (this.f47822.isEmpty()) {
                    this.f47822 = c4923.f17250;
                    this.f47823 &= -2;
                } else {
                    if ((this.f47823 & 1) == 0) {
                        this.f47822 = new ArrayList(this.f47822);
                        this.f47823 |= 1;
                    }
                    this.f47822.addAll(c4923.f17250);
                }
                onChanged();
            }
        } else if (!c4923.f17250.isEmpty()) {
            if (!this.f47819.m49238()) {
                this.f47819.m49242(c4923.f17250);
            } else {
                this.f47819.m49236();
                C22190 c22190 = null;
                this.f47819 = null;
                List list = c4923.f17250;
                this.f47822 = list;
                this.f47823 &= -2;
                if (AbstractC18245.alwaysUseFieldBuilders) {
                    if (this.f47819 == null) {
                        this.f47819 = new C22190(list, false, getParentForChildren(), isClean());
                        this.f47822 = null;
                    }
                    c22190 = this.f47819;
                }
                this.f47819 = c22190;
            }
        }
        if (c4923.m13700()) {
            this.f47821 = c4923.f17249;
            this.f47823 |= 2;
            onChanged();
        }
        if (c4923.m13701()) {
            this.f47818 = c4923.m13704();
            this.f47823 |= 4;
            onChanged();
        }
        if (c4923.m13707()) {
            this.f47817 = c4923.m13709();
            this.f47823 |= 8;
            onChanged();
        }
        if (c4923.m13706()) {
            this.f47816 = c4923.m13698();
            this.f47823 |= 16;
            onChanged();
        }
        if (c4923.m13702()) {
            AbstractC23725 abstractC23725M13708 = c4923.m13708();
            abstractC23725M13708.getClass();
            this.f47824 = abstractC23725M13708;
            this.f47823 |= 32;
            onChanged();
        }
        if (c4923.m13705()) {
            this.f47820 = c4923.f17248;
            this.f47823 |= 64;
            onChanged();
        }
        mo2781mergeUnknownFields(c4923.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35092(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 18) {
                            C3324 c3324 = (C3324) abstractC3262.mo6024(C3324.parser(), c2701);
                            C22190 c22190 = this.f47819;
                            if (c22190 != null) {
                                c22190.m49251(c3324);
                            } else {
                                if ((this.f47823 & 1) == 0) {
                                    this.f47822 = new ArrayList(this.f47822);
                                    this.f47823 |= 1;
                                }
                                this.f47822.add(c3324);
                            }
                        } else if (iMo6048 == 26) {
                            this.f47821 = abstractC3262.mo6050();
                            this.f47823 |= 2;
                        } else if (iMo6048 == 32) {
                            this.f47818 = abstractC3262.mo6047();
                            this.f47823 |= 4;
                        } else if (iMo6048 == 40) {
                            this.f47817 = abstractC3262.mo6049();
                            this.f47823 |= 8;
                        } else if (iMo6048 == 49) {
                            this.f47816 = abstractC3262.mo6020();
                            this.f47823 |= 16;
                        } else if (iMo6048 == 58) {
                            this.f47824 = abstractC3262.mo6050();
                            this.f47823 |= 32;
                        } else if (iMo6048 == 66) {
                            this.f47820 = abstractC3262.mo6050();
                            this.f47823 |= 64;
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
        C3324 c3324;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f47819;
            if (c22190 == null) {
                iM49252 = this.f47822.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i >= iM49252) {
                return true;
            }
            C22190 c22191 = this.f47819;
            if (c22191 == null) {
                c3324 = (C3324) this.f47822.get(i);
            } else {
                c3324 = (C3324) c22191.m49249(i);
            }
            if (!c3324.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
