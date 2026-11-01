package l;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: renamed from: l.֨ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1099 extends AbstractC6537 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f4994;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17390 f4996;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C7648 f4997;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f4998;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13689 f4999;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5000;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f5001;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16967 f5003;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19706 f5004;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f5005;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f4995 = true;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f5002 = -9223372036854775807L;

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13689 mo4106() {
        return this.f4999;
    }

    @Override // l.AbstractC6537, l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo4109(C13689 c13689) {
        this.f4999 = c13689;
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4111() {
    }

    public C1099(C13689 c13689, InterfaceC20723 interfaceC20723, C9058 c9058, InterfaceC16967 interfaceC16967, InterfaceC14113 interfaceC14113, int i, C7648 c7648) {
        this.f4999 = c13689;
        this.f5005 = interfaceC20723;
        this.f4996 = c9058;
        this.f5003 = interfaceC16967;
        this.f4994 = interfaceC14113;
        this.f5000 = i;
        this.f4997 = c7648;
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4110(InterfaceC19706 interfaceC19706) {
        this.f5004 = interfaceC19706;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C9724 c9724M17753 = m17753();
        InterfaceC16967 interfaceC16967 = this.f5003;
        interfaceC16967.mo39759(looperMyLooper, c9724M17753);
        interfaceC16967.mo39761();
        m4103();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        InterfaceC15785 interfaceC15785Mo4000 = this.f5005.mo4000();
        InterfaceC19706 interfaceC19706 = this.f5004;
        if (interfaceC19706 != null) {
            interfaceC15785Mo4000.mo11161(interfaceC19706);
        }
        C14704 c14704 = mo4106().f45157;
        c14704.getClass();
        Uri uri = c14704.f48029;
        m17753();
        return new C2510(uri, interfaceC15785Mo4000, new C15005((InterfaceC0166) ((C9058) this.f4996).f30907), this.f5003, m17755(c15274), this.f4994, m17767(c15274), this, interfaceC15732, this.f5000, this.f4997, C17983.m41827(c14704.f48034), null);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        ((C2510) interfaceC6806).m7697();
    }

    @Override // l.AbstractC6537
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo4104() {
        this.f5003.mo39758();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4107(long j, InterfaceC6599 interfaceC6599, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f5002;
        }
        boolean zMo5382 = interfaceC6599.mo5382();
        if (!this.f4995 && this.f5002 == j && this.f4998 == zMo5382 && this.f5001 == z) {
            return;
        }
        this.f5002 = j;
        this.f4998 = zMo5382;
        this.f5001 = z;
        this.f4995 = false;
        m4103();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m4103() {
        long j = this.f5002;
        boolean z = this.f4998;
        boolean z2 = this.f5001;
        C13689 c13689Mo4106 = mo4106();
        C7450 c7450 = new C7450(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c13689Mo4106, z2 ? c13689Mo4106.f45158 : null);
        m17759(this.f4995 ? new C5333(c7450) : c7450);
    }
}
