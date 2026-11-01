package l;

import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩶ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8LI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19923 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45218(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return SecP160R1Field.PInv;
                }
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45219(String str, boolean z) throws C22861 {
        if (!z) {
            throw C22861.m50610(str, (Throwable) null);
        }
    }
}
