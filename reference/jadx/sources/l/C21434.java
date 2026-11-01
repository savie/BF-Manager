package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21434 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9855 f69691;

    public /* synthetic */ C21434(AbstractC9855 abstractC9855, int i) {
        this.f69690 = i;
        this.f69691 = abstractC9855;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f69690) {
            case 0:
                return "type " + ((AbstractC16579) this.f69691);
            default:
                return ((C7675) this.f69691).toString();
        }
    }
}
