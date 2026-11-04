package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2444 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7828;

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

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        long jMo29591 = abstractC11781.mo29591();
        if (abstractC11781.f38066 == EnumC13603.f43218 && (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & jMo29591) == 0) {
            return this.f7828 || (8796093022208L & jMo29591) != 0 || (jMo29591 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0;
        }
        return false;
    }
}
