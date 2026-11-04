package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EX */
/* JADX INFO: loaded from: classes2.dex */
public class C2863 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 f9438;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22311 f9439 = new C22311();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C7075 f9440;

    public C2863(InterfaceC7206 interfaceC7206) {
        this.f9438 = interfaceC7206;
        if (interfaceC7206.mo15674() > 1) {
            Iterator it = interfaceC7206.mo15672().iterator();
            int i = 1;
            while (it.hasNext()) {
                int iMo27607 = ((InterfaceC10869) it.next()).mo27607();
                if (!this.f9439.mo13467(iMo27607)) {
                    if (iMo27607 == 1) {
                        this.f9439.mo13466(1, "android");
                    } else if (iMo27607 == 127) {
                        this.f9439.mo13466(127, "app");
                    } else {
                        C22311 c22311 = this.f9439;
                        StringBuilder sb = new StringBuilder("app");
                        i++;
                        sb.append(i);
                        c22311.mo13466(iMo27607, sb.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7075 m9457() {
        if (this.f9440 == null) {
            synchronized (this) {
                if (this.f9440 == null) {
                    this.f9440 = new C7075(this.f9438);
                }
            }
        }
        return this.f9440;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 m9453() {
        return this.f9438;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15344 m9454(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        InterfaceC7206 interfaceC7206 = this.f9438;
        InterfaceC15344 interfaceC15344M9451 = m9451(interfaceC7206, i2, i3);
        return (interfaceC15344M9451 == null && i2 == 1 && !interfaceC7206.mo19789()) ? m9451(C15407.m36884(), i2, i3) : interfaceC15344M9451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15344 m9451(InterfaceC7206 interfaceC7206, int i, int i2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i2) {
                        return interfaceC15344;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String mo9456(int i, int i2) {
        int i3 = i2 >>> 24;
        int i4 = i3 & 255;
        int i5 = i2 >>> 16;
        int i6 = i5 & 255;
        int i7 = i2 & 65535;
        String strM9450 = m9450(i, this.f9438, i4, i6, i7);
        if (strM9450 == null && i4 == 1 && !this.f9438.mo19789()) {
            strM9450 = m9450(i, C15407.m36884(), i4, i6, i7);
        }
        return strM9450 == null ? new String(new char[]{"0123456789abcdef".charAt((i2 >>> 28) & 15), "0123456789abcdef".charAt(i3 & 15), "0123456789abcdef".charAt((i2 >>> 20) & 15), "0123456789abcdef".charAt(i5 & 15), "0123456789abcdef".charAt((i2 >>> 12) & 15), "0123456789abcdef".charAt((i2 >>> 8) & 15), "0123456789abcdef".charAt((i2 >>> 4) & 15), "0123456789abcdef".charAt(i2 & 15)}) : strM9450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m9450(int i, InterfaceC7206 interfaceC7206, int i2, int i3, int i4) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i2) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i3) {
                        Iterator it = interfaceC15344.mo33925().iterator();
                        while (it.hasNext()) {
                            InterfaceC8697 interfaceC8697Mo9076 = ((InterfaceC2731) it.next()).mo9076(i4);
                            if (interfaceC8697Mo9076 != null) {
                                return m9452(i, i2) + interfaceC15344.getTypeName() + "/" + interfaceC8697Mo9076.mo18156();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9452(int i, int i2) {
        if (i != 1 && i == i2) {
            return "";
        }
        String str = (String) this.f9439.get(i2);
        if (str != null) {
            return str.concat(":");
        }
        return i2 == 1 ? "android:" : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m9455(int i) {
        return (String) this.f9439.get(i);
    }
}
