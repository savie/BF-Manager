package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C9215 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f30031;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f30032;

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

    public C9215(C22092 c22092, AbstractC22664 abstractC22664) {
        this.f30032 = c22092;
        this.f30031 = abstractC22664;
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean test(AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 != EnumC13603.f43218 || (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        long jMo29591 = abstractC11781.mo29591() & 4398046511104L;
        AbstractC22664 abstractC22664 = this.f30031;
        return (jMo29591 == 0 || abstractC11781.f38069 != abstractC22664.f73596) && abstractC11781.mo26690((AbstractC11781) abstractC22664.f73596, this.f30032.f71203) && !abstractC11781.m29570();
    }
}
