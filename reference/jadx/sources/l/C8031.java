package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W1T8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8031 implements InterfaceC15444, InterfaceC19920 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f26651;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f26652;

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6947() {
        return false;
    }

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6948() {
        return true;
    }

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6949() {
        return false;
    }

    public C8031(long j, byte[] bArr) throws C4258 {
        this.f26651 = j;
        if (bArr.length == 0) {
            this.f26652 = 0;
            return;
        }
        if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f26652 = i;
            return;
        }
        throw new C4258("Unsupported BCJ filter properties");
    }

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo21905() {
        int i = C12461.f40031;
        return 5;
    }

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo21906(InputStream inputStream, C0573 c0573) {
        InterfaceC12836 c19549;
        int i = this.f26652;
        long j = this.f26651;
        if (j == 4) {
            c19549 = new C5379(i);
        } else if (j == 5) {
            c19549 = new C22533(i);
        } else if (j == 6) {
            c19549 = new C10598(i);
        } else if (j == 7) {
            c19549 = new C4633(i);
        } else if (j == 8) {
            c19549 = new C21787(i);
        } else if (j == 9) {
            c19549 = new C15073(i);
        } else if (j == 10) {
            c19549 = new C14172(i);
        } else {
            c19549 = j == 11 ? new C19549(i) : null;
        }
        return new C12461(inputStream, c19549);
    }
}
