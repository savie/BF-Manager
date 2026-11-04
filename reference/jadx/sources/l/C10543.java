package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10543 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f33519;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15018 f33520;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10543(C22478 c22478, C15018 c15018) {
        super("OkHttp %s", c22478.f72725);
        this.f33519 = c22478;
        this.f33520 = c15018;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩸֫ۨ] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ܶۚۨ] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
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
    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() throws Throwable {
        Throwable th;
        EnumC15874 enumC15874;
        ?? r0 = this.f33519;
        C15018 c15018 = this.f33520;
        EnumC15874 enumC15875 = EnumC15874.INTERNAL_ERROR;
        ?? r3 = 1;
        try {
            try {
                try {
                    if (!c15018.m36170(true, this)) {
                        C6180.m17815("Required SETTINGS preface not received", new Object[0]);
                        throw null;
                    }
                    while (c15018.m36170(false, this)) {
                    }
                    enumC15874 = EnumC15874.NO_ERROR;
                    try {
                        enumC15875 = EnumC15874.CANCEL;
                        r0.m50701(enumC15874, enumC15875);
                        r3 = enumC15874;
                    } catch (IOException unused) {
                        enumC15875 = EnumC15874.PROTOCOL_ERROR;
                        r0.m50701(enumC15875, enumC15875);
                        r3 = enumC15874;
                    }
                    C19822.m45601(c15018);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r0.m50701(r3, enumC15875);
                    } catch (IOException unused2) {
                    }
                    C19822.m45601(c15018);
                    throw th;
                }
            } catch (IOException unused3) {
                enumC15874 = enumC15875;
            } catch (Throwable th3) {
                th = th3;
                r3 = enumC15875;
                r0.m50701(r3, enumC15875);
                C19822.m45601(c15018);
                throw th;
            }
        } catch (IOException unused4) {
        }
    }
}
