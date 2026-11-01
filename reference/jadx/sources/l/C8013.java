package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: renamed from: l.۠ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8013 implements InterfaceC18513 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10130 f26265;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Vector f26266;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0168 f26267;

    public C8013(C0168 c0168) {
        this.f26266 = null;
        this.f26267 = c0168;
        if (this.f26265 == null) {
            String strM1327 = C0168.m1327("hmac-sha1");
            try {
                this.f26265 = (InterfaceC10130) Class.forName(strM1327).asSubclass(InterfaceC10130.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                this.f26267.m1333().getClass();
                throw new IllegalArgumentException(C16523.m38890("instantiation of ", strM1327, " lead to an error"), e);
            }
        }
        this.f26266 = new Vector();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21107(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            C17807 c17807 = new C17807(str, 0, bArr);
            synchronized (this.f26266) {
                int i = 1;
                for (int i2 = 0; i2 < this.f26266.size(); i2++) {
                    C17807 c17808 = (C17807) this.f26266.elementAt(i2);
                    if (c17808.mo41395(str) && c17808.f56430 == c17807.f56430) {
                        if (C8491.m22174(c17808.f56433, bArr)) {
                            return 0;
                        }
                        i = 2;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? m21107(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (Exception unused) {
            this.f26267.m1333().getClass();
            return 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21108(C17807 c17807, InterfaceC19074 interfaceC19074) {
        int i = c17807.f56430;
        String str = c17807.f56431;
        synchronized (this.f26266) {
            for (int i2 = 0; i2 < this.f26266.size(); i2++) {
                ((C17807) this.f26266.elementAt(i2)).mo41395(str);
            }
        }
        this.f26266.addElement(c17807);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17807[] m21109(String str, String str2) {
        C17807[] c17807Arr;
        synchronized (this.f26266) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f26266.size(); i++) {
                C17807 c17807 = (C17807) this.f26266.elementAt(i);
                if (c17807.f56430 != -1 && (str == null || (c17807.mo41395(str) && (str2 == null || c17807.m41394().equals(str2))))) {
                    arrayList.add(c17807);
                }
            }
            int size = arrayList.size();
            c17807Arr = new C17807[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c17807Arr[i2] = (C17807) arrayList.get(i2);
            }
            if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                C17807[] c17807ArrM21109 = m21109(str.substring(1, str.indexOf("]:")), str2);
                if (c17807ArrM21109.length > 0) {
                    C17807[] c17807Arr2 = new C17807[c17807ArrM21109.length + size];
                    System.arraycopy(c17807Arr, 0, c17807Arr2, 0, size);
                    System.arraycopy(c17807ArrM21109, 0, c17807Arr2, size, c17807ArrM21109.length);
                    c17807Arr = c17807Arr2;
                }
            }
        }
        return c17807Arr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21110(String str, String str2) {
        synchronized (this.f26266) {
            int i = 0;
            while (i < this.f26266.size()) {
                C17807 c17807 = (C17807) this.f26266.elementAt(i);
                if (str == null || (c17807.mo41395(str) && (str2 == null || c17807.m41394().equals(str2)))) {
                    String strSubstring = c17807.f56431;
                    if (str == null || strSubstring.equals(str) || ((c17807 instanceof C18596) && ((C18596) c17807).m42995())) {
                        this.f26266.removeElement(c17807);
                        i--;
                    } else {
                        int length = str.length();
                        int length2 = strSubstring.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                int iIndexOf = strSubstring.indexOf(44, i2);
                                if (iIndexOf != -1) {
                                    if (str.equals(strSubstring.substring(i2, iIndexOf))) {
                                        strSubstring = strSubstring.substring(0, i2) + strSubstring.substring(iIndexOf + 1);
                                    } else {
                                        i2 = iIndexOf + 1;
                                    }
                                }
                                c17807.f56431 = strSubstring;
                            }
                            if (strSubstring.endsWith(str) && length2 - i2 == length) {
                                strSubstring = strSubstring.substring(0, length == length2 ? 0 : (length2 - length) - 1);
                            }
                            c17807.f56431 = strSubstring;
                        }
                    }
                }
                i++;
            }
        }
    }

    static {
        byte[] bArr = C8491.f29422;
        C8491.m22175("\n", StandardCharsets.UTF_8);
    }
}
