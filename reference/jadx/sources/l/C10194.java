package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10194 extends AbstractC14425 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24404 f32617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC7886 f32618;

    @Override // l.InterfaceC7886
    public final int getVisibility() {
        return this.f32618.getVisibility();
    }

    @Override // l.InterfaceC7886
    public final String getType() {
        return (String) this.f32617.m54589().mo2798(this.f32618.getType());
    }

    @Override // l.InterfaceC7886
    public Set getElements() {
        return C19906.m45837(this.f32618.getElements(), this.f32617.m54579());
    }

    public C10194(C24404 c24404, InterfaceC7886 interfaceC7886) {
        this.f32617 = c24404;
        this.f32618 = interfaceC7886;
    }
}
