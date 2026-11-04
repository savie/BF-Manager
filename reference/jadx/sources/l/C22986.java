package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22986 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9998 f74628;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16471 f74629;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f74630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f74631;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14473 f74632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74633;

    public C22986(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f74630 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m51869();
            m51870();
        }
    }

    public /* synthetic */ C22986(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m51873();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m51873();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m51873();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m51873();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m51873();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51871(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51871(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51871(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51871(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40306;
        c7544.m20621(C20002.class, C22986.class);
        return c7544;
    }

    public C22986() {
        this.f74630 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m51869();
            m51870();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51873() {
        super.mo2313clear();
        this.f74633 = 0;
        this.f74629 = null;
        C9998 c9998 = this.f74628;
        if (c9998 != null) {
            c9998.m25851();
            this.f74628 = null;
        }
        this.f74631 = false;
        C14473 c14473 = this.f74632;
        if (c14473 == null) {
            this.f74630 = Collections.EMPTY_LIST;
        } else {
            this.f74630 = null;
            c14473.m34945();
        }
        this.f74633 &= -5;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40262;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C20002.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C20002.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C20002 c20002BuildPartial = buildPartial();
        if (c20002BuildPartial.isInitialized()) {
            return c20002BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20002BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C20002 c20002BuildPartial = buildPartial();
        if (c20002BuildPartial.isInitialized()) {
            return c20002BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20002BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C20002 buildPartial() {
        int i;
        C16471 c16471;
        C20002 c20002 = new C20002(this);
        C14473 c14473 = this.f74632;
        if (c14473 != null) {
            c20002.f64269 = c14473.m34950();
        } else {
            if ((this.f74633 & 4) != 0) {
                this.f74630 = C4681.unmodifiableList(this.f74630);
                this.f74633 &= -5;
            }
            c20002.f64269 = this.f74630;
        }
        int i2 = this.f74633;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C9998 c9998 = this.f74628;
                if (c9998 == null) {
                    c16471 = this.f74629;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c20002.f64266 = c16471;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c20002.f64268 = this.f74631;
                i |= 2;
            }
            c20002.f64270 = i | c20002.f64270;
        }
        onBuilt();
        return c20002;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20002) {
            m51872((C20002) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20002) {
            m51872((C20002) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51872(C20002 c20002) {
        C16471 c16471;
        if (c20002 == C20002.getDefaultInstance()) {
            return;
        }
        if (c20002.m45994()) {
            C16471 c16471M45995 = c20002.m45995();
            C9998 c9998 = this.f74628;
            if (c9998 == null) {
                if ((this.f74633 & 1) == 0 || (c16471 = this.f74629) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f74629 = c16471M45995;
                } else {
                    this.f74633 |= 1;
                    onChanged();
                    ((C7301) m51869().m25856()).m19969(c16471M45995);
                }
            } else {
                c9998.m25850(c16471M45995);
            }
            if (this.f74629 != null) {
                this.f74633 |= 1;
                onChanged();
            }
        }
        if (c20002.m45996()) {
            this.f74631 = c20002.m45997();
            this.f74633 |= 2;
            onChanged();
        }
        if (this.f74632 == null) {
            if (!c20002.f64269.isEmpty()) {
                if (this.f74630.isEmpty()) {
                    this.f74630 = c20002.f64269;
                    this.f74633 &= -5;
                } else {
                    if ((this.f74633 & 4) == 0) {
                        this.f74630 = new ArrayList(this.f74630);
                        this.f74633 |= 4;
                    }
                    this.f74630.addAll(c20002.f64269);
                }
                onChanged();
            }
        } else if (!c20002.f64269.isEmpty()) {
            if (!this.f74632.m34938()) {
                this.f74632.m34942(c20002.f64269);
            } else {
                this.f74632.m34954();
                this.f74632 = null;
                this.f74630 = c20002.f64269;
                this.f74633 &= -5;
                this.f74632 = AbstractC9035.alwaysUseFieldBuilders ? m51870() : null;
            }
        }
        m15943((AbstractC11272) c20002);
        mo2317mergeUnknownFields(c20002.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51871(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 264) {
                            this.f74631 = abstractC3660.mo11894();
                            this.f74633 |= 2;
                        } else if (iMo11876 == 274) {
                            abstractC3660.mo11881(m51869().m25856(), c24215);
                            this.f74633 |= 1;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f74632;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f74633 & 4) == 0) {
                                    this.f74630 = new ArrayList(this.f74630);
                                    this.f74633 |= 4;
                                }
                                this.f74630.add(c20748);
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
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[EDGE_INSN: B:32:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // l.AbstractC5307, l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int i;
        C14473 c14473;
        int iM34948;
        C14473 c14474;
        C20748 c20748;
        C16471 defaultInstance;
        if ((this.f74633 & 1) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f74632;
                if (c14473 == null) {
                    iM34948 = this.f74630.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f74632;
                if (c14474 == null) {
                    c20748 = (C20748) this.f74630.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f74628;
            if (c9998 == null) {
                defaultInstance = this.f74629;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f74632;
                    if (c14473 == null) {
                        iM34948 = this.f74630.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f74632;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f74630.get(i);
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
    private C9998 m51869() {
        C16471 defaultInstance;
        C9998 c9998 = this.f74628;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f74629;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f74628 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f74629 = null;
        }
        return this.f74628;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C14473 m51870() {
        if (this.f74632 == null) {
            this.f74632 = new C14473(this.f74630, (this.f74633 & 4) != 0, getParentForChildren(), isClean());
            this.f74630 = null;
        }
        return this.f74632;
    }
}
