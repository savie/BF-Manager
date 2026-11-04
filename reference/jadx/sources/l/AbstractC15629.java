package l;

/* JADX INFO: renamed from: l.ܳ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15629 implements InterfaceC13917 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f50762;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f50763;

    public AbstractC15629(int i, String str) {
        this.f50762 = i;
        this.f50763 = str;
    }

    @Override // l.InterfaceC13917
    /* JADX INFO: renamed from: ۫ */
    public final int mo33895() {
        return this.f50762;
    }

    @Override // l.InterfaceC13917
    public final String getPackageName() {
        return this.f50763;
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC13917 interfaceC13917 = (InterfaceC13917) interfaceC1921;
        if (this.f50762 != interfaceC13917.mo33895()) {
            throw new RuntimeException();
        }
        if (!C17359.equals(this.f50763, interfaceC13917.getPackageName())) {
            throw new RuntimeException();
        }
    }
}
