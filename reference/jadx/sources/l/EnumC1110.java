package l;

/* JADX INFO: renamed from: l.֨ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 792D */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1110 {
    IMMUTABLE,
    COLOR_FOLDER,
    COLOR_ACCENT;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m4120() {
        return this == IMMUTABLE;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m4121() {
        return this == COLOR_FOLDER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m4119() {
        return this == COLOR_ACCENT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1110 m4117(AbstractC23597 abstractC23597) {
        if (abstractC23597 == C20613.f66104) {
            return COLOR_FOLDER;
        }
        if (abstractC23597 == C20613.f66067) {
            return COLOR_ACCENT;
        }
        return IMMUTABLE;
    }
}
