package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBIE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2239 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2991 f8030;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f8031;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f8032;

    public C2239(InterfaceC17721 interfaceC17721) {
        Iterator it;
        Iterator it2;
        this.f8031 = interfaceC17721.mo19106();
        HashMap map = new HashMap();
        C2991 c2991 = new C2991();
        Iterator it3 = interfaceC17721.mo19112().iterator();
        while (it3.hasNext()) {
            InterfaceC19133 interfaceC19133 = (InterfaceC19133) it3.next();
            String typeName = interfaceC19133.getTypeName();
            if (typeName.equals("attr") || typeName.equals("^attr-private")) {
                if (interfaceC19133.mo1536() != 0) {
                    InterfaceC19133 type = interfaceC17721.getType("id");
                    InterfaceC12783 interfaceC12783Mo1530 = (type == null || type.mo1536() == 0) ? null : type.mo1530(0);
                    Iterator it4 = interfaceC19133.mo1530(0).mo31746().iterator();
                    while (it4.hasNext()) {
                        InterfaceC3609 interfaceC3609 = (InterfaceC3609) it4.next();
                        if (!interfaceC3609.mo7644() || interfaceC3609.mo7647() != 0) {
                            int iMo10691 = interfaceC3609.mo10691();
                            int value = interfaceC3609.getValue().getValue();
                            String strMo7645 = interfaceC3609.mo7645();
                            if (!strMo7645.startsWith("__") && !map.containsKey(strMo7645)) {
                                int iMo7647 = interfaceC3609.mo7647() - 1;
                                C21996[] c21996Arr = new C21996[iMo7647];
                                int i = 0;
                                while (true) {
                                    if (i < iMo7647) {
                                        int i2 = i + 1;
                                        InterfaceC9961 value2 = interfaceC3609.getValue(i2);
                                        it = it3;
                                        int value3 = value2.getValue();
                                        int iMo25192 = value2.mo25192();
                                        it2 = it4;
                                        InterfaceC3609 interfaceC36010 = interfaceC3609;
                                        if (((value2.mo25193() >>> 24) & 255) != interfaceC17721.mo19106()) {
                                            break;
                                        }
                                        InterfaceC3609 interfaceC3609Mo31753 = interfaceC12783Mo1530 == null ? null : interfaceC12783Mo1530.mo31753(value2.mo25193() & 65535);
                                        if (interfaceC3609Mo31753 == null) {
                                            break;
                                        }
                                        c21996Arr[i] = new C21996(value3, iMo25192, interfaceC3609Mo31753.mo7645());
                                        i = i2;
                                        it3 = it;
                                        interfaceC3609 = interfaceC36010;
                                        it4 = it2;
                                    } else {
                                        it = it3;
                                        it2 = it4;
                                        map.put(strMo7645, new C11413(value, strMo7645, c21996Arr, (interfaceC17721.mo19106() << 24) | (interfaceC19133.mo26942() << 16) | iMo10691));
                                        break;
                                    }
                                }
                                it3 = it;
                                it4 = it2;
                            }
                        }
                    }
                }
            }
        }
        for (C11413 c11413 : map.values()) {
            c2991.mo8944(c11413.f38428, c11413);
        }
        this.f8032 = map;
        this.f8030 = c2991;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m6879() {
        return this.f8031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m6878(String str) {
        return (C11413) this.f8032.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m6877(int i) {
        return (C11413) this.f8030.get(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m6880() {
        return this.f8030.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m6876() {
        return this.f8032.values();
    }
}
