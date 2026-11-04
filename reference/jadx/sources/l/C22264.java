package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6C3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22264 extends AbstractC6683 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Supplier f71739;

    public C22264(Supplier supplier) {
        super(1);
        this.f71739 = supplier;
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
        boolean z;
        if (!(interfaceC18213 instanceof C14287)) {
            return;
        }
        C14287 c14287 = (C14287) interfaceC18213;
        AbstractC14146 abstractC14146 = (AbstractC14146) this.f71739.get();
        abstractC14146.f44731 = c14287;
        int i = 0;
        while (true) {
            C24590.m54902(c2551, c14287, abstractC14146);
            if (abstractC14146.m34360()) {
                abstractC14146.m34362();
                z = true;
            } else {
                z = false;
            }
            int i2 = i + 1;
            if (i > 20) {
                c2551.m31138("Unexpected iteration count in SwitchBreakVisitor. Please report as an issue");
                return;
            } else if (!z) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
