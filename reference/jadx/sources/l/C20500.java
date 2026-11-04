package l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.timepicker.TimeModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5DR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20500 implements Cloneable {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public byte f65662;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f65672;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f65680;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65681;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f65682;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final C20528 f65655 = new C20528(2);

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65653 = Pattern.compile("(\\d+)x(\\d+)");

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65652 = Pattern.compile("(\\d+)dpi");

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final int[][] f65648 = {new int[]{19, 1}, new int[]{12, 4}, new int[]{16, 3}, new int[]{20, 4}, new int[]{24, 4}, new int[]{28, 1}, new int[]{48, 1}, new int[]{49, 1}, new int[]{29, 1}, new int[]{30, 2}, new int[]{32, 4}};

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f65650 = {'e', 'n'};

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f65649 = {'U', 'S'};

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f65654 = {173, 5};

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f65651 = {'t', 'l'};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC18262 f65667 = EnumC18262.AOSP;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f65666 = new byte[3];

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public short f65670 = 0;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public short f65686 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public char[] f65659 = new char[2];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f65684 = new char[2];

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public byte f65673 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public byte f65664 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65656 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte f65668 = 0;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public byte f65676 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte f65657 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte f65669 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f65677 = 0;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f65671 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public short f65660 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte f65678 = 0;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte f65688 = 0;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f65683 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f65687 = 0;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f65689 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public char[] f65674 = new char[4];

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public char[] f65685 = new char[8];

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public byte f65679 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f65675 = 0;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public short f65658 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public char[] f65665 = new char[8];

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public byte[] f65661 = null;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f65663 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46995(int i, int i2) {
        if ((i & i2) == 0) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m47007(byte b, byte b2, char c) {
        if (((b >> 7) & 1) != 1) {
            return new char[]{(char) b, (char) b2};
        }
        return new char[]{(char) ((b2 & bo.j) + c), (char) (((b2 & bo.k) >> 5) + ((b & 3) << 3) + c), (char) (((b & 124) >> 2) + c)};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20500 m47001(C16618 c16618, EnumC18262 enumC18262) throws IOException {
        C20500 c20500 = new C20500();
        C17359.requireNonNull(enumC18262);
        c20500.f65667 = enumC18262;
        c20500.m47004(c16618);
        return c20500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20500 m47000(String str, EnumC18262 enumC18262) throws Exception {
        C20500 c20500 = new C20500();
        C17359.requireNonNull(enumC18262);
        c20500.f65667 = enumC18262;
        c20500.m47002(str);
        return c20500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC18262 m47021() {
        return this.f65667;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private byte[] m47015() {
        int length;
        byte[] bArr = this.f65680;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f65661;
        byte[] bArr3 = this.f65666;
        if (bArr2 != null) {
            length = this.f65667.f59590 + bArr2.length;
        } else {
            if (this.f65672 != 0 || this.f65681 != 0 || this.f65682 != 0 || this.f65662 != 0 || !m47010(this.f65665)) {
                length = this.f65667.f59590;
                break;
            }
            int length2 = bArr3.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    if (this.f65679 != 0 || this.f65675 != 0 || this.f65658 != 0) {
                        length = 52;
                        break;
                    }
                    if (!m47010(this.f65674) || !m47010(this.f65685)) {
                        length = 48;
                        break;
                    }
                    if (this.f65687 != 0 || this.f65689 != 0) {
                        length = 36;
                        break;
                    }
                    if (this.f65678 != 0 || this.f65688 != 0 || this.f65683 != 0) {
                        length = 32;
                        break;
                    }
                    length = 28;
                    break;
                }
                if (bArr3[i] != 0) {
                    length = this.f65667.f59590;
                    break;
                }
                i++;
            }
        }
        int i2 = length - 4;
        C6178 c6178 = new C6178(i2);
        c6178.mo17788(this.f65670);
        c6178.mo17788(this.f65686);
        byte[] bArr4 = new byte[2];
        m47005(bArr4, this.f65659, 'a');
        c6178.write(bArr4, 0, 2);
        m47005(bArr4, this.f65684, '0');
        c6178.write(bArr4, 0, 2);
        c6178.writeByte(this.f65673);
        c6178.writeByte(this.f65664);
        c6178.mo17812(this.f65656);
        c6178.writeByte(this.f65668);
        c6178.writeByte(this.f65676);
        c6178.writeByte(this.f65657);
        c6178.writeByte(this.f65669);
        c6178.mo17812(this.f65677);
        c6178.mo17812(this.f65671);
        c6178.mo17788(this.f65660);
        c6178.mo17788((short) 0);
        if (length >= 32) {
            c6178.writeByte(this.f65678);
            c6178.writeByte(this.f65688);
            c6178.mo17812(this.f65683);
        }
        if (length >= 36) {
            c6178.mo17812(this.f65687);
            c6178.mo17812(this.f65689);
        }
        if (length >= 48) {
            byte[] bArr5 = new byte[12];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr5[i3] = (byte) this.f65674[i3];
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bArr5[i4 + 4] = (byte) this.f65685[i4];
            }
            c6178.write(bArr5, 0, 12);
        }
        if (length >= 52) {
            c6178.writeByte(this.f65679);
            c6178.writeByte(this.f65675);
            c6178.mo17788(this.f65658);
        }
        EnumC18262 enumC18262 = this.f65667;
        if (enumC18262 == EnumC18262.MOTOROLA_76 && length >= enumC18262.f59590) {
            c6178.writeInt(this.f65672);
            c6178.writeInt(this.f65681);
            c6178.writeInt(this.f65682);
        }
        if (length >= this.f65667.f59590) {
            c6178.writeByte(this.f65662);
            for (char c : this.f65665) {
                c6178.writeByte((byte) c);
            }
            c6178.write(bArr3);
        }
        if (length > this.f65667.f59590) {
            c6178.write(this.f65661);
        }
        byte[] bArrM17796 = c6178.m17796();
        this.f65680 = bArrM17796;
        if (bArrM17796.length == i2) {
            return bArrM17796;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47020(C20500 c20500) {
        int iCompare;
        byte[] bArrM47015 = m47015();
        byte[] bArrM47016 = c20500.m47015();
        int iM46996 = m46996(4, 4, bArrM47015, bArrM47016);
        if (iM46996 != 0) {
            return iM46996;
        }
        int iM46997 = m46996(8, 4, bArrM47015, bArrM47016);
        if (iM46997 != 0) {
            return iM46997;
        }
        int i = 36;
        while (true) {
            if (i >= 40) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 8) {
                        iCompare = 0;
                        break;
                    }
                    int i3 = 40 + i2;
                    iCompare = Integer.compare(m46997(i3, bArrM47015), m46997(i3, bArrM47016));
                    if (iCompare != 0) {
                        break;
                    }
                    i2++;
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = 0;
                for (int i4 = 0; i4 < 8 && iCompare2 == 0; i4++) {
                    iCompare2 = Integer.compare(this.f65665[i4], c20500.f65665[i4]);
                }
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                for (int[] iArr : f65648) {
                    int iM46998 = m46996(iArr[0], iArr[1], bArrM47015, bArrM47016);
                    if (iM46998 != 0) {
                        return iM46998;
                    }
                }
                int iCompare3 = Integer.compare(this.f65667.ordinal(), c20500.f65667.ordinal());
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                if (this.f65667 == EnumC18262.MOTOROLA_76) {
                    for (int i5 = 52; i5 < 64; i5 += 4) {
                        int iM46999 = m46996(i5, 4, bArrM47015, bArrM47016);
                        if (iM46999 != 0) {
                            return iM46999;
                        }
                    }
                }
                return 0;
            }
            int iCompare4 = Integer.compare(this.f65662 != 0 ? 0 : m46997(i, bArrM47015), c20500.f65662 == 0 ? m46997(i, bArrM47016) : 0);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46997(int i, byte[] bArr) {
        int i2 = i - 4;
        if (i2 < bArr.length) {
            return bArr[i2] & 255;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46996(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iCompare;
        do {
            i2--;
            if (i2 < 0) {
                return 0;
            }
            int i3 = i + i2;
            iCompare = Integer.compare(m46997(i3, bArr), m46997(i3, bArr2));
        } while (iCompare == 0);
        return iCompare;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m47024() {
        return m47015().length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47022(InterfaceC23332 interfaceC23332) {
        byte[] bArrM47015 = m47015();
        interfaceC23332.writeInt(bArrM47015.length + 4);
        interfaceC23332.write(bArrM47015);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47004(C16618 c16618) throws IOException {
        int i;
        int iM39316 = c16618.m39316();
        if (iM39316 < 8) {
            throw new IOException(C14442.m34864(iM39316, "Config size = ", " is too small"));
        }
        if (iM39316 > 255) {
            iM39316 = Math.min(this.f65667.f59590, c16618.m39305());
        }
        byte[] bArr = new byte[iM39316 - 4];
        try {
            c16618.m39306(bArr);
            C20348 c20348 = new C20348(bArr);
            this.f65670 = c20348.readShort();
            this.f65686 = c20348.readShort();
            if (iM39316 >= 12) {
                this.f65659 = m47007(c20348.readByte(), c20348.readByte(), 'a');
                this.f65684 = m47007(c20348.readByte(), c20348.readByte(), '0');
            } else {
                this.f65659 = new char[2];
                this.f65684 = new char[2];
            }
            if (iM39316 >= 14) {
                this.f65673 = c20348.readByte();
                this.f65664 = c20348.readByte();
            }
            if (iM39316 >= 16) {
                this.f65656 = c20348.m46749();
            }
            if (iM39316 >= 28) {
                this.f65668 = c20348.readByte();
                this.f65676 = c20348.readByte();
                this.f65657 = c20348.readByte();
                this.f65669 = c20348.readByte();
                this.f65677 = c20348.m46749();
                this.f65671 = c20348.m46749();
                this.f65660 = c20348.readShort();
                c20348.skipBytes(2);
            }
            if (iM39316 >= 32) {
                this.f65678 = c20348.readByte();
                this.f65688 = c20348.readByte();
                this.f65683 = c20348.m46749();
            }
            if (iM39316 >= 36) {
                this.f65687 = c20348.m46749();
                this.f65689 = c20348.m46749();
            }
            if (iM39316 >= 48) {
                char[] cArr = new char[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    cArr[i2] = (char) c20348.readByte();
                }
                this.f65674 = cArr;
                char[] cArr2 = new char[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    cArr2[i3] = (char) c20348.readByte();
                }
                this.f65685 = cArr2;
            }
            if (iM39316 >= 52) {
                this.f65679 = c20348.readByte();
                this.f65675 = c20348.readByte();
                this.f65658 = c20348.readShort();
            }
            if (this.f65667 == EnumC18262.MOTOROLA_76 && iM39316 > 52) {
                if (iM39316 < 76) {
                    throw new IOException("Truncated Motorola config");
                }
                this.f65672 = c20348.readInt();
                this.f65681 = c20348.readInt();
                this.f65682 = c20348.readInt();
            }
            int i4 = this.f65667.f59590 - 12;
            if (iM39316 > i4) {
                this.f65662 = c20348.readByte();
                int i5 = 0;
                while (true) {
                    i = iM39316 - i4;
                    if (i5 >= Math.min(8, i - 1)) {
                        break;
                    }
                    this.f65665[i5] = (char) (c20348.readByte() & 255);
                    i5++;
                }
                for (int i6 = 0; i6 < Math.min(3, i - 9); i6++) {
                    this.f65666[i6] = c20348.readByte();
                }
            }
            int i7 = iM39316 - this.f65667.f59590;
            if (i7 > 0) {
                byte[] bArr2 = new byte[i7];
                c20348.m46745(i7, bArr2);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (bArr2[i8] != 0) {
                        this.f65661 = bArr2;
                        return;
                    }
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x0367  */
    /* JADX WARN: Code duplicated, block: B:440:0x077d  */
    /* JADX WARN: Code duplicated, block: B:484:0x0869  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47002(String str) throws Exception {
        int iM46995;
        int iM46996;
        int iM46997;
        byte b;
        StringBuilder sb;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        String str2 = str;
        if (str.isEmpty()) {
            return;
        }
        Matcher matcher = f65652.matcher("");
        Matcher matcher2 = f65653.matcher("");
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit = str2.split("-");
        int length = strArrSplit.length;
        int i3 = 0;
        byte[] bArr = null;
        boolean z4 = true;
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i3 < length) {
            String str3 = strArrSplit[i3];
            if (!z4) {
                if (!str3.startsWith("unknown")) {
                    sb2.append('-');
                    sb2.append(str3);
                }
                switch (str3.hashCode()) {
                    case -2097775141:
                        if (str3.equals("smallui")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -2090048083:
                        if (str3.equals("appliance")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1619189395:
                        if (str3.equals("xxxhdpi")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1412647951:
                        if (str3.equals("anydpi")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1317750766:
                        if (str3.equals("television")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1274444951:
                        if (str3.equals("finger")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1217394256:
                        if (str3.equals("highdr")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1206314369:
                        if (str3.equals("hugeui")) {
                            b = 7;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1186939235:
                        if (str3.equals("navexposed")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1048884797:
                        if (str3.equals("neuter")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1039961291:
                        if (str3.equals("nokeys")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1039745817:
                        if (str3.equals("normal")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case -946852072:
                        if (str3.equals("qwerty")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case -919025594:
                        if (str3.equals("vrheadset")) {
                            b = cb.k;
                        } else {
                            b = -1;
                        }
                        break;
                    case -900164407:
                        if (str3.equals("mediumui")) {
                            b = cb.f82047l;
                        } else {
                            b = -1;
                        }
                        break;
                    case -894674659:
                        if (str3.equals("square")) {
                            b = 15;
                        } else {
                            b = -1;
                        }
                        break;
                    case -891774254:
                        if (str3.equals("stylus")) {
                            b = 16;
                        } else {
                            b = -1;
                        }
                        break;
                    case -788049289:
                        if (str3.equals("widecg")) {
                            b = 17;
                        } else {
                            b = -1;
                        }
                        break;
                    case -756726333:
                        if (str3.equals("xlarge")) {
                            b = 18;
                        } else {
                            b = -1;
                        }
                        break;
                    case -745448715:
                        if (str3.equals("xxhdpi")) {
                            b = 19;
                        } else {
                            b = -1;
                        }
                        break;
                    case -260762235:
                        if (str3.equals("masculine")) {
                            b = 20;
                        } else {
                            b = -1;
                        }
                        break;
                    case -48371953:
                        if (str3.equals("largeui")) {
                            b = 21;
                        } else {
                            b = -1;
                        }
                        break;
                    case 98260:
                        if (str3.equals("car")) {
                            b = 22;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3079833:
                        if (str3.equals("desk")) {
                            b = 23;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3089839:
                        if (str3.equals("dpad")) {
                            b = 24;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3197941:
                        if (str3.equals("hdpi")) {
                            b = 25;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3314155:
                        if (str3.equals("land")) {
                            b = 26;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3317105:
                        if (str3.equals("ldpi")) {
                            b = 27;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3327612:
                        if (str3.equals(ClassTransform.LONG)) {
                            b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3346896:
                        if (str3.equals("mdpi")) {
                            b = 29;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3446913:
                        if (str3.equals("port")) {
                            b = 30;
                        } else {
                            b = -1;
                        }
                        break;
                    case 42514893:
                        if (str3.equals("feminine")) {
                            b = bo.j;
                        } else {
                            b = -1;
                        }
                        break;
                    case 46848158:
                        if (str3.equals("12key")) {
                            b = UTF8.S_CS3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102742843:
                        if (str3.equals("large")) {
                            b = PublicSuffixDatabase.EXCEPTION_MARKER;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102826866:
                        if (str3.equals("ldltr")) {
                            b = 34;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102832626:
                        if (str3.equals("ldrtl")) {
                            b = 35;
                        } else {
                            b = -1;
                        }
                        break;
                    case 103164642:
                        if (str3.equals("lowdr")) {
                            b = 36;
                        } else {
                            b = -1;
                        }
                        break;
                    case 104817688:
                        if (str3.equals("night")) {
                            b = 37;
                        } else {
                            b = -1;
                        }
                        break;
                    case 104993788:
                        if (str3.equals("nodpi")) {
                            b = 38;
                        } else {
                            b = -1;
                        }
                        break;
                    case 105002946:
                        if (str3.equals("nonav")) {
                            b = 39;
                        } else {
                            b = -1;
                        }
                        break;
                    case 108704142:
                        if (str3.equals("round")) {
                            b = 40;
                        } else {
                            b = -1;
                        }
                        break;
                    case 109548807:
                        if (str3.equals("small")) {
                            b = 41;
                        } else {
                            b = -1;
                        }
                        break;
                    case 110743451:
                        if (str3.equals("tvdpi")) {
                            b = 42;
                        } else {
                            b = -1;
                        }
                        break;
                    case 112903375:
                        if (str3.equals("watch")) {
                            b = 43;
                        } else {
                            b = -1;
                        }
                        break;
                    case 113097563:
                        if (str3.equals("wheel")) {
                            b = 44;
                        } else {
                            b = -1;
                        }
                        break;
                    case 114020461:
                        if (str3.equals("xhdpi")) {
                            b = 45;
                        } else {
                            b = -1;
                        }
                        break;
                    case 218717356:
                        if (str3.equals("keysexposed")) {
                            b = 46;
                        } else {
                            b = -1;
                        }
                        break;
                    case 372752234:
                        if (str3.equals("godzillaui")) {
                            b = 47;
                        } else {
                            b = -1;
                        }
                        break;
                    case 519571486:
                        if (str3.equals("keyssoft")) {
                            b = UTF8.S_P3A;
                        } else {
                            b = -1;
                        }
                        break;
                    case 726114445:
                        if (str3.equals("navhidden")) {
                            b = 49;
                        } else {
                            b = -1;
                        }
                        break;
                    case 730225098:
                        if (str3.equals("trackball")) {
                            b = 50;
                        } else {
                            b = -1;
                        }
                        break;
                    case 771458206:
                        if (str3.equals("keyshidden")) {
                            b = 51;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1590068517:
                        if (str3.equals("notnight")) {
                            b = 52;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1593954971:
                        if (str3.equals("notround")) {
                            b = 53;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1671187320:
                        if (str3.equals("nowidecg")) {
                            b = 54;
                        } else {
                            b = -1;
                        }
                        break;
                    case 2129448911:
                        if (str3.equals("notlong")) {
                            b = 55;
                        } else {
                            b = -1;
                        }
                        break;
                    case 2129543710:
                        if (str3.equals("notouch")) {
                            b = 56;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        this.f65688 = (byte) (this.f65688 | 12);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 1:
                        this.f65688 = (byte) (this.f65688 | 5);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 2:
                        this.f65656 = 640;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 3:
                        this.f65656 = 65534;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 4:
                        this.f65688 = (byte) (this.f65688 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 5:
                        this.f65664 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 6:
                        this.f65675 = (byte) (this.f65675 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 7:
                        this.f65688 = (byte) (this.f65688 | 15);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 8:
                        this.f65657 = (byte) (this.f65657 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 9:
                        this.f65669 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 10:
                        this.f65668 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 11:
                        this.f65678 = (byte) (this.f65678 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 12:
                        this.f65668 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 13:
                        this.f65688 = (byte) (this.f65688 | 7);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 14:
                        this.f65688 = (byte) (this.f65688 | cb.k);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 15:
                        this.f65673 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 16:
                        this.f65664 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 17:
                        this.f65675 = (byte) (this.f65675 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 18:
                        this.f65678 = (byte) (this.f65678 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 19:
                        this.f65656 = 480;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 20:
                        this.f65669 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 21:
                        this.f65688 = (byte) (this.f65688 | cb.f82047l);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 22:
                        this.f65688 = (byte) (this.f65688 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 23:
                        this.f65688 = (byte) (this.f65688 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 24:
                        this.f65676 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 25:
                        this.f65656 = 240;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 26:
                        this.f65673 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 27:
                        this.f65656 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 28:
                        this.f65678 = (byte) (this.f65678 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 29:
                        this.f65656 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 30:
                        this.f65673 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 31:
                        this.f65669 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 32:
                        this.f65668 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 33:
                        this.f65678 = (byte) (this.f65678 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 34:
                        this.f65678 = (byte) (this.f65678 | 64);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 35:
                        this.f65678 = (byte) (this.f65678 | GCMSIVBlockCipher.MASK);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 36:
                        this.f65675 = (byte) (this.f65675 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 37:
                        this.f65688 = (byte) (this.f65688 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 38:
                        this.f65656 = 65535;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 39:
                        this.f65676 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 40:
                        this.f65679 = (byte) (this.f65679 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 41:
                        this.f65678 = (byte) (this.f65678 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 42:
                        this.f65656 = 213;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 43:
                        this.f65688 = (byte) (this.f65688 | 6);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 44:
                        this.f65676 = (byte) 4;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        this.f65656 = 320;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 46:
                        this.f65657 = (byte) (this.f65657 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 47:
                        this.f65688 = (byte) (this.f65688 | 11);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 48:
                        this.f65657 = (byte) (this.f65657 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 49:
                        this.f65657 = (byte) (this.f65657 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 50:
                        this.f65676 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 51:
                        this.f65657 = (byte) (this.f65657 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 52:
                        this.f65688 = (byte) (this.f65688 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 53:
                        this.f65679 = (byte) (this.f65679 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        this.f65675 = (byte) (this.f65675 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        this.f65678 = (byte) (this.f65678 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 56:
                        this.f65664 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    default:
                        if (str3.startsWith("mcc")) {
                            this.f65670 = Short.parseShort(str3.substring(3));
                        } else if (str3.startsWith("mnc")) {
                            short s = Short.parseShort(str3.substring(3));
                            this.f65686 = s;
                            if (s == 0) {
                                this.f65686 = (short) -1;
                            }
                        } else if (str3.matches("[a-z]{2,3}")) {
                            this.f65659 = str3.toCharArray();
                        } else if (str3.matches("r[A-Z0-9]{2}")) {
                            this.f65684 = str3.substring(1).toCharArray();
                        } else if (str3.startsWith("b+")) {
                            String[] strArrSplit2 = str3.substring(2).split("\\+");
                            C0594 c0594 = new C0594(4);
                            int i5 = 0;
                            while (i5 < strArrSplit2.length) {
                                String str4 = strArrSplit2[i5];
                                boolean z8 = z4;
                                char[] charArray = str4.toCharArray();
                                StringBuilder sb3 = sb2;
                                if (c0594.add(0)) {
                                    z3 = z5;
                                    if (charArray.length == 2 || charArray.length == 3) {
                                        this.f65659 = charArray;
                                    }
                                    i5++;
                                    z4 = z8;
                                    sb2 = sb3;
                                    z5 = z3;
                                } else {
                                    z3 = z5;
                                }
                                if (c0594.add(1) && charArray.length == 4) {
                                    this.f65674 = charArray;
                                } else {
                                    if (c0594.add(2)) {
                                        if (charArray.length != 2) {
                                            i = 3;
                                            if (charArray.length == 3) {
                                            }
                                        }
                                        this.f65684 = charArray;
                                    } else {
                                        i = 3;
                                    }
                                    if (c0594.add(i) && charArray.length >= 5 && charArray.length <= 8) {
                                        this.f65685 = Arrays.copyOf(charArray, 8);
                                    } else {
                                        if (!c0594.add(4) || (i2 = i5 + 2) >= strArrSplit2.length || !str4.equals(am.aH) || !strArrSplit2[i5 + 1].equals("nu") || strArrSplit2[i2].isEmpty()) {
                                            throw new Exception(str3);
                                        }
                                        if (z7) {
                                            throw new Exception("Duplicate numbering system: ".concat(str3));
                                        }
                                        char[] charArray2 = strArrSplit2[i2].toCharArray();
                                        if (!m47017(charArray2)) {
                                            throw new Exception("Invalid numbering system: ".concat(str3));
                                        }
                                        this.f65665 = Arrays.copyOf(charArray2, 8);
                                        i5 = i2;
                                        z7 = true;
                                    }
                                }
                                i5++;
                                z4 = z8;
                                sb2 = sb3;
                                z5 = z3;
                            }
                            sb = sb2;
                            z2 = z4;
                            z = z5;
                            z4 = z2;
                            z5 = z;
                        } else {
                            sb = sb2;
                            strArrSplit = strArrSplit;
                            length = length;
                            z2 = z4;
                            z = z5;
                            if (!str3.startsWith("sw") || !str3.endsWith("dp")) {
                                if (!str3.startsWith("w") || !str3.endsWith("dp")) {
                                    if (!str3.startsWith(am.aG) || !str3.endsWith("dp")) {
                                        if (!str3.startsWith(am.aE)) {
                                            if (!matcher.reset(str3).matches()) {
                                                if (!matcher2.reset(str3).matches()) {
                                                    EnumC18262 enumC18262 = this.f65667;
                                                    EnumC18262 enumC18263 = EnumC18262.MOTOROLA_76;
                                                    if (enumC18262 != enumC18263 || !str3.startsWith("spn")) {
                                                        if (this.f65667 != enumC18263 || !str3.startsWith("gid1")) {
                                                            if (this.f65667 != enumC18263 || !str3.startsWith("mot")) {
                                                                if (!str3.startsWith("unknown")) {
                                                                    throw new Exception("Unknown config part: ".concat(str3));
                                                                }
                                                                if (z6) {
                                                                    throw new Exception("Duplicate unknown config bytes: ".concat(str3));
                                                                }
                                                                int iIndexOf = str3.indexOf(43);
                                                                if (iIndexOf < 7) {
                                                                    throw new Exception("Invalid unknown config bytes: ".concat(str3));
                                                                }
                                                                int iM47009 = iIndexOf == 7 ? 60 : m47009(str3.substring(7, iIndexOf));
                                                                byte[] bArrM20552 = AbstractC7499.m20548().mo20553().mo20551().m20552(str3.substring(iIndexOf + 1));
                                                                if (iM47009 < 4 || bArrM20552.length == 0 || ((long) iM47009) + ((long) bArrM20552.length) > 255) {
                                                                    throw new Exception("Invalid unknown config range: ".concat(str3));
                                                                }
                                                                bArr = bArrM20552;
                                                                i4 = iM47009;
                                                                z4 = z2;
                                                                z5 = z;
                                                                z6 = true;
                                                                break;
                                                            } else {
                                                                switch (str3) {
                                                                    case "motcli":
                                                                        this.f65682 = 4;
                                                                        break;
                                                                    case "motmobile":
                                                                        this.f65682 = 3;
                                                                        break;
                                                                    case "motphone":
                                                                        this.f65682 = 1;
                                                                        break;
                                                                    case "motdesk":
                                                                        this.f65682 = 2;
                                                                        break;
                                                                    default:
                                                                        if (!str3.startsWith("motuimode")) {
                                                                            throw new Exception("Unknown config part: ".concat(str3));
                                                                        }
                                                                        this.f65682 = m47009(str3.substring(9));
                                                                        break;
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            this.f65681 = m47009(str3.substring(4));
                                                        }
                                                    } else {
                                                        this.f65672 = m47009(str3.substring(3));
                                                    }
                                                } else {
                                                    String strGroup = matcher2.group(1);
                                                    C17359.requireNonNull(strGroup);
                                                    this.f65677 = m47016(strGroup);
                                                    String strGroup2 = matcher2.group(2);
                                                    C17359.requireNonNull(strGroup2);
                                                    this.f65671 = m47016(strGroup2);
                                                }
                                            } else {
                                                String strGroup3 = matcher.group(1);
                                                C17359.requireNonNull(strGroup3);
                                                this.f65656 = Integer.parseInt(strGroup3);
                                            }
                                        } else {
                                            short s2 = Short.parseShort(str3.substring(1));
                                            if (this.f65660 < s2) {
                                                this.f65660 = s2;
                                            }
                                            z4 = z2;
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        this.f65689 = m47016(C1402.m5124(2, 1, str3));
                                    }
                                } else {
                                    this.f65687 = m47016(C1402.m5124(2, 1, str3));
                                }
                            } else {
                                this.f65683 = m47016(C1402.m5124(2, 2, str3));
                            }
                            z4 = z2;
                            z5 = z;
                        }
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                }
            } else {
                if (!str3.isEmpty()) {
                    throw new Exception(str2);
                }
                z4 = false;
                sb = sb2;
                strArrSplit = strArrSplit;
                length = length;
            }
            i3++;
            str2 = str;
            strArrSplit = strArrSplit;
            length = length;
            sb2 = sb;
        }
        StringBuilder sb4 = sb2;
        boolean z9 = z5;
        if (bArr != null) {
            byte[] bArrM47015 = m47015();
            int iMax = Math.max(this.f65667.f59590, bArr.length + i4);
            byte[] bArr2 = new byte[iMax];
            System.arraycopy(bArrM47015, 0, bArr2, 4, bArrM47015.length);
            for (int i6 = 0; i6 < bArr.length; i6++) {
                int i7 = i4 + i6;
                if (!z9 || i7 < 24 || i7 >= 26) {
                    int i8 = bArr2[i7] & 255;
                    if (i7 == 18) {
                        iM46995 = m46995(i8, 3);
                        iM46996 = m46995(i8, 12);
                    } else if (i7 == 28) {
                        iM46995 = m46995(i8, 15) | m46995(i8, 48);
                        iM46996 = m46995(i8, 192);
                    } else if (i7 == 29) {
                        iM46995 = m46995(i8, 15);
                        iM46996 = m46995(i8, 48);
                    } else if (i7 == 48) {
                        iM46997 = m46995(i8, 3);
                    } else if (i7 == 49) {
                        iM46995 = m46995(i8, 3);
                        iM46996 = m46995(i8, 12);
                    } else if (i8 == 0) {
                        iM46997 = 0;
                    } else {
                        iM46997 = 255;
                    }
                    iM46997 = iM46996 | iM46995;
                } else {
                    iM46997 = 255;
                }
                if (((bArr2[i7] ^ bArr[i6]) & iM46997) != 0) {
                    throw new Exception("Unknown bytes conflict with explicit qualifiers");
                }
            }
            System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            C6929.m19210(0, iMax, bArr2);
            m47004(new C3194(bArr2).m48157(0));
            this.f65680 = null;
            byte[] bArrM47016 = m47015();
            m47002(sb4.toString());
            this.f65680 = null;
            if (!Arrays.equals(bArrM47016, m47015())) {
                throw new Exception("Unknown bytes conflict with explicit qualifiers");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m47009(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty unsigned config field");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new IllegalArgumentException("Invalid unsigned config field: ".concat(str));
            }
        }
        long j = Long.parseLong(str);
        if (j <= 4294967295L) {
            return (int) j;
        }
        throw new IllegalArgumentException("Config field overflow: ".concat(str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m47010(char[] cArr) {
        for (char c : cArr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47017(char[] cArr) {
        char c;
        int i = 0;
        while (i < cArr.length && (c = cArr[i]) != 0) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (c < '0' || c > '9'))) {
                return false;
            }
            i++;
        }
        if (i < 3 || i > 8) {
            return false;
        }
        while (i < cArr.length) {
            if (cArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47016(String str) {
        int i = Integer.parseInt(str);
        if (i < 0 || i > 65535) {
            throw new NumberFormatException(C14442.m34865("Value out of range. Value:\"", str, "\""));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x03d9  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m47027() {
        if (this.f65663 == null) {
            C20528 c20528 = f65655;
            StringBuilder sb = (StringBuilder) c20528.m47061();
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.setLength(0);
            }
            if (this.f65670 != 0) {
                sb.append("-mcc");
                C11293.m28554(sb, this.f65670);
                short s = this.f65686;
                if (s == -1) {
                    sb.append("-mnc00");
                } else if (s != 0) {
                    sb.append("-mnc");
                    short s2 = this.f65686;
                    if (s2 <= 0 || s2 >= 10) {
                        C11293.m28554(sb, s2);
                    } else if (s2 < 0 || s2 >= 100) {
                        sb.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(s2)));
                    } else {
                        sb.append((s2 / 10) % 10);
                        sb.append(s2 % 10);
                    }
                }
            } else if (this.f65686 != 0) {
                sb.append("-mnc");
                sb.append((int) this.f65686);
            }
            String strM46998 = m46998(this.f65659);
            String strM46999 = m46998(this.f65684);
            String strM469910 = m46998(this.f65674);
            String strM469911 = m46998(this.f65685);
            String strM469912 = (this.f65659[0] == 0 || !m47017(this.f65665)) ? "" : m46998(this.f65665);
            if (!strM46998.isEmpty() || !strM46999.isEmpty()) {
                if (strM469910.length() == 4 || strM469911.length() >= 5 || strM46999.length() == 3 || !strM469912.isEmpty()) {
                    sb.append("-b+");
                    if (!strM46998.isEmpty()) {
                        sb.append(strM46998);
                    }
                    if (strM469910.length() == 4) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM469910);
                    }
                    if (strM46999.length() == 2 || strM46999.length() == 3) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM46999);
                    }
                    if (strM469911.length() >= 5) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM469911.toUpperCase());
                    }
                    if (!strM469912.isEmpty()) {
                        sb.append("+u+nu+");
                        sb.append(strM469912);
                    }
                } else {
                    sb.append("-");
                    sb.append(strM46998);
                    if (!strM46999.isEmpty()) {
                        sb.append("-r");
                        sb.append(strM46999);
                    }
                }
            }
            int i = this.f65678 & 192;
            if (i == 64) {
                sb.append("-ldltr");
            } else if (i == 128) {
                sb.append("-ldrtl");
            }
            if (this.f65683 != 0) {
                sb.append("-sw");
                sb.append(this.f65683);
                sb.append("dp");
            }
            if (this.f65687 != 0) {
                sb.append("-w");
                sb.append(this.f65687);
                sb.append("dp");
            }
            if (this.f65689 != 0) {
                sb.append("-h");
                sb.append(this.f65689);
                sb.append("dp");
            }
            int i2 = this.f65678 & 15;
            if (i2 == 1) {
                sb.append("-small");
            } else if (i2 == 2) {
                sb.append("-normal");
            } else if (i2 == 3) {
                sb.append("-large");
            } else if (i2 == 4) {
                sb.append("-xlarge");
            }
            int i3 = this.f65678 & UTF8.S_P3A;
            if (i3 == 16) {
                sb.append("-notlong");
            } else if (i3 == 32) {
                sb.append("-long");
            }
            int i4 = this.f65679 & 3;
            if (i4 == 1) {
                sb.append("-notround");
            } else if (i4 == 2) {
                sb.append("-round");
            }
            int i5 = this.f65675 & 12;
            short s3 = 8;
            if (i5 == 4) {
                sb.append("-lowdr");
            } else if (i5 == 8) {
                sb.append("-highdr");
            }
            int i6 = this.f65675 & 3;
            if (i6 == 1) {
                sb.append("-nowidecg");
            } else if (i6 == 2) {
                sb.append("-widecg");
            }
            byte b = this.f65673;
            if (b == 1) {
                sb.append("-port");
            } else if (b == 2) {
                sb.append("-land");
            } else if (b == 3) {
                sb.append("-square");
            }
            switch (this.f65688 & 15) {
                case 2:
                    sb.append("-desk");
                    break;
                case 3:
                    sb.append("-car");
                    break;
                case 4:
                    sb.append("-television");
                    break;
                case 5:
                    sb.append("-appliance");
                    break;
                case 6:
                    sb.append("-watch");
                    break;
                case 7:
                    sb.append("-vrheadset");
                    break;
                case 11:
                    sb.append("-godzillaui");
                    break;
                case 12:
                    sb.append("-smallui");
                    break;
                case 13:
                    sb.append("-mediumui");
                    break;
                case 14:
                    sb.append("-largeui");
                    break;
                case 15:
                    sb.append("-hugeui");
                    break;
            }
            int i7 = this.f65688 & UTF8.S_P3A;
            if (i7 == 16) {
                sb.append("-notnight");
            } else if (i7 == 32) {
                sb.append("-night");
            }
            int i8 = this.f65656;
            if (i8 != 0) {
                if (i8 != 120) {
                    if (i8 != 160) {
                        if (i8 != 213) {
                            if (i8 != 240) {
                                if (i8 != 320) {
                                    if (i8 != 480) {
                                        if (i8 == 640) {
                                            sb.append("-xxxhdpi");
                                        } else {
                                            switch (i8) {
                                                case 65534:
                                                    sb.append("-anydpi");
                                                    break;
                                                case 65535:
                                                    sb.append("-nodpi");
                                                    break;
                                                default:
                                                    sb.append('-');
                                                    sb.append(this.f65656);
                                                    sb.append("dpi");
                                                    break;
                                            }
                                        }
                                    } else {
                                        sb.append("-xxhdpi");
                                    }
                                } else {
                                    sb.append("-xhdpi");
                                }
                            } else {
                                sb.append("-hdpi");
                            }
                        } else {
                            sb.append("-tvdpi");
                        }
                    } else {
                        sb.append("-mdpi");
                    }
                } else {
                    sb.append("-ldpi");
                }
            }
            byte b2 = this.f65664;
            if (b2 == 1) {
                sb.append("-notouch");
            } else if (b2 == 2) {
                sb.append("-stylus");
            } else if (b2 == 3) {
                sb.append("-finger");
            }
            int i9 = this.f65657 & 3;
            if (i9 == 1) {
                sb.append("-keysexposed");
            } else if (i9 == 2) {
                sb.append("-keyshidden");
            } else if (i9 == 3) {
                sb.append("-keyssoft");
            }
            byte b3 = this.f65668;
            if (b3 == 1) {
                sb.append("-nokeys");
            } else if (b3 == 2) {
                sb.append("-qwerty");
            } else if (b3 == 3) {
                sb.append("-12key");
            }
            int i10 = this.f65657 & 12;
            if (i10 == 4) {
                sb.append("-navexposed");
            } else if (i10 == 8) {
                sb.append("-navhidden");
            }
            byte b4 = this.f65676;
            if (b4 == 1) {
                sb.append("-nonav");
            } else if (b4 == 2) {
                sb.append("-dpad");
            } else if (b4 == 3) {
                sb.append("-trackball");
            } else if (b4 == 4) {
                sb.append("-wheel");
            }
            byte b5 = this.f65669;
            if (b5 == 1) {
                sb.append("-neuter");
            } else if (b5 == 2) {
                sb.append("-feminine");
            } else if (b5 == 3) {
                sb.append("-masculine");
            }
            if (this.f65677 != 0 && this.f65671 != 0) {
                sb.append('-');
                sb.append(this.f65677);
                sb.append('x');
                sb.append(this.f65671);
            }
            short s4 = this.f65660;
            if (s4 > 0) {
                byte b6 = this.f65688;
                if ((b6 & 15) != 7) {
                    byte b7 = this.f65675;
                    if ((b7 & 3) != 0 || (b7 & 12) != 0) {
                        s3 = 26;
                    } else if ((this.f65679 & 3) != 0) {
                        s3 = 23;
                    } else {
                        int i11 = this.f65656;
                        if (i11 == 65534) {
                            s3 = 21;
                        } else if (this.f65683 != 0 || this.f65687 != 0 || this.f65689 != 0) {
                            s3 = 13;
                        } else if ((b6 & 63) == 0) {
                            s3 = ((this.f65678 & 63) == 0 && i11 == 0) ? (short) 0 : (short) 4;
                        }
                    }
                } else {
                    s3 = 26;
                }
                if (s4 >= s3) {
                    sb.append("-v");
                    sb.append((int) this.f65660);
                }
            }
            if (this.f65667 == EnumC18262.MOTOROLA_76) {
                if (this.f65672 != 0) {
                    sb.append("-spn");
                    sb.append(((long) this.f65672) & 4294967295L);
                }
                if (this.f65681 != 0) {
                    sb.append("-gid1");
                    sb.append(((long) this.f65681) & 4294967295L);
                }
                int i12 = this.f65682;
                if (i12 != 0) {
                    if (i12 == 1) {
                        sb.append("-motphone");
                    } else if (i12 == 2) {
                        sb.append("-motdesk");
                    } else if (i12 == 3) {
                        sb.append("-motmobile");
                    } else if (i12 == 4) {
                        sb.append("-motcli");
                    } else {
                        sb.append("-motuimode");
                        sb.append(((long) this.f65682) & 4294967295L);
                    }
                }
            }
            int i13 = this.f65667.f59590;
            if (m47010(this.f65665) || (this.f65659[0] != 0 && m47017(this.f65665))) {
                for (byte b8 : this.f65666) {
                    if (b8 != 0) {
                        i13 = this.f65667.f59590 - 3;
                    }
                }
            } else {
                i13 = this.f65667.f59590 - 11;
            }
            if (i13 < this.f65667.f59590 || this.f65661 != null) {
                byte[] bArrM47015 = m47015();
                sb.append("-unknown");
                sb.append(i13);
                sb.append('+');
                sb.append(AbstractC7499.m20548().mo20553().mo20551().m20550(Arrays.copyOfRange(bArrM47015, i13 - 4, bArrM47015.length)));
            }
            String string = sb.toString();
            c20528.m47060(sb);
            this.f65663 = string;
        }
        return this.f65663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47005(byte[] bArr, char[] cArr, char c) {
        if (cArr.length == 2) {
            bArr[0] = (byte) cArr[0];
            bArr[1] = (byte) cArr[1];
        } else {
            if (cArr.length == 3) {
                int i = (((cArr[2] - c) & 31) << 10) | 32768 | (((cArr[1] - c) & 31) << 5) | ((cArr[0] - c) & 31);
                bArr[0] = (byte) ((i >> 8) & 255);
                bArr[1] = (byte) (i & 255);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47026(C20500 c20500) {
        int i = this.f65670 != c20500.f65670 ? 1 : 0;
        if (this.f65686 != c20500.f65686) {
            i |= 2;
        }
        if (!Arrays.equals(this.f65659, c20500.f65659) || !Arrays.equals(this.f65684, c20500.f65684)) {
            i |= 4;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                if (!Arrays.equals(this.f65685, c20500.f65685) || !Arrays.equals(this.f65665, c20500.f65665)) {
                    break;
                }
                break;
            }
            if ((this.f65662 != 0 ? (char) 0 : this.f65674[i2]) == (c20500.f65662 != 0 ? (char) 0 : c20500.f65674[i2])) {
                i2++;
            }
            i |= 4;
            break;
        }
        if (this.f65673 != c20500.f65673) {
            i |= 128;
        }
        if (this.f65656 != c20500.f65656) {
            i |= 256;
        }
        if (this.f65664 != c20500.f65664) {
            i |= 8;
        }
        if (((this.f65657 ^ c20500.f65657) & 15) != 0) {
            i |= 32;
        }
        if (this.f65668 != c20500.f65668) {
            i |= 16;
        }
        if (this.f65676 != c20500.f65676) {
            i |= 64;
        }
        if (this.f65677 != c20500.f65677 || this.f65671 != c20500.f65671 || this.f65687 != c20500.f65687 || this.f65689 != c20500.f65689) {
            i |= 512;
        }
        if (this.f65660 != c20500.f65660) {
            i |= 1024;
        }
        byte b = this.f65678;
        byte b2 = c20500.f65678;
        if (((b ^ b2) & 192) != 0) {
            i |= 16384;
        }
        if (((b ^ b2) & 63) != 0) {
            i |= 2048;
        }
        if (((this.f65679 ^ c20500.f65679) & 3) != 0) {
            i |= 32768;
        }
        if (((this.f65675 ^ c20500.f65675) & 15) != 0) {
            i |= 65536;
        }
        if (this.f65688 != c20500.f65688) {
            i |= 4096;
        }
        if (this.f65683 != c20500.f65683) {
            i |= 8192;
        }
        if (this.f65669 != c20500.f65669) {
            i |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        EnumC18262 enumC18262 = this.f65667;
        if (enumC18262 == EnumC18262.MOTOROLA_76 && c20500.f65667 == enumC18262) {
            if (this.f65672 != c20500.f65672) {
                i |= 262144;
            }
            if (this.f65681 != c20500.f65681) {
                i |= 524288;
            }
            if (this.f65682 != c20500.f65682) {
                return 1048576 | i;
            }
        }
        return i;
    }

    public final String toString() {
        if (m47027().isEmpty()) {
            return "[DEFAULT]";
        }
        String strM47027 = m47027();
        return strM47027.charAt(0) == '-' ? strM47027.substring(1) : strM47027;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C20500.class != obj.getClass()) {
            return false;
        }
        C20500 c20500 = (C20500) obj;
        return this.f65667 == c20500.f65667 && this.f65662 == c20500.f65662 && m47027().equals(c20500.m47027());
    }

    public final int hashCode() {
        return m47027().hashCode() + (((this.f65667.hashCode() * 31) + this.f65662) * 31);
    }

    public final Object clone() {
        try {
            return (C20500) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:412:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:414:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:416:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:417:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:420:0x03de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:421:0x03df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        if ((r10.f65683 != 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        if ((r10.m47019() != 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0187, code lost:
    
        if ((r10.f65678 != 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01e0, code lost:
    
        if ((r10.f65679 != 0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x020a, code lost:
    
        if ((r10.f65675 != 0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x025c, code lost:
    
        if ((r10.f65688 != 0) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x029f, code lost:
    
        if ((r10.m47013() != 0) != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0311, code lost:
    
        if ((r10.m47008() != 0) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x038b, code lost:
    
        if ((r10.m47011() != 0) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        if ((r10.f65678 != 0) != false) goto L79;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m47023(l.C20500 r10, l.C20500 r11) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20500.m47023(l.᩵ۤۤ, l.᩵ۤۤ):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:124:0x0159  */
    /* JADX WARN: Code duplicated, block: B:126:0x015f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0171  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:126:0x015f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47025(l.C20500 r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20500.m47025(l.᩵ۤۤ):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20500 m46999(Resources resources) {
        C20500 c20500 = new C20500();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 26 ? configuration.colorMode : 0;
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 >= i4) {
            i3 = i4;
            i4 = i3;
        }
        int i5 = configuration.keyboardHidden;
        if (i5 == 1 && configuration.hardKeyboardHidden == 2) {
            i5 = 3;
        }
        int i6 = configuration.mcc;
        int i7 = configuration.mnc;
        Locale locale = configuration.locale;
        int i8 = configuration.orientation;
        int i9 = configuration.touchscreen;
        int i10 = configuration.densityDpi;
        int i11 = configuration.keyboard;
        int i12 = configuration.navigation;
        int i13 = configuration.smallestScreenWidthDp;
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        int i16 = i2;
        int i17 = configuration.screenLayout;
        int i18 = configuration.uiMode;
        c20500.f65670 = (short) i6;
        c20500.f65686 = (short) i7;
        c20500.f65673 = (byte) i8;
        c20500.f65664 = (byte) i9;
        c20500.f65656 = (short) i10;
        c20500.f65668 = (byte) i11;
        c20500.f65657 = (byte) i5;
        c20500.f65676 = (byte) i12;
        c20500.f65677 = (short) i4;
        c20500.f65671 = (short) i3;
        c20500.f65683 = (short) i13;
        c20500.f65687 = (short) i14;
        c20500.f65689 = (short) i15;
        c20500.f65678 = (byte) i17;
        c20500.f65688 = (byte) i18;
        c20500.f65675 = (byte) i16;
        c20500.f65660 = (short) i;
        if (locale != null) {
            String language = locale.getLanguage();
            language.getClass();
            switch (language) {
                case "he":
                    language = "iw";
                    break;
                case "id":
                    language = "in";
                    break;
                case "yi":
                    language = "ji";
                    break;
            }
            m47003(language, c20500.f65659);
            m47003(locale.getCountry(), c20500.f65684);
            m47003(locale.getScript(), c20500.f65674);
            m47003(locale.getVariant(), c20500.f65685);
        }
        c20500.f65679 = (byte) ((i17 & 768) >> 8);
        return c20500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46998(char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            if (cArr[i] == 0) {
                return i == 0 ? "" : new String(cArr, 0, i);
            }
            i++;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47003(String str, char[] cArr) {
        int iMin = Math.min(str.length(), cArr.length);
        Arrays.fill(cArr, (char) 0);
        for (int i = 0; i < iMin; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m47012() {
        return ((this.f65670 & HPKE.aead_EXPORT_ONLY) << 16) | (65535 & this.f65686);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m46994() {
        char[] cArr = this.f65659;
        int i = ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24);
        char[] cArr2 = this.f65684;
        return i | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m47019() {
        return ((this.f65687 & 65535) << 16) | (65535 & this.f65689);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private int m47013() {
        return ((this.f65673 & 255) << 24) | ((this.f65664 & 255) << 16) | (this.f65656 & 65535);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m47008() {
        return ((this.f65668 & 255) << 24) | ((this.f65676 & 255) << 16) | ((this.f65657 & 255) << 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m47014() {
        return (this.f65660 & HPKE.aead_EXPORT_ONLY) << 16;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m47011() {
        return ((this.f65677 & 65535) << 16) | (65535 & this.f65671);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47018(char[] cArr, char[] cArr2) {
        if (m47006(cArr, cArr2)) {
            return true;
        }
        char[] cArr3 = f65651;
        boolean zM47006 = m47006(cArr, cArr3);
        char[] cArr4 = f65654;
        if (zM47006 && m47006(cArr2, cArr4)) {
            return true;
        }
        return m47006(cArr, cArr4) && m47006(cArr2, cArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47006(char[] cArr, char[] cArr2) {
        return cArr[0] == cArr2[0] && cArr[1] == cArr2[1];
    }
}
