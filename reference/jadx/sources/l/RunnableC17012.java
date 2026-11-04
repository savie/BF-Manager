package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMR */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17012 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f55583;

    public RunnableC17012(C5563 c5563, String str) {
        super(c5563);
        this.f55583 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM36601 = AbstractRunnableC15257.m36601(this.f55583);
        int iIndexOf = strM36601.indexOf(32);
        C5563 c5563 = this.f49894;
        if (iIndexOf == -1) {
            c5563.m16486("500 wrong number of parameters\r\n");
            return;
        }
        String strSubstring = strM36601.substring(0, iIndexOf);
        String strSubstring2 = strM36601.substring(iIndexOf + 1);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss", locale);
        simpleDateFormat.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss", locale);
            simpleDateFormat2.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
            Date date = simpleDateFormat2.parse(strSubstring);
            AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strSubstring2);
            if (m36609(abstractC22044M36607)) {
                c5563.m16486("550 Invalid name or chroot violation\r\n");
                return;
            }
            if (!abstractC22044M36607.mo2934()) {
                c5563.m16486("550 file does not exist on server\r\n");
                return;
            }
            if (!abstractC22044M36607.mo2942(date.getTime())) {
                c5563.m16486("500 unable to modify last modification time\r\n");
                return;
            }
            c5563.m16486("213 " + simpleDateFormat.format(new Date(abstractC22044M36607.mo4286())) + "; " + abstractC22044M36607.mo4294() + "\r\n");
        } catch (ParseException unused) {
            c5563.m16486("501 unable to parse parameter time-val\r\n");
        }
    }
}
