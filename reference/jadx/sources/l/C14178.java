package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.۬᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 474M */
/* JADX INFO: loaded from: classes5.dex */
public final class C14178 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f44830;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44831;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC20146 f44832;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f44833;

    public C14178(InterfaceC13433 interfaceC13433, InterfaceC20146 interfaceC20146) {
        this.f44833 = interfaceC13433;
        interfaceC20146.getClass();
        this.f44832 = interfaceC20146;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        long jMo8326 = this.f44833.mo8326(c25368);
        this.f44830 = jMo8326;
        if (jMo8326 == 0) {
            return 0L;
        }
        if (c25368.f81910 == -1 && jMo8326 != -1) {
            c25368 = c25368.m56735(0L, jMo8326);
        }
        this.f44831 = true;
        this.f44832.mo5947(c25368);
        return this.f44830;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f44830 == 0) {
            return -1;
        }
        int i3 = this.f44833.read(bArr, i, i2);
        if (i3 > 0) {
            this.f44832.write(bArr, i, i3);
            long j = this.f44830;
            if (j != -1) {
                this.f44830 = j - ((long) i3);
            }
        }
        return i3;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f44833.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        return this.f44833.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        InterfaceC20146 interfaceC20146 = this.f44832;
        try {
            this.f44833.close();
        } finally {
            if (this.f44831) {
                this.f44831 = false;
                interfaceC20146.close();
            }
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f44833.mo10894(interfaceC4639);
    }
}
