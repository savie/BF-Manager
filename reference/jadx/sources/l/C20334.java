package l;

import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩶ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes4.dex */
public final class C20334 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Calendar f65854;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char f65855;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Locale f65856;

    public C20334() {
        this(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m45900(long j) {
        StringBuilder sb;
        this.f65854.setTimeInMillis(j);
        sb = new StringBuilder(23);
        Calendar calendar = this.f65854;
        if (calendar instanceof GregorianCalendar) {
            m45899(sb, ((GregorianCalendar) calendar).get(1), 4);
        } else {
            String displayName = calendar.getDisplayName(1, 2, this.f65856);
            if (displayName != null) {
                sb.append(displayName);
            } else {
                m45899(sb, this.f65854.get(1), 1);
            }
        }
        sb.append('-');
        m45899(sb, this.f65854.get(2) + 1, 2);
        sb.append('-');
        m45899(sb, this.f65854.get(5), 2);
        sb.append(' ');
        m45899(sb, this.f65854.get(11), 2);
        sb.append(':');
        m45899(sb, this.f65854.get(12), 2);
        sb.append(':');
        m45899(sb, this.f65854.get(13), 2);
        sb.append('.');
        m45899(sb, this.f65854.get(14), 3);
        return sb.toString();
    }

    public C20334(int i) {
        Locale locale = Locale.getDefault();
        C13465.m32967(locale, "getDefault(...)");
        TimeZone timeZone = TimeZone.getDefault();
        C13465.m32967(timeZone, "getDefault(...)");
        this.f65856 = locale;
        this.f65854 = Calendar.getInstance(timeZone, locale);
        this.f65855 = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m45899(StringBuilder sb, int i, int i2) {
        char c;
        String strValueOf = String.valueOf(i);
        int length = i2 - strValueOf.length();
        if (length < 0) {
            length = 0;
        }
        int i3 = 0;
        while (true) {
            c = this.f65855;
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
