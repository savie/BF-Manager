package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12549 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f40318;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    public C12549(C24705 c24705) {
        this.f40318 = c24705;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        if (abstractC11781.f38066 != EnumC13603.f43218) {
            return false;
        }
        AbstractC19728 abstractC19728 = abstractC11781.f38072;
        C15252 c15252 = this.f40318.f79964;
        return (abstractC19728 == c15252.f49865 || abstractC19728 == c15252.f49758 || (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) ? false : true;
    }
}
