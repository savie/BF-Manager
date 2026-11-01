package l;

/* JADX INFO: renamed from: l.᩸ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21627 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70142;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f70143;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21627(C20217 c20217, Object[] objArr, int i, EnumC9365 enumC9365) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f70143 = c20217;
        this.f70142 = i;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        this.f70143.f65605.getClass();
        synchronized (this.f70143) {
            this.f70143.f65620.remove(Integer.valueOf(this.f70142));
        }
    }
}
