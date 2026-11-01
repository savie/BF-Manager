package l;

/* JADX INFO: renamed from: l.֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5I3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0361 implements InterfaceC20823 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20118 f1805;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo2078();

    public AbstractC0361(InterfaceC20118 interfaceC20118) {
        this.f1805 = interfaceC20118;
    }

    @Override // l.InterfaceC20823
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2079(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        InterfaceC20118 interfaceC20118 = this.f1805;
        if (interfaceC20118 == null) {
            return mo2078();
        }
        int iMo37799 = interfaceC20118.mo37799(i, charSequence);
        if (iMo37799 == 0) {
            return true;
        }
        if (iMo37799 != 1) {
            return mo2078();
        }
        return false;
    }
}
