package l;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۧ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E87U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10674 extends AbstractC7186 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f36421 = new C5734();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f36422;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c1145.m4214();
            return;
        }
        synchronized (this) {
            str = this.f36422.format((java.util.Date) date);
        }
        c1145.m4212(str);
    }

    public /* synthetic */ C10674(int i) {
        this();
    }

    public C10674() {
        this.f36422 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        Date date;
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        synchronized (this) {
            TimeZone timeZone = this.f36422.getTimeZone();
            try {
                try {
                    date = new Date(this.f36422.parse(strM14922).getTime());
                    this.f36422.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C22003("Failed parsing '" + strM14922 + "' as SQL Date; at path " + c5379.m14928(), e);
                }
            } catch (Throwable th) {
                this.f36422.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }
}
