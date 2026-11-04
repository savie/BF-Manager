package l;

import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.ᩴ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20088 implements InterfaceC9888 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ZipOutputStream f64565;

    public C20088(ZipOutputStream zipOutputStream) {
        this.f64565 = zipOutputStream;
    }

    @Override // l.InterfaceC9888
    public final AbstractC18217 create() {
        C0318 c0318 = new C0318(1);
        C17850 c17850 = new C17850(c0318);
        return new C23072(this, c17850, c17850, c0318);
    }
}
