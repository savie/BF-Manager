package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C2205 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        c1145.m4212(uuid == null ? null : uuid.toString());
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        try {
            return UUID.fromString(strM14922);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM30914 = C12441.m30914("Failed parsing '", strM14922, "' as UUID; at path ");
            sbM30914.append(c5379.m14928());
            throw new C22003(sbM30914.toString(), e);
        }
    }
}
