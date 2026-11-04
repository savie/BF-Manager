package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18054 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0155 f59114 = new C0155("audio/ac3");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f59116 = new C21287(2786);

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
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        C9169 c9169;
        C21287 c21287 = new C21287(10);
        int i = 0;
        while (true) {
            c9169 = (C9169) interfaceC19502;
            c9169.mo10078(false, 0, 10, c21287.m48497());
            c21287.m48510(0);
            if (c21287.m48501() != 4801587) {
                break;
            }
            c21287.m48503(3);
            int iM48499 = c21287.m48499();
            i += iM48499 + 10;
            c9169.mo10077(iM48499, false);
        }
        c9169.mo10076();
        c9169.mo10077(i, false);
        int i2 = i;
        loop1: while (true) {
            int i3 = 0;
            while (true) {
                c9169.mo10078(false, 0, 6, c21287.m48497());
                c21287.m48510(0);
                if (c21287.m48494() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iM37859 = C15882.m37859(c21287.m48497());
                if (iM37859 == -1) {
                    break loop1;
                }
                c9169.mo10077(iM37859 - 6, false);
            }
            c9169.mo10076();
            i2++;
            if (i2 - i >= 8192) {
                break;
            }
            c9169.mo10077(i2, false);
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f59114.mo1351(interfaceC12789, new C10857(0, 1));
        interfaceC12789.mo16661();
        interfaceC12789.mo16659(new C0857(-9223372036854775807L));
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f59115 = false;
        this.f59114.mo1349();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        C21287 c21287 = this.f59116;
        int i = interfaceC19502.read(c21287.m48497(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        c21287.m48510(0);
        c21287.m48517(i);
        boolean z = this.f59115;
        C0155 c0155 = this.f59114;
        if (!z) {
            c0155.mo1350(4, 0L);
            this.f59115 = true;
        }
        c0155.mo1352(c21287);
        return 0;
    }
}
