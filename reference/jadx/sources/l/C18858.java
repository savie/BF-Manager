package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18858 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61236;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1879 f61238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f61239;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18858(C22478 c22478, Object[] objArr, int i, C1879 c1879, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f61239 = c22478;
        this.f61237 = i;
        this.f61238 = c1879;
        this.f61236 = i2;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        try {
            InterfaceC23224 interfaceC23224 = this.f61239.f72746;
            C1879 c1879 = this.f61238;
            int i = this.f61236;
            ((C15764) interfaceC23224).getClass();
            c1879.skip(i);
            this.f61239.f72736.m55186(this.f61237, EnumC15874.CANCEL);
            synchronized (this.f61239) {
                this.f61239.f72724.remove(Integer.valueOf(this.f61237));
            }
        } catch (IOException unused) {
        }
    }
}
