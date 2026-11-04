package l;

/* JADX INFO: renamed from: l.ܽܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56F5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17620 implements InterfaceC11653 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57960;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41271(InterfaceC3145 interfaceC3145, C18959 c18959) {
        if (c18959 != null && interfaceC3145.mo10281()) {
            int offset = c18959.getOffset();
            C17620 c17620 = offset < 0 ? null : new C17620(offset);
            if (c17620 != null) {
                interfaceC3145.mo10276(c17620);
            }
        }
    }

    public C17620(int i) {
        this.f57960 = i;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.OFFSET;
    }

    public final String toString() {
        return "offset=" + this.f57960;
    }
}
