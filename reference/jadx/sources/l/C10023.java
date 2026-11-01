package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۤۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes3.dex */
public final class C10023 implements InterfaceC15690 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Uri f34229;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15690 f34230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4377 f34231;

    public C10023(InterfaceC15690 interfaceC15690, InterfaceC4377 interfaceC4377, Uri uri) {
        this.f34230 = interfaceC15690;
        this.f34231 = interfaceC4377;
        this.f34229 = uri;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8011 mo7684(int i, int i2) {
        return this.f34230.mo7684(i, i2);
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7696() {
        this.f34230.mo7696();
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final void mo7690(InterfaceC6599 interfaceC6599) {
        Uri uri;
        C3693 c3693M17691;
        boolean z = interfaceC6599 instanceof C3776;
        InterfaceC15690 interfaceC15690 = this.f34230;
        if (!z || (uri = this.f34229) == null) {
            interfaceC15690.mo7690(interfaceC6599);
            return;
        }
        C3693 c3693 = null;
        try {
            InterfaceC3153 interfaceC3153M28923 = ((C11601) this.f34231).m28923(uri);
            if (interfaceC3153M28923 == null) {
                c3693M17691 = null;
            } else {
                try {
                    int i = C19195.f61979;
                    try {
                        c3693M17691 = new C6494(interfaceC3153M28923).m17691();
                    } catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException | C7906 unused) {
                        c3693M17691 = null;
                    }
                } catch (Throwable th) {
                    try {
                        interfaceC3153M28923.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC3153M28923 != null) {
                interfaceC3153M28923.close();
            }
            c3693 = c3693M17691;
        } catch (Exception unused2) {
        }
        if (c3693 != null) {
            interfaceC6599 = c3693;
        }
        interfaceC15690.mo7690(interfaceC6599);
    }
}
