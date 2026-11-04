package l;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15371 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4931 f50133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet f50134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10896 f50135;

    public C15371() {
        C13134 c13134 = new C13134();
        C4931 c4931 = new C4931();
        this.f50134 = new HashSet();
        this.f50135 = c13134;
        this.f50133 = c4931;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File m36803(Context context) {
        ((C13134) this.f50135).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36802(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
