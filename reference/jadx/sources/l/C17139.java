package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C17139 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public static C3937 f54655 = new C3937(247, 255);

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC16783 f54656;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f54657;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public String f54658;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public String f54659;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public EnumC1965 f54660;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public int[] f54661;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public String f54662;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f54663;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public int[] f54664;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public int[] f54665;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC12201 f54666;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public int f54667;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public int f54668;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public int f54669;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public int f54670;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public int f54671;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f54672;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40044(C17139 c17139) {
        boolean z = c17139.f22692;
        int[] iArr = c17139.f54664;
        c17139.m18219(c17139.m18207(c17139.m18205(), String.format(c17139.f54658, EnumC20934.f68120.m47084(), Integer.valueOf(c17139.f54657))));
        String str = String.format("%-10s", EnumC20934.f68051.m47084());
        int[] iArr2 = c17139.f54661;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(str, new C13111(Boolean.valueOf(iArr2 != null), iArr2)), new AbstractMap.SimpleEntry(String.format("%-10s", EnumC20934.f68068.m47084()), new C13111(Boolean.valueOf(iArr != null), iArr))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C13638.requireNonNull(key);
            Object value = entry.getValue();
            C13638.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C9023.m23354(key, "duplicate key: "));
            }
        }
        for (Map.Entry entry2 : C0561.unmodifiableMap(map).entrySet()) {
            if (((Boolean) ((C13111) entry2.getValue()).f43679).booleanValue()) {
                int[] iArr3 = (int[]) ((C13111) entry2.getValue()).f43680;
                C13111 c13111M40046 = c17139.m40046(" ", iArr3);
                String str2 = String.format(c17139.f54662, entry2.getKey(), C22697.m50267(new StringBuilder("["), (String) (z ? c13111M40046.f43679 : c13111M40046.f43680), "]"));
                if (!z) {
                    c17139.m18219(c17139.m18207(c17139.m18205() * 2, str2));
                } else if (c17139.f22704) {
                    c17139.m18219(c17139.m18207(c17139.m18205() * 2, str2));
                } else {
                    c17139.m18228(c17139.m18222((((c17139.f47514.m18220() + c17139.f54667) + 27) - (c17139.m18205() * 2)) - 2, c17139.m18207(c17139.m18205(), str2)));
                    c17139.m18219(iArr3.length == 0 ? "" : " //" + ((String) c13111M40046.f43680));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40042(C17139 c17139) {
        boolean z;
        int length;
        String str;
        ?? r8;
        char c;
        int[] iArr = c17139.f54664;
        int[] iArr2 = c17139.f54661;
        int[] iArr3 = c17139.f54665;
        EnumC1965 enumC1965 = c17139.f54660;
        boolean z2 = c17139.f22704;
        boolean z3 = c17139.f22692;
        int i = c17139.f54663;
        String str2 = c17139.f54658;
        String strM47084 = EnumC20934.f68160.m47084();
        int i2 = c17139.f54668;
        int i3 = 0;
        String str3 = String.format(str2, strM47084, Integer.valueOf(i2));
        if (c17139.f54672) {
            c17139.m18208(c17139.f54669);
        }
        if (z2 && z3) {
            c17139.m18209(str3);
            r8 = 0;
            c = 1;
            str = "";
        } else {
            if (z3) {
                length = ((str3.length() + (c17139.f47514.m18220() + c17139.f54667)) - (c17139.m18205() * 2)) - 2;
                z = false;
            } else {
                z = false;
                length = str3.length();
            }
            i3 = length + i;
            if (z3) {
                str = "";
                c17139.m18223(c17139.m18222(i3 - ((c17139.f54669 + 2) * c17139.m18205()), str3));
                c17139.m18219(z2 ? str : " // " + enumC1965.m6338());
            } else {
                str = "";
                c17139.m18223(c17139.m18222(i3 - (c17139.m18205() * c17139.f54669), str3));
                c17139.m18219(z2 ? str : " // " + enumC1965.m6338());
            }
            r8 = z;
            c = 1;
        }
        if (f54655.m11412(Integer.valueOf(i2))) {
            String str4 = c17139.f54658;
            String strM47085 = EnumC20934.f68049.m47084();
            Integer numValueOf = Integer.valueOf(c17139.f54671);
            Object[] objArr = new Object[2];
            objArr[r8] = strM47085;
            objArr[c] = numValueOf;
            c17139.m18219(c17139.m18207(i, String.format(str4, objArr)));
        }
        if (enumC1965 != EnumC1965.EARLY_LARVAL) {
            String strM47086 = EnumC20934.f68051.m47084();
            C13111 c13111 = new C13111(Boolean.valueOf(iArr2 != null), iArr2);
            String strM47087 = EnumC20934.f68068.m47084();
            C13111 c13112 = new C13111(Boolean.valueOf(iArr != null), iArr);
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(strM47086, c13111);
            AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(strM47087, c13112);
            Map.Entry[] entryArr = {simpleEntry, simpleEntry2};
            HashMap map = new HashMap(2);
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                Map.Entry entry = entryArr[i4];
                Object key = entry.getKey();
                C13638.requireNonNull(key);
                Object value = entry.getValue();
                C13638.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C9023.m23354(key, "duplicate key: "));
                }
                i4++;
            }
            for (Map.Entry entry2 : C0561.unmodifiableMap(map).entrySet()) {
                if (((Boolean) ((C13111) entry2.getValue()).f43679).booleanValue()) {
                    C13111 c13111M40046 = c17139.m40046(" ", (int[]) ((C13111) entry2.getValue()).f43680);
                    String strM50267 = C22697.m50267(new StringBuilder("["), (String) (z3 ? c13111M40046.f43679 : c13111M40046.f43680), "]");
                    if (!z3) {
                        c17139.m18219(c17139.m18207(i, String.format(c17139.f54662, entry2.getKey(), strM50267)));
                    } else if (z2) {
                        c17139.m18219(c17139.m18207(i, String.format(c17139.f54662, entry2.getKey(), strM50267)));
                    } else {
                        c17139.f22710.mo18524(c17139.m18222(i3, c17139.m18207(i, String.format(c17139.f54662, entry2.getKey(), strM50267))));
                        c17139.m18219(" //" + ((String) c13111M40046.f43680));
                    }
                }
            }
            if (c17139.f54672) {
                for (int i6 = 0; i6 < c17139.f54669; i6++) {
                    c17139.m18219(c17139.m18207(z3 ? c17139.f54670 : i, " }"));
                    c17139.m18227(1);
                }
                return;
            }
            return;
        }
        if (iArr3 != null) {
            int length2 = iArr3.length - 1;
            String str5 = length2 >= 0 ? "; " : str;
            Object[] objArr2 = new Object[1];
            objArr2[r8] = EnumC20934.f68174.m47084();
            String str6 = String.format("%-12s", objArr2);
            C13111 c13111M40047 = c17139.m40047(iArr3);
            String strConcat = ((String) C9030.stream((List) c13111M40047.f43679).collect(C1890.joining(", "))).concat(str5);
            String strConcat2 = ((String) C9030.stream((List) c13111M40047.f43680).collect(C1890.joining(", "))).concat(str5);
            String str7 = c17139.f54662;
            String strM50268 = C22697.m50267(new StringBuilder("[ "), z3 ? strConcat : strConcat2, "] {");
            Object[] objArr3 = new Object[2];
            objArr3[r8] = str6;
            objArr3[1] = strM50268;
            String str8 = String.format(str7, objArr3);
            if (!z3) {
                if (length2 <= 0) {
                    c17139.m18219(c17139.m18207(i, str8));
                    return;
                }
                c17139.m18219(c17139.m18207(i, String.format(c17139.f54662, str6, "[ " + ((String) ((List) c13111M40047.f43680).get(0)).concat(","))));
                int i7 = 1;
                while (i7 <= length2) {
                    c17139.m18219(c17139.m18207(i3 - 2, C16523.m38890(" ", (String) ((List) c13111M40047.f43680).get(i7), i7 == length2 ? "; ] {" : ",")));
                    i7++;
                }
                return;
            }
            if (z2) {
                c17139.m18219(c17139.m18207(i, str8));
                return;
            }
            if (length2 <= 0) {
                c17139.m18228(c17139.m18222(i3, c17139.m18207(i, str8)));
                c17139.m18219(iArr3.length == 0 ? str : C0252.m1693(" // ", strConcat2));
                return;
            }
            String strM18222 = c17139.m18222(i3, c17139.m18207(i, String.format(c17139.f54662, str6, "[ " + ((String) ((List) c13111M40047.f43679).get(0)).concat(","))));
            int iIndexOf = strM18222.indexOf(91) - ((c17139.f54669 + 1) * 2);
            c17139.f22710.mo18524(strM18222);
            c17139.m18219(" // " + ((String) ((List) c13111M40047.f43680).get(0)));
            int i8 = 1;
            while (i8 <= length2) {
                String str9 = i8 == length2 ? "; ]  {" : ",";
                String str10 = (String) ((List) c13111M40047.f43679).get(i8);
                String str11 = (String) ((List) c13111M40047.f43680).get(i8);
                c17139.f22710.mo18524(c17139.m18222(i3, c17139.m18207(iIndexOf, str10.concat(str9))));
                c17139.m18219(" // " + str11);
                i8++;
            }
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        mo14102(i, i2);
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9757() {
        return this.f22709;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        m18208(1);
        if (i == 0) {
            m18209(this.f54659);
        }
        this.f54666.mo30300(Integer.valueOf(i), Integer.valueOf(i2));
        m18227(1);
    }

    public C17139(C21620 c21620, DataInputStream dataInputStream) {
        super(c21620);
        this.f54672 = false;
        this.f54669 = 0;
        this.f54663 = m18205() * 2;
        this.f54670 = m18205() * 3;
        this.f54658 = "";
        this.f54662 = "";
        this.f54659 = "";
        EnumC16783 enumC16783 = EnumC16783.f53748;
        this.f54656 = enumC16783;
        this.f47507 = enumC16783.m39431();
        this.f22696 = EnumC10020.STACK_MAP;
        this.f54666 = new InterfaceC12201() { // from class: l.ᩳۚۤ
            @Override // l.InterfaceC12201
            /* JADX INFO: renamed from: ۙ */
            public final void mo30300(Integer num, Integer num2) {
                C17139.m40044(this.f56524);
            }
        };
        EnumC1965 enumC1965 = EnumC1965.FULL_FRAME;
        this.f54660 = enumC1965;
        this.f54668 = enumC1965.m6339();
        this.f54657 = dataInputStream.readUnsignedShort();
        this.f54664 = m40043(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f54661 = m40043(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f47519.m2152(new C18550(this, 0));
    }

    public C17139(boolean z, int i, C21620 c21620, DataInputStream dataInputStream) throws IOException {
        super(c21620);
        this.f54672 = false;
        this.f54669 = 0;
        this.f54663 = m18205() * 2;
        this.f54670 = m18205() * 3;
        this.f54658 = "";
        this.f54662 = "";
        this.f54659 = "";
        EnumC16783 enumC16783 = EnumC16783.f53716;
        this.f54656 = enumC16783;
        this.f47507 = enumC16783.m39431();
        this.f22696 = EnumC10020.STACK_MAP_TABLE;
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.f54668 = unsignedByte;
        EnumC1965 enumC1965M6335 = EnumC1965.m6335(unsignedByte);
        this.f54660 = enumC1965M6335;
        this.f54666 = new InterfaceC12201() { // from class: l.᩵ۚۤ
            @Override // l.InterfaceC12201
            /* JADX INFO: renamed from: ۙ */
            public final void mo30300(Integer num, Integer num2) {
                C17139.m40042(this.f62197);
            }
        };
        switch (C16434.f52854[enumC1965M6335.ordinal()]) {
            case 1:
                this.f54671 = -1;
                int unsignedShort = dataInputStream.readUnsignedShort();
                int[] iArr = new int[unsignedShort];
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    iArr[i2] = dataInputStream.readUnsignedShort();
                }
                this.f54665 = iArr;
                this.f47519.m2152(new Supplier() { // from class: l.ۡۚۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" early_larval_frame=%d", Integer.valueOf(this.f29868.f54668));
                    }
                });
                break;
            case 2:
                this.f54671 = unsignedByte;
                this.f47519.m2152(new Supplier() { // from class: l.ۤۚۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" same_frame=%d", Integer.valueOf(this.f34424.f54668));
                    }
                });
                break;
            case 3:
                this.f54671 = dataInputStream.readUnsignedShort();
                this.f47519.m2152(new Supplier() { // from class: l.۟ۚۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C17139 c17139 = this.f24167;
                        return String.format(" same_frame_extended=%d, offset=%d", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671));
                    }
                });
                break;
            case 4:
                this.f54671 = unsignedByte - 64;
                this.f54661 = m40043(1, dataInputStream);
                this.f47519.m2152(new Supplier() { // from class: l.᩷ۚۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C17139 c17139 = this.f67254;
                        return String.format(" same_locals_1_stack_item_frame=%d, offset=%d, numstack=%s", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671), C18755.m43308(c17139.f54661));
                    }
                });
                break;
            case 5:
                this.f54671 = dataInputStream.readUnsignedShort();
                this.f54661 = m40043(1, dataInputStream);
                this.f47519.m2152(new C15729(this, 0));
                break;
            case 6:
            case 7:
            case 8:
                this.f54671 = dataInputStream.readUnsignedShort();
                this.f47519.m2152(new C9565(this, 1));
                break;
            case 9:
                this.f54671 = dataInputStream.readUnsignedShort();
                this.f54664 = m40043(unsignedByte - 251, dataInputStream);
                this.f47519.m2152(new C19962(this, 0));
                break;
            case 10:
                this.f54671 = dataInputStream.readUnsignedShort();
                this.f54664 = m40043(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f54661 = m40043(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f47519.m2152(new Supplier() { // from class: l.֡ۚۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C17139 c17139 = this.f1363;
                        return String.format(" full_frame=%d offset=%d numloc=%s  numstack=%s", Integer.valueOf(c17139.f54668), Integer.valueOf(c17139.f54671), C18755.m43308(c17139.f54664), C18755.m43308(c17139.f54661));
                    }
                });
                break;
            default:
                this.f47519.m2152(new C21372());
                break;
        }
        if (i <= 0 && z) {
            this.f54657 = this.f54671;
        } else {
            this.f54657 = i + this.f54671 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13111 m40047(int[] iArr) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        for (int i : iArr) {
            if (((C21620) this.f47511).f22692) {
                arrayList.add(String.format("#%d", Integer.valueOf(i)));
            }
            arrayList2.add(((C21620) this.f47511).f47512.m27820(i));
        }
        return new C13111(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13111 m40046(String str, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new C13111("", "");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = iArr.length - 1;
        int i = 0;
        while (i <= length) {
            if (i == 0) {
                sb.append(str);
                sb2.append(str);
            }
            int i2 = iArr[i];
            int i3 = i2 & 255;
            EnumC9728 enumC9728M10027 = C3376.m10027(i3, C11521.of(new InterfaceC22283() { // from class: l.ܶۚۤ
                @Override // l.InterfaceC22283
                /* JADX INFO: renamed from: ۙ */
                public final void mo21019(Object[] objArr) {
                    this.f48987.f47519.mo2150("Unknown StackMapTable verification type {0}", objArr);
                }
            }));
            String str2 = i == 0 ? "" : " ";
            int i4 = i2 >> 8;
            int i5 = C16434.f52855[enumC9728M10027.ordinal()];
            if (i5 == 1) {
                if (((C21620) this.f47511).f22692) {
                    sb.append(str2);
                    sb.append("#");
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(((C21620) this.f47511).f47512.m27825(i4));
            } else if (i5 == 2) {
                if (((C21620) this.f47511).f22692) {
                    sb.append(str2);
                    sb.append(i3);
                    sb.append(" ");
                    sb.append(m18211());
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(enumC9728M10027.m24689());
                sb2.append(" ");
                sb2.append(m18211());
                sb2.append(i4);
            } else {
                if (((C21620) this.f47511).f22692) {
                    sb.append(str2);
                    sb.append(i3);
                }
                sb2.append(str2);
                sb2.append(enumC9728M10027.m24689());
            }
            if (((C21620) this.f47511).f22692) {
                sb.append(i == length ? ';' : ',');
            }
            sb2.append(i == length ? ';' : ',');
            if (i == length) {
                sb.append(str);
                sb2.append(str);
            }
            i++;
        }
        return new C13111(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m40049() {
        return this.f54656 == EnumC16783.f53716;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40048(int i, String str, String str2) {
        this.f54658 = str;
        this.f54662 = str2;
        this.f54667 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m40045(String str) {
        this.f54659 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m40043(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            int i3 = C16434.f52855[C3376.m10027(unsignedByte, C11521.of(new InterfaceC22283() { // from class: l.۠ۚۤ
                @Override // l.InterfaceC22283
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo21019(Object[] objArr) {
                    this.f26160.f47519.mo2150("Unknown StackMapTable verification type {0}", objArr);
                }
            })).ordinal()];
            if (i3 == 1) {
                unsignedShort = dataInputStream.readUnsignedShort();
            } else {
                if (i3 == 2) {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    ((C21620) this.f47511).m48335(unsignedShort).f60780 = true;
                }
                iArr[i2] = unsignedByte;
            }
            unsignedByte |= unsignedShort << 8;
            iArr[i2] = unsignedByte;
        }
        return iArr;
    }
}
