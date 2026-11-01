package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23039 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f74853;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23039(C20217 c20217, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f74853 = c20217;
        this.f74852 = i;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        this.f74853.f65605.getClass();
        try {
            this.f74853.f65611.m52277(this.f74852, EnumC9365.CANCEL);
            synchronized (this.f74853) {
                this.f74853.f65620.remove(Integer.valueOf(this.f74852));
            }
        } catch (IOException unused) {
        }
    }
}
