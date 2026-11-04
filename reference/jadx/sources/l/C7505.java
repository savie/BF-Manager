package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7505 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24810;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1890 f24811;

    public /* synthetic */ C7505(AbstractC1890 abstractC1890, int i) {
        this.f24810 = i;
        this.f24811 = abstractC1890;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f24810;
        AbstractC1890 abstractC1890 = this.f24811;
        switch (i) {
            case 0:
                C22180 c22180 = (C22180) abstractC1890;
                return String.format(" full_frame=%d offset=%d numloc=%s  numstack=%s", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468), C8499.m22814(c22180.f71467), C8499.m22814(c22180.f71463));
            default:
                C4699 c4699 = (C4699) abstractC1890;
                return c4699.f6371.m5631(c4699.f16586).mo14388();
        }
    }
}
