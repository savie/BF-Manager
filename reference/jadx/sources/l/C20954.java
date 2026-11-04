package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20954 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67025;

    public /* synthetic */ C20954(int i) {
        this.f67025 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f67025) {
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
        switch (this.f67025) {
            case 0:
                String str = (String) obj;
                return str.indexOf(47) == -1 && str.toLowerCase().endsWith(".apk");
            case 1:
                C6041 c6041 = (C6041) obj;
                C18959 c18959M39118 = c6041.m39118();
                if (c18959M39118 == null || c18959M39118.getType() == EnumC24203.PHI || c6041.m17536()) {
                    return false;
                }
                return c18959M39118.mo17865(EnumC1763.DONT_GENERATE);
            case 2:
                return C20531.m47076((InterfaceC6281) obj);
            default:
                return C17359.isNull(obj);
        }
    }
}
