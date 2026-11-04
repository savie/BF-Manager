package l;

/* JADX INFO: renamed from: l.ܽᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17782 implements InterfaceC22524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58366;

    public /* synthetic */ C17782(int i) {
        this.f58366 = i;
    }

    @Override // l.InterfaceC22524
    public final AbstractC9843 create() {
        switch (this.f58366) {
            case 0:
                return new C2669("archive");
            default:
                return new C4468("compress");
        }
    }
}
