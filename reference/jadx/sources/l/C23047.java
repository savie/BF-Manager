package l;

/* JADX INFO: renamed from: l.᩸᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90G */
/* JADX INFO: loaded from: classes.dex */
public final class C23047 extends AbstractC2297 {
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        int i;
        C20063 c20063;
        if (c5147.mo14650() < 4) {
            C14228 line = c5147.getLine();
            int iMo14654 = c5147.mo14654();
            if (line.m34537().charAt(iMo14654) == '#') {
                C14228 c14228M34538 = line.m34538(iMo14654, line.m34537().length());
                C20942 c20942 = new C20942();
                c20942.m47874(c14228M34538);
                C0805 c0805M3226 = C0805.m3226(c20942);
                int iM3239 = c0805M3226.m3239('#');
                if (iM3239 == 0 || iM3239 > 6) {
                    c20063 = null;
                } else if (c0805M3226.m3232()) {
                    char cM3234 = c0805M3226.m3234();
                    if (cM3234 == ' ' || cM3234 == '\t') {
                        c0805M3226.m3236();
                        C9753 c9753M3237 = c0805M3226.m3237();
                        C9753 c9753M3238 = c9753M3237;
                        loop0: while (true) {
                            boolean z = true;
                            while (true) {
                                if (!c0805M3226.m3232()) {
                                    break loop0;
                                }
                                char cM3235 = c0805M3226.m3234();
                                if (cM3235 == '\t' || cM3235 == ' ') {
                                    c0805M3226.m3240();
                                } else {
                                    if (cM3235 != '#') {
                                        c0805M3226.m3240();
                                        c9753M3238 = c0805M3226.m3237();
                                    } else if (z) {
                                        c0805M3226.m3239('#');
                                        int iM3236 = c0805M3226.m3236();
                                        if (c0805M3226.m3232()) {
                                            c9753M3238 = c0805M3226.m3237();
                                        }
                                        if (iM3236 > 0) {
                                        }
                                    } else {
                                        c0805M3226.m3240();
                                        c9753M3238 = c0805M3226.m3237();
                                    }
                                    z = false;
                                }
                            }
                        }
                        C20942 c20942M3230 = c0805M3226.m3230(c9753M3237, c9753M3238);
                        c20063 = c20942M3230.m47873().isEmpty() ? new C20063(iM3239, new C20942()) : new C20063(iM3239, c20942M3230);
                    } else {
                        c20063 = null;
                    }
                } else {
                    c20063 = new C20063(iM3239, new C20942());
                }
                if (c20063 != null) {
                    C1220 c1220 = new C1220(c20063);
                    c1220.m4440(line.m34537().length());
                    return c1220;
                }
            }
            CharSequence charSequenceM34537 = line.m34537();
            char cCharAt = charSequenceM34537.charAt(iMo14654);
            if (cCharAt == '-') {
                int length = charSequenceM34537.length();
                for (int i2 = iMo14654 + 1; i2 < length; i2++) {
                    if (charSequenceM34537.charAt(i2) != '-') {
                        length = i2;
                        break;
                    }
                }
                if (C6790.m18956(length, charSequenceM34537.length(), charSequenceM34537) >= charSequenceM34537.length()) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (cCharAt != '=') {
                i = 0;
            } else {
                int length2 = charSequenceM34537.length();
                for (int i3 = iMo14654 + 1; i3 < length2; i3++) {
                    if (charSequenceM34537.charAt(i3) != '=') {
                        length2 = i3;
                        break;
                    }
                }
                if (C6790.m18956(length2, charSequenceM34537.length(), charSequenceM34537) >= charSequenceM34537.length()) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                C20942 c20942Mo19760 = ((C7186) interfaceC13483).mo19760();
                if (!c20942Mo19760.m47877()) {
                    C1220 c1221 = new C1220(new C20063(i, c20942Mo19760));
                    c1221.m4440(line.m34537().length());
                    c1221.m4438(c20942Mo19760.m47876().size());
                    return c1221;
                }
            }
        }
        return null;
    }
}
