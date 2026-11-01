package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12365 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41342;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41343;

    public /* synthetic */ C12365(int i, Object obj) {
        this.f41342 = i;
        this.f41343 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f41342) {
            case 0:
                C15187 c15187 = (C15187) this.f41343;
                return "\tcell from " + (c15187.f43854 + 1) + " to " + c15187;
            default:
                return "token=" + ((C22201) this.f41343).f72634.f16199.f42721;
        }
    }
}
