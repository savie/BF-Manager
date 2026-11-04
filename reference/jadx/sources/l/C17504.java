package l;

/* JADX INFO: renamed from: l.ܽۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17504 implements InterfaceC3174 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12283 f56889;

    public C17504(C12283 c12283) {
        this.f56889 = c12283;
    }

    @Override // l.InterfaceC3174
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10365(Object obj, AbstractC6317 abstractC6317) {
        C11471 c11471;
        InterfaceC5167 interfaceC5167 = (InterfaceC5167) obj;
        InterfaceC16758 interfaceC16758 = this.f56889.f39482;
        if (interfaceC16758 == null) {
            c11471 = null;
        } else {
            C10045 c10045 = ((C6318) interfaceC16758).f21416;
            c10045.f32192 = interfaceC5167;
            C0835 c0835 = new C0835();
            c0835.setDuration(300L);
            c0835.setInterpolator(C6411.m18175(0.2f, 0.0f, 0.0f, 1.0f));
            C1075.m4036(c10045, c0835);
            c10045.requestLayout();
            c11471 = C11471.f36082;
        }
        return c11471 == EnumC16757.COROUTINE_SUSPENDED ? c11471 : C11471.f36082;
    }
}
