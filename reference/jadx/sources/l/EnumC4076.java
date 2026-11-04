package l;

import java.util.BitSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4076 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC4076 f13922 = new C12279();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4076 f13921 = new C6314();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC4076 f13919 = new C24214();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4076[] f13920 = m13159();

    public /* synthetic */ EnumC4076(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo13160(BitSet bitSet, int i);

    public EnumC4076(String str, int i) {
        super(str, i);
    }

    public static EnumC4076 valueOf(String str) {
        return (EnumC4076) Enum.valueOf(EnumC4076.class, str);
    }

    public static EnumC4076[] values() {
        return (EnumC4076[]) f13920.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4076[] m13159() {
        return new EnumC4076[]{f13922, f13921, f13919};
    }
}
