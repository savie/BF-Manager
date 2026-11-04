package l;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩻ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E87U */
/* JADX INFO: loaded from: classes.dex */
public final class C25092 extends AbstractC17567 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f81134 = new C11665();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f81135;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c21362.m48598();
            return;
        }
        synchronized (this) {
            str = this.f81135.format((java.util.Date) date);
        }
        c21362.m48602(str);
    }

    public /* synthetic */ C25092(int i) {
        this();
    }

    public C25092() {
        this.f81135 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        Date date;
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        synchronized (this) {
            TimeZone timeZone = this.f81135.getTimeZone();
            try {
                try {
                    date = new Date(this.f81135.parse(strM13453).getTime());
                    this.f81135.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C7367("Failed parsing '" + strM13453 + "' as SQL Date; at path " + c4208.m13451(), e);
                }
            } catch (Throwable th) {
                this.f81135.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }
}
