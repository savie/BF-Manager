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

/* JADX INFO: renamed from: l.ۤ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11172 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f35172 = new C13477();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9460[] f35173;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC5865 f35174;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f35176;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7970 f35177;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f35179;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35180;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C24705 f35183;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C7312 f35184;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f35185;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[] f35186;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f35187;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35188;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17638 f35189;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35190;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public byte[] f35191;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f35194;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C7970 f35196;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14769 f35198;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35199;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C14764 f35200;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f35201;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19991 f35202;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f35203;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f35204;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22273 f35205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f35206;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f35207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15252 f35209;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f35210;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f35211;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11518 f35212;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14769 f35214;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35215;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3163 f35216;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C14769 f35208 = C14769.m35543();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14769 f35178 = C14769.m35543();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f35182 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f35192 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2920 f35175 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9002 f35195 = new C9002(65520);

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public HashSet f35193 = new HashSet();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f35181 = false;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f35213 = new byte[0];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f35197 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11172 m28112(C4747 c4747) {
        C11172 c11172 = (C11172) c4747.m14643(f35172);
        return c11172 == null ? new C11172(c4747) : c11172;
    }

    public C11172(C4747 c4747) {
        EnumC4241 enumC4241 = EnumC4241.CLASS;
        EnumSet enumSetOf = EnumSet.of(enumC4241);
        EnumC4241 enumC4242 = EnumC4241.MEMBER;
        EnumSet enumSetOf2 = EnumSet.of(enumC4242);
        EnumSet enumSetOf3 = EnumSet.of(enumC4241, enumC4242);
        this.f35206 = new HashMap();
        this.f35188 = false;
        this.f35198 = C14769.m35543();
        this.f35214 = C14769.m35543();
        this.f35201 = false;
        c4747.m14646(f35172, this);
        this.f35212 = C11518.m28979(c4747);
        C15252 c15252M36599 = C15252.m36599(c4747);
        this.f35209 = c15252M36599;
        C14764 c14764M35506 = C14764.m35506(c4747);
        this.f35200 = c14764M35506;
        this.f35183 = C24705.m55066(c4747);
        InterfaceC16722 interfaceC16722 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        this.f35203 = interfaceC16722;
        if (interfaceC16722 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f35202 = C19991.m45972(c4747);
        this.f35216 = C3163.m10345(c4747);
        this.f35184 = C7312.m20023(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        c13015M32421.m32433(EnumC7687.f25279);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f35189 = C17638.m41289(c4747);
        this.f35180 = EnumC3666.f12544.m11915(enumC20820M47625);
        this.f35210 = EnumC3666.f12546.m11915(enumC20820M47625);
        this.f35190 = EnumC3666.f12578.m11915(enumC20820M47625);
        this.f35187 = c13015M32421.m32433(EnumC7687.f25356);
        this.f35174 = EnumC5865.m17070(c4747);
        this.f35176 = AbstractC17836.m41689(c14764M35506.f48321);
        this.f35194 = C15400.m36873(c4747).m36878(EnumC19876.CLASSFILE);
        AbstractC19728 abstractC19728 = c15252M36599.f49870;
        EnumC3539 enumC3539 = EnumC3539.V45_3;
        C2004 c2004 = new C2004(this, abstractC19728, enumC3539, enumSetOf2);
        C11698 c11698 = new C11698(this, c15252M36599.f49831, enumC3539, enumSetOf2);
        C25125 c25125 = new C25125(this, c15252M36599.f49823, enumC3539, enumSetOf3);
        C16919 c16919 = new C16919(this, c15252M36599.f49846, enumC3539, enumSetOf3);
        C17665 c17665 = new C17665(this, c15252M36599.f49776, enumC3539, enumSetOf);
        C16173 c16173 = new C16173(this, c15252M36599.f49815, enumC3539, enumSetOf3);
        C23633 c23633 = new C23633(this, c15252M36599.f49828, enumC3539, enumSetOf);
        C3495 c3495 = new C3495(this, c15252M36599.f49761, enumC3539, enumSetOf3);
        AbstractC19728 abstractC19729 = c15252M36599.f49862;
        EnumC3539 enumC35310 = EnumC3539.V49;
        C14725 c14725 = new C14725(this, abstractC19729, enumC35310, enumSetOf);
        C21439 c21439 = new C21439(this, c15252M36599.f49871, enumC35310, enumSetOf3);
        C18455 c18455 = new C18455(this, c15252M36599.f49796, enumC35310, enumSetOf3);
        C0556 c0556 = new C0556(this, c15252M36599.f49859, enumC35310, enumSetOf3);
        C8014 c8014 = new C8014(this, c15252M36599.f49843, enumC35310, enumSetOf3);
        C19201 c19201 = new C19201(this, c15252M36599.f49809, enumC35310, enumSetOf3);
        C10250 c10250 = new C10250(this, c15252M36599.f49773, enumC35310, enumSetOf3);
        C1302 c1302 = new C1302(this, c15252M36599.f49854, enumC35310, enumSetOf3);
        C9504 c9504 = new C9504(this, c15252M36599.f49808, enumC35310, enumSetOf2);
        C2793 c2793 = new C2793(this, c15252M36599.f49760, enumC35310, enumSetOf3);
        C7268 c7268 = new C7268(this, c15252M36599.f49765, enumC35310, enumSetOf3);
        AbstractC19728 abstractC197210 = c15252M36599.f49754;
        EnumC3539 enumC35311 = EnumC3539.V52;
        C13979 c13979 = new C13979(this, abstractC197210, enumC35311, enumSetOf3);
        C4987 c4987 = new C4987(this, c15252M36599.f49820, enumC35311, enumSetOf3);
        C22141 c22141 = new C22141(this, c15252M36599.f49839, enumC35311, enumSetOf2);
        AbstractC19728 abstractC197211 = c15252M36599.f49793;
        EnumC3539 enumC35312 = EnumC3539.V53;
        AbstractC14681[] abstractC14681Arr = {c2004, c11698, c25125, c16919, c17665, c16173, c23633, c3495, c14725, c21439, c18455, c0556, c8014, c19201, c10250, c1302, c9504, c2793, c7268, c13979, c4987, c22141, new C22887(this, abstractC197211, enumC35312, enumSetOf), new C19903(this, c15252M36599.f49750, enumC35312, enumSetOf), new C15427(this, c15252M36599.f49797, EnumC3539.V58, enumSetOf), new C13190(this, c15252M36599.f49812, EnumC3539.V59, enumSetOf)};
        for (int i = 0; i < 26; i++) {
            AbstractC14681 abstractC14681 = abstractC14681Arr[i];
            this.f35206.put(abstractC14681.f47990, abstractC14681);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28116(C24550 c24550, AbstractC11781 abstractC11781) {
        if ((abstractC11781.f38071 & 2147487744L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || abstractC11781.f38072.m45432(this.f35209.f49749)) {
            c24550.f79576.mo7481(abstractC11781);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10620 m28121(String str, Object... objArr) {
        return new C10620(this.f35192.m29558(), this.f35182, this.f35202.m45980(str, objArr), this.f35202, this.f35216);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m28138() {
        char cM24023 = this.f35195.m24023(this.f35199);
        this.f35199 += 2;
        return cM24023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28120() {
        int i = this.f35199;
        this.f35199 = i + 1;
        return this.f35195.f29317[i] & 255;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m28131() {
        int iM24021 = this.f35195.m24021(this.f35199);
        this.f35199 += 4;
        return iM24021;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m28134() {
        AbstractC22664 abstractC22664Mo29576;
        byte[] bArr;
        int i;
        byte[] bArr2 = this.f35191;
        int i2 = this.f35207;
        byte b = bArr2[i2];
        char c = (char) b;
        C14764 c14764 = this.f35200;
        if (c == '(') {
            this.f35207 = i2 + 1;
            C14769 c14769M28122 = m28122(')');
            AbstractC22664 abstractC22664M28134 = m28134();
            C14769 c14769M35543 = C14769.m35543();
            while (true) {
                int i3 = this.f35207;
                if (i3 >= this.f35211 || this.f35191[i3] != 94) {
                    break;
                }
                this.f35207 = i3 + 1;
                c14769M35543 = c14769M35543.m35552(m28134());
            }
            for (C14769 c14769 = c14769M35543; c14769.m35550(); c14769 = c14769.f48336) {
                if (((AbstractC22664) c14769.f48335).m51067(EnumC21172.TYPEVAR)) {
                    ((AbstractC22664) c14769.f48335).f73596.f38071 |= 140737488355328L;
                }
            }
            return new C23191(c14769M28122, abstractC22664M28134, c14769M35543.m35554(), c14764.f48275);
        }
        if (c == '-') {
            this.f35207 = i2 + 1;
            return new C10729(m28134(), EnumC18670.SUPER, c14764.f48274);
        }
        if (c == '<') {
            this.f35176 = this.f35176.mo7478(this.f35192);
            C5291 c5291 = new C5291(m28134(), m28119());
            this.f35176 = this.f35176.mo7484();
            return c5291;
        }
        if (c == 'F') {
            this.f35207 = i2 + 1;
            return c14764.f48239;
        }
        C15252 c15252 = this.f35209;
        if (c != 'L') {
            if (c == 'V') {
                this.f35207 = i2 + 1;
                return c14764.f48251;
            }
            if (c == '*') {
                this.f35207 = i2 + 1;
                return new C10729(c14764.f48286, EnumC18670.UNBOUND, c14764.f48274);
            }
            if (c == '+') {
                this.f35207 = i2 + 1;
                return new C10729(m28134(), EnumC18670.EXTENDS, c14764.f48274);
            }
            if (c == 'I') {
                this.f35207 = i2 + 1;
                return c14764.f48253;
            }
            if (c == 'J') {
                this.f35207 = i2 + 1;
                return c14764.f48256;
            }
            if (c == 'S') {
                this.f35207 = i2 + 1;
                return c14764.f48316;
            }
            if (c == 'T') {
                int i4 = i2 + 1;
                this.f35207 = i4;
                while (true) {
                    bArr = this.f35191;
                    i = this.f35207;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.f35207 = i + 1;
                }
                this.f35207 = i + 1;
                return this.f35181 ? AbstractC22664.f73590 : m28124(c15252.f49864.mo2068(i4, i - i4, bArr));
            }
            if (c == 'Z') {
                this.f35207 = i2 + 1;
                return c14764.f48255;
            }
            if (c == '[') {
                this.f35207 = i2 + 1;
                return new C2832(m28134(), c14764.f48271);
            }
            switch (c) {
                case 'B':
                    this.f35207 = i2 + 1;
                    return c14764.f48293;
                case 'C':
                    this.f35207 = i2 + 1;
                    return c14764.f48296;
                case 'D':
                    this.f35207 = i2 + 1;
                    return c14764.f48249;
                default:
                    throw m28121("bad.signature", C21901.m49591(i2, 10, bArr2));
            }
        }
        if (b != 76) {
            throw m28121("bad.class.signature", C21901.m49591(i2, 10, bArr2));
        }
        this.f35207 = i2 + 1;
        AbstractC22664 c10510 = AbstractC22664.f73590;
        int i5 = this.f35197;
        while (true) {
            byte[] bArr3 = this.f35191;
            int i6 = this.f35207;
            this.f35207 = i6 + 1;
            byte b2 = bArr3[i6];
            if (b2 == 46) {
                if (c10510 != AbstractC22664.f73590) {
                    c10510 = new C10510(c14764.m35517(this.f35175, c15252.f49864.mo2068(i5, this.f35197 - i5, this.f35213)), c10510, C14769.m35543());
                }
                byte[] bArr4 = this.f35213;
                int i7 = this.f35197;
                this.f35197 = i7 + 1;
                bArr4[i7] = 36;
            } else if (b2 == 47) {
                byte[] bArr5 = this.f35213;
                int i8 = this.f35197;
                this.f35197 = i8 + 1;
                bArr5[i8] = 46;
            } else {
                if (b2 == 59) {
                    C24550 c24550M35517 = c14764.m35517(this.f35175, c15252.f49864.mo2068(i5, this.f35197 - i5, this.f35213));
                    try {
                        abstractC22664Mo29576 = c10510 == AbstractC22664.f73590 ? c24550M35517.mo29576(this.f35183) : new C10510(c24550M35517, c10510, C14769.m35543());
                        this.f35197 = i5;
                        break;
                    } catch (Throwable th) {
                        this.f35197 = i5;
                        throw th;
                    }
                }
                if (b2 != 60) {
                    byte[] bArr6 = this.f35213;
                    int i9 = this.f35197;
                    this.f35197 = i9 + 1;
                    bArr6[i9] = b2;
                } else {
                    abstractC22664Mo29576 = new C8759(this, c10510, m28122('>'), c14764.m35517(this.f35175, c15252.f49864.mo2068(i5, this.f35197 - i5, this.f35213)));
                    byte[] bArr7 = this.f35191;
                    int i10 = this.f35207;
                    int i11 = i10 + 1;
                    this.f35207 = i11;
                    byte b3 = bArr7[i10];
                    if (b3 == 46) {
                        byte[] bArr8 = this.f35213;
                        int i12 = this.f35197;
                        this.f35197 = i12 + 1;
                        bArr8[i12] = 36;
                    } else {
                        if (b3 != 59) {
                            throw new AssertionError((int) this.f35191[this.f35207 - 1]);
                        }
                        if (i11 >= this.f35211 || bArr7[i11] != 46) {
                            this.f35197 = i5;
                            break;
                        }
                        int i13 = this.f35197;
                        this.f35207 = (i13 - i5) + 3 + i11;
                        byte[] bArr9 = this.f35213;
                        this.f35197 = i13 + 1;
                        bArr9[i13] = 36;
                    }
                    c10510 = abstractC22664Mo29576;
                }
            }
        }
        int i14 = this.f35207;
        if (i14 >= this.f35211 || this.f35191[i14] != 46) {
            return abstractC22664Mo29576;
        }
        throw m28121("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m28122(char c) {
        C14769 c14769Of = C14769.of((Object) null);
        C14769 c14769Mo18485 = c14769Of;
        while (true) {
            byte[] bArr = this.f35191;
            int i = this.f35207;
            if (bArr[i] != c) {
                c14769Mo18485 = c14769Mo18485.mo18485(C14769.of((Object) m28134()));
            } else {
                this.f35207 = i + 1;
                return c14769Of.f48336;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14769 m28119() {
        int i;
        C14769 c14769M35543 = C14769.m35543();
        byte[] bArr = this.f35191;
        int i2 = this.f35207;
        if (bArr[i2] == 60) {
            int i3 = i2 + 1;
            this.f35207 = i3;
            this.f35181 = true;
            while (this.f35191[this.f35207] != 62) {
                c14769M35543 = c14769M35543.m35552(m28130());
            }
            this.f35181 = false;
            this.f35207 = i3;
            while (true) {
                byte[] bArr2 = this.f35191;
                i = this.f35207;
                if (bArr2[i] == 62) {
                    break;
                }
                m28130();
            }
            this.f35207 = i + 1;
        }
        return c14769M35543.m35554();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17969 m28130() {
        byte[] bArr;
        int i;
        C17969 c17969;
        boolean z;
        int i2 = this.f35207;
        while (true) {
            bArr = this.f35191;
            i = this.f35207;
            if (bArr[i] == 58) {
                break;
            }
            this.f35207 = i + 1;
        }
        AbstractC19728 abstractC19728Mo2068 = this.f35209.f49864.mo2068(i2, i - i2, bArr);
        if (this.f35181) {
            c17969 = new C17969(this.f35192, this.f35200.f48241, abstractC19728Mo2068);
            this.f35176.mo7481(c17969.f73596);
        } else {
            c17969 = (C17969) m28124(abstractC19728Mo2068);
        }
        C14769 c14769M35543 = C14769.m35543();
        byte[] bArr2 = this.f35191;
        int i3 = this.f35207;
        if (bArr2[i3] == 58) {
            z = true;
            int i4 = i3 + 1;
            if (bArr2[i4] == 58) {
                this.f35207 = i4;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        while (true) {
            byte[] bArr3 = this.f35191;
            int i5 = this.f35207;
            if (bArr3[i5] != 58) {
                break;
            }
            this.f35207 = i5 + 1;
            c14769M35543 = c14769M35543.m35552(m28134());
        }
        if (!this.f35181) {
            this.f35183.m55110(c17969, c14769M35543.m35554(), z);
        }
        return c17969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m28124(AbstractC19728 abstractC19728) {
        AbstractC11781 abstractC11781Mo7474 = this.f35176.mo7474(abstractC19728, (Predicate) null);
        if (abstractC11781Mo7474 != null) {
            return abstractC11781Mo7474.f38067;
        }
        if (this.f35188) {
            C17969 c17969 = new C17969(this.f35192, this.f35200.f48241, abstractC19728);
            this.f35198 = this.f35198.m35552(c17969);
            return c17969;
        }
        throw m28121("undecl.type.var", abstractC19728);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28142(AbstractC11781 abstractC11781) {
        char cCharAt;
        abstractC11781.f38069.mo29571().mo7479(abstractC11781);
        C24550 c24550 = (C24550) abstractC11781;
        C24550 c24550M50337 = this.f35205.m50337(m28138());
        char cM28138 = m28138();
        final C22273 c22273 = this.f35205;
        C17359.requireNonNull(c22273);
        C6853 c6853 = (C6853) m28110(cM28138, new IntFunction() { // from class: l.ۘܽۘ
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return c22273.m50342(i);
            }
        }, (Object) null);
        AbstractC16344 abstractC16344 = c24550M50337.f79576;
        int i = 1;
        if (abstractC16344 == null || c24550M50337.f38066 != EnumC13603.f43213) {
            throw m28121("bad.enclosing.class", c24550, c24550M50337);
        }
        c24550.mo29590();
        C10377 c10377M28111 = m28111(c6853, abstractC16344, c24550.f38071);
        if (c6853 != null && c10377M28111 == null) {
            C24550 c24550M29558 = this.f35192.m29558();
            InterfaceC15976 interfaceC15976 = this.f35182;
            C15515 c15515 = C19859.f63823;
            throw new C22555(c24550M29558, interfaceC15976, this.f35202.m45975(new C15515("compiler", "bad.enclosing.method", c24550)), this.f35202, this.f35216);
        }
        AbstractC19728 abstractC19728 = c24550.f79578;
        AbstractC19728 abstractC19729 = c24550M50337.f79578;
        if (!abstractC19728.m45432(abstractC19729)) {
            throw m28121("bad.enclosing.method", abstractC19728);
        }
        String strSubstring = abstractC19728.toString().substring(abstractC19729.toString().length());
        if (strSubstring.length() < 1 || strSubstring.charAt(0) != '$') {
            throw m28121("bad.enclosing.method", abstractC19728);
        }
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        String strSubstring2 = strSubstring.substring(i);
        C15252 c15252 = this.f35209;
        AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194(strSubstring2);
        c24550.f38072 = abstractC19728M51194;
        c24550.f38069 = c10377M28111 != null ? c10377M28111 : c24550M50337;
        if (abstractC19728M51194.isEmpty()) {
            c24550.f79577 = c15252.f49799;
        } else {
            c24550.f79577 = AbstractC22970.m51843(c24550.f38072, c24550.f38069);
        }
        if (c10377M28111 != null) {
            ((C10510) abstractC11781.f38067).mo23450(c10377M28111.f38067);
        } else if ((c24550.f38071 & 8) == 0) {
            ((C10510) abstractC11781.f38067).mo23450(c24550M50337.f38067);
        } else {
            ((C10510) abstractC11781.f38067).mo23450(AbstractC22664.f73590);
        }
        m28127(c24550, c24550.f38067);
        if (!this.f35198.isEmpty()) {
            C18499 c18499 = new C18499();
            Iterator it = this.f35198.iterator();
            while (it.hasNext()) {
                c18499.m43089(m28124(((AbstractC22664) it.next()).f73596.f38072));
            }
            this.f35214 = c18499.m43093();
            return;
        }
        this.f35214 = C14769.m35543();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10377 m28111(C6853 c6853, AbstractC16344 abstractC16344, long j) {
        if (c6853 == null) {
            return null;
        }
        AbstractC19728 abstractC19728 = c6853.f22764;
        AbstractC22664 abstractC22664 = c6853.f22765;
        C23191 c23191Mo15883 = abstractC22664.mo15883();
        for (AbstractC11781 abstractC11781 : abstractC16344.m38842(abstractC19728)) {
            if (abstractC11781.f38066 == EnumC13603.f43218) {
                C23191 c23191Mo15884 = abstractC11781.f38067.mo15883();
                C14769 c14769 = c23191Mo15884.f75155;
                C24705 c24705 = this.f35183;
                C14769 c14769M35552 = c24705.m55154(c14769).m35552(c24705.m55132(c23191Mo15884.f75156));
                C14769 c14769M35553 = c23191Mo15883.f75155.m35552(c23191Mo15883.f75156);
                while (true) {
                    if (!c14769M35552.isEmpty() && !c14769M35553.isEmpty()) {
                        if (((AbstractC22664) c14769M35552.f48335).f73596 != ((AbstractC22664) c14769M35553.f48335).f73596) {
                            break;
                        }
                        c14769M35552 = c14769M35552.f48336;
                        c14769M35553 = c14769M35553.f48336;
                    } else {
                        if (!c14769M35552.isEmpty() || !c14769M35553.isEmpty()) {
                            break;
                        }
                        return (C10377) abstractC11781;
                    }
                }
            }
        }
        if (abstractC19728 == this.f35209.f49865 && (512 & j) == 0 && !abstractC22664.mo50621().isEmpty()) {
            return m28111(new C6853(abstractC19728, new C23191(abstractC22664.mo50621().f48336, abstractC22664.mo31585(), abstractC22664.mo50622(), this.f35200.f48275)), abstractC16344, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28126(AbstractC11781 abstractC11781, EnumC4241 enumC4241) {
        char cM28138 = m28138();
        for (int i = 0; i < cM28138; i++) {
            AbstractC19728 abstractC19728M50345 = this.f35205.m50345(m28138());
            int iM28131 = m28131();
            AbstractC14681 abstractC14681 = (AbstractC14681) this.f35206.get(abstractC19728M50345);
            if (abstractC14681 != null && abstractC14681.mo32705(enumC4241)) {
                abstractC14681.mo2564(iM28131, abstractC11781);
            } else {
                this.f35199 += iM28131;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28139(AbstractC11781 abstractC11781) {
        char cM28138 = m28138();
        C18499 c18499 = new C18499();
        for (int i = 0; i < cM28138; i++) {
            c18499.m43089(m28136());
        }
        C14769<C7970> c14769M43093 = c18499.m43093();
        if (c14769M43093.isEmpty()) {
            return;
        }
        C18499 c184910 = new C18499();
        for (C7970 c7970 : c14769M43093) {
            AbstractC22664 abstractC22664 = c7970.f69124;
            AbstractC19728 abstractC19728Mo29575 = abstractC22664.f73596.mo29575();
            C14764 c14764 = this.f35200;
            if (abstractC19728Mo29575 == c14764.f48268.f73596.mo29575()) {
                abstractC11781.f38071 |= 274877906944L;
            } else {
                AbstractC19728 abstractC19728Mo29576 = abstractC22664.f73596.mo29575();
                AbstractC19728 abstractC19728Mo29577 = c14764.f48240.f73596.mo29575();
                C15252 c15252 = this.f35209;
                if (abstractC19728Mo29576 == abstractC19728Mo29577) {
                    EnumC5865 enumC5865 = EnumC5865.f20115;
                    EnumC5865 enumC5866 = this.f35174;
                    if (enumC5866 != enumC5865) {
                        for (C5558 c5558 : c7970.f26500) {
                            if (c5558.f19300 == c15252.f49766) {
                                Object obj = c5558.f19301;
                                if (obj instanceof C3754) {
                                    C3754 c3754 = (C3754) obj;
                                    if (c3754.f69124 == c14764.f48253 && ((Integer) c3754.f12872).intValue() > enumC5866.f20121) {
                                        abstractC11781.f38071 |= 35184372088832L;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC22664.f73596.mo29575() == c14764.f48302.f73596.mo29575()) {
                    abstractC11781.f38071 |= 72057594037927936L;
                    m28113(c7970, abstractC11781, c15252.f49755, 288230376151711744L);
                } else if (abstractC22664.f73596.mo29575() == c14764.f48279.f73596.mo29575()) {
                    C11972.m30026(abstractC11781.f38066 == EnumC13603.f43213);
                    abstractC11781.f38071 |= 9007199254740992L;
                } else {
                    AbstractC22970 abstractC22970 = abstractC22664.f73596;
                    if (abstractC22970 == c14764.f48252.f73596) {
                        this.f35196 = c7970;
                    } else if (abstractC22970 == c14764.f48266.f73596) {
                        this.f35177 = c7970;
                    } else if (abstractC22970 == c14764.f48258.f73596) {
                        abstractC11781.f38071 |= 18014398509613056L;
                        m28113(c7970, abstractC11781, c15252.f49803, 36028797018963968L);
                    } else if (abstractC22970 == c14764.f48270.f73596) {
                        abstractC11781.f38071 |= 72057594037927936L;
                        m28113(c7970, abstractC11781, c15252.f49755, 288230376151711744L);
                    } else if (abstractC22970 == c14764.f48260.f73596 && abstractC11781.f38066 == EnumC13603.f43213) {
                        abstractC11781.f38071 |= 9007199254740992L;
                    }
                    c184910.m43089(c7970);
                }
            }
        }
        this.f35212.m28995(new RunnableC20649(this, abstractC11781, c184910.m43093()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28113(C7970 c7970, AbstractC11781 abstractC11781, AbstractC19728 abstractC19728, long j) {
        for (C5558 c5558 : c7970.f26500) {
            if (c5558.f19300 == abstractC19728) {
                Object obj = c5558.f19301;
                if (obj instanceof C3754) {
                    C3754 c3754 = (C3754) obj;
                    if (c3754.f69124 == this.f35200.f48255 && ((Integer) c3754.f12872).intValue() != 0) {
                        abstractC11781.f38071 |= j;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28137(AbstractC11781 abstractC11781) {
        int i = this.f35199;
        this.f35199 = i + 1;
        int i2 = this.f35195.f29317[i] & 255;
        C9460[] c9460Arr = this.f35173;
        if (c9460Arr == null) {
            this.f35173 = new C9460[i2];
        } else if (c9460Arr.length != i2) {
            throw m28121("bad.runtime.invisible.param.annotations", abstractC11781);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C9460[] c9460Arr2 = this.f35173;
            if (c9460Arr2[i3] == null) {
                c9460Arr2[i3] = new C9460();
            }
            C9460 c9460 = c9460Arr2[i3];
            char cM28138 = m28138();
            C18499 c18499 = new C18499();
            for (int i4 = 0; i4 < cM28138; i4++) {
                c18499.m43089(m28136());
            }
            C14769 c14769M43093 = c18499.m43093();
            C14769 c14769 = c9460.f30673;
            if (c14769 == null) {
                c9460.f30673 = c14769M43093;
            } else {
                c9460.f30673 = c14769.m35549(c14769M43093);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28132(AbstractC11781 abstractC11781) {
        C5510 c5510M16404;
        C5510 c5510M16399;
        char cM28138 = m28138();
        if (cM28138 != 0) {
            C18499 c18499 = new C18499();
            for (int i = 0; i < cM28138; i++) {
                int iM28120 = m28120();
                if (!EnumC21478.m48862(iM28120)) {
                    throw m28121("bad.type.annotation.value", String.format("0x%02X", Integer.valueOf(iM28120)));
                }
                EnumC21478 enumC21478M48860 = EnumC21478.m48860(iM28120);
                switch (C5733.f19741[enumC21478M48860.ordinal()]) {
                    case 1:
                        char cM28139 = m28138();
                        c5510M16404 = C5510.m16404(m28135(), null, -1);
                        c5510M16404.f19174 = cM28139;
                        break;
                    case 2:
                        char cM281310 = m28138();
                        c5510M16404 = C5510.m16384(m28135(), null, -1);
                        c5510M16404.f19174 = cM281310;
                        break;
                    case 3:
                        char cM281311 = m28138();
                        c5510M16404 = C5510.m16386(m28135(), null, -1);
                        c5510M16404.f19174 = cM281311;
                        break;
                    case 4:
                        char cM281312 = m28138();
                        c5510M16404 = C5510.m16395(m28135(), null, -1);
                        c5510M16404.f19174 = cM281312;
                        break;
                    case 5:
                        int iM28138 = m28138();
                        int[] iArr = new int[iM28138];
                        int[] iArr2 = new int[iM28138];
                        int[] iArr3 = new int[iM28138];
                        for (int i2 = 0; i2 < iM28138; i2++) {
                            iArr[i2] = m28138();
                            iArr2[i2] = m28138();
                            iArr3[i2] = m28138();
                        }
                        c5510M16399 = C5510.m16399(m28135(), null, -1);
                        c5510M16399.f19176 = iArr;
                        c5510M16399.f19179 = iArr2;
                        c5510M16399.f19180 = iArr3;
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 6:
                        int iM28139 = m28138();
                        int[] iArr4 = new int[iM28139];
                        int[] iArr5 = new int[iM28139];
                        int[] iArr6 = new int[iM28139];
                        for (int i3 = 0; i3 < iM28139; i3++) {
                            iArr4[i3] = m28138();
                            iArr5[i3] = m28138();
                            iArr6[i3] = m28138();
                        }
                        c5510M16399 = C5510.m16393(m28135(), null, -1);
                        c5510M16399.f19176 = iArr4;
                        c5510M16399.f19179 = iArr5;
                        c5510M16399.f19180 = iArr6;
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 7:
                        char cM281313 = m28138();
                        c5510M16404 = C5510.m16401(m28135(), null, -1);
                        c5510M16404.m16407(cM281313);
                        break;
                    case 8:
                        c5510M16399 = C5510.m16397(m28135(), null, -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 9:
                        c5510M16399 = C5510.m16394(m28135(), null, m28120(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 10:
                        c5510M16399 = C5510.m16390(m28135(), null, m28120(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 11:
                        c5510M16399 = C5510.m16403(m28135(), null, m28120(), m28120(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 12:
                        c5510M16399 = C5510.m16388(m28135(), null, m28120(), m28120(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 13:
                        c5510M16399 = C5510.m16387(m28135(), null, m28138(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 14:
                        c5510M16399 = C5510.m16396(m28135(), null, m28138(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 15:
                        c5510M16399 = C5510.m16400(m28135(), null, m28120(), -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 16:
                        char cM281314 = m28138();
                        c5510M16404 = C5510.m16385(m28135(), null, m28120(), -1);
                        c5510M16404.f19174 = cM281314;
                        break;
                    case 17:
                        char cM281315 = m28138();
                        c5510M16404 = C5510.m16402(m28135(), null, m28120(), -1);
                        c5510M16404.f19174 = cM281315;
                        break;
                    case 18:
                        char cM281316 = m28138();
                        c5510M16404 = C5510.m16405(m28135(), null, m28120(), -1);
                        c5510M16404.f19174 = cM281316;
                        break;
                    case 19:
                        char cM281317 = m28138();
                        c5510M16404 = C5510.m16392(m28135(), null, m28120(), -1);
                        c5510M16404.f19174 = cM281317;
                        break;
                    case 20:
                        char cM281318 = m28138();
                        c5510M16404 = C5510.m16398(m28135(), null, m28120(), -1);
                        c5510M16404.f19174 = cM281318;
                        break;
                    case 21:
                        c5510M16399 = C5510.m16389(m28135(), null, -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 22:
                        c5510M16399 = C5510.m16391(m28135(), null, -1);
                        continue;
                        c18499.m43089(new C5207(m28136(), c5510M16399));
                        break;
                    case 23:
                        throw new AssertionError("jvm.ClassReader: UNKNOWN target type should never occur!");
                    default:
                        throw new AssertionError("jvm.ClassReader: Unknown target type for position: " + enumC21478M48860);
                }
                c5510M16399 = c5510M16404;
                c18499.m43089(new C5207(m28136(), c5510M16399));
            }
            this.f35212.m28995(new C13935(this, abstractC11781, c18499.m43093()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28125(AbstractC11781 abstractC11781) {
        C10377 c10377 = (C10377) abstractC11781;
        AbstractC21654 abstractC21654M28141 = m28141();
        c10377.f33011 = abstractC21654M28141;
        this.f35212.m28995(new RunnableC12444(this, c10377, abstractC21654M28141));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m28123(int i) {
        if (this.f35175.f9544 == this.f35192) {
            return new C2749(this, i);
        }
        return this.f35205.m50340(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7970 m28136() {
        AbstractC22664 abstractC22664M28123;
        if (this.f35175.f9544 != this.f35192) {
            abstractC22664M28123 = m28123((int) m28138());
        } else {
            abstractC22664M28123 = new C2749(this, m28138());
        }
        char cM28138 = m28138();
        C18499 c18499 = new C18499();
        for (int i = 0; i < cM28138; i++) {
            c18499.m43089(new C5558(this.f35205.m50345(m28138()), m28141()));
        }
        return new C7970(abstractC22664M28123, c18499.m43093());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14769 m28135() {
        C15204 c15204;
        int iM28120 = m28120();
        C18499 c18499 = new C18499();
        for (int i = 0; i < iM28120 * 2; i++) {
            c18499.m43089(Integer.valueOf(m28120()));
        }
        C14769 c14769M43093 = c18499.m43093();
        C14769 c14769 = C5510.f19173;
        C18499 c184910 = new C18499();
        Iterator it = c14769M43093.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C11972.m30026(it.hasNext());
            Integer num2 = (Integer) it.next();
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C15204 c15205 = C15204.f49630;
            C11972.m30026(iIntValue2 == 0 || iIntValue == EnumC12967.TYPE_ARGUMENT.f41578);
            if (iIntValue == 0) {
                c15204 = C15204.f49630;
            } else if (iIntValue == 1) {
                c15204 = C15204.f49632;
            } else if (iIntValue == 2) {
                c15204 = C15204.f49631;
            } else {
                if (iIntValue != 3) {
                    C11972.m30024("Invalid TypePathEntryKind tag: " + iIntValue);
                    throw null;
                }
                c15204 = new C15204(EnumC12967.TYPE_ARGUMENT, iIntValue2);
            }
            c184910.m43089(c15204);
        }
        return c184910.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m28110(int i, IntFunction intFunction, Object obj) {
        return i == 0 ? obj : intFunction.apply(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC21654 m28141() {
        int i = this.f35199;
        this.f35199 = i + 1;
        char c = (char) this.f35195.f29317[i];
        if (c != '@') {
            C14764 c14764 = this.f35200;
            if (c == 'F') {
                return new C3754(this.f35205.m50343(m28138()), c14764.f48239);
            }
            if (c == 'S') {
                return new C3754(this.f35205.m50343(m28138()), c14764.f48316);
            }
            if (c == 'c') {
                AbstractC22664 abstractC22664M28123 = m28123((int) m28138());
                C21395 c21395 = new C21395(null);
                c21395.f68156 = abstractC22664M28123;
                return c21395;
            }
            if (c == 'e') {
                AbstractC22664 abstractC22664M28124 = m28123((int) m28138());
                AbstractC19728 abstractC19728M50345 = this.f35205.m50345(m28138());
                C19157 c19157 = new C19157(null);
                c19157.f61985 = abstractC22664M28124;
                c19157.f61984 = abstractC19728M50345;
                return c19157;
            }
            if (c == 's') {
                return new C3754(this.f35205.m50345(m28138()).toString(), c14764.f48282);
            }
            if (c == 'I') {
                return new C3754(this.f35205.m50343(m28138()), c14764.f48253);
            }
            if (c == 'J') {
                return new C3754(this.f35205.m50343(m28138()), c14764.f48256);
            }
            if (c == 'Z') {
                return new C3754(this.f35205.m50343(m28138()), c14764.f48255);
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return new C3754(this.f35205.m50343(m28138()), c14764.f48293);
                    case 'C':
                        return new C3754(this.f35205.m50343(m28138()), c14764.f48296);
                    case 'D':
                        return new C3754(this.f35205.m50343(m28138()), c14764.f48249);
                    default:
                        throw new AssertionError("unknown annotation tag '" + c + "'");
                }
            }
            char cM28138 = m28138();
            C18499 c18499 = new C18499();
            for (int i2 = 0; i2 < cM28138; i2++) {
                c18499.m43089(m28141());
            }
            C14769 c14769M43093 = c18499.m43093();
            C24379 c24379 = new C24379(null);
            c24379.f79094 = c14769M43093;
            return c24379;
        }
        return m28136();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28128(AbstractC19728 abstractC19728, AbstractC22664 abstractC22664) {
        if ((!abstractC22664.m51067(EnumC21172.METHOD) && !abstractC22664.m51067(EnumC21172.FORALL)) || (abstractC19728 == this.f35209.f49865 && !abstractC22664.mo31585().m51067(EnumC21172.VOID))) {
            throw m28121("method.descriptor.invalid", abstractC19728);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28133() {
        this.f35199 += 6;
        char cM28138 = m28138();
        for (int i = 0; i < cM28138; i++) {
            this.f35199 += 2;
            this.f35199 += m28131();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28127(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664) {
        if (abstractC22664.mo23449() != null) {
            if (!abstractC22664.mo23449().m51067(EnumC21172.NONE)) {
                m28127(abstractC11781.f38069, abstractC22664.mo23449());
            }
        } else if (abstractC11781.f38066 == EnumC13603.f43218 && !abstractC11781.mo7874()) {
            AbstractC11781 abstractC11782 = abstractC11781.f38069;
            m28127(abstractC11782, abstractC11782.f38067);
        }
        for (C14769 c14769Mo15882 = abstractC22664.mo15882(); c14769Mo15882.m35550(); c14769Mo15882 = c14769Mo15882.f48336) {
            this.f35176.mo7481(((AbstractC22664) c14769Mo15882.f48335).f73596);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28140(C24550 c24550) {
        char cM28138 = m28138();
        for (int i = 0; i < cM28138; i++) {
            m28138();
            char cM28139 = m28138();
            char cM281310 = m28138();
            final C22273 c22273 = this.f35205;
            C17359.requireNonNull(c22273);
            C24550 c24551 = (C24550) m28110(cM28139, new IntFunction() { // from class: l.᩺ܽۘ
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return c22273.m50337(i2);
                }
            }, (Object) null);
            C22273 c22274 = this.f35205;
            C17359.requireNonNull(c22274);
            C6523 c6523 = new C6523(c22274);
            C15252 c15252 = this.f35209;
            AbstractC19728 abstractC19728 = c15252.f49799;
            AbstractC19728 abstractC19729 = c15252.f49799;
            AbstractC19728 abstractC197210 = (AbstractC19728) m28110(cM281310, c6523, abstractC19728);
            if (abstractC197210 == null) {
                abstractC197210 = abstractC19729;
            }
            long jM28138 = m28138();
            if ((X931RNG.BLOCK64_RESEED_MAX & jM28138) != 0) {
                jM28138 = (jM28138 & (-32769)) | 2251799813685248L;
            }
            long j = (-33) & jM28138;
            if (c24551 != null) {
                if (abstractC197210 == abstractC19729) {
                    abstractC197210 = c15252.f49814;
                }
                C24550 c24550M35518 = this.f35200.m35518(this.f35175, abstractC197210, c24551);
                if ((jM28138 & 8) == 0) {
                    ((C10510) c24550M35518.f38067).mo23450(c24551.f38067);
                    AbstractC22664 abstractC22664 = c24550M35518.f38073;
                    if (abstractC22664 != null) {
                        ((C10510) abstractC22664).mo23450(this.f35183.m55132(c24551.f38067));
                    }
                }
                if (c24550 == c24551) {
                    c24550M35518.f38071 = j;
                    m28116(c24550, c24550M35518);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28117(C24550 c24550) {
        C24705 c24705;
        C24705 c24706;
        C10377 c10377;
        char c;
        int iM23856;
        AbstractC22664 abstractC22664;
        Iterator it;
        AbstractC19728 abstractC19728M51194;
        AbstractC19728 abstractC19728;
        long j;
        C9460 c9460;
        C14769 c14769;
        int i;
        int i2;
        boolean z;
        char c2 = 0;
        if (m28131() != -889275714) {
            throw m28121("illegal.start.of.class.file", new Object[0]);
        }
        this.f35179 = m28138();
        this.f35215 = m28138();
        int i3 = EnumC3539.m11565().f12156;
        int i4 = EnumC3539.m11565().f12157;
        int i5 = this.f35179;
        boolean z2 = i5 == 65535;
        int i6 = this.f35215;
        int i7 = 2;
        C7312 c7312 = this.f35184;
        if (i6 > i3 || (i6 * 1000) + i5 < (EnumC3539.m11564().f12156 * 1000) + EnumC3539.m11564().f12157) {
            int i8 = this.f35215;
            if (i8 != i3 + 1 || z2) {
                throw m28121("wrong.version", Integer.toString(i8), Integer.toString(this.f35179), Integer.toString(i3), Integer.toString(i4));
            }
            InterfaceC15976 interfaceC15976 = this.f35182;
            C25213 c25213 = C13146.f42046;
            c7312.m34529(new C25213("compiler", "big.major.version", interfaceC15976, Integer.valueOf(i8), Integer.valueOf(i3)));
        }
        if (z2) {
            C17638 c17638 = this.f35189;
            if (c17638.m41295()) {
                c17638.m41299(c24550.f79575, this.f35215);
            } else {
                c7312.m34525(c17638.m41291(this.f35182, this.f35215));
            }
        }
        C9002 c9002 = this.f35195;
        C15252 c15252 = this.f35209;
        C14764 c14764 = this.f35200;
        C22273 c22273 = new C22273(this, c9002, c15252, c14764);
        this.f35205 = c22273;
        int iM50335 = c22273.m50335(c9002, this.f35199);
        this.f35199 = iM50335;
        if (this.f35213.length < iM50335) {
            this.f35213 = new byte[Integer.highestOneBit(iM50335) << 1];
        }
        C10510 c10510 = (C10510) c24550.f38067;
        c24550.f79576 = AbstractC17836.m41689(c24550);
        this.f35176 = this.f35176.mo7478(this.f35192);
        if (c10510.mo23449().m51067(EnumC21172.CLASS)) {
            m28127(c24550.f38069, c10510.mo23449());
        }
        long jM28138 = m28138();
        if ((X931RNG.BLOCK64_RESEED_MAX & jM28138) != 0) {
            jM28138 = (jM28138 & (-32769)) | 2251799813685248L;
        }
        long j2 = (-33) & jM28138;
        long j3 = jM28138 & 2251799813685248L;
        if (j3 == 0) {
            EnumC13603 enumC13603 = c24550.f38069.f38066;
            if (enumC13603 == EnumC13603.f43219 || enumC13603 == EnumC13603.f43208) {
                c24550.f38071 = j2;
            }
            this.f35175 = c24550.m29564().f44618;
            C24550 c24550M50337 = this.f35205.m50337(m28138());
            if (c24550 != c24550M50337) {
                throw m28121("class.file.wrong.class", c24550M50337.f79578);
            }
        } else {
            int i9 = this.f35215;
            if (i9 < EnumC3539.V53.f12156) {
                throw m28121("anachronistic.module.info", Integer.toString(i9), Integer.toString(this.f35179));
            }
            c24550.f38071 = j2;
            AbstractC11781 abstractC11781 = c24550.f38069;
            if (abstractC11781.f38066 != EnumC13603.f43214) {
                throw m28121("module.info.definition.expected", new Object[0]);
            }
            this.f35175 = (C2920) abstractC11781;
            m28138();
        }
        int i10 = this.f35199;
        m28138();
        this.f35199 = (m28138() * 2) + this.f35199;
        char cM28138 = m28138();
        for (int i11 = 0; i11 < cM28138; i11++) {
            m28133();
        }
        char cM28139 = m28138();
        for (int i12 = 0; i12 < cM28139; i12++) {
            m28133();
        }
        m28126(c24550, EnumC4241.CLASS);
        C14769 c147610 = c24550.f79583;
        if (c147610 != null && !c147610.isEmpty()) {
            c24550.f38071 |= SkeinEngine.UbiTweak.T1_FIRST;
        }
        this.f35199 = i10;
        char cM281310 = m28138();
        if (j3 != 0 && cM281310 > 0) {
            throw m28121("module.info.invalid.super.class", new Object[0]);
        }
        if (c10510.f33442 == null) {
            c10510.f33442 = (AbstractC22664) m28110(cM281310, new IntFunction() { // from class: l.ۨܽۘ
                @Override // java.util.function.IntFunction
                public final Object apply(int i13) {
                    C11172 c11172 = this.f40096;
                    return c11172.f35205.m50337(i13).mo29576(c11172.f35183);
                }
            }, AbstractC22664.f73590);
        }
        char cM281311 = m28138();
        C14769 c14769M35543 = C14769.m35543();
        int i13 = 0;
        while (true) {
            c24705 = this.f35183;
            if (i13 >= cM281311) {
                break;
            }
            c14769M35543 = c14769M35543.m35552(this.f35205.m50337(m28138()).mo29576(c24705));
            i13++;
        }
        if (c10510.f33437 == null) {
            c10510.f33437 = c14769M35543.m35554();
        }
        C11972.m30026(cM28138 == m28138());
        for (int i14 = 0; i14 < cM28138; i14++) {
            AbstractC11781 c5816 = new C5816(m28138(), this.f35205.m50345(m28138()), this.f35205.m50340(m28138()), this.f35192);
            m28126(c5816, EnumC4241.MEMBER);
            m28116(c24550, c5816);
        }
        C11972.m30026(cM28139 == m28138());
        int i15 = 0;
        while (i15 < cM28139) {
            long jM28139 = m28138();
            if ((64 & jM28139) != 0) {
                jM28139 = (jM28139 & (-65)) | 2147483648L;
            }
            if ((128 & jM28139) != 0) {
                jM28139 = (jM28139 & (-129)) | 17179869184L;
            }
            AbstractC19728 abstractC19728M50345 = this.f35205.m50345(m28138());
            AbstractC22664 abstractC22664M50340 = this.f35205.m50340(m28138());
            if (this.f35192.m29587() && (jM28139 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && !abstractC19728M50345.equals(c15252.f49758)) {
                int i16 = this.f35215;
                EnumC3539 enumC3539 = EnumC3539.V52;
                int i17 = enumC3539.f12156;
                if (i16 <= i17 && (i16 != i17 || this.f35179 < enumC3539.f12157)) {
                    String str = (8 & jM28139) == 0 ? "invalid.default.interface" : "invalid.static.interface";
                    Object string = Integer.toString(i16);
                    Object string2 = Integer.toString(this.f35179);
                    Object[] objArr = new Object[i7];
                    objArr[c2] = string;
                    objArr[1] = string2;
                    throw m28121(str, objArr);
                }
                if ((10 & jM28139) == 0) {
                    this.f35192.f38071 |= 8796093022208L;
                    jM28139 |= 8796093023232L;
                }
            }
            m28128(abstractC19728M50345, abstractC22664M50340);
            if (abstractC19728M50345 == c15252.f49865 && this.f35192.m29586()) {
                AbstractC17836 abstractC17836Mo29571 = this.f35192.f38069.mo29571();
                AbstractC11781 abstractC11782 = this.f35192;
                EnumC13908 enumC13908 = EnumC13908.NON_RECURSIVE;
                abstractC17836Mo29571.getClass();
                c = cM28139;
                boolean zHasNext = abstractC17836Mo29571.mo7473(abstractC11782.f38072, new C23606(0, abstractC11782), enumC13908).iterator().hasNext();
                if (!this.f35192.f38072.isEmpty() && zHasNext) {
                    C14769<AbstractC22664> c14769Mo50621 = abstractC22664M50340.mo50621();
                    if (!c14769Mo50621.isEmpty()) {
                        if ((jM28139 & 17179869184L) != 0) {
                            AbstractC22664 abstractC22665 = (AbstractC22664) c14769Mo50621.last();
                            C18499 c18499 = new C18499();
                            for (AbstractC22664 abstractC22664M9327 : c14769Mo50621) {
                                if (abstractC22664M9327 == abstractC22665) {
                                    abstractC22664M9327 = ((C2832) abstractC22664M9327).m9327();
                                }
                                c18499.m43089(abstractC22664M9327);
                            }
                            c14769Mo50621 = c18499.m43093();
                        }
                        c14769Mo50621 = c14769Mo50621.f48336;
                    }
                    abstractC22664M50340 = new C23191(c14769Mo50621, abstractC22664M50340.mo31585(), abstractC22664M50340.mo50622(), c14764.f48275);
                }
            } else {
                c = cM28139;
            }
            C10377 c10378 = new C10377(jM28139, abstractC19728M50345, abstractC22664M50340, this.f35192);
            if (c24705.m55113(c10378)) {
                c10378.f38071 |= 70368744177664L;
            }
            if (this.f35187) {
                int iM23846 = C8935.m23846(c10378.f38067.mo50621()) + 4;
                int[] iArr = this.f35186;
                if (iArr == null || iArr.length < iM23846) {
                    this.f35186 = new int[iM23846];
                    z = false;
                } else {
                    z = false;
                    Arrays.fill(iArr, 0);
                }
                this.f35185 = z;
            }
            AbstractC11781 abstractC11783 = this.f35192;
            this.f35192 = c10378;
            try {
                m28126(c10378, EnumC4241.MEMBER);
                this.f35192 = abstractC11783;
                m28128(abstractC19728M50345, c10378.f38067);
                if (this.f35185) {
                    iM23856 = 0;
                } else {
                    iM23856 = (c10378.f38071 & 8) == 0 ? 1 : 0;
                    if (c10378.f38072 == c15252.f49865 && this.f35192.m29586() && !this.f35192.f38072.isEmpty()) {
                        iM23856++;
                    }
                    if (c10378.f38067 != abstractC22664M50340) {
                        iM23856 += C8935.m23846(abstractC22664M50340.mo50621()) - C8935.m23846(c10378.f38067.mo50621());
                    }
                }
                HashSet hashSet = new HashSet();
                C18499 c184910 = new C18499();
                Iterator it2 = c10378.f38067.mo50621().iterator();
                int i18 = 0;
                while (it2.hasNext()) {
                    AbstractC22664 abstractC22666 = (AbstractC22664) it2.next();
                    C14764 c14765 = c14764;
                    int[] iArr2 = this.f35204;
                    long j4 = 8589934592L;
                    if (iArr2 != null) {
                        it = it2;
                        if (iM23856 < iArr2.length && (i2 = iArr2[iM23856]) != 0) {
                            j4 = ((long) i2) | 8589934592L;
                        }
                    } else {
                        it = it2;
                    }
                    int[] iArr3 = this.f35186;
                    if (iArr3 == null || iM23856 >= iArr3.length || (i = iArr3[iM23856]) == 0) {
                        String strM34972 = "arg";
                        while (true) {
                            StringBuilder sbM27333 = C10732.m27333(strM34972);
                            sbM27333.append(hashSet.size());
                            abstractC19728M51194 = c15252.f49864.m51194(sbM27333.toString());
                            if (!hashSet.contains(abstractC19728M51194)) {
                                break;
                            } else {
                                strM34972 = C14483.m34972(strM34972, "$");
                            }
                        }
                        abstractC19728 = abstractC19728M51194;
                        j = j4;
                    } else {
                        C22273 c22274 = this.f35205;
                        C17359.requireNonNull(c22274);
                        abstractC19728 = (AbstractC19728) m28110(i, new C6523(c22274), c15252.f49799);
                        j = j4 | 4503599627370496L;
                    }
                    hashSet.add(abstractC19728);
                    C5070 c5070 = new C5070(j, abstractC19728, abstractC22666, c10378);
                    c184910.m43089(c5070);
                    C9460[] c9460Arr = this.f35173;
                    if (c9460Arr != null && (c9460 = c9460Arr[i18]) != null && (c14769 = c9460.f30673) != null && !c14769.isEmpty()) {
                        this.f35212.m28995(new RunnableC20649(this, c5070, c9460.f30673));
                    }
                    iM23856 += this.f35185 ? 1 : C8935.m23856(abstractC22666);
                    i18++;
                    c14764 = c14765;
                    it2 = it;
                    c24705 = c24705;
                }
                C14764 c14766 = c14764;
                C24705 c24707 = c24705;
                C9460[] c9460Arr2 = this.f35173;
                if (c9460Arr2 != null && c9460Arr2.length != i18) {
                    throw m28121("bad.runtime.invisible.param.annotations", c10378);
                }
                C11972.m30030(c10378.f33013);
                c10378.f33013 = c184910.m43093();
                this.f35173 = null;
                this.f35186 = null;
                this.f35204 = null;
                if ((jM28139 & 17179869184L) != 0 && ((abstractC22664 = (AbstractC22664) abstractC22664M50340.mo50621().last()) == null || !abstractC22664.m51067(EnumC21172.ARRAY))) {
                    c10378.f38071 &= -17179869185L;
                    throw m28121("malformed.vararg.method", c10378);
                }
                m28116(c24550, c10378);
                i15++;
                c2 = 0;
                i7 = 2;
                c14764 = c14766;
                cM28139 = c;
                c24705 = c24707;
            } catch (Throwable th) {
                this.f35192 = abstractC11783;
                throw th;
            }
        }
        C24705 c24708 = c24705;
        if (c24550.m54827()) {
            for (C22224 c22224 : c24550.m54835()) {
                AbstractC19728 abstractC19729 = c22224.f38072;
                C14769 c14769M35544 = C14769.m35543();
                c24550.mo29590();
                AbstractC17836 abstractC17836 = c24550.f79576;
                C9582 c9582 = new C9582(2);
                abstractC17836.getClass();
                Iterator it3 = abstractC17836.mo7473(abstractC19729, c9582, EnumC13908.RECURSIVE).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        c24706 = c24708;
                        c10377 = null;
                        break;
                    }
                    AbstractC11781 abstractC11784 = (AbstractC11781) it3.next();
                    c24706 = c24708;
                    if (c24706.m55148(abstractC11784.f38067.mo50621(), c14769M35544)) {
                        c10377 = (C10377) abstractC11784;
                        break;
                    }
                    c24708 = c24706;
                }
                c22224.f71601 = c10377;
                c24708 = c24706;
            }
        }
        this.f35176 = this.f35176.mo7484();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28129(C24550 c24550) {
        C24705 c24705 = this.f35183;
        this.f35192 = c24550;
        this.f35182 = c24550.f79575;
        this.f35193.clear();
        this.f35201 = true;
        this.f35196 = null;
        this.f35177 = null;
        try {
            try {
                this.f35199 = 0;
                C9002 c9002 = this.f35195;
                c9002.f29318 = 0;
                c9002.m24019(c24550.f79575.mo10889());
                m28117(c24550);
                if (!this.f35198.isEmpty() && !this.f35214.isEmpty()) {
                    C14769 c14769 = this.f35198;
                    C14769 c147610 = this.f35214;
                    this.f35198 = C14769.m35543();
                    this.f35214 = C14769.m35543();
                    this.f35208 = C14769.m35543();
                    this.f35178 = C14769.m35543();
                    this.f35201 = false;
                    C10510 c10510 = (C10510) this.f35192.f38067;
                    c10510.f33442 = c24705.m55103(c10510.f33442, c14769, c147610);
                    c10510.f33437 = c24705.m55095(c10510.f33437, c14769, c147610);
                    C14769 c14769M55155 = c24705.m55155(c10510.f33438, c14769, c147610);
                    c10510.f33438 = c14769M55155;
                    while (c14769M55155.m35550()) {
                        Object obj = c14769M55155.f48335;
                        ((AbstractC22664) obj).f73596.f38067 = (AbstractC22664) obj;
                        c14769M55155 = c14769M55155.f48336;
                    }
                } else if (this.f35198.isEmpty() != this.f35214.isEmpty()) {
                    throw m28121("undecl.type.var", ((AbstractC22664) this.f35198.f48335).f73596.f38072);
                }
                if ((c24550.f38071 & 8192) != 0) {
                    c24550.m54830(new C19723(c24550, new C0512(this, c24550, this.f35196, this.f35177)));
                } else {
                    c24550.m54830(C19723.m45415());
                }
                if (c24550 == this.f35175.f9544) {
                    if (this.f35208.m35550() || this.f35178.m35550()) {
                        C11972.m30026(this.f35175.f38070.mo11630());
                        C2920 c2920 = this.f35175;
                        c2920.f9555 = new C22361(this, c2920, this.f35208, this.f35178);
                    } else {
                        this.f35175.f9560 = C14769.m35543();
                        this.f35175.f9557 = C14769.m35543();
                    }
                }
                this.f35208 = C14769.m35543();
                this.f35178 = C14769.m35543();
                this.f35198 = C14769.m35543();
                this.f35214 = C14769.m35543();
                this.f35201 = false;
            } catch (IOException e) {
                e = e;
                throw m28121("unable.to.access.file", e.toString());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw m28121("bad.class.file", c24550.f79578);
            } catch (ClosedFileSystemException e2) {
                e = e2;
                throw m28121("unable.to.access.file", e.toString());
            }
        } catch (Throwable th) {
            this.f35208 = C14769.m35543();
            this.f35178 = C14769.m35543();
            this.f35198 = C14769.m35543();
            this.f35214 = C14769.m35543();
            this.f35201 = false;
            throw th;
        }
    }
}
