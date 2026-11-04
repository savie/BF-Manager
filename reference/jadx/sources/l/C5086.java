package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5086 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f17772;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f17773;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f17775;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20002 f17776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14473 f17777;

    public /* synthetic */ C5086(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m15382();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m15382();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m15382();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m15382();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m15383(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m15383(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m15383(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m15383(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40275;
        c7544.m20621(C22240.class, C5086.class);
        return c7544;
    }

    public C5086() {
        this.f17772 = "";
        this.f17775 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m15381();
            m15380();
        }
    }

    public C5086(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f17772 = "";
        this.f17775 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m15381();
            m15380();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15382() {
        super.mo2313clear();
        this.f17774 = 0;
        this.f17772 = "";
        C14473 c14473 = this.f17777;
        if (c14473 == null) {
            this.f17775 = Collections.EMPTY_LIST;
        } else {
            this.f17775 = null;
            c14473.m34945();
        }
        this.f17774 &= -3;
        this.f17776 = null;
        C9998 c9998 = this.f17773;
        if (c9998 != null) {
            c9998.m25851();
            this.f17773 = null;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40296;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C22240.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C22240.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C22240 c22240BuildPartial = buildPartial();
        if (c22240BuildPartial.isInitialized()) {
            return c22240BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c22240BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C22240 c22240BuildPartial = buildPartial();
        if (c22240BuildPartial.isInitialized()) {
            return c22240BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c22240BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C22240 buildPartial() {
        C20002 c20002;
        int i = 0;
        C22240 c22240 = new C22240(this, 0);
        C14473 c14473 = this.f17777;
        if (c14473 != null) {
            c22240.f71643 = c14473.m34950();
        } else {
            if ((this.f17774 & 2) != 0) {
                this.f17775 = C4681.unmodifiableList(this.f17775);
                this.f17774 &= -3;
            }
            c22240.f71643 = this.f17775;
        }
        int i2 = this.f17774;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22240.f71640 = this.f17772;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f17773;
                if (c9998 == null) {
                    c20002 = this.f17776;
                } else {
                    c20002 = (C20002) c9998.m25854();
                }
                c22240.f71641 = c20002;
                i |= 2;
            }
            c22240.f71642 = i | c22240.f71642;
        }
        onBuilt();
        return c22240;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C22240) {
            m15384((C22240) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C22240) {
            m15384((C22240) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15384(C22240 c22240) {
        C20002 c20002;
        if (c22240 == C22240.getDefaultInstance()) {
            return;
        }
        if (c22240.hasName()) {
            this.f17772 = c22240.f71640;
            this.f17774 |= 1;
            onChanged();
        }
        if (this.f17777 == null) {
            if (!c22240.f71643.isEmpty()) {
                if (this.f17775.isEmpty()) {
                    this.f17775 = c22240.f71643;
                    this.f17774 &= -3;
                } else {
                    if ((this.f17774 & 2) == 0) {
                        this.f17775 = new ArrayList(this.f17775);
                        this.f17774 |= 2;
                    }
                    this.f17775.addAll(c22240.f71643);
                }
                onChanged();
            }
        } else if (!c22240.f71643.isEmpty()) {
            if (!this.f17777.m34938()) {
                this.f17777.m34942(c22240.f71643);
            } else {
                this.f17777.m34954();
                this.f17777 = null;
                this.f17775 = c22240.f71643;
                this.f17774 &= -3;
                this.f17777 = AbstractC9035.alwaysUseFieldBuilders ? m15381() : null;
            }
        }
        if (c22240.m50296()) {
            C20002 c20002M50293 = c22240.m50293();
            C9998 c9998 = this.f17773;
            if (c9998 == null) {
                if ((this.f17774 & 4) == 0 || (c20002 = this.f17776) == null || c20002 == C20002.getDefaultInstance()) {
                    this.f17776 = c20002M50293;
                } else {
                    this.f17774 |= 4;
                    onChanged();
                    ((C22986) m15380().m25856()).m51872(c20002M50293);
                }
            } else {
                c9998.m25850(c20002M50293);
            }
            if (this.f17776 != null) {
                this.f17774 |= 4;
                onChanged();
            }
        }
        mo2317mergeUnknownFields(c22240.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15383(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f17772 = abstractC3660.mo11890();
                            this.f17774 |= 1;
                        } else if (iMo11876 == 18) {
                            C14452 c14452 = (C14452) abstractC3660.mo11877(C14452.parser(), c24215);
                            C14473 c14473 = this.f17777;
                            if (c14473 != null) {
                                c14473.m34953(c14452);
                            } else {
                                if ((this.f17774 & 2) == 0) {
                                    this.f17775 = new ArrayList(this.f17775);
                                    this.f17774 |= 2;
                                }
                                this.f17775.add(c14452);
                            }
                        } else if (iMo11876 == 26) {
                            abstractC3660.mo11881(m15380().m25856(), c24215);
                            this.f17774 |= 4;
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
        C20002 defaultInstance;
        C14452 c14452;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f17777;
            if (c14473 == null) {
                iM34948 = this.f17775.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i < iM34948) {
                C14473 c14474 = this.f17777;
                if (c14474 == null) {
                    c14452 = (C14452) this.f17775.get(i);
                } else {
                    c14452 = (C14452) c14474.m34951(i);
                }
                if (!c14452.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f17774 & 4) == 0) {
                    return true;
                }
                C9998 c9998 = this.f17773;
                if (c9998 == null) {
                    defaultInstance = this.f17776;
                    if (defaultInstance == null) {
                        defaultInstance = C20002.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C20002) c9998.m25853();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C14473 m15381() {
        if (this.f17777 == null) {
            this.f17777 = new C14473(this.f17775, (this.f17774 & 2) != 0, getParentForChildren(), isClean());
            this.f17775 = null;
        }
        return this.f17777;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C9998 m15380() {
        C20002 defaultInstance;
        C9998 c9998 = this.f17773;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f17776;
                if (defaultInstance == null) {
                    defaultInstance = C20002.getDefaultInstance();
                }
            } else {
                defaultInstance = (C20002) c9998.m25853();
            }
            this.f17773 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f17776 = null;
        }
        return this.f17773;
    }
}
