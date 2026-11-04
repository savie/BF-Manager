package l;

/* JADX INFO: renamed from: l.᩸ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C22992 extends AbstractC1584 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f74641;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return C14769.m35543();
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        if (c10510.f33437 == null) {
            C14769 c14769M54832 = ((C24550) c10510.f73596).m54832();
            if (c10510.f33437 == null) {
                C11972.m30023(c10510, c10510 != c10510.f73596.f38067);
                C14769 c14769Mo9323 = c10510.mo9323();
                C14769 c14769Mo9324 = c10510.f73596.f38067.mo9323();
                boolean zMo45003 = c10510.mo45003();
                C24705 c24705 = this.f74641;
                if (zMo45003) {
                    c10510.f33437 = c24705.m55124(c14769M54832);
                } else if (c14769Mo9324.m35550()) {
                    c10510.f33437 = c24705.m55095(c14769M54832, c14769Mo9324, c14769Mo9323);
                } else {
                    c10510.f33437 = c14769M54832;
                }
            }
        }
        return c10510.f33437;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        if (c17969.mo19992().mo18914()) {
            return this.f74641.m55144(c17969.mo19992());
        }
        if (c17969.mo19992().mo31586()) {
            return C14769.of((Object) c17969.mo19992());
        }
        return C14769.m35543();
    }

    public C22992(C24705 c24705) {
        this.f74641 = c24705;
    }
}
