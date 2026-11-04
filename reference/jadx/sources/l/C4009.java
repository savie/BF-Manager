package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public class C4009 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C22941 f13697;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String f13698;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C22941 f13699;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo2535() {
        return false;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        String strM43865 = m43865("inputPath1");
        String strM43866 = m43865("inputPath2");
        String strM43867 = m43867("zipPath1");
        String strM43868 = m43867("zipPath2");
        AbstractC18881 abstractC18881 = m43830().containsKey("statelessVisitor1") ? (AbstractC18881) C18070.m42101(m43829("statelessVisitor1"), false) : null;
        AbstractC18881 abstractC18882 = m43830().containsKey("statelessVisitor2") ? (AbstractC18881) C18070.m42101(m43829("statelessVisitor2"), false) : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z = strM43867 == null || strM43868 == null;
        boolean z2 = strM43867 == null && strM43868 == null;
        if (strM43867 != null) {
            C22941 c22941 = new C22941(strM43867);
            this.f13699 = c22941;
            C14449.m34880(map, c22941, strM43865, z);
            strM43865 = strM43867.concat(strM43865);
        } else if (abstractC18881 != null) {
            C14449.m34876(map, abstractC18881, strM43865, z2, "", this);
            strM43865 = abstractC18881.m43790() + strM43865;
        } else {
            C14449.m34878(map, C14584.m35193(strM43865, new String[0]), z2, "", this);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        if (strM43868 != null) {
            C22941 c22942 = new C22941(strM43868);
            this.f13697 = c22942;
            C14449.m34880(map2, c22942, strM43866, z);
            strM43866 = strM43868.concat(strM43866);
        } else if (abstractC18882 != null) {
            C14449.m34876(map2, abstractC18882, strM43866, z2, "", this);
            strM43866 = abstractC18882.m43790() + strM43866;
        } else {
            C14449.m34878(map2, C14584.m35193(strM43866, new String[0]), z2, "", this);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        this.f13698 = C7545.m20622(strM43865, strM43866, map, map2, new C24147(this));
        return m43857();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (this.f13698.isEmpty()) {
                C22673.m51159(R.string.MT_Protector);
                return;
            }
            String str = this.f13698;
            String strM49088 = C21576.m49088(R.string.MT_Protector);
            String strM43865 = m43865("saveAsPath");
            int i = C9341.f30354;
            ActivityC4300.m13685(main, str, strM49088, strM43865, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C20244.m46520(this.f13699);
        C20244.m46520(this.f13697);
        C6331.m18055();
    }
}
