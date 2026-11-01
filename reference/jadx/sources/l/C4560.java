package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H4E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4560 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f16193;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f16195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16194 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16197 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16196 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12709() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f16196 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12710() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f16194 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13734 m12708() {
        return new C13734(this);
    }
}
