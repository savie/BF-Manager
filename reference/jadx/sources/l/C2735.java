package l;

/* JADX INFO: renamed from: l.ۖܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2735 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9095 = 1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808[] f9096;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m9084() {
        int i = this.f9095;
        if (i <= 0) {
            throw new IllegalStateException("HexRange root lease is closed");
        }
        if (i == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f9095 = i + 1;
    }

    public C2735(InterfaceC22808[] interfaceC22808Arr) {
        this.f9096 = interfaceC22808Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9083() {
        InterfaceC22808[] interfaceC22808Arr;
        synchronized (this) {
            int i = this.f9095;
            if (i <= 0) {
                throw new IllegalStateException("HexRange root lease closed twice");
            }
            int i2 = i - 1;
            this.f9095 = i2;
            interfaceC22808Arr = i2 == 0 ? this.f9096 : null;
        }
        if (interfaceC22808Arr != null) {
            C4908.m15061(interfaceC22808Arr);
        }
    }
}
