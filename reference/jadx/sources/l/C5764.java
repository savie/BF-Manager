package l;

import java.util.Iterator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۛۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5764 extends AbstractC9293 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C12115 f19581;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f19582;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16348 f19583;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4603 f19584;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17053 f19585;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ܽۖ۟] */
    public C5764(C13609 c13609) {
        super(c13609, EnumC5992.IMPORTS_PHASE, new C0119(c13609));
        this.f19582 = c13609;
        this.f19583 = new BiConsumer() { // from class: l.ܽۖ۟
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C14023 c14023 = (C14023) obj;
                C21017 c21017 = this.f52642.f19582.f44902;
                c14023.getClass();
                c21017.m47261(c14023, (C4146) obj2);
            }
        };
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ */
    public final void mo1178(C4603 c4603) {
        C22492 c22492 = c4603.f16301.f30086;
        if (c22492.f77448.f77452 == EnumC10477.f35867) {
            C10164 c10164 = c4603.f16295;
            EnumC18651 enumC18651 = EnumC18651.f60521;
            C4603 c4604 = c4603;
            while (c4604 != null && !c4604.f16296.m22847(enumC18651)) {
                c4604 = c4604.f16297;
            }
            m15888(c10164, c4604);
            this.f19582.f44897.add(c4603);
        }
        AbstractC23903 abstractC23903 = c22492.f77448;
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            abstractC23903.mo49994();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.۫ۖ۟] */
    /* JADX WARN: Type inference failed for: r10v1, types: [l.ܿۖ۟] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15888(C10164 c10164, C4603 c4603) {
        if (c10164.f34722.m5643()) {
            return;
        }
        C12115 c12115 = this.f19581;
        C17053 c17053 = this.f19585;
        C13609 c13609 = this.f19582;
        InterfaceC12260 interfaceC12260M8269 = c13609.f44900.m8269();
        C16826 c16826M47268 = c13609.f44902.m47268(c13609.f44899);
        C4603 c4604 = this.f19584;
        try {
            this.f19584 = c4603;
            final C7675 c7675 = c4603.f16295.f34721;
            this.f19581 = new InterfaceC8050() { // from class: l.۫ۖ۟
                @Override // l.InterfaceC8050
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo21181(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
                    C13609 c136010 = this.f40571.f19582;
                    if (!abstractC23903.mo22992()) {
                        return false;
                    }
                    c136010.f44902.getClass();
                    return C21017.m47237(abstractC23903, c7675) && abstractC23903.m52704((AbstractC0618) abstractC3110.f11719, c136010.f44895);
                }
            };
            this.f19585 = new InterfaceC8050() { // from class: l.ܿۖ۟
                @Override // l.InterfaceC8050
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo21181(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
                    if (abstractC23903.f77452 != EnumC10477.f35865) {
                        return false;
                    }
                    this.f54456.f19582.f44902.getClass();
                    return C21017.m47237(abstractC23903, c7675);
                }
            };
            C7675 c7675M11157 = c13609.f44893.m11157(c13609.f44893.f14235, c13609.f44901.f77572);
            c7675M11157.mo49994();
            if (c7675M11157.f25395.m9329() && !c7675M11157.mo20273()) {
                throw new C0969(c13609.f44905.m51910(C14707.f48067).toString());
            }
            C5286 c5286 = c13609.f44896;
            c5286.m14629((InterfaceC12260) c10164);
            AbstractC5930 abstractC5930M14641 = c13609.f44896.m14641(c7675M11157);
            C14023 c14023 = new C14023();
            c14023.f46089 = abstractC5930M14641;
            c14023.f46087 = false;
            c14023.f30189 = c5286.f18294;
            c4603.f16295.f34722.m5644(c13609.f44895, c7675M11157.mo20272(), this.f19585, c14023, this.f19583);
            C18255 c18255M25899 = c10164.m25899();
            if (c10164.m25894() != null && c18255M25899 == null) {
                m15887(c10164.m25894());
            }
            Iterator it = c10164.m25896().iterator();
            while (it.hasNext()) {
                m15889((C14023) it.next());
            }
            if (c18255M25899 != null) {
                C21783 c21783 = c18255M25899.f58252;
                c13609.m33280(c18255M25899.f58256, c21783.f70566, c4603);
                c13609.f44890.m40871(c21783.f70566, c4603, c4603.f16295.f34730, (InterfaceC12260) null);
            }
            this.f19584 = c4604;
            c13609.f44902.m47268(c16826M47268);
            c13609.f44900.m8270(interfaceC12260M8269);
            this.f19581 = c12115;
            this.f19585 = c17053;
        } catch (Throwable th) {
            this.f19584 = c4604;
            c13609.f44902.m47268(c16826M47268);
            c13609.f44900.m8270(interfaceC12260M8269);
            this.f19581 = c12115;
            this.f19585 = c17053;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15887(C7672 c7672) {
        AbstractC5930 abstractC5930 = c7672.f25385;
        C13609 c13609 = this.f19582;
        if (abstractC5930 != null) {
            for (AbstractC23903 abstractC23903 = this.f19584.f16295.f34721; abstractC23903.f77448 != c13609.f44893.f14227; abstractC23903 = abstractC23903.f77448) {
                abstractC23903.f77448.mo49994();
                if (c13609.f44893.m11155(c13609.f44893.m11152(this.f19584.f16295.f34730, abstractC23903.f77448.mo20270()).f25392, abstractC23903.mo20270()) != null) {
                    C20414 c20414 = c13609.f44894;
                    int i = c7672.f30189;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48188(i, new C5909("compiler", "pkg.clashes.with.class.of.same.name", abstractC23903));
                }
            }
        }
        C17573 c17573 = c13609.f44890;
        C21825 c21825 = c7672.f25386;
        C4603 c4603 = this.f19584;
        c17573.m40871(c21825, c4603, c4603.f16295.f34721, (InterfaceC12260) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15889(C14023 c14023) {
        C23570 c23570 = (C23570) c14023.f46089;
        AbstractC11242 abstractC11242M9472 = C3128.m9472(c23570);
        C4603 c4603 = this.f19584;
        C4603 c4603M12747 = c4603.m12747(c14023, c4603.f16299);
        C13609 c13609 = this.f19582;
        C6761 c6761 = c13609.f44907;
        c6761.getClass();
        AbstractC5930 abstractC5930 = ((C23570) c14023.f46089).f76357;
        boolean z = c14023.f46087;
        C21059 c21059 = z ? C21059.f68585 : C21059.f68587;
        C14422 c14422 = AbstractC16579.f53219;
        AbstractC0618 abstractC0618 = c6761.m18299(abstractC5930, c4603M12747, new C1116(c6761, c21059, c14422)).f53222;
        AbstractC11242 abstractC11242 = c13609.f44901.f77589;
        C16348 c16348 = this.f19583;
        if (abstractC11242M9472 == abstractC11242) {
            c13609.f44902.m47284(c23570.f76357);
            if (!z) {
                this.f19584.f16295.f34722.m5644(c13609.f44895, abstractC0618.mo20272(), this.f19585, c14023, this.f19583);
                return;
            } else {
                this.f19584.f16295.f34722.m5644(c13609.f44895, abstractC0618.mo20272(), this.f19581, c14023, c16348);
                return;
            }
        }
        if (!z) {
            C6171.m17176(c13609.f44898);
            C16826 c16826M47268 = c13609.f44902.m47268(c13609.f44906 ? c13609.f44899 : c13609.f44899.m39466(EnumC0597.DEPRECATION, EnumC0597.REMOVAL, EnumC0597.PREVIEW));
            try {
                c13609.f44898 = false;
                C6761 c6762 = c13609.f44907;
                c6762.getClass();
                AbstractC16579 abstractC16579M18326 = c6762.m18326(c23570, c4603M12747, c14422);
                c13609.f44898 = true;
                c13609.f44902.m47268(c16826M47268);
                AbstractC16579 abstractC16579Mo16234 = abstractC16579M18326.mo16234();
                AbstractC0618 abstractC0619 = abstractC16579Mo16234.m39001(EnumC6617.CLASS) ? abstractC16579Mo16234.f53222 : abstractC16579M18326.f53222;
                c13609.f44902.m47284(c23570);
                C4603 c4604 = this.f19584;
                if (abstractC0619.f77452 == EnumC10477.f35865) {
                    c14023.f46088 = c4604.f16295.f34728.m45411(abstractC0619.f77448.mo20272(), abstractC0619.f77448.mo20272(), abstractC0619);
                    return;
                }
                return;
            } catch (Throwable th) {
                c13609.f44898 = true;
                c13609.f44902.m47268(c16826M47268);
                throw th;
            }
        }
        if (abstractC0618.f77452 != EnumC10477.f35865) {
            c13609.f44894.m48193(EnumC0264.RECOVERABLE, c14023, C23879.f77320);
        } else {
            c14023.f46088 = c4603M12747.f16295.f34728.m45412(c13609.f44895, abstractC0618.mo20272(), abstractC11242M9472, this.f19581, c14023, c16348);
        }
        c13609.f44902.m47284(c23570.f76357);
    }
}
