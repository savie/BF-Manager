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

/* JADX INFO: renamed from: l.ܺۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5DR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15916 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f51543;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public byte f51549;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f51550;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f51555;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51567;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final C19805 f51542 = new C19805(2);

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f51535 = Pattern.compile("(\\d+)x(\\d+)");

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f51539 = Pattern.compile("(\\d+)dpi");

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final int[][] f51540 = {new int[]{19, 1}, new int[]{12, 4}, new int[]{16, 3}, new int[]{20, 4}, new int[]{24, 4}, new int[]{28, 1}, new int[]{48, 1}, new int[]{49, 1}, new int[]{29, 1}, new int[]{30, 2}, new int[]{32, 4}};

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f51538 = {'e', 'n'};

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f51537 = {'U', 'S'};

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f51541 = {173, 5};

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f51536 = {'t', 'l'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC10977 f51545 = EnumC10977.AOSP;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f51560 = new byte[3];

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public short f51559 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public short f51546 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f51563 = new char[2];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f51571 = new char[2];

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public byte f51544 = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public byte f51557 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51566 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte f51576 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte f51574 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f51558 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f51551 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f51568 = 0;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f51552 = 0;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public short f51554 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public byte f51564 = 0;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte f51553 = 0;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f51570 = 0;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f51569 = 0;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f51575 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public char[] f51547 = new char[4];

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public char[] f51562 = new char[8];

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte f51573 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f51565 = 0;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public short f51548 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public char[] f51556 = new char[8];

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51572 = null;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f51561 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37835(int i, int i2) {
        if ((i & i2) == 0) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char[] m37847(byte b, byte b2, char c) {
        if (((b >> 7) & 1) != 1) {
            return new char[]{(char) b, (char) b2};
        }
        return new char[]{(char) ((b2 & bo.j) + c), (char) (((b2 & bo.k) >> 5) + ((b & 3) << 3) + c), (char) (((b & 124) >> 2) + c)};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15916 m37841(C23718 c23718, EnumC10977 enumC10977) throws IOException {
        C15916 c15916 = new C15916();
        C13638.requireNonNull(enumC10977);
        c15916.f51545 = enumC10977;
        c15916.m37844(c23718);
        return c15916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15916 m37840(String str, EnumC10977 enumC10977) throws Exception {
        C15916 c15916 = new C15916();
        C13638.requireNonNull(enumC10977);
        c15916.f51545 = enumC10977;
        c15916.m37842(str);
        return c15916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10977 m37862() {
        return this.f51545;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private byte[] m37848() {
        int length;
        byte[] bArr = this.f51543;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f51572;
        byte[] bArr3 = this.f51560;
        if (bArr2 != null) {
            length = this.f51545.f37393 + bArr2.length;
        } else {
            if (this.f51555 != 0 || this.f51567 != 0 || this.f51550 != 0 || this.f51549 != 0 || !m37851(this.f51556)) {
                length = this.f51545.f37393;
                break;
            }
            int length2 = bArr3.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    if (this.f51573 != 0 || this.f51565 != 0 || this.f51548 != 0) {
                        length = 52;
                        break;
                    }
                    if (!m37851(this.f51547) || !m37851(this.f51562)) {
                        length = 48;
                        break;
                    }
                    if (this.f51569 != 0 || this.f51575 != 0) {
                        length = 36;
                        break;
                    }
                    if (this.f51564 != 0 || this.f51553 != 0 || this.f51570 != 0) {
                        length = 32;
                        break;
                    }
                    length = 28;
                    break;
                }
                if (bArr3[i] != 0) {
                    length = this.f51545.f37393;
                    break;
                }
                i++;
            }
        }
        int i2 = length - 4;
        C11018 c11018 = new C11018(i2);
        c11018.mo24505(this.f51559);
        c11018.mo24505(this.f51546);
        byte[] bArr4 = new byte[2];
        m37845(bArr4, this.f51563, 'a');
        c11018.write(bArr4, 0, 2);
        m37845(bArr4, this.f51571, '0');
        c11018.write(bArr4, 0, 2);
        c11018.writeByte(this.f51544);
        c11018.writeByte(this.f51557);
        c11018.mo24508(this.f51566);
        c11018.writeByte(this.f51576);
        c11018.writeByte(this.f51574);
        c11018.writeByte(this.f51558);
        c11018.writeByte(this.f51551);
        c11018.mo24508(this.f51568);
        c11018.mo24508(this.f51552);
        c11018.mo24505(this.f51554);
        c11018.mo24505((short) 0);
        if (length >= 32) {
            c11018.writeByte(this.f51564);
            c11018.writeByte(this.f51553);
            c11018.mo24508(this.f51570);
        }
        if (length >= 36) {
            c11018.mo24508(this.f51569);
            c11018.mo24508(this.f51575);
        }
        if (length >= 48) {
            byte[] bArr5 = new byte[12];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr5[i3] = (byte) this.f51547[i3];
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bArr5[i4 + 4] = (byte) this.f51562[i4];
            }
            c11018.write(bArr5, 0, 12);
        }
        if (length >= 52) {
            c11018.writeByte(this.f51573);
            c11018.writeByte(this.f51565);
            c11018.mo24505(this.f51548);
        }
        EnumC10977 enumC10977 = this.f51545;
        if (enumC10977 == EnumC10977.MOTOROLA_76 && length >= enumC10977.f37393) {
            c11018.writeInt(this.f51555);
            c11018.writeInt(this.f51567);
            c11018.writeInt(this.f51550);
        }
        if (length >= this.f51545.f37393) {
            c11018.writeByte(this.f51549);
            for (char c : this.f51556) {
                c11018.writeByte((byte) c);
            }
            c11018.write(bArr3);
        }
        if (length > this.f51545.f37393) {
            c11018.write(this.f51572);
        }
        byte[] bArrM27773 = c11018.m27773();
        this.f51543 = bArrM27773;
        if (bArrM27773.length == i2) {
            return bArrM27773;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37861(C15916 c15916) {
        int iCompare;
        byte[] bArrM37848 = m37848();
        byte[] bArrM37849 = c15916.m37848();
        int iM37836 = m37836(4, 4, bArrM37848, bArrM37849);
        if (iM37836 != 0) {
            return iM37836;
        }
        int iM37837 = m37836(8, 4, bArrM37848, bArrM37849);
        if (iM37837 != 0) {
            return iM37837;
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
                    iCompare = Integer.compare(m37837(i3, bArrM37848), m37837(i3, bArrM37849));
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
                    iCompare2 = Integer.compare(this.f51556[i4], c15916.f51556[i4]);
                }
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                for (int[] iArr : f51540) {
                    int iM37838 = m37836(iArr[0], iArr[1], bArrM37848, bArrM37849);
                    if (iM37838 != 0) {
                        return iM37838;
                    }
                }
                int iCompare3 = Integer.compare(this.f51545.ordinal(), c15916.f51545.ordinal());
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                if (this.f51545 == EnumC10977.MOTOROLA_76) {
                    for (int i5 = 52; i5 < 64; i5 += 4) {
                        int iM37839 = m37836(i5, 4, bArrM37848, bArrM37849);
                        if (iM37839 != 0) {
                            return iM37839;
                        }
                    }
                }
                return 0;
            }
            int iCompare4 = Integer.compare(this.f51549 != 0 ? 0 : m37837(i, bArrM37848), c15916.f51549 == 0 ? m37837(i, bArrM37849) : 0);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37837(int i, byte[] bArr) {
        int i2 = i - 4;
        if (i2 < bArr.length) {
            return bArr[i2] & 255;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37836(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iCompare;
        do {
            i2--;
            if (i2 < 0) {
                return 0;
            }
            int i3 = i + i2;
            iCompare = Integer.compare(m37837(i3, bArr), m37837(i3, bArr2));
        } while (iCompare == 0);
        return iCompare;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m37860() {
        return m37848().length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37863(InterfaceC16662 interfaceC16662) {
        byte[] bArrM37848 = m37848();
        interfaceC16662.writeInt(bArrM37848.length + 4);
        interfaceC16662.write(bArrM37848);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37844(C23718 c23718) throws IOException {
        int i;
        int iM52225 = c23718.m52225();
        if (iM52225 < 8) {
            throw new IOException(C2271.m6966(iM52225, "Config size = ", " is too small"));
        }
        if (iM52225 > 255) {
            iM52225 = Math.min(this.f51545.f37393, c23718.m52227());
        }
        byte[] bArr = new byte[iM52225 - 4];
        try {
            c23718.m52228(bArr);
            C17367 c17367 = new C17367(bArr);
            this.f51559 = c17367.readShort();
            this.f51546 = c17367.readShort();
            if (iM52225 >= 12) {
                this.f51563 = m37847(c17367.readByte(), c17367.readByte(), 'a');
                this.f51571 = m37847(c17367.readByte(), c17367.readByte(), '0');
            } else {
                this.f51563 = new char[2];
                this.f51571 = new char[2];
            }
            if (iM52225 >= 14) {
                this.f51544 = c17367.readByte();
                this.f51557 = c17367.readByte();
            }
            if (iM52225 >= 16) {
                this.f51566 = c17367.m40462();
            }
            if (iM52225 >= 28) {
                this.f51576 = c17367.readByte();
                this.f51574 = c17367.readByte();
                this.f51558 = c17367.readByte();
                this.f51551 = c17367.readByte();
                this.f51568 = c17367.m40462();
                this.f51552 = c17367.m40462();
                this.f51554 = c17367.readShort();
                c17367.skipBytes(2);
            }
            if (iM52225 >= 32) {
                this.f51564 = c17367.readByte();
                this.f51553 = c17367.readByte();
                this.f51570 = c17367.m40462();
            }
            if (iM52225 >= 36) {
                this.f51569 = c17367.m40462();
                this.f51575 = c17367.m40462();
            }
            if (iM52225 >= 48) {
                char[] cArr = new char[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    cArr[i2] = (char) c17367.readByte();
                }
                this.f51547 = cArr;
                char[] cArr2 = new char[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    cArr2[i3] = (char) c17367.readByte();
                }
                this.f51562 = cArr2;
            }
            if (iM52225 >= 52) {
                this.f51573 = c17367.readByte();
                this.f51565 = c17367.readByte();
                this.f51548 = c17367.readShort();
            }
            if (this.f51545 == EnumC10977.MOTOROLA_76 && iM52225 > 52) {
                if (iM52225 < 76) {
                    throw new IOException("Truncated Motorola config");
                }
                this.f51555 = c17367.readInt();
                this.f51567 = c17367.readInt();
                this.f51550 = c17367.readInt();
            }
            int i4 = this.f51545.f37393 - 12;
            if (iM52225 > i4) {
                this.f51549 = c17367.readByte();
                int i5 = 0;
                while (true) {
                    i = iM52225 - i4;
                    if (i5 >= Math.min(8, i - 1)) {
                        break;
                    }
                    this.f51556[i5] = (char) (c17367.readByte() & 255);
                    i5++;
                }
                for (int i6 = 0; i6 < Math.min(3, i - 9); i6++) {
                    this.f51560[i6] = c17367.readByte();
                }
            }
            int i7 = iM52225 - this.f51545.f37393;
            if (i7 > 0) {
                byte[] bArr2 = new byte[i7];
                c17367.m40446(i7, bArr2);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (bArr2[i8] != 0) {
                        this.f51572 = bArr2;
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
    private void m37842(String str) throws Exception {
        int iM37835;
        int iM37836;
        int iM37837;
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
        Matcher matcher = f51539.matcher("");
        Matcher matcher2 = f51535.matcher("");
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
                            b = cb.f77931l;
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
                        this.f51553 = (byte) (this.f51553 | 12);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 1:
                        this.f51553 = (byte) (this.f51553 | 5);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 2:
                        this.f51566 = 640;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 3:
                        this.f51566 = 65534;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 4:
                        this.f51553 = (byte) (this.f51553 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 5:
                        this.f51557 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 6:
                        this.f51565 = (byte) (this.f51565 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 7:
                        this.f51553 = (byte) (this.f51553 | 15);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 8:
                        this.f51558 = (byte) (this.f51558 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 9:
                        this.f51551 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 10:
                        this.f51576 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 11:
                        this.f51564 = (byte) (this.f51564 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 12:
                        this.f51576 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 13:
                        this.f51553 = (byte) (this.f51553 | 7);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 14:
                        this.f51553 = (byte) (this.f51553 | cb.k);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 15:
                        this.f51544 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 16:
                        this.f51557 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 17:
                        this.f51565 = (byte) (this.f51565 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 18:
                        this.f51564 = (byte) (this.f51564 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 19:
                        this.f51566 = 480;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 20:
                        this.f51551 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 21:
                        this.f51553 = (byte) (this.f51553 | cb.f77931l);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 22:
                        this.f51553 = (byte) (this.f51553 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 23:
                        this.f51553 = (byte) (this.f51553 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 24:
                        this.f51574 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 25:
                        this.f51566 = 240;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 26:
                        this.f51544 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 27:
                        this.f51566 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 28:
                        this.f51564 = (byte) (this.f51564 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 29:
                        this.f51566 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 30:
                        this.f51544 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 31:
                        this.f51551 = (byte) 2;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 32:
                        this.f51576 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 33:
                        this.f51564 = (byte) (this.f51564 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 34:
                        this.f51564 = (byte) (this.f51564 | 64);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 35:
                        this.f51564 = (byte) (this.f51564 | GCMSIVBlockCipher.MASK);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 36:
                        this.f51565 = (byte) (this.f51565 | 4);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 37:
                        this.f51553 = (byte) (this.f51553 | UTF8.S_CS3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 38:
                        this.f51566 = 65535;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 39:
                        this.f51574 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 40:
                        this.f51573 = (byte) (this.f51573 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 41:
                        this.f51564 = (byte) (this.f51564 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 42:
                        this.f51566 = 213;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 43:
                        this.f51553 = (byte) (this.f51553 | 6);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 44:
                        this.f51574 = (byte) 4;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        this.f51566 = 320;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 46:
                        this.f51558 = (byte) (this.f51558 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 47:
                        this.f51553 = (byte) (this.f51553 | 11);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 48:
                        this.f51558 = (byte) (this.f51558 | 3);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 49:
                        this.f51558 = (byte) (this.f51558 | 8);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 50:
                        this.f51574 = (byte) 3;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 51:
                        this.f51558 = (byte) (this.f51558 | 2);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 52:
                        this.f51553 = (byte) (this.f51553 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 53:
                        this.f51573 = (byte) (this.f51573 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        this.f51565 = (byte) (this.f51565 | 1);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        this.f51564 = (byte) (this.f51564 | 16);
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    case 56:
                        this.f51557 = (byte) 1;
                        sb = sb2;
                        z2 = z4;
                        z = z5;
                        z4 = z2;
                        z5 = z;
                        break;
                    default:
                        if (str3.startsWith("mcc")) {
                            this.f51559 = Short.parseShort(str3.substring(3));
                        } else if (str3.startsWith("mnc")) {
                            short s = Short.parseShort(str3.substring(3));
                            this.f51546 = s;
                            if (s == 0) {
                                this.f51546 = (short) -1;
                            }
                        } else if (str3.matches("[a-z]{2,3}")) {
                            this.f51563 = str3.toCharArray();
                        } else if (str3.matches("r[A-Z0-9]{2}")) {
                            this.f51571 = str3.substring(1).toCharArray();
                        } else if (str3.startsWith("b+")) {
                            String[] strArrSplit2 = str3.substring(2).split("\\+");
                            C18597 c18597 = new C18597(4);
                            int i5 = 0;
                            while (i5 < strArrSplit2.length) {
                                String str4 = strArrSplit2[i5];
                                boolean z8 = z4;
                                char[] charArray = str4.toCharArray();
                                StringBuilder sb3 = sb2;
                                if (c18597.add(0)) {
                                    z3 = z5;
                                    if (charArray.length == 2 || charArray.length == 3) {
                                        this.f51563 = charArray;
                                    }
                                    i5++;
                                    z4 = z8;
                                    sb2 = sb3;
                                    z5 = z3;
                                } else {
                                    z3 = z5;
                                }
                                if (c18597.add(1) && charArray.length == 4) {
                                    this.f51547 = charArray;
                                } else {
                                    if (c18597.add(2)) {
                                        if (charArray.length != 2) {
                                            i = 3;
                                            if (charArray.length == 3) {
                                            }
                                        }
                                        this.f51571 = charArray;
                                    } else {
                                        i = 3;
                                    }
                                    if (c18597.add(i) && charArray.length >= 5 && charArray.length <= 8) {
                                        this.f51562 = Arrays.copyOf(charArray, 8);
                                    } else {
                                        if (!c18597.add(4) || (i2 = i5 + 2) >= strArrSplit2.length || !str4.equals(am.aH) || !strArrSplit2[i5 + 1].equals("nu") || strArrSplit2[i2].isEmpty()) {
                                            throw new Exception(str3);
                                        }
                                        if (z7) {
                                            throw new Exception("Duplicate numbering system: ".concat(str3));
                                        }
                                        char[] charArray2 = strArrSplit2[i2].toCharArray();
                                        if (!m37854(charArray2)) {
                                            throw new Exception("Invalid numbering system: ".concat(str3));
                                        }
                                        this.f51556 = Arrays.copyOf(charArray2, 8);
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
                                                    EnumC10977 enumC10977 = this.f51545;
                                                    EnumC10977 enumC10978 = EnumC10977.MOTOROLA_76;
                                                    if (enumC10977 != enumC10978 || !str3.startsWith("spn")) {
                                                        if (this.f51545 != enumC10978 || !str3.startsWith("gid1")) {
                                                            if (this.f51545 != enumC10978 || !str3.startsWith("mot")) {
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
                                                                int iM37850 = iIndexOf == 7 ? 60 : m37850(str3.substring(7, iIndexOf));
                                                                byte[] bArrM33039 = AbstractC13512.m33036().mo12177().mo12175().m33039(str3.substring(iIndexOf + 1));
                                                                if (iM37850 < 4 || bArrM33039.length == 0 || ((long) iM37850) + ((long) bArrM33039.length) > 255) {
                                                                    throw new Exception("Invalid unknown config range: ".concat(str3));
                                                                }
                                                                bArr = bArrM33039;
                                                                i4 = iM37850;
                                                                z4 = z2;
                                                                z5 = z;
                                                                z6 = true;
                                                                break;
                                                            } else {
                                                                switch (str3) {
                                                                    case "motcli":
                                                                        this.f51550 = 4;
                                                                        break;
                                                                    case "motmobile":
                                                                        this.f51550 = 3;
                                                                        break;
                                                                    case "motphone":
                                                                        this.f51550 = 1;
                                                                        break;
                                                                    case "motdesk":
                                                                        this.f51550 = 2;
                                                                        break;
                                                                    default:
                                                                        if (!str3.startsWith("motuimode")) {
                                                                            throw new Exception("Unknown config part: ".concat(str3));
                                                                        }
                                                                        this.f51550 = m37850(str3.substring(9));
                                                                        break;
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            this.f51567 = m37850(str3.substring(4));
                                                        }
                                                    } else {
                                                        this.f51555 = m37850(str3.substring(3));
                                                    }
                                                } else {
                                                    String strGroup = matcher2.group(1);
                                                    C13638.requireNonNull(strGroup);
                                                    this.f51568 = m37853(strGroup);
                                                    String strGroup2 = matcher2.group(2);
                                                    C13638.requireNonNull(strGroup2);
                                                    this.f51552 = m37853(strGroup2);
                                                }
                                            } else {
                                                String strGroup3 = matcher.group(1);
                                                C13638.requireNonNull(strGroup3);
                                                this.f51566 = Integer.parseInt(strGroup3);
                                            }
                                        } else {
                                            short s2 = Short.parseShort(str3.substring(1));
                                            if (this.f51554 < s2) {
                                                this.f51554 = s2;
                                            }
                                            z4 = z2;
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        this.f51575 = m37853(C20630.m46498(2, 1, str3));
                                    }
                                } else {
                                    this.f51569 = m37853(C20630.m46498(2, 1, str3));
                                }
                            } else {
                                this.f51570 = m37853(C20630.m46498(2, 2, str3));
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
            byte[] bArrM37848 = m37848();
            int iMax = Math.max(this.f51545.f37393, bArr.length + i4);
            byte[] bArr2 = new byte[iMax];
            System.arraycopy(bArrM37848, 0, bArr2, 4, bArrM37848.length);
            for (int i6 = 0; i6 < bArr.length; i6++) {
                int i7 = i4 + i6;
                if (!z9 || i7 < 24 || i7 >= 26) {
                    int i8 = bArr2[i7] & 255;
                    if (i7 == 18) {
                        iM37835 = m37835(i8, 3);
                        iM37836 = m37835(i8, 12);
                    } else if (i7 == 28) {
                        iM37835 = m37835(i8, 15) | m37835(i8, 48);
                        iM37836 = m37835(i8, 192);
                    } else if (i7 == 29) {
                        iM37835 = m37835(i8, 15);
                        iM37836 = m37835(i8, 48);
                    } else if (i7 == 48) {
                        iM37837 = m37835(i8, 3);
                    } else if (i7 == 49) {
                        iM37835 = m37835(i8, 3);
                        iM37836 = m37835(i8, 12);
                    } else if (i8 == 0) {
                        iM37837 = 0;
                    } else {
                        iM37837 = 255;
                    }
                    iM37837 = iM37836 | iM37835;
                } else {
                    iM37837 = 255;
                }
                if (((bArr2[i7] ^ bArr[i6]) & iM37837) != 0) {
                    throw new Exception("Unknown bytes conflict with explicit qualifiers");
                }
            }
            System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            C15157.m36338(0, iMax, bArr2);
            m37844(new C12429(bArr2).m30888(0));
            this.f51543 = null;
            byte[] bArrM37849 = m37848();
            m37842(sb4.toString());
            this.f51543 = null;
            if (!Arrays.equals(bArrM37849, m37848())) {
                throw new Exception("Unknown bytes conflict with explicit qualifiers");
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m37850(String str) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m37851(char[] cArr) {
        for (char c : cArr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m37854(char[] cArr) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m37853(String str) {
        int i = Integer.parseInt(str);
        if (i < 0 || i > 65535) {
            throw new NumberFormatException(C16523.m38890("Value out of range. Value:\"", str, "\""));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:257:0x03d9  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m37865() {
        if (this.f51561 == null) {
            C19805 c19805 = f51542;
            StringBuilder sb = (StringBuilder) c19805.m45009();
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.setLength(0);
            }
            if (this.f51559 != 0) {
                sb.append("-mcc");
                C6730.m18170(sb, this.f51559);
                short s = this.f51546;
                if (s == -1) {
                    sb.append("-mnc00");
                } else if (s != 0) {
                    sb.append("-mnc");
                    short s2 = this.f51546;
                    if (s2 <= 0 || s2 >= 10) {
                        C6730.m18170(sb, s2);
                    } else if (s2 < 0 || s2 >= 100) {
                        sb.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(s2)));
                    } else {
                        sb.append((s2 / 10) % 10);
                        sb.append(s2 % 10);
                    }
                }
            } else if (this.f51546 != 0) {
                sb.append("-mnc");
                sb.append((int) this.f51546);
            }
            String strM37838 = m37838(this.f51563);
            String strM37839 = m37838(this.f51571);
            String strM378310 = m37838(this.f51547);
            String strM378311 = m37838(this.f51562);
            String strM378312 = (this.f51563[0] == 0 || !m37854(this.f51556)) ? "" : m37838(this.f51556);
            if (!strM37838.isEmpty() || !strM37839.isEmpty()) {
                if (strM378310.length() == 4 || strM378311.length() >= 5 || strM37839.length() == 3 || !strM378312.isEmpty()) {
                    sb.append("-b+");
                    if (!strM37838.isEmpty()) {
                        sb.append(strM37838);
                    }
                    if (strM378310.length() == 4) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM378310);
                    }
                    if (strM37839.length() == 2 || strM37839.length() == 3) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM37839);
                    }
                    if (strM378311.length() >= 5) {
                        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        sb.append(strM378311.toUpperCase());
                    }
                    if (!strM378312.isEmpty()) {
                        sb.append("+u+nu+");
                        sb.append(strM378312);
                    }
                } else {
                    sb.append("-");
                    sb.append(strM37838);
                    if (!strM37839.isEmpty()) {
                        sb.append("-r");
                        sb.append(strM37839);
                    }
                }
            }
            int i = this.f51564 & 192;
            if (i == 64) {
                sb.append("-ldltr");
            } else if (i == 128) {
                sb.append("-ldrtl");
            }
            if (this.f51570 != 0) {
                sb.append("-sw");
                sb.append(this.f51570);
                sb.append("dp");
            }
            if (this.f51569 != 0) {
                sb.append("-w");
                sb.append(this.f51569);
                sb.append("dp");
            }
            if (this.f51575 != 0) {
                sb.append("-h");
                sb.append(this.f51575);
                sb.append("dp");
            }
            int i2 = this.f51564 & 15;
            if (i2 == 1) {
                sb.append("-small");
            } else if (i2 == 2) {
                sb.append("-normal");
            } else if (i2 == 3) {
                sb.append("-large");
            } else if (i2 == 4) {
                sb.append("-xlarge");
            }
            int i3 = this.f51564 & UTF8.S_P3A;
            if (i3 == 16) {
                sb.append("-notlong");
            } else if (i3 == 32) {
                sb.append("-long");
            }
            int i4 = this.f51573 & 3;
            if (i4 == 1) {
                sb.append("-notround");
            } else if (i4 == 2) {
                sb.append("-round");
            }
            int i5 = this.f51565 & 12;
            short s3 = 8;
            if (i5 == 4) {
                sb.append("-lowdr");
            } else if (i5 == 8) {
                sb.append("-highdr");
            }
            int i6 = this.f51565 & 3;
            if (i6 == 1) {
                sb.append("-nowidecg");
            } else if (i6 == 2) {
                sb.append("-widecg");
            }
            byte b = this.f51544;
            if (b == 1) {
                sb.append("-port");
            } else if (b == 2) {
                sb.append("-land");
            } else if (b == 3) {
                sb.append("-square");
            }
            switch (this.f51553 & 15) {
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
            int i7 = this.f51553 & UTF8.S_P3A;
            if (i7 == 16) {
                sb.append("-notnight");
            } else if (i7 == 32) {
                sb.append("-night");
            }
            int i8 = this.f51566;
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
                                                    sb.append(this.f51566);
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
            byte b2 = this.f51557;
            if (b2 == 1) {
                sb.append("-notouch");
            } else if (b2 == 2) {
                sb.append("-stylus");
            } else if (b2 == 3) {
                sb.append("-finger");
            }
            int i9 = this.f51558 & 3;
            if (i9 == 1) {
                sb.append("-keysexposed");
            } else if (i9 == 2) {
                sb.append("-keyshidden");
            } else if (i9 == 3) {
                sb.append("-keyssoft");
            }
            byte b3 = this.f51576;
            if (b3 == 1) {
                sb.append("-nokeys");
            } else if (b3 == 2) {
                sb.append("-qwerty");
            } else if (b3 == 3) {
                sb.append("-12key");
            }
            int i10 = this.f51558 & 12;
            if (i10 == 4) {
                sb.append("-navexposed");
            } else if (i10 == 8) {
                sb.append("-navhidden");
            }
            byte b4 = this.f51574;
            if (b4 == 1) {
                sb.append("-nonav");
            } else if (b4 == 2) {
                sb.append("-dpad");
            } else if (b4 == 3) {
                sb.append("-trackball");
            } else if (b4 == 4) {
                sb.append("-wheel");
            }
            byte b5 = this.f51551;
            if (b5 == 1) {
                sb.append("-neuter");
            } else if (b5 == 2) {
                sb.append("-feminine");
            } else if (b5 == 3) {
                sb.append("-masculine");
            }
            if (this.f51568 != 0 && this.f51552 != 0) {
                sb.append('-');
                sb.append(this.f51568);
                sb.append('x');
                sb.append(this.f51552);
            }
            short s4 = this.f51554;
            if (s4 > 0) {
                byte b6 = this.f51553;
                if ((b6 & 15) != 7) {
                    byte b7 = this.f51565;
                    if ((b7 & 3) != 0 || (b7 & 12) != 0) {
                        s3 = 26;
                    } else if ((this.f51573 & 3) != 0) {
                        s3 = 23;
                    } else {
                        int i11 = this.f51566;
                        if (i11 == 65534) {
                            s3 = 21;
                        } else if (this.f51570 != 0 || this.f51569 != 0 || this.f51575 != 0) {
                            s3 = 13;
                        } else if ((b6 & 63) == 0) {
                            s3 = ((this.f51564 & 63) == 0 && i11 == 0) ? (short) 0 : (short) 4;
                        }
                    }
                } else {
                    s3 = 26;
                }
                if (s4 >= s3) {
                    sb.append("-v");
                    sb.append((int) this.f51554);
                }
            }
            if (this.f51545 == EnumC10977.MOTOROLA_76) {
                if (this.f51555 != 0) {
                    sb.append("-spn");
                    sb.append(((long) this.f51555) & 4294967295L);
                }
                if (this.f51567 != 0) {
                    sb.append("-gid1");
                    sb.append(((long) this.f51567) & 4294967295L);
                }
                int i12 = this.f51550;
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
                        sb.append(((long) this.f51550) & 4294967295L);
                    }
                }
            }
            int i13 = this.f51545.f37393;
            if (m37851(this.f51556) || (this.f51563[0] != 0 && m37854(this.f51556))) {
                for (byte b8 : this.f51560) {
                    if (b8 != 0) {
                        i13 = this.f51545.f37393 - 3;
                    }
                }
            } else {
                i13 = this.f51545.f37393 - 11;
            }
            if (i13 < this.f51545.f37393 || this.f51572 != null) {
                byte[] bArrM37848 = m37848();
                sb.append("-unknown");
                sb.append(i13);
                sb.append('+');
                sb.append(AbstractC13512.m33036().mo12177().mo12175().m33038(Arrays.copyOfRange(bArrM37848, i13 - 4, bArrM37848.length)));
            }
            String string = sb.toString();
            c19805.m45011(sb);
            this.f51561 = string;
        }
        return this.f51561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37845(byte[] bArr, char[] cArr, char c) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m37867(C15916 c15916) {
        int i = this.f51559 != c15916.f51559 ? 1 : 0;
        if (this.f51546 != c15916.f51546) {
            i |= 2;
        }
        if (!Arrays.equals(this.f51563, c15916.f51563) || !Arrays.equals(this.f51571, c15916.f51571)) {
            i |= 4;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                if (!Arrays.equals(this.f51562, c15916.f51562) || !Arrays.equals(this.f51556, c15916.f51556)) {
                    break;
                }
                break;
            }
            if ((this.f51549 != 0 ? (char) 0 : this.f51547[i2]) == (c15916.f51549 != 0 ? (char) 0 : c15916.f51547[i2])) {
                i2++;
            }
            i |= 4;
            break;
        }
        if (this.f51544 != c15916.f51544) {
            i |= 128;
        }
        if (this.f51566 != c15916.f51566) {
            i |= 256;
        }
        if (this.f51557 != c15916.f51557) {
            i |= 8;
        }
        if (((this.f51558 ^ c15916.f51558) & 15) != 0) {
            i |= 32;
        }
        if (this.f51576 != c15916.f51576) {
            i |= 16;
        }
        if (this.f51574 != c15916.f51574) {
            i |= 64;
        }
        if (this.f51568 != c15916.f51568 || this.f51552 != c15916.f51552 || this.f51569 != c15916.f51569 || this.f51575 != c15916.f51575) {
            i |= 512;
        }
        if (this.f51554 != c15916.f51554) {
            i |= 1024;
        }
        byte b = this.f51564;
        byte b2 = c15916.f51564;
        if (((b ^ b2) & 192) != 0) {
            i |= 16384;
        }
        if (((b ^ b2) & 63) != 0) {
            i |= 2048;
        }
        if (((this.f51573 ^ c15916.f51573) & 3) != 0) {
            i |= 32768;
        }
        if (((this.f51565 ^ c15916.f51565) & 15) != 0) {
            i |= 65536;
        }
        if (this.f51553 != c15916.f51553) {
            i |= 4096;
        }
        if (this.f51570 != c15916.f51570) {
            i |= 8192;
        }
        if (this.f51551 != c15916.f51551) {
            i |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        EnumC10977 enumC10977 = this.f51545;
        if (enumC10977 == EnumC10977.MOTOROLA_76 && c15916.f51545 == enumC10977) {
            if (this.f51555 != c15916.f51555) {
                i |= 262144;
            }
            if (this.f51567 != c15916.f51567) {
                i |= 524288;
            }
            if (this.f51550 != c15916.f51550) {
                return 1048576 | i;
            }
        }
        return i;
    }

    public final String toString() {
        if (m37865().isEmpty()) {
            return "[DEFAULT]";
        }
        String strM37865 = m37865();
        return strM37865.charAt(0) == '-' ? strM37865.substring(1) : strM37865;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C15916.class != obj.getClass()) {
            return false;
        }
        C15916 c15916 = (C15916) obj;
        return this.f51545 == c15916.f51545 && this.f51549 == c15916.f51549 && m37865().equals(c15916.m37865());
    }

    public final int hashCode() {
        return m37865().hashCode() + (((this.f51545.hashCode() * 31) + this.f51549) * 31);
    }

    public final Object clone() {
        try {
            return (C15916) super.clone();
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
    
        if ((r10.f51570 != 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        if ((r10.m37859() != 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0187, code lost:
    
        if ((r10.f51564 != 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01e0, code lost:
    
        if ((r10.f51573 != 0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x020a, code lost:
    
        if ((r10.f51565 != 0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x025c, code lost:
    
        if ((r10.f51553 != 0) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x029f, code lost:
    
        if ((r10.m37856() != 0) != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0311, code lost:
    
        if ((r10.m37852() != 0) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x038b, code lost:
    
        if ((r10.m37849() != 0) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        if ((r10.f51564 != 0) != false) goto L79;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m37864(l.C15916 r10, l.C15916 r11) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15916.m37864(l.ܺۨۨ, l.ܺۨۨ):boolean");
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37866(l.C15916 r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15916.m37866(l.ܺۨۨ):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15916 m37839(Resources resources) {
        C15916 c15916 = new C15916();
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
        c15916.f51559 = (short) i6;
        c15916.f51546 = (short) i7;
        c15916.f51544 = (byte) i8;
        c15916.f51557 = (byte) i9;
        c15916.f51566 = (short) i10;
        c15916.f51576 = (byte) i11;
        c15916.f51558 = (byte) i5;
        c15916.f51574 = (byte) i12;
        c15916.f51568 = (short) i4;
        c15916.f51552 = (short) i3;
        c15916.f51570 = (short) i13;
        c15916.f51569 = (short) i14;
        c15916.f51575 = (short) i15;
        c15916.f51564 = (byte) i17;
        c15916.f51553 = (byte) i18;
        c15916.f51565 = (byte) i16;
        c15916.f51554 = (short) i;
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
            m37843(language, c15916.f51563);
            m37843(locale.getCountry(), c15916.f51571);
            m37843(locale.getScript(), c15916.f51547);
            m37843(locale.getVariant(), c15916.f51562);
        }
        c15916.f51573 = (byte) ((i17 & 768) >> 8);
        return c15916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37838(char[] cArr) {
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
    public static void m37843(String str, char[] cArr) {
        int iMin = Math.min(str.length(), cArr.length);
        Arrays.fill(cArr, (char) 0);
        for (int i = 0; i < iMin; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m37858() {
        return ((this.f51559 & HPKE.aead_EXPORT_ONLY) << 16) | (65535 & this.f51546);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m37834() {
        char[] cArr = this.f51563;
        int i = ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24);
        char[] cArr2 = this.f51571;
        return i | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m37859() {
        return ((this.f51569 & 65535) << 16) | (65535 & this.f51575);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private int m37856() {
        return ((this.f51544 & 255) << 24) | ((this.f51557 & 255) << 16) | (this.f51566 & 65535);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private int m37852() {
        return ((this.f51576 & 255) << 24) | ((this.f51574 & 255) << 16) | ((this.f51558 & 255) << 8);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m37857() {
        return (this.f51554 & HPKE.aead_EXPORT_ONLY) << 16;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m37849() {
        return ((this.f51568 & 65535) << 16) | (65535 & this.f51552);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m37855(char[] cArr, char[] cArr2) {
        if (m37846(cArr, cArr2)) {
            return true;
        }
        char[] cArr3 = f51536;
        boolean zM37846 = m37846(cArr, cArr3);
        char[] cArr4 = f51541;
        if (zM37846 && m37846(cArr2, cArr4)) {
            return true;
        }
        return m37846(cArr, cArr4) && m37846(cArr2, cArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37846(char[] cArr, char[] cArr2) {
        return cArr[0] == cArr2[0] && cArr[1] == cArr2[1];
    }
}
