package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7672 extends AbstractC19594 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25266 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public HashSet f25267 = new HashSet();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46046;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        AbstractC22044[] abstractC22044Arr = (AbstractC22044[]) C13847.stream(m43831("ARG_PATHS")).map(new C9714(1)).toArray(new C18113(0));
        int iM43854 = m43854("dexVersion");
        boolean zM43847 = m43847("onlyFixHeader");
        boolean z = !zM43847 && m43847("replaceWithNop");
        int length = abstractC22044Arr.length;
        int i = 0;
        while (i < length) {
            AbstractC22044 abstractC22044 = abstractC22044Arr[i];
            AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
            int i2 = i + 1;
            mo29447(abstractC22044.getName());
            m45194(0);
            mo16839((i2 * 100) / length);
            try {
                C25308.m56570(abstractC22044, abstractC22044M49862, iM43854, zM43847, z, new C0214(this));
                if (mo924()) {
                    abstractC22044M49862.mo4296();
                    return C12187.m30469();
                }
                if (ApplicationC17729.f58258.getBoolean("dfb", true)) {
                    abstractC22044.m49867();
                } else {
                    abstractC22044.mo4287();
                }
                abstractC22044M49862.m49845(abstractC22044, (Runnable) null);
                this.f25267.add(abstractC22044.getName());
                i = i2;
            } catch (Exception e) {
                abstractC22044M49862.mo4296();
                throw new Exception(e.getMessage() + " (" + abstractC22044.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
            }
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (m43863(c8614)) {
            if (!c12187.m30472()) {
                c8614.m23209();
            }
            HashSet hashSet = this.f25267;
            if (hashSet.isEmpty()) {
                return;
            }
            c8614.m23176((Collection) hashSet);
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49088(R.string.MT_Protector);
    }
}
