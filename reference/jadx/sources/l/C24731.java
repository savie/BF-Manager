package l;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6GO */
/* JADX INFO: loaded from: classes.dex */
public final class C24731 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f80045 = C16980.m40037(C24731.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f80044 = Pattern.compile("classes([1-9]\\d*)\\.dex");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24927 m55205(List list) {
        int iM55204;
        Iterator it = list.iterator();
        C24927 c24927 = null;
        int iM55205 = -1;
        while (it.hasNext()) {
            C24927 c24928 = (C24927) it.next();
            if (c24927 == null || ((iM55204 = m55204(c24928.m55573())) != -1 && (iM55205 == -1 || iM55204 < iM55205))) {
                iM55205 = m55204(c24928.m55573());
                c24927 = c24928;
            }
        }
        return c24927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55204(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        try {
            Matcher matcher = f80044.matcher(str);
            if (!matcher.matches()) {
                return -1;
            }
            String strGroup = matcher.group(1);
            if (strGroup.equals("1")) {
                return -1;
            }
            return Integer.parseInt(strGroup);
        } catch (Exception e) {
            f80045.mo13711("Failed to parse source classes index", e);
            return -1;
        }
    }
}
