package l;

import android.net.Uri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۨۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC11642 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC11642 f39119 = new C4585();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC11642 f39117 = new C13759();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC11642[] f39118 = m29059();

    public /* synthetic */ EnumC11642(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo12733();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo12734(Uri uri);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo12735(String str);

    public EnumC11642(String str, int i) {
        super(str, i);
    }

    public static EnumC11642 valueOf(String str) {
        return (EnumC11642) Enum.valueOf(EnumC11642.class, str);
    }

    public static EnumC11642[] values() {
        return (EnumC11642[]) f39118.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC11642[] m29059() {
        return new EnumC11642[]{f39119, f39117};
    }
}
