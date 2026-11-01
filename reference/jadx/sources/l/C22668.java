package l;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.᩺֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public final class C22668 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f73822;

    public C22668(AbstractC7186 abstractC7186) {
        this.f73822 = abstractC7186;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class clsM29316 = c11730.m29316();
        if (clsM29316 == Calendar.class || clsM29316 == GregorianCalendar.class) {
            return this.f73822;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + GregorianCalendar.class.getName() + ",adapter=" + this.f73822 + "]";
    }
}
