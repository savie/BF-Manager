package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۧ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11197 implements InterfaceC6257 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f37905;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f37906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f37908;

    static {
        String str = C17983.f57504;
        f37905 = Integer.toString(0, 36);
        f37906 = Integer.toString(1, 36);
    }

    public C11197(String str, int i) {
        this.f37908 = str;
        this.f37907 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m28134() {
        Bundle bundle = new Bundle();
        bundle.putString(f37905, this.f37908);
        bundle.putInt(f37906, this.f37907);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11197 m28133(Bundle bundle) {
        String string = bundle.getString(f37905);
        string.getClass();
        return new C11197(string, bundle.getInt(f37906));
    }
}
