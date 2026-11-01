package l;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۨۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11602 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f38990;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f38991;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38994;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f38996;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3443 f38997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38998;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f38999;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6694 f39000 = new C6694(0);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2460 f38992 = new C2460(4096);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final SparseArray f38995 = new SparseArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4545 f38993 = new C4545();

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C14984 c14984 = (C14984) interfaceC7222;
        c14984.mo19219(false, 0, 14, bArr);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c14984.mo19218(bArr[13] & 7, false);
            c14984.mo19219(false, 0, 3, bArr);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f38990 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        C6694 c6694 = this.f39000;
        int i = 0;
        boolean z = c6694.m18074() == -9223372036854775807L;
        if (!z) {
            long jM18071 = c6694.m18071();
            z = (jM18071 == -9223372036854775807L || jM18071 == 0 || jM18071 == j2) ? false : true;
        }
        if (z) {
            c6694.m18069(j2);
        }
        C3443 c3443 = this.f38997;
        if (c3443 != null) {
            c3443.m3485(j2);
        }
        while (true) {
            SparseArray sparseArray = this.f38995;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C13719) sparseArray.valueAt(i)).m33424();
            i++;
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        InterfaceC15440 c18261;
        C2023.m6508(this.f38990);
        long length = interfaceC7222.getLength();
        C4545 c4545 = this.f38993;
        if (length != -1 && !c4545.m12689()) {
            return c4545.m12687(interfaceC7222, c0954);
        }
        if (!this.f38994) {
            this.f38994 = true;
            if (c4545.m12688() != -9223372036854775807L) {
                C3443 c3443 = new C3443(c4545.m12690(), c4545.m12688(), length);
                this.f38997 = c3443;
                this.f38990.mo7690(c3443.m3484());
            } else {
                this.f38990.mo7690(new C3776(c4545.m12688()));
            }
        }
        C3443 c3444 = this.f38997;
        if (c3444 != null && c3444.m3486()) {
            return this.f38997.m3483(interfaceC7222, c0954);
        }
        interfaceC7222.mo19217();
        long jMo19213 = length != -1 ? length - interfaceC7222.mo19213() : -1L;
        if (jMo19213 != -1 && jMo19213 < 4) {
            return -1;
        }
        C2460 c2460 = this.f38992;
        if (!interfaceC7222.mo19219(true, 0, 4, c2460.m7518())) {
            return -1;
        }
        c2460.m7510(0);
        int iM7499 = c2460.m7499();
        if (iM7499 == 441) {
            return -1;
        }
        if (iM7499 == 442) {
            interfaceC7222.mo19210(0, 10, c2460.m7518());
            c2460.m7510(9);
            interfaceC7222.mo19214((c2460.m7516() & 7) + 14);
            return 0;
        }
        if (iM7499 == 443) {
            interfaceC7222.mo19210(0, 2, c2460.m7518());
            c2460.m7510(0);
            interfaceC7222.mo19214(c2460.m7519() + 6);
            return 0;
        }
        if (((iM7499 & (-256)) >> 8) != 1) {
            interfaceC7222.mo19214(1);
            return 0;
        }
        int i = iM7499 & 255;
        SparseArray sparseArray = this.f38995;
        C13719 c13719 = (C13719) sparseArray.get(i);
        if (!this.f38998) {
            if (c13719 == null) {
                if (i == 189) {
                    c18261 = new C2738("video/mp2p");
                    this.f38996 = true;
                    this.f38999 = interfaceC7222.getPosition();
                } else if ((iM7499 & BERTags.FLAGS) == 192) {
                    c18261 = new C16850(null, 0, "video/mp2p");
                    this.f38996 = true;
                    this.f38999 = interfaceC7222.getPosition();
                } else if ((iM7499 & 240) == 224) {
                    c18261 = new C18261(null, "video/mp2p");
                    this.f38991 = true;
                    this.f38999 = interfaceC7222.getPosition();
                } else {
                    c18261 = null;
                }
                if (c18261 != null) {
                    c18261.mo2890(this.f38990, new C8074(i, 256));
                    c13719 = new C13719(c18261, this.f39000);
                    sparseArray.put(i, c13719);
                }
            }
            if (interfaceC7222.getPosition() > ((this.f38996 && this.f38991) ? this.f38999 + 8192 : 1048576L)) {
                this.f38998 = true;
                this.f38990.mo7696();
            }
        }
        interfaceC7222.mo19210(0, 2, c2460.m7518());
        c2460.m7510(0);
        int iM7519 = c2460.m7519() + 6;
        if (c13719 == null) {
            interfaceC7222.mo19214(iM7519);
            return 0;
        }
        c2460.m7517(iM7519);
        interfaceC7222.readFully(c2460.m7518(), 0, iM7519);
        c2460.m7510(6);
        c13719.m33425(c2460);
        c2460.m7501(c2460.m7521());
        return 0;
    }
}
