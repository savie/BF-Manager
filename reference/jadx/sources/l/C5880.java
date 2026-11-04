package l;

/* JADX INFO: renamed from: l.ۚ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5880 implements InterfaceC2017, InterfaceC25138 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2984 f20164;

    public /* synthetic */ C5880(InterfaceC2984 interfaceC2984) {
        this.f20164 = interfaceC2984;
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        return C16320.m38725((C16320) this.f20164, (Throwable) obj);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C12679 c12679 = (C12679) this.f20164;
        c12679.f40618.post(new Runnable() { // from class: l.ܽ᩹᩸
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th2 = th;
                C12679.m31466(this.f58637, l, th2);
            }
        });
    }
}
