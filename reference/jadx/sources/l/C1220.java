package l;

/* JADX INFO: renamed from: l.֨ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D906 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8263[] f4459;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4460 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4461 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4462 = 0;

    public C1220(InterfaceC8263... interfaceC8263Arr) {
        this.f4459 = interfaceC8263Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8263[] m4436() {
        return this.f4459;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4437() {
        return this.f4460;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4439() {
        return this.f4461;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4441() {
        return this.f4462;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1220 m4440(int i) {
        this.f4460 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1220 m4435(int i) {
        this.f4461 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1220 m4438(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f4462 = i;
        return this;
    }
}
