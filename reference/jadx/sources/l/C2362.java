package l;

/* JADX INFO: renamed from: l.ۖۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2362 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3282 f7616;

    public C2362(C24738 c24738, C4028 c4028, byte b) {
        this.f7616 = (C3282) c24738.f80094.m49623((int) C3102.m10116(c4028.m13001(b + 1)));
    }

    public C2362(C3282 c3282) {
        this.f7616 = c3282;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10118 = C3102.m10118(this.f7616.m27353());
        c24166.m54138(EnumC6837.VALUE_STRING.f22727 | ((bArrM10118.length - 1) << 5));
        c24166.m54133(bArrM10118, 0, bArrM10118.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10119(this.f7616.m27353()) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return this.f7616.m27353() - ((C2362) abstractC14294).f7616.m27353();
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_STRING;
    }

    public final int hashCode() {
        return this.f7616.hashCode();
    }
}
