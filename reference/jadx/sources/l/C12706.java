package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C12706 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c1145.m4214();
        } else {
            c1145.m4201(number.doubleValue());
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        return Double.valueOf(c5379.m14920());
    }
}
