package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes3.dex */
public final class C7200 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10045 f24013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f24014;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4377 f24015;

    public C7200(InterfaceC10045 interfaceC10045, InterfaceC4377 interfaceC4377, Uri uri) {
        this.f24013 = interfaceC10045;
        this.f24015 = interfaceC4377;
        this.f24014 = uri;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return this.f24013.mo2754(interfaceC7222);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return this.f24013.mo2756();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f24013.mo2753(new C10023(interfaceC15690, this.f24015, this.f24014));
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        return this.f24013.mo2750(interfaceC7222, c0954);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f24013.mo2752(j, j2);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
        this.f24013.mo2751();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this.f24013.mo2755();
    }
}
