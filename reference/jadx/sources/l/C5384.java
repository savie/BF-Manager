package l;

import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5384 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18873 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparable f18874;

    public /* synthetic */ C5384(String str) {
        this.f18874 = str;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f18873) {
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
        switch (this.f18873) {
            case 0:
                return C1655.m5944((String) this.f18874, (InterfaceC12841) obj);
            default:
                C2551 c2551 = (C2551) this.f18874;
                AbstractC16481 abstractC16481 = (C6041) obj;
                EnumC1763 enumC1763 = EnumC1763.REMOVE;
                if (abstractC16481.mo17865(enumC1763)) {
                    return true;
                }
                C18959 c18959M39118 = abstractC16481.m39118();
                if (c18959M39118 != null && c18959M39118.getType() == EnumC24203.CONSTRUCTOR && c18959M39118.mo17867(C11457.f35998)) {
                    InterfaceC21197 interfaceC21197M19301 = c2551.mo8527().m5683().m19301((C6787) c18959M39118);
                    C2551 c2552 = interfaceC21197M19301 instanceof C2551 ? (C2551) interfaceC21197M19301 : null;
                    if (c2552 != null && c2552.mo17867(C11457.f36005)) {
                        int iM44020 = c18959M39118.m44020(abstractC16481);
                        List listM8526 = c2552.m8526();
                        if (iM44020 >= 0 && iM44020 < listM8526.size()) {
                            C6041 c6041 = (C6041) listM8526.get(iM44020);
                            if (c6041.mo17865(enumC1763) && abstractC16481.getType().equals(c6041.getType())) {
                                abstractC16481.mo17866(EnumC1763.DONT_GENERATE);
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }
}
