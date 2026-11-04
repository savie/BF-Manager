package l;

/* JADX INFO: renamed from: l.ۧۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X23D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC7169 f35816;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19585 f35817;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10634 f35818;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35819 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC13880 f35820;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19585 m28706() {
        return this.f35817;
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(200, "<<\n mode: ");
        sbM3018.append(this.f35820);
        sbM3018.append("\n ecLevel: ");
        sbM3018.append(this.f35816);
        sbM3018.append("\n version: ");
        sbM3018.append(this.f35818);
        sbM3018.append("\n maskPattern: ");
        sbM3018.append(this.f35819);
        if (this.f35817 == null) {
            sbM3018.append("\n matrix: null\n");
        } else {
            sbM3018.append("\n matrix:\n");
            sbM3018.append(this.f35817);
        }
        sbM3018.append(">>\n");
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28710(EnumC13880 enumC13880) {
        this.f35820 = enumC13880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28708(EnumC7169 enumC7169) {
        this.f35816 = enumC7169;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28709(C10634 c10634) {
        this.f35818 = c10634;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28707(int i) {
        this.f35819 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28711(C19585 c19585) {
        this.f35817 = c19585;
    }
}
