package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11053 implements InterfaceC23035 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC14113 f37529;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37530;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f37531;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37532;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21635 f37533;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22675 f37534;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18378 f37535;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f37536;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2641 f37537;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C11164 f37538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC15992 f37539;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC2918 f37540;

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5444() {
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC23035 mo5446(InterfaceC14113 interfaceC14113) {
        m27874(interfaceC14113);
        return this;
    }

    public C11053(InterfaceC20723 interfaceC20723) {
        this(new C15286(interfaceC20723));
    }

    public C11053(InterfaceC15992 interfaceC15992) {
        this.f37539 = interfaceC15992;
        this.f37535 = new C18378();
        this.f37534 = new C22675();
        this.f37540 = C18441.f58781;
        this.f37529 = new C1619();
        this.f37537 = new C2641();
        this.f37536 = 1;
        this.f37530 = -9223372036854775807L;
        this.f37532 = true;
        this.f37531 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27874(InterfaceC14113 interfaceC14113) {
        C2023.m6505(interfaceC14113, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f37529 = interfaceC14113;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5445(C11164 c11164) {
        this.f37538 = c11164;
        return this;
    }

    @Override // l.InterfaceC23035
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5447(boolean z) {
        this.f37531 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27873(InterfaceC2918 interfaceC2918) {
        this.f37540 = interfaceC2918;
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
    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18095 mo5443(C13689 c13689) {
        c13689.f45157.getClass();
        if (this.f37533 == null) {
            this.f37533 = new C21635();
        }
        C11164 c11164 = this.f37538;
        if (c11164 != null) {
            this.f37533.m48349(c11164);
        }
        this.f37533.m48350(this.f37531);
        this.f37533.getClass();
        C21635 c21635 = this.f37533;
        List list = c13689.f45157.f48030;
        boolean zIsEmpty = list.isEmpty();
        C22675 c22675 = this.f37534;
        InterfaceC9270 c7858 = c22675;
        if (!zIsEmpty) {
            c7858 = new C7858(c22675, list);
        }
        InterfaceC16967 interfaceC16967M42661 = this.f37535.m42661(c13689);
        InterfaceC14113 interfaceC14113 = this.f37529;
        return new C23753(c13689, this.f37539, c21635, this.f37537, interfaceC16967M42661, interfaceC14113, this.f37540.mo8743(this.f37539, interfaceC14113, c7858), this.f37530, this.f37532, this.f37536);
    }
}
