package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13167 extends C8824 {
    public final char g;
    public final int h;

    @Override // l.C8824, l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        return f(c25102.a.b).j(c25102, charSequence, i);
    }

    @Override // l.C8824, l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        return f(c16150.b.b).i(c16150, sb);
    }

    public C13167(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, EnumC8079.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // l.C8824
    public final C8824 d() {
        if (this.e == -1) {
            return this;
        }
        return new C13167(this.g, this.h, this.b, this.c, -1);
    }

    @Override // l.C8824
    public final C8824 e(int i) {
        return new C13167(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final C8824 f(Locale locale) {
        C3407 c3407;
        ConcurrentMapC17249 concurrentMapC17249 = C20561.g;
        C17359.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C20561 c20561A = C20561.a(EnumC13387.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + EnumC13387.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            c3407 = c20561A.d;
        } else {
            if (c == 'Y') {
                C3407 c3408 = c20561A.f;
                int i = this.h;
                if (i == 2) {
                    return new C22864(c3408, 2, 2, C22864.h, this.e);
                }
                return new C8824(c3408, i, 19, i < 4 ? EnumC8079.NORMAL : EnumC8079.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                c3407 = c20561A.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c3407 = c20561A.e;
            }
        }
        return new C8824(c3407, this.b, this.c, EnumC8079.NOT_NEGATIVE, this.e);
    }

    @Override // l.C8824
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? EnumC8079.NORMAL : EnumC8079.EXCEEDS_PAD);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
