package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10339 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11045 f35450;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15984 f35451;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10339(C15984 c15984, Object[] objArr, C11045 c11045) {
        super("OkHttp %s stream %d", objArr);
        this.f35451 = c15984;
        this.f35450 = c11045;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        C11045 c11045 = this.f35450;
        C20217 c20217 = this.f35451.f51764;
        try {
            c20217.f65612.mo3580(c11045);
        } catch (IOException e) {
            C18743.m43294().mo11390(4, "Http2Connection.Listener failure for " + c20217.f65613, e);
            try {
                c11045.m27856(EnumC9365.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
