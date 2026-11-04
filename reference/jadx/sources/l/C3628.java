package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۗ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f12438;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12439;

    static {
        String str = C7116.f23455;
        f12438 = Integer.toString(0, 36);
    }

    public C3628(String str) {
        this.f12439 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m11780() {
        Bundle bundle = new Bundle();
        bundle.putString(f12438, this.f12439);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3628 m11779(Bundle bundle) {
        String string = bundle.getString(f12438);
        string.getClass();
        return new C3628(string);
    }
}
