package l;

/* JADX INFO: renamed from: l.ۖ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89DN */
/* JADX INFO: loaded from: classes3.dex */
public final class C2225 extends C11771 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f8000;

    @Override // l.C11771
    /* JADX INFO: renamed from: ܰ */
    public final void mo2356(C19240 c19240) throws C17271 {
        c19240.m27389(2);
        this.f8000 = c19240.m27388() & 255;
        c19240.m27389(1);
        this.f7999 = c19240.m27378();
        c19240.m27378();
        c19240.m27389(4);
        c19240.m27376(this.f8000);
        c19240.m27389(this.f7999);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m6845() {
        return this.f7999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6847(int i, byte[] bArr, int i2, int i3) {
        m6844(i, i3, this.f7999);
        m6844(i2, i3, bArr.length);
        System.arraycopy(this.f34398.m27387(), this.f8000 + i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m6846(int i) {
        m6844(i, 1, this.f7999);
        return this.f34398.m27387()[this.f8000 + i];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m6848() {
        int i = this.f7999;
        byte[] bArr = new byte[i];
        m6847(0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6844(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i > i3 - i2) {
            StringBuilder sbM2791 = C0589.m2791("offset=", i, ", length=", ", size=", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
    }
}
