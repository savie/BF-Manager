package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.֫ۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1717 {
    START_POS(new C13800(1)),
    FIRST_STAT_POS(new C23591()),
    END_POS(new C14419());


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ToIntFunction f6784;

    EnumC1717(ToIntFunction toIntFunction) {
        this.f6784 = toIntFunction;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m5715(AbstractC8774 abstractC8774) {
        return this.f6784.applyAsInt(abstractC8774);
    }
}
