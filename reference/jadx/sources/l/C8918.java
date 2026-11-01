package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8918 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30601;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        long jMo20276 = abstractC23903.mo20276();
        if (abstractC23903.f77452 == EnumC10477.f35879 && (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & jMo20276) == 0) {
            return this.f30601 || (8796093022208L & jMo20276) != 0 || (jMo20276 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0;
        }
        return false;
    }
}
