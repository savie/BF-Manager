package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11236 implements InterfaceC13911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10049 f38016;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10755 f38017;

    @Override // l.InterfaceC13911
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo10545() {
        return C4737.m13105(this);
    }

    public C11236(C10755 c10755, C10049 c10049) {
        this.f38017 = c10755;
        this.f38016 = c10049;
    }

    @Override // l.InterfaceC13911
    public final InputStream getInputStream() {
        return this.f38017.m27057(this.f38016);
    }

    @Override // l.InterfaceC13911
    public final long length() {
        return this.f38016.m25417();
    }
}
