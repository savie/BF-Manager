package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0319 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1755;

    public /* synthetic */ C0319(int i) {
        this.f1755 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f1755) {
            case 0:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1755) {
            case 0:
                String lowerCase = ((AbstractC22044) obj).getName().toLowerCase();
                return lowerCase.endsWith(".pk8") || lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc");
            default:
                return C3445.exists(((InterfaceC24329) obj).resolve("module-info.java"), new EnumC20599[0]);
        }
    }
}
