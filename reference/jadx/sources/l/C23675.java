package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes.dex */
public final class C23675 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 f76769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Uri f76770;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9480 f76771;

    public C23675(InterfaceC22486 interfaceC22486, InterfaceC9480 interfaceC9480, Uri uri) {
        this.f76769 = interfaceC22486;
        this.f76771 = interfaceC9480;
        this.f76770 = uri;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return this.f76769.mo2294(interfaceC19502);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return this.f76769.mo2297();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f76769.mo2293(new C16215(interfaceC12789, this.f76771, this.f76770));
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        return this.f76769.mo2289(interfaceC19502, c18756);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f76769.mo2292(j, j2);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
        this.f76769.mo2291();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this.f76769.mo2296();
    }
}
