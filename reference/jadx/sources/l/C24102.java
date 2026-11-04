package l;

/* JADX INFO: renamed from: l.᩺ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4WL */
/* JADX INFO: loaded from: classes.dex */
public final class C24102 extends AbstractC23356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15896 f77916 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15896[] f77917;

    public C24102(InterfaceC15896[] interfaceC15896Arr) {
        this.f77917 = interfaceC15896Arr;
    }

    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        InterfaceC15896 interfaceC15896 = this.f77916;
        if (interfaceC15896 != null) {
            return interfaceC15896.mo1715(str);
        }
        for (InterfaceC15896 interfaceC15897 : this.f77917) {
            C17388 c17388Mo1715 = interfaceC15897.mo1715(str);
            if (c17388Mo1715 != null) {
                this.f77916 = interfaceC15897;
                return c17388Mo1715;
            }
        }
        return null;
    }
}
