package l;

/* JADX INFO: renamed from: l.ᩳܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G1U3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18205 implements InterfaceC23145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58150;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC23145[] f58151;

    public C18205(InterfaceC23145... interfaceC23145Arr) {
        this.f58151 = interfaceC23145Arr;
        this.f58150 = interfaceC23145Arr.length;
    }

    @Override // l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        for (int i = 0; i < this.f58150; i++) {
            this.f58151[i].mo4603(c12417);
        }
    }
}
