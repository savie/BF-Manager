package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6105 f37508;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f37509;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17394 f37510;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f37511;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f37512;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f37513 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC9365 f37514;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12456 f37515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20217 f37516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f37517;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6105 f37518;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m27860(EnumC9365 enumC9365) {
        if (this.f37514 == null) {
            this.f37514 = enumC9365;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized C10912 m27861() {
        this.f37508.m39092();
        while (this.f37512.isEmpty() && this.f37514 == null) {
            try {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                this.f37508.m16599();
                throw th;
            }
        }
        this.f37508.m16599();
        if (this.f37512.isEmpty()) {
            throw new C13805(this.f37514);
        }
        return (C10912) this.f37512.removeFirst();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m27864() {
        if (this.f37514 != null) {
            return false;
        }
        C17394 c17394 = this.f37510;
        if (c17394.f55361 || c17394.f55358) {
            C12456 c12456 = this.f37515;
            if ((c12456.f41532 || c12456.f41530) && this.f37509) {
                return false;
            }
        }
        return true;
    }

    public C11045(int i, C20217 c20217, boolean z, boolean z2, C10912 c10912) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f37512 = arrayDeque;
        this.f37508 = new C6105(this);
        this.f37518 = new C6105(this);
        this.f37514 = null;
        if (c20217 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f37517 = i;
        this.f37516 = c20217;
        this.f37511 = c20217.f65617.m12788();
        C17394 c17394 = new C17394(this, c20217.f65608.m12788());
        this.f37510 = c17394;
        C12456 c12456 = new C12456(this);
        this.f37515 = c12456;
        c17394.f55361 = z2;
        c12456.f41532 = z;
        if (c10912 != null) {
            arrayDeque.add(c10912);
        }
        if (m27858() && c10912 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m27858() && c10912 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m27858() {
        return this.f37516.f65602 == ((this.f37517 & 1) == 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 m27853() {
        return this.f37510;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8597 m27859() {
        synchronized (this) {
            if (!this.f37509 && !m27858()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f37515;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27856(EnumC9365 enumC9365) {
        if (m27850(enumC9365)) {
            this.f37516.f65611.m52277(this.f37517, enumC9365);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27863(EnumC9365 enumC9365) {
        if (m27850(enumC9365)) {
            this.f37516.m45704(this.f37517, enumC9365);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m27850(EnumC9365 enumC9365) {
        synchronized (this) {
            if (this.f37514 != null) {
                return false;
            }
            if (this.f37510.f55361 && this.f37515.f41532) {
                return false;
            }
            this.f37514 = enumC9365;
            notifyAll();
            this.f37516.m45703(this.f37517);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27855(ArrayList arrayList) {
        boolean zM27864;
        synchronized (this) {
            this.f37509 = true;
            this.f37512.add(C0140.m1230(arrayList));
            zM27864 = m27864();
            notifyAll();
        }
        if (zM27864) {
            return;
        }
        this.f37516.m45703(this.f37517);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27857(InterfaceC23683 interfaceC23683, int i) {
        this.f37510.m40511(interfaceC23683, i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m27852() {
        boolean zM27864;
        synchronized (this) {
            this.f37510.f55361 = true;
            zM27864 = m27864();
            notifyAll();
        }
        if (zM27864) {
            return;
        }
        this.f37516.m45703(this.f37517);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27854() {
        boolean z;
        boolean zM27864;
        synchronized (this) {
            C17394 c17394 = this.f37510;
            if (c17394.f55361 || !c17394.f55358) {
                z = false;
            } else {
                C12456 c12456 = this.f37515;
                if (c12456.f41532 || c12456.f41530) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM27864 = m27864();
        }
        if (z) {
            m27856(EnumC9365.CANCEL);
        } else {
            if (zM27864) {
                return;
            }
            this.f37516.m45703(this.f37517);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27862() throws IOException {
        C12456 c12456 = this.f37515;
        if (c12456.f41530) {
            throw new IOException("stream closed");
        }
        if (c12456.f41532) {
            throw new IOException("stream finished");
        }
        if (this.f37514 != null) {
            throw new C13805(this.f37514);
        }
    }
}
