package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C18434 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        c1145.m4202((Boolean) obj);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        EnumC22313 enumC22313M14916 = c5379.m14916();
        if (enumC22313M14916 == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        if (enumC22313M14916 == EnumC22313.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(c5379.m14922()));
        }
        return Boolean.valueOf(c5379.m14927());
    }
}
