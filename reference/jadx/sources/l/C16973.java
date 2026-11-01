package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16973 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54308;

    public /* synthetic */ C16973(int i) {
        this.f54308 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f54308) {
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
        switch (this.f54308) {
            case 0:
                return ((AbstractC17131) obj) != C20659.m46512();
            case 1:
                C16399 c16399 = (C16399) obj;
                return c16399.m38605() > 0 || c16399.m38604() > 0;
            case 2:
                return ((AbstractC16579) obj).mo9481();
            case 3:
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && (abstractC23903.mo20276() & 35184372088832L) == 0;
            case 4:
                return ((AbstractC23903) obj).f77452 == EnumC10477.f35879;
            default:
                return ((InterfaceC12260) obj) != null;
        }
    }
}
