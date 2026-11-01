package l;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۚ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64LS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5628 implements InterfaceC10380 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f19278 = {14, 13, 12, 11, 5, 2, 1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f19279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f19280;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19281;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19283;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15521(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return m15520(11);
                }
                if (c == 'M') {
                    return m15520(2);
                }
                if (c == 'S') {
                    return m15520(14);
                }
                if (c == 'd') {
                    return m15520(5);
                }
                if (c == 'm') {
                    return m15520(12);
                }
                if (c == 's') {
                    return m15520(13);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15520(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == f19278[i2]) {
                return i2;
            }
        }
        return 0;
    }

    public C5628() {
        m15522("MMM d yyyy", null);
        m15523("MMM d HH:mm", null);
    }

    @Override // l.InterfaceC10380
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15525(C12497 c12497) {
        c12497.getClass();
        DateFormatSymbols dateFormatSymbolsM31037 = C12497.m31037("en");
        m15523(c12497.m31042(), dateFormatSymbolsM31037);
        String strM31039 = c12497.m31039();
        if (strM31039 == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m15522(strM31039, dateFormatSymbolsM31037);
        TimeZone timeZone = TimeZone.getDefault();
        this.f19280.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.f19279;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f19282 = c12497.m31038();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Calendar m15524(String str) throws ParseException {
        ParsePosition parsePosition;
        Date date;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(this.f19280.getTimeZone());
        SimpleDateFormat simpleDateFormat = this.f19279;
        int[] iArr = f19278;
        if (simpleDateFormat == null) {
            parsePosition = new ParsePosition(0);
            date = this.f19280.parse(str, parsePosition);
            if (date != null) {
            }
            StringBuilder sbM30914 = C12441.m30914("Timestamp '", str, "' could not be parsed using a server time of ");
            sbM30914.append(calendar.getTime().toString());
            throw new ParseException(sbM30914.toString(), parsePosition.getErrorIndex());
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.setTimeZone(this.f19280.getTimeZone());
        if (this.f19282) {
            calendar3.add(5, 1);
        }
        String strM5594 = C1679.m5594(str, " ", Integer.toString(calendar3.get(1)));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f19279.toPattern() + " yyyy", this.f19279.getDateFormatSymbols());
        simpleDateFormat2.setLenient(false);
        simpleDateFormat2.setTimeZone(this.f19279.getTimeZone());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date date2 = simpleDateFormat2.parse(strM5594, parsePosition2);
        if (date2 == null || parsePosition2.getIndex() != strM5594.length()) {
            parsePosition = new ParsePosition(0);
            date = this.f19280.parse(str, parsePosition);
            if (date != null || parsePosition.getIndex() != str.length()) {
                StringBuilder sbM30915 = C12441.m30914("Timestamp '", str, "' could not be parsed using a server time of ");
                sbM30915.append(calendar.getTime().toString());
                throw new ParseException(sbM30915.toString(), parsePosition.getErrorIndex());
            }
            calendar2.setTime(date);
            int i = this.f19283;
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
            int i3 = this.f19281;
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
    private void m15522(String str, DateFormatSymbols dateFormatSymbols) {
        if (dateFormatSymbols != null) {
            this.f19280 = new SimpleDateFormat(str, dateFormatSymbols);
        } else {
            this.f19280 = new SimpleDateFormat(str);
        }
        this.f19280.setLenient(false);
        this.f19283 = m15521(this.f19280);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15523(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f19279 = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f19279 = new SimpleDateFormat(str);
            }
            this.f19279.setLenient(false);
        } else {
            this.f19279 = null;
        }
        this.f19281 = m15521(this.f19279);
    }
}
