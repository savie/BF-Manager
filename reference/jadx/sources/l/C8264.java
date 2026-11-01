package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8264 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15135 f28726;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22190 f28727;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23539 f28728;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f28729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28730;

    public C8264(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f28729 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m21660();
            m21661();
        }
    }

    public /* synthetic */ C8264(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m21664();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m21664();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m21664();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m21664();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m21664();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m21662(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m21662(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m21662(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m21662(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46286;
        c6956.m18696(C19553.class, C8264.class);
        return c6956;
    }

    public C8264() {
        this.f28729 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m21660();
            m21661();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21664() {
        super.mo2777clear();
        this.f28730 = 0;
        this.f28728 = null;
        C15135 c15135 = this.f28726;
        if (c15135 != null) {
            c15135.m36296();
            this.f28726 = null;
        }
        C22190 c22190 = this.f28727;
        if (c22190 == null) {
            this.f28729 = Collections.EMPTY_LIST;
        } else {
            this.f28729 = null;
            c22190.m49245();
        }
        this.f28730 &= -3;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46313;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C19553.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C19553.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C19553 c19553BuildPartial = buildPartial();
        if (c19553BuildPartial.isInitialized()) {
            return c19553BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c19553BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C19553 c19553BuildPartial = buildPartial();
        if (c19553BuildPartial.isInitialized()) {
            return c19553BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c19553BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C19553 buildPartial() {
        C23539 c23539;
        C19553 c19553 = new C19553(this);
        C22190 c22190 = this.f28727;
        if (c22190 != null) {
            c19553.f62836 = c22190.m49248();
        } else {
            if ((this.f28730 & 2) != 0) {
                this.f28729 = C0561.unmodifiableList(this.f28729);
                this.f28730 &= -3;
            }
            c19553.f62836 = this.f28729;
        }
        int i = this.f28730;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C15135 c15135 = this.f28726;
                if (c15135 == null) {
                    c23539 = this.f28728;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c19553.f62835 = c23539;
            } else {
                i2 = 0;
            }
            c19553.f62838 = i2 | c19553.f62838;
        }
        onBuilt();
        return c19553;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C19553) {
            m21663((C19553) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C19553) {
            m21663((C19553) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21663(C19553 c19553) {
        C23539 c23539;
        if (c19553 == C19553.getDefaultInstance()) {
            return;
        }
        if (c19553.m44648()) {
            C23539 c23539M44649 = c19553.m44649();
            C15135 c15135 = this.f28726;
            if (c15135 == null) {
                if ((this.f28730 & 1) == 0 || (c23539 = this.f28728) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f28728 = c23539M44649;
                } else {
                    this.f28730 |= 1;
                    onChanged();
                    ((C19305) m21660().m36293()).m44291(c23539M44649);
                }
            } else {
                c15135.m36294(c23539M44649);
            }
            if (this.f28728 != null) {
                this.f28730 |= 1;
                onChanged();
            }
        }
        if (this.f28727 == null) {
            if (!c19553.f62836.isEmpty()) {
                if (this.f28729.isEmpty()) {
                    this.f28729 = c19553.f62836;
                    this.f28730 &= -3;
                } else {
                    if ((this.f28730 & 2) == 0) {
                        this.f28729 = new ArrayList(this.f28729);
                        this.f28730 |= 2;
                    }
                    this.f28729.addAll(c19553.f62836);
                }
                onChanged();
            }
        } else if (!c19553.f62836.isEmpty()) {
            if (!this.f28727.m49238()) {
                this.f28727.m49242(c19553.f62836);
            } else {
                this.f28727.m49236();
                this.f28727 = null;
                this.f28729 = c19553.f62836;
                this.f28730 &= -3;
                this.f28727 = AbstractC18245.alwaysUseFieldBuilders ? m21661() : null;
            }
        }
        m31299((AbstractC6229) c19553);
        mo2781mergeUnknownFields(c19553.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21662(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            abstractC3262.mo6027(m21660().m36293(), c2701);
                            this.f28730 |= 1;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f28727;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f28730 & 2) == 0) {
                                    this.f28729 = new ArrayList(this.f28729);
                                    this.f28730 |= 2;
                                }
                                this.f28729.add(c4923);
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
        if ((this.f28730 & 1) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f28727;
                if (c22190 == null) {
                    iM49252 = this.f28729.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f28727;
                if (c22191 == null) {
                    c4923 = (C4923) this.f28729.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f28726;
            if (c15135 == null) {
                defaultInstance = this.f28728;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f28727;
                    if (c22190 == null) {
                        iM49252 = this.f28729.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f28727;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f28729.get(i);
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
    private C15135 m21660() {
        C23539 defaultInstance;
        C15135 c15135 = this.f28726;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f28728;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f28726 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f28728 = null;
        }
        return this.f28726;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C22190 m21661() {
        if (this.f28727 == null) {
            this.f28727 = new C22190(this.f28729, (this.f28730 & 2) != 0, getParentForChildren(), isClean());
            this.f28729 = null;
        }
        return this.f28727;
    }
}
