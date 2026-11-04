package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7671 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f25265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7671(C22478 c22478, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f25265 = c22478;
        this.f25264 = i;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        this.f25265.f72746.getClass();
        try {
            this.f25265.f72736.m55186(this.f25264, EnumC15874.CANCEL);
            synchronized (this.f25265) {
                this.f25265.f72724.remove(Integer.valueOf(this.f25264));
            }
        } catch (IOException unused) {
        }
    }
}
