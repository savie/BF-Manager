package l;

/* JADX INFO: renamed from: l.ۜܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6CZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7215 {
    EQUAL,
    NARROW,
    NARROW_BY_GENERIC,
    WIDER,
    WIDER_BY_GENERIC,
    CONFLICT,
    CONFLICT_BY_GENERIC,
    UNKNOWN;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC7215 m19810() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return WIDER;
        }
        if (iOrdinal == 2) {
            return WIDER_BY_GENERIC;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? this : NARROW_BY_GENERIC;
        }
        return NARROW;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m19813() {
        return this == EQUAL;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m19811() {
        return this == WIDER || this == WIDER_BY_GENERIC;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m19815() {
        return m19813() || m19811();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m19812() {
        return this == NARROW || this == NARROW_BY_GENERIC;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19809() {
        return m19813() || m19812();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m19814() {
        return this == CONFLICT || this == CONFLICT_BY_GENERIC;
    }
}
