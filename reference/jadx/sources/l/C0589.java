package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0589 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f2356;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f2357;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f2358;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f2359;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14473 f2360;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14473 f2361;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16471 f2362;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2363;

    public C0589(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        List list = Collections.EMPTY_LIST;
        this.f2357 = list;
        this.f2356 = list;
        this.f2359 = 1;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m2680();
            m2679();
            m2681();
        }
    }

    public /* synthetic */ C0589(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m2683();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m2683();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m2683();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m2683();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m2683();
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
        C7544 c7544 = C12543.f40279;
        c7544.m20621(C2826.class, C0589.class);
        return c7544;
    }

    public C0589() {
        List list = Collections.EMPTY_LIST;
        this.f2357 = list;
        this.f2356 = list;
        this.f2359 = 1;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m2680();
            m2679();
            m2681();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2683() {
        super.mo2313clear();
        this.f2363 = 0;
        C14473 c14473 = this.f2360;
        if (c14473 == null) {
            this.f2357 = Collections.EMPTY_LIST;
        } else {
            this.f2357 = null;
            c14473.m34945();
        }
        this.f2363 &= -2;
        C14473 c14474 = this.f2361;
        if (c14474 == null) {
            this.f2356 = Collections.EMPTY_LIST;
        } else {
            this.f2356 = null;
            c14474.m34945();
        }
        this.f2363 &= -3;
        this.f2362 = null;
        C9998 c9998 = this.f2358;
        if (c9998 != null) {
            c9998.m25851();
            this.f2358 = null;
        }
        this.f2359 = 1;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40255;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C2826.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C2826.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C2826 c2826BuildPartial = buildPartial();
        if (c2826BuildPartial.isInitialized()) {
            return c2826BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c2826BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C2826 c2826BuildPartial = buildPartial();
        if (c2826BuildPartial.isInitialized()) {
            return c2826BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c2826BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C2826 buildPartial() {
        C16471 c16471;
        C2826 c2826 = new C2826(this);
        C14473 c14473 = this.f2360;
        int i = 1;
        if (c14473 != null) {
            c2826.f9285 = c14473.m34950();
        } else {
            if ((this.f2363 & 1) != 0) {
                this.f2357 = C4681.unmodifiableList(this.f2357);
                this.f2363 &= -2;
            }
            c2826.f9285 = this.f2357;
        }
        C14473 c14474 = this.f2361;
        if (c14474 != null) {
            c2826.f9284 = c14474.m34950();
        } else {
            if ((this.f2363 & 2) != 0) {
                this.f2356 = C4681.unmodifiableList(this.f2356);
                this.f2363 &= -3;
            }
            c2826.f9284 = this.f2356;
        }
        int i2 = this.f2363;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f2358;
                if (c9998 == null) {
                    c16471 = this.f2362;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c2826.f9281 = c16471;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                c2826.f9283 = this.f2359;
                i |= 2;
            }
            c2826.f9286 = i | c2826.f9286;
        }
        onBuilt();
        return c2826;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C2826) {
            m2682((C2826) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C2826) {
            m2682((C2826) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2682(C2826 c2826) {
        C16471 c16471;
        if (c2826 == C2826.getDefaultInstance()) {
            return;
        }
        if (this.f2360 == null) {
            if (!c2826.f9285.isEmpty()) {
                if (this.f2357.isEmpty()) {
                    this.f2357 = c2826.f9285;
                    this.f2363 &= -2;
                } else {
                    if ((this.f2363 & 1) == 0) {
                        this.f2357 = new ArrayList(this.f2357);
                        this.f2363 |= 1;
                    }
                    this.f2357.addAll(c2826.f9285);
                }
                onChanged();
            }
        } else if (!c2826.f9285.isEmpty()) {
            if (!this.f2360.m34938()) {
                this.f2360.m34942(c2826.f9285);
            } else {
                this.f2360.m34954();
                this.f2360 = null;
                this.f2357 = c2826.f9285;
                this.f2363 &= -2;
                this.f2360 = AbstractC9035.alwaysUseFieldBuilders ? m2680() : null;
            }
        }
        if (this.f2361 == null) {
            if (!c2826.f9284.isEmpty()) {
                if (this.f2356.isEmpty()) {
                    this.f2356 = c2826.f9284;
                    this.f2363 &= -3;
                } else {
                    if ((this.f2363 & 2) == 0) {
                        this.f2356 = new ArrayList(this.f2356);
                        this.f2363 |= 2;
                    }
                    this.f2356.addAll(c2826.f9284);
                }
                onChanged();
            }
        } else if (!c2826.f9284.isEmpty()) {
            if (!this.f2361.m34938()) {
                this.f2361.m34942(c2826.f9284);
            } else {
                this.f2361.m34954();
                this.f2361 = null;
                this.f2356 = c2826.f9284;
                this.f2363 &= -3;
                this.f2361 = AbstractC9035.alwaysUseFieldBuilders ? m2679() : null;
            }
        }
        if (c2826.m9308()) {
            C16471 c16471M9309 = c2826.m9309();
            C9998 c9998 = this.f2358;
            if (c9998 == null) {
                if ((this.f2363 & 4) == 0 || (c16471 = this.f2362) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f2362 = c16471M9309;
                } else {
                    this.f2363 |= 4;
                    onChanged();
                    ((C7301) m2681().m25856()).m19969(c16471M9309);
                }
            } else {
                c9998.m25850(c16471M9309);
            }
            if (this.f2362 != null) {
                this.f2363 |= 4;
                onChanged();
            }
        }
        if (c2826.m9306()) {
            EnumC9537 enumC9537M9307 = c2826.m9307();
            enumC9537M9307.getClass();
            this.f2363 |= 8;
            this.f2359 = enumC9537M9307.getNumber();
            onChanged();
        }
        m15943((AbstractC11272) c2826);
        mo2317mergeUnknownFields(c2826.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C0589 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 18) {
                            C10283 c10283 = (C10283) abstractC3660.mo11877(C10283.parser(), c24215);
                            C14473 c14473 = this.f2361;
                            if (c14473 != null) {
                                c14473.m34953(c10283);
                            } else {
                                if ((this.f2363 & 2) == 0) {
                                    this.f2356 = new ArrayList(this.f2356);
                                    this.f2363 |= 2;
                                }
                                this.f2356.add(c10283);
                            }
                        } else if (iMo11876 == 24) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC9537.m24952(iMo11882) == null) {
                                mergeUnknownVarintField(3, iMo11882);
                            } else {
                                this.f2359 = iMo11882;
                                this.f2363 |= 8;
                            }
                        } else if (iMo11876 == 402) {
                            abstractC3660.mo11881(m2681().m25856(), c24215);
                            this.f2363 |= 4;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14474 = this.f2360;
                            if (c14474 != null) {
                                c14474.m34953(c20748);
                            } else {
                                if ((this.f2363 & 1) == 0) {
                                    this.f2357 = new ArrayList(this.f2357);
                                    this.f2363 |= 1;
                                }
                                this.f2357.add(c20748);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    @Override // l.AbstractC5307, l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int iM34948;
        C16471 defaultInstance;
        C20748 c20748;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f2360;
            if (c14473 == null) {
                iM34948 = this.f2357.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i < iM34948) {
                C14473 c14474 = this.f2360;
                if (c14474 == null) {
                    c20748 = (C20748) this.f2357.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f2363 & 4) == 0) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                C9998 c9998 = this.f2358;
                if (c9998 == null) {
                    defaultInstance = this.f2362;
                    if (defaultInstance == null) {
                        defaultInstance = C16471.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C16471) c9998.m25853();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                if (!m15945()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14473 m2680() {
        if (this.f2360 == null) {
            this.f2360 = new C14473(this.f2357, (this.f2363 & 1) != 0, getParentForChildren(), isClean());
            this.f2357 = null;
        }
        return this.f2360;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C14473 m2679() {
        if (this.f2361 == null) {
            this.f2361 = new C14473(this.f2356, (this.f2363 & 2) != 0, getParentForChildren(), isClean());
            this.f2356 = null;
        }
        return this.f2361;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C9998 m2681() {
        C16471 defaultInstance;
        C9998 c9998 = this.f2358;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f2362;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f2358 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f2362 = null;
        }
        return this.f2358;
    }
}
