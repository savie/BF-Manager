package l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.cb;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۤۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AHN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10049 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f34308 = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f34309;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f34310;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f34311;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f34312;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16502 f34313;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f34314;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f34315;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f34316;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f34317;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f34318;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f34319;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16502 f34320;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f34321;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f34322;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16502 f34323;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte f34324;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f34325;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f34326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16502 f34327;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f34328;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f34329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f34330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f34331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f34332;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34333;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f34334;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25393(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            int i3 = i2 - 1;
            C23455.m51697(0L, bArr, i, i3);
            bArr[i3 + i] = UTF8.S_CS3;
        } else {
            int i4 = C23455.f75961;
            long j2 = i2 == 8 ? 2097151L : 8589934591L;
            boolean z2 = j < 0;
            if (!z2 && j <= j2) {
                int i5 = i2 - 1;
                C23455.m51697(j, bArr, i, i5);
                bArr[i + i5] = UTF8.S_CS3;
            } else {
                if (i2 >= 9) {
                    byte[] byteArray = BigInteger.valueOf(j).toByteArray();
                    int length = byteArray.length;
                    if (length > i2 - 1) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    int i6 = (i + i2) - length;
                    System.arraycopy(byteArray, 0, bArr, i6, length);
                    byte b = (byte) (z2 ? 255 : 0);
                    for (int i7 = i + 1; i7 < i6; i7++) {
                        bArr[i7] = b;
                    }
                } else {
                    int i8 = (i2 - 1) * 8;
                    long j3 = 1 << i8;
                    long jAbs = Math.abs(j);
                    if (jAbs < 0 || jAbs >= j3) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    if (z2) {
                        jAbs = ((jAbs ^ (j3 - 1)) + 1) | (255 << i8);
                    }
                    long j4 = jAbs;
                    for (int i9 = (i + i2) - 1; i9 >= i; i9--) {
                        bArr[i9] = (byte) j4;
                        j4 >>= 8;
                    }
                }
                bArr[i] = (byte) (z2 ? 255 : 128);
            }
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C16502 m25398(long j) {
        if (j <= 0) {
            return null;
        }
        int i = C2369.f8373;
        return C16502.from(j, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25422(String str) {
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        this.f34329 = strReplace;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C18285 m25397(String str) throws IOException {
        if (!f34308.matcher(str).matches()) {
            throw new IOException(C16523.m38890("Corrupted PAX header. Time field value is invalid '", str, "'"));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return C18285.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
        } catch (ArithmeticException | C15464 e) {
            throw new IOException(C16523.m38890("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
        }
    }

    public C10049() {
        this.f34329 = "";
        this.f34332 = "";
        this.f34328 = "ustar\u0000";
        this.f34321 = ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
        this.f34315 = "";
        this.f34322 = new HashMap();
        this.f34314 = -1L;
        String property = System.getProperty("user.name", "");
        this.f34326 = property.length() > 31 ? property.substring(0, 31) : property;
    }

    public C10049(HashMap map, byte[] bArr, InterfaceC1581 interfaceC1581) throws IOException {
        this();
        try {
            m25395(map, bArr, interfaceC1581);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public C10049(String str) {
        this();
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        boolean zEndsWith = strReplace.endsWith("/");
        this.f34329 = strReplace;
        this.f34317 = zEndsWith ? 16877 : 33188;
        this.f34324 = zEndsWith ? (byte) 53 : UTF8.S_P3A;
        this.f34327 = C16502.from(C18285.now());
        this.f34326 = "";
    }

    public C10049(byte b, String str) {
        this(str);
        this.f34324 = b;
        if (b == 76) {
            this.f34328 = "ustar ";
            this.f34321 = " \u0000";
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && C10049.class == obj.getClass() && this.f34329.equals(((C10049) obj).f34329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25394(byte[] bArr, int i, byte b, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16502 m25405() {
        return this.f34323;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m25425() {
        return this.f34314;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25421() {
        return this.f34333;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m25402() {
        return this.f34310;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map m25413() {
        return C0561.unmodifiableMap(this.f34322);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m25439() {
        return this.f34315;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16502 m25400() {
        return this.f34313;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16502 m25424() {
        return this.f34327;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m25404() {
        return this.f34332;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m25415() {
        return this.f34312;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m25440() {
        return this.f34309;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m25438() {
        return this.f34317;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Date m25429() {
        C16502 c16502 = this.f34327;
        int i = C2369.f8373;
        if (c16502 != null) {
            return new Date(c16502.toMillis());
        }
        return null;
    }

    public final int hashCode() {
        return this.f34329.hashCode();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m25433() {
        return this.f34329;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m25434() throws IOException {
        List list = this.f34325;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list2 = (List) C9030.stream(this.f34325).filter(new C16973(1)).sorted(C7618.comparingLong(new C8638())).collect(C1890.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C16399 c16399 = (C16399) list2.get(i);
            i++;
            if (i < size) {
                if (c16399.m38604() + c16399.m38605() > ((C16399) list2.get(i)).m38605()) {
                    throw new IOException(C22697.m50267(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), this.f34329, " overlap each other."));
                }
            }
            if (c16399.m38604() + c16399.m38605() < 0) {
                throw new IOException(C22697.m50267(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), this.f34329, " too large."));
            }
        }
        if (!list2.isEmpty()) {
            C16399 c163910 = (C16399) list2.get(size - 1);
            if (c163910.m38604() + c163910.m38605() > m25417()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m25417() {
        if (m25428()) {
            return this.f34316;
        }
        return this.f34331;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m25435() {
        return this.f34331;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m25418() {
        return this.f34325;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16502 m25419() {
        return this.f34320;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m25416() {
        return this.f34326;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25437() {
        return this.f34311;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m25430() {
        if (this.f34324 == 53) {
            return true;
        }
        return (m25441() || m25432() || !this.f34329.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m25436() {
        return this.f34334;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m25399() {
        byte b = this.f34324;
        if (b == 0 || b == 48) {
            return true;
        }
        return (b == 53 || this.f34329.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m25432() {
        return this.f34324 == 103;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m25431() {
        return this.f34324 == 75;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m25423() {
        return this.f34324 == 76;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m25428() {
        return m25414() || this.f34319 || this.f34330;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25396(int i, byte[] bArr) {
        if ((bArr[i] & GCMSIVBlockCipher.MASK) == 0) {
            for (int i2 = 0; i2 < 11; i2++) {
                byte b = bArr[i + i2];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + 11];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m25414() {
        return this.f34324 == 83;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m25420() {
        return this.f34318;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m25441() {
        byte b = this.f34324;
        return b == 120 || b == 88;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25401() {
        return this.f34324 == 50;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25395(Map map, byte[] bArr, InterfaceC1581 interfaceC1581) throws IOException {
        String str;
        byte b;
        this.f34329 = C23455.m51693(bArr, 0, 100, interfaceC1581);
        this.f34317 = (int) C23455.m51700(100, 8, bArr);
        this.f34309 = (int) C23455.m51700(108, 8, bArr);
        this.f34312 = (int) C23455.m51700(116, 8, bArr);
        long jM51700 = C23455.m51700(124, 12, bArr);
        this.f34331 = jM51700;
        long j = 0;
        if (jM51700 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        long jM51701 = C23455.m51700(136, 12, bArr);
        int i = C2369.f8373;
        this.f34327 = C16502.from(jM51701, TimeUnit.SECONDS);
        int i2 = 148;
        long jM51692 = C23455.m51692(148, 8, bArr);
        int i3 = 0;
        long j2 = 0;
        while (true) {
            int length = bArr.length;
            byte b2 = UTF8.S_CS3;
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (i2 > i3 || i3 >= 156) {
                b2 = b3;
            }
            j += (long) (b2 & 255);
            j2 += (long) b2;
            i3++;
            i2 = 148;
        }
        this.f34311 = jM51692 == j || jM51692 == j2;
        this.f34324 = bArr[156];
        this.f34332 = C23455.m51693(bArr, 157, 100, interfaceC1581);
        InterfaceC1581 interfaceC1582 = C23455.f75962;
        this.f34328 = C23455.m51693(bArr, 257, 6, interfaceC1582);
        this.f34321 = C23455.m51693(bArr, 263, 2, interfaceC1582);
        this.f34326 = C23455.m51693(bArr, 265, 32, interfaceC1581);
        this.f34315 = C23455.m51693(bArr, 297, 32, interfaceC1581);
        byte b4 = this.f34324;
        if (b4 == 51 || b4 == 52) {
            this.f34333 = (int) C23455.m51700(329, 8, bArr);
            this.f34310 = (int) C23455.m51700(337, 8, bArr);
        }
        if (C2992.m8954(257, 6, "ustar ", bArr)) {
            this.f34313 = m25398(C23455.m51700(345, 12, bArr));
            this.f34320 = m25398(C23455.m51700(357, 12, bArr));
            this.f34325 = new ArrayList(C23455.m51699(386, 4, bArr));
            this.f34334 = bArr[482] == 1;
            this.f34316 = C23455.m51692(483, 12, bArr);
            return;
        }
        if (C2992.m8954(257, 6, "ustar\u0000", bArr) && (C2992.m8954(508, 4, "tar\u0000", bArr) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & GCMSIVBlockCipher.MASK) == 0 && b != 32))) || m25396(476, bArr) || m25396(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
            String strM51693 = C23455.m51693(bArr, 345, 131, interfaceC1581);
            if (!strM51693.isEmpty()) {
                StringBuilder sbM8976 = C3012.m8976(strM51693, "/");
                sbM8976.append(this.f34329);
                this.f34329 = sbM8976.toString();
            }
            this.f34313 = m25398(C23455.m51700(476, 12, bArr));
            this.f34320 = m25398(C23455.m51700(488, 12, bArr));
            return;
        }
        String strM51694 = C23455.m51693(bArr, 345, 155, interfaceC1581);
        if (m25430() && !this.f34329.endsWith("/")) {
            this.f34329 = C22697.m50267(new StringBuilder(), this.f34329, "/");
        }
        if (strM51694.isEmpty()) {
            return;
        }
        StringBuilder sbM8977 = C3012.m8976(strM51694, "/");
        sbM8977.append(this.f34329);
        this.f34329 = sbM8977.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25407(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.f34314 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25408(String str) {
        this.f34315 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25411(C16502 c16502) {
        C13638.requireNonNull(c16502, "time");
        this.f34327 = c16502;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25427(String str) {
        this.f34332 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25406(int i) {
        this.f34317 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25426(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "Size is out of range: "));
        }
        this.f34331 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25409(List list) {
        this.f34325 = list;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25403(String str) {
        this.f34326 = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25410(Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1916861932:
                    if (str.equals("SCHILY.devmajor")) {
                        b = 0;
                    }
                    break;
                case -1916619760:
                    if (str.equals("SCHILY.devminor")) {
                        b = 1;
                    }
                    break;
                case -277496563:
                    if (str.equals("GNU.sparse.realsize")) {
                        b = 2;
                    }
                    break;
                case -160380561:
                    if (str.equals("GNU.sparse.size")) {
                        b = 3;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 4;
                    }
                    break;
                case 115792:
                    if (str.equals(DhizukuVariables.PARAM_CLIENT_UID)) {
                        b = 5;
                    }
                    break;
                case 3433509:
                    if (str.equals(MotionUtils.EASING_TYPE_PATH)) {
                        b = 6;
                    }
                    break;
                case 3530753:
                    if (str.equals("size")) {
                        b = 7;
                    }
                    break;
                case 93141678:
                    if (str.equals("atime")) {
                        b = 8;
                    }
                    break;
                case 94988720:
                    if (str.equals("ctime")) {
                        b = 9;
                    }
                    break;
                case 98496370:
                    if (str.equals("gname")) {
                        b = 10;
                    }
                    break;
                case 104223930:
                    if (str.equals("mtime")) {
                        b = 11;
                    }
                    break;
                case 111425664:
                    if (str.equals("uname")) {
                        b = 12;
                    }
                    break;
                case 304222685:
                    if (str.equals("LIBARCHIVE.creationtime")) {
                        b = cb.k;
                    }
                    break;
                case 530706950:
                    if (str.equals("SCHILY.filetype")) {
                        b = cb.f77931l;
                    }
                    break;
                case 1195018015:
                    if (str.equals("linkpath")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    int iM3720 = C0958.m3720(str2);
                    if (iM3720 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                    }
                    if (iM3720 < 0) {
                        throw new IllegalArgumentException(C8479.m22141(iM3720, "Major device number is out of range: "));
                    }
                    this.f34333 = iM3720;
                    break;
                    break;
                case 1:
                    int iM3721 = C0958.m3720(str2);
                    if (iM3721 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                    }
                    if (iM3721 < 0) {
                        throw new IllegalArgumentException(C8479.m22141(iM3721, "Minor device number is out of range: "));
                    }
                    this.f34310 = iM3721;
                    break;
                    break;
                case 2:
                    this.f34319 = true;
                    this.f34318 = true;
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f34329 = (String) map.get("GNU.sparse.name");
                    }
                    if (map.containsKey("GNU.sparse.realsize")) {
                        this.f34316 = C0958.m3720((String) map.get("GNU.sparse.realsize"));
                    }
                    break;
                case 3:
                    this.f34319 = true;
                    this.f34316 = C0958.m3720((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f34329 = (String) map.get("GNU.sparse.name");
                    }
                    break;
                case 4:
                    this.f34312 = C0958.m3721(str2);
                    break;
                case 5:
                    this.f34309 = C0958.m3721(str2);
                    break;
                case 6:
                    m25422(str2);
                    break;
                case 7:
                    long jM3721 = C0958.m3721(str2);
                    if (jM3721 < 0) {
                        throw new IOException("Corrupted TAR archive. Entry size is negative");
                    }
                    m25426(jM3721);
                    break;
                    break;
                case 8:
                    this.f34313 = C16502.from(m25397(str2));
                    break;
                case 9:
                    this.f34320 = C16502.from(m25397(str2));
                    break;
                case 10:
                    this.f34315 = str2;
                    break;
                case 11:
                    m25411(C16502.from(m25397(str2)));
                    break;
                case 12:
                    this.f34326 = str2;
                    break;
                case 13:
                    this.f34323 = C16502.from(m25397(str2));
                    break;
                case 14:
                    if ("sparse".equals(str2)) {
                        this.f34330 = true;
                        if (map.containsKey("SCHILY.realsize")) {
                            this.f34316 = C0958.m3721((String) map.get("SCHILY.realsize"));
                        }
                    }
                    break;
                case 15:
                    this.f34332 = str2;
                    break;
                default:
                    this.f34322.put(str, str2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25412(byte[] bArr, InterfaceC1581 interfaceC1581, boolean z) {
        int iM25393 = m25393(this.f34331, bArr, m25393(this.f34312, bArr, m25393(this.f34309, bArr, m25393(this.f34317, bArr, C23455.m51691(this.f34329, bArr, 0, 100, interfaceC1581), 8, z), 8, z), 8, z), 12, z);
        C16502 c16502 = this.f34327;
        int i = C12954.f43065;
        int i2 = C2369.f8373;
        long j = 0;
        int iM25394 = m25393(c16502 != null ? c16502.to(TimeUnit.SECONDS) : 0L, bArr, iM25393, 12, z);
        int iM25395 = m25394(bArr, iM25394, UTF8.S_CS3, 8);
        bArr[iM25395] = this.f34324;
        int iM51691 = C23455.m51691(this.f34332, bArr, iM25395 + 1, 100, interfaceC1581);
        String str = this.f34328;
        InterfaceC1581 interfaceC1582 = C23455.f75962;
        int iM25396 = m25393(this.f34310, bArr, m25393(this.f34333, bArr, C23455.m51691(this.f34315, bArr, C23455.m51691(this.f34326, bArr, C23455.m51691(this.f34321, bArr, C23455.m51691(str, bArr, iM51691, 6, interfaceC1582), 2, interfaceC1582), 32, interfaceC1581), 32, interfaceC1581), 8, z), 8, z);
        if (z) {
            byte b = (byte) 0;
            int iM25397 = m25394(bArr, iM25396, b, 131);
            C16502 c16503 = this.f34313;
            int iM25398 = c16503 != null ? m25393(c16503.to(TimeUnit.SECONDS), bArr, iM25397, 12, true) : m25394(bArr, iM25397, b, 12);
            C16502 c16504 = this.f34320;
            iM25396 = m25394(bArr, m25394(bArr, c16504 != null ? m25393(c16504.to(TimeUnit.SECONDS), bArr, iM25398, 12, true) : m25394(bArr, iM25398, b, 12), b, 8), b, 4);
        }
        m25394(bArr, iM25396, (byte) 0, bArr.length - iM25396);
        for (byte b2 : bArr) {
            j += (long) (b2 & 255);
        }
        C23455.m51697(j, bArr, iM25394, 6);
        bArr[iM25394 + 6] = 0;
        bArr[iM25394 + 7] = UTF8.S_CS3;
    }
}
