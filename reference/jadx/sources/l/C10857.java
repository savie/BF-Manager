package l;

/* JADX INFO: renamed from: l.ۤۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f34397;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f34398;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f34399;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34400;

    public C10857(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C10857(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f34397 = str;
        this.f34396 = i2;
        this.f34398 = i3;
        this.f34400 = Integer.MIN_VALUE;
        this.f34399 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27594() {
        int i = this.f34400;
        this.f34400 = i == Integer.MIN_VALUE ? this.f34396 : i + this.f34398;
        this.f34399 = this.f34397 + this.f34400;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27595() {
        int i = this.f34400;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m27596() {
        if (this.f34400 != Integer.MIN_VALUE) {
            return this.f34399;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
