package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21799 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14744 f70595;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f70596;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f70597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f70598 = new Object();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C14744 c14744;
        C16072 c16072;
        if (this.f70596) {
            throw new IllegalStateException("Cannot close during text transaction");
        }
        synchronized (this.f70598) {
            c14744 = this.f70595;
            this.f70595 = null;
        }
        if (c14744 != null && (c16072 = c14744.f48220) != null) {
            c16072.m38088();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48560(Consumer consumer, C6049 c6049) {
        C15450 c15450;
        if (this.f70596) {
            throw new IllegalStateException("Nested text transaction");
        }
        synchronized (this.f70598) {
            m48557();
            if (this.f70597 == C17492.FOREVER_NS) {
                throw new IllegalStateException("Text version exhausted");
            }
            c15450 = new C15450(this.f70595, c6049);
        }
        this.f70596 = true;
        try {
            consumer.accept(c15450);
            if (c15450.f50348) {
                synchronized (this.f70598) {
                    this.f70595 = c15450.f50345;
                    this.f70597++;
                }
            }
            c15450.f50346 = false;
            c15450.f50345 = null;
            this.f70596 = false;
        } catch (Throwable th) {
            c15450.f50346 = false;
            c15450.f50345 = null;
            this.f70596 = false;
            throw th;
        }
    }

    public C21799(CharSequence charSequence) {
        this.f70595 = new C14744(null, 2048, 16, null).m35335(0, charSequence.length(), charSequence, new Object());
    }

    public C21799(C14744 c14744, long j) {
        C16072 c16072 = c14744.f48220;
        if (c16072 != null) {
            c16072.m38089();
        }
        this.f70595 = c14744;
        this.f70597 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m48557() {
        if (this.f70595 == null) {
            throw new C4865("Text document is closed");
        }
    }

    public final int length() {
        int iM35339;
        synchronized (this.f70598) {
            m48557();
            iM35339 = this.f70595.m35339();
        }
        return iM35339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m48559(int i) {
        C14744 c14744;
        synchronized (this.f70598) {
            m48557();
            c14744 = this.f70595;
            if (i < 0 || i >= c14744.m35339()) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            C16072 c16072 = c14744.f48220;
            if (c16072 != null) {
                c16072.m38089();
            }
        }
        return c14744;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m48562() {
        long j;
        synchronized (this.f70598) {
            m48557();
            j = this.f70597;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6276 m48558() {
        C6276 c6276;
        synchronized (this.f70598) {
            m48557();
            c6276 = new C6276(this.f70595, this.f70597);
        }
        return c6276;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48561(C6276 c6276) {
        boolean z;
        synchronized (this.f70598) {
            C14744 c14744 = this.f70595;
            z = c14744 != null && c14744 == c6276.m40840();
        }
        return z;
    }
}
