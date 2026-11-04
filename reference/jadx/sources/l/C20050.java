package l;

/* JADX INFO: renamed from: l.ᩴ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20050 implements InterfaceC2017, InterfaceC11711 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64442;

    public /* synthetic */ C20050(Object obj) {
        this.f64442 = obj;
    }

    @Override // l.InterfaceC11711
    /* JADX INFO: renamed from: ۙ */
    public Object mo14221(Object obj, Throwable th) {
        return C16320.m38727((Throwable) this.f64442, th);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C12679 c12679 = (C12679) this.f64442;
        c12679.f40618.post(new Runnable() { // from class: l.ۧ᩹᩸
            @Override // java.lang.Runnable
            public final void run() {
                C12679.m31462(this.f38433, th);
            }
        });
    }
}
