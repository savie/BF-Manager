package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.۫᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C13357 implements InterfaceC11097 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f42590;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f42591;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32937(String str) {
        if (Character.isDigit(str.charAt(0))) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    return true;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        }
        return false;
    }

    public C13357(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f42590 = obj;
    }

    public final int hashCode() {
        return this.f42590.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13357) {
            return this.f42590.equals(((C13357) obj).f42590);
        }
        return false;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ᩸ */
    public final String mo28045() {
        Object obj = this.f42590;
        if (obj instanceof C22308) {
            return ((C22308) obj).mo28045();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.f42591 = hostName;
        if (m32937(hostName)) {
            this.f42591 = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f42591.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f42591 = this.f42591.substring(0, iIndexOf).toUpperCase();
            } else if (this.f42591.length() > 15) {
                this.f42591 = "*SMBSERVER     ";
            } else {
                this.f42591 = this.f42591.toUpperCase();
            }
        }
        return this.f42591;
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final String mo28042(InterfaceC23032 interfaceC23032) {
        Object obj = this.f42590;
        if (obj instanceof C22308) {
            return ((C22308) obj).mo28042(interfaceC23032);
        }
        if (this.f42591 == "*SMBSERVER     ") {
            return null;
        }
        this.f42591 = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ᩷ */
    public final String mo28044() {
        Object obj = this.f42590;
        if (obj instanceof C22308) {
            return ((C22308) obj).mo28044();
        }
        return ((InetAddress) obj).getHostName();
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final String mo28041() {
        Object obj = this.f42590;
        if (obj instanceof C22308) {
            return ((C22308) obj).mo28041();
        }
        return ((InetAddress) obj).getHostAddress();
    }

    @Override // l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11097 mo28043(Class cls) {
        Object obj = this.f42590;
        if (obj instanceof InterfaceC11097) {
            return ((InterfaceC11097) obj).mo28043(InterfaceC16318.class);
        }
        if (C13357.class.isAssignableFrom(InterfaceC16318.class)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return this.f42590.toString();
    }
}
