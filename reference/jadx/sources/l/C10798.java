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

/* JADX INFO: renamed from: l.ۧۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G851 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10798 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f36765 = new C12209();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5858 f36767;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c1145.m4214();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f36766.get(0);
        synchronized (this.f36766) {
            str = dateFormat.format(date);
        }
        c1145.m4212(str);
    }

    public C10798(int i) {
        ArrayList arrayList = new ArrayList();
        this.f36766 = arrayList;
        this.f36767 = AbstractC5858.f20002;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C14243.m34377()) {
            arrayList.add(new SimpleDateFormat(C1679.m5594("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        Date dateM45099;
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        synchronized (this.f36766) {
            for (DateFormat dateFormat : this.f36766) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    dateM45099 = dateFormat.parse(strM14922);
                    dateFormat.setTimeZone(timeZone);
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                dateM45099 = C19846.m45099(strM14922, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbM30914 = C12441.m30914("Failed parsing '", strM14922, "' as Date; at path ");
                sbM30914.append(c5379.m14928());
                throw new C22003(sbM30914.toString(), e);
            }
        }
        ((C17147) this.f36767).getClass();
        return dateM45099;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f36766.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
