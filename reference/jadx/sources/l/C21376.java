package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBEY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21376 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12081 m47914(C0914 c0914, C19883 c19883, C15027 c15027, C6559 c6559, C4669 c4669) {
        try {
            return m47916(c0914, c19883, c15027, c6559, c4669);
        } catch (RuntimeException e) {
            throw C7513.m20020("...while processing " + c19883.m45128(), e);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12081 m47916(C0914 c0914, C19883 c19883, C15027 c15027, C6559 c6559, C4669 c4669) {
        String str;
        String str2;
        C15960 c15960;
        C13137 c13137;
        C7492 c7492;
        String str3;
        String str4;
        C17391 c17391;
        InterfaceC14093 interfaceC14093M40510;
        C5375 c5375;
        C1661 c1661M50448;
        C17391 c17392;
        InterfaceC14093 interfaceC14093M40511;
        C4628 c4628;
        C9631 c9631;
        C9424 c9424M24182;
        C17661 c17661M50324;
        int iM24602;
        C17848 c17848 = c0914.f3663;
        c15027.getClass();
        c17848.m41436();
        C12081 c12081 = new C12081(c19883.m45140(), c19883.m45131() & (-33), c19883.m45138(), c19883.m45136(), c19883.m45142());
        C1661 c1661M50449 = C22788.m50449(c19883, c15027);
        if (c1661M50449.size() != 0) {
            c12081.m30057(c1661M50449, c4669);
        }
        C13137 c13137M12889 = c4669.m12889();
        C15960 c15960M12884 = c4669.m12884();
        C7492 c7492M12890 = c4669.m12890();
        C15609 c15609M12882 = c4669.m12882();
        C6143 c6143M45140 = c19883.m45140();
        C4442 c4442M45141 = c19883.m45141();
        int size = c4442M45141.size();
        int i = 0;
        while (true) {
            str = " ";
            str2 = "...while processing ";
            if (i >= size) {
                break;
            }
            InterfaceC10711 interfaceC10711M15270get = c4442M45141.m15270get(i);
            C4442 c4442 = c4442M45141;
            try {
                int i2 = size;
                C23077 c23077 = new C23077(c6143M45140, interfaceC10711M15270get.mo30825());
                int iMo30824 = interfaceC10711M15270get.mo30824();
                if ((iMo30824 & 8) != 0) {
                    AbstractC23783 abstractC23783Mo8777 = interfaceC10711M15270get.mo8777();
                    C11726 c11726 = new C11726(c23077, iMo30824);
                    if (abstractC23783Mo8777 != null) {
                        abstractC23783Mo8777 = m47915(abstractC23783Mo8777, c23077.getType());
                    }
                    c12081.m30060(c11726, abstractC23783Mo8777);
                } else {
                    c12081.m30059(new C11726(c23077, iMo30824));
                }
                C1661 c1661M504410 = C22788.m50448(interfaceC10711M15270get.getAttributes());
                if (c1661M504410.size() != 0) {
                    c12081.m30063(c23077, c1661M504410, c4669);
                }
                c4669.m12889().m32497(c23077);
                i++;
                c4442M45141 = c4442;
                size = i2;
                c6143M45140 = c6143M45140;
                c15609M12882 = c15609M12882;
            } catch (RuntimeException e) {
                throw C7513.m20020("...while processing " + interfaceC10711M15270get.getName().mo2376() + " " + interfaceC10711M15270get.mo30818().mo2376(), e);
            }
        }
        C15609 c15609 = c15609M12882;
        C6143 c6143M45141 = c19883.m45140();
        C2325 c2325M45134 = c19883.m45134();
        int size2 = c2325M45134.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = size2;
            InterfaceC14239 interfaceC14239M15273get = c2325M45134.m15273get(i3);
            C7492 c7493 = c7492M12890;
            try {
                C20255 c20255 = new C20255(c6143M45141, interfaceC14239M15273get.mo30825());
                C13137 c13138 = c13137M12889;
                int iMo30825 = interfaceC14239M15273get.mo30824();
                boolean z = (iMo30825 & 8) != 0;
                boolean z2 = (iMo30825 & 2) != 0;
                boolean z3 = (iMo30825 & 256) != 0;
                boolean z4 = (iMo30825 & 1024) != 0;
                boolean z5 = c20255.m47133().m2377() || c20255.m47133().m2382();
                Object objM42599 = null;
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
                                    c17661M50324 = C22705.m50324(new C12391(interfaceC14239M15273get, c19883, c15027.f48994), c2325M45134, c6559);
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    if (c15027.f48996) {
                                        throw e;
                                    }
                                    C12760 c12760 = new C12760(c19883.m45131());
                                    c12760.mo3285(196653, c19883.m45131(), c19883.m45140().m17128().m9840(), null, "java/lang/Object", null);
                                    AbstractC20521 abstractC20521Mo3283 = c12760.mo3283(interfaceC14239M15273get.mo30824(), interfaceC14239M15273get.getName().getString(), interfaceC14239M15273get.mo30818().getString(), (String) null, (String[]) null);
                                    abstractC20521Mo3283.mo33790(187, "java/lang/RuntimeException");
                                    abstractC20521Mo3283.mo35159(89);
                                    abstractC20521Mo3283.mo8457("Couldn't be decompiled.");
                                    abstractC20521Mo3283.mo33784(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                    abstractC20521Mo3283.mo35159(191);
                                    abstractC20521Mo3283.mo35170(2, 2);
                                    C19883 c19884 = new C19883(c19883.m45128(), false, c12760.m31713());
                                    c19884.m45139();
                                    c19884.m45130();
                                    c17661M50324 = C22705.m50324(new C12391(c19884.m45134().m15273get(0), c19884, c15027.f48994), c2325M45134, c6559);
                                    e = e;
                                    throw C7513.m20020(str4 + interfaceC14239M15273get.getName().mo2376() + str3 + interfaceC14239M15273get.mo30818().mo2376(), e);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                str4 = str2;
                                if (c15027.f48996) {
                                    throw e;
                                }
                                C12760 c12761 = new C12760(c19883.m45131());
                                c12761.mo3285(196653, c19883.m45131(), c19883.m45140().m17128().m9840(), null, "java/lang/Object", null);
                                AbstractC20521 abstractC20521Mo3284 = c12761.mo3283(interfaceC14239M15273get.mo30824(), interfaceC14239M15273get.getName().getString(), interfaceC14239M15273get.mo30818().getString(), (String) null, (String[]) null);
                                abstractC20521Mo3284.mo33790(187, "java/lang/RuntimeException");
                                abstractC20521Mo3284.mo35159(89);
                                abstractC20521Mo3284.mo8457("Couldn't be decompiled.");
                                abstractC20521Mo3284.mo33784(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
                                abstractC20521Mo3284.mo35159(191);
                                abstractC20521Mo3284.mo35170(2, 2);
                                C19883 c19885 = new C19883(c19883.m45128(), false, c12761.m31713());
                                c19885.m45139();
                                c19885.m45130();
                                c17661M50324 = C22705.m50324(new C12391(c19885.m45134().m15273get(0), c19885, c15027.f48994), c2325M45134, c6559);
                                iM24602 = c20255.m29453(z).m6222().m24602();
                                StringBuilder sb = new StringBuilder();
                                sb.append(c6143M45141.m17128().m9844());
                                sb.append(".");
                                sb.append(interfaceC14239M15273get.getName().getString());
                                if (c15027.f48997) {
                                    c0914.f3663.getClass();
                                    c17661M50324 = C23970.m52815(c17661M50324, iM24602, c15027.f48994);
                                }
                                objM42599 = C18346.m42599(c17661M50324, c15027.f48994 ? C8490.m22165(c17661M50324) : null, iM24602, c6559);
                                C0209 c0209 = objM42599;
                                if ((iMo30825 & 32) != 0) {
                                    iMo30825 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                    if (!z3) {
                                        iMo30825 &= -33;
                                    }
                                }
                                if (z5) {
                                    iMo30825 |= 65536;
                                }
                                c17391 = (C17391) interfaceC14239M15273get.getAttributes().m23873("Exceptions");
                                if (c17391 == null) {
                                    interfaceC14093M40510 = C9672.f32573;
                                } else {
                                    interfaceC14093M40510 = c17391.m40510();
                                }
                                c5375 = new C5375(c20255, iMo30825, c0209, interfaceC14093M40510);
                                if (!c20255.m47133().m2377()) {
                                    c12081.m30058(c5375);
                                } else {
                                    c12081.m30058(c5375);
                                }
                                c1661M50448 = C22788.m50448(interfaceC14239M15273get.getAttributes());
                                c17392 = (C17391) interfaceC14239M15273get.getAttributes().m23873("Exceptions");
                                if (c17392 == null) {
                                    interfaceC14093M40511 = C9672.f32573;
                                } else {
                                    interfaceC14093M40511 = c17392.m40510();
                                }
                                if (interfaceC14093M40511.size() != 0) {
                                    c1661M50448 = C1661.m5564(c1661M50448, C9964.m25233(interfaceC14093M40511));
                                }
                                if (c1661M50448.size() != 0) {
                                    c12081.m30061(c20255, c1661M50448, c4669);
                                }
                                C9300 attributes = interfaceC14239M15273get.getAttributes();
                                c4628 = (C4628) attributes.m23873("RuntimeVisibleParameterAnnotations");
                                c9631 = (C9631) attributes.m23873("RuntimeInvisibleParameterAnnotations");
                                if (c4628 == null) {
                                    if (c9631 == null) {
                                        c9424M24182 = C9424.f31928;
                                    } else {
                                        c9424M24182 = c9631.m11382();
                                    }
                                } else if (c9631 == null) {
                                    c9424M24182 = c4628.m11382();
                                } else {
                                    c9424M24182 = C9424.m24182(c4628.m11382(), c9631.m11382());
                                }
                                if (c9424M24182.size() != 0) {
                                    c12081.m30062(c20255, c9424M24182, c4669);
                                }
                                c4669.m12884().m37947(c20255);
                                i3++;
                                size2 = i4;
                                c7492M12890 = c7493;
                                c13137M12889 = c13138;
                                c15960M12884 = c15960M12884;
                                str = str3;
                                str2 = str4;
                                e = e;
                                throw C7513.m20020(str4 + interfaceC14239M15273get.getName().mo2376() + str3 + interfaceC14239M15273get.mo30818().mo2376(), e);
                            }
                            iM24602 = c20255.m29453(z).m6222().m24602();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c6143M45141.m17128().m9844());
                            sb2.append(".");
                            sb2.append(interfaceC14239M15273get.getName().getString());
                            if (c15027.f48997) {
                                c0914.f3663.getClass();
                                c17661M50324 = C23970.m52815(c17661M50324, iM24602, c15027.f48994);
                            }
                            objM42599 = C18346.m42599(c17661M50324, c15027.f48994 ? C8490.m22165(c17661M50324) : null, iM24602, c6559);
                        } catch (RuntimeException e4) {
                            e = e4;
                            throw C7513.m20020(str4 + interfaceC14239M15273get.getName().mo2376() + str3 + interfaceC14239M15273get.mo30818().mo2376(), e);
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                        str3 = str;
                    }
                }
                C0209 c02010 = objM42599;
                if ((iMo30825 & 32) != 0) {
                    iMo30825 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    if (!z3) {
                        iMo30825 &= -33;
                    }
                }
                if (z5) {
                    iMo30825 |= 65536;
                }
                c17391 = (C17391) interfaceC14239M15273get.getAttributes().m23873("Exceptions");
                if (c17391 == null) {
                    interfaceC14093M40510 = C9672.f32573;
                } else {
                    interfaceC14093M40510 = c17391.m40510();
                }
                c5375 = new C5375(c20255, iMo30825, c02010, interfaceC14093M40510);
                if (!c20255.m47133().m2377() || c20255.m47133().m2382() || z || z2) {
                    c12081.m30058(c5375);
                } else {
                    c12081.m30066(c5375);
                }
                c1661M50448 = C22788.m50448(interfaceC14239M15273get.getAttributes());
                c17392 = (C17391) interfaceC14239M15273get.getAttributes().m23873("Exceptions");
                if (c17392 == null) {
                    interfaceC14093M40511 = C9672.f32573;
                } else {
                    interfaceC14093M40511 = c17392.m40510();
                }
                if (interfaceC14093M40511.size() != 0) {
                    c1661M50448 = C1661.m5564(c1661M50448, C9964.m25233(interfaceC14093M40511));
                }
                if (c1661M50448.size() != 0) {
                    c12081.m30061(c20255, c1661M50448, c4669);
                }
                C9300 attributes2 = interfaceC14239M15273get.getAttributes();
                c4628 = (C4628) attributes2.m23873("RuntimeVisibleParameterAnnotations");
                c9631 = (C9631) attributes2.m23873("RuntimeInvisibleParameterAnnotations");
                if (c4628 == null) {
                    if (c9631 == null) {
                        c9424M24182 = C9424.f31928;
                    } else {
                        c9424M24182 = c9631.m11382();
                    }
                } else if (c9631 == null) {
                    c9424M24182 = c4628.m11382();
                } else {
                    c9424M24182 = C9424.m24182(c4628.m11382(), c9631.m11382());
                }
                if (c9424M24182.size() != 0) {
                    c12081.m30062(c20255, c9424M24182, c4669);
                }
                c4669.m12884().m37947(c20255);
                i3++;
                size2 = i4;
                c7492M12890 = c7493;
                c13137M12889 = c13138;
                c15960M12884 = c15960M12884;
                str = str3;
                str2 = str4;
            } catch (RuntimeException e6) {
                e = e6;
                str3 = str;
                str4 = str2;
            }
        }
        C13137 c13139 = c13137M12889;
        C15960 c15961 = c15960M12884;
        C7492 c7494 = c7492M12890;
        C11083 c11083M45133 = c19883.m45133();
        int size3 = c11083M45133.size();
        int i5 = 0;
        while (i5 < size3) {
            AbstractC9901 abstractC9901M27930 = c11083M45133.m27930(i5);
            if (abstractC9901M27930 instanceof C20255) {
                c15960 = c15961;
                c15960.m37947((AbstractC11788) abstractC9901M27930);
            } else {
                c15960 = c15961;
                if (abstractC9901M27930 instanceof C18137) {
                    c15960.m37947(((C18137) abstractC9901M27930).m42224());
                } else {
                    if (abstractC9901M27930 instanceof C23077) {
                        c13137 = c13139;
                        c13137.m32497((C23077) abstractC9901M27930);
                    } else {
                        c13137 = c13139;
                        if (abstractC9901M27930 instanceof C6848) {
                            c13137.m32497(((C6848) abstractC9901M27930).m18451());
                        } else if (abstractC9901M27930 instanceof C16022) {
                            c7492 = c7494;
                            c7492.m19995((C16022) abstractC9901M27930);
                        } else {
                            c7492 = c7494;
                            if (abstractC9901M27930 instanceof C18843) {
                                C18843 c18843 = (C18843) abstractC9901M27930;
                                C18740 c18740M15277get = c19883.m45135().m15277get(c18843.m43484());
                                C16022 c16022M43292 = c18740M15277get.m43292();
                                C0498 c0498M43481 = c18843.m43481();
                                C18034 c18034M43291 = c18740M15277get.m43291();
                                if (c16022M43292 == null) {
                                    throw new NullPointerException("bootstrapMethodHandle == null");
                                }
                                if (c0498M43481 == null) {
                                    throw new NullPointerException("nat == null");
                                }
                                C4731 c4731 = new C4731(c18034M43291.size() + 3);
                                c4731.mo15257(0, (AbstractC9901) c16022M43292);
                                c4731.mo15257(1, (AbstractC9901) c0498M43481.getName());
                                c4731.mo15257(2, (AbstractC9901) new C16727(C1909.m6215(c0498M43481.m2380().getString())));
                                for (int i6 = 0; i6 < c18034M43291.size(); i6++) {
                                    c4731.mo15257(i6 + 3, c18034M43291.m15267get(i6));
                                }
                                c4731.mo9637();
                                C22371 c22371 = new C22371(c4731);
                                c18843.m43478(c19883.m45140());
                                c18843.m43479(c22371);
                                Iterator it = c18843.m43480().iterator();
                                while (it.hasNext()) {
                                    c15609.m37277((C1203) it.next());
                                }
                            }
                        }
                    }
                    c7492 = c7494;
                }
                i5++;
                c15961 = c15960;
                c13139 = c13137;
                c7494 = c7492;
                c15609 = c15609;
            }
            c7492 = c7494;
            c13137 = c13139;
            i5++;
            c15961 = c15960;
            c13139 = c13137;
            c7494 = c7492;
            c15609 = c15609;
        }
        return c12081;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23783 m47915(AbstractC23783 abstractC23783, C3320 c3320) {
        if (abstractC23783.getType().equals(c3320)) {
            return abstractC23783;
        }
        int iMo9834 = c3320.mo9834();
        if (iMo9834 == 1) {
            return C2614.m8088(((C21665) abstractC23783).mo21658());
        }
        if (iMo9834 == 2) {
            return C5437.m15038(((C21665) abstractC23783).mo21658());
        }
        if (iMo9834 == 3) {
            return C13199.m32669(((C21665) abstractC23783).mo21658());
        }
        if (iMo9834 == 8) {
            return C12494.m31036(((C21665) abstractC23783).mo21658());
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC23783 + " to " + c3320);
    }
}
