package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16065 extends C21709 {
    public final char g;
    public final int h;

    @Override // l.C21709, l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        return f(c12537.a.b).m(c12537, charSequence, i);
    }

    @Override // l.C21709, l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        return f(c11126.b.b).l(c11126, sb);
    }

    public C16065(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, EnumC1247.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // l.C21709
    public final C21709 d() {
        if (this.e == -1) {
            return this;
        }
        return new C16065(this.g, this.h, this.b, this.c, -1);
    }

    @Override // l.C21709
    public final C21709 e(int i) {
        return new C16065(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final C21709 f(Locale locale) {
        C9591 c9591;
        ConcurrentMapC13783 concurrentMapC13783 = C3239.g;
        C13638.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C3239 c3239A = C3239.a(EnumC16169.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + EnumC16169.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            c9591 = c3239A.d;
        } else {
            if (c == 'Y') {
                C9591 c9592 = c3239A.f;
                int i = this.h;
                if (i == 2) {
                    return new C10421(c9592, 2, 2, C10421.h, this.e);
                }
                return new C21709(c9592, i, 19, i < 4 ? EnumC1247.NORMAL : EnumC1247.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                c9591 = c3239A.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c9591 = c3239A.e;
            }
        }
        return new C21709(c9591, this.b, this.c, EnumC1247.NOT_NEGATIVE, this.e);
    }

    @Override // l.C21709
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
            sb.append(i < 4 ? EnumC1247.NORMAL : EnumC1247.EXCEEDS_PAD);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
