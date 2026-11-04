package l;

/* JADX INFO: renamed from: l.ۚ۠᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5527 {
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
    public static InterfaceC9211 m16443(C5915 c5915, InterfaceC23955 interfaceC23955) {
        InterfaceC11536 interfaceC11536Mo5006;
        AbstractC19697 c17612;
        EnumC13729 enumC13729 = EnumC13729.DEFAULT;
        InterfaceC11536 interfaceC11536M17174 = c5915.m17174();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC11536M17174.mo5004(bool, C21189.f67658)).booleanValue();
        boolean zBooleanValue2 = bool.booleanValue();
        C24963 c24963 = C24963.f80840;
        if (zBooleanValue || zBooleanValue2) {
            C24941 c24941 = new C24941();
            c24941.f80717 = c24963;
            InterfaceC11536 interfaceC11536 = (InterfaceC11536) interfaceC11536M17174.mo5004(c24963, new C14475(c24941));
            if (zBooleanValue2) {
                c24941.f80717 = ((InterfaceC11536) c24941.f80717).mo5004(c24963, C4035.f13765);
            }
            interfaceC11536Mo5006 = interfaceC11536.mo5006((InterfaceC11536) c24941.f80717);
        } else {
            interfaceC11536Mo5006 = interfaceC11536M17174.mo5006(c24963);
        }
        if (interfaceC11536Mo5006 != C1755.m6199() && interfaceC11536Mo5006.mo5005(InterfaceC22725.f73763) == null) {
            interfaceC11536Mo5006 = interfaceC11536Mo5006.mo5006(C1755.m6199());
        }
        if (enumC13729.m33550()) {
            c17612 = new C5680(interfaceC11536Mo5006, interfaceC23955);
        } else {
            c17612 = new C17612(interfaceC11536Mo5006, true);
        }
        enumC13729.m33549(interfaceC23955, c17612, c17612);
        return c17612;
    }
}
