package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5A1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20002 extends AbstractC4090 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1428 f64021;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12863 f64022;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3067 f64023;

    public C20002(C1428 c1428, C3067 c3067, C12863 c12863) {
        this.f64021 = c1428;
        this.f64023 = c3067;
        this.f64022 = c12863;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return this.f64021.f5881.f11559;
    }

    @Override // l.InterfaceC19234, l.InterfaceC19940
    public final String getName() {
        C3067 c3067 = this.f64023;
        if (c3067 == null) {
            return null;
        }
        return c3067.f11559;
    }

    @Override // l.InterfaceC19234
    public final Set getAnnotations() {
        return this.f64022;
    }
}
