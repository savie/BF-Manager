package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۟ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8088 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f26748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f26749;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f26750 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f26751;

    public C8088(C19143 c19143) {
        this.f26748 = c19143;
    }

    public final C14799 poll() {
        C14799 c14799;
        synchronized (this.f26748) {
            if (this.f26751) {
                throw new IllegalStateException("Change cursor is closed");
            }
            c14799 = (C14799) this.f26750.pollFirst();
            if (c14799 != null) {
                this.f26749 -= c14799.m35638();
            }
        }
        return c14799;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f26748) {
            this.f26751 = true;
            this.f26750.clear();
            this.f26749 = 0L;
            this.f26748.f61941.remove(this);
        }
    }
}
