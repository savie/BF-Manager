package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13203 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f43921;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22190 f43922;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f43923;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23539 f43924;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15135 f43925;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43926;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f43927;

    public C13203(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f43926 = 0;
        this.f43923 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m32670();
            m32671();
        }
    }

    public /* synthetic */ C13203(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m32674();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m32674();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m32674();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m32674();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m32674();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m32672(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m32672(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m32672(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m32672(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46303;
        c6956.m18696(C23081.class, C13203.class);
        return c6956;
    }

    public C13203() {
        this.f43926 = 0;
        this.f43923 = Collections.EMPTY_LIST;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m32670();
            m32671();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32674() {
        super.mo2777clear();
        this.f43927 = 0;
        this.f43921 = false;
        this.f43926 = 0;
        this.f43924 = null;
        C15135 c15135 = this.f43925;
        if (c15135 != null) {
            c15135.m36296();
            this.f43925 = null;
        }
        C22190 c22190 = this.f43922;
        if (c22190 == null) {
            this.f43923 = Collections.EMPTY_LIST;
        } else {
            this.f43923 = null;
            c22190.m49245();
        }
        this.f43927 &= -9;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46325;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C23081.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C23081.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C23081 c23081BuildPartial = buildPartial();
        if (c23081BuildPartial.isInitialized()) {
            return c23081BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c23081BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C23081 c23081BuildPartial = buildPartial();
        if (c23081BuildPartial.isInitialized()) {
            return c23081BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c23081BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C23081 buildPartial() {
        int i;
        C23539 c23539;
        C23081 c23081 = new C23081(this);
        C22190 c22190 = this.f43922;
        if (c22190 != null) {
            c23081.f74987 = c22190.m49248();
        } else {
            if ((this.f43927 & 8) != 0) {
                this.f43923 = C0561.unmodifiableList(this.f43923);
                this.f43927 &= -9;
            }
            c23081.f74987 = this.f43923;
        }
        int i2 = this.f43927;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c23081.f74986 = this.f43921;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c23081.f74988 = this.f43926;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f43925;
                if (c15135 == null) {
                    c23539 = this.f43924;
                } else {
                    c23539 = (C23539) c15135.m36297();
                }
                c23081.f74989 = c23539;
                i |= 4;
            }
            c23081.f74991 = i | c23081.f74991;
        }
        onBuilt();
        return c23081;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C23081) {
            m32673((C23081) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C23081) {
            m32673((C23081) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32673(C23081 c23081) {
        C23539 c23539;
        if (c23081 == C23081.getDefaultInstance()) {
            return;
        }
        if (c23081.m51073()) {
            this.f43921 = c23081.m51076();
            this.f43927 |= 1;
            onChanged();
        }
        if (c23081.m51071()) {
            EnumC6852 enumC6852M51075 = c23081.m51075();
            enumC6852M51075.getClass();
            this.f43927 |= 2;
            this.f43926 = enumC6852M51075.getNumber();
            onChanged();
        }
        if (c23081.m51074()) {
            C23539 c23539M51072 = c23081.m51072();
            C15135 c15135 = this.f43925;
            if (c15135 == null) {
                if ((this.f43927 & 4) == 0 || (c23539 = this.f43924) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f43924 = c23539M51072;
                } else {
                    this.f43927 |= 4;
                    onChanged();
                    ((C19305) m32670().m36293()).m44291(c23539M51072);
                }
            } else {
                c15135.m36294(c23539M51072);
            }
            if (this.f43924 != null) {
                this.f43927 |= 4;
                onChanged();
            }
        }
        if (this.f43922 == null) {
            if (!c23081.f74987.isEmpty()) {
                if (this.f43923.isEmpty()) {
                    this.f43923 = c23081.f74987;
                    this.f43927 &= -9;
                } else {
                    if ((this.f43927 & 8) == 0) {
                        this.f43923 = new ArrayList(this.f43923);
                        this.f43927 |= 8;
                    }
                    this.f43923.addAll(c23081.f74987);
                }
                onChanged();
            }
        } else if (!c23081.f74987.isEmpty()) {
            if (!this.f43922.m49238()) {
                this.f43922.m49242(c23081.f74987);
            } else {
                this.f43922.m49236();
                this.f43922 = null;
                this.f43923 = c23081.f74987;
                this.f43927 &= -9;
                this.f43922 = AbstractC18245.alwaysUseFieldBuilders ? m32671() : null;
            }
        }
        m31299((AbstractC6229) c23081);
        mo2781mergeUnknownFields(c23081.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32672(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 264) {
                            this.f43921 = abstractC3262.mo6028();
                            this.f43927 |= 1;
                        } else if (iMo6048 == 272) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC6852.m18468(iMo6037) == null) {
                                mergeUnknownVarintField(34, iMo6037);
                            } else {
                                this.f43926 = iMo6037;
                                this.f43927 |= 2;
                            }
                        } else if (iMo6048 == 282) {
                            abstractC3262.mo6027(m32670().m36293(), c2701);
                            this.f43927 |= 4;
                        } else if (iMo6048 == 7994) {
                            C4923 c4923 = (C4923) abstractC3262.mo6024(C4923.parser(), c2701);
                            C22190 c22190 = this.f43922;
                            if (c22190 != null) {
                                c22190.m49251(c4923);
                            } else {
                                if ((this.f43927 & 8) == 0) {
                                    this.f43923 = new ArrayList(this.f43923);
                                    this.f43927 |= 8;
                                }
                                this.f43923.add(c4923);
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
        if ((this.f43927 & 4) == 0) {
            i = 0;
            while (true) {
                c22190 = this.f43922;
                if (c22190 == null) {
                    iM49252 = this.f43923.size();
                } else {
                    iM49252 = c22190.m49252();
                }
                if (i < iM49252) {
                    if (!m31301()) {
                        break;
                    }
                    return true;
                }
                c22191 = this.f43922;
                if (c22191 == null) {
                    c4923 = (C4923) this.f43923.get(i);
                } else {
                    c4923 = (C4923) c22191.m49249(i);
                }
                if (!c4923.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15135 c15135 = this.f43925;
            if (c15135 == null) {
                defaultInstance = this.f43924;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c22190 = this.f43922;
                    if (c22190 == null) {
                        iM49252 = this.f43923.size();
                    } else {
                        iM49252 = c22190.m49252();
                    }
                    if (i < iM49252) {
                        if (!m31301()) {
                            break;
                        }
                        return true;
                    }
                    c22191 = this.f43922;
                    if (c22191 == null) {
                        c4923 = (C4923) this.f43923.get(i);
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
    private C15135 m32670() {
        C23539 defaultInstance;
        C15135 c15135 = this.f43925;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f43924;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f43925 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f43924 = null;
        }
        return this.f43925;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C22190 m32671() {
        if (this.f43922 == null) {
            this.f43922 = new C22190(this.f43923, (this.f43927 & 8) != 0, getParentForChildren(), isClean());
            this.f43923 = null;
        }
        return this.f43922;
    }
}
