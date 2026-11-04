package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6321 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f21424;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f21425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f21426;

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
        if (abstractC11781.f38066 != EnumC13603.f43218) {
            return false;
        }
        AbstractC19728 abstractC19728 = abstractC11781.f38072;
        AbstractC11781 abstractC11782 = this.f21424;
        if (abstractC19728 != abstractC11782.f38072 || (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        AbstractC22664 abstractC22664 = this.f21426;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        C24705 c24705 = this.f21425;
        return abstractC11781.mo26690((AbstractC11781) abstractC22970, c24705) && c24705.m55121(c24705.m55126(abstractC11781, abstractC22664), c24705.m55126(abstractC11782, abstractC22664));
    }

    public C6321(C24705 c24705, C10377 c10377, AbstractC22664 abstractC22664) {
        this.f21425 = c24705;
        this.f21424 = c10377;
        this.f21426 = abstractC22664;
    }
}
