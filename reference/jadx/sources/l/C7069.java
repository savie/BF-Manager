package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N74D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7069 implements InterfaceC0294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4769 f23289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13780 f23290;

    public C7069(C13780 c13780, C4769 c4769) {
        this.f23290 = c13780;
        this.f23289 = c4769;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1865(Uri uri, C15617 c15617, InterfaceC18193 interfaceC18193) {
        this.f23289.mo1865(uri, c15617, new C4658(this, interfaceC18193));
    }

    @Override // l.InterfaceC0294
    public final void stop() {
        C13780 c13780 = this.f23290;
        try {
            this.f23289.stop();
        } finally {
            c13780.f43728.m36193();
        }
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1872(InterfaceC4023 interfaceC4023) {
        this.f23289.mo1872(interfaceC4023);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1866(InterfaceC4023 interfaceC4023) {
        this.f23289.mo1866(interfaceC4023);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final C15955 mo1870() {
        return this.f23289.mo1870();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final C24907 mo1863(Uri uri, boolean z) {
        C24907 c24907Mo1863 = this.f23289.mo1863(uri, z);
        C13780 c13780 = this.f23290;
        C24734 c24734 = c13780.f43729;
        if (c24734 != null) {
            c24734.m55223(c24907Mo1863);
        }
        c13780.f43728.m36194(uri, c24907Mo1863);
        return c24907Mo1863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19404(C7069 c7069, InterfaceC18193 interfaceC18193, C24907 c24907) {
        C13780 c13780 = c7069.f23290;
        C24734 c24734 = c13780.f43729;
        if (c24734 != null) {
            c24734.m55223(c24907);
        }
        C4769 c4769 = c7069.f23289;
        C15955 c15955Mo1870 = c4769.mo1870();
        if (c15955Mo1870 != null) {
            for (C17447 c17447 : c15955Mo1870.f51801) {
                C24907 c24907Mo1863 = c4769.mo1863(c17447.f56744, false);
                C24734 c24735 = c13780.f43729;
                if (c24735 != null) {
                    c24735.m55223(c24907Mo1863);
                }
                c13780.f43728.m36194(c17447.f56744, c24907Mo1863);
            }
        }
        interfaceC18193.mo14515(c24907);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final long mo1862() {
        return this.f23289.mo1862();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1874(Uri uri) {
        return this.f23289.mo1874(uri);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1873() throws IOException {
        this.f23289.mo1873();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1871(Uri uri) throws IOException {
        this.f23289.mo1871(uri);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1867(Uri uri, long j) {
        return this.f23289.mo1867(uri, j);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۤ */
    public final void mo1868(Uri uri) {
        this.f23289.mo1868(uri);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo1869() {
        return this.f23289.mo1869();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1864(Uri uri) {
        this.f23289.mo1864(uri);
    }
}
