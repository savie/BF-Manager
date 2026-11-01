package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public class C22243 extends AbstractC18715 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10955 f72708;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC12366 f72709;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
    }

    @Override // l.AbstractC18715
    /* JADX INFO: renamed from: ۖ */
    public final void mo11337() {
        this.f72709 = EnumC12366.f41344;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49374(AbstractC8774 abstractC8774) {
        m49376(abstractC8774);
        if (abstractC8774 != null && abstractC8774.m22847(EnumC18651.f60513) && this.f72709 == EnumC12366.f41344) {
            this.f72708.f37257.m48199(abstractC8774, C23879.f77274);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m49376(AbstractC8774 abstractC8774) {
        if (this.f72709 == EnumC12366.f41344 && abstractC8774 != null) {
            this.f72708.f37257.m48199(abstractC8774, C23879.f77201);
            if (!abstractC8774.m22847(EnumC18651.f60506)) {
                this.f72709 = EnumC12366.f41346;
            }
        }
        mo7248(abstractC8774);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49377(C21825 c21825) {
        if (c21825 != null) {
            while (c21825.m48595()) {
                m49376((AbstractC8774) c21825.f70876);
                c21825 = c21825.f70877;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1065(C8753 c8753) {
        if (c8753.f30086 == null) {
            return;
        }
        EnumC12366 enumC12366 = this.f72709;
        C19003 c19003 = this.f60692;
        C10955 c10955 = this.f72708;
        C16826 c16826 = c10955.f37252;
        this.f60692 = new C19003();
        c10955.f37252 = c10955.f37252.m39465(c8753.f30086);
        try {
            for (C21825 c21825 = c8753.f30090; c21825.m48595(); c21825 = c21825.f70877) {
                if (!((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60478) && (8 & C3128.m9431((AbstractC8774) c21825.f70876)) != 0) {
                    m49374((AbstractC8774) c21825.f70876);
                    m49370(false);
                }
            }
            for (C21825 c21826 = c8753.f30090; c21826.m48595(); c21826 = c21826.f70877) {
                if (!((AbstractC8774) c21826.f70876).m22847(EnumC18651.f60478) && (C3128.m9431((AbstractC8774) c21826.f70876) & 8) == 0) {
                    m49374((AbstractC8774) c21826.f70876);
                    m49370(false);
                }
            }
            for (C21825 c21827 = c8753.f30090; c21827.m48595(); c21827 = c21827.f70877) {
                if (((AbstractC8774) c21827.f70876).m22847(EnumC18651.f60478)) {
                    mo7248((AbstractC8774) c21827.f70876);
                }
            }
        } finally {
            this.f60692 = c19003;
            this.f72709 = enumC12366;
            c10955.f37252 = c16826;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        if (c23195.f75268 == null) {
            return;
        }
        C10955 c10955 = this.f72708;
        C16826 c16826 = c10955.f37252;
        c10955.f37252 = c10955.f37252.m39465(c23195.f75263);
        C6171.m17176(this.f60692.isEmpty());
        try {
            EnumC12366 enumC12366 = EnumC12366.f41347;
            this.f72709 = enumC12366;
            m49376(c23195.f75268);
            EnumC12366 enumC12367 = this.f72709;
            c23195.f75271 = enumC12367 != EnumC12366.f41344;
            if (enumC12367 == enumC12366 && !c23195.f75263.f77449.mo16235().m39001(EnumC6617.VOID)) {
                c10955.f37257.m48199(C3128.m9459(c23195.f75268), C23879.f77279);
            }
            m49370(true);
        } finally {
            c10955.f37252 = c16826;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49370(boolean z) {
        boolean z2;
        C21825 c21825M43726 = this.f60692.m43726();
        this.f60692 = new C19003();
        while (c21825M43726.m48595()) {
            C18009 c18009 = (C18009) c21825M43726.f70876;
            c21825M43726 = c21825M43726.f70877;
            if (z && c18009.f57603.m22847(EnumC18651.f60528)) {
                z2 = true;
            } else {
                C20414 c20414 = this.f72708.f37257;
                AbstractC8774 abstractC8774 = c18009.f57603;
                abstractC8774.getClass();
                if (c20414.m46180(abstractC8774)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C6171.m17176(z2);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        if (c6656.f22481 != null) {
            C10955 c10955 = this.f72708;
            C16826 c16826 = c10955.f37252;
            c10955.f37252 = c10955.f37252.m39465(c6656.f22475);
            try {
                mo7248(c6656.f22481);
            } finally {
                c10955.f37252 = c16826;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        m49377(c21452.f69737);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3914(C0285 c0285) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        m49376(c0285.f1595);
        this.f72709 = this.f72709.mo2099(m43248(c0285));
        mo7248(c0285.f1596);
        EnumC12366 enumC12366M30777 = this.f72709.m30777(!c0285.f1596.f30190.mo9483());
        this.f72709 = enumC12366M30777;
        this.f72709 = enumC12366M30777.mo2099(m43245(c0285, c19003));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3960(C22885 c22885) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c22885.f74426);
        this.f72709 = EnumC12366.m30776(!c22885.f74426.f30190.mo9479());
        m49376(c22885.f74425);
        this.f72709 = this.f72709.mo2099(m43248(c22885));
        this.f72709 = m43245(c22885, c19003).m30778(!c22885.f74426.f30190.mo9483());
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3944(C14398 c14398) {
        C19003 c19003 = this.f60692;
        m49377(c14398.f47204);
        this.f60692 = new C19003();
        AbstractC5930 abstractC5930 = c14398.f47207;
        if (abstractC5930 != null) {
            mo7248(abstractC5930);
            this.f72709 = EnumC12366.m30776(!c14398.f47207.f30190.mo9479());
        } else {
            this.f72709 = EnumC12366.f41347;
        }
        m49376(c14398.f47206);
        this.f72709 = this.f72709.mo2099(m43248(c14398));
        m49334(c14398.f47205);
        EnumC12366 enumC12366M43245 = m43245(c14398, c19003);
        AbstractC5930 abstractC5931 = c14398.f47207;
        this.f72709 = enumC12366M43245.m30778((abstractC5931 == null || abstractC5931.f30190.mo9483()) ? false : true);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3950(C16514 c16514) {
        mo3928(c16514.f53042);
        C19003 c19003 = this.f60692;
        mo7248(c16514.f53044);
        this.f60692 = new C19003();
        m49376(c16514.f53043);
        this.f72709 = this.f72709.mo2099(m43248(c16514));
        m43245(c16514, c19003);
        this.f72709 = EnumC12366.f41347;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3920(C2732 c2732) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        m49376(c2732.f10508);
        this.f72709 = this.f72709.mo2099(m43245(c2732, c19003));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        C10955 c10955;
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c2026.f7570);
        boolean z = c2026.f7567 || C9030.stream(c2026.f7568).flatMap(new C11660(0)).anyMatch(new C19665(7));
        HashSet hashSet = z ? new HashSet() : null;
        C21825 c21825 = c2026.f7568;
        while (true) {
            boolean zM48595 = c21825.m48595();
            c10955 = this.f72708;
            if (!zM48595) {
                break;
            }
            this.f72709 = EnumC12366.f41347;
            C18630 c18630 = (C18630) c21825.f70876;
            for (AbstractC8047 abstractC8047 : c18630.f60400) {
                mo7248(abstractC8047);
                m49369(hashSet, abstractC8047);
            }
            m49377(c18630.f60403);
            EnumC12366 enumC12366 = this.f72709;
            EnumC12366 enumC12367 = EnumC12366.f41344;
            if (enumC12366 != enumC12367 && c18630.f60402 == C18630.f60398) {
                m43246(c2026, c10955.f37248);
                this.f72709 = enumC12367;
            }
            if (this.f72709 == EnumC12366.f41347) {
                C16826 c16826 = c10955.f37252;
                EnumC0597 enumC0597 = EnumC0597.FALLTHROUGH;
                if (c16826.m39467(enumC0597) && c18630.f60403.m48595() && c21825.f70877.m48595()) {
                    C20414 c20414 = c10955.f37257;
                    C18630 c18631 = (C18630) c21825.f70877.f70876;
                    c18631.getClass();
                    c20414.m48203(enumC0597, c18631, C9768.f32848);
                }
            }
            c21825 = c21825.f70877;
        }
        if (!c2026.f7566 && z && !C3128.m9450(c2026.f7570, c2026.f7568) && (hashSet == null || !m49371(c2026.f7570.f30190, hashSet))) {
            c10955.f37257.m48199(c2026, C23879.f77332);
        }
        if (!c2026.f7566) {
            this.f72709 = EnumC12366.f41347;
        }
        this.f72709 = this.f72709.mo2099(m43245(c2026, c19003));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        C10955 c10955;
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        mo7248(c9789.f33504);
        HashSet hashSet = new HashSet();
        EnumC12366 enumC12366 = this.f72709;
        C21825 c21825 = c9789.f33505;
        while (true) {
            boolean zM48595 = c21825.m48595();
            c10955 = this.f72708;
            if (!zM48595) {
                break;
            }
            this.f72709 = EnumC12366.f41347;
            C18630 c18630 = (C18630) c21825.f70876;
            for (AbstractC8047 abstractC8047 : c18630.f60400) {
                mo7248(abstractC8047);
                m49369(hashSet, abstractC8047);
            }
            m49377(c18630.f60403);
            if (this.f72709 == EnumC12366.f41347) {
                if (c18630.f60402 == C18630.f60398) {
                    c10955.f37257.m48199(C3128.m9459(c18630.f60401), C23879.f77222);
                } else if (c21825.f70877.isEmpty()) {
                    c10955.f37257.m48199(C3128.m9459((AbstractC8774) c9789), C23879.f77330);
                }
            }
            c21825 = c21825.f70877;
        }
        if (!c9789.f33503 && !C3128.m9450(c9789.f33504, c9789.f33505) && !m49371(c9789.f33504.f30190, hashSet)) {
            c10955.f37257.m48199(c9789, C23879.f77230);
        }
        this.f72709 = enumC12366;
        this.f72709 = enumC12366.mo2099(m43249(c9789, c19003));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49369(HashSet hashSet, AbstractC8047 abstractC8047) {
        if (hashSet != null) {
            if (abstractC8047.mo16200()) {
                AbstractC5930 abstractC5930 = (AbstractC5930) abstractC8047;
                if (abstractC5930.m22847(EnumC18651.f60465)) {
                    C3107 c3107 = (C3107) abstractC5930;
                    if (c3107.f11716.m52717()) {
                        hashSet.add(c3107.f11716);
                        return;
                    }
                    return;
                }
                return;
            }
            if (abstractC8047.mo16199()) {
                C10891 c10891M9462 = C3128.m9462((AbstractC20372) abstractC8047);
                if (c10891M9462.m27291()) {
                    hashSet.add(c10891M9462.m27290().f53222);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m49371(AbstractC16579 abstractC16579, final HashSet hashSet) {
        C21825 c21825M48583 = C21825.m48583((Iterable) hashSet);
        while (c21825M48583.m48595()) {
            AbstractC23903 abstractC23903 = (AbstractC23903) c21825M48583.f70876;
            c21825M48583 = c21825M48583.f70877;
            int i = C13777.f45442[abstractC23903.f77452.ordinal()];
            if (i == 1) {
                AbstractC9462 abstractC9462Mo20272 = abstractC23903.f77448.mo20272();
                C5268 c5268 = new C5268(1);
                abstractC9462Mo20272.getClass();
                if (C21980.stream(C0356.spliterator(abstractC9462Mo20272.mo3802(c5268, EnumC10167.RECURSIVE)), false).allMatch(new Predicate() { // from class: l.ۚۧۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return hashSet.contains((AbstractC23903) obj);
                    }
                }) && hashSet.add(abstractC23903.f77448)) {
                    c21825M48583 = c21825M48583.m48597(abstractC23903.f77448);
                }
            } else if (i == 2) {
                for (AbstractC16579 abstractC165710 : this.f72708.f37258.m52356(abstractC23903.f77449)) {
                    AbstractC0618 abstractC0618 = abstractC165710.f53222;
                    if (abstractC0618.f77452 == EnumC10477.f35865 && (abstractC0618.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 && abstractC0618.m52707() && C9030.stream(((C22492) abstractC165710.f53222).f73421).allMatch(new Predicate() { // from class: l.ۚۧۤ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C8512.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C8512.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return hashSet.contains((AbstractC23903) obj);
                        }
                    }) && hashSet.add(abstractC165710.f53222)) {
                        c21825M48583 = c21825M48583.m48597(abstractC165710.f53222);
                    }
                }
            }
        }
        int i2 = C13777.f45444[abstractC16579.mo1933().ordinal()];
        if (i2 == 1) {
            if (!abstractC16579.mo12731()) {
                return hashSet.contains(abstractC16579.f53222);
            }
            if (abstractC16579 instanceof C23594) {
                C23594 c23594 = (C23594) abstractC16579;
                return C9030.stream(c23594.f1658.m48597(c23594.f1654)).anyMatch(new Predicate() { // from class: l.ۖۧۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        HashSet hashSet2 = hashSet;
                        return this.f9884.m49371((AbstractC16579) obj, hashSet2);
                    }
                });
            }
        } else if (i2 == 2) {
            return m49371(((C22929) abstractC16579).mo18112(), hashSet);
        }
        return false;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        for (AbstractC8774 abstractC8774 : c13713.f45222) {
            if (abstractC8774 instanceof C6656) {
                mo3928((C6656) abstractC8774);
            } else if (abstractC8774 instanceof AbstractC5930) {
                mo7248((AbstractC5930) abstractC8774);
            } else {
                throw new AssertionError(c13713);
            }
        }
        m49376(c13713.f45220);
        EnumC12366 enumC12366Mo2099 = this.f72709;
        for (C21825 c21825 = c13713.f45221; c21825.m48595(); c21825 = c21825.f70877) {
            this.f72709 = EnumC12366.f41347;
            mo7248(((C19336) c21825.f70876).f62363);
            m49376(((C19336) c21825.f70876).f62362);
            enumC12366Mo2099 = enumC12366Mo2099.mo2099(this.f72709);
        }
        C21452 c21452 = c13713.f45218;
        if (c21452 != null) {
            C19003 c19004 = this.f60692;
            this.f60692 = c19003;
            this.f72709 = EnumC12366.f41347;
            m49376(c21452);
            EnumC12366 enumC12366 = this.f72709;
            EnumC12366 enumC12367 = EnumC12366.f41344;
            c13713.f45219 = enumC12366 != enumC12367;
            if (enumC12366 == enumC12367) {
                C10955 c10955 = this.f72708;
                C16826 c16826 = c10955.f37252;
                EnumC0597 enumC0597 = EnumC0597.FINALLY;
                if (c16826.m39467(enumC0597)) {
                    c10955.f37257.m48203(enumC0597, C3128.m9459(c13713.f45218), C9768.f32833);
                    return;
                }
                return;
            }
            while (c19004.m43722()) {
                this.f60692.m43723((C18009) c19004.m43727());
            }
            this.f72709 = enumC12366Mo2099;
            return;
        }
        this.f72709 = enumC12366Mo2099;
        C19003 c19005 = this.f60692;
        this.f60692 = c19003;
        while (c19005.m43722()) {
            this.f60692.m43723((C18009) c19005.m43727());
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        mo7248(c4849.f17076);
        m49376(c4849.f17075);
        AbstractC14728 abstractC14728 = c4849.f17077;
        if (abstractC14728 != null) {
            EnumC12366 enumC12366 = this.f72709;
            this.f72709 = EnumC12366.f41347;
            m49376(abstractC14728);
            this.f72709 = this.f72709.mo2099(enumC12366);
            return;
        }
        this.f72709 = EnumC12366.f41347;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1066(C17924 c17924) {
        m43247(new C18009(c17924));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        mo7248(c21473.f69790);
        m43247(new C18009(c21473));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        m43247(new C18009(c20747));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3294(C11200 c11200) {
        mo7248(c11200.f37914);
        m43247(new C18009(c11200));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        mo7248(c4539.f16146);
        this.f72709 = EnumC12366.f41344;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        mo7248(c15434.f50296);
        m49334(c15434.f50298);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        mo7248(c8378.f29093);
        m49334(c8378.f29099);
        C8753 c8753 = c8378.f29098;
        if (c8753 != null) {
            mo7248(c8753);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3959(C22489 c22489) {
        AbstractC16579 abstractC16579 = c22489.f30190;
        if (abstractC16579 == null || !abstractC16579.mo1926()) {
            C19003 c19003 = this.f60692;
            EnumC12366 enumC12366 = this.f72709;
            try {
                this.f60692 = new C19003();
                this.f72709 = EnumC12366.f41347;
                m49376(c22489.f73408);
                c22489.f73409 = this.f72709 != EnumC12366.f41344;
            } finally {
                this.f60692 = c19003;
                this.f72709 = enumC12366;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49375(C4603 c4603, AbstractC8774 abstractC8774, C5286 c5286) {
        C10955 c10955 = this.f72708;
        try {
            c10955.f37256 = c4603;
            c10955.f37248 = c5286;
            this.f60692 = new C19003();
            this.f72709 = EnumC12366.f41347;
            mo7248(abstractC8774);
        } finally {
            this.f60692 = null;
            c10955.f37248 = null;
        }
    }

    public C22243(C10955 c10955) {
        this.f72708 = c10955;
    }
}
