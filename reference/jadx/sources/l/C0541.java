package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.֡ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes3.dex */
public class C0541 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f2266 = new ArrayList();

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f2265 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo2535() {
        return false;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12187 mo2531() {
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        C6265.m17912(strM43865, EnumC12230.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C3374 c3374 = new C3374(strArrM43831.length);
        c3374.m11078(new C24159(this));
        int length = 1000 / strArrM43831.length;
        if (length > 200) {
            length = 200;
        }
        for (String str : strArrM43831) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            String name = abstractC22044M35193.getName();
            c3374.m11079(1);
            mo29447(name);
            if (length > 0) {
                SystemClock.sleep(length);
            }
            try {
                C14584.m35193(C11293.m28549(strM43865, name), new String[0]).mo2946(abstractC22044M35193.mo2951());
                this.f2266.add(name);
            } catch (IOException unused) {
                this.f2265.add(name);
            }
            if (mo924()) {
                return C12187.m30469();
            }
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11983 mo2534() {
        return C14620.f46053;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2530(AbstractActivityC17204 abstractActivityC17204, C12187 c12187, boolean z) {
        ArrayList arrayList = this.f2265;
        if (arrayList.isEmpty()) {
            return;
        }
        abstractActivityC17204.m40397(R.string.MT_Protector, C24276.m54283(arrayList, "\n"), false);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
        ArrayList arrayList = this.f2266;
        if (arrayList.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) arrayList);
        c8615.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo2532() {
        return C21576.m49088(R.string.MT_Protector);
    }
}
