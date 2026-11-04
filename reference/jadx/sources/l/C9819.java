package l;

/* JADX INFO: renamed from: l.ۢۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 750E */
/* JADX INFO: loaded from: classes4.dex */
public final class C9819 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5520 f31630;

    public C9819(C24738 c24738, C4028 c4028, byte b) {
        this.f31630 = (C5520) c24738.f80108.m49623((int) C3102.m10116(c4028.m13001(b + 1)));
    }

    public C9819(C5520 c5520) {
        this.f31630 = c5520;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10118 = C3102.m10118(this.f31630.m27353());
        c24166.m54138(EnumC6837.VALUE_METHOD.f22727 | ((bArrM10118.length - 1) << 5));
        c24166.m54133(bArrM10118, 0, bArrM10118.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10119(this.f31630.m27353()) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return this.f31630.m27353() - ((C9819) abstractC14294).f31630.m27353();
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_METHOD;
    }

    public final int hashCode() {
        return this.f31630.hashCode();
    }
}
