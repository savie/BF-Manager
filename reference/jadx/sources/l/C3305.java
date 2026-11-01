package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3305 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5517 c5517 = (C5517) obj;
        C5517 c5518 = (C5517) obj2;
        C11413 c11413 = ((C21984) c5517.m15217()).f71302;
        C11413 c11414 = ((C21984) c5518.m15217()).f71302;
        if (c11413 == null || c11414 == null) {
            if (c11413 == null && c11414 == null) {
                return c5517.m15215().compareTo(c5518.m15215());
            }
            return c11413 != null ? -1 : 1;
        }
        int i = c11413.f38428;
        int i2 = c11414.f38428;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.compare(i, i2);
    }
}
