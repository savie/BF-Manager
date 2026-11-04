package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19031 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61653;

    public /* synthetic */ C19031(int i, Object obj) {
        this.f61652 = i;
        this.f61653 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f61652) {
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
        switch (this.f61652) {
            case 0:
                String str = (String) this.f61653;
                String str2 = (String) ((Map.Entry) obj).getKey();
                return str2.startsWith(str) && str2.endsWith("/type-info");
            default:
                return C12971.m32364((C12971) this.f61653, (C21943) obj);
        }
    }
}
