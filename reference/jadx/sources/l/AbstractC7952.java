package l;

/* JADX INFO: renamed from: l.۟ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1FC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7952 implements InterfaceC6461 {
    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo13484(C13304 c13304, C12426 c12426, C2008 c2008);

    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ */
    public void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        c13304.m32860(false);
        if (c2008.m6864()) {
            String strM39906 = c2008.m6859().m39906();
            if (!strM39906.startsWith("@")) {
                if (strM39906.startsWith("?")) {
                    C24361.m54435(c13304, c12426, c2008);
                    return;
                }
            } else {
                C24361.m54434(c13304, c2008, c12426, true);
                return;
            }
        }
        mo13484(c13304, c12426, c2008);
    }
}
