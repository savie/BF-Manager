package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 474M */
/* JADX INFO: loaded from: classes4.dex */
public final class C8417 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f29178;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f29179;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f29180;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7317 f29181;

    public C8417(InterfaceC15785 interfaceC15785, InterfaceC7317 interfaceC7317) {
        this.f29178 = interfaceC15785;
        interfaceC7317.getClass();
        this.f29181 = interfaceC7317;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        long jMo9272 = this.f29178.mo9272(c12257);
        this.f29179 = jMo9272;
        if (jMo9272 == 0) {
            return 0L;
        }
        if (c12257.f41017 == -1 && jMo9272 != -1) {
            c12257 = c12257.m30476(0L, jMo9272);
        }
        this.f29180 = true;
        this.f29181.mo19523(c12257);
        return this.f29179;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f29179 == 0) {
            return -1;
        }
        int i3 = this.f29178.read(bArr, i, i2);
        if (i3 > 0) {
            this.f29181.write(bArr, i, i3);
            long j = this.f29179;
            if (j != -1) {
                this.f29179 = j - ((long) i3);
            }
        }
        return i3;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f29178.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return this.f29178.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        InterfaceC7317 interfaceC7317 = this.f29181;
        try {
            this.f29178.close();
        } finally {
            if (this.f29180) {
                this.f29180 = false;
                interfaceC7317.close();
            }
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f29178.mo11161(interfaceC19706);
    }
}
