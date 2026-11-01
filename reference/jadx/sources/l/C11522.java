package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۨۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S515 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11522 extends AbstractC6913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5171 f38737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5171 f38738;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9736 f38739;

    public C11522(C5171 c5171, C5171 c5172, C5171 c5173) {
        this.f38738 = c5171;
        this.f38737 = c5172;
        this.f38739 = new C1973(c5173);
    }

    public C11522(C5171 c5171, C5171 c5172, AbstractC9736 abstractC9736) {
        this.f38738 = c5171;
        this.f38737 = c5172;
        this.f38739 = abstractC9736;
    }

    public C11522(C5171 c5171, C5171 c5172, InterfaceC15914 interfaceC15914, C5171 c5173) {
        AbstractC9736 c14675;
        this.f38738 = c5171;
        this.f38737 = c5172;
        if (interfaceC15914 != null) {
            c14675 = new C14675(c5173, interfaceC15914);
        } else {
            c14675 = new C1973(c5173);
        }
        this.f38739 = c14675;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۙ */
    public final int mo18941() {
        return this.f38738.m14324().f49052;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۨ */
    public final int mo18942() {
        return this.f38737.m14324().f49052 - this.f38738.m14324().f49052;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ܰ */
    public final List mo18943() {
        return AbstractC22433.of((Object) this.f38739);
    }
}
