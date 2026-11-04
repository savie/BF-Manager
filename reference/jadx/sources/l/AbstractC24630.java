package l;

/* JADX INFO: renamed from: l.᩺᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24630 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f79755;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f79757;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79754 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f79756 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14213(int i, int i2, int i3, int i4);

    public AbstractC24630(int i, int i2) {
        this.f79755 = i;
        this.f79757 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54964() {
        return this.f79754;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54962() {
        return this.f79756;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m54966() {
        return this.f79755;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m54963() {
        return this.f79757;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54961(int i, int i2, int i3) {
        m54965(i, i2, i + i3, i3 + i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54965(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        int i5 = this.f79754;
        if (i5 != i || this.f79756 != i2) {
            mo14213(i5, this.f79756, i, i2);
        }
        this.f79754 = i3;
        this.f79756 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54960() {
        int i = this.f79754;
        int i2 = this.f79757;
        int i3 = this.f79755;
        if (i3 == i && i2 == this.f79756) {
            return;
        }
        mo14213(i, this.f79756, i3, i2);
        this.f79754 = i3;
        this.f79756 = i2;
    }
}
