package l;

import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.PowerManager;
import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC14748 extends Binder {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC2046 f48242;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f48244;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f48245;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4995 f48246;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f48247;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f48241 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48243 = -1;

    public BinderC14748(ServiceC2046 serviceC2046) {
        this.f48242 = serviceC2046;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m35345() {
        C4995 c4995 = this.f48246;
        if (c4995 == null) {
            return;
        }
        if (this.f48245) {
            C15829 c15829M37612 = C15829.m37612(0, c4995.f17392);
            c15829M37612.m37621(this.f48244, this.f48247);
            c15829M37612.m37622();
            return;
        }
        C15829.m37613((CharSequence) c4995.f17392);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35351(int i, int i2, boolean z) {
        this.f48245 = z;
        this.f48244 = i;
        this.f48247 = i2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m35361() {
        C4995 c4995 = this.f48246;
        return c4995 != null && c4995.m13847();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35364(C19107 c19107, boolean z) {
        C4995 c4995 = this.f48246;
        if (c4995 == null) {
            return;
        }
        if (c4995.m13847()) {
            C19562.m44663(this.f48246);
        }
        String str = this.f48246.f17392;
        C4995 c4995M44662 = C19562.m44662(m35344(), z, this.f48246.m13848());
        this.f48246 = c4995M44662;
        c4995M44662.f17392 = str;
        this.f48241.set(this.f48243, c4995M44662);
        c19107.m43903(this.f48246);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35355(C19107 c19107, boolean z) {
        if (this.f48246 == null) {
            C4995 c4995M44662 = C19562.m44662(m35344(), z, false);
            this.f48246 = c4995M44662;
            ServiceC2046 serviceC2046 = this.f48242;
            int i = serviceC2046.f7621 + 1;
            serviceC2046.f7621 = i;
            c4995M44662.m13846(i);
            ArrayList arrayList = this.f48241;
            this.f48243 = arrayList.size();
            arrayList.add(this.f48246);
            serviceC2046.m6548();
        }
        c19107.m43903(this.f48246);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m35366() {
        C4995 c4995 = this.f48246;
        if (c4995 != null) {
            return c4995.m13834().m15433().m13571();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35353(String str) {
        C4995 c4995 = this.f48246;
        if (c4995 != null) {
            c4995.m48569(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35363(int i) {
        if (this.f48246 != null) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f48246.m13839(127, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35354(C19107 c19107, int i) {
        if (i == this.f48243 || i < 0) {
            return;
        }
        ArrayList arrayList = this.f48241;
        if (i >= arrayList.size()) {
            return;
        }
        this.f48243 = i;
        C4995 c4995 = (C4995) arrayList.get(i);
        this.f48246 = c4995;
        c19107.m43903(c4995);
        m35345();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35356(C19107 c19107, boolean z, boolean z2, float f) {
        C4995 c4995M44662 = C19562.m44662(m35344(), z, z2);
        this.f48246 = c4995M44662;
        ServiceC2046 serviceC2046 = this.f48242;
        int i = serviceC2046.f7621 + 1;
        serviceC2046.f7621 = i;
        c4995M44662.m13846(i);
        this.f48246.m13837(f * serviceC2046.getResources().getDisplayMetrics().scaledDensity);
        int i2 = this.f48243 + 1;
        this.f48243 = i2;
        this.f48241.add(i2, this.f48246);
        c19107.m43903(this.f48246);
        m35345();
        serviceC2046.m6548();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m35348() {
        for (C4995 c4995 : this.f48241) {
            if (c4995 != null && c4995.m13834() != null) {
                c4995.m13834().f19121.m29725();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35358(C19107 c19107) {
        C4995 c4995 = this.f48246;
        if (c4995 == null) {
            return true;
        }
        if (c4995.m13847()) {
            C19562.m44663(this.f48246);
        }
        int i = this.f48243;
        ArrayList arrayList = this.f48241;
        arrayList.remove(i);
        this.f48242.m6548();
        if (arrayList.isEmpty()) {
            this.f48246 = null;
            this.f48243 = -1;
            return true;
        }
        if (this.f48243 >= arrayList.size()) {
            this.f48243 = arrayList.size() - 1;
        }
        C4995 c4996 = (C4995) arrayList.get(this.f48243);
        this.f48246 = c4996;
        c19107.m43903(c4996);
        m35345();
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35362() {
        ArrayList<C4995> arrayList = this.f48241;
        for (C4995 c4995 : arrayList) {
            if (c4995 != this.f48246) {
                C19562.m44663(c4995);
            }
        }
        arrayList.clear();
        C4995 c4996 = this.f48246;
        if (c4996 != null) {
            arrayList.add(c4996);
            this.f48243 = 0;
        }
        this.f48242.m6548();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35350() {
        ArrayList arrayList = this.f48241;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19562.m44663((C4995) it.next());
        }
        arrayList.clear();
        this.f48242.m6548();
        this.f48246 = null;
        this.f48243 = -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m35346() {
        return !this.f48241.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35357(boolean z) {
        ServiceC2046 serviceC2046 = this.f48242;
        if (serviceC2046.f7624 == null || !serviceC2046.f7624.isHeld()) {
            serviceC2046.f7624 = ((PowerManager) serviceC2046.getSystemService("power")).newWakeLock(1, serviceC2046.getPackageName() + ":MTermWakeLock");
            serviceC2046.f7624.acquire();
        }
        if (serviceC2046.f7622 == null || !serviceC2046.f7622.isHeld()) {
            serviceC2046.f7622 = ((WifiManager) serviceC2046.getApplicationContext().getSystemService("wifi")).createWifiLock(3, serviceC2046.getPackageName() + ":MTermWifiLock");
            serviceC2046.f7622.acquire();
        }
        if (!C14057.m34005(serviceC2046)) {
            C14057.m34006(serviceC2046);
        }
        if (z) {
            if (this.f48245) {
                C15829 c15829M37617 = C15829.m37617(R.string.MT_Protector, 0);
                c15829M37617.m37621(this.f48244, this.f48247);
                c15829M37617.m37622();
            } else {
                C15829.m37611(R.string.MT_Protector);
            }
        }
        serviceC2046.m6548();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35365(boolean z) {
        ServiceC2046 serviceC2046 = this.f48242;
        if (serviceC2046.f7624 != null) {
            if (serviceC2046.f7624.isHeld()) {
                serviceC2046.f7624.release();
            }
            serviceC2046.f7624 = null;
        }
        if (serviceC2046.f7622 != null) {
            if (serviceC2046.f7622.isHeld()) {
                serviceC2046.f7622.release();
            }
            serviceC2046.f7622 = null;
        }
        if (z) {
            if (this.f48245) {
                C15829 c15829M37617 = C15829.m37617(R.string.MT_Protector, 0);
                c15829M37617.m37621(this.f48244, this.f48247);
                c15829M37617.m37622();
            } else {
                C15829.m37611(R.string.MT_Protector);
            }
        }
        serviceC2046.m6548();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m35359() {
        ArrayList arrayList = this.f48241;
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            charSequenceArr[i] = ((C4995) arrayList.get(i)).f17392;
        }
        return charSequenceArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35349(int i) {
        if (i < 0) {
            return "";
        }
        ArrayList arrayList = this.f48241;
        return i >= arrayList.size() ? "" : ((C4995) arrayList.get(i)).f17392;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35352(int i, String str) {
        if (i >= 0) {
            ArrayList arrayList = this.f48241;
            if (i < arrayList.size()) {
                ((C4995) arrayList.get(i)).f17392 = str;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m35347() {
        return this.f48241.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35360() {
        return this.f48243;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m35344() {
        File file = new File(ApplicationC0716.f2988.getString("term_start_path", "/sdcard"));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return new File(C16737.m39285(), "term/home").getAbsolutePath();
    }
}
