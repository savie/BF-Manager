package l;

import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15165 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49457;

    public /* synthetic */ C15165(int i) {
        this.f49457 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f49457) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f49457) {
            case 0:
                return !((C17467) obj).mo8547().m26528();
            case 1:
                AbstractC22044 abstractC22044 = (AbstractC22044) obj;
                return abstractC22044.mo4304() && abstractC22044.getName().toLowerCase().endsWith(".mtd");
            case 2:
                return !((List) obj).isEmpty();
            case 3:
                return C17359.nonNull((C17388) obj);
            case 4:
                return (((AbstractC22664) obj).f73596.mo29591() & 140737488355328L) != 0;
            case 5:
                return ((C22224) obj).m50282();
            default:
                return ((AbstractC8036) obj).m21911(EnumC21461.f68538);
        }
    }
}
