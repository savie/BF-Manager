package l;

/* JADX INFO: renamed from: l.᩶ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19880 implements InterfaceC7844 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63734;

    public AbstractC19880(int i, int i2) {
        this.f63734 = i;
        this.f63733 = i2;
    }

    @Override // l.InterfaceC7844
    /* JADX INFO: renamed from: ᩴۙ */
    public final int mo20683() {
        return this.f63734;
    }

    @Override // l.InterfaceC7844
    /* JADX INFO: renamed from: ۖܰ */
    public final int mo20682() {
        return this.f63733;
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC7844 interfaceC7844 = (InterfaceC7844) interfaceC7138;
        if (this.f63734 != interfaceC7844.mo20683()) {
            throw new RuntimeException();
        }
        if (this.f63733 != interfaceC7844.mo20682()) {
            throw new RuntimeException();
        }
    }
}
