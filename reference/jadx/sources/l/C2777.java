package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2777 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f10604;

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

    public C2777(C23800 c23800) {
        this.f10604 = c23800;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        if (abstractC23903.f77452 != EnumC10477.f35879) {
            return false;
        }
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        C23942 c23942 = this.f10604.f76940;
        return (abstractC11242 == c23942.f77632 || abstractC11242 == c23942.f77608 || (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) ? false : true;
    }
}
