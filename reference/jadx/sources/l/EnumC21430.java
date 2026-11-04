package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.crypto.sphincs.Horst;

/* JADX INFO: renamed from: l.᩶ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21430 {
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


    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f68271;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC21430[] f68302;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public static HashMap f68346;

    static {
        EnumC21430 enumC21430 = COMMON;
        EnumC21430 enumC21431 = LATIN;
        EnumC21430 enumC21432 = GREEK;
        EnumC21430 enumC21433 = CYRILLIC;
        EnumC21430 enumC21434 = ARMENIAN;
        EnumC21430 enumC21435 = HEBREW;
        EnumC21430 enumC21436 = ARABIC;
        EnumC21430 enumC21437 = SYRIAC;
        EnumC21430 enumC21438 = THAANA;
        EnumC21430 enumC21439 = DEVANAGARI;
        EnumC21430 enumC214310 = BENGALI;
        EnumC21430 enumC214311 = GURMUKHI;
        EnumC21430 enumC214312 = GUJARATI;
        EnumC21430 enumC214313 = ORIYA;
        EnumC21430 enumC214314 = TAMIL;
        EnumC21430 enumC214315 = TELUGU;
        EnumC21430 enumC214316 = KANNADA;
        EnumC21430 enumC214317 = MALAYALAM;
        EnumC21430 enumC214318 = SINHALA;
        EnumC21430 enumC214319 = THAI;
        EnumC21430 enumC214320 = LAO;
        EnumC21430 enumC214321 = TIBETAN;
        EnumC21430 enumC214322 = MYANMAR;
        EnumC21430 enumC214323 = GEORGIAN;
        EnumC21430 enumC214324 = HANGUL;
        EnumC21430 enumC214325 = ETHIOPIC;
        EnumC21430 enumC214326 = CHEROKEE;
        EnumC21430 enumC214327 = CANADIAN_ABORIGINAL;
        EnumC21430 enumC214328 = OGHAM;
        EnumC21430 enumC214329 = RUNIC;
        EnumC21430 enumC214330 = KHMER;
        EnumC21430 enumC214331 = MONGOLIAN;
        EnumC21430 enumC214332 = HIRAGANA;
        EnumC21430 enumC214333 = KATAKANA;
        EnumC21430 enumC214334 = BOPOMOFO;
        EnumC21430 enumC214335 = HAN;
        EnumC21430 enumC214336 = YI;
        EnumC21430 enumC214337 = OLD_ITALIC;
        EnumC21430 enumC214338 = GOTHIC;
        EnumC21430 enumC214339 = DESERET;
        EnumC21430 enumC214340 = INHERITED;
        EnumC21430 enumC214341 = TAGALOG;
        EnumC21430 enumC214342 = HANUNOO;
        EnumC21430 enumC214343 = BUHID;
        EnumC21430 enumC214344 = TAGBANWA;
        EnumC21430 enumC214345 = LIMBU;
        EnumC21430 enumC214346 = TAI_LE;
        EnumC21430 enumC214347 = LINEAR_B;
        EnumC21430 enumC214348 = UGARITIC;
        EnumC21430 enumC214349 = SHAVIAN;
        EnumC21430 enumC214350 = OSMANYA;
        EnumC21430 enumC214351 = CYPRIOT;
        EnumC21430 enumC214352 = BRAILLE;
        EnumC21430 enumC214353 = BUGINESE;
        EnumC21430 enumC214354 = COPTIC;
        EnumC21430 enumC214355 = NEW_TAI_LUE;
        EnumC21430 enumC214356 = GLAGOLITIC;
        EnumC21430 enumC214357 = TIFINAGH;
        EnumC21430 enumC214358 = SYLOTI_NAGRI;
        EnumC21430 enumC214359 = OLD_PERSIAN;
        EnumC21430 enumC214360 = KHAROSHTHI;
        EnumC21430 enumC214361 = BALINESE;
        EnumC21430 enumC214362 = CUNEIFORM;
        EnumC21430 enumC214363 = PHOENICIAN;
        EnumC21430 enumC214364 = PHAGS_PA;
        EnumC21430 enumC214365 = NKO;
        EnumC21430 enumC214366 = SUNDANESE;
        EnumC21430 enumC214367 = BATAK;
        EnumC21430 enumC214368 = LEPCHA;
        EnumC21430 enumC214369 = OL_CHIKI;
        EnumC21430 enumC214370 = VAI;
        EnumC21430 enumC214371 = SAURASHTRA;
        EnumC21430 enumC214372 = KAYAH_LI;
        EnumC21430 enumC214373 = REJANG;
        EnumC21430 enumC214374 = LYCIAN;
        EnumC21430 enumC214375 = CARIAN;
        EnumC21430 enumC214376 = LYDIAN;
        EnumC21430 enumC214377 = CHAM;
        EnumC21430 enumC214378 = TAI_THAM;
        EnumC21430 enumC214379 = TAI_VIET;
        EnumC21430 enumC214380 = AVESTAN;
        EnumC21430 enumC214381 = EGYPTIAN_HIEROGLYPHS;
        EnumC21430 enumC214382 = SAMARITAN;
        EnumC21430 enumC214383 = MANDAIC;
        EnumC21430 enumC214384 = LISU;
        EnumC21430 enumC214385 = BAMUM;
        EnumC21430 enumC214386 = JAVANESE;
        EnumC21430 enumC214387 = MEETEI_MAYEK;
        EnumC21430 enumC214388 = IMPERIAL_ARAMAIC;
        EnumC21430 enumC214389 = OLD_SOUTH_ARABIAN;
        EnumC21430 enumC214390 = INSCRIPTIONAL_PARTHIAN;
        EnumC21430 enumC214391 = INSCRIPTIONAL_PAHLAVI;
        EnumC21430 enumC214392 = OLD_TURKIC;
        EnumC21430 enumC214393 = BRAHMI;
        EnumC21430 enumC214394 = KAITHI;
        EnumC21430 enumC214395 = MEROITIC_HIEROGLYPHS;
        EnumC21430 enumC214396 = MEROITIC_CURSIVE;
        EnumC21430 enumC214397 = SORA_SOMPENG;
        EnumC21430 enumC214398 = CHAKMA;
        EnumC21430 enumC214399 = SHARADA;
        EnumC21430 enumC2143100 = TAKRI;
        EnumC21430 enumC2143101 = MIAO;
        EnumC21430 enumC2143102 = UNKNOWN;
        f68271 = new int[]{0, 65, 91, 97, 123, 170, 171, 186, 187, 192, 215, 216, 247, 248, 697, 736, 741, 746, 748, 768, 880, 884, 885, 894, EnumC5810.f19974, 901, 902, 903, 904, 994, 1008, 1024, 1157, 1159, 1329, 1417, 1418, 1425, 1536, 1548, 1549, 1563, 1566, 1567, 1568, 1600, 1601, 1611, 1622, 1632, 1642, 1648, 1649, 1757, 1758, Params.POLY_BYTES, 1872, 1920, 1984, 2048, 2112, 2208, 2304, 2385, 2387, 2404, 2406, 2433, 2561, 2689, 2817, 2946, 3073, 3202, 3330, 3458, 3585, 3647, 3648, 3713, 3840, 4053, 4057, 4096, 4256, 4347, 4348, o.a.k, 4608, 5024, 5120, 5760, 5792, 5867, 5870, 5888, 5920, 5941, 5952, 5984, 6016, 6144, 6146, 6148, 6149, 6150, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6912, 7040, 7104, 7168, 7248, 7360, 7376, 7379, 7380, 7393, 7394, 7401, 7405, 7406, 7412, 7413, 7424, 7462, 7467, 7468, 7517, 7522, 7526, 7531, 7544, 7545, 7615, 7616, 7680, 7936, 8192, 8204, 8206, 8305, 8308, 8319, 8320, 8336, 8352, 8400, 8448, 8486, 8487, 8490, 8492, 8498, 8499, 8526, 8527, 8544, 8585, 10240, 10496, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12272, 12293, 12294, 12295, 12296, 12321, 12330, 12334, 12336, 12344, 12348, 12353, 12441, 12443, 12445, 12448, 12449, 12539, 12541, 12549, 12593, 12688, 12704, 12736, 12784, 12800, 12832, 12896, 12927, 13008, 13144, Horst.HORST_SIGBYTES, 19904, 19968, 40960, 42192, 42240, 42560, 42656, 42752, 42786, 42888, 42891, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43520, 43616, 43648, 43744, 43777, 43968, 44032, 55292, 63744, 64256, 64275, 64285, 64336, 64830, 64848, 65021, 65024, 65040, 65056, 65072, 65136, 65279, 65313, 65339, 65345, 65371, 65382, 65392, 65393, 65438, 65440, 65504, 65536, 65792, 65856, 65936, 66045, 66176, 66208, 66304, 66352, 66432, 66464, 66560, 66640, 66688, 67584, 67648, 67840, 67872, 67968, 68000, 68096, 68192, 68352, 68416, 68448, 68608, 69216, 69632, 69760, 69840, 69888, 70016, 71296, 73728, 77824, 92160, 93952, 110592, 110593, 118784, 119143, 119146, 119163, 119171, 119173, 119180, 119210, 119214, 119296, 119552, 126464, 126976, 127488, 127489, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, 917505, 917760, 918000};
        f68302 = new EnumC21430[]{enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC214334, enumC21430, enumC214340, enumC21432, enumC21430, enumC21432, enumC21430, enumC21432, enumC21430, enumC21432, enumC21430, enumC21432, enumC214354, enumC21432, enumC21433, enumC214340, enumC21433, enumC21434, enumC21430, enumC21434, enumC21435, enumC21436, enumC21430, enumC21436, enumC21430, enumC21436, enumC21430, enumC21436, enumC21430, enumC21436, enumC214340, enumC21436, enumC21430, enumC21436, enumC214340, enumC21436, enumC21430, enumC21436, enumC21437, enumC21436, enumC21438, enumC214365, enumC214382, enumC214383, enumC21436, enumC21439, enumC214340, enumC21439, enumC21430, enumC21439, enumC214310, enumC214311, enumC214312, enumC214313, enumC214314, enumC214315, enumC214316, enumC214317, enumC214318, enumC214319, enumC21430, enumC214319, enumC214320, enumC214321, enumC21430, enumC214321, enumC214322, enumC214323, enumC21430, enumC214323, enumC214324, enumC214325, enumC214326, enumC214327, enumC214328, enumC214329, enumC21430, enumC214329, enumC214341, enumC214342, enumC21430, enumC214343, enumC214344, enumC214330, enumC214331, enumC21430, enumC214331, enumC21430, enumC214331, enumC214327, enumC214345, enumC214346, enumC214355, enumC214330, enumC214353, enumC214378, enumC214361, enumC214366, enumC214367, enumC214368, enumC214369, enumC214366, enumC214340, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC21431, enumC21432, enumC21433, enumC21431, enumC21432, enumC21431, enumC21432, enumC21431, enumC21433, enumC21431, enumC21432, enumC214340, enumC21431, enumC21432, enumC21430, enumC214340, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC214340, enumC21430, enumC21432, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC214352, enumC21430, enumC214356, enumC21431, enumC214354, enumC214323, enumC214357, enumC214325, enumC21433, enumC21430, enumC214335, enumC21430, enumC214335, enumC21430, enumC214335, enumC21430, enumC214335, enumC214340, enumC214324, enumC21430, enumC214335, enumC21430, enumC214332, enumC214340, enumC21430, enumC214332, enumC21430, enumC214333, enumC21430, enumC214333, enumC214334, enumC214324, enumC21430, enumC214334, enumC21430, enumC214333, enumC214324, enumC21430, enumC214324, enumC21430, enumC214333, enumC21430, enumC214335, enumC21430, enumC214335, enumC214336, enumC214384, enumC214370, enumC21433, enumC214385, enumC21430, enumC21431, enumC21430, enumC21431, enumC214358, enumC21430, enumC214364, enumC214371, enumC21439, enumC214372, enumC214373, enumC214324, enumC214386, enumC214377, enumC214322, enumC214379, enumC214387, enumC214325, enumC214387, enumC214324, enumC2143102, enumC214335, enumC21431, enumC21434, enumC21435, enumC21436, enumC21430, enumC21436, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC21436, enumC21430, enumC21431, enumC21430, enumC21431, enumC21430, enumC214333, enumC21430, enumC214333, enumC21430, enumC214324, enumC21430, enumC214347, enumC21430, enumC21432, enumC21430, enumC214340, enumC214374, enumC214375, enumC214337, enumC214338, enumC214348, enumC214359, enumC214339, enumC214349, enumC214350, enumC214351, enumC214388, enumC214363, enumC214376, enumC214395, enumC214396, enumC214360, enumC214389, enumC214380, enumC214390, enumC214391, enumC214392, enumC21436, enumC214393, enumC214394, enumC214397, enumC214398, enumC214399, enumC2143100, enumC214362, enumC214381, enumC214385, enumC2143101, enumC214333, enumC214332, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC214340, enumC21430, enumC21432, enumC21430, enumC21436, enumC21430, enumC214332, enumC21430, enumC214335, enumC21430, enumC214340, enumC2143102};
        HashMap map = new HashMap(128);
        f68346 = map;
        map.put("ARAB", enumC21436);
        f68346.put("ARMI", enumC214388);
        f68346.put("ARMN", enumC21434);
        f68346.put("AVST", enumC214380);
        f68346.put("BALI", enumC214361);
        f68346.put("BAMU", enumC214385);
        f68346.put("BATK", enumC214367);
        f68346.put("BENG", enumC214310);
        f68346.put("BOPO", enumC214334);
        f68346.put("BRAI", enumC214352);
        f68346.put("BRAH", enumC214393);
        f68346.put("BUGI", enumC214353);
        f68346.put("BUHD", enumC214343);
        f68346.put("CAKM", enumC214398);
        f68346.put("CANS", enumC214327);
        f68346.put("CARI", enumC214375);
        f68346.put("CHAM", enumC214377);
        f68346.put("CHER", enumC214326);
        f68346.put("COPT", enumC214354);
        f68346.put("CPRT", enumC214351);
        f68346.put("CYRL", enumC21433);
        f68346.put("DEVA", enumC21439);
        f68346.put("DSRT", enumC214339);
        f68346.put("EGYP", enumC214381);
        f68346.put("ETHI", enumC214325);
        f68346.put("GEOR", enumC214323);
        f68346.put("GLAG", enumC214356);
        f68346.put("GOTH", enumC214338);
        f68346.put("GREK", enumC21432);
        f68346.put("GUJR", enumC214312);
        f68346.put("GURU", enumC214311);
        f68346.put("HANG", enumC214324);
        f68346.put("HANI", enumC214335);
        f68346.put("HANO", enumC214342);
        f68346.put("HEBR", enumC21435);
        f68346.put("HIRA", enumC214332);
        f68346.put("ITAL", enumC214337);
        f68346.put("JAVA", enumC214386);
        f68346.put("KALI", enumC214372);
        f68346.put("KANA", enumC214333);
        f68346.put("KHAR", enumC214360);
        f68346.put("KHMR", enumC214330);
        f68346.put("KNDA", enumC214316);
        f68346.put("KTHI", enumC214394);
        f68346.put("LANA", enumC214378);
        f68346.put("LAOO", enumC214320);
        f68346.put("LATN", enumC21431);
        f68346.put("LEPC", enumC214368);
        f68346.put("LIMB", enumC214345);
        f68346.put("LINB", enumC214347);
        f68346.put("LISU", enumC214384);
        f68346.put("LYCI", enumC214374);
        f68346.put("LYDI", enumC214376);
        f68346.put("MAND", enumC214383);
        f68346.put("MERC", enumC214396);
        f68346.put("MERO", enumC214395);
        f68346.put("MLYM", enumC214317);
        f68346.put("MONG", enumC214331);
        f68346.put("MTEI", enumC214387);
        f68346.put("MYMR", enumC214322);
        f68346.put("NKOO", enumC214365);
        f68346.put("OGAM", enumC214328);
        f68346.put("OLCK", enumC214369);
        f68346.put("ORKH", enumC214392);
        f68346.put("ORYA", enumC214313);
        f68346.put("OSMA", enumC214350);
        f68346.put("PHAG", enumC214364);
        f68346.put("PLRD", enumC2143101);
        f68346.put("PHLI", enumC214391);
        f68346.put("PHNX", enumC214363);
        f68346.put("PRTI", enumC214390);
        f68346.put("RJNG", enumC214373);
        f68346.put("RUNR", enumC214329);
        f68346.put("SAMR", enumC214382);
        f68346.put("SARB", enumC214389);
        f68346.put("SAUR", enumC214371);
        f68346.put("SHAW", enumC214349);
        f68346.put("SHRD", enumC214399);
        f68346.put("SINH", enumC214318);
        f68346.put("SORA", enumC214397);
        f68346.put("SUND", enumC214366);
        f68346.put("SYLO", enumC214358);
        f68346.put("SYRC", enumC21437);
        f68346.put("TAGB", enumC214344);
        f68346.put("TALE", enumC214346);
        f68346.put("TAKR", enumC2143100);
        f68346.put("TALU", enumC214355);
        f68346.put("TAML", enumC214314);
        f68346.put("TAVT", enumC214379);
        f68346.put("TELU", enumC214315);
        f68346.put("TFNG", enumC214357);
        f68346.put("TGLG", enumC214341);
        f68346.put("THAA", enumC21438);
        f68346.put("THAI", enumC214319);
        f68346.put("TIBT", enumC214321);
        f68346.put("UGAR", enumC214348);
        f68346.put("VAII", enumC214370);
        f68346.put("XPEO", enumC214359);
        f68346.put("XSUX", enumC214362);
        f68346.put("YIII", enumC214336);
        f68346.put("ZINH", enumC214340);
        f68346.put("ZYYY", enumC21430);
        f68346.put("ZZZZ", enumC2143102);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21430 m48751(int i) {
        if (!Character.isValidCodePoint(i)) {
            throw new IllegalArgumentException();
        }
        if (C18446.m42976(i) == 0) {
            return UNKNOWN;
        }
        int iBinarySearch = Arrays.binarySearch(f68271, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return f68302[iBinarySearch];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21430 m48752(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        EnumC21430 enumC21430 = (EnumC21430) f68346.get(upperCase);
        return enumC21430 != null ? enumC21430 : valueOf(upperCase);
    }
}
