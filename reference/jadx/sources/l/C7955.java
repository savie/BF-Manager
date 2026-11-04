package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C7955 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public List f26434 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("output"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        ArrayList arrayList;
        EnumC20987 enumC20987;
        AbstractC22044 abstractC22044M43860 = m43860("output");
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("password");
        int iM43854 = m43854("level");
        boolean zM43847 = m43847("headerEncryption");
        boolean zM43848 = m43847("deleteSources");
        long jM43855 = m43855("splitSize");
        boolean zM43849 = m43847("replaceExisting");
        C13789 c13789M51419 = C22807.m51419((AbstractC18900) this, strArrM43831, false);
        if (mo924()) {
            return C12187.m30469();
        }
        C18003 c18003M41975 = C18003.m41975(abstractC22044M43860, zM43849 || jM43855 != -1);
        AbstractC22044 abstractC22044M41983 = c18003M41975.m41983();
        ArrayList arrayList2 = new ArrayList();
        C4234 c4234 = new C4234();
        c4234.f15450 = c13789M51419.f43741.size();
        c4234.f15449 = iM43854;
        c4234.f15448 = zM43847;
        try {
            try {
                C0505.m2472(c4234, new C0497(this, jM43855, abstractC22044M41983, arrayList2, strM43865, c13789M51419));
                if (mo924()) {
                    C22807.m51420(arrayList2);
                    abstractC22044M41983.mo4287();
                    return C12187.m30469();
                }
                if (jM43855 == -1) {
                    enumC20987 = EnumC20987.NONE;
                } else {
                    enumC20987 = EnumC20987.SEVEN_ZIP;
                }
                this.f26434 = c18003M41975.m41982(arrayList2, enumC20987);
                if (mo924()) {
                    return C12187.m30469();
                }
                if (zM43848) {
                    C22807.m51423(this, strArrM43831, this.f26434, c13789M51419.m33697());
                }
                return C12187.m30468();
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                C22807.m51420(arrayList);
                abstractC22044M41983.mo4287();
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, C22807.m51418(this.f26434));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
