package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMR */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC6322 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f21356;

    public RunnableC6322(C0572 c0572, String str) {
        super(c0572);
        this.f21356 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38120 = AbstractRunnableC16096.m38120(this.f21356);
        int iIndexOf = strM38120.indexOf(32);
        C0572 c0572 = this.f52046;
        if (iIndexOf == -1) {
            c0572.m2708("500 wrong number of parameters\r\n");
            return;
        }
        String strSubstring = strM38120.substring(0, iIndexOf);
        String strSubstring2 = strM38120.substring(iIndexOf + 1);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss", locale);
        simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss", locale);
            simpleDateFormat2.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
            Date date = simpleDateFormat2.parse(strSubstring);
            AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strSubstring2);
            if (m38128(abstractC20745M38126)) {
                c0572.m2708("550 Invalid name or chroot violation\r\n");
                return;
            }
            if (!abstractC20745M38126.mo33975()) {
                c0572.m2708("550 file does not exist on server\r\n");
                return;
            }
            if (!abstractC20745M38126.mo32855(date.getTime())) {
                c0572.m2708("500 unable to modify last modification time\r\n");
                return;
            }
            c0572.m2708("213 " + simpleDateFormat.format(new Date(abstractC20745M38126.mo33991())) + "; " + abstractC20745M38126.mo33986() + "\r\n");
        } catch (ParseException unused) {
            c0572.m2708("501 unable to parse parameter time-val\r\n");
        }
    }
}
