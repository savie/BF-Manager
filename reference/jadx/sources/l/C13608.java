package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13608 extends AbstractC16655 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0906 f44888;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13608(C0906 c0906, AbstractC8894 abstractC8894) {
        super(abstractC8894);
        this.f44888 = c0906;
    }

    @Override // l.AbstractC16655
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 mo33254(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC3520();
        }
        if (i == 1) {
            return new C15601();
        }
        if (i == 2) {
            return new C22032();
        }
        if (i == 3) {
            return new C20890();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        C0906 c0906 = this.f44888;
        if (i == 0) {
            return c0906.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c0906.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c0906.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c0906.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
