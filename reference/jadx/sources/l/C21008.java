package l;

/* JADX INFO: renamed from: l.᩶ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50W */
/* JADX INFO: loaded from: classes5.dex */
public final class C21008 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13548 f67177;

    public C21008(C24738 c24738, C4028 c4028, byte b) {
        this.f67177 = (C13548) c24738.f80101.m49623((int) C3102.m10116(c4028.m13001(b + 1)));
    }

    public C21008(C13548 c13548) {
        this.f67177 = c13548;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10118 = C3102.m10118(this.f67177.m27353());
        c24166.m54138(EnumC6837.VALUE_ENUM.f22727 | ((bArrM10118.length - 1) << 5));
        c24166.m54133(bArrM10118, 0, bArrM10118.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10119(this.f67177.m27353()) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return this.f67177.m27353() - ((C21008) abstractC14294).f67177.m27353();
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_ENUM;
    }

    public final int hashCode() {
        return this.f67177.hashCode();
    }
}
