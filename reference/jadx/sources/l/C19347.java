package l;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: renamed from: l.ᩳ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19347 extends AbstractC9395 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f62509;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24929 f62510;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C15648 f62511;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14902 f62512;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f62513;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f62514;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f62515;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC17855 f62516;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4639 f62517;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f62518;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62520 = true;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f62519 = -9223372036854775807L;

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final synchronized C14902 mo30717() {
        return this.f62512;
    }

    @Override // l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo24727(C14902 c14902) {
        this.f62512 = c14902;
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16154() {
    }

    public C19347(C14902 c14902, InterfaceC15670 interfaceC15670, C22847 c22847, InterfaceC24929 interfaceC24929, InterfaceC4365 interfaceC4365, int i, C15648 c15648) {
        this.f62512 = c14902;
        this.f62514 = interfaceC15670;
        this.f62516 = c22847;
        this.f62510 = interfaceC24929;
        this.f62513 = interfaceC4365;
        this.f62509 = i;
        this.f62511 = c15648;
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ۙ */
    public final void mo16151(InterfaceC4639 interfaceC4639) {
        this.f62517 = interfaceC4639;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C20738 c20738M24732 = m24732();
        InterfaceC24929 interfaceC24929 = this.f62510;
        interfaceC24929.mo6288(looperMyLooper, c20738M24732);
        interfaceC24929.mo6290();
        m44772();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9147 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        InterfaceC13433 interfaceC13433Mo3996 = this.f62514.mo3996();
        InterfaceC4639 interfaceC4639 = this.f62517;
        if (interfaceC4639 != null) {
            interfaceC13433Mo3996.mo10894(interfaceC4639);
        }
        C20870 c20870 = mo30717().f48681;
        c20870.getClass();
        Uri uri = c20870.f66802;
        m24732();
        return new C18601(uri, interfaceC13433Mo3996, new C8650((InterfaceC1603) ((C22847) this.f62516).f74224), this.f62510, m24720(c8402), this.f62513, m24734(c8402), this, interfaceC13314, this.f62509, this.f62511, C7116.m19474(c20870.f66805), null);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        ((C18601) interfaceC9147).m43213();
    }

    @Override // l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
        this.f62510.mo6287();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44773(long j, InterfaceC9060 interfaceC9060, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f62519;
        }
        boolean zMo2298 = interfaceC9060.mo2298();
        if (!this.f62520 && this.f62519 == j && this.f62518 == zMo2298 && this.f62515 == z) {
            return;
        }
        this.f62519 = j;
        this.f62518 = zMo2298;
        this.f62515 = z;
        this.f62520 = false;
        m44772();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m44772() {
        long j = this.f62519;
        boolean z = this.f62518;
        boolean z2 = this.f62515;
        C14902 c14902Mo30717 = mo30717();
        C15288 c15288 = new C15288(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c14902Mo30717, z2 ? c14902Mo30717.f48684 : null);
        m24728(this.f62520 ? new C0702(c15288) : c15288);
    }
}
