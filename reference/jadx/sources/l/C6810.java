package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6810 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22960;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f22961;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6810(C20217 c20217, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f22961 = c20217;
        this.f22960 = i;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        this.f22961.f65605.getClass();
        try {
            this.f22961.f65611.m52277(this.f22960, EnumC9365.CANCEL);
            synchronized (this.f22961) {
                this.f22961.f65620.remove(Integer.valueOf(this.f22960));
            }
        } catch (IOException unused) {
        }
    }
}
