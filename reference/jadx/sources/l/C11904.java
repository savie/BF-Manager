package l;

import android.os.Build;
import com.umeng.commonsdk.statistics.noise.Defcon;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11904 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39935;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39936;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39939;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39940;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39942;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 f39943;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f39944;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39934 = C5553.m15313(C5553.m15305(), new String[0]);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39938 = C5553.m15311(C16737.m39285());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f39937 = C5553.m15311(C16737.m39282());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29689() {
        Iterator it = f39939.mo33983(true).iterator();
        while (it.hasNext()) {
            ((AbstractC20745) it.next()).mo24647();
        }
        Iterator it2 = f39942.mo33983(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC20745) it2.next()).mo24647();
        }
        f39944 = true;
    }

    static {
        File externalCacheDir = C16737.m39277().getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = C16737.m39282();
        }
        AbstractC20745 abstractC20745M15311 = C5553.m15311(externalCacheDir);
        f39940 = abstractC20745M15311;
        File externalFilesDir = C16737.m39277().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = C16737.m39285();
        }
        AbstractC20745 abstractC20745M15312 = C5553.m15311(externalFilesDir);
        f39935 = abstractC20745M15312;
        AbstractC20745 abstractC20745M46690 = abstractC20745M15312.m46690("temp");
        f39941 = abstractC20745M46690;
        f39939 = abstractC20745M46690.m46690("CleanOnExit");
        f39942 = abstractC20745M15311.m46690("CleanOnExit");
        f39936 = abstractC20745M15311.m46690("temp");
        f39944 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m29695() {
        AbstractC20745 abstractC20745M46690 = f39943;
        AbstractC20745 abstractC20745 = f39934;
        if (abstractC20745M46690 == null) {
            abstractC20745M46690 = abstractC20745.m46690("MT2");
        }
        if (!m29693(abstractC20745M46690)) {
            abstractC20745M46690 = abstractC20745.m46690("MT2");
            if (m29693(abstractC20745M46690)) {
                f39943 = abstractC20745M46690;
                C20370.m46015();
            }
        }
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29693(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33974()) {
            return true;
        }
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        return abstractC20745.mo33987();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m29697(String str) {
        int i = C5553.f19060;
        boolean zEquals = "/sdcard".equals(str);
        AbstractC20745 abstractC20745 = f39934;
        if (zEquals || abstractC20745.mo33986().equals(str)) {
            return abstractC20745;
        }
        String str2 = abstractC20745.mo33986() + "/";
        if (str.startsWith(str2)) {
            return abstractC20745.m46690(str.substring(str2.length()));
        }
        if (str.startsWith("/sdcard/")) {
            return abstractC20745.m46690(str.substring(8));
        }
        return C5553.m15313(str, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29688(String str) {
        String strSubstring;
        String string;
        AbstractC20745 abstractC20745M46690 = f39934;
        String strMo33986 = abstractC20745M46690.mo33986();
        if (str.equals("/sdcard") || str.startsWith("/sdcard/")) {
            String strM29694 = m29694(str);
            if (strM29694.equals("/sdcard")) {
                return strM29694;
            }
            strSubstring = strM29694.substring(8);
            strMo33986 = "/sdcard";
        } else {
            if (!str.equals(strMo33986)) {
                if (!str.startsWith(strMo33986 + "/")) {
                    return str;
                }
            }
            String strM29695 = m29694(str);
            if (strM29695.equals(strMo33986)) {
                return strM29695;
            }
            strSubstring = strM29695.substring(strMo33986.length() + 1);
        }
        StringBuilder sbM8976 = C3012.m8976(strMo33986, "/");
        String[] strArrSplit = strSubstring.split("/");
        StringBuilder sb = new StringBuilder(strSubstring.length());
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            String str3 = null;
            try {
                for (String str4 : abstractC20745M46690.mo33973()) {
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
                sbM8976.append(string);
                return sbM8976.toString();
            }
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(str3);
            abstractC20745M46690 = abstractC20745M46690.m46690(str3);
        }
        string = sb.toString();
        sbM8976.append(string);
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m29694(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m29687(String str) {
        AbstractC20745 abstractC20745M29697 = m29697(str);
        if (!m29693(abstractC20745M29697)) {
            return false;
        }
        f39943 = abstractC20745M29697;
        C20370.m46015();
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m29696(String str) {
        f39943 = m29697(str);
        C20370.m46015();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29698() {
        final boolean z = f39944;
        f39944 = false;
        C4716.f16636.execute(new Runnable() { // from class: l.ۙ᩵ۚ
            @Override // java.lang.Runnable
            public final void run() {
                C11904.m29692(z);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29692(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (AbstractC20745 abstractC20745 : f39941.mo33983(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC20745.mo33991()) > Defcon.MILLIS_8_HOURS) {
                abstractC20745.mo24647();
                abstractC20745.mo33986();
            } else {
                arrayList.add(abstractC20745);
            }
        }
        if (z) {
            m29690(arrayList);
        }
        arrayList.clear();
        for (AbstractC20745 abstractC20746 : f39936.mo33983(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC20746.mo33991()) > Defcon.MILLIS_8_HOURS) {
                abstractC20746.mo24647();
                abstractC20746.mo33986();
            } else {
                arrayList.add(abstractC20746);
            }
        }
        if (z) {
            m29690(arrayList);
        }
        arrayList.clear();
        for (AbstractC20745 abstractC20747 : f39942.mo33983(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC20747.mo33991()) > Defcon.MILLIS_8_HOURS) {
                abstractC20747.mo24647();
                abstractC20747.mo33986();
            } else {
                arrayList.add(abstractC20747);
            }
        }
        if (z) {
            m29690(arrayList);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC20745 abstractC20745M46690 = f39934.m46690("Android/mt_install_tmp.apk");
            if (abstractC20745M46690.mo33975()) {
                abstractC20745M46690.mo24647();
            }
        }
        if (C20370.m46024()) {
            try {
                int i = Integer.parseInt(C16737.f53615.getString("auto_clean_recycle_bin", "0"));
                if (i > 0) {
                    C20370.m46018(jCurrentTimeMillis - (((long) (i * 86400)) * 1000), false, new C14021(0), null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29690(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m29691((AbstractC20745) it.next(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C2730) it2.next()).f10507;
        }
        long j2 = 209715200;
        if (j <= j2) {
            return;
        }
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C2730 c2730 = (C2730) arrayList2.get(i);
            if (c2730.f10506.mo24647()) {
                c2730.f10506.mo33986();
                j -= c2730.f10507;
                if (j <= j2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29691(AbstractC20745 abstractC20745, ArrayList arrayList) {
        if (abstractC20745.mo33974()) {
            List listMo33983 = abstractC20745.mo33983(true);
            if (listMo33983.isEmpty()) {
                abstractC20745.mo24647();
                return;
            }
            Iterator it = listMo33983.iterator();
            while (it.hasNext()) {
                m29691((AbstractC20745) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(new C2730(abstractC20745));
    }
}
