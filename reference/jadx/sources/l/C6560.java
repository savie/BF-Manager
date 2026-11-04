package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6560 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f22030;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f22031;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21697 f22032;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f22033 = new Object();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C21697 c21697;
        C10046 c10046;
        if (this.f22031) {
            throw new IllegalStateException("Cannot close during text transaction");
        }
        synchronized (this.f22033) {
            c21697 = this.f22032;
            this.f22032 = null;
        }
        if (c21697 != null && (c10046 = c21697.f69247) != null) {
            c10046.m25975();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18476(Consumer consumer, C14038 c14038) {
        C12525 c12525;
        if (this.f22031) {
            throw new IllegalStateException("Nested text transaction");
        }
        synchronized (this.f22033) {
            m18473();
            if (this.f22030 == C25227.FOREVER_NS) {
                throw new IllegalStateException("Text version exhausted");
            }
            c12525 = new C12525(this.f22032, c14038);
        }
        this.f22031 = true;
        try {
            consumer.accept(c12525);
            if (c12525.f40205) {
                synchronized (this.f22033) {
                    this.f22032 = c12525.f40210;
                    this.f22030++;
                }
            }
            c12525.f40203 = false;
            c12525.f40210 = null;
            this.f22031 = false;
        } catch (Throwable th) {
            c12525.f40203 = false;
            c12525.f40210 = null;
            this.f22031 = false;
            throw th;
        }
    }

    public C6560(CharSequence charSequence) {
        this.f22032 = new C21697(null, 2048, 16, null).m49255(0, charSequence.length(), charSequence, new Object());
    }

    public C6560(C21697 c21697, long j) {
        C10046 c10046 = c21697.f69247;
        if (c10046 != null) {
            c10046.m25972();
        }
        this.f22032 = c21697;
        this.f22030 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m18473() {
        if (this.f22032 == null) {
            throw new C13271("Text document is closed");
        }
    }

    public final int length() {
        int iM49259;
        synchronized (this.f22033) {
            m18473();
            iM49259 = this.f22032.m49259();
        }
        return iM49259;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m18475(int i) {
        C21697 c21697;
        synchronized (this.f22033) {
            m18473();
            c21697 = this.f22032;
            if (i < 0 || i >= c21697.m49259()) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            C10046 c10046 = c21697.f69247;
            if (c10046 != null) {
                c10046.m25972();
            }
        }
        return c21697;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m18478() {
        long j;
        synchronized (this.f22033) {
            m18473();
            j = this.f22030;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7305 m18474() {
        C7305 c7305;
        synchronized (this.f22033) {
            m18473();
            c7305 = new C7305(this.f22032, this.f22030);
        }
        return c7305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18477(C7305 c7305) {
        boolean z;
        synchronized (this.f22033) {
            C21697 c21697 = this.f22032;
            z = c21697 != null && c21697 == c7305.m23622();
        }
        return z;
    }
}
