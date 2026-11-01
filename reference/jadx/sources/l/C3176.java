package l;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3176 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10939 f11934;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashSet f11935;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14467 f11936;

    public C3176() {
        C4504 c4504 = new C4504();
        C10939 c10939 = new C10939();
        this.f11935 = new HashSet();
        this.f11936 = c4504;
        this.f11934 = c10939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File m9593(Context context) {
        ((C4504) this.f11936).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9592(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
