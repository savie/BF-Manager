package l;

/* JADX INFO: renamed from: l.ۡ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9374 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30449;

    public /* synthetic */ C9374(int i, Object obj) {
        this.f30448 = i;
        this.f30449 = obj;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        switch (this.f30448) {
            case 0:
                AbstractC3191.m10416((AbstractC3191) this.f30449, (Integer) obj);
                break;
            default:
                C9097 c9097 = (C9097) this.f30449;
                C22458 c22458 = (C22458) obj;
                c22458.m50627().setText(c9097.m24241());
                c22458.m50628().setText(c9097.m24237());
                break;
        }
    }
}
