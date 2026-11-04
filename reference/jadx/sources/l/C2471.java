package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2471 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7926;

    public /* synthetic */ C2471(int i) {
        this.f7926 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f7926) {
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
        EnumC24203 type;
        switch (this.f7926) {
            case 0:
                return !((String) obj).isEmpty();
            case 1:
                C18959 c18959 = (C18959) obj;
                return c18959.m39417() && ((type = c18959.getType()) == EnumC24203.GOTO || type == EnumC24203.NOP);
            default:
                return ((AbstractC18367) obj).m21911(EnumC21461.f68523);
        }
    }
}
