package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14382 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45335;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC15874 f45336;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f45337;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14382(C22478 c22478, Object[] objArr, int i, EnumC15874 enumC15874) {
        super("OkHttp %s stream %d", objArr);
        this.f45337 = c22478;
        this.f45335 = i;
        this.f45336 = enumC15874;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        C22478 c22478 = this.f45337;
        try {
            try {
                c22478.f72736.m55186(this.f45335, this.f45336);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            EnumC15874 enumC15874 = EnumC15874.PROTOCOL_ERROR;
            c22478.m50701(enumC15874, enumC15874);
        }
    }
}
