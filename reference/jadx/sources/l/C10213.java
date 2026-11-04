package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes4.dex */
public class C10213 extends AbstractC15118 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C19406 f32655 = new C19406();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46055;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43865("descPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        AbstractC7629 abstractC7629M43838 = m43838();
        AbstractC18881 abstractC18881 = (AbstractC18881) m43848();
        this.f32655.m44913();
        this.f32655.m44909(abstractC7629M43838, abstractC18881, strArrM43831, strM43865, new C19164(this));
        return m43857();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
            c8614.m23216();
        }
        List listM44908 = this.f32655.m44908();
        if (listM44908.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) listM44908);
        c8615.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C19406 c19406 = this.f32655;
        AbstractC18881 abstractC18881M44911 = c19406.m44911();
        C6331.m18054(abstractC18881M44911.mo35579());
        AbstractC7629 abstractC7629M44912 = c19406.m44912();
        if (abstractC7629M44912 instanceof C11969) {
            C6331.m18055();
        } else if (abstractC7629M44912 instanceof AbstractC18881) {
            AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629M44912;
            if (abstractC18881.mo35579().equals(abstractC18881M44911.mo35579())) {
                return;
            }
            C6331.m18054(abstractC18881.mo35579());
        }
    }
}
