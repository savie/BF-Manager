package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13609 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f44889 = new C16576();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17573 f44890;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C5206 f44891;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9399 f44892;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C3836 f44893;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20414 f44894;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C23800 f44895;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C5286 f44896;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C16617 f44897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C16826 f44899;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2714 f44900;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C23942 f44901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21017 f44902;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C11492 f44903;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C11619 f44904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23549 f44905;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f44906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6761 f44907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44909;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9293 f44910;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC2380 f44911;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f44898 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5764 f44908 = new C5764(this);

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18258 m33259(C13609 c13609, AbstractC0618 abstractC0618, AbstractC11242 abstractC11242, C21825 c21825) {
        c13609.getClass();
        AbstractC9462 abstractC9462Mo20272 = abstractC0618.mo20272();
        C14937 c14937 = new C14937();
        abstractC9462Mo20272.getClass();
        for (AbstractC23903 abstractC23903 : abstractC9462Mo20272.mo3803(abstractC11242, c14937, EnumC10167.RECURSIVE)) {
            if (c13609.f44895.m52401(abstractC23903.f77449.mo33523(), c21825)) {
                return (C18258) abstractC23903;
            }
        }
        return null;
    }

    public C13609(C12343 c12343) {
        c12343.m30659(f44889, this);
        this.f44901 = C23942.m52776(c12343);
        this.f44892 = C9399.m24138(c12343);
        this.f44904 = C11619.m28951(c12343);
        this.f44894 = C20414.m46161(c12343);
        this.f44902 = C21017.m47211(c12343);
        this.f44907 = C6761.m18268(c12343);
        this.f44893 = C3836.m11131(c12343);
        this.f44896 = C5286.m14576(c12343);
        this.f44897 = C16617.m39076(c12343);
        this.f44890 = C17573.m40852(c12343);
        this.f44891 = C5206.m14386(c12343);
        this.f44895 = C23800.m52336(c12343);
        this.f44905 = C23549.m51906(c12343);
        this.f44900 = C2714.m8268(c12343);
        this.f44899 = C16826.m39463(c12343);
        this.f44903 = C11492.m28677(c12343);
        this.f44911 = AbstractC2380.m7237(c12343);
        C2008.m6467(c12343);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f44909 = EnumC14026.f46100.m33945(enumC11909M29706);
        this.f44906 = EnumC14026.f46128.m33945(enumC11909M29706);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33279(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            final C10164 c10164 = (C10164) it.next();
            if (!c10164.f34722.m5643()) {
                final C4603 c4603M24146 = this.f44892.m24146(c10164);
                m33278(c10164, new Runnable() { // from class: l.᩹ۖ۟
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71323.f44908.m15888(c10164, c4603M24146);
                    }
                });
            }
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        AbstractC2380 abstractC2380 = this.f44911;
        C17573 c17573 = this.f44890;
        if (!this.f44898) {
            C6171.m17176((abstractC23903.mo20276() & 16777216) == 0);
            abstractC23903.f77451 = this;
            return;
        }
        try {
            c17573.m40875();
            abstractC23903.f77447 |= 268435456;
            abstractC2380.mo7239((C22492) abstractC23903, EnumC5992.MEMBER_ENTER);
            try {
                C21825<C4603> c21825M23840 = this.f44908.m23840(C21825.of((Object) this.f44903.m28678((C22492) abstractC23903)));
                abstractC2380.mo7238();
                if (!c21825M23840.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (C4603 c4603 : c21825M23840) {
                        if (c4603.f16295.f34727.contains(c4603.f16301) && hashSet.add(c4603.f16295)) {
                            m33278(c4603.f16295, new RunnableC0824());
                        }
                    }
                }
                c17573.m40873();
            } catch (Throwable th) {
                abstractC2380.mo7238();
                throw th;
            }
        } catch (Throwable th2) {
            c17573.m40873();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33278(C10164 c10164, Runnable runnable) {
        C21017 c21017 = this.f44902;
        InterfaceC2173 interfaceC2173 = c10164.f34725;
        C20414 c20414 = this.f44894;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        try {
            runnable.run();
            c21017.m47332(c10164);
            c21017.m47345(c10164);
            c21017.m47291(c10164);
            c10164.f34728.mo22713();
            c10164.f34722.mo22713();
        } catch (C4146 e) {
            c21017.m47261(c10164, e);
        } finally {
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23195 m33277(final C5286 c5286, C20581 c20581) {
        AbstractC5930 abstractC5930M14639;
        AbstractC16579 abstractC16579Mo8774 = c20581.mo8774();
        C18258 c18258Mo8773 = c20581.mo8773();
        C19003 c19003 = new C19003();
        if (c20581.f67071.f77449 != this.f44893.f14275) {
            boolean zM39001 = c20581.mo19104().m39001(EnumC6617.NONE);
            C23942 c23942 = this.f44901;
            if (!zM39001) {
                abstractC5930M14639 = c5286.m14625(c5286.m14586((AbstractC23903) c18258Mo8773.f58259.f70876), c23942.f77638);
            } else {
                abstractC5930M14639 = c5286.m14639(c23942.f77638);
            }
            c19003.m43723(c5286.m14642(c5286.m14610(abstractC5930M14639, abstractC16579Mo8774.mo1938().m48595() ? c5286.m14632(abstractC16579Mo8774.mo1938()) : null, c20581.mo19105().m48592(new Function() { // from class: l.᩺ۖ۟
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c5286.m14639((AbstractC11242) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }
            }))));
        }
        return c20581.mo8775(c5286.m14623(c18258Mo8773, c18258Mo8773.f77449, c5286.m14617(0L, c19003.m43726())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33280(AbstractC23903 abstractC23903, C21825 c21825, C4603 c4603) {
        C6761 c6761 = this.f44907;
        c6761.getClass();
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c6761.m18326(((C5224) c21826.f70876).f18121, c4603, AbstractC16579.f53219);
        }
        while (!c21825.isEmpty()) {
            C5224 c5224 = (C5224) c21825.f70876;
            AbstractC16579 abstractC16579 = c5224.f18121.f30190;
            C3836 c3836 = this.f44893;
            AbstractC16579 abstractC165710 = c3836.f14253;
            C23942 c23942 = this.f44901;
            if (abstractC16579 == abstractC165710) {
                abstractC23903.f77447 |= 18014398509613056L;
                m33260(c5224, abstractC23903, c23942.f77568, 36028797018963968L);
            } else if (abstractC16579 == c3836.f14238) {
                abstractC23903.f77447 |= 72057594037927936L;
                m33260(c5224, abstractC23903, c23942.f77552, 288230376151711744L);
            }
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33260(C5224 c5224, final AbstractC23903 abstractC23903, AbstractC11242 abstractC11242, final long j) {
        C9030.stream(c5224.f18122).filter(new C12820()).map(new C3646(0)).filter(new C9204(2, abstractC11242)).findFirst().ifPresent(new Consumer() { // from class: l.ۜۖ۟
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                AbstractC5930 abstractC5930M9461 = C3128.m9461(((C3812) obj).f14146);
                if (abstractC5930M9461.m22847(EnumC18651.f60472) && Boolean.TRUE.equals(((C1321) abstractC5930M9461).m4718())) {
                    abstractC23903.f77447 |= j;
                }
            }
        });
    }
}
