package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C18901 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f61183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f61184;

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

    public C18901(C21017 c21017, AbstractC16579 abstractC16579) {
        this.f61184 = c21017;
        this.f61183 = abstractC16579;
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean test(AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 != EnumC10477.f35879 || (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        long jMo20276 = abstractC23903.mo20276() & 4398046511104L;
        AbstractC16579 abstractC16579 = this.f61183;
        return (jMo20276 == 0 || abstractC23903.f77448 != abstractC16579.f53222) && abstractC23903.mo42454((AbstractC23903) abstractC16579.f53222, this.f61184.f68417) && !abstractC23903.m52713();
    }
}
