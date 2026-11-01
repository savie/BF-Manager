package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7KW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0243 f69600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20809 f69601 = new C20809(65520);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m47953(InputStream inputStream) throws C15061 {
        this.f69599 = 0;
        C20809 c20809 = this.f69601;
        c20809.f67646 = 0;
        c20809.m46795(inputStream);
        int iM46796 = c20809.m46796(this.f69599);
        this.f69599 += 4;
        if (iM46796 != -889275714) {
            throw new C15061("illegal.start.of.class.file");
        }
        m47952();
        char cM47952 = m47952();
        if (cM47952 < '5') {
            throw new C15061(C8479.m22141(cM47952, "bad major version number for module: "));
        }
        C0243 c0243 = new C0243(null, c20809, null, null);
        this.f69600 = c0243;
        this.f69599 = c0243.m1625(c20809, this.f69599);
        char cM47953 = m47952();
        if (cM47953 != 32768) {
            throw new C15061(C9576.m24440(new StringBuilder("invalid access flags for module: 0x"), cM47953));
        }
        m47952();
        m47951(m47952(), "super_class");
        m47951(m47952(), "interface_count");
        m47951(m47952(), "fields_count");
        m47951(m47952(), "methods_count");
        char cM47954 = m47952();
        for (int i = 0; i < cM47954; i++) {
            char cM47955 = m47952();
            int iM46797 = c20809.m46796(this.f69599);
            this.f69599 += 4;
            if (((String) this.f69600.m1629(cM47955, new C22979())).equals("Module") && iM46797 > 2) {
                return (String) this.f69600.m1632(m47952(), new C0219());
            }
            this.f69599 += iM46797;
        }
        throw new C15061("no Module attribute");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47951(int i, String str) throws C15061 {
        if (i == 0) {
            return;
        }
        throw new C15061("invalid " + str + " for module: " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m47952() {
        char cM46792 = this.f69601.m46792(this.f69599);
        this.f69599 += 2;
        return cM46792;
    }
}
