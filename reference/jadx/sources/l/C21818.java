package l;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C21818 extends C6427 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Pattern f69558;

    public C21818() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f69558 = Pattern.compile("\\A\\d+");
    }

    @Override // l.AbstractC24327
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo27117() {
        boolean zMo27117 = super.mo27117();
        if (!zMo27117 || Build.VERSION.SDK_INT >= 29) {
            return zMo27117;
        }
        PackageInfo packageInfoM29275 = C11646.m29275();
        if (packageInfoM29275 != null) {
            Matcher matcher = this.f69558.matcher(packageInfoM29275.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoM29275.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
