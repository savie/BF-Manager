package l;

/* JADX INFO: renamed from: l.᩺ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes.dex */
public final class C24482 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f79453;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21170 f79454;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C14784 f79455;

    public C24482(C14784 c14784, int i, C21170 c21170) {
        this.f79455 = c14784;
        this.f79453 = i;
        this.f79454 = c21170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21170 m54750(InterfaceC18186 interfaceC18186) {
        C14784 c14784 = this.f79455;
        if (c14784 == null) {
            throw new IllegalStateException("Text batch is no longer active");
        }
        return C14784.m35614(c14784, this, interfaceC18186);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14784 c14784 = this.f79455;
        if (c14784 != null) {
            c14784.m35628();
        }
    }
}
