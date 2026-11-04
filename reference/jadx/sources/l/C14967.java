package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6ED */
/* JADX INFO: loaded from: classes4.dex */
public final class C14967 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11984 f48884;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24927 f48885;

    public C14967(C24927 c24927, C11984 c11984) {
        this.f48885 = c24927;
        this.f48884 = c11984;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36030(InterfaceC3145 interfaceC3145) {
        m36028(this.f48885, interfaceC3145);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36031(InterfaceC3145 interfaceC3145, C2551 c2551) {
        m36028(c2551, interfaceC3145);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36032(InterfaceC3145 interfaceC3145, C17467 c17467) {
        m36028(c17467, interfaceC3145);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36033(InterfaceC3145 interfaceC3145, C23786 c23786, int i) {
        C3648 c3648;
        ArrayList arrayList = (ArrayList) c23786.m53057();
        if (i >= arrayList.size() || (c3648 = (C3648) arrayList.get(i)) == null || c3648.m11821()) {
            return;
        }
        Iterator it = c3648.m11820().iterator();
        while (it.hasNext()) {
            m36027(interfaceC3145, (InterfaceC13343) it.next());
            interfaceC3145.mo10270(' ');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36028(InterfaceC6238 interfaceC6238, InterfaceC3145 interfaceC3145) {
        C3648 c3648 = (C3648) interfaceC6238.mo17862(C25278.f81639);
        if (c3648 == null || c3648.m11821()) {
            return;
        }
        for (InterfaceC13343 interfaceC13343 : c3648.m11820()) {
            if (!interfaceC13343.mo17110().equals("Ljava/lang/Override;")) {
                interfaceC3145.mo10282();
                m36027(interfaceC3145, interfaceC13343);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36027(InterfaceC3145 interfaceC3145, InterfaceC13343 interfaceC13343) {
        C2551 c2551M55563;
        interfaceC3145.mo10270('@');
        C24927 c24927 = this.f48885;
        C1610 c1610Mo8527 = c24927.mo8527();
        String strMo17110 = interfaceC13343.mo17110();
        c1610Mo8527.getClass();
        C24927 c24927M5671 = c1610Mo8527.m5671(C1345.m4954(c1610Mo8527, strMo17110));
        C11984 c11984 = this.f48884;
        if (c24927M5671 == null) {
            c11984.m30102(interfaceC3145, AbstractC1566.m5538(interfaceC13343.mo17110()));
        } else {
            interfaceC3145.mo10274((InterfaceC11653) c24927M5671);
            c11984.m30101(interfaceC3145, c24927M5671.m55571());
        }
        Map mapMo17112 = interfaceC13343.mo17112();
        if (mapMo17112.isEmpty()) {
            return;
        }
        interfaceC3145.mo10270('(');
        Iterator it = mapMo17112.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strM8522 = (String) entry.getKey();
            if (c24927M5671 != null && (c2551M55563 = c24927M5671.m55563(strM8522)) != null) {
                strM8522 = c2551M55563.m8522();
            }
            if (!strM8522.equals(b.d) || mapMo17112.size() != 1) {
                interfaceC3145.add(strM8522);
                interfaceC3145.add(" = ");
            }
            m36029(c24927.mo8527(), interfaceC3145, (C15580) entry.getValue());
            if (it.hasNext()) {
                interfaceC3145.add(", ");
            }
        }
        interfaceC3145.mo10270(')');
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36034(InterfaceC3145 interfaceC3145, C2551 c2551) {
        List listMo8542 = c2551.mo8542();
        if (listMo8542.isEmpty()) {
            return;
        }
        interfaceC3145.add(" throws ");
        Iterator it = listMo8542.iterator();
        while (it.hasNext()) {
            this.f48884.m30115(interfaceC3145, (AbstractC1566) it.next());
            if (it.hasNext()) {
                interfaceC3145.add(", ");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36029(C1610 c1610, InterfaceC3145 interfaceC3145, C15580 c15580) {
        if (c15580 == null) {
            interfaceC3145.add("null");
            return;
        }
        C24927 c24927 = this.f48885;
        C12326 c12326M5686 = c24927.mo8527().m5686();
        Object objM37318 = c15580.m37318();
        int i = C19443.f62815[c15580.m37317().ordinal()];
        C11984 c11984 = this.f48884;
        switch (i) {
            case 1:
                interfaceC3145.add("null");
                return;
            case 2:
                interfaceC3145.add(Boolean.TRUE.equals(objM37318) ? "true" : "false");
                return;
            case 3:
                interfaceC3145.add(c12326M5686.m30750(((Byte) objM37318).byteValue(), false));
                return;
            case 4:
                interfaceC3145.add(c12326M5686.m30754(((Short) objM37318).shortValue(), false));
                return;
            case 5:
                char cCharValue = ((Character) objM37318).charValue();
                c12326M5686.getClass();
                interfaceC3145.add(C12326.m30747(false, cCharValue));
                return;
            case 6:
                interfaceC3145.add(c12326M5686.m30753(((Integer) objM37318).intValue(), false));
                return;
            case 7:
                interfaceC3145.add(c12326M5686.m30752(((Long) objM37318).longValue(), false));
                return;
            case 8:
                interfaceC3145.add(C12326.m30744(((Float) objM37318).floatValue()));
                return;
            case 9:
                interfaceC3145.add(C12326.m30743(((Double) objM37318).doubleValue()));
                return;
            case 10:
                interfaceC3145.add(c12326M5686.m30751((String) objM37318));
                return;
            case 11:
                c11984.m30115(interfaceC3145, AbstractC1566.m5535((String) objM37318));
                interfaceC3145.add(".class");
                return;
            case 12:
            case 13:
                if (objM37318 instanceof InterfaceC1213) {
                    C0052.m926(interfaceC3145, C14022.m34143(c1610, (InterfaceC1213) objM37318), c11984);
                    return;
                } else if (objM37318 instanceof C14022) {
                    C0052.m926(interfaceC3145, (C14022) objM37318, c11984);
                    return;
                } else {
                    throw new C8597("Unexpected field type class: " + objM37318.getClass());
                }
            case 14:
                return;
            case 15:
                interfaceC3145.mo10270('{');
                Iterator it = ((Iterable) objM37318).iterator();
                while (it.hasNext()) {
                    m36029(c24927.mo8527(), interfaceC3145, (C15580) it.next());
                    if (it.hasNext()) {
                        interfaceC3145.add(", ");
                    }
                }
                interfaceC3145.mo10270('}');
                return;
            case 16:
                m36027(interfaceC3145, (InterfaceC13343) objM37318);
                return;
            default:
                throw new C8597("Can't decode value: " + c15580.m37317() + " (" + c15580 + ')');
        }
    }
}
