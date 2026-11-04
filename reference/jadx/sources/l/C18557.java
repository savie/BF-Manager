package l;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18557 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4387 f60290;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f60291;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f60293;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f60294;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f60295;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f60296;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60297;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1150 f60298 = new C1150(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21287 f60288 = new C21287(4096);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseArray f60292 = new SparseArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14827 f60289 = new C14827();

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C9169 c9169 = (C9169) interfaceC19502;
        c9169.mo10078(false, 0, 14, bArr);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c9169.mo10077(bArr[13] & 7, false);
            c9169.mo10078(false, 0, 3, bArr);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f60293 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        C1150 c1150 = this.f60298;
        int i = 0;
        boolean z = c1150.m4246() == -9223372036854775807L;
        if (!z) {
            long jM4243 = c1150.m4243();
            z = (jM4243 == -9223372036854775807L || jM4243 == 0 || jM4243 == j2) ? false : true;
        }
        if (z) {
            c1150.m4250(j2);
        }
        C4387 c4387 = this.f60290;
        if (c4387 != null) {
            c4387.m1676(j2);
        }
        while (true) {
            SparseArray sparseArray = this.f60292;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C21541) sparseArray.valueAt(i)).m48984();
            i++;
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        InterfaceC6867 c5133;
        C20782.m47566(this.f60293);
        long length = interfaceC19502.getLength();
        C14827 c14827 = this.f60289;
        if (length != -1 && !c14827.m35749()) {
            return c14827.m35747(interfaceC19502, c18756);
        }
        if (!this.f60295) {
            this.f60295 = true;
            if (c14827.m35748() != -9223372036854775807L) {
                C4387 c4387 = new C4387(c14827.m35750(), c14827.m35748(), length);
                this.f60290 = c4387;
                this.f60293.mo16659(c4387.m1675());
            } else {
                this.f60293.mo16659(new C0857(c14827.m35748()));
            }
        }
        C4387 c4388 = this.f60290;
        if (c4388 != null && c4388.m1677()) {
            return this.f60290.m1674(interfaceC19502, c18756);
        }
        interfaceC19502.mo10076();
        long jMo10072 = length != -1 ? length - interfaceC19502.mo10072() : -1L;
        if (jMo10072 != -1 && jMo10072 < 4) {
            return -1;
        }
        C21287 c21287 = this.f60288;
        if (!interfaceC19502.mo10078(true, 0, 4, c21287.m48497())) {
            return -1;
        }
        c21287.m48510(0);
        int iM48500 = c21287.m48500();
        if (iM48500 == 441) {
            return -1;
        }
        if (iM48500 == 442) {
            interfaceC19502.mo10069(0, 10, c21287.m48497());
            c21287.m48510(9);
            interfaceC19502.mo10073((c21287.m48493() & 7) + 14);
            return 0;
        }
        if (iM48500 == 443) {
            interfaceC19502.mo10069(0, 2, c21287.m48497());
            c21287.m48510(0);
            interfaceC19502.mo10073(c21287.m48494() + 6);
            return 0;
        }
        if (((iM48500 & (-256)) >> 8) != 1) {
            interfaceC19502.mo10073(1);
            return 0;
        }
        int i = iM48500 & 255;
        SparseArray sparseArray = this.f60292;
        C21541 c21541 = (C21541) sparseArray.get(i);
        if (!this.f60296) {
            if (c21541 == null) {
                if (i == 189) {
                    c5133 = new C0155("video/mp2p");
                    this.f60291 = true;
                    this.f60294 = interfaceC19502.getPosition();
                } else if ((iM48500 & BERTags.FLAGS) == 192) {
                    c5133 = new C17065(null, 0, "video/mp2p");
                    this.f60291 = true;
                    this.f60294 = interfaceC19502.getPosition();
                } else if ((iM48500 & 240) == 224) {
                    c5133 = new C5133(null, "video/mp2p");
                    this.f60297 = true;
                    this.f60294 = interfaceC19502.getPosition();
                } else {
                    c5133 = null;
                }
                if (c5133 != null) {
                    c5133.mo1351(this.f60293, new C10857(i, 256));
                    c21541 = new C21541(c5133, this.f60298);
                    sparseArray.put(i, c21541);
                }
            }
            if (interfaceC19502.getPosition() > ((this.f60291 && this.f60297) ? this.f60294 + 8192 : 1048576L)) {
                this.f60296 = true;
                this.f60293.mo16661();
            }
        }
        interfaceC19502.mo10069(0, 2, c21287.m48497());
        c21287.m48510(0);
        int iM48494 = c21287.m48494() + 6;
        if (c21541 == null) {
            interfaceC19502.mo10073(iM48494);
            return 0;
        }
        c21287.m48496(iM48494);
        interfaceC19502.readFully(c21287.m48497(), 0, iM48494);
        c21287.m48510(6);
        c21541.m48985(c21287);
        c21287.m48517(c21287.m48513());
        return 0;
    }
}
