package l;

/* JADX INFO: renamed from: l.᩷ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 11V2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21007 implements InterfaceC22134, InterfaceC21921 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68400;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68401;

    public /* synthetic */ C21007(int i, Object obj) {
        this.f68400 = i;
        this.f68401 = obj;
    }

    @Override // l.InterfaceC22134
    /* JADX INFO: renamed from: ۙ */
    public void mo22853(long j, C2460 c2460) {
        C12867.m31907(j, c2460, ((C22185) this.f68401).f72562);
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        switch (this.f68400) {
            case 0:
                ((InterfaceC20302) this.f68401).mo45816(((int) (i * 0.4f)) + 60);
                break;
            default:
                ((InterfaceC24022) this.f68401).mo18421(((int) (i * 0.9f)) + 10);
                break;
        }
    }
}
