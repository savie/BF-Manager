package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5268 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18252;

    public /* synthetic */ C5268(int i) {
        this.f18252 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f18252) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18252) {
            case 0:
                return ((C19670) obj).f63144.contains(EnumC8381.WARN_INCUBATING);
            default:
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return abstractC23903.m52717() && abstractC23903.f77452 == EnumC10477.f35878;
        }
    }
}
