package l;

import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۗܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes2.dex */
public final class C3499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Calendar f12070;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char f12071;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Locale f12072;

    public C3499() {
        this(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m11498(long j) {
        StringBuilder sb;
        this.f12070.setTimeInMillis(j);
        sb = new StringBuilder(23);
        Calendar calendar = this.f12070;
        if (calendar instanceof GregorianCalendar) {
            m11497(sb, ((GregorianCalendar) calendar).get(1), 4);
        } else {
            String displayName = calendar.getDisplayName(1, 2, this.f12072);
            if (displayName != null) {
                sb.append(displayName);
            } else {
                m11497(sb, this.f12070.get(1), 1);
            }
        }
        sb.append('-');
        m11497(sb, this.f12070.get(2) + 1, 2);
        sb.append('-');
        m11497(sb, this.f12070.get(5), 2);
        sb.append(' ');
        m11497(sb, this.f12070.get(11), 2);
        sb.append(':');
        m11497(sb, this.f12070.get(12), 2);
        sb.append(':');
        m11497(sb, this.f12070.get(13), 2);
        sb.append('.');
        m11497(sb, this.f12070.get(14), 3);
        return sb.toString();
    }

    public C3499(int i) {
        Locale locale = Locale.getDefault();
        C15243.m36591(locale, "getDefault(...)");
        TimeZone timeZone = TimeZone.getDefault();
        C15243.m36591(timeZone, "getDefault(...)");
        this.f12072 = locale;
        this.f12070 = Calendar.getInstance(timeZone, locale);
        this.f12071 = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m11497(StringBuilder sb, int i, int i2) {
        char c;
        String strValueOf = String.valueOf(i);
        int length = i2 - strValueOf.length();
        if (length < 0) {
            length = 0;
        }
        int i3 = 0;
        while (true) {
            c = this.f12071;
            if (i3 >= length) {
                break;
            }
            sb.append(c);
            i3++;
        }
        int length2 = strValueOf.length();
        for (int i4 = 0; i4 < length2; i4++) {
            sb.append((char) ((strValueOf.charAt(i4) - '0') + c));
        }
    }
}
