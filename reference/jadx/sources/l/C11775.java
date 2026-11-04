package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11775 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20726 f38040;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14473 f38041;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1072 f38042;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f38043;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f38044;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38045;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9998 f38046;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14473 f38047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f38048;

    public /* synthetic */ C11775(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m29551();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m29551();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m29551();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m29551();
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
        C7544 c7544 = C12543.f40285;
        c7544.m20621(C16250.class, C11775.class);
        return c7544;
    }

    public C11775() {
        this.f38048 = "";
        List list = Collections.EMPTY_LIST;
        this.f38043 = list;
        this.f38044 = list;
        this.f38042 = C1072.m4023();
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m29549();
            m29550();
            m29548();
        }
    }

    public C11775(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f38048 = "";
        List list = Collections.EMPTY_LIST;
        this.f38043 = list;
        this.f38044 = list;
        this.f38042 = C1072.m4023();
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m29549();
            m29550();
            m29548();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29551() {
        super.mo2313clear();
        this.f38045 = 0;
        this.f38048 = "";
        C14473 c14473 = this.f38041;
        if (c14473 == null) {
            this.f38043 = Collections.EMPTY_LIST;
        } else {
            this.f38043 = null;
            c14473.m34945();
        }
        this.f38045 &= -3;
        this.f38040 = null;
        C9998 c9998 = this.f38046;
        if (c9998 != null) {
            c9998.m25851();
            this.f38046 = null;
        }
        C14473 c14474 = this.f38047;
        if (c14474 == null) {
            this.f38044 = Collections.EMPTY_LIST;
        } else {
            this.f38044 = null;
            c14474.m34945();
        }
        this.f38045 &= -9;
        this.f38042 = C1072.m4023();
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40307;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C16250.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C16250.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C16250 c16250BuildPartial = buildPartial();
        if (c16250BuildPartial.isInitialized()) {
            return c16250BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c16250BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C16250 c16250BuildPartial = buildPartial();
        if (c16250BuildPartial.isInitialized()) {
            return c16250BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c16250BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C16250 buildPartial() {
        C20726 c20726;
        int i = 0;
        C16250 c16250 = new C16250(this, 0);
        C14473 c14473 = this.f38041;
        if (c14473 != null) {
            c16250.f52804 = c14473.m34950();
        } else {
            if ((this.f38045 & 2) != 0) {
                this.f38043 = C4681.unmodifiableList(this.f38043);
                this.f38045 &= -3;
            }
            c16250.f52804 = this.f38043;
        }
        C14473 c14474 = this.f38047;
        if (c14474 != null) {
            c16250.f52807 = c14474.m34950();
        } else {
            if ((this.f38045 & 8) != 0) {
                this.f38044 = C4681.unmodifiableList(this.f38044);
                this.f38045 &= -9;
            }
            c16250.f52807 = this.f38044;
        }
        int i2 = this.f38045;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c16250.f52806 = this.f38048;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f38046;
                if (c9998 == null) {
                    c20726 = this.f38040;
                } else {
                    c20726 = (C20726) c9998.m25854();
                }
                c16250.f52802 = c20726;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f38042.mo23372();
                c16250.f52803 = this.f38042;
            }
            c16250.f52805 = i | c16250.f52805;
        }
        onBuilt();
        return c16250;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C16250) {
            m29552((C16250) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C16250) {
            m29552((C16250) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29552(C16250 c16250) {
        C20726 c20726;
        if (c16250 == C16250.getDefaultInstance()) {
            return;
        }
        if (c16250.hasName()) {
            this.f38048 = c16250.f52806;
            this.f38045 |= 1;
            onChanged();
        }
        if (this.f38041 == null) {
            if (!c16250.f52804.isEmpty()) {
                if (this.f38043.isEmpty()) {
                    this.f38043 = c16250.f52804;
                    this.f38045 &= -3;
                } else {
                    if ((this.f38045 & 2) == 0) {
                        this.f38043 = new ArrayList(this.f38043);
                        this.f38045 |= 2;
                    }
                    this.f38043.addAll(c16250.f52804);
                }
                onChanged();
            }
        } else if (!c16250.f52804.isEmpty()) {
            if (!this.f38041.m34938()) {
                this.f38041.m34942(c16250.f52804);
            } else {
                this.f38041.m34954();
                this.f38041 = null;
                this.f38043 = c16250.f52804;
                this.f38045 &= -3;
                this.f38041 = AbstractC9035.alwaysUseFieldBuilders ? m29549() : null;
            }
        }
        if (c16250.m38565()) {
            C20726 c20726M38564 = c16250.m38564();
            C9998 c9998 = this.f38046;
            if (c9998 == null) {
                if ((this.f38045 & 4) == 0 || (c20726 = this.f38040) == null || c20726 == C20726.getDefaultInstance()) {
                    this.f38040 = c20726M38564;
                } else {
                    this.f38045 |= 4;
                    onChanged();
                    ((C3572) m29550().m25856()).m11621(c20726M38564);
                }
            } else {
                c9998.m25850(c20726M38564);
            }
            if (this.f38040 != null) {
                this.f38045 |= 4;
                onChanged();
            }
        }
        if (this.f38047 == null) {
            if (!c16250.f52807.isEmpty()) {
                if (this.f38044.isEmpty()) {
                    this.f38044 = c16250.f52807;
                    this.f38045 &= -9;
                } else {
                    if ((this.f38045 & 8) == 0) {
                        this.f38044 = new ArrayList(this.f38044);
                        this.f38045 |= 8;
                    }
                    this.f38044.addAll(c16250.f52807);
                }
                onChanged();
            }
        } else if (!c16250.f52807.isEmpty()) {
            if (!this.f38047.m34938()) {
                this.f38047.m34942(c16250.f52807);
            } else {
                this.f38047.m34954();
                this.f38047 = null;
                this.f38044 = c16250.f52807;
                this.f38045 &= -9;
                this.f38047 = AbstractC9035.alwaysUseFieldBuilders ? m29548() : null;
            }
        }
        if (!c16250.f52803.isEmpty()) {
            if (this.f38042.isEmpty()) {
                this.f38042 = c16250.f52803;
                this.f38045 |= 16;
            } else {
                if (!this.f38042.mo23371()) {
                    this.f38042 = new C1072(this.f38042);
                }
                this.f38045 |= 16;
                this.f38042.addAll(c16250.f52803);
            }
            onChanged();
        }
        mo2317mergeUnknownFields(c16250.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C11775 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f38048 = abstractC3660.mo11890();
                            this.f38045 |= 1;
                        } else if (iMo11876 == 18) {
                            C24456 c24456 = (C24456) abstractC3660.mo11877(C24456.parser(), c24215);
                            C14473 c14473 = this.f38041;
                            if (c14473 != null) {
                                c14473.m34953(c24456);
                            } else {
                                if ((this.f38045 & 2) == 0) {
                                    this.f38043 = new ArrayList(this.f38043);
                                    this.f38045 |= 2;
                                }
                                this.f38043.add(c24456);
                            }
                        } else if (iMo11876 == 26) {
                            abstractC3660.mo11881(m29550().m25856(), c24215);
                            this.f38045 |= 4;
                        } else if (iMo11876 == 34) {
                            C17742 c17742 = (C17742) abstractC3660.mo11877(C17742.parser(), c24215);
                            C14473 c14474 = this.f38047;
                            if (c14474 != null) {
                                c14474.m34953(c17742);
                            } else {
                                if ((this.f38045 & 8) == 0) {
                                    this.f38044 = new ArrayList(this.f38044);
                                    this.f38045 |= 8;
                                }
                                this.f38044.add(c17742);
                            }
                        } else if (iMo11876 == 42) {
                            AbstractC17084 abstractC17084Mo11890 = abstractC3660.mo11890();
                            if (!this.f38042.mo23371()) {
                                this.f38042 = new C1072(this.f38042);
                            }
                            this.f38045 |= 16;
                            this.f38042.mo4028(abstractC17084Mo11890);
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
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int iM34948;
        C20726 defaultInstance;
        C24456 c24456;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f38041;
            if (c14473 == null) {
                iM34948 = this.f38043.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i < iM34948) {
                C14473 c14474 = this.f38041;
                if (c14474 == null) {
                    c24456 = (C24456) this.f38043.get(i);
                } else {
                    c24456 = (C24456) c14474.m34951(i);
                }
                if (!c24456.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f38045 & 4) == 0) {
                    return true;
                }
                C9998 c9998 = this.f38046;
                if (c9998 == null) {
                    defaultInstance = this.f38040;
                    if (defaultInstance == null) {
                        defaultInstance = C20726.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C20726) c9998.m25853();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C14473 m29549() {
        if (this.f38041 == null) {
            this.f38041 = new C14473(this.f38043, (this.f38045 & 2) != 0, getParentForChildren(), isClean());
            this.f38043 = null;
        }
        return this.f38041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m29550() {
        C20726 defaultInstance;
        C9998 c9998 = this.f38046;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f38040;
                if (defaultInstance == null) {
                    defaultInstance = C20726.getDefaultInstance();
                }
            } else {
                defaultInstance = (C20726) c9998.m25853();
            }
            this.f38046 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f38040 = null;
        }
        return this.f38046;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C14473 m29548() {
        if (this.f38047 == null) {
            this.f38047 = new C14473(this.f38044, (this.f38045 & 8) != 0, getParentForChildren(), isClean());
            this.f38044 = null;
        }
        return this.f38047;
    }
}
