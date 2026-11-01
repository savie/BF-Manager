package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22127 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f71634;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15135 f71635;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23539 f71636;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f71637;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f71638;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f71639;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10611 f71640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71641;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22190 f71642;

    public C22127(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f71638 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m49088();
            m49087();
            m49089();
        }
    }

    public /* synthetic */ C22127(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m49091();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m49091();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m49091();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m49091();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m49091();
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
        C6956 c6956 = C14097.f46287;
        c6956.m18696(C0959.class, C22127.class);
        return c6956;
    }

    public C22127() {
        this.f71638 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m49088();
            m49087();
            m49089();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m49091() {
        super.mo2777clear();
        this.f71641 = 0;
        this.f71639 = false;
        this.f71636 = null;
        C15135 c15135 = this.f71635;
        if (c15135 != null) {
            c15135.m36296();
            this.f71635 = null;
        }
        this.f71634 = false;
        this.f71640 = null;
        C15135 c15136 = this.f71637;
        if (c15136 != null) {
            c15136.m36296();
            this.f71637 = null;
        }
        C22190 c22190 = this.f71642;
        if (c22190 == null) {
            this.f71638 = Collections.EMPTY_LIST;
        } else {
            this.f71638 = null;
            c22190.m49245();
        }
        this.f71641 &= -17;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46314;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C0959.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C0959.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C0959 c0959BuildPartial = buildPartial();
        if (c0959BuildPartial.isInitialized()) {
            return c0959BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c0959BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C0959 c0959BuildPartial = buildPartial();
        if (c0959BuildPartial.isInitialized()) {
            return c0959BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c0959BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C0959 buildPartial() {
        int i;
        C10611 c10611;
        C23539 c23539;
        C0959 c0959 = new C0959(this);
        C22190 c22190 = this.f71642;
        if (c22190 != null) {
            c0959.f3778 = c22190.m49248();
        } else {
            if ((this.f71641 & 16) != 0) {
                this.f71638 = C0561.unmodifiableList(this.f71638);
                this.f71641 &= -17;
            }
            c0959.f3778 = this.f71638;
        }
        int i2 = this.f71641;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c0959.f3780 = this.f71639;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C15135 c15135 = this.f71635;
                if (c15135 == null) {
                    c23539 = this.f71636;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c0959.f3781 = c23539;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c0959.f3776 = this.f71634;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15135 c15136 = this.f71637;
                if (c15136 == null) {
                    c10611 = this.f71640;
                } else {
                    c10611 = (C10611) c15136.m36297();
                }
                c0959.f3779 = c10611;
                i |= 8;
            }
            c0959.f3782 = i | c0959.f3782;
        }
        onBuilt();
        return c0959;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C0959) {
            m49090((C0959) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C0959) {
            m49090((C0959) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49090(C0959 c0959) {
        C10611 c10611;
        C23539 c23539;
        if (c0959 == C0959.getDefaultInstance()) {
            return;
        }
        if (c0959.m3729()) {
            this.f71639 = c0959.m3731();
            this.f71641 |= 1;
            onChanged();
        }
        if (c0959.m3730()) {
            C23539 c23539M3732 = c0959.m3732();
            C15135 c15135 = this.f71635;
            if (c15135 == null) {
                if ((this.f71641 & 2) == 0 || (c23539 = this.f71636) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f71636 = c23539M3732;
                } else {
                    this.f71641 |= 2;
                    onChanged();
                    ((C19305) m49088().m36293()).m44291(c23539M3732);
                }
            } else {
                c15135.m36294(c23539M3732);
            }
            if (this.f71636 != null) {
                this.f71641 |= 2;
                onChanged();
            }
        }
        if (c0959.m3733()) {
            this.f71634 = c0959.m3736();
            this.f71641 |= 4;
            onChanged();
        }
        if (c0959.m3734()) {
            C10611 c10611M3735 = c0959.m3735();
            C15135 c15136 = this.f71637;
            if (c15136 == null) {
                if ((this.f71641 & 8) == 0 || (c10611 = this.f71640) == null || c10611 == C10611.getDefaultInstance()) {
                    this.f71640 = c10611M3735;
                } else {
                    this.f71641 |= 8;
                    onChanged();
                    ((C9200) m49087().m36293()).m23661(c10611M3735);
                }
            } else {
                c15136.m36294(c10611M3735);
            }
            if (this.f71640 != null) {
                this.f71641 |= 8;
                onChanged();
            }
        }
        if (this.f71642 == null) {
            if (!c0959.f3778.isEmpty()) {
                if (this.f71638.isEmpty()) {
                    this.f71638 = c0959.f3778;
                    this.f71641 &= -17;
                } else {
                    if ((this.f71641 & 16) == 0) {
                        this.f71638 = new ArrayList(this.f71638);
                        this.f71641 |= 16;
                    }
                    this.f71638.addAll(c0959.f3778);
                }
                onChanged();
            }
        } else if (!c0959.f3778.isEmpty()) {
            if (!this.f71642.m49238()) {
                this.f71642.m49242(c0959.f3778);
            } else {
                this.f71642.m49236();
                this.f71642 = null;
                this.f71638 = c0959.f3778;
                this.f71641 &= -17;
                this.f71642 = AbstractC18245.alwaysUseFieldBuilders ? m49089() : null;
            }
        }
        m31299((AbstractC6229) c0959);
        mo2781mergeUnknownFields(c0959.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C22127 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f71639 = abstractC3262.mo6028();
                            this.f71641 |= 1;
                        } else if (iMo6048 == 18) {
                            abstractC3262.mo6027(m49088().m36293(), c2701);
                            this.f71641 |= 2;
                        } else if (iMo6048 == 24) {
                            this.f71634 = abstractC3262.mo6028();
                            this.f71641 |= 4;
                        } else if (iMo6048 == 34) {
                            abstractC3262.mo6027(m49087().m36293(), c2701);
                            this.f71641 |= 8;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f71642;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f71641 & 16) == 0) {
                                    this.f71638 = new ArrayList(this.f71638);
                                    this.f71641 |= 16;
                                }
                                this.f71638.add(c4923);
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
        if ((this.f71641 & 2) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f71642;
                if (c22190 == null) {
                    iM49252 = this.f71638.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f71642;
                if (c22191 == null) {
                    c4923 = (C4923) this.f71638.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f71635;
            if (c15135 == null) {
                defaultInstance = this.f71636;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f71642;
                    if (c22190 == null) {
                        iM49252 = this.f71638.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f71642;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f71638.get(i);
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C15135 m49088() {
        C23539 defaultInstance;
        C15135 c15135 = this.f71635;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f71636;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f71635 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f71636 = null;
        }
        return this.f71635;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C15135 m49087() {
        C10611 defaultInstance;
        C15135 c15135 = this.f71637;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f71640;
                if (defaultInstance == null) {
                    defaultInstance = C10611.getDefaultInstance();
                }
            } else {
                defaultInstance = (C10611) c15135.m36295();
            }
            this.f71637 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f71640 = null;
        }
        return this.f71637;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C22190 m49089() {
        if (this.f71642 == null) {
            this.f71642 = new C22190(this.f71638, (this.f71641 & 16) != 0, getParentForChildren(), isClean());
            this.f71638 = null;
        }
        return this.f71642;
    }
}
