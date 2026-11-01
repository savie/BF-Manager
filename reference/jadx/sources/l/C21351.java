package l;

/* JADX INFO: renamed from: l.᩸ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21351 extends C6534 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f69469;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f69470;

    @Override // l.C6534
    /* JADX INFO: renamed from: ᩶ */
    public final String mo17752() {
        int i = this.f69469;
        int i2 = this.f69470;
        StringBuilder sb = new StringBuilder();
        EnumC3046 enumC3046 = EnumC3046.AE_ENUM;
        EnumC3046 enumC3047 = this.f22000;
        if (enumC3047 == enumC3046) {
            String name = this.f47512.getName(i2);
            String name2 = this.f47512.getName(i);
            sb.append(enumC3047.m9140());
            sb.append(' ');
            if (this.f22692) {
                sb.append(String.format("#%d.#%d", Integer.valueOf(i2), Integer.valueOf(i)));
                if (!this.f22704) {
                    sb.append(C0242.m1617(" /* ", name, ".", name2, " */"));
                }
            } else {
                C0219.m1594(sb, name, ".", name2);
            }
        }
        return sb.toString();
    }

    @Override // l.C6534
    public final String toString() {
        return C0242.m1617("<", this.f47507, " ", mo17752(), ">");
    }

    @Override // l.C6534, l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        if (m34921() == EnumC23676.HAS_DEFAULT_VALUE) {
            m18215(C22697.m50267(new StringBuilder(), m34920(), "%s }"), mo17752());
        } else {
            m18228(mo17752());
        }
    }
}
