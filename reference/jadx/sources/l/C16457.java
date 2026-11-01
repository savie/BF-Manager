package l;

/* JADX INFO: renamed from: l.ܽۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16457 implements InterfaceC8130 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23513 f52917;

    public C16457(C23513 c23513) {
        this.f52917 = c23513;
    }

    @Override // l.InterfaceC8130
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21429(Object obj, AbstractC18858 abstractC18858) {
        C7321 c7321;
        InterfaceC22327 interfaceC22327 = (InterfaceC22327) obj;
        InterfaceC0228 interfaceC0228 = this.f52917.f76106;
        if (interfaceC0228 == null) {
            c7321 = null;
        } else {
            C22246 c22246 = ((C14341) interfaceC0228).f46972;
            c22246.f72730 = interfaceC22327;
            C1452 c1452 = new C1452();
            c1452.setDuration(300L);
            c1452.setInterpolator(C7189.m19121(0.2f, 0.0f, 0.0f, 1.0f));
            C1181.m4320(c22246, c1452);
            c22246.requestLayout();
            c7321 = C7321.f24318;
        }
        return c7321 == EnumC13214.COROUTINE_SUSPENDED ? c7321 : C7321.f24318;
    }
}
