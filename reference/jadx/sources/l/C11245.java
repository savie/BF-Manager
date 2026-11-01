package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11245 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f38037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f38038;

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
        if (abstractC23903.f77452 != EnumC10477.f35879 || (abstractC23903.mo20276() & 8796093023232L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return false;
        }
        C23800 c23800 = this.f38038;
        AbstractC0618 abstractC0618 = this.f38037;
        return !c23800.m52390(abstractC0618, abstractC23903) && (((C18258) c23800.m52376(abstractC0618.f77449, (C18258) abstractC23903).f70876).f77447 & 8796093022208L) == 0;
    }

    public C11245(AbstractC0618 abstractC0618, C23800 c23800) {
        this.f38038 = c23800;
        this.f38037 = abstractC0618;
    }
}
