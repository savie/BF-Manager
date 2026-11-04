package l;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11603 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f36431;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f36432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC5638 f36436;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f36433 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f36434 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f36435 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f36430 = -1;

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
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return C17570.m41236(interfaceC19502);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f36431 = interfaceC12789;
        this.f36432 = interfaceC12789.mo16658(0, 1);
        interfaceC12789.mo16661();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f36433 = j == 0 ? 0 : 4;
        InterfaceC5638 interfaceC5638 = this.f36436;
        if (interfaceC5638 != null) {
            interfaceC5638.mo6573(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int iM19463;
        C20782.m47566(this.f36432);
        String str = C7116.f23455;
        int i = this.f36433;
        if (i == 0) {
            C20782.m47568(interfaceC19502.getPosition() == 0);
            int i2 = this.f36435;
            if (i2 != -1) {
                interfaceC19502.mo10073(i2);
                this.f36433 = 4;
                return 0;
            }
            if (!C17570.m41236(interfaceC19502)) {
                throw C2970.m9688("Unsupported or unrecognized wav file type.", (Throwable) null);
            }
            interfaceC19502.mo10073((int) (interfaceC19502.mo10072() - interfaceC19502.getPosition()));
            this.f36433 = 1;
            return 0;
        }
        long jM48498 = -1;
        if (i == 1) {
            C21287 c21287 = new C21287(8);
            C16824 c16824M39743 = C16824.m39743(interfaceC19502, c21287);
            if (c16824M39743.f54282 != 1685272116) {
                interfaceC19502.mo10076();
            } else {
                interfaceC19502.mo10068(8);
                c21287.m48510(0);
                interfaceC19502.mo10069(0, 8, c21287.m48497());
                jM48498 = c21287.m48498();
                interfaceC19502.mo10073(((int) c16824M39743.f54283) + 8);
            }
            this.f36434 = jM48498;
            this.f36433 = 2;
            return 0;
        }
        if (i == 2) {
            C25030 c25030M41238 = C17570.m41238(interfaceC19502);
            int i3 = c25030M41238.f80996;
            if (i3 == 17) {
                this.f36436 = new C13095(this.f36431, this.f36432, c25030M41238);
            } else if (i3 == 6) {
                this.f36436 = new C1909(this.f36431, this.f36432, c25030M41238, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f36436 = new C1909(this.f36431, this.f36432, c25030M41238, "audio/g711-mlaw", -1);
            } else {
                int i4 = c25030M41238.f80991;
                if (i3 == 1) {
                    iM19463 = C7116.m19463(i4, ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (i3 != 3) {
                        if (i3 == 65534) {
                            iM19463 = C7116.m19463(i4, ByteOrder.LITTLE_ENDIAN);
                        }
                    } else if (i4 == 32) {
                        iM19463 = 4;
                    }
                    iM19463 = 0;
                }
                if (iM19463 == 0) {
                    throw C2970.m9689("Unsupported WAV format type: " + i3);
                }
                this.f36436 = new C1909(this.f36431, this.f36432, c25030M41238, "audio/raw", iM19463);
            }
            this.f36433 = 3;
            return 0;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
            C20782.m47568(this.f36430 != -1);
            long position = this.f36430 - interfaceC19502.getPosition();
            InterfaceC5638 interfaceC5638 = this.f36436;
            interfaceC5638.getClass();
            return interfaceC5638.mo6574(interfaceC19502, position) ? -1 : 0;
        }
        Pair pairM41237 = C17570.m41237(interfaceC19502);
        this.f36435 = ((Long) pairM41237.first).intValue();
        long jLongValue = ((Long) pairM41237.second).longValue();
        long j = this.f36434;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f36430 = ((long) this.f36435) + jLongValue;
        long length = interfaceC19502.getLength();
        if (length != -1 && this.f36430 > length) {
            C1896.m6517("Data exceeds input length: " + this.f36430 + ", " + length);
            this.f36430 = length;
        }
        InterfaceC5638 interfaceC5639 = this.f36436;
        interfaceC5639.getClass();
        interfaceC5639.mo6572(this.f36435, this.f36430);
        this.f36433 = 4;
        return 0;
    }
}
