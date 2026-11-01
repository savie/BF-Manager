package l;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20069 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f64223;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC20774 f64224;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f64227;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64229 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f64226 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64228 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f64225 = -1;

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
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return C12308.m30567(interfaceC7222);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f64227 = interfaceC15690;
        this.f64223 = interfaceC15690.mo7684(0, 1);
        interfaceC15690.mo7696();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f64229 = j == 0 ? 0 : 4;
        InterfaceC20774 interfaceC20774 = this.f64224;
        if (interfaceC20774 != null) {
            interfaceC20774.mo19637(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int iM41816;
        C2023.m6508(this.f64223);
        String str = C17983.f57504;
        int i = this.f64229;
        if (i == 0) {
            C2023.m6510(interfaceC7222.getPosition() == 0);
            int i2 = this.f64228;
            if (i2 != -1) {
                interfaceC7222.mo19214(i2);
                this.f64229 = 4;
                return 0;
            }
            if (!C12308.m30567(interfaceC7222)) {
                throw C22861.m50610("Unsupported or unrecognized wav file type.", (Throwable) null);
            }
            interfaceC7222.mo19214((int) (interfaceC7222.mo19213() - interfaceC7222.getPosition()));
            this.f64229 = 1;
            return 0;
        }
        long jM7512 = -1;
        if (i == 1) {
            C2460 c2460 = new C2460(8);
            C16541 c16541M38943 = C16541.m38943(interfaceC7222, c2460);
            if (c16541M38943.f53131 != 1685272116) {
                interfaceC7222.mo19217();
            } else {
                interfaceC7222.mo19209(8);
                c2460.m7510(0);
                interfaceC7222.mo19210(0, 8, c2460.m7518());
                jM7512 = c2460.m7512();
                interfaceC7222.mo19214(((int) c16541M38943.f53132) + 8);
            }
            this.f64226 = jM7512;
            this.f64229 = 2;
            return 0;
        }
        if (i == 2) {
            C0312 c0312M30569 = C12308.m30569(interfaceC7222);
            int i3 = c0312M30569.f1675;
            if (i3 == 17) {
                this.f64224 = new C7368(this.f64227, this.f64223, c0312M30569);
            } else if (i3 == 6) {
                this.f64224 = new C15836(this.f64227, this.f64223, c0312M30569, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f64224 = new C15836(this.f64227, this.f64223, c0312M30569, "audio/g711-mlaw", -1);
            } else {
                int i4 = c0312M30569.f1676;
                if (i3 == 1) {
                    iM41816 = C17983.m41816(i4, ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (i3 != 3) {
                        if (i3 == 65534) {
                            iM41816 = C17983.m41816(i4, ByteOrder.LITTLE_ENDIAN);
                        }
                    } else if (i4 == 32) {
                        iM41816 = 4;
                    }
                    iM41816 = 0;
                }
                if (iM41816 == 0) {
                    throw C22861.m50611("Unsupported WAV format type: " + i3);
                }
                this.f64224 = new C15836(this.f64227, this.f64223, c0312M30569, "audio/raw", iM41816);
            }
            this.f64229 = 3;
            return 0;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
            C2023.m6510(this.f64225 != -1);
            long position = this.f64225 - interfaceC7222.getPosition();
            InterfaceC20774 interfaceC20774 = this.f64224;
            interfaceC20774.getClass();
            return interfaceC20774.mo19638(interfaceC7222, position) ? -1 : 0;
        }
        Pair pairM30568 = C12308.m30568(interfaceC7222);
        this.f64228 = ((Long) pairM30568.first).intValue();
        long jLongValue = ((Long) pairM30568.second).longValue();
        long j = this.f64226;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f64225 = ((long) this.f64228) + jLongValue;
        long length = interfaceC7222.getLength();
        if (length != -1 && this.f64225 > length) {
            C0303.m1848("Data exceeds input length: " + this.f64225 + ", " + length);
            this.f64225 = length;
        }
        InterfaceC20774 interfaceC20775 = this.f64224;
        interfaceC20775.getClass();
        interfaceC20775.mo19636(this.f64228, this.f64225);
        this.f64229 = 4;
        return 0;
    }
}
