package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۧܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11038 extends AbstractC6741 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final C23590 f37488 = new C23590(9);

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static final Hashtable f37489;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static final Hashtable f37490;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C3937 f37491;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C3980 f37492;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f37493;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0410 f37494;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public String f37495;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f37496;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f37497;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f37498;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f37499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27809(C11038 c11038, int i) {
        c11038.getClass();
        EnumC17387 enumC17387 = (EnumC17387) f37489.get(Byte.valueOf((byte) i));
        return enumC17387 == null ? C8479.m22141(i, "BOGUS_SUBTAG:") : enumC17387.f55345;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f37490 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f37489 = hashtable2;
        EnumC6098 enumC6098 = EnumC6098.CONSTANT_UTF8;
        hashtable.put(Byte.valueOf(enumC6098.m16591()), enumC6098);
        EnumC6098 enumC6099 = EnumC6098.CONSTANT_INTEGER;
        hashtable.put(Byte.valueOf(enumC6099.m16591()), enumC6099);
        EnumC6098 enumC60910 = EnumC6098.CONSTANT_FLOAT;
        hashtable.put(Byte.valueOf(enumC60910.m16591()), enumC60910);
        EnumC6098 enumC60911 = EnumC6098.CONSTANT_LONG;
        hashtable.put(Byte.valueOf(enumC60911.m16591()), enumC60911);
        EnumC6098 enumC60912 = EnumC6098.CONSTANT_DOUBLE;
        hashtable.put(Byte.valueOf(enumC60912.m16591()), enumC60912);
        EnumC6098 enumC60913 = EnumC6098.CONSTANT_CLASS;
        hashtable.put(Byte.valueOf(enumC60913.m16591()), enumC60913);
        EnumC6098 enumC60914 = EnumC6098.CONSTANT_STRING;
        hashtable.put(Byte.valueOf(enumC60914.m16591()), enumC60914);
        EnumC6098 enumC60915 = EnumC6098.CONSTANT_FIELD;
        hashtable.put(Byte.valueOf(enumC60915.m16591()), enumC60915);
        EnumC6098 enumC60916 = EnumC6098.CONSTANT_METHOD;
        hashtable.put(Byte.valueOf(enumC60916.m16591()), enumC60916);
        EnumC6098 enumC60917 = EnumC6098.CONSTANT_INTERFACEMETHOD;
        hashtable.put(Byte.valueOf(enumC60917.m16591()), enumC60917);
        EnumC6098 enumC60918 = EnumC6098.CONSTANT_NAMEANDTYPE;
        hashtable.put(Byte.valueOf(enumC60918.m16591()), enumC60918);
        EnumC6098 enumC60919 = EnumC6098.CONSTANT_METHODHANDLE;
        hashtable.put(Byte.valueOf(enumC60919.m16591()), enumC60919);
        EnumC6098 enumC60920 = EnumC6098.CONSTANT_METHODTYPE;
        hashtable.put(Byte.valueOf(enumC60920.m16591()), enumC60920);
        EnumC6098 enumC60921 = EnumC6098.CONSTANT_DYNAMIC;
        hashtable.put(Byte.valueOf(enumC60921.m16591()), enumC60921);
        EnumC6098 enumC60922 = EnumC6098.CONSTANT_INVOKEDYNAMIC;
        hashtable.put(Byte.valueOf(enumC60922.m16591()), enumC60922);
        EnumC6098 enumC60923 = EnumC6098.CONSTANT_MODULE;
        hashtable.put(Byte.valueOf(enumC60923.m16591()), enumC60923);
        EnumC6098 enumC60924 = EnumC6098.CONSTANT_PACKAGE;
        hashtable.put(Byte.valueOf(enumC60924.m16591()), enumC60924);
        EnumC17387 enumC17387 = EnumC17387.REF_GETFIELD;
        hashtable2.put(Byte.valueOf(enumC17387.m40501()), enumC17387);
        EnumC17387 enumC17388 = EnumC17387.REF_GETSTATIC;
        hashtable2.put(Byte.valueOf(enumC17388.m40501()), enumC17388);
        EnumC17387 enumC17389 = EnumC17387.REF_PUTFIELD;
        hashtable2.put(Byte.valueOf(enumC17389.m40501()), enumC17389);
        EnumC17387 enumC173810 = EnumC17387.REF_PUTSTATIC;
        hashtable2.put(Byte.valueOf(enumC173810.m40501()), enumC173810);
        EnumC17387 enumC173811 = EnumC17387.REF_INVOKEVIRTUAL;
        hashtable2.put(Byte.valueOf(enumC173811.m40501()), enumC173811);
        EnumC17387 enumC173812 = EnumC17387.REF_INVOKESTATIC;
        hashtable2.put(Byte.valueOf(enumC173812.m40501()), enumC173812);
        EnumC17387 enumC173813 = EnumC17387.REF_INVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC173813.m40501()), enumC173813);
        EnumC17387 enumC173814 = EnumC17387.REF_NEWINVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC173814.m40501()), enumC173814);
        EnumC17387 enumC173815 = EnumC17387.REF_INVOKEINTERFACE;
        hashtable2.put(Byte.valueOf(enumC173815.m40501()), enumC173815);
    }

    public C11038(C3980 c3980) {
        super(c3980.f22710);
        this.f37496 = false;
        this.f37495 = "";
        this.f37498 = 0;
        this.f37497 = 0;
        this.f37493 = 0;
        this.f37492 = c3980;
        this.f37494 = c3980.f47519;
        this.f22696 = EnumC10020.CONSTANT_POOL;
        this.f37499 = new ArrayList(10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27819(boolean z) {
        this.f37496 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27816(EnumC6098 enumC6098) {
        return this.f37496 ? C22697.m50267(new StringBuilder(), enumC6098.f20663, " ") : "";
    }

    public final int size() {
        return this.f37499.size();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m27814(int i) {
        if (this.f37491 == null) {
            this.f37491 = new C3937(1, Integer.valueOf(this.f37499.size() - 1));
        }
        return this.f37491.m11412(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27818(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        ArrayList arrayList = new ArrayList(unsignedShort);
        this.f37499 = arrayList;
        arrayList.add(0, null);
        AbstractC0410 abstractC0410 = this.f37494;
        abstractC0410.m2146(C8479.m22141(unsignedShort, "constant_pool_count = "), new Object[0]);
        int i = 1;
        while (i < unsignedShort) {
            byte b = dataInputStream.readByte();
            EnumC6098 enumC6098 = (EnumC6098) f37490.get(Byte.valueOf(b));
            if (enumC6098 == null) {
                throw new ClassFormatError(String.format("Error while reading constant pool for %s: unexpected tag at #%d: %d", abstractC0410.m2168(), Integer.valueOf(i), Byte.valueOf(b)));
            }
            int iM16596 = enumC6098.m16596();
            StringBuilder sbM2791 = C0589.m2791("\tCP entry #", i, " tag[", "]\t=\t", b);
            sbM2791.append(enumC6098);
            abstractC0410.m2146(sbM2791.toString(), new Object[0]);
            switch (enumC6098.ordinal()) {
                case 1:
                    this.f37499.add(i, new C16682(this, enumC6098, dataInputStream.readUTF()));
                    break;
                case 2:
                    this.f37499.add(i, new C20210(this, enumC6098, dataInputStream.readInt()));
                    break;
                case 3:
                    this.f37499.add(i, new C15977(this, enumC6098, dataInputStream.readFloat()));
                    break;
                case 4:
                    this.f37499.add(i, new C0453(this, enumC6098, dataInputStream.readLong()));
                    this.f37499.add(null);
                    break;
                case 5:
                    this.f37499.add(i, new C20915(this, enumC6098, dataInputStream.readDouble()));
                    this.f37499.add(null);
                    break;
                case 6:
                case 7:
                case 13:
                case 16:
                case 17:
                    this.f37499.add(i, new C7509(this, enumC6098, dataInputStream.readUnsignedShort()));
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 14:
                case 15:
                    this.f37499.add(i, new C10332(this, enumC6098, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
                    break;
                case 12:
                    this.f37499.add(i, new C10332(this, enumC6098, dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedShort()));
                    break;
                default:
                    throw new ClassFormatError(C8479.m22141(b, "invalid constant type: "));
            }
            i += iM16596;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12449 m27823(int i) {
        if (m27814(i)) {
            return (AbstractC12449) this.f37499.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m27826(int i, Function function) {
        AbstractC12449 abstractC12449;
        return (m27814(i) && (abstractC12449 = (AbstractC12449) this.f37499.get(i)) != null && abstractC12449.f41512 == EnumC6098.CONSTANT_UTF8) ? (String) ((C16682) abstractC12449).f41511 : (String) function.apply(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m27827(int i) {
        AbstractC12449 abstractC12449;
        return (m27814(i) && (abstractC12449 = (AbstractC12449) this.f37499.get(i)) != null && abstractC12449.f41512 == EnumC6098.CONSTANT_MODULE) ? abstractC12449.mo2278() : "#" + Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m27828(int i) {
        AbstractC12449 abstractC12449;
        return (m27814(i) && (abstractC12449 = (AbstractC12449) this.f37499.get(i)) != null && abstractC12449.f41512 == EnumC6098.CONSTANT_PACKAGE) ? abstractC12449.mo2278() : "#" + Integer.valueOf(i);
    }

    public final String getName(int i) {
        String strM27826 = m27826(i, new C1852(5));
        return strM27826 == null ? C2271.m6966(i, "<invalid constant pool index:", ">") : C9754.m24743(strM27826);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m27822(int i) {
        return m27815(i, new C13688(4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m27829(int i) {
        AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
        if (abstractC12449 != null && (abstractC12449 instanceof C10332)) {
            return ((C10332) abstractC12449).mo2278();
        }
        return abstractC12449.mo2278();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m27820(final int i) {
        AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
        if (abstractC12449 != null && abstractC12449.f41512 == EnumC6098.CONSTANT_NAMEANDTYPE) {
            final EnumC6098[] enumC6098Arr = {EnumC6098.CONSTANT_METHOD, EnumC6098.CONSTANT_INTERFACEMETHOD, EnumC6098.CONSTANT_METHODHANDLE, EnumC6098.CONSTANT_DYNAMIC, EnumC6098.CONSTANT_INVOKEDYNAMIC};
            if (!C9030.stream(this.f37499).filter(new Predicate() { // from class: l.᩵ܰۤ
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
                    AbstractC12449 abstractC124410 = (AbstractC12449) obj;
                    return abstractC124410 != null && abstractC124410.f41512.m16594(enumC6098Arr);
                }
            }).filter(new Predicate() { // from class: l.ۡܰۤ
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
                    return ((C10332) ((AbstractC12449) obj)).f35433 == i;
                }
            }).findFirst().isPresent()) {
                return abstractC12449.mo2278();
            }
        }
        AbstractC9584 abstractC9584M2163 = this.f37494.m2163();
        Object[] objArr = {Integer.valueOf(i)};
        abstractC9584M2163.getClass();
        String strM24455 = AbstractC9584.m24455("The ConstantPool[{0}] must be a CONSTANT_NameAndType_info structure with a field descriptor", objArr);
        return this.f22692 ? strM24455 : String.format("??? #%d %s", Integer.valueOf(i), strM24455);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m27830(int i, String str) {
        String strM27815 = m27815(i, new C1852(5));
        if (strM27815 == null) {
            return String.format(str, Integer.valueOf(i));
        }
        return strM27815.replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27815(int i, Function function) {
        AbstractC12449 abstractC12449;
        AbstractC12449 abstractC124410 = null;
        if (m27814(i) && (abstractC12449 = (AbstractC12449) this.f37499.get(i)) != null && abstractC12449.f41512 == EnumC6098.CONSTANT_CLASS) {
            abstractC124410 = abstractC12449;
        }
        if (abstractC124410 == null) {
            return (String) function.apply(Integer.valueOf(i));
        }
        return m27817((C7509) abstractC124410);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27817(C7509 c7509) {
        AbstractC12449 abstractC12449;
        int iIntValue = ((Integer) c7509.f41511).intValue();
        String strM22141 = C8479.m22141(iIntValue, "#");
        if (!m27814(iIntValue) || (abstractC12449 = (AbstractC12449) this.f37499.get(iIntValue)) == null || abstractC12449.f41512 != EnumC6098.CONSTANT_UTF8) {
            return strM22141;
        }
        String str = (String) ((C16682) abstractC12449).f41511;
        return (str == null || !str.startsWith("[")) ? str : C16523.m38890("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27808(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == str2.length() && str.startsWith(str2)) ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m27831(int i) {
        if (!m27814(i)) {
            return String.format("<invalid constant pool index: %d>", Integer.valueOf(i));
        }
        AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
        return abstractC12449 == null ? "<null>" : abstractC12449.mo2278();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m27825(int i) {
        EnumC6098 enumC6098;
        if (i == 0 || !m27814(i)) {
            return C8479.m22141(i, "#");
        }
        AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
        if (abstractC12449 == null) {
            return C8479.m22141(i, "#");
        }
        if (abstractC12449 instanceof C10332) {
            C10332 c10332 = (C10332) abstractC12449;
            if (((Integer) c10332.f41511).intValue() == this.f37492.f14762 && ((enumC6098 = c10332.f41512) == EnumC6098.CONSTANT_FIELD || enumC6098 == EnumC6098.CONSTANT_METHOD || enumC6098 == EnumC6098.CONSTANT_INTERFACEMETHOD)) {
                i = c10332.f35433;
            }
        }
        return abstractC12449.f41512.f20663 + " " + m27831(i);
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo18231() {
        return this.f22709;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8969() {
        if (this.f22698 && !this.f22704) {
            m18209("// " + this.f22696.m25298() + ":");
        }
        int i = 1;
        while (i < this.f37499.size()) {
            AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
            int iMo2279 = 0;
            m18229(this.f37495, Integer.valueOf(i));
            if (abstractC12449 == null) {
                m18209("null;");
            } else {
                iMo2279 = abstractC12449.mo2279();
                abstractC12449.f41510 = Math.max(AbstractC6741.f22680, this.f37493);
                abstractC12449.mo2277(this.f22710, this.f37493);
            }
            i += iMo2279;
        }
        this.f22710.mo18527("");
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۡ */
    public final void mo8967() {
        if (this.f22698 && !this.f22704) {
            m18209("// " + this.f22696.m25298() + ":");
        }
        int i = 1;
        while (i < this.f37499.size()) {
            AbstractC12449 abstractC12449 = (AbstractC12449) this.f37499.get(i);
            int iMo2279 = 0;
            m18229(this.f37495, Integer.valueOf(i));
            if (abstractC12449 == null) {
                m18209("null;");
            } else {
                iMo2279 = abstractC12449.mo2279();
                abstractC12449.f41510 = Math.max(AbstractC6741.f22680, this.f37493);
                abstractC12449.mo2280(this.f22710, this.f37493);
            }
            i += iMo2279;
        }
        this.f22710.mo18527("");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27824() {
        int iOrElse = C9030.stream(this.f37499).mapToInt(new ToIntFunction() { // from class: l.ᩳܰۤ
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                AbstractC12449 abstractC12449 = (AbstractC12449) obj;
                C11038 c11038 = this.f57857;
                c11038.getClass();
                if (abstractC12449 == null) {
                    return 4;
                }
                return abstractC12449.f41512.m16592(c11038.f22709);
            }
        }).max().orElse(10);
        this.f37497 = this.f37499.size() > 100 ? 4 : 3;
        this.f37493 = iOrElse + 1;
        String strM30911 = C12441.m30911(this.f37497, "d = ", new StringBuilder("const #%-"));
        this.f37495 = strM30911;
        this.f37498 = String.format(strM30911, Integer.valueOf(this.f37499.size())).length();
        int iM18233 = m18233() + this.f37498;
        int i = this.f37493;
        this.f22686 = Math.max(AbstractC6741.f22680, i) + iM18233 + i;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List m27821() {
        int i = 0;
        return C9030.stream(this.f37499).filter(new C18798(i)).flatMap(new C8215(i)).toList();
    }
}
