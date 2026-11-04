package l;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩷ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class C22109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17328 f71253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f71254;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f71255;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f71256;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1512 f71257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f71258;

    public C22109(C1512 c1512) {
        this.f71257 = c1512;
        this.f71258 = c1512.m5368().f66118.m30080();
        this.f71256 = c1512.m5370();
        this.f71254 = 0;
        this.f71255 = 0;
    }

    public C22109(PackageManager packageManager, C17328 c17328, int i, int i2) {
        this.f71253 = c17328;
        this.f71256 = c17328.m40677(packageManager);
        this.f71254 = i;
        this.f71255 = i2;
    }
}
