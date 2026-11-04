package l;

/* JADX INFO: renamed from: l.ܽ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WITX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17876 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        C15580 c15580;
        C1610 c1610Mo8527 = c24927.mo8527();
        if (c1610Mo8527.m5681().m17721() && !c24927.getFields().isEmpty()) {
            C7311 c7311M5688 = c1610Mo8527.m5688();
            for (C17467 c17467 : c24927.getFields()) {
                try {
                    C10293 c10293Mo8547 = c17467.mo8547();
                    Object objM37318 = null;
                    if (c10293Mo8547.m26540() && c10293Mo8547.m26538() && (c15580 = (C15580) c17467.mo17862(C25278.f81643)) != null && c15580 != C15580.f50679 && c17467.m40968().isEmpty()) {
                        objM37318 = c15580.m37318();
                    }
                    if (objM37318 != null) {
                        boolean z = false;
                        if (c17467.mo8547().m26542()) {
                            C24927 c24927M40972 = c17467.m40972();
                            while (true) {
                                if (c24927M40972 == null) {
                                    z = true;
                                    break;
                                }
                                if (!c24927M40972.mo8547().m26542()) {
                                    break;
                                }
                                c24927M40972 = c24927M40972.getDeclaringClass();
                            }
                        }
                        c7311M5688.m20019(c17467, objM37318, z);
                    }
                } catch (Exception e) {
                    c24927.m31134("Failed to process value of field: " + c17467, e);
                }
            }
        }
        return true;
    }
}
