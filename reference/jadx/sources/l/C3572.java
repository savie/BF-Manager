package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3572 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12229;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14473 f12230;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f12231;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f12232;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16471 f12233;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12234;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9998 f12235;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12236;

    public C3572(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f12232 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m11619();
            m11620();
        }
    }

    public /* synthetic */ C3572(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m11622();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m11622();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m11622();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m11622();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m11622();
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
        C7544 c7544 = C12543.f40283;
        c7544.m20621(C20726.class, C3572.class);
        return c7544;
    }

    public C3572() {
        this.f12232 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m11619();
            m11620();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11622() {
        super.mo2313clear();
        this.f12234 = 0;
        this.f12236 = false;
        this.f12231 = false;
        this.f12229 = false;
        this.f12233 = null;
        C9998 c9998 = this.f12235;
        if (c9998 != null) {
            c9998.m25851();
            this.f12235 = null;
        }
        C14473 c14473 = this.f12230;
        if (c14473 == null) {
            this.f12232 = Collections.EMPTY_LIST;
        } else {
            this.f12232 = null;
            c14473.m34945();
        }
        this.f12234 &= -17;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40287;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C20726.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C20726.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C20726 c20726BuildPartial = buildPartial();
        if (c20726BuildPartial.isInitialized()) {
            return c20726BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20726BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C20726 c20726BuildPartial = buildPartial();
        if (c20726BuildPartial.isInitialized()) {
            return c20726BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20726BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C20726 buildPartial() {
        int i;
        C16471 c16471;
        C20726 c20726 = new C20726(this);
        C14473 c14473 = this.f12230;
        if (c14473 != null) {
            c20726.f66410 = c14473.m34950();
        } else {
            if ((this.f12234 & 16) != 0) {
                this.f12232 = C4681.unmodifiableList(this.f12232);
                this.f12234 &= -17;
            }
            c20726.f66410 = this.f12232;
        }
        int i2 = this.f12234;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c20726.f66415 = this.f12236;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c20726.f66411 = this.f12231;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c20726.f66409 = this.f12229;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C9998 c9998 = this.f12235;
                if (c9998 == null) {
                    c16471 = this.f12233;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c20726.f66414 = c16471;
                i |= 8;
            }
            c20726.f66413 = i | c20726.f66413;
        }
        onBuilt();
        return c20726;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20726) {
            m11621((C20726) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20726) {
            m11621((C20726) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11621(C20726 c20726) {
        C16471 c16471;
        if (c20726 == C20726.getDefaultInstance()) {
            return;
        }
        if (c20726.m47403()) {
            this.f12236 = c20726.m47404();
            this.f12234 |= 1;
            onChanged();
        }
        if (c20726.m47397()) {
            this.f12231 = c20726.m47400();
            this.f12234 |= 2;
            onChanged();
        }
        if (c20726.m47402()) {
            this.f12229 = c20726.m47401();
            this.f12234 |= 4;
            onChanged();
        }
        if (c20726.m47398()) {
            C16471 c16471M47399 = c20726.m47399();
            C9998 c9998 = this.f12235;
            if (c9998 == null) {
                if ((this.f12234 & 8) == 0 || (c16471 = this.f12233) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f12233 = c16471M47399;
                } else {
                    this.f12234 |= 8;
                    onChanged();
                    ((C7301) m11619().m25856()).m19969(c16471M47399);
                }
            } else {
                c9998.m25850(c16471M47399);
            }
            if (this.f12233 != null) {
                this.f12234 |= 8;
                onChanged();
            }
        }
        if (this.f12230 == null) {
            if (!c20726.f66410.isEmpty()) {
                if (this.f12232.isEmpty()) {
                    this.f12232 = c20726.f66410;
                    this.f12234 &= -17;
                } else {
                    if ((this.f12234 & 16) == 0) {
                        this.f12232 = new ArrayList(this.f12232);
                        this.f12234 |= 16;
                    }
                    this.f12232.addAll(c20726.f66410);
                }
                onChanged();
            }
        } else if (!c20726.f66410.isEmpty()) {
            if (!this.f12230.m34938()) {
                this.f12230.m34942(c20726.f66410);
            } else {
                this.f12230.m34954();
                this.f12230 = null;
                this.f12232 = c20726.f66410;
                this.f12234 &= -17;
                this.f12230 = AbstractC9035.alwaysUseFieldBuilders ? m11620() : null;
            }
        }
        m15943((AbstractC11272) c20726);
        mo2317mergeUnknownFields(c20726.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C3572 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 16) {
                            this.f12236 = abstractC3660.mo11894();
                            this.f12234 |= 1;
                        } else if (iMo11876 == 24) {
                            this.f12231 = abstractC3660.mo11894();
                            this.f12234 |= 2;
                        } else if (iMo11876 == 48) {
                            this.f12229 = abstractC3660.mo11894();
                            this.f12234 |= 4;
                        } else if (iMo11876 == 58) {
                            abstractC3660.mo11881(m11619().m25856(), c24215);
                            this.f12234 |= 8;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f12230;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f12234 & 16) == 0) {
                                    this.f12232 = new ArrayList(this.f12232);
                                    this.f12234 = 16 | this.f12234;
                                }
                                this.f12232.add(c20748);
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
        if ((this.f12234 & 8) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f12230;
                if (c14473 == null) {
                    iM34948 = this.f12232.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f12230;
                if (c14474 == null) {
                    c20748 = (C20748) this.f12232.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f12235;
            if (c9998 == null) {
                defaultInstance = this.f12233;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f12230;
                    if (c14473 == null) {
                        iM34948 = this.f12232.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f12230;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f12232.get(i);
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
    private C9998 m11619() {
        C16471 defaultInstance;
        C9998 c9998 = this.f12235;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f12233;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f12235 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f12233 = null;
        }
        return this.f12235;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C14473 m11620() {
        if (this.f12230 == null) {
            this.f12230 = new C14473(this.f12232, (this.f12234 & 16) != 0, getParentForChildren(), isClean());
            this.f12232 = null;
        }
        return this.f12230;
    }
}
