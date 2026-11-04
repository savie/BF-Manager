package l;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10440 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f33172;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f33173;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f33174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f33175 = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33176;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PointF f33177;

    static {
        String str = C7116.f23455;
        Locale locale = Locale.US;
        f33173 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f33174 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f33172 = Pattern.compile("\\\\an(\\d+)");
    }

    public C10440(int i, PointF pointF) {
        this.f33176 = i;
        this.f33177 = pointF;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10440 m26794(String str) {
        int iM5318;
        Matcher matcher = f33175.matcher(str);
        PointF pointF = null;
        int i = -1;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            try {
                PointF pointFM26796 = m26796(strGroup);
                if (pointFM26796 != null) {
                    pointF = pointFM26796;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f33172.matcher(strGroup);
                if (matcher2.find()) {
                    String strGroup2 = matcher2.group(1);
                    strGroup2.getClass();
                    iM5318 = C1492.m5318(strGroup2);
                } else {
                    iM5318 = -1;
                }
                if (iM5318 != -1) {
                    i = iM5318;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new C10440(i, pointF);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m26795(String str) {
        return f33175.matcher(str).replaceAll("");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static PointF m26796(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f33173.matcher(str);
        Matcher matcher2 = f33174.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                C1896.m6513("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
