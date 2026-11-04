package l;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.᩷᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22308 implements InterfaceC16318 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72220;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19126 f72221;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f72222;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72223;

    public C22308(C19126 c19126, int i) {
        this.f72221 = c19126;
        this.f72220 = i;
    }

    public C22308(C19126 c19126, int i, int i2) {
        this.f72221 = c19126;
        this.f72220 = i;
        this.f72223 = true;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11097 mo28043(Class cls) {
        if (cls.isAssignableFrom(C22308.class)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ᩸ */
    public final String mo28045() {
        String str = this.f72221.f61896;
        this.f72222 = str;
        int i = 0;
        if (Character.isDigit(str.charAt(0))) {
            int length = this.f72222.length();
            char[] charArray = this.f72222.toCharArray();
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    this.f72222 = "*SMBSERVER     ";
                    break;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        } else {
            switch (this.f72221.f61898) {
                case 27:
                case 28:
                case 29:
                    this.f72222 = "*SMBSERVER     ";
                    break;
            }
        }
        return this.f72222;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final String mo28042(InterfaceC23032 interfaceC23032) {
        String str = this.f72222;
        if (str == this.f72221.f61896) {
            this.f72222 = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(str)) {
            try {
                C22308[] c22308ArrM33886 = ((RunnableC13904) interfaceC23032.mo2872()).m33886(this);
                if (this.f72221.f61898 == 29) {
                    for (C22308 c22308 : c22308ArrM33886) {
                        if (c22308.f72221.f61898 == 32) {
                            return c22308.mo28044();
                        }
                    }
                    return null;
                }
                if (this.f72223) {
                    this.f72222 = null;
                    return mo28044();
                }
            } catch (UnknownHostException unused) {
                this.f72222 = null;
            }
        } else {
            this.f72222 = null;
        }
        return this.f72222;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ᩷ */
    public final String mo28044() {
        if (this.f72221.m44256()) {
            return mo28041();
        }
        return this.f72221.f61896;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final String mo28041() {
        StringBuilder sb = new StringBuilder();
        int i = this.f72220;
        sb.append((i >>> 24) & 255);
        sb.append(".");
        sb.append((i >>> 16) & 255);
        sb.append(".");
        sb.append((i >>> 8) & 255);
        sb.append(".");
        sb.append(i & 255);
        return sb.toString();
    }

    @Override // l.InterfaceC16318
    /* JADX INFO: renamed from: ۤ */
    public final int mo38708() {
        return this.f72221.f61898;
    }

    public final int hashCode() {
        return this.f72220;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C22308) && ((C22308) obj).f72220 == this.f72220;
    }

    public final String toString() {
        return this.f72221.toString() + "/" + mo28041();
    }
}
