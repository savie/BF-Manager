package l;

import java.util.Iterator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ܳ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C15691 extends AbstractC11962 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f51003;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11216 f51004;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20167 f51005;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C23151 f51006;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3168 f51007;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۤ᩻ۘ] */
    public C15691(C17929 c17929) {
        super(c17929, EnumC10712.IMPORTS_PHASE, new C22405(c17929));
        this.f51003 = c17929;
        this.f51004 = new BiConsumer() { // from class: l.ۤ᩻ۘ
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C11852 c11852 = (C11852) obj;
                C22092 c22092 = this.f35378.f51003.f58725;
                c11852.getClass();
                c22092.m49966(c11852, (C21566) obj2);
            }
        };
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ۙ */
    public final void mo7699(C3168 c3168) {
        C24550 c24550 = c3168.f10279.f26345;
        if (c24550.f38069.f38066 == EnumC13603.f43219) {
            C19113 c19113 = c3168.f10275;
            EnumC21461 enumC21461 = EnumC21461.f68471;
            C3168 c3169 = c3168;
            while (c3169 != null && !c3169.f10273.m21911(enumC21461)) {
                c3169 = c3169.f10274;
            }
            m37468(c19113, c3169);
            this.f51003.f58736.add(c3168);
        }
        AbstractC11781 abstractC11781 = c24550.f38069;
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            abstractC11781.mo29590();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.᩸᩻ۘ] */
    /* JADX WARN: Type inference failed for: r10v1, types: [l.ᩴ᩻ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37468(C19113 c19113, C3168 c3168) {
        if (c19113.f61861.m40254()) {
            return;
        }
        C23151 c23151 = this.f51006;
        C20167 c20167 = this.f51005;
        C17929 c17929 = this.f51003;
        InterfaceC5075 interfaceC5075M17746 = c17929.f58719.m17746();
        C15400 c15400M49962 = c17929.f58725.m49962(c17929.f58724);
        C3168 c3169 = this.f51007;
        try {
            this.f51007 = c3168;
            final C14106 c14106 = c3168.f10275.f61858;
            this.f51006 = new InterfaceC2722() { // from class: l.᩸᩻ۘ
                @Override // l.InterfaceC2722
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo9061(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
                    C17929 c179210 = this.f75038.f51003;
                    if (!abstractC11781.mo7874()) {
                        return false;
                    }
                    c179210.f58725.getClass();
                    return C22092.m49934(abstractC11781, c14106) && abstractC11781.m29567((AbstractC22970) abstractC16344.f53083, c179210.f58720);
                }
            };
            this.f51005 = new InterfaceC2722() { // from class: l.ᩴ᩻ۘ
                @Override // l.InterfaceC2722
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo9061(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
                    if (abstractC11781.f38066 != EnumC13603.f43213) {
                        return false;
                    }
                    this.f64774.f51003.f58725.getClass();
                    return C22092.m49934(abstractC11781, c14106);
                }
            };
            C14106 c14106M35529 = c17929.f58739.m35529(c17929.f58739.f48304, c17929.f58729.f49869);
            c14106M35529.mo29590();
            if (c14106M35529.f44616.m38843() && !c14106M35529.mo7873()) {
                throw new C3255(c17929.f58721.m45975(C19859.f63819).toString());
            }
            C15714 c15714 = c17929.f58722;
            c15714.m37552((InterfaceC5075) c19113);
            AbstractC22295 abstractC22295M37574 = c17929.f58722.m37574(c14106M35529);
            C11852 c11852 = new C11852();
            c11852.f38181 = abstractC22295M37574;
            c11852.f38180 = false;
            c11852.f26658 = c15714.f51040;
            c3168.f10275.f61861.m40253(c17929.f58720, c14106M35529.mo29571(), this.f51005, c11852, this.f51004);
            C14835 c14835M44238 = c19113.m44238();
            if (c19113.m44237() != null && c14835M44238 == null) {
                m37465(c19113.m44237());
            }
            Iterator it = c19113.m44239().iterator();
            while (it.hasNext()) {
                m37466((C11852) it.next());
            }
            if (c14835M44238 != null) {
                C4395 c4395 = c14835M44238.f48525;
                c17929.m41863(c14835M44238.f48524, c4395.f15824, c3168);
                c17929.f58734.m28997(c4395.f15824, c3168, c3168.f10275.f61859, (InterfaceC5075) null);
            }
            this.f51007 = c3169;
            c17929.f58725.m49962(c15400M49962);
            c17929.f58719.m17747(interfaceC5075M17746);
            this.f51006 = c23151;
            this.f51005 = c20167;
        } catch (Throwable th) {
            this.f51007 = c3169;
            c17929.f58725.m49962(c15400M49962);
            c17929.f58719.m17747(interfaceC5075M17746);
            this.f51006 = c23151;
            this.f51005 = c20167;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37465(C10360 c10360) {
        AbstractC22295 abstractC22295 = c10360.f32980;
        C17929 c17929 = this.f51003;
        if (abstractC22295 != null) {
            for (AbstractC11781 abstractC11781 = this.f51007.f10275.f61858; abstractC11781.f38069 != c17929.f58739.f48284; abstractC11781 = abstractC11781.f38069) {
                abstractC11781.f38069.mo29590();
                if (c17929.f58739.m35523(c17929.f58739.m35526(this.f51007.f10275.f61859, abstractC11781.f38069.mo29582()).f44618, abstractC11781.mo29582()) != null) {
                    C7312 c7312 = c17929.f58731;
                    int i = c10360.f26658;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34517(i, new C11040("compiler", "pkg.clashes.with.class.of.same.name", abstractC11781));
                }
            }
        }
        C11518 c11518 = c17929.f58734;
        C14769 c14769 = c10360.f32979;
        C3168 c3168 = this.f51007;
        c11518.m28997(c14769, c3168, c3168.f10275.f61858, (InterfaceC5075) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37466(C11852 c11852) {
        C23041 c23041 = (C23041) c11852.f38181;
        AbstractC19728 abstractC19728M28319 = C11239.m28319(c23041);
        C3168 c3168 = this.f51007;
        C3168 c3168M10350 = c3168.m10350(c11852, c3168.f10272);
        C17929 c17929 = this.f51003;
        C0310 c0310 = c17929.f58718;
        c0310.getClass();
        AbstractC22295 abstractC22295 = ((C23041) c11852.f38181).f74776;
        boolean z = c11852.f38180;
        C22114 c22114 = z ? C22114.f71269 : C22114.f71272;
        C11256 c11256 = AbstractC22664.f73590;
        AbstractC22970 abstractC22970 = c0310.m1933(abstractC22295, c3168M10350, new C14479(c0310, c22114, c11256)).f73596;
        AbstractC19728 abstractC19728 = c17929.f58729.f49751;
        C11216 c11216 = this.f51004;
        if (abstractC19728M28319 == abstractC19728) {
            c17929.f58725.m49996(c23041.f74776);
            if (!z) {
                this.f51007.f10275.f61861.m40253(c17929.f58720, abstractC22970.mo29571(), this.f51005, c11852, this.f51004);
                return;
            } else {
                this.f51007.f10275.f61861.m40253(c17929.f58720, abstractC22970.mo29571(), this.f51006, c11852, c11216);
                return;
            }
        }
        if (!z) {
            C11972.m30026(c17929.f58728);
            C15400 c15400M49962 = c17929.f58725.m49962(c17929.f58732 ? c17929.f58724 : c17929.f58724.m36877(EnumC19876.DEPRECATION, EnumC19876.REMOVAL, EnumC19876.PREVIEW));
            try {
                c17929.f58728 = false;
                C0310 c0311 = c17929.f58718;
                c0311.getClass();
                AbstractC22664 abstractC22664M1981 = c0311.m1981(c23041, c3168M10350, c11256);
                c17929.f58728 = true;
                c17929.f58725.m49962(c15400M49962);
                AbstractC22664 abstractC22664Mo31584 = abstractC22664M1981.mo31584();
                AbstractC22970 abstractC22971 = abstractC22664Mo31584.m51067(EnumC21172.CLASS) ? abstractC22664Mo31584.f73596 : abstractC22664M1981.f73596;
                c17929.f58725.m49996(c23041);
                C3168 c3169 = this.f51007;
                if (abstractC22971.f38066 == EnumC13603.f43213) {
                    c11852.f38179 = c3169.f10275.f61854.m51966(abstractC22971.f38069.mo29571(), abstractC22971.f38069.mo29571(), abstractC22971);
                    return;
                }
                return;
            } catch (Throwable th) {
                c17929.f58728 = true;
                c17929.f58725.m49962(c15400M49962);
                throw th;
            }
        }
        if (abstractC22970.f38066 != EnumC13603.f43213) {
            c17929.f58731.m34523(EnumC6984.RECOVERABLE, c11852, C22843.f74177);
        } else {
            c11852.f38179 = c3168M10350.f10275.f61854.m51967(c17929.f58720, abstractC22970.mo29571(), abstractC19728M28319, this.f51006, c11852, c11216);
        }
        c17929.f58725.m49996(c23041.f74776);
    }
}
