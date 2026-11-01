package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2993 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f11229;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C23539 f11230;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22190 f11231;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f11232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11233;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15135 f11234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11235;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f11236;

    public C2993(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f11236 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m8955();
            m8956();
        }
    }

    public /* synthetic */ C2993(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m8958();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m8958();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m8958();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m8958();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m8958();
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
        C6956 c6956 = C14097.f46310;
        c6956.m18696(C4487.class, C2993.class);
        return c6956;
    }

    public C2993() {
        this.f11236 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m8955();
            m8956();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8958() {
        super.mo2777clear();
        this.f11229 = 0;
        this.f11235 = false;
        this.f11232 = false;
        this.f11233 = false;
        this.f11230 = null;
        C15135 c15135 = this.f11234;
        if (c15135 != null) {
            c15135.m36296();
            this.f11234 = null;
        }
        C22190 c22190 = this.f11231;
        if (c22190 == null) {
            this.f11236 = Collections.EMPTY_LIST;
        } else {
            this.f11236 = null;
            c22190.m49245();
        }
        this.f11229 &= -17;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46320;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C4487.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C4487.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C4487 c4487BuildPartial = buildPartial();
        if (c4487BuildPartial.isInitialized()) {
            return c4487BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4487BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C4487 c4487BuildPartial = buildPartial();
        if (c4487BuildPartial.isInitialized()) {
            return c4487BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4487BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C4487 buildPartial() {
        int i;
        C23539 c23539;
        C4487 c4487 = new C4487(this);
        C22190 c22190 = this.f11231;
        if (c22190 != null) {
            c4487.f15963 = c22190.m49248();
        } else {
            if ((this.f11229 & 16) != 0) {
                this.f11236 = C0561.unmodifiableList(this.f11236);
                this.f11229 &= -17;
            }
            c4487.f15963 = this.f11236;
        }
        int i2 = this.f11229;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4487.f15967 = this.f11235;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c4487.f15964 = this.f11232;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c4487.f15965 = this.f11233;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15135 c15135 = this.f11234;
                if (c15135 == null) {
                    c23539 = this.f11230;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c4487.f15966 = c23539;
                i |= 8;
            }
            c4487.f15961 = i | c4487.f15961;
        }
        onBuilt();
        return c4487;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4487) {
            m8957((C4487) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4487) {
            m8957((C4487) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8957(C4487 c4487) {
        C23539 c23539;
        if (c4487 == C4487.getDefaultInstance()) {
            return;
        }
        if (c4487.m12526()) {
            this.f11235 = c4487.m12529();
            this.f11229 |= 1;
            onChanged();
        }
        if (c4487.m12522()) {
            this.f11232 = c4487.m12524();
            this.f11229 |= 2;
            onChanged();
        }
        if (c4487.m12527()) {
            this.f11233 = c4487.m12528();
            this.f11229 |= 4;
            onChanged();
        }
        if (c4487.m12523()) {
            C23539 c23539M12525 = c4487.m12525();
            C15135 c15135 = this.f11234;
            if (c15135 == null) {
                if ((this.f11229 & 8) == 0 || (c23539 = this.f11230) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f11230 = c23539M12525;
                } else {
                    this.f11229 |= 8;
                    onChanged();
                    ((C19305) m8955().m36293()).m44291(c23539M12525);
                }
            } else {
                c15135.m36294(c23539M12525);
            }
            if (this.f11230 != null) {
                this.f11229 |= 8;
                onChanged();
            }
        }
        if (this.f11231 == null) {
            if (!c4487.f15963.isEmpty()) {
                if (this.f11236.isEmpty()) {
                    this.f11236 = c4487.f15963;
                    this.f11229 &= -17;
                } else {
                    if ((this.f11229 & 16) == 0) {
                        this.f11236 = new ArrayList(this.f11236);
                        this.f11229 |= 16;
                    }
                    this.f11236.addAll(c4487.f15963);
                }
                onChanged();
            }
        } else if (!c4487.f15963.isEmpty()) {
            if (!this.f11231.m49238()) {
                this.f11231.m49242(c4487.f15963);
            } else {
                this.f11231.m49236();
                this.f11231 = null;
                this.f11236 = c4487.f15963;
                this.f11229 &= -17;
                this.f11231 = AbstractC18245.alwaysUseFieldBuilders ? m8956() : null;
            }
        }
        m31299((AbstractC6229) c4487);
        mo2781mergeUnknownFields(c4487.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C2993 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 16) {
                            this.f11235 = abstractC3262.mo6028();
                            this.f11229 |= 1;
                        } else if (iMo6048 == 24) {
                            this.f11232 = abstractC3262.mo6028();
                            this.f11229 |= 2;
                        } else if (iMo6048 == 48) {
                            this.f11233 = abstractC3262.mo6028();
                            this.f11229 |= 4;
                        } else if (iMo6048 == 58) {
                            abstractC3262.mo6027(m8955().m36293(), c2701);
                            this.f11229 |= 8;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f11231;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f11229 & 16) == 0) {
                                    this.f11236 = new ArrayList(this.f11236);
                                    this.f11229 = 16 | this.f11229;
                                }
                                this.f11236.add(c4923);
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
        if ((this.f11229 & 8) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f11231;
                if (c22190 == null) {
                    iM49252 = this.f11236.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f11231;
                if (c22191 == null) {
                    c4923 = (C4923) this.f11236.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f11234;
            if (c15135 == null) {
                defaultInstance = this.f11230;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f11231;
                    if (c22190 == null) {
                        iM49252 = this.f11236.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f11231;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f11236.get(i);
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
    private C15135 m8955() {
        C23539 defaultInstance;
        C15135 c15135 = this.f11234;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f11230;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f11234 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f11230 = null;
        }
        return this.f11234;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C22190 m8956() {
        if (this.f11231 == null) {
            this.f11231 = new C22190(this.f11236, (this.f11229 & 16) != 0, getParentForChildren(), isClean());
            this.f11236 = null;
        }
        return this.f11231;
    }
}
