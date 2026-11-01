package l;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0890 extends C10730 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Pattern f3592;

    public C0890() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f3592 = Pattern.compile("\\A\\d+");
    }

    @Override // l.AbstractC23430
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo3563() {
        boolean zMo3563 = super.mo3563();
        if (!zMo3563 || Build.VERSION.SDK_INT >= 29) {
            return zMo3563;
        }
        PackageInfo packageInfoM19143 = C7201.m19143();
        if (packageInfoM19143 != null) {
            Matcher matcher = this.f3592.matcher(packageInfoM19143.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoM19143.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
