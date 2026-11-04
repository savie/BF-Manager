package l;

/* JADX INFO: renamed from: l.۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F5I3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7530 implements InterfaceC20955 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0072 f24856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo20596();

    public AbstractC7530(InterfaceC0072 interfaceC0072) {
        this.f24856 = interfaceC0072;
    }

    @Override // l.InterfaceC20955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20597(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        InterfaceC0072 interfaceC0072 = this.f24856;
        if (interfaceC0072 == null) {
            return mo20596();
        }
        int iMo1126 = interfaceC0072.mo1126(i, charSequence);
        if (iMo1126 == 0) {
            return true;
        }
        if (iMo1126 != 1) {
            return mo20596();
        }
        return false;
    }
}
