package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5816 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15135 f19749;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f19750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22190 f19751;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21463 f19752;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f19753;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4487 f19754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22190 f19755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f19756;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f19757;

    public /* synthetic */ C5816(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m15997();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m15997();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m15997();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m15997();
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
        C6956 c6956 = C14097.f46302;
        c6956.m18696(C1582.class, C5816.class);
        return c6956;
    }

    public C5816() {
        this.f19756 = "";
        List list = Collections.EMPTY_LIST;
        this.f19757 = list;
        this.f19750 = list;
        this.f19752 = C21463.m48084();
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m15995();
            m15996();
            m15994();
        }
    }

    public C5816(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f19756 = "";
        List list = Collections.EMPTY_LIST;
        this.f19757 = list;
        this.f19750 = list;
        this.f19752 = C21463.m48084();
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m15995();
            m15996();
            m15994();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15997() {
        super.mo2777clear();
        this.f19753 = 0;
        this.f19756 = "";
        C22190 c22190 = this.f19751;
        if (c22190 == null) {
            this.f19757 = Collections.EMPTY_LIST;
        } else {
            this.f19757 = null;
            c22190.m49245();
        }
        this.f19753 &= -3;
        this.f19754 = null;
        C15135 c15135 = this.f19749;
        if (c15135 != null) {
            c15135.m36296();
            this.f19749 = null;
        }
        C22190 c22191 = this.f19755;
        if (c22191 == null) {
            this.f19750 = Collections.EMPTY_LIST;
        } else {
            this.f19750 = null;
            c22191.m49245();
        }
        this.f19753 &= -9;
        this.f19752 = C21463.m48084();
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46324;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C1582.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C1582.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C1582 c1582BuildPartial = buildPartial();
        if (c1582BuildPartial.isInitialized()) {
            return c1582BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c1582BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C1582 c1582BuildPartial = buildPartial();
        if (c1582BuildPartial.isInitialized()) {
            return c1582BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c1582BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C1582 buildPartial() {
        C4487 c4487;
        int i = 0;
        C1582 c1582 = new C1582(this, 0);
        C22190 c22190 = this.f19751;
        if (c22190 != null) {
            c1582.f6339 = c22190.m49248();
        } else {
            if ((this.f19753 & 2) != 0) {
                this.f19757 = C0561.unmodifiableList(this.f19757);
                this.f19753 &= -3;
            }
            c1582.f6339 = this.f19757;
        }
        C22190 c22191 = this.f19755;
        if (c22191 != null) {
            c1582.f6343 = c22191.m49248();
        } else {
            if ((this.f19753 & 8) != 0) {
                this.f19750 = C0561.unmodifiableList(this.f19750);
                this.f19753 &= -9;
            }
            c1582.f6343 = this.f19750;
        }
        int i2 = this.f19753;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1582.f6338 = this.f19756;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f19749;
                if (c15135 == null) {
                    c4487 = this.f19754;
                } else {
                    c4487 = (C4487) c15135.m36297();
                }
                c1582.f6342 = c4487;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f19752.mo6483();
                c1582.f6340 = this.f19752;
            }
            c1582.f6341 = i | c1582.f6341;
        }
        onBuilt();
        return c1582;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C1582) {
            m15998((C1582) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C1582) {
            m15998((C1582) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15998(C1582 c1582) {
        C4487 c4487;
        if (c1582 == C1582.getDefaultInstance()) {
            return;
        }
        if (c1582.hasName()) {
            this.f19756 = c1582.f6338;
            this.f19753 |= 1;
            onChanged();
        }
        if (this.f19751 == null) {
            if (!c1582.f6339.isEmpty()) {
                if (this.f19757.isEmpty()) {
                    this.f19757 = c1582.f6339;
                    this.f19753 &= -3;
                } else {
                    if ((this.f19753 & 2) == 0) {
                        this.f19757 = new ArrayList(this.f19757);
                        this.f19753 |= 2;
                    }
                    this.f19757.addAll(c1582.f6339);
                }
                onChanged();
            }
        } else if (!c1582.f6339.isEmpty()) {
            if (!this.f19751.m49238()) {
                this.f19751.m49242(c1582.f6339);
            } else {
                this.f19751.m49236();
                this.f19751 = null;
                this.f19757 = c1582.f6339;
                this.f19753 &= -3;
                this.f19751 = AbstractC18245.alwaysUseFieldBuilders ? m15995() : null;
            }
        }
        if (c1582.m5402()) {
            C4487 c4487M5403 = c1582.m5403();
            C15135 c15135 = this.f19749;
            if (c15135 == null) {
                if ((this.f19753 & 4) == 0 || (c4487 = this.f19754) == null || c4487 == C4487.getDefaultInstance()) {
                    this.f19754 = c4487M5403;
                } else {
                    this.f19753 |= 4;
                    onChanged();
                    ((C2993) m15996().m36293()).m8957(c4487M5403);
                }
            } else {
                c15135.m36294(c4487M5403);
            }
            if (this.f19754 != null) {
                this.f19753 |= 4;
                onChanged();
            }
        }
        if (this.f19755 == null) {
            if (!c1582.f6343.isEmpty()) {
                if (this.f19750.isEmpty()) {
                    this.f19750 = c1582.f6343;
                    this.f19753 &= -9;
                } else {
                    if ((this.f19753 & 8) == 0) {
                        this.f19750 = new ArrayList(this.f19750);
                        this.f19753 |= 8;
                    }
                    this.f19750.addAll(c1582.f6343);
                }
                onChanged();
            }
        } else if (!c1582.f6343.isEmpty()) {
            if (!this.f19755.m49238()) {
                this.f19755.m49242(c1582.f6343);
            } else {
                this.f19755.m49236();
                this.f19755 = null;
                this.f19750 = c1582.f6343;
                this.f19753 &= -9;
                this.f19755 = AbstractC18245.alwaysUseFieldBuilders ? m15994() : null;
            }
        }
        if (!c1582.f6340.isEmpty()) {
            if (this.f19752.isEmpty()) {
                this.f19752 = c1582.f6340;
                this.f19753 |= 16;
            } else {
                if (!this.f19752.mo6484()) {
                    this.f19752 = new C21463(this.f19752);
                }
                this.f19753 |= 16;
                this.f19752.addAll(c1582.f6340);
            }
            onChanged();
        }
        mo2781mergeUnknownFields(c1582.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C5816 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f19756 = abstractC3262.mo6050();
                            this.f19753 |= 1;
                        } else if (iMo6048 == 18) {
                            C2370 c2370 = (C2370) abstractC3262.mo6024(C2370.parser(), c2701);
                            C22190 c22190 = this.f19751;
                            if (c22190 != null) {
                                c22190.m49251(c2370);
                            } else {
                                if ((this.f19753 & 2) == 0) {
                                    this.f19757 = new ArrayList(this.f19757);
                                    this.f19753 |= 2;
                                }
                                this.f19757.add(c2370);
                            }
                        } else if (iMo6048 == 26) {
                            abstractC3262.mo6027(m15996().m36293(), c2701);
                            this.f19753 |= 4;
                        } else if (iMo6048 == 34) {
                            C14284 c14284 = (C14284) abstractC3262.mo6024(C14284.parser(), c2701);
                            C22190 c22191 = this.f19755;
                            if (c22191 != null) {
                                c22191.m49251(c14284);
                            } else {
                                if ((this.f19753 & 8) == 0) {
                                    this.f19750 = new ArrayList(this.f19750);
                                    this.f19753 |= 8;
                                }
                                this.f19750.add(c14284);
                            }
                        } else if (iMo6048 == 42) {
                            AbstractC23725 abstractC23725Mo6050 = abstractC3262.mo6050();
                            if (!this.f19752.mo6484()) {
                                this.f19752 = new C21463(this.f19752);
                            }
                            this.f19753 |= 16;
                            this.f19752.mo21383(abstractC23725Mo6050);
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
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int iM49252;
        C4487 defaultInstance;
        C2370 c2370;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f19751;
            if (c22190 == null) {
                iM49252 = this.f19757.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i < iM49252) {
                C22190 c22191 = this.f19751;
                if (c22191 == null) {
                    c2370 = (C2370) this.f19757.get(i);
                } else {
                    c2370 = (C2370) c22191.m49249(i);
                }
                if (!c2370.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f19753 & 4) == 0) {
                    return true;
                }
                C15135 c15135 = this.f19749;
                if (c15135 == null) {
                    defaultInstance = this.f19754;
                    if (defaultInstance == null) {
                        defaultInstance = C4487.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C4487) c15135.m36295();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C22190 m15995() {
        if (this.f19751 == null) {
            this.f19751 = new C22190(this.f19757, (this.f19753 & 2) != 0, getParentForChildren(), isClean());
            this.f19757 = null;
        }
        return this.f19751;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m15996() {
        C4487 defaultInstance;
        C15135 c15135 = this.f19749;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f19754;
                if (defaultInstance == null) {
                    defaultInstance = C4487.getDefaultInstance();
                }
            } else {
                defaultInstance = (C4487) c15135.m36295();
            }
            this.f19749 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f19754 = null;
        }
        return this.f19749;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C22190 m15994() {
        if (this.f19755 == null) {
            this.f19755 = new C22190(this.f19750, (this.f19753 & 8) != 0, getParentForChildren(), isClean());
            this.f19750 = null;
        }
        return this.f19755;
    }
}
