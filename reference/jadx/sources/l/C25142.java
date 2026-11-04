package l;

/* JADX INFO: renamed from: l.᩻ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RW */
/* JADX INFO: loaded from: classes.dex */
public final class C25142 extends AbstractC2021 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17682 f81281;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f81282;

    public C25142(C17682 c17682) {
        byte[] bArr = new byte[1];
        this.f81282 = bArr;
        if (c17682.m41355() == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (AbstractC0749.m3086(Math.max(c17682.m41357(), 4096) - 1) - 23);
        }
        this.f81281 = (C17682) c17682.clone();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m56048() {
        return this.f81282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13207 m56047(AbstractC13207 abstractC13207, C0573 c0573) {
        return this.f81281.m41350(abstractC13207, c0573);
    }
}
