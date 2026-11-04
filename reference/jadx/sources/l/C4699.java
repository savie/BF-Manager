package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4699 extends C19087 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f16586;

    @Override // l.C19087
    /* JADX INFO: renamed from: ᩶ */
    public final String mo4365() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = C7900.f26252;
        EnumC15863 enumC15863 = this.f61803;
        switch (iArr[enumC15863.ordinal()]) {
            case 1:
                sb.append(m14579("", new C8996(this, 1)));
                break;
            case 2:
            case 3:
            case 5:
                sb.append(m14579(enumC15863.m37825(), new C7505(this, 1)));
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                sb.append(m14579("", new Supplier() { // from class: l.ۖ۫᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C4699 c4699 = this.f8518;
                        return c4699.f6371.m5631(c4699.f16586).mo14388();
                    }
                }));
                break;
            case 6:
                sb.append(m14579(enumC15863.m37825(), new Supplier() { // from class: l.۠۫᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C4699 c4699 = this.f28239;
                        return ((Integer) ((C10554) c4699.f6371.m5631(c4699.f16586)).f49068).intValue() == 0 ? "false" : "true";
                    }
                }));
                break;
            case 10:
                sb.append(m14579(enumC15863.m37825(), new Supplier() { // from class: l.ۜ۫᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C4699 c4699 = this.f23653;
                        return c4699.f6371.getName(c4699.f16586);
                    }
                }));
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m14579(String str, Supplier supplier) {
        int i = this.f16586;
        String strConcat = str.isEmpty() ? "" : str.concat(" ");
        if (!this.f67132) {
            StringBuilder sbM27333 = C10732.m27333(strConcat);
            sbM27333.append((String) supplier.get());
            return sbM27333.toString();
        }
        if (this.f67146) {
            StringBuilder sbM27334 = C10732.m27333(strConcat);
            sbM27334.append(String.format("#%d", Integer.valueOf(i)));
            return sbM27334.toString();
        }
        StringBuilder sbM27335 = C10732.m27333(strConcat);
        sbM27335.append(String.format("#%d /* %s */", Integer.valueOf(i), supplier.get()));
        return sbM27335.toString();
    }

    @Override // l.C19087, l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        EnumC5619 enumC5619M6504 = m6504();
        if (enumC5619M6504 == EnumC5619.HAS_DEFAULT_VALUE) {
            m47993(C8947.m23910(new StringBuilder(), m6507(), "%s }"), mo4365());
        } else if (enumC5619M6504 == EnumC5619.RIGHT_OPERAND) {
            m47993(" %s }", mo4365());
        } else {
            m48009(mo4365());
        }
    }
}
