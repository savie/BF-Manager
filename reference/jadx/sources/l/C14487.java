package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܰۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14487 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f45598;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18963[] f45599;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f45600;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f45601;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f45602;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f45603;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f45604;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[PHI: r11
      0x0078: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:15:0x0056, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    public C14487(byte[] bArr, boolean z) {
        int i;
        short sM35000;
        this.f45603 = bArr;
        if (z && ((sM35000 = m35000(6)) > 72 || (sM35000 == 72 && m35000(4) != 0))) {
            throw new IllegalArgumentException(C6934.m19217("Unsupported class file version ", m35000(6), m35000(4) & HPKE.aead_EXPORT_ONLY, "."));
        }
        int iM34997 = m34997(8);
        this.f45602 = new int[iM34997];
        this.f45604 = new String[iM34997];
        int i2 = 10;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i3 < iM34997) {
            int i5 = i3 + 1;
            int i6 = i2 + 1;
            this.f45602[i3] = i6;
            int iM34998 = 3;
            switch (bArr[i2]) {
                case 1:
                    iM34998 = 3 + m34997(i6);
                    if (iM34998 > i4) {
                        i = iM34998;
                        i4 = i;
                    } else {
                        i = iM34998;
                    }
                    i2 += i;
                    i3 = i5;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i = 5;
                    i2 += i;
                    i3 = i5;
                    break;
                case 5:
                case 6:
                    i5 = i3 + 2;
                    i = 9;
                    i2 += i;
                    i3 = i5;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i = iM34998;
                    i2 += i;
                    i3 = i5;
                    break;
                case 15:
                    i = 4;
                    i2 += i;
                    i3 = i5;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i5;
                    break;
                case 18:
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i5;
                    break;
            }
        }
        this.f45600 = i4;
        this.f45601 = i2;
        int[] iArr = null;
        this.f45599 = z2 ? new C18963[iM34997] : null;
        if (z3) {
            char[] cArr = new char[i4];
            int iM34991 = m34991();
            for (int iM34999 = m34997(iM34991 - 2); iM34999 > 0; iM34999--) {
                String strM34999 = m34999(cArr, iM34991);
                int iM349910 = m34998(iM34991 + 2);
                int i7 = iM34991 + 6;
                if (!"BootstrapMethods".equals(strM34999)) {
                    iM34991 = i7 + iM349910;
                } else {
                    if (iM349910 > this.f45603.length - i7) {
                        throw new IllegalArgumentException();
                    }
                    int iM349911 = m34997(i7);
                    int[] iArr2 = new int[iM349911];
                    int iM349912 = iM34991 + 8;
                    for (int i8 = 0; i8 < iM349911; i8++) {
                        iArr2[i8] = iM349912;
                        iM349912 += (m34997(iM349912 + 2) * 2) + 4;
                    }
                    iArr = iArr2;
                }
            }
            throw new IllegalArgumentException();
        }
        this.f45598 = iArr;
    }

    public C14487(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        int iMin = iAvailable < 256 ? 4096 : Math.min(iAvailable, 1048576);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] byteArray = new byte[iMin];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(byteArray, 0, iMin);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(byteArray, 0, i2);
                i++;
            }
            byteArrayOutputStream.flush();
            if (i != 1) {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.close();
            int length = byteArray.length;
            this(byteArray, true);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34994(AbstractC18217 abstractC18217, C24185[] c24185Arr, int i) {
        AbstractC18217 abstractC18218;
        String str;
        int i2;
        C1064 c1064;
        String str2;
        String str3;
        String str4;
        AbstractC18217 abstractC18219;
        int i3;
        String str5;
        String str6;
        String str7;
        int i4;
        String str8;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC18217 abstractC182110;
        int i10;
        int i11;
        String[] strArr;
        String[] strArr2;
        int i12;
        int i13;
        int i14;
        C1064 c1065 = new C1064();
        c1065.f3802 = c24185Arr;
        c1065.f3804 = i;
        char[] cArr = new char[this.f45600];
        c1065.f3815 = cArr;
        int i15 = this.f45601;
        int iM34997 = m34997(i15);
        String strM34990 = m34990(cArr, i15 + 2);
        String strM34991 = m34990(cArr, i15 + 4);
        int iM34998 = m34997(i15 + 6);
        String[] strArr3 = new String[iM34998];
        int i16 = i15 + 8;
        for (int i17 = 0; i17 < iM34998; i17++) {
            strArr3[i17] = m34990(cArr, i16);
            i16 += 2;
        }
        int iM34991 = m34991();
        String strM34999 = null;
        int iM34999 = m34997(iM34991 - 2);
        String strM34992 = null;
        String strM34993 = null;
        C24185 c24185 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = iM34997;
        int i29 = 0;
        String strM349910 = null;
        String strM34988 = null;
        while (true) {
            C1064 c1066 = c1065;
            String str9 = "RuntimeInvisibleTypeAnnotations";
            int i30 = i16;
            String str10 = strM34991;
            if (iM34999 > 0) {
                String str11 = strM34992;
                String strM349911 = m34999(cArr, iM34991);
                int i31 = i29;
                int iM349910 = m34998(iM34991 + 2);
                int i32 = iM34991 + 6;
                String str12 = strM34988;
                if ("SourceFile".equals(strM349911)) {
                    strM349910 = m34999(cArr, i32);
                } else if ("InnerClasses".equals(strM349911)) {
                    i25 = i32;
                } else if ("EnclosingMethod".equals(strM349911)) {
                    i18 = i32;
                } else if ("NestHost".equals(strM349911)) {
                    strM34993 = m34990(cArr, i32);
                } else if ("NestMembers".equals(strM349911)) {
                    i23 = i32;
                } else if ("PermittedSubclasses".equals(strM349911)) {
                    i24 = i32;
                } else if ("Signature".equals(strM349911)) {
                    strM34999 = m34999(cArr, i32);
                } else if ("RuntimeVisibleAnnotations".equals(strM349911)) {
                    i19 = i32;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM349911)) {
                    i21 = i32;
                } else {
                    if ("Deprecated".equals(strM349911)) {
                        i14 = i28 | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    } else if ("Synthetic".equals(strM349911)) {
                        i14 = i28 | 4096;
                    } else {
                        if ("SourceDebugExtension".equals(strM349911)) {
                            if (iM349910 > this.f45603.length - i32) {
                                throw new IllegalArgumentException();
                            }
                            strM34988 = m34988(new char[iM349910], i32, iM349910);
                            strM34992 = str11;
                            i12 = i32;
                            i13 = iM349910;
                            i30 = i30;
                            i29 = i31;
                        } else if ("RuntimeInvisibleAnnotations".equals(strM349911)) {
                            i20 = i32;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(strM349911)) {
                            i22 = i32;
                        } else if ("Record".equals(strM349911)) {
                            i14 = 65536 | i28;
                            i26 = i32;
                        } else if ("Module".equals(strM349911)) {
                            i27 = i32;
                        } else if ("ModuleMainClass".equals(strM349911)) {
                            strM34992 = m34990(cArr, i32);
                            strM34988 = str12;
                            i12 = i32;
                            i13 = iM349910;
                            i30 = i30;
                            i29 = i31;
                        } else if ("ModulePackages".equals(strM349911)) {
                            i31 = i32;
                        } else {
                            if ("BootstrapMethods".equals(strM349911)) {
                                i12 = i32;
                                i13 = iM349910;
                            } else {
                                i12 = i32;
                                i13 = iM349910;
                                C24185 c24185M34986 = m34986(c24185Arr, strM349911, i12, i13, cArr, -1, null);
                                c24185M34986.f78328 = c24185;
                                c24185 = c24185M34986;
                            }
                            strM34992 = str11;
                            strM34988 = str12;
                            i28 = i28;
                            i29 = i31;
                            strM349910 = strM349910;
                        }
                        iM34991 = i12 + i13;
                        iM34999--;
                        i16 = i30;
                        c1065 = c1066;
                        strM34991 = str10;
                    }
                    i28 = i14;
                }
                strM34992 = str11;
                strM34988 = str12;
                i12 = i32;
                i13 = iM349910;
                i30 = i30;
                i29 = i31;
                iM34991 = i12 + i13;
                iM34999--;
                i16 = i30;
                c1065 = c1066;
                strM34991 = str10;
            } else {
                String str13 = strM349910;
                int i33 = i29;
                int[] iArr = this.f45602;
                String str14 = "Synthetic";
                String str15 = strM34992;
                String str16 = strM34988;
                String str17 = strM34999;
                String str18 = "Deprecated";
                String str19 = "RuntimeVisibleAnnotations";
                abstractC18217.mo2001(m34998(iArr[1] - 7), i28, strM34990, str17, str10, strArr3);
                String str20 = "RuntimeVisibleTypeAnnotations";
                if ((i & 2) != 0 || (str13 == null && str16 == null)) {
                    abstractC18218 = abstractC18217;
                } else {
                    abstractC18218 = abstractC18217;
                    abstractC18218.mo2004(str13, str16);
                }
                int i34 = i27;
                if (i34 != 0) {
                    c1064 = c1066;
                    char[] cArr2 = c1064.f3815;
                    str = "RuntimeInvisibleAnnotations";
                    i2 = i30;
                    int i35 = i34 + 6;
                    AbstractC5343 abstractC5343Mo1997 = abstractC18218.mo1997(m34997(i34 + 2), m34990(cArr2, i34), m34999(cArr2, i34 + 4));
                    if (abstractC5343Mo1997 != null) {
                        if (str15 != null) {
                            abstractC5343Mo1997.mo5698(str15);
                        }
                        if (i33 != 0) {
                            int iM349911 = m34997(i33);
                            int i36 = i33 + 2;
                            while (true) {
                                int i37 = iM349911 - 1;
                                if (iM349911 <= 0) {
                                    break;
                                }
                                abstractC5343Mo1997.mo5705(m34990(cArr2, i36));
                                i36 += 2;
                                iM349911 = i37;
                            }
                        }
                        int iM349912 = m34997(i35);
                        int i38 = i34 + 8;
                        while (true) {
                            int i39 = iM349912 - 1;
                            if (iM349912 <= 0) {
                                break;
                            }
                            String strM34994 = m34990(cArr2, i38);
                            int iM349913 = m34997(i38 + 2);
                            String strM349912 = m34999(cArr2, i38 + 4);
                            i38 += 6;
                            abstractC5343Mo1997.mo5697(iM349913, strM34994, strM349912);
                            iM349912 = i39;
                        }
                        int iM349914 = m34997(i38);
                        int i40 = i38 + 2;
                        while (true) {
                            int i41 = iM349914 - 1;
                            if (iM349914 <= 0) {
                                break;
                            }
                            String strM34995 = m34990(cArr2, i40);
                            int iM349915 = m34997(i40 + 2);
                            int iM349916 = m34997(i40 + 4);
                            i40 += 6;
                            if (iM349916 != 0) {
                                strArr2 = new String[iM349916];
                                for (int i42 = 0; i42 < iM349916; i42++) {
                                    strArr2[i42] = m34990(cArr2, i40);
                                    i40 += 2;
                                }
                            } else {
                                strArr2 = null;
                            }
                            abstractC5343Mo1997.mo5699(strM34995, iM349915, strArr2);
                            iM349914 = i41;
                        }
                        int iM349917 = m34997(i40);
                        int i43 = i40 + 2;
                        while (true) {
                            int i44 = iM349917 - 1;
                            if (iM349917 <= 0) {
                                break;
                            }
                            String strM34996 = m34990(cArr2, i43);
                            int iM349918 = m34997(i43 + 2);
                            int iM349919 = m34997(i43 + 4);
                            i43 += 6;
                            if (iM349919 != 0) {
                                strArr = new String[iM349919];
                                for (int i45 = 0; i45 < iM349919; i45++) {
                                    strArr[i45] = m34990(cArr2, i43);
                                    i43 += 2;
                                }
                            } else {
                                strArr = null;
                            }
                            abstractC5343Mo1997.mo5706(strM34996, iM349918, strArr);
                            iM349917 = i44;
                        }
                        int iM349920 = m34997(i43);
                        int i46 = i43 + 2;
                        while (true) {
                            int i47 = iM349920 - 1;
                            if (iM349920 <= 0) {
                                break;
                            }
                            abstractC5343Mo1997.mo5703(m34990(cArr2, i46));
                            i46 += 2;
                            iM349920 = i47;
                        }
                        int iM349921 = m34997(i46);
                        int i48 = i46 + 2;
                        while (true) {
                            int i49 = iM349921 - 1;
                            if (iM349921 <= 0) {
                                break;
                            }
                            String strM34997 = m34990(cArr2, i48);
                            int iM349922 = m34997(i48 + 2);
                            i48 += 4;
                            String[] strArr4 = new String[iM349922];
                            for (int i50 = 0; i50 < iM349922; i50++) {
                                strArr4[i50] = m34990(cArr2, i48);
                                i48 += 2;
                            }
                            abstractC5343Mo1997.mo5700(strM34997, strArr4);
                            iM349921 = i49;
                        }
                        abstractC5343Mo1997.mo5696();
                    }
                } else {
                    str = r23;
                    i2 = i30;
                    c1064 = c1066;
                }
                String str21 = strM34993;
                if (str21 != null) {
                    abstractC18218.mo2002(str21);
                }
                int i51 = i18;
                if (i51 != 0) {
                    String strM34998 = m34990(cArr, i51);
                    int iM349923 = m34997(i51 + 2);
                    abstractC18218.mo2005(strM34998, iM349923 == 0 ? null : m34999(cArr, iArr[iM349923]), iM349923 == 0 ? null : m34999(cArr, iArr[iM349923] + 2));
                }
                int i52 = i19;
                if (i52 != 0) {
                    int iM349924 = m34997(i52);
                    int iM34982 = i52 + 2;
                    while (true) {
                        int i53 = iM349924 - 1;
                        if (iM349924 <= 0) {
                            break;
                        }
                        iM34982 = m34982(abstractC18218.mo1996(m34999(cArr, iM34982), true), iM34982 + 2, true, cArr, 0);
                        iM349924 = i53;
                        abstractC18218 = abstractC18218;
                    }
                }
                AbstractC18217 abstractC182111 = abstractC18218;
                String str22 = str;
                int i54 = i20;
                if (i54 != 0) {
                    int iM349925 = m34997(i54);
                    int iM34983 = i54 + 2;
                    while (true) {
                        int i55 = iM349925 - 1;
                        if (iM349925 <= 0) {
                            break;
                        }
                        iM34983 = m34982(abstractC182111.mo1996(m34999(cArr, iM34983), false), iM34983 + 2, true, cArr, 0);
                        iM349925 = i55;
                    }
                }
                int i56 = i21;
                if (i56 != 0) {
                    int iM349926 = m34997(i56);
                    int iM34984 = i56 + 2;
                    while (true) {
                        int i57 = iM349926 - 1;
                        if (iM349926 <= 0) {
                            break;
                        }
                        int iM34980 = m34980(c1064, iM34984);
                        iM34984 = m34982(abstractC182111.mo1995(c1064.f3814, c1064.f3807, m34999(cArr, iM34980), true), iM34980 + 2, true, cArr, 0);
                        iM349926 = i57;
                    }
                }
                int i58 = i22;
                if (i58 != 0) {
                    int iM349927 = m34997(i58);
                    int iM34985 = i58 + 2;
                    while (true) {
                        int i59 = iM349927 - 1;
                        if (iM349927 <= 0) {
                            break;
                        }
                        int iM34981 = m34980(c1064, iM34985);
                        iM34985 = m34982(abstractC182111.mo1995(c1064.f3814, c1064.f3807, m34999(cArr, iM34981), false), iM34981 + 2, true, cArr, 0);
                        iM349927 = i59;
                    }
                }
                C24185 c24186 = c24185;
                while (c24186 != null) {
                    C24185 c24187 = c24186.f78328;
                    c24186.f78328 = null;
                    abstractC182111.mo2006(c24186);
                    c24186 = c24187;
                }
                int i60 = i23;
                if (i60 != 0) {
                    int iM349928 = m34997(i60);
                    int i61 = i60 + 2;
                    while (true) {
                        int i62 = iM349928 - 1;
                        if (iM349928 <= 0) {
                            break;
                        }
                        abstractC182111.mo2009(m34990(cArr, i61));
                        i61 += 2;
                        iM349928 = i62;
                    }
                }
                int i63 = i24;
                if (i63 != 0) {
                    int iM349929 = m34997(i63);
                    int i64 = i63 + 2;
                    while (true) {
                        int i65 = iM349929 - 1;
                        if (iM349929 <= 0) {
                            break;
                        }
                        abstractC182111.mo2007(m34990(cArr, i64));
                        i64 += 2;
                        iM349929 = i65;
                    }
                }
                int i66 = i25;
                if (i66 != 0) {
                    int iM349930 = m34997(i66);
                    int i67 = i66 + 2;
                    while (true) {
                        int i68 = iM349930 - 1;
                        if (iM349930 <= 0) {
                            break;
                        }
                        abstractC182111.mo2003(m34990(cArr, i67), m34997(i67 + 6), m34990(cArr, i67 + 2), m34999(cArr, i67 + 4));
                        i67 += 8;
                        iM349930 = i68;
                    }
                }
                int i69 = i26;
                if (i69 != 0) {
                    int iM349931 = m34997(i69);
                    AbstractC18217 abstractC182112 = abstractC182111;
                    int i70 = i69 + 2;
                    while (true) {
                        int i71 = iM349931 - 1;
                        if (iM349931 <= 0) {
                            break;
                        }
                        char[] cArr3 = c1064.f3815;
                        String strM349913 = m34999(cArr3, i70);
                        String strM349914 = m34999(cArr3, i70 + 2);
                        int iM349932 = m34997(i70 + 4);
                        int i72 = 0;
                        String strM349915 = null;
                        C24185 c24188 = null;
                        int i73 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        AbstractC18217 abstractC182113 = abstractC182112;
                        int i76 = i70 + 6;
                        AbstractC18217 abstractC182114 = abstractC182113;
                        while (true) {
                            int i77 = iM349932 - 1;
                            if (iM349932 <= 0) {
                                break;
                            }
                            String strM349916 = m34999(cArr3, i76);
                            int i78 = i72;
                            int iM349933 = m34998(i76 + 2);
                            int i79 = i76 + 6;
                            if ("Signature".equals(strM349916)) {
                                i72 = i78;
                                strM349915 = m34999(cArr3, i79);
                                strM349914 = strM349914;
                                strM349913 = strM349913;
                                i11 = i79;
                            } else {
                                if (str19.equals(strM349916)) {
                                    i72 = i79;
                                    i11 = i72;
                                } else if (str20.equals(strM349916)) {
                                    i72 = i78;
                                    i11 = i79;
                                    i74 = i11;
                                } else if (str22.equals(strM349916)) {
                                    i72 = i78;
                                    i11 = i79;
                                    i73 = i11;
                                } else {
                                    if (str9.equals(strM349916)) {
                                        i72 = i78;
                                        i11 = i79;
                                        i75 = i11;
                                    } else {
                                        strM349914 = strM349914;
                                        strM349913 = strM349913;
                                        i11 = i79;
                                        C24185 c24185M34987 = m34986(c1064.f3802, strM349916, i79, iM349933, cArr3, -1, null);
                                        c24185M34987.f78328 = c24188;
                                        c24188 = c24185M34987;
                                        i72 = i78;
                                        abstractC182114 = abstractC18217;
                                    }
                                    i76 = i11 + iM349933;
                                    abstractC182111 = abstractC18217;
                                    str20 = str20;
                                    str14 = str14;
                                    iM349932 = i77;
                                    str9 = str9;
                                    strM349914 = strM349914;
                                    strM349913 = strM349913;
                                    i71 = i71;
                                }
                                abstractC182114 = abstractC182111;
                            }
                            i76 = i11 + iM349933;
                            abstractC182111 = abstractC18217;
                            str20 = str20;
                            str14 = str14;
                            iM349932 = i77;
                            str9 = str9;
                            strM349914 = strM349914;
                            strM349913 = strM349913;
                            i71 = i71;
                        }
                        int i80 = i72;
                        int i81 = i71;
                        String str23 = str9;
                        String str24 = str14;
                        String str25 = str20;
                        C24185 c24189 = c24188;
                        AbstractC11308 abstractC11308Mo2008 = abstractC182114.mo2008(strM349913, strM349914, strM349915);
                        if (abstractC11308Mo2008 == null) {
                            abstractC182110 = abstractC182114;
                            i10 = i76;
                        } else {
                            if (i80 != 0) {
                                int iM349934 = m34997(i80);
                                int iM34986 = i80 + 2;
                                while (true) {
                                    int i82 = iM349934 - 1;
                                    if (iM349934 <= 0) {
                                        break;
                                    }
                                    iM34986 = m34982(abstractC11308Mo2008.mo28578(m34999(cArr3, iM34986), true), iM34986 + 2, true, cArr3, 0);
                                    iM349934 = i82;
                                    abstractC182114 = abstractC182114;
                                    i76 = i76;
                                }
                            }
                            abstractC182110 = abstractC182114;
                            i10 = i76;
                            int i83 = i73;
                            if (i83 != 0) {
                                int iM349935 = m34997(i83);
                                int iM34987 = i83 + 2;
                                while (true) {
                                    int i84 = iM349935 - 1;
                                    if (iM349935 <= 0) {
                                        break;
                                    }
                                    iM34987 = m34982(abstractC11308Mo2008.mo28578(m34999(cArr3, iM34987), false), iM34987 + 2, true, cArr3, 0);
                                    iM349935 = i84;
                                }
                            }
                            int i85 = i74;
                            if (i85 != 0) {
                                int iM349936 = m34997(i85);
                                int iM34988 = i85 + 2;
                                while (true) {
                                    int i86 = iM349936 - 1;
                                    if (iM349936 <= 0) {
                                        break;
                                    }
                                    int iM34989 = m34980(c1064, iM34988);
                                    iM34988 = m34982(abstractC11308Mo2008.mo28577(c1064.f3814, c1064.f3807, m34999(cArr3, iM34989), true), iM34989 + 2, true, cArr3, 0);
                                    iM349936 = i86;
                                }
                            }
                            int i87 = i75;
                            if (i87 != 0) {
                                int iM349937 = m34997(i87);
                                int iM349810 = i87 + 2;
                                while (true) {
                                    int i88 = iM349937 - 1;
                                    if (iM349937 <= 0) {
                                        break;
                                    }
                                    int iM349811 = m34980(c1064, iM349810);
                                    iM349810 = m34982(abstractC11308Mo2008.mo28577(c1064.f3814, c1064.f3807, m34999(cArr3, iM349811), false), iM349811 + 2, true, cArr3, 0);
                                    iM349937 = i88;
                                }
                            }
                            while (c24189 != null) {
                                C24185 c241810 = c24189.f78328;
                                c24189.f78328 = null;
                                abstractC11308Mo2008.mo28580(c24189);
                                c24189 = c241810;
                            }
                            abstractC11308Mo2008.mo28579();
                        }
                        abstractC182111 = abstractC18217;
                        iM349931 = i81;
                        str20 = str25;
                        str14 = str24;
                        str9 = str23;
                        abstractC182112 = abstractC182110;
                        i70 = i10;
                    }
                    str2 = str20;
                    str3 = str9;
                    str4 = str14;
                    abstractC18219 = abstractC182112;
                } else {
                    str2 = str20;
                    str3 = "RuntimeInvisibleTypeAnnotations";
                    str4 = str14;
                    abstractC18219 = abstractC18217;
                }
                int i89 = i2;
                int iM349938 = m34997(i89);
                int i90 = i89 + 2;
                while (true) {
                    int i91 = iM349938 - 1;
                    if (iM349938 <= 0) {
                        break;
                    }
                    char[] cArr4 = c1064.f3815;
                    int iM349939 = m34997(i90);
                    String strM349917 = m34999(cArr4, i90 + 2);
                    String strM349918 = m34999(cArr4, i90 + 4);
                    int iM349940 = m34997(i90 + 6);
                    C24185 c241811 = null;
                    int i92 = i90 + 8;
                    String strM349919 = null;
                    Object objM34993 = null;
                    int i93 = 0;
                    int i94 = 0;
                    int i95 = 0;
                    int i96 = iM349939;
                    int i97 = 0;
                    while (true) {
                        int i98 = iM349940 - 1;
                        if (iM349940 <= 0) {
                            break;
                        }
                        String strM349920 = m34999(cArr4, i92);
                        int i99 = i97;
                        int iM349941 = m34998(i92 + 2);
                        int i100 = i92 + 6;
                        if ("ConstantValue".equals(strM349920)) {
                            int iM349942 = m34997(i100);
                            objM34993 = iM349942 == 0 ? null : m34993(cArr4, iM349942);
                            str5 = str18;
                        } else {
                            if ("Signature".equals(strM349920)) {
                                strM349919 = m34999(cArr4, i100);
                                str5 = str18;
                                i7 = i93;
                            } else {
                                str5 = str18;
                                if (str5.equals(strM349920)) {
                                    i8 = i96 | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                } else {
                                    if (str4.equals(strM349920)) {
                                        i8 = i96 | 4096;
                                    } else if (str19.equals(strM349920)) {
                                        i7 = i93;
                                        i94 = i100;
                                    } else if (str2.equals(strM349920)) {
                                        i7 = i100;
                                    } else if (str22.equals(strM349920)) {
                                        i99 = i100;
                                        i6 = i96;
                                        str6 = str3;
                                        i9 = i6;
                                        i7 = i93;
                                        str7 = str5;
                                        i97 = i99;
                                        i4 = i100;
                                        str8 = str6;
                                        i5 = i7;
                                        i96 = i9;
                                    } else {
                                        int i101 = i96;
                                        str6 = str3;
                                        if (str6.equals(strM349920)) {
                                            i99 = i99;
                                            i6 = i101;
                                            i95 = i100;
                                            i9 = i6;
                                            i7 = i93;
                                            str7 = str5;
                                            i97 = i99;
                                            i4 = i100;
                                            str8 = str6;
                                            i5 = i7;
                                            i96 = i9;
                                        } else {
                                            str7 = str5;
                                            i4 = i100;
                                            str8 = str6;
                                            i5 = i93;
                                            C24185 c24185M34988 = m34986(c1064.f3802, strM349920, i4, iM349941, cArr4, -1, null);
                                            c24185M34988.f78328 = c241811;
                                            c241811 = c24185M34988;
                                            i95 = i95;
                                            i96 = i101;
                                            i97 = i99;
                                            i94 = i94;
                                        }
                                    }
                                    i92 = i4 + iM349941;
                                    i93 = i5;
                                    cArr4 = cArr4;
                                    str2 = str2;
                                    iM349940 = i98;
                                    str19 = str19;
                                    str18 = str7;
                                    str3 = str8;
                                    str4 = str4;
                                }
                                i96 = i8;
                            }
                            String str26 = str3;
                            i9 = i96;
                            str6 = str26;
                            str7 = str5;
                            i97 = i99;
                            i4 = i100;
                            str8 = str6;
                            i5 = i7;
                            i96 = i9;
                            i92 = i4 + iM349941;
                            i93 = i5;
                            cArr4 = cArr4;
                            str2 = str2;
                            iM349940 = i98;
                            str19 = str19;
                            str18 = str7;
                            str3 = str8;
                            str4 = str4;
                        }
                        i99 = i99;
                        i6 = i96;
                        str6 = str3;
                        i9 = i6;
                        i7 = i93;
                        str7 = str5;
                        i97 = i99;
                        i4 = i100;
                        str8 = str6;
                        i5 = i7;
                        i96 = i9;
                        i92 = i4 + iM349941;
                        i93 = i5;
                        cArr4 = cArr4;
                        str2 = str2;
                        iM349940 = i98;
                        str19 = str19;
                        str18 = str7;
                        str3 = str8;
                        str4 = str4;
                    }
                    int i102 = i97;
                    int i103 = i94;
                    int i104 = i96;
                    String str27 = str4;
                    String str28 = str18;
                    String str29 = str3;
                    int i105 = i93;
                    C24185 c241812 = c241811;
                    String str30 = str2;
                    String str31 = str19;
                    int i106 = i95;
                    char[] cArr5 = cArr4;
                    AbstractC8521 abstractC8521Mo1998 = abstractC18219.mo1998(i104, strM349917, strM349918, strM349919, objM34993);
                    if (abstractC8521Mo1998 == null) {
                        i3 = i92;
                    } else {
                        if (i103 != 0) {
                            int iM349943 = m34997(i103);
                            int iM349812 = i103 + 2;
                            while (true) {
                                int i107 = iM349943 - 1;
                                if (iM349943 <= 0) {
                                    break;
                                }
                                iM349812 = m34982(abstractC8521Mo1998.mo19349(m34999(cArr5, iM349812), true), iM349812 + 2, true, cArr5, 0);
                                iM349943 = i107;
                                i92 = i92;
                            }
                        }
                        i3 = i92;
                        if (i102 != 0) {
                            int iM349944 = m34997(i102);
                            int iM349813 = i102 + 2;
                            while (true) {
                                int i108 = iM349944 - 1;
                                if (iM349944 <= 0) {
                                    break;
                                }
                                iM349813 = m34982(abstractC8521Mo1998.mo19349(m34999(cArr5, iM349813), false), iM349813 + 2, true, cArr5, 0);
                                iM349944 = i108;
                            }
                        }
                        if (i105 != 0) {
                            int iM349945 = m34997(i105);
                            int iM349814 = i105 + 2;
                            while (true) {
                                int i109 = iM349945 - 1;
                                if (iM349945 <= 0) {
                                    break;
                                }
                                int iM349815 = m34980(c1064, iM349814);
                                iM349814 = m34982(abstractC8521Mo1998.mo19348(c1064.f3814, c1064.f3807, m34999(cArr5, iM349815), true), iM349815 + 2, true, cArr5, 0);
                                iM349945 = i109;
                            }
                        }
                        if (i106 != 0) {
                            int iM349946 = m34997(i106);
                            int iM349816 = i106 + 2;
                            while (true) {
                                int i110 = iM349946 - 1;
                                if (iM349946 <= 0) {
                                    break;
                                }
                                int iM349817 = m34980(c1064, iM349816);
                                iM349816 = m34982(abstractC8521Mo1998.mo19348(c1064.f3814, c1064.f3807, m34999(cArr5, iM349817), false), iM349817 + 2, true, cArr5, 0);
                                iM349946 = i110;
                            }
                        }
                        C24185 c241813 = c241812;
                        while (c241813 != null) {
                            C24185 c241814 = c241813.f78328;
                            c241813.f78328 = null;
                            abstractC8521Mo1998.mo19353(c241813);
                            c241813 = c241814;
                        }
                        abstractC8521Mo1998.mo19350();
                    }
                    iM349938 = i91;
                    str2 = str30;
                    i90 = i3;
                    str19 = str31;
                    str18 = str28;
                    str3 = str29;
                    str4 = str27;
                }
                int iM349947 = m34997(i90);
                int iM349818 = i90 + 2;
                while (true) {
                    int i111 = iM349947 - 1;
                    if (iM349947 <= 0) {
                        abstractC18219.mo2000();
                        return;
                    } else {
                        iM349818 = m34983(abstractC18219, c1064, iM349818);
                        iM349947 = i111;
                    }
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 45681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34983(l.AbstractC18217 r45, l.C1064 r46, int r47) {
        /*
            Method dump skipped, instruction units count: 4568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14487.m34983(l.ܿۡۛ, l.֨ۡۛ, int):int");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10562 m34984(int i, C10562[] c10562Arr) {
        if (c10562Arr[i] == null) {
            c10562Arr[i] = new C10562();
        }
        C10562 c10562 = c10562Arr[i];
        c10562.f33569 = (short) (c10562.f33569 & (-2));
        return c10562;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int[] m34989(AbstractC15037 abstractC15037, C1064 c1064, int i, boolean z) {
        int i2;
        char[] cArr = c1064.f3815;
        int iM34997 = m34997(i);
        int[] iArr = new int[iM34997];
        int iM34982 = i + 2;
        for (int i3 = 0; i3 < iM34997; i3++) {
            iArr[i3] = iM34982;
            int iM34998 = m34998(iM34982);
            int i4 = iM34998 >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int iM34999 = m34997(iM34982 + 1);
                                i2 = iM34982 + 3;
                                while (true) {
                                    int i5 = iM34999 - 1;
                                    if (iM34999 > 0) {
                                        int iM349910 = m34997(i2);
                                        int iM349911 = m34997(i2 + 2);
                                        i2 += 6;
                                        m34984(iM349910, c1064.f3817);
                                        m34984(iM349910 + iM349911, c1064.f3817);
                                        iM34999 = i5;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = iM34982 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iM34982 + 3;
                        break;
                }
            } else {
                i2 = iM34982 + 3;
            }
            int iM34992 = m34992(i2);
            if (i4 == 66) {
                C20259 c20259 = iM34992 == 0 ? null : new C20259(this.f45603, i2);
                int iM31436 = C12669.m31436(iM34992, 2, 1, i2);
                iM34982 = m34982(abstractC15037.mo10809(iM34998 & (-256), c20259, m34999(cArr, iM31436), z), iM31436 + 2, true, cArr, 0);
            } else {
                iM34982 = m34982((AbstractC3301) null, C12669.m31436(iM34992, 2, 3, i2), true, cArr, 0);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34978(int i, int[] iArr) {
        if (iArr == null || i >= iArr.length || m34992(iArr[i]) < 67) {
            return -1;
        }
        return m34997(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34980(C1064 c1064, int i) {
        int i2;
        int i3;
        int iM34998 = m34998(i);
        int i4 = iM34998 >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iM34998 & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM34998 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = iM34998 & (-65536);
                    i3 = i + 2;
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iM34998 & (-16777216);
                            int iM34997 = m34997(i + 1);
                            i3 = i + 3;
                            c1064.f3811 = new C10562[iM34997];
                            c1064.f3806 = new C10562[iM34997];
                            c1064.f3818 = new int[iM34997];
                            for (int i5 = 0; i5 < iM34997; i5++) {
                                int iM34999 = m34997(i3);
                                int iM349910 = m34997(i3 + 2);
                                int iM349911 = m34997(i3 + 4);
                                i3 += 6;
                                c1064.f3811[i5] = m34984(iM34999, c1064.f3817);
                                c1064.f3806[i5] = m34984(iM34999 + iM349910, c1064.f3817);
                                c1064.f3818[i5] = iM349911;
                            }
                            break;
                        case 66:
                            i2 = iM34998 & (-256);
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iM34998 & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iM34998 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = iM34998 & (-65536);
            i3 = i + 2;
        }
        c1064.f3814 = i2;
        int iM34992 = m34992(i3);
        c1064.f3807 = iM34992 == 0 ? null : new C20259(this.f45603, i3);
        return (iM34992 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34987(AbstractC15037 abstractC15037, C1064 c1064, int i, boolean z) {
        int iM34982 = i + 1;
        int i2 = this.f45603[i] & 255;
        abstractC15037.mo10794(i2, z);
        char[] cArr = c1064.f3815;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM34997 = m34997(iM34982);
            iM34982 += 2;
            while (true) {
                int i4 = iM34997 - 1;
                if (iM34997 > 0) {
                    iM34982 = m34982(abstractC15037.mo10783(i3, m34999(cArr, iM34982), z), iM34982 + 2, true, cArr, 0);
                    iM34997 = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34982(AbstractC3301 abstractC3301, int i, boolean z, char[] cArr, int i2) {
        if (i2 >= 256) {
            throw new C22497("Too many nested annotations");
        }
        int iM34997 = m34997(i);
        int iM34981 = i + 2;
        if (z) {
            while (true) {
                int i3 = iM34997 - 1;
                if (iM34997 <= 0) {
                    break;
                }
                iM34981 = m34981(abstractC3301, iM34981 + 2, m34999(cArr, iM34981), cArr, i2);
                iM34997 = i3;
            }
        } else {
            int iM34982 = iM34981;
            while (true) {
                int i4 = iM34997 - 1;
                if (iM34997 <= 0) {
                    break;
                }
                iM34982 = m34981(abstractC3301, iM34982, (String) null, cArr, i2);
                iM34997 = i4;
            }
            iM34981 = iM34982;
        }
        if (abstractC3301 != null) {
            abstractC3301.mo7995();
        }
        return iM34981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34981(AbstractC3301 abstractC3301, int i, String str, char[] cArr, int i2) {
        Object obj;
        byte[] bArr = this.f45603;
        if (abstractC3301 == null) {
            int i3 = bArr[i] & 255;
            if (i3 == 64) {
                return m34982((AbstractC3301) null, i + 3, true, cArr, i2 + 1);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return m34982((AbstractC3301) null, i + 1, false, cArr, i2 + 1);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                int[] iArr = this.f45602;
                if (i5 == 83) {
                    abstractC3301.mo7996(Short.valueOf((short) m34998(iArr[m34997(i4)])), str);
                    return i + 3;
                }
                if (i5 == 99) {
                    abstractC3301.mo7996(C3105.m10130(m34999(cArr, i4)), str);
                    return i + 3;
                }
                if (i5 == 101) {
                    abstractC3301.mo7997(str, m34999(cArr, i4), m34999(cArr, i + 3));
                    return i + 5;
                }
                if (i5 == 115) {
                    abstractC3301.mo7996(m34999(cArr, i4), str);
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (m34998(iArr[m34997(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        abstractC3301.mo7996(obj, str);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                abstractC3301.mo7996(Byte.valueOf((byte) m34998(iArr[m34997(i4)])), str);
                                return i + 3;
                            case 67:
                                abstractC3301.mo7996(Character.valueOf((char) m34998(iArr[m34997(i4)])), str);
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int iM34997 = m34997(i4);
                        int i6 = i + 3;
                        if (iM34997 == 0) {
                            return m34982(abstractC3301.mo7993(str), i4, false, cArr, i2 + 1);
                        }
                        int i7 = bArr[i6] & 255;
                        int i8 = 0;
                        if (i7 == 70) {
                            float[] fArr = new float[iM34997];
                            while (i8 < iM34997) {
                                fArr[i8] = Float.intBitsToFloat(m34998(iArr[m34997(i6 + 1)]));
                                i6 += 3;
                                i8++;
                            }
                            abstractC3301.mo7996(fArr, str);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[iM34997];
                            while (i8 < iM34997) {
                                sArr[i8] = (short) m34998(iArr[m34997(i6 + 1)]);
                                i6 += 3;
                                i8++;
                            }
                            abstractC3301.mo7996(sArr, str);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[iM34997];
                            for (int i9 = 0; i9 < iM34997; i9++) {
                                zArr[i9] = m34998(iArr[m34997(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            abstractC3301.mo7996(zArr, str);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr2 = new int[iM34997];
                            while (i8 < iM34997) {
                                iArr2[i8] = m34998(iArr[m34997(i6 + 1)]);
                                i6 += 3;
                                i8++;
                            }
                            abstractC3301.mo7996(iArr2, str);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr2 = new byte[iM34997];
                                    while (i8 < iM34997) {
                                        bArr2[i8] = (byte) m34998(iArr[m34997(i6 + 1)]);
                                        i6 += 3;
                                        i8++;
                                    }
                                    abstractC3301.mo7996(bArr2, str);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[iM34997];
                                    while (i8 < iM34997) {
                                        cArr2[i8] = (char) m34998(iArr[m34997(i6 + 1)]);
                                        i6 += 3;
                                        i8++;
                                    }
                                    abstractC3301.mo7996(cArr2, str);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[iM34997];
                                    while (i8 < iM34997) {
                                        dArr[i8] = Double.longBitsToDouble(m34995(iArr[m34997(i6 + 1)]));
                                        i6 += 3;
                                        i8++;
                                    }
                                    abstractC3301.mo7996(dArr, str);
                                    return i6;
                                default:
                                    return m34982(abstractC3301.mo7993(str), i4, false, cArr, i2 + 1);
                            }
                        }
                        long[] jArr = new long[iM34997];
                        while (i8 < iM34997) {
                            jArr[i8] = m34995(iArr[m34997(i6 + 1)]);
                            i6 += 3;
                            i8++;
                        }
                        abstractC3301.mo7996(jArr, str);
                        return i6;
                    }
                }
            }
            abstractC3301.mo7996(m34993(cArr, m34997(i4)), str);
            return i + 3;
        }
        return m34982(abstractC3301.mo7994(str, m34999(cArr, i4)), i + 3, true, cArr, i2 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34979(int i, Object[] objArr, int i2, char[] cArr, C10562[] c10562Arr) {
        int i3 = i + 1;
        switch (this.f45603[i] & 255) {
            case 0:
                objArr[i2] = 0;
                return i3;
            case 1:
                objArr[i2] = 1;
                return i3;
            case 2:
                objArr[i2] = 2;
                return i3;
            case 3:
                objArr[i2] = 3;
                return i3;
            case 4:
                objArr[i2] = 4;
                return i3;
            case 5:
                objArr[i2] = 5;
                return i3;
            case 6:
                objArr[i2] = 6;
                return i3;
            case 7:
                objArr[i2] = m34990(cArr, i3);
                break;
            case 8:
                objArr[i2] = m34984(m34997(i3), c10562Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34991() {
        int i = this.f45601;
        int iM34997 = (m34997(i + 6) * 2) + i + 8;
        int iM34998 = m34997(iM34997);
        int iM34999 = iM34997 + 2;
        while (true) {
            int i2 = iM34998 - 1;
            if (iM34998 <= 0) {
                break;
            }
            int iM349910 = m34997(iM34999 + 6);
            iM34999 += 8;
            while (true) {
                int i3 = iM349910 - 1;
                if (iM349910 > 0) {
                    iM34999 += m34998(iM34999 + 2) + 6;
                    iM349910 = i3;
                }
            }
            iM34998 = i2;
        }
        int iM349911 = m34997(iM34999);
        int iM349912 = iM34999 + 2;
        while (true) {
            int i4 = iM349911 - 1;
            if (iM349911 <= 0) {
                return iM349912 + 2;
            }
            int iM349913 = m34997(iM349912 + 6);
            iM349912 += 8;
            while (true) {
                int i5 = iM349913 - 1;
                if (iM349913 > 0) {
                    iM349912 += m34998(iM349912 + 2) + 6;
                    iM349913 = i5;
                }
            }
            iM349911 = i4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C24185 m34986(C24185[] c24185Arr, String str, int i, int i2, char[] cArr, int i3, C10562[] c10562Arr) {
        if (i2 > this.f45603.length - i) {
            throw new IllegalArgumentException();
        }
        for (C24185 c24185 : c24185Arr) {
            if (c24185.f78327.equals(str)) {
                return c24185.m54162(this, i, i2, cArr);
            }
        }
        return new C24185(str).m54162(this, i, i2, (char[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34992(int i) {
        return this.f45603[i] & 255;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m34997(int i) {
        byte[] bArr = this.f45603;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short m35000(int i) {
        byte[] bArr = this.f45603;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34998(int i) {
        byte[] bArr = this.f45603;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m34995(int i) {
        return (((long) m34998(i)) << 32) | (((long) m34998(i + 4)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m34999(char[] cArr, int i) {
        int iM34997 = m34997(i);
        if (i == 0 || iM34997 == 0) {
            return null;
        }
        return m34996(cArr, iM34997);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m34996(char[] cArr, int i) {
        String[] strArr = this.f45604;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f45602[i];
        String strM34988 = m34988(cArr, i2 + 2, m34997(i2));
        strArr[i] = strM34988;
        return strM34988;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m34988(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f45603;
            byte b = bArr[i];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                cArr[i5] = (char) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                i5++;
                i = i6;
            } else {
                if ((b & bo.k) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & bo.j) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m34990(char[] cArr, int i) {
        return m34999(cArr, this.f45602[m34997(i)]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18963 m34985(char[] cArr, int i, int i2) {
        Object objM34993;
        if (i2 == 0) {
            throw new C22497("Too many nested ConstantDynamic");
        }
        C18963[] c18963Arr = this.f45599;
        C18963 c18963 = c18963Arr[i];
        if (c18963 != null) {
            return c18963;
        }
        int[] iArr = this.f45602;
        int i3 = iArr[i];
        int i4 = iArr[m34997(i3 + 2)];
        String strM34999 = m34999(cArr, i4);
        String strM349910 = m34999(cArr, i4 + 2);
        int i5 = this.f45598[m34997(i3)];
        int iM34997 = m34997(i5);
        int i6 = iArr[iM34997] - 1;
        byte[] bArr = this.f45603;
        if (bArr[i6] == 17) {
            throw new ClassCastException("ConstantDynamic cannot be cast to Handle");
        }
        C4597 c4597 = (C4597) m34993(cArr, iM34997);
        int iM34998 = m34997(i5 + 2);
        Object[] objArr = new Object[iM34998];
        int i7 = i5 + 4;
        for (int i8 = 0; i8 < iM34998; i8++) {
            int iM34999 = m34997(i7);
            if (bArr[iArr[iM34999] - 1] == 17) {
                objM34993 = m34985(cArr, iM34999, i2 - 1);
            } else {
                objM34993 = m34993(cArr, iM34999);
            }
            objArr[i8] = objM34993;
            i7 += 2;
        }
        C18963 c18964 = new C18963(strM34999, strM349910, c4597, objArr);
        c18963Arr[i] = c18964;
        return c18964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m34993(char[] cArr, int i) {
        int[] iArr = this.f45602;
        int i2 = iArr[i];
        byte[] bArr = this.f45603;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m34998(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m34998(i2)));
            case 5:
                return Long.valueOf(m34995(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m34995(i2)));
            case 7:
                return C3105.m10134(m34999(cArr, i2));
            case 8:
                return m34999(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int iM34992 = m34992(i2);
                        int i3 = iArr[m34997(i2 + 1)];
                        int i4 = iArr[m34997(i3 + 2)];
                        return new C4597(iM34992, m34990(cArr, i3), m34999(cArr, i4), m34999(cArr, i4 + 2), bArr[i3 + (-1)] == 11);
                    case 16:
                        return C3105.m10136(m34999(cArr, i2));
                    case 17:
                        C18963 c18963M34985 = m34985(cArr, i, 127);
                        if (c18963M34985.m44052(4096) > 0) {
                            return c18963M34985;
                        }
                        throw new C22497("Too many nested ConstantDynamic");
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
