package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܿܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17394 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f55356;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f55358;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11045 f55360;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f55361;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6043 f55357 = new C6043();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6043 f55359 = new C6043();

    public C17394(C11045 c11045, long j) {
        this.f55360 = c11045;
        this.f55356 = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws C13805 {
        EnumC9365 enumC9365;
        long jMo2293;
        while (true) {
            synchronized (this.f55360) {
                this.f55360.f37508.m39092();
                try {
                    C11045 c11045 = this.f55360;
                    enumC9365 = c11045.f37514;
                    if (enumC9365 == null) {
                        enumC9365 = null;
                    }
                    if (!this.f55358) {
                        c11045.f37512.isEmpty();
                        if (this.f55359.size() > 0) {
                            C6043 c6044 = this.f55359;
                            jMo2293 = c6044.mo2293(c6043, Math.min(8192L, c6044.size()));
                            C11045 c11046 = this.f55360;
                            long j2 = c11046.f37513 + jMo2293;
                            c11046.f37513 = j2;
                            if (enumC9365 != null || j2 < c11046.f37516.f65608.m12788() / 2) {
                                break;
                                break;
                            }
                            C11045 c11047 = this.f55360;
                            c11047.f37516.m45694(c11047.f37517, c11047.f37513);
                            this.f55360.f37513 = 0L;
                            break;
                        }
                        if (this.f55361 || enumC9365 != null) {
                            jMo2293 = -1;
                            break;
                        }
                        try {
                            this.f55360.wait();
                            this.f55360.f37508.m16599();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } catch (Throwable th) {
                    this.f55360.f37508.m16599();
                    throw th;
                }
            }
            if (jMo2293 != -1) {
                this.f55360.f37516.m45689(jMo2293);
                return jMo2293;
            }
            if (enumC9365 == null) {
                return -1L;
            }
            throw new C13805(enumC9365);
        }
        this.f55360.f37508.m16599();
        if (jMo2293 != -1) {
            this.f55360.f37516.m45689(jMo2293);
            return jMo2293;
        }
        if (enumC9365 == null) {
            return -1L;
        }
        throw new C13805(enumC9365);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40511(InterfaceC23683 interfaceC23683, long j) {
        boolean z;
        boolean z2;
        long size;
        while (j > 0) {
            synchronized (this.f55360) {
                z = this.f55361;
                z2 = this.f55359.size() + j > this.f55356;
            }
            if (z2) {
                interfaceC23683.skip(j);
                this.f55360.m27863(EnumC9365.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC23683.skip(j);
                return;
            }
            long jMo2293 = interfaceC23683.mo2293(this.f55357, j);
            if (jMo2293 == -1) {
                throw new EOFException();
            }
            j -= jMo2293;
            synchronized (this.f55360) {
                if (this.f55358) {
                    size = this.f55357.size();
                    this.f55357.m16407();
                } else {
                    boolean z3 = this.f55359.size() == 0;
                    this.f55359.m16411((InterfaceC10008) this.f55357);
                    if (z3) {
                        this.f55360.notifyAll();
                    }
                    size = 0;
                }
            }
            if (size > 0) {
                this.f55360.f37516.m45689(size);
            }
        }
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f55360.f37508;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        synchronized (this.f55360) {
            this.f55358 = true;
            size = this.f55359.size();
            this.f55359.m16407();
            this.f55360.f37512.isEmpty();
            this.f55360.notifyAll();
        }
        if (size > 0) {
            this.f55360.f37516.m45689(size);
        }
        this.f55360.m27854();
    }
}
