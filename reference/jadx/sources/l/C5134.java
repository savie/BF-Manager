package l;

/* JADX INFO: renamed from: l.ۙ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5134 implements InterfaceC2017 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17892;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17894;

    public /* synthetic */ C5134(int i, Object obj, Object obj2) {
        this.f17892 = i;
        this.f17894 = obj;
        this.f17893 = obj2;
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1355(Object obj, Throwable th) {
        C1229 c1229;
        switch (this.f17892) {
            case 0:
                C16320.m38718((C16320) this.f17894, (FutureC23690) this.f17893, (Throwable) obj, th);
                break;
            default:
                C7941 c7941 = (C7941) this.f17894;
                ((C8950) this.f17893).m23931((Throwable) null);
                if (th != null && (c1229 = c7941.f23989) != null) {
                    c1229.m4466(th);
                    break;
                }
                break;
        }
    }
}
