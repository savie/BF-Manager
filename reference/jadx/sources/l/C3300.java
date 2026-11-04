package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 874F */
/* JADX INFO: loaded from: classes3.dex */
public final class C3300 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f10784;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15036 f10785;

    public C3300(InterfaceC13433 interfaceC13433, C15036 c15036) {
        this.f10784 = interfaceC13433;
        this.f10785 = c15036;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        this.f10784.mo10894(interfaceC4639);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        long jMo8326 = this.f10784.mo8326(c25368);
        this.f10785.m36196(c25368);
        return jMo8326;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        return this.f10784.read(bArr, i, i2);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f10784.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map mo10893() {
        return this.f10784.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f10784.close();
    }
}
