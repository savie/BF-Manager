package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.۠᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8394 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f29139 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11018 f29140;

    public C8394(C11018 c11018) {
        this.f29140 = c11018;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22035(C14744 c14744) {
        int i = c14744.f48221;
        C11018 c11018 = this.f29140;
        c11018.writeInt(i);
        c11018.writeInt(c14744.f48223);
        m22034(c14744.f48222);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22034(AbstractC0631 abstractC0631) {
        C11018 c11018 = this.f29140;
        if (abstractC0631 == null) {
            c11018.writeInt(-1);
            return;
        }
        IdentityHashMap identityHashMap = this.f29139;
        Integer num = (Integer) identityHashMap.get(abstractC0631);
        if (num != null) {
            c11018.writeInt(num.intValue());
            return;
        }
        c11018.writeInt(identityHashMap.size());
        identityHashMap.put(abstractC0631, Integer.valueOf(identityHashMap.size()));
        int i = 0;
        if (abstractC0631 instanceof C16155) {
            C16155 c16155 = (C16155) abstractC0631;
            c11018.writeByte(1);
            c11018.writeInt(c16155.f2727);
            c11018.writeByte(c16155.m38249() ? 1 : 0);
            C21093 c21093M38247 = c16155.m38247();
            while (i < c16155.f2727) {
                try {
                    char cM33306 = c21093M38247.f68721.m33306(i);
                    if (c16155.m38249()) {
                        c11018.writeByte(cM33306);
                    } else {
                        c11018.mo24501(cM33306);
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        c21093M38247.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c21093M38247.close();
            return;
        }
        AbstractC0631[] abstractC0631Arr = ((C1337) abstractC0631).f5650;
        c11018.writeByte(2);
        c11018.writeInt(abstractC0631Arr.length);
        int length = abstractC0631Arr.length;
        while (i < length) {
            m22034(abstractC0631Arr[i]);
            i++;
        }
    }
}
