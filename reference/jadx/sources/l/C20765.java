package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20765 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f66515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f66517;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66513 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66516 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66514 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47471() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f66514 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47472() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f66513 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12560 m47470() {
        return new C12560(this);
    }
}
