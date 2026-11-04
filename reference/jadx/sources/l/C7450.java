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

/* JADX INFO: renamed from: l.ۜ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AHN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7450 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f24521 = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f24522;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f24523;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24524;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f24525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21813 f24526;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f24527;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24528;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f24529;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21813 f24530;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f24531;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24532;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f24533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f24534;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24535;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21813 f24536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f24537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f24538;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f24539;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f24540;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f24541;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21813 f24543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24544;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f24545;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f24546;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f24547;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20409(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            int i3 = i2 - 1;
            C1639.m5801(0L, bArr, i, i3);
            bArr[i3 + i] = UTF8.S_CS3;
        } else {
            int i4 = C1639.f5665;
            long j2 = i2 == 8 ? 2097151L : 8589934591L;
            boolean z2 = j < 0;
            if (!z2 && j <= j2) {
                int i5 = i2 - 1;
                C1639.m5801(j, bArr, i, i5);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21813 m20413(long j) {
        if (j <= 0) {
            return null;
        }
        int i = C20284.f65131;
        return C21813.from(j, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20437(String str) {
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        this.f24541 = strReplace;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C0358 m20414(String str) throws IOException {
        if (!f24521.matcher(str).matches()) {
            throw new IOException(C14442.m34865("Corrupted PAX header. Time field value is invalid '", str, "'"));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return C0358.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
        } catch (ArithmeticException | C21241 e) {
            throw new IOException(C14442.m34865("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
        }
    }

    public C7450() {
        this.f24541 = "";
        this.f24538 = "";
        this.f24545 = "ustar\u0000";
        this.f24529 = ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
        this.f24531 = "";
        this.f24527 = new HashMap();
        this.f24540 = -1L;
        String property = System.getProperty("user.name", "");
        this.f24522 = property.length() > 31 ? property.substring(0, 31) : property;
    }

    public C7450(HashMap map, byte[] bArr, InterfaceC24760 interfaceC24760) throws IOException {
        this();
        try {
            m20411(map, bArr, interfaceC24760);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public C7450(String str) {
        this();
        String strReplace = str.replace(File.separatorChar, '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        boolean zEndsWith = strReplace.endsWith("/");
        this.f24541 = strReplace;
        this.f24524 = zEndsWith ? 16877 : 33188;
        this.f24537 = zEndsWith ? (byte) 53 : UTF8.S_P3A;
        this.f24536 = C21813.from(C0358.now());
        this.f24522 = "";
    }

    public C7450(byte b, String str) {
        this(str);
        this.f24537 = b;
        if (b == 76) {
            this.f24545 = "ustar ";
            this.f24529 = " \u0000";
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && C7450.class == obj.getClass() && this.f24541.equals(((C7450) obj).f24541);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20410(byte[] bArr, int i, byte b, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21813 m20421() {
        return this.f24543;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m20451() {
        return this.f24540;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m20436() {
        return this.f24535;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m20454() {
        return this.f24533;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map m20448() {
        return C4681.unmodifiableMap(this.f24527);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m20442() {
        return this.f24531;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21813 m20440() {
        return this.f24526;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21813 m20429() {
        return this.f24536;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m20417() {
        return this.f24537;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m20438() {
        return this.f24538;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m20458() {
        return this.f24523;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m20444() {
        return this.f24539;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m20443() {
        return this.f24524;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Date m20445() {
        C21813 c21813 = this.f24536;
        int i = C20284.f65131;
        if (c21813 != null) {
            return new Date(c21813.toMillis());
        }
        return null;
    }

    public final int hashCode() {
        return this.f24541.hashCode();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m20456() {
        return this.f24541;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List m20419() throws IOException {
        List list = this.f24534;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list2 = (List) C1170.stream(this.f24534).filter(new C1368(2)).sorted(C2661.comparingLong(new C17274(1))).collect(C2025.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C19538 c19538 = (C19538) list2.get(i);
            i++;
            if (i < size) {
                if (c19538.m45069() + c19538.m45070() > ((C19538) list2.get(i)).m45070()) {
                    throw new IOException(C8947.m23910(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), this.f24541, " overlap each other."));
                }
            }
            if (c19538.m45069() + c19538.m45070() < 0) {
                throw new IOException(C8947.m23910(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), this.f24541, " too large."));
            }
        }
        if (!list2.isEmpty()) {
            C19538 c19539 = (C19538) list2.get(size - 1);
            if (c19539.m45069() + c19539.m45070() > m20449()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m20449() {
        if (m20433()) {
            return this.f24546;
        }
        return this.f24525;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m20439() {
        return this.f24525;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List m20430() {
        return this.f24534;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C21813 m20457() {
        return this.f24530;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m20420() {
        return this.f24522;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m20441() {
        return this.f24544;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m20450() {
        if (this.f24537 == 53) {
            return true;
        }
        return (m20418() || m20435() || !this.f24541.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m20446() {
        return this.f24547;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m20415() {
        byte b = this.f24537;
        if (b == 0 || b == 48) {
            return true;
        }
        return (b == 53 || this.f24541.endsWith("/")) ? false : true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m20435() {
        return this.f24537 == 103;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m20432() {
        return this.f24537 == 75;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m20447() {
        return this.f24537 == 76;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m20433() {
        return m20416() || this.f24528 || this.f24542;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20412(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20416() {
        return this.f24537 == 83;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m20434() {
        return this.f24532;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m20418() {
        byte b = this.f24537;
        return b == 120 || b == 88;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20431() {
        return this.f24537 == 50;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20411(Map map, byte[] bArr, InterfaceC24760 interfaceC24760) throws IOException {
        String str;
        byte b;
        this.f24541 = C1639.m5797(bArr, 0, 100, interfaceC24760);
        this.f24524 = (int) C1639.m5804(100, 8, bArr);
        this.f24539 = (int) C1639.m5804(108, 8, bArr);
        this.f24523 = (int) C1639.m5804(116, 8, bArr);
        long jM5804 = C1639.m5804(124, 12, bArr);
        this.f24525 = jM5804;
        long j = 0;
        if (jM5804 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        long jM5805 = C1639.m5804(136, 12, bArr);
        int i = C20284.f65131;
        this.f24536 = C21813.from(jM5805, TimeUnit.SECONDS);
        int i2 = 148;
        long jM5796 = C1639.m5796(148, 8, bArr);
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
        this.f24544 = jM5796 == j || jM5796 == j2;
        this.f24537 = bArr[156];
        this.f24538 = C1639.m5797(bArr, 157, 100, interfaceC24760);
        InterfaceC24760 interfaceC24761 = C1639.f5666;
        this.f24545 = C1639.m5797(bArr, 257, 6, interfaceC24761);
        this.f24529 = C1639.m5797(bArr, 263, 2, interfaceC24761);
        this.f24522 = C1639.m5797(bArr, 265, 32, interfaceC24760);
        this.f24531 = C1639.m5797(bArr, 297, 32, interfaceC24760);
        byte b4 = this.f24537;
        if (b4 == 51 || b4 == 52) {
            this.f24535 = (int) C1639.m5804(329, 8, bArr);
            this.f24533 = (int) C1639.m5804(337, 8, bArr);
        }
        if (C17300.m40626(257, 6, "ustar ", bArr)) {
            this.f24526 = m20413(C1639.m5804(345, 12, bArr));
            this.f24530 = m20413(C1639.m5804(357, 12, bArr));
            this.f24534 = new ArrayList(C1639.m5803(386, 4, bArr));
            this.f24547 = bArr[482] == 1;
            this.f24546 = C1639.m5796(483, 12, bArr);
            return;
        }
        if (C17300.m40626(257, 6, "ustar\u0000", bArr) && (C17300.m40626(508, 4, "tar\u0000", bArr) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & GCMSIVBlockCipher.MASK) == 0 && b != 32))) || m20412(476, bArr) || m20412(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
            String strM5797 = C1639.m5797(bArr, 345, 131, interfaceC24760);
            if (!strM5797.isEmpty()) {
                StringBuilder sbM10405 = C3188.m10405(strM5797, "/");
                sbM10405.append(this.f24541);
                this.f24541 = sbM10405.toString();
            }
            this.f24526 = m20413(C1639.m5804(476, 12, bArr));
            this.f24530 = m20413(C1639.m5804(488, 12, bArr));
            return;
        }
        String strM5798 = C1639.m5797(bArr, 345, 155, interfaceC24760);
        if (m20450() && !this.f24541.endsWith("/")) {
            this.f24541 = C8947.m23910(new StringBuilder(), this.f24541, "/");
        }
        if (strM5798.isEmpty()) {
            return;
        }
        StringBuilder sbM10406 = C3188.m10405(strM5798, "/");
        sbM10406.append(this.f24541);
        this.f24541 = sbM10406.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20423(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.f24540 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20424(String str) {
        this.f24531 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20427(C21813 c21813) {
        C17359.requireNonNull(c21813, "time");
        this.f24536 = c21813;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20453(String str) {
        this.f24538 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20422(int i) {
        this.f24524 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20452(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "Size is out of range: "));
        }
        this.f24525 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20425(List list) {
        this.f24534 = list;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20455(String str) {
        this.f24522 = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20426(Map map) throws IOException {
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
                        b = cb.f82047l;
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
                    int iM53568 = C24014.m53568(str2);
                    if (iM53568 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                    }
                    if (iM53568 < 0) {
                        throw new IllegalArgumentException(C13645.m33382(iM53568, "Major device number is out of range: "));
                    }
                    this.f24535 = iM53568;
                    break;
                    break;
                case 1:
                    int iM53569 = C24014.m53568(str2);
                    if (iM53569 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                    }
                    if (iM53569 < 0) {
                        throw new IllegalArgumentException(C13645.m33382(iM53569, "Minor device number is out of range: "));
                    }
                    this.f24533 = iM53569;
                    break;
                    break;
                case 2:
                    this.f24528 = true;
                    this.f24532 = true;
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f24541 = (String) map.get("GNU.sparse.name");
                    }
                    if (map.containsKey("GNU.sparse.realsize")) {
                        this.f24546 = C24014.m53568((String) map.get("GNU.sparse.realsize"));
                    }
                    break;
                case 3:
                    this.f24528 = true;
                    this.f24546 = C24014.m53568((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f24541 = (String) map.get("GNU.sparse.name");
                    }
                    break;
                case 4:
                    this.f24523 = C24014.m53569(str2);
                    break;
                case 5:
                    this.f24539 = C24014.m53569(str2);
                    break;
                case 6:
                    m20437(str2);
                    break;
                case 7:
                    long jM53569 = C24014.m53569(str2);
                    if (jM53569 < 0) {
                        throw new IOException("Corrupted TAR archive. Entry size is negative");
                    }
                    m20452(jM53569);
                    break;
                    break;
                case 8:
                    this.f24526 = C21813.from(m20414(str2));
                    break;
                case 9:
                    this.f24530 = C21813.from(m20414(str2));
                    break;
                case 10:
                    this.f24531 = str2;
                    break;
                case 11:
                    m20427(C21813.from(m20414(str2)));
                    break;
                case 12:
                    this.f24522 = str2;
                    break;
                case 13:
                    this.f24543 = C21813.from(m20414(str2));
                    break;
                case 14:
                    if ("sparse".equals(str2)) {
                        this.f24542 = true;
                        if (map.containsKey("SCHILY.realsize")) {
                            this.f24546 = C24014.m53569((String) map.get("SCHILY.realsize"));
                        }
                    }
                    break;
                case 15:
                    this.f24538 = str2;
                    break;
                default:
                    this.f24527.put(str, str2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20428(byte[] bArr, InterfaceC24760 interfaceC24760, boolean z) {
        int iM20409 = m20409(this.f24525, bArr, m20409(this.f24523, bArr, m20409(this.f24539, bArr, m20409(this.f24524, bArr, C1639.m5795(this.f24541, bArr, 0, 100, interfaceC24760), 8, z), 8, z), 8, z), 12, z);
        C21813 c21813 = this.f24536;
        int i = C3876.f13224;
        int i2 = C20284.f65131;
        long j = 0;
        int iM204010 = m20409(c21813 != null ? c21813.to(TimeUnit.SECONDS) : 0L, bArr, iM20409, 12, z);
        int iM20410 = m20410(bArr, iM204010, UTF8.S_CS3, 8);
        bArr[iM20410] = this.f24537;
        int iM5795 = C1639.m5795(this.f24538, bArr, iM20410 + 1, 100, interfaceC24760);
        String str = this.f24545;
        InterfaceC24760 interfaceC24761 = C1639.f5666;
        int iM204011 = m20409(this.f24533, bArr, m20409(this.f24535, bArr, C1639.m5795(this.f24531, bArr, C1639.m5795(this.f24522, bArr, C1639.m5795(this.f24529, bArr, C1639.m5795(str, bArr, iM5795, 6, interfaceC24761), 2, interfaceC24761), 32, interfaceC24760), 32, interfaceC24760), 8, z), 8, z);
        if (z) {
            byte b = (byte) 0;
            int iM20411 = m20410(bArr, iM204011, b, 131);
            C21813 c21814 = this.f24526;
            int iM204012 = c21814 != null ? m20409(c21814.to(TimeUnit.SECONDS), bArr, iM20411, 12, true) : m20410(bArr, iM20411, b, 12);
            C21813 c21815 = this.f24530;
            iM204011 = m20410(bArr, m20410(bArr, c21815 != null ? m20409(c21815.to(TimeUnit.SECONDS), bArr, iM204012, 12, true) : m20410(bArr, iM204012, b, 12), b, 8), b, 4);
        }
        m20410(bArr, iM204011, (byte) 0, bArr.length - iM204011);
        for (byte b2 : bArr) {
            j += (long) (b2 & 255);
        }
        C1639.m5801(j, bArr, iM204010, 6);
        bArr[iM204010 + 6] = 0;
        bArr[iM204010 + 7] = UTF8.S_CS3;
    }
}
