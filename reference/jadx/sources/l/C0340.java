package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0340 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f1830;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Pattern f1831;

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        String str = this.f1830;
        return c15497.mo41539(str) && this.f1831.matcher(c15497.mo41538(str)).find();
    }

    public final String toString() {
        return C3188.m10404("[", this.f1830, "~=", this.f1831.toString(), "]");
    }
}
