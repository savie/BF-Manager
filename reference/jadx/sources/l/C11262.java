package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۧ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11262 implements InterfaceC1830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24689 f35559;

    public C11262(C24689 c24689) {
        this.f35559 = c24689;
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ᩸ */
    public final void mo6334() {
        this.f35559.m55037();
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6323() {
        this.f35559.f79889 = true;
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6325(long j) {
        this.f35559.f79901.m51209(j);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6326(long j, int i, long j2) {
        this.f35559.f79901.m51210(j, i, j2);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6329(boolean z) {
        this.f35559.f79901.m51217(z);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6331() {
        InterfaceC24140 interfaceC24140M22696 = this.f35559.m22696();
        if (interfaceC24140M22696 != null) {
            interfaceC24140M22696.mo26953();
        }
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6332() {
        InterfaceC24140 interfaceC24140M22696 = this.f35559.m22696();
        if (interfaceC24140M22696 != null) {
            interfaceC24140M22696.mo26952();
        }
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6327(Exception exc) {
        C1896.m6516("Audio sink error", exc);
        this.f35559.f79901.m51218(exc);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۤ */
    public final void mo6330() {
        this.f35559.m56441();
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6328(C15253 c15253) {
        this.f35559.f79901.m51214(c15253);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6333(C15253 c15253) {
        this.f35559.f79901.m51219(c15253);
    }

    @Override // l.InterfaceC1830
    /* JADX INFO: renamed from: ۙ */
    public final void mo6324(int i) {
        int i2 = Build.VERSION.SDK_INT;
        C24689 c24689 = this.f35559;
        if (i2 >= 35 && c24689.f79892 != null) {
            c24689.f79892.m46794(i);
        }
        c24689.f79901.m51208(i);
    }
}
