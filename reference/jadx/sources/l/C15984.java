package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15984 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f51764;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16689 f51765;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15984(C20217 c20217, C16689 c16689) {
        super("OkHttp %s", c20217.f65613);
        this.f51764 = c20217;
        this.f51765 = c16689;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩶ܰ᩵] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ۢۙ᩵] */
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
    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() throws Throwable {
        Throwable th;
        EnumC9365 enumC9365;
        ?? r0 = this.f51764;
        C16689 c16689 = this.f51765;
        EnumC9365 enumC9366 = EnumC9365.INTERNAL_ERROR;
        ?? r3 = 1;
        try {
            try {
                try {
                    if (!c16689.m39159(true, this)) {
                        C2576.m8030("Required SETTINGS preface not received", new Object[0]);
                        throw null;
                    }
                    while (c16689.m39159(false, this)) {
                    }
                    enumC9365 = EnumC9365.NO_ERROR;
                    try {
                        enumC9366 = EnumC9365.CANCEL;
                        r0.m45701(enumC9365, enumC9366);
                        r3 = enumC9365;
                    } catch (IOException unused) {
                        enumC9366 = EnumC9365.PROTOCOL_ERROR;
                        r0.m45701(enumC9366, enumC9366);
                        r3 = enumC9365;
                    }
                    C0140.m1231(c16689);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r0.m45701(r3, enumC9366);
                    } catch (IOException unused2) {
                    }
                    C0140.m1231(c16689);
                    throw th;
                }
            } catch (IOException unused3) {
                enumC9365 = enumC9366;
            } catch (Throwable th3) {
                th = th3;
                r3 = enumC9366;
                r0.m45701(r3, enumC9366);
                C0140.m1231(c16689);
                throw th;
            }
        } catch (IOException unused4) {
        }
    }
}
