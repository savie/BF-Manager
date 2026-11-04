package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1F8 */
/* JADX INFO: loaded from: classes3.dex */
public class C12426 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 f39953;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C7075 f39956;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14307 f39954 = new C14307();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f39955 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2329 f39957 = new C2329();

    public C12426(InterfaceC7206 interfaceC7206) {
        this.f39953 = interfaceC7206;
    }

    /* JADX INFO: renamed from: ᩷ */
    public C7075 mo7580() {
        if (this.f39956 == null) {
            synchronized (this) {
                if (this.f39956 == null) {
                    this.f39956 = new C7075(this.f39953);
                }
            }
        }
        return this.f39956;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m30899(String str, C9059 c9059) {
        return C11392.computeIfAbsent(this.f39954, str, c9059);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30905(int i, String str) {
        this.f39957.mo7845(i, (Object) str);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo7579(String str) {
        int iMo13099 = this.f39957.mo13099(-1, str);
        if (iMo13099 == -1 && str.equals("android")) {
            return 1;
        }
        return iMo13099;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo7578(int i, String str) {
        String str2;
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (str2 != null && !str2.isEmpty() && (i = this.f39957.mo13099(-1, str2)) == -1) {
                if (str2.equals("android")) {
                    i = 1;
                }
            }
            int iM30898 = m30898(this.f39953, i, strSubstring, strSubstring2);
            return (iM30898 == -1 && i == 1) ? m30898(C15407.m36884(), i, strSubstring, strSubstring2) : iM30898;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30898(InterfaceC7206 interfaceC7206, int i, String str, String str2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (i == -1 || interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(str)) {
                        int iMo35827 = interfaceC15344.mo35827(new C6599(1, str2));
                        if (iMo35827 == -1) {
                            break;
                        }
                        return (interfaceC10869.mo27607() << 24) | (interfaceC15344.mo35833() << 16) | iMo35827;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30904() {
        this.f39955.set(new ArrayList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m30900() {
        ThreadLocal threadLocal = this.f39955;
        List list = (List) threadLocal.get();
        C17359.requireNonNull(list);
        List list2 = list;
        threadLocal.remove();
        return list2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30901(int i, int i2, int i3) {
        List list = (List) this.f39955.get();
        C17359.requireNonNull(list);
        list.add(new C9442(i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30902(C3609 c3609, int i, int i2) {
        List list = (List) this.f39955.get();
        C17359.requireNonNull(list);
        if (c3609.mo16636() || c3609.mo16632() || c3609.mo16634()) {
            list.add(new C9442(c3609, i, i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30903(C3609 c3609, C16923 c16923) {
        m30902(c3609, c16923.m51624(), c16923.m51623());
    }
}
