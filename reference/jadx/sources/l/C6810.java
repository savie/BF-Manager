package l;

/* JADX INFO: renamed from: l.ۜ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6810 extends AbstractC2335 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f22675;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6810(C22010 c22010, EnumC13603 enumC13603) {
        super(c22010, enumC13603, "symbol not found error");
        this.f22675 = c22010;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
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
    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        C14769 c147611;
        C14769 c14769M35543;
        boolean z;
        Object objM49759;
        Object objM497510;
        char c;
        EnumC4960 enumC4960;
        C17007 c17007M45975;
        C14769 c14769M35544;
        AbstractC19728 abstractC19729 = abstractC19728;
        if (c14769 == null) {
            c14769M35544 = C14769.m35543();
        } else {
            c147611 = c14769;
        }
        if (c147610 == null) {
            c147611 = c14769M35544;
            c14769M35543 = C14769.m35543();
        } else {
            c147611 = c14769M35544;
            c14769M35543 = c147610;
        }
        C22010 c22010 = this.f22675;
        C15252 c15252 = c22010.f71026;
        C19991 c19991 = c22010.f71000;
        C7312 c7312 = c22010.f71001;
        C15252 c15253 = c22010.f71026;
        if (abstractC19729 == c15252.f49822) {
            return null;
        }
        AbstractC11781 abstractC11782 = abstractC11781 == null ? abstractC22664.f73596 : abstractC11781;
        if (abstractC11782.f38072.isEmpty()) {
            z = false;
        } else {
            if (abstractC11782.f38066 == EnumC13603.f43219 && !abstractC22664.f73596.mo7873() && abstractC11782.f38072 != c15253.f49849) {
                return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "doesnt.exist", abstractC11782);
            }
            if (abstractC11782.f38072.equals(c15253.f49836) || abstractC11782.f38072.equals(c15253.f49851)) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = abstractC19729 == c15253.f49865;
        EnumC4960 enumC4960M33347 = z2 ? EnumC4960.CONSTRUCTOR : this.f38066.m33347();
        if (z2) {
            abstractC19729 = abstractC22664.f73596.f38072;
        }
        boolean zM35550 = c14769M35543.m35550();
        String string = z ? ".location" : "";
        int i = C18324.f59778[enumC4960M33347.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sbM27333 = C10732.m27333(string.concat(".args"));
            sbM27333.append(zM35550 ? ".params" : "");
            string = sbM27333.toString();
        }
        String strM56409 = C25272.m56409("cant.resolve", string);
        if (!z) {
            C19991 c19992 = c22010.f71000;
            C23393 c23393M34514 = c7312.m34514();
            if (!c147611.isEmpty()) {
                objM49759 = c147611;
                objM49759 = c22010.m49759(c147611);
            }
            objM49759 = c147611;
            return c19992.m45978(enumC22229, c23393M34514, interfaceC5075, strM56409, enumC4960M33347, abstractC19729, c14769M35543, objM49759);
        }
        C19991 c19993 = c22010.f71000;
        C23393 c23393M34515 = c7312.m34514();
        if (!c147611.isEmpty()) {
            objM497510 = c147611;
            objM497510 = c22010.m49759(c147611);
        }
        objM497510 = c147611;
        if (abstractC11782.f38066 == EnumC13603.f43205) {
            EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11782);
            AbstractC22664 abstractC22665 = abstractC11782.f38067;
            C15515 c15515 = C19859.f63823;
            c = 1;
            c17007M45975 = c19991.m45975(new C15515("compiler", "location.1", enumC4960M27726, abstractC11782, abstractC22665));
        } else {
            c = 1;
            if (abstractC22664.m51067(EnumC21172.TYPEVAR) || (abstractC22664.m51067(EnumC21172.CLASS) && (abstractC22664.f73596.mo29591() & 16777216) != 0)) {
                enumC4960 = EnumC4960.BOUND;
            } else if (abstractC22664.m51067(EnumC21172.PACKAGE)) {
                enumC4960 = EnumC4960.PACKAGE;
            } else {
                long j = abstractC22664.f73596.f38071;
                if ((j & 8192) != 0) {
                    enumC4960 = EnumC4960.ANNOTATION;
                } else {
                    enumC4960 = (j & 512) != 0 ? EnumC4960.INTERFACE : EnumC4960.CLASS;
                }
            }
            C15515 c15516 = C19859.f63823;
            c17007M45975 = c19991.m45975(new C15515("compiler", "location", enumC4960, abstractC22664, null));
        }
        Object[] objArr = new Object[5];
        objArr[0] = enumC4960M33347;
        objArr[c] = abstractC19729;
        objArr[2] = c14769M35543;
        objArr[3] = objM497510;
        objArr[4] = c17007M45975;
        return c19993.m45978(enumC22229, c23393M34515, interfaceC5075, strM56409, objArr);
    }
}
