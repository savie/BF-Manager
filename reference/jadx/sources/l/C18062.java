package l;

import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ᩳ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18062 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f57767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15241 f57768;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f57766 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f57765 = new ConcurrentMapC13783();

    public C18062(InterfaceC15241 interfaceC15241, boolean z) {
        this.f57768 = interfaceC15241;
        this.f57767 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private Object m42056(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() % 100;
        ConcurrentMapC13783 concurrentMapC13783 = this.f57765;
        if (jCurrentTimeMillis == 0) {
            C9030.removeIf(concurrentMapC13783.entrySet(), new C23002());
        }
        return ((C21590) C2492.compute(concurrentMapC13783, str, new C6773())).f70051;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map m42057(String str) {
        boolean z = this.f57767;
        String strM28608 = AbstractC11462.m28608(str);
        String lowerCase = z ? strM28608.toLowerCase() : strM28608;
        synchronized (m42056(lowerCase)) {
            Map map = (Map) this.f57766.get(lowerCase);
            if (map != null) {
                return map;
            }
            List listMo25906 = this.f57768.mo25906(strM28608);
            boolean z2 = this.f57767;
            if (z2 != z) {
                if (z2) {
                    strM28608 = strM28608.toLowerCase();
                }
                lowerCase = strM28608;
                z = z2;
            }
            return m42055(lowerCase, listMo25906, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m42055(String str, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String strMo25908 = this.f57768.mo25908(obj);
            if (z) {
                strMo25908 = strMo25908.toLowerCase();
            }
            if (!strMo25908.equals(".") && !strMo25908.equals("..")) {
                linkedHashMap.put(strMo25908, obj);
            }
        }
        this.f57766.put(str, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42062(String str) {
        Object objM42058 = m42058(C6730.m18172(str), C6730.m18175(str));
        return objM42058 != null && this.f57768.mo25907(objM42058);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42058(String str, String str2) {
        if (this.f57767) {
            str2 = str2.toLowerCase();
        }
        return m42057(str).get(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42060(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        if (this.f57767) {
            strM28608 = strM28608.toLowerCase();
        }
        synchronized (m42056(strM28608)) {
            this.f57766.remove(strM28608);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42059() {
        synchronized (this) {
            this.f57766.clear();
            this.f57765.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42061(boolean z) {
        if (this.f57767 != z) {
            this.f57767 = z;
            m42059();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m42063(String str) {
        String strSubstring;
        String str2;
        String strM18172 = C6730.m18172(str);
        String strM18175 = C6730.m18175(str);
        if (strM18172 == null) {
            return str;
        }
        m42060(strM18172);
        if (m42058(strM18172, strM18175) != null) {
            int iLastIndexOf = strM18175.lastIndexOf(46);
            int i = 0;
            if (iLastIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring2 = strM18175.substring(0, iLastIndexOf);
                strSubstring = strM18175.substring(iLastIndexOf);
                strM18175 = strSubstring2;
            }
            Matcher matcher = AbstractC20745.f67497.matcher(strM18175);
            if (matcher.matches()) {
                try {
                    i = Integer.parseInt(matcher.group(2));
                    strM18175 = matcher.group(1);
                } catch (Exception unused) {
                }
            }
            String strM37076 = C15489.m37076(strM18175, " (");
            String strM1693 = C0252.m1693(MotionUtils.EASING_TYPE_FORMAT_END, strSubstring);
            do {
                i++;
                str2 = strM37076 + i + strM1693;
            } while (m42058(strM18172, str2) != null);
            strM18175 = str2;
        }
        return C15489.m37076(strM18172, strM18175);
    }
}
