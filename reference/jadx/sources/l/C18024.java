package l;

/* JADX INFO: renamed from: l.ܿۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N500 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18024 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13548 f59021;

    public C18024(C24738 c24738, C4028 c4028, byte b) {
        this.f59021 = (C13548) c24738.f80101.m49623((int) C3102.m10116(c4028.m13001(b + 1)));
    }

    public C18024(C13548 c13548) {
        this.f59021 = c13548;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10118 = C3102.m10118(this.f59021.m27353());
        c24166.m54138(EnumC6837.VALUE_FIELD.f22727 | ((bArrM10118.length - 1) << 5));
        c24166.m54133(bArrM10118, 0, bArrM10118.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10119(this.f59021.m27353()) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return this.f59021.m27353() - ((C18024) abstractC14294).f59021.m27353();
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_FIELD;
    }

    public final int hashCode() {
        return this.f59021.hashCode();
    }
}
