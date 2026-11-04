package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14369 implements InterfaceC18525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1306 f45301;

    public C14369(C1306 c1306) {
        this.f45301 = c1306;
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14234(String str) throws IOException {
        this.f45301.startTag(null, str);
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14232(String str) throws IOException {
        this.f45301.endTag(null, str);
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14233(String str, String str2) throws IOException {
        this.f45301.attribute(null, str, str2);
    }

    @Override // l.InterfaceC18525
    public final void text(String str) throws IOException {
        this.f45301.text(str);
    }
}
