package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0213 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1416;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f1417;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213(C22478 c22478, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f1417 = c22478;
        this.f1416 = i;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1658() {
        this.f1417.f72746.getClass();
        try {
            this.f1417.f72736.m55186(this.f1416, EnumC15874.CANCEL);
            synchronized (this.f1417) {
                this.f1417.f72724.remove(Integer.valueOf(this.f1416));
            }
        } catch (IOException unused) {
        }
    }
}
