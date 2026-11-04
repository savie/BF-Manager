package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public class C20876 extends AbstractC15118 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66820 = 0;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f66822;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C1485 f66824 = new C1485();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C19406 f66821 = new C19406();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f66823 = true;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46058;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        if (m43847("streamMode")) {
            return C21576.m49059(R.string.MT_Protector, m43850("targetPath"));
        }
        return this.f66823 ? C21576.m49059(R.string.MT_Protector, C21576.m49088(R.string.MT_Protector).toLowerCase()) : C21576.m49059(R.string.MT_Protector, m43850("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
        if (m43847("streamMode")) {
            return;
        }
        m36392(m43867("ARG_MSG_FROM"), C21576.m49088(R.string.MT_Protector).toLowerCase());
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        AbstractC7629 abstractC7629;
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        AbstractC18881 abstractC18881 = (AbstractC18881) m43838();
        AbstractC18881 abstractC18882 = (AbstractC18881) m43848();
        boolean zM43847 = m43847("streamMode");
        if (zM43847) {
            abstractC7629 = abstractC18881;
        } else {
            AbstractC22044 abstractC22044M49857 = C6382.f21563.m49857("");
            this.f66822 = abstractC22044M49857;
            abstractC22044M49857.m49853();
            this.f66824.m5294(abstractC18881, abstractC18882, strM43865, strArrM43831, this.f66822.mo4294(), new C16400(this));
            if (mo924()) {
                return C12187.m30469();
            }
            m43868(R.string.MT_Protector);
            mo16841("...");
            m36394(false);
            m36392(C21576.m49088(R.string.MT_Protector).toLowerCase(), m43867("ARG_MSG_TO"));
            C14426 c14426 = new C14426(this.f66824.m5292());
            strArrM43831 = (String[]) C1170.stream(c14426.mo20830("/", true)).map(new C8417(1)).toArray(new C17892());
            this.f66821.m44910(new C23860(this));
            abstractC7629 = c14426;
        }
        C3722 c3722 = new C3722(this, zM43847);
        this.f66821.m44909(abstractC7629, abstractC18882, strArrM43831, strM43865, c3722);
        return m43857();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
        List listM44908 = this.f66821.m44908();
        if (listM44908.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) listM44908);
        c8615.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044 = this.f66822;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
        C6331.m18055();
        AbstractC18881 abstractC18881M44911 = this.f66821.m44911();
        if (abstractC18881M44911 != null) {
            C6331.m18054(abstractC18881M44911.mo35579());
        }
    }
}
