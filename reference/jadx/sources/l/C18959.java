package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18959 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61393;

    public /* synthetic */ C18959(int i) {
        this.f61393 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f61393) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f61393) {
            case 0:
                return ((AbstractC20745) obj).mo33971();
            case 1:
                return ((AbstractC22611) obj) instanceof C11613;
            case 2:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            case 3:
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0;
            case 4:
                AbstractC23903 abstractC23904 = (AbstractC23903) obj;
                return abstractC23904.f77452 == EnumC10477.f35878 && (abstractC23904.mo20276() & 2305843009213693952L) != 0;
            default:
                EnumC0573 enumC0573 = (EnumC0573) obj;
                return enumC0573 == EnumC0573.f2416 || enumC0573 == EnumC0573.f2428 || enumC0573 == EnumC0573.f2493 || enumC0573 == EnumC0573.f2462;
        }
    }
}
