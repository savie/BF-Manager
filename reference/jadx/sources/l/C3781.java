package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3781 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22190 f13649;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22190 f13650;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f13651;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f13652;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f13653;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23539 f13654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13655;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13656;

    public C3781(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        List list = Collections.EMPTY_LIST;
        this.f13651 = list;
        this.f13653 = list;
        this.f13656 = 1;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m11031();
            m11029();
            m11030();
        }
    }

    public /* synthetic */ C3781(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m11033();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m11033();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m11033();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m11033();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m11033();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46304;
        c6956.m18696(C18599.class, C3781.class);
        return c6956;
    }

    public C3781() {
        List list = Collections.EMPTY_LIST;
        this.f13651 = list;
        this.f13653 = list;
        this.f13656 = 1;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m11031();
            m11029();
            m11030();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11033() {
        super.mo2777clear();
        this.f13655 = 0;
        C22190 c22190 = this.f13650;
        if (c22190 == null) {
            this.f13651 = Collections.EMPTY_LIST;
        } else {
            this.f13651 = null;
            c22190.m49245();
        }
        this.f13655 &= -2;
        C22190 c22191 = this.f13649;
        if (c22191 == null) {
            this.f13653 = Collections.EMPTY_LIST;
        } else {
            this.f13653 = null;
            c22191.m49245();
        }
        this.f13655 &= -3;
        this.f13654 = null;
        C15135 c15135 = this.f13652;
        if (c15135 != null) {
            c15135.m36296();
            this.f13652 = null;
        }
        this.f13656 = 1;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46318;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C18599.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C18599.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C18599 c18599BuildPartial = buildPartial();
        if (c18599BuildPartial.isInitialized()) {
            return c18599BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c18599BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C18599 c18599BuildPartial = buildPartial();
        if (c18599BuildPartial.isInitialized()) {
            return c18599BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c18599BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C18599 buildPartial() {
        C23539 c23539;
        C18599 c18599 = new C18599(this);
        C22190 c22190 = this.f13650;
        int i = 1;
        if (c22190 != null) {
            c18599.f59173 = c22190.m49248();
        } else {
            if ((this.f13655 & 1) != 0) {
                this.f13651 = C0561.unmodifiableList(this.f13651);
                this.f13655 &= -2;
            }
            c18599.f59173 = this.f13651;
        }
        C22190 c22191 = this.f13649;
        if (c22191 != null) {
            c18599.f59169 = c22191.m49248();
        } else {
            if ((this.f13655 & 2) != 0) {
                this.f13653 = C0561.unmodifiableList(this.f13653);
                this.f13655 &= -3;
            }
            c18599.f59169 = this.f13653;
        }
        int i2 = this.f13655;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f13652;
                if (c15135 == null) {
                    c23539 = this.f13654;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c18599.f59172 = c23539;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                c18599.f59170 = this.f13656;
                i |= 2;
            }
            c18599.f59174 = i | c18599.f59174;
        }
        onBuilt();
        return c18599;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C18599) {
            m11032((C18599) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C18599) {
            m11032((C18599) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11032(C18599 c18599) {
        C23539 c23539;
        if (c18599 == C18599.getDefaultInstance()) {
            return;
        }
        if (this.f13650 == null) {
            if (!c18599.f59173.isEmpty()) {
                if (this.f13651.isEmpty()) {
                    this.f13651 = c18599.f59173;
                    this.f13655 &= -2;
                } else {
                    if ((this.f13655 & 1) == 0) {
                        this.f13651 = new ArrayList(this.f13651);
                        this.f13655 |= 1;
                    }
                    this.f13651.addAll(c18599.f59173);
                }
                onChanged();
            }
        } else if (!c18599.f59173.isEmpty()) {
            if (!this.f13650.m49238()) {
                this.f13650.m49242(c18599.f59173);
            } else {
                this.f13650.m49236();
                this.f13650 = null;
                this.f13651 = c18599.f59173;
                this.f13655 &= -2;
                this.f13650 = AbstractC18245.alwaysUseFieldBuilders ? m11031() : null;
            }
        }
        if (this.f13649 == null) {
            if (!c18599.f59169.isEmpty()) {
                if (this.f13653.isEmpty()) {
                    this.f13653 = c18599.f59169;
                    this.f13655 &= -3;
                } else {
                    if ((this.f13655 & 2) == 0) {
                        this.f13653 = new ArrayList(this.f13653);
                        this.f13655 |= 2;
                    }
                    this.f13653.addAll(c18599.f59169);
                }
                onChanged();
            }
        } else if (!c18599.f59169.isEmpty()) {
            if (!this.f13649.m49238()) {
                this.f13649.m49242(c18599.f59169);
            } else {
                this.f13649.m49236();
                this.f13649 = null;
                this.f13653 = c18599.f59169;
                this.f13655 &= -3;
                this.f13649 = AbstractC18245.alwaysUseFieldBuilders ? m11029() : null;
            }
        }
        if (c18599.m43007()) {
            C23539 c23539M43008 = c18599.m43008();
            C15135 c15135 = this.f13652;
            if (c15135 == null) {
                if ((this.f13655 & 4) == 0 || (c23539 = this.f13654) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f13654 = c23539M43008;
                } else {
                    this.f13655 |= 4;
                    onChanged();
                    ((C19305) m11030().m36293()).m44291(c23539M43008);
                }
            } else {
                c15135.m36294(c23539M43008);
            }
            if (this.f13654 != null) {
                this.f13655 |= 4;
                onChanged();
            }
        }
        if (c18599.m43006()) {
            EnumC17893 enumC17893M43005 = c18599.m43005();
            enumC17893M43005.getClass();
            this.f13655 |= 8;
            this.f13656 = enumC17893M43005.getNumber();
            onChanged();
        }
        m31299((AbstractC6229) c18599);
        mo2781mergeUnknownFields(c18599.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C3781 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 18) {
                            C15072 c15072 = (C15072) abstractC3262.mo6024(C15072.parser(), c2701);
                            C22190 c22190 = this.f13649;
                            if (c22190 != null) {
                                c22190.m49251(c15072);
                            } else {
                                if ((this.f13655 & 2) == 0) {
                                    this.f13653 = new ArrayList(this.f13653);
                                    this.f13655 |= 2;
                                }
                                this.f13653.add(c15072);
                            }
                        } else if (iMo6048 == 24) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC17893.m41521(iMo6037) == null) {
                                mergeUnknownVarintField(3, iMo6037);
                            } else {
                                this.f13656 = iMo6037;
                                this.f13655 |= 8;
                            }
                        } else if (iMo6048 == 402) {
                            abstractC3262.mo6027(m11030().m36293(), c2701);
                            this.f13655 |= 4;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22191 = this.f13650;
                            if (c22191 != null) {
                                c22191.m49251(c4923);
                            } else {
                                if ((this.f13655 & 1) == 0) {
                                    this.f13651 = new ArrayList(this.f13651);
                                    this.f13655 |= 1;
                                }
                                this.f13651.add(c4923);
                            }
                        } else if (!parseUnknownField(abstractC3262, c2701, iMo6048)) {
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
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    @Override // l.AbstractC12580, l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int iM49252;
        C23539 defaultInstance;
        C4923 c4923;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f13650;
            if (c22190 == null) {
                iM49252 = this.f13651.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i < iM49252) {
                C22190 c22191 = this.f13650;
                if (c22191 == null) {
                    c4923 = (C4923) this.f13651.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f13655 & 4) == 0) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                C15135 c15135 = this.f13652;
                if (c15135 == null) {
                    defaultInstance = this.f13654;
                    if (defaultInstance == null) {
                        defaultInstance = C23539.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C23539) c15135.m36295();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                if (!m31301()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C22190 m11031() {
        if (this.f13650 == null) {
            this.f13650 = new C22190(this.f13651, (this.f13655 & 1) != 0, getParentForChildren(), isClean());
            this.f13651 = null;
        }
        return this.f13650;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C22190 m11029() {
        if (this.f13649 == null) {
            this.f13649 = new C22190(this.f13653, (this.f13655 & 2) != 0, getParentForChildren(), isClean());
            this.f13653 = null;
        }
        return this.f13649;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C15135 m11030() {
        C23539 defaultInstance;
        C15135 c15135 = this.f13652;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f13654;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f13652 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f13654 = null;
        }
        return this.f13652;
    }
}
