package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۤ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11132 implements InterfaceC5167 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17342 f35096;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22321 f35097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13612 f35098;

    public C11132(C17342 c17342, C22321 c22321, C13612 c13612) {
        this.f35096 = c17342;
        this.f35097 = c22321;
        this.f35098 = c13612;
        if (c17342.m40724() == 0 && c17342.m40720() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c17342.m40723() != 0 && c17342.m40721() != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // l.InterfaceC7647
    /* JADX INFO: renamed from: ᩷ */
    public final Rect mo20861() {
        return this.f35096.m40722();
    }

    @Override // l.InterfaceC5167
    /* JADX INFO: renamed from: ۙ */
    public final C6901 mo15587() {
        C17342 c17342 = this.f35096;
        if (c17342.m40724() > c17342.m40720()) {
            return C6901.f22880;
        }
        return C6901.f22879;
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.f35096 + ", type=" + this.f35097 + ", state=" + this.f35098 + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11132.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C11132 c11132 = (C11132) obj;
            return C15243.m36589(this.f35096, c11132.f35096) && C15243.m36589(this.f35097, c11132.f35097) && C15243.m36589(this.f35098, c11132.f35098);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    public final int hashCode() {
        return this.f35098.hashCode() + ((this.f35097.hashCode() + (this.f35096.hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC5167
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo15588() {
        C22321 c22321 = C22321.f72250;
        C22321 c22322 = this.f35097;
        if (C15243.m36589(c22322, c22321)) {
            return true;
        }
        return C15243.m36589(c22322, C22321.f72251) && C15243.m36589(this.f35098, C13612.f43238);
    }
}
