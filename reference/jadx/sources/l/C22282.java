package l;

/* JADX INFO: renamed from: l.᩹۫۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C22282 {
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
    public static InterfaceC11138 m49454(C4975 c4975, InterfaceC8400 interfaceC8400) {
        InterfaceC22386 interfaceC22386Mo4417;
        AbstractC13816 c22802;
        EnumC3231 enumC3231 = EnumC3231.DEFAULT;
        InterfaceC22386 interfaceC22386M13803 = c4975.m13803();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC22386M13803.mo4415(bool, C15933.f51617)).booleanValue();
        boolean zBooleanValue2 = bool.booleanValue();
        C1218 c1218 = C1218.f5350;
        if (zBooleanValue || zBooleanValue2) {
            C0763 c0763 = new C0763();
            c0763.f3078 = c1218;
            InterfaceC22386 interfaceC22386 = (InterfaceC22386) interfaceC22386M13803.mo4415(c1218, new C20871(c0763));
            if (zBooleanValue2) {
                c0763.f3078 = ((InterfaceC22386) c0763.f3078).mo4415(c1218, C7465.f24865);
            }
            interfaceC22386Mo4417 = interfaceC22386.mo4417((InterfaceC22386) c0763.f3078);
        } else {
            interfaceC22386Mo4417 = interfaceC22386M13803.mo4417(c1218);
        }
        if (interfaceC22386Mo4417 != C6904.m18521() && interfaceC22386Mo4417.mo4416(InterfaceC3480.f12775) == null) {
            interfaceC22386Mo4417 = interfaceC22386Mo4417.mo4417(C6904.m18521());
        }
        if (enumC3231.m9686()) {
            c22802 = new C22096(interfaceC22386Mo4417, interfaceC8400);
        } else {
            c22802 = new C22802(interfaceC22386Mo4417, true);
        }
        enumC3231.m9684(interfaceC8400, c22802, c22802);
        return c22802;
    }
}
