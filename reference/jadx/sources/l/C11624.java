package l;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DITR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f36465;

    public C11624(C2551 c2551) {
        List<C17973> listM8490 = c2551.m8490();
        this.f36465 = new LinkedHashMap(listM8490.size());
        for (C17973 c17973 : listM8490) {
            this.f36465.put(c17973, new C25051(c17973));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25051 m29193(C17973 c17973) {
        C25051 c25051 = (C25051) this.f36465.get(c17973);
        if (c25051 != null) {
            return c25051;
        }
        throw new C8597("TypeSearchVarInfo not found in map for var: " + c17973);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m29192(AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        return abstractC16481 instanceof C6041 ? m29193(((C6041) abstractC16481).m17530()).m55872() : abstractC16481.getType();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m29194() {
        return (List) C1170.stream(this.f36465.values()).filter(new C5339(3)).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m29191() {
        return (List) C1170.stream(this.f36465.values()).filter(new C20548(4)).collect(C2025.toList());
    }
}
