package l;

/* JADX INFO: renamed from: l.ܺۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15860 extends AbstractC21730 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f51322;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f51323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51324;

    public C15860(C17684 c17684, int i) {
        this.f51323 = c17684;
        this.f51324 = i;
        C10215 c10215M41165 = c17684.m41165(8);
        if (c10215M41165 != null && i < c10215M41165.m25997()) {
            this.f51322 = (i * 8) + c10215M41165.m25999();
            return;
        }
        throw new C16979(null, "Method handle index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC8152
    /* JADX INFO: renamed from: ۙܰ */
    public final int mo20681() {
        return this.f51323.m41166().m42183(this.f51322);
    }

    @Override // l.InterfaceC8152
    /* JADX INFO: renamed from: ֨ܰ */
    public final InterfaceC7446 mo20680() {
        C17684 c17684 = this.f51323;
        int iM42183 = c17684.m41166().m42183(this.f51322 + 4);
        switch (mo20681()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C20798(c17684, iM42183);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return c17684.m41202(iM42183);
            default:
                throw new C20749(null, "Invalid method handle type: %d", Integer.valueOf(mo20681()));
        }
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f51324;
        if (i >= 0) {
            C10215 c10215M41165 = this.f51323.m41165(8);
            if (i < (c10215M41165 == null ? 0 : c10215M41165.m25997())) {
                try {
                    mo20680();
                    return;
                } catch (C20749 e) {
                    throw new C10269(C8479.m22141(i, "methodhandle@"), e);
                }
            }
        }
        throw new C10269(C8479.m22141(i, "methodhandle@"));
    }
}
