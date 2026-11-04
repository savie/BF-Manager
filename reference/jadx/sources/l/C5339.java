package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5339 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18763;

    public /* synthetic */ C5339(int i) {
        this.f18763 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f18763) {
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
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18763) {
            case 0:
                return ((C24927) obj).m55571().m4962();
            case 1:
                return (((C12510) obj).f40170.f15825 & 2305843009213693952L) == 2305843009213693952L;
            case 2:
                return ((C0599) obj).m2703() == EnumC18498.CROSS_EDGE;
            case 3:
                return !((C25051) obj).m55875();
            case 4:
                AbstractC11781 abstractC11781 = (AbstractC11781) obj;
                return abstractC11781.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0;
            default:
                return (((C2920) obj).f38071 & 9007199254740992L) != 0;
        }
    }
}
