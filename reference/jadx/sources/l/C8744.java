package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۠ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public class C8744 extends AbstractC19594 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28446 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f28447;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f28448 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        int i;
        AbstractC22044[] abstractC22044ArrM35201 = C14584.m35201(m43831("ARG_PATHS"));
        int i2 = 0;
        boolean z = abstractC22044ArrM35201.length == 1;
        if (z) {
            m45192();
        }
        String strM43865 = m43865("password");
        boolean zM43847 = m43847("removeSource");
        int i3 = C3549.f12166;
        try {
            boolean z2 = C17719.f58226;
            int length = abstractC22044ArrM35201.length;
            long jMo4285 = 0;
            int i4 = 0;
            while (true) {
                i = 20;
                if (i4 >= length) {
                    break;
                }
                jMo4285 += abstractC22044ArrM35201[i4].mo4285() - ((long) 20);
                i4++;
            }
            C3374 c3374 = new C3374(jMo4285);
            int i5 = 5;
            if (!z) {
                c3374.m11078(new C19403(i5, this));
            }
            int length2 = abstractC22044ArrM35201.length;
            while (i2 < length2) {
                AbstractC22044 abstractC22044 = abstractC22044ArrM35201[i2];
                String name = abstractC22044.getName();
                this.f28447 = name;
                mo29447(name);
                AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(name.endsWith(".encrypt") ? abstractC22044.m49874() : name.concat(".decrypt"));
                AbstractC22044 abstractC22044M49862 = abstractC22044M49868.mo2934() ? abstractC22044M49868.m49862(".tmp") : abstractC22044M49868;
                C3374 c3375 = new C3374(abstractC22044.mo4285() - ((long) i));
                if (z) {
                    c3375.m11078(new C19403(i5, this));
                } else {
                    c3375.m11078(new C9706(this));
                }
                C3549 c3549 = new C3549(abstractC22044, strM43865, new C9615(1, abstractC22044));
                try {
                    abstractC22044M49862.m49841(c3549, c3549.m11570(), new C2778(this, c3375, c3374));
                    c3549.close();
                    if (mo924()) {
                        abstractC22044M49862.mo4287();
                        break;
                    }
                    if (abstractC22044M49862 != abstractC22044M49868) {
                        abstractC22044M49862.m49845(abstractC22044M49868, (Runnable) null);
                    }
                    this.f28448.add(abstractC22044M49868.getName());
                    if (zM43847) {
                        abstractC22044.mo4287();
                    }
                    i2++;
                    i5 = 5;
                    i = 20;
                } catch (Throwable th) {
                    try {
                        c3549.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            return m43857();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46051;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        String str = this.f28447;
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
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        ArrayList arrayList = this.f28448;
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
