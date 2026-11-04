package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܿܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes5.dex */
public class C18418 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f59991 = new ArrayList();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f59992;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46055;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (m43863(c8614)) {
            ArrayList arrayList = this.f59991;
            if (arrayList.isEmpty()) {
                return;
            }
            c8614.m23176((Collection) arrayList);
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18054(this.f59992.mo35579());
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        this.f59992 = (AbstractC18881) m43838();
        int i = 0;
        while (i < strArrM43831.length) {
            if (mo924()) {
                return C12187.m30469();
            }
            String str = strArrM43831[i];
            String strM28558 = C11293.m28558(str);
            mo29447(strM28558);
            i++;
            m43862(i, strArrM43831.length);
            try {
                this.f59992.mo35571(str, C11293.m28549(strM43865, strM28558));
                this.f59991.add(strM28558);
            } catch (Exception e) {
                throw new Exception(C21576.m49059(R.string.MT_Protector, strM28558), e);
            }
        }
        return C12187.m30468();
    }
}
