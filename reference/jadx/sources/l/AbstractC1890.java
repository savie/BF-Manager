package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1890 extends AbstractC20997 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f6362;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1890 f6363;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f6364;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public String f6365;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f6366;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public EnumC5619 f6367;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f6368;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12931 f6369;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public String f6370;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public C1606 f6371;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6372;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f6373;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f6374;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f6375;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public AbstractC1890 f6376;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C20930 f6377;

    /* JADX INFO: renamed from: ۙ */
    public boolean mo1685(DataInputStream dataInputStream, EnumC13127 enumC13127, int i) {
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo6503(int i) {
    }

    public AbstractC1890(AbstractC1890 abstractC1890) {
        super(abstractC1890.f67151);
        this.f6365 = "";
        this.f6370 = null;
        this.f6372 = false;
        this.f6366 = false;
        this.f6367 = EnumC5619.DEFAULT_STATE;
        this.f6369 = abstractC1890.f6369;
        this.f6363 = abstractC1890;
        this.f6371 = abstractC1890.f6371;
    }

    public AbstractC1890(AbstractC12931 abstractC12931) {
        super(abstractC12931.m32306());
        this.f6365 = "";
        this.f6370 = null;
        this.f6372 = false;
        this.f6366 = false;
        this.f6367 = EnumC5619.DEFAULT_STATE;
        this.f6369 = abstractC12931;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m6505() {
        String strM34972 = this.f6372 ? C14483.m34972(EnumC5202.f18289.m15637(), " ") : "";
        if (!this.f6366) {
            return strM34972;
        }
        StringBuilder sbM27333 = C10732.m27333(strM34972);
        sbM27333.append(EnumC5202.f18315.m15637() + " ");
        return sbM27333.toString();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EnumC5619 m6504() {
        return this.f6367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6502(EnumC5619 enumC5619) {
        this.f6367 = enumC5619;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1684(List... listArr) {
        for (List<C0442> list : listArr) {
            if (list != null) {
                for (C0442 c0442 : list) {
                    c0442.m47994(this);
                    c0442.mo1688();
                    m47989();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6501(StringBuilder sb, String str, String str2, int i, int i2, int i3) {
        C18941 c18941;
        C20930 c20930 = this.f6377;
        if (c20930 != null) {
            c18941 = c20930.m47837(new Function() { // from class: l.ᩴۧ᩺
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(this.f63654.f6371.m5638(((Integer) obj).intValue()));
                }
            });
        } else {
            c18941 = new C18941("", "");
        }
        if (this.f67132) {
            sb.append('#');
            sb.append(i);
            sb.append(":#");
            sb.append(i2);
            sb.append((String) c18941.f61428);
            if (i3 != -1) {
                sb.append(" = #");
                sb.append(i3);
            }
            sb.append(str2);
            if (this.f67146) {
                m48009(sb.toString());
            } else {
                m48005(mo12384(), sb.toString());
                m48009(" // ");
                String name = this.f6363.f6371.getName(i);
                String name2 = this.f6363.f6371.getName(i2);
                Object obj = c18941.f61429;
                if (str == null) {
                    str = "";
                }
                m48009(String.format("%s:%s%s%s", name, name2, obj, str));
            }
        } else {
            sb.append(this.f6363.f6371.getName(i));
            sb.append(':');
            sb.append(this.f6363.f6371.getName(i2));
            sb.append((String) c18941.f61429);
            if (str != null) {
                sb.append(str);
            }
            m48009(((Object) sb) + str2);
        }
        m47989();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6500(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6374 = new ArrayList(unsignedShort);
        int i = 0;
        this.f6369.m32315(String.format("%s - Attributes[%d]", this.f6365, Integer.valueOf(unsignedShort)), new Object[0]);
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            String strM5640 = this.f6363.f6371.m5640(unsignedShort2, new C22773(i));
            this.f6369.m32315(String.format("Attribute#%d name[%d]=\"%s\"", Integer.valueOf(i2), Integer.valueOf(unsignedShort2), strM5640), new Object[0]);
            EnumC13127 enumC13127M32605 = EnumC13127.m32605(strM5640);
            int i3 = dataInputStream.readInt();
            C22599 c22599 = new C22599(this.f6369, enumC13127M32605);
            this.f6374.add(c22599);
            int i4 = C13076.f41822[enumC13127M32605.ordinal()];
            boolean z = this.f67152;
            switch (i4) {
                case 1:
                    if (i3 != 0) {
                        if (z) {
                            this.f6369.m32312().mo10582("{0}: Invalid attribute length #{1}", enumC13127M32605.m32609(), Integer.valueOf(i3));
                        } else {
                            throw new C5474(this.f6369.m32312(), "{0}: Invalid attribute length #{1}", enumC13127M32605.m32609(), Integer.valueOf(i3));
                        }
                    }
                    this.f6372 = true;
                    break;
                case 2:
                    if (i3 != 0) {
                        if (z) {
                            this.f6369.m32312().mo10582("{0}: Invalid attribute length #{1}", enumC13127M32605.m32609(), Integer.valueOf(i3));
                        } else {
                            throw new C5474(this.f6369.m32312(), "{0}: Invalid attribute length #{1}", enumC13127M32605.m32609(), Integer.valueOf(i3));
                        }
                    }
                    this.f6366 = true;
                    break;
                case 3:
                case 4:
                    short s = dataInputStream.readShort();
                    ArrayList arrayList = new ArrayList(s);
                    boolean z2 = enumC13127M32605 == EnumC13127.f41964;
                    for (int i5 = 0; i5 < s; i5++) {
                        C0442 c0442 = new C0442(this.f6363, z2);
                        c0442.mo2258(dataInputStream);
                        arrayList.add(c0442);
                    }
                    if (z2) {
                        this.f6364 = arrayList;
                    } else {
                        this.f6375 = arrayList;
                    }
                    break;
                case 5:
                case 6:
                    short s2 = dataInputStream.readShort();
                    ArrayList arrayList2 = new ArrayList(s2);
                    boolean z3 = enumC13127M32605 == EnumC13127.f41944;
                    for (int i6 = 0; i6 < s2; i6++) {
                        C2043 c2043 = new C2043(this.f6363, z3);
                        c2043.mo2258(dataInputStream);
                        arrayList2.add(c2043);
                    }
                    if (z3) {
                        this.f6368 = arrayList2;
                    } else {
                        this.f6373 = arrayList2;
                    }
                    break;
                case 7:
                    mo6503(unsignedShort2);
                    c22599.m50928(unsignedShort2, i3, dataInputStream);
                    break;
                default:
                    if (!mo1685(dataInputStream, enumC13127M32605, i3)) {
                        c22599.m50928(unsignedShort2, i3, dataInputStream);
                    } else {
                        c22599.m50931(unsignedShort2);
                        c22599.m50927(i3);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m6499(final EnumC13127 enumC13127) {
        return C1170.stream(this.f6374).filter(new Predicate() { // from class: l.ܳۧ᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C22599) obj).m50930().equals(enumC13127);
            }
        }).toList();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6506(String str) {
        int length;
        int iM48002;
        if (this.f67140) {
            length = str.length() + (m48000() * 2) + 7;
            iM48002 = m48002();
        } else {
            length = str.length() + (m48000() * 2) + 7;
            iM48002 = m48002() * 2;
        }
        return (length - iM48002) - m48002();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m6507() {
        if (this.f6370 == null) {
            this.f6370 = this.f67132 ? "default { " : " default { ";
        }
        return this.f6370;
    }
}
