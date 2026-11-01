package l;

/* JADX INFO: renamed from: l.۟ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7423 extends AbstractC1415 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f24777;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f24778;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f24779;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m19904(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            return -1;
        }
        return i - 55;
    }

    public AbstractC7423(C3894 c3894) {
        super(c3894);
        this.f24779 = 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19906() {
        ((C17727) m43804()).m41272(this.f5842);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19905(String str) {
        throw new C19418(EnumC8129.SYNTAX, this.f5849, this.f5851, str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19909() {
        InterfaceC1623 interfaceC1623 = this.f5842;
        if (interfaceC1623.mo11332(1) == 91) {
            int i = 1;
            do {
                i++;
            } while (interfaceC1623.mo11332(i) == 61);
            if (interfaceC1623.mo11332(i) == 91) {
                for (int i2 = 0; i2 < i; i2++) {
                    m19906();
                }
                m19907(true);
                return;
            }
        }
        while (interfaceC1623.mo11332(1) != -1 && interfaceC1623.mo11332(1) != 10 && interfaceC1623.mo11332(1) != 13) {
            m19906();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19908(int i) {
        while (true) {
            InterfaceC1623 interfaceC1623 = this.f5842;
            int iMo11332 = interfaceC1623.mo11332(1);
            if (iMo11332 == -1) {
                break;
            }
            if (iMo11332 == 13 || iMo11332 == 10) {
                break;
            }
            m19906();
            if (iMo11332 == i) {
                return;
            }
            if (iMo11332 == 92) {
                int iMo11333 = interfaceC1623.mo11332(1);
                if (iMo11333 == -1) {
                    m19905("Unterminated string escape");
                    throw null;
                }
                m19906();
                if (iMo11333 == 122) {
                    while (true) {
                        int iMo11334 = interfaceC1623.mo11332(1);
                        if (iMo11334 == 32 || iMo11334 == 9 || iMo11334 == 13 || iMo11334 == 10 || iMo11334 == 12 || iMo11334 == 11) {
                            m19906();
                        }
                    }
                } else if (iMo11333 != 13 && iMo11333 != 10) {
                    int i2 = 0;
                    if (iMo11333 == 120) {
                        while (i2 < 2) {
                            if (m19904(interfaceC1623.mo11332(1)) < 0) {
                                m19905("Invalid hexadecimal escape");
                                throw null;
                            }
                            m19906();
                            i2++;
                        }
                    } else if (iMo11333 == 117) {
                        if (interfaceC1623.mo11332(1) != 123) {
                            m19905("Invalid Unicode escape");
                            throw null;
                        }
                        m19906();
                        long jM19904 = 0;
                        while (m19904(interfaceC1623.mo11332(1)) >= 0) {
                            jM19904 = (jM19904 * 16) + ((long) m19904(interfaceC1623.mo11332(1)));
                            if (jM19904 > 2147483647L) {
                                m19905("Unicode escape out of range");
                                throw null;
                            }
                            m19906();
                            i2++;
                        }
                        if (i2 == 0 || interfaceC1623.mo11332(1) != 125) {
                            m19905("Invalid Unicode escape");
                            throw null;
                        }
                        m19906();
                    } else if (iMo11333 >= 48 && iMo11333 <= 57) {
                        int iMo11335 = iMo11333 - 48;
                        for (int i3 = 1; i3 < 3 && interfaceC1623.mo11332(1) >= 48 && interfaceC1623.mo11332(1) <= 57; i3++) {
                            iMo11335 = (interfaceC1623.mo11332(1) + (iMo11335 * 10)) - 48;
                            m19906();
                        }
                        if (iMo11335 > 255) {
                            m19905("Decimal escape out of range");
                            throw null;
                        }
                    } else if ("abfnrtv\"'\\".indexOf(iMo11333) < 0) {
                        m19905("Invalid string escape");
                        throw null;
                    }
                } else if (interfaceC1623.mo11332(1) == (iMo11333 == 13 ? 10 : 13)) {
                    m19906();
                }
            }
        }
        m19905("Unterminated string");
        throw null;
    }

    @Override // l.AbstractC1415, l.InterfaceC10589
    public final InterfaceC19761 nextToken() {
        InterfaceC1623 interfaceC1623 = this.f5842;
        InterfaceC19761 interfaceC19761NextToken = super.nextToken();
        for (int iIndex = interfaceC1623.index(); iIndex < interfaceC1623.index(); iIndex++) {
            int iMo11332 = interfaceC1623.mo11332(iIndex - interfaceC1623.index());
            if (iMo11332 == 13 || iMo11332 == 10) {
                int i = this.f24778;
                if (i == 0 || i == iMo11332) {
                    this.f24779++;
                    this.f24778 = iMo11332;
                } else {
                    this.f24778 = 0;
                }
                this.f24777 = 0;
            } else {
                this.f24777++;
                this.f24778 = 0;
            }
        }
        ((C17727) m43804()).m41278(this.f24779);
        ((C17727) m43804()).m41271(this.f24777);
        int type = interfaceC19761NextToken.getType();
        int iMo11333 = interfaceC1623.mo11332(1);
        if ((type != 60 && type != 61 && type != 62 && type != 63) || (iMo11333 != 46 && iMo11333 != 95 && ((iMo11333 < 97 || iMo11333 > 122) && (iMo11333 < 65 || iMo11333 > 90)))) {
            return interfaceC19761NextToken;
        }
        m19905("Malformed number");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19907(boolean z) {
        InterfaceC1623 interfaceC1623 = this.f5842;
        int iIndex = (interfaceC1623.index() - this.f5848) - (z ? 4 : 2);
        while (interfaceC1623.mo11332(1) != -1) {
            if (interfaceC1623.mo11332(1) != 93) {
                m19906();
            } else {
                m19906();
                int i = 0;
                while (interfaceC1623.mo11332(1) == 61) {
                    m19906();
                    i++;
                }
                if (i == iIndex && interfaceC1623.mo11332(1) == 93) {
                    m19906();
                    return;
                }
            }
        }
        m19905(z ? "Unterminated long comment" : "Unterminated long string");
        throw null;
    }
}
