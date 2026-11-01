package l;

/* JADX INFO: renamed from: l.۬ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes3.dex */
public final class C13101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43626 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745[] f43627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m32351() {
        int i = this.f43626;
        if (i <= 0) {
            throw new IllegalStateException("HexRange root lease is closed");
        }
        if (i == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f43626 = i + 1;
    }

    public C13101(InterfaceC18745[] interfaceC18745Arr) {
        this.f43627 = interfaceC18745Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32350() {
        InterfaceC18745[] interfaceC18745Arr;
        synchronized (this) {
            int i = this.f43626;
            if (i <= 0) {
                throw new IllegalStateException("HexRange root lease closed twice");
            }
            int i2 = i - 1;
            this.f43626 = i2;
            interfaceC18745Arr = i2 == 0 ? this.f43627 : null;
        }
        if (interfaceC18745Arr != null) {
            C15218.m36423(interfaceC18745Arr);
        }
    }
}
