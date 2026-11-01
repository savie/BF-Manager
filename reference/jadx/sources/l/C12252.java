package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12252 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40995;

    public /* synthetic */ C12252(int i) {
        this.f40995 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f40995) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40995) {
            case 0:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            case 1:
                return ((C12107) obj).isDirectory();
            case 2:
                return ((AbstractC8047) obj).m22847(EnumC18651.f60565);
            default:
                return C5212.exists(((InterfaceC3800) obj).resolve("module-info.java"), new EnumC22146[0]);
        }
    }
}
