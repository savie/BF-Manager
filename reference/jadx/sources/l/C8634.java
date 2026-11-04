package l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4FK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8634 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(C19822.f63721);
        return simpleDateFormat;
    }
}
