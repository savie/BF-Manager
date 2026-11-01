package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16073 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51986;

    public /* synthetic */ C16073(int i) {
        this.f51986 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f51986) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String strM46498;
        switch (this.f51986) {
            case 0:
                String name = ((AbstractC20745) obj).getName();
                if (name.toLowerCase().endsWith(".zip") && (strM46498 = C20630.m46498(4, 0, name)) != null && !strM46498.isEmpty()) {
                    for (int i = 0; i < strM46498.length(); i++) {
                        char cCharAt = strM46498.charAt(i);
                        if ((cCharAt >= '0' && cCharAt <= '9') || (i == 0 && cCharAt == '-')) {
                        }
                    }
                    if (strM46498.length() < 19) {
                        return true;
                    }
                    try {
                        Long.parseLong(strM46498);
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
                return false;
            default:
                int i2 = ActivityC5677.f19358;
                return !((AbstractC22611) obj).m50131();
        }
    }
}
