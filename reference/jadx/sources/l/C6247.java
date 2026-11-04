package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6247 extends AbstractC20970 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f21205;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f21206;

    public C6247(AbstractC18881 abstractC18881, InterfaceC2386 interfaceC2386, String str, long j) {
        super(str, j, Long.valueOf(j));
        this.f21205 = abstractC18881;
        this.f21206 = interfaceC2386;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10654() {
        return this.f21205.mo35570(0L, this.f21206.getPath());
    }
}
