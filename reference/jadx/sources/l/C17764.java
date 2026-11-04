package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17764 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f58330;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f58331;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14473 f58332;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC17084 f58333;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f58334;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f58335;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f58336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f58337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58338;

    public /* synthetic */ C17764(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m41575();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m41575();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m41575();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m41575();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m41576(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m41576(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m41576(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m41576(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40269;
        c7544.m20621(C20748.class, C17764.class);
        return c7544;
    }

    public C17764() {
        this.f58337 = Collections.EMPTY_LIST;
        this.f58330 = "";
        this.f58333 = AbstractC17084.f55772;
        this.f58335 = "";
    }

    public C17764(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f58337 = Collections.EMPTY_LIST;
        this.f58330 = "";
        this.f58333 = AbstractC17084.f55772;
        this.f58335 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41575() {
        super.mo2313clear();
        this.f58338 = 0;
        C14473 c14473 = this.f58332;
        if (c14473 == null) {
            this.f58337 = Collections.EMPTY_LIST;
        } else {
            this.f58337 = null;
            c14473.m34945();
        }
        this.f58338 &= -2;
        this.f58330 = "";
        this.f58331 = 0L;
        this.f58334 = 0L;
        this.f58336 = 0.0d;
        this.f58333 = AbstractC17084.f55772;
        this.f58335 = "";
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40292;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C20748.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C20748.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C20748 c20748BuildPartial = buildPartial();
        if (c20748BuildPartial.isInitialized()) {
            return c20748BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20748BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C20748 c20748BuildPartial = buildPartial();
        if (c20748BuildPartial.isInitialized()) {
            return c20748BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20748BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C20748 buildPartial() {
        int i = 0;
        C20748 c20748 = new C20748(this, 0);
        C14473 c14473 = this.f58332;
        if (c14473 != null) {
            c20748.f66493 = c14473.m34950();
        } else {
            if ((this.f58338 & 1) != 0) {
                this.f58337 = C4681.unmodifiableList(this.f58337);
                this.f58338 &= -2;
            }
            c20748.f66493 = this.f58337;
        }
        int i2 = this.f58338;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c20748.f66486 = this.f58330;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c20748.f66487 = this.f58331;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                c20748.f66490 = this.f58334;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                c20748.f66492 = this.f58336;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                c20748.f66489 = this.f58333;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                c20748.f66491 = this.f58335;
                i |= 32;
            }
            c20748.f66494 = i | c20748.f66494;
        }
        onBuilt();
        return c20748;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20748) {
            m41577((C20748) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20748) {
            m41577((C20748) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41577(C20748 c20748) {
        if (c20748 == C20748.getDefaultInstance()) {
            return;
        }
        if (this.f58332 == null) {
            if (!c20748.f66493.isEmpty()) {
                if (this.f58337.isEmpty()) {
                    this.f58337 = c20748.f66493;
                    this.f58338 &= -2;
                } else {
                    if ((this.f58338 & 1) == 0) {
                        this.f58337 = new ArrayList(this.f58337);
                        this.f58338 |= 1;
                    }
                    this.f58337.addAll(c20748.f66493);
                }
                onChanged();
            }
        } else if (!c20748.f66493.isEmpty()) {
            if (!this.f58332.m34938()) {
                this.f58332.m34942(c20748.f66493);
            } else {
                this.f58332.m34954();
                C14473 c14473 = null;
                this.f58332 = null;
                List list = c20748.f66493;
                this.f58337 = list;
                this.f58338 &= -2;
                if (AbstractC9035.alwaysUseFieldBuilders) {
                    if (this.f58332 == null) {
                        this.f58332 = new C14473(list, false, getParentForChildren(), isClean());
                        this.f58337 = null;
                    }
                    c14473 = this.f58332;
                }
                this.f58332 = c14473;
            }
        }
        if (c20748.m47447()) {
            this.f58330 = c20748.f66486;
            this.f58338 |= 2;
            onChanged();
        }
        if (c20748.m47451()) {
            this.f58331 = c20748.m47453();
            this.f58338 |= 4;
            onChanged();
        }
        if (c20748.m47455()) {
            this.f58334 = c20748.m47457();
            this.f58338 |= 8;
            onChanged();
        }
        if (c20748.m47456()) {
            this.f58336 = c20748.m47446();
            this.f58338 |= 16;
            onChanged();
        }
        if (c20748.m47449()) {
            AbstractC17084 abstractC17084M47454 = c20748.m47454();
            abstractC17084M47454.getClass();
            this.f58333 = abstractC17084M47454;
            this.f58338 |= 32;
            onChanged();
        }
        if (c20748.m47452()) {
            this.f58335 = c20748.f66491;
            this.f58338 |= 64;
            onChanged();
        }
        mo2317mergeUnknownFields(c20748.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41576(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 18) {
                            C3594 c3594 = (C3594) abstractC3660.mo11877(C3594.parser(), c24215);
                            C14473 c14473 = this.f58332;
                            if (c14473 != null) {
                                c14473.m34953(c3594);
                            } else {
                                if ((this.f58338 & 1) == 0) {
                                    this.f58337 = new ArrayList(this.f58337);
                                    this.f58338 |= 1;
                                }
                                this.f58337.add(c3594);
                            }
                        } else if (iMo11876 == 26) {
                            this.f58330 = abstractC3660.mo11890();
                            this.f58338 |= 2;
                        } else if (iMo11876 == 32) {
                            this.f58331 = abstractC3660.mo11896();
                            this.f58338 |= 4;
                        } else if (iMo11876 == 40) {
                            this.f58334 = abstractC3660.mo11893();
                            this.f58338 |= 8;
                        } else if (iMo11876 == 49) {
                            this.f58336 = abstractC3660.mo11888();
                            this.f58338 |= 16;
                        } else if (iMo11876 == 58) {
                            this.f58333 = abstractC3660.mo11890();
                            this.f58338 |= 32;
                        } else if (iMo11876 == 66) {
                            this.f58335 = abstractC3660.mo11890();
                            this.f58338 |= 64;
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
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

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int iM34948;
        C3594 c3594;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f58332;
            if (c14473 == null) {
                iM34948 = this.f58337.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i >= iM34948) {
                return true;
            }
            C14473 c14474 = this.f58332;
            if (c14474 == null) {
                c3594 = (C3594) this.f58337.get(i);
            } else {
                c3594 = (C3594) c14474.m34951(i);
            }
            if (!c3594.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
