package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܳ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14725 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f48145;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f48146;

    static {
        String str = C17983.f57504;
        f48145 = Integer.toString(0, 36);
    }

    public C14725(String str) {
        this.f48146 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m35254() {
        Bundle bundle = new Bundle();
        bundle.putString(f48145, this.f48146);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14725 m35253(Bundle bundle) {
        String string = bundle.getString(f48145);
        string.getClass();
        return new C14725(string);
    }
}
