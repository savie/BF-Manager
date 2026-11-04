package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11774 extends EnumC14757 {
    public /* synthetic */ C11774() {
        this("FORMAT_45CC", 31);
    }

    public C11774(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM35466 = EnumC14757.m35466(i);
        if (iM35466 != 250) {
            throw new UnsupportedOperationException(String.valueOf(iM35466));
        }
        int iM35445 = EnumC14757.m35445(i);
        int iM35463 = EnumC14757.m35463(i);
        int i2 = interfaceC16337.read();
        int i3 = interfaceC16337.read();
        int iM35455 = EnumC14757.m35455(i3);
        int iM35483 = EnumC14757.m35483(i3);
        int iM35446 = EnumC14757.m35445(i3);
        int iM35464 = EnumC14757.m35463(i3);
        int i4 = interfaceC16337.read();
        C17083.m40217(iM35466);
        if (iM35463 < 1 || iM35463 > 5) {
            throw new C20288("bogus registerCount: ".concat(C5306.m15935(iM35463)), null);
        }
        return new C21471(this, iM35466, i2, i4, Arrays.copyOfRange(new int[]{iM35455, iM35483, iM35446, iM35464, iM35445}, 0, iM35463));
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        C21471 c21471 = (C21471) abstractC3659;
        EnumC14757.m35480(c21471.m11863(), EnumC14757.m35469(c21471.m48829(), c21471.mo2678()));
        EnumC14757.m35476(c21471.mo4904(), c21471.mo11867(), c21471.mo11865(), c21471.m48828());
        interfaceC23797.m53079();
    }
}
