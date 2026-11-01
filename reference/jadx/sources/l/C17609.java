package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܿ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f55956;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f55957;

    public C17609(Bundle bundle, String str) {
        if (str == null) {
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        this.f55957 = str;
        this.f55956 = bundle;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m40935() {
        return this.f55957;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m40934() {
        return this.f55956;
    }
}
