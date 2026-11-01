package l;

import android.app.ActivityManager;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1612 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6505;

    public /* synthetic */ C1612(int i) {
        this.f6505 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f6505) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f6505) {
            case 0:
                return !((String) obj).isEmpty();
            case 1:
                return ActivityC9830.m24937((ActivityManager.AppTask) obj);
            case 2:
                return ((AbstractC23903) obj).f77452 == EnumC10477.f35865;
            case 3:
                return C12325.m30625((C19670) obj);
            default:
                C7675 c7675 = (C7675) obj;
                c7675.mo49994();
                c7675.mo49994();
                return !c7675.f25395.m9329();
        }
    }
}
