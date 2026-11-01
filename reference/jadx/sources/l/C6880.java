package l;

import android.media.MediaFormat;

/* JADX INFO: renamed from: l.ۜܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880 implements InterfaceC19841, InterfaceC3962, InterfaceC23691 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f23176;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC3962 f23177;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f23178;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3962 f23179;

    @Override // l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public final void mo13941(int i, Object obj) {
        if (i == 7) {
            this.f23178 = (InterfaceC19841) obj;
            return;
        }
        if (i == 8) {
            this.f23177 = (InterfaceC3962) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C0435 c0435 = (C0435) obj;
        if (c0435 == null) {
            this.f23176 = null;
            this.f23179 = null;
        } else {
            this.f23176 = c0435.m2261();
            this.f23179 = c0435.m2258();
        }
    }

    @Override // l.InterfaceC19841
    /* JADX INFO: renamed from: ۙ */
    public final void mo2526(long j, long j2, C7648 c7648, MediaFormat mediaFormat) {
        InterfaceC19841 interfaceC19841 = this.f23176;
        if (interfaceC19841 != null) {
            interfaceC19841.mo2526(j, j2, c7648, mediaFormat);
        }
        InterfaceC19841 interfaceC19842 = this.f23178;
        if (interfaceC19842 != null) {
            interfaceC19842.mo2526(j, j2, c7648, mediaFormat);
        }
    }

    @Override // l.InterfaceC3962
    /* JADX INFO: renamed from: ۙ */
    public final void mo11447(long j, float[] fArr) {
        InterfaceC3962 interfaceC3962 = this.f23179;
        if (interfaceC3962 != null) {
            interfaceC3962.mo11447(j, fArr);
        }
        InterfaceC3962 interfaceC3963 = this.f23177;
        if (interfaceC3963 != null) {
            interfaceC3963.mo11447(j, fArr);
        }
    }

    @Override // l.InterfaceC3962
    /* JADX INFO: renamed from: ۨ */
    public final void mo11448() {
        InterfaceC3962 interfaceC3962 = this.f23179;
        if (interfaceC3962 != null) {
            interfaceC3962.mo11448();
        }
        InterfaceC3962 interfaceC3963 = this.f23177;
        if (interfaceC3963 != null) {
            interfaceC3963.mo11448();
        }
    }
}
