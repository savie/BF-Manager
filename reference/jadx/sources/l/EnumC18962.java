package l;

import android.net.Uri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ᩳۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC18962 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC18962 f61480 = new C0317();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18962 f61479 = new C7775();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC18962[] f61478 = m44045();

    public /* synthetic */ EnumC18962(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo1992();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo1993(Uri uri);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo1994(String str);

    public EnumC18962(String str, int i) {
        super(str, i);
    }

    public static EnumC18962 valueOf(String str) {
        return (EnumC18962) Enum.valueOf(EnumC18962.class, str);
    }

    public static EnumC18962[] values() {
        return (EnumC18962[]) f61478.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC18962[] m44045() {
        return new EnumC18962[]{f61480, f61479};
    }
}
