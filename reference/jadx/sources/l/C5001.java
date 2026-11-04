package l;

import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۙܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5001 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f17365;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f17366;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC5747 f17367;

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
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        try {
            return m15227(interfaceC19502);
        } catch (C2970 unused) {
            return false;
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f17365 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        AbstractC5747 abstractC5747 = this.f17367;
        if (abstractC5747 != null) {
            abstractC5747.m16807(j, j2);
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        C20782.m47566(this.f17365);
        if (this.f17367 == null) {
            if (!m15227(interfaceC19502)) {
                throw C2970.m9688("Failed to determine bitstream type", (Throwable) null);
            }
            interfaceC19502.mo10076();
        }
        if (!this.f17366) {
            InterfaceC22024 interfaceC22024Mo16658 = this.f17365.mo16658(0, 1);
            this.f17365.mo16661();
            this.f17367.m16808(this.f17365, interfaceC22024Mo16658);
            this.f17366 = true;
        }
        return this.f17367.m16804(interfaceC19502, c18756);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m15227(InterfaceC19502 interfaceC19502) {
        boolean zM16598;
        C10966 c10966 = new C10966();
        if (c10966.m27798(interfaceC19502, true) && (c10966.f34644 & 2) == 2) {
            int iMin = Math.min(c10966.f34642, 8);
            C21287 c21287 = new C21287(iMin);
            interfaceC19502.mo10069(0, iMin, c21287.m48497());
            c21287.m48510(0);
            if (c21287.m48486() >= 5 && c21287.m48493() == 127 && c21287.m48485() == 1179402563) {
                this.f17367 = new C13993();
                return true;
            }
            c21287.m48510(0);
            try {
                zM16598 = C5616.m16598(1, c21287, true);
            } catch (C2970 unused) {
                zM16598 = false;
            }
            if (zM16598) {
                this.f17367 = new C11712();
            } else {
                c21287.m48510(0);
                if (C19917.m45845(c21287)) {
                    this.f17367 = new C19917();
                }
            }
            return true;
        }
        return false;
    }
}
