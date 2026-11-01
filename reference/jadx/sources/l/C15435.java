package l;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ܶ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15435 implements InterfaceC16950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f50300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50301;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11907 f50302;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f50303;

    public C15435(C11907 c11907, int i) {
        this.f50302 = c11907;
        this.f50301 = i;
    }

    public C15435(C11907 c11907, int i, int i2) {
        this.f50302 = c11907;
        this.f50301 = i;
        this.f50300 = true;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18361 mo36919(Class cls) {
        if (cls.isAssignableFrom(C15435.class)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo36916() {
        String str = this.f50302.f39950;
        this.f50303 = str;
        int i = 0;
        if (Character.isDigit(str.charAt(0))) {
            int length = this.f50303.length();
            char[] charArray = this.f50303.toCharArray();
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    this.f50303 = "*SMBSERVER     ";
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
            switch (this.f50302.f39951) {
                case 27:
                case 28:
                case 29:
                    this.f50303 = "*SMBSERVER     ";
                    break;
            }
        }
        return this.f50303;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo36918(InterfaceC19067 interfaceC19067) {
        String str = this.f50303;
        if (str == this.f50302.f39950) {
            this.f50303 = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(str)) {
            try {
                C15435[] c15435ArrM18732 = ((RunnableC6967) interfaceC19067.mo29450()).m18732(this);
                if (this.f50302.f39951 == 29) {
                    for (C15435 c15435 : c15435ArrM18732) {
                        if (c15435.f50302.f39951 == 32) {
                            return c15435.mo36921();
                        }
                    }
                    return null;
                }
                if (this.f50300) {
                    this.f50303 = null;
                    return mo36921();
                }
            } catch (UnknownHostException unused) {
                this.f50303 = null;
            }
        } else {
            this.f50303 = null;
        }
        return this.f50303;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo36921() {
        if (this.f50302.m29701()) {
            return mo36917();
        }
        return this.f50302.f39950;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo36917() {
        StringBuilder sb = new StringBuilder();
        int i = this.f50301;
        sb.append((i >>> 24) & 255);
        sb.append(".");
        sb.append((i >>> 16) & 255);
        sb.append(".");
        sb.append((i >>> 8) & 255);
        sb.append(".");
        sb.append(i & 255);
        return sb.toString();
    }

    @Override // l.InterfaceC16950
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo36920() {
        return this.f50302.f39951;
    }

    public final int hashCode() {
        return this.f50301;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C15435) && ((C15435) obj).f50301 == this.f50301;
    }

    public final String toString() {
        return this.f50302.toString() + "/" + mo36917();
    }
}
