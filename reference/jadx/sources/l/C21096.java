package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21096 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f67380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67381;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f67382;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21096(C22478 c22478, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f67382 = c22478;
        this.f67381 = i;
        this.f67380 = j;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        C22478 c22478 = this.f67382;
        try {
            c22478.f72736.m55185(this.f67381, this.f67380);
        } catch (IOException unused) {
            C22478.m50680(c22478);
        }
    }
}
