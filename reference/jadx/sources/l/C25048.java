package l;

/* JADX INFO: renamed from: l.᩻۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25048 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f81021;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC5656[] f81022;

    public C25048(InterfaceC5656... interfaceC5656Arr) {
        this.f81022 = interfaceC5656Arr;
        this.f81021 = interfaceC5656Arr.length;
    }

    @Override // l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        for (int i = 0; i < this.f81021; i++) {
            this.f81022[i].mo9647(c21383);
        }
    }
}
