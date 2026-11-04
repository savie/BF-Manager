package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes2.dex */
public final class C22180 extends AbstractC1890 {

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public static C9990 f71456 = new C9990(247, 255);

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f71457;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public EnumC16110 f71458;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public int f71459;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f71460;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public String f71461;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public String f71462;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public int[] f71463;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final EnumC13127 f71464;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public int[] f71465;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC5026 f71466;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public int[] f71467;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public int f71468;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public int f71469;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public int f71470;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public int f71471;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public String f71472;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public boolean f71473;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m50173(C22180 c22180) {
        boolean z = c22180.f67132;
        int[] iArr = c22180.f71467;
        c22180.m48006(c22180.m48011(c22180.m48000(), String.format(c22180.f71462, EnumC5202.f18148.m15637(), Integer.valueOf(c22180.f71457))));
        String str = String.format("%-10s", EnumC5202.f18260.m15637());
        int[] iArr2 = c22180.f71463;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(str, new C18941(Boolean.valueOf(iArr2 != null), iArr2)), new AbstractMap.SimpleEntry(String.format("%-10s", EnumC5202.f18310.m15637()), new C18941(Boolean.valueOf(iArr != null), iArr))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C17359.requireNonNull(key);
            Object value = entry.getValue();
            C17359.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C14483.m34971("duplicate key: ", key));
            }
        }
        for (Map.Entry entry2 : C4681.unmodifiableMap(map).entrySet()) {
            if (((Boolean) ((C18941) entry2.getValue()).f61428).booleanValue()) {
                int[] iArr3 = (int[]) ((C18941) entry2.getValue()).f61429;
                C18941 c18941M50174 = c22180.m50174(" ", iArr3);
                String str2 = String.format(c22180.f71461, entry2.getKey(), C8947.m23910(new StringBuilder("["), (String) (z ? c18941M50174.f61428 : c18941M50174.f61429), "]"));
                if (!z) {
                    c22180.m48006(c22180.m48011(c22180.m48000() * 2, str2));
                } else if (c22180.f67146) {
                    c22180.m48006(c22180.m48011(c22180.m48000() * 2, str2));
                } else {
                    c22180.m48009(c22180.m47996((((c22180.f6376.m47999() + c22180.f71471) + 27) - (c22180.m48000() * 2)) - 2, c22180.m48011(c22180.m48000(), str2)));
                    c22180.m48006(iArr3.length == 0 ? "" : " //" + ((String) c18941M50174.f61429));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50171(C22180 c22180) {
        boolean z;
        int length;
        String str;
        ?? r8;
        char c;
        int[] iArr = c22180.f71467;
        int[] iArr2 = c22180.f71463;
        int[] iArr3 = c22180.f71465;
        EnumC16110 enumC16110 = c22180.f71458;
        boolean z2 = c22180.f67146;
        boolean z3 = c22180.f67132;
        int i = c22180.f71460;
        String str2 = c22180.f71462;
        String strM15637 = EnumC5202.f18282.m15637();
        int i2 = c22180.f71469;
        int i3 = 0;
        String str3 = String.format(str2, strM15637, Integer.valueOf(i2));
        if (c22180.f71473) {
            c22180.m48012(c22180.f71470);
        }
        if (z2 && z3) {
            c22180.m48013(str3);
            r8 = 0;
            c = 1;
            str = "";
        } else {
            if (z3) {
                length = ((str3.length() + (c22180.f6376.m47999() + c22180.f71471)) - (c22180.m48000() * 2)) - 2;
                z = false;
            } else {
                z = false;
                length = str3.length();
            }
            i3 = length + i;
            if (z3) {
                str = "";
                c22180.m47997(c22180.m47996(i3 - ((c22180.f71470 + 2) * c22180.m48000()), str3));
                c22180.m48006(z2 ? str : " // " + enumC16110.m38274());
            } else {
                str = "";
                c22180.m47997(c22180.m47996(i3 - (c22180.m48000() * c22180.f71470), str3));
                c22180.m48006(z2 ? str : " // " + enumC16110.m38274());
            }
            r8 = z;
            c = 1;
        }
        if (f71456.m25835(Integer.valueOf(i2))) {
            String str4 = c22180.f71462;
            String strM15638 = EnumC5202.f18262.m15637();
            Integer numValueOf = Integer.valueOf(c22180.f71468);
            Object[] objArr = new Object[2];
            objArr[r8] = strM15638;
            objArr[c] = numValueOf;
            c22180.m48006(c22180.m48011(i, String.format(str4, objArr)));
        }
        if (enumC16110 != EnumC16110.EARLY_LARVAL) {
            String strM15639 = EnumC5202.f18260.m15637();
            C18941 c18941 = new C18941(Boolean.valueOf(iArr2 != null), iArr2);
            String strM156310 = EnumC5202.f18310.m15637();
            C18941 c18942 = new C18941(Boolean.valueOf(iArr != null), iArr);
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(strM15639, c18941);
            AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(strM156310, c18942);
            Map.Entry[] entryArr = {simpleEntry, simpleEntry2};
            HashMap map = new HashMap(2);
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                Map.Entry entry = entryArr[i4];
                Object key = entry.getKey();
                C17359.requireNonNull(key);
                Object value = entry.getValue();
                C17359.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C14483.m34971("duplicate key: ", key));
                }
                i4++;
            }
            for (Map.Entry entry2 : C4681.unmodifiableMap(map).entrySet()) {
                if (((Boolean) ((C18941) entry2.getValue()).f61428).booleanValue()) {
                    C18941 c18941M50174 = c22180.m50174(" ", (int[]) ((C18941) entry2.getValue()).f61429);
                    String strM23910 = C8947.m23910(new StringBuilder("["), (String) (z3 ? c18941M50174.f61428 : c18941M50174.f61429), "]");
                    if (!z3) {
                        c22180.m48006(c22180.m48011(i, String.format(c22180.f71461, entry2.getKey(), strM23910)));
                    } else if (z2) {
                        c22180.m48006(c22180.m48011(i, String.format(c22180.f71461, entry2.getKey(), strM23910)));
                    } else {
                        c22180.f67151.mo3879(c22180.m47996(i3, c22180.m48011(i, String.format(c22180.f71461, entry2.getKey(), strM23910))));
                        c22180.m48006(" //" + ((String) c18941M50174.f61429));
                    }
                }
            }
            if (c22180.f71473) {
                for (int i6 = 0; i6 < c22180.f71470; i6++) {
                    c22180.m48006(c22180.m48011(z3 ? c22180.f71459 : i, " }"));
                    c22180.m48008(1);
                }
                return;
            }
            return;
        }
        if (iArr3 != null) {
            int length2 = iArr3.length - 1;
            String str5 = length2 >= 0 ? "; " : str;
            Object[] objArr2 = new Object[1];
            objArr2[r8] = EnumC5202.f18143.m15637();
            String str6 = String.format("%-12s", objArr2);
            C18941 c18941M50175 = c22180.m50175(iArr3);
            String strConcat = ((String) C1170.stream((List) c18941M50175.f61428).collect(C2025.joining(", "))).concat(str5);
            String strConcat2 = ((String) C1170.stream((List) c18941M50175.f61429).collect(C2025.joining(", "))).concat(str5);
            String str7 = c22180.f71461;
            String strM23911 = C8947.m23910(new StringBuilder("[ "), z3 ? strConcat : strConcat2, "] {");
            Object[] objArr3 = new Object[2];
            objArr3[r8] = str6;
            objArr3[1] = strM23911;
            String str8 = String.format(str7, objArr3);
            if (!z3) {
                if (length2 <= 0) {
                    c22180.m48006(c22180.m48011(i, str8));
                    return;
                }
                c22180.m48006(c22180.m48011(i, String.format(c22180.f71461, str6, "[ " + ((String) ((List) c18941M50175.f61429).get(0)).concat(","))));
                int i7 = 1;
                while (i7 <= length2) {
                    c22180.m48006(c22180.m48011(i3 - 2, C14442.m34865(" ", (String) ((List) c18941M50175.f61429).get(i7), i7 == length2 ? "; ] {" : ",")));
                    i7++;
                }
                return;
            }
            if (z2) {
                c22180.m48006(c22180.m48011(i, str8));
                return;
            }
            if (length2 <= 0) {
                c22180.m48009(c22180.m47996(i3, c22180.m48011(i, str8)));
                c22180.m48006(iArr3.length == 0 ? str : C25272.m56409(" // ", strConcat2));
                return;
            }
            String strM47996 = c22180.m47996(i3, c22180.m48011(i, String.format(c22180.f71461, str6, "[ " + ((String) ((List) c18941M50175.f61428).get(0)).concat(","))));
            int iIndexOf = strM47996.indexOf(91) - ((c22180.f71470 + 1) * 2);
            c22180.f67151.mo3879(strM47996);
            c22180.m48006(" // " + ((String) ((List) c18941M50175.f61429).get(0)));
            int i8 = 1;
            while (i8 <= length2) {
                String str9 = i8 == length2 ? "; ]  {" : ",";
                String str10 = (String) ((List) c18941M50175.f61428).get(i8);
                String str11 = (String) ((List) c18941M50175.f61429).get(i8);
                c22180.f67151.mo3879(c22180.m47996(i3, c22180.m48011(iIndexOf, str10.concat(str9))));
                c22180.m48006(" // " + str11);
                i8++;
            }
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        mo11099(i, i2);
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo19009() {
        return this.f67155;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11099(int i, int i2) {
        m48012(1);
        if (i == 0) {
            m48013(this.f71472);
        }
        this.f71466.mo15250(Integer.valueOf(i), Integer.valueOf(i2));
        m48008(1);
    }

    public C22180(C0970 c0970, DataInputStream dataInputStream) {
        super(c0970);
        this.f71473 = false;
        this.f71470 = 0;
        this.f71460 = m48000() * 2;
        this.f71459 = m48000() * 3;
        this.f71462 = "";
        this.f71461 = "";
        this.f71472 = "";
        EnumC13127 enumC13127 = EnumC13127.f41972;
        this.f71464 = enumC13127;
        this.f6365 = enumC13127.m32610();
        this.f67131 = EnumC10882.STACK_MAP;
        this.f71466 = new InterfaceC5026() { // from class: l.᩶᩻᩺
            @Override // l.InterfaceC5026
            /* JADX INFO: renamed from: ۙ */
            public final void mo15250(Integer num, Integer num2) {
                C22180.m50173(this.f69199);
            }
        };
        EnumC16110 enumC16110 = EnumC16110.FULL_FRAME;
        this.f71458 = enumC16110;
        this.f71469 = enumC16110.m38275();
        this.f71457 = dataInputStream.readUnsignedShort();
        this.f71467 = m50172(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f71463 = m50172(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f6369.m32299(new Supplier() { // from class: l.ܿ᩻᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                C22180 c22180 = this.f60774;
                return String.format(" stack_map_entry:pc=%d numloc=%s  numstack=%s", Integer.valueOf(c22180.f71457), C8499.m22814(c22180.f71467), C8499.m22814(c22180.f71463));
            }
        });
    }

    public C22180(boolean z, int i, C0970 c0970, DataInputStream dataInputStream) throws IOException {
        super(c0970);
        this.f71473 = false;
        this.f71470 = 0;
        this.f71460 = m48000() * 2;
        this.f71459 = m48000() * 3;
        this.f71462 = "";
        this.f71461 = "";
        this.f71472 = "";
        EnumC13127 enumC13127 = EnumC13127.f41967;
        this.f71464 = enumC13127;
        this.f6365 = enumC13127.m32610();
        this.f67131 = EnumC10882.STACK_MAP_TABLE;
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.f71469 = unsignedByte;
        EnumC16110 enumC16110M38271 = EnumC16110.m38271(unsignedByte);
        this.f71458 = enumC16110M38271;
        this.f71466 = new C22200(this);
        switch (C14216.f44936[enumC16110M38271.ordinal()]) {
            case 1:
                this.f71468 = -1;
                int unsignedShort = dataInputStream.readUnsignedShort();
                int[] iArr = new int[unsignedShort];
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    iArr[i2] = dataInputStream.readUnsignedShort();
                }
                this.f71465 = iArr;
                this.f6369.m32299(new Supplier() { // from class: l.۟᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" early_larval_frame=%d", Integer.valueOf(this.f27135.f71469));
                    }
                });
                break;
            case 2:
                this.f71468 = unsignedByte;
                this.f6369.m32299(new Supplier() { // from class: l.ᩳ᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" same_frame=%d", Integer.valueOf(this.f62813.f71469));
                    }
                });
                break;
            case 3:
                this.f71468 = dataInputStream.readUnsignedShort();
                this.f6369.m32299(new Supplier() { // from class: l.ۢ᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C22180 c22180 = this.f33380;
                        return String.format(" same_frame_extended=%d, offset=%d", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468));
                    }
                });
                break;
            case 4:
                this.f71468 = unsignedByte - 64;
                this.f71463 = m50172(1, dataInputStream);
                this.f6369.m32299(new Supplier() { // from class: l.֨᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C22180 c22180 = this.f5342;
                        return String.format(" same_locals_1_stack_item_frame=%d, offset=%d, numstack=%s", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468), C8499.m22814(c22180.f71463));
                    }
                });
                break;
            case 5:
                this.f71468 = dataInputStream.readUnsignedShort();
                this.f71463 = m50172(1, dataInputStream);
                this.f6369.m32299(new Supplier() { // from class: l.ۡ᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C22180 c22180 = this.f31424;
                        return String.format(" same_locals_1_stack_item_frame_extended=%d, offset=%d, numstack=%s", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468), C8499.m22814(c22180.f71463));
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
                this.f71468 = dataInputStream.readUnsignedShort();
                this.f6369.m32299(new Supplier() { // from class: l.ۖ᩻᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C22180 c22180 = this.f9822;
                        return String.format(" chop_frame=%d offset=%d", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468));
                    }
                });
                break;
            case 9:
                this.f71468 = dataInputStream.readUnsignedShort();
                this.f71467 = m50172(unsignedByte - 251, dataInputStream);
                this.f6369.m32299(new C8996(this, 0));
                break;
            case 10:
                this.f71468 = dataInputStream.readUnsignedShort();
                this.f71467 = m50172(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f71463 = m50172(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f6369.m32299(new C7505(this, 0));
                break;
            default:
                this.f6369.m32299(new C14962());
                break;
        }
        if (i <= 0 && z) {
            this.f71457 = this.f71468;
        } else {
            this.f71457 = i + this.f71468 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18941 m50175(int[] iArr) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        for (int i : iArr) {
            if (((C0970) this.f6363).f67132) {
                arrayList.add(String.format("#%d", Integer.valueOf(i)));
            }
            arrayList2.add(((C0970) this.f6363).f6371.m5642(i));
        }
        return new C18941(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18941 m50174(String str, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new C18941("", "");
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
            EnumC23570 enumC23570M11195 = C3432.m11195(i3, C15867.of(new InterfaceC0296() { // from class: l.ۘ᩻᩺
                @Override // l.InterfaceC0296
                /* JADX INFO: renamed from: ۙ */
                public final void mo1876(Object[] objArr) {
                    this.f16108.f6369.mo4160("Unknown StackMapTable verification type {0}", objArr);
                }
            }));
            String str2 = i == 0 ? "" : " ";
            int i4 = i2 >> 8;
            int i5 = C14216.f44937[enumC23570M11195.ordinal()];
            if (i5 == 1) {
                if (((C0970) this.f6363).f67132) {
                    sb.append(str2);
                    sb.append("#");
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(((C0970) this.f6363).f6371.m5630(i4));
            } else if (i5 == 2) {
                if (((C0970) this.f6363).f67132) {
                    sb.append(str2);
                    sb.append(i3);
                    sb.append(" ");
                    sb.append(m47988());
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(enumC23570M11195.m52768());
                sb2.append(" ");
                sb2.append(m47988());
                sb2.append(i4);
            } else {
                if (((C0970) this.f6363).f67132) {
                    sb.append(str2);
                    sb.append(i3);
                }
                sb2.append(str2);
                sb2.append(enumC23570M11195.m52768());
            }
            if (((C0970) this.f6363).f67132) {
                sb.append(i == length ? ';' : ',');
            }
            sb2.append(i == length ? ';' : ',');
            if (i == length) {
                sb.append(str);
                sb2.append(str);
            }
            i++;
        }
        return new C18941(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m50178() {
        return this.f71464 == EnumC13127.f41967;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50176(int i, String str, String str2) {
        this.f71462 = str;
        this.f71461 = str2;
        this.f71471 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m50177(String str) {
        this.f71472 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m50172(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            int i3 = C14216.f44937[C3432.m11195(unsignedByte, C15867.of(new InterfaceC0296() { // from class: l.֡᩻᩺
                @Override // l.InterfaceC0296
                /* JADX INFO: renamed from: ۙ */
                public final void mo1876(Object[] objArr) {
                    this.f2835.f6369.mo4160("Unknown StackMapTable verification type {0}", objArr);
                }
            })).ordinal()];
            if (i3 == 1) {
                unsignedShort = dataInputStream.readUnsignedShort();
            } else {
                if (i3 == 2) {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    ((C0970) this.f6363).m3853(unsignedShort).f24959 = true;
                }
                iArr[i2] = unsignedByte;
            }
            unsignedByte |= unsignedShort << 8;
            iArr[i2] = unsignedByte;
        }
        return iArr;
    }
}
