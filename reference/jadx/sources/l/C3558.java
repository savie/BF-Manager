package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3558 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f12183;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Bundle f12185;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f12186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9545 f12187;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Context f12189;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f12190;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f12191;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public ArrayList f12192;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f12194;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC12507 f12195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f12196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PendingIntent f12197;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Notification f12199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f12184 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f12193 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f12182 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f12198 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12188 = 0;

    public C3558(Context context, String str) {
        Notification notification = new Notification();
        this.f12199 = notification;
        this.f12189 = context;
        this.f12186 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f12191 = 0;
        this.f12192 = new ArrayList();
        this.f12196 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11596(boolean z) {
        this.f12198 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m11599() {
        this.f12199.icon = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11600() {
        this.f12183 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11594(String str) {
        this.f12190 = m11588(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11593(CharSequence charSequence) {
        this.f12194 = m11588(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11591(PendingIntent pendingIntent) {
        this.f12197 = pendingIntent;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11597() {
        this.f12199.flags |= 2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11601() {
        this.f12199.flags |= 16;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11602() {
        this.f12191 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11590(int i, String str, PendingIntent pendingIntent) {
        this.f12184.add(new C16236(i == 0 ? null : C9545.m24960((Resources) null, "", i), str, pendingIntent, new Bundle(), null, null, true, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11595(AbstractC12507 abstractC12507) {
        if (this.f12195 != abstractC12507) {
            this.f12195 = abstractC12507;
            if (abstractC12507 == null || abstractC12507.f40156 == this) {
                return;
            }
            abstractC12507.f40156 = this;
            m11595(abstractC12507);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m11598() {
        this.f12188 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification m11589() {
        return new C19220(this).m44554();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static CharSequence m11588(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11592(Bitmap bitmap) {
        C9545 c9545M24962;
        if (bitmap == null) {
            c9545M24962 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f12189.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            c9545M24962 = C9545.m24962(bitmap);
        }
        this.f12187 = c9545M24962;
    }
}
