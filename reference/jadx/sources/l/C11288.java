package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1F8 */
/* JADX INFO: loaded from: classes3.dex */
public class C11288 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 f38115;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C5062 f38118;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21445 f38117 = new C21445();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f38116 = new ThreadLocal();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7660 f38114 = new C7660();

    public C11288(InterfaceC6432 interfaceC6432) {
        this.f38115 = interfaceC6432;
    }

    /* JADX INFO: renamed from: ܰ */
    public C5062 mo15892() {
        if (this.f38118 == null) {
            synchronized (this) {
                if (this.f38118 == null) {
                    this.f38118 = new C5062(this.f38115);
                }
            }
        }
        return this.f38118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m28266(String str, C7760 c7760) {
        return C9735.computeIfAbsent(this.f38117, str, c7760);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28272(int i, String str) {
        this.f38114.mo18019(i, (Object) str);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo15891(String str) {
        int iMo17278 = this.f38114.mo17278(-1, str);
        if (iMo17278 == -1 && str.equals("android")) {
            return 1;
        }
        return iMo17278;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo15890(int i, String str) {
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
            if (str2 != null && !str2.isEmpty() && (i = this.f38114.mo17278(-1, str2)) == -1) {
                if (str2.equals("android")) {
                    i = 1;
                }
            }
            int iM28265 = m28265(this.f38115, i, strSubstring, strSubstring2);
            return (iM28265 == -1 && i == 1) ? m28265(C13530.m33074(), i, strSubstring, strSubstring2) : iM28265;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28265(InterfaceC6432 interfaceC6432, int i, String str, String str2) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (i == -1 || interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(str)) {
                        int iMo1521 = interfaceC19133.mo1521(new C21079(1, str2));
                        if (iMo1521 == -1) {
                            break;
                        }
                        return (interfaceC17721.mo19106() << 24) | (interfaceC19133.mo26942() << 16) | iMo1521;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28271() {
        this.f38116.set(new ArrayList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m28267() {
        ThreadLocal threadLocal = this.f38116;
        List list = (List) threadLocal.get();
        C13638.requireNonNull(list);
        List list2 = list;
        threadLocal.remove();
        return list2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28268(int i, int i2, int i3) {
        List list = (List) this.f38116.get();
        C13638.requireNonNull(list);
        list.add(new C0787(i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28269(C16435 c16435, int i, int i2) {
        List list = (List) this.f38116.get();
        C13638.requireNonNull(list);
        if (c16435.mo25185() || c16435.mo25189() || c16435.mo25191()) {
            list.add(new C0787(c16435, i, i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28270(C16435 c16435, C10457 c10457) {
        m28269(c16435, c10457.m51157(), c10457.m51158());
    }
}
