package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13636 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11289 f43299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10543 f43300;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13636(C10543 c10543, Object[] objArr, C11289 c11289) {
        super("OkHttp %s stream %d", objArr);
        this.f43300 = c10543;
        this.f43299 = c11289;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        C11289 c11289 = this.f43299;
        C22478 c22478 = this.f43300.f33519;
        try {
            c22478.f72730.mo8275(c11289);
        } catch (IOException e) {
            C9052.m24178().mo24180(4, "Http2Connection.Listener failure for " + c22478.f72725, e);
            try {
                c11289.m28536(EnumC15874.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
