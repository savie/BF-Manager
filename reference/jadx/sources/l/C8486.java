package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8486 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16471 f27773;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14473 f27774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9998 f27775;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f27776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27777;

    public C8486(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f27776 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m22805();
            m22806();
        }
    }

    public /* synthetic */ C8486(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m22809();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m22809();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m22809();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m22809();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m22809();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m22807(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m22807(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m22807(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m22807(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40254;
        c7544.m20621(C6995.class, C8486.class);
        return c7544;
    }

    public C8486() {
        this.f27776 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m22805();
            m22806();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22809() {
        super.mo2313clear();
        this.f27777 = 0;
        this.f27773 = null;
        C9998 c9998 = this.f27775;
        if (c9998 != null) {
            c9998.m25851();
            this.f27775 = null;
        }
        C14473 c14473 = this.f27774;
        if (c14473 == null) {
            this.f27776 = Collections.EMPTY_LIST;
        } else {
            this.f27776 = null;
            c14473.m34945();
        }
        this.f27777 &= -3;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40304;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C6995.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C6995.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C6995 c6995BuildPartial = buildPartial();
        if (c6995BuildPartial.isInitialized()) {
            return c6995BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c6995BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C6995 c6995BuildPartial = buildPartial();
        if (c6995BuildPartial.isInitialized()) {
            return c6995BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c6995BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C6995 buildPartial() {
        C16471 c16471;
        C6995 c6995 = new C6995(this);
        C14473 c14473 = this.f27774;
        if (c14473 != null) {
            c6995.f23070 = c14473.m34950();
        } else {
            if ((this.f27777 & 2) != 0) {
                this.f27776 = C4681.unmodifiableList(this.f27776);
                this.f27777 &= -3;
            }
            c6995.f23070 = this.f27776;
        }
        int i = this.f27777;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C9998 c9998 = this.f27775;
                if (c9998 == null) {
                    c16471 = this.f27773;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c6995.f23071 = c16471;
            } else {
                i2 = 0;
            }
            c6995.f23072 = i2 | c6995.f23072;
        }
        onBuilt();
        return c6995;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C6995) {
            m22808((C6995) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C6995) {
            m22808((C6995) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22808(C6995 c6995) {
        C16471 c16471;
        if (c6995 == C6995.getDefaultInstance()) {
            return;
        }
        if (c6995.m19315()) {
            C16471 c16471M19316 = c6995.m19316();
            C9998 c9998 = this.f27775;
            if (c9998 == null) {
                if ((this.f27777 & 1) == 0 || (c16471 = this.f27773) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f27773 = c16471M19316;
                } else {
                    this.f27777 |= 1;
                    onChanged();
                    ((C7301) m22805().m25856()).m19969(c16471M19316);
                }
            } else {
                c9998.m25850(c16471M19316);
            }
            if (this.f27773 != null) {
                this.f27777 |= 1;
                onChanged();
            }
        }
        if (this.f27774 == null) {
            if (!c6995.f23070.isEmpty()) {
                if (this.f27776.isEmpty()) {
                    this.f27776 = c6995.f23070;
                    this.f27777 &= -3;
                } else {
                    if ((this.f27777 & 2) == 0) {
                        this.f27776 = new ArrayList(this.f27776);
                        this.f27777 |= 2;
                    }
                    this.f27776.addAll(c6995.f23070);
                }
                onChanged();
            }
        } else if (!c6995.f23070.isEmpty()) {
            if (!this.f27774.m34938()) {
                this.f27774.m34942(c6995.f23070);
            } else {
                this.f27774.m34954();
                this.f27774 = null;
                this.f27776 = c6995.f23070;
                this.f27777 &= -3;
                this.f27774 = AbstractC9035.alwaysUseFieldBuilders ? m22806() : null;
            }
        }
        m15943((AbstractC11272) c6995);
        mo2317mergeUnknownFields(c6995.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22807(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            abstractC3660.mo11881(m22805().m25856(), c24215);
                            this.f27777 |= 1;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f27774;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f27777 & 2) == 0) {
                                    this.f27776 = new ArrayList(this.f27776);
                                    this.f27777 |= 2;
                                }
                                this.f27776.add(c20748);
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
        if ((this.f27777 & 1) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f27774;
                if (c14473 == null) {
                    iM34948 = this.f27776.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f27774;
                if (c14474 == null) {
                    c20748 = (C20748) this.f27776.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f27775;
            if (c9998 == null) {
                defaultInstance = this.f27773;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f27774;
                    if (c14473 == null) {
                        iM34948 = this.f27776.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f27774;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f27776.get(i);
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
    private C9998 m22805() {
        C16471 defaultInstance;
        C9998 c9998 = this.f27775;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f27773;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f27775 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f27773 = null;
        }
        return this.f27775;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C14473 m22806() {
        if (this.f27774 == null) {
            this.f27774 = new C14473(this.f27776, (this.f27777 & 2) != 0, getParentForChildren(), isClean());
            this.f27776 = null;
        }
        return this.f27774;
    }
}
