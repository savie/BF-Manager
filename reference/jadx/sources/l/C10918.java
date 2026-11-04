package l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.ۤܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10918 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16885 f34547;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11116 f34548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19123 f34549;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f34550;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19123 f34551;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19123 f34552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19123 f34553;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19123 f34554;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11664 f34555;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34556;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC8681[] f34557;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18377 f34558;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2715 f34559;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16646 f34560;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C20067 f34561;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18072 f34562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0919 f34563;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19123 f34564;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14647 f34565;

    public C10918(C16646 c16646) {
        this.f34560 = c16646;
        C16885 c16885 = new C16885(this);
        this.f34547 = c16885;
        EnumC7936 enumC7936 = EnumC7936.NONE;
        C19123 c19123 = new C19123(null, this, 4, enumC7936);
        this.f34554 = c19123;
        EnumC7936 enumC7937 = EnumC7936.TYPE;
        C19123 c19124 = new C19123("word_data", this, 4, enumC7937);
        this.f34551 = c19124;
        C19123 c19125 = new C19123("string_data", this, 1, EnumC7936.INSTANCE);
        this.f34564 = c19125;
        C19123 c19126 = new C19123(null, this, 1, enumC7936);
        this.f34552 = c19126;
        C19123 c19127 = new C19123("byte_data", this, 1, enumC7937);
        this.f34549 = c19127;
        C11116 c11116 = new C11116(this);
        this.f34548 = c11116;
        C20067 c20067 = new C20067(this);
        this.f34561 = c20067;
        C2715 c2715 = new C2715(this);
        this.f34559 = c2715;
        C11664 c11664 = new C11664(this);
        this.f34555 = c11664;
        C18377 c18377 = new C18377(this);
        this.f34558 = c18377;
        C0919 c0919 = new C0919(this);
        this.f34563 = c0919;
        C19123 c19128 = new C19123("map", this, 4, enumC7936);
        this.f34553 = c19128;
        if (c16646.m39356(26)) {
            C18072 c18072 = new C18072(this);
            this.f34562 = c18072;
            C14647 c14647 = new C14647(this);
            this.f34565 = c14647;
            this.f34557 = new AbstractC8681[]{c16885, c11116, c20067, c2715, c11664, c18377, c0919, c18072, c14647, c19124, c19123, c19125, c19127, c19126, c19128};
        } else {
            this.f34562 = null;
            this.f34565 = null;
            this.f34557 = new AbstractC8681[]{c16885, c11116, c20067, c2715, c11664, c18377, c0919, c19124, c19123, c19125, c19127, c19126, c19128};
        }
        this.f34550 = -1;
        this.f34556 = 79;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16646 m27709() {
        return this.f34560;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27698(C9867 c9867) {
        this.f34563.m3718(c9867);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15000 m27695(C22107 c22107) {
        return m27692(false, c22107);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] m27700() {
        return m27692(false, null).m36125();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m27704() {
        int i = this.f34550;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19123 m27706() {
        return this.f34564;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19123 m27703() {
        return this.f34551;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C19123 m27710() {
        return this.f34554;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19123 m27702() {
        return this.f34553;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11116 m27714() {
        return this.f34548;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0919 m27713() {
        return this.f34563;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19123 m27701() {
        return this.f34552;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20067 m27694() {
        return this.f34561;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2715 m27708() {
        return this.f34559;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11664 m27705() {
        return this.f34555;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18377 m27707() {
        return this.f34558;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14647 m27715() {
        return this.f34565;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18072 m27711() {
        return this.f34562;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19123 m27697() {
        return this.f34549;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19123 m27699() {
        return this.f34551;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19123 m27693() {
        return this.f34553;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27712(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC13487 instanceof C9976) {
            this.f34548.m28068((C9976) abstractC13487);
            return;
        }
        if (abstractC13487 instanceof C1028) {
            this.f34561.m46187((C1028) abstractC13487);
            return;
        }
        if (abstractC13487 instanceof AbstractC22657) {
            this.f34558.m42875((AbstractC22657) abstractC13487);
            return;
        }
        boolean z = abstractC13487 instanceof C16689;
        C11664 c11664 = this.f34555;
        if (z) {
            c11664.m29339((C16689) abstractC13487);
            return;
        }
        if (abstractC13487 instanceof C24895) {
            c11664.m29339(((C24895) abstractC13487).m55427());
            return;
        }
        if (abstractC13487 instanceof C7740) {
            this.f34559.m9037(((C7740) abstractC13487).m21068());
        } else if (abstractC13487 instanceof C21165) {
            this.f34565.m35279((C21165) abstractC13487);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m27696(AbstractC13487 abstractC13487) {
        if (abstractC13487 instanceof C9976) {
            return this.f34548.m28066(abstractC13487);
        }
        if (abstractC13487 instanceof C1028) {
            return this.f34561.m46185(abstractC13487);
        }
        if (abstractC13487 instanceof AbstractC22657) {
            return this.f34558.m42873(abstractC13487);
        }
        boolean z = abstractC13487 instanceof C16689;
        C11664 c11664 = this.f34555;
        if (z) {
            return c11664.m29337(abstractC13487);
        }
        if (abstractC13487 instanceof C24895) {
            return c11664.m29339(((C24895) abstractC13487).m55427());
        }
        if (abstractC13487 instanceof C7740) {
            return this.f34559.m9035(abstractC13487);
        }
        if (abstractC13487 instanceof C21165) {
            return this.f34565.m35278(abstractC13487);
        }
        if (abstractC13487 instanceof C5503) {
            return this.f34562.m42106(abstractC13487);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15000 m27692(boolean z, C22107 c22107) {
        byte[] bArr;
        this.f34563.m23367();
        this.f34552.m23367();
        C19123 c19123 = this.f34551;
        c19123.m23367();
        C16646 c16646 = this.f34560;
        boolean zM39356 = c16646.m39356(26);
        C18072 c18072 = this.f34562;
        if (zM39356) {
            c18072.m23367();
        }
        this.f34549.m23367();
        boolean zM39357 = c16646.m39356(26);
        C14647 c14647 = this.f34565;
        if (zM39357) {
            c14647.m23367();
        }
        this.f34558.m23367();
        this.f34555.m23367();
        this.f34559.m23367();
        this.f34554.m23367();
        this.f34561.m23367();
        this.f34548.m23367();
        this.f34564.m23367();
        this.f34547.m23367();
        AbstractC8681[] abstractC8681Arr = this.f34557;
        int length = abstractC8681Arr.length;
        int iMo23358 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC8681 abstractC8681 = abstractC8681Arr[i];
            if ((abstractC8681 != c18072 && abstractC8681 != c14647) || !abstractC8681.mo3721().isEmpty()) {
                int iM23368 = abstractC8681.m23368(iMo23358);
                if (iM23368 < iMo23358) {
                    throw new RuntimeException(C13645.m33382(i, "bogus placement for section "));
                }
                C19123 c19124 = this.f34553;
                if (abstractC8681 == c19124) {
                    try {
                        C20615.m47237(abstractC8681Arr, c19124);
                        c19124.m23367();
                    } catch (RuntimeException e) {
                        throw C3880.m12507("...while writing section " + i, e);
                    }
                }
                if (abstractC8681 instanceof C19123) {
                    ((C19123) abstractC8681).m44246();
                }
                iMo23358 = abstractC8681.mo23358() + iM23368;
            }
        }
        this.f34550 = iMo23358;
        if (c22107 == null) {
            bArr = new byte[iMo23358];
        } else {
            if (c22107.f71251.length < iMo23358) {
                Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + c22107.f71251.length + " vs " + iMo23358);
                c22107.f71251 = new byte[iMo23358];
            }
            bArr = c22107.f71251;
        }
        C15000 c15000 = new C15000(bArr);
        if (z) {
            c15000.m36119(this.f34556);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                AbstractC8681 abstractC8682 = abstractC8681Arr[i2];
                if ((abstractC8682 != c18072 && abstractC8682 != c14647) || !abstractC8682.mo3721().isEmpty()) {
                    int iM23364 = abstractC8682.m23364() - c15000.m36122();
                    if (iM23364 < 0) {
                        throw new C3880("excess write of " + (-iM23364), null);
                    }
                    c15000.m36109(iM23364);
                    abstractC8682.m23362(c15000);
                }
            } catch (RuntimeException e2) {
                C3880 c3880 = e2 instanceof C3880 ? (C3880) e2 : new C3880(null, e2);
                c3880.m12508("...while writing section " + i2);
                throw c3880;
            }
        }
        if (c15000.m36122() != this.f34550) {
            throw new RuntimeException("foreshortened write");
        }
        int iM36122 = c15000.m36122();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, iM36122 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int iM36123 = c15000.m36122();
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, iM36123 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                if (z) {
                    c19123.m44245(c15000, EnumC3461.TYPE_CODE_ITEM);
                    C13901 c13901 = new C13901();
                    for (AbstractC8681 abstractC8683 : abstractC8681Arr) {
                        c13901.m33847(abstractC8683);
                    }
                    c13901.m33848(c15000);
                    c15000.m36118();
                }
                return c15000;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
