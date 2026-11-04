package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۚ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5274 {
    START_POS(new C19444()),
    FIRST_STAT_POS(new C14968()),
    END_POS(new C12731());


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ToIntFunction f18579;

    EnumC5274(ToIntFunction toIntFunction) {
        this.f18579 = toIntFunction;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m15862(AbstractC8036 abstractC8036) {
        return this.f18579.applyAsInt(abstractC8036);
    }
}
