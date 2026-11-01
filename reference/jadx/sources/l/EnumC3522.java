package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.crypto.sphincs.Horst;

/* JADX INFO: renamed from: l.ۗ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3522 {
    COMMON,
    LATIN,
    GREEK,
    CYRILLIC,
    ARMENIAN,
    HEBREW,
    ARABIC,
    SYRIAC,
    THAANA,
    DEVANAGARI,
    BENGALI,
    GURMUKHI,
    GUJARATI,
    ORIYA,
    TAMIL,
    TELUGU,
    KANNADA,
    MALAYALAM,
    SINHALA,
    THAI,
    LAO,
    TIBETAN,
    MYANMAR,
    GEORGIAN,
    HANGUL,
    ETHIOPIC,
    CHEROKEE,
    CANADIAN_ABORIGINAL,
    OGHAM,
    RUNIC,
    KHMER,
    MONGOLIAN,
    HIRAGANA,
    KATAKANA,
    BOPOMOFO,
    HAN,
    YI,
    OLD_ITALIC,
    GOTHIC,
    DESERET,
    INHERITED,
    TAGALOG,
    HANUNOO,
    BUHID,
    TAGBANWA,
    LIMBU,
    TAI_LE,
    LINEAR_B,
    UGARITIC,
    SHAVIAN,
    OSMANYA,
    CYPRIOT,
    BRAILLE,
    BUGINESE,
    COPTIC,
    NEW_TAI_LUE,
    GLAGOLITIC,
    TIFINAGH,
    SYLOTI_NAGRI,
    OLD_PERSIAN,
    KHAROSHTHI,
    BALINESE,
    CUNEIFORM,
    PHOENICIAN,
    PHAGS_PA,
    NKO,
    SUNDANESE,
    BATAK,
    LEPCHA,
    OL_CHIKI,
    VAI,
    SAURASHTRA,
    KAYAH_LI,
    REJANG,
    LYCIAN,
    CARIAN,
    LYDIAN,
    CHAM,
    TAI_THAM,
    TAI_VIET,
    AVESTAN,
    EGYPTIAN_HIEROGLYPHS,
    SAMARITAN,
    MANDAIC,
    LISU,
    BAMUM,
    JAVANESE,
    MEETEI_MAYEK,
    IMPERIAL_ARAMAIC,
    OLD_SOUTH_ARABIAN,
    INSCRIPTIONAL_PARTHIAN,
    INSCRIPTIONAL_PAHLAVI,
    OLD_TURKIC,
    BRAHMI,
    KAITHI,
    MEROITIC_HIEROGLYPHS,
    MEROITIC_CURSIVE,
    SORA_SOMPENG,
    CHAKMA,
    SHARADA,
    TAKRI,
    MIAO,
    UNKNOWN;


    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap f12897;

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC3522[] f12949;

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f12969;

    static {
        EnumC3522 enumC3522 = COMMON;
        EnumC3522 enumC3523 = LATIN;
        EnumC3522 enumC3524 = GREEK;
        EnumC3522 enumC3525 = CYRILLIC;
        EnumC3522 enumC3526 = ARMENIAN;
        EnumC3522 enumC3527 = HEBREW;
        EnumC3522 enumC3528 = ARABIC;
        EnumC3522 enumC3529 = SYRIAC;
        EnumC3522 enumC35210 = THAANA;
        EnumC3522 enumC35211 = DEVANAGARI;
        EnumC3522 enumC35212 = BENGALI;
        EnumC3522 enumC35213 = GURMUKHI;
        EnumC3522 enumC35214 = GUJARATI;
        EnumC3522 enumC35215 = ORIYA;
        EnumC3522 enumC35216 = TAMIL;
        EnumC3522 enumC35217 = TELUGU;
        EnumC3522 enumC35218 = KANNADA;
        EnumC3522 enumC35219 = MALAYALAM;
        EnumC3522 enumC35220 = SINHALA;
        EnumC3522 enumC35221 = THAI;
        EnumC3522 enumC35222 = LAO;
        EnumC3522 enumC35223 = TIBETAN;
        EnumC3522 enumC35224 = MYANMAR;
        EnumC3522 enumC35225 = GEORGIAN;
        EnumC3522 enumC35226 = HANGUL;
        EnumC3522 enumC35227 = ETHIOPIC;
        EnumC3522 enumC35228 = CHEROKEE;
        EnumC3522 enumC35229 = CANADIAN_ABORIGINAL;
        EnumC3522 enumC35230 = OGHAM;
        EnumC3522 enumC35231 = RUNIC;
        EnumC3522 enumC35232 = KHMER;
        EnumC3522 enumC35233 = MONGOLIAN;
        EnumC3522 enumC35234 = HIRAGANA;
        EnumC3522 enumC35235 = KATAKANA;
        EnumC3522 enumC35236 = BOPOMOFO;
        EnumC3522 enumC35237 = HAN;
        EnumC3522 enumC35238 = YI;
        EnumC3522 enumC35239 = OLD_ITALIC;
        EnumC3522 enumC35240 = GOTHIC;
        EnumC3522 enumC35241 = DESERET;
        EnumC3522 enumC35242 = INHERITED;
        EnumC3522 enumC35243 = TAGALOG;
        EnumC3522 enumC35244 = HANUNOO;
        EnumC3522 enumC35245 = BUHID;
        EnumC3522 enumC35246 = TAGBANWA;
        EnumC3522 enumC35247 = LIMBU;
        EnumC3522 enumC35248 = TAI_LE;
        EnumC3522 enumC35249 = LINEAR_B;
        EnumC3522 enumC35250 = UGARITIC;
        EnumC3522 enumC35251 = SHAVIAN;
        EnumC3522 enumC35252 = OSMANYA;
        EnumC3522 enumC35253 = CYPRIOT;
        EnumC3522 enumC35254 = BRAILLE;
        EnumC3522 enumC35255 = BUGINESE;
        EnumC3522 enumC35256 = COPTIC;
        EnumC3522 enumC35257 = NEW_TAI_LUE;
        EnumC3522 enumC35258 = GLAGOLITIC;
        EnumC3522 enumC35259 = TIFINAGH;
        EnumC3522 enumC35260 = SYLOTI_NAGRI;
        EnumC3522 enumC35261 = OLD_PERSIAN;
        EnumC3522 enumC35262 = KHAROSHTHI;
        EnumC3522 enumC35263 = BALINESE;
        EnumC3522 enumC35264 = CUNEIFORM;
        EnumC3522 enumC35265 = PHOENICIAN;
        EnumC3522 enumC35266 = PHAGS_PA;
        EnumC3522 enumC35267 = NKO;
        EnumC3522 enumC35268 = SUNDANESE;
        EnumC3522 enumC35269 = BATAK;
        EnumC3522 enumC35270 = LEPCHA;
        EnumC3522 enumC35271 = OL_CHIKI;
        EnumC3522 enumC35272 = VAI;
        EnumC3522 enumC35273 = SAURASHTRA;
        EnumC3522 enumC35274 = KAYAH_LI;
        EnumC3522 enumC35275 = REJANG;
        EnumC3522 enumC35276 = LYCIAN;
        EnumC3522 enumC35277 = CARIAN;
        EnumC3522 enumC35278 = LYDIAN;
        EnumC3522 enumC35279 = CHAM;
        EnumC3522 enumC35280 = TAI_THAM;
        EnumC3522 enumC35281 = TAI_VIET;
        EnumC3522 enumC35282 = AVESTAN;
        EnumC3522 enumC35283 = EGYPTIAN_HIEROGLYPHS;
        EnumC3522 enumC35284 = SAMARITAN;
        EnumC3522 enumC35285 = MANDAIC;
        EnumC3522 enumC35286 = LISU;
        EnumC3522 enumC35287 = BAMUM;
        EnumC3522 enumC35288 = JAVANESE;
        EnumC3522 enumC35289 = MEETEI_MAYEK;
        EnumC3522 enumC35290 = IMPERIAL_ARAMAIC;
        EnumC3522 enumC35291 = OLD_SOUTH_ARABIAN;
        EnumC3522 enumC35292 = INSCRIPTIONAL_PARTHIAN;
        EnumC3522 enumC35293 = INSCRIPTIONAL_PAHLAVI;
        EnumC3522 enumC35294 = OLD_TURKIC;
        EnumC3522 enumC35295 = BRAHMI;
        EnumC3522 enumC35296 = KAITHI;
        EnumC3522 enumC35297 = MEROITIC_HIEROGLYPHS;
        EnumC3522 enumC35298 = MEROITIC_CURSIVE;
        EnumC3522 enumC35299 = SORA_SOMPENG;
        EnumC3522 enumC352100 = CHAKMA;
        EnumC3522 enumC352101 = SHARADA;
        EnumC3522 enumC352102 = TAKRI;
        EnumC3522 enumC352103 = MIAO;
        EnumC3522 enumC352104 = UNKNOWN;
        f12969 = new int[]{0, 65, 91, 97, 123, 170, 171, 186, 187, 192, 215, 216, 247, 248, 697, 736, 741, 746, 748, 768, 880, 884, 885, 894, EnumC12167.f40710, 901, 902, 903, 904, 994, 1008, 1024, 1157, 1159, 1329, 1417, 1418, 1425, 1536, 1548, 1549, 1563, 1566, 1567, 1568, 1600, 1601, 1611, 1622, 1632, 1642, 1648, 1649, 1757, 1758, Params.POLY_BYTES, 1872, 1920, 1984, 2048, 2112, 2208, 2304, 2385, 2387, 2404, 2406, 2433, 2561, 2689, 2817, 2946, 3073, 3202, 3330, 3458, 3585, 3647, 3648, 3713, 3840, 4053, 4057, 4096, 4256, 4347, 4348, o.a.k, 4608, 5024, 5120, 5760, 5792, 5867, 5870, 5888, 5920, 5941, 5952, 5984, 6016, 6144, 6146, 6148, 6149, 6150, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6912, 7040, 7104, 7168, 7248, 7360, 7376, 7379, 7380, 7393, 7394, 7401, 7405, 7406, 7412, 7413, 7424, 7462, 7467, 7468, 7517, 7522, 7526, 7531, 7544, 7545, 7615, 7616, 7680, 7936, 8192, 8204, 8206, 8305, 8308, 8319, 8320, 8336, 8352, 8400, 8448, 8486, 8487, 8490, 8492, 8498, 8499, 8526, 8527, 8544, 8585, 10240, 10496, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12272, 12293, 12294, 12295, 12296, 12321, 12330, 12334, 12336, 12344, 12348, 12353, 12441, 12443, 12445, 12448, 12449, 12539, 12541, 12549, 12593, 12688, 12704, 12736, 12784, 12800, 12832, 12896, 12927, 13008, 13144, Horst.HORST_SIGBYTES, 19904, 19968, 40960, 42192, 42240, 42560, 42656, 42752, 42786, 42888, 42891, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43520, 43616, 43648, 43744, 43777, 43968, 44032, 55292, 63744, 64256, 64275, 64285, 64336, 64830, 64848, 65021, 65024, 65040, 65056, 65072, 65136, 65279, 65313, 65339, 65345, 65371, 65382, 65392, 65393, 65438, 65440, 65504, 65536, 65792, 65856, 65936, 66045, 66176, 66208, 66304, 66352, 66432, 66464, 66560, 66640, 66688, 67584, 67648, 67840, 67872, 67968, 68000, 68096, 68192, 68352, 68416, 68448, 68608, 69216, 69632, 69760, 69840, 69888, 70016, 71296, 73728, 77824, 92160, 93952, 110592, 110593, 118784, 119143, 119146, 119163, 119171, 119173, 119180, 119210, 119214, 119296, 119552, 126464, 126976, 127488, 127489, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, 917505, 917760, 918000};
        f12949 = new EnumC3522[]{enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC35236, enumC3522, enumC35242, enumC3524, enumC3522, enumC3524, enumC3522, enumC3524, enumC3522, enumC3524, enumC3522, enumC3524, enumC35256, enumC3524, enumC3525, enumC35242, enumC3525, enumC3526, enumC3522, enumC3526, enumC3527, enumC3528, enumC3522, enumC3528, enumC3522, enumC3528, enumC3522, enumC3528, enumC3522, enumC3528, enumC35242, enumC3528, enumC3522, enumC3528, enumC35242, enumC3528, enumC3522, enumC3528, enumC3529, enumC3528, enumC35210, enumC35267, enumC35284, enumC35285, enumC3528, enumC35211, enumC35242, enumC35211, enumC3522, enumC35211, enumC35212, enumC35213, enumC35214, enumC35215, enumC35216, enumC35217, enumC35218, enumC35219, enumC35220, enumC35221, enumC3522, enumC35221, enumC35222, enumC35223, enumC3522, enumC35223, enumC35224, enumC35225, enumC3522, enumC35225, enumC35226, enumC35227, enumC35228, enumC35229, enumC35230, enumC35231, enumC3522, enumC35231, enumC35243, enumC35244, enumC3522, enumC35245, enumC35246, enumC35232, enumC35233, enumC3522, enumC35233, enumC3522, enumC35233, enumC35229, enumC35247, enumC35248, enumC35257, enumC35232, enumC35255, enumC35280, enumC35263, enumC35268, enumC35269, enumC35270, enumC35271, enumC35268, enumC35242, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC3523, enumC3524, enumC3525, enumC3523, enumC3524, enumC3523, enumC3524, enumC3523, enumC3525, enumC3523, enumC3524, enumC35242, enumC3523, enumC3524, enumC3522, enumC35242, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC35242, enumC3522, enumC3524, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC35254, enumC3522, enumC35258, enumC3523, enumC35256, enumC35225, enumC35259, enumC35227, enumC3525, enumC3522, enumC35237, enumC3522, enumC35237, enumC3522, enumC35237, enumC3522, enumC35237, enumC35242, enumC35226, enumC3522, enumC35237, enumC3522, enumC35234, enumC35242, enumC3522, enumC35234, enumC3522, enumC35235, enumC3522, enumC35235, enumC35236, enumC35226, enumC3522, enumC35236, enumC3522, enumC35235, enumC35226, enumC3522, enumC35226, enumC3522, enumC35235, enumC3522, enumC35237, enumC3522, enumC35237, enumC35238, enumC35286, enumC35272, enumC3525, enumC35287, enumC3522, enumC3523, enumC3522, enumC3523, enumC35260, enumC3522, enumC35266, enumC35273, enumC35211, enumC35274, enumC35275, enumC35226, enumC35288, enumC35279, enumC35224, enumC35281, enumC35289, enumC35227, enumC35289, enumC35226, enumC352104, enumC35237, enumC3523, enumC3526, enumC3527, enumC3528, enumC3522, enumC3528, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC3528, enumC3522, enumC3523, enumC3522, enumC3523, enumC3522, enumC35235, enumC3522, enumC35235, enumC3522, enumC35226, enumC3522, enumC35249, enumC3522, enumC3524, enumC3522, enumC35242, enumC35276, enumC35277, enumC35239, enumC35240, enumC35250, enumC35261, enumC35241, enumC35251, enumC35252, enumC35253, enumC35290, enumC35265, enumC35278, enumC35297, enumC35298, enumC35262, enumC35291, enumC35282, enumC35292, enumC35293, enumC35294, enumC3528, enumC35295, enumC35296, enumC35299, enumC352100, enumC352101, enumC352102, enumC35264, enumC35283, enumC35287, enumC352103, enumC35235, enumC35234, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC35242, enumC3522, enumC3524, enumC3522, enumC3528, enumC3522, enumC35234, enumC3522, enumC35237, enumC3522, enumC35242, enumC352104};
        HashMap map = new HashMap(128);
        f12897 = map;
        map.put("ARAB", enumC3528);
        f12897.put("ARMI", enumC35290);
        f12897.put("ARMN", enumC3526);
        f12897.put("AVST", enumC35282);
        f12897.put("BALI", enumC35263);
        f12897.put("BAMU", enumC35287);
        f12897.put("BATK", enumC35269);
        f12897.put("BENG", enumC35212);
        f12897.put("BOPO", enumC35236);
        f12897.put("BRAI", enumC35254);
        f12897.put("BRAH", enumC35295);
        f12897.put("BUGI", enumC35255);
        f12897.put("BUHD", enumC35245);
        f12897.put("CAKM", enumC352100);
        f12897.put("CANS", enumC35229);
        f12897.put("CARI", enumC35277);
        f12897.put("CHAM", enumC35279);
        f12897.put("CHER", enumC35228);
        f12897.put("COPT", enumC35256);
        f12897.put("CPRT", enumC35253);
        f12897.put("CYRL", enumC3525);
        f12897.put("DEVA", enumC35211);
        f12897.put("DSRT", enumC35241);
        f12897.put("EGYP", enumC35283);
        f12897.put("ETHI", enumC35227);
        f12897.put("GEOR", enumC35225);
        f12897.put("GLAG", enumC35258);
        f12897.put("GOTH", enumC35240);
        f12897.put("GREK", enumC3524);
        f12897.put("GUJR", enumC35214);
        f12897.put("GURU", enumC35213);
        f12897.put("HANG", enumC35226);
        f12897.put("HANI", enumC35237);
        f12897.put("HANO", enumC35244);
        f12897.put("HEBR", enumC3527);
        f12897.put("HIRA", enumC35234);
        f12897.put("ITAL", enumC35239);
        f12897.put("JAVA", enumC35288);
        f12897.put("KALI", enumC35274);
        f12897.put("KANA", enumC35235);
        f12897.put("KHAR", enumC35262);
        f12897.put("KHMR", enumC35232);
        f12897.put("KNDA", enumC35218);
        f12897.put("KTHI", enumC35296);
        f12897.put("LANA", enumC35280);
        f12897.put("LAOO", enumC35222);
        f12897.put("LATN", enumC3523);
        f12897.put("LEPC", enumC35270);
        f12897.put("LIMB", enumC35247);
        f12897.put("LINB", enumC35249);
        f12897.put("LISU", enumC35286);
        f12897.put("LYCI", enumC35276);
        f12897.put("LYDI", enumC35278);
        f12897.put("MAND", enumC35285);
        f12897.put("MERC", enumC35298);
        f12897.put("MERO", enumC35297);
        f12897.put("MLYM", enumC35219);
        f12897.put("MONG", enumC35233);
        f12897.put("MTEI", enumC35289);
        f12897.put("MYMR", enumC35224);
        f12897.put("NKOO", enumC35267);
        f12897.put("OGAM", enumC35230);
        f12897.put("OLCK", enumC35271);
        f12897.put("ORKH", enumC35294);
        f12897.put("ORYA", enumC35215);
        f12897.put("OSMA", enumC35252);
        f12897.put("PHAG", enumC35266);
        f12897.put("PLRD", enumC352103);
        f12897.put("PHLI", enumC35293);
        f12897.put("PHNX", enumC35265);
        f12897.put("PRTI", enumC35292);
        f12897.put("RJNG", enumC35275);
        f12897.put("RUNR", enumC35231);
        f12897.put("SAMR", enumC35284);
        f12897.put("SARB", enumC35291);
        f12897.put("SAUR", enumC35273);
        f12897.put("SHAW", enumC35251);
        f12897.put("SHRD", enumC352101);
        f12897.put("SINH", enumC35220);
        f12897.put("SORA", enumC35299);
        f12897.put("SUND", enumC35268);
        f12897.put("SYLO", enumC35260);
        f12897.put("SYRC", enumC3529);
        f12897.put("TAGB", enumC35246);
        f12897.put("TALE", enumC35248);
        f12897.put("TAKR", enumC352102);
        f12897.put("TALU", enumC35257);
        f12897.put("TAML", enumC35216);
        f12897.put("TAVT", enumC35281);
        f12897.put("TELU", enumC35217);
        f12897.put("TFNG", enumC35259);
        f12897.put("TGLG", enumC35243);
        f12897.put("THAA", enumC35210);
        f12897.put("THAI", enumC35221);
        f12897.put("TIBT", enumC35223);
        f12897.put("UGAR", enumC35250);
        f12897.put("VAII", enumC35272);
        f12897.put("XPEO", enumC35261);
        f12897.put("XSUX", enumC35264);
        f12897.put("YIII", enumC35238);
        f12897.put("ZINH", enumC35242);
        f12897.put("ZYYY", enumC3522);
        f12897.put("ZZZZ", enumC352104);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3522 m10384(int i) {
        if (!Character.isValidCodePoint(i)) {
            throw new IllegalArgumentException();
        }
        if (C4312.m12113(i) == 0) {
            return UNKNOWN;
        }
        int iBinarySearch = Arrays.binarySearch(f12969, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return f12949[iBinarySearch];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3522 m10385(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        EnumC3522 enumC3522 = (EnumC3522) f12897.get(upperCase);
        return enumC3522 != null ? enumC3522 : valueOf(upperCase);
    }
}
