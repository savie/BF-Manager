package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.۬ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13155 implements InterfaceC22327 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8653 f43790;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1159 f43791;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5393 f43792;

    public C13155(C8653 c8653, C1159 c1159, C5393 c5393) {
        this.f43790 = c8653;
        this.f43791 = c1159;
        this.f43792 = c5393;
        if (c8653.m22453() == 0 && c8653.m22454() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c8653.m22457() != 0 && c8653.m22456() != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // l.InterfaceC14298
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect mo32526() {
        return this.f43790.m22455();
    }

    @Override // l.InterfaceC22327
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2570 mo32527() {
        C8653 c8653 = this.f43790;
        if (c8653.m22453() > c8653.m22454()) {
            return C2570.f10129;
        }
        return C2570.f10128;
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.f43790 + ", type=" + this.f43791 + ", state=" + this.f43792 + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13155.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C13155 c13155 = (C13155) obj;
            return C13465.m32965(this.f43790, c13155.f43790) && C13465.m32965(this.f43791, c13155.f43791) && C13465.m32965(this.f43792, c13155.f43792);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    public final int hashCode() {
        return this.f43792.hashCode() + ((this.f43791.hashCode() + (this.f43790.hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC22327
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo32528() {
        C1159 c1159 = C1159.f5183;
        C1159 c11510 = this.f43791;
        if (C13465.m32965(c11510, c1159)) {
            return true;
        }
        return C13465.m32965(c11510, C1159.f5184) && C13465.m32965(this.f43792, C5393.f18618);
    }
}
