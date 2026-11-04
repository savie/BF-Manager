package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C1Y4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17549 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22420 f57043;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f57044 = new HashSet();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f57042 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f57040 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57041 = 0;

    public C17549(C22420 c22420) {
        this.f57043 = c22420;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41204(C5122 c5122) {
        m41199(c5122, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41199(InterfaceC4859 interfaceC4859, int i) {
        C5122 c5122;
        String string = interfaceC4859.toString();
        HashSet hashSet = this.f57044;
        if (hashSet.contains(string)) {
            return;
        }
        hashSet.add(string);
        this.f57042.add(interfaceC4859);
        if (interfaceC4859.getName().equals("<clinit>")) {
            this.f57040.add(interfaceC4859.mo6804());
        }
        C7447 c7447 = (C7447) this.f57043.f72611.get(interfaceC4859.mo6804());
        if (c7447 == null) {
            return;
        }
        if (i > this.f57041) {
            this.f57041 = i;
        }
        if (!interfaceC4859.getName().equals("<clinit>")) {
            m41200(c7447, i);
        }
        Iterator it = c7447.getMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                c5122 = null;
                break;
            }
            c5122 = (C5122) it.next();
            if (c5122.equals(interfaceC4859)) {
                InterfaceC7140 interfaceC7140Mo13175 = c5122.mo13175();
                if (interfaceC7140Mo13175 == null) {
                    break;
                }
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    int i2 = interfaceC23331.mo30864().f73513;
                    if (i2 == 1) {
                        m41198(i + 1, ((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType());
                    } else if (i2 == 2) {
                        m41198(i + 1, ((InterfaceC8304) ((InterfaceC6177) interfaceC23331).getReference()).mo4500());
                    } else if (i2 == 3) {
                        m41199((InterfaceC4859) ((InterfaceC6177) interfaceC23331).getReference(), i + 1);
                    }
                }
                break;
            }
        }
        if (c5122 == null || !(EnumC2536.STATIC.m8459(c5122.mo13184()) || EnumC2536.PRIVATE.m8459(c5122.mo13184()))) {
            String strM35306 = C14684.m35306(interfaceC4859, true);
            m41201(c7447, strM35306, i);
            m41202(c7447, strM35306, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41201(C7447 c7447, String str, int i) {
        String type = c7447.getType();
        for (C7447 c7448 : this.f57043.f72611.values()) {
            if (type.equals(c7448.mo20397())) {
                for (C5122 c5122 : c7448.getMethods()) {
                    if (str.equals(C14684.m35306((InterfaceC4859) c5122, true))) {
                        m41199(c5122, i);
                        break;
                    }
                }
                m41201(c7448, str, i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m41202(C7447 c7447, String str, int i) {
        C7447 c7448 = (C7447) this.f57043.f72611.get(c7447.mo20397());
        if (c7448 != null) {
            for (C5122 c5122 : c7448.getMethods()) {
                if (str.equals(C14684.m35306((InterfaceC4859) c5122, true))) {
                    m41199(c5122, i);
                    break;
                }
            }
            m41202(c7448, str, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41200(C7447 c7447, int i) {
        if (this.f57040.contains(c7447.getType())) {
            return;
        }
        for (C5122 c5122 : c7447.mo20405()) {
            if (c5122.getName().equals("<clinit>")) {
                m41199(c5122, i);
                break;
            }
        }
        String strMo20397 = c7447.mo20397();
        if (strMo20397 != null) {
            m41198(i, strMo20397);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41198(int i, String str) {
        HashSet hashSet = this.f57040;
        if (hashSet.contains(str)) {
            return;
        }
        C7447 c7447 = (C7447) this.f57043.f72611.get(str);
        if (c7447 != null) {
            m41200(c7447, i);
        } else {
            hashSet.add(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41203() {
        return this.f57042;
    }
}
