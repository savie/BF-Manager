package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N74D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12533 implements InterfaceC5263 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18441 f41959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17471 f41960;

    public C12533(C17471 c17471, C18441 c18441) {
        this.f41960 = c17471;
        this.f41959 = c18441;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14538(Uri uri, C7512 c7512, InterfaceC2440 interfaceC2440) {
        this.f41959.mo14538(uri, c7512, new C9731(this, interfaceC2440));
    }

    @Override // l.InterfaceC5263
    public final void stop() {
        C17471 c17471 = this.f41960;
        try {
            this.f41959.stop();
        } finally {
            c17471.f55591.m21375();
        }
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final void mo14545(InterfaceC4557 interfaceC4557) {
        this.f41959.mo14545(interfaceC4557);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14539(InterfaceC4557 interfaceC4557) {
        this.f41959.mo14539(interfaceC4557);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final C5741 mo14543() {
        return this.f41959.mo14543();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final C16325 mo14536(Uri uri, boolean z) {
        C16325 c16325Mo14536 = this.f41959.mo14536(uri, z);
        C17471 c17471 = this.f41960;
        C20814 c20814 = c17471.f55592;
        if (c20814 != null) {
            c20814.m46810(c16325Mo14536);
        }
        c17471.f55591.m21376(uri, c16325Mo14536);
        return c16325Mo14536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31148(C12533 c12533, InterfaceC2440 interfaceC2440, C16325 c16325) {
        C17471 c17471 = c12533.f41960;
        C20814 c20814 = c17471.f55592;
        if (c20814 != null) {
            c20814.m46810(c16325);
        }
        C18441 c18441 = c12533.f41959;
        C5741 c5741Mo14543 = c18441.mo14543();
        if (c5741Mo14543 != null) {
            for (C17030 c17030 : c5741Mo14543.f19532) {
                C16325 c16325Mo14536 = c18441.mo14536(c17030.f54408, false);
                C20814 c20815 = c17471.f55592;
                if (c20815 != null) {
                    c20815.m46810(c16325Mo14536);
                }
                c17471.f55591.m21376(c17030.f54408, c16325Mo14536);
            }
        }
        interfaceC2440.mo7423(c16325);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final long mo14535() {
        return this.f41959.mo14535();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo14534(Uri uri) {
        return this.f41959.mo14534(uri);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۖ */
    public final void mo14533() throws IOException {
        this.f41959.mo14533();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final void mo14544(Uri uri) throws IOException {
        this.f41959.mo14544(uri);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14540(Uri uri, long j) {
        return this.f41959.mo14540(uri, j);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۨ */
    public final void mo14541(Uri uri) {
        this.f41959.mo14541(uri);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo14542() {
        return this.f41959.mo14542();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14537(Uri uri) {
        this.f41959.mo14537(uri);
    }
}
