package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16835 extends AbstractC22827 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f54295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f54296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54297;

    public C16835(C24975 c24975, C8565 c8565) {
        this.f54295 = c24975;
        int iM22996 = c8565.m22996();
        this.f54297 = iM22996;
        this.f54296 = c8565.m23001();
        for (int i = 0; i < iM22996; i++) {
            AbstractC21976.m49711(c8565);
        }
    }

    @Override // l.InterfaceC13062
    public final List getValue() {
        return new C25041(this, this.f54295, this.f54296, this.f54297);
    }
}
