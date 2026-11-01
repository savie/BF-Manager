package l;

/* JADX INFO: renamed from: l.۬᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13424 implements InterfaceC11955 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8485 f44417;

    public C13424(C8485 c8485) {
        this.f44417 = c8485;
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        InterfaceC19234 interfaceC19234 = (InterfaceC19234) obj;
        C8485 c8485 = this.f44417;
        C1428 c1428M50097 = c8485.f51666.m50097(interfaceC19234.getType());
        C3067 c3067M24176 = null;
        if (!c8485.f29408) {
            C9419 c9419 = (C9419) c8485.f51669;
            String name = interfaceC19234.getName();
            if (name == null) {
                c9419.getClass();
            } else {
                c3067M24176 = c9419.m24176(name);
            }
        }
        return new C20002(c1428M50097, c3067M24176, ((C22741) c8485.f51674).m50406(interfaceC19234.getAnnotations()));
    }
}
