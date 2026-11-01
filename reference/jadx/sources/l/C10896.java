package l;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۧۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10896 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14424 f37078;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5956 f37079;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC23596 f37080 = EnumC23596.WAITING;

    public C10896(C14424 c14424, C5956 c5956) {
        this.f37078 = c14424;
        this.f37079 = c5956;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27301() {
        synchronized (this.f37078) {
            if (this.f37080 == EnumC23596.WAITING) {
                while (this.f37079.f20261 != null) {
                    m27297();
                }
                m27298();
                this.f37079.f20258--;
                this.f37079.f20260++;
                this.f37080 = EnumC23596.READING;
            } else {
                throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f37080);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27302() {
        synchronized (this.f37078) {
            if (this.f37080 != EnumC23596.READING) {
                return;
            }
            this.f37079.f20260--;
            this.f37080 = EnumC23596.RELEASED;
            C14424.m34692(this.f37078, this.f37079);
            this.f37078.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m27303() {
        synchronized (this.f37078) {
            if (this.f37080 == EnumC23596.READING) {
                this.f37079.f20260--;
                if (this.f37079.f20261 == null) {
                    this.f37080 = EnumC23596.REFRESHING;
                    this.f37079.f20261 = this;
                    this.f37078.notifyAll();
                    while (this.f37079.f20260 > 0) {
                        m27297();
                    }
                    m27298();
                    return true;
                }
                this.f37080 = EnumC23596.WAITING;
                this.f37079.f20258++;
                this.f37078.notifyAll();
                while (this.f37079.f20261 != null) {
                    m27297();
                }
                m27298();
                this.f37079.f20258--;
                this.f37079.f20260++;
                this.f37080 = EnumC23596.READING;
                return false;
            }
            throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f37080);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27300() {
        synchronized (this.f37078) {
            if (this.f37080 != EnumC23596.REFRESHING) {
                return;
            }
            if (this.f37079.f20261 == this) {
                this.f37079.f20261 = null;
            }
            this.f37080 = EnumC23596.RELEASED;
            C14424.m34692(this.f37078, this.f37079);
            this.f37078.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m27299() throws InterruptedIOException {
        synchronized (this.f37078) {
            m27298();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw C14424.m34691("Interrupted while loading HLS playlist", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m27297() throws InterruptedIOException {
        try {
            this.f37078.wait();
            m27298();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m27296();
            throw C14424.m34691("Interrupted while waiting for HLS playlist cache", e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m27298() throws InterruptedIOException {
        if (this.f37078.f47297 || this.f37080 == EnumC23596.RELEASED) {
            throw C14424.m34691("HLS playlist cache lease was released", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m27296() {
        EnumC23596 enumC23596 = this.f37080;
        EnumC23596 enumC23597 = EnumC23596.WAITING;
        C5956 c5956 = this.f37079;
        if (enumC23596 == enumC23597) {
            c5956.f20258--;
        } else if (enumC23596 == EnumC23596.READING) {
            c5956.f20260--;
        } else if (enumC23596 == EnumC23596.REFRESHING && c5956.f20261 == this) {
            c5956.f20261 = null;
        }
        this.f37080 = EnumC23596.RELEASED;
        C14424 c14424 = this.f37078;
        C14424.m34692(c14424, c5956);
        c14424.notifyAll();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f37078) {
            if (this.f37080 != EnumC23596.RELEASED) {
                m27296();
            }
        }
    }
}
