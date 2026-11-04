package l;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩶ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64LS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21118 implements InterfaceC22610 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f67462 = {14, 13, 12, 11, 5, 2, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f67463;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f67464;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f67465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f67467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48211(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return m48210(11);
                }
                if (c == 'M') {
                    return m48210(2);
                }
                if (c == 'S') {
                    return m48210(14);
                }
                if (c == 'd') {
                    return m48210(5);
                }
                if (c == 'm') {
                    return m48210(12);
                }
                if (c == 's') {
                    return m48210(13);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48210(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == f67462[i2]) {
                return i2;
            }
        }
        return 0;
    }

    public C21118() {
        m48212("MMM d yyyy", null);
        m48213("MMM d HH:mm", null);
    }

    @Override // l.InterfaceC22610
    /* JADX INFO: renamed from: ۙ */
    public final void mo6095(C11421 c11421) {
        c11421.getClass();
        DateFormatSymbols dateFormatSymbolsM28766 = C11421.m28766("en");
        m48213(c11421.m28770(), dateFormatSymbolsM28766);
        String strM28767 = c11421.m28767();
        if (strM28767 == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m48212(strM28767, dateFormatSymbolsM28766);
        TimeZone timeZone = TimeZone.getDefault();
        this.f67463.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.f67467;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f67464 = c11421.m28772();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Calendar m48214(String str) throws ParseException {
        ParsePosition parsePosition;
        Date date;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(this.f67463.getTimeZone());
        SimpleDateFormat simpleDateFormat = this.f67467;
        int[] iArr = f67462;
        if (simpleDateFormat == null) {
            parsePosition = new ParsePosition(0);
            date = this.f67463.parse(str, parsePosition);
            if (date != null) {
            }
            StringBuilder sbM51387 = C22783.m51387("Timestamp '", str, "' could not be parsed using a server time of ");
            sbM51387.append(calendar.getTime().toString());
            throw new ParseException(sbM51387.toString(), parsePosition.getErrorIndex());
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.setTimeZone(this.f67463.getTimeZone());
        if (this.f67464) {
            calendar3.add(5, 1);
        }
        String strM46451 = C20196.m46451(str, " ", Integer.toString(calendar3.get(1)));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f67467.toPattern() + " yyyy", this.f67467.getDateFormatSymbols());
        simpleDateFormat2.setLenient(false);
        simpleDateFormat2.setTimeZone(this.f67467.getTimeZone());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date date2 = simpleDateFormat2.parse(strM46451, parsePosition2);
        if (date2 == null || parsePosition2.getIndex() != strM46451.length()) {
            parsePosition = new ParsePosition(0);
            date = this.f67463.parse(str, parsePosition);
            if (date != null || parsePosition.getIndex() != str.length()) {
                StringBuilder sbM51388 = C22783.m51387("Timestamp '", str, "' could not be parsed using a server time of ");
                sbM51388.append(calendar.getTime().toString());
                throw new ParseException(sbM51388.toString(), parsePosition.getErrorIndex());
            }
            calendar2.setTime(date);
            int i = this.f67466;
            if (i > 0) {
                int i2 = iArr[i - 1];
                if (calendar2.get(i2) == 0) {
                    calendar2.clear(i2);
                    return calendar2;
                }
            }
        } else {
            calendar2.setTime(date2);
            if (calendar2.after(calendar3)) {
                calendar2.add(1, -1);
            }
            int i3 = this.f67465;
            if (i3 > 0) {
                int i4 = iArr[i3 - 1];
                if (calendar2.get(i4) == 0) {
                    calendar2.clear(i4);
                    return calendar2;
                }
            }
        }
        return calendar2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48212(String str, DateFormatSymbols dateFormatSymbols) {
        if (dateFormatSymbols != null) {
            this.f67463 = new SimpleDateFormat(str, dateFormatSymbols);
        } else {
            this.f67463 = new SimpleDateFormat(str);
        }
        this.f67463.setLenient(false);
        this.f67466 = m48211(this.f67463);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48213(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f67467 = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f67467 = new SimpleDateFormat(str);
            }
            this.f67467.setLenient(false);
        } else {
            this.f67467 = null;
        }
        this.f67465 = m48211(this.f67467);
    }
}
