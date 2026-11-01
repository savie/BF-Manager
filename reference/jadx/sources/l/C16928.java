package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܽ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16928 extends AbstractC6344 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23984 f54126;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f54127;

    public /* synthetic */ C16928(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, C23984 c23984, int i) {
        this(abstractC3729, interfaceC3800, interfaceC3801, c23984);
    }

    public C16928(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, C23984 c23984) {
        super(abstractC3729, interfaceC3800);
        C13638.requireNonNull(interfaceC3801);
        this.f54127 = interfaceC3801;
        this.f54126 = c23984;
    }

    @Override // l.InterfaceC3458
    public final String getName() {
        return this.f54126.m35483(this.f54127).toString();
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final String mo17449(Collection collection) {
        String strSubstring = this.f54126.f48427;
        int iLastIndexOf = strSubstring.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        return strSubstring.replace("/", ".");
    }

    @Override // l.AbstractC6344
    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileObject[");
        sb.append(this.f54127);
        sb.append(":");
        return C22697.m50267(sb, this.f54126.f48427, "]");
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6344 mo17450(String str) {
        return new C16928(this.f21403, this.f21404.resolveSibling(str), this.f54127, new C23984(this.f54126.m52821(), str));
    }
}
