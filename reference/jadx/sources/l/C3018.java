package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes3.dex */
public class C3018 extends AbstractC0656 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C16943 f11275 = new C16943();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5716;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41585("descPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        AbstractC9677 abstractC9677M41560 = m41560();
        AbstractC12233 abstractC12233 = (AbstractC12233) m41574();
        this.f11275.m39668();
        this.f11275.m39670(abstractC9677M41560, abstractC12233, strArrM41566, strM41585, new C9370(this));
        return m41583();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
            c11545.m28830();
        }
        List listM39669 = this.f11275.m39669();
        if (listM39669.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) listM39669);
        c11546.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C16943 c16943 = this.f11275;
        AbstractC12233 abstractC12233M39672 = c16943.m39672();
        C21094.m47529(abstractC12233M39672.mo10276());
        AbstractC9677 abstractC9677M39673 = c16943.m39673();
        if (abstractC9677M39673 instanceof C21611) {
            C21094.m47530();
        } else if (abstractC9677M39673 instanceof AbstractC12233) {
            AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677M39673;
            if (abstractC12233.mo10276().equals(abstractC12233M39672.mo10276())) {
                return;
            }
            C21094.m47529(abstractC12233.mo10276());
        }
    }
}
