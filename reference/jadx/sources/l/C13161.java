package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13161 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43833;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f43834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f43835;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13161(C20217 c20217, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f43835 = c20217;
        this.f43833 = i;
        this.f43834 = j;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        C20217 c20217 = this.f43835;
        try {
            c20217.f65611.m52276(this.f43833, this.f43834);
        } catch (IOException unused) {
            C20217.m45679(c20217);
        }
    }
}
