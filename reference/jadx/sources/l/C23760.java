package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07FG */
/* JADX INFO: loaded from: classes.dex */
public final class C23760 extends C3622 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f76993;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f76994;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f76995;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f76996;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC5202 enumC5202 = EnumC5202.f18234;
        sb.append(enumC5202.m15637());
        EnumC5202 enumC5203 = EnumC5202.f18258;
        sb.append(enumC5203.m15637());
        EnumC5202 enumC5204 = EnumC5202.f18222;
        sb.append(enumC5204.m15637());
        EnumC5202 enumC5205 = EnumC5202.f18197;
        sb.append(enumC5205.m15637());
        sb.append(EnumC5202.f18248.m15637());
        String string = sb.toString();
        f76996 = string;
        String str = enumC5202.m15637() + enumC5203.m15637() + enumC5204.m15637() + enumC5205.m15637() + EnumC5202.f18151.m15637();
        f76994 = str;
        f76995 = string.length();
        f76993 = str.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m53044(boolean z) {
        short s;
        short s2;
        short s3;
        C7660 c7660M36704;
        String str = z ? "LocalVariableTypeTable" : "LocalVariableTable";
        String strM15637 = (z ? EnumC5202.f18151 : EnumC5202.f18248).m15637();
        String str2 = z ? f76994 : f76996;
        int i = z ? f76993 : f76995;
        ArrayList arrayList = new ArrayList();
        this.f12427.m21671();
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18334) {
            c7965.m21671();
        }
        String str3 = "";
        C7660 c7660 = null;
        short s4 = -1;
        short s5 = -1;
        short s6 = -1;
        while (true) {
            EnumC5202 enumC5202 = this.f12427.f26465;
            if (enumC5202 != EnumC5202.f18303 && enumC5202 != EnumC5202.f18314) {
                switch (C16300.f52915[enumC5202.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        short s7 = s6;
                        short s8 = s5;
                        short s9 = s4;
                        if (str3.length() != i && !str3.contains(this.f12427.f26453)) {
                            StringBuilder sbM27333 = C10732.m27333(str3);
                            sbM27333.append(this.f12427.f26453);
                            String string = sbM27333.toString();
                            if (!str2.startsWith(string)) {
                                this.f12426.m4162(this.f12427.f26464, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM15637);
                                throw null;
                            }
                            s6 = s7;
                            str3 = string;
                            s5 = s8;
                            s4 = s9;
                            this.f12427.m21671();
                        }
                        break;
                    case 7:
                        short s10 = s4;
                        short s11 = s5;
                        short s12 = s6;
                        if (str3.length() != i) {
                            this.f12426.m4162(this.f12427.f26464, "The table header is expected: \"Start Length Slot Name {0}\"", strM15637);
                            throw null;
                        }
                        if (s12 == -1) {
                            s6 = (short) this.f12427.f26459;
                            s4 = s10;
                            s5 = s11;
                        } else if (s11 == -1) {
                            s6 = s12;
                            s5 = (short) this.f12427.f26459;
                            s4 = s10;
                        } else {
                            if (s10 != -1) {
                                if (c7660 != null) {
                                    this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str, C14442.m34865("\"", strM15637, "\""));
                                    throw null;
                                }
                                this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str, C7376.m20248(EnumC5202.f18197, new StringBuilder("\""), "\""));
                                throw null;
                            }
                            s6 = s12;
                            s5 = s11;
                            s4 = (short) this.f12427.f26459;
                        }
                        this.f12427.m21671();
                        break;
                        break;
                    case 8:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m53043(str3, i, str, strM15637, s3, s5, s);
                        String str4 = this.f12427.f26453;
                        if (c7660 != null) {
                            arrayList.add(new C15642(s3, s2, s, c7660, this.f12428.f52487.m36704(str4)));
                            c7660 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f12427.m21671();
                        } else {
                            c7660M36704 = this.f12428.f52487.m36704(str4);
                            c7660 = c7660M36704;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f12427.m21671();
                        }
                        break;
                    case 9:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m53043(str3, i, str, strM15637, s6, s5, s);
                        String str5 = this.f12427.f26453;
                        if (c7660 != null) {
                            arrayList.add(new C15642(s3, s2, s, c7660, this.f12428.f52487.m36704(str5)));
                            c7660 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f12427.m21671();
                        } else {
                            c7660M36704 = this.f12428.f52487.m36704(str5);
                            c7660 = c7660M36704;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f12427.m21671();
                        }
                        break;
                    default:
                        short s13 = s6;
                        short s14 = s5;
                        short s15 = s4;
                        if (str3.length() != i) {
                            this.f12426.m4162(this.f12427.f26464, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM15637);
                            throw null;
                        }
                        if (s15 != -1 || s13 != -1 || s14 != -1 || c7660 != null) {
                            this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str, " either the line {start_pc length slot \"name\" \"descriptor\"} or {start_pc length slot name_index descriptor_index}");
                            throw null;
                        }
                        break;
                }
            }
            return arrayList;
        }
        this.f12426.m4162(this.f12427.f26464, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM15637);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53043(String str, int i, String str2, String str3, short s, short s2, short s3) {
        if (str.length() != i) {
            this.f12426.m4162(this.f12427.f26464, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", str3);
            throw null;
        }
        if (s == -1) {
            this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str2, "\"start_pc\"");
            throw null;
        }
        if (s2 == -1) {
            this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str2, "\"length\"");
            throw null;
        }
        if (s3 != -1) {
            return;
        }
        this.f12426.m4162(this.f12427.f26464, "The {0} format is incorrect; {1} is expected", str2, "\"slot\"");
        throw null;
    }
}
