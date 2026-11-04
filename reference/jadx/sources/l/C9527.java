package l;

import android.media.MediaFormat;

/* JADX INFO: renamed from: l.ۡܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9527 implements InterfaceC19830, InterfaceC19084, InterfaceC3256 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f30858;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19084 f30859;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f30860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19084 f30861;

    @Override // l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        if (i == 7) {
            this.f30858 = (InterfaceC19830) obj;
            return;
        }
        if (i == 8) {
            this.f30859 = (InterfaceC19084) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C5442 c5442 = (C5442) obj;
        if (c5442 == null) {
            this.f30860 = null;
            this.f30861 = null;
        } else {
            this.f30860 = c5442.m16271();
            this.f30861 = c5442.m16268();
        }
    }

    @Override // l.InterfaceC19830
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24942(long j, long j2, C15648 c15648, MediaFormat mediaFormat) {
        InterfaceC19830 interfaceC19830 = this.f30860;
        if (interfaceC19830 != null) {
            interfaceC19830.mo24942(j, j2, c15648, mediaFormat);
        }
        InterfaceC19830 interfaceC19831 = this.f30858;
        if (interfaceC19831 != null) {
            interfaceC19831.mo24942(j, j2, c15648, mediaFormat);
        }
    }

    @Override // l.InterfaceC19084
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24943(long j, float[] fArr) {
        InterfaceC19084 interfaceC19084 = this.f30861;
        if (interfaceC19084 != null) {
            interfaceC19084.mo24943(j, fArr);
        }
        InterfaceC19084 interfaceC19085 = this.f30859;
        if (interfaceC19085 != null) {
            interfaceC19085.mo24943(j, fArr);
        }
    }

    @Override // l.InterfaceC19084
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo24944() {
        InterfaceC19084 interfaceC19084 = this.f30861;
        if (interfaceC19084 != null) {
            interfaceC19084.mo24944();
        }
        InterfaceC19084 interfaceC19085 = this.f30859;
        if (interfaceC19085 != null) {
            interfaceC19085.mo24944();
        }
    }
}
