package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۫᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12623 extends AbstractC19603 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f42177;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f42178;

    public C12623(AbstractC12233 abstractC12233, InterfaceC2557 interfaceC2557, String str, long j) {
        super(str, j, Long.valueOf(j));
        this.f42177 = abstractC12233;
        this.f42178 = interfaceC2557;
    }

    @Override // l.AbstractC19603
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo2898() {
        return this.f42177.mo10262(0L, this.f42178.getPath());
    }
}
