package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1665 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f6632;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f6633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6634;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22190 f6636;

    public /* synthetic */ C1665(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m5568();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m5568();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m5568();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m5568();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m5569(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m5569(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m5569(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m5569(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46295;
        c6956.m18696(C14139.class, C1665.class);
        return c6956;
    }

    public C1665() {
        this.f6632 = Collections.EMPTY_LIST;
        this.f6633 = 0;
        this.f6635 = 0;
    }

    public C1665(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f6632 = Collections.EMPTY_LIST;
        this.f6633 = 0;
        this.f6635 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5568() {
        super.mo2777clear();
        this.f6634 = 0;
        C22190 c22190 = this.f6636;
        if (c22190 == null) {
            this.f6632 = Collections.EMPTY_LIST;
        } else {
            this.f6632 = null;
            c22190.m49245();
        }
        this.f6634 &= -2;
        this.f6633 = 0;
        this.f6635 = 0;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46306;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C14139.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C14139.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C14139 c14139BuildPartial = buildPartial();
        if (c14139BuildPartial.isInitialized()) {
            return c14139BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c14139BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C14139 c14139BuildPartial = buildPartial();
        if (c14139BuildPartial.isInitialized()) {
            return c14139BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c14139BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C14139 buildPartial() {
        int i = 0;
        C14139 c14139 = new C14139(this, 0);
        C22190 c22190 = this.f6636;
        if (c22190 != null) {
            c14139.f46405 = c22190.m49248();
        } else {
            if ((this.f6634 & 1) != 0) {
                this.f6632 = C0561.unmodifiableList(this.f6632);
                this.f6634 &= -2;
            }
            c14139.f46405 = this.f6632;
        }
        int i2 = this.f6634;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c14139.f46402 = this.f6633;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c14139.f46401 = this.f6635;
                i |= 2;
            }
            c14139.f46403 = i | c14139.f46403;
        }
        onBuilt();
        return c14139;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C14139) {
            m5570((C14139) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C14139) {
            m5570((C14139) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5570(C14139 c14139) {
        if (c14139 == C14139.getDefaultInstance()) {
            return;
        }
        if (this.f6636 == null) {
            if (!c14139.f46405.isEmpty()) {
                if (this.f6632.isEmpty()) {
                    this.f6632 = c14139.f46405;
                    this.f6634 &= -2;
                } else {
                    if ((this.f6634 & 1) == 0) {
                        this.f6632 = new ArrayList(this.f6632);
                        this.f6634 |= 1;
                    }
                    this.f6632.addAll(c14139.f46405);
                }
                onChanged();
            }
        } else if (!c14139.f46405.isEmpty()) {
            if (!this.f6636.m49238()) {
                this.f6636.m49242(c14139.f46405);
            } else {
                this.f6636.m49236();
                C22190 c22190 = null;
                this.f6636 = null;
                List list = c14139.f46405;
                this.f6632 = list;
                this.f6634 &= -2;
                if (AbstractC18245.alwaysUseFieldBuilders) {
                    if (this.f6636 == null) {
                        this.f6636 = new C22190(list, false, getParentForChildren(), isClean());
                        this.f6632 = null;
                    }
                    c22190 = this.f6636;
                }
                this.f6636 = c22190;
            }
        }
        if (c14139.m34188()) {
            EnumC12167 enumC12167M34186 = c14139.m34186();
            enumC12167M34186.getClass();
            this.f6634 |= 2;
            this.f6633 = enumC12167M34186.getNumber();
            onChanged();
        }
        if (c14139.m34189()) {
            EnumC12167 enumC12167M34185 = c14139.m34185();
            enumC12167M34185.getClass();
            this.f6634 |= 4;
            this.f6635 = enumC12167M34185.getNumber();
            onChanged();
        }
        mo2781mergeUnknownFields(c14139.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5569(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            C4965 c4965 = (C4965) abstractC3262.mo6024(C4965.parser(), c2701);
                            C22190 c22190 = this.f6636;
                            if (c22190 != null) {
                                c22190.m49251(c4965);
                            } else {
                                if ((this.f6634 & 1) == 0) {
                                    this.f6632 = new ArrayList(this.f6632);
                                    this.f6634 |= 1;
                                }
                                this.f6632.add(c4965);
                            }
                        } else if (iMo6048 == 32) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6037) == null) {
                                mergeUnknownVarintField(4, iMo6037);
                            } else {
                                this.f6633 = iMo6037;
                                this.f6634 |= 2;
                            }
                        } else if (iMo6048 == 40) {
                            int iMo6038 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6038) == null) {
                                mergeUnknownVarintField(5, iMo6038);
                            } else {
                                this.f6635 = iMo6038;
                                this.f6634 |= 4;
                            }
                        } else if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                        }
                    }
                    z = true;
                } catch (C4529 e) {
                    throw e.m12650();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int iM49252;
        C4965 c4965;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f6636;
            if (c22190 == null) {
                iM49252 = this.f6632.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i >= iM49252) {
                return true;
            }
            C22190 c22191 = this.f6636;
            if (c22191 == null) {
                c4965 = (C4965) this.f6632.get(i);
            } else {
                c4965 = (C4965) c22191.m49249(i);
            }
            if (!c4965.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
