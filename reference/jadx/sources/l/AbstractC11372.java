package l;

/* JADX INFO: renamed from: l.ۨ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1FC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11372 implements InterfaceC23988 {
    /* JADX INFO: renamed from: ܰ */
    public abstract void mo3095(C18551 c18551, C11288 c11288, C8340 c8340);

    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public void mo6812(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        c18551.m42946(false);
        if (c8340.m21789()) {
            String strM26418 = c8340.m21784().m26418();
            if (!strM26418.startsWith("@")) {
                if (strM26418.startsWith("?")) {
                    C14816.m35488(c18551, c11288, c8340);
                    return;
                }
            } else {
                C14816.m35487(c18551, c8340, c11288, true);
                return;
            }
        }
        mo3095(c18551, c11288, c8340);
    }
}
