package l;

/* JADX INFO: renamed from: l.᩵ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20764 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66511;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66512;

    public /* synthetic */ C20764(int i, Object obj) {
        this.f66511 = i;
        this.f66512 = obj;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        switch (this.f66511) {
            case 0:
                C12559.m31258((C12559) this.f66512, (String) obj);
                break;
            default:
                ((C21712) obj).m49282().setText(C22482.m50718(((C5258) this.f66512).f18531.getTime()));
                break;
        }
    }
}
