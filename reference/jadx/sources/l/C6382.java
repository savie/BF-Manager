package l;

import android.os.Build;
import com.umeng.commonsdk.statistics.noise.Defcon;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6382 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21561;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21563;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21564;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21565;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 f21567;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21569;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21570;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f21571;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21566 = C14584.m35193(C14584.m35185(), new String[0]);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21568 = C14584.m35191(C21576.m49072());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f21562 = C14584.m35191(C21576.m49074());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18129() {
        Iterator it = f21565.mo4299(true).iterator();
        while (it.hasNext()) {
            ((AbstractC22044) it.next()).mo4296();
        }
        Iterator it2 = f21569.mo4299(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC22044) it2.next()).mo4296();
        }
        f21571 = true;
    }

    static {
        File externalCacheDir = C21576.m49084().getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = C21576.m49074();
        }
        AbstractC22044 abstractC22044M35191 = C14584.m35191(externalCacheDir);
        f21564 = abstractC22044M35191;
        File externalFilesDir = C21576.m49084().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = C21576.m49072();
        }
        AbstractC22044 abstractC22044M35192 = C14584.m35191(externalFilesDir);
        f21570 = abstractC22044M35192;
        AbstractC22044 abstractC22044M49876 = abstractC22044M35192.m49876("temp");
        f21563 = abstractC22044M49876;
        f21565 = abstractC22044M49876.m49876("CleanOnExit");
        f21569 = abstractC22044M35191.m49876("CleanOnExit");
        f21561 = abstractC22044M35191.m49876("temp");
        f21571 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m18134() {
        AbstractC22044 abstractC22044M49876 = f21567;
        AbstractC22044 abstractC22044 = f21566;
        if (abstractC22044M49876 == null) {
            abstractC22044M49876 = abstractC22044.m49876("MT2");
        }
        if (!m18133(abstractC22044M49876)) {
            abstractC22044M49876 = abstractC22044.m49876("MT2");
            if (m18133(abstractC22044M49876)) {
                f21567 = abstractC22044M49876;
                C19632.m45273();
            }
        }
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18133(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo4281()) {
            return true;
        }
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        return abstractC22044.mo4274();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m18137(String str) {
        int i = C14584.f45961;
        boolean zEquals = "/sdcard".equals(str);
        AbstractC22044 abstractC22044 = f21566;
        if (zEquals || abstractC22044.mo4294().equals(str)) {
            return abstractC22044;
        }
        String str2 = abstractC22044.mo4294() + "/";
        if (str.startsWith(str2)) {
            return abstractC22044.m49876(str.substring(str2.length()));
        }
        if (str.startsWith("/sdcard/")) {
            return abstractC22044.m49876(str.substring(8));
        }
        return C14584.m35193(str, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18128(String str) {
        String strSubstring;
        String string;
        AbstractC22044 abstractC22044M49876 = f21566;
        String strMo4294 = abstractC22044M49876.mo4294();
        if (str.equals("/sdcard") || str.startsWith("/sdcard/")) {
            String strM18136 = m18136(str);
            if (strM18136.equals("/sdcard")) {
                return strM18136;
            }
            strSubstring = strM18136.substring(8);
            strMo4294 = "/sdcard";
        } else {
            if (!str.equals(strMo4294)) {
                if (!str.startsWith(strMo4294 + "/")) {
                    return str;
                }
            }
            String strM18137 = m18136(str);
            if (strM18137.equals(strMo4294)) {
                return strM18137;
            }
            strSubstring = strM18137.substring(strMo4294.length() + 1);
        }
        StringBuilder sbM10405 = C3188.m10405(strMo4294, "/");
        String[] strArrSplit = strSubstring.split("/");
        StringBuilder sb = new StringBuilder(strSubstring.length());
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            String str3 = null;
            try {
                for (String str4 : abstractC22044M49876.mo4282()) {
                    if (str4.equals(str2)) {
                        str3 = str4;
                        break;
                    }
                    if (str3 == null && str4.equalsIgnoreCase(str2)) {
                        str3 = str4;
                    }
                }
            } catch (Exception unused) {
            }
            if (str3 == null) {
                if (sb.length() > 0) {
                    sb.append('/');
                }
                for (int i2 = i; i2 < strArrSplit.length; i2++) {
                    if (i2 > i) {
                        sb.append('/');
                    }
                    sb.append(strArrSplit[i2]);
                }
                string = sb.toString();
                sbM10405.append(string);
                return sbM10405.toString();
            }
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(str3);
            abstractC22044M49876 = abstractC22044M49876.m49876(str3);
        }
        string = sb.toString();
        sbM10405.append(string);
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m18136(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m18139(String str) {
        AbstractC22044 abstractC22044M18137 = m18137(str);
        if (!m18133(abstractC22044M18137)) {
            return false;
        }
        f21567 = abstractC22044M18137;
        C19632.m45273();
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m18135(String str) {
        f21567 = m18137(str);
        C19632.m45273();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m18138() {
        final boolean z = f21571;
        f21571 = false;
        C5261.f18540.execute(new Runnable() { // from class: l.᩵ۨᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C6382.m18132(z);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18132(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (AbstractC22044 abstractC22044 : f21563.mo4299(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC22044.mo4286()) > Defcon.MILLIS_8_HOURS) {
                abstractC22044.mo4296();
                abstractC22044.mo4294();
            } else {
                arrayList.add(abstractC22044);
            }
        }
        if (z) {
            m18130(arrayList);
        }
        arrayList.clear();
        for (AbstractC22044 abstractC22045 : f21561.mo4299(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC22045.mo4286()) > Defcon.MILLIS_8_HOURS) {
                abstractC22045.mo4296();
                abstractC22045.mo4294();
            } else {
                arrayList.add(abstractC22045);
            }
        }
        if (z) {
            m18130(arrayList);
        }
        arrayList.clear();
        for (AbstractC22044 abstractC22046 : f21569.mo4299(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC22046.mo4286()) > Defcon.MILLIS_8_HOURS) {
                abstractC22046.mo4296();
                abstractC22046.mo4294();
            } else {
                arrayList.add(abstractC22046);
            }
        }
        if (z) {
            m18130(arrayList);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC22044 abstractC22044M49876 = f21566.m49876("Android/mt_install_tmp.apk");
            if (abstractC22044M49876.mo2934()) {
                abstractC22044M49876.mo4296();
            }
        }
        if (C19632.m45281()) {
            try {
                int i = Integer.parseInt(C21576.f68932.getString("auto_clean_recycle_bin", "0"));
                if (i > 0) {
                    C19632.m45275(jCurrentTimeMillis - (((long) (i * 86400)) * 1000), false, new C12347(), null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18130(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m18131((AbstractC22044) it.next(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C24282) it2.next()).f78597;
        }
        long j2 = 209715200;
        if (j <= j2) {
            return;
        }
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C24282 c24282 = (C24282) arrayList2.get(i);
            if (c24282.f78596.mo4296()) {
                c24282.f78596.mo4294();
                j -= c24282.f78597;
                if (j <= j2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18131(AbstractC22044 abstractC22044, ArrayList arrayList) {
        if (abstractC22044.mo4281()) {
            List listMo4299 = abstractC22044.mo4299(true);
            if (listMo4299.isEmpty()) {
                abstractC22044.mo4296();
                return;
            }
            Iterator it = listMo4299.iterator();
            while (it.hasNext()) {
                m18131((AbstractC22044) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(new C24282(abstractC22044));
    }
}
