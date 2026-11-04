package l;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۜ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C7447 extends AbstractC22081 implements InterfaceC10122 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3630 f24505;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11330 f24506;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21530 f24507;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC5439 f24508;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21530 f24509;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final SortedSet f24510;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20784 f24511;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC5439 f24512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18634 f24514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SortedSet f24515;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24504 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24516 = 0;

    public C7447(C21530 c21530, int i, C21530 c21531, C20784 c20784, C3630 c3630, C18634 c18634, AbstractC5439 abstractC5439, AbstractC5439 abstractC54310, Iterable iterable, C11330 c11330) {
        iterable = iterable == null ? AbstractC1928.of() : iterable;
        abstractC5439 = abstractC5439 == null ? AbstractC5439.of() : abstractC5439;
        abstractC54310 = abstractC54310 == null ? AbstractC5439.of() : abstractC54310;
        this.f24507 = c21530;
        this.f24513 = i;
        this.f24509 = c21531;
        this.f24511 = c20784;
        this.f24505 = c3630;
        this.f24514 = c18634;
        this.f24510 = abstractC5439;
        this.f24515 = abstractC54310;
        this.f24508 = AbstractC5439.m16227(C16625.m39338(iterable, C4244.f15461));
        this.f24512 = AbstractC5439.m16227(C16625.m39338(iterable, C4244.f15463));
        this.f24506 = c11330;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return this.f24507.f68791.f12443;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo20404() {
        return this.f24513;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public final String mo20397() {
        C21530 c21530 = this.f24509;
        if (c21530 == null) {
            return null;
        }
        return c21530.f68791.f12443;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String mo20400() {
        C3630 c3630 = this.f24505;
        if (c3630 == null) {
            return null;
        }
        return c3630.f12443;
    }

    @Override // l.InterfaceC10122
    public final Set getAnnotations() {
        return this.f24514;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20398() {
        return this.f24510;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۖۙ */
    public final SortedSet mo20398() {
        return this.f24510;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable mo20401() {
        return this.f24515;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20405() {
        return this.f24508;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ۤ */
    public final AbstractC5439 mo20405() {
        return this.f24508;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20403() {
        return this.f24512;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20399(C21530 c21530) {
        this.f24509 = c21530;
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final List mo20402() {
        return C4583.m14373(this.f24511, C11382.m28722());
    }

    @Override // l.InterfaceC10122
    public final Iterable getFields() {
        return new C2972(this);
    }

    @Override // l.InterfaceC10122
    public final Iterable getMethods() {
        return new C8938(this);
    }

    @Override // l.InterfaceC10122
    public final Collection getMethods() {
        return new C8938(this);
    }
}
