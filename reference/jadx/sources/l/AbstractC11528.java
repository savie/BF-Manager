package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11528 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo12625(AbstractC15283 abstractC15283);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo12626(AbstractC15283 abstractC15283, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo12627(AbstractC15283 abstractC15283, Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo12628(AbstractC15283 abstractC15283, Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo12629(AbstractC15283 abstractC15283, ArrayList arrayList);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC17376 mo29028(String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo29029(InterfaceC20029 interfaceC20029, C12901 c12901);

    /* JADX INFO: renamed from: ۤ */
    public abstract Object mo12631(AbstractC15283 abstractC15283, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo12633(AbstractC15283 abstractC15283, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29027(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(new Date(j));
    }
}
