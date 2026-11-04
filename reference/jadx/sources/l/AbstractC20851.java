package l;

/* JADX INFO: renamed from: l.᩵᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20851 implements InterfaceC19820 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f66754;

    public AbstractC20851(int i, int i2) {
        this.f66754 = i;
        this.f66753 = i2;
    }

    @Override // l.InterfaceC19820
    /* JADX INFO: renamed from: ᩹ۙ */
    public final int mo45587() {
        return this.f66754;
    }

    @Override // l.InterfaceC19820
    /* JADX INFO: renamed from: ᩸᩷ */
    public final int mo45586() {
        return this.f66753;
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC19820 interfaceC19820 = (InterfaceC19820) interfaceC1921;
        if (this.f66754 != interfaceC19820.mo45587()) {
            throw new RuntimeException();
        }
        if (this.f66753 != interfaceC19820.mo45586()) {
            throw new RuntimeException();
        }
    }
}
