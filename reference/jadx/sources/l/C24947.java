package l;

/* JADX INFO: renamed from: l.᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3CI */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C24947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80765;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC11520 f80766;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f80767;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55703() {
        synchronized (this) {
            if (this.f80767) {
                return;
            }
            this.f80767 = true;
            this.f80765 = true;
            InterfaceC11520 interfaceC11520 = this.f80766;
            if (interfaceC11520 != null) {
                try {
                    interfaceC11520.mo22385();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f80765 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f80765 = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55704(InterfaceC11520 interfaceC11520) {
        synchronized (this) {
            while (this.f80765) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f80766 == interfaceC11520) {
                return;
            }
            this.f80766 = interfaceC11520;
            if (this.f80767) {
                interfaceC11520.mo22385();
            }
        }
    }
}
