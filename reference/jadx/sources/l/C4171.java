package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4171 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12374 f14158;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f14159;

    public C4171(int i, int i2) {
        this.f14158 = EnumC12374.values()[i];
        this.f14159 = i2;
    }

    public C4171(EnumC12374 enumC12374, int i) {
        this.f14158 = enumC12374;
        this.f14159 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13334() {
        return this.f14158.m30859();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13333() {
        return this.f14159;
    }

    public final String toString() {
        String strM31437;
        StringBuilder sb = new StringBuilder();
        EnumC12374 enumC12374 = this.f14158;
        sb.append(enumC12374.m30858());
        if (enumC12374.f39743 == 3) {
            strM31437 = C12669.m31437(this.f14159, l.d, new StringBuilder("{"));
        } else {
            strM31437 = "";
        }
        sb.append(strM31437);
        return sb.toString();
    }
}
