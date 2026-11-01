package l;

/* JADX INFO: renamed from: l.ۙܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4683 extends C10267 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f16566;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f16567;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4683(C20145 c20145, AbstractC23903 abstractC23903, boolean z) {
        super(abstractC23903, c20145);
        this.f16566 = c20145;
        this.f16567 = z;
    }

    @Override // l.C10267, l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        String str;
        boolean z = this.f16567;
        AbstractC23903 abstractC23904 = this.f60927;
        if (z) {
            str = abstractC23904.mo22992() ? "bad.static.method.in.unbound.lookup" : "bad.instance.method.in.unbound.lookup";
        } else {
            str = "bad.static.method.in.bound.lookup";
        }
        String str2 = str;
        if (abstractC23904.f77452.m26583()) {
            return ((AbstractC8856) abstractC23904).mo8964(enumC17198, interfaceC12260, abstractC23903, abstractC16579, abstractC11242, c21825, c21826);
        }
        C20145 c20145 = this.f16566;
        return c20145.f65420.m51912(enumC17198, c20145.f65441.m48186(), interfaceC12260, str2, C16121.m38160(abstractC23904), abstractC23904);
    }
}
