package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5A1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20038 extends AbstractC18901 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18634 f64378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21530 f64379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3630 f64380;

    public C20038(C21530 c21530, C3630 c3630, C18634 c18634) {
        this.f64379 = c21530;
        this.f64380 = c3630;
        this.f64378 = c18634;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return this.f64379.f68791.f12443;
    }

    @Override // l.InterfaceC13851, l.InterfaceC15125
    public final String getName() {
        C3630 c3630 = this.f64380;
        if (c3630 == null) {
            return null;
        }
        return c3630.f12443;
    }

    @Override // l.InterfaceC13851
    public final Set getAnnotations() {
        return this.f64378;
    }
}
