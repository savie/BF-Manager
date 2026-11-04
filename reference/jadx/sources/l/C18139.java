package l;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G851 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18139 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f59317 = new C3969();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59318;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC21123 f59319;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c21362.m48598();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f59318.get(0);
        synchronized (this.f59318) {
            str = dateFormat.format(date);
        }
        c21362.m48602(str);
    }

    public C18139(AbstractC21123 abstractC21123, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f59318 = arrayList;
        this.f59319 = abstractC21123;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C19059.m44164()) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(C13645.m33382(i, "Unknown DateFormat style: "));
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(C13645.m33382(i2, "Unknown DateFormat style: "));
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        Date dateM45727;
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        synchronized (this.f59318) {
            for (DateFormat dateFormat : this.f59318) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    dateM45727 = dateFormat.parse(strM13453);
                    dateFormat.setTimeZone(timeZone);
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                dateM45727 = C19870.m45727(strM13453, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as Date; at path ");
                sbM51387.append(c4208.m13451());
                throw new C7367(sbM51387.toString(), e);
            }
        }
        return this.f59319.mo11396(dateM45727);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f59318.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
