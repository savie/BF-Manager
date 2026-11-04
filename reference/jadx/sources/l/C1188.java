package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1188 extends C19087 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f4335;

    public C1188() {
        throw null;
    }

    @Override // l.C19087
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String mo4365() {
        return "={" + ((String) C1170.stream(this.f4335).map(new C10210(5)).collect(C2025.joining(","))) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    @Override // l.C19087, l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        int i;
        ArrayList<C19087> arrayList = this.f4335;
        int size = arrayList.size();
        if (arrayList.size() > 0) {
            EnumC5619 enumC5619M6504 = m6504();
            int i2 = 0;
            if (enumC5619M6504 == EnumC5619.HAS_DEFAULT_VALUE || enumC5619M6504 == EnumC5619.INLINED_ELEMENT) {
                C19087 c19087 = (C19087) arrayList.get(0);
                int iM48002 = ((c19087 instanceof C10136) || (c19087 instanceof C4699)) ? this.f67148 + 10 + m48002() : 1;
                if (m6504() != EnumC5619.INLINED_ELEMENT) {
                    switch (C7900.f26252[((C19087) arrayList.get(0)).f61803.ordinal()]) {
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
                m48006(m6507() + "{ ");
                InterfaceC13676 interfaceC13676 = this.f67151;
                String str = AbstractC20997.f67120;
                interfaceC13676.mo3879(m48007(4, str));
                for (C19087 c19088 : arrayList) {
                    c19088.mo6502(EnumC5619.INLINED_ELEMENT);
                    c19088.f67148 = iM48002;
                    if (((c19088 instanceof C10136) || (c19088 instanceof C4699) || (c19088 instanceof C9390)) && i2 % i == 0 && i2 != 0) {
                        this.f67151.mo3879(m48007(4, str));
                    }
                    c19088.mo1688();
                    if (i2 < size - 1) {
                        StringBuilder sb = new StringBuilder(",");
                        sb.append(i2 % i == i + (-1) ? System.lineSeparator() : " ");
                        m48009(sb.toString());
                    }
                    i2++;
                }
                this.f67151.mo3881(" }");
                m48009("  }");
                return;
            }
            m48006("{");
            for (C19087 c19089 : arrayList) {
                c19089.m47994(this);
                if ((c19089 instanceof C4699) || (c19089 instanceof C9390)) {
                    m48009(c19089.m47995());
                }
                c19089.mo1688();
                if (i2 < size - 1) {
                    m48006(",");
                }
                i2++;
            }
            m47989();
            return;
        }
        m48009(m6507() + "{ } }");
    }
}
