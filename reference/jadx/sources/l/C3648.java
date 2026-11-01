package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۘۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3648 extends AbstractC22436 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0287 f13377 = new C12822();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC5143 f13378;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f13379;

    public C3648(String str, InterfaceC5143 interfaceC5143) {
        this.f13379 = str;
        this.f13378 = interfaceC5143;
    }

    public C3648(String str, InterfaceC10975 interfaceC10975) {
        this.f13379 = str;
        this.f13378 = C0909.m3626(interfaceC10975);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m10754(Collection collection) {
        return f13377.m1811((Iterable) collection);
    }

    @Override // l.InterfaceC6533
    public final String getName() {
        return this.f13379;
    }

    @Override // l.InterfaceC6533
    public final InterfaceC10975 getValue() {
        return this.f13378;
    }
}
