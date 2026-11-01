package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C7851 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        c1145.m4212(bool == null ? "null" : bool.toString());
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        return Boolean.valueOf(c5379.m14922());
    }
}
