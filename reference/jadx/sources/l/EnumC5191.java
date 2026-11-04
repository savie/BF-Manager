package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5191 {
    SIZE_64KB(4),
    SIZE_256KB(5),
    SIZE_1MB(6),
    SIZE_4MB(7);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f18111;

    EnumC5191(int i) {
        this.f18111 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5191 m15610(int i) {
        if (i == 4) {
            return SIZE_64KB;
        }
        if (i == 5) {
            return SIZE_256KB;
        }
        if (i == 6) {
            return SIZE_1MB;
        }
        if (i == 7) {
            return SIZE_4MB;
        }
        Locale locale = Locale.ROOT;
        throw new IllegalArgumentException(C14442.m34864(i, "Block size must be 4-7. Cannot use value of [", "]"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m15612() {
        return this.f18111;
    }
}
