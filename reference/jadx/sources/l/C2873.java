package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C7MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2873 implements InterfaceC0636 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7467 f9454;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile Object f9457;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25368 f9458;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9584 f9459;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f9456 = 4;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f9455 = C14368.m34811();

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2803() {
    }

    public C2873(InterfaceC13433 interfaceC13433, C25368 c25368, InterfaceC9584 interfaceC9584) {
        this.f9454 = new C7467(interfaceC13433);
        this.f9458 = c25368;
        this.f9459 = interfaceC9584;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m9474() {
        return this.f9457;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m9472() {
        return this.f9454.m20513();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri m9473() {
        return this.f9454.m20512();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map m9475() {
        return this.f9454.m20511();
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ۙ */
    public final void mo2802() {
        this.f9454.m20510();
        C2247 c2247 = new C2247(this.f9454, this.f9458);
        try {
            c2247.m7664();
            Uri uriMo8327 = this.f9454.mo8327();
            uriMo8327.getClass();
            this.f9457 = this.f9459.mo21443(uriMo8327, c2247);
        } finally {
            C7116.m19484(c2247);
        }
    }
}
