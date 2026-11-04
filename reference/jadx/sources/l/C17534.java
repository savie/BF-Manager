package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17534 extends C3036 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C13477 f56996 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15252 f56997;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15714 f56998;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1917 f57000;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3168 f57001;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC16305 f57003;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22010 f57004;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14764 f57005;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0310 f57007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C24705 f57009;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17638 f57010;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC24994 f56999 = new C15296();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24550 f57008 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10377 f57006 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5816 f57002 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8344 m41183(C17534 c17534, AbstractC22664 abstractC22664, AbstractC18367 abstractC18367) {
        AbstractC22664 abstractC22665;
        C24705 c24705 = c17534.f57009;
        if (abstractC18367.mo9535()) {
            AbstractC22664 abstractC22664M55132 = c24705.m55132(C11239.m28354((AbstractC2903) abstractC18367).m50572());
            if (abstractC22664M55132.mo40452()) {
                abstractC22665 = abstractC22664M55132;
                abstractC22665 = c24705.m55108(abstractC22664M55132).f38067;
            }
            abstractC22665 = abstractC22664M55132;
            return c24705.m55131(abstractC22664, abstractC22665, true) ? (InterfaceC8344) abstractC22664 : (InterfaceC8344) abstractC22665;
        }
        if (!abstractC18367.mo9536() || C11239.m28351((AbstractC22295) abstractC18367)) {
            return null;
        }
        AbstractC22664 abstractC22666 = abstractC18367.f26659;
        if ((abstractC22666.f73596.f38071 & 16384) != 0) {
            return C9089.m24226(((C5887) abstractC18367).f20169.toString());
        }
        C11972.m30021(abstractC22666.mo39105());
        int i = C5602.f19430[abstractC18367.f26659.mo9097().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C9089.m24225(((Integer) abstractC18367.f26659.mo39105()).intValue());
        }
        if (i == 5) {
            return C9089.m24226((String) abstractC18367.f26659.mo39105());
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17534 m41185(C4747 c4747) {
        C17534 c17534 = (C17534) c4747.m14643(f56996);
        return c17534 == null ? new C17534(c4747) : c17534;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1974(C25279 c25279) {
        AbstractC22664 abstractC22664;
        if (c25279.f81647 instanceof AbstractC2903) {
            boolean zM51067 = c25279.f81646.f26659.m51067(EnumC21172.BOT);
            C14764 c14764 = this.f57005;
            if (zM51067) {
                abstractC22664 = c14764.f48286;
            } else {
                abstractC22664 = c25279.f81646.f26659;
            }
            AbstractC22664 abstractC22665 = abstractC22664;
            C5816 c5816 = this.f57002;
            this.f56999 = new C11567(this);
            try {
                AbstractC22295 abstractC22295 = (AbstractC22295) mo8479(c25279.f81646);
                AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC22295);
                if (abstractC11781M28352 != null && abstractC11781M28352.f38066 == EnumC13603.f43205 && abstractC11781M28352.f38069.f38066.m33349(C22114.f71276)) {
                    this.f57002 = (C5816) abstractC11781M28352;
                } else {
                    this.f57002 = new C5816(4112L, this.f56997.f49864.m51194("patt" + c25279.f26658 + this.f57003.m38664() + "temp"), abstractC22665, this.f57006);
                }
                AbstractC2903 abstractC2903 = (AbstractC2903) c25279.f81647;
                C24705 c24705 = this.f57009;
                AbstractC22664 abstractC22664M55132 = c24705.m55132(C11239.m28354(abstractC2903).m50572());
                if (abstractC22664M55132.mo40452()) {
                    abstractC22664M55132 = c24705.m55108(abstractC22664M55132).f38067;
                }
                EnumC21461 enumC21461 = EnumC21461.f68522;
                C5887 c5887M37508 = this.f56998.m37508((AbstractC11781) this.f57002);
                AbstractC22295 abstractC22295M37557 = this.f56998.m37557(abstractC22664M55132);
                C15714 c15714 = this.f56998;
                c15714.getClass();
                C25279 c252710 = new C25279();
                c252710.f81646 = c5887M37508;
                c252710.f81647 = abstractC22295M37557;
                c252710.f26658 = c15714.f51040;
                c252710.f26659 = c14764.f48255;
                AbstractC22295 abstractC22296 = (AbstractC22295) mo8479(c25279.f81647);
                C6435 c6435M37510 = this.f56998.m37510(enumC21461, (AbstractC22295) c252710, abstractC22296);
                C7395 c7395M6593 = this.f57000.m6593(c6435M37510, enumC21461, c252710.f26659, abstractC22296.f26659);
                c6435M37510.f62402 = c7395M6593;
                c6435M37510.f26659 = c7395M6593.f38067.mo31585();
                C5816 c5817 = this.f57002;
                AbstractC22295 abstractC22297 = c6435M37510;
                if (c5817 != abstractC11781M28352) {
                    C15714 c15715 = this.f56998;
                    c15715.f51040 = c25279.f26658;
                    C14747 c14747M37526 = c15715.m37526(c15715.m37523(c5817, abstractC22295), (AbstractC22295) c6435M37510);
                    c14747M37526.f26659 = c14764.f48255;
                    c14747M37526.f48162 = true;
                    abstractC22297 = c14747M37526;
                }
                this.f9840 = this.f56999.mo29102(abstractC22297);
                return;
            } finally {
                this.f57002 = c5816;
                this.f56999.mo29103();
            }
        }
        super.mo1974(c25279);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        C6650 c6650 = (C6650) c24335.f78930.f40168;
        AbstractC22664 abstractC22664M50572 = C11239.m28354((AbstractC2903) c24335).m50572();
        C24705 c24705 = this.f57009;
        AbstractC22664 abstractC22664M55132 = c24705.m55132(abstractC22664M50572);
        if (abstractC22664M55132.mo40452()) {
            abstractC22664M55132 = c24705.m55108(abstractC22664M55132).f38067;
        }
        C5816 c5816Mo29099 = this.f56999.mo29099(c6650);
        if (c5816Mo29099 != null) {
            C15714 c15714 = this.f56998;
            c15714.f51040 = C11239.m28342(c24335);
            C5887 c5887M37508 = this.f56998.m37508((AbstractC11781) c5816Mo29099);
            C5887 c5887M37509 = this.f56998.m37508((AbstractC11781) this.f57002);
            C15714 c15715 = this.f56998;
            c15715.m37552((InterfaceC5075) c5887M37509);
            C16985 c16985M37533 = c15715.m37533((AbstractC8036) this.f56998.m37557(abstractC22664M55132), (AbstractC22295) c5887M37509);
            c16985M37533.f26659 = abstractC22664M55132;
            C20605 c20605M37541 = c15714.m37541((AbstractC22295) c5887M37508, (AbstractC22295) c16985M37533);
            c20605M37541.f26659 = c5816Mo29099.mo29576(c24705);
            C15714 c15716 = this.f56998;
            C14747 c14747M37554 = c15716.m37554((AbstractC22295) this.f56998.m37546(Boolean.TRUE), C14769.of((Object) c15716.m37567(c20605M37541)));
            c14747M37554.f48162 = true;
            c14747M37554.f26659 = this.f57005.f48255;
            this.f9840 = c14747M37554;
            return;
        }
        this.f9840 = this.f56998.m37546(Boolean.TRUE);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1951(C9614 c9614) {
        this.f9840 = mo8479(c9614.f31095);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1956(C13344 c13344) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo8479(c13344.f42553);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo8479(c13344.f42552);
        EnumC21461 enumC21461 = EnumC21461.f68522;
        C6435 c6435M37510 = this.f56998.m37510(enumC21461, abstractC22295, abstractC22296);
        C7395 c7395M6593 = this.f57000.m6593(c6435M37510, enumC21461, abstractC22295.f26659, abstractC22296.f26659);
        c6435M37510.f62402 = c7395M6593;
        c6435M37510.f26659 = c7395M6593.f38067.mo31585();
        this.f9840 = c6435M37510;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        m41186(c15493, c15493.f50422, c15493.f50421, c15493.f50423, c15493.f50420);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        m41186(c13256, c13256.f42352, c13256.f42355, c13256.f42351, c13256.f42353);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x037f  */
    /* JADX WARN: Code duplicated, block: B:60:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x03db  */
    /* JADX WARN: Code duplicated, block: B:74:0x03df  */
    /* JADX WARN: Code duplicated, block: B:79:0x0400  */
    /* JADX WARN: Code duplicated, block: B:80:0x0404  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41186(AbstractC8036 abstractC8036, AbstractC22295 abstractC22295, C14769 c14769, boolean z, boolean z2) {
        Iterator it;
        int i;
        C18499 c18499;
        C21351 c21351;
        int i2;
        if (!z2) {
            if (abstractC8036.m21911(EnumC21461.f68544)) {
                super.mo1517((C15493) abstractC8036);
                return;
            } else {
                super.mo1514((C13256) abstractC8036);
                return;
            }
        }
        boolean zM51067 = abstractC22295.f26659.m51067(EnumC21172.BOT);
        C14764 c14764 = this.f57005;
        final AbstractC22664 abstractC22664 = zM51067 ? c14764.f48286 : abstractC22295.f26659;
        C17638 c17638 = this.f57010;
        C11972.m30026(c17638.m41295());
        C11972.m30026(c17638.m41296(this.f57001.f10275.f61856));
        C18499 c184910 = new C18499();
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            if (((C21351) c147610.f48335).f68009.isEmpty() && c147610.f48336.m35550()) {
                C21351 c21352 = (C21351) c147610.f48336.f48335;
                c21352.f68007 = c21352.f68007.m35549(((C21351) c147610.f48335).f68007);
            } else {
                c184910.m43089((C21351) c147610.f48335);
            }
        }
        C14769 c14769M43093 = c184910.m43093();
        C18499 c184911 = new C18499();
        StringBuilder sb = new StringBuilder("selector");
        sb.append(abstractC8036.f26658);
        EnumC16305 enumC16305 = this.f57003;
        sb.append(enumC16305.m38664());
        sb.append("temp");
        String string = sb.toString();
        C15252 c15252 = this.f56997;
        C5816 c5816 = new C5816(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c15252.f49864.m51194(string), abstractC22664, this.f57006);
        int i3 = 2;
        boolean zAnyMatch = C1170.stream(c14769M43093).flatMap(new C18964(6)).anyMatch(new C24091(i3));
        C21351 c21353 = (C21351) c14769M43093.last();
        if (z && !zAnyMatch && C1170.stream(c14769M43093).flatMap(new C4921(5)).noneMatch(new C22075(i3))) {
            C14769 c147611 = c21353.f68007;
            AbstractC22664 abstractC22665 = c14764.f48241;
            C23787 c23787M37547 = this.f56998.m37547(abstractC22665.mo9097(), (Object) null);
            c23787M37547.f26659 = abstractC22665;
            c21353.f68007 = c147611.m35552(c23787M37547);
            zAnyMatch = true;
        }
        AbstractC22295 abstractC22295M1931 = (AbstractC22295) mo8479(abstractC22295);
        C15714 c15714 = this.f56998;
        c15714.f51040 = abstractC8036.f26658;
        if (!zAnyMatch) {
            abstractC22295M1931 = this.f57007.m1931(abstractC22295M1931);
        }
        c184911.m43089(c15714.m37523(c5816, abstractC22295M1931));
        AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194((enumC16305.m38664() + abstractC8036.f26658) + "index");
        C17223 c17223 = c14764.f48253;
        AbstractC22664 abstractC22666 = c14764.f48286;
        AbstractC22664 abstractC22667 = c14764.f48317;
        C17223 c17224 = c14764.f48253;
        C5816 c5817 = new C5816(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC19728M51194, c17223, this.f57006);
        C15714 c15715 = this.f56998;
        c15715.f51040 = abstractC8036.f26658;
        C23787 c23787M37548 = this.f56998.m37547(c17224.mo9097(), (Object) 0);
        c23787M37548.f26659 = c17224.mo23624((Object) 0);
        c184911.m43089(c15715.m37523(c5817, c23787M37548));
        C21351 c21354 = c21353;
        C14769 c14769M35540 = C14769.m35540(c14764.f48324, c14764.f48282, c14764.f48297, this.f57009.m55122(new C10510(abstractC22667.f73596, abstractC22667.mo23449(), C14769.of((Object) new C10729(abstractC22666, EnumC18670.UNBOUND, c14764.f48274)))));
        InterfaceC8344[] interfaceC8344Arr = (InterfaceC8344[]) C1170.stream(c14769M43093).flatMap(new C7351(7)).map(new Function() { // from class: l.ᩴۧۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C17534.m41183(this.f63620, abstractC22664, (AbstractC18367) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).filter(new C0110(4)).toArray(new C7338(2));
        boolean zM29588 = abstractC22664.f73596.m29588();
        AbstractC19728 abstractC19728 = zM29588 ? c15252.f49861 : c15252.f49778;
        C5816 c5818 = c5816;
        C18499 c184912 = c184911;
        C10377 c10377M49762 = this.f57004.m49762(abstractC8036, this.f57001, c14764.f48243, abstractC19728, c14769M35540, C14769.m35543());
        C18582 c18582 = new C18582(abstractC19728, c14764.f48321, c10377M49762.mo22021(), new C23191(C14769.of((Object) (zM29588 ? abstractC22664 : abstractC22666), (Object) c17224), c17224, C14769.m35543(), c14764.f48275), interfaceC8344Arr);
        C15714 c15716 = this.f56998;
        C23041 c23041M37544 = c15716.m37544(c15716.m37574(c10377M49762.f38069), c18582.f38072);
        c23041M37544.f74775 = c18582;
        c23041M37544.f26659 = c17224;
        C24533 c24533M37550 = this.f56998.m37550(c23041M37544, C14769.m35543(), C14769.of((Object) this.f56998.m37508((AbstractC11781) c5818), (Object) this.f56998.m37508((AbstractC11781) c5817)));
        c24533M37550.f26659 = c17224;
        Iterator it2 = c14769M43093.iterator();
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        while (it2.hasNext()) {
            C21351 c21355 = (C21351) it2.next();
            C14769 c147612 = c21355.f68007;
            if (c147612.m35551() > 1) {
                it = it2;
                if (C1170.stream(c21355.f68007).anyMatch(new C6803(2))) {
                    i = 1;
                    c147612 = (C14769) C1170.stream(c21355.f68007).filter(new C20404(i)).collect(C14769.m35544());
                }
                if (c147612.m35551() == i || !((AbstractC18367) c147612.f48335).mo9535() || z3) {
                    c21355.f68009 = m9867(c21355.f68009);
                } else {
                    AbstractC18367 abstractC18367 = (AbstractC18367) c147612.f48335;
                    this.f56999 = new C11567(this);
                    C5816 c5819 = this.f57002;
                    try {
                        this.f57002 = c5818;
                        AbstractC22295 abstractC22296 = (AbstractC22295) mo8479(abstractC18367);
                        c21355.f68009 = m9867(c21355.f68009);
                        C15714 c15717 = this.f56998;
                        AbstractC18367 abstractC18368 = (AbstractC18367) c147612.f48335;
                        abstractC18368.getClass();
                        c15717.m37552((InterfaceC5075) abstractC18368);
                        C1214 c1214 = new C1214();
                        c1214.f4446 = null;
                        c1214.f26658 = c15717.f51040;
                        c1214.f4447 = abstractC8036;
                        C14769 c147613 = c21355.f68009;
                        C15714 c15718 = this.f56998;
                        EnumC21461 enumC21461 = EnumC21461.f68521;
                        C3561 c3561M37505 = c15718.m37505(enumC21461, abstractC22296);
                        C7395 c7395M6594 = this.f57000.m6594(c3561M37505, enumC21461, abstractC22296.f26659);
                        c3561M37505.f62402 = c7395M6594;
                        c7395M6594.f38067.mo31585();
                        c3561M37505.f26659 = c14764.f48255;
                        C15714 c15719 = this.f56998;
                        C5887 c5887M37508 = c15719.m37508((AbstractC11781) c5817);
                        Integer numValueOf = Integer.valueOf(i4 + 1);
                        C23787 c23787M37549 = this.f56998.m37547(c17224.mo9097(), numValueOf);
                        c23787M37549.f26659 = c17224.mo23624(numValueOf);
                        C20605 c20605M37541 = c15719.m37541((AbstractC22295) c5887M37508, (AbstractC22295) c23787M37549);
                        c20605M37541.f26659 = c17224;
                        C14769 c14769M35552 = c147613.m35552(c15718.m37504(c3561M37505, c15719.m37506(0L, C14769.of((Object) c15719.m37567(c20605M37541), (Object) c1214)), (AbstractC19969) null));
                        c21355.f68009 = c14769M35552;
                        c21355.f68009 = c14769M35552.m35549(this.f56999.mo29100(c21355.f26658));
                        this.f57002 = c5819;
                        this.f56999.mo29103();
                    } catch (Throwable th) {
                        this.f57002 = c5819;
                        this.f56999.mo29103();
                        throw th;
                    }
                }
                c18499 = new C18499();
                z4 = z4;
                i4 = i4;
                for (AbstractC18367 abstractC18369 : c21355.f68007) {
                    if (abstractC18369.m21911(EnumC21461.f68552)) {
                        c18499.m43089(abstractC18369);
                        z4 = true;
                        c21351 = c21354;
                    } else {
                        if (z || z4) {
                            c21351 = c21354;
                        } else {
                            c21351 = c21354;
                            if (c21355 == c21351 && abstractC18369.mo9535()) {
                                c18499.m43089(this.f56998.m37516());
                            }
                        }
                        if (abstractC18369.m42832()) {
                            i2 = i4;
                            i4 = -1;
                        } else {
                            i2 = i4 + 1;
                        }
                        c18499.m43089(this.f56998.m37546(Integer.valueOf(i4)));
                        i4 = i2;
                    }
                    c21354 = c21351;
                }
                C21351 c21356 = c21354;
                c21355.f68007 = c18499.m43093();
                if (c21355.f68011 == EnumC24528.STATEMENT) {
                    z3 = c21355.f68010;
                } else {
                    C15714 c157110 = this.f56998;
                    c157110.f51040 = C11239.m28358((AbstractC8036) c21355.f68009.last());
                    C14637 c14637M37525 = c157110.m37525((AbstractC19728) null);
                    c14637M37525.f47896 = abstractC8036;
                    c21355.f68009 = c21355.f68009.m35546(c14637M37525);
                    z3 = false;
                }
                it2 = it;
                c21354 = c21356;
                c5818 = c5818;
                c184912 = c184912;
                c14764 = c14764;
            } else {
                it = it2;
            }
            i = 1;
            if (c147612.m35551() == i) {
                c21355.f68009 = m9867(c21355.f68009);
            } else {
                c21355.f68009 = m9867(c21355.f68009);
            }
            c18499 = new C18499();
            z4 = z4;
            i4 = i4;
            while (r4.hasNext()) {
                if (abstractC18369.m21911(EnumC21461.f68552)) {
                    c18499.m43089(abstractC18369);
                    z4 = true;
                    c21351 = c21354;
                } else if (z) {
                    c21351 = c21354;
                    if (abstractC18369.m42832()) {
                        i2 = i4;
                        i4 = -1;
                    } else {
                        i2 = i4 + 1;
                    }
                    c18499.m43089(this.f56998.m37546(Integer.valueOf(i4)));
                    i4 = i2;
                } else {
                    c21351 = c21354;
                    if (abstractC18369.m42832()) {
                        i2 = i4;
                        i4 = -1;
                    } else {
                        i2 = i4 + 1;
                    }
                    c18499.m43089(this.f56998.m37546(Integer.valueOf(i4)));
                    i4 = i2;
                }
                c21354 = c21351;
            }
            C21351 c21357 = c21354;
            c21355.f68007 = c18499.m43093();
            if (c21355.f68011 == EnumC24528.STATEMENT) {
                z3 = c21355.f68010;
            } else {
                C15714 c157111 = this.f56998;
                c157111.f51040 = C11239.m28358((AbstractC8036) c21355.f68009.last());
                C14637 c14637M37526 = c157111.m37525((AbstractC19728) null);
                c14637M37526.f47896 = abstractC8036;
                c21355.f68009 = c21355.f68009.m35546(c14637M37526);
                z3 = false;
            }
            it2 = it;
            c21354 = c21357;
            c5818 = c5818;
            c184912 = c184912;
            c14764 = c14764;
        }
        C18499 c184913 = c184912;
        if (abstractC8036.m21911(EnumC21461.f68544)) {
            C15493 c15493 = (C15493) abstractC8036;
            c15493.f50422 = c24533M37550;
            c15493.f50421 = c14769M43093;
            c184913.m43089(c15493);
            this.f9840 = this.f56998.m37506(0L, c184913.m43093());
            return;
        }
        C13256 c13256 = (C13256) abstractC8036;
        c13256.f42352 = c24533M37550;
        c13256.f42355 = c14769M43093;
        C14747 c14747M37554 = this.f56998.m37554((AbstractC22295) c13256, c184913.m43093());
        c14747M37554.f26659 = abstractC8036.f26659;
        c14747M37554.f48162 = true;
        this.f9840 = c14747M37554;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        this.f56999 = new C11567(this);
        try {
            super.mo1501(c6435);
            this.f9840 = this.f56999.mo29102(c6435);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        this.f56999 = new C11567(this);
        try {
            super.mo1508(c10162);
            this.f9840 = this.f56999.mo29102(c10162);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        this.f56999 = new C11567(this);
        try {
            super.mo1492(c2158);
            this.f9840 = this.f56999.mo29101(c2158);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        this.f56999 = new C11567(this);
        try {
            super.mo1522(c20057);
            this.f9840 = this.f56999.mo29101(c20057);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        this.f56999 = new C11567(this);
        try {
            super.mo1502(c6545);
            this.f9840 = this.f56999.mo29101(c6545);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        this.f56999 = new C11567(this);
        try {
            super.mo1507(c8671);
            this.f9840 = this.f56999.mo29101(c8671);
        } finally {
            this.f56999.mo29103();
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        C10377 c10377 = this.f57006;
        try {
            this.f57006 = c6633.f22152;
            super.mo1503(c6633);
        } finally {
            this.f57006 = c10377;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        C5816 c5816Mo29105 = (c5887.f20170.mo29591() & 576460752303423488L) != 0 ? this.f56999.mo29105((C6650) c5887.f20170) : null;
        if (c5816Mo29105 == null) {
            super.mo1500(c5887);
            return;
        }
        C15714 c15714 = this.f56998;
        c15714.f51040 = c5887.f26658;
        this.f9840 = c15714.m37508((AbstractC11781) c5816Mo29105);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        C18499 c18499 = new C18499();
        this.f56999 = new C13059(this, c18499);
        C10377 c10377 = this.f57006;
        if (c10377 == null) {
            try {
                this.f57006 = new C10377(c4197.f15345 | 1048576, this.f56997.f49799, null, this.f57008);
            } finally {
                this.f57006 = c10377;
                this.f56999.mo29103();
            }
        }
        for (C14769 c14769 = c4197.f15344; c14769.m35550(); c14769 = c14769.f48336) {
            c18499.m43089((AbstractC19969) mo8479((AbstractC19969) c14769.f48335));
        }
        c4197.f15344 = c18499.m43093();
        this.f9840 = c4197;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        AbstractC24994 abstractC24994 = this.f56999;
        try {
            this.f56999 = new C16788(this);
            super.mo1518(c16327);
        } finally {
            this.f56999 = abstractC24994;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C24550 c24550 = this.f57008;
        C10377 c10377 = this.f57006;
        try {
            this.f57008 = c7926.f26345;
            this.f57006 = null;
            super.mo1505(c7926);
        } finally {
            this.f57008 = c24550;
            this.f57006 = c10377;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C10377 c10377 = this.f57006;
        try {
            c12510.f40170 = (C4395) mo8479(c12510.f40170);
            c12510.f40166 = (AbstractC22295) mo8479(c12510.f40166);
            if (this.f57006 == null) {
                this.f57006 = new C10377((c12510.f40170.f15825 & 8) | 1048576, this.f56997.f49799, null, this.f57008);
            }
            AbstractC22295 abstractC22295 = c12510.f40171;
            if (abstractC22295 != null) {
                c12510.f40171 = (AbstractC22295) mo8479(abstractC22295);
            }
            this.f9840 = c12510;
        } finally {
            this.f57006 = c10377;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 m41191(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        try {
            this.f56998 = c15714;
            this.f57001 = c3168;
            mo8479(abstractC8036);
            return abstractC8036;
        } finally {
            this.f56998 = null;
            this.f57001 = null;
        }
    }

    public C17534(C4747 c4747) {
        c4747.m14646(f56996, this);
        this.f57005 = C14764.m35506(c4747);
        this.f57007 = C0310.m1899(c4747);
        this.f57004 = C22010.m49750(c4747);
        this.f56998 = C15714.m37502(c4747);
        this.f57009 = C24705.m55066(c4747);
        this.f57000 = C1917.m6583(c4747);
        this.f56997 = C15252.m36599(c4747);
        this.f57003 = EnumC16305.m38659(c4747);
        this.f57010 = C17638.m41289(c4747);
        C13015.m32421(c4747).m32432("debug.patterns");
    }
}
