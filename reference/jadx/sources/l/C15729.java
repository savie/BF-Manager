package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15729 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51027;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6741 f51028;

    public /* synthetic */ C15729(AbstractC6741 abstractC6741, int i) {
        this.f51027 = i;
        this.f51028 = abstractC6741;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f51027;
        AbstractC6741 abstractC6741 = this.f51028;
        switch (i) {
            case 0:
                C17139 c17139 = (C17139) abstractC6741;
                return String.format(" same_locals_1_stack_item_frame_extended=%d, offset=%d, numstack=%s", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671), C18755.m43308(c17139.f54661));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC14297) abstractC6741).f46838));
        }
    }
}
