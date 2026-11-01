package l;

/* JADX INFO: renamed from: l.᩻᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes.dex */
public final class C24026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f77842;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f77843;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f77844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15041[] f77845;

    public C24026(InterfaceC22386 interfaceC22386, int i) {
        this.f77843 = interfaceC22386;
        this.f77842 = new Object[i];
        this.f77845 = new InterfaceC15041[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52868(InterfaceC15041 interfaceC15041, Object obj) {
        int i = this.f77844;
        this.f77842[i] = obj;
        this.f77844 = i + 1;
        this.f77845[i] = interfaceC15041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52869(InterfaceC22386 interfaceC22386) {
        InterfaceC15041[] interfaceC15041Arr = this.f77845;
        int length = interfaceC15041Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC15041 interfaceC15041 = interfaceC15041Arr[length];
            C13465.m32962(interfaceC15041);
            interfaceC15041.m36030(this.f77842[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
