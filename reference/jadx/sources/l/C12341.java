package l;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۫ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W14G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12341 implements InterfaceC23898 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f41242;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f41243;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f41244;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f41245;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f41246;

    public C12341(ResolveInfo resolveInfo) {
        this.f41245 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f41246 = activityInfo.packageName;
        this.f41243 = activityInfo.name;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo16278() {
        return this.f41244;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m30648() {
        this.f41244 = true;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16276() {
        return this.f41242;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30653() {
        this.f41242 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m30652(PackageManager packageManager) {
        CharSequence charSequenceLoadLabel = this.f41245.loadLabel(packageManager);
        if (charSequenceLoadLabel == null) {
            return this.f41243;
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m30650(PackageManager packageManager) {
        return this.f41245.loadIcon(packageManager);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m30651() {
        return this.f41246;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m30649() {
        return this.f41246 + "/" + this.f41243;
    }

    @Override // l.InterfaceC23898
    /* JADX INFO: renamed from: ۨ */
    public final ComponentName mo16277() {
        return new ComponentName(this.f41246, this.f41243);
    }
}
