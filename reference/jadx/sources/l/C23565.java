package l;

/* JADX INFO: renamed from: l.᩻۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23565 implements InterfaceC7486, InterfaceC15954, InterfaceC8934 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76321;

    public /* synthetic */ C23565(Object obj) {
        this.f76321 = obj;
    }

    @Override // l.InterfaceC7486
    /* JADX INFO: renamed from: ܰ */
    public void mo2142(Object obj, Throwable th) {
        C8352 c8352 = (C8352) this.f76321;
        c8352.f28945.post(new RunnableC15408(c8352, th, 0));
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        return ((C14393) this.f76321).f47165.m4633().m30018((InterfaceC20892) new C8063((Throwable) obj));
    }
}
