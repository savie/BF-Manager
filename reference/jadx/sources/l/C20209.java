package l;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64882;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC20955 f64883;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f64884;

    public C20209() {
        this.f64884 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f64883 = C6039.f20659;
        this.f64882 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6039 m46481() {
        if (this.f64882 == 2 && this.f64883 == C6039.f20659) {
            return this.f64884 ? C6039.f20660 : C6039.f20661;
        }
        return new C6039(this.f64884, this.f64882, this.f64883);
    }
}
