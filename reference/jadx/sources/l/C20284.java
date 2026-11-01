package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20284 implements InterfaceC6440 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65739;

    public /* synthetic */ C20284(int i) {
        this.f65739 = i;
    }

    @Override // l.InterfaceC6440
    public final AbstractC4674 create() {
        switch (this.f65739) {
            case 0:
                return new C14223("zip");
            default:
                C16922 c16922 = new C16922(R.string.MT_Protector, R.drawable.MT_Protector);
                c16922.m12944();
                return c16922;
        }
    }
}
