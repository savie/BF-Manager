package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: renamed from: l.ۡܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9535 implements InterfaceC2912 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7299 f30874;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Vector f30875;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19978 f30876;

    public C9535(C19978 c19978) {
        this.f30875 = null;
        this.f30876 = c19978;
        if (this.f30874 == null) {
            String strM45892 = C19978.m45892("hmac-sha1");
            try {
                this.f30874 = (InterfaceC7299) Class.forName(strM45892).asSubclass(InterfaceC7299.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                this.f30876.m45899().getClass();
                throw new IllegalArgumentException(C14442.m34865("instantiation of ", strM45892, " lead to an error"), e);
            }
        }
        this.f30875 = new Vector();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24948(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            C9623 c9623 = new C9623(str, 0, bArr);
            synchronized (this.f30875) {
                int i = 1;
                for (int i2 = 0; i2 < this.f30875.size(); i2++) {
                    C9623 c9624 = (C9623) this.f30875.elementAt(i2);
                    if (c9624.mo4901(str) && c9624.f31135 == c9623.f31135) {
                        if (C9011.m24054(c9624.f31134, bArr)) {
                            return 0;
                        }
                        i = 2;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? m24948(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (Exception unused) {
            this.f30876.m45899().getClass();
            return 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24949(C9623 c9623, InterfaceC0808 interfaceC0808) {
        int i = c9623.f31135;
        String str = c9623.f31132;
        synchronized (this.f30875) {
            for (int i2 = 0; i2 < this.f30875.size(); i2++) {
                ((C9623) this.f30875.elementAt(i2)).mo4901(str);
            }
        }
        this.f30875.addElement(c9623);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9623[] m24950(String str, String str2) {
        C9623[] c9623Arr;
        synchronized (this.f30875) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f30875.size(); i++) {
                C9623 c9623 = (C9623) this.f30875.elementAt(i);
                if (c9623.f31135 != -1 && (str == null || (c9623.mo4901(str) && (str2 == null || c9623.m25127().equals(str2))))) {
                    arrayList.add(c9623);
                }
            }
            int size = arrayList.size();
            c9623Arr = new C9623[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c9623Arr[i2] = (C9623) arrayList.get(i2);
            }
            if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                C9623[] c9623ArrM24950 = m24950(str.substring(1, str.indexOf("]:")), str2);
                if (c9623ArrM24950.length > 0) {
                    C9623[] c9623Arr2 = new C9623[c9623ArrM24950.length + size];
                    System.arraycopy(c9623Arr, 0, c9623Arr2, 0, size);
                    System.arraycopy(c9623ArrM24950, 0, c9623Arr2, size, c9623ArrM24950.length);
                    c9623Arr = c9623Arr2;
                }
            }
        }
        return c9623Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24951(String str, String str2) {
        synchronized (this.f30875) {
            int i = 0;
            while (i < this.f30875.size()) {
                C9623 c9623 = (C9623) this.f30875.elementAt(i);
                if (str == null || (c9623.mo4901(str) && (str2 == null || c9623.m25127().equals(str2)))) {
                    String strSubstring = c9623.f31132;
                    if (str == null || strSubstring.equals(str) || ((c9623 instanceof C1333) && ((C1333) c9623).m4902())) {
                        this.f30875.removeElement(c9623);
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
                                c9623.f31132 = strSubstring;
                            }
                            if (strSubstring.endsWith(str) && length2 - i2 == length) {
                                strSubstring = strSubstring.substring(0, length == length2 ? 0 : (length2 - length) - 1);
                            }
                            c9623.f31132 = strSubstring;
                        }
                    }
                }
                i++;
            }
        }
    }

    static {
        byte[] bArr = C9011.f29358;
        C9011.m24055("\n", StandardCharsets.UTF_8);
    }
}
