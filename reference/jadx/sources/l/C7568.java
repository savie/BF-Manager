package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7568 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24949;

    public /* synthetic */ C7568(int i) {
        this.f24949 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f24949) {
            case 0:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f24949) {
            case 0:
                C6041 c6041 = (C6041) obj;
                EnumC1763 enumC1763 = EnumC1763.DONT_GENERATE;
                if (!c6041.mo17865(enumC1763)) {
                    C18959 c18959M39118 = c6041.m39118();
                    int i = C8314.f27285;
                    if (c18959M39118 == null || !c18959M39118.mo17865(enumC1763)) {
                        return false;
                    }
                }
                return true;
            default:
                return ((C5514) ((C4869) obj).m14925()).m16420();
        }
    }
}
