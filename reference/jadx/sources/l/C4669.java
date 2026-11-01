package l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.ۙ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4669 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13137 f16500;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17019 f16501;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6786 f16502;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16665 f16503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6559 f16504;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16665 f16505;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C4400 f16506;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16665 f16507;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16665 f16508;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16665 f16509;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f16510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15609 f16511;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C15960 f16512;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC23721[] f16513;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16665 f16514;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11457 f16515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11021 f16516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16517;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7492 f16518;

    public C4669(C6559 c6559) {
        this.f16504 = c6559;
        C6786 c6786 = new C6786(this);
        this.f16502 = c6786;
        EnumC0436 enumC0436 = EnumC0436.NONE;
        C16665 c16665 = new C16665(null, this, 4, enumC0436);
        this.f16507 = c16665;
        EnumC0436 enumC0437 = EnumC0436.TYPE;
        C16665 c16666 = new C16665("word_data", this, 4, enumC0437);
        this.f16508 = c16666;
        C16665 c16667 = new C16665("string_data", this, 1, EnumC0436.INSTANCE);
        this.f16514 = c16667;
        C16665 c16668 = new C16665(null, this, 1, enumC0436);
        this.f16509 = c16668;
        C16665 c16669 = new C16665("byte_data", this, 1, enumC0437);
        this.f16503 = c16669;
        C4400 c4400 = new C4400(this);
        this.f16506 = c4400;
        C11457 c11457 = new C11457(this);
        this.f16515 = c11457;
        C11021 c11021 = new C11021(this);
        this.f16516 = c11021;
        C13137 c13137 = new C13137(this);
        this.f16500 = c13137;
        C15960 c15960 = new C15960(this);
        this.f16512 = c15960;
        C17019 c17019 = new C17019(this);
        this.f16501 = c17019;
        C16665 c166610 = new C16665("map", this, 4, enumC0436);
        this.f16505 = c166610;
        if (c6559.m17799(26)) {
            C15609 c15609 = new C15609(this);
            this.f16511 = c15609;
            C7492 c7492 = new C7492(this);
            this.f16518 = c7492;
            this.f16513 = new AbstractC23721[]{c6786, c4400, c11457, c11021, c13137, c15960, c17019, c15609, c7492, c16666, c16665, c16667, c16669, c16668, c166610};
        } else {
            this.f16511 = null;
            this.f16518 = null;
            this.f16513 = new AbstractC23721[]{c6786, c4400, c11457, c11021, c13137, c15960, c17019, c16666, c16665, c16667, c16669, c16668, c166610};
        }
        this.f16510 = -1;
        this.f16517 = 79;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6559 m12875() {
        return this.f16504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12874(C12081 c12081) {
        this.f16501.m39786(c12081);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2718 m12871(C2907 c2907) {
        return m12867(false, c2907);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m12879() {
        return m12867(false, null).m8290();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m12868() {
        int i = this.f16510;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16665 m12885() {
        return this.f16514;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16665 m12878() {
        return this.f16508;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C16665 m12887() {
        return this.f16507;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16665 m12876() {
        return this.f16505;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4400 m12886() {
        return this.f16506;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17019 m12869() {
        return this.f16501;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16665 m12880() {
        return this.f16509;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C11457 m12877() {
        return this.f16515;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11021 m12888() {
        return this.f16516;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13137 m12889() {
        return this.f16500;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C15960 m12884() {
        return this.f16512;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7492 m12890() {
        return this.f16518;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15609 m12882() {
        return this.f16511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16665 m12873() {
        return this.f16503;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16665 m12881() {
        return this.f16508;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C16665 m12870() {
        return this.f16505;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12883(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC9901 instanceof C17432) {
            this.f16506.m12268((C17432) abstractC9901);
            return;
        }
        if (abstractC9901 instanceof C6143) {
            this.f16515.m28604((C6143) abstractC9901);
            return;
        }
        if (abstractC9901 instanceof AbstractC11788) {
            this.f16512.m37947((AbstractC11788) abstractC9901);
            return;
        }
        boolean z = abstractC9901 instanceof C23077;
        C13137 c13137 = this.f16500;
        if (z) {
            c13137.m32497((C23077) abstractC9901);
            return;
        }
        if (abstractC9901 instanceof C6848) {
            c13137.m32497(((C6848) abstractC9901).m18451());
            return;
        }
        if (abstractC9901 instanceof C16727) {
            this.f16516.m27803(((C16727) abstractC9901).m39215());
        } else if (abstractC9901 instanceof C16022) {
            this.f16518.m19995((C16022) abstractC9901);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m12872(AbstractC9901 abstractC9901) {
        if (abstractC9901 instanceof C17432) {
            return this.f16506.m12265(abstractC9901);
        }
        if (abstractC9901 instanceof C6143) {
            return this.f16515.m28602(abstractC9901);
        }
        if (abstractC9901 instanceof AbstractC11788) {
            return this.f16512.m37945(abstractC9901);
        }
        boolean z = abstractC9901 instanceof C23077;
        C13137 c13137 = this.f16500;
        if (z) {
            return c13137.m32495(abstractC9901);
        }
        if (abstractC9901 instanceof C6848) {
            return c13137.m32497(((C6848) abstractC9901).m18451());
        }
        if (abstractC9901 instanceof C16727) {
            return this.f16516.m27801(abstractC9901);
        }
        if (abstractC9901 instanceof C16022) {
            return this.f16518.m19994(abstractC9901);
        }
        if (abstractC9901 instanceof C1203) {
            return this.f16511.m37275(abstractC9901);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2718 m12867(boolean z, C2907 c2907) {
        byte[] bArr;
        this.f16501.m52247();
        this.f16509.m52247();
        C16665 c16665 = this.f16508;
        c16665.m52247();
        C6559 c6559 = this.f16504;
        boolean zM17799 = c6559.m17799(26);
        C15609 c15609 = this.f16511;
        if (zM17799) {
            c15609.m52247();
        }
        this.f16503.m52247();
        boolean zM177910 = c6559.m17799(26);
        C7492 c7492 = this.f16518;
        if (zM177910) {
            c7492.m52247();
        }
        this.f16512.m52247();
        this.f16500.m52247();
        this.f16516.m52247();
        this.f16507.m52247();
        this.f16515.m52247();
        this.f16506.m52247();
        this.f16514.m52247();
        this.f16502.m52247();
        AbstractC23721[] abstractC23721Arr = this.f16513;
        int length = abstractC23721Arr.length;
        int iMo14219 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC23721 abstractC23721 = abstractC23721Arr[i];
            if ((abstractC23721 != c15609 && abstractC23721 != c7492) || !abstractC23721.mo12263().isEmpty()) {
                int iM52250 = abstractC23721.m52250(iMo14219);
                if (iM52250 < iMo14219) {
                    throw new RuntimeException(C8479.m22141(i, "bogus placement for section "));
                }
                C16665 c16666 = this.f16505;
                if (abstractC23721 == c16666) {
                    try {
                        C18781.m43337(abstractC23721Arr, c16666);
                        c16666.m52247();
                    } catch (RuntimeException e) {
                        throw C7513.m20020("...while writing section " + i, e);
                    }
                }
                if (abstractC23721 instanceof C16665) {
                    ((C16665) abstractC23721).m39129();
                }
                iMo14219 = abstractC23721.mo14219() + iM52250;
            }
        }
        this.f16510 = iMo14219;
        if (c2907 == null) {
            bArr = new byte[iMo14219];
        } else {
            if (c2907.f10954.length < iMo14219) {
                Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + c2907.f10954.length + " vs " + iMo14219);
                c2907.f10954 = new byte[iMo14219];
            }
            bArr = c2907.f10954;
        }
        C2718 c2718 = new C2718(bArr);
        if (z) {
            c2718.m8292(this.f16517);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                AbstractC23721 abstractC23722 = abstractC23721Arr[i2];
                if ((abstractC23722 != c15609 && abstractC23722 != c7492) || !abstractC23722.mo12263().isEmpty()) {
                    int iM52248 = abstractC23722.m52248() - c2718.m8296();
                    if (iM52248 < 0) {
                        throw new C7513("excess write of " + (-iM52248), null);
                    }
                    c2718.m8281(iM52248);
                    abstractC23722.m52246(c2718);
                }
            } catch (RuntimeException e2) {
                C7513 c7513 = e2 instanceof C7513 ? (C7513) e2 : new C7513(null, e2);
                c7513.m20021("...while writing section " + i2);
                throw c7513;
            }
        }
        if (c2718.m8296() != this.f16510) {
            throw new RuntimeException("foreshortened write");
        }
        int iM8296 = c2718.m8296();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, iM8296 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int iM8297 = c2718.m8296();
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, iM8297 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                if (z) {
                    c16665.m39127(c2718, EnumC18075.TYPE_CODE_ITEM);
                    C1847 c1847 = new C1847();
                    for (AbstractC23721 abstractC23723 : abstractC23721Arr) {
                        c1847.m6009(abstractC23723);
                    }
                    c1847.m6008(c2718);
                    c2718.m8291();
                }
                return c2718;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
