package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes.dex */
public final class C23677 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1960 f76772;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6633 f76773;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18499 f76774 = new C18499();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f76775 = new HashMap();

    public C23677(C6633 c6633, InterfaceC1960 interfaceC1960) {
        this.f76773 = c6633;
        this.f76772 = interfaceC1960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52917(Object obj, int i, int i2, int i3) {
        C16963 c16963 = new C16963();
        c16963.f55469 = obj;
        c16963.f55468 = i;
        c16963.f55467 = i2;
        c16963.f55466 = i3;
        this.f76774.m43089(c16963);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52916(C9002 c9002, InterfaceC1829 interfaceC1829, C7312 c7312) {
        int iM52913;
        int iM52914;
        new C17709(this).m41471(this.f76773);
        int i = 0;
        for (C14769 c14769M43093 = this.f76774.m43093(); c14769M43093.m35550(); c14769M43093 = c14769M43093.f48336) {
            C16963 c16963 = (C16963) c14769M43093.f48335;
            int i2 = c16963.f55467;
            int i3 = c16963.f55466;
            if (i2 != i3) {
                C16217 c16217 = (C16217) this.f76775.get(c16963.f55469);
                if (c16217 != null) {
                    int i4 = c16217.f52701;
                    if (i4 != -1 && c16217.f52700 != -1 && (iM52913 = m52913(i4, interfaceC1829, c7312)) != -1 && (iM52914 = m52913(c16217.f52700, interfaceC1829, c7312)) != -1) {
                        c9002.m24022(c16963.f55467);
                        c9002.m24022(i3 - 1);
                        c9002.m24020(iM52913);
                        c9002.m24020(iM52914);
                        c9002.m24022(c16963.f55468);
                        i++;
                    }
                } else {
                    C11972.m30024("CRT: tree source positions are undefined");
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52913(int i, InterfaceC1829 interfaceC1829, C7312 c7312) {
        int iMo6321 = interfaceC1829.mo6321(i);
        int iMo6322 = interfaceC1829.mo6322(i);
        if (iMo6321 < 1) {
            throw new IllegalArgumentException("line must be greater than 0");
        }
        if (iMo6322 < 1) {
            throw new IllegalArgumentException("column must be greater than 0");
        }
        int i2 = (iMo6321 > 4194303 || iMo6322 > 1023) ? -1 : (iMo6321 << 10) + iMo6322;
        if (i2 == -1) {
            C25213 c25213 = C13146.f42046;
            c7312.m34518(i, new C25213("compiler", "position.overflow", Integer.valueOf(iMo6321)));
        }
        return i2;
    }
}
