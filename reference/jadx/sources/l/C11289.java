package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11289 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5324 f35596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f35597;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12781 f35598;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC15874 f35599;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f35600 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1595 f35601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f35602;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f35603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22478 f35604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35605;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1595 f35606;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C11682 m28538() {
        this.f35601.m36749();
        while (this.f35603.isEmpty() && this.f35599 == null) {
            try {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                this.f35601.m5608();
                throw th;
            }
        }
        this.f35601.m5608();
        if (this.f35603.isEmpty()) {
            throw new C20240(this.f35599);
        }
        return (C11682) this.f35603.removeFirst();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28540(EnumC15874 enumC15874) {
        if (this.f35599 == null) {
            this.f35599 = enumC15874;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m28542() {
        if (this.f35599 != null) {
            return false;
        }
        C5324 c5324 = this.f35596;
        if (c5324.f18721 || c5324.f18718) {
            C12781 c12781 = this.f35598;
            if ((c12781.f40888 || c12781.f40886) && this.f35605) {
                return false;
            }
        }
        return true;
    }

    public C11289(int i, C22478 c22478, boolean z, boolean z2, C11682 c11682) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f35603 = arrayDeque;
        this.f35601 = new C1595(this);
        this.f35606 = new C1595(this);
        this.f35599 = null;
        if (c22478 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f35602 = i;
        this.f35604 = c22478;
        this.f35597 = c22478.f72745.m10060();
        C5324 c5324 = new C5324(this, c22478.f72728.m10060());
        this.f35596 = c5324;
        C12781 c12781 = new C12781(this);
        this.f35598 = c12781;
        c5324.f18721 = z2;
        c12781.f40888 = z;
        if (c11682 != null) {
            arrayDeque.add(c11682);
        }
        if (m28543() && c11682 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m28543() && c11682 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m28543() {
        return this.f35604.f72741 == ((this.f35602 & 1) == 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 m28546() {
        return this.f35596;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 m28539() {
        synchronized (this) {
            if (!this.f35605 && !m28543()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f35598;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28536(EnumC15874 enumC15874) {
        if (m28533(enumC15874)) {
            this.f35604.f72736.m55186(this.f35602, enumC15874);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28545(EnumC15874 enumC15874) {
        if (m28533(enumC15874)) {
            this.f35604.m50705(this.f35602, enumC15874);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m28533(EnumC15874 enumC15874) {
        synchronized (this) {
            if (this.f35599 != null) {
                return false;
            }
            if (this.f35596.f18721 && this.f35598.f40888) {
                return false;
            }
            this.f35599 = enumC15874;
            notifyAll();
            this.f35604.m50703(this.f35602);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28535(ArrayList arrayList) {
        boolean zM28542;
        synchronized (this) {
            this.f35605 = true;
            this.f35603.add(C19822.m45600(arrayList));
            zM28542 = m28542();
            notifyAll();
        }
        if (zM28542) {
            return;
        }
        this.f35604.m50703(this.f35602);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28537(InterfaceC25000 interfaceC25000, int i) {
        this.f35596.m15976(interfaceC25000, i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m28541() {
        boolean zM28542;
        synchronized (this) {
            this.f35596.f18721 = true;
            zM28542 = m28542();
            notifyAll();
        }
        if (zM28542) {
            return;
        }
        this.f35604.m50703(this.f35602);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28534() {
        boolean z;
        boolean zM28542;
        synchronized (this) {
            C5324 c5324 = this.f35596;
            if (c5324.f18721 || !c5324.f18718) {
                z = false;
            } else {
                C12781 c12781 = this.f35598;
                if (c12781.f40888 || c12781.f40886) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM28542 = m28542();
        }
        if (z) {
            m28536(EnumC15874.CANCEL);
        } else {
            if (zM28542) {
                return;
            }
            this.f35604.m50703(this.f35602);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28544() throws IOException {
        C12781 c12781 = this.f35598;
        if (c12781.f40886) {
            throw new IOException("stream closed");
        }
        if (c12781.f40888) {
            throw new IOException("stream finished");
        }
        if (this.f35599 != null) {
            throw new C20240(this.f35599);
        }
    }
}
