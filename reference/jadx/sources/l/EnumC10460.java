package l;

import java.util.BitSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۤᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC10460 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC10460 f35703 = new C8343();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC10460 f35700 = new C19632();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC10460 f35702 = new C9049();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC10460[] f35701 = m26424();

    public /* synthetic */ EnumC10460(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo21792(BitSet bitSet, int i);

    public EnumC10460(String str, int i) {
        super(str, i);
    }

    public static EnumC10460 valueOf(String str) {
        return (EnumC10460) Enum.valueOf(EnumC10460.class, str);
    }

    public static EnumC10460[] values() {
        return (EnumC10460[]) f35701.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC10460[] m26424() {
        return new EnumC10460[]{f35703, f35700, f35702};
    }
}
