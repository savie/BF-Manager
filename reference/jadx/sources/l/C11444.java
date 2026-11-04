package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11444 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35963;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f35963) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35963) {
            case 0:
                return ((InterfaceC2386) obj).isDirectory();
            case 1:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            default:
                C17007 c17007 = (C17007) obj;
                return (c17007.mo32404() == EnumC15230.ERROR && c17007.m40083(EnumC6984.RECOVERABLE) && !c17007.m40083(EnumC6984.API)) ? false : true;
        }
    }
}
