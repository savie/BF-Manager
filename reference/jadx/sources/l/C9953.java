package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9953 extends IOException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC20243 f31911;

    public C9953(C18684 c18684, String str) {
        super(String.format("%s returned %s (%d/%d): %s", c18684.m43462(), Long.valueOf(c18684.m43472()), Long.valueOf(c18684.m43472()), Long.valueOf(c18684.m43472()), str));
        this.f31911 = EnumC20243.m46515(c18684.m43472());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20243 m25787() {
        return this.f31911;
    }
}
