package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C1846 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22970 f6230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f6231;

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
        if (abstractC11781.f38066 != EnumC13603.f43218 || (abstractC11781.mo29591() & 8796093023232L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return false;
        }
        C24705 c24705 = this.f6231;
        AbstractC22970 abstractC22970 = this.f6230;
        return !c24705.m55118(abstractC22970, abstractC11781) && (((C10377) c24705.m55098(abstractC22970.f38067, (C10377) abstractC11781).f48335).f38071 & 8796093022208L) == 0;
    }

    public C1846(AbstractC22970 abstractC22970, C24705 c24705) {
        this.f6231 = c24705;
        this.f6230 = abstractC22970;
    }
}
