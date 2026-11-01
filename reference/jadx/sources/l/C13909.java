package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13909 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45812;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f45813;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f45814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45815;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f45816;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22190 f45817;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f45818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23539 f45819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45820;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f45821;

    public C13909(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f45813 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m33741();
            m33742();
        }
    }

    public /* synthetic */ C13909(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m33746();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m33746();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m33746();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m33746();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m33746();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m33745(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m33745(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m33745(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m33745(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46298;
        c6956.m18696(C11792.class, C13909.class);
        return c6956;
    }

    public C13909() {
        this.f45813 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m33741();
            m33742();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33746() {
        super.mo2777clear();
        this.f45820 = 0;
        this.f45815 = false;
        this.f45821 = false;
        this.f45818 = false;
        this.f45814 = false;
        this.f45812 = false;
        this.f45819 = null;
        C15135 c15135 = this.f45816;
        if (c15135 != null) {
            c15135.m36296();
            this.f45816 = null;
        }
        C22190 c22190 = this.f45817;
        if (c22190 == null) {
            this.f45813 = Collections.EMPTY_LIST;
        } else {
            this.f45813 = null;
            c22190.m49245();
        }
        this.f45820 &= -65;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46268;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C11792.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C11792.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C11792 c11792BuildPartial = buildPartial();
        if (c11792BuildPartial.isInitialized()) {
            return c11792BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11792BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C11792 c11792BuildPartial = buildPartial();
        if (c11792BuildPartial.isInitialized()) {
            return c11792BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11792BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C11792 buildPartial() {
        int i;
        C23539 c23539;
        C11792 c11792 = new C11792(this);
        C22190 c22190 = this.f45817;
        if (c22190 != null) {
            c11792.f39591 = c22190.m49248();
        } else {
            if ((this.f45820 & 64) != 0) {
                this.f45813 = C0561.unmodifiableList(this.f45813);
                this.f45820 &= -65;
            }
            c11792.f39591 = this.f45813;
        }
        int i2 = this.f45820;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c11792.f39589 = this.f45815;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c11792.f39595 = this.f45821;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c11792.f39592 = this.f45818;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c11792.f39593 = this.f45814;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c11792.f39587 = this.f45812;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C15135 c15135 = this.f45816;
                if (c15135 == null) {
                    c23539 = this.f45819;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c11792.f39590 = c23539;
                i |= 32;
            }
            c11792.f39594 = i | c11792.f39594;
        }
        onBuilt();
        return c11792;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11792) {
            m33744((C11792) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11792) {
            m33744((C11792) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13909 m33744(C11792 c11792) {
        C23539 c23539;
        if (c11792 == C11792.getDefaultInstance()) {
            return this;
        }
        if (c11792.m29474()) {
            this.f45815 = c11792.m29472();
            this.f45820 |= 1;
            onChanged();
        }
        if (c11792.m29470()) {
            this.f45821 = c11792.m29466();
            this.f45820 |= 2;
            onChanged();
        }
        if (c11792.m29473()) {
            this.f45818 = c11792.m29476();
            this.f45820 |= 4;
            onChanged();
        }
        if (c11792.m29465()) {
            this.f45814 = c11792.m29471();
            this.f45820 |= 8;
            onChanged();
        }
        if (c11792.m29467()) {
            this.f45812 = c11792.m29469();
            this.f45820 |= 16;
            onChanged();
        }
        if (c11792.m29468()) {
            C23539 c23539M29475 = c11792.m29475();
            C15135 c15135 = this.f45816;
            if (c15135 == null) {
                if ((this.f45820 & 32) == 0 || (c23539 = this.f45819) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f45819 = c23539M29475;
                } else {
                    this.f45820 |= 32;
                    onChanged();
                    ((C19305) m33741().m36293()).m44291(c23539M29475);
                }
            } else {
                c15135.m36294(c23539M29475);
            }
            if (this.f45819 != null) {
                this.f45820 |= 32;
                onChanged();
            }
        }
        if (this.f45817 == null) {
            if (!c11792.f39591.isEmpty()) {
                if (this.f45813.isEmpty()) {
                    this.f45813 = c11792.f39591;
                    this.f45820 &= -65;
                } else {
                    if ((this.f45820 & 64) == 0) {
                        this.f45813 = new ArrayList(this.f45813);
                        this.f45820 |= 64;
                    }
                    this.f45813.addAll(c11792.f39591);
                }
                onChanged();
            }
        } else if (!c11792.f39591.isEmpty()) {
            if (!this.f45817.m49238()) {
                this.f45817.m49242(c11792.f39591);
            } else {
                this.f45817.m49236();
                this.f45817 = null;
                this.f45813 = c11792.f39591;
                this.f45820 &= -65;
                this.f45817 = AbstractC18245.alwaysUseFieldBuilders ? m33742() : null;
            }
        }
        m31299((AbstractC6229) c11792);
        mo2781mergeUnknownFields(c11792.getUnknownFields());
        onChanged();
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33745(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f45815 = abstractC3262.mo6028();
                            this.f45820 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f45821 = abstractC3262.mo6028();
                            this.f45820 |= 2;
                        } else if (iMo6048 == 24) {
                            this.f45818 = abstractC3262.mo6028();
                            this.f45820 |= 4;
                        } else if (iMo6048 == 56) {
                            this.f45814 = abstractC3262.mo6028();
                            this.f45820 |= 8;
                        } else if (iMo6048 == 88) {
                            this.f45812 = abstractC3262.mo6028();
                            this.f45820 |= 16;
                        } else if (iMo6048 == 98) {
                            abstractC3262.mo6027(m33741().m36293(), c2701);
                            this.f45820 |= 32;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f45817;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f45820 & 64) == 0) {
                                    this.f45813 = new ArrayList(this.f45813);
                                    this.f45820 |= 64;
                                }
                                this.f45813.add(c4923);
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
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[EDGE_INSN: B:33:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // l.AbstractC12580, l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int i;
        C22190 c22190;
        int iM49252;
        C22190 c22191;
        C4923 c4923;
        C23539 defaultInstance;
        if ((this.f45820 & 32) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f45817;
                if (c22190 == null) {
                    iM49252 = this.f45813.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f45817;
                if (c22191 == null) {
                    c4923 = (C4923) this.f45813.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f45816;
            if (c15135 == null) {
                defaultInstance = this.f45819;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f45817;
                    if (c22190 == null) {
                        iM49252 = this.f45813.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f45817;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f45813.get(i);
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
    public final void m33743() {
        this.f45820 &= -33;
        this.f45819 = null;
        C15135 c15135 = this.f45816;
        if (c15135 != null) {
            c15135.m36296();
            this.f45816 = null;
        }
        onChanged();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C15135 m33741() {
        C23539 defaultInstance;
        C15135 c15135 = this.f45816;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f45819;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f45816 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f45819 = null;
        }
        return this.f45816;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C22190 m33742() {
        if (this.f45817 == null) {
            this.f45817 = new C22190(this.f45813, (this.f45820 & 64) != 0, getParentForChildren(), isClean());
            this.f45813 = null;
        }
        return this.f45817;
    }
}
