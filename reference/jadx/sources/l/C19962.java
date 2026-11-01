package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19962 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6741 f63924;

    public /* synthetic */ C19962(AbstractC6741 abstractC6741, int i) {
        this.f63923 = i;
        this.f63924 = abstractC6741;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f63923;
        AbstractC6741 abstractC6741 = this.f63924;
        switch (i) {
            case 0:
                C17139 c17139 = (C17139) abstractC6741;
                return String.format(" append_frame=%d offset=%d numlock=%s", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671), C18755.m43308(c17139.f54664));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC14297) abstractC6741).f46838));
        }
    }
}
