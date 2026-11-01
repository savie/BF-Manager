package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14504 extends AbstractC6741 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f47504;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C12906 f47505;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f47506;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public String f47507;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f47508;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public String f47509;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f47510;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14504 f47511;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public C11038 f47512;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public EnumC23676 f47513;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14504 f47514;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f47515;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f47516;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f47517;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f47518;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0410 f47519;

    /* JADX INFO: renamed from: ۙ */
    public boolean mo11477(DataInputStream dataInputStream, EnumC16783 enumC16783, int i) {
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public void mo32311(int i) {
    }

    public AbstractC14504(AbstractC14504 abstractC14504) {
        super(abstractC14504.f22710);
        this.f47507 = "";
        this.f47509 = null;
        this.f47506 = false;
        this.f47510 = false;
        this.f47513 = EnumC23676.DEFAULT_STATE;
        this.f47519 = abstractC14504.f47519;
        this.f47511 = abstractC14504;
        this.f47512 = abstractC14504.f47512;
    }

    public AbstractC14504(AbstractC0410 abstractC0410) {
        super(abstractC0410.m2144());
        this.f47507 = "";
        this.f47509 = null;
        this.f47506 = false;
        this.f47510 = false;
        this.f47513 = EnumC23676.DEFAULT_STATE;
        this.f47519 = abstractC0410;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m34922() {
        String strM37076 = this.f47506 ? C15489.m37076(EnumC20934.f68216.m47084(), " ") : "";
        if (!this.f47510) {
            return strM37076;
        }
        StringBuilder sbM23356 = C9023.m23356(strM37076);
        sbM23356.append(EnumC20934.f68197.m47084() + " ");
        return sbM23356.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC23676 m34921() {
        return this.f47513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo34919(EnumC23676 enumC23676) {
        this.f47513 = enumC23676;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11476(List... listArr) {
        for (List<C12885> list : listArr) {
            if (list != null) {
                for (C12885 c12885 : list) {
                    c12885.m18216(this);
                    c12885.mo3628();
                    m18221();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34918(StringBuilder sb, String str, String str2, int i, int i2, int i3) {
        C13111 c13111;
        C12906 c12906 = this.f47505;
        if (c12906 != null) {
            c13111 = c12906.m31977(new Function() { // from class: l.ܿۨۤ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(this.f55122.f47512.m27814(((Integer) obj).intValue()));
                }
            });
        } else {
            c13111 = new C13111("", "");
        }
        if (this.f22692) {
            sb.append('#');
            sb.append(i);
            sb.append(":#");
            sb.append(i2);
            sb.append((String) c13111.f43679);
            if (i3 != -1) {
                sb.append(" = #");
                sb.append(i3);
            }
            sb.append(str2);
            if (this.f22704) {
                m18228(sb.toString());
            } else {
                m18218(mo12770(), sb.toString());
                m18228(" // ");
                String name = this.f47511.f47512.getName(i);
                String name2 = this.f47511.f47512.getName(i2);
                Object obj = c13111.f43680;
                if (str == null) {
                    str = "";
                }
                m18228(String.format("%s:%s%s%s", name, name2, obj, str));
            }
        } else {
            sb.append(this.f47511.f47512.getName(i));
            sb.append(':');
            sb.append(this.f47511.f47512.getName(i2));
            sb.append((String) c13111.f43680);
            if (str != null) {
                sb.append(str);
            }
            m18228(((Object) sb) + str2);
        }
        m18221();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34917(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47517 = new ArrayList(unsignedShort);
        this.f47519.m2146(String.format("%s - Attributes[%d]", this.f47507, Integer.valueOf(unsignedShort)), new Object[0]);
        for (int i = 0; i < unsignedShort; i++) {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            String strM27826 = this.f47511.f47512.m27826(unsignedShort2, new C18663(7));
            this.f47519.m2146(String.format("Attribute#%d name[%d]=\"%s\"", Integer.valueOf(i), Integer.valueOf(unsignedShort2), strM27826), new Object[0]);
            EnumC16783 enumC16783M39426 = EnumC16783.m39426(strM27826);
            int i2 = dataInputStream.readInt();
            C15708 c15708 = new C15708(this.f47519, enumC16783M39426);
            this.f47517.add(c15708);
            int i3 = C10976.f37389[enumC16783M39426.ordinal()];
            boolean z = this.f22711;
            switch (i3) {
                case 1:
                    if (i2 != 0) {
                        if (z) {
                            this.f47519.m2163().mo24457("{0}: Invalid attribute length #{1}", enumC16783M39426.m39430(), Integer.valueOf(i2));
                        } else {
                            throw new C16639(this.f47519.m2163(), "{0}: Invalid attribute length #{1}", enumC16783M39426.m39430(), Integer.valueOf(i2));
                        }
                    }
                    this.f47506 = true;
                    break;
                case 2:
                    if (i2 != 0) {
                        if (z) {
                            this.f47519.m2163().mo24457("{0}: Invalid attribute length #{1}", enumC16783M39426.m39430(), Integer.valueOf(i2));
                        } else {
                            throw new C16639(this.f47519.m2163(), "{0}: Invalid attribute length #{1}", enumC16783M39426.m39430(), Integer.valueOf(i2));
                        }
                    }
                    this.f47510 = true;
                    break;
                case 3:
                case 4:
                    short s = dataInputStream.readShort();
                    ArrayList arrayList = new ArrayList(s);
                    boolean z2 = enumC16783M39426 == EnumC16783.f53745;
                    for (int i4 = 0; i4 < s; i4++) {
                        C12885 c12885 = new C12885(this.f47511, z2);
                        c12885.mo9027(dataInputStream);
                        arrayList.add(c12885);
                    }
                    if (z2) {
                        this.f47515 = arrayList;
                    } else {
                        this.f47508 = arrayList;
                    }
                    break;
                case 5:
                case 6:
                    short s2 = dataInputStream.readShort();
                    ArrayList arrayList2 = new ArrayList(s2);
                    boolean z3 = enumC16783M39426 == EnumC16783.f53728;
                    for (int i5 = 0; i5 < s2; i5++) {
                        C3027 c3027 = new C3027(this.f47511, z3);
                        c3027.mo9027(dataInputStream);
                        arrayList2.add(c3027);
                    }
                    if (z3) {
                        this.f47504 = arrayList2;
                    } else {
                        this.f47518 = arrayList2;
                    }
                    break;
                case 7:
                    mo32311(unsignedShort2);
                    c15708.m37410(unsignedShort2, i2, dataInputStream);
                    break;
                default:
                    if (!mo11477(dataInputStream, enumC16783M39426, i2)) {
                        c15708.m37410(unsignedShort2, i2, dataInputStream);
                    } else {
                        c15708.m37413(unsignedShort2);
                        c15708.m37409(i2);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m34916(final EnumC16783 enumC16783) {
        return C9030.stream(this.f47517).filter(new Predicate() { // from class: l.ۛۨۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C15708) obj).m37412().equals(enumC16783);
            }
        }).toList();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m34923(String str) {
        int length;
        int iM18233;
        if (this.f22695) {
            length = str.length() + (m18205() * 2) + 7;
            iM18233 = m18233();
        } else {
            length = str.length() + (m18205() * 2) + 7;
            iM18233 = m18233() * 2;
        }
        return (length - iM18233) - m18233();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m34920() {
        if (this.f47509 == null) {
            this.f47509 = this.f22692 ? "default { " : " default { ";
        }
        return this.f47509;
    }
}
