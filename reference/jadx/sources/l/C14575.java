package l;

/* JADX INFO: renamed from: l.ܳܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14575 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2516 f47687;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3284 f47688;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f47689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15218 f47690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f47691;

    public C14575(C2516 c2516, long j, C3284 c3284, C15218 c15218) {
        this.f47687 = c2516;
        this.f47689 = j;
        this.f47688 = c3284;
        this.f47690 = c15218;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15218 m35044() {
        if (this.f47691) {
            throw new IllegalStateException("SaveHandle is not active");
        }
        return this.f47690;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f47687.m7796(this);
    }
}
