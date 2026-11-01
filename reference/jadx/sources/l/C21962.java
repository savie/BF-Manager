package l;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.᩹֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C21962 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            c1145.m4214();
            return;
        }
        c1145.m4208();
        c1145.m4204("year");
        c1145.m4211(calendar.get(1));
        c1145.m4204("month");
        c1145.m4211(calendar.get(2));
        c1145.m4204("dayOfMonth");
        c1145.m4211(calendar.get(5));
        c1145.m4204("hourOfDay");
        c1145.m4211(calendar.get(11));
        c1145.m4204("minute");
        c1145.m4211(calendar.get(12));
        c1145.m4204("second");
        c1145.m4211(calendar.get(13));
        c1145.m4216();
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        c5379.m14917();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c5379.m14916() != EnumC22313.END_OBJECT) {
            String strM14921 = c5379.m14921();
            int iM14926 = c5379.m14926();
            strM14921.getClass();
            switch (strM14921) {
                case "dayOfMonth":
                    i3 = iM14926;
                    break;
                case "minute":
                    i5 = iM14926;
                    break;
                case "second":
                    i6 = iM14926;
                    break;
                case "year":
                    i = iM14926;
                    break;
                case "month":
                    i2 = iM14926;
                    break;
                case "hourOfDay":
                    i4 = iM14926;
                    break;
            }
        }
        c5379.m14910();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
