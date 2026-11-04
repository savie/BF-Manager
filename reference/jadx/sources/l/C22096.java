package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷ܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: VIU4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22096 implements InterfaceC23283 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6434 f71238;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f71239;

    public C22096(String str, Map map, Map map2) {
        this.f71239 = str;
        this.f71238 = C6434.m18209(map, map2);
    }

    @Override // l.InterfaceC23283
    /* JADX INFO: renamed from: ۤ */
    public final String mo45712() {
        return this.f71239;
    }

    @Override // l.InterfaceC23283
    /* JADX INFO: renamed from: ۙ */
    public final C6434 mo45711() {
        return this.f71238;
    }

    @Override // l.InterfaceC23283
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo45713() {
        return this.f71238 != InterfaceC25080.f81106;
    }

    public final String toString() {
        return this.f71239;
    }
}
