package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 874F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12307 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f41137;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8114 f41138;

    public C12307(InterfaceC15785 interfaceC15785, C8114 c8114) {
        this.f41137 = interfaceC15785;
        this.f41138 = c8114;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        this.f41137.mo11161(interfaceC19706);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        long jMo9272 = this.f41137.mo9272(c12257);
        this.f41138.m21377(c12257);
        return jMo9272;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        return this.f41137.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f41137.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return this.f41137.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f41137.close();
    }
}
