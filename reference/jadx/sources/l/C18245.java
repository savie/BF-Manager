package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ܿۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57ZT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18245 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18991 f59560;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4559 f59561;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f59562 = new byte[4096];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f59563;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15723 f59564;

    @Override // l.InterfaceC0477
    public final void end() {
        C9294 c9294;
        this.f59563 = null;
        C4559 c4559 = this.f59561;
        if (c4559 != null) {
            C13769 c13769 = c4559.f72684;
            if (c13769 != null && (c9294 = c13769.f43697) != null) {
                c9294.m24505();
                c9294.f30221 = null;
                c9294.f30210 = null;
            }
            this.f59561 = null;
        }
        C18991 c18991 = this.f59560;
        if (c18991 != null) {
            C7804 c7804 = c18991.f72686;
            if (c7804 != null) {
                int i = c7804.f25961;
                if (i == 42 || i == 113 || i == 666) {
                    c7804.f25974 = null;
                    c7804.f25977 = null;
                    c7804.f25994 = null;
                    c7804.f25957 = null;
                    c7804.f25980 = null;
                }
                c18991.f72686 = null;
                c18991.f72681 = null;
                c18991.f72676 = null;
                c18991.f72682 = null;
            }
            this.f59560 = null;
        }
        this.f59564 = null;
    }

    @Override // l.InterfaceC0477
    /* JADX INFO: renamed from: ۙ */
    public final void mo2308(int i, int i2, C15723 c15723) {
        this.f59564 = c15723;
        if (i == 1) {
            try {
                this.f59560 = new C18991(i2);
            } catch (C10040 e) {
                throw new UncheckedIOException(e);
            }
        } else if (i == 0) {
            C4559 c4559 = new C4559();
            C13769 c13769 = new C13769(c4559);
            c4559.f72684 = c13769;
            c13769.m33659();
            this.f59561 = c4559;
            this.f59563 = new byte[4096];
        }
        C15723 c15724 = this.f59564;
        (c15724 == null ? C19978.m45893() : c15724.m37628()).getClass();
    }

    @Override // l.InterfaceC0477
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2310(byte[] bArr, int[] iArr) {
        C18991 c18991 = this.f59560;
        c18991.f72681 = bArr;
        int i = 5;
        c18991.f72678 = 5;
        c18991.f72685 = iArr[0] - 5;
        do {
            C18991 c18992 = this.f59560;
            byte[] bArr2 = this.f59562;
            c18992.f72676 = bArr2;
            c18992.f72680 = 0;
            c18992.f72679 = 4096;
            C7804 c7804 = c18992.f72686;
            if ((c7804 == null ? -2 : c7804.m21274()) != 0) {
                C15723 c15723 = this.f59564;
                (c15723 == null ? C19978.m45893() : c15723.m37628()).getClass();
            } else {
                int i2 = 4096 - this.f59560.f72679;
                int i3 = i + i2;
                int i4 = i3 + 52;
                if (bArr.length < i4) {
                    byte[] bArr3 = new byte[i4 * 2];
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                    bArr = bArr3;
                }
                System.arraycopy(bArr2, 0, bArr, i, i2);
                i = i3;
            }
        } while (this.f59560.f72679 == 0);
        iArr[0] = i;
        return bArr;
    }

    @Override // l.InterfaceC0477
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2309(byte[] bArr, int[] iArr) {
        C4559 c4559 = this.f59561;
        c4559.f72681 = bArr;
        c4559.f72678 = 5;
        c4559.f72685 = iArr[0];
        int i = 0;
        while (true) {
            C4559 c45510 = this.f59561;
            byte[] bArr2 = this.f59562;
            c45510.f72676 = bArr2;
            c45510.f72680 = 0;
            c45510.f72679 = 4096;
            C13769 c13769 = c45510.f72684;
            int iM33658 = c13769 == null ? -2 : c13769.m33658();
            if (iM33658 == -5) {
                if (i > bArr.length - 5) {
                    byte[] bArr3 = new byte[i + 5];
                    System.arraycopy(bArr, 0, bArr3, 0, 5);
                    System.arraycopy(this.f59563, 0, bArr3, 5, i);
                    bArr = bArr3;
                } else {
                    System.arraycopy(this.f59563, 0, bArr, 5, i);
                }
                iArr[0] = i;
                return bArr;
            }
            if (iM33658 != 0) {
                C15723 c15723 = this.f59564;
                (c15723 == null ? C19978.m45893() : c15723.m37628()).getClass();
                return null;
            }
            byte[] bArr4 = this.f59563;
            int length = bArr4.length;
            int i2 = (i + 4096) - this.f59561.f72679;
            if (length < i2) {
                int length2 = bArr4.length * 2;
                if (length2 >= i2) {
                    i2 = length2;
                }
                byte[] bArr5 = new byte[i2];
                System.arraycopy(bArr4, 0, bArr5, 0, i);
                this.f59563 = bArr5;
            }
            System.arraycopy(bArr2, 0, this.f59563, i, 4096 - this.f59561.f72679);
            i += 4096 - this.f59561.f72679;
            iArr[0] = i;
        }
    }
}
