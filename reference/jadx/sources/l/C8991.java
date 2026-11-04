package l;

/* JADX INFO: renamed from: l.۠᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8991 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29297;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23988() {
        return this.f29297 < 1024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23989() {
        if (!m23988()) {
            return false;
        }
        this.f29297++;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23987(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f29297)) {
            throw new IllegalArgumentException("Invalid proof budget release");
        }
        this.f29297 = i2 - i;
    }
}
