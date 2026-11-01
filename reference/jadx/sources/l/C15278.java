package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15278 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6043 f49802;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49803;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49804;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f49805;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15278(C20217 c20217, Object[] objArr, int i, C6043 c6043, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f49805 = c20217;
        this.f49803 = i;
        this.f49802 = c6043;
        this.f49804 = i2;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        try {
            InterfaceC3282 interfaceC3282 = this.f49805.f65605;
            C6043 c6043 = this.f49802;
            int i = this.f49804;
            ((C9634) interfaceC3282).getClass();
            c6043.skip(i);
            this.f49805.f65611.m52277(this.f49803, EnumC9365.CANCEL);
            synchronized (this.f49805) {
                this.f49805.f65620.remove(Integer.valueOf(this.f49803));
            }
        } catch (IOException unused) {
        }
    }
}
