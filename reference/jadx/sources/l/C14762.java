package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܰܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14762 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f48231 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6178 f48232;

    public C14762(C6178 c6178) {
        this.f48232 = c6178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35498(C21697 c21697) {
        int i = c21697.f69244;
        C6178 c6178 = this.f48232;
        c6178.writeInt(i);
        c6178.writeInt(c21697.f69246);
        m35497(c21697.f69245);
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
    private void m35497(AbstractC1339 abstractC1339) {
        C6178 c6178 = this.f48232;
        if (abstractC1339 == null) {
            c6178.writeInt(-1);
            return;
        }
        IdentityHashMap identityHashMap = this.f48231;
        Integer num = (Integer) identityHashMap.get(abstractC1339);
        if (num != null) {
            c6178.writeInt(num.intValue());
            return;
        }
        c6178.writeInt(identityHashMap.size());
        identityHashMap.put(abstractC1339, Integer.valueOf(identityHashMap.size()));
        int i = 0;
        if (abstractC1339 instanceof C19238) {
            C19238 c19238 = (C19238) abstractC1339;
            c6178.writeByte(1);
            c6178.writeInt(c19238.f4794);
            c6178.writeByte(c19238.m44575() ? 1 : 0);
            C8051 c8051M44573 = c19238.m44573();
            while (i < c19238.f4794) {
                try {
                    char cM15950 = c8051M44573.f26678.m15950(i);
                    if (c19238.m44575()) {
                        c6178.writeByte(cM15950);
                    } else {
                        c6178.mo17801(cM15950);
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        c8051M44573.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c8051M44573.close();
            return;
        }
        AbstractC1339[] abstractC1339Arr = ((C17746) abstractC1339).f58291;
        c6178.writeByte(2);
        c6178.writeInt(abstractC1339Arr.length);
        int length = abstractC1339Arr.length;
        while (i < length) {
            m35497(abstractC1339Arr[i]);
            i++;
        }
    }
}
