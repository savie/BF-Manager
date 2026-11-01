package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12400 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41424;

    public /* synthetic */ C12400(int i, Object obj) {
        this.f41423 = i;
        this.f41424 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f41423) {
            case 0:
                return ((C8872[]) this.f41424)[0];
            default:
                return ((AbstractC23903) this.f41424).toString();
        }
    }
}
