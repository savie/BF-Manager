package l;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.᩶ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public final class C21057 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f67294;

    public C21057(AbstractC17567 abstractC17567) {
        this.f67294 = abstractC17567;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class clsM18232 = c6446.m18232();
        if (clsM18232 == Calendar.class || clsM18232 == GregorianCalendar.class) {
            return this.f67294;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + GregorianCalendar.class.getName() + ",adapter=" + this.f67294 + "]";
    }
}
