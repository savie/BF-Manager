package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C18396 extends AbstractC19594 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f59919 = "null";

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f59918 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, this.f59919);
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
        AbstractC22044 abstractC22044M43860 = m43860("outputDir");
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("password");
        int iM43854 = m43854("level");
        boolean zM43847 = m43847("headerEncryption");
        boolean zM43848 = m43847("deleteSources");
        long jM43855 = m43855("splitSize");
        int length = strArrM43831.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f59918;
            if (i < length) {
                StringBuilder sb = new StringBuilder();
                sb.append(C21576.m49088(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                int i3 = i + 1;
                sb.append(i3);
                sb.append("/");
                sb.append(length);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                mo16837(sb.toString());
                m43862(i3, length);
                AbstractC22044 abstractC22044M35193 = C14584.m35193(strArrM43831[i], new String[0]);
                AbstractC22044 abstractC22044M49839 = abstractC22044M43860.m49876((abstractC22044M35193.mo4281() ? abstractC22044M35193.getName() : abstractC22044M35193.m49874()) + ".7z").m49839(true);
                this.f59919 = abstractC22044M49839.getName();
                C13789 c13789M51419 = C22807.m51419((AbstractC18900) this, new String[]{strArrM43831[i]}, false);
                int iM33697 = c13789M51419.m33697() + i2;
                if (mo924()) {
                    return C12187.m30469();
                }
                C4234 c4234 = new C4234();
                c4234.f15450 = c13789M51419.f43741.size();
                c4234.f15449 = iM43854;
                c4234.f15448 = zM43847;
                ArrayList arrayList3 = new ArrayList();
                try {
                    AbstractC22044 abstractC22044 = abstractC22044M43860;
                    int i4 = iM43854;
                    boolean z = zM43847;
                    int i5 = length;
                    try {
                        C0505.m2472(c4234, new C21380(this, jM43855, abstractC22044M49839, arrayList3, strM43865, c13789M51419));
                        if (mo924()) {
                            C22807.m51420(arrayList3);
                            return C12187.m30469();
                        }
                        arrayList2.addAll(arrayList3);
                        i = i3;
                        i2 = iM33697;
                        abstractC22044M43860 = abstractC22044;
                        iM43854 = i4;
                        zM43847 = z;
                        length = i5;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList3;
                        C22807.m51420(arrayList);
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList3;
                }
            } else {
                if (!mo924() && zM43848) {
                    C22807.m51423(this, strArrM43831, arrayList2, i2);
                }
                return m43857();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, C22807.m51418((List) this.f59918));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
