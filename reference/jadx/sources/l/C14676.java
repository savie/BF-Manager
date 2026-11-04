package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14676 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47981;

    public /* synthetic */ C14676(int i, Object obj) {
        this.f47980 = i;
        this.f47981 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f47980) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f47980) {
            case 0:
                return C7965.m21668((C7965) this.f47981, (Integer) obj);
            case 1:
                return ((String) this.f47981).equals(((C17384) obj).f56535);
            case 2:
                C7660 c7660 = (C7660) obj;
                return c7660.mo20871() && c7660.m20873() == EnumC3185.f10363 && c7660.m20872((C7660) this.f47981);
            default:
                return ((Set) this.f47981).contains(((AbstractC8036) obj).mo2285());
        }
    }
}
