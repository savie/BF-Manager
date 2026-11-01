package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07FG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2922 extends C4561 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f10983;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f10984;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int f10985;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f10986;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC20934 enumC20934 = EnumC20934.f68130;
        sb.append(enumC20934.m47084());
        EnumC20934 enumC20935 = EnumC20934.f68052;
        sb.append(enumC20935.m47084());
        EnumC20934 enumC20936 = EnumC20934.f68232;
        sb.append(enumC20936.m47084());
        EnumC20934 enumC20937 = EnumC20934.f68112;
        sb.append(enumC20937.m47084());
        sb.append(EnumC20934.f68103.m47084());
        String string = sb.toString();
        f10984 = string;
        String str = enumC20934.m47084() + enumC20935.m47084() + enumC20936.m47084() + enumC20937.m47084() + EnumC20934.f68121.m47084();
        f10986 = str;
        f10985 = string.length();
        f10983 = str.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m8748(boolean z) {
        short s;
        short s2;
        short s3;
        C15187 c15187M31655;
        String str = z ? "LocalVariableTypeTable" : "LocalVariableTable";
        String strM47084 = (z ? EnumC20934.f68121 : EnumC20934.f68103).m47084();
        String str2 = z ? f10986 : f10984;
        int i = z ? f10983 : f10985;
        ArrayList arrayList = new ArrayList();
        this.f16199.m31840();
        C12842 c12842 = this.f16199;
        if (c12842.f42721 == EnumC20934.f68046) {
            c12842.m31840();
        }
        String str3 = "";
        C15187 c15187 = null;
        short s4 = -1;
        short s5 = -1;
        short s6 = -1;
        while (true) {
            EnumC20934 enumC20934 = this.f16199.f42721;
            if (enumC20934 != EnumC20934.f68179 && enumC20934 != EnumC20934.f68195) {
                switch (C9274.f31532[enumC20934.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        short s7 = s6;
                        short s8 = s5;
                        short s9 = s4;
                        if (str3.length() != i && !str3.contains(this.f16199.f42724)) {
                            StringBuilder sbM23356 = C9023.m23356(str3);
                            sbM23356.append(this.f16199.f42724);
                            String string = sbM23356.toString();
                            if (!str2.startsWith(string)) {
                                this.f16198.m42172(this.f16199.f42728, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM47084);
                                throw null;
                            }
                            s6 = s7;
                            str3 = string;
                            s5 = s8;
                            s4 = s9;
                            this.f16199.m31840();
                        }
                        break;
                    case 7:
                        short s10 = s4;
                        short s11 = s5;
                        short s12 = s6;
                        if (str3.length() != i) {
                            this.f16198.m42172(this.f16199.f42728, "The table header is expected: \"Start Length Slot Name {0}\"", strM47084);
                            throw null;
                        }
                        if (s12 == -1) {
                            s6 = (short) this.f16199.f42726;
                            s4 = s10;
                            s5 = s11;
                        } else if (s11 == -1) {
                            s6 = s12;
                            s5 = (short) this.f16199.f42726;
                            s4 = s10;
                        } else {
                            if (s10 != -1) {
                                if (c15187 != null) {
                                    this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str, C16523.m38890("\"", strM47084, "\""));
                                    throw null;
                                }
                                this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str, C16236.m38348(EnumC20934.f68112, new StringBuilder("\""), "\""));
                                throw null;
                            }
                            s6 = s12;
                            s5 = s11;
                            s4 = (short) this.f16199.f42726;
                        }
                        this.f16199.m31840();
                        break;
                        break;
                    case 8:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m8747(str3, i, str, strM47084, s3, s5, s);
                        String str4 = this.f16199.f42724;
                        if (c15187 != null) {
                            arrayList.add(new C12468(s3, s2, s, c15187, this.f16200.f47348.m31655(str4)));
                            c15187 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f16199.m31840();
                        } else {
                            c15187M31655 = this.f16200.f47348.m31655(str4);
                            c15187 = c15187M31655;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f16199.m31840();
                        }
                        break;
                    case 9:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m8747(str3, i, str, strM47084, s6, s5, s);
                        String str5 = this.f16199.f42724;
                        if (c15187 != null) {
                            arrayList.add(new C12468(s3, s2, s, c15187, this.f16200.f47348.m31655(str5)));
                            c15187 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f16199.m31840();
                        } else {
                            c15187M31655 = this.f16200.f47348.m31655(str5);
                            c15187 = c15187M31655;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f16199.m31840();
                        }
                        break;
                    default:
                        short s13 = s6;
                        short s14 = s5;
                        short s15 = s4;
                        if (str3.length() != i) {
                            this.f16198.m42172(this.f16199.f42728, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM47084);
                            throw null;
                        }
                        if (s15 != -1 || s13 != -1 || s14 != -1 || c15187 != null) {
                            this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str, " either the line {start_pc length slot \"name\" \"descriptor\"} or {start_pc length slot name_index descriptor_index}");
                            throw null;
                        }
                        break;
                }
            }
            return arrayList;
        }
        this.f16198.m42172(this.f16199.f42728, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM47084);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8747(String str, int i, String str2, String str3, short s, short s2, short s3) {
        if (str.length() != i) {
            this.f16198.m42172(this.f16199.f42728, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", str3);
            throw null;
        }
        if (s == -1) {
            this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str2, "\"start_pc\"");
            throw null;
        }
        if (s2 == -1) {
            this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str2, "\"length\"");
            throw null;
        }
        if (s3 != -1) {
            return;
        }
        this.f16198.m42172(this.f16199.f42728, "The {0} format is incorrect; {1} is expected", str2, "\"slot\"");
        throw null;
    }
}
