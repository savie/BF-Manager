package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩹᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23766 implements InterfaceC17798 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f77002;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String f77003;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f77004;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77005;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f77006;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77007;

    static {
        String str = C7116.f23455;
        f77003 = Integer.toString(0, 36);
        f77004 = Integer.toString(1, 36);
        f77002 = Integer.toString(2, 36);
    }

    public C23766(int i, int i2, int i3) {
        this.f77007 = i;
        this.f77005 = i2;
        this.f77006 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m53048() {
        Bundle bundle = new Bundle();
        bundle.putInt(f77003, this.f77007);
        bundle.putInt(f77004, this.f77005);
        bundle.putInt(f77002, this.f77006);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23766 m53047(Bundle bundle) {
        return new C23766(bundle.getInt(f77003), bundle.getInt(f77004), bundle.getInt(f77002));
    }
}
