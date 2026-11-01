package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16026 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f51857;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f51858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23539 f51859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15135 f51860;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22190 f51861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51862;

    public C16026(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f51858 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m38003();
            m38004();
        }
    }

    public /* synthetic */ C16026(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m38007();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m38007();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m38007();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m38007();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m38007();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m38005(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m38005(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m38005(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m38005(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46284;
        c6956.m18696(C20259.class, C16026.class);
        return c6956;
    }

    public C16026() {
        this.f51858 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m38003();
            m38004();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38007() {
        super.mo2777clear();
        this.f51862 = 0;
        this.f51859 = null;
        C15135 c15135 = this.f51860;
        if (c15135 != null) {
            c15135.m36296();
            this.f51860 = null;
        }
        this.f51857 = false;
        C22190 c22190 = this.f51861;
        if (c22190 == null) {
            this.f51858 = Collections.EMPTY_LIST;
        } else {
            this.f51858 = null;
            c22190.m49245();
        }
        this.f51862 &= -5;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46291;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C20259.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C20259.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C20259 c20259BuildPartial = buildPartial();
        if (c20259BuildPartial.isInitialized()) {
            return c20259BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c20259BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C20259 c20259BuildPartial = buildPartial();
        if (c20259BuildPartial.isInitialized()) {
            return c20259BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c20259BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C20259 buildPartial() {
        int i;
        C23539 c23539;
        C20259 c20259 = new C20259(this);
        C22190 c22190 = this.f51861;
        if (c22190 != null) {
            c20259.f65698 = c22190.m49248();
        } else {
            if ((this.f51862 & 4) != 0) {
                this.f51858 = C0561.unmodifiableList(this.f51858);
                this.f51862 &= -5;
            }
            c20259.f65698 = this.f51858;
        }
        int i2 = this.f51862;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C15135 c15135 = this.f51860;
                if (c15135 == null) {
                    c23539 = this.f51859;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c20259.f65697 = c23539;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c20259.f65695 = this.f51857;
                i |= 2;
            }
            c20259.f65699 = i | c20259.f65699;
        }
        onBuilt();
        return c20259;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C20259) {
            m38006((C20259) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C20259) {
            m38006((C20259) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38006(C20259 c20259) {
        C23539 c23539;
        if (c20259 == C20259.getDefaultInstance()) {
            return;
        }
        if (c20259.m45767()) {
            C23539 c23539M45766 = c20259.m45766();
            C15135 c15135 = this.f51860;
            if (c15135 == null) {
                if ((this.f51862 & 1) == 0 || (c23539 = this.f51859) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f51859 = c23539M45766;
                } else {
                    this.f51862 |= 1;
                    onChanged();
                    ((C19305) m38003().m36293()).m44291(c23539M45766);
                }
            } else {
                c15135.m36294(c23539M45766);
            }
            if (this.f51859 != null) {
                this.f51862 |= 1;
                onChanged();
            }
        }
        if (c20259.m45768()) {
            this.f51857 = c20259.m45769();
            this.f51862 |= 2;
            onChanged();
        }
        if (this.f51861 == null) {
            if (!c20259.f65698.isEmpty()) {
                if (this.f51858.isEmpty()) {
                    this.f51858 = c20259.f65698;
                    this.f51862 &= -5;
                } else {
                    if ((this.f51862 & 4) == 0) {
                        this.f51858 = new ArrayList(this.f51858);
                        this.f51862 |= 4;
                    }
                    this.f51858.addAll(c20259.f65698);
                }
                onChanged();
            }
        } else if (!c20259.f65698.isEmpty()) {
            if (!this.f51861.m49238()) {
                this.f51861.m49242(c20259.f65698);
            } else {
                this.f51861.m49236();
                this.f51861 = null;
                this.f51858 = c20259.f65698;
                this.f51862 &= -5;
                this.f51861 = AbstractC18245.alwaysUseFieldBuilders ? m38004() : null;
            }
        }
        m31299((AbstractC6229) c20259);
        mo2781mergeUnknownFields(c20259.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38005(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 264) {
                            this.f51857 = abstractC3262.mo6028();
                            this.f51862 |= 2;
                        } else if (iMo6048 == 274) {
                            abstractC3262.mo6027(m38003().m36293(), c2701);
                            this.f51862 |= 1;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f51861;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f51862 & 4) == 0) {
                                    this.f51858 = new ArrayList(this.f51858);
                                    this.f51862 |= 4;
                                }
                                this.f51858.add(c4923);
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
    @Override // l.AbstractC12580, l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int i;
        C22190 c22190;
        int iM49252;
        C22190 c22191;
        C4923 c4923;
        C23539 defaultInstance;
        if ((this.f51862 & 1) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f51861;
                if (c22190 == null) {
                    iM49252 = this.f51858.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f51861;
                if (c22191 == null) {
                    c4923 = (C4923) this.f51858.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f51860;
            if (c15135 == null) {
                defaultInstance = this.f51859;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f51861;
                    if (c22190 == null) {
                        iM49252 = this.f51858.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f51861;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f51858.get(i);
                    } else {
                        c4923 = (C4923) c22191.m49249(i);
                    }
                    if (!c4923.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C15135 m38003() {
        C23539 defaultInstance;
        C15135 c15135 = this.f51860;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f51859;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f51860 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f51859 = null;
        }
        return this.f51860;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C22190 m38004() {
        if (this.f51861 == null) {
            this.f51861 = new C22190(this.f51858, (this.f51862 & 4) != 0, getParentForChildren(), isClean());
            this.f51858 = null;
        }
        return this.f51861;
    }
}
