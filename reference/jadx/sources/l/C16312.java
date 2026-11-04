package l;

import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ܶ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16312 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f52957;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC17058 f52958;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f52956 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f52959 = new ConcurrentMapC17249();

    public C16312(InterfaceC17058 interfaceC17058, boolean z) {
        this.f52958 = interfaceC17058;
        this.f52957 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private Object m38696(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() % 100;
        ConcurrentMapC17249 concurrentMapC17249 = this.f52959;
        if (jCurrentTimeMillis == 0) {
            C1170.removeIf(concurrentMapC17249.entrySet(), new C25264());
        }
        return ((C17804) C23217.compute(concurrentMapC17249, str, new C11837())).f58425;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map m38703(String str) {
        boolean z = this.f52957;
        String strM20187 = AbstractC7364.m20187(str);
        String lowerCase = z ? strM20187.toLowerCase() : strM20187;
        synchronized (m38696(lowerCase)) {
            Map map = (Map) this.f52956.get(lowerCase);
            if (map != null) {
                return map;
            }
            List listMo12539 = this.f52958.mo12539(strM20187);
            boolean z2 = this.f52957;
            if (z2 != z) {
                if (z2) {
                    strM20187 = strM20187.toLowerCase();
                }
                lowerCase = strM20187;
                z = z2;
            }
            return m38695(lowerCase, listMo12539, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m38695(String str, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String strMo12541 = this.f52958.mo12541(obj);
            if (z) {
                strMo12541 = strMo12541.toLowerCase();
            }
            if (!strMo12541.equals(".") && !strMo12541.equals("..")) {
                linkedHashMap.put(strMo12541, obj);
            }
        }
        this.f52956.put(str, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38701(String str) {
        Object objM38697 = m38697(C11293.m28556(str), C11293.m28558(str));
        return objM38697 != null && this.f52958.mo12540(objM38697);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m38697(String str, String str2) {
        if (this.f52957) {
            str2 = str2.toLowerCase();
        }
        return m38703(str).get(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38699(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        if (this.f52957) {
            strM20187 = strM20187.toLowerCase();
        }
        synchronized (m38696(strM20187)) {
            this.f52956.remove(strM20187);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38698() {
        synchronized (this) {
            this.f52956.clear();
            this.f52959.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38700(boolean z) {
        if (this.f52957 != z) {
            this.f52957 = z;
            m38698();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m38702(String str) {
        String strSubstring;
        String str2;
        String strM28556 = C11293.m28556(str);
        String strM28558 = C11293.m28558(str);
        if (strM28556 == null) {
            return str;
        }
        m38699(strM28556);
        if (m38697(strM28556, strM28558) != null) {
            int iLastIndexOf = strM28558.lastIndexOf(46);
            int i = 0;
            if (iLastIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring2 = strM28558.substring(0, iLastIndexOf);
                strSubstring = strM28558.substring(iLastIndexOf);
                strM28558 = strSubstring2;
            }
            Matcher matcher = AbstractC22044.f71091.matcher(strM28558);
            if (matcher.matches()) {
                try {
                    i = Integer.parseInt(matcher.group(2));
                    strM28558 = matcher.group(1);
                } catch (Exception unused) {
                }
            }
            String strM34972 = C14483.m34972(strM28558, " (");
            String strM56409 = C25272.m56409(MotionUtils.EASING_TYPE_FORMAT_END, strSubstring);
            do {
                i++;
                str2 = strM34972 + i + strM56409;
            } while (m38697(strM28556, str2) != null);
            strM28558 = str2;
        }
        return C14483.m34972(strM28556, strM28558);
    }
}
