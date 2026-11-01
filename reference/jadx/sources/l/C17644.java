package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C17644 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Character ch = (Character) obj;
        c1145.m4212(ch == null ? null : String.valueOf(ch));
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        if (strM14922.length() == 1) {
            return Character.valueOf(strM14922.charAt(0));
        }
        StringBuilder sbM30914 = C12441.m30914("Expecting character, got: ", strM14922, "; at ");
        sbM30914.append(c5379.m14928());
        throw new C22003(sbM30914.toString());
    }
}
