package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C16306 implements InterfaceC17798 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f52946;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f52947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52948;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f52949;

    static {
        String str = C7116.f23455;
        f52947 = Integer.toString(0, 36);
        f52946 = Integer.toString(1, 36);
    }

    public C16306(String str, int i) {
        this.f52949 = str;
        this.f52948 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m38673() {
        Bundle bundle = new Bundle();
        bundle.putString(f52947, this.f52949);
        bundle.putInt(f52946, this.f52948);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16306 m38672(Bundle bundle) {
        String string = bundle.getString(f52947);
        string.getClass();
        return new C16306(string, bundle.getInt(f52946));
    }
}
