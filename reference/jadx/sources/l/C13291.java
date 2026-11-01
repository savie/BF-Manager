package l;

/* JADX INFO: renamed from: l.۬ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13291 implements InterfaceC7486 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44133;

    public /* synthetic */ C13291(int i, Object obj) {
        this.f44132 = i;
        this.f44133 = obj;
    }

    @Override // l.InterfaceC7486
    /* JADX INFO: renamed from: ܰ */
    public final void mo2142(Object obj, Throwable th) {
        switch (this.f44132) {
            case 0:
                C8352 c8352 = (C8352) this.f44133;
                c8352.f28945.post(new Runnable() { // from class: l.ۘᩴۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8352.m21863(this.f15078, th);
                    }
                });
                break;
            default:
                ((C18292) this.f44133).m42501();
                break;
        }
    }
}
