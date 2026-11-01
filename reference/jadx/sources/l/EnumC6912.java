package l;

import com.google.android.material.datepicker.UtcDates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۜܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6912 {
    public static final EnumC6912 STANDARD;
    public static final EnumC6912 UTC;
    public static final EnumC6912 WALL;
    public static final /* synthetic */ EnumC6912[] a;

    public static EnumC6912 valueOf(String str) {
        return (EnumC6912) Enum.valueOf(EnumC6912.class, str);
    }

    public static EnumC6912[] values() {
        return (EnumC6912[]) a.clone();
    }

    static {
        EnumC6912 enumC6912 = new EnumC6912(UtcDates.UTC, 0);
        UTC = enumC6912;
        EnumC6912 enumC6913 = new EnumC6912("WALL", 1);
        WALL = enumC6913;
        EnumC6912 enumC6914 = new EnumC6912("STANDARD", 2);
        STANDARD = enumC6914;
        a = new EnumC6912[]{enumC6912, enumC6913, enumC6914};
    }
}
