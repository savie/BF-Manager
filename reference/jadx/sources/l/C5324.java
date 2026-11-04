package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۚ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5324 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f18718;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f18719;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11289 f18720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f18721;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C1879 f18717 = new C1879();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1879 f18716 = new C1879();

    public C5324(C11289 c11289, long j) {
        this.f18720 = c11289;
        this.f18719 = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws C20240 {
        EnumC15874 enumC15874;
        long jMo4186;
        while (true) {
            synchronized (this.f18720) {
                this.f18720.f35601.m36749();
                try {
                    C11289 c11289 = this.f18720;
                    enumC15874 = c11289.f35599;
                    if (enumC15874 == null) {
                        enumC15874 = null;
                    }
                    if (!this.f18718) {
                        c11289.f35603.isEmpty();
                        if (this.f18716.size() > 0) {
                            C1879 c18710 = this.f18716;
                            jMo4186 = c18710.mo4186(c1879, Math.min(8192L, c18710.size()));
                            C11289 c112810 = this.f18720;
                            long j2 = c112810.f35600 + jMo4186;
                            c112810.f35600 = j2;
                            if (enumC15874 != null || j2 < c112810.f35604.f72728.m10060() / 2) {
                                break;
                                break;
                            }
                            C11289 c112811 = this.f18720;
                            c112811.f35604.m50694(c112811.f35602, c112811.f35600);
                            this.f18720.f35600 = 0L;
                            break;
                        }
                        if (this.f18721 || enumC15874 != null) {
                            jMo4186 = -1;
                            break;
                        }
                        try {
                            this.f18720.wait();
                            this.f18720.f35601.m5608();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } catch (Throwable th) {
                    this.f18720.f35601.m5608();
                    throw th;
                }
            }
            if (jMo4186 != -1) {
                this.f18720.f35604.m50707(jMo4186);
                return jMo4186;
            }
            if (enumC15874 == null) {
                return -1L;
            }
            throw new C20240(enumC15874);
        }
        this.f18720.f35601.m5608();
        if (jMo4186 != -1) {
            this.f18720.f35604.m50707(jMo4186);
            return jMo4186;
        }
        if (enumC15874 == null) {
            return -1L;
        }
        throw new C20240(enumC15874);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15976(InterfaceC25000 interfaceC25000, long j) {
        boolean z;
        boolean z2;
        long size;
        while (j > 0) {
            synchronized (this.f18720) {
                z = this.f18721;
                z2 = this.f18716.size() + j > this.f18719;
            }
            if (z2) {
                interfaceC25000.skip(j);
                this.f18720.m28545(EnumC15874.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC25000.skip(j);
                return;
            }
            long jMo4186 = interfaceC25000.mo4186(this.f18717, j);
            if (jMo4186 == -1) {
                throw new EOFException();
            }
            j -= jMo4186;
            synchronized (this.f18720) {
                if (this.f18718) {
                    size = this.f18717.size();
                    this.f18717.m6436();
                } else {
                    boolean z3 = this.f18716.size() == 0;
                    this.f18716.m6440((InterfaceC13810) this.f18717);
                    if (z3) {
                        this.f18720.notifyAll();
                    }
                    size = 0;
                }
            }
            if (size > 0) {
                this.f18720.f35604.m50707(size);
            }
        }
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f18720.f35601;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        synchronized (this.f18720) {
            this.f18718 = true;
            size = this.f18716.size();
            this.f18716.m6436();
            this.f18720.f35603.isEmpty();
            this.f18720.notifyAll();
        }
        if (size > 0) {
            this.f18720.f35604.m50707(size);
        }
        this.f18720.m28534();
    }
}
