package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C23369 extends C15909 {
    public C23369(C3977 c3977, WindowInsets windowInsets) {
        super(c3977, windowInsets);
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ᩸ */
    public C6279 mo30453() {
        return C6279.m17951(this.f56581.getDisplayCutout());
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public C3977 mo30441() {
        return C3977.m12812(null, this.f56581.consumeDisplayCutout());
    }

    @Override // l.C17401, l.C12180
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23369)) {
            return false;
        }
        C23369 c23369 = (C23369) obj;
        return C17359.equals(this.f56581, c23369.f56581) && C17359.equals(this.f56580, c23369.f56580);
    }

    @Override // l.C12180
    public int hashCode() {
        return this.f56581.hashCode();
    }
}
