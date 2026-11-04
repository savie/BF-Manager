package l;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HB5A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9911 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25734(int i, int i2, List list) {
        if (i <= i2) {
            Collections.rotate(list.subList(i, i2 + 1), -1);
        } else {
            Collections.rotate(list.subList(i2, i + 1), 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25735(List list, Predicate predicate) {
        C1170.removeIf(list, predicate);
    }
}
