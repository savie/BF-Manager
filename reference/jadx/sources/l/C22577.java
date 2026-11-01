package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EX */
/* JADX INFO: loaded from: classes.dex */
public class C22577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 f73586;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16667 f73587 = new C16667();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C5062 f73588;

    public C22577(InterfaceC6432 interfaceC6432) {
        this.f73586 = interfaceC6432;
        if (interfaceC6432.mo5141() > 1) {
            Iterator it = interfaceC6432.mo17615().iterator();
            int i = 1;
            while (it.hasNext()) {
                int iMo19106 = ((InterfaceC17721) it.next()).mo19106();
                if (!this.f73587.mo8945(iMo19106)) {
                    if (iMo19106 == 1) {
                        this.f73587.mo8944(1, "android");
                    } else if (iMo19106 == 127) {
                        this.f73587.mo8944(127, "app");
                    } else {
                        C16667 c16667 = this.f73587;
                        StringBuilder sb = new StringBuilder("app");
                        i++;
                        sb.append(i);
                        c16667.mo8944(iMo19106, sb.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5062 m50082() {
        if (this.f73588 == null) {
            synchronized (this) {
                if (this.f73588 == null) {
                    this.f73588 = new C5062(this.f73586);
                }
            }
        }
        return this.f73588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 m50079() {
        return this.f73586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19133 m50080(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        InterfaceC6432 interfaceC6432 = this.f73586;
        InterfaceC19133 interfaceC19133M50077 = m50077(interfaceC6432, i2, i3);
        return (interfaceC19133M50077 == null && i2 == 1 && !interfaceC6432.mo17616()) ? m50077(C13530.m33074(), i2, i3) : interfaceC19133M50077;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19133 m50077(InterfaceC6432 interfaceC6432, int i, int i2) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i2) {
                        return interfaceC19133;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ */
    public String mo39837(int i, int i2) {
        int i3 = i2 >>> 24;
        int i4 = i3 & 255;
        int i5 = i2 >>> 16;
        int i6 = i5 & 255;
        int i7 = i2 & 65535;
        String strM50076 = m50076(i, this.f73586, i4, i6, i7);
        if (strM50076 == null && i4 == 1 && !this.f73586.mo17616()) {
            strM50076 = m50076(i, C13530.m33074(), i4, i6, i7);
        }
        return strM50076 == null ? new String(new char[]{"0123456789abcdef".charAt((i2 >>> 28) & 15), "0123456789abcdef".charAt(i3 & 15), "0123456789abcdef".charAt((i2 >>> 20) & 15), "0123456789abcdef".charAt(i5 & 15), "0123456789abcdef".charAt((i2 >>> 12) & 15), "0123456789abcdef".charAt((i2 >>> 8) & 15), "0123456789abcdef".charAt((i2 >>> 4) & 15), "0123456789abcdef".charAt(i2 & 15)}) : strM50076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m50076(int i, InterfaceC6432 interfaceC6432, int i2, int i3, int i4) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i2) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i3) {
                        Iterator it = interfaceC19133.mo25271().iterator();
                        while (it.hasNext()) {
                            InterfaceC3609 interfaceC3609Mo31753 = ((InterfaceC12783) it.next()).mo31753(i4);
                            if (interfaceC3609Mo31753 != null) {
                                return m50078(i, i2) + interfaceC19133.getTypeName() + "/" + interfaceC3609Mo31753.mo7645();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50078(int i, int i2) {
        if (i != 1 && i == i2) {
            return "";
        }
        String str = (String) this.f73587.get(i2);
        if (str != null) {
            return str.concat(":");
        }
        return i2 == 1 ? "android:" : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m50081(int i) {
        return (String) this.f73587.get(i);
    }
}
