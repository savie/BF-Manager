package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩻᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23897 implements InterfaceC6257 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f77439;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f77440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f77441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f77443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77444;

    static {
        String str = C17983.f57504;
        f77440 = Integer.toString(0, 36);
        f77439 = Integer.toString(1, 36);
        f77441 = Integer.toString(2, 36);
    }

    public C23897(int i, int i2, int i3) {
        this.f77444 = i;
        this.f77442 = i2;
        this.f77443 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m52692() {
        Bundle bundle = new Bundle();
        bundle.putInt(f77440, this.f77444);
        bundle.putInt(f77439, this.f77442);
        bundle.putInt(f77441, this.f77443);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23897 m52691(Bundle bundle) {
        return new C23897(bundle.getInt(f77440), bundle.getInt(f77439), bundle.getInt(f77441));
    }
}
