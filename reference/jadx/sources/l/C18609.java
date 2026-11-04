package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18609 extends C3036 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C13477 f60494 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19991 f60495;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15252 f60496;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16042 f60497;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f60498;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22010 f60499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0310 f60500;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f60501;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1917 f60502;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f60503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24705 f60504;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f60505;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C25235 f60506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13388 f60507;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7312 f60508;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC24577 f60509;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f60510;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f60511;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4439 f60512;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3168 f60513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15714 f60514;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14764 f60515;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f60516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18609 m43278(C4747 c4747) {
        C18609 c18609 = (C18609) c4747.m14643(f60494);
        return c18609 == null ? new C18609(c4747) : c18609;
    }

    @Override // l.C3036
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC8036 mo8479(AbstractC8036 abstractC8036) {
        AbstractC24577 abstractC24577 = (AbstractC24577) this.f60505.get(abstractC8036);
        if (abstractC24577 == null) {
            abstractC24577 = this.f60509;
        }
        AbstractC24577 abstractC24578 = this.f60509;
        try {
            this.f60509 = abstractC24577;
            return super.mo8479(abstractC8036);
        } finally {
            this.f60509 = abstractC24578;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m43302(C14769 c14769, AbstractC24577 abstractC24577) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
            AbstractC24577 abstractC24578 = this.f60509;
            try {
                this.f60509 = abstractC24577;
                AbstractC8036 abstractC8036Mo8479 = super.mo8479(abstractC8036);
                this.f60509 = abstractC24578;
                c18499.m43089(abstractC8036Mo8479);
            } catch (Throwable th) {
                this.f60509 = abstractC24578;
                throw th;
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 m43301(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        this.f60514 = c15714;
        this.f60513 = c3168;
        this.f60509 = null;
        this.f60505 = new HashMap();
        return mo8479(abstractC8036);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        if (c7926.f26345.f38069.f38066 == EnumC13603.f43219) {
            c7926 = C4439.m14103(this.f60512, c7926);
        }
        C13388 c13388 = this.f60507;
        try {
            this.f60507 = new C13388(this, c7926);
            super.mo1505(c7926);
            if (!this.f60507.f42676.isEmpty()) {
                C15714 c15714 = this.f60514;
                int i = c15714.f51040;
                try {
                    c15714.m37552((InterfaceC5075) c7926);
                    C13388.m33011(this.f60507, m43298());
                    this.f60514.f51040 = i;
                } catch (Throwable th) {
                    this.f60514.f51040 = i;
                    throw th;
                }
            }
            C14769<AbstractC8036> c14769M43093 = this.f60507.f42673.m43093();
            C14769 c14769 = c7926.f26344;
            c14769.getClass();
            c7926.f26344 = c14769M43093.m35549(c14769);
            for (AbstractC8036 abstractC8036 : c14769M43093) {
                C24550 c24550 = c7926.f26345;
                c24550.mo29590();
                c24550.f79576.mo7481(((C6633) abstractC8036).f22152);
            }
            this.f9840 = c7926;
            this.f60507 = c13388;
        } catch (Throwable th2) {
            this.f60507 = c13388;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ef  */
    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        C14769 c14769M37562;
        int i;
        C4197 c4197M37506;
        boolean z;
        C20847 c20847 = (C20847) this.f60509;
        C10377 c10377 = c20847.f66749;
        C5816 c5816 = c20847.f66745;
        C23191 c23191 = (C23191) c10377.f38067;
        AbstractC11781 abstractC11781 = c20847.f79656;
        C17359.requireNonNull(abstractC11781);
        int i2 = 0;
        int i3 = 2;
        m43283(c16327, new C8562(abstractC11781, i2), new C12945(i3, abstractC11781), new C13782(i2, c10377));
        AbstractC19728 abstractC19728 = abstractC11781.f38072;
        C15252 c15252 = this.f60496;
        boolean z2 = abstractC19728 == c15252.f49865;
        if (z2 || abstractC19728 == c15252.f49758) {
            final AbstractC11781 abstractC11782 = abstractC11781.f38069;
            C17359.requireNonNull(abstractC11782);
            Supplier c16256 = z2 ? new C16256(1, abstractC11782) : new Supplier() { // from class: l.ۙ᩸ۘ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC11782.m29574();
                }
            };
            C17359.requireNonNull(abstractC11782);
            m43283(c16327, c16256, z2 ? new C16517(3, abstractC11782) : new Consumer() { // from class: l.᩷᩸ۘ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    abstractC11782.m29592((C14769) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            }, new C7071(i2, c10377));
        }
        if (c5816 != null && c5816.mo9558() == EnumC5296.FIELD) {
            m43283(c16327, new C8562(c5816, i2), new C12945(i3, c5816), new C7071(i2, c10377));
        }
        C15714 c15714 = this.f60514;
        C4395 c4395M37507 = c15714.m37507(c10377.f38071);
        AbstractC19728 abstractC19729 = c10377.f38072;
        AbstractC22295 abstractC22295M37574 = this.f60514.m37574(c23191.f75156.f73596);
        C14769 c14769M35543 = C14769.m35543();
        C14769 c14769 = c20847.f66750;
        C14769 c147610 = c23191.f75157;
        if (c147610 == null) {
            c14769M37562 = C14769.m35543();
        } else {
            c14769M37562 = this.f60514.m37562(c147610);
        }
        C6633 c6633M37511 = c15714.m37511(c4395M37507, abstractC19729, abstractC22295M37574, c14769M35543, null, c14769, c14769M37562, null, null);
        c6633M37511.f22152 = c10377;
        c6633M37511.f26659 = c23191;
        EnumC25033 enumC25033M38748 = c16327.m38748();
        EnumC25033 enumC25033 = EnumC25033.EXPRESSION;
        C14764 c14764 = this.f60515;
        C24705 c24705 = this.f60504;
        if (enumC25033M38748 == enumC25033) {
            AbstractC22295 abstractC22295 = (AbstractC22295) c16327.f53001;
            AbstractC22664 abstractC22664Mo31585 = c6633M37511.f26659.mo31585();
            AbstractC22664 abstractC22664 = abstractC22295.f26659;
            EnumC21172 enumC21172 = EnumC21172.VOID;
            boolean zM51067 = abstractC22664.m51067(enumC21172);
            boolean zM51068 = abstractC22664Mo31585.m51067(enumC21172);
            boolean zM55149 = c24705.m55149(abstractC22664Mo31585, c24705.m55108(c14764.f48251).f38067);
            C15714 c15715 = this.f60514;
            i = c15715.f51040;
            try {
                if (zM51068) {
                    c15715.m37552((InterfaceC5075) abstractC22295);
                    c4197M37506 = this.f60514.m37506(0L, C14769.of((Object) c15715.m37567(abstractC22295)));
                } else if (zM51067 && zM55149) {
                    C18499 c18499 = new C18499();
                    C15714 c15716 = this.f60514;
                    c15716.m37552((InterfaceC5075) abstractC22295);
                    c18499.m43089(c15716.m37567(abstractC22295));
                    C15714 c15717 = this.f60514;
                    C23787 c23787M37547 = c15717.m37547(EnumC21172.BOT, (Object) null);
                    c23787M37547.f26659 = c14764.f48241;
                    c18499.m43089(c15717.m37553(c23787M37547));
                    c4197M37506 = this.f60514.m37506(0L, c18499.m43093());
                } else {
                    c15715.m37552((InterfaceC5075) abstractC22295);
                    c4197M37506 = c15715.m37506(0L, C14769.of((Object) this.f60514.m37553(abstractC22295)));
                }
                this.f60514.f51040 = i;
                i = 0;
            } catch (Throwable th) {
                this.f60514.f51040 = i;
                throw th;
            }
        } else {
            i = 0;
            C4197 c4197 = (C4197) c16327.f53001;
            boolean z3 = c16327.f52998;
            AbstractC22664 abstractC22664Mo31586 = c6633M37511.f26659.mo31585();
            boolean zM51069 = abstractC22664Mo31586.m51067(EnumC21172.VOID);
            boolean zM551410 = c24705.m55149(abstractC22664Mo31586, c24705.m55108(c14764.f48251).f38067);
            c4197M37506 = (C4197) new C20101(this, zM51069, c6633M37511).mo8479(c4197);
            if (z3 && zM551410) {
                C14769 c147611 = c4197M37506.f15344;
                C15714 c15718 = this.f60514;
                C23787 c23787M37548 = c15718.m37547(EnumC21172.BOT, (Object) null);
                c23787M37548.f26659 = c14764.f48241;
                c4197M37506.f15344 = c147611.m35546(c15718.m37553(c23787M37548));
            }
        }
        c6633M37511.f22148 = (C4197) mo8479(c4197M37506);
        if (!this.f60498 || this.f60503 || c20847.m54896()) {
            z = false;
        } else {
            C15625 c15625 = new C15625(this, c6633M37511.f22152, c6633M37511.f22148);
            C15625 c15626 = (C15625) C11392.putIfAbsent(this.f60507.f42674, c15625, c15625);
            if (c15626 != null) {
                c10377 = c15626.f50750;
                if (this.f60511) {
                    C5821 c5821 = C15383.f50165;
                    Object[] objArr = new Object[1];
                    objArr[i] = c10377;
                    this.f60508.m34524(c16327, new C5821("compiler", "verbose.l2m.deduplicate", objArr));
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            C13388.m33011(this.f60507, c6633M37511);
        }
        C18499 c184910 = new C18499();
        AbstractC22295 abstractC22296 = c20847.f66743;
        if (abstractC22296 != null) {
            c184910.m43089(abstractC22296);
        } else if (!c10377.mo7874()) {
            c184910.m43089(this.f60514.m37508((AbstractC11781) new C5816(8589938704L, c15252.f49836, c10377.f38069.m29558().f38067, abstractC11781.m29558())));
        }
        for (AbstractC11781 abstractC11783 : c20847.m47671(EnumC14879.CAPTURED_VAR).keySet()) {
            if (abstractC11783 != c5816) {
                C5887 c5887M37508 = this.f60514.m37508(abstractC11783);
                c5887M37508.f26659 = abstractC11783.f38067;
                c184910.m43089(c5887M37508);
            }
        }
        Iterator it = c20847.m47671(EnumC14879.CAPTURED_OUTER_THIS).keySet().iterator();
        while (it.hasNext()) {
            c184910.m43089(this.f60514.m37545(((AbstractC11781) it.next()).f38067));
        }
        this.f9840 = m43281(this.f60509, c10377.mo22021(), m43302(c184910.m43093(), c20847.f79660));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43283(C16327 c16327, Supplier supplier, Consumer consumer, Consumer consumer2) {
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        for (C24638 c24638 : (C14769) supplier.get()) {
            if (c24638.f77371.f19178 == c16327) {
                c184910.m43089(c24638);
            } else {
                c18499.m43089(c24638);
            }
        }
        if (c184910.m43096()) {
            consumer.n(c18499.m43093());
            consumer2.n(c184910.m43093());
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        AbstractC22295 abstractC22295M37508;
        C12642 c12642 = (C12642) this.f60509;
        C10377 c10377 = (C10377) c12598.f40439;
        switch (C23085.f74868[c12598.f40430.ordinal()]) {
            case 1:
            case 2:
                abstractC22295M37508 = this.f60514.m37508((AbstractC11781) new C5816(8589938704L, this.f60496.f49836, c12642.f79656.m29558().f38067, c12642.f79656.m29558()));
                break;
            case 3:
                abstractC22295M37508 = this.f60500.m1931(this.f60497.m38200(this.f60504.m55132(c12598.f40439.f38069.f38067), this.f60513, c12598.f40436));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                abstractC22295M37508 = null;
                break;
            default:
                throw new InternalError("Should not have an invalid kind");
        }
        this.f9840 = m43281(c12642, c10377.mo22021(), abstractC22295M37508 == null ? C14769.m35543() : m43302(C14769.of((Object) abstractC22295M37508), c12642.f79660));
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        if (this.f60509 == null || !this.f60512.m14113(c5887.f20170)) {
            super.mo1500(c5887);
            return;
        }
        C15714 c15714 = this.f60514;
        int i = c15714.f51040;
        try {
            c15714.m37552((InterfaceC5075) c5887);
            AbstractC22295 abstractC22295M47673 = ((C20847) this.f60509).m47673(c5887);
            if (abstractC22295M47673 != null) {
                this.f9840 = abstractC22295M47673;
            } else {
                super.mo1500(c5887);
            }
        } finally {
            this.f60514.f51040 = i;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        if (this.f60509 != null) {
            C18609 c18609 = this.f60512.f15895;
            AbstractC24577 abstractC24577 = c18609.f60509;
            if (abstractC24577 instanceof C20847) {
                C20847 c20847 = (C20847) abstractC24577;
                if (!c23041.f74775.mo7874() && c23041.f74774 == c18609.f60496.f49836 && c23041.f74775.f38069.f38066 == EnumC13603.f43213 && !((Map) c20847.f66747.get(EnumC14879.CAPTURED_OUTER_THIS)).isEmpty()) {
                    C15714 c15714 = this.f60514;
                    int i = c15714.f51040;
                    try {
                        c15714.m37552((InterfaceC5075) c23041);
                        C5887 c5887M47672 = ((C20847) this.f60509).m47672(c23041);
                        if (c5887M47672 != null) {
                            this.f9840 = c5887M47672;
                        } else {
                            super.mo1525(c23041);
                        }
                        return;
                    } finally {
                        this.f60514.f51040 = i;
                    }
                }
            }
        }
        super.mo1525(c23041);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        AbstractC24577 abstractC24577 = this.f60509;
        if (abstractC24577 == null || !this.f60512.m14114(abstractC24577, c18565)) {
            super.mo1521(c18565);
            return;
        }
        C15714 c15714 = this.f60514;
        int i = c15714.f51040;
        try {
            c15714.m37552((InterfaceC5075) c18565);
            ((C20847) this.f60509).m47675(c18565);
            super.mo1521(c18565);
        } finally {
            this.f60514.f51040 = i;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        AbstractC24577 abstractC24577 = this.f60509;
        C20847 c20847 = (C20847) abstractC24577;
        if (abstractC24577 != null) {
            EnumC14879 enumC14879 = EnumC14879.LOCAL_VAR;
            if (c20847.m47671(enumC14879).containsKey(c12510.f40168)) {
                c12510.f40171 = (AbstractC22295) mo8479(c12510.f40171);
                c12510.f40168 = (C5816) c20847.m47671(enumC14879).get(c12510.f40168);
                this.f9840 = c12510;
                return;
            }
        }
        super.mo1513(c12510);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C6633 m43298() {
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        for (Map.Entry entry : this.f60507.f42676.entrySet()) {
            C14637 c14637M37525 = this.f60514.m37525((AbstractC19728) null);
            c184910.m43089(c14637M37525);
            C18499 c184911 = (C18499) entry.getValue();
            c184911.m43089(c14637M37525);
            C14769 c14769M43093 = c184911.m43093();
            C15714 c15714 = this.f60514;
            c18499.m43089(c15714.m37542(C21351.f68006, C14769.of((Object) c15714.m37546(entry.getKey())), c14769M43093, (AbstractC8036) null));
        }
        C15714 c15715 = this.f60514;
        C14764 c14764 = this.f60515;
        C15493 c15493M37577 = c15715.m37577(m43279("getImplMethodName", c14764.f48282, C14769.m35543(), C14769.m35543()), c18499.m43093());
        Iterator it = c184910.iterator();
        while (it.hasNext()) {
            ((C14637) it.next()).f47896 = c15493M37577;
        }
        C15714 c15716 = this.f60514;
        AbstractC22664 abstractC22664 = c14764.f48244;
        C14769 c14769Of = C14769.of((Object) c15716.m37546("Invalid lambda deserialization"));
        AbstractC11781 abstractC11781M49773 = this.f60499.m49773((InterfaceC5075) null, this.f60513, abstractC22664, C11239.m28328(c14769Of), C14769.m35543());
        C15714 c15717 = this.f60514;
        C18565 c18565M37539 = c15717.m37539((AbstractC22295) null, (C14769) null, c15717.m37574(abstractC22664.f73596), c14769Of, (C7926) null, false);
        c18565M37539.f60318 = abstractC11781M49773;
        c18565M37539.f26659 = abstractC22664;
        C4197 c4197M37506 = c15716.m37506(0L, C14769.of((Object) c15493M37577, (Object) c15716.m37576(c18565M37539)));
        C15714 c15718 = this.f60514;
        C6633 c6633M37511 = c15718.m37511(c15718.m37507(this.f60507.f42679.f38071), this.f60496.f49813, this.f60514.m37574(this.f60507.f42679.f38067.mo31585().f73596), C14769.m35543(), null, C14769.of((Object) this.f60514.m37523(this.f60507.f42677, (AbstractC22295) null)), C14769.m35543(), c4197M37506, null);
        c6633M37511.f22152 = this.f60507.f42679;
        c6633M37511.f26659 = this.f60507.f42679.f38067;
        return c6633M37511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43282(C8141 c8141, AbstractC22664 abstractC22664, C10377 c10377, InterfaceC5075 interfaceC5075, C14769 c14769, C23191 c23191) {
        String strM43274 = m43274(abstractC22664);
        String string = c10377.f38072.toString();
        AbstractC22664 abstractC22665 = c10377.f38067;
        C24705 c24705 = this.f60504;
        int i = 0;
        String strM43275 = m43275(c24705.m55132(abstractC22665), false);
        String strM43276 = m43274(c24705.m55132(c8141.f38069.f38067));
        String string2 = c8141.f38072.toString();
        String strM43277 = m43275(c24705.m55132(c8141.f38067), false);
        C14764 c14764 = this.f60515;
        C17223 c17223 = c14764.f48253;
        C24533 c24533M43279 = m43279("getImplMethodKind", c17223, C14769.m35543(), C14769.m35543());
        C23787 c23787M37546 = this.f60514.m37546(Integer.valueOf(c8141.m22020()));
        C15714 c15714 = this.f60514;
        EnumC21461 enumC21461 = EnumC21461.f68546;
        C6435 c6435M37510 = c15714.m37510(enumC21461, (AbstractC22295) c24533M43279, (AbstractC22295) c23787M37546);
        c6435M37510.f62402 = this.f60502.m6593(c6435M37510, enumC21461, c17223, c17223);
        c6435M37510.f26659 = c14764.f48255;
        C18499 c18499 = new C18499();
        Iterator it = c23191.f75155.iterator();
        while (it.hasNext()) {
            AbstractC22664 abstractC22666 = (AbstractC22664) it.next();
            C18499 c184910 = new C18499();
            String str = string2;
            c184910.m43089(this.f60514.m37546(Integer.valueOf(i)));
            C14769 c14769M43093 = c184910.m43093();
            C18499 c184911 = new C18499();
            c184911.m43089(c14764.f48253);
            c18499.m43089(this.f60514.m37534(c24705.m55132(abstractC22666), m43279("getCapturedArg", c14764.f48286, c184911.m43093(), c14769M43093)));
            i++;
            it = it;
            string2 = str;
            c24705 = c24705;
        }
        String str2 = string2;
        C2158 c2158M37504 = this.f60514.m37504(m43277(m43277(m43277(m43277(m43277(c6435M37510, "getFunctionalInterfaceClass", strM43274), "getFunctionalInterfaceMethodName", string), "getFunctionalInterfaceMethodSignature", strM43275), "getImplClass", strM43276), "getImplMethodSignature", strM43277), this.f60514.m37553(m43280(interfaceC5075, c14764.f48288, this.f60496.f49784, c14769, c23191, c18499.m43093(), c10377.f38072)), (AbstractC19969) null);
        C18499 c184912 = (C18499) this.f60507.f42676.get(str2);
        if (c184912 == null) {
            c184912 = new C18499();
            this.f60507.f42676.put(str2, c184912);
        }
        c184912.m43089(c2158M37504);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6435 m43277(C6435 c6435, String str, String str2) {
        C14764 c14764 = this.f60515;
        C14769 c14769Of = C14769.of((Object) c14764.f48286);
        C17223 c17223 = c14764.f48255;
        C23191 c23191 = new C23191(c14769Of, c17223, C14769.m35543(), c14764.f48275);
        C3168 c3168 = this.f60513;
        AbstractC22664 abstractC22664 = c14764.f48286;
        AbstractC19728 abstractC19728 = this.f60496.f49845;
        C14769 c14769Of2 = C14769.of((Object) abstractC22664);
        C14769 c14769M35543 = C14769.m35543();
        C22010 c22010 = this.f60499;
        c22010.getClass();
        AbstractC11781 abstractC11781M49772 = c22010.m49772((InterfaceC5075) null, c3168, abstractC22664.f73596, abstractC22664, abstractC19728, c14769Of2, c14769M35543);
        C15714 c15714 = this.f60514;
        C14769 c14769M35544 = C14769.m35543();
        C23041 c23041M37543 = this.f60514.m37543(m43279(str, c14764.f48282, C14769.m35543(), C14769.m35543()), abstractC11781M49772);
        c23041M37543.f26659 = c23191;
        C24533 c24533M37550 = c15714.m37550(c23041M37543, c14769M35544, C14769.of((Object) this.f60514.m37546(str2)));
        c24533M37550.f26659 = c17223;
        C15714 c15715 = this.f60514;
        EnumC21461 enumC21461 = EnumC21461.f68522;
        C6435 c6435M37510 = c15715.m37510(enumC21461, (AbstractC22295) c6435, (AbstractC22295) c24533M37550);
        c6435M37510.f62402 = this.f60502.m6593(c6435M37510, enumC21461, c17223, c17223);
        c6435M37510.f26659 = c17223;
        return c6435M37510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C24533 m43279(String str, AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        C14769 c14769M35543 = C14769.m35543();
        C14764 c14764 = this.f60515;
        C23191 c23191 = new C23191(c14769, abstractC22664, c14769M35543, c14764.f48275);
        C3168 c3168 = this.f60513;
        AbstractC22664 abstractC22665 = c14764.f48273;
        AbstractC22712 abstractC22712 = this.f60496.f49864;
        abstractC22712.getClass();
        char[] charArray = str.toCharArray();
        AbstractC19728 abstractC19728Mo2069 = abstractC22712.mo2069(charArray, charArray.length);
        C14769 c14769M35544 = C14769.m35543();
        C22010 c22010 = this.f60499;
        c22010.getClass();
        AbstractC11781 abstractC11781M49772 = c22010.m49772((InterfaceC5075) null, c3168, abstractC22665.f73596, abstractC22665, abstractC19728Mo2069, c14769, c14769M35544);
        C15714 c15714 = this.f60514;
        C14769 c14769M35545 = C14769.m35543();
        C15714 c15715 = this.f60514;
        C5887 c5887M37508 = c15715.m37508((AbstractC11781) this.f60507.f42677);
        c5887M37508.f26659 = abstractC22665;
        C23041 c23041M37543 = c15715.m37543(c5887M37508, abstractC11781M49772);
        c23041M37543.f26659 = c23191;
        C24533 c24533M37550 = c15714.m37550(c23041M37543, c14769M35545, c147610);
        c24533M37550.f26659 = abstractC22664;
        return c24533M37550;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43297(AbstractC22664 abstractC22664, AbstractC22295 abstractC22295) {
        if (abstractC22664 != null) {
            int i = C23085.f74870[abstractC22295.mo2285().ordinal()];
            if (i == 1) {
                ((C24533) abstractC22295).f79553 = abstractC22664;
            } else if (i == 2) {
                ((C18565) abstractC22295).f60324 = abstractC22664;
            } else {
                if (i == 3) {
                    m43297(abstractC22664, ((C16985) abstractC22295).f55515);
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43284(C18609 c18609, AbstractC11781 abstractC11781, C14769 c14769, AbstractC22664 abstractC22664) {
        C11972.m30026(abstractC11781.f38066 == EnumC13603.f43218);
        C14769 c14769Mo50621 = c18609.f60504.m55132(abstractC11781.f38067).mo50621();
        if (abstractC22664 != null) {
            C11972.m30026((abstractC11781.mo29591() & 17179869184L) != 0);
        }
        c18609.f60497.m38205(c14769, c14769Mo50621, abstractC22664, c18609.f60513);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C24533 m43281(AbstractC24577 abstractC24577, C8141 c8141, C14769 c14769) {
        C14769 c147610;
        int i;
        AbstractC15581 abstractC15581 = abstractC24577.f79657;
        C14769<AbstractC11781> c147611 = abstractC24577.f79655;
        AbstractC22970 abstractC22970 = abstractC15581.f50682.f73596;
        C24705 c24705 = this.f60504;
        C10377 c10377 = (C10377) c24705.m55092(abstractC22970);
        AbstractC22664 abstractC22664M55132 = c24705.m55132(c10377.f38067);
        C14769 c14769Mo50621 = abstractC22664M55132.mo50621();
        AbstractC22664 abstractC22664Mo31585 = abstractC22664M55132.mo31585();
        C14769 c14769Mo50622 = abstractC22664M55132.mo50622();
        C14764 c14764 = this.f60515;
        C23191 c23191 = new C23191(c14769Mo50621, abstractC22664Mo31585, c14769Mo50622, c14764.f48275);
        c8141.getClass();
        AbstractC22664 abstractC22664M55133 = c24705.m55132(abstractC15581.m37319(c24705));
        C14769 c14769Of = C14769.of((Object) c23191, (Object) c8141, (Object) new C23191(abstractC22664M55133.mo50621(), abstractC22664M55133.mo31585(), abstractC22664M55133.mo50622(), c14764.f48275));
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43089(((AbstractC22295) it.next()).f26659);
        }
        C23191 c23192 = new C23191(c18499.m43093(), abstractC15581.f26659, C14769.m35543(), c14764.f48275);
        boolean zM54895 = abstractC24577.m54895();
        C15252 c15252 = this.f60496;
        AbstractC19728 abstractC19728 = zM54895 ? c15252.f49784 : c15252.f49752;
        if (abstractC24577.m54895()) {
            C18499 c184910 = new C18499();
            AbstractC22664 abstractC22664 = abstractC15581.f50682;
            abstractC22664.getClass();
            Iterator it2 = (abstractC22664 instanceof C1562 ? c24705.m55135(abstractC15581.f50682) : C14769.m35543()).iterator();
            while (it2.hasNext()) {
                AbstractC22664 abstractC22664M55134 = c24705.m55132((AbstractC22664) it2.next());
                AbstractC22970 abstractC22971 = abstractC22664M55134.f73596;
                if (abstractC22971 != c14764.f48313.f73596 && abstractC22971 != abstractC15581.f26659.f73596 && abstractC22971 != c14764.f48286.f73596) {
                    c184910.m43089(abstractC22664M55134);
                }
            }
            boolean zM54896 = abstractC24577.m54896();
            boolean zM43096 = c184910.m43096();
            boolean zM35550 = c147611.m35550();
            int i2 = zM54896;
            if (zM43096) {
                i = (zM54896 ? 1 : 0) | 2;
            }
            if (zM35550) {
                i2 = i;
                i2 = (i2 == true ? 1 : 0) | 4;
            }
            i2 = i;
            C14769 c14769M35546 = c14769Of.m35546(C9089.m24225(i2));
            if (zM43096) {
                C14769 c14769M35547 = c14769M35546.m35546(C9089.m24225(c184910.m43094()));
                C14769 c14769M43093 = c184910.m43093();
                if (c14769M43093 == null) {
                    c14769M43093 = null;
                } else {
                    Iterator it3 = c14769M43093.iterator();
                    while (it3.hasNext()) {
                        InterfaceC8344.class.cast(it3.next());
                    }
                }
                c14769M35547.getClass();
                c14769M35546 = c14769M43093.m35549(c14769M35547);
            }
            if (zM35550) {
                c14769M35546 = c14769M35546.m35546(C9089.m24225(c147611.m35551() - 1));
                for (AbstractC11781 abstractC11781 : c147611) {
                    if (!c24705.m55149(abstractC11781.mo29576(c24705), c10377.mo29576(c24705))) {
                        c14769M35546 = c14769M35546.m35546((C23191) abstractC11781.mo29576(c24705));
                    }
                }
            }
            C14769 c147612 = c14769M35546;
            if (abstractC24577.m54896()) {
                C15714 c15714 = this.f60514;
                int i3 = c15714.f51040;
                try {
                    c15714.m37552((InterfaceC5075) this.f60507.f42678);
                    m43282(c8141, abstractC15581.f26659, c10377, abstractC15581, c147612, c23192);
                    this.f60514.f51040 = i3;
                } catch (Throwable th) {
                    this.f60514.f51040 = i3;
                    throw th;
                }
            }
            c147610 = c147612;
        } else {
            c147610 = c14769Of;
        }
        return m43280(abstractC15581, c14764.f48288, abstractC19728, c147610, c23192, c14769, c10377.f38072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C24533 m43280(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C23191 c23191, C14769 c147610, AbstractC19728 abstractC19729) {
        final C24705 c24705 = this.f60504;
        C14764 c14764 = this.f60515;
        C15714 c15714 = this.f60514;
        int i = c15714.f51040;
        try {
            c15714.m37552(interfaceC5075);
            C14769 c14769Of = C14769.of((Object) c14764.f48324, (Object) c14764.f48282, (Object) c14764.f48297);
            C17359.requireNonNull(c24705);
            C18582 c18582 = new C18582(abstractC19729, c14764.f48321, this.f60499.m49762(interfaceC5075, this.f60513, abstractC22664, abstractC19728, c14769.m35547(new Function() { // from class: l.ۤ᩸ۘ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c24705.m55100((InterfaceC8344) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }
            }).m35549(c14769Of), C14769.m35543()).mo22021(), c23191, (InterfaceC8344[]) c14769.toArray(new InterfaceC8344[c14769.m35551()]));
            C15714 c15715 = this.f60514;
            C23041 c23041M37544 = c15715.m37544(c15715.m37574(abstractC22664.f73596), abstractC19728);
            C18582 c18583 = (C18582) C11392.putIfAbsent(this.f60507.f42675, C18786.m43587(c18582, c24705), c18582);
            if (c18583 != null) {
                c18582 = c18583;
            }
            c23041M37544.f74775 = c18582;
            c23041M37544.f26659 = c23191.f75156;
            C24533 c24533M37550 = this.f60514.m37550(c23041M37544, C14769.m35543(), c147610);
            c24533M37550.f26659 = c23191.f75156;
            return c24533M37550;
        } finally {
            this.f60514.f51040 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m43275(AbstractC22664 abstractC22664, boolean z) {
        try {
            C5931 c5931 = new C5931(this, z);
            c5931.mo25984(abstractC22664);
            return c5931.f20278.toString();
        } catch (C18999 e) {
            C24550 c24550 = this.f60513.f10279.f26345;
            AbstractC22664 abstractC22664M44095 = e.m44095();
            C15515 c15515 = C19859.f63823;
            this.f60508.m34525(C22843.m51552(c24550, new C15515("compiler", "illegal.signature", c24550, abstractC22664M44095)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m43274(AbstractC22664 abstractC22664) {
        try {
            C5931 c5931 = new C5931(this, false);
            c5931.m25982(abstractC22664);
            return c5931.f20278.toString();
        } catch (C18999 e) {
            C24550 c24550 = this.f60513.f10279.f26345;
            AbstractC22664 abstractC22664M44095 = e.m44095();
            C15515 c15515 = C19859.f63823;
            this.f60508.m34525(C22843.m51552(c24550, new C15515("compiler", "illegal.signature", c24550, abstractC22664M44095)));
            return "<ERRONEOUS>";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43286(C18609 c18609, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        return ((abstractC11781.mo29591() & 4) == 0 || abstractC11781.m29564() == abstractC11782.m29564()) ? false : true;
    }

    public C18609(C4747 c4747) {
        boolean zM32427;
        c4747.m14646(f60494, this);
        this.f60495 = C19991.m45972(c4747);
        this.f60508 = C7312.m20023(c4747);
        this.f60506 = C25235.m56312(c4747);
        this.f60496 = C15252.m36599(c4747);
        this.f60515 = C14764.m35506(c4747);
        this.f60499 = C22010.m49750(c4747);
        this.f60502 = C1917.m6583(c4747);
        this.f60514 = C15714.m37502(c4747);
        this.f60504 = C24705.m55066(c4747);
        this.f60497 = C16042.m38195(c4747);
        this.f60512 = new C4439(this);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f60501 = c13015M32421.m32432("debug.dumpLambdaToMethodStats");
        this.f60500 = C0310.m1899(c4747);
        this.f60516 = c13015M32421.m32432("forceSerializable");
        EnumC7687 enumC7687 = EnumC7687.f25326;
        boolean z = c13015M32421.m32430(enumC7687) || c13015M32421.m32427(enumC7687, "lines");
        if (c13015M32421.m32430(enumC7687)) {
            zM32427 = c13015M32421.m32433(EnumC7687.f25290);
        } else {
            zM32427 = c13015M32421.m32427(enumC7687, "vars");
        }
        this.f60503 = z || zM32427;
        this.f60511 = c13015M32421.m32432("debug.dumpLambdaToMethodDeduplication");
        String strM32422 = c13015M32421.m32422("deduplicateLambdas");
        this.f60498 = strM32422 != null ? Boolean.parseBoolean(strM32422) : true;
        this.f60510 = EnumC16305.m38659(c4747).m38668();
    }
}
