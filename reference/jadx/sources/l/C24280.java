package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21714 f78592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9230 f78593;

    public C24280(C18312 c18312, int i, int i2) {
        if (c18312 == null) {
            throw new NullPointerException("cf == null");
        }
        this.f78593 = c18312.m42711();
        this.f78592 = new C21714(new C10525(c18312.m42713().m50638(i, i2 + i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m54293() {
        try {
            AbstractC13487 abstractC13487M54291 = m54291();
            if (this.f78592.available() == 0) {
                return abstractC13487M54291;
            }
            throw new C7125("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4538 m54295(EnumC7300 enumC7300) {
        C21714 c21714 = this.f78592;
        try {
            int unsignedByte = c21714.readUnsignedByte();
            C4538 c4538 = new C4538(unsignedByte);
            for (int i = 0; i < unsignedByte; i++) {
                int unsignedShort = c21714.readUnsignedShort();
                C14011 c14011 = new C14011();
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    c14011.m34103(m54290(enumC7300));
                }
                c14011.mo15005();
                c4538.m14270(i, c14011);
            }
            c4538.mo15005();
            if (c21714.available() == 0) {
                return c4538;
            }
            throw new C7125("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14011 m54294(EnumC7300 enumC7300) {
        C21714 c21714 = this.f78592;
        try {
            int unsignedShort = c21714.readUnsignedShort();
            C14011 c14011 = new C14011();
            for (int i = 0; i < unsignedShort; i++) {
                c14011.m34103(m54290(enumC7300));
            }
            c14011.mo15005();
            if (c21714.available() == 0) {
                return c14011;
            }
            throw new C7125("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C8791 m54290(EnumC7300 enumC7300) throws IOException {
        m54289(4);
        C21714 c21714 = this.f78592;
        int unsignedShort = c21714.readUnsignedShort();
        int unsignedShort2 = c21714.readUnsignedShort();
        C9230 c9230 = this.f78593;
        C8791 c8791 = new C8791(new C1028(C5085.m15362(((C9976) c9230.get(unsignedShort)).getString())), enumC7300);
        for (int i = 0; i < unsignedShort2; i++) {
            m54289(5);
            c8791.m23587(new C21692((C9976) c9230.get(c21714.readUnsignedShort()), m54291()));
        }
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private AbstractC13487 m54291() throws IOException {
        C21714 c21714 = this.f78592;
        int unsignedByte = c21714.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C4757(m54290(EnumC7300.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (C17435) m54292();
        }
        if (unsignedByte == 83) {
            return C18927.m43944(((C15943) m54292()).mo17877());
        }
        C9230 c9230 = this.f78593;
        if (unsignedByte == 99) {
            String string = ((C9976) c9230.get(c21714.readUnsignedShort())).getString();
            C5085 c5085 = C5085.f17727;
            try {
                return new C1028(string.equals("V") ? C5085.f17731 : C5085.m15362(string));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m54289(4);
            int unsignedShort = c21714.readUnsignedShort();
            return new C24895(new C0282((C9976) c9230.get(c21714.readUnsignedShort()), (C9976) c9230.get(unsignedShort)));
        }
        if (unsignedByte == 115) {
            return m54292();
        }
        if (unsignedByte == 73) {
            return (C15943) m54292();
        }
        if (unsignedByte == 74) {
            return (C4011) m54292();
        }
        if (unsignedByte == 90) {
            return C19673.m45339(((C15943) m54292()).mo17877());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return C15197.m36548(((C15943) m54292()).mo17877());
                case 67:
                    return C1774.m6229(((C15943) m54292()).mo17877());
                case 68:
                    return (C11468) m54292();
                default:
                    throw new C7125("unknown annotation tag: ".concat(C5306.m15936(unsignedByte)), null);
            }
        }
        m54289(2);
        int unsignedShort2 = c21714.readUnsignedShort();
        C21911 c21911 = new C21911(unsignedShort2);
        for (int i = 0; i < unsignedShort2; i++) {
            c21911.mo31602(i, m54291());
        }
        c21911.mo15005();
        return new C10722(c21911);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC13487 m54292() throws IOException {
        return this.f78593.get(this.f78592.readUnsignedShort());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54289(int i) {
        if (this.f78592.available() < i) {
            throw new C7125("truncated annotation attribute", null);
        }
    }
}
