package l;

import java.util.ArrayList;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19907 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64057;

    public /* synthetic */ C19907(int i) {
        this.f64057 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f64057) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String strM5124;
        switch (this.f64057) {
            case 0:
                return ((AbstractC22891) obj).mo6861();
            case 1:
                String name = ((AbstractC22044) obj).getName();
                if (!name.toLowerCase().endsWith(".zip") || (strM5124 = C1402.m5124(4, 0, name)) == null || strM5124.isEmpty()) {
                    return false;
                }
                for (int i = 0; i < strM5124.length(); i++) {
                    char cCharAt = strM5124.charAt(i);
                    if ((cCharAt < '0' || cCharAt > '9') && !(i == 0 && cCharAt == '-')) {
                        return false;
                    }
                }
                if (strM5124.length() >= 19) {
                    try {
                        Long.parseLong(strM5124);
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                    break;
                }
                return true;
            case 2:
                return ((C19684) obj).m45370();
            default:
                return !((ArrayList) ((C21943) obj).mo1986()).isEmpty();
        }
    }
}
