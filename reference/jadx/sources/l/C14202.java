package l;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܳ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V898 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14202 extends AbstractC7186 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f46576 = new C23374();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f46577;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c1145.m4214();
            return;
        }
        synchronized (this) {
            str = this.f46577.format((Date) time);
        }
        c1145.m4212(str);
    }

    public /* synthetic */ C14202(int i) {
        this();
    }

    public C14202() {
        this.f46577 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        Time time;
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        synchronized (this) {
            TimeZone timeZone = this.f46577.getTimeZone();
            try {
                try {
                    time = new Time(this.f46577.parse(strM14922).getTime());
                    this.f46577.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C22003("Failed parsing '" + strM14922 + "' as SQL Time; at path " + c5379.m14928(), e);
                }
            } catch (Throwable th) {
                this.f46577.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }
}
