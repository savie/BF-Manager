package l;

/* JADX INFO: renamed from: l.֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3CI */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0921 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f3688;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC22089 f3689;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3651() {
        synchronized (this) {
            if (this.f3690) {
                return;
            }
            this.f3690 = true;
            this.f3688 = true;
            InterfaceC22089 interfaceC22089 = this.f3689;
            if (interfaceC22089 != null) {
                try {
                    interfaceC22089.mo18972();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3688 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f3688 = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3652(InterfaceC22089 interfaceC22089) {
        synchronized (this) {
            while (this.f3688) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f3689 == interfaceC22089) {
                return;
            }
            this.f3689 = interfaceC22089;
            if (this.f3690) {
                interfaceC22089.mo18972();
            }
        }
    }
}
