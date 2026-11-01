package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20676 extends AbstractC15175 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f67260 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f67261;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f67262;

    public C20676(String str) {
        this.f67262 = str.split("\n", -1);
        this.f67261 = str.length() * 8;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        boolean z;
        InterfaceC21524 interfaceC21524Mo41744 = interfaceC18702.mo41744();
        boolean z2 = interfaceC21524Mo41744.mo1823() instanceof C2036;
        HashMap map = this.f67260;
        if (z2 || (interfaceC21524Mo41744.mo1823() instanceof C8078)) {
            map.put(interfaceC21524Mo41744.mo1823(), interfaceC21524Mo41744);
        }
        if (c8057.mo21201() < 4) {
            String strTrim = c8057.getLine().m29102().toString().substring(c8057.mo21197()).trim();
            C0316 c0316M29104 = c8057.getLine().m29104();
            if (c0316M29104 != null) {
                String str = strTrim.startsWith("$$") ? "$$" : strTrim.startsWith("\\[") ? "\\]" : null;
                if (str != null) {
                    if (strTrim.length() <= 4 || !strTrim.endsWith(str)) {
                        z = false;
                    } else {
                        int length = strTrim.length() - 2;
                        int i = 0;
                        while (length > 0) {
                            length--;
                            if (strTrim.charAt(length) != '\\') {
                                break;
                            }
                            i++;
                        }
                        if (i % 2 != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z || strTrim.equals("$$") || strTrim.equals("\\[")) {
                        if (!z) {
                            int iM1948 = c0316M29104.m1948();
                            ArrayList<InterfaceC21524> arrayList = new ArrayList();
                            for (AbstractC19367 abstractC19367Mo1823 = interfaceC21524Mo41744.mo1823(); abstractC19367Mo1823 != null; abstractC19367Mo1823 = abstractC19367Mo1823.mo35319()) {
                                if ((abstractC19367Mo1823 instanceof C2036) || (abstractC19367Mo1823 instanceof C8078)) {
                                    InterfaceC21524 interfaceC21524 = (InterfaceC21524) map.get(abstractC19367Mo1823);
                                    if (interfaceC21524 != null) {
                                        arrayList.add(0, interfaceC21524);
                                    }
                                }
                            }
                            int i2 = iM1948 + 1;
                            loop2: while (true) {
                                String[] strArr = this.f67262;
                                if (i2 >= strArr.length) {
                                    break;
                                }
                                int length2 = this.f67261 - (strArr[i2].length() + 1);
                                this.f67261 = length2;
                                if (length2 < 0) {
                                    break;
                                }
                                C15738 c15738 = new C15738(strArr[i2], interfaceC21524Mo41744);
                                for (InterfaceC21524 interfaceC21525 : arrayList) {
                                    if (!(interfaceC21525.mo1823() instanceof C8078) || !c15738.mo21199()) {
                                        C22168 c22168Mo1821 = interfaceC21525.mo1821(c15738);
                                        if (!C6009.m16315(c22168Mo1821)) {
                                            break loop2;
                                        }
                                        c15738.m37461(c22168Mo1821);
                                    }
                                }
                                if (!strArr[i2].substring(c15738.getIndex()).trim().equals(str)) {
                                    i2++;
                                }
                            }
                        }
                        C3822 c3822 = new C3822(new C7270(str, strTrim, z));
                        c3822.m11116(c8057.mo21197());
                        return c3822;
                    }
                }
            }
        }
        return null;
    }
}
