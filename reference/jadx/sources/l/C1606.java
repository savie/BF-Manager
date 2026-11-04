package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.֫֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1606 extends AbstractC20997 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final Hashtable f5505;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final C23773 f5506 = new C23773(8);

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final Hashtable f5507;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f5508;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12931 f5509;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f5510;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f5511;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public String f5512;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C9990 f5513;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f5514;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C0224 f5515;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f5516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5619(C1606 c1606, int i) {
        c1606.getClass();
        EnumC12792 enumC12792 = (EnumC12792) f5505.get(Byte.valueOf((byte) i));
        return enumC12792 == null ? C13645.m33382(i, "BOGUS_SUBTAG:") : enumC12792.f40920;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f5507 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f5505 = hashtable2;
        EnumC5335 enumC5335 = EnumC5335.CONSTANT_UTF8;
        hashtable.put(Byte.valueOf(enumC5335.m15988()), enumC5335);
        EnumC5335 enumC5336 = EnumC5335.CONSTANT_INTEGER;
        hashtable.put(Byte.valueOf(enumC5336.m15988()), enumC5336);
        EnumC5335 enumC5337 = EnumC5335.CONSTANT_FLOAT;
        hashtable.put(Byte.valueOf(enumC5337.m15988()), enumC5337);
        EnumC5335 enumC5338 = EnumC5335.CONSTANT_LONG;
        hashtable.put(Byte.valueOf(enumC5338.m15988()), enumC5338);
        EnumC5335 enumC5339 = EnumC5335.CONSTANT_DOUBLE;
        hashtable.put(Byte.valueOf(enumC5339.m15988()), enumC5339);
        EnumC5335 enumC53310 = EnumC5335.CONSTANT_CLASS;
        hashtable.put(Byte.valueOf(enumC53310.m15988()), enumC53310);
        EnumC5335 enumC53311 = EnumC5335.CONSTANT_STRING;
        hashtable.put(Byte.valueOf(enumC53311.m15988()), enumC53311);
        EnumC5335 enumC53312 = EnumC5335.CONSTANT_FIELD;
        hashtable.put(Byte.valueOf(enumC53312.m15988()), enumC53312);
        EnumC5335 enumC53313 = EnumC5335.CONSTANT_METHOD;
        hashtable.put(Byte.valueOf(enumC53313.m15988()), enumC53313);
        EnumC5335 enumC53314 = EnumC5335.CONSTANT_INTERFACEMETHOD;
        hashtable.put(Byte.valueOf(enumC53314.m15988()), enumC53314);
        EnumC5335 enumC53315 = EnumC5335.CONSTANT_NAMEANDTYPE;
        hashtable.put(Byte.valueOf(enumC53315.m15988()), enumC53315);
        EnumC5335 enumC53316 = EnumC5335.CONSTANT_METHODHANDLE;
        hashtable.put(Byte.valueOf(enumC53316.m15988()), enumC53316);
        EnumC5335 enumC53317 = EnumC5335.CONSTANT_METHODTYPE;
        hashtable.put(Byte.valueOf(enumC53317.m15988()), enumC53317);
        EnumC5335 enumC53318 = EnumC5335.CONSTANT_DYNAMIC;
        hashtable.put(Byte.valueOf(enumC53318.m15988()), enumC53318);
        EnumC5335 enumC53319 = EnumC5335.CONSTANT_INVOKEDYNAMIC;
        hashtable.put(Byte.valueOf(enumC53319.m15988()), enumC53319);
        EnumC5335 enumC53320 = EnumC5335.CONSTANT_MODULE;
        hashtable.put(Byte.valueOf(enumC53320.m15988()), enumC53320);
        EnumC5335 enumC53321 = EnumC5335.CONSTANT_PACKAGE;
        hashtable.put(Byte.valueOf(enumC53321.m15988()), enumC53321);
        EnumC12792 enumC12792 = EnumC12792.REF_GETFIELD;
        hashtable2.put(Byte.valueOf(enumC12792.m31680()), enumC12792);
        EnumC12792 enumC12793 = EnumC12792.REF_GETSTATIC;
        hashtable2.put(Byte.valueOf(enumC12793.m31680()), enumC12793);
        EnumC12792 enumC12794 = EnumC12792.REF_PUTFIELD;
        hashtable2.put(Byte.valueOf(enumC12794.m31680()), enumC12794);
        EnumC12792 enumC12795 = EnumC12792.REF_PUTSTATIC;
        hashtable2.put(Byte.valueOf(enumC12795.m31680()), enumC12795);
        EnumC12792 enumC12796 = EnumC12792.REF_INVOKEVIRTUAL;
        hashtable2.put(Byte.valueOf(enumC12796.m31680()), enumC12796);
        EnumC12792 enumC12797 = EnumC12792.REF_INVOKESTATIC;
        hashtable2.put(Byte.valueOf(enumC12797.m31680()), enumC12797);
        EnumC12792 enumC12798 = EnumC12792.REF_INVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC12798.m31680()), enumC12798);
        EnumC12792 enumC12799 = EnumC12792.REF_NEWINVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC12799.m31680()), enumC12799);
        EnumC12792 enumC127910 = EnumC12792.REF_INVOKEINTERFACE;
        hashtable2.put(Byte.valueOf(enumC127910.m31680()), enumC127910);
    }

    public C1606(C0224 c0224) {
        super(c0224.f67151);
        this.f5510 = false;
        this.f5512 = "";
        this.f5516 = 0;
        this.f5508 = 0;
        this.f5511 = 0;
        this.f5515 = c0224;
        this.f5509 = c0224.f6369;
        this.f67131 = EnumC10882.CONSTANT_POOL;
        this.f5514 = new ArrayList(10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5629(boolean z) {
        this.f5510 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5626(EnumC5335 enumC5335) {
        return this.f5510 ? C8947.m23910(new StringBuilder(), enumC5335.f18750, " ") : "";
    }

    public final int size() {
        return this.f5514.size();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m5638(int i) {
        if (this.f5513 == null) {
            this.f5513 = new C9990(1, Integer.valueOf(this.f5514.size() - 1));
        }
        return this.f5513.m25835(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5628(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        ArrayList arrayList = new ArrayList(unsignedShort);
        this.f5514 = arrayList;
        arrayList.add(0, null);
        AbstractC12931 abstractC12931 = this.f5509;
        abstractC12931.m32315(C13645.m33382(unsignedShort, "constant_pool_count = "), new Object[0]);
        int i = 1;
        while (i < unsignedShort) {
            byte b = dataInputStream.readByte();
            EnumC5335 enumC5335 = (EnumC5335) f5507.get(Byte.valueOf(b));
            if (enumC5335 == null) {
                throw new ClassFormatError(String.format("Error while reading constant pool for %s: unexpected tag at #%d: %d", abstractC12931.m32307(), Integer.valueOf(i), Byte.valueOf(b)));
            }
            int iM15994 = enumC5335.m15994();
            StringBuilder sbM5126 = C1402.m5126("\tCP entry #", i, " tag[", "]\t=\t", b);
            sbM5126.append(enumC5335);
            abstractC12931.m32315(sbM5126.toString(), new Object[0]);
            switch (enumC5335.ordinal()) {
                case 1:
                    this.f5514.add(i, new C19505(this, enumC5335, dataInputStream.readUTF()));
                    break;
                case 2:
                    this.f5514.add(i, new C10554(this, enumC5335, dataInputStream.readInt()));
                    break;
                case 3:
                    this.f5514.add(i, new C21743(this, enumC5335, dataInputStream.readFloat()));
                    break;
                case 4:
                    this.f5514.add(i, new C22489(this, enumC5335, dataInputStream.readLong()));
                    this.f5514.add(null);
                    break;
                case 5:
                    this.f5514.add(i, new C4589(this, enumC5335, dataInputStream.readDouble()));
                    this.f5514.add(null);
                    break;
                case 6:
                case 7:
                case 13:
                case 16:
                case 17:
                    this.f5514.add(i, new C13647(this, enumC5335, dataInputStream.readUnsignedShort()));
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 14:
                case 15:
                    this.f5514.add(i, new C6936(this, enumC5335, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
                    break;
                case 12:
                    this.f5514.add(i, new C6936(this, enumC5335, dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedShort()));
                    break;
                default:
                    throw new ClassFormatError(C13645.m33382(b, "invalid constant type: "));
            }
            i += iM15994;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC15029 m5631(int i) {
        if (m5638(i)) {
            return (AbstractC15029) this.f5514.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m5640(int i, Function function) {
        AbstractC15029 abstractC15029;
        return (m5638(i) && (abstractC15029 = (AbstractC15029) this.f5514.get(i)) != null && abstractC15029.f49067 == EnumC5335.CONSTANT_UTF8) ? (String) ((C19505) abstractC15029).f49068 : (String) function.apply(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m5635(int i) {
        AbstractC15029 abstractC15029;
        return (m5638(i) && (abstractC15029 = (AbstractC15029) this.f5514.get(i)) != null && abstractC15029.f49067 == EnumC5335.CONSTANT_MODULE) ? abstractC15029.mo14388() : "#" + Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m5639(int i) {
        AbstractC15029 abstractC15029;
        return (m5638(i) && (abstractC15029 = (AbstractC15029) this.f5514.get(i)) != null && abstractC15029.f49067 == EnumC5335.CONSTANT_PACKAGE) ? abstractC15029.mo14388() : "#" + Integer.valueOf(i);
    }

    public final String getName(int i) {
        String strM5640 = m5640(i, new C7873(8));
        return strM5640 == null ? C14442.m34864(i, "<invalid constant pool index:", ">") : C11109.m28061(strM5640);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m5633(int i) {
        return m5625(i, new C10080(6));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m5624(int i) {
        AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
        if (abstractC15029 != null && (abstractC15029 instanceof C6936)) {
            return ((C6936) abstractC15029).mo14388();
        }
        return abstractC15029.mo14388();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m5642(final int i) {
        AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
        if (abstractC15029 != null && abstractC15029.f49067 == EnumC5335.CONSTANT_NAMEANDTYPE) {
            final EnumC5335[] enumC5335Arr = {EnumC5335.CONSTANT_METHOD, EnumC5335.CONSTANT_INTERFACEMETHOD, EnumC5335.CONSTANT_METHODHANDLE, EnumC5335.CONSTANT_DYNAMIC, EnumC5335.CONSTANT_INVOKEDYNAMIC};
            if (!C1170.stream(this.f5514).filter(new Predicate() { // from class: l.ۖۚ᩺
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
                    AbstractC15029 abstractC150210 = (AbstractC15029) obj;
                    return abstractC150210 != null && abstractC150210.f49067.m15991(enumC5335Arr);
                }
            }).filter(new Predicate() { // from class: l.۠ۚ᩺
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
                    return ((C6936) ((AbstractC15029) obj)).f22943 == i;
                }
            }).findFirst().isPresent()) {
                return abstractC15029.mo14388();
            }
        }
        AbstractC3236 abstractC3236M32312 = this.f5509.m32312();
        Object[] objArr = {Integer.valueOf(i)};
        abstractC3236M32312.getClass();
        String strM10580 = AbstractC3236.m10580("The ConstantPool[{0}] must be a CONSTANT_NameAndType_info structure with a field descriptor", objArr);
        return this.f67132 ? strM10580 : String.format("??? #%d %s", Integer.valueOf(i), strM10580);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m5636(int i, String str) {
        String strM5625 = m5625(i, new C7873(8));
        if (strM5625 == null) {
            return String.format(str, Integer.valueOf(i));
        }
        return strM5625.replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5625(int i, Function function) {
        AbstractC15029 abstractC15029;
        AbstractC15029 abstractC150210 = null;
        if (m5638(i) && (abstractC15029 = (AbstractC15029) this.f5514.get(i)) != null && abstractC15029.f49067 == EnumC5335.CONSTANT_CLASS) {
            abstractC150210 = abstractC15029;
        }
        if (abstractC150210 == null) {
            return (String) function.apply(Integer.valueOf(i));
        }
        return m5627((C13647) abstractC150210);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5627(C13647 c13647) {
        AbstractC15029 abstractC15029;
        int iIntValue = ((Integer) c13647.f49068).intValue();
        String strM33382 = C13645.m33382(iIntValue, "#");
        if (!m5638(iIntValue) || (abstractC15029 = (AbstractC15029) this.f5514.get(iIntValue)) == null || abstractC15029.f49067 != EnumC5335.CONSTANT_UTF8) {
            return strM33382;
        }
        String str = (String) ((C19505) abstractC15029).f49068;
        return (str == null || !str.startsWith("[")) ? str : C14442.m34865("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5618(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == str2.length() && str.startsWith(str2)) ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m5644(int i) {
        if (!m5638(i)) {
            return String.format("<invalid constant pool index: %d>", Integer.valueOf(i));
        }
        AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
        return abstractC15029 == null ? "<null>" : abstractC15029.mo14388();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m5630(int i) {
        EnumC5335 enumC5335;
        if (i == 0 || !m5638(i)) {
            return C13645.m33382(i, "#");
        }
        AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
        if (abstractC15029 == null) {
            return C13645.m33382(i, "#");
        }
        if (abstractC15029 instanceof C6936) {
            C6936 c6936 = (C6936) abstractC15029;
            if (((Integer) c6936.f49068).intValue() == this.f5515.f1437 && ((enumC5335 = c6936.f49067) == EnumC5335.CONSTANT_FIELD || enumC5335 == EnumC5335.CONSTANT_METHOD || enumC5335 == EnumC5335.CONSTANT_INTERFACEMETHOD)) {
                i = c6936.f22943;
            }
        }
        return abstractC15029.f49067.f18750 + " " + m5644(i);
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean mo5637() {
        return this.f67155;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo5641() {
        if (this.f67128 && !this.f67146) {
            m48013("// " + this.f67131.m27630() + ":");
        }
        int i = 1;
        while (i < this.f5514.size()) {
            AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
            int iMo14389 = 0;
            m48010(this.f5512, Integer.valueOf(i));
            if (abstractC15029 == null) {
                m48013("null;");
            } else {
                iMo14389 = abstractC15029.mo14389();
                abstractC15029.f49066 = Math.max(AbstractC20997.f67126, this.f5511);
                abstractC15029.mo14387(this.f67151, this.f5511);
            }
            i += iMo14389;
        }
        this.f67151.mo3881("");
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo5634() {
        if (this.f67128 && !this.f67146) {
            m48013("// " + this.f67131.m27630() + ":");
        }
        int i = 1;
        while (i < this.f5514.size()) {
            AbstractC15029 abstractC15029 = (AbstractC15029) this.f5514.get(i);
            int iMo14389 = 0;
            m48010(this.f5512, Integer.valueOf(i));
            if (abstractC15029 == null) {
                m48013("null;");
            } else {
                iMo14389 = abstractC15029.mo14389();
                abstractC15029.f49066 = Math.max(AbstractC20997.f67126, this.f5511);
                abstractC15029.mo14390(this.f67151, this.f5511);
            }
            i += iMo14389;
        }
        this.f67151.mo3881("");
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m5632() {
        int iOrElse = C1170.stream(this.f5514).mapToInt(new ToIntFunction() { // from class: l.ۡۚ᩺
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                AbstractC15029 abstractC15029 = (AbstractC15029) obj;
                C1606 c1606 = this.f29771;
                c1606.getClass();
                if (abstractC15029 == null) {
                    return 4;
                }
                return abstractC15029.f49067.m15989(c1606.f67155);
            }
        }).max().orElse(10);
        this.f5508 = this.f5514.size() > 100 ? 4 : 3;
        this.f5511 = iOrElse + 1;
        String strM31437 = C12669.m31437(this.f5508, "d = ", new StringBuilder("const #%-"));
        this.f5512 = strM31437;
        this.f5516 = String.format(strM31437, Integer.valueOf(this.f5514.size())).length();
        int iM48002 = m48002() + this.f5516;
        int i = this.f5511;
        this.f67148 = Math.max(AbstractC20997.f67126, i) + iM48002 + i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List m5643() {
        return C1170.stream(this.f5514).filter(new C8618(3)).flatMap(new C13471(1)).toList();
    }
}
