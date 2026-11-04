package l;

/* JADX INFO: renamed from: l.ᩴ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OU */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19506 extends AbstractC14709 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f62955;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f62956;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f62957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m45027(int i) {
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

    public AbstractC19506(C18870 c18870) {
        super(c18870);
        this.f62957 = 1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m45028() {
        ((C1308) m24871()).m4769(this.f48057);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45026(String str) {
        throw new C21744(EnumC4590.SYNTAX, this.f48059, this.f48061, str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m45031() {
        InterfaceC17693 interfaceC17693 = this.f48057;
        if (interfaceC17693.mo11537(1) == 91) {
            int i = 1;
            do {
                i++;
            } while (interfaceC17693.mo11537(i) == 61);
            if (interfaceC17693.mo11537(i) == 91) {
                for (int i2 = 0; i2 < i; i2++) {
                    m45028();
                }
                m45029(true);
                return;
            }
        }
        while (interfaceC17693.mo11537(1) != -1 && interfaceC17693.mo11537(1) != 10 && interfaceC17693.mo11537(1) != 13) {
            m45028();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45030(int i) {
        while (true) {
            InterfaceC17693 interfaceC17693 = this.f48057;
            int iMo11537 = interfaceC17693.mo11537(1);
            if (iMo11537 == -1) {
                break;
            }
            if (iMo11537 == 13 || iMo11537 == 10) {
                break;
            }
            m45028();
            if (iMo11537 == i) {
                return;
            }
            if (iMo11537 == 92) {
                int iMo11538 = interfaceC17693.mo11537(1);
                if (iMo11538 == -1) {
                    m45026("Unterminated string escape");
                    throw null;
                }
                m45028();
                if (iMo11538 == 122) {
                    while (true) {
                        int iMo11539 = interfaceC17693.mo11537(1);
                        if (iMo11539 == 32 || iMo11539 == 9 || iMo11539 == 13 || iMo11539 == 10 || iMo11539 == 12 || iMo11539 == 11) {
                            m45028();
                        }
                    }
                } else if (iMo11538 != 13 && iMo11538 != 10) {
                    int i2 = 0;
                    if (iMo11538 == 120) {
                        while (i2 < 2) {
                            if (m45027(interfaceC17693.mo11537(1)) < 0) {
                                m45026("Invalid hexadecimal escape");
                                throw null;
                            }
                            m45028();
                            i2++;
                        }
                    } else if (iMo11538 == 117) {
                        if (interfaceC17693.mo11537(1) != 123) {
                            m45026("Invalid Unicode escape");
                            throw null;
                        }
                        m45028();
                        long jM45027 = 0;
                        while (m45027(interfaceC17693.mo11537(1)) >= 0) {
                            jM45027 = (jM45027 * 16) + ((long) m45027(interfaceC17693.mo11537(1)));
                            if (jM45027 > 2147483647L) {
                                m45026("Unicode escape out of range");
                                throw null;
                            }
                            m45028();
                            i2++;
                        }
                        if (i2 == 0 || interfaceC17693.mo11537(1) != 125) {
                            m45026("Invalid Unicode escape");
                            throw null;
                        }
                        m45028();
                    } else if (iMo11538 >= 48 && iMo11538 <= 57) {
                        int iMo115310 = iMo11538 - 48;
                        for (int i3 = 1; i3 < 3 && interfaceC17693.mo11537(1) >= 48 && interfaceC17693.mo11537(1) <= 57; i3++) {
                            iMo115310 = (interfaceC17693.mo11537(1) + (iMo115310 * 10)) - 48;
                            m45028();
                        }
                        if (iMo115310 > 255) {
                            m45026("Decimal escape out of range");
                            throw null;
                        }
                    } else if ("abfnrtv\"'\\".indexOf(iMo11538) < 0) {
                        m45026("Invalid string escape");
                        throw null;
                    }
                } else if (interfaceC17693.mo11537(1) == (iMo11538 == 13 ? 10 : 13)) {
                    m45028();
                }
            }
        }
        m45026("Unterminated string");
        throw null;
    }

    @Override // l.AbstractC14709, l.InterfaceC13963
    public final InterfaceC8743 nextToken() {
        InterfaceC17693 interfaceC17693 = this.f48057;
        InterfaceC8743 interfaceC8743NextToken = super.nextToken();
        for (int iIndex = interfaceC17693.index(); iIndex < interfaceC17693.index(); iIndex++) {
            int iMo11537 = interfaceC17693.mo11537(iIndex - interfaceC17693.index());
            if (iMo11537 == 13 || iMo11537 == 10) {
                int i = this.f62956;
                if (i == 0 || i == iMo11537) {
                    this.f62957++;
                    this.f62956 = iMo11537;
                } else {
                    this.f62956 = 0;
                }
                this.f62955 = 0;
            } else {
                this.f62955++;
                this.f62956 = 0;
            }
        }
        ((C1308) m24871()).m4775(this.f62957);
        ((C1308) m24871()).m4768(this.f62955);
        int type = interfaceC8743NextToken.getType();
        int iMo11538 = interfaceC17693.mo11537(1);
        if ((type != 60 && type != 61 && type != 62 && type != 63) || (iMo11538 != 46 && iMo11538 != 95 && ((iMo11538 < 97 || iMo11538 > 122) && (iMo11538 < 65 || iMo11538 > 90)))) {
            return interfaceC8743NextToken;
        }
        m45026("Malformed number");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45029(boolean z) {
        InterfaceC17693 interfaceC17693 = this.f48057;
        int iIndex = (interfaceC17693.index() - this.f48060) - (z ? 4 : 2);
        while (interfaceC17693.mo11537(1) != -1) {
            if (interfaceC17693.mo11537(1) != 93) {
                m45028();
            } else {
                m45028();
                int i = 0;
                while (interfaceC17693.mo11537(1) == 61) {
                    m45028();
                    i++;
                }
                if (i == iIndex && interfaceC17693.mo11537(1) == 93) {
                    m45028();
                    return;
                }
            }
        }
        m45026(z ? "Unterminated long comment" : "Unterminated long string");
        throw null;
    }
}
