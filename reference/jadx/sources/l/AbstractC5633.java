package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۚۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9CR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5633 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23533 f19479;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C25398 f19480;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6117 f19481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC25186 f19482;

    public AbstractC5633() {
        throw null;
    }

    public AbstractC5633(C25398 c25398, C23533 c23533, C6117 c6117) {
        this.f19482 = C16980.m40037(getClass());
        new ArrayList();
        new ReentrantReadWriteLock();
        this.f19480 = c25398;
        this.f19481 = c6117;
        this.f19479 = c23533;
        C16980.m40037(getClass());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16614(InterfaceC10084 interfaceC10084) throws Throwable {
        C23533 c23533 = this.f19479;
        c23533.getClass();
        C7453 c7453 = new C7453();
        InterfaceC6819 interfaceC6819M48447 = C21273.m48447(interfaceC10084);
        interfaceC6819M48447.mo11074(interfaceC10084, c7453);
        c23533.m4264(this.f19480, EnumC0543.SMB2_0_INFO_FILE, interfaceC6819M48447.mo6458(), c7453.m56028());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19479.mo4263(this.f19480);
    }

    public final int hashCode() {
        C6117 c6117 = this.f19481;
        int iHashCode = ((c6117 == null ? 0 : c6117.hashCode()) + 31) * 31;
        C23533 c23533 = this.f19479;
        return iHashCode + (c23533 != null ? c23533.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5633 abstractC5633 = (AbstractC5633) obj;
        C23533 c23533 = abstractC5633.f19479;
        C6117 c6117 = abstractC5633.f19481;
        C6117 c6118 = this.f19481;
        if (c6118 == null) {
            if (c6117 != null) {
                return false;
            }
        } else if (!c6118.equals(c6117)) {
            return false;
        }
        C23533 c23534 = this.f19479;
        if (c23534 == null) {
            return c23533 == null;
        }
        return c23534.equals(c23533);
    }
}
