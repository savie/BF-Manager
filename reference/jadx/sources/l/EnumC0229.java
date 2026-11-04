package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.֡ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0229 {
    ALWAYS,
    LEGACY,
    NONEMPTY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0229 m1702(C13015 c13015) {
        String strM32423 = c13015.m32423(EnumC7687.f25283);
        if (strM32423 == null) {
            return LEGACY;
        }
        return valueOf(strM32423.toUpperCase(Locale.US));
    }
}
