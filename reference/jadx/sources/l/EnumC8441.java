package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۠᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8441 {
    ALWAYS,
    LEGACY,
    NONEMPTY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC8441 m22101(C14770 c14770) {
        String strM35398 = c14770.m35398(EnumC19730.f63334);
        if (strM35398 == null) {
            return LEGACY;
        }
        return valueOf(strM35398.toUpperCase(Locale.US));
    }
}
