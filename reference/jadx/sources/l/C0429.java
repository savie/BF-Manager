package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֡۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0429 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f1949 = new C16576();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f1950;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C21596 f1952;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1953;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17573 f1954;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f1958;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1959;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f1961;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f1962;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2008 f1963;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f1966;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f1968;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f1969;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20414 f1970;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC23528 f1971;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f1972;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public byte[] f1973;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f1974;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C23800 f1976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1977;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f1978;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21596 f1979;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C23549 f1980;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21825 f1981;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19480[] f1982;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C0243 f1983;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f1984;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21825 f1985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23942 f1987;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f1989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f1990;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C3836 f1991;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4831 f1992;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f1993;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C21825 f1986 = C21825.m48588();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21825 f1967 = C21825.m48588();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f1975 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f1964 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C19670 f1957 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20809 f1951 = new C20809(65520);

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public HashSet f1965 = new HashSet();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f1960 = false;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public byte[] f1955 = new byte[0];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f1956 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0429 m2220(C12343 c12343) {
        C0429 c0429 = (C0429) c12343.m30656(f1949);
        return c0429 == null ? new C0429(c12343) : c0429;
    }

    public C0429(C12343 c12343) {
        EnumC13130 enumC13130 = EnumC13130.CLASS;
        EnumSet enumSetOf = EnumSet.of(enumC13130);
        EnumC13130 enumC13131 = EnumC13130.MEMBER;
        EnumSet enumSetOf2 = EnumSet.of(enumC13131);
        EnumSet enumSetOf3 = EnumSet.of(enumC13130, enumC13131);
        this.f1961 = new HashMap();
        this.f1993 = false;
        this.f1981 = C21825.m48588();
        this.f1985 = C21825.m48588();
        this.f1984 = false;
        c12343.m30659(f1949, this);
        this.f1954 = C17573.m40852(c12343);
        C23942 c23942M52776 = C23942.m52776(c12343);
        this.f1987 = c23942M52776;
        C3836 c3836M11131 = C3836.m11131(c12343);
        this.f1991 = c3836M11131;
        this.f1976 = C23800.m52336(c12343);
        InterfaceC13464 interfaceC13464 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f1989 = interfaceC13464;
        if (interfaceC13464 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f1980 = C23549.m51906(c12343);
        this.f1992 = C4831.m13414(c12343);
        this.f1970 = C20414.m46161(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        c14770M35395.m35408(EnumC19730.f63380);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f1963 = C2008.m6467(c12343);
        this.f1959 = EnumC14026.f46096.m33945(enumC11909M29706);
        this.f1977 = EnumC14026.f46103.m33945(enumC11909M29706);
        this.f1972 = EnumC14026.f46102.m33945(enumC11909M29706);
        this.f1953 = c14770M35395.m35408(EnumC19730.f63329);
        this.f1971 = EnumC23528.m51835(c12343);
        this.f1958 = AbstractC9462.m24222(c3836M11131.f14243);
        this.f1968 = C16826.m39463(c12343).m39467(EnumC0597.CLASSFILE);
        AbstractC11242 abstractC11242 = c23942M52776.f77653;
        EnumC11368 enumC11368 = EnumC11368.V45_3;
        C23363 c23363 = new C23363(this, abstractC11242, enumC11368, enumSetOf2);
        C14191 c14191 = new C14191(this, c23942M52776.f77645, enumC11368, enumSetOf2);
        C1489 c1489 = new C1489(this, c23942M52776.f77625, enumC11368, enumSetOf3);
        C9252 c9252 = new C9252(this, c23942M52776.f77633, enumC11368, enumSetOf3);
        C2900 c2900 = new C2900(this, c23942M52776.f77584, enumC11368, enumSetOf);
        C4662 c4662 = new C4662(this, c23942M52776.f77614, enumC11368, enumSetOf3);
        C13836 c13836 = new C13836(this, c23942M52776.f77611, enumC11368, enumSetOf);
        C11719 c11719 = new C11719(this, c23942M52776.f77574, enumC11368, enumSetOf3);
        AbstractC11242 abstractC11243 = c23942M52776.f77629;
        EnumC11368 enumC11369 = EnumC11368.V49;
        C3605 c3605 = new C3605(this, abstractC11243, enumC11369, enumSetOf);
        C6428 c6428 = new C6428(this, c23942M52776.f77654, enumC11369, enumSetOf3);
        C22657 c22657 = new C22657(this, c23942M52776.f77591, enumC11369, enumSetOf3);
        C14896 c14896 = new C14896(this, c23942M52776.f77544, enumC11369, enumSetOf3);
        C21245 c21245 = new C21245(this, c23942M52776.f77559, enumC11369, enumSetOf3);
        C17717 c17717 = new C17717(this, c23942M52776.f77537, enumC11369, enumSetOf3);
        C18423 c18423 = new C18423(this, c23942M52776.f77600, enumC11369, enumSetOf3);
        C7840 c7840 = new C7840(this, c23942M52776.f77603, enumC11369, enumSetOf3);
        C19129 c19129 = new C19129(this, c23942M52776.f77536, enumC11369, enumSetOf2);
        C8546 c8546 = new C8546(this, c23942M52776.f77573, enumC11369, enumSetOf3);
        C7134 c7134 = new C7134(this, c23942M52776.f77642, enumC11369, enumSetOf3);
        AbstractC11242 abstractC11244 = c23942M52776.f77551;
        EnumC11368 enumC113610 = EnumC11368.V52;
        C20540 c20540 = new C20540(this, abstractC11244, enumC113610, enumSetOf3);
        C15602 c15602 = new C15602(this, c23942M52776.f77650, enumC113610, enumSetOf3);
        C19835 c19835 = new C19835(this, c23942M52776.f77622, enumC113610, enumSetOf2);
        AbstractC11242 abstractC11245 = c23942M52776.f77562;
        EnumC11368 enumC113611 = EnumC11368.V53;
        AbstractC3956[] abstractC3956Arr = {c23363, c14191, c1489, c9252, c2900, c4662, c13836, c11719, c3605, c6428, c22657, c14896, c21245, c17717, c18423, c7840, c19129, c8546, c7134, c20540, c15602, c19835, new C16307(this, abstractC11245, enumC113611, enumSetOf), new C12074(this, c23942M52776.f77588, enumC113611, enumSetOf), new C17012(this, c23942M52776.f77592, EnumC11368.V58, enumSetOf), new C5723(this, c23942M52776.f77547, EnumC11368.V59, enumSetOf)};
        for (int i = 0; i < 26; i++) {
            AbstractC3956 abstractC3956 = abstractC3956Arr[i];
            this.f1961.put(abstractC3956.f14703, abstractC3956);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2225(C22492 c22492, AbstractC23903 abstractC23903) {
        if ((abstractC23903.f77447 & 2147487744L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || abstractC23903.f77453.m28218(this.f1987.f77621)) {
            c22492.f73417.mo24224(abstractC23903);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16100 m2233(String str, Object... objArr) {
        return new C16100(this.f1964.m52720(), this.f1975, this.f1980.m51914(str, objArr), this.f1980, this.f1992);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m2248() {
        char cM46792 = this.f1951.m46792(this.f1990);
        this.f1990 += 2;
        return cM46792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2232() {
        int i = this.f1990;
        this.f1990 = i + 1;
        return this.f1951.f67645[i] & 255;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m2245() {
        int iM46796 = this.f1951.m46796(this.f1990);
        this.f1990 += 4;
        return iM46796;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m2228() {
        AbstractC16579 abstractC16579Mo50006;
        byte[] bArr;
        int i;
        byte[] bArr2 = this.f1973;
        int i2 = this.f1962;
        byte b = bArr2[i2];
        char c = (char) b;
        C3836 c3836 = this.f1991;
        if (c == '(') {
            this.f1962 = i2 + 1;
            C21825 c21825M2236 = m2236(')');
            AbstractC16579 abstractC16579M2228 = m2228();
            C21825 c21825M48588 = C21825.m48588();
            while (true) {
                int i3 = this.f1962;
                if (i3 >= this.f1978 || this.f1973[i3] != 94) {
                    break;
                }
                this.f1962 = i3 + 1;
                c21825M48588 = c21825M48588.m48597(m2228());
            }
            for (C21825 c21825 = c21825M48588; c21825.m48595(); c21825 = c21825.f70877) {
                if (((AbstractC16579) c21825.f70876).m39001(EnumC6617.TYPEVAR)) {
                    ((AbstractC16579) c21825.f70876).f53222.f77447 |= 140737488355328L;
                }
            }
            return new C13757(c21825M2236, abstractC16579M2228, c21825M48588.m48589(), c3836.f14240);
        }
        if (c == '-') {
            this.f1962 = i2 + 1;
            return new C0350(m2228(), EnumC15395.SUPER, c3836.f14239);
        }
        if (c == '<') {
            this.f1958 = this.f1958.mo3805(this.f1964);
            C10894 c10894 = new C10894(m2228(), m2231());
            this.f1958 = this.f1958.mo24225();
            return c10894;
        }
        if (c == 'F') {
            this.f1962 = i2 + 1;
            return c3836.f14256;
        }
        C23942 c23942 = this.f1987;
        if (c != 'L') {
            if (c == 'V') {
                this.f1962 = i2 + 1;
                return c3836.f14293;
            }
            if (c == '*') {
                this.f1962 = i2 + 1;
                return new C0350(c3836.f14275, EnumC15395.UNBOUND, c3836.f14239);
            }
            if (c == '+') {
                this.f1962 = i2 + 1;
                return new C0350(m2228(), EnumC15395.EXTENDS, c3836.f14239);
            }
            if (c == 'I') {
                this.f1962 = i2 + 1;
                return c3836.f14232;
            }
            if (c == 'J') {
                this.f1962 = i2 + 1;
                return c3836.f14264;
            }
            if (c == 'S') {
                this.f1962 = i2 + 1;
                return c3836.f14225;
            }
            if (c == 'T') {
                int i4 = i2 + 1;
                this.f1962 = i4;
                while (true) {
                    bArr = this.f1973;
                    i = this.f1962;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.f1962 = i + 1;
                }
                this.f1962 = i + 1;
                return this.f1960 ? AbstractC16579.f53219 : m2235(c23942.f77631.mo17388(i4, i - i4, bArr));
            }
            if (c == 'Z') {
                this.f1962 = i2 + 1;
                return c3836.f14263;
            }
            if (c == '[') {
                this.f1962 = i2 + 1;
                return new C8777(m2228(), c3836.f14258);
            }
            switch (c) {
                case 'B':
                    this.f1962 = i2 + 1;
                    return c3836.f14271;
                case 'C':
                    this.f1962 = i2 + 1;
                    return c3836.f14294;
                case 'D':
                    this.f1962 = i2 + 1;
                    return c3836.f14291;
                default:
                    throw m2233("bad.signature", C17281.m40240(i2, 10, bArr2));
            }
        }
        if (b != 76) {
            throw m2233("bad.class.signature", C17281.m40240(i2, 10, bArr2));
        }
        this.f1962 = i2 + 1;
        AbstractC16579 c0309 = AbstractC16579.f53219;
        int i5 = this.f1956;
        while (true) {
            byte[] bArr3 = this.f1973;
            int i6 = this.f1962;
            this.f1962 = i6 + 1;
            byte b2 = bArr3[i6];
            if (b2 == 46) {
                if (c0309 != AbstractC16579.f53219) {
                    c0309 = new C0309(c3836.m11148(this.f1957, c23942.f77631.mo17388(i5, this.f1956 - i5, this.f1955)), c0309, C21825.m48588());
                }
                byte[] bArr4 = this.f1955;
                int i7 = this.f1956;
                this.f1956 = i7 + 1;
                bArr4[i7] = 36;
            } else if (b2 == 47) {
                byte[] bArr5 = this.f1955;
                int i8 = this.f1956;
                this.f1956 = i8 + 1;
                bArr5[i8] = 46;
            } else {
                if (b2 == 59) {
                    C22492 c22492M11148 = c3836.m11148(this.f1957, c23942.f77631.mo17388(i5, this.f1956 - i5, this.f1955));
                    try {
                        abstractC16579Mo50006 = c0309 == AbstractC16579.f53219 ? c22492M11148.mo50006(this.f1976) : new C0309(c22492M11148, c0309, C21825.m48588());
                        this.f1956 = i5;
                        break;
                    } catch (Throwable th) {
                        this.f1956 = i5;
                        throw th;
                    }
                }
                if (b2 != 60) {
                    byte[] bArr6 = this.f1955;
                    int i9 = this.f1956;
                    this.f1956 = i9 + 1;
                    bArr6[i9] = b2;
                } else {
                    abstractC16579Mo50006 = new C9957(this, c0309, m2236('>'), c3836.m11148(this.f1957, c23942.f77631.mo17388(i5, this.f1956 - i5, this.f1955)));
                    byte[] bArr7 = this.f1973;
                    int i10 = this.f1962;
                    int i11 = i10 + 1;
                    this.f1962 = i11;
                    byte b3 = bArr7[i10];
                    if (b3 == 46) {
                        byte[] bArr8 = this.f1955;
                        int i12 = this.f1956;
                        this.f1956 = i12 + 1;
                        bArr8[i12] = 36;
                    } else {
                        if (b3 != 59) {
                            throw new AssertionError((int) this.f1973[this.f1962 - 1]);
                        }
                        if (i11 >= this.f1978 || bArr7[i11] != 46) {
                            this.f1956 = i5;
                            break;
                        }
                        int i13 = this.f1956;
                        this.f1962 = (i13 - i5) + 3 + i11;
                        byte[] bArr9 = this.f1955;
                        this.f1956 = i13 + 1;
                        bArr9[i13] = 36;
                    }
                    c0309 = abstractC16579Mo50006;
                }
            }
        }
        int i14 = this.f1962;
        if (i14 >= this.f1978 || this.f1973[i14] != 46) {
            return abstractC16579Mo50006;
        }
        throw m2233("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m2236(char c) {
        C21825 c21825Of = C21825.of((Object) null);
        C21825 c21825Mo18818 = c21825Of;
        while (true) {
            byte[] bArr = this.f1973;
            int i = this.f1962;
            if (bArr[i] != c) {
                c21825Mo18818 = c21825Mo18818.mo18818(C21825.of((Object) m2228()));
            } else {
                this.f1962 = i + 1;
                return c21825Of.f70877;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C21825 m2231() {
        int i;
        C21825 c21825M48588 = C21825.m48588();
        byte[] bArr = this.f1973;
        int i2 = this.f1962;
        if (bArr[i2] == 60) {
            int i3 = i2 + 1;
            this.f1962 = i3;
            this.f1960 = true;
            while (this.f1973[this.f1962] != 62) {
                c21825M48588 = c21825M48588.m48597(m2247());
            }
            this.f1960 = false;
            this.f1962 = i3;
            while (true) {
                byte[] bArr2 = this.f1973;
                i = this.f1962;
                if (bArr2[i] == 62) {
                    break;
                }
                m2247();
            }
            this.f1962 = i + 1;
        }
        return c21825M48588.m48589();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22929 m2247() {
        byte[] bArr;
        int i;
        C22929 c22929;
        boolean z;
        int i2 = this.f1962;
        while (true) {
            bArr = this.f1973;
            i = this.f1962;
            if (bArr[i] == 58) {
                break;
            }
            this.f1962 = i + 1;
        }
        AbstractC11242 abstractC11242Mo17388 = this.f1987.f77631.mo17388(i2, i - i2, bArr);
        if (this.f1960) {
            c22929 = new C22929(this.f1964, this.f1991.f14228, abstractC11242Mo17388);
            this.f1958.mo24224(c22929.f53222);
        } else {
            c22929 = (C22929) m2235(abstractC11242Mo17388);
        }
        C21825 c21825M48588 = C21825.m48588();
        byte[] bArr2 = this.f1973;
        int i3 = this.f1962;
        if (bArr2[i3] == 58) {
            z = true;
            int i4 = i3 + 1;
            if (bArr2[i4] == 58) {
                this.f1962 = i4;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        while (true) {
            byte[] bArr3 = this.f1973;
            int i5 = this.f1962;
            if (bArr3[i5] != 58) {
                break;
            }
            this.f1962 = i5 + 1;
            c21825M48588 = c21825M48588.m48597(m2228());
        }
        if (!this.f1960) {
            this.f1976.m52388(c22929, c21825M48588.m48589(), z);
        }
        return c22929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m2235(AbstractC11242 abstractC11242) {
        AbstractC23903 abstractC23903Mo3804 = this.f1958.mo3804(abstractC11242, (Predicate) null);
        if (abstractC23903Mo3804 != null) {
            return abstractC23903Mo3804.f77449;
        }
        if (this.f1993) {
            C22929 c22929 = new C22929(this.f1964, this.f1991.f14228, abstractC11242);
            this.f1981 = this.f1981.m48597(c22929);
            return c22929;
        }
        throw m2233("undecl.type.var", abstractC11242);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2230(AbstractC23903 abstractC23903) {
        char cCharAt;
        abstractC23903.f77448.mo20272().mo24223(abstractC23903);
        C22492 c22492 = (C22492) abstractC23903;
        C22492 c22492M1627 = this.f1983.m1627(m2248());
        char cM2248 = m2248();
        final C0243 c0243 = this.f1983;
        C13638.requireNonNull(c0243);
        C20705 c20705 = (C20705) m2219(cM2248, new IntFunction() { // from class: l.۬֨۟
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return c0243.m1628(i);
            }
        }, (Object) null);
        AbstractC3110 abstractC3110 = c22492M1627.f73417;
        int i = 1;
        if (abstractC3110 == null || c22492M1627.f77452 != EnumC10477.f35865) {
            throw m2233("bad.enclosing.class", c22492, c22492M1627);
        }
        c22492.mo49994();
        C18258 c18258M2221 = m2221(c20705, abstractC3110, c22492.f77447);
        if (c20705 != null && c18258M2221 == null) {
            C22492 c22492M52720 = this.f1964.m52720();
            InterfaceC2173 interfaceC2173 = this.f1975;
            C14377 c14377 = C14707.f48054;
            throw new C20333(c22492M52720, interfaceC2173, this.f1980.m51910(new C14377("compiler", "bad.enclosing.method", c22492)), this.f1980, this.f1992);
        }
        AbstractC11242 abstractC11242 = c22492.f73414;
        AbstractC11242 abstractC11243 = c22492M1627.f73414;
        if (!abstractC11242.m28218(abstractC11243)) {
            throw m2233("bad.enclosing.method", abstractC11242);
        }
        String strSubstring = abstractC11242.toString().substring(abstractC11243.toString().length());
        if (strSubstring.length() < 1 || strSubstring.charAt(0) != '$') {
            throw m2233("bad.enclosing.method", abstractC11242);
        }
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        String strSubstring2 = strSubstring.substring(i);
        C23942 c23942 = this.f1987;
        AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389(strSubstring2);
        c22492.f77453 = abstractC11242M17389;
        c22492.f77448 = c18258M2221 != null ? c18258M2221 : c22492M1627;
        if (abstractC11242M17389.isEmpty()) {
            c22492.f73419 = c23942.f77594;
        } else {
            c22492.f73419 = AbstractC0618.m2876(c22492.f77453, c22492.f77448);
        }
        if (c18258M2221 != null) {
            ((C0309) abstractC23903.f77449).mo1927(c18258M2221.f77449);
        } else if ((c22492.f77447 & 8) == 0) {
            ((C0309) abstractC23903.f77449).mo1927(c22492M1627.f77449);
        } else {
            ((C0309) abstractC23903.f77449).mo1927(AbstractC16579.f53219);
        }
        m2241(c22492, c22492.f77449);
        if (!this.f1981.isEmpty()) {
            C19003 c19003 = new C19003();
            Iterator it = this.f1981.iterator();
            while (it.hasNext()) {
                c19003.m43723(m2235(((AbstractC16579) it.next()).f53222.f77453));
            }
            this.f1985 = c19003.m43726();
            return;
        }
        this.f1985 = C21825.m48588();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18258 m2221(C20705 c20705, AbstractC3110 abstractC3110, long j) {
        if (c20705 == null) {
            return null;
        }
        AbstractC11242 abstractC11242 = c20705.f67327;
        AbstractC16579 abstractC16579 = c20705.f67328;
        C13757 c13757Mo27295 = abstractC16579.mo27295();
        for (AbstractC23903 abstractC23903 : abstractC3110.m9327(abstractC11242)) {
            if (abstractC23903.f77452 == EnumC10477.f35879) {
                C13757 c13757Mo27296 = abstractC23903.f77449.mo27295();
                C21825 c21825 = c13757Mo27296.f45367;
                C23800 c23800 = this.f1976;
                C21825 c21825M48597 = c23800.m52424(c21825).m48597(c23800.m52402(c13757Mo27296.f45368));
                C21825 c21825M48598 = c13757Mo27295.f45367.m48597(c13757Mo27295.f45368);
                while (true) {
                    if (!c21825M48597.isEmpty() && !c21825M48598.isEmpty()) {
                        if (((AbstractC16579) c21825M48597.f70876).f53222 != ((AbstractC16579) c21825M48598.f70876).f53222) {
                            break;
                        }
                        c21825M48597 = c21825M48597.f70877;
                        c21825M48598 = c21825M48598.f70877;
                    } else {
                        if (!c21825M48597.isEmpty() || !c21825M48598.isEmpty()) {
                            break;
                        }
                        return (C18258) abstractC23903;
                    }
                }
            }
        }
        if (abstractC11242 == this.f1987.f77632 && (512 & j) == 0 && !abstractC16579.mo33523().isEmpty()) {
            return m2221(new C20705(abstractC11242, new C13757(abstractC16579.mo33523().f70877, abstractC16579.mo16235(), abstractC16579.mo33524(), this.f1991.f14240)), abstractC3110, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2240(AbstractC23903 abstractC23903, EnumC13130 enumC13130) {
        char cM2248 = m2248();
        for (int i = 0; i < cM2248; i++) {
            AbstractC11242 abstractC11242M1624 = this.f1983.m1624(m2248());
            int iM2245 = m2245();
            AbstractC3956 abstractC3956 = (AbstractC3956) this.f1961.get(abstractC11242M1624);
            if (abstractC3956 != null && abstractC3956.mo11442(enumC13130)) {
                abstractC3956.mo5135(iM2245, abstractC23903);
            } else {
                this.f1990 += iM2245;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2250(AbstractC23903 abstractC23903) {
        char cM2248 = m2248();
        C19003 c19003 = new C19003();
        for (int i = 0; i < cM2248; i++) {
            c19003.m43723(m2242());
        }
        C21825<C21596> c21825M43726 = c19003.m43726();
        if (c21825M43726.isEmpty()) {
            return;
        }
        C19003 c19004 = new C19003();
        for (C21596 c21596 : c21825M43726) {
            AbstractC16579 abstractC16579 = c21596.f75167;
            AbstractC11242 abstractC11242Mo50003 = abstractC16579.f53222.mo50003();
            C3836 c3836 = this.f1991;
            if (abstractC11242Mo50003 == c3836.f14304.f53222.mo50003()) {
                abstractC23903.f77447 |= 274877906944L;
            } else {
                AbstractC11242 abstractC11242Mo50004 = abstractC16579.f53222.mo50003();
                AbstractC11242 abstractC11242Mo50005 = c3836.f14257.f53222.mo50003();
                C23942 c23942 = this.f1987;
                if (abstractC11242Mo50004 == abstractC11242Mo50005) {
                    EnumC23528 enumC23528 = EnumC23528.f76172;
                    EnumC23528 enumC23529 = this.f1971;
                    if (enumC23529 != enumC23528) {
                        for (C2068 c2068 : c21596.f70059) {
                            if (c2068.f7664 == c23942.f77643) {
                                Object obj = c2068.f7665;
                                if (obj instanceof C2693) {
                                    C2693 c2693 = (C2693) obj;
                                    if (c2693.f75167 == c3836.f14232 && ((Integer) c2693.f10382).intValue() > enumC23529.f76177) {
                                        abstractC23903.f77447 |= 35184372088832L;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC16579.f53222.mo50003() == c3836.f14279.f53222.mo50003()) {
                    abstractC23903.f77447 |= 72057594037927936L;
                    m2224(c21596, abstractC23903, c23942.f77552, 288230376151711744L);
                } else if (abstractC16579.f53222.mo50003() == c3836.f14250.f53222.mo50003()) {
                    C6171.m17176(abstractC23903.f77452 == EnumC10477.f35865);
                    abstractC23903.f77447 |= 9007199254740992L;
                } else {
                    AbstractC0618 abstractC0618 = abstractC16579.f53222;
                    if (abstractC0618 == c3836.f14231.f53222) {
                        this.f1952 = c21596;
                    } else if (abstractC0618 == c3836.f14222.f53222) {
                        this.f1979 = c21596;
                    } else if (abstractC0618 == c3836.f14253.f53222) {
                        abstractC23903.f77447 |= 18014398509613056L;
                        m2224(c21596, abstractC23903, c23942.f77568, 36028797018963968L);
                    } else if (abstractC0618 == c3836.f14238.f53222) {
                        abstractC23903.f77447 |= 72057594037927936L;
                        m2224(c21596, abstractC23903, c23942.f77552, 288230376151711744L);
                    } else if (abstractC0618 == c3836.f14255.f53222 && abstractC23903.f77452 == EnumC10477.f35865) {
                        abstractC23903.f77447 |= 9007199254740992L;
                    }
                    c19004.m43723(c21596);
                }
            }
        }
        this.f1954.m40868(new RunnableC2545(this, abstractC23903, c19004.m43726()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2224(C21596 c21596, AbstractC23903 abstractC23903, AbstractC11242 abstractC11242, long j) {
        for (C2068 c2068 : c21596.f70059) {
            if (c2068.f7664 == abstractC11242) {
                Object obj = c2068.f7665;
                if (obj instanceof C2693) {
                    C2693 c2693 = (C2693) obj;
                    if (c2693.f75167 == this.f1991.f14263 && ((Integer) c2693.f10382).intValue() != 0) {
                        abstractC23903.f77447 |= j;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m2243(AbstractC23903 abstractC23903) {
        int i = this.f1990;
        this.f1990 = i + 1;
        int i2 = this.f1951.f67645[i] & 255;
        C19480[] c19480Arr = this.f1982;
        if (c19480Arr == null) {
            this.f1982 = new C19480[i2];
        } else if (c19480Arr.length != i2) {
            throw m2233("bad.runtime.invisible.param.annotations", abstractC23903);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C19480[] c19480Arr2 = this.f1982;
            if (c19480Arr2[i3] == null) {
                c19480Arr2[i3] = new C19480();
            }
            C19480 c19480 = c19480Arr2[i3];
            char cM2248 = m2248();
            C19003 c19003 = new C19003();
            for (int i4 = 0; i4 < cM2248; i4++) {
                c19003.m43723(m2242());
            }
            C21825 c21825M43726 = c19003.m43726();
            C21825 c21825 = c19480.f62700;
            if (c21825 == null) {
                c19480.f62700 = c21825M43726;
            } else {
                c19480.f62700 = c21825.m48594(c21825M43726);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2246(AbstractC23903 abstractC23903) {
        C10935 c10935M27424;
        C10935 c10935M27431;
        char cM2248 = m2248();
        if (cM2248 != 0) {
            C19003 c19003 = new C19003();
            for (int i = 0; i < cM2248; i++) {
                int iM2232 = m2232();
                if (!EnumC6659.m18044(iM2232)) {
                    throw m2233("bad.type.annotation.value", String.format("0x%02X", Integer.valueOf(iM2232)));
                }
                EnumC6659 enumC6659M18042 = EnumC6659.m18042(iM2232);
                switch (C10663.f36371[enumC6659M18042.ordinal()]) {
                    case 1:
                        char cM2249 = m2248();
                        c10935M27424 = C10935.m27424(m2251(), null, -1);
                        c10935M27424.f37182 = cM2249;
                        break;
                    case 2:
                        char cM22410 = m2248();
                        c10935M27424 = C10935.m27426(m2251(), null, -1);
                        c10935M27424.f37182 = cM22410;
                        break;
                    case 3:
                        char cM22411 = m2248();
                        c10935M27424 = C10935.m27428(m2251(), null, -1);
                        c10935M27424.f37182 = cM22411;
                        break;
                    case 4:
                        char cM22412 = m2248();
                        c10935M27424 = C10935.m27422(m2251(), null, -1);
                        c10935M27424.f37182 = cM22412;
                        break;
                    case 5:
                        int iM2248 = m2248();
                        int[] iArr = new int[iM2248];
                        int[] iArr2 = new int[iM2248];
                        int[] iArr3 = new int[iM2248];
                        for (int i2 = 0; i2 < iM2248; i2++) {
                            iArr[i2] = m2248();
                            iArr2[i2] = m2248();
                            iArr3[i2] = m2248();
                        }
                        c10935M27431 = C10935.m27431(m2251(), null, -1);
                        c10935M27431.f37187 = iArr;
                        c10935M27431.f37180 = iArr2;
                        c10935M27431.f37192 = iArr3;
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 6:
                        int iM2249 = m2248();
                        int[] iArr4 = new int[iM2249];
                        int[] iArr5 = new int[iM2249];
                        int[] iArr6 = new int[iM2249];
                        for (int i3 = 0; i3 < iM2249; i3++) {
                            iArr4[i3] = m2248();
                            iArr5[i3] = m2248();
                            iArr6[i3] = m2248();
                        }
                        c10935M27431 = C10935.m27433(m2251(), null, -1);
                        c10935M27431.f37187 = iArr4;
                        c10935M27431.f37180 = iArr5;
                        c10935M27431.f37192 = iArr6;
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 7:
                        char cM22413 = m2248();
                        c10935M27424 = C10935.m27439(m2251(), null, -1);
                        c10935M27424.m27446(cM22413);
                        break;
                    case 8:
                        c10935M27431 = C10935.m27442(m2251(), null, -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 9:
                        c10935M27431 = C10935.m27434(m2251(), null, m2232(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 10:
                        c10935M27431 = C10935.m27438(m2251(), null, m2232(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 11:
                        c10935M27431 = C10935.m27441(m2251(), null, m2232(), m2232(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 12:
                        c10935M27431 = C10935.m27430(m2251(), null, m2232(), m2232(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 13:
                        c10935M27431 = C10935.m27429(m2251(), null, m2248(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 14:
                        c10935M27431 = C10935.m27423(m2251(), null, m2248(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 15:
                        c10935M27431 = C10935.m27432(m2251(), null, m2232(), -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 16:
                        char cM22414 = m2248();
                        c10935M27424 = C10935.m27427(m2251(), null, m2232(), -1);
                        c10935M27424.f37182 = cM22414;
                        break;
                    case 17:
                        char cM22415 = m2248();
                        c10935M27424 = C10935.m27440(m2251(), null, m2232(), -1);
                        c10935M27424.f37182 = cM22415;
                        break;
                    case 18:
                        char cM22416 = m2248();
                        c10935M27424 = C10935.m27425(m2251(), null, m2232(), -1);
                        c10935M27424.f37182 = cM22416;
                        break;
                    case 19:
                        char cM22417 = m2248();
                        c10935M27424 = C10935.m27436(m2251(), null, m2232(), -1);
                        c10935M27424.f37182 = cM22417;
                        break;
                    case 20:
                        char cM22418 = m2248();
                        c10935M27424 = C10935.m27443(m2251(), null, m2232(), -1);
                        c10935M27424.f37182 = cM22418;
                        break;
                    case 21:
                        c10935M27431 = C10935.m27437(m2251(), null, -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 22:
                        c10935M27431 = C10935.m27435(m2251(), null, -1);
                        continue;
                        c19003.m43723(new C15953(m2242(), c10935M27431));
                        break;
                    case 23:
                        throw new AssertionError("jvm.ClassReader: UNKNOWN target type should never occur!");
                    default:
                        throw new AssertionError("jvm.ClassReader: Unknown target type for position: " + enumC6659M18042);
                }
                c10935M27431 = c10935M27424;
                c19003.m43723(new C15953(m2242(), c10935M27431));
            }
            this.f1954.m40868(new C20891(this, abstractC23903, c19003.m43726()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2239(AbstractC23903 abstractC23903) {
        C18258 c18258 = (C18258) abstractC23903;
        AbstractC23156 abstractC23156M2229 = m2229();
        c18258.f58258 = abstractC23156M2229;
        this.f1954.m40868(new RunnableC5368(this, c18258, abstractC23156M2229));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m2234(int i) {
        if (this.f1957.f63139 == this.f1964) {
            return new C8897(this, i);
        }
        return this.f1983.m1623(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21596 m2242() {
        AbstractC16579 abstractC16579M2234;
        if (this.f1957.f63139 != this.f1964) {
            abstractC16579M2234 = m2234((int) m2248());
        } else {
            abstractC16579M2234 = new C8897(this, m2248());
        }
        char cM2248 = m2248();
        C19003 c19003 = new C19003();
        for (int i = 0; i < cM2248; i++) {
            c19003.m43723(new C2068(this.f1983.m1624(m2248()), m2229()));
        }
        return new C21596(abstractC16579M2234, c19003.m43726());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21825 m2251() {
        C17284 c17284;
        int iM2232 = m2232();
        C19003 c19003 = new C19003();
        for (int i = 0; i < iM2232 * 2; i++) {
            c19003.m43723(Integer.valueOf(m2232()));
        }
        C21825 c21825M43726 = c19003.m43726();
        C21825 c21825 = C10935.f37179;
        C19003 c19004 = new C19003();
        Iterator it = c21825M43726.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C6171.m17176(it.hasNext());
            Integer num2 = (Integer) it.next();
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C17284 c17285 = C17284.f55038;
            C6171.m17176(iIntValue2 == 0 || iIntValue == EnumC5995.TYPE_ARGUMENT.f20382);
            if (iIntValue == 0) {
                c17284 = C17284.f55038;
            } else if (iIntValue == 1) {
                c17284 = C17284.f55036;
            } else if (iIntValue == 2) {
                c17284 = C17284.f55037;
            } else {
                if (iIntValue != 3) {
                    C6171.m17174("Invalid TypePathEntryKind tag: " + iIntValue);
                    throw null;
                }
                c17284 = new C17284(EnumC5995.TYPE_ARGUMENT, iIntValue2);
            }
            c19004.m43723(c17284);
        }
        return c19004.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m2219(int i, IntFunction intFunction, Object obj) {
        return i == 0 ? obj : intFunction.apply(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC23156 m2229() {
        int i = this.f1990;
        this.f1990 = i + 1;
        char c = (char) this.f1951.f67645[i];
        if (c != '@') {
            C3836 c3836 = this.f1991;
            if (c == 'F') {
                return new C2693(this.f1983.m1631(m2248()), c3836.f14256);
            }
            if (c == 'S') {
                return new C2693(this.f1983.m1631(m2248()), c3836.f14225);
            }
            if (c == 'c') {
                AbstractC16579 abstractC16579M2234 = m2234((int) m2248());
                C6779 c6779 = new C6779(null);
                c6779.f22884 = abstractC16579M2234;
                return c6779;
            }
            if (c == 'e') {
                AbstractC16579 abstractC16579M2235 = m2234((int) m2248());
                AbstractC11242 abstractC11242M1624 = this.f1983.m1624(m2248());
                C18068 c18068 = new C18068(null);
                c18068.f57781 = abstractC16579M2235;
                c18068.f57780 = abstractC11242M1624;
                return c18068;
            }
            if (c == 's') {
                return new C2693(this.f1983.m1624(m2248()).toString(), c3836.f14220);
            }
            if (c == 'I') {
                return new C2693(this.f1983.m1631(m2248()), c3836.f14232);
            }
            if (c == 'J') {
                return new C2693(this.f1983.m1631(m2248()), c3836.f14264);
            }
            if (c == 'Z') {
                return new C2693(this.f1983.m1631(m2248()), c3836.f14263);
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return new C2693(this.f1983.m1631(m2248()), c3836.f14271);
                    case 'C':
                        return new C2693(this.f1983.m1631(m2248()), c3836.f14294);
                    case 'D':
                        return new C2693(this.f1983.m1631(m2248()), c3836.f14291);
                    default:
                        throw new AssertionError("unknown annotation tag '" + c + "'");
                }
            }
            char cM2248 = m2248();
            C19003 c19003 = new C19003();
            for (int i2 = 0; i2 < cM2248; i2++) {
                c19003.m43723(m2229());
            }
            C21825 c21825M43726 = c19003.m43726();
            C1134 c1134 = new C1134(null);
            c1134.f5102 = c21825M43726;
            return c1134;
        }
        return m2242();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2237(AbstractC11242 abstractC11242, AbstractC16579 abstractC16579) {
        if ((!abstractC16579.m39001(EnumC6617.METHOD) && !abstractC16579.m39001(EnumC6617.FORALL)) || (abstractC11242 == this.f1987.f77632 && !abstractC16579.mo16235().m39001(EnumC6617.VOID))) {
            throw m2233("method.descriptor.invalid", abstractC11242);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m2244() {
        this.f1990 += 6;
        char cM2248 = m2248();
        for (int i = 0; i < cM2248; i++) {
            this.f1990 += 2;
            this.f1990 += m2245();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2241(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        if (abstractC16579.mo1934() != null) {
            if (!abstractC16579.mo1934().m39001(EnumC6617.NONE)) {
                m2241(abstractC23903.f77448, abstractC16579.mo1934());
            }
        } else if (abstractC23903.f77452 == EnumC10477.f35879 && !abstractC23903.mo22992()) {
            AbstractC23903 abstractC23904 = abstractC23903.f77448;
            m2241(abstractC23904, abstractC23904.f77449);
        }
        for (C21825 c21825Mo1938 = abstractC16579.mo1938(); c21825Mo1938.m48595(); c21825Mo1938 = c21825Mo1938.f70877) {
            this.f1958.mo24224(((AbstractC16579) c21825Mo1938.f70876).f53222);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2249(C22492 c22492) {
        char cM2248 = m2248();
        for (int i = 0; i < cM2248; i++) {
            m2248();
            char cM2249 = m2248();
            char cM22410 = m2248();
            final C0243 c0243 = this.f1983;
            C13638.requireNonNull(c0243);
            C22492 c22493 = (C22492) m2219(cM2249, new IntFunction() { // from class: l.֨֨۟
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return c0243.m1627(i2);
                }
            }, (Object) null);
            C0243 c0244 = this.f1983;
            C13638.requireNonNull(c0244);
            C21951 c21951 = new C21951(c0244);
            C23942 c23942 = this.f1987;
            AbstractC11242 abstractC11242 = c23942.f77594;
            AbstractC11242 abstractC11243 = c23942.f77594;
            AbstractC11242 abstractC11244 = (AbstractC11242) m2219(cM22410, c21951, abstractC11242);
            if (abstractC11244 == null) {
                abstractC11244 = abstractC11243;
            }
            long jM2248 = m2248();
            if ((X931RNG.BLOCK64_RESEED_MAX & jM2248) != 0) {
                jM2248 = (jM2248 & (-32769)) | 2251799813685248L;
            }
            long j = (-33) & jM2248;
            if (c22493 != null) {
                if (abstractC11244 == abstractC11243) {
                    abstractC11244 = c23942.f77549;
                }
                C22492 c22492M11149 = this.f1991.m11149(this.f1957, abstractC11244, c22493);
                if ((jM2248 & 8) == 0) {
                    ((C0309) c22492M11149.f77449).mo1927(c22493.f77449);
                    AbstractC16579 abstractC16579 = c22492M11149.f77454;
                    if (abstractC16579 != null) {
                        ((C0309) abstractC16579).mo1927(this.f1976.m52402(c22493.f77449));
                    }
                }
                if (c22492 == c22493) {
                    c22492M11149.f77447 = j;
                    m2225(c22492, c22492M11149);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2226(C22492 c22492) {
        C23800 c23800;
        C18258 c18258;
        int iM25344;
        AbstractC16579 abstractC16579;
        AbstractC11242 abstractC11242M17389;
        AbstractC11242 abstractC11242;
        long j;
        C19480 c19480;
        C21825 c21825;
        int i;
        int i2;
        boolean z;
        char c = 0;
        if (m2245() != -889275714) {
            throw m2233("illegal.start.of.class.file", new Object[0]);
        }
        this.f1988 = m2248();
        this.f1966 = m2248();
        int i3 = EnumC11368.m28473().f38348;
        int i4 = EnumC11368.m28473().f38349;
        int i5 = this.f1988;
        boolean z2 = i5 == 65535;
        int i6 = this.f1966;
        int i7 = 2;
        C20414 c20414 = this.f1970;
        if (i6 > i3 || (i6 * 1000) + i5 < (EnumC11368.m28472().f38348 * 1000) + EnumC11368.m28472().f38349) {
            int i8 = this.f1966;
            if (i8 != i3 + 1 || z2) {
                throw m2233("wrong.version", Integer.toString(i8), Integer.toString(this.f1988), Integer.toString(i3), Integer.toString(i4));
            }
            InterfaceC2173 interfaceC2173 = this.f1975;
            C14065 c14065 = C9768.f32836;
            c20414.m48201(new C14065("compiler", "big.major.version", interfaceC2173, Integer.valueOf(i8), Integer.valueOf(i3)));
        }
        if (z2) {
            C2008 c2008 = this.f1963;
            if (c2008.m6473()) {
                c2008.m6477(c22492.f73422, this.f1966);
            } else {
                c20414.m48197(c2008.m6468(this.f1975, this.f1966));
            }
        }
        C20809 c20809 = this.f1951;
        C23942 c23942 = this.f1987;
        C3836 c3836 = this.f1991;
        C0243 c0243 = new C0243(this, c20809, c23942, c3836);
        this.f1983 = c0243;
        int iM1625 = c0243.m1625(c20809, this.f1990);
        this.f1990 = iM1625;
        if (this.f1955.length < iM1625) {
            this.f1955 = new byte[Integer.highestOneBit(iM1625) << 1];
        }
        C0309 c0309 = (C0309) c22492.f77449;
        c22492.f73417 = AbstractC9462.m24222(c22492);
        this.f1958 = this.f1958.mo3805(this.f1964);
        if (c0309.mo1934().m39001(EnumC6617.CLASS)) {
            m2241(c22492.f77448, c0309.mo1934());
        }
        long jM2248 = m2248();
        if ((X931RNG.BLOCK64_RESEED_MAX & jM2248) != 0) {
            jM2248 = (jM2248 & (-32769)) | 2251799813685248L;
        }
        long j2 = (-33) & jM2248;
        long j3 = jM2248 & 2251799813685248L;
        if (j3 == 0) {
            EnumC10477 enumC10477 = c22492.f77448.f77452;
            if (enumC10477 == EnumC10477.f35867 || enumC10477 == EnumC10477.f35866) {
                c22492.f77447 = j2;
            }
            this.f1957 = c22492.m52724().f25392;
            C22492 c22492M1627 = this.f1983.m1627(m2248());
            if (c22492 != c22492M1627) {
                throw m2233("class.file.wrong.class", c22492M1627.f73414);
            }
        } else {
            int i9 = this.f1966;
            if (i9 < EnumC11368.V53.f38348) {
                throw m2233("anachronistic.module.info", Integer.toString(i9), Integer.toString(this.f1988));
            }
            c22492.f77447 = j2;
            AbstractC23903 abstractC23903 = c22492.f77448;
            if (abstractC23903.f77452 != EnumC10477.f35868) {
                throw m2233("module.info.definition.expected", new Object[0]);
            }
            this.f1957 = (C19670) abstractC23903;
            m2248();
        }
        int i10 = this.f1990;
        m2248();
        this.f1990 = (m2248() * 2) + this.f1990;
        char cM2248 = m2248();
        for (int i11 = 0; i11 < cM2248; i11++) {
            m2244();
        }
        char cM2249 = m2248();
        for (int i12 = 0; i12 < cM2249; i12++) {
            m2244();
        }
        m2240(c22492, EnumC13130.CLASS);
        C21825 c21826 = c22492.f73421;
        if (c21826 != null && !c21826.isEmpty()) {
            c22492.f77447 |= SkeinEngine.UbiTweak.T1_FIRST;
        }
        this.f1990 = i10;
        char cM22410 = m2248();
        if (j3 != 0 && cM22410 > 0) {
            throw m2233("module.info.invalid.super.class", new Object[0]);
        }
        if (c0309.f1654 == null) {
            c0309.f1654 = (AbstractC16579) m2219(cM22410, new IntFunction() { // from class: l.ۚ֨۟
                @Override // java.util.function.IntFunction
                public final Object apply(int i13) {
                    C0429 c0429 = this.f17468;
                    return c0429.f1983.m1627(i13).mo50006(c0429.f1976);
                }
            }, AbstractC16579.f53219);
        }
        char cM22411 = m2248();
        C21825 c21825M48588 = C21825.m48588();
        int i13 = 0;
        while (true) {
            c23800 = this.f1976;
            if (i13 >= cM22411) {
                break;
            }
            c21825M48588 = c21825M48588.m48597(this.f1983.m1627(m2248()).mo50006(c23800));
            i13++;
        }
        if (c0309.f1658 == null) {
            c0309.f1658 = c21825M48588.m48589();
        }
        C6171.m17176(cM2248 == m2248());
        for (int i14 = 0; i14 < cM2248; i14++) {
            AbstractC23903 c6263 = new C6263(m2248(), this.f1983.m1624(m2248()), this.f1983.m1623(m2248()), this.f1964);
            m2240(c6263, EnumC13130.MEMBER);
            m2225(c22492, c6263);
        }
        C6171.m17176(cM2249 == m2248());
        int i15 = 0;
        while (i15 < cM2249) {
            long jM2249 = m2248();
            if ((64 & jM2249) != 0) {
                jM2249 = (jM2249 & (-65)) | 2147483648L;
            }
            if ((128 & jM2249) != 0) {
                jM2249 = (jM2249 & (-129)) | 17179869184L;
            }
            AbstractC11242 abstractC11242M1624 = this.f1983.m1624(m2248());
            AbstractC16579 abstractC16579M1623 = this.f1983.m1623(m2248());
            if (this.f1964.m52721() && (jM2249 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && !abstractC11242M1624.equals(c23942.f77608)) {
                int i16 = this.f1966;
                EnumC11368 enumC11368 = EnumC11368.V52;
                int i17 = enumC11368.f38348;
                if (i16 <= i17 && (i16 != i17 || this.f1988 < enumC11368.f38349)) {
                    String str = (8 & jM2249) == 0 ? "invalid.default.interface" : "invalid.static.interface";
                    Object string = Integer.toString(i16);
                    Object string2 = Integer.toString(this.f1988);
                    Object[] objArr = new Object[i7];
                    objArr[c] = string;
                    objArr[1] = string2;
                    throw m2233(str, objArr);
                }
                if ((10 & jM2249) == 0) {
                    this.f1964.f77447 |= 8796093022208L;
                    jM2249 |= 8796093023232L;
                }
            }
            m2237(abstractC11242M1624, abstractC16579M1623);
            if (abstractC11242M1624 == c23942.f77632 && this.f1964.m52727()) {
                AbstractC9462 abstractC9462Mo20272 = this.f1964.f77448.mo20272();
                AbstractC23903 abstractC23904 = this.f1964;
                EnumC10167 enumC10167 = EnumC10167.NON_RECURSIVE;
                abstractC9462Mo20272.getClass();
                boolean zHasNext = abstractC9462Mo20272.mo3803(abstractC23904.f77453, new C3419(abstractC23904), enumC10167).iterator().hasNext();
                if (!this.f1964.f77453.isEmpty() && zHasNext) {
                    C21825<AbstractC16579> c21825Mo33523 = abstractC16579M1623.mo33523();
                    if (!c21825Mo33523.isEmpty()) {
                        if ((jM2249 & 17179869184L) != 0) {
                            AbstractC16579 abstractC165710 = (AbstractC16579) c21825Mo33523.last();
                            C19003 c19003 = new C19003();
                            for (AbstractC16579 abstractC16579M22849 : c21825Mo33523) {
                                if (abstractC16579M22849 == abstractC165710) {
                                    abstractC16579M22849 = ((C8777) abstractC16579M22849).m22849();
                                }
                                c19003.m43723(abstractC16579M22849);
                            }
                            c21825Mo33523 = c19003.m43726();
                        }
                        c21825Mo33523 = c21825Mo33523.f70877;
                    }
                    abstractC16579M1623 = new C13757(c21825Mo33523, abstractC16579M1623.mo16235(), abstractC16579M1623.mo33524(), c3836.f14240);
                }
            }
            C18258 c18259 = new C18258(jM2249, abstractC11242M1624, abstractC16579M1623, this.f1964);
            if (c23800.m52395(c18259)) {
                c18259.f77447 |= 70368744177664L;
            }
            if (this.f1953) {
                int iM25337 = C10039.m25337(c18259.f77449.mo33523()) + 4;
                int[] iArr = this.f1974;
                if (iArr == null || iArr.length < iM25337) {
                    this.f1974 = new int[iM25337];
                    z = false;
                } else {
                    z = false;
                    Arrays.fill(iArr, 0);
                }
                this.f1969 = z;
            }
            AbstractC23903 abstractC23905 = this.f1964;
            this.f1964 = c18259;
            try {
                m2240(c18259, EnumC13130.MEMBER);
                this.f1964 = abstractC23905;
                m2237(abstractC11242M1624, c18259.f77449);
                if (this.f1969) {
                    iM25344 = 0;
                } else {
                    iM25344 = (c18259.f77447 & 8) == 0 ? 1 : 0;
                    if (c18259.f77453 == c23942.f77632 && this.f1964.m52727() && !this.f1964.f77453.isEmpty()) {
                        iM25344++;
                    }
                    if (c18259.f77449 != abstractC16579M1623) {
                        iM25344 += C10039.m25337(abstractC16579M1623.mo33523()) - C10039.m25337(c18259.f77449.mo33523());
                    }
                }
                HashSet hashSet = new HashSet();
                C19003 c19004 = new C19003();
                int i18 = 0;
                for (AbstractC16579 abstractC165711 : c18259.f77449.mo33523()) {
                    C3836 c3837 = c3836;
                    int[] iArr2 = this.f1950;
                    long j4 = 8589934592L;
                    char c2 = cM2249;
                    if (iArr2 != null && iM25344 < iArr2.length && (i2 = iArr2[iM25344]) != 0) {
                        j4 = ((long) i2) | 8589934592L;
                    }
                    int[] iArr3 = this.f1974;
                    if (iArr3 == null || iM25344 >= iArr3.length || (i = iArr3[iM25344]) == 0) {
                        String strM37076 = "arg";
                        while (true) {
                            StringBuilder sbM23356 = C9023.m23356(strM37076);
                            sbM23356.append(hashSet.size());
                            abstractC11242M17389 = c23942.f77631.m17389(sbM23356.toString());
                            if (!hashSet.contains(abstractC11242M17389)) {
                                break;
                            } else {
                                strM37076 = C15489.m37076(strM37076, "$");
                            }
                        }
                        abstractC11242 = abstractC11242M17389;
                        j = j4;
                    } else {
                        C0243 c0244 = this.f1983;
                        C13638.requireNonNull(c0244);
                        abstractC11242 = (AbstractC11242) m2219(i, new C21951(c0244), c23942.f77594);
                        j = j4 | 4503599627370496L;
                    }
                    hashSet.add(abstractC11242);
                    C21080 c21080 = new C21080(j, abstractC11242, abstractC165711, c18259);
                    c19004.m43723(c21080);
                    C19480[] c19480Arr = this.f1982;
                    if (c19480Arr != null && (c19480 = c19480Arr[i18]) != null && (c21825 = c19480.f62700) != null && !c21825.isEmpty()) {
                        this.f1954.m40868(new RunnableC2545(this, c21080, c19480.f62700));
                    }
                    iM25344 += this.f1969 ? 1 : C10039.m25344(abstractC165711);
                    i18++;
                    c3836 = c3837;
                    cM2249 = c2;
                    abstractC16579M1623 = abstractC16579M1623;
                }
                C3836 c3838 = c3836;
                char c3 = cM2249;
                AbstractC16579 abstractC165712 = abstractC16579M1623;
                C19480[] c19480Arr2 = this.f1982;
                if (c19480Arr2 != null && c19480Arr2.length != i18) {
                    throw m2233("bad.runtime.invisible.param.annotations", c18259);
                }
                C6171.m17178(c18259.f58259);
                c18259.f58259 = c19004.m43726();
                this.f1982 = null;
                this.f1974 = null;
                this.f1950 = null;
                if ((jM2249 & 17179869184L) != 0 && ((abstractC16579 = (AbstractC16579) abstractC165712.mo33523().last()) == null || !abstractC16579.m39001(EnumC6617.ARRAY))) {
                    c18259.f77447 &= -17179869185L;
                    throw m2233("malformed.vararg.method", c18259);
                }
                m2225(c22492, c18259);
                i15++;
                c = 0;
                i7 = 2;
                c3836 = c3838;
                cM2249 = c3;
            } catch (Throwable th) {
                this.f1964 = abstractC23905;
                throw th;
            }
        }
        if (c22492.m50010()) {
            for (C16142 c16142 : c22492.m50004()) {
                AbstractC11242 abstractC11243 = c16142.f77453;
                C21825 c21825M48589 = C21825.m48588();
                c22492.mo49994();
                AbstractC9462 abstractC9462 = c22492.f73417;
                C2257 c2257 = new C2257(1);
                abstractC9462.getClass();
                Iterator it = abstractC9462.mo3803(abstractC11243, c2257, EnumC10167.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c18258 = null;
                        break;
                    }
                    AbstractC23903 abstractC23906 = (AbstractC23903) it.next();
                    if (c23800.m52401(abstractC23906.f77449.mo33523(), c21825M48589)) {
                        c18258 = (C18258) abstractC23906;
                        break;
                    }
                }
                c16142.f52153 = c18258;
            }
        }
        this.f1958 = this.f1958.mo24225();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2238(C22492 c22492) {
        C23800 c23800 = this.f1976;
        this.f1964 = c22492;
        this.f1975 = c22492.f73422;
        this.f1965.clear();
        this.f1984 = true;
        this.f1952 = null;
        this.f1979 = null;
        try {
            try {
                this.f1990 = 0;
                C20809 c20809 = this.f1951;
                c20809.f67646 = 0;
                c20809.m46795(c22492.f73422.mo10167());
                m2226(c22492);
                if (!this.f1981.isEmpty() && !this.f1985.isEmpty()) {
                    C21825 c21825 = this.f1981;
                    C21825 c21826 = this.f1985;
                    this.f1981 = C21825.m48588();
                    this.f1985 = C21825.m48588();
                    this.f1986 = C21825.m48588();
                    this.f1967 = C21825.m48588();
                    this.f1984 = false;
                    C0309 c0309 = (C0309) this.f1964.f77449;
                    c0309.f1654 = c23800.m52371(c0309.f1654, c21825, c21826);
                    c0309.f1658 = c23800.m52380(c0309.f1658, c21825, c21826);
                    C21825 c21825M52425 = c23800.m52425(c0309.f1655, c21825, c21826);
                    c0309.f1655 = c21825M52425;
                    while (c21825M52425.m48595()) {
                        Object obj = c21825M52425.f70876;
                        ((AbstractC16579) obj).f53222.f77449 = (AbstractC16579) obj;
                        c21825M52425 = c21825M52425.f70877;
                    }
                } else if (this.f1981.isEmpty() != this.f1985.isEmpty()) {
                    throw m2233("undecl.type.var", ((AbstractC16579) this.f1981.f70876).f53222.f77453);
                }
                if ((c22492.f77447 & 8192) != 0) {
                    c22492.m50001(new C16163(c22492, new C15247(this, c22492, this.f1952, this.f1979)));
                } else {
                    c22492.m50001(C16163.m38250());
                }
                if (c22492 == this.f1957.f63139) {
                    if (this.f1986.m48595() || this.f1967.m48595()) {
                        C6171.m17176(this.f1957.f77451.mo1180());
                        C19670 c19670 = this.f1957;
                        c19670.f63147 = new C20186(this, c19670, this.f1986, this.f1967);
                    } else {
                        this.f1957.f63151 = C21825.m48588();
                        this.f1957.f63140 = C21825.m48588();
                    }
                }
                this.f1986 = C21825.m48588();
                this.f1967 = C21825.m48588();
                this.f1981 = C21825.m48588();
                this.f1985 = C21825.m48588();
                this.f1984 = false;
            } catch (IOException e) {
                e = e;
                throw m2233("unable.to.access.file", e.toString());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw m2233("bad.class.file", c22492.f73414);
            } catch (ClosedFileSystemException e2) {
                e = e2;
                throw m2233("unable.to.access.file", e.toString());
            }
        } catch (Throwable th) {
            this.f1986 = C21825.m48588();
            this.f1967 = C21825.m48588();
            this.f1981 = C21825.m48588();
            this.f1985 = C21825.m48588();
            this.f1984 = false;
            throw th;
        }
    }
}
