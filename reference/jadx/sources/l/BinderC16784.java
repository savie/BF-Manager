package l;

import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.PowerManager;
import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC16784 extends Binder {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC17530 f54158;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f54159;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54160;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24244 f54162;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f54164;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f54161 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f54163 = -1;

    public BinderC16784(ServiceC17530 serviceC17530) {
        this.f54158 = serviceC17530;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m39625() {
        C24244 c24244 = this.f54162;
        if (c24244 == null) {
            return;
        }
        if (this.f54159) {
            C22673 c22673M51153 = C22673.m51153(0, c24244.f78531);
            c22673M51153.m51162(this.f54160, this.f54164);
            c22673M51153.m51163();
            return;
        }
        C22673.m51154((CharSequence) c24244.f78531);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39629(int i, int i2, boolean z) {
        this.f54159 = z;
        this.f54160 = i;
        this.f54164 = i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m39637() {
        C24244 c24244 = this.f54162;
        return c24244 != null && c24244.m54260();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39644(C8580 c8580, boolean z) {
        C24244 c24244 = this.f54162;
        if (c24244 == null) {
            return;
        }
        if (c24244.m54260()) {
            C8406.m22583(this.f54162);
        }
        String str = this.f54162.f78531;
        C24244 c24244M22582 = C8406.m22582(m39624(), z, this.f54162.m54261());
        this.f54162 = c24244M22582;
        c24244M22582.f78531 = str;
        this.f54161.set(this.f54163, c24244M22582);
        c8580.m23062(this.f54162);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39633(C8580 c8580, boolean z) {
        if (this.f54162 == null) {
            C24244 c24244M22582 = C8406.m22582(m39624(), z, false);
            this.f54162 = c24244M22582;
            ServiceC17530 serviceC17530 = this.f54158;
            int i = serviceC17530.f56980 + 1;
            serviceC17530.f56980 = i;
            c24244M22582.m54262(i);
            ArrayList arrayList = this.f54161;
            this.f54163 = arrayList.size();
            arrayList.add(this.f54162);
            serviceC17530.m41164();
        }
        c8580.m23062(this.f54162);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m39640() {
        C24244 c24244 = this.f54162;
        if (c24244 != null) {
            return c24244.m54258().m43268().m54887();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39631(String str) {
        C24244 c24244 = this.f54162;
        if (c24244 != null) {
            c24244.m23822(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39643(int i) {
        if (this.f54162 != null) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f54162.m54255(127, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39632(C8580 c8580, int i) {
        if (i == this.f54163 || i < 0) {
            return;
        }
        ArrayList arrayList = this.f54161;
        if (i >= arrayList.size()) {
            return;
        }
        this.f54163 = i;
        C24244 c24244 = (C24244) arrayList.get(i);
        this.f54162 = c24244;
        c8580.m23062(c24244);
        m39625();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39634(C8580 c8580, boolean z, boolean z2, float f) {
        C24244 c24244M22582 = C8406.m22582(m39624(), z, z2);
        this.f54162 = c24244M22582;
        ServiceC17530 serviceC17530 = this.f54158;
        int i = serviceC17530.f56980 + 1;
        serviceC17530.f56980 = i;
        c24244M22582.m54262(i);
        this.f54162.m54253(f * serviceC17530.getResources().getDisplayMetrics().scaledDensity);
        int i2 = this.f54163 + 1;
        this.f54163 = i2;
        this.f54161.add(i2, this.f54162);
        c8580.m23062(this.f54162);
        m39625();
        serviceC17530.m41164();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39626() {
        for (C24244 c24244 : this.f54161) {
            if (c24244 != null && c24244.m54258() != null) {
                c24244.m54258().f60472.m35812();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39636(C8580 c8580) {
        C24244 c24244 = this.f54162;
        if (c24244 == null) {
            return true;
        }
        if (c24244.m54260()) {
            C8406.m22583(this.f54162);
        }
        int i = this.f54163;
        ArrayList arrayList = this.f54161;
        arrayList.remove(i);
        this.f54158.m41164();
        if (arrayList.isEmpty()) {
            this.f54162 = null;
            this.f54163 = -1;
            return true;
        }
        if (this.f54163 >= arrayList.size()) {
            this.f54163 = arrayList.size() - 1;
        }
        C24244 c24245 = (C24244) arrayList.get(this.f54163);
        this.f54162 = c24245;
        c8580.m23062(c24245);
        m39625();
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39642() {
        ArrayList<C24244> arrayList = this.f54161;
        for (C24244 c24244 : arrayList) {
            if (c24244 != this.f54162) {
                C8406.m22583(c24244);
            }
        }
        arrayList.clear();
        C24244 c24245 = this.f54162;
        if (c24245 != null) {
            arrayList.add(c24245);
            this.f54163 = 0;
        }
        this.f54158.m41164();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39628() {
        ArrayList arrayList = this.f54161;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8406.m22583((C24244) it.next());
        }
        arrayList.clear();
        this.f54158.m41164();
        this.f54162 = null;
        this.f54163 = -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m39639() {
        return !this.f54161.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39635(boolean z) {
        ServiceC17530 serviceC17530 = this.f54158;
        if (serviceC17530.f56977 == null || !serviceC17530.f56977.isHeld()) {
            serviceC17530.f56977 = ((PowerManager) serviceC17530.getSystemService("power")).newWakeLock(1, serviceC17530.getPackageName() + ":MTermWakeLock");
            serviceC17530.f56977.acquire();
        }
        if (serviceC17530.f56978 == null || !serviceC17530.f56978.isHeld()) {
            serviceC17530.f56978 = ((WifiManager) serviceC17530.getApplicationContext().getSystemService("wifi")).createWifiLock(3, serviceC17530.getPackageName() + ":MTermWifiLock");
            serviceC17530.f56978.acquire();
        }
        if (!C21998.m49728(serviceC17530)) {
            C21998.m49729(serviceC17530);
        }
        if (z) {
            if (this.f54159) {
                C22673 c22673M51158 = C22673.m51158(R.string.MT_Protector, 0);
                c22673M51158.m51162(this.f54160, this.f54164);
                c22673M51158.m51163();
            } else {
                C22673.m51152(R.string.MT_Protector);
            }
        }
        serviceC17530.m41164();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39645(boolean z) {
        ServiceC17530 serviceC17530 = this.f54158;
        if (serviceC17530.f56977 != null) {
            if (serviceC17530.f56977.isHeld()) {
                serviceC17530.f56977.release();
            }
            serviceC17530.f56977 = null;
        }
        if (serviceC17530.f56978 != null) {
            if (serviceC17530.f56978.isHeld()) {
                serviceC17530.f56978.release();
            }
            serviceC17530.f56978 = null;
        }
        if (z) {
            if (this.f54159) {
                C22673 c22673M51158 = C22673.m51158(R.string.MT_Protector, 0);
                c22673M51158.m51162(this.f54160, this.f54164);
                c22673M51158.m51163();
            } else {
                C22673.m51152(R.string.MT_Protector);
            }
        }
        serviceC17530.m41164();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m39641() {
        ArrayList arrayList = this.f54161;
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            charSequenceArr[i] = ((C24244) arrayList.get(i)).f78531;
        }
        return charSequenceArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39627(int i) {
        if (i < 0) {
            return "";
        }
        ArrayList arrayList = this.f54161;
        return i >= arrayList.size() ? "" : ((C24244) arrayList.get(i)).f78531;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39630(int i, String str) {
        if (i >= 0) {
            ArrayList arrayList = this.f54161;
            if (i < arrayList.size()) {
                ((C24244) arrayList.get(i)).f78531 = str;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m39646() {
        return this.f54161.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39638() {
        return this.f54163;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m39624() {
        File file = new File(ApplicationC17729.f58262.getString("term_start_path", "/sdcard"));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return new File(C21576.m49072(), "term/home").getAbsolutePath();
    }
}
