package l;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W14G */
/* JADX INFO: loaded from: classes5.dex */
public final class C17328 implements InterfaceC16648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f56424;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f56425;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f56426;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f56427;

    public C17328(ResolveInfo resolveInfo) {
        this.f56424 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f56426 = activityInfo.packageName;
        this.f56423 = activityInfo.name;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo39359() {
        return this.f56425;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m40674() {
        this.f56425 = true;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo39357() {
        return this.f56427;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40675() {
        this.f56427 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m40677(PackageManager packageManager) {
        CharSequence charSequenceLoadLabel = this.f56424.loadLabel(packageManager);
        if (charSequenceLoadLabel == null) {
            return this.f56423;
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m40673(PackageManager packageManager) {
        return this.f56424.loadIcon(packageManager);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m40676() {
        return this.f56426;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m40678() {
        return this.f56426 + "/" + this.f56423;
    }

    @Override // l.InterfaceC16648
    /* JADX INFO: renamed from: ۤ */
    public final ComponentName mo39358() {
        return new ComponentName(this.f56426, this.f56423);
    }
}
