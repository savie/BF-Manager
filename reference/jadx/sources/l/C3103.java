package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3103 implements InterfaceC2436 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f10028;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f10030;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13500 f10031;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2357 f10032;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC4365 f10033;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5341 f10034;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3509 f10035;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7028 f10036;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17933 f10037;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f10038;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC24161 f10039;

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8210() {
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC2436 mo8212(InterfaceC4365 interfaceC4365) {
        m10125(interfaceC4365);
        return this;
    }

    public C3103(InterfaceC15670 interfaceC15670) {
        this(new C8519(interfaceC15670));
    }

    public C3103(InterfaceC5341 interfaceC5341) {
        this.f10034 = interfaceC5341;
        this.f10031 = new C13500();
        this.f10032 = new C2357();
        this.f10039 = C4769.f16725;
        this.f10033 = new C20773();
        this.f10037 = new C17933();
        this.f10030 = 1;
        this.f10038 = -9223372036854775807L;
        this.f10029 = true;
        this.f10028 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10125(InterfaceC4365 interfaceC4365) {
        C20782.m47563(interfaceC4365, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f10033 = interfaceC4365;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8211(C3509 c3509) {
        this.f10035 = c3509;
        return this;
    }

    @Override // l.InterfaceC2436
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8213(boolean z) {
        this.f10028 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10126(InterfaceC24161 interfaceC24161) {
        this.f10039 = interfaceC24161;
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
    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13622 mo8214(C14902 c14902) {
        c14902.f48681.getClass();
        if (this.f10036 == null) {
            this.f10036 = new C7028();
        }
        C3509 c3509 = this.f10035;
        if (c3509 != null) {
            this.f10036.m19344(c3509);
        }
        this.f10036.m19345(this.f10028);
        this.f10036.getClass();
        C7028 c7028 = this.f10036;
        List list = c14902.f48681.f66806;
        boolean zIsEmpty = list.isEmpty();
        C2357 c2357 = this.f10032;
        InterfaceC6261 c21923 = c2357;
        if (!zIsEmpty) {
            c21923 = new C21923(c2357, list);
        }
        InterfaceC24929 interfaceC24929M33171 = this.f10031.m33171(c14902);
        InterfaceC4365 interfaceC4365 = this.f10033;
        return new C20257(c14902, this.f10034, c7028, this.f10037, interfaceC24929M33171, interfaceC4365, this.f10039.mo30821(this.f10034, interfaceC4365, c21923), this.f10038, this.f10029, this.f10030);
    }
}
