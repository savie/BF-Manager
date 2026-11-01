package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42031;

    public /* synthetic */ AbstractC12568(int i) {
        this.f42031 = i;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2340(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ۙ */
    public abstract C16251 mo15518(C16251 c16251);

    public String toString() {
        switch (this.f42031) {
            case 2:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0727 m31288(C0727 c0727) {
        int size = c0727.size();
        C0727 c0728 = new C0727(size);
        for (int i = 0; i < size; i++) {
            c0728.m15261(i, mo15518(c0727.m15275get(i)));
        }
        c0728.mo9637();
        return c0728.equals(c0727) ? c0727 : c0728;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31287(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(new Date(j));
    }
}
