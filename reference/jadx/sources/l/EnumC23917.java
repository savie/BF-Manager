package l;

/* JADX INFO: renamed from: l.᩻᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 792D */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23917 {
    IMMUTABLE,
    COLOR_FOLDER,
    COLOR_ACCENT;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m52741() {
        return this == IMMUTABLE;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m52742() {
        return this == COLOR_FOLDER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m52740() {
        return this == COLOR_ACCENT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23917 m52739(AbstractC16214 abstractC16214) {
        if (abstractC16214 == C0690.f2885) {
            return COLOR_FOLDER;
        }
        if (abstractC16214 == C0690.f2913) {
            return COLOR_ACCENT;
        }
        return IMMUTABLE;
    }
}
