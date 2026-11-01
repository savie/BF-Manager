package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2941 extends C20581 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f11046;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f11047;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21825 f11048;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2941(C13609 c13609, C22492 c22492, C21825 c21825) {
        super(c13609, c22492);
        this.f11046 = c13609;
        this.f11048 = c21825;
        this.f11047 = C9030.stream(c22492.m50004()).anyMatch(new C5223(1));
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 mo8774() {
        C13609 c13609;
        if (this.f67072 == null) {
            C19003 c19003 = new C19003();
            C21825 c21825 = this.f11048;
            C6656 c6656 = (C6656) c21825.last();
            Iterator it = c21825.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c13609 = this.f11046;
                if (!zHasNext) {
                    break;
                }
                C6656 c6657 = (C6656) it.next();
                c19003.m43723((c6657 == c6656 && this.f11047) ? c13609.f44895.m52416(c6657.f22475.f77449) : c6657.f22475.f77449);
            }
            this.f67072 = new C13757(c19003.m43726(), c13609.f44893.f14293, C21825.m48588(), c13609.f44893.f14240);
        }
        return this.f67072;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18258 mo8773() {
        C18258 c18258Mo8773 = super.mo8773();
        c18258Mo8773.f77447 |= 2251868533161984L;
        C19003 c19003 = new C19003();
        C21825<C6656> c21825 = this.f11048;
        C6656 c6656 = (C6656) c21825.last();
        for (C6656 c6657 : c21825) {
            c19003.m43723(new C6263(((c6657 == c6656 && this.f11047) ? 17179869184L : 0L) | 2305843017820405760L, c6657.f22478, c6657.f22475.f77449, c18258Mo8773));
        }
        c18258Mo8773.f58259 = c19003.m43726();
        c18258Mo8773.f77447 |= 2305843009213693952L;
        return c18258Mo8773;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23195 mo8775(C23195 c23195) {
        C21825 c21825M1922;
        C21825 c21825 = this.f11048;
        for (C6656 c6656 : c23195.f75270) {
            C16142 c16142M49998 = ((C22492) this.f67071).m49998(c6656.f22475);
            C5286 c5286 = this.f11046.f44896;
            c5286.f18294 = c6656.f30189;
            C0306 c0306 = new C0306(c5286);
            C21783 c21783 = c6656.f22476;
            if (!c16142M49998.m38213().isEmpty()) {
                c21825M1922 = c0306.m1922((Object) null, c16142M49998.m38213());
            } else {
                c21825M1922 = C21825.m48588();
            }
            c21783.f70566 = c21825M1922;
            c6656.f22477 = (AbstractC5930) c0306.mo1921(((C6656) c21825.f70876).f22477, (Object) null);
            c21825 = c21825.f70877;
        }
        return c23195;
    }
}
