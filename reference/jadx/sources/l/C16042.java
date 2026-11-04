package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4446 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16042 extends C3036 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C13477 f52028 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15714 f52029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3168 f52030;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f52031;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15252 f52032;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15846 f52033;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22838 f52034;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14764 f52035;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22010 f52036;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f52037 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0310 f52038;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f52039;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11518 f52040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C24705 f52041;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f52042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16042 m38195(C4747 c4747) {
        C16042 c16042 = (C16042) c4747.m14643(f52028);
        return c16042 == null ? new C16042(c4747) : c16042;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m38200(AbstractC22664 abstractC22664, C3168 c3168, AbstractC22295 abstractC22295) {
        C3168 c3169 = this.f52030;
        try {
            this.f52030 = c3168;
            return m38201(abstractC22664, abstractC22295);
        } finally {
            this.f52030 = c3169;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m38201(AbstractC22664 abstractC22664, AbstractC22295 abstractC22295) {
        AbstractC22664 abstractC22664Mo4935 = abstractC22664.mo4935();
        if (abstractC22295.f26659.mo40452() == abstractC22664.mo40452()) {
            AbstractC22664 abstractC22665 = abstractC22295.f26659;
            C24705 c24705 = this.f52041;
            if (!c24705.m55164(abstractC22665, abstractC22664Mo4935, c24705.f79958)) {
                C15714 c15714 = this.f52029;
                int i = c15714.f51040;
                c15714.f51040 = abstractC22295.f26658;
                if (!c24705.m55149(abstractC22295.f26659, abstractC22664Mo4935)) {
                    C3168 c3168 = this.f52030;
                    AbstractC22970 abstractC22970 = abstractC22664Mo4935.f73596;
                    C22010 c22010 = this.f52036;
                    if (!c22010.m49791(c3168, abstractC22970, false)) {
                        C3168 c3169 = this.f52030;
                        C1699 c1699 = new C1699(c22010, c3169, c3169.f10279.f26659, abstractC22664Mo4935.f73596);
                        C7926 c7926 = c3169.f10279;
                        C17007 c17007Mo3799 = c1699.mo3799(EnumC22229.ERROR, abstractC22295, c7926.f26345, c7926.f26659, null, null, null);
                        if (c17007Mo3799 != null) {
                            c17007Mo3799.m40092(EnumC6984.RESOLVE_ERROR);
                            c22010.f71001.mo20039(c17007Mo3799);
                        }
                    }
                    C15714 c15715 = this.f52029;
                    abstractC22295 = c15715.m37533((AbstractC8036) c15715.m37557(abstractC22664Mo4935), abstractC22295);
                    abstractC22295.f26659 = abstractC22664Mo4935;
                }
                this.f52029.f51040 = i;
            }
        }
        return abstractC22295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m38199(AbstractC22295 abstractC22295, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        if (abstractC22664.mo40452()) {
            return abstractC22295;
        }
        if (abstractC22665 != null && abstractC22665.mo40452()) {
            abstractC22665 = this.f52041.m55132(abstractC22295.f26659);
        }
        abstractC22295.f26659 = abstractC22664;
        return abstractC22665 != null ? m38201(abstractC22665, abstractC22295) : abstractC22295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38206(AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        if (c147610.isEmpty()) {
            return;
        }
        while (c147610.f48336.m35550()) {
            c14769.f48335 = m38197((AbstractC22664) c147610.f48335, (AbstractC8036) c14769.f48335);
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        AbstractC22664 abstractC22665 = (AbstractC22664) c147610.f48335;
        boolean z = true;
        if (abstractC22664 == null && c14769.m35551() != 1) {
            z = false;
        }
        C11972.m30026(z);
        if (abstractC22664 != null) {
            while (c14769.m35550()) {
                c14769.f48335 = m38197(abstractC22664, (AbstractC8036) c14769.f48335);
                c14769 = c14769.f48336;
            }
            return;
        }
        c14769.f48335 = m38197(abstractC22665, (AbstractC8036) c14769.f48335);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38205(C14769 c14769, C14769 c147610, AbstractC22664 abstractC22664, C3168 c3168) {
        C3168 c3169 = this.f52030;
        try {
            this.f52030 = c3168;
            m38206(abstractC22664, c14769, c147610);
        } finally {
            this.f52030 = c3169;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38202(InterfaceC5075 interfaceC5075, C10377 c10377, C10377 c10378, C24550 c24550, C18499 c18499) {
        C10377 c10379;
        C14769 c14769M35543;
        C5887 c5887M37509;
        Object objM37553;
        this.f52029.m37552(interfaceC5075);
        AbstractC22664 abstractC22664 = c10378.f38067;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55132 = c24705.m55132(abstractC22664);
        AbstractC22664 abstractC22664Mo29576 = c10377.mo29576(c24705);
        C10377 c103710 = new C10377((c10378.f38071 & 7) | 2147487744L | (c24550.m29587() ? 8796093022208L : 0L), c10377.f38072, abstractC22664Mo29576, c24550);
        if (c10378.f33013 != null) {
            c14769M35543 = C14769.m35543();
            C14769 c14769 = c10378.f33013;
            C14769 c147610 = ((C23191) abstractC22664Mo29576).f75155;
            while (c14769.m35550() && c147610.m35550()) {
                C5816 c5816 = (C5816) c14769.f48335;
                C14769 c147611 = c14769;
                C10377 c103711 = c103710;
                C5816 c5817 = new C5816(c5816.f38071 | 8589938688L, c5816.f38072, (AbstractC22664) c147610.f48335, c103711);
                c5817.m29577((AbstractC11781) c147611.f48335);
                c14769M35543 = c14769M35543.m35546(c5817);
                c14769 = c147611.f48336;
                c147610 = c147610.f48336;
                c103710 = c103711;
            }
            c10379 = c103710;
        } else {
            c10379 = c103710;
            c14769M35543 = null;
        }
        c10379.f33013 = c14769M35543;
        c10379.m29577(c10378);
        C15714 c15714 = this.f52029;
        c15714.getClass();
        C6633 c6633M37512 = c15714.m37512(c10379, c10379.f38067, (C4197) null);
        if (c10378.f38069 == c24550) {
            c5887M37509 = this.f52029.m37566(c24550.mo29576(c24705));
        } else {
            c5887M37509 = this.f52029.m37509(c24550, c24705.m55137(c24550.f38067).f73596.mo29576(c24705));
        }
        AbstractC22664 abstractC22664Mo31585 = abstractC22664M55132.mo31585();
        C15714 c15715 = this.f52029;
        C23041 c23041M37543 = c15715.m37543(c5887M37509, c10378);
        c23041M37543.f26659 = abstractC22664Mo31585;
        C14769 c14769M37555 = this.f52029.m37555(c6633M37512.f22145);
        m38206((AbstractC22664) null, c14769M37555, abstractC22664M55132.mo50621());
        C24533 c24533M37550 = c15715.m37550(c23041M37543, (C14769) null, c14769M37555);
        c24533M37550.f26659 = abstractC22664Mo31585;
        if (abstractC22664M55132.mo31585().m51067(EnumC21172.VOID)) {
            objM37553 = this.f52029.m37567(c24533M37550);
        } else {
            objM37553 = this.f52029.m37553(m38201(abstractC22664Mo29576.mo31585(), (AbstractC22295) c24533M37550));
        }
        c6633M37512.f22148 = this.f52029.m37506(0L, C14769.of(objM37553));
        c18499.m43089(c6633M37512);
        c24550.mo29590();
        c24550.f79576.mo7481(c10379);
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38203(InterfaceC5075 interfaceC5075, AbstractC22970 abstractC22970, C24550 c24550, C18499 c18499) {
        C24705 c24705;
        boolean zM55149;
        boolean z;
        Iterator it = abstractC22970.mo29571().mo7472((Predicate) null, EnumC13908.NON_RECURSIVE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c24705 = this.f52041;
            if (!zHasNext) {
                break;
            }
            AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
            if (abstractC11781.f38066 == EnumC13603.f43218 && abstractC11781.f38072 != this.f52032.f49865 && (abstractC11781.mo29591() & 10) == 0 && (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && abstractC11781.m29567((AbstractC22970) c24550, c24705)) {
                C10377 c10377 = (C10377) abstractC11781;
                C10377 c10377M26688 = c10377.m26688(c24550, c24705);
                C10377 c10377M26687 = c10377.m26687(c24550, c24705, true);
                if (c10377M26688 == null || c10377M26688 == c10377 || (c10377M26687 != null && !c10377M26688.f38069.mo29596(c10377M26687.f38069, c24705))) {
                    if (c10377M26687 != null && c10377M26688 != c10377M26687) {
                        AbstractC22664 abstractC22664 = c24550.f38067;
                        if (c10377M26687 != c10377) {
                            AbstractC22664 abstractC22664Mo29576 = c10377.mo29576(c24705);
                            if (c24705.m55149(c24705.m55132(c24705.m55126(c10377, abstractC22664)), abstractC22664Mo29576)) {
                                AbstractC22664 abstractC22664Mo29577 = c10377M26687.mo29576(c24705);
                                if (c24705.m55149(c24705.m55132(c24705.m55126(c10377M26687, abstractC22664)), abstractC22664Mo29577)) {
                                    zM55149 = c24705.m55149(abstractC22664Mo29577, abstractC22664Mo29576);
                                    z = !zM55149;
                                }
                            }
                            z = true;
                        } else if ((c10377.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            z = false;
                        } else {
                            zM55149 = c24705.m55149(c24705.m55132(c24705.m55126(c10377, abstractC22664)), c10377.mo29576(c24705));
                            z = !zM55149;
                        }
                        if (z) {
                            m38202(interfaceC5075, c10377, c10377M26687, c24550, c18499);
                        }
                    }
                    if (c10377M26687 == c10377 && c10377M26687.f38069 != c24550 && (c10377M26687.f38071 & 16) == 0 && (c10377.f38071 & 1025) == 1) {
                        c24550.mo29590();
                        if ((c24550.f38071 & 1) > (1 & c10377M26687.f38069.mo29591())) {
                            m38202(interfaceC5075, c10377, c10377M26687, c24550, c18499);
                        }
                    }
                }
            }
        }
        for (C14769 c14769M55144 = c24705.m55144(abstractC22970.f38067); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            m38203(interfaceC5075, ((AbstractC22664) c14769M55144.f48335).f73596, c24550, c18499);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38204(InterfaceC5075 interfaceC5075, C24550 c24550, C18499 c18499) {
        AbstractC22664 abstractC22664 = c24550.f38067;
        C24705 c24705 = this.f52041;
        for (AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664); abstractC22664M55137.m51067(EnumC21172.CLASS); abstractC22664M55137 = c24705.m55137(abstractC22664M55137)) {
            m38203(interfaceC5075, abstractC22664M55137.f73596, c24550, c18499);
        }
        for (C14769 c14769M55144 = c24705.m55144(c24550.f38067); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            m38203(interfaceC5075, ((AbstractC22664) c14769M55144.f48335).f73596, c24550, c18499);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 m38197(AbstractC22664 abstractC22664, AbstractC8036 abstractC8036) {
        AbstractC22664 abstractC22665 = this.f52042;
        try {
            this.f52042 = abstractC22664;
            return mo8479(abstractC8036);
        } finally {
            this.f52042 = abstractC22665;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m38198(AbstractC22664 abstractC22664, C14769 c14769) {
        AbstractC22664 abstractC22665 = this.f52042;
        try {
            this.f52042 = abstractC22664;
            return m9867(c14769);
        } finally {
            this.f52042 = abstractC22665;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        m38207(c7926.f26345);
        this.f9840 = c7926;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664 = this.f52037;
        try {
            this.f52037 = c24705.m55132(c6633.f26659).mo31585();
            c6633.f22147 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c6633.f22147);
            c6633.f22154 = C14769.m35543();
            C14769 c14769 = c6633.f22145;
            m9868(c14769);
            c6633.f22145 = c14769;
            c6633.f22149 = (C12510) m38197((AbstractC22664) null, c6633.f22149);
            c6633.f22146 = m38198((AbstractC22664) null, c6633.f22146);
            c6633.f22148 = (C4197) m38197(c6633.f22152.mo29576(c24705).mo31585(), c6633.f22148);
            c6633.f26659 = c24705.m55132(c6633.f26659);
            this.f9840 = c6633;
        } finally {
            this.f52037 = abstractC22664;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        c12510.f40166 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c12510.f40166);
        AbstractC22295 abstractC22295 = c12510.f40171;
        C5816 c5816 = c12510.f40168;
        C24705 c24705 = this.f52041;
        c12510.f40171 = (AbstractC22295) m38197(c5816.mo29576(c24705), (AbstractC8036) abstractC22295);
        c12510.f26659 = c24705.m55132(c12510.f26659);
        this.f9840 = c12510;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        c8671.f28313 = (AbstractC19969) mo8479(c8671.f28313);
        c8671.f28314 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c8671.f28314);
        this.f9840 = c8671;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        c6545.f21979 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c6545.f21979);
        c6545.f21978 = (AbstractC19969) mo8479(c6545.f21978);
        this.f9840 = c6545;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        c20057.f64457 = m38198((AbstractC22664) null, c20057.f64457);
        AbstractC22295 abstractC22295 = c20057.f64458;
        if (abstractC22295 != null) {
            c20057.f64458 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) abstractC22295);
        }
        c20057.f64455 = m38198((AbstractC22664) null, c20057.f64455);
        c20057.f64456 = (AbstractC19969) mo8479(c20057.f64456);
        this.f9840 = c20057;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        c7180.f23710 = (C12510) m38197((AbstractC22664) null, c7180.f23710);
        AbstractC22295 abstractC22295 = c7180.f23711;
        AbstractC22664 abstractC22664 = abstractC22295.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22295 abstractC22296 = (AbstractC22295) m38197(c24705.m55132(abstractC22664), (AbstractC8036) abstractC22295);
        c7180.f23711 = abstractC22296;
        if (c24705.m55120(abstractC22296.f26659) == null) {
            c7180.f23711.f26659 = abstractC22664;
        }
        c7180.f23709 = (AbstractC19969) mo8479(c7180.f23709);
        this.f9840 = c7180;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664 = this.f52037;
        try {
            this.f52037 = c24705.m55132(c16327.m37319(c24705)).mo31585();
            c16327.f52999 = m9867(c16327.f52999);
            AbstractC8036 abstractC8036 = c16327.f53001;
            c16327.f53001 = m38197((abstractC8036.f26659 == null || this.f52037.m51067(EnumC21172.VOID)) ? null : this.f52037, abstractC8036);
            AbstractC22664 abstractC22665 = c16327.f26659;
            abstractC22665.getClass();
            if (abstractC22665 instanceof C1562) {
                c16327.f26659 = c24705.m55132(c24705.m55092(c16327.f26659.f73596).f38069.f38067);
            } else {
                c16327.f26659 = c24705.m55132(c16327.f26659);
            }
            this.f9840 = c16327;
        } finally {
            this.f52037 = abstractC22664;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        AbstractC22664 abstractC22664M55132;
        AbstractC22664 abstractC22664 = c15493.f50422.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664);
        C14764 c14764 = this.f52035;
        if (abstractC22664M55137 == null || abstractC22664M55137.f73596 != c14764.f48309) {
            abstractC22664M55132 = c14764.f48253;
        } else {
            abstractC22664M55132 = c24705.m55132(c15493.f50422.f26659);
        }
        c15493.f50422 = (AbstractC22295) m38197(abstractC22664M55132, (AbstractC8036) c15493.f50422);
        C14769 c14769 = c15493.f50421;
        m9869(c14769);
        c15493.f50421 = c14769;
        this.f9840 = c15493;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2611(C21351 c21351) {
        c21351.f68007 = m38198((AbstractC22664) null, c21351.f68007);
        c21351.f68009 = m9867(c21351.f68009);
        this.f9840 = c21351;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        c24335.f78930 = (C12510) m38197((AbstractC22664) null, c24335.f78930);
        this.f9840 = c24335;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        AbstractC22664 abstractC22664M55132;
        AbstractC22664 abstractC22664 = c13256.f42352.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664);
        C14764 c14764 = this.f52035;
        if (abstractC22664M55137 == null || abstractC22664M55137.f73596 != c14764.f48309) {
            abstractC22664M55132 = c14764.f48253;
        } else {
            abstractC22664M55132 = c24705.m55132(c13256.f42352.f26659);
        }
        c13256.f42352 = (AbstractC22295) m38197(abstractC22664M55132, (AbstractC8036) c13256.f42352);
        c13256.f42355 = m9867(c13256.f42355);
        AbstractC22664 abstractC22664M55133 = c24705.m55132(c13256.f26659);
        c13256.f26659 = abstractC22664M55133;
        this.f9840 = m38199(c13256, abstractC22664M55133, this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1951(C9614 c9614) {
        c9614.f31095 = (AbstractC2903) m38197((AbstractC22664) null, c9614.f31095);
        this.f9840 = c9614;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1956(C13344 c13344) {
        c13344.f42553 = (AbstractC2903) m38197((AbstractC22664) null, c13344.f42553);
        c13344.f42552 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c13344.f42552);
        this.f9840 = c13344;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1948(C5799 c5799) {
        AbstractC22295 abstractC22295 = c5799.f19919;
        c5799.f19919 = (AbstractC22295) m38197(this.f52041.m55132(abstractC22295.f26659), (AbstractC8036) abstractC22295);
        c5799.f19918 = (C4197) mo8479(c5799.f19918);
        this.f9840 = c5799;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        c11764.f38023 = m38198(this.f52035.f48280, c11764.f38023);
        c11764.f38022 = (C4197) mo8479(c11764.f38022);
        C14769 c14769 = c11764.f38025;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((C0468) c147610.f48335);
        }
        c11764.f38025 = c14769;
        c11764.f38024 = (C4197) mo8479(c11764.f38024);
        this.f9840 = c11764;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        c10162.f32546 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c10162.f32546);
        AbstractC22295 abstractC22295 = c10162.f32544;
        AbstractC22664 abstractC22664 = c10162.f26659;
        C24705 c24705 = this.f52041;
        c10162.f32544 = (AbstractC22295) m38197(c24705.m55132(abstractC22664), (AbstractC8036) abstractC22295);
        c10162.f32545 = (AbstractC22295) m38197(c24705.m55132(c10162.f26659), (AbstractC8036) c10162.f32545);
        AbstractC22664 abstractC22664M55132 = c24705.m55132(c10162.f26659);
        c10162.f26659 = abstractC22664M55132;
        this.f9840 = m38199(c10162, abstractC22664M55132, this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        c2158.f7114 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c2158.f7114);
        c2158.f7115 = (AbstractC19969) mo8479(c2158.f7115);
        c2158.f7116 = (AbstractC19969) mo8479(c2158.f7116);
        this.f9840 = c2158;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1952(C11106 c11106) {
        c11106.f35018 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c11106.f35018);
        this.f9840 = c11106;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        if (!this.f52037.m51067(EnumC21172.VOID)) {
            c11018.f34795 = (AbstractC22295) m38197(this.f52037, (AbstractC8036) c11018.f34795);
        }
        this.f9840 = c11018;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(C14637 c14637) {
        this.f9840 = c14637;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        AbstractC22295 abstractC22295 = c4307.f15611;
        AbstractC22664 abstractC22664 = abstractC22295.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22295 abstractC22296 = (AbstractC22295) m38197(c24705.m55132(abstractC22664), (AbstractC8036) abstractC22295);
        c4307.f15611 = abstractC22296;
        abstractC22296.f26659 = c24705.m55132(abstractC22296.f26659);
        AbstractC22295 abstractC22297 = c4307.f15611;
        c4307.f15611 = m38199(abstractC22297, abstractC22297.f26659, this.f52042);
        this.f9840 = c4307;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        AbstractC22295 abstractC22295 = c2070.f6892;
        c2070.f6892 = (AbstractC22295) m38197(this.f52041.m55132(abstractC22295.f26659), (AbstractC8036) abstractC22295);
        this.f9840 = c2070;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1494(C3451 c3451) {
        c3451.f11254 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48255, (AbstractC8036) c3451.f11254);
        AbstractC22295 abstractC22295 = c3451.f11255;
        if (abstractC22295 != null) {
            c3451.f11255 = (AbstractC22295) m38197(this.f52041.m55132(abstractC22295.f26659), (AbstractC8036) abstractC22295);
        }
        this.f9840 = c3451;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        C14769 c14769Mo50621;
        AbstractC22295 abstractC22295 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c24533.f79554);
        c24533.f79554 = abstractC22295;
        AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC22295);
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664Mo29576 = abstractC11781M28352.mo29576(c24705);
        if (this.f52039 && !c24705.m55113((C10377) abstractC11781M28352.mo10410())) {
            c14769Mo50621 = c24533.f79554.f26659.mo50621();
        } else {
            c14769Mo50621 = abstractC22664Mo29576.mo50621();
        }
        if (abstractC11781M28352.f38072 == this.f52032.f49865 && abstractC11781M28352.f38069 == this.f52035.f48309) {
            c14769Mo50621 = c14769Mo50621.f48336.f48336;
        }
        AbstractC22664 abstractC22664 = c24533.f79553;
        if (abstractC22664 != null) {
            c24533.f79553 = c24705.m55132(abstractC22664);
        } else if (c24533.f79555.m35551() != c14769Mo50621.m35551()) {
            C11972.m30024(String.format("Incorrect number of arguments; expected %d, found %d", Integer.valueOf(c24533.f79555.m35551()), Integer.valueOf(c14769Mo50621.m35551())));
            throw null;
        }
        C14769 c14769 = c24533.f79555;
        m38206(c24533.f79553, c14769, c14769Mo50621);
        c24533.f79555 = c14769;
        c24533.f26659 = c24705.m55132(c24533.f26659);
        this.f9840 = m38199(c24533, abstractC22664Mo29576.mo31585(), this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        C14769 c14769Mo50621;
        AbstractC22295 abstractC22295 = c18565.f60321;
        C24705 c24705 = this.f52041;
        if (abstractC22295 != null) {
            if (c18565.f60319 == null) {
                c18565.f60321 = (AbstractC22295) m38197(c24705.m55132(abstractC22295.f26659), (AbstractC8036) abstractC22295);
            } else {
                c18565.f60325 = c18565.f60325.m35552(this.f52038.m1931(abstractC22295));
                c18565.f60321 = null;
            }
        }
        AbstractC22664 abstractC22664 = c18565.f60322;
        AbstractC22664 abstractC22664M55132 = abstractC22664 != null ? c24705.m55132(abstractC22664) : null;
        if (abstractC22664M55132 != null && this.f52039) {
            c14769Mo50621 = abstractC22664M55132.mo50621();
        } else {
            c14769Mo50621 = c18565.f60318.mo29576(c24705).mo50621();
        }
        c18565.f60323 = (AbstractC22295) m38197((AbstractC22664) null, c18565.f60323);
        AbstractC22664 abstractC22665 = c18565.f60324;
        if (abstractC22665 != null) {
            c18565.f60324 = c24705.m55132(abstractC22665);
        }
        C14769 c14769 = c18565.f60325;
        m38206(c18565.f60324, c14769, c14769Mo50621);
        c18565.f60325 = c14769;
        c18565.f60319 = (C7926) m38197((AbstractC22664) null, c18565.f60319);
        if (abstractC22664M55132 != null) {
            c18565.f60322 = abstractC22664M55132;
        }
        c18565.f26659 = c24705.m55132(c18565.f26659);
        this.f9840 = c18565;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        c21549.f68829 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c21549.f68829);
        m38198(this.f52035.f48253, c21549.f68830);
        AbstractC22664 abstractC22664 = c21549.f26659;
        if (abstractC22664 != null) {
            C14769 c14769 = c21549.f68827;
            C24705 c24705 = this.f52041;
            c21549.f68827 = m38198(c24705.m55132(c24705.m55120(abstractC22664)), c14769);
            c21549.f26659 = c24705.m55132(c21549.f26659);
        } else {
            c21549.f68827 = m38198((AbstractC22664) null, c21549.f68827);
        }
        this.f9840 = c21549;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1945(C1412 c1412) {
        AbstractC22295 abstractC22295 = (AbstractC22295) m38197(this.f52042, (AbstractC8036) c1412.f4986);
        c1412.f4986 = abstractC22295;
        c1412.f26659 = this.f52041.m55132(abstractC22295.f26659);
        this.f9840 = c1412;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1523(C20605 c20605) {
        AbstractC22295 abstractC22295 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c20605.f66030);
        c20605.f66030 = abstractC22295;
        AbstractC22295 abstractC22296 = c20605.f66031;
        AbstractC22664 abstractC22664 = abstractC22295.f26659;
        C24705 c24705 = this.f52041;
        c20605.f66031 = (AbstractC22295) m38197(c24705.m55132(abstractC22664), (AbstractC8036) abstractC22296);
        AbstractC22664 abstractC22664M55132 = c24705.m55132(c20605.f66030.f26659);
        c20605.f26659 = abstractC22664M55132;
        this.f9840 = m38199(c20605, abstractC22664M55132, this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        c12400.f39896 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c12400.f39896);
        c12400.f39895 = (AbstractC22295) m38197((AbstractC22664) c12400.f62402.f38067.mo50621().f48336.f48335, (AbstractC8036) c12400.f39895);
        c12400.f26659 = this.f52041.m55132(c12400.f26659);
        this.f9840 = c12400;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        AbstractC22664 abstractC22664;
        AbstractC22295 abstractC22295 = c3561.f12203;
        if (c3561.mo2285() == EnumC21461.f68548) {
            abstractC22664 = c3561.f26659;
        } else {
            abstractC22664 = (AbstractC22664) c3561.f62402.f38067.mo50621().f48335;
        }
        c3561.f12203 = (AbstractC22295) m38197(abstractC22664, (AbstractC8036) abstractC22295);
        this.f9840 = c3561;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        c6435.f21672 = (AbstractC22295) m38197((AbstractC22664) c6435.f62402.f38067.mo50621().f48335, (AbstractC8036) c6435.f21672);
        c6435.f21671 = (AbstractC22295) m38197((AbstractC22664) c6435.f62402.f38067.mo50621().f48336.f48335, (AbstractC8036) c6435.f21671);
        this.f9840 = c6435;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        C14769 c14769 = c16875.f55197;
        this.f52040.getClass();
        C14769 c14769M28981 = C11518.m28981(c14769);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo8479(c16875.f55198);
        c16875.f55198 = abstractC22295;
        c16875.f26659 = abstractC22295.f26659.mo9927(c14769M28981);
        this.f9840 = c16875;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1963(C16985 c16985) {
        c16985.f55514 = m38197((AbstractC22664) null, c16985.f55514);
        AbstractC22664 abstractC22664 = c16985.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55132 = c24705.m55132(abstractC22664);
        c16985.f26659 = abstractC22664M55132;
        AbstractC22295 abstractC22295 = (AbstractC22295) m38197(abstractC22664M55132, (AbstractC8036) c16985.f55515);
        if (abstractC22295 != c16985.f55515) {
            C16985 c16986 = abstractC22295.m21911(EnumC21461.f68520) ? (C16985) abstractC22295 : null;
            if (c16986 != null && c24705.m55149(c16986.f26659, c16985.f26659)) {
                abstractC22295 = c16986.f55515;
            }
            c16985.f55515 = abstractC22295;
        }
        if (abstractC22664 instanceof C1562) {
            Iterator it = ((C1562) abstractC22664).m5502().iterator();
            while (it.hasNext()) {
                AbstractC22664 abstractC22664M55133 = c24705.m55132((AbstractC22664) it.next());
                if (!c24705.m55149(abstractC22664M55133, c16985.f26659) && !c24705.m55149(abstractC22664M55133, this.f52042)) {
                    c16985.f55515 = m38201(abstractC22664M55133, c16985.f55515);
                }
            }
        }
        this.f9840 = m38199(c16985, c16985.f26659, this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1974(C25279 c25279) {
        c25279.f81646 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c25279.f81646);
        c25279.f81647 = m38197((AbstractC22664) null, c25279.f81647);
        this.f9840 = c25279;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1960(C16129 c16129) {
        AbstractC22295 abstractC22295 = c16129.f52413;
        AbstractC22664 abstractC22664 = abstractC22295.f26659;
        C24705 c24705 = this.f52041;
        c16129.f52413 = (AbstractC22295) m38197(c24705.m55132(abstractC22664), (AbstractC8036) abstractC22295);
        c16129.f52412 = (AbstractC22295) m38197((AbstractC22664) this.f52035.f48253, (AbstractC8036) c16129.f52412);
        this.f9840 = m38199(c16129, c24705.m55120(c16129.f52413.f26659), this.f52042);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        this.f9840 = c17621;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        AbstractC11781 abstractC11781 = c5887.f20170;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664Mo29576 = abstractC11781.mo29576(c24705);
        AbstractC11781 abstractC11782 = c5887.f20170;
        if (abstractC11782.f38066 == EnumC13603.f43213 && abstractC11782.f38067.m51067(EnumC21172.TYPEVAR)) {
            C15714 c15714 = this.f52029;
            c15714.f51040 = c5887.f26658;
            this.f9840 = c15714.m37557(abstractC22664Mo29576);
        } else if (c5887.f26659.mo39105() != null) {
            this.f9840 = c5887;
        } else if (c5887.f20170.f38066 == EnumC13603.f43205) {
            this.f9840 = m38199(c5887, abstractC22664Mo29576, this.f52042);
        } else {
            c5887.f26659 = c24705.m55132(c5887.f26659);
            this.f9840 = c5887;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        AbstractC22664 abstractC22664 = c23041.f74776.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55161 = c24705.m55161(abstractC22664, false);
        if (abstractC22664M55161.mo18914()) {
            AbstractC22295 abstractC22295 = c23041.f74776;
            c23041.f74776 = m38201(c24705.m55132(c23041.f74775.f38069.f38067), (AbstractC22295) m38197(c24705.m55132(abstractC22295.f26659), (AbstractC8036) abstractC22295));
        } else {
            c23041.f74776 = (AbstractC22295) m38197(c24705.m55132(abstractC22664M55161), (AbstractC8036) c23041.f74776);
        }
        if (c23041.f26659.mo39105() != null) {
            this.f9840 = c23041;
            return;
        }
        AbstractC11781 abstractC11781 = c23041.f74775;
        if (abstractC11781.f38066 == EnumC13603.f43205) {
            this.f9840 = m38199(c23041, abstractC11781.mo29576(c24705), this.f52042);
        } else {
            c23041.f26659 = c24705.m55132(c23041.f26659);
            this.f9840 = c23041;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        AbstractC22664 abstractC22664 = c12598.f40436.f26659;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55161 = c24705.m55161(abstractC22664, false);
        if (abstractC22664M55161.mo18914()) {
            abstractC22664M55161 = c12598.f40439.f38069.f38067;
        }
        AbstractC22664 abstractC22664M55132 = c24705.m55132(abstractC22664M55161);
        if (c12598.f40430 == EnumC20803.f66613) {
            c12598.f40436 = this.f52029.m37557(abstractC22664M55132);
        } else {
            c12598.f40436 = (AbstractC22295) m38197(abstractC22664M55132, (AbstractC8036) c12598.f40436);
        }
        AbstractC22664 abstractC22665 = c12598.f26659;
        abstractC22665.getClass();
        if (abstractC22665 instanceof C1562) {
            c12598.f26659 = c24705.m55132(c24705.m55092(c12598.f26659.f73596).f38069.f38067);
        } else {
            c12598.f26659 = c24705.m55132(c12598.f26659);
        }
        AbstractC22664 abstractC22666 = c12598.f40440;
        if (abstractC22666 != null) {
            c12598.f40440 = c24705.m55132(abstractC22666);
        }
        this.f9840 = c12598;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1968(C23589 c23589) {
        c23589.f76594 = (AbstractC22295) m38197((AbstractC22664) null, (AbstractC8036) c23589.f76594);
        c23589.f26659 = this.f52041.m55132(c23589.f26659);
        this.f9840 = c23589;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        this.f9840 = m38197((AbstractC22664) null, (AbstractC8036) c25191.f81425);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1965(C17731 c17731) {
        c17731.f58264 = m38198((AbstractC22664) null, c17731.f58264);
        c17731.f26659 = this.f52041.m55132(c17731.f26659);
        this.f9840 = c17731;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:29:0x009b, B:31:0x00b9, B:34:0x00ca, B:33:0x00c7), top: B:45:0x009b, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38207(C24550 c24550) {
        AbstractC22664 abstractC22664 = c24550.f38067;
        C24705 c24705 = this.f52041;
        AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22664);
        if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
            m38207((C24550) abstractC22664M55137.f73596);
        }
        C3168 c3168M38995 = this.f52033.f51524.m38995(c24550);
        if (c3168M38995 != null) {
            long j = c24550.f38071;
            if ((j & 1125899906842624L) != 0) {
                return;
            }
            c24550.f38071 = j | 1125899906842624L;
            C22838 c22838 = this.f52034;
            boolean z = c22838.get(c3168M38995) != 0;
            if (!z && c24550.mo9564() == c24550) {
                C11972.m30024("No info for outermost class: " + c3168M38995.f10279.f26345);
                throw null;
            }
            if (z && EnumC10903.FLOW.m27669((EnumC10903) c22838.get(c3168M38995))) {
                C11972.m30024(String.format("The current compile state [%s] of class %s is previous to FLOW", c22838.get(c3168M38995), c3168M38995.f10279.f26345));
                throw null;
            }
            C3168 c3168 = this.f52030;
            try {
                this.f52030 = c3168M38995;
                C15714 c15714 = this.f52029;
                AbstractC22664 abstractC22665 = this.f52042;
                this.f52029 = c15714.m37530(c3168M38995.f10275);
                this.f52042 = null;
                try {
                    C7926 c7926 = (C7926) this.f52030.f10273;
                    c7926.f26343 = C14769.m35543();
                    super.mo1505(c7926);
                    this.f52029.f51040 = c7926.f26658;
                    C18499 c18499 = new C18499();
                    if (this.f52031) {
                        m38204(c7926, c24550, c18499);
                    } else {
                        C24550 c24551 = c7926.f26345;
                        c24551.mo29590();
                        if ((c24551.f38071 & 512) == 0) {
                            m38204(c7926, c24550, c18499);
                        }
                    }
                    c7926.f26344 = c18499.m43093().m35549(c7926.f26344);
                    c7926.f26659 = c24705.m55132(c7926.f26659);
                    this.f52029 = c15714;
                    this.f52042 = abstractC22665;
                    this.f52030 = c3168;
                } catch (Throwable th) {
                    this.f52029 = c15714;
                    this.f52042 = abstractC22665;
                    throw th;
                }
            } catch (Throwable th2) {
                this.f52030 = c3168;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 m38196(AbstractC8036 abstractC8036, C15714 c15714) {
        this.f52029 = c15714;
        this.f52042 = null;
        return m38197((AbstractC22664) null, abstractC8036);
    }

    public C16042(C4747 c4747) {
        c4747.m14646(f52028, this);
        this.f52034 = C22838.m51542(c4747);
        this.f52032 = C15252.m36599(c4747);
        C7312.m20023(c4747);
        this.f52035 = C14764.m35506(c4747);
        this.f52033 = C15846.m37791(c4747);
        this.f52041 = C24705.m55066(c4747);
        this.f52029 = C15714.m37502(c4747);
        this.f52036 = C22010.m49750(c4747);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f52031 = EnumC3666.f12542.m11915(enumC20820M47625);
        this.f52039 = EnumC3666.f12575.m11915(enumC20820M47625);
        this.f52040 = C11518.m28979(c4747);
        this.f52038 = C0310.m1899(c4747);
    }
}
