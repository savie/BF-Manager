package l;

/* JADX INFO: renamed from: l.ۗۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3139 implements InterfaceC2017 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10174;

    public /* synthetic */ C3139(Object obj, Object obj2) {
        this.f10173 = obj;
        this.f10174 = obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m10256(C7305 c7305, C6781 c6781) {
        return C23648.m52882(c7305, c6781, ((C12000) this.f10173).m30182(), (C0352) this.f10174, 8388608);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C0902 c0902 = (C0902) this.f10173;
        c0902.f3380.post(new RunnableC20293(c0902, th, (Throwable) this.f10174, 0));
    }
}
