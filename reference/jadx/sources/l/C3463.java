package l;

/* JADX INFO: renamed from: l.ۗ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public class C3463 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3589 f12739;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo10184(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo10185(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
    }

    public C3463(C3589 c3589) {
        this.f12739 = c3589;
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo10187(InterfaceC1423 interfaceC1423) {
        if (!this.f12739.f13223 || C3589.f13211 == null) {
            return;
        }
        C3589.f13211.m31733();
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo10182(InterfaceC1423 interfaceC1423) {
        float[] fArr = C2758.f10570;
        boolean z = false;
        boolean z2 = ApplicationC0716.f2992.getBoolean("mbp", false);
        C3589 c3589 = this.f12739;
        if (z2 || C3589.f13211 == null) {
            c3589.f13223 = false;
            return;
        }
        if (C3589.f13211.f42574 && (C3589.f13211.f42565.isPlaying() || C3589.f13211.f42565.mo20302() || C3589.f13211.m31718())) {
            z = true;
        }
        c3589.f13223 = z;
        C3589.f13211.m31734();
    }
}
