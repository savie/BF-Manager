package l;

/* JADX INFO: renamed from: l.ۡ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9390 extends C19087 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f30474;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f30475;

    @Override // l.C19087
    /* JADX INFO: renamed from: ᩶ */
    public final String mo4365() {
        int i = this.f30474;
        int i2 = this.f30475;
        StringBuilder sb = new StringBuilder();
        EnumC15863 enumC15863 = EnumC15863.AE_ENUM;
        EnumC15863 enumC15864 = this.f61803;
        if (enumC15864 == enumC15863) {
            String name = this.f6371.getName(i2);
            String name2 = this.f6371.getName(i);
            sb.append(enumC15864.m37825());
            sb.append(' ');
            if (this.f67132) {
                sb.append(String.format("#%d.#%d", Integer.valueOf(i2), Integer.valueOf(i)));
                if (!this.f67146) {
                    sb.append(C3188.m10404(" /* ", name, ".", name2, " */"));
                }
            } else {
                C22121.m50078(sb, name, ".", name2);
            }
        }
        return sb.toString();
    }

    @Override // l.C19087
    public final String toString() {
        return C3188.m10404("<", this.f6365, " ", mo4365(), ">");
    }

    @Override // l.C19087, l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        if (m6504() == EnumC5619.HAS_DEFAULT_VALUE) {
            m47993(C8947.m23910(new StringBuilder(), m6507(), "%s }"), mo4365());
        } else {
            m48009(mo4365());
        }
    }
}
