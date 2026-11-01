package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15002 extends C6534 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f48929;

    public C15002() {
        throw null;
    }

    @Override // l.C6534
    /* JADX INFO: renamed from: ᩶ */
    public final String mo17752() {
        return "={" + ((String) C9030.stream(this.f48929).map(new C5008(7)).collect(C1890.joining(","))) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    @Override // l.C6534, l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        int i;
        ArrayList<C6534> arrayList = this.f48929;
        int size = arrayList.size();
        if (arrayList.size() > 0) {
            EnumC23676 enumC23676M34921 = m34921();
            int i2 = 0;
            if (enumC23676M34921 == EnumC23676.HAS_DEFAULT_VALUE || enumC23676M34921 == EnumC23676.INLINED_ELEMENT) {
                C6534 c6534 = (C6534) arrayList.get(0);
                int iM18233 = ((c6534 instanceof C22763) || (c6534 instanceof C10063)) ? this.f22686 + 10 + m18233() : 1;
                if (m34921() != EnumC23676.INLINED_ELEMENT) {
                    switch (C3711.f13509[((C6534) arrayList.get(0)).f22000.ordinal()]) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i = 1;
                            break;
                        default:
                            int i3 = size % 2;
                            if (size > 10) {
                                if (i3 == 0) {
                                    i = 4;
                                } else {
                                    i = 6;
                                }
                            } else if (i3 == 0) {
                                i = 2;
                            } else {
                                i = 3;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
                m18219(m34920() + "{ ");
                InterfaceC10434 interfaceC10434 = this.f22710;
                String str = AbstractC6741.f22685;
                interfaceC10434.mo18524(m18226(4, str));
                for (C6534 c6535 : arrayList) {
                    c6535.mo34919(EnumC23676.INLINED_ELEMENT);
                    c6535.f22686 = iM18233;
                    if (((c6535 instanceof C22763) || (c6535 instanceof C10063) || (c6535 instanceof C21351)) && i2 % i == 0 && i2 != 0) {
                        this.f22710.mo18524(m18226(4, str));
                    }
                    c6535.mo3628();
                    if (i2 < size - 1) {
                        StringBuilder sb = new StringBuilder(",");
                        sb.append(i2 % i == i + (-1) ? System.lineSeparator() : " ");
                        m18228(sb.toString());
                    }
                    i2++;
                }
                this.f22710.mo18527(" }");
                m18228("  }");
                return;
            }
            m18219("{");
            for (C6534 c6536 : arrayList) {
                c6536.m18216(this);
                if ((c6536 instanceof C10063) || (c6536 instanceof C21351)) {
                    m18228(c6536.m18225());
                }
                c6536.mo3628();
                if (i2 < size - 1) {
                    m18219(",");
                }
                i2++;
            }
            m18221();
            return;
        }
        m18228(m34920() + "{ } }");
    }
}
