package l;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes2.dex */
public class C1799 extends AbstractC9562 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f6950 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4352 f6951;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9562 f6952;

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5884(C5558 c5558, C6656 c6656) {
        return false;
    }

    public C1799(C4352 c4352) {
        this.f6951 = c4352;
        this.f6952 = c4352.f15574;
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6263 mo5880(C5558 c5558) {
        C6263 c6263Mo5880 = this.f6952.mo5880(c5558);
        if (c6263Mo5880 != null) {
            return c6263Mo5880;
        }
        C6263 c6263 = new C6263(c5558.f77447, c5558.f77453, c5558.f77449, this.f6951.f15572);
        c6263.m52712(c5558.mo50009());
        this.f6950.put(c5558, c6263);
        return c6263;
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6263 mo5885(final C5558 c5558) {
        C6263 c6263Mo5885 = this.f6952.mo5885(c5558);
        return c6263Mo5885 != null ? c6263Mo5885 : (C6263) C9030.stream(this.f6950.entrySet()).filter(new Predicate() { // from class: l.ܳۨ۟
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
                C5558 c5559 = (C5558) ((Map.Entry) obj).getKey();
                c5559.getClass();
                C21825 c21825Of = C21825.of((Object) c5559);
                C5558 c55510 = c5558;
                c55510.getClass();
                return c21825Of.containsAll(C21825.of((Object) c55510));
            }
        }).findFirst().map(new C11660(2)).orElse(null);
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 mo5883(int i) {
        LinkedHashMap linkedHashMap = this.f6950;
        if (linkedHashMap.isEmpty()) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C6263 c6263 = (C6263) entry.getValue();
            C5286 c5286 = this.f6951.f15575;
            c5286.f18294 = i;
            C6656 c6656M14594 = c5286.m14594(c6263, (AbstractC5930) null);
            if ((((C5558) entry.getKey()).f77447 & 1152921504606846976L) != 0) {
                if (!this.f6952.mo5884((C5558) entry.getKey(), c6656M14594)) {
                }
            }
            c19003.m43723(c6656M14594);
        }
        return c19003.m43726();
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14728 mo5882(AbstractC14728 abstractC14728) {
        C21825 c21825Mo5883 = mo5883(abstractC14728.f30189);
        if (!c21825Mo5883.m48595()) {
            return abstractC14728;
        }
        C5286 c5286 = this.f6951.f15575;
        c5286.f18294 = abstractC14728.f30189;
        return c5286.m14617(0L, c21825Mo5883.m48591(abstractC14728));
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 mo5879(AbstractC5930 abstractC5930) {
        for (C6263 c6263 : this.f6950.values()) {
            C4352 c4352 = this.f6951;
            C5286 c5286 = c4352.f15575;
            int i = abstractC5930.f30189;
            c5286.f18294 = i;
            C5286 c5287 = c4352.f15575;
            c5287.f18294 = i;
            C17945 c17945M14613 = c5286.m14613(c5287.m14594(c6263, (AbstractC5930) null), abstractC5930);
            c17945M14613.f30190 = abstractC5930.f30190;
            abstractC5930 = c17945M14613;
        }
        return abstractC5930;
    }

    @Override // l.AbstractC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9562 mo5881() {
        C4352 c4352 = this.f6951;
        AbstractC9562 abstractC9562 = this.f6952;
        c4352.f15574 = abstractC9562;
        return abstractC9562;
    }
}
