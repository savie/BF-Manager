package l;

/* JADX INFO: renamed from: l.ܶۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14941 implements InterfaceC22661 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f48723;

    public AbstractC14941(int i, String str) {
        this.f48722 = i;
        this.f48723 = str;
    }

    @Override // l.InterfaceC22661
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo35685() {
        return this.f48722;
    }

    @Override // l.InterfaceC22661
    public final String getPackageName() {
        return this.f48723;
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC22661 interfaceC22661 = (InterfaceC22661) interfaceC7138;
        if (this.f48722 != interfaceC22661.mo35685()) {
            throw new RuntimeException();
        }
        if (!C13638.equals(this.f48723, interfaceC22661.getPackageName())) {
            throw new RuntimeException();
        }
    }
}
