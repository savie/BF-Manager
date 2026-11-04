package l;

import com.google.android.material.datepicker.UtcDates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4153 {
    public static final EnumC4153 STANDARD;
    public static final EnumC4153 UTC;
    public static final EnumC4153 WALL;
    public static final /* synthetic */ EnumC4153[] a;

    public static EnumC4153 valueOf(String str) {
        return (EnumC4153) Enum.valueOf(EnumC4153.class, str);
    }

    public static EnumC4153[] values() {
        return (EnumC4153[]) a.clone();
    }

    static {
        EnumC4153 enumC4153 = new EnumC4153(UtcDates.UTC, 0);
        UTC = enumC4153;
        EnumC4153 enumC4154 = new EnumC4153("WALL", 1);
        WALL = enumC4154;
        EnumC4153 enumC4155 = new EnumC4153("STANDARD", 2);
        STANDARD = enumC4155;
        a = new EnumC4153[]{enumC4153, enumC4154, enumC4155};
    }
}
