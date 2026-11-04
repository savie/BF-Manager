package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14758 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48214;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16471 f48215;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f48216;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f48217;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14473 f48218;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9998 f48219;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f48220;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4758 f48221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48222;

    public C14758(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f48216 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m35487();
            m35485();
            m35486();
        }
    }

    public /* synthetic */ C14758(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m35489();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m35489();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m35489();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m35489();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m35489();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40274;
        c7544.m20621(C21472.class, C14758.class);
        return c7544;
    }

    public C14758() {
        this.f48216 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m35487();
            m35485();
            m35486();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35489() {
        super.mo2313clear();
        this.f48222 = 0;
        this.f48214 = false;
        this.f48215 = null;
        C9998 c9998 = this.f48219;
        if (c9998 != null) {
            c9998.m25851();
            this.f48219 = null;
        }
        this.f48220 = false;
        this.f48221 = null;
        C9998 c9999 = this.f48217;
        if (c9999 != null) {
            c9999.m25851();
            this.f48217 = null;
        }
        C14473 c14473 = this.f48218;
        if (c14473 == null) {
            this.f48216 = Collections.EMPTY_LIST;
        } else {
            this.f48216 = null;
            c14473.m34945();
        }
        this.f48222 &= -17;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40295;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C21472.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C21472.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C21472 c21472BuildPartial = buildPartial();
        if (c21472BuildPartial.isInitialized()) {
            return c21472BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c21472BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C21472 c21472BuildPartial = buildPartial();
        if (c21472BuildPartial.isInitialized()) {
            return c21472BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c21472BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C21472 buildPartial() {
        int i;
        C4758 c4758;
        C16471 c16471;
        C21472 c21472 = new C21472(this);
        C14473 c14473 = this.f48218;
        if (c14473 != null) {
            c21472.f68587 = c14473.m34950();
        } else {
            if ((this.f48222 & 16) != 0) {
                this.f48216 = C4681.unmodifiableList(this.f48216);
                this.f48222 &= -17;
            }
            c21472.f68587 = this.f48216;
        }
        int i2 = this.f48222;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c21472.f68586 = this.f48214;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C9998 c9998 = this.f48219;
                if (c9998 == null) {
                    c16471 = this.f48215;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c21472.f68591 = c16471;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c21472.f68590 = this.f48220;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C9998 c9999 = this.f48217;
                if (c9999 == null) {
                    c4758 = this.f48221;
                } else {
                    c4758 = (C4758) c9999.m25854();
                }
                c21472.f68588 = c4758;
                i |= 8;
            }
            c21472.f68592 = i | c21472.f68592;
        }
        onBuilt();
        return c21472;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C21472) {
            m35488((C21472) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C21472) {
            m35488((C21472) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35488(C21472 c21472) {
        C4758 c4758;
        C16471 c16471;
        if (c21472 == C21472.getDefaultInstance()) {
            return;
        }
        if (c21472.m48837()) {
            this.f48214 = c21472.m48840();
            this.f48222 |= 1;
            onChanged();
        }
        if (c21472.m48838()) {
            C16471 c16471M48839 = c21472.m48839();
            C9998 c9998 = this.f48219;
            if (c9998 == null) {
                if ((this.f48222 & 2) == 0 || (c16471 = this.f48215) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f48215 = c16471M48839;
                } else {
                    this.f48222 |= 2;
                    onChanged();
                    ((C7301) m35487().m25856()).m19969(c16471M48839);
                }
            } else {
                c9998.m25850(c16471M48839);
            }
            if (this.f48215 != null) {
                this.f48222 |= 2;
                onChanged();
            }
        }
        if (c21472.m48843()) {
            this.f48220 = c21472.m48844();
            this.f48222 |= 4;
            onChanged();
        }
        if (c21472.m48842()) {
            C4758 c4758M48841 = c21472.m48841();
            C9998 c9999 = this.f48217;
            if (c9999 == null) {
                if ((this.f48222 & 8) == 0 || (c4758 = this.f48221) == null || c4758 == C4758.getDefaultInstance()) {
                    this.f48221 = c4758M48841;
                } else {
                    this.f48222 |= 8;
                    onChanged();
                    ((C13488) m35485().m25856()).m33167(c4758M48841);
                }
            } else {
                c9999.m25850(c4758M48841);
            }
            if (this.f48221 != null) {
                this.f48222 |= 8;
                onChanged();
            }
        }
        if (this.f48218 == null) {
            if (!c21472.f68587.isEmpty()) {
                if (this.f48216.isEmpty()) {
                    this.f48216 = c21472.f68587;
                    this.f48222 &= -17;
                } else {
                    if ((this.f48222 & 16) == 0) {
                        this.f48216 = new ArrayList(this.f48216);
                        this.f48222 |= 16;
                    }
                    this.f48216.addAll(c21472.f68587);
                }
                onChanged();
            }
        } else if (!c21472.f68587.isEmpty()) {
            if (!this.f48218.m34938()) {
                this.f48218.m34942(c21472.f68587);
            } else {
                this.f48218.m34954();
                this.f48218 = null;
                this.f48216 = c21472.f68587;
                this.f48222 &= -17;
                this.f48218 = AbstractC9035.alwaysUseFieldBuilders ? m35486() : null;
            }
        }
        m15943((AbstractC11272) c21472);
        mo2317mergeUnknownFields(c21472.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C14758 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f48214 = abstractC3660.mo11894();
                            this.f48222 |= 1;
                        } else if (iMo11876 == 18) {
                            abstractC3660.mo11881(m35487().m25856(), c24215);
                            this.f48222 |= 2;
                        } else if (iMo11876 == 24) {
                            this.f48220 = abstractC3660.mo11894();
                            this.f48222 |= 4;
                        } else if (iMo11876 == 34) {
                            abstractC3660.mo11881(m35485().m25856(), c24215);
                            this.f48222 |= 8;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f48218;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f48222 & 16) == 0) {
                                    this.f48216 = new ArrayList(this.f48216);
                                    this.f48222 |= 16;
                                }
                                this.f48216.add(c20748);
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
        return this;
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
        if ((this.f48222 & 2) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f48218;
                if (c14473 == null) {
                    iM34948 = this.f48216.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f48218;
                if (c14474 == null) {
                    c20748 = (C20748) this.f48216.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f48219;
            if (c9998 == null) {
                defaultInstance = this.f48215;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f48218;
                    if (c14473 == null) {
                        iM34948 = this.f48216.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f48218;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f48216.get(i);
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C9998 m35487() {
        C16471 defaultInstance;
        C9998 c9998 = this.f48219;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f48215;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f48219 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f48215 = null;
        }
        return this.f48219;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C9998 m35485() {
        C4758 defaultInstance;
        C9998 c9998 = this.f48217;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f48221;
                if (defaultInstance == null) {
                    defaultInstance = C4758.getDefaultInstance();
                }
            } else {
                defaultInstance = (C4758) c9998.m25853();
            }
            this.f48217 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f48221 = null;
        }
        return this.f48217;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14473 m35486() {
        if (this.f48218 == null) {
            this.f48218 = new C14473(this.f48216, (this.f48222 & 16) != 0, getParentForChildren(), isClean());
            this.f48216 = null;
        }
        return this.f48218;
    }
}
