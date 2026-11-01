package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩵᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C19668 implements InterfaceC18361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f63124;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f63125;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44791(String str) {
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

    public C19668(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f63124 = obj;
    }

    public final int hashCode() {
        return this.f63124.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19668) {
            return this.f63124.equals(((C19668) obj).f63124);
        }
        return false;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۖ */
    public final String mo36916() {
        Object obj = this.f63124;
        if (obj instanceof C15435) {
            return ((C15435) obj).mo36916();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.f63125 = hostName;
        if (m44791(hostName)) {
            this.f63125 = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f63125.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f63125 = this.f63125.substring(0, iIndexOf).toUpperCase();
            } else if (this.f63125.length() > 15) {
                this.f63125 = "*SMBSERVER     ";
            } else {
                this.f63125 = this.f63125.toUpperCase();
            }
        }
        return this.f63125;
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ */
    public final String mo36918(InterfaceC19067 interfaceC19067) {
        Object obj = this.f63124;
        if (obj instanceof C15435) {
            return ((C15435) obj).mo36918(interfaceC19067);
        }
        if (this.f63125 == "*SMBSERVER     ") {
            return null;
        }
        this.f63125 = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ܰ */
    public final String mo36921() {
        Object obj = this.f63124;
        if (obj instanceof C15435) {
            return ((C15435) obj).mo36921();
        }
        return ((InetAddress) obj).getHostName();
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ */
    public final String mo36917() {
        Object obj = this.f63124;
        if (obj instanceof C15435) {
            return ((C15435) obj).mo36917();
        }
        return ((InetAddress) obj).getHostAddress();
    }

    @Override // l.InterfaceC18361
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18361 mo36919(Class cls) {
        Object obj = this.f63124;
        if (obj instanceof InterfaceC18361) {
            return ((InterfaceC18361) obj).mo36919(InterfaceC16950.class);
        }
        if (C19668.class.isAssignableFrom(InterfaceC16950.class)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return this.f63124.toString();
    }
}
