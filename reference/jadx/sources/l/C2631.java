package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2631 implements Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f10259;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f10260;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f10261;

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
        if (abstractC23903.f77452 != EnumC10477.f35879) {
            return false;
        }
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        AbstractC23903 abstractC23904 = this.f10260;
        if (abstractC11242 != abstractC23904.f77453 || (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        AbstractC16579 abstractC16579 = this.f10261;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        C23800 c23800 = this.f10259;
        return abstractC23903.mo42454((AbstractC23903) abstractC0618, c23800) && c23800.m52417(c23800.m52409(abstractC23903, abstractC16579), c23800.m52409(abstractC23904, abstractC16579));
    }

    public C2631(C23800 c23800, C18258 c18258, AbstractC16579 abstractC16579) {
        this.f10259 = c23800;
        this.f10260 = c18258;
        this.f10261 = abstractC16579;
    }
}
