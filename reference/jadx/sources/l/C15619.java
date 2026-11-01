package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15619 extends AbstractC16655 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16324 f50797;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15619(C16324 c16324, AbstractC8894 abstractC8894) {
        super(abstractC8894);
        this.f50797 = c16324;
    }

    @Override // l.AbstractC16655
    /* JADX INFO: renamed from: ܰ */
    public final ComponentCallbacksC22654 mo33254(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC15847();
        }
        if (i == 1) {
            return new C9497();
        }
        if (i == 2) {
            return new C23421();
        }
        if (i == 3) {
            return new C7898();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        C16324 c16324 = this.f50797;
        if (i == 0) {
            return c16324.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c16324.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c16324.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c16324.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
