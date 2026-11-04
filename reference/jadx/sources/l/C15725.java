package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15725 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51154;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f51155;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f51157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14473 f51158;

    public /* synthetic */ C15725(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m37633();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m37633();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m37633();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m37633();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m37634(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m37634(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m37634(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m37634(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40264;
        c7544.m20621(C11996.class, C15725.class);
        return c7544;
    }

    public C15725() {
        this.f51157 = Collections.EMPTY_LIST;
        this.f51155 = 0;
        this.f51154 = 0;
    }

    public C15725(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f51157 = Collections.EMPTY_LIST;
        this.f51155 = 0;
        this.f51154 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37633() {
        super.mo2313clear();
        this.f51156 = 0;
        C14473 c14473 = this.f51158;
        if (c14473 == null) {
            this.f51157 = Collections.EMPTY_LIST;
        } else {
            this.f51157 = null;
            c14473.m34945();
        }
        this.f51156 &= -2;
        this.f51155 = 0;
        this.f51154 = 0;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40247;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C11996.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C11996.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C11996 c11996BuildPartial = buildPartial();
        if (c11996BuildPartial.isInitialized()) {
            return c11996BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c11996BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C11996 c11996BuildPartial = buildPartial();
        if (c11996BuildPartial.isInitialized()) {
            return c11996BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c11996BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C11996 buildPartial() {
        int i = 0;
        C11996 c11996 = new C11996(this, 0);
        C14473 c14473 = this.f51158;
        if (c14473 != null) {
            c11996.f38666 = c14473.m34950();
        } else {
            if ((this.f51156 & 1) != 0) {
                this.f51157 = C4681.unmodifiableList(this.f51157);
                this.f51156 &= -2;
            }
            c11996.f38666 = this.f51157;
        }
        int i2 = this.f51156;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c11996.f38663 = this.f51155;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c11996.f38665 = this.f51154;
                i |= 2;
            }
            c11996.f38664 = i | c11996.f38664;
        }
        onBuilt();
        return c11996;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C11996) {
            m37635((C11996) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C11996) {
            m37635((C11996) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37635(C11996 c11996) {
        if (c11996 == C11996.getDefaultInstance()) {
            return;
        }
        if (this.f51158 == null) {
            if (!c11996.f38666.isEmpty()) {
                if (this.f51157.isEmpty()) {
                    this.f51157 = c11996.f38666;
                    this.f51156 &= -2;
                } else {
                    if ((this.f51156 & 1) == 0) {
                        this.f51157 = new ArrayList(this.f51157);
                        this.f51156 |= 1;
                    }
                    this.f51157.addAll(c11996.f38666);
                }
                onChanged();
            }
        } else if (!c11996.f38666.isEmpty()) {
            if (!this.f51158.m34938()) {
                this.f51158.m34942(c11996.f38666);
            } else {
                this.f51158.m34954();
                C14473 c14473 = null;
                this.f51158 = null;
                List list = c11996.f38666;
                this.f51157 = list;
                this.f51156 &= -2;
                if (AbstractC9035.alwaysUseFieldBuilders) {
                    if (this.f51158 == null) {
                        this.f51158 = new C14473(list, false, getParentForChildren(), isClean());
                        this.f51157 = null;
                    }
                    c14473 = this.f51158;
                }
                this.f51158 = c14473;
            }
        }
        if (c11996.m30163()) {
            EnumC5810 enumC5810M30162 = c11996.m30162();
            enumC5810M30162.getClass();
            this.f51156 |= 2;
            this.f51155 = enumC5810M30162.getNumber();
            onChanged();
        }
        if (c11996.m30164()) {
            EnumC5810 enumC5810M30160 = c11996.m30160();
            enumC5810M30160.getClass();
            this.f51156 |= 4;
            this.f51154 = enumC5810M30160.getNumber();
            onChanged();
        }
        mo2317mergeUnknownFields(c11996.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37634(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            C20201 c20201 = (C20201) abstractC3660.mo11877(C20201.parser(), c24215);
                            C14473 c14473 = this.f51158;
                            if (c14473 != null) {
                                c14473.m34953(c20201);
                            } else {
                                if ((this.f51156 & 1) == 0) {
                                    this.f51157 = new ArrayList(this.f51157);
                                    this.f51156 |= 1;
                                }
                                this.f51157.add(c20201);
                            }
                        } else if (iMo11876 == 32) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11882) == null) {
                                mergeUnknownVarintField(4, iMo11882);
                            } else {
                                this.f51155 = iMo11882;
                                this.f51156 |= 2;
                            }
                        } else if (iMo11876 == 40) {
                            int iMo11883 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11883) == null) {
                                mergeUnknownVarintField(5, iMo11883);
                            } else {
                                this.f51154 = iMo11883;
                                this.f51156 |= 4;
                            }
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
        C20201 c20201;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f51158;
            if (c14473 == null) {
                iM34948 = this.f51157.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i >= iM34948) {
                return true;
            }
            C14473 c14474 = this.f51158;
            if (c14474 == null) {
                c20201 = (C20201) this.f51157.get(i);
            } else {
                c20201 = (C20201) c14474.m34951(i);
            }
            if (!c20201.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
