package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16414 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17119 m38635(String str) {
        if (str != null && !C12529.m31145((CharSequence) str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    String strGroup2 = matcher.group(2);
                    Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
                    if (numValueOf2 != null) {
                        int iIntValue2 = numValueOf2.intValue();
                        String strGroup3 = matcher.group(3);
                        Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
                        if (numValueOf3 != null) {
                            int iIntValue3 = numValueOf3.intValue();
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            C13465.m32967(strGroup4, "description");
                            return new C17119(strGroup4, iIntValue, iIntValue2, iIntValue3, 0);
                        }
                    }
                }
            }
        }
        return null;
    }
}
