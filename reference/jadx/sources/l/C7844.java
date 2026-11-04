package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7844 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26131;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26132;

    public /* synthetic */ C7844(String str, int i) {
        this.f26131 = i;
        this.f26132 = str;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f26131) {
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
        switch (this.f26131) {
            case 0:
                return ((String) ((Map.Entry) obj).getKey()).startsWith(this.f26132);
            case 1:
                return C14584.m35198((String) obj, this.f26132);
            default:
                return this.f26132.equals((String) obj);
        }
    }
}
