package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12215 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39247;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f39248;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14473 f39249;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f39250;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public List f39251;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f39252;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f39253;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39254;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16471 f39255;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39256;

    public C12215(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f39251 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m30487();
            m30486();
        }
    }

    public /* synthetic */ C12215(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m30491();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m30491();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m30491();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m30491();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m30491();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m30489(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m30489(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m30489(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m30489(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40260;
        c7544.m20621(C6250.class, C12215.class);
        return c7544;
    }

    public C12215() {
        this.f39251 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m30487();
            m30486();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30491() {
        super.mo2313clear();
        this.f39256 = 0;
        this.f39248 = false;
        this.f39252 = false;
        this.f39247 = false;
        this.f39253 = false;
        this.f39254 = false;
        this.f39255 = null;
        C9998 c9998 = this.f39250;
        if (c9998 != null) {
            c9998.m25851();
            this.f39250 = null;
        }
        C14473 c14473 = this.f39249;
        if (c14473 == null) {
            this.f39251 = Collections.EMPTY_LIST;
        } else {
            this.f39251 = null;
            c14473.m34945();
        }
        this.f39256 &= -65;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40277;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C6250.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C6250.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C6250 c6250BuildPartial = buildPartial();
        if (c6250BuildPartial.isInitialized()) {
            return c6250BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c6250BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C6250 c6250BuildPartial = buildPartial();
        if (c6250BuildPartial.isInitialized()) {
            return c6250BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c6250BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C6250 buildPartial() {
        int i;
        C16471 c16471;
        C6250 c6250 = new C6250(this);
        C14473 c14473 = this.f39249;
        if (c14473 != null) {
            c6250.f21212 = c14473.m34950();
        } else {
            if ((this.f39256 & 64) != 0) {
                this.f39251 = C4681.unmodifiableList(this.f39251);
                this.f39256 &= -65;
            }
            c6250.f21212 = this.f39251;
        }
        int i2 = this.f39256;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c6250.f21211 = this.f39248;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c6250.f21214 = this.f39252;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c6250.f21210 = this.f39247;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c6250.f21217 = this.f39253;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c6250.f21216 = this.f39254;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C9998 c9998 = this.f39250;
                if (c9998 == null) {
                    c16471 = this.f39255;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c6250.f21213 = c16471;
                i |= 32;
            }
            c6250.f21218 = i | c6250.f21218;
        }
        onBuilt();
        return c6250;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C6250) {
            m30488((C6250) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C6250) {
            m30488((C6250) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12215 m30488(C6250 c6250) {
        C16471 c16471;
        if (c6250 == C6250.getDefaultInstance()) {
            return this;
        }
        if (c6250.m17888()) {
            this.f39248 = c6250.m17896();
            this.f39256 |= 1;
            onChanged();
        }
        if (c6250.m17891()) {
            this.f39252 = c6250.m17887();
            this.f39256 |= 2;
            onChanged();
        }
        if (c6250.m17895()) {
            this.f39247 = c6250.m17898();
            this.f39256 |= 4;
            onChanged();
        }
        if (c6250.m17897()) {
            this.f39253 = c6250.m17892();
            this.f39256 |= 8;
            onChanged();
        }
        if (c6250.m17890()) {
            this.f39254 = c6250.m17893();
            this.f39256 |= 16;
            onChanged();
        }
        if (c6250.m17889()) {
            C16471 c16471M17894 = c6250.m17894();
            C9998 c9998 = this.f39250;
            if (c9998 == null) {
                if ((this.f39256 & 32) == 0 || (c16471 = this.f39255) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f39255 = c16471M17894;
                } else {
                    this.f39256 |= 32;
                    onChanged();
                    ((C7301) m30487().m25856()).m19969(c16471M17894);
                }
            } else {
                c9998.m25850(c16471M17894);
            }
            if (this.f39255 != null) {
                this.f39256 |= 32;
                onChanged();
            }
        }
        if (this.f39249 == null) {
            if (!c6250.f21212.isEmpty()) {
                if (this.f39251.isEmpty()) {
                    this.f39251 = c6250.f21212;
                    this.f39256 &= -65;
                } else {
                    if ((this.f39256 & 64) == 0) {
                        this.f39251 = new ArrayList(this.f39251);
                        this.f39256 |= 64;
                    }
                    this.f39251.addAll(c6250.f21212);
                }
                onChanged();
            }
        } else if (!c6250.f21212.isEmpty()) {
            if (!this.f39249.m34938()) {
                this.f39249.m34942(c6250.f21212);
            } else {
                this.f39249.m34954();
                this.f39249 = null;
                this.f39251 = c6250.f21212;
                this.f39256 &= -65;
                this.f39249 = AbstractC9035.alwaysUseFieldBuilders ? m30486() : null;
            }
        }
        m15943((AbstractC11272) c6250);
        mo2317mergeUnknownFields(c6250.getUnknownFields());
        onChanged();
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30489(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f39248 = abstractC3660.mo11894();
                            this.f39256 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f39252 = abstractC3660.mo11894();
                            this.f39256 |= 2;
                        } else if (iMo11876 == 24) {
                            this.f39247 = abstractC3660.mo11894();
                            this.f39256 |= 4;
                        } else if (iMo11876 == 56) {
                            this.f39253 = abstractC3660.mo11894();
                            this.f39256 |= 8;
                        } else if (iMo11876 == 88) {
                            this.f39254 = abstractC3660.mo11894();
                            this.f39256 |= 16;
                        } else if (iMo11876 == 98) {
                            abstractC3660.mo11881(m30487().m25856(), c24215);
                            this.f39256 |= 32;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f39249;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f39256 & 64) == 0) {
                                    this.f39251 = new ArrayList(this.f39251);
                                    this.f39256 |= 64;
                                }
                                this.f39251.add(c20748);
                            }
                        } else if (!parseUnknownField(abstractC3660, c24215, iMo11876)) {
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

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[LOOP:0: B:14:0x0022->B:26:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[EDGE_INSN: B:33:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // l.AbstractC5307, l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int i;
        C14473 c14473;
        int iM34948;
        C14473 c14474;
        C20748 c20748;
        C16471 defaultInstance;
        if ((this.f39256 & 32) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f39249;
                if (c14473 == null) {
                    iM34948 = this.f39251.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f39249;
                if (c14474 == null) {
                    c20748 = (C20748) this.f39251.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f39250;
            if (c9998 == null) {
                defaultInstance = this.f39255;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f39249;
                    if (c14473 == null) {
                        iM34948 = this.f39251.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f39249;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f39251.get(i);
                    } else {
                        c20748 = (C20748) c14474.m34951(i);
                    }
                    if (!c20748.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30490() {
        this.f39256 &= -33;
        this.f39255 = null;
        C9998 c9998 = this.f39250;
        if (c9998 != null) {
            c9998.m25851();
            this.f39250 = null;
        }
        onChanged();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C9998 m30487() {
        C16471 defaultInstance;
        C9998 c9998 = this.f39250;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f39255;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f39250 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f39255 = null;
        }
        return this.f39250;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14473 m30486() {
        if (this.f39249 == null) {
            this.f39249 = new C14473(this.f39251, (this.f39256 & 64) != 0, getParentForChildren(), isClean());
            this.f39251 = null;
        }
        return this.f39249;
    }
}
