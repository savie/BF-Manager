package l;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49561;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC20823 f49562;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49563;

    public C15179() {
        this.f49563 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f49562 = C18000.f57552;
        this.f49561 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18000 m36397() {
        if (this.f49561 == 2 && this.f49562 == C18000.f57552) {
            return this.f49563 ? C18000.f57557 : C18000.f57555;
        }
        return new C18000(this.f49563, this.f49561, this.f49562);
    }
}
