package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4118 extends AbstractC2297 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f13984 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f13985;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f13986;

    public C4118(String str) {
        this.f13986 = str.split("\n", -1);
        this.f13985 = str.length() * 8;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        boolean z;
        InterfaceC8263 interfaceC8263Mo19759 = interfaceC13483.mo19759();
        boolean z2 = interfaceC8263Mo19759.mo7447() instanceof C3567;
        HashMap map = this.f13984;
        if (z2 || (interfaceC8263Mo19759.mo7447() instanceof C14007)) {
            map.put(interfaceC8263Mo19759.mo7447(), interfaceC8263Mo19759);
        }
        if (c5147.mo14650() < 4) {
            String strTrim = c5147.getLine().m34537().toString().substring(c5147.mo14654()).trim();
            C5280 c5280M34539 = c5147.getLine().m34539();
            if (c5280M34539 != null) {
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
                            int iM15872 = c5280M34539.m15872();
                            ArrayList<InterfaceC8263> arrayList = new ArrayList();
                            for (AbstractC4534 abstractC4534Mo7447 = interfaceC8263Mo19759.mo7447(); abstractC4534Mo7447 != null; abstractC4534Mo7447 = abstractC4534Mo7447.mo14267()) {
                                if ((abstractC4534Mo7447 instanceof C3567) || (abstractC4534Mo7447 instanceof C14007)) {
                                    InterfaceC8263 interfaceC8263 = (InterfaceC8263) map.get(abstractC4534Mo7447);
                                    if (interfaceC8263 != null) {
                                        arrayList.add(0, interfaceC8263);
                                    }
                                }
                            }
                            int i2 = iM15872 + 1;
                            loop2: while (true) {
                                String[] strArr = this.f13986;
                                if (i2 >= strArr.length) {
                                    break;
                                }
                                int length2 = this.f13985 - (strArr[i2].length() + 1);
                                this.f13985 = length2;
                                if (length2 < 0) {
                                    break;
                                }
                                C14558 c14558 = new C14558(strArr[i2], interfaceC8263Mo19759);
                                for (InterfaceC8263 interfaceC8264 : arrayList) {
                                    if (!(interfaceC8264.mo7447() instanceof C14007) || !c14558.mo14653()) {
                                        C7932 c7932Mo7444 = interfaceC8264.mo7444(c14558);
                                        if (!C1402.m5130(c7932Mo7444)) {
                                            break loop2;
                                        }
                                        c14558.m35111(c7932Mo7444);
                                    }
                                }
                                if (!strArr[i2].substring(c14558.getIndex()).trim().equals(str)) {
                                    i2++;
                                }
                            }
                        }
                        C1220 c1220 = new C1220(new C24256(str, strTrim, z));
                        c1220.m4440(c5147.mo14654());
                        return c1220;
                    }
                }
            }
        }
        return null;
    }
}
