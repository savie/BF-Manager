package l;

/* JADX INFO: renamed from: l.ۚܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C5401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f18638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14964(long j) {
        if (j < 0) {
            throw C2516.m7773("Negative checkpoint allocation");
        }
        long jM6676 = C2124.m6676(this.f18638, j);
        if (jM6676 > 67108864) {
            throw C2516.m7773("Checkpoint metadata exceeds memory limit");
        }
        this.f18638 = jM6676;
    }
}
