package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9161 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f29742;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9161(C22478 c22478) {
        super("OkHttp %s ping", c22478.f72725);
        this.f29742 = c22478;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        boolean z;
        synchronized (this.f29742) {
            if (this.f29742.f72727 < this.f29742.f72733) {
                z = true;
            } else {
                C22478.m50687(this.f29742);
                z = false;
            }
        }
        if (z) {
            C22478 c22478 = this.f29742;
            try {
                EnumC15874 enumC15874 = EnumC15874.PROTOCOL_ERROR;
                c22478.m50701(enumC15874, enumC15874);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        this.f29742.m50693(1, 0, false);
    }
}
