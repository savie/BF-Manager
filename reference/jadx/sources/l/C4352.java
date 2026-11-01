package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4352 extends C1052 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C16576 f15568 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4603 f15569;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23942 f15571;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10727 f15573;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5286 f15575;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6761 f15576;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20145 f15577;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC14128 f15578;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23800 f15579;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3836 f15580;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C2008 f15582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC9562 f15574 = new C6033();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22492 f15570 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18258 f15572 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6263 f15581 = null;

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
    public static InterfaceC7299 m12188(C4352 c4352, AbstractC16579 abstractC16579, AbstractC8047 abstractC8047) {
        AbstractC16579 abstractC165710;
        C23800 c23800 = c4352.f15579;
        if (abstractC8047.mo16199()) {
            AbstractC16579 abstractC16579M52402 = c23800.m52402(C3128.m9462((AbstractC20372) abstractC8047).m27290());
            if (abstractC16579M52402.mo9481()) {
                abstractC165710 = abstractC16579M52402;
                abstractC165710 = c23800.m52383(abstractC16579M52402).f77449;
            }
            abstractC165710 = abstractC16579M52402;
            return c23800.m52413(abstractC16579, abstractC165710, true) ? (InterfaceC7299) abstractC16579 : (InterfaceC7299) abstractC165710;
        }
        if (!abstractC8047.mo16200() || C3128.m9470((AbstractC5930) abstractC8047)) {
            return null;
        }
        AbstractC16579 abstractC165711 = abstractC8047.f30190;
        if ((abstractC165711.f53222.f77447 & 16384) != 0) {
            return C8711.m22544(((C3107) abstractC8047).f11715.toString());
        }
        C6171.m17171(abstractC165711.mo24292());
        int i = C23673.f76596[abstractC8047.f30190.mo1933().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C8711.m22543(((Integer) abstractC8047.f30190.mo24292()).intValue());
        }
        if (i == 5) {
            return C8711.m22544((String) abstractC8047.f30190.mo24292());
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4352 m12187(C12343 c12343) {
        C4352 c4352 = (C4352) c12343.m30656(f15568);
        return c4352 == null ? new C4352(c12343) : c4352;
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
    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3938(C11906 c11906) {
        AbstractC16579 abstractC16579;
        if (c11906.f39946 instanceof AbstractC20372) {
            boolean zM39001 = c11906.f39945.f30190.m39001(EnumC6617.BOT);
            C3836 c3836 = this.f15580;
            if (zM39001) {
                abstractC16579 = c3836.f14275;
            } else {
                abstractC16579 = c11906.f39945.f30190;
            }
            AbstractC16579 abstractC165710 = abstractC16579;
            C6263 c6263 = this.f15581;
            this.f15574 = new C1799(this);
            try {
                AbstractC5930 abstractC5930 = (AbstractC5930) mo3964(c11906.f39945);
                AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC5930);
                if (abstractC23903M9471 != null && abstractC23903M9471.f77452 == EnumC10477.f35878 && abstractC23903M9471.f77448.f77452.m26580(C21059.f68591)) {
                    this.f15581 = (C6263) abstractC23903M9471;
                } else {
                    this.f15581 = new C6263(4112L, this.f15571.f77631.m17389("patt" + c11906.f30189 + this.f15578.m34166() + "temp"), abstractC165710, this.f15572);
                }
                AbstractC20372 abstractC20372 = (AbstractC20372) c11906.f39946;
                C23800 c23800 = this.f15579;
                AbstractC16579 abstractC16579M52402 = c23800.m52402(C3128.m9462(abstractC20372).m27290());
                if (abstractC16579M52402.mo9481()) {
                    abstractC16579M52402 = c23800.m52383(abstractC16579M52402).f77449;
                }
                EnumC18651 enumC18651 = EnumC18651.f60464;
                C3107 c3107M14586 = this.f15575.m14586((AbstractC23903) this.f15581);
                AbstractC5930 abstractC5930M14634 = this.f15575.m14634(abstractC16579M52402);
                C5286 c5286 = this.f15575;
                c5286.getClass();
                C11906 c11907 = new C11906();
                c11907.f39945 = c3107M14586;
                c11907.f39946 = abstractC5930M14634;
                c11907.f30189 = c5286.f18294;
                c11907.f30190 = c3836.f14263;
                AbstractC5930 abstractC5931 = (AbstractC5930) mo3964(c11906.f39946);
                C22864 c22864M14622 = this.f15575.m14622(enumC18651, (AbstractC5930) c11907, abstractC5931);
                C10498 c10498M26961 = this.f15573.m26961(c22864M14622, enumC18651, c11907.f30190, abstractC5931.f30190);
                c22864M14622.f35957 = c10498M26961;
                c22864M14622.f30190 = c10498M26961.f77449.mo16235();
                C6263 c6264 = this.f15581;
                AbstractC5930 abstractC5932 = c22864M14622;
                if (c6264 != abstractC23903M9471) {
                    C5286 c5287 = this.f15575;
                    c5287.f18294 = c11906.f30189;
                    C17945 c17945M14613 = c5287.m14613(c5287.m14594(c6264, abstractC5930), (AbstractC5930) c22864M14622);
                    c17945M14613.f30190 = c3836.f14263;
                    c17945M14613.f57400 = true;
                    abstractC5932 = c17945M14613;
                }
                this.f4871 = this.f15574.mo5879(abstractC5932);
                return;
            } finally {
                this.f15581 = c6263;
                this.f15574.mo5881();
            }
        }
        super.mo3938(c11906);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        C5558 c5558 = (C5558) c15103.f49323.f22475;
        AbstractC16579 abstractC16579M27290 = C3128.m9462((AbstractC20372) c15103).m27290();
        C23800 c23800 = this.f15579;
        AbstractC16579 abstractC16579M52402 = c23800.m52402(abstractC16579M27290);
        if (abstractC16579M52402.mo9481()) {
            abstractC16579M52402 = c23800.m52383(abstractC16579M52402).f77449;
        }
        C6263 c6263Mo5880 = this.f15574.mo5880(c5558);
        if (c6263Mo5880 != null) {
            C5286 c5286 = this.f15575;
            c5286.f18294 = C3128.m9453(c15103);
            C3107 c3107M14586 = this.f15575.m14586((AbstractC23903) c6263Mo5880);
            C3107 c3107M14587 = this.f15575.m14586((AbstractC23903) this.f15581);
            C5286 c5287 = this.f15575;
            c5287.m14629((InterfaceC12260) c3107M14587);
            C2422 c2422M14583 = c5287.m14583((AbstractC8774) this.f15575.m14634(abstractC16579M52402), (AbstractC5930) c3107M14587);
            c2422M14583.f30190 = abstractC16579M52402;
            C3812 c3812M14587 = c5286.m14587((AbstractC5930) c3107M14586, (AbstractC5930) c2422M14583);
            c3812M14587.f30190 = c6263Mo5880.mo50006(c23800);
            C5286 c5288 = this.f15575;
            C17945 c17945M14636 = c5288.m14636((AbstractC5930) this.f15575.m14580(Boolean.TRUE), C21825.of((Object) c5288.m14642(c3812M14587)));
            c17945M14636.f57400 = true;
            c17945M14636.f30190 = this.f15580.f14263;
            this.f4871 = c17945M14636;
            return;
        }
        this.f4871 = this.f15575.m14580(Boolean.TRUE);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3949(C16139 c16139) {
        this.f4871 = mo3964(c16139.f52149);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3933(C9459 c9459) {
        AbstractC5930 abstractC5930 = (AbstractC5930) mo3964(c9459.f32014);
        AbstractC5930 abstractC5931 = (AbstractC5930) mo3964(c9459.f32013);
        EnumC18651 enumC18651 = EnumC18651.f60464;
        C22864 c22864M14622 = this.f15575.m14622(enumC18651, abstractC5930, abstractC5931);
        C10498 c10498M26961 = this.f15573.m26961(c22864M14622, enumC18651, abstractC5930.f30190, abstractC5931.f30190);
        c22864M14622.f35957 = c10498M26961;
        c22864M14622.f30190 = c10498M26961.f77449.mo16235();
        this.f4871 = c22864M14622;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        m12190(c2026, c2026.f7570, c2026.f7568, c2026.f7566, c2026.f7567);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        m12190(c9789, c9789.f33504, c9789.f33505, c9789.f33503, c9789.f33506);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0380  */
    /* JADX WARN: Code duplicated, block: B:60:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0401  */
    /* JADX WARN: Code duplicated, block: B:80:0x0405  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12190(AbstractC8774 abstractC8774, AbstractC5930 abstractC5930, C21825 c21825, boolean z, boolean z2) {
        Iterator it;
        int i;
        C19003 c19003;
        C18630 c18630;
        int i2;
        if (!z2) {
            if (abstractC8774.m22847(EnumC18651.f60475)) {
                super.mo3918((C2026) abstractC8774);
                return;
            } else {
                super.mo3934((C9789) abstractC8774);
                return;
            }
        }
        boolean zM39001 = abstractC5930.f30190.m39001(EnumC6617.BOT);
        C3836 c3836 = this.f15580;
        final AbstractC16579 abstractC16579 = zM39001 ? c3836.f14275 : abstractC5930.f30190;
        C2008 c2008 = this.f15582;
        C6171.m17176(c2008.m6473());
        C6171.m17176(c2008.m6474(this.f15569.f16295.f34725));
        C19003 c19004 = new C19003();
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            if (((C18630) c21826.f70876).f60403.isEmpty() && c21826.f70877.m48595()) {
                C18630 c18631 = (C18630) c21826.f70877.f70876;
                c18631.f60400 = c18631.f60400.m48594(((C18630) c21826.f70876).f60400);
            } else {
                c19004.m43723((C18630) c21826.f70876);
            }
        }
        C21825 c21825M43726 = c19004.m43726();
        C19003 c19005 = new C19003();
        StringBuilder sb = new StringBuilder("selector");
        sb.append(abstractC8774.f30189);
        EnumC14128 enumC14128 = this.f15578;
        sb.append(enumC14128.m34166());
        sb.append("temp");
        String string = sb.toString();
        C23942 c23942 = this.f15571;
        C6263 c6263 = new C6263(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c23942.f77631.m17389(string), abstractC16579, this.f15572);
        boolean zAnyMatch = C9030.stream(c21825M43726).flatMap(new C4686(8)).anyMatch(new C12384());
        C18630 c18632 = (C18630) c21825M43726.last();
        if (z && !zAnyMatch && C9030.stream(c21825M43726).flatMap(new C16485(12)).noneMatch(new C12252(2))) {
            C21825 c21827 = c18632.f60400;
            AbstractC16579 abstractC165710 = c3836.f14228;
            C1321 c1321M14581 = this.f15575.m14581(abstractC165710.mo1933(), (Object) null);
            c1321M14581.f30190 = abstractC165710;
            c18632.f60400 = c21827.m48597(c1321M14581);
            zAnyMatch = true;
        }
        AbstractC5930 abstractC5930M18295 = (AbstractC5930) mo3964(abstractC5930);
        C5286 c5286 = this.f15575;
        c5286.f18294 = abstractC8774.f30189;
        if (!zAnyMatch) {
            abstractC5930M18295 = this.f15576.m18295(abstractC5930M18295);
        }
        c19005.m43723(c5286.m14594(c6263, abstractC5930M18295));
        AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389((enumC14128.m34166() + abstractC8774.f30189) + "index");
        C3131 c3131 = c3836.f14232;
        AbstractC16579 abstractC165711 = c3836.f14275;
        AbstractC16579 abstractC165712 = c3836.f14283;
        C3131 c3132 = c3836.f14232;
        C6263 c6264 = new C6263(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC11242M17389, c3131, this.f15572);
        C5286 c5287 = this.f15575;
        c5287.f18294 = abstractC8774.f30189;
        C1321 c1321M14582 = this.f15575.m14581(c3132.mo1933(), (Object) 0);
        c1321M14582.f30190 = c3132.mo1930((Object) 0);
        c19005.m43723(c5287.m14594(c6264, c1321M14582));
        C18630 c18633 = c18632;
        C21825 c21825M48584 = C21825.m48584(c3836.f14301, c3836.f14220, c3836.f14295, this.f15579.m52406(new C0309(abstractC165712.f53222, abstractC165712.mo1934(), C21825.of((Object) new C0350(abstractC165711, EnumC15395.UNBOUND, c3836.f14239)))));
        InterfaceC7299[] interfaceC7299Arr = (InterfaceC7299[]) C9030.stream(c21825M43726).flatMap(new C23726(6)).map(new Function() { // from class: l.ܿۨ۟
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C4352.m12188(this.f55120, abstractC16579, (AbstractC8047) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        }).filter(new C22701(1)).toArray(new C14698(1));
        boolean zM52717 = abstractC16579.f53222.m52717();
        AbstractC11242 abstractC11242 = zM52717 ? c23942.f77546 : c23942.f77586;
        C6263 c6265 = c6263;
        C19003 c19006 = c19005;
        C18258 c18258M45527 = this.f15577.m45527(abstractC8774, this.f15569, c3836.f14230, abstractC11242, c21825M48584, C21825.m48588());
        C6969 c6969 = new C6969(abstractC11242, c3836.f14243, c18258M45527.mo36947(), new C13757(C21825.of((Object) (zM52717 ? abstractC16579 : abstractC165711), (Object) c3132), c3132, C21825.m48588(), c3836.f14240), interfaceC7299Arr);
        C5286 c5288 = this.f15575;
        C23570 c23570M14625 = c5288.m14625(c5288.m14641(c18258M45527.f77448), c6969.f77453);
        c23570M14625.f76355 = c6969;
        c23570M14625.f30190 = c3132;
        C15434 c15434M14610 = this.f15575.m14610(c23570M14625, C21825.m48588(), C21825.of((Object) this.f15575.m14586((AbstractC23903) c6265), (Object) this.f15575.m14586((AbstractC23903) c6264)));
        c15434M14610.f30190 = c3132;
        Iterator it2 = c21825M43726.iterator();
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (it2.hasNext()) {
            C18630 c18634 = (C18630) it2.next();
            C21825 c21828 = c18634.f60400;
            if (c21828.m48596() > 1) {
                it = it2;
                if (C9030.stream(c18634.f60400).anyMatch(new C1241(3))) {
                    i = 1;
                    c21828 = (C21825) C9030.stream(c18634.f60400).filter(new C6964(i)).collect(C21825.m48587());
                }
                if (c21828.m48596() == i || !((AbstractC8047) c21828.f70876).mo16199() || z3) {
                    c18634.f60403 = m3913(c18634.f60403);
                } else {
                    AbstractC8047 abstractC8047 = (AbstractC8047) c21828.f70876;
                    this.f15574 = new C1799(this);
                    C6263 c6266 = this.f15581;
                    try {
                        this.f15581 = c6265;
                        AbstractC5930 abstractC5931 = (AbstractC5930) mo3964(abstractC8047);
                        c18634.f60403 = m3913(c18634.f60403);
                        C5286 c5289 = this.f15575;
                        AbstractC8047 abstractC8048 = (AbstractC8047) c21828.f70876;
                        abstractC8048.getClass();
                        c5289.m14629((InterfaceC12260) abstractC8048);
                        C20747 c20747 = new C20747();
                        c20747.f67504 = null;
                        c20747.f30189 = c5289.f18294;
                        c20747.f67505 = abstractC8774;
                        C21825 c21829 = c18634.f60403;
                        C5286 c52810 = this.f15575;
                        EnumC18651 enumC18651 = EnumC18651.f60561;
                        C13007 c13007M14605 = c52810.m14605(enumC18651, abstractC5931);
                        C10498 c10498M26960 = this.f15573.m26960(c13007M14605, enumC18651, abstractC5931.f30190);
                        c13007M14605.f35957 = c10498M26960;
                        c10498M26960.f77449.mo16235();
                        c13007M14605.f30190 = c3836.f14263;
                        C5286 c52811 = this.f15575;
                        C3107 c3107M14586 = c52811.m14586((AbstractC23903) c6264);
                        Integer numValueOf = Integer.valueOf(i3 + 1);
                        C1321 c1321M14583 = this.f15575.m14581(c3132.mo1933(), numValueOf);
                        c1321M14583.f30190 = c3132.mo1930(numValueOf);
                        C3812 c3812M14587 = c52811.m14587((AbstractC5930) c3107M14586, (AbstractC5930) c1321M14583);
                        c3812M14587.f30190 = c3132;
                        C21825 c21825M48597 = c21829.m48597(c52810.m14588(c13007M14605, c52811.m14617(0L, C21825.of((Object) c52811.m14642(c3812M14587), (Object) c20747)), (AbstractC14728) null));
                        c18634.f60403 = c21825M48597;
                        c18634.f60403 = c21825M48597.m48594(this.f15574.mo5883(c18634.f30189));
                        this.f15581 = c6266;
                        this.f15574.mo5881();
                    } catch (Throwable th) {
                        this.f15581 = c6266;
                        this.f15574.mo5881();
                        throw th;
                    }
                }
                c19003 = new C19003();
                z4 = z4;
                i3 = i3;
                for (AbstractC8047 abstractC8049 : c18634.f60400) {
                    if (abstractC8049.m22847(EnumC18651.f60565)) {
                        c19003.m43723(abstractC8049);
                        z4 = true;
                        c18630 = c18633;
                    } else {
                        if (z || z4) {
                            c18630 = c18633;
                        } else {
                            c18630 = c18633;
                            if (c18634 == c18630 && abstractC8049.mo16199()) {
                                c19003.m43723(this.f15575.m14611());
                            }
                        }
                        if (abstractC8049.m21179()) {
                            i2 = i3;
                            i3 = -1;
                        } else {
                            i2 = i3 + 1;
                        }
                        c19003.m43723(this.f15575.m14580(Integer.valueOf(i3)));
                        i3 = i2;
                    }
                    c18633 = c18630;
                }
                C18630 c18635 = c18633;
                c18634.f60400 = c19003.m43726();
                if (c18634.f60402 == EnumC13425.STATEMENT) {
                    z3 = c18634.f60399;
                } else {
                    C5286 c52812 = this.f15575;
                    c52812.f18294 = C3128.m9432((AbstractC8774) c18634.f60403.last());
                    C17924 c17924M14612 = c52812.m14612((AbstractC11242) null);
                    c17924M14612.f56927 = abstractC8774;
                    c18634.f60403 = c18634.f60403.m48591(c17924M14612);
                    z3 = false;
                }
                it2 = it;
                c18633 = c18635;
                c6265 = c6265;
                c19006 = c19006;
                c3836 = c3836;
            } else {
                it = it2;
            }
            i = 1;
            if (c21828.m48596() == i) {
                c18634.f60403 = m3913(c18634.f60403);
            } else {
                c18634.f60403 = m3913(c18634.f60403);
            }
            c19003 = new C19003();
            z4 = z4;
            i3 = i3;
            while (r4.hasNext()) {
                if (abstractC8049.m22847(EnumC18651.f60565)) {
                    c19003.m43723(abstractC8049);
                    z4 = true;
                    c18630 = c18633;
                } else if (z) {
                    c18630 = c18633;
                    if (abstractC8049.m21179()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c19003.m43723(this.f15575.m14580(Integer.valueOf(i3)));
                    i3 = i2;
                } else {
                    c18630 = c18633;
                    if (abstractC8049.m21179()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c19003.m43723(this.f15575.m14580(Integer.valueOf(i3)));
                    i3 = i2;
                }
                c18633 = c18630;
            }
            C18630 c18636 = c18633;
            c18634.f60400 = c19003.m43726();
            if (c18634.f60402 == EnumC13425.STATEMENT) {
                z3 = c18634.f60399;
            } else {
                C5286 c52813 = this.f15575;
                c52813.f18294 = C3128.m9432((AbstractC8774) c18634.f60403.last());
                C17924 c17924M14613 = c52813.m14612((AbstractC11242) null);
                c17924M14613.f56927 = abstractC8774;
                c18634.f60403 = c18634.f60403.m48591(c17924M14613);
                z3 = false;
            }
            it2 = it;
            c18633 = c18636;
            c6265 = c6265;
            c19006 = c19006;
            c3836 = c3836;
        }
        C19003 c19007 = c19006;
        if (abstractC8774.m22847(EnumC18651.f60475)) {
            C2026 c2026 = (C2026) abstractC8774;
            c2026.f7570 = c15434M14610;
            c2026.f7568 = c21825M43726;
            c19007.m43723(c2026);
            this.f4871 = this.f15575.m14617(0L, c19007.m43726());
            return;
        }
        C9789 c9789 = (C9789) abstractC8774;
        c9789.f33504 = c15434M14610;
        c9789.f33505 = c21825M43726;
        C17945 c17945M14636 = this.f15575.m14636((AbstractC5930) c9789, c19007.m43726());
        c17945M14636.f30190 = abstractC8774.f30190;
        c17945M14636.f57400 = true;
        this.f4871 = c17945M14636;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        this.f15574 = new C1799(this);
        try {
            super.mo1267(c22864);
            this.f4871 = this.f15574.mo5879(c22864);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        this.f15574 = new C1799(this);
        try {
            super.mo1263(c7341);
            this.f4871 = this.f15574.mo5879(c7341);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        this.f15574 = new C1799(this);
        try {
            super.mo3924(c4849);
            this.f4871 = this.f15574.mo5882(c4849);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        this.f15574 = new C1799(this);
        try {
            super.mo3944(c14398);
            this.f4871 = this.f15574.mo5882(c14398);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        this.f15574 = new C1799(this);
        try {
            super.mo3960(c22885);
            this.f4871 = this.f15574.mo5882(c22885);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        this.f15574 = new C1799(this);
        try {
            super.mo3914(c0285);
            this.f4871 = this.f15574.mo5882(c0285);
        } finally {
            this.f15574.mo5881();
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        C18258 c18258 = this.f15572;
        try {
            this.f15572 = c23195.f75263;
            super.mo3961(c23195);
        } finally {
            this.f15572 = c18258;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        C6263 c6263Mo5885 = (c3107.f11716.mo20276() & 576460752303423488L) != 0 ? this.f15574.mo5885((C5558) c3107.f11716) : null;
        if (c6263Mo5885 == null) {
            super.mo1262(c3107);
            return;
        }
        C5286 c5286 = this.f15575;
        c5286.f18294 = c3107.f30189;
        this.f4871 = c5286.m14586((AbstractC23903) c6263Mo5885);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        C19003 c19003 = new C19003();
        this.f15574 = new C10973(this, c19003);
        C18258 c18258 = this.f15572;
        if (c18258 == null) {
            try {
                this.f15572 = new C18258(c21452.f69739 | 1048576, this.f15571.f77594, null, this.f15570);
            } finally {
                this.f15572 = c18258;
                this.f15574.mo5881();
            }
        }
        for (C21825 c21825 = c21452.f69737; c21825.m48595(); c21825 = c21825.f70877) {
            c19003.m43723((AbstractC14728) mo3964((AbstractC14728) c21825.f70876));
        }
        c21452.f69737 = c19003.m43726();
        this.f4871 = c21452;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        AbstractC9562 abstractC9562 = this.f15574;
        try {
            this.f15574 = new C3210(this);
            super.mo3959(c22489);
        } finally {
            this.f15574 = abstractC9562;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C22492 c22492 = this.f15570;
        C18258 c18258 = this.f15572;
        try {
            this.f15570 = c8753.f30086;
            this.f15572 = null;
            super.mo1065(c8753);
        } finally {
            this.f15570 = c22492;
            this.f15572 = c18258;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C18258 c18258 = this.f15572;
        try {
            c6656.f22476 = (C21783) mo3964(c6656.f22476);
            c6656.f22477 = (AbstractC5930) mo3964(c6656.f22477);
            if (this.f15572 == null) {
                this.f15572 = new C18258((c6656.f22476.f70567 & 8) | 1048576, this.f15571.f77594, null, this.f15570);
            }
            AbstractC5930 abstractC5930 = c6656.f22481;
            if (abstractC5930 != null) {
                c6656.f22481 = (AbstractC5930) mo3964(abstractC5930);
            }
            this.f4871 = c6656;
        } finally {
            this.f15572 = c18258;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8774 m12194(C4603 c4603, AbstractC8774 abstractC8774, C5286 c5286) {
        try {
            this.f15575 = c5286;
            this.f15569 = c4603;
            mo3964(abstractC8774);
            return abstractC8774;
        } finally {
            this.f15575 = null;
            this.f15569 = null;
        }
    }

    public C4352(C12343 c12343) {
        c12343.m30659(f15568, this);
        this.f15580 = C3836.m11131(c12343);
        this.f15576 = C6761.m18268(c12343);
        this.f15577 = C20145.m45505(c12343);
        this.f15575 = C5286.m14576(c12343);
        this.f15579 = C23800.m52336(c12343);
        this.f15573 = C10727.m26956(c12343);
        this.f15571 = C23942.m52776(c12343);
        this.f15578 = EnumC14128.m34159(c12343);
        this.f15582 = C2008.m6467(c12343);
        C14770.m35395(c12343).m35407("debug.patterns");
    }
}
