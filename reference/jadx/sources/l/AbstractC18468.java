package l;

/* JADX INFO: renamed from: l.ᩴۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18468 implements InterfaceC21249 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58845;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15070 f58846;

    public AbstractC18468(int i, C15070 c15070) {
        this.f58845 = i;
        this.f58846 = c15070;
    }

    @Override // l.InterfaceC21249
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo42826() {
        return this.f58845;
    }

    @Override // l.InterfaceC21249
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10609 mo42827() {
        return this.f58846;
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC21249 interfaceC21249 = (InterfaceC21249) interfaceC7138;
        if (this.f58845 != interfaceC21249.mo42826()) {
            throw new RuntimeException();
        }
        InterfaceC10609 interfaceC10609Mo42827 = interfaceC21249.mo42827();
        C15070 c15070 = this.f58846;
        if (c15070.size() != interfaceC10609Mo42827.size()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c15070.size(); i++) {
            if (c15070.getInt(i) != interfaceC10609Mo42827.getInt(i)) {
                throw new RuntimeException();
            }
        }
    }
}
