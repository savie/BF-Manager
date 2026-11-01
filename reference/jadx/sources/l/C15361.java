package l;

/* JADX INFO: renamed from: l.ܶܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15361 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14655 f50036;

    public C15361(C12063 c12063, C13825 c13825, byte b) {
        this.f50036 = (C14655) c12063.f40354.m44688((int) C12076.m30047(c13825.m33646(b + 1)));
    }

    public C15361(C14655 c14655) {
        this.f50036 = c14655;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30048 = C12076.m30048(this.f50036.m23325());
        c4651.m12841(EnumC18182.VALUE_STRING.f58128 | ((bArrM30048.length - 1) << 5));
        c4651.m12837(bArrM30048, 0, bArrM30048.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30051(this.f50036.m23325()) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        return this.f50036.m23325() - ((C15361) abstractC11833).f50036.m23325();
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_STRING;
    }

    public final int hashCode() {
        return this.f50036.hashCode();
    }
}
