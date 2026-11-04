package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩸ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22931 extends AbstractC13234 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f74504;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2048 f74505;

    public /* synthetic */ C22931(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, C2048 c2048, int i) {
        this(abstractC24643, interfaceC24329, interfaceC243210, c2048);
    }

    public C22931(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, C2048 c2048) {
        super(abstractC24643, interfaceC24329);
        C17359.requireNonNull(interfaceC243210);
        this.f74504 = interfaceC243210;
        this.f74505 = c2048;
    }

    @Override // l.InterfaceC11501
    public final String getName() {
        return this.f74505.m29493(this.f74504).toString();
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final String mo32788(Collection collection) {
        String strSubstring = this.f74505.f37972;
        int iLastIndexOf = strSubstring.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        return strSubstring.replace("/", ".");
    }

    @Override // l.AbstractC13234
    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileObject[");
        sb.append(this.f74504);
        sb.append(":");
        return C8947.m23910(sb, this.f74505.f37972, "]");
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13234 mo32789(String str) {
        return new C22931(this.f42298, this.f42299.resolveSibling(str), this.f74504, new C2048(this.f74505.m7059(), str));
    }
}
