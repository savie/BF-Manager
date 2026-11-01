package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8082 extends C18665 {
    public C8082(C15844 c15844, WindowInsets windowInsets) {
        super(c15844, windowInsets);
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9203 mo21289() {
        return C9203.m23665(this.f57445.getDisplayCutout());
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15844 mo21290() {
        return C15844.m37669(null, this.f57445.consumeDisplayCutout());
    }

    @Override // l.C17959, l.C10199
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8082)) {
            return false;
        }
        C8082 c8082 = (C8082) obj;
        return C13638.equals(this.f57445, c8082.f57445) && C13638.equals(this.f57446, c8082.f57446);
    }

    @Override // l.C10199
    public int hashCode() {
        return this.f57445.hashCode();
    }
}
