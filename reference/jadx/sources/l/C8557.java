package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C8557 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c1145.m4214();
        } else {
            c1145.m4211(number.shortValue());
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        try {
            int iM14926 = c5379.m14926();
            if (iM14926 <= 65535 && iM14926 >= -32768) {
                return Short.valueOf((short) iM14926);
            }
            StringBuilder sbM40153 = C17214.m40153(iM14926, "Lossy conversion from ", " to short; at path ");
            sbM40153.append(c5379.m14928());
            throw new C22003(sbM40153.toString());
        } catch (NumberFormatException e) {
            throw new C22003(e);
        }
    }
}
