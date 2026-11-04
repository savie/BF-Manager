package l;

/* JADX INFO: renamed from: l.۫ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13248 implements InterfaceC11010 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42329;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f42330;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f42331;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f42332;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f42333;

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ᩷ */
    public final int mo27872() {
        return -1;
    }

    public C13248(C19621 c19621) {
        C21287 c21287 = c19621.f63236;
        this.f42332 = c21287;
        c21287.m48510(12);
        this.f42330 = c21287.m48512() & 255;
        this.f42333 = c21287.m48512();
    }

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ۤ */
    public final int mo27871() {
        return this.f42333;
    }

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ۙ */
    public final int mo27870() {
        C21287 c21287 = this.f42332;
        int i = this.f42330;
        if (i == 8) {
            return c21287.m48493();
        }
        if (i == 16) {
            return c21287.m48494();
        }
        int i2 = this.f42331;
        this.f42331 = i2 + 1;
        if (i2 % 2 == 0) {
            int iM48493 = c21287.m48493();
            this.f42329 = iM48493;
            return (iM48493 & 240) >> 4;
        }
        return this.f42329 & 15;
    }
}
