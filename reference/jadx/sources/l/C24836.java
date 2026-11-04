package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes.dex */
public final class C24836 extends AbstractC11528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f80329;

    public C24836(Map map) {
        this.f80329 = map;
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ */
    public final void mo29029(InterfaceC20029 interfaceC20029, C12901 c12901) {
        c12901.m31942(new C5444(this, interfaceC20029));
        c12901.m31941(new C1715(this, interfaceC20029));
        c12901.m31939();
    }

    @Override // l.AbstractC11528
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17376 mo29028(String str) {
        return (AbstractC17376) this.f80329.get(str);
    }
}
