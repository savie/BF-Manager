package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1303 extends AbstractC21765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f5570;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7675 f5571;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 f5572;

    public C1303(C7675 c7675, C21825 c21825, EnumSet enumSet) {
        this.f5571 = c7675;
        this.f5572 = c21825;
        this.f5570 = enumSet;
    }

    public final String toString() {
        C7675 c7675 = this.f5571;
        C21825 c21825 = this.f5572;
        if (c21825 == null) {
            return "Opens[" + c7675 + "]";
        }
        return "Opens[" + c7675 + ":" + c21825 + "]";
    }

    @Override // l.InterfaceC14044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4647(InterfaceC2753 interfaceC2753) {
        interfaceC2753.mo8398(this);
    }
}
