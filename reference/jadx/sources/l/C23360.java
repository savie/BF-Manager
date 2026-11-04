package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBEY */
/* JADX INFO: loaded from: classes.dex */
public final class C23360 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9867 m52527(C5460 c5460, C18312 c18312, C15900 c15900, C16646 c16646, C10918 c10918) {
        try {
            return m52528(c5460, c18312, c15900, c16646, c10918);
        } catch (RuntimeException e) {
            throw C3880.m12507("...while processing " + c18312.m42706(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02d0 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02dd A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02eb A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0304 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0306 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0309 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0310 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0315 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0327 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x018a A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0251 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0260 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0278 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x027d A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0281 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0290 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0293 A[Catch: RuntimeException -> 0x0341, TryCatch #2 {RuntimeException -> 0x0341, blocks: (B:72:0x0221, B:74:0x0251, B:75:0x025c, B:77:0x0260, B:78:0x0264, B:81:0x0272, B:83:0x0278, B:85:0x027d, B:87:0x0281, B:88:0x0284, B:90:0x0290, B:92:0x0297, B:94:0x02a6, B:99:0x02b5, B:101:0x02bc, B:103:0x02d0, B:105:0x02d7, B:107:0x02dd, B:108:0x02e5, B:110:0x02eb, B:111:0x02ee, B:114:0x0306, B:119:0x0321, B:121:0x0327, B:122:0x032a, B:115:0x0309, B:117:0x0310, B:118:0x0315, B:104:0x02d3, B:100:0x02b9, B:91:0x0293, B:69:0x0186, B:71:0x018a, B:79:0x026b), top: B:173:0x0221 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9867 m52528(C5460 c5460, C18312 c18312, C15900 c15900, C16646 c16646, C10918 c10918) {
        String str;
        String str2;
        C18377 c18377;
        C11664 c11664;
        C14647 c14647;
        String str3;
        String str4;
        C9845 c9845;
        InterfaceC11050 interfaceC11050M25639;
        C13156 c13156;
        C14011 c14011M40853;
        C9845 c9846;
        InterfaceC11050 interfaceC11050M256310;
        C22283 c22283;
        C13574 c13574;
        C4538 c4538M14269;
        C9757 c9757M39722;
        int iM33501;
        C3222 c3222 = c5460.f19057;
        c15900.getClass();
        c3222.m10571();
        C9867 c9867 = new C9867(c18312.m42710(), c18312.m42701() & (-33), c18312.m42709(), c18312.m42703(), c18312.m42714());
        C14011 c14011M40854 = C17392.m40854(c18312, c15900);
        if (c14011M40854.size() != 0) {
            c9867.m25677(c14011M40854, c10918);
        }
        C11664 c11664M27705 = c10918.m27705();
        C18377 c18377M27707 = c10918.m27707();
        C14647 c14647M27715 = c10918.m27715();
        C18072 c18072M27711 = c10918.m27711();
        C1028 c1028M42710 = c18312.m42710();
        C21868 c21868M42707 = c18312.m42707();
        int size = c21868M42707.size();
        int i = 0;
        while (true) {
            str = " ";
            str2 = "...while processing ";
            if (i >= size) {
                break;
            }
            InterfaceC9361 interfaceC9361M31613get = c21868M42707.m31613get(i);
            C21868 c21868 = c21868M42707;
            try {
                int i2 = size;
                C16689 c16689 = new C16689(c1028M42710, interfaceC9361M31613get.mo8780());
                int iMo8783 = interfaceC9361M31613get.mo8783();
                if ((iMo8783 & 8) != 0) {
                    AbstractC2519 abstractC2519Mo14607 = interfaceC9361M31613get.mo14607();
                    C19869 c19869 = new C19869(c16689, iMo8783);
                    if (abstractC2519Mo14607 != null) {
                        abstractC2519Mo14607 = m52526(abstractC2519Mo14607, c16689.getType());
                    }
                    c9867.m25682(c19869, abstractC2519Mo14607);
                } else {
                    c9867.m25681(new C19869(c16689, iMo8783));
                }
                C14011 c14011M40855 = C17392.m40853(interfaceC9361M31613get.getAttributes());
                if (c14011M40855.size() != 0) {
                    c9867.m25678(c16689, c14011M40855, c10918);
                }
                c10918.m27705().m29339(c16689);
                i++;
                c21868M42707 = c21868;
                size = i2;
                c1028M42710 = c1028M42710;
                c18072M27711 = c18072M27711;
            } catch (RuntimeException e) {
                throw C3880.m12507("...while processing " + interfaceC9361M31613get.getName().mo1843() + " " + interfaceC9361M31613get.mo8781().mo1843(), e);
            }
        }
        C18072 c18072 = c18072M27711;
        C1028 c1028M42711 = c18312.m42710();
        C19630 c19630M42705 = c18312.m42705();
        int size2 = c19630M42705.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = size2;
            InterfaceC8616 interfaceC8616M31612get = c19630M42705.m31612get(i3);
            C14647 c14648 = c14647M27715;
            try {
                C18181 c18181 = new C18181(c1028M42711, interfaceC8616M31612get.mo8780());
                C11664 c11665 = c11664M27705;
                int iMo8784 = interfaceC8616M31612get.mo8783();
                boolean z = (iMo8784 & 8) != 0;
                boolean z2 = (iMo8784 & 2) != 0;
                boolean z3 = (iMo8784 & 256) != 0;
                boolean z4 = (iMo8784 & 1024) != 0;
                boolean z5 = c18181.m34885().m1844() || c18181.m34885().m1847();
                Object objM12175 = null;
                if (z3 || z4) {
                    i3 = i3;
                    str3 = str;
                    str4 = str2;
                } else {
                    try {
                        str3 = str;
                        try {
                            try {
                                str4 = str2;
                                try {
                                    c9757M39722 = C16820.m39722(new C19299(interfaceC8616M31612get, c18312, c15900.f51665), c19630M42705, c16646);
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    if (c15900.f51666) {
                                        throw e;
                                    }
                                    C0318 c0318 = new C0318(c18312.m42701());
                                    c0318.mo2001(196653, c18312.m42701(), c18312.m42710().m3933().m15373(), null, "java/lang/Object", null);
                                    AbstractC15037 abstractC15037Mo1999 = c0318.mo1999(interfaceC8616M31612get.mo8783(), interfaceC8616M31612get.getName().getString(), interfaceC8616M31612get.mo8781().getString(), (String) null, (String[]) null);
                                    abstractC15037Mo1999.mo10808(187, "java/lang/RuntimeException");
                                    abstractC15037Mo1999.mo10787(89);
                                    abstractC15037Mo1999.mo10795("Couldn't be decompiled.");
                                    abstractC15037Mo1999.mo10792(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                    abstractC15037Mo1999.mo10787(191);
                                    abstractC15037Mo1999.mo10807(2, 2);
                                    C18312 c18313 = new C18312(c18312.m42706(), false, c0318.m2010());
                                    c18313.m42708();
                                    c18313.m42700();
                                    c9757M39722 = C16820.m39722(new C19299(c18313.m42705().m31612get(0), c18313, c15900.f51665), c19630M42705, c16646);
                                    e = e;
                                    throw C3880.m12507(str4 + interfaceC8616M31612get.getName().mo1843() + str3 + interfaceC8616M31612get.mo8781().mo1843(), e);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                str4 = str2;
                                if (c15900.f51666) {
                                    throw e;
                                }
                                C0318 c0319 = new C0318(c18312.m42701());
                                c0319.mo2001(196653, c18312.m42701(), c18312.m42710().m3933().m15373(), null, "java/lang/Object", null);
                                AbstractC15037 abstractC15037Mo19910 = c0319.mo1999(interfaceC8616M31612get.mo8783(), interfaceC8616M31612get.getName().getString(), interfaceC8616M31612get.mo8781().getString(), (String) null, (String[]) null);
                                abstractC15037Mo19910.mo10808(187, "java/lang/RuntimeException");
                                abstractC15037Mo19910.mo10787(89);
                                abstractC15037Mo19910.mo10795("Couldn't be decompiled.");
                                abstractC15037Mo19910.mo10792(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                abstractC15037Mo19910.mo10787(191);
                                abstractC15037Mo19910.mo10807(2, 2);
                                C18312 c18314 = new C18312(c18312.m42706(), false, c0319.m2010());
                                c18314.m42708();
                                c18314.m42700();
                                c9757M39722 = C16820.m39722(new C19299(c18314.m42705().m31612get(0), c18314, c15900.f51665), c19630M42705, c16646);
                                iM33501 = c18181.m51052(z).m19309().m33501();
                                StringBuilder sb = new StringBuilder();
                                sb.append(c1028M42711.m3933().m15375());
                                sb.append(".");
                                sb.append(interfaceC8616M31612get.getName().getString());
                                if (c15900.f51668) {
                                    c5460.f19057.getClass();
                                    c9757M39722 = C2847.m9354(c9757M39722, iM33501, c15900.f51665);
                                }
                                objM12175 = C3747.m12175(c9757M39722, c15900.f51665 ? C20200.m46457(c9757M39722) : null, iM33501, c16646);
                                C7697 c7697 = objM12175;
                                if ((iMo8784 & 32) != 0) {
                                    iMo8784 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                    if (!z3) {
                                        iMo8784 &= -33;
                                    }
                                }
                                if (z5) {
                                    iMo8784 |= 65536;
                                }
                                c9845 = (C9845) interfaceC8616M31612get.getAttributes().m33788("Exceptions");
                                if (c9845 == null) {
                                    interfaceC11050M25639 = C13705.f43487;
                                } else {
                                    interfaceC11050M25639 = c9845.m25639();
                                }
                                c13156 = new C13156(c18181, iMo8784, c7697, interfaceC11050M25639);
                                if (!c18181.m34885().m1844()) {
                                    c9867.m25676(c13156);
                                } else {
                                    c9867.m25676(c13156);
                                }
                                c14011M40853 = C17392.m40853(interfaceC8616M31612get.getAttributes());
                                c9846 = (C9845) interfaceC8616M31612get.getAttributes().m33788("Exceptions");
                                if (c9846 == null) {
                                    interfaceC11050M256310 = C13705.f43487;
                                } else {
                                    interfaceC11050M256310 = c9846.m25639();
                                }
                                if (interfaceC11050M256310.size() != 0) {
                                    c14011M40853 = C14011.m34102(c14011M40853, C3902.m12551(interfaceC11050M256310));
                                }
                                if (c14011M40853.size() != 0) {
                                    c9867.m25680(c18181, c14011M40853, c10918);
                                }
                                C13836 attributes = interfaceC8616M31612get.getAttributes();
                                c22283 = (C22283) attributes.m33788("RuntimeVisibleParameterAnnotations");
                                c13574 = (C13574) attributes.m33788("RuntimeInvisibleParameterAnnotations");
                                if (c22283 == null) {
                                    if (c13574 == null) {
                                        c4538M14269 = C4538.f16134;
                                    } else {
                                        c4538M14269 = c13574.m29684();
                                    }
                                } else if (c13574 == null) {
                                    c4538M14269 = c22283.m29684();
                                } else {
                                    c4538M14269 = C4538.m14269(c22283.m29684(), c13574.m29684());
                                }
                                if (c4538M14269.size() != 0) {
                                    c9867.m25679(c18181, c4538M14269, c10918);
                                }
                                c10918.m27707().m42875(c18181);
                                i3++;
                                size2 = i4;
                                c14647M27715 = c14648;
                                c11664M27705 = c11665;
                                c18377M27707 = c18377M27707;
                                str = str3;
                                str2 = str4;
                                e = e;
                                throw C3880.m12507(str4 + interfaceC8616M31612get.getName().mo1843() + str3 + interfaceC8616M31612get.mo8781().mo1843(), e);
                            }
                            iM33501 = c18181.m51052(z).m19309().m33501();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c1028M42711.m3933().m15375());
                            sb2.append(".");
                            sb2.append(interfaceC8616M31612get.getName().getString());
                            if (c15900.f51668) {
                                c5460.f19057.getClass();
                                c9757M39722 = C2847.m9354(c9757M39722, iM33501, c15900.f51665);
                            }
                            objM12175 = C3747.m12175(c9757M39722, c15900.f51665 ? C20200.m46457(c9757M39722) : null, iM33501, c16646);
                        } catch (RuntimeException e4) {
                            e = e4;
                            throw C3880.m12507(str4 + interfaceC8616M31612get.getName().mo1843() + str3 + interfaceC8616M31612get.mo8781().mo1843(), e);
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                        str3 = str;
                    }
                }
                C7697 c7698 = objM12175;
                if ((iMo8784 & 32) != 0) {
                    iMo8784 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    if (!z3) {
                        iMo8784 &= -33;
                    }
                }
                if (z5) {
                    iMo8784 |= 65536;
                }
                c9845 = (C9845) interfaceC8616M31612get.getAttributes().m33788("Exceptions");
                if (c9845 == null) {
                    interfaceC11050M25639 = C13705.f43487;
                } else {
                    interfaceC11050M25639 = c9845.m25639();
                }
                c13156 = new C13156(c18181, iMo8784, c7698, interfaceC11050M25639);
                if (!c18181.m34885().m1844() || c18181.m34885().m1847() || z || z2) {
                    c9867.m25676(c13156);
                } else {
                    c9867.m25685(c13156);
                }
                c14011M40853 = C17392.m40853(interfaceC8616M31612get.getAttributes());
                c9846 = (C9845) interfaceC8616M31612get.getAttributes().m33788("Exceptions");
                if (c9846 == null) {
                    interfaceC11050M256310 = C13705.f43487;
                } else {
                    interfaceC11050M256310 = c9846.m25639();
                }
                if (interfaceC11050M256310.size() != 0) {
                    c14011M40853 = C14011.m34102(c14011M40853, C3902.m12551(interfaceC11050M256310));
                }
                if (c14011M40853.size() != 0) {
                    c9867.m25680(c18181, c14011M40853, c10918);
                }
                C13836 attributes2 = interfaceC8616M31612get.getAttributes();
                c22283 = (C22283) attributes2.m33788("RuntimeVisibleParameterAnnotations");
                c13574 = (C13574) attributes2.m33788("RuntimeInvisibleParameterAnnotations");
                if (c22283 == null) {
                    if (c13574 == null) {
                        c4538M14269 = C4538.f16134;
                    } else {
                        c4538M14269 = c13574.m29684();
                    }
                } else if (c13574 == null) {
                    c4538M14269 = c22283.m29684();
                } else {
                    c4538M14269 = C4538.m14269(c22283.m29684(), c13574.m29684());
                }
                if (c4538M14269.size() != 0) {
                    c9867.m25679(c18181, c4538M14269, c10918);
                }
                c10918.m27707().m42875(c18181);
                i3++;
                size2 = i4;
                c14647M27715 = c14648;
                c11664M27705 = c11665;
                c18377M27707 = c18377M27707;
                str = str3;
                str2 = str4;
            } catch (RuntimeException e6) {
                e = e6;
                str3 = str;
                str4 = str2;
            }
        }
        C11664 c11666 = c11664M27705;
        C18377 c18378 = c18377M27707;
        C14647 c14649 = c14647M27715;
        C9230 c9230M42711 = c18312.m42711();
        int size3 = c9230M42711.size();
        int i5 = 0;
        while (i5 < size3) {
            AbstractC13487 abstractC13487M24414 = c9230M42711.m24414(i5);
            if (abstractC13487M24414 instanceof C18181) {
                c18377 = c18378;
                c18377.m42875((AbstractC22657) abstractC13487M24414);
            } else {
                c18377 = c18378;
                if (abstractC13487M24414 instanceof C23403) {
                    c18377.m42875(((C23403) abstractC13487M24414).m52587());
                } else {
                    if (abstractC13487M24414 instanceof C16689) {
                        c11664 = c11666;
                        c11664.m29339((C16689) abstractC13487M24414);
                    } else {
                        c11664 = c11666;
                        if (abstractC13487M24414 instanceof C24895) {
                            c11664.m29339(((C24895) abstractC13487M24414).m55427());
                        } else if (abstractC13487M24414 instanceof C21165) {
                            c14647 = c14649;
                            c14647.m35279((C21165) abstractC13487M24414);
                        } else {
                            c14647 = c14649;
                            if (abstractC13487M24414 instanceof C3265) {
                                C3265 c3265 = (C3265) abstractC13487M24414;
                                C3637 c3637 = c18312.m42704().get(c3265.m10667());
                                C21165 c21165M11784 = c3637.m11784();
                                C0282 c0282M10664 = c3265.m10664();
                                C23775 c23775M11783 = c3637.m11783();
                                if (c21165M11784 == null) {
                                    throw new NullPointerException("bootstrapMethodHandle == null");
                                }
                                if (c0282M10664 == null) {
                                    throw new NullPointerException("nat == null");
                                }
                                C21911 c21911 = new C21911(c23775M11783.size() + 3);
                                c21911.mo31602(0, (AbstractC13487) c21165M11784);
                                c21911.mo31602(1, (AbstractC13487) c0282M10664.getName());
                                c21911.mo31602(2, (AbstractC13487) new C7740(C6994.m19303(c0282M10664.m1846().getString())));
                                for (int i6 = 0; i6 < c23775M11783.size(); i6++) {
                                    c21911.mo31602(i6 + 3, c23775M11783.m31615get(i6));
                                }
                                c21911.mo15005();
                                C12960 c12960 = new C12960(c21911);
                                c3265.m10660(c18312.m42710());
                                c3265.m10661(c12960);
                                Iterator it = c3265.m10668().iterator();
                                while (it.hasNext()) {
                                    c18072.m42107((C5503) it.next());
                                }
                            }
                        }
                    }
                    c14647 = c14649;
                }
                i5++;
                c18378 = c18377;
                c11666 = c11664;
                c14649 = c14647;
                c18072 = c18072;
            }
            c14647 = c14649;
            c11664 = c11666;
            i5++;
            c18378 = c18377;
            c11666 = c11664;
            c14649 = c14647;
            c18072 = c18072;
        }
        return c9867;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2519 m52526(AbstractC2519 abstractC2519, C5085 c5085) {
        if (abstractC2519.getType().equals(c5085)) {
            return abstractC2519;
        }
        int iMo8408 = c5085.mo8408();
        if (iMo8408 == 1) {
            return C19673.m45339(((C15943) abstractC2519).mo17877());
        }
        if (iMo8408 == 2) {
            return C15197.m36548(((C15943) abstractC2519).mo17877());
        }
        if (iMo8408 == 3) {
            return C1774.m6229(((C15943) abstractC2519).mo17877());
        }
        if (iMo8408 == 8) {
            return C18927.m43944(((C15943) abstractC2519).mo17877());
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC2519 + " to " + c5085);
    }
}
