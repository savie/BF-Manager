package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public class C22302 implements InterfaceC10308 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f72841;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22492 f72842;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f72843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC23156 f72844;

    public C22302(C0429 c0429, C22492 c22492) {
        this.f72841 = c0429;
        this.f72842 = c22492;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11867 m49464(C21596 c21596) {
        C0429 c0429;
        C20414 c20414;
        InterfaceC2173 interfaceC2173M48202;
        C18258 c18258;
        AbstractC16579 abstractC16579M49462 = m49462(c21596.f75167);
        C19003 c19003 = new C19003();
        C21825 c21825 = c21596.f70059;
        while (true) {
            C4146 c4146 = null;
            if (!c21825.m48595()) {
                return new C11867(abstractC16579M49462, c19003.m43726(), null);
            }
            AbstractC11242 abstractC11242 = (AbstractC11242) ((C2068) c21825.f70876).f7664;
            try {
                Iterator it = abstractC16579M49462.f53222.mo20272().m9327(abstractC11242).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                        if (abstractC23903.f77452 == EnumC10477.f35879 && abstractC23903.f77449.mo33523().m48596() == 0) {
                            c18258 = (C18258) abstractC23903;
                        }
                        c0429 = this.f72841;
                        c20414 = c0429.f1970;
                        C3836 c3836 = c0429.f1991;
                        interfaceC2173M48202 = c20414.m48202(this.f72842.f73422);
                        try {
                            if (c0429.f1968) {
                                if (c4146 == null) {
                                    C14065 c14065 = C9768.f32836;
                                    c20414.m48201(new C14065("compiler", "annotation.method.not.found", abstractC16579M49462, abstractC11242));
                                } else {
                                    C11948 c11948M11788 = c4146.m11788();
                                    C14065 c14066 = C9768.f32836;
                                    c20414.m48201(new C14065("compiler", "annotation.method.not.found.reason", abstractC16579M49462, abstractC11242, c11948M11788));
                                }
                            }
                            c20414.m48202(interfaceC2173M48202);
                            c18258 = new C18258(1025L, abstractC11242, new C13757(C21825.m48588(), c3836.f14228, C21825.m48588(), c3836.f14240), abstractC16579M49462.f53222);
                        } catch (Throwable th) {
                            c20414.m48202(interfaceC2173M48202);
                            throw th;
                        }
                    } else {
                        c0429 = this.f72841;
                        c20414 = c0429.f1970;
                        C3836 c3837 = c0429.f1991;
                        interfaceC2173M48202 = c20414.m48202(this.f72842.f73422);
                        if (c0429.f1968) {
                            if (c4146 == null) {
                                C14065 c14067 = C9768.f32836;
                                c20414.m48201(new C14065("compiler", "annotation.method.not.found", abstractC16579M49462, abstractC11242));
                            } else {
                                C11948 c11948M11789 = c4146.m11788();
                                C14065 c14068 = C9768.f32836;
                                c20414.m48201(new C14065("compiler", "annotation.method.not.found.reason", abstractC16579M49462, abstractC11242, c11948M11789));
                            }
                        }
                        c20414.m48202(interfaceC2173M48202);
                        c18258 = new C18258(1025L, abstractC11242, new C13757(C21825.m48588(), c3837.f14228, C21825.m48588(), c3837.f14240), abstractC16579M49462.f53222);
                    }
                    c19003.m43723(new C2068(c18258, m49463(c18258.f77449.mo16235(), (AbstractC23156) ((C2068) c21825.f70876).f7665)));
                    c21825 = c21825.f70877;
                }
            } catch (C4146 e) {
                c4146 = e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23156 m49463(AbstractC16579 abstractC16579, AbstractC23156 abstractC23156) {
        AbstractC16579 abstractC165710 = this.f72843;
        try {
            this.f72843 = abstractC16579;
            abstractC23156.mo4166(this);
            return this.f72844;
        } finally {
            this.f72843 = abstractC165710;
        }
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7547(C2693 c2693) {
        this.f72844 = c2693;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7551(C13984 c13984) {
        this.f72844 = c13984;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7549(C5516 c5516) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7550(C11867 c11867) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7548(C4810 c4810) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7552(C22450 c22450) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC10308
    /* JADX INFO: renamed from: ۙ */
    public final void mo26124(C18068 c18068) {
        C6263 c6263;
        AbstractC16579 abstractC16579 = c18068.f57781;
        AbstractC11242 abstractC11242 = c18068.f57780;
        AbstractC0618 abstractC0618 = m49462(abstractC16579).f53222;
        C6263 c6264 = null;
        try {
            Iterator it = abstractC0618.mo20272().m9327(abstractC11242).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c6263 = null;
                    break;
                }
                AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                if (abstractC23903.f77452 == EnumC10477.f35878) {
                    c6263 = (C6263) abstractC23903;
                    break;
                }
            }
            e = null;
            c6264 = c6263;
        } catch (C4146 e) {
            e = e;
        }
        if (c6264 == null) {
            C0429 c0429 = this.f72841;
            if (e != null) {
                C20414 c20414 = c0429.f1970;
                InterfaceC2173 interfaceC2173 = c0429.f1975;
                C11948 c11948M11788 = e.m11788();
                C14065 c14065 = C9768.f32836;
                c20414.m48201(new C14065("compiler", "unknown.enum.constant.reason", interfaceC2173, abstractC0618, abstractC11242, c11948M11788));
            } else {
                C20414 c20415 = c0429.f1970;
                InterfaceC2173 interfaceC2174 = c0429.f1975;
                C14065 c14066 = C9768.f32836;
                c20415.m48201(new C14065("compiler", "unknown.enum.constant", interfaceC2174, abstractC0618, abstractC11242));
            }
            this.f72844 = new C5516(abstractC0618.f77449, new C6263(0L, c18068.f57780, c0429.f1991.f14228, abstractC0618));
            return;
        }
        this.f72844 = new C5516(abstractC0618.f77449, c6264);
    }

    @Override // l.InterfaceC10308
    /* JADX INFO: renamed from: ۙ */
    public final void mo26123(C6779 c6779) {
        this.f72844 = new C13984(m49462(c6779.f22884), this.f72841.f1976);
    }

    @Override // l.InterfaceC10308
    /* JADX INFO: renamed from: ۙ */
    public final void mo26122(C1134 c1134) {
        C21825 c21825 = c1134.f5102;
        AbstractC23156[] abstractC23156Arr = new AbstractC23156[c21825.m48596()];
        AbstractC16579 abstractC16579M52416 = this.f72841.f1976.m52416(this.f72843);
        int i = 0;
        while (c21825.m48595()) {
            abstractC23156Arr[i] = m49463(abstractC16579M52416, (AbstractC23156) c21825.f70876);
            c21825 = c21825.f70877;
            i++;
        }
        this.f72844 = new C4810(this.f72843, abstractC23156Arr);
    }

    @Override // l.InterfaceC10308
    /* JADX INFO: renamed from: ۙ */
    public final void mo26125(C21596 c21596) {
        this.f72844 = m49464(c21596);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m49462(AbstractC16579 abstractC16579) {
        if (!(abstractC16579 instanceof C8897)) {
            return abstractC16579;
        }
        C8897 c8897 = (C8897) abstractC16579;
        C22492 c22492 = this.f72842;
        C6171.m17176(c22492.f77448.f77452 == EnumC10477.f35868);
        C0429 c0429 = this.f72841;
        C19670 c19670 = c0429.f1957;
        c0429.f1957 = (C19670) c22492.f77448;
        try {
            return c8897.m23147();
        } finally {
            c0429.f1957 = c19670;
        }
    }
}
