package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۤܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes4.dex */
public class C11003 extends AbstractC19594 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f34757;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f34758 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46043;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        String str = this.f34757;
        if (str == null) {
            str = "null";
        }
        return C21576.m49059(R.string.MT_Protector, str, C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        AbstractC22044[] abstractC22044ArrM35201 = C14584.m35201(m43831("ARG_PATHS"));
        boolean z = abstractC22044ArrM35201.length == 1;
        if (z) {
            m45192();
        }
        String strM43865 = m43865("password");
        boolean zM43847 = m43847("removeSource");
        long jMo4285 = 0;
        for (AbstractC22044 abstractC22044 : abstractC22044ArrM35201) {
            jMo4285 += abstractC22044.mo4285();
        }
        C3374 c3374 = new C3374(jMo4285);
        if (!z) {
            c3374.m11078(new C9492(3, this));
        }
        for (AbstractC22044 abstractC22045 : abstractC22044ArrM35201) {
            String name = abstractC22045.getName();
            this.f34757 = name;
            mo29447(name);
            AbstractC22044 abstractC22044M49868 = abstractC22045.m49868(name + ".encrypt");
            C3374 c3375 = new C3374(abstractC22045.mo4285());
            if (z) {
                c3375.m11078(new C9492(3, this));
            } else {
                c3375.m11078(new C21029(this));
            }
            C12498 c12498 = new C12498(abstractC22044M49868.m49869(), strM43865, 1, true);
            try {
                abstractC22045.m49842(c12498, new C22192(this, c3375, c3374));
                c12498.close();
                if (mo924()) {
                    abstractC22044M49868.mo4287();
                    break;
                }
                this.f34758.add(abstractC22044M49868.getName());
                if (zM43847) {
                    abstractC22045.mo4287();
                }
            } catch (Throwable th) {
                try {
                    c12498.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return m43857();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        ArrayList arrayList = this.f34758;
        if (arrayList.isEmpty() || !m43863(c8614)) {
            return;
        }
        if (!mo924()) {
            c8614.m23209();
        }
        c8614.m23176((Collection) arrayList);
        c8614.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
