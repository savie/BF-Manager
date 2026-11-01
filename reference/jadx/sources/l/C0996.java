package l;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0996 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f4654 = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f4655;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f4656;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f4657;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PointF f4659;

    static {
        String str = C17983.f57504;
        Locale locale = Locale.US;
        f4657 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f4655 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f4656 = Pattern.compile("\\\\an(\\d+)");
    }

    public C0996(int i, PointF pointF) {
        this.f4658 = i;
        this.f4659 = pointF;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0996 m3809(String str) {
        int iM32121;
        Matcher matcher = f4654.matcher(str);
        PointF pointF = null;
        int i = -1;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            try {
                PointF pointFM3811 = m3811(strGroup);
                if (pointFM3811 != null) {
                    pointF = pointFM3811;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f4656.matcher(strGroup);
                if (matcher2.find()) {
                    String strGroup2 = matcher2.group(1);
                    strGroup2.getClass();
                    iM32121 = C12992.m32121(strGroup2);
                } else {
                    iM32121 = -1;
                }
                if (iM32121 != -1) {
                    i = iM32121;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new C0996(i, pointF);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m3810(String str) {
        return f4654.matcher(str).replaceAll("");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static PointF m3811(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f4657.matcher(str);
        Matcher matcher2 = f4655.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                C0303.m1851("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f, Float.parseFloat(strGroup2.trim()));
    }
}
