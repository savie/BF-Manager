package l;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܽܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V898 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17632 extends AbstractC17567 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f57977 = new C16886();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f57978;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c21362.m48598();
            return;
        }
        synchronized (this) {
            str = this.f57978.format((Date) time);
        }
        c21362.m48602(str);
    }

    public /* synthetic */ C17632(int i) {
        this();
    }

    public C17632() {
        this.f57978 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        Time time;
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        synchronized (this) {
            TimeZone timeZone = this.f57978.getTimeZone();
            try {
                try {
                    time = new Time(this.f57978.parse(strM13453).getTime());
                    this.f57978.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C7367("Failed parsing '" + strM13453 + "' as SQL Time; at path " + c4208.m13451(), e);
                }
            } catch (Throwable th) {
                this.f57978.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }
}
