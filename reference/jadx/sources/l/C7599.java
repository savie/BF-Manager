package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25089;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22273 f25090;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9002 f25091 = new C9002(65520);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20764(InputStream inputStream) throws C0141 {
        this.f25089 = 0;
        C9002 c9002 = this.f25091;
        c9002.f29318 = 0;
        c9002.m24019(inputStream);
        int iM24021 = c9002.m24021(this.f25089);
        this.f25089 += 4;
        if (iM24021 != -889275714) {
            throw new C0141("illegal.start.of.class.file");
        }
        m20763();
        char cM20763 = m20763();
        if (cM20763 < '5') {
            throw new C0141(C13645.m33382(cM20763, "bad major version number for module: "));
        }
        C22273 c22273 = new C22273(null, c9002, null, null);
        this.f25090 = c22273;
        this.f25089 = c22273.m50335(c9002, this.f25089);
        char cM20764 = m20763();
        if (cM20764 != 32768) {
            throw new C0141(C4791.m14766(new StringBuilder("invalid access flags for module: 0x"), cM20764));
        }
        m20763();
        m20762(m20763(), "super_class");
        m20762(m20763(), "interface_count");
        m20762(m20763(), "fields_count");
        m20762(m20763(), "methods_count");
        char cM20765 = m20763();
        for (int i = 0; i < cM20765; i++) {
            char cM20766 = m20763();
            int iM24022 = c9002.m24021(this.f25089);
            this.f25089 += 4;
            if (((String) this.f25090.m50338(cM20766, new C14483(12))).equals("Module") && iM24022 > 2) {
                return (String) this.f25090.m50344(m20763(), new C13921(6));
            }
            this.f25089 += iM24022;
        }
        throw new C0141("no Module attribute");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20762(int i, String str) throws C0141 {
        if (i == 0) {
            return;
        }
        throw new C0141("invalid " + str + " for module: " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m20763() {
        char cM24023 = this.f25091.m24023(this.f25089);
        this.f25089 += 2;
        return cM24023;
    }
}
