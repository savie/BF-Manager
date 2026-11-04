package l;

import android.graphics.BitmapFactory;
import bin.mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6JI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3515 {
    /* JADX WARN: Code duplicated, block: B:65:0x00da A[PHI: r8
      0x00da: PHI (r8v4 int) = (r8v1 int), (r8v5 int) binds: [B:59:0x00b0, B:62:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23653 m11516(AbstractC13057 abstractC13057, C9044 c9044, C7837 c7837) {
        int i;
        boolean z;
        AbstractC13057.m32543(c7837);
        C15294 c15294Mo17423 = abstractC13057.mo17423();
        if (c9044 != null && !c9044.f29430.equals(c15294Mo17423)) {
            throw new C19770("Image changed before reading details");
        }
        String str = c9044 == null ? null : c9044.f29436;
        int i2 = 0;
        int iMax = c9044 == null ? 0 : c9044.f29428;
        int iMax2 = c9044 == null ? 0 : c9044.f29431;
        boolean z2 = true;
        int iM23690 = c9044 == null ? 1 : c9044.f29434;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = R.string.MT_Protector;
        try {
            if (c9044 == null || str == null) {
                try {
                    InputStream inputStreamMo17428 = abstractC13057.mo17428();
                    try {
                        C7753 c7753M43963 = C18940.m43963(inputStreamMo17428);
                        EnumC0295 enumC0295 = c7753M43963.f25517;
                        if (inputStreamMo17428 != null) {
                            inputStreamMo17428.close();
                        }
                        str = c7753M43963.f25516;
                        if (enumC0295 == EnumC0295.SVG) {
                            str = "image/svg+xml";
                        } else if (c9044 == null) {
                            try {
                                BitmapFactory.Options optionsM33213 = C13519.m33213(abstractC13057, C6808.f22671);
                                iMax = Math.max(0, optionsM33213.outWidth);
                                iMax2 = Math.max(0, optionsM33213.outHeight);
                                if (str == null) {
                                    str = optionsM33213.outMimeType;
                                }
                            } catch (IOException | RuntimeException unused) {
                                z = true;
                            }
                        }
                        z = false;
                        if (str == null && enumC0295 == EnumC0295.GIF) {
                            str = "image/gif";
                        }
                    } catch (Throwable th) {
                        if (inputStreamMo17428 == null) {
                            throw th;
                        }
                        try {
                            inputStreamMo17428.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException | RuntimeException unused2) {
                }
            } else {
                z = false;
            }
            if ("image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
                byte[] bArrM30956 = C12464.m30956(abstractC13057, str, c7837);
                if (bArrM30956 != null) {
                    C8826 c8826 = new C8826(new ByteArrayInputStream(C12464.m30957(bArrM30956)), 1);
                    m11518(c8826, arrayList);
                    m11520(c8826, arrayList2);
                    iM23690 = c8826.m23690(iM23690, "Orientation");
                    if (arrayList.size() + arrayList2.size() <= 0) {
                        i2 = R.string.MT_Protector;
                    }
                } else {
                    i2 = R.string.MT_Protector;
                }
            } else {
                i2 = R.string.MT_Protector;
            }
            z2 = z;
            i3 = i2;
        } catch (IOException | RuntimeException unused3) {
        }
        AbstractC13057.m32543(c7837);
        abstractC13057.m32544(c15294Mo17423);
        if (iM23690 < 5 || iM23690 > 8) {
            i = iMax2;
        } else {
            i = iMax;
            iMax = iMax2;
        }
        return new C23653(c15294Mo17423, str, iMax, i, arrayList, arrayList2, z2 ? R.string.MT_Protector : i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11518(C8826 c8826, ArrayList arrayList) {
        long jM11519;
        String strM11514 = m11514(c8826, "Make");
        String strM11515 = m11514(c8826, "Model");
        String strM11516 = m11515(c8826, "DateTimeOriginal", "OffsetTimeOriginal");
        int i = (strM11516 == null || (strM11514 == null && strM11515 == null)) ? R.string.MT_Protector : R.string.MT_Protector;
        if (strM11516 == null) {
            strM11516 = m11515(c8826, "DateTimeDigitized", "OffsetTimeDigitized");
        }
        m11517(i, strM11516, arrayList);
        m11517(R.string.MT_Protector, strM11514, arrayList);
        m11517(R.string.MT_Protector, strM11515, arrayList);
        m11517(R.string.MT_Protector, m11514(c8826, "LensModel"), arrayList);
        double dM23689 = c8826.m23689("FocalLength", Double.NaN);
        if (!m11521(dM23689)) {
            dM23689 = Double.NaN;
        }
        if (dM23689 > 0.0d) {
            m11517(R.string.MT_Protector, C8947.m23910(new StringBuilder(), m11513(dM23689), " mm"), arrayList);
        }
        double dM236810 = c8826.m23689("FNumber", Double.NaN);
        if (!m11521(dM236810)) {
            dM236810 = Double.NaN;
        }
        if (dM236810 > 0.0d) {
            m11517(R.string.MT_Protector, "f/" + m11513(dM236810), arrayList);
        }
        double dM236811 = c8826.m23689("ExposureTime", Double.NaN);
        if (!m11521(dM236811)) {
            dM236811 = Double.NaN;
        }
        if (dM236811 > 0.0d) {
            m11517(R.string.MT_Protector, dM236811 < 1.0d ? C8947.m23910(new StringBuilder("1/"), m11513(1.0d / dM236811), " s") : C8947.m23910(new StringBuilder(), m11513(dM236811), " s"), arrayList);
        }
        int iM23690 = c8826.m23690(-1, "PhotographicSensitivity");
        if (iM23690 <= 0 || iM23690 >= 65535) {
            int iM23691 = c8826.m23690(0, "SensitivityType");
            long jM115110 = (iM23691 == 3 || iM23691 == 5 || iM23691 == 6 || iM23691 == 7) ? m11519(c8826, "ISOSpeed") : -1L;
            if (jM115110 <= 0 && (iM23691 == 2 || iM23691 == 4 || iM23691 == 6 || iM23691 == 7)) {
                jM115110 = m11519(c8826, "RecommendedExposureIndex");
            }
            jM11519 = (jM115110 > 0 || !(iM23691 == 1 || iM23691 == 4 || iM23691 == 5 || iM23691 == 7)) ? jM115110 : m11519(c8826, "StandardOutputSensitivity");
        } else {
            jM11519 = iM23690;
        }
        if (jM11519 > 0) {
            m11517(R.string.MT_Protector, Long.toString(jM11519), arrayList);
        }
        double dM236812 = c8826.m23689("ExposureBiasValue", Double.NaN);
        double d = m11521(dM236812) ? dM236812 : Double.NaN;
        if (!Double.isNaN(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d > 0.0d ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
            m11517(R.string.MT_Protector, C8947.m23910(sb, m11513(d), " EV"), arrayList);
        }
        int iM23692 = c8826.m23690(-1, "Flash");
        if (iM23692 >= 0) {
            m11517(R.string.MT_Protector, (iM23692 & 1) != 0 ? "1" : "0", arrayList);
        }
        int iM23693 = c8826.m23690(0, "Orientation");
        if (iM23693 < 1 || iM23693 > 8) {
            return;
        }
        m11517(R.string.MT_Protector, Integer.toString(iM23693), arrayList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11520(C8826 c8826, ArrayList arrayList) {
        double d;
        double[] dArrM23694 = c8826.m23694();
        if (dArrM23694 != null && m11521(dArrM23694[0]) && m11521(dArrM23694[1]) && Math.abs(dArrM23694[0]) <= 90.0d && Math.abs(dArrM23694[1]) <= 180.0d) {
            Locale locale = Locale.ROOT;
            m11517(R.string.MT_Protector, String.format(locale, "%.6f°", Double.valueOf(dArrM23694[0])), arrayList);
            m11517(R.string.MT_Protector, String.format(locale, "%.6f°", Double.valueOf(dArrM23694[1])), arrayList);
        }
        double dM23689 = c8826.m23689("GPSAltitude", -1.0d);
        int iM23690 = c8826.m23690(-1, "GPSAltitudeRef");
        if (dM23689 < 0.0d || iM23690 < 0) {
            d = Double.NaN;
        } else {
            d = dM23689 * ((double) (iM23690 == 1 ? -1 : 1));
        }
        if (m11521(d)) {
            m11517(R.string.MT_Protector, C8947.m23910(new StringBuilder(), m11513(d), " m"), arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11514(C8826 c8826, String str) {
        String strM23692 = c8826.m23692(str);
        if (strM23692 == null) {
            return null;
        }
        String strTrim = strM23692.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim.substring(0, Math.min(512, strTrim.length()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11521(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m11519(C8826 c8826, String str) {
        String strM23692 = c8826.m23692(str);
        if (strM23692 != null) {
            try {
                long j = Long.parseLong(strM23692);
                if (j > 0 && j <= 4294967295L) {
                    return j;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11513(double d) {
        BigDecimal scale = BigDecimal.valueOf(d).setScale(3, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11515(C8826 c8826, String str, String str2) {
        String strM11514 = m11514(c8826, str);
        String strM11515 = m11514(c8826, str2);
        if (strM11514 == null || strM11514.length() != 19) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        simpleDateFormat.setLenient(false);
        ParsePosition parsePosition = new ParsePosition(0);
        if (simpleDateFormat.parse(strM11514, parsePosition) == null || parsePosition.getIndex() != strM11514.length()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM11514.substring(0, 4));
        sb.append('-');
        sb.append(strM11514.substring(5, 7));
        sb.append('-');
        String strM = ExternalValue$$ExternalSyntheticOutline0.m(8, strM11514, sb);
        if (strM11515 != null && strM11515.length() == 6 && ((strM11515.charAt(0) == '+' || strM11515.charAt(0) == '-') && strM11515.charAt(3) == ':')) {
            for (int i = 1; i < 3; i++) {
                if (strM11515.charAt(i) < '0' || strM11515.charAt(i) > '9') {
                    return strM;
                }
            }
            for (int i2 = 4; i2 < 6; i2++) {
                if (strM11515.charAt(i2) < '0' || strM11515.charAt(i2) > '9') {
                    return strM;
                }
            }
            if (Integer.parseInt(strM11515.substring(1, 3)) <= 23 && Integer.parseInt(strM11515.substring(4)) <= 59) {
                return C20196.m46451(strM, " ", strM11515);
            }
        }
        return strM;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11517(int i, String str, ArrayList arrayList) {
        if (str != null) {
            arrayList.add(new C16193(i, str));
        }
    }
}
