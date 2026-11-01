package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15700 implements InterfaceC9380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13985 f50975;

    public C15700(C13985 c13985) {
        this.f50975 = c13985;
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ܰ */
    public final void mo24062(String str) throws IOException {
        this.f50975.startTag(null, str);
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24060(String str) throws IOException {
        this.f50975.endTag(null, str);
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24061(String str, String str2) throws IOException {
        this.f50975.attribute(null, str, str2);
    }

    @Override // l.InterfaceC9380
    public final void text(String str) throws IOException {
        this.f50975.text(str);
    }
}
