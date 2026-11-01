package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594 extends C12632 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12590 f2581;

    public C0594(C12590 c12590) {
        this.f2581 = c12590;
    }

    @Override // l.InterfaceC23797
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Boolean mo2801(C21825 c21825) {
        if (c21825.m48596() < 2) {
            return Boolean.FALSE;
        }
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            InterfaceC11097 interfaceC11097 = (InterfaceC11097) it.next();
            C12590 c12590 = this.f2581;
            c12590.m31331();
            c12590.f42078.println(interfaceC11097.toString());
        }
        return Boolean.TRUE;
    }
}
