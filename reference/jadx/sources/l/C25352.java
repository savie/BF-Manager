package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩻᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public class C25352 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f81863 = new ArrayList();

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f81864 = new ArrayList();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f81865;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo2535() {
        return false;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46052;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        String[] strArrM43831 = m43831("oldNames");
        String[] strArrM43832 = m43831("newNames");
        String strM43865 = m43865(MotionUtils.EASING_TYPE_PATH);
        this.f81865 = (AbstractC18881) m43838();
        C3374 c3374 = new C3374(strArrM43831.length);
        c3374.m11078(new C19301(this));
        for (int i = 0; i < strArrM43831.length; i++) {
            C13395 c13395 = new C13395(strArrM43831[i], strArrM43832[i]);
            c3374.m11079(1);
            mo29447(c13395.m33026());
            if (c13395.m33025(this.f81865, strM43865)) {
                this.f81863.add(c13395.m33027());
            } else {
                this.f81864.add(c13395.m33026());
            }
            if (mo924()) {
                return C12187.m30469();
            }
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2530(AbstractActivityC17204 abstractActivityC17204, C12187 c12187, boolean z) {
        ArrayList arrayList = this.f81864;
        if (arrayList.isEmpty()) {
            return;
        }
        C5938.m17255(abstractActivityC17204, arrayList);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (m43863(c8614)) {
            if (c12187.m30474()) {
                c8614.m23209();
                if (this.f81864.isEmpty()) {
                    C22673.m51152(R.string.MT_Protector);
                }
            }
            ArrayList arrayList = this.f81863;
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
        C6331.m18054(this.f81865.mo35579());
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49088(R.string.MT_Protector);
    }
}
