package l;

import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.᩶᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20425 implements InterfaceC15487 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ZipOutputStream f66204;

    public C20425(ZipOutputStream zipOutputStream) {
        this.f66204 = zipOutputStream;
    }

    @Override // l.InterfaceC15487
    public final AbstractC0764 create() {
        C12760 c12760 = new C12760(1);
        C14781 c14781 = new C14781(c12760);
        return new C16192(this, c14781, c14781, c12760);
    }
}
