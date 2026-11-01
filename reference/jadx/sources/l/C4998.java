package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۚ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f17397;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] f17398;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f17399;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f17400;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3586[] f17401;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f17402;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f17403;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C4998(byte[] bArr, boolean z) {
        int i;
        this.f17402 = bArr;
        if (z && m13864(6) > 70) {
            throw new IllegalArgumentException(C8479.m22141(m13864(6), "Unsupported class file major version "));
        }
        int iM13869 = m13869(8);
        this.f17400 = new int[iM13869];
        this.f17398 = new String[iM13869];
        int i2 = 10;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int iM138610 = 4;
            if (i3 >= iM13869) {
                this.f17397 = i4;
                this.f17403 = i2;
                int[] iArr = null;
                this.f17401 = z2 ? new C3586[iM13869] : null;
                if (z3) {
                    char[] cArr = new char[i4];
                    int iM13865 = m13865();
                    for (int iM138611 = m13869(iM13865 - 2); iM138611 > 0; iM138611--) {
                        String strM13873 = m13873(cArr, iM13865);
                        int iM13872 = m13872(iM13865 + 2);
                        int i5 = iM13865 + 6;
                        if ("BootstrapMethods".equals(strM13873)) {
                            int iM138612 = m13869(i5);
                            int[] iArr2 = new int[iM138612];
                            int iM138613 = iM13865 + 8;
                            for (int i6 = 0; i6 < iM138612; i6++) {
                                iArr2[i6] = iM138613;
                                iM138613 += (m13869(iM138613 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            iM13865 = i5 + iM13872;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f17399 = iArr;
                return;
            }
            int i7 = i3 + 1;
            int i8 = i2 + 1;
            this.f17400[i3] = i8;
            switch (bArr[i2]) {
                case 1:
                    iM138610 = m13869(i8) + 3;
                    if (iM138610 > i4) {
                        i4 = iM138610;
                    }
                    i = iM138610;
                    i2 += i;
                    i3 = i7;
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
                    i3 = i7;
                    break;
                case 5:
                case 6:
                    i7 = i3 + 2;
                    i = 9;
                    i2 += i;
                    i3 = i7;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i = 3;
                    i2 += i;
                    i3 = i7;
                    break;
                case 15:
                    i = iM138610;
                    i2 += i;
                    i3 = i7;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i7;
                    break;
                case 18:
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i7;
                    break;
            }
        }
    }

    public C4998(InputStream inputStream) throws IOException {
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
    public final void m13868(AbstractC0764 abstractC0764, C11349[] c11349Arr, int i) {
        AbstractC0764 abstractC0765;
        int i2;
        String str;
        C22638 c22638;
        String str2;
        String str3;
        String str4;
        String str5;
        C4998 c4998;
        String str6;
        String str7;
        String str8;
        int i3;
        String str9;
        String str10;
        String str11;
        String[] strArr;
        String[] strArr2;
        int i4;
        int i5;
        C22638 c22639 = new C22638();
        c22639.f73759 = c11349Arr;
        c22639.f73764 = i;
        char[] cArr = new char[this.f17397];
        c22639.f73767 = cArr;
        int i6 = this.f17403;
        int iM13869 = m13869(i6);
        String strM13852 = m13852(cArr, i6 + 2);
        String strM13853 = m13852(cArr, i6 + 4);
        int iM138610 = m13869(i6 + 6);
        String[] strArr3 = new String[iM138610];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < iM138610; i8++) {
            strArr3[i8] = m13852(cArr, i7);
            i7 += 2;
        }
        int iM13865 = m13865();
        String strM13873 = null;
        int iM138611 = m13869(iM13865 - 2);
        String strM13854 = null;
        String strM13855 = null;
        C11349 c11349 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = iM13869;
        int i20 = 0;
        String strM13874 = null;
        String strM13859 = null;
        while (true) {
            C22638 c226310 = c22639;
            int i21 = i7;
            String str12 = strM13853;
            if (iM138611 > 0) {
                String str13 = strM13854;
                String strM13875 = m13873(cArr, iM13865);
                int i22 = i20;
                int iM13872 = m13872(iM13865 + 2);
                int i23 = iM13865 + 6;
                String str14 = strM13859;
                if ("SourceFile".equals(strM13875)) {
                    strM13874 = m13873(cArr, i23);
                } else if ("InnerClasses".equals(strM13875)) {
                    i16 = i23;
                } else if ("EnclosingMethod".equals(strM13875)) {
                    i9 = i23;
                } else if ("NestHost".equals(strM13875)) {
                    strM13855 = m13852(cArr, i23);
                } else if ("NestMembers".equals(strM13875)) {
                    i14 = i23;
                } else if ("PermittedSubclasses".equals(strM13875)) {
                    i15 = i23;
                } else if ("Signature".equals(strM13875)) {
                    strM13873 = m13873(cArr, i23);
                } else if ("RuntimeVisibleAnnotations".equals(strM13875)) {
                    i10 = i23;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM13875)) {
                    i12 = i23;
                } else if ("Deprecated".equals(strM13875)) {
                    i19 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                } else if ("Synthetic".equals(strM13875)) {
                    i19 |= 4096;
                } else {
                    if ("SourceDebugExtension".equals(strM13875)) {
                        if (iM13872 > this.f17402.length - i23) {
                            throw new IllegalArgumentException();
                        }
                        strM13859 = m13859(new char[iM13872], i23, iM13872);
                        strM13854 = str13;
                        i4 = i23;
                        i5 = iM13872;
                        i21 = i21;
                        i20 = i22;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM13875)) {
                        i11 = i23;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM13875)) {
                        i13 = i23;
                    } else if ("Record".equals(strM13875)) {
                        i19 |= 65536;
                        i17 = i23;
                    } else if ("Module".equals(strM13875)) {
                        i18 = i23;
                    } else if ("ModuleMainClass".equals(strM13875)) {
                        strM13854 = m13852(cArr, i23);
                        strM13859 = str14;
                        i4 = i23;
                        i5 = iM13872;
                        i21 = i21;
                        i20 = i22;
                    } else if ("ModulePackages".equals(strM13875)) {
                        i22 = i23;
                    } else {
                        if ("BootstrapMethods".equals(strM13875)) {
                            i4 = i23;
                            i5 = iM13872;
                        } else {
                            i4 = i23;
                            i5 = iM13872;
                            C11349 c11349M13861 = m13861(c11349Arr, strM13875, i4, i5, cArr, -1, null);
                            c11349M13861.f38290 = c11349;
                            c11349 = c11349M13861;
                        }
                        strM13854 = str13;
                        strM13859 = str14;
                        i19 = i19;
                        i20 = i22;
                        strM13874 = strM13874;
                    }
                    iM13865 = i4 + i5;
                    iM138611--;
                    i7 = i21;
                    c22639 = c226310;
                    strM13853 = str12;
                }
                strM13854 = str13;
                strM13859 = str14;
                i4 = i23;
                i5 = iM13872;
                i21 = i21;
                i20 = i22;
                iM13865 = i4 + i5;
                iM138611--;
                i7 = i21;
                c22639 = c226310;
                strM13853 = str12;
            } else {
                String str15 = strM13874;
                int i24 = i20;
                int[] iArr = this.f17400;
                String str16 = "Synthetic";
                String str17 = strM13854;
                String str18 = "RuntimeInvisibleAnnotations";
                String str19 = strM13859;
                String str20 = strM13873;
                String str21 = "Deprecated";
                abstractC0764.mo3285(m13872(iArr[1] - 7), i19, strM13852, str20, str12, strArr3);
                String str22 = "RuntimeVisibleTypeAnnotations";
                if ((i & 2) != 0 || (str15 == null && str19 == null)) {
                    abstractC0765 = abstractC0764;
                } else {
                    abstractC0765 = abstractC0764;
                    abstractC0765.mo3288(str15, str19);
                }
                int i25 = i18;
                if (i25 != 0) {
                    c22638 = c226310;
                    char[] cArr2 = c22638.f73767;
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    int i26 = i25 + 6;
                    AbstractC19816 abstractC19816Mo3282 = abstractC0765.mo3282(m13869(i25 + 2), m13852(cArr2, i25), m13873(cArr2, i25 + 4));
                    if (abstractC19816Mo3282 != null) {
                        if (str17 != null) {
                            abstractC19816Mo3282.mo960(str17);
                        }
                        if (i24 != 0) {
                            int iM138612 = m13869(i24);
                            int i27 = i24 + 2;
                            while (true) {
                                int i28 = iM138612 - 1;
                                if (iM138612 <= 0) {
                                    break;
                                }
                                abstractC19816Mo3282.mo967(m13852(cArr2, i27));
                                i27 += 2;
                                iM138612 = i28;
                            }
                        }
                        int iM138613 = m13869(i26);
                        int i29 = i25 + 8;
                        while (true) {
                            int i30 = iM138613 - 1;
                            if (iM138613 <= 0) {
                                break;
                            }
                            String strM13856 = m13852(cArr2, i29);
                            int iM138614 = m13869(i29 + 2);
                            String strM13876 = m13873(cArr2, i29 + 4);
                            i29 += 6;
                            abstractC19816Mo3282.mo959(iM138614, strM13856, strM13876);
                            iM138613 = i30;
                        }
                        int iM138615 = m13869(i29);
                        int i31 = i29 + 2;
                        while (true) {
                            int i32 = iM138615 - 1;
                            if (iM138615 <= 0) {
                                break;
                            }
                            String strM13857 = m13852(cArr2, i31);
                            int iM138616 = m13869(i31 + 2);
                            int iM138617 = m13869(i31 + 4);
                            i31 += 6;
                            if (iM138617 != 0) {
                                strArr2 = new String[iM138617];
                                for (int i33 = 0; i33 < iM138617; i33++) {
                                    strArr2[i33] = m13852(cArr2, i31);
                                    i31 += 2;
                                }
                            } else {
                                strArr2 = null;
                            }
                            abstractC19816Mo3282.mo961(strM13857, iM138616, strArr2);
                            iM138615 = i32;
                        }
                        int iM138618 = m13869(i31);
                        int i34 = i31 + 2;
                        while (true) {
                            int i35 = iM138618 - 1;
                            if (iM138618 <= 0) {
                                break;
                            }
                            String strM13858 = m13852(cArr2, i34);
                            int iM138619 = m13869(i34 + 2);
                            int iM138620 = m13869(i34 + 4);
                            i34 += 6;
                            if (iM138620 != 0) {
                                strArr = new String[iM138620];
                                for (int i36 = 0; i36 < iM138620; i36++) {
                                    strArr[i36] = m13852(cArr2, i34);
                                    i34 += 2;
                                }
                            } else {
                                strArr = null;
                            }
                            abstractC19816Mo3282.mo968(strM13858, iM138619, strArr);
                            iM138618 = i35;
                        }
                        int iM138621 = m13869(i34);
                        int i37 = i34 + 2;
                        while (true) {
                            int i38 = iM138621 - 1;
                            if (iM138621 <= 0) {
                                break;
                            }
                            abstractC19816Mo3282.mo965(m13852(cArr2, i37));
                            i37 += 2;
                            iM138621 = i38;
                        }
                        int iM138622 = m13869(i37);
                        int i39 = i37 + 2;
                        while (true) {
                            int i40 = iM138622 - 1;
                            if (iM138622 <= 0) {
                                break;
                            }
                            String strM138510 = m13852(cArr2, i39);
                            int iM138623 = m13869(i39 + 2);
                            i39 += 4;
                            String[] strArr4 = new String[iM138623];
                            for (int i41 = 0; i41 < iM138623; i41++) {
                                strArr4[i41] = m13852(cArr2, i39);
                                i39 += 2;
                            }
                            abstractC19816Mo3282.mo962(strM138510, strArr4);
                            iM138622 = i40;
                        }
                        abstractC19816Mo3282.mo958();
                    }
                } else {
                    i2 = i21;
                    str = "RuntimeInvisibleTypeAnnotations";
                    c22638 = c226310;
                }
                String str23 = strM13855;
                if (str23 != null) {
                    abstractC0765.mo3286(str23);
                }
                int i42 = i9;
                if (i42 != 0) {
                    String strM138511 = m13852(cArr, i42);
                    int iM138624 = m13869(i42 + 2);
                    abstractC0765.mo3289(strM138511, iM138624 == 0 ? null : m13873(cArr, iArr[iM138624]), iM138624 == 0 ? null : m13873(cArr, iArr[iM138624] + 2));
                }
                int i43 = i10;
                if (i43 != 0) {
                    int iM138625 = m13869(i43);
                    int iM13857 = i43 + 2;
                    while (true) {
                        int i44 = iM138625 - 1;
                        if (iM138625 <= 0) {
                            break;
                        }
                        iM13857 = m13857(abstractC0765.mo3280(m13873(cArr, iM13857), true), iM13857 + 2, true, cArr);
                        iM138625 = i44;
                    }
                }
                int i45 = i11;
                if (i45 != 0) {
                    int iM138626 = m13869(i45);
                    int iM13858 = i45 + 2;
                    while (true) {
                        int i46 = iM138626 - 1;
                        if (iM138626 <= 0) {
                            break;
                        }
                        iM13858 = m13857(abstractC0765.mo3280(m13873(cArr, iM13858), false), iM13858 + 2, true, cArr);
                        iM138626 = i46;
                    }
                }
                int i47 = i12;
                if (i47 != 0) {
                    int iM138627 = m13869(i47);
                    int iM13859 = i47 + 2;
                    while (true) {
                        int i48 = iM138627 - 1;
                        if (iM138627 <= 0) {
                            break;
                        }
                        int iM138510 = m13858(c22638, iM13859);
                        iM13859 = m13857(abstractC0765.mo3279(c22638.f73771, c22638.f73763, m13873(cArr, iM138510), true), iM138510 + 2, true, cArr);
                        iM138627 = i48;
                    }
                }
                int i49 = i13;
                if (i49 != 0) {
                    int iM138628 = m13869(i49);
                    int iM138511 = i49 + 2;
                    while (true) {
                        int i50 = iM138628 - 1;
                        if (iM138628 <= 0) {
                            break;
                        }
                        int iM138512 = m13858(c22638, iM138511);
                        iM138511 = m13857(abstractC0765.mo3279(c22638.f73771, c22638.f73763, m13873(cArr, iM138512), false), iM138512 + 2, true, cArr);
                        iM138628 = i50;
                    }
                }
                C11349 c113410 = c11349;
                while (c113410 != null) {
                    C11349 c113411 = c113410.f38290;
                    c113410.f38290 = null;
                    abstractC0765.mo3290(c113410);
                    c113410 = c113411;
                }
                int i51 = i14;
                if (i51 != 0) {
                    int iM138629 = m13869(i51);
                    int i52 = i51 + 2;
                    while (true) {
                        int i53 = iM138629 - 1;
                        if (iM138629 <= 0) {
                            break;
                        }
                        abstractC0765.mo3293(m13852(cArr, i52));
                        i52 += 2;
                        iM138629 = i53;
                    }
                }
                int i54 = i15;
                if (i54 != 0) {
                    int iM138630 = m13869(i54);
                    int i55 = i54 + 2;
                    while (true) {
                        int i56 = iM138630 - 1;
                        if (iM138630 <= 0) {
                            break;
                        }
                        abstractC0765.mo3291(m13852(cArr, i55));
                        i55 += 2;
                        iM138630 = i56;
                    }
                }
                int i57 = i16;
                if (i57 != 0) {
                    int iM138631 = m13869(i57);
                    int i58 = i57 + 2;
                    while (true) {
                        int i59 = iM138631 - 1;
                        if (iM138631 <= 0) {
                            break;
                        }
                        abstractC0765.mo3287(m13852(cArr, i58), m13869(i58 + 6), m13852(cArr, i58 + 2), m13873(cArr, i58 + 4));
                        i58 += 8;
                        iM138631 = i59;
                    }
                }
                int i60 = i17;
                if (i60 != 0) {
                    int iM138632 = m13869(i60);
                    C4998 c4999 = this;
                    int i61 = i60 + 2;
                    while (true) {
                        int i62 = iM138632 - 1;
                        if (iM138632 <= 0) {
                            break;
                        }
                        char[] cArr3 = c22638.f73767;
                        String strM13877 = c4999.m13873(cArr3, i61);
                        String strM13878 = c4999.m13873(cArr3, i61 + 2);
                        int iM138633 = c4999.m13869(i61 + 4);
                        i61 += 6;
                        String strM13879 = null;
                        C11349 c113412 = null;
                        int i63 = 0;
                        int i64 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        while (true) {
                            int i67 = iM138633 - 1;
                            if (iM138633 <= 0) {
                                break;
                            }
                            String strM138710 = c4999.m13873(cArr3, i61);
                            int i68 = i63;
                            int iM13873 = c4999.m13872(i61 + 2);
                            i63 = i61 + 6;
                            if ("Signature".equals(strM138710)) {
                                strM13879 = c4999.m13873(cArr3, i63);
                            } else if ("RuntimeVisibleAnnotations".equals(strM138710)) {
                                i64 = i63;
                            } else {
                                if (str22.equals(strM138710)) {
                                    i65 = i63;
                                } else if (str18.equals(strM138710)) {
                                    str10 = str;
                                    str11 = str22;
                                } else {
                                    str9 = str;
                                    if (str9.equals(strM138710)) {
                                        i66 = i63;
                                        str10 = str9;
                                        str11 = str22;
                                        i63 = i68;
                                    } else {
                                        str10 = str9;
                                        str11 = str22;
                                        C11349 c11349M13862 = m13861(c22638.f73759, strM138710, i63, iM13873, cArr3, -1, null);
                                        c11349M13862.f38290 = c113412;
                                        c4999 = this;
                                        c113412 = c11349M13862;
                                        i64 = i64;
                                        i63 = i68;
                                    }
                                }
                                i61 = i63 + iM13873;
                                abstractC0765 = abstractC0764;
                                str16 = str16;
                                str22 = str11;
                                iM138633 = i67;
                                str = str10;
                                str18 = str18;
                                i62 = i62;
                            }
                            str9 = str;
                            str10 = str9;
                            str11 = str22;
                            i63 = i68;
                            i61 = i63 + iM13873;
                            abstractC0765 = abstractC0764;
                            str16 = str16;
                            str22 = str11;
                            iM138633 = i67;
                            str = str10;
                            str18 = str18;
                            i62 = i62;
                        }
                        int i69 = i63;
                        String str24 = str18;
                        int i70 = i64;
                        int i71 = i62;
                        String str25 = str;
                        String str26 = str16;
                        C11349 c113413 = c113412;
                        String str27 = str22;
                        AbstractC0764 abstractC0766 = abstractC0765;
                        AbstractC16288 abstractC16288Mo3292 = abstractC0766.mo3292(strM13877, strM13878, strM13879);
                        if (abstractC16288Mo3292 != null) {
                            if (i70 != 0) {
                                int iM138634 = c4999.m13869(i70);
                                int iM138513 = i70 + 2;
                                while (true) {
                                    int i72 = iM138634 - 1;
                                    if (iM138634 <= 0) {
                                        break;
                                    }
                                    iM138513 = c4999.m13857(abstractC16288Mo3292.mo15143(c4999.m13873(cArr3, iM138513), true), iM138513 + 2, true, cArr3);
                                    iM138634 = i72;
                                }
                            }
                            if (i69 != 0) {
                                int iM138635 = c4999.m13869(i69);
                                int iM138514 = i69 + 2;
                                while (true) {
                                    int i73 = iM138635 - 1;
                                    if (iM138635 <= 0) {
                                        break;
                                    }
                                    iM138514 = c4999.m13857(abstractC16288Mo3292.mo15143(c4999.m13873(cArr3, iM138514), false), iM138514 + 2, true, cArr3);
                                    iM138635 = i73;
                                }
                            }
                            int i74 = i65;
                            if (i74 != 0) {
                                int iM138636 = c4999.m13869(i74);
                                int iM138515 = i74 + 2;
                                while (true) {
                                    int i75 = iM138636 - 1;
                                    if (iM138636 <= 0) {
                                        break;
                                    }
                                    int iM138516 = c4999.m13858(c22638, iM138515);
                                    iM138515 = c4999.m13857(abstractC16288Mo3292.mo15142(c22638.f73771, c22638.f73763, c4999.m13873(cArr3, iM138516), true), iM138516 + 2, true, cArr3);
                                    iM138636 = i75;
                                }
                            }
                            int i76 = i66;
                            if (i76 != 0) {
                                int iM138637 = c4999.m13869(i76);
                                int iM138517 = i76 + 2;
                                while (true) {
                                    int i77 = iM138637 - 1;
                                    if (iM138637 <= 0) {
                                        break;
                                    }
                                    int iM138518 = c4999.m13858(c22638, iM138517);
                                    iM138517 = c4999.m13857(abstractC16288Mo3292.mo15142(c22638.f73771, c22638.f73763, c4999.m13873(cArr3, iM138518), false), iM138518 + 2, true, cArr3);
                                    iM138637 = i77;
                                }
                            }
                            while (c113413 != null) {
                                C11349 c113414 = c113413.f38290;
                                c113413.f38290 = null;
                                abstractC16288Mo3292.mo29957(c113413);
                                c113413 = c113414;
                            }
                            abstractC16288Mo3292.mo29955();
                        }
                        iM138632 = i71;
                        abstractC0765 = abstractC0766;
                        str16 = str26;
                        str22 = str27;
                        str = str25;
                        str18 = str24;
                    }
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c4998 = c4999;
                } else {
                    str2 = str18;
                    str3 = str;
                    str4 = str16;
                    str5 = str22;
                    c4998 = this;
                }
                int i78 = i2;
                int iM138638 = c4998.m13869(i78);
                int i79 = i78 + 2;
                while (true) {
                    int i80 = iM138638 - 1;
                    if (iM138638 <= 0) {
                        break;
                    }
                    char[] cArr4 = c22638.f73767;
                    int iM138639 = c4998.m13869(i79);
                    String strM138711 = c4998.m13873(cArr4, i79 + 2);
                    String strM138712 = c4998.m13873(cArr4, i79 + 4);
                    int iM138640 = c4998.m13869(i79 + 6);
                    int i81 = i79 + 8;
                    C11349 c113415 = null;
                    String strM138713 = null;
                    Object objM13867 = null;
                    int i82 = 0;
                    int i83 = 0;
                    int i84 = 0;
                    int i85 = 0;
                    while (true) {
                        int i86 = iM138640 - 1;
                        if (iM138640 <= 0) {
                            break;
                        }
                        String strM138714 = c4998.m13873(cArr4, i81);
                        int i87 = i83;
                        int iM13874 = c4998.m13872(i81 + 2);
                        int i88 = i81 + 6;
                        int i89 = i85;
                        if ("ConstantValue".equals(strM138714)) {
                            int iM138641 = c4998.m13869(i88);
                            objM13867 = iM138641 == 0 ? null : c4998.m13867(cArr4, iM138641);
                            str6 = str21;
                        } else {
                            if ("Signature".equals(strM138714)) {
                                strM138713 = c4998.m13873(cArr4, i88);
                                i3 = i82;
                                str7 = str5;
                            } else {
                                str6 = str21;
                                if (str6.equals(strM138714)) {
                                    iM138639 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                } else {
                                    if (str4.equals(strM138714)) {
                                        iM138639 |= 4096;
                                    } else if ("RuntimeVisibleAnnotations".equals(strM138714)) {
                                        i3 = i82;
                                        str21 = str6;
                                        i84 = i88;
                                        i85 = i89;
                                    } else {
                                        str21 = str6;
                                        str7 = str5;
                                        if (str7.equals(strM138714)) {
                                            i3 = i88;
                                        } else {
                                            str5 = str7;
                                            String str28 = str2;
                                            if (str28.equals(strM138714)) {
                                                str2 = str28;
                                                i89 = i88;
                                                str8 = str3;
                                                i3 = i82;
                                                str3 = str8;
                                                i85 = i89;
                                            } else {
                                                str2 = str28;
                                                str8 = str3;
                                                if (str8.equals(strM138714)) {
                                                    i87 = i88;
                                                    i3 = i82;
                                                    str3 = str8;
                                                    i85 = i89;
                                                } else {
                                                    str3 = str8;
                                                    C11349 c11349M13863 = c4998.m13861(c22638.f73759, strM138714, i88, iM13874, cArr4, -1, null);
                                                    c11349M13863.f38290 = c113415;
                                                    c113415 = c11349M13863;
                                                    i85 = i89;
                                                    i3 = i82;
                                                }
                                            }
                                        }
                                    }
                                    i81 = i88 + iM13874;
                                    i82 = i3;
                                    iM138640 = i86;
                                    i83 = i87;
                                }
                            }
                            str5 = str7;
                            str8 = str3;
                            str3 = str8;
                            i85 = i89;
                            i81 = i88 + iM13874;
                            i82 = i3;
                            iM138640 = i86;
                            i83 = i87;
                        }
                        str21 = str6;
                        str8 = str3;
                        i3 = i82;
                        str3 = str8;
                        i85 = i89;
                        i81 = i88 + iM13874;
                        i82 = i3;
                        iM138640 = i86;
                        i83 = i87;
                    }
                    int i90 = i85;
                    int i91 = i83;
                    AbstractC17698 abstractC17698Mo3281 = abstractC0764.mo3281(iM138639, strM138711, strM138712, strM138713, objM13867);
                    if (abstractC17698Mo3281 != null) {
                        if (i84 != 0) {
                            int iM138642 = c4998.m13869(i84);
                            int iM138519 = i84 + 2;
                            while (true) {
                                int i92 = iM138642 - 1;
                                if (iM138642 <= 0) {
                                    break;
                                }
                                iM138519 = c4998.m13857(abstractC17698Mo3281.mo13234(c4998.m13873(cArr4, iM138519), true), iM138519 + 2, true, cArr4);
                                iM138642 = i92;
                            }
                        }
                        if (i90 != 0) {
                            int iM138643 = c4998.m13869(i90);
                            int iM138520 = i90 + 2;
                            while (true) {
                                int i93 = iM138643 - 1;
                                if (iM138643 <= 0) {
                                    break;
                                }
                                iM138520 = c4998.m13857(abstractC17698Mo3281.mo13234(c4998.m13873(cArr4, iM138520), false), iM138520 + 2, true, cArr4);
                                iM138643 = i93;
                            }
                        }
                        if (i82 != 0) {
                            int i94 = i82;
                            int iM138644 = c4998.m13869(i94);
                            int iM138521 = i94 + 2;
                            while (true) {
                                int i95 = iM138644 - 1;
                                if (iM138644 <= 0) {
                                    break;
                                }
                                int iM138522 = c4998.m13858(c22638, iM138521);
                                iM138521 = c4998.m13857(abstractC17698Mo3281.mo13233(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM138522), true), iM138522 + 2, true, cArr4);
                                iM138644 = i95;
                            }
                        }
                        if (i91 != 0) {
                            int iM138645 = c4998.m13869(i91);
                            int iM138523 = i91 + 2;
                            while (true) {
                                int i96 = iM138645 - 1;
                                if (iM138645 <= 0) {
                                    break;
                                }
                                int iM138524 = c4998.m13858(c22638, iM138523);
                                iM138523 = c4998.m13857(abstractC17698Mo3281.mo13233(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM138524), false), iM138524 + 2, true, cArr4);
                                iM138645 = i96;
                            }
                        }
                        while (c113415 != null) {
                            C11349 c113416 = c113415.f38290;
                            c113415.f38290 = null;
                            abstractC17698Mo3281.mo41227(c113415);
                            c113415 = c113416;
                        }
                        abstractC17698Mo3281.mo41226();
                    }
                    iM138638 = i80;
                    i79 = i81;
                }
                int iM138646 = c4998.m13869(i79);
                int iM13855 = i79 + 2;
                while (true) {
                    int i97 = iM138646 - 1;
                    if (iM138646 <= 0) {
                        abstractC0764.mo3284();
                        return;
                    } else {
                        iM13855 = c4998.m13855(abstractC0764, c22638, iM13855);
                        iM138646 = i97;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:446:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:456:0x0cc0  */
    /* JADX WARN: Code duplicated, block: B:460:0x0cc7  */
    /* JADX WARN: Code duplicated, block: B:461:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:595:0x0cb4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:248:0x062c. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13855(AbstractC0764 abstractC0764, C22638 c22638, int i) {
        int i2;
        String str;
        int i3;
        AbstractC20521 abstractC20521;
        int i4;
        int[] iArr;
        String strM13873;
        boolean z;
        int i5;
        C4998 c4998;
        int i6;
        C4998 c4999;
        int i7;
        C11349 c11349;
        int i8;
        boolean z2;
        int i9;
        int iM13853;
        int i10;
        int i11;
        int i12;
        C4998 c49910;
        int iM13854;
        C9938[] c9938Arr;
        int iM13869;
        int i13;
        int i14;
        int[] iArrM13863;
        String str2;
        int i15;
        C9938[] c9938Arr2;
        String str3;
        int i16;
        int i17;
        int i18;
        int i19;
        char[] cArr = c22638.f73767;
        c22638.f73772 = m13869(i);
        c22638.f73762 = m13873(cArr, i + 2);
        int i20 = i + 4;
        c22638.f73769 = m13873(cArr, i20);
        int iM138610 = m13869(i + 6);
        boolean z3 = false;
        int i21 = 0;
        C11349 c11349M13861 = null;
        String[] strArr = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM138611 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = i + 8;
        int i31 = 0;
        while (true) {
            int i32 = iM138610 - 1;
            i2 = iM138611;
            str = "RuntimeInvisibleTypeAnnotations";
            i3 = i28;
            if (iM138610 <= 0) {
                break;
            }
            String strM13874 = m13873(cArr, i30);
            int i33 = i31;
            int iM13872 = m13872(i30 + 2);
            int i34 = i30 + 6;
            int i35 = i22;
            if ("Code".equals(strM13874)) {
                if ((c22638.f73764 & 1) == 0) {
                    iM138611 = i2;
                    i29 = i34;
                } else {
                    iM138611 = i2;
                }
                i22 = i35;
                i28 = i3;
                int i36 = i33;
                i19 = i34;
                i31 = i36;
                i23 = i23;
            } else {
                if ("Exceptions".equals(strM13874)) {
                    int iM138612 = m13869(i34);
                    String[] strArr2 = new String[iM138612];
                    int i37 = i30 + 8;
                    for (int i38 = 0; i38 < iM138612; i38++) {
                        strArr2[i38] = m13852(cArr, i37);
                        i37 += 2;
                    }
                    iM138611 = i2;
                    i21 = i34;
                    strArr = strArr2;
                } else if ("Signature".equals(strM13874)) {
                    iM138611 = m13869(i34);
                } else if ("Deprecated".equals(strM13874)) {
                    c22638.f73772 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    iM138611 = i2;
                } else if ("RuntimeVisibleAnnotations".equals(strM13874)) {
                    iM138611 = i2;
                    i27 = i34;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strM13874)) {
                    iM138611 = i2;
                    i25 = i34;
                } else {
                    if ("AnnotationDefault".equals(strM13874)) {
                        iM138611 = i2;
                        i26 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i26;
                    } else if ("Synthetic".equals(strM13874)) {
                        c22638.f73772 |= 4096;
                        z3 = true;
                        iM138611 = i2;
                        i22 = i35;
                        i28 = i3;
                        i19 = i34;
                        i31 = i33;
                    } else if ("RuntimeInvisibleAnnotations".equals(strM13874)) {
                        iM138611 = i2;
                        i28 = i34;
                        i22 = i35;
                        int i39 = i33;
                        i19 = i34;
                        i31 = i39;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strM13874)) {
                        iM138611 = i2;
                        i24 = i34;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(strM13874)) {
                        iM138611 = i2;
                        i23 = i34;
                        i22 = i35;
                        i28 = i3;
                        i31 = i33;
                        i19 = i23;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(strM13874)) {
                        iM138611 = i2;
                        i33 = i34;
                    } else if ("MethodParameters".equals(strM13874)) {
                        iM138611 = i2;
                        i22 = i34;
                        i28 = i3;
                        int i310 = i33;
                        i19 = i34;
                        i31 = i310;
                    } else {
                        i19 = i34;
                        C11349 c113410 = c11349M13861;
                        c11349M13861 = m13861(c22638.f73759, strM13874, i19, iM13872, cArr, -1, null);
                        c11349M13861.f38290 = c113410;
                        iM138611 = i2;
                        i31 = i33;
                        i28 = i3;
                        i22 = i35;
                        i24 = i24;
                        i25 = i25;
                    }
                    i23 = i23;
                }
                i22 = i35;
                i28 = i3;
                int i311 = i33;
                i19 = i34;
                i31 = i311;
                i23 = i23;
            }
            i30 = i19 + iM13872;
            iM138610 = i32;
        }
        int i40 = i22;
        int i41 = i23;
        int i42 = i24;
        int i43 = i25;
        String str4 = "RuntimeVisibleTypeAnnotations";
        int i44 = i31;
        C11349 c113411 = c11349M13861;
        AbstractC20521 abstractC20521Mo3283 = abstractC0764.mo3283(c22638.f73772, c22638.f73762, c22638.f73769, i2 == 0 ? null : m13871(cArr, i2), strArr);
        if (abstractC20521Mo3283 == null) {
            return i30;
        }
        if (abstractC20521Mo3283 instanceof C15583) {
            ((C15583) abstractC20521Mo3283).m37235(this, z3, (c22638.f73772 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, m13869(i20), i2, i21);
        }
        if (i40 != 0 && (c22638.f73764 & 2) == 0) {
            int iM13866 = m13866(i40);
            int i45 = i40 + 1;
            while (true) {
                int i46 = iM13866 - 1;
                if (iM13866 <= 0) {
                    break;
                }
                abstractC20521Mo3283.mo35173(m13869(i45 + 2), m13873(cArr, i45));
                i45 += 4;
                iM13866 = i46;
            }
        }
        if (i26 != 0) {
            AbstractC9812 abstractC9812Mo33776 = abstractC20521Mo3283.mo33776();
            m13856(abstractC9812Mo33776, i26, (String) null, cArr);
            if (abstractC9812Mo33776 != null) {
                abstractC9812Mo33776.mo10177();
            }
        }
        if (i27 != 0) {
            int iM138613 = m13869(i27);
            int iM13857 = i27 + 2;
            while (true) {
                int i47 = iM138613 - 1;
                if (iM138613 <= 0) {
                    break;
                }
                iM13857 = m13857(abstractC20521Mo3283.mo33781(m13873(cArr, iM13857), true), iM13857 + 2, true, cArr);
                iM138613 = i47;
            }
        }
        if (i3 != 0) {
            int iM138614 = m13869(i3);
            int iM13858 = i3 + 2;
            while (true) {
                int i48 = iM138614 - 1;
                if (iM138614 <= 0) {
                    break;
                }
                iM13858 = m13857(abstractC20521Mo3283.mo33781(m13873(cArr, iM13858), false), iM13858 + 2, true, cArr);
                iM138614 = i48;
            }
        }
        if (i43 != 0) {
            int iM138615 = m13869(i43);
            int iM13859 = i43 + 2;
            while (true) {
                int i49 = iM138615 - 1;
                if (iM138615 <= 0) {
                    break;
                }
                int iM138510 = m13858(c22638, iM13859);
                iM13859 = m13857(abstractC20521Mo3283.mo33789(c22638.f73771, c22638.f73763, m13873(cArr, iM138510), true), iM138510 + 2, true, cArr);
                iM138615 = i49;
            }
        }
        if (i42 != 0) {
            int iM138616 = m13869(i42);
            int iM138511 = i42 + 2;
            while (true) {
                int i50 = iM138616 - 1;
                if (iM138616 <= 0) {
                    break;
                }
                int iM138512 = m13858(c22638, iM138511);
                iM138511 = m13857(abstractC20521Mo3283.mo33789(c22638.f73771, c22638.f73763, m13873(cArr, iM138512), false), iM138512 + 2, true, cArr);
                iM138616 = i50;
            }
        }
        if (i41 != 0) {
            m13862(abstractC20521Mo3283, c22638, i41, true);
        }
        if (i44 != 0) {
            m13862(abstractC20521Mo3283, c22638, i44, false);
        }
        C11349 c113412 = c113411;
        while (c113412 != null) {
            C11349 c113413 = c113412.f38290;
            c113412.f38290 = null;
            abstractC20521Mo3283.mo35166(c113412);
            c113412 = c113413;
        }
        int i51 = i29;
        if (i51 != 0) {
            abstractC20521Mo3283.mo35171();
            char[] cArr2 = c22638.f73767;
            int iM138617 = m13869(i51);
            int iM138618 = m13869(i51 + 2);
            int iM13873 = m13872(i51 + 4);
            int i52 = i51 + 8;
            byte[] bArr = this.f17402;
            if (iM13873 > bArr.length - i52) {
                throw new IllegalArgumentException();
            }
            int i53 = i52 + iM13873;
            C9938[] c9938Arr3 = new C9938[iM13873 + 1];
            c22638.f73770 = c9938Arr3;
            int i54 = i52;
            while (i54 < i53) {
                int i55 = i54 - i52;
                switch (bArr[i54] & 255) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                    case 85:
                    case HRSS1373Polynomial.K /* 86 */:
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    case 93:
                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case q.f /* 99 */:
                    case 100:
                    case 101:
                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    case 108:
                    case 109:
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    case 114:
                    case 115:
                    case 116:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    case 118:
                    case 119:
                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                    case 122:
                    case 123:
                    case 124:
                    case q.h /* 125 */:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 172:
                    case 173:
                    case 174:
                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    case 177:
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                        i54++;
                        break;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    case 169:
                    case 188:
                        i54 += 2;
                        break;
                    case 17:
                    case 19:
                    case 20:
                    case 132:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 187:
                    case 189:
                    case 192:
                    case 193:
                        i54 += 3;
                        break;
                    case 153:
                    case EnumC2300.f8185 /* 154 */:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                        m13860(m13864(i54 + 1) + i55, c9938Arr3);
                        i54 += 3;
                        break;
                    case 170:
                        int i56 = (4 - (i55 & 3)) + i54;
                        m13860(m13872(i56) + i55, c9938Arr3);
                        int iM13874 = (m13872(i56 + 8) - m13872(i56 + 4)) + 1;
                        i18 = i56 + 12;
                        while (true) {
                            int i57 = iM13874 - 1;
                            if (iM13874 <= 0) {
                                i54 = i18;
                            } else {
                                m13860(m13872(i18) + i55, c9938Arr3);
                                i18 += 4;
                                iM13874 = i57;
                            }
                            break;
                        }
                        break;
                    case 171:
                        int i58 = (4 - (i55 & 3)) + i54;
                        m13860(m13872(i58) + i55, c9938Arr3);
                        int iM13875 = m13872(i58 + 4);
                        i18 = i58 + 8;
                        while (true) {
                            int i59 = iM13875 - 1;
                            if (iM13875 <= 0) {
                                i54 = i18;
                            } else {
                                m13860(m13872(i18 + 4) + i55, c9938Arr3);
                                i18 += 8;
                                iM13875 = i59;
                            }
                            break;
                        }
                        break;
                    case 185:
                    case 186:
                        i54 += 5;
                        break;
                    case 196:
                        int i60 = bArr[i54 + 1] & 255;
                        if (i60 != 132) {
                            if (i60 != 169) {
                                switch (i60) {
                                    default:
                                        switch (i60) {
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            case 56:
                                            case 57:
                                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        i54 += 4;
                                        break;
                                }
                            }
                            i54 += 4;
                        } else {
                            i54 += 6;
                        }
                        break;
                    case 197:
                        i54 += 4;
                        break;
                    case 200:
                    case 201:
                    case 220:
                        m13860(m13872(i54 + 1) + i55, c9938Arr3);
                        i54 += 5;
                        break;
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                    case 218:
                    case 219:
                        m13860(m13869(i54 + 1) + i55, c9938Arr3);
                        i54 += 3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            int iM138619 = m13869(i54);
            int i61 = i54 + 2;
            while (true) {
                int i62 = iM138619 - 1;
                int[] iArr2 = this.f17400;
                if (iM138619 > 0) {
                    C9938 c9938M13860 = m13860(m13869(i61), c9938Arr3);
                    C9938 c9938M13861 = m13860(m13869(i61 + 2), c9938Arr3);
                    int i63 = i53;
                    C9938 c9938M13862 = m13860(m13869(i61 + 4), c9938Arr3);
                    String strM13875 = m13873(cArr2, iArr2[m13869(i61 + 6)]);
                    i61 += 8;
                    abstractC20521Mo3283.mo33788(c9938M13860, c9938M13861, c9938M13862, strM13875);
                    iM138619 = i62;
                    i53 = i63;
                    bArr = bArr;
                } else {
                    int i64 = i53;
                    byte[] bArr2 = bArr;
                    int iM138620 = m13869(i61);
                    int i65 = i61 + 2;
                    int[] iArr3 = null;
                    int i66 = 0;
                    int i67 = 0;
                    int i68 = 0;
                    int i69 = 0;
                    boolean z4 = true;
                    int[] iArrM13864 = null;
                    C11349 c113414 = null;
                    while (true) {
                        int i70 = iM138620 - 1;
                        if (iM138620 > 0) {
                            String strM13876 = m13873(cArr2, i65);
                            C11349 c113415 = c113414;
                            int iM13876 = m13872(i65 + 2);
                            int i71 = i65 + 6;
                            int[] iArr4 = iArr2;
                            if (!"LocalVariableTable".equals(strM13876)) {
                                iArrM13863 = iArr3;
                                if ("LocalVariableTypeTable".equals(strM13876)) {
                                    i67 = i71;
                                    i15 = i71;
                                    iArr3 = iArrM13863;
                                    c113414 = c113415;
                                    str3 = str;
                                    c9938Arr2 = c9938Arr3;
                                } else if ("LineNumberTable".equals(strM13876)) {
                                    if ((c22638.f73764 & 2) == 0) {
                                        int iM138621 = m13869(i71);
                                        int i72 = i65 + 8;
                                        while (true) {
                                            int i73 = iM138621 - 1;
                                            if (iM138621 > 0) {
                                                int iM138622 = m13869(i72);
                                                int iM138623 = m13869(i72 + 2);
                                                int i74 = i72 + 4;
                                                C9938 c9938 = c9938Arr3[iM138622];
                                                if (c9938 == null) {
                                                    if (c9938 == null) {
                                                        c9938Arr3[iM138622] = new C9938();
                                                    }
                                                    C9938 c9939 = c9938Arr3[iM138622];
                                                    c9939.f33932 = (short) (c9939.f33932 | 1);
                                                }
                                                c9938Arr3[iM138622].m25140(iM138623);
                                                i72 = i74;
                                                iM138621 = i73;
                                            }
                                        }
                                    }
                                    str2 = str;
                                    i17 = i66;
                                    i16 = i68;
                                    i68 = i16;
                                    i66 = i17;
                                    i15 = i71;
                                    c113414 = c113415;
                                    c9938Arr2 = c9938Arr3;
                                    int[] iArr5 = iArrM13863;
                                    str3 = str2;
                                    iArr3 = iArr5;
                                } else {
                                    if (str4.equals(strM13876)) {
                                        iArrM13864 = m13863(abstractC20521Mo3283, c22638, i71, true);
                                        str2 = str;
                                    } else {
                                        str2 = str;
                                        if (str2.equals(strM13876)) {
                                            iArrM13863 = m13863(abstractC20521Mo3283, c22638, i71, false);
                                        } else {
                                            if ("StackMapTable".equals(strM13876)) {
                                                if ((c22638.f73764 & 4) == 0) {
                                                    i68 = i65 + 8;
                                                    i66 = i71 + iM13876;
                                                }
                                            } else if ("StackMap".equals(strM13876)) {
                                                if ((c22638.f73764 & 4) == 0) {
                                                    i16 = i65 + 8;
                                                    i17 = i71 + iM13876;
                                                    z4 = false;
                                                }
                                                i68 = i16;
                                                i66 = i17;
                                            } else {
                                                i15 = i71;
                                                c9938Arr2 = c9938Arr3;
                                                str3 = str2;
                                                C11349 c11349M13862 = m13861(c22638.f73759, strM13876, i15, iM13876, cArr2, i51, c9938Arr2);
                                                c11349M13862.f38290 = c113415;
                                                c113414 = c11349M13862;
                                                iArrM13864 = iArrM13864;
                                                iArr3 = iArrM13863;
                                            }
                                            i17 = i66;
                                            i16 = i68;
                                            i68 = i16;
                                            i66 = i17;
                                        }
                                    }
                                    i15 = i71;
                                    c113414 = c113415;
                                    c9938Arr2 = c9938Arr3;
                                    int[] iArr6 = iArrM13863;
                                    str3 = str2;
                                    iArr3 = iArr6;
                                }
                            } else if ((c22638.f73764 & 2) == 0) {
                                int iM138624 = m13869(i71);
                                int i75 = i65 + 8;
                                while (true) {
                                    int i76 = iM138624 - 1;
                                    if (iM138624 > 0) {
                                        int iM138625 = m13869(i75);
                                        C9938 c99310 = c9938Arr3[iM138625];
                                        if (c99310 == null) {
                                            if (c99310 == null) {
                                                c9938Arr3[iM138625] = new C9938();
                                            }
                                            C9938 c99311 = c9938Arr3[iM138625];
                                            c99311.f33932 = (short) (c99311.f33932 | 1);
                                        }
                                        int iM138626 = m13869(i75 + 2) + iM138625;
                                        C9938 c99312 = c9938Arr3[iM138626];
                                        if (c99312 == null) {
                                            if (c99312 == null) {
                                                c9938Arr3[iM138626] = new C9938();
                                            }
                                            C9938 c99313 = c9938Arr3[iM138626];
                                            c99313.f33932 = (short) (c99313.f33932 | 1);
                                        }
                                        i75 += 10;
                                        iM138624 = i76;
                                        iArr3 = iArr3;
                                    } else {
                                        iArrM13863 = iArr3;
                                        i69 = i71;
                                        i15 = i71;
                                        iArr3 = iArrM13863;
                                        c113414 = c113415;
                                        str3 = str;
                                        c9938Arr2 = c9938Arr3;
                                    }
                                }
                            } else {
                                iArrM13863 = iArr3;
                                str2 = str;
                                i17 = i66;
                                i16 = i68;
                                i68 = i16;
                                i66 = i17;
                                i15 = i71;
                                c113414 = c113415;
                                c9938Arr2 = c9938Arr3;
                                int[] iArr7 = iArrM13863;
                                str3 = str2;
                                iArr3 = iArr7;
                            }
                            i65 = i15 + iM13876;
                            c9938Arr3 = c9938Arr2;
                            cArr2 = cArr2;
                            iM13873 = iM13873;
                            iM138620 = i70;
                            iArr2 = iArr4;
                            str = str3;
                            str4 = str4;
                            i51 = i51;
                        } else {
                            C11349 c113416 = c113414;
                            int[] iArr8 = iArr2;
                            C9938[] c9938Arr4 = c9938Arr3;
                            int[] iArr9 = iArr3;
                            int i77 = iM13873;
                            char[] cArr3 = cArr2;
                            int[] iArr10 = iArrM13864;
                            boolean z5 = (c22638.f73764 & 8) != 0;
                            if (i68 != 0) {
                                c22638.f73773 = -1;
                                c22638.f73758 = 0;
                                c22638.f73765 = 0;
                                c22638.f73757 = 0;
                                Object[] objArr = new Object[iM138618];
                                c22638.f73760 = objArr;
                                c22638.f73756 = 0;
                                c22638.f73766 = new Object[iM138617];
                                if (z5) {
                                    String str5 = c22638.f73769;
                                    if ((c22638.f73772 & 8) == 0) {
                                        if ("<init>".equals(c22638.f73762)) {
                                            objArr[0] = 6;
                                        } else {
                                            objArr[0] = m13852(c22638.f73767, this.f17403 + 2);
                                        }
                                        i13 = 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i78 = 1;
                                    while (true) {
                                        int i79 = i78 + 1;
                                        char cCharAt = str5.charAt(i78);
                                        if (cCharAt == 'F') {
                                            i14 = i13 + 1;
                                            objArr[i13] = 2;
                                        } else if (cCharAt != 'L') {
                                            if (cCharAt != 'S' && cCharAt != 'I') {
                                                if (cCharAt == 'J') {
                                                    i14 = i13 + 1;
                                                    objArr[i13] = 4;
                                                } else if (cCharAt != 'Z') {
                                                    if (cCharAt != '[') {
                                                        switch (cCharAt) {
                                                            case 'D':
                                                                i14 = i13 + 1;
                                                                objArr[i13] = 3;
                                                                break;
                                                        }
                                                        c22638.f73765 = i13;
                                                    } else {
                                                        while (str5.charAt(i79) == '[') {
                                                            i79++;
                                                        }
                                                        if (str5.charAt(i79) == 'L') {
                                                            do {
                                                                i79++;
                                                            } while (str5.charAt(i79) != ';');
                                                        }
                                                        i14 = i13 + 1;
                                                        i79++;
                                                        objArr[i13] = str5.substring(i78, i79);
                                                    }
                                                }
                                            }
                                            i14 = i13 + 1;
                                            objArr[i13] = 1;
                                        } else {
                                            int i80 = i79;
                                            while (str5.charAt(i80) != ';') {
                                                i80++;
                                            }
                                            i78 = i80 + 1;
                                            objArr[i13] = str5.substring(i79, i80);
                                            i13++;
                                        }
                                        i13 = i14;
                                        i78 = i79;
                                    }
                                }
                                int i81 = i68;
                                while (i81 < i66 - 2) {
                                    if (bArr2[i81] != 8 || (iM13869 = m13869(i81 + 1)) < 0 || iM13869 >= i77 || (bArr2[i52 + iM13869] & 255) != 187) {
                                        c9938Arr = c9938Arr4;
                                    } else {
                                        c9938Arr = c9938Arr4;
                                        m13860(iM13869, c9938Arr);
                                    }
                                    i81++;
                                    c9938Arr4 = c9938Arr;
                                }
                            }
                            C9938[] c9938Arr5 = c9938Arr4;
                            if (z5 && (c22638.f73764 & 256) != 0) {
                                abstractC20521Mo3283.mo33782(-1, iM138618, 0, (Object[]) null, (Object[]) null);
                            }
                            int iM13855 = m13853(0, iArr10);
                            int i82 = 0;
                            int iM13856 = m13853(0, iArr9);
                            int i83 = (c22638.f73764 & 256) == 0 ? 33 : 0;
                            C11349 c113417 = c113416;
                            AbstractC20521 abstractC20522 = abstractC20521Mo3283;
                            int i84 = iM138617;
                            int i85 = iM138618;
                            int i86 = i64;
                            int i87 = i66;
                            int i88 = 0;
                            C4998 c49911 = this;
                            int[] iArr11 = iArr10;
                            int i89 = i30;
                            char[] cArr4 = cArr3;
                            int i90 = iM13855;
                            int i91 = i67;
                            boolean z6 = false;
                            int[] iArr12 = iArr9;
                            C9938[] c9938Arr6 = c9938Arr5;
                            int i92 = i69;
                            C4998 c49912 = c49911;
                            int i93 = i52;
                            while (i93 < i86) {
                                int i94 = i93 - i52;
                                int i95 = i86;
                                C9938 c99314 = c9938Arr6[i94];
                                boolean z7 = z6;
                                if (c99314 != null) {
                                    c99314.m25144(abstractC20522, (c22638.f73764 & 2) == 0);
                                }
                                int i96 = i68;
                                boolean z8 = z7;
                                while (true) {
                                    if (i96 != 0) {
                                        i85 = i85;
                                        int i97 = c22638.f73773;
                                        i84 = i84;
                                        if (i97 == i94 || i97 == -1) {
                                            if (i97 != -1) {
                                                if (!z4 || z5) {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC20522.mo33782(-1, c22638.f73765, c22638.f73756, c22638.f73760, c22638.f73766);
                                                } else {
                                                    cArr4 = cArr4;
                                                    i94 = i94;
                                                    abstractC20522.mo33782(c22638.f73758, c22638.f73757, c22638.f73756, c22638.f73760, c22638.f73766);
                                                }
                                                z8 = false;
                                            } else {
                                                iArr11 = iArr11;
                                                iArr12 = iArr12;
                                                i85 = i85;
                                                i84 = i84;
                                                i91 = i91;
                                                cArr4 = cArr4;
                                                i94 = i94;
                                            }
                                            if (i96 < i87) {
                                                char[] cArr5 = c22638.f73767;
                                                C9938[] c9938Arr7 = c22638.f73770;
                                                if (z4) {
                                                    i11 = i96 + 1;
                                                    i12 = bArr2[i96] & 255;
                                                } else {
                                                    c22638.f73773 = -1;
                                                    i11 = i96;
                                                    i12 = 255;
                                                }
                                                c22638.f73757 = 0;
                                                if (i12 < 64) {
                                                    c22638.f73758 = 3;
                                                    c22638.f73756 = 0;
                                                } else {
                                                    if (i12 < 128) {
                                                        i12 -= 64;
                                                        int iM138513 = c49912.m13854(i11, c22638.f73766, 0, cArr5, c9938Arr7);
                                                        c22638.f73758 = 4;
                                                        c22638.f73756 = 1;
                                                        i11 = iM138513;
                                                    } else {
                                                        if (i12 < 247) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        c49910 = c49912;
                                                        int iM138627 = c49910.m13869(i11);
                                                        i87 = i87;
                                                        int iM138514 = i11 + 2;
                                                        if (i12 == 247) {
                                                            iM138514 = c49910.m13854(iM138514, c22638.f73766, 0, cArr5, c9938Arr7);
                                                            c22638.f73758 = 4;
                                                            c22638.f73756 = 1;
                                                            z8 = z8;
                                                        } else {
                                                            z8 = z8;
                                                            if (i12 >= 248 && i12 < 251) {
                                                                c22638.f73758 = 2;
                                                                int i98 = 251 - i12;
                                                                c22638.f73757 = i98;
                                                                c22638.f73765 -= i98;
                                                                c22638.f73756 = 0;
                                                            } else if (i12 == 251) {
                                                                c22638.f73758 = 3;
                                                                c22638.f73756 = 0;
                                                            } else {
                                                                if (i12 < 255) {
                                                                    int i99 = i12 - 251;
                                                                    iM13854 = iM138514;
                                                                    int i100 = i99;
                                                                    int i101 = z5 ? c22638.f73765 : 0;
                                                                    while (i100 > 0) {
                                                                        iM13854 = c49910.m13854(iM13854, c22638.f73760, i101, cArr5, c9938Arr7);
                                                                        i100--;
                                                                        i101++;
                                                                    }
                                                                    c22638.f73758 = 1;
                                                                    c22638.f73757 = i99;
                                                                    c22638.f73765 += i99;
                                                                    c22638.f73756 = 0;
                                                                } else {
                                                                    int iM138628 = c49910.m13869(iM138514);
                                                                    int iM138515 = i11 + 4;
                                                                    c22638.f73758 = 0;
                                                                    c22638.f73757 = iM138628;
                                                                    c22638.f73765 = iM138628;
                                                                    for (int i102 = 0; i102 < iM138628; i102++) {
                                                                        iM138515 = c49910.m13854(iM138515, c22638.f73760, i102, cArr5, c9938Arr7);
                                                                    }
                                                                    int iM138629 = c49910.m13869(iM138515);
                                                                    c22638.f73756 = iM138629;
                                                                    iM13854 = iM138515 + 2;
                                                                    for (int i103 = 0; i103 < iM138629; i103++) {
                                                                        iM13854 = c49910.m13854(iM13854, c22638.f73766, i103, cArr5, c9938Arr7);
                                                                    }
                                                                }
                                                                iM138514 = iM13854;
                                                            }
                                                        }
                                                        i11 = iM138514;
                                                        i12 = iM138627;
                                                    }
                                                    int i104 = i12 + 1 + c22638.f73773;
                                                    c22638.f73773 = i104;
                                                    m13860(i104, c9938Arr7);
                                                    i96 = i11;
                                                    c49912 = c49910;
                                                    i87 = i87;
                                                    z8 = z8;
                                                }
                                                c49910 = c49912;
                                                int i105 = i12 + 1 + c22638.f73773;
                                                c22638.f73773 = i105;
                                                m13860(i105, c9938Arr7);
                                                i96 = i11;
                                                c49912 = c49910;
                                                i87 = i87;
                                                z8 = z8;
                                            } else {
                                                i96 = 0;
                                            }
                                        } else {
                                            i85 = i85;
                                            i84 = i84;
                                        }
                                    } else {
                                        i85 = i85;
                                        i84 = i84;
                                    }
                                }
                                int i106 = i94;
                                C4998 c49913 = c49912;
                                if (z8) {
                                    if ((c22638.f73764 & 8) != 0) {
                                        abstractC20522.mo33782(256, 0, 0, (Object[]) null, (Object[]) null);
                                    }
                                    z = false;
                                } else {
                                    z5 = z5;
                                    c49913 = c49913;
                                    z = z8;
                                }
                                int i107 = bArr2[i93] & 255;
                                switch (i107) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case q.f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case q.h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case 142:
                                    case 143:
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    case 151:
                                    case 152:
                                    case 172:
                                    case 173:
                                    case 174:
                                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                    case 177:
                                    case 190:
                                    case 191:
                                    case 194:
                                    case 195:
                                        z = z;
                                        i83 = i83;
                                        abstractC20522.mo35159(i107);
                                        i5 = i93 + 1;
                                        c4998 = c49913;
                                        z6 = z;
                                        i6 = i83;
                                        c4999 = c4998;
                                        C11349 c113418 = c113417;
                                        i8 = iM13856;
                                        c11349 = c113418;
                                        while (true) {
                                            C9938[] c9938Arr8 = c9938Arr6;
                                            if (iArr11 == null && i88 < iArr11.length && i90 <= i106) {
                                                if (i90 == i106) {
                                                    int iM138516 = c4998.m13858(c22638, iArr11[i88]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM138516), true), iM138516 + 2, true, cArr4);
                                                }
                                                int i108 = i88 + 1;
                                                int iM138517 = c4998.m13853(i108, iArr11);
                                                i6 = i6;
                                                i95 = i95;
                                                i5 = i5;
                                                c11349 = c11349;
                                                i8 = i8;
                                                c4998 = c4998;
                                                i92 = i92;
                                                i90 = iM138517;
                                                abstractC20522 = abstractC20522;
                                                i88 = i108;
                                                i96 = i96;
                                                bArr2 = bArr2;
                                                i89 = i89;
                                                c4999 = c4999;
                                                i91 = i91;
                                                z5 = z5;
                                                z4 = z4;
                                                i52 = i52;
                                                c9938Arr6 = c9938Arr8;
                                                i82 = i82;
                                                iArr8 = iArr8;
                                                iArr12 = iArr12;
                                            }
                                        }
                                        int i109 = i6;
                                        int i110 = i95;
                                        int i111 = i5;
                                        iM13853 = i8;
                                        i10 = i82;
                                        while (iArr12 != null && i10 < iArr12.length && iM13853 <= i106) {
                                            if (iM13853 == i106) {
                                                int iM138518 = c4998.m13858(c22638, iArr12[i10]);
                                                c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM138518), false), iM138518 + 2, true, cArr4);
                                            }
                                            i10++;
                                            iM13853 = c4998.m13853(i10, iArr12);
                                            i90 = i90;
                                            i88 = i88;
                                        }
                                        int i112 = i90;
                                        int i113 = i88;
                                        c113417 = c11349;
                                        c49911 = c4998;
                                        iM13856 = iM13853;
                                        i91 = i91;
                                        z5 = z5;
                                        c9938Arr6 = c9938Arr8;
                                        i86 = i110;
                                        i93 = i111;
                                        i87 = i87;
                                        i68 = i96;
                                        c49912 = c4999;
                                        i88 = i113;
                                        iArr12 = iArr12;
                                        i92 = i92;
                                        i90 = i112;
                                        i82 = i10;
                                        i83 = i109;
                                        break;
                                    case 16:
                                    case 188:
                                        abstractC20522.mo35172(i107, bArr2[i93 + 1]);
                                        i5 = i93 + 2;
                                        c4998 = c49913;
                                        z6 = z;
                                        i6 = i83;
                                        c4999 = c4998;
                                        C11349 c113419 = c113417;
                                        i8 = iM13856;
                                        c11349 = c113419;
                                        while (true) {
                                            C9938[] c9938Arr9 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1010 = i6;
                                            int i114 = i95;
                                            int i115 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM138519 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM138519), false), iM138519 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i116 = i90;
                                            int i117 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr9;
                                            i86 = i114;
                                            i93 = i115;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i116;
                                            i82 = i10;
                                            i83 = i1010;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr9;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 17:
                                        z = z;
                                        i83 = i83;
                                        abstractC20522.mo35172(i107, c49913.m13864(i93 + 1));
                                        i5 = i93 + 3;
                                        c4998 = c49913;
                                        z6 = z;
                                        i6 = i83;
                                        c4999 = c4998;
                                        C11349 c1134110 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134110;
                                        while (true) {
                                            C9938[] c9938Arr10 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1011 = i6;
                                            int i118 = i95;
                                            int i119 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385110 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385110), false), iM1385110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1110 = i90;
                                            int i1111 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr10;
                                            i86 = i118;
                                            i93 = i119;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1110;
                                            i82 = i10;
                                            i83 = i1011;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr10;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 18:
                                        abstractC20522.mo8457(c49913.m13867(cArr4, bArr2[i93 + 1] & 255));
                                        i5 = i93 + 2;
                                        c4998 = c49913;
                                        z6 = z;
                                        i6 = i83;
                                        c4999 = c4998;
                                        C11349 c1134111 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134111;
                                        while (true) {
                                            C9938[] c9938Arr11 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1012 = i6;
                                            int i1112 = i95;
                                            int i1113 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385111 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385111), false), iM1385111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1114 = i90;
                                            int i1115 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr11;
                                            i86 = i1112;
                                            i93 = i1113;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1114;
                                            i82 = i10;
                                            i83 = i1012;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr11;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 19:
                                    case 20:
                                        abstractC20522.mo8457(c49913.m13867(cArr4, c49913.m13869(i93 + 1)));
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49914 = c49913;
                                        int i120 = i89;
                                        int[] iArr13 = iArr8;
                                        byte[] bArr3 = bArr2;
                                        int i121 = i82;
                                        int i122 = i96;
                                        int i123 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr12 = c9938Arr6;
                                        boolean z9 = z4;
                                        AbstractC20521 abstractC20523 = abstractC20522;
                                        boolean z10 = z5;
                                        int i124 = i90;
                                        int i125 = i91;
                                        int i126 = iM13856;
                                        c11349 = c113417;
                                        i8 = i126;
                                        c4998 = c49914;
                                        i92 = i92;
                                        i90 = i124;
                                        abstractC20522 = abstractC20523;
                                        i88 = i88;
                                        i96 = i122;
                                        bArr2 = bArr3;
                                        i89 = i120;
                                        c4999 = c49914;
                                        i91 = i125;
                                        z5 = z10;
                                        z4 = z9;
                                        i52 = i123;
                                        c9938Arr6 = c9938Arr12;
                                        i82 = i121;
                                        iArr8 = iArr13;
                                        while (true) {
                                            C9938[] c9938Arr13 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1013 = i6;
                                            int i1116 = i95;
                                            int i1117 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385112 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385112), false), iM1385112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1118 = i90;
                                            int i1119 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr13;
                                            i86 = i1116;
                                            i93 = i1117;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1118;
                                            i82 = i10;
                                            i83 = i1013;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr13;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case 169:
                                        z = z;
                                        i83 = i83;
                                        abstractC20522.mo35158(i107, bArr2[i93 + 1] & 255);
                                        i7 = i93 + 2;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49915 = c49913;
                                        int i127 = i89;
                                        int[] iArr14 = iArr8;
                                        byte[] bArr4 = bArr2;
                                        int i128 = i82;
                                        int i129 = i96;
                                        int i1210 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr14 = c9938Arr6;
                                        boolean z11 = z4;
                                        AbstractC20521 abstractC20524 = abstractC20522;
                                        boolean z12 = z5;
                                        int i1211 = i90;
                                        int i1212 = i91;
                                        int i1213 = iM13856;
                                        c11349 = c113417;
                                        i8 = i1213;
                                        c4998 = c49915;
                                        i92 = i92;
                                        i90 = i1211;
                                        abstractC20522 = abstractC20524;
                                        i88 = i88;
                                        i96 = i129;
                                        bArr2 = bArr4;
                                        i89 = i127;
                                        c4999 = c49915;
                                        i91 = i1212;
                                        z5 = z12;
                                        z4 = z11;
                                        i52 = i1210;
                                        c9938Arr6 = c9938Arr14;
                                        i82 = i128;
                                        iArr8 = iArr14;
                                        while (true) {
                                            C9938[] c9938Arr15 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1014 = i6;
                                            int i11110 = i95;
                                            int i11111 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385113 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385113), false), iM1385113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11112 = i90;
                                            int i11113 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr15;
                                            i86 = i11110;
                                            i93 = i11111;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i11113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11112;
                                            i82 = i10;
                                            i83 = i1014;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr15;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                        int i130 = i107 - 26;
                                        abstractC20522.mo35158((i130 >> 2) + 21, i130 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49916 = c49913;
                                        int i1214 = i89;
                                        int[] iArr15 = iArr8;
                                        byte[] bArr5 = bArr2;
                                        int i1215 = i82;
                                        int i1216 = i96;
                                        int i1217 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr16 = c9938Arr6;
                                        boolean z13 = z4;
                                        AbstractC20521 abstractC20525 = abstractC20522;
                                        boolean z14 = z5;
                                        int i1218 = i90;
                                        int i1219 = i91;
                                        int i12110 = iM13856;
                                        c11349 = c113417;
                                        i8 = i12110;
                                        c4998 = c49916;
                                        i92 = i92;
                                        i90 = i1218;
                                        abstractC20522 = abstractC20525;
                                        i88 = i88;
                                        i96 = i1216;
                                        bArr2 = bArr5;
                                        i89 = i1214;
                                        c4999 = c49916;
                                        i91 = i1219;
                                        z5 = z14;
                                        z4 = z13;
                                        i52 = i1217;
                                        c9938Arr6 = c9938Arr16;
                                        i82 = i1215;
                                        iArr8 = iArr15;
                                        while (true) {
                                            C9938[] c9938Arr17 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1015 = i6;
                                            int i11114 = i95;
                                            int i11115 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385114 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385114), false), iM1385114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11116 = i90;
                                            int i11117 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr17;
                                            i86 = i11114;
                                            i93 = i11115;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i11117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11116;
                                            i82 = i10;
                                            i83 = i1015;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr17;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                        int i131 = i107 - 59;
                                        abstractC20522.mo35158((i131 >> 2) + 54, i131 & 3);
                                        i7 = i93 + 1;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49917 = c49913;
                                        int i12111 = i89;
                                        int[] iArr16 = iArr8;
                                        byte[] bArr6 = bArr2;
                                        int i12112 = i82;
                                        int i12113 = i96;
                                        int i12114 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr18 = c9938Arr6;
                                        boolean z15 = z4;
                                        AbstractC20521 abstractC20526 = abstractC20522;
                                        boolean z16 = z5;
                                        int i12115 = i90;
                                        int i12116 = i91;
                                        int i12117 = iM13856;
                                        c11349 = c113417;
                                        i8 = i12117;
                                        c4998 = c49917;
                                        i92 = i92;
                                        i90 = i12115;
                                        abstractC20522 = abstractC20526;
                                        i88 = i88;
                                        i96 = i12113;
                                        bArr2 = bArr6;
                                        i89 = i12111;
                                        c4999 = c49917;
                                        i91 = i12116;
                                        z5 = z16;
                                        z4 = z15;
                                        i52 = i12114;
                                        c9938Arr6 = c9938Arr18;
                                        i82 = i12112;
                                        iArr8 = iArr16;
                                        while (true) {
                                            C9938[] c9938Arr19 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1016 = i6;
                                            int i11118 = i95;
                                            int i11119 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385115 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385115), false), iM1385115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111110 = i90;
                                            int i111111 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr19;
                                            i86 = i11118;
                                            i93 = i11119;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111110;
                                            i82 = i10;
                                            i83 = i1016;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr19;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 132:
                                        abstractC20522.mo35160(bArr2[i93 + 1] & 255, bArr2[i93 + 2]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49918 = c49913;
                                        int i12118 = i89;
                                        int[] iArr17 = iArr8;
                                        byte[] bArr7 = bArr2;
                                        int i12119 = i82;
                                        int i121110 = i96;
                                        int i121111 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr110 = c9938Arr6;
                                        boolean z17 = z4;
                                        AbstractC20521 abstractC20527 = abstractC20522;
                                        boolean z18 = z5;
                                        int i121112 = i90;
                                        int i121113 = i91;
                                        int i121114 = iM13856;
                                        c11349 = c113417;
                                        i8 = i121114;
                                        c4998 = c49918;
                                        i92 = i92;
                                        i90 = i121112;
                                        abstractC20522 = abstractC20527;
                                        i88 = i88;
                                        i96 = i121110;
                                        bArr2 = bArr7;
                                        i89 = i12118;
                                        c4999 = c49918;
                                        i91 = i121113;
                                        z5 = z18;
                                        z4 = z17;
                                        i52 = i121111;
                                        c9938Arr6 = c9938Arr110;
                                        i82 = i12119;
                                        iArr8 = iArr17;
                                        while (true) {
                                            C9938[] c9938Arr111 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1017 = i6;
                                            int i111112 = i95;
                                            int i111113 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385116 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385116), false), iM1385116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111114 = i90;
                                            int i111115 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr111;
                                            i86 = i111112;
                                            i93 = i111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111114;
                                            i82 = i10;
                                            i83 = i1017;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 153:
                                    case EnumC2300.f8185 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 198:
                                    case 199:
                                        abstractC20522.mo35162(i107, c9938Arr6[c49913.m13864(i93 + 1) + i106]);
                                        i7 = i93 + 3;
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c49919 = c49913;
                                        int i121115 = i89;
                                        int[] iArr18 = iArr8;
                                        byte[] bArr8 = bArr2;
                                        int i121116 = i82;
                                        int i121117 = i96;
                                        int i121118 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr112 = c9938Arr6;
                                        boolean z19 = z4;
                                        AbstractC20521 abstractC20528 = abstractC20522;
                                        boolean z110 = z5;
                                        int i121119 = i90;
                                        int i1211110 = i91;
                                        int i1211111 = iM13856;
                                        c11349 = c113417;
                                        i8 = i1211111;
                                        c4998 = c49919;
                                        i92 = i92;
                                        i90 = i121119;
                                        abstractC20522 = abstractC20528;
                                        i88 = i88;
                                        i96 = i121117;
                                        bArr2 = bArr8;
                                        i89 = i121115;
                                        c4999 = c49919;
                                        i91 = i1211110;
                                        z5 = z110;
                                        z4 = z19;
                                        i52 = i121118;
                                        c9938Arr6 = c9938Arr112;
                                        i82 = i121116;
                                        iArr8 = iArr18;
                                        while (true) {
                                            C9938[] c9938Arr113 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1018 = i6;
                                            int i111116 = i95;
                                            int i111117 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385117 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385117), false), iM1385117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111118 = i90;
                                            int i111119 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr113;
                                            i86 = i111116;
                                            i93 = i111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111118;
                                            i82 = i10;
                                            i83 = i1018;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr113;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 170:
                                        z = z;
                                        i83 = i83;
                                        int i132 = (4 - (i106 & 3)) + i93;
                                        C9938 c99315 = c9938Arr6[c49913.m13872(i132) + i106];
                                        int iM13877 = c49913.m13872(i132 + 4);
                                        int iM13878 = c49913.m13872(i132 + 8);
                                        i7 = i132 + 12;
                                        int i133 = (iM13878 - iM13877) + 1;
                                        C9938[] c9938Arr20 = new C9938[i133];
                                        for (int i134 = 0; i134 < i133; i134++) {
                                            c9938Arr20[i134] = c9938Arr6[c49913.m13872(i7) + i106];
                                            i7 += 4;
                                        }
                                        abstractC20522.mo35161(iM13877, iM13878, c99315, c9938Arr20);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c499110 = c49913;
                                        int i1211112 = i89;
                                        int[] iArr19 = iArr8;
                                        byte[] bArr9 = bArr2;
                                        int i1211113 = i82;
                                        int i1211114 = i96;
                                        int i1211115 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr114 = c9938Arr6;
                                        boolean z111 = z4;
                                        AbstractC20521 abstractC20529 = abstractC20522;
                                        boolean z112 = z5;
                                        int i1211116 = i90;
                                        int i1211117 = i91;
                                        int i1211118 = iM13856;
                                        c11349 = c113417;
                                        i8 = i1211118;
                                        c4998 = c499110;
                                        i92 = i92;
                                        i90 = i1211116;
                                        abstractC20522 = abstractC20529;
                                        i88 = i88;
                                        i96 = i1211114;
                                        bArr2 = bArr9;
                                        i89 = i1211112;
                                        c4999 = c499110;
                                        i91 = i1211117;
                                        z5 = z112;
                                        z4 = z111;
                                        i52 = i1211115;
                                        c9938Arr6 = c9938Arr114;
                                        i82 = i1211113;
                                        iArr8 = iArr19;
                                        while (true) {
                                            C9938[] c9938Arr115 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i1019 = i6;
                                            int i1111110 = i95;
                                            int i1111111 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385118 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385118), false), iM1385118 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111112 = i90;
                                            int i1111113 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr115;
                                            i86 = i1111110;
                                            i93 = i1111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111112;
                                            i82 = i10;
                                            i83 = i1019;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr115;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 171:
                                        z = z;
                                        i83 = i83;
                                        int i135 = (4 - (i106 & 3)) + i93;
                                        C9938 c99316 = c9938Arr6[c49913.m13872(i135) + i106];
                                        int iM13879 = c49913.m13872(i135 + 4);
                                        i7 = i135 + 8;
                                        int[] iArr20 = new int[iM13879];
                                        C9938[] c9938Arr21 = new C9938[iM13879];
                                        for (int i136 = 0; i136 < iM13879; i136++) {
                                            iArr20[i136] = c49913.m13872(i7);
                                            c9938Arr21[i136] = c9938Arr6[c49913.m13872(i7 + 4) + i106];
                                            i7 += 8;
                                        }
                                        abstractC20522.mo35165(c99316, iArr20, c9938Arr21);
                                        i5 = i7;
                                        cArr4 = cArr4;
                                        i106 = i106;
                                        z6 = z;
                                        i6 = i83;
                                        i85 = i85;
                                        i84 = i84;
                                        iArr11 = iArr11;
                                        C4998 c499111 = c49913;
                                        int i1211119 = i89;
                                        int[] iArr110 = iArr8;
                                        byte[] bArr10 = bArr2;
                                        int i12111110 = i82;
                                        int i12111111 = i96;
                                        int i12111112 = i52;
                                        i95 = i95;
                                        C9938[] c9938Arr116 = c9938Arr6;
                                        boolean z113 = z4;
                                        AbstractC20521 abstractC205210 = abstractC20522;
                                        boolean z114 = z5;
                                        int i12111113 = i90;
                                        int i12111114 = i91;
                                        int i12111115 = iM13856;
                                        c11349 = c113417;
                                        i8 = i12111115;
                                        c4998 = c499111;
                                        i92 = i92;
                                        i90 = i12111113;
                                        abstractC20522 = abstractC205210;
                                        i88 = i88;
                                        i96 = i12111111;
                                        bArr2 = bArr10;
                                        i89 = i1211119;
                                        c4999 = c499111;
                                        i91 = i12111114;
                                        z5 = z114;
                                        z4 = z113;
                                        i52 = i12111112;
                                        c9938Arr6 = c9938Arr116;
                                        i82 = i12111110;
                                        iArr8 = iArr110;
                                        while (true) {
                                            C9938[] c9938Arr117 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10110 = i6;
                                            int i1111114 = i95;
                                            int i1111115 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM1385119 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM1385119), false), iM1385119 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111116 = i90;
                                            int i1111117 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr117;
                                            i86 = i1111114;
                                            i93 = i1111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111116;
                                            i82 = i10;
                                            i83 = i10110;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr117;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 178:
                                    case 179:
                                    case 180:
                                    case 181:
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        z2 = z;
                                        i9 = i83;
                                        int i137 = iArr8[c49913.m13869(i93 + 1)];
                                        int i138 = iArr8[c49913.m13869(i137 + 2)];
                                        String strM13852 = c49913.m13852(cArr4, i137);
                                        String strM13877 = c49913.m13873(cArr4, i138);
                                        String strM13878 = c49913.m13873(cArr4, i138 + 2);
                                        if (i107 < 182) {
                                            abstractC20522.mo33785(strM13852, i107, strM13877, strM13878);
                                        } else {
                                            abstractC20522.mo33784(i107, strM13852, strM13877, strM13878, bArr2[i137 + (-1)] == 11);
                                        }
                                        i5 = i107 == 185 ? i93 + 5 : i93 + 3;
                                        z = z2;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134112 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134112;
                                        while (true) {
                                            C9938[] c9938Arr118 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10111 = i6;
                                            int i1111118 = i95;
                                            int i1111119 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851110 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851110), false), iM13851110 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111110 = i90;
                                            int i11111111 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr118;
                                            i86 = i1111118;
                                            i93 = i1111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i11111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111110;
                                            i82 = i10;
                                            i83 = i10111;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr118;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 186:
                                        int i139 = iArr8[c49913.m13869(i93 + 1)];
                                        int i140 = iArr8[c49913.m13869(i139 + 2)];
                                        String strM13879 = c49913.m13873(cArr4, i140);
                                        String strM138710 = c49913.m13873(cArr4, i140 + 2);
                                        int i141 = c49913.f17399[c49913.m13869(i139)];
                                        C19110 c19110 = (C19110) c49913.m13867(cArr4, c49913.m13869(i141));
                                        int iM138630 = c49913.m13869(i141 + 2);
                                        Object[] objArr2 = new Object[iM138630];
                                        int i142 = i141 + 4;
                                        z2 = z;
                                        int i143 = 0;
                                        while (i143 < iM138630) {
                                            objArr2[i143] = c49913.m13867(cArr4, c49913.m13869(i142));
                                            i142 += 2;
                                            i143++;
                                            i83 = i83;
                                        }
                                        i9 = i83;
                                        abstractC20522.mo33787(strM13879, strM138710, c19110, objArr2);
                                        z = z2;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134113 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134113;
                                        while (true) {
                                            C9938[] c9938Arr119 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10112 = i6;
                                            int i11111112 = i95;
                                            int i11111113 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851111 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851111), false), iM13851111 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111114 = i90;
                                            int i11111115 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr119;
                                            i86 = i11111112;
                                            i93 = i11111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i11111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111114;
                                            i82 = i10;
                                            i83 = i10112;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr119;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 187:
                                    case 189:
                                    case 192:
                                    case 193:
                                        abstractC20522.mo33790(i107, c49913.m13852(cArr4, i93 + 1));
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134114 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134114;
                                        while (true) {
                                            C9938[] c9938Arr1110 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10113 = i6;
                                            int i11111116 = i95;
                                            int i11111117 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851112 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851112), false), iM13851112 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i11111118 = i90;
                                            int i11111119 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1110;
                                            i86 = i11111116;
                                            i93 = i11111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i11111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i11111118;
                                            i82 = i10;
                                            i83 = i10113;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1110;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 196:
                                        int i144 = bArr2[i93 + 1] & 255;
                                        if (i144 == 132) {
                                            abstractC20522.mo35160(c49913.m13869(i93 + 2), c49913.m13864(i93 + 4));
                                            i5 = i93 + 6;
                                        } else {
                                            abstractC20522.mo35158(i144, c49913.m13869(i93 + 2));
                                            i5 = i93 + 4;
                                        }
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134115 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134115;
                                        while (true) {
                                            C9938[] c9938Arr1111 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10114 = i6;
                                            int i111111110 = i95;
                                            int i111111111 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851113 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851113), false), iM13851113 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111112 = i90;
                                            int i111111113 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1111;
                                            i86 = i111111110;
                                            i93 = i111111111;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i111111113;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111112;
                                            i82 = i10;
                                            i83 = i10114;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1111;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 197:
                                        abstractC20522.mo33783(bArr2[i93 + 3] & 255, c49913.m13852(cArr4, i93 + 1));
                                        i5 = i93 + 4;
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134116 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134116;
                                        while (true) {
                                            C9938[] c9938Arr1112 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10115 = i6;
                                            int i111111114 = i95;
                                            int i111111115 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851114 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851114), false), iM13851114 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i111111116 = i90;
                                            int i111111117 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1112;
                                            i86 = i111111114;
                                            i93 = i111111115;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i111111117;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i111111116;
                                            i82 = i10;
                                            i83 = i10115;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1112;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 200:
                                    case 201:
                                        abstractC20522.mo35162(i107 - i83, c9938Arr6[c49913.m13872(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134117 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134117;
                                        while (true) {
                                            C9938[] c9938Arr1113 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10116 = i6;
                                            int i111111118 = i95;
                                            int i111111119 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851115 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851115), false), iM13851115 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111110 = i90;
                                            int i1111111111 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1113;
                                            i86 = i111111118;
                                            i93 = i111111119;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111111111;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111110;
                                            i82 = i10;
                                            i83 = i10116;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1113;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                    case 208:
                                    case 209:
                                    case 210:
                                    case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                                    case 212:
                                    case 213:
                                    case 214:
                                    case 215:
                                    case 216:
                                    case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                                    case 218:
                                    case 219:
                                        int i145 = i107 < 218 ? i107 - 49 : i107 - 20;
                                        C9938 c99317 = c9938Arr6[c49913.m13869(i93 + 1) + i106];
                                        if (i145 == 167 || i145 == 168) {
                                            abstractC20522.mo35162(i145 + 33, c99317);
                                        } else {
                                            abstractC20522.mo35162(i145 < 167 ? ((i145 + 1) ^ 1) - 1 : i145 ^ 1, m13860(i106 + 3, c9938Arr6));
                                            abstractC20522.mo35162(200, c99317);
                                            z = true;
                                        }
                                        i5 = i93 + 3;
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134118 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134118;
                                        while (true) {
                                            C9938[] c9938Arr1114 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10117 = i6;
                                            int i1111111112 = i95;
                                            int i1111111113 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851116 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851116), false), iM13851116 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111114 = i90;
                                            int i1111111115 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1114;
                                            i86 = i1111111112;
                                            i93 = i1111111113;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111111115;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111114;
                                            i82 = i10;
                                            i83 = i10117;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1114;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    case 220:
                                        abstractC20522.mo35162(200, c9938Arr6[c49913.m13872(i93 + 1) + i106]);
                                        i5 = i93 + 5;
                                        z = true;
                                        i9 = i83;
                                        z6 = z;
                                        c4998 = c49913;
                                        i6 = i9;
                                        c4999 = c4998;
                                        C11349 c1134119 = c113417;
                                        i8 = iM13856;
                                        c11349 = c1134119;
                                        while (true) {
                                            C9938[] c9938Arr1115 = c9938Arr6;
                                            if (iArr11 == null) {
                                            }
                                            int i10118 = i6;
                                            int i1111111116 = i95;
                                            int i1111111117 = i5;
                                            iM13853 = i8;
                                            i10 = i82;
                                            while (iArr12 != null) {
                                                if (iM13853 == i106) {
                                                    int iM13851117 = c4998.m13858(c22638, iArr12[i10]);
                                                    c4998.m13857(abstractC20522.mo33778(c22638.f73771, c22638.f73763, c4998.m13873(cArr4, iM13851117), false), iM13851117 + 2, true, cArr4);
                                                }
                                                i10++;
                                                iM13853 = c4998.m13853(i10, iArr12);
                                                i90 = i90;
                                                i88 = i88;
                                            }
                                            int i1111111118 = i90;
                                            int i1111111119 = i88;
                                            c113417 = c11349;
                                            c49911 = c4998;
                                            iM13856 = iM13853;
                                            i91 = i91;
                                            z5 = z5;
                                            c9938Arr6 = c9938Arr1115;
                                            i86 = i1111111116;
                                            i93 = i1111111117;
                                            i87 = i87;
                                            i68 = i96;
                                            c49912 = c4999;
                                            i88 = i1111111119;
                                            iArr12 = iArr12;
                                            i92 = i92;
                                            i90 = i1111111118;
                                            i82 = i10;
                                            i83 = i10118;
                                            c11349 = c11349;
                                            i8 = i8;
                                            c4998 = c4998;
                                            i92 = i92;
                                            i90 = iM138517;
                                            abstractC20522 = abstractC20522;
                                            i88 = i108;
                                            i96 = i96;
                                            bArr2 = bArr2;
                                            i89 = i89;
                                            c4999 = c4999;
                                            i91 = i91;
                                            z5 = z5;
                                            z4 = z4;
                                            i52 = i52;
                                            c9938Arr6 = c9938Arr1115;
                                            i82 = i82;
                                            iArr8 = iArr8;
                                            iArr12 = iArr12;
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            }
                            int i146 = i91;
                            int i147 = i85;
                            int i148 = i84;
                            char[] cArr6 = cArr4;
                            int[] iArr21 = iArr11;
                            int[] iArr22 = iArr12;
                            C9938 c99318 = c9938Arr6[i77];
                            if (c99318 != null) {
                                abstractC20522.mo35164(c99318);
                            }
                            if (i92 != 0 && (c22638.f73764 & 2) == 0) {
                                if (i146 != 0) {
                                    int iM138631 = c49911.m13869(i146) * 3;
                                    iArr = new int[iM138631];
                                    int i149 = i146 + 2;
                                    while (iM138631 > 0) {
                                        iArr[iM138631 - 1] = i149 + 6;
                                        iArr[iM138631 - 2] = c49911.m13869(i149 + 8);
                                        iM138631 -= 3;
                                        iArr[iM138631] = c49911.m13869(i149);
                                        i149 += 10;
                                    }
                                } else {
                                    iArr = null;
                                }
                                int iM138632 = c49911.m13869(i92);
                                int i150 = i92 + 2;
                                while (true) {
                                    int i151 = iM138632 - 1;
                                    if (iM138632 > 0) {
                                        int iM138633 = c49911.m13869(i150);
                                        int iM138634 = c49911.m13869(i150 + 2);
                                        String strM138711 = c49911.m13873(cArr6, i150 + 4);
                                        String strM138712 = c49911.m13873(cArr6, i150 + 6);
                                        int iM138635 = c49911.m13869(i150 + 8);
                                        i150 += 10;
                                        if (iArr == null) {
                                            strM13873 = null;
                                            break;
                                            break;
                                        }
                                        int i152 = 0;
                                        while (true) {
                                            if (i152 >= iArr.length) {
                                                strM13873 = null;
                                                break;
                                            }
                                            if (iArr[i152] == iM138633 && iArr[i152 + 1] == iM138635) {
                                                strM13873 = c49911.m13873(cArr6, iArr[i152 + 2]);
                                                break;
                                            }
                                            i152 += 3;
                                        }
                                        abstractC20522.mo33786(strM138711, strM138712, strM13873, c9938Arr6[iM138633], c9938Arr6[iM138633 + iM138634], iM138635);
                                        iM138632 = i151;
                                        c49911 = c49911;
                                    }
                                }
                            }
                            C4998 c49920 = c49911;
                            if (iArr21 != null) {
                                for (int i153 : iArr21) {
                                    int iM13867 = c49920.m13866(i153);
                                    if (iM13867 == 64 || iM13867 == 65) {
                                        int iM138520 = c49920.m13858(c22638, i153);
                                        c49920.m13857(abstractC20522.mo33779(c22638.f73771, c22638.f73763, c22638.f73768, c22638.f73761, c22638.f73774, c49920.m13873(cArr6, iM138520), true), iM138520 + 2, true, cArr6);
                                    }
                                }
                            }
                            if (iArr22 != null) {
                                for (int i154 : iArr22) {
                                    int iM13868 = c49920.m13866(i154);
                                    if (iM13868 == 64 || iM13868 == 65) {
                                        int iM138521 = c49920.m13858(c22638, i154);
                                        c49920.m13857(abstractC20522.mo33779(c22638.f73771, c22638.f73763, c22638.f73768, c22638.f73761, c22638.f73774, c49920.m13873(cArr6, iM138521), false), iM138521 + 2, true, cArr6);
                                    }
                                }
                            }
                            C11349 c113420 = c113417;
                            while (c113420 != null) {
                                C11349 c113421 = c113420.f38290;
                                c113420.f38290 = null;
                                abstractC20522.mo35166(c113420);
                                c113420 = c113421;
                            }
                            abstractC20522.mo35170(i148, i147);
                            abstractC20521 = abstractC20522;
                            i4 = i89;
                        }
                    }
                }
            }
        } else {
            abstractC20521 = abstractC20521Mo3283;
            i4 = i30;
        }
        abstractC20521.mo35169();
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9938 m13860(int i, C9938[] c9938Arr) {
        if (c9938Arr[i] == null) {
            c9938Arr[i] = new C9938();
        }
        C9938 c9938 = c9938Arr[i];
        c9938.f33932 = (short) (c9938.f33932 & (-2));
        return c9938;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int[] m13863(AbstractC20521 abstractC20521, C22638 c22638, int i, boolean z) {
        int i2;
        char[] cArr = c22638.f73767;
        int iM13869 = m13869(i);
        int[] iArr = new int[iM13869];
        int iM13857 = i + 2;
        for (int i3 = 0; i3 < iM13869; i3++) {
            iArr[i3] = iM13857;
            int iM13872 = m13872(iM13857);
            int i4 = iM13872 >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int iM138610 = m13869(iM13857 + 1);
                                i2 = iM13857 + 3;
                                while (true) {
                                    int i5 = iM138610 - 1;
                                    if (iM138610 > 0) {
                                        int iM138611 = m13869(i2);
                                        int iM138612 = m13869(i2 + 2);
                                        i2 += 6;
                                        m13860(iM138611, c22638.f73770);
                                        m13860(iM138611 + iM138612, c22638.f73770);
                                        iM138610 = i5;
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
                                i2 = iM13857 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iM13857 + 3;
                        break;
                }
            } else {
                i2 = iM13857 + 3;
            }
            int iM13866 = m13866(i2);
            if (i4 == 66) {
                C1470 c1470 = iM13866 != 0 ? new C1470(this.f17402, i2) : null;
                int iM5620 = C1694.m5620(iM13866, 2, 1, i2);
                iM13857 = m13857(abstractC20521.mo33791(iM13872 & (-256), c1470, m13873(cArr, iM5620), z), iM5620 + 2, true, cArr);
            } else {
                iM13857 = m13857((AbstractC9812) null, C1694.m5620(iM13866, 2, 3, i2), true, cArr);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13853(int i, int[] iArr) {
        if (iArr == null || i >= iArr.length || m13866(iArr[i]) < 67) {
            return -1;
        }
        return m13869(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13858(C22638 c22638, int i) {
        int i2;
        int i3;
        int iM13872 = m13872(i);
        int i4 = iM13872 >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iM13872 & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM13872 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = iM13872 & (-65536);
                    i3 = i + 2;
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iM13872 & (-16777216);
                            int iM13869 = m13869(i + 1);
                            i3 = i + 3;
                            c22638.f73768 = new C9938[iM13869];
                            c22638.f73761 = new C9938[iM13869];
                            c22638.f73774 = new int[iM13869];
                            for (int i5 = 0; i5 < iM13869; i5++) {
                                int iM138610 = m13869(i3);
                                int iM138611 = m13869(i3 + 2);
                                int iM138612 = m13869(i3 + 4);
                                i3 += 6;
                                c22638.f73768[i5] = m13860(iM138610, c22638.f73770);
                                c22638.f73761[i5] = m13860(iM138610 + iM138611, c22638.f73770);
                                c22638.f73774[i5] = iM138612;
                            }
                            break;
                        case 66:
                            i2 = iM13872 & (-256);
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iM13872 & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iM13872 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = iM13872 & (-65536);
            i3 = i + 2;
        }
        c22638.f73771 = i2;
        int iM13866 = m13866(i3);
        c22638.f73763 = iM13866 == 0 ? null : new C1470(this.f17402, i3);
        return (iM13866 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13862(AbstractC20521 abstractC20521, C22638 c22638, int i, boolean z) {
        int iM13857 = i + 1;
        int i2 = this.f17402[i] & 255;
        abstractC20521.mo35163(i2, z);
        char[] cArr = c22638.f73767;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM13869 = m13869(iM13857);
            iM13857 += 2;
            while (true) {
                int i4 = iM13869 - 1;
                if (iM13869 > 0) {
                    iM13857 = m13857(abstractC20521.mo33777(i3, m13873(cArr, iM13857), z), iM13857 + 2, true, cArr);
                    iM13869 = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13857(AbstractC9812 abstractC9812, int i, boolean z, char[] cArr) {
        int iM13869 = m13869(i);
        int iM13856 = i + 2;
        if (!z) {
            while (true) {
                int i2 = iM13869 - 1;
                if (iM13869 <= 0) {
                    break;
                }
                iM13856 = m13856(abstractC9812, iM13856, (String) null, cArr);
                iM13869 = i2;
            }
        } else {
            while (true) {
                int i3 = iM13869 - 1;
                if (iM13869 <= 0) {
                    break;
                }
                iM13856 = m13856(abstractC9812, iM13856 + 2, m13873(cArr, iM13856), cArr);
                iM13869 = i3;
            }
        }
        if (abstractC9812 != null) {
            abstractC9812.mo10177();
        }
        return iM13856;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13856(AbstractC9812 abstractC9812, int i, String str, char[] cArr) {
        Object obj;
        byte[] bArr = this.f17402;
        int i2 = 0;
        if (abstractC9812 == null) {
            int i3 = bArr[i] & 255;
            if (i3 == 64) {
                return m13857((AbstractC9812) null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return m13857((AbstractC9812) null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                int[] iArr = this.f17400;
                if (i5 == 83) {
                    abstractC9812.mo10179(Short.valueOf((short) m13872(iArr[m13869(i4)])), str);
                    return i + 3;
                }
                if (i5 == 99) {
                    abstractC9812.mo10179(C14172.m34263(m13873(cArr, i4)), str);
                    return i + 3;
                }
                if (i5 == 101) {
                    abstractC9812.mo10180(str, m13873(cArr, i4), m13873(cArr, i + 3));
                    return i + 5;
                }
                if (i5 == 115) {
                    abstractC9812.mo10179(m13873(cArr, i4), str);
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (m13872(iArr[m13869(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        abstractC9812.mo10179(obj, str);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                abstractC9812.mo10179(Byte.valueOf((byte) m13872(iArr[m13869(i4)])), str);
                                return i + 3;
                            case 67:
                                abstractC9812.mo10179(Character.valueOf((char) m13872(iArr[m13869(i4)])), str);
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int iM13869 = m13869(i4);
                        int i6 = i + 3;
                        if (iM13869 == 0) {
                            return m13857(abstractC9812.mo10175(str), i4, false, cArr);
                        }
                        int i7 = bArr[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[iM13869];
                            while (i2 < iM13869) {
                                fArr[i2] = Float.intBitsToFloat(m13872(iArr[m13869(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            abstractC9812.mo10179(fArr, str);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[iM13869];
                            while (i2 < iM13869) {
                                sArr[i2] = (short) m13872(iArr[m13869(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC9812.mo10179(sArr, str);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[iM13869];
                            for (int i8 = 0; i8 < iM13869; i8++) {
                                zArr[i8] = m13872(iArr[m13869(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            abstractC9812.mo10179(zArr, str);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr2 = new int[iM13869];
                            while (i2 < iM13869) {
                                iArr2[i2] = m13872(iArr[m13869(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC9812.mo10179(iArr2, str);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr2 = new byte[iM13869];
                                    while (i2 < iM13869) {
                                        bArr2[i2] = (byte) m13872(iArr[m13869(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC9812.mo10179(bArr2, str);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[iM13869];
                                    while (i2 < iM13869) {
                                        cArr2[i2] = (char) m13872(iArr[m13869(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC9812.mo10179(cArr2, str);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[iM13869];
                                    while (i2 < iM13869) {
                                        dArr[i2] = Double.longBitsToDouble(m13870(iArr[m13869(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC9812.mo10179(dArr, str);
                                    return i6;
                                default:
                                    return m13857(abstractC9812.mo10175(str), i4, false, cArr);
                            }
                        }
                        long[] jArr = new long[iM13869];
                        while (i2 < iM13869) {
                            jArr[i2] = m13870(iArr[m13869(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        abstractC9812.mo10179(jArr, str);
                        return i6;
                    }
                }
            }
            abstractC9812.mo10179(m13867(cArr, m13869(i4)), str);
            return i + 3;
        }
        return m13857(abstractC9812.mo10176(str, m13873(cArr, i4)), i + 3, true, cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13854(int i, Object[] objArr, int i2, char[] cArr, C9938[] c9938Arr) {
        int i3 = i + 1;
        switch (this.f17402[i] & 255) {
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
                objArr[i2] = m13852(cArr, i3);
                break;
            case 8:
                objArr[i2] = m13860(m13869(i3), c9938Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13865() {
        int i = this.f17403;
        int iM13869 = (m13869(i + 6) * 2) + i + 8;
        int iM138610 = m13869(iM13869);
        int iM13872 = iM13869 + 2;
        while (true) {
            int i2 = iM138610 - 1;
            if (iM138610 <= 0) {
                break;
            }
            int iM138611 = m13869(iM13872 + 6);
            iM13872 += 8;
            while (true) {
                int i3 = iM138611 - 1;
                if (iM138611 > 0) {
                    iM13872 += m13872(iM13872 + 2) + 6;
                    iM138611 = i3;
                }
            }
            iM138610 = i2;
        }
        int iM138612 = m13869(iM13872);
        int iM13873 = iM13872 + 2;
        while (true) {
            int i4 = iM138612 - 1;
            if (iM138612 <= 0) {
                return iM13873 + 2;
            }
            int iM138613 = m13869(iM13873 + 6);
            iM13873 += 8;
            while (true) {
                int i5 = iM138613 - 1;
                if (iM138613 > 0) {
                    iM13873 += m13872(iM13873 + 2) + 6;
                    iM138613 = i5;
                }
            }
            iM138612 = i4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11349 m13861(C11349[] c11349Arr, String str, int i, int i2, char[] cArr, int i3, C9938[] c9938Arr) {
        if (i2 > this.f17402.length - i) {
            throw new IllegalArgumentException();
        }
        for (C11349 c11349 : c11349Arr) {
            if (c11349.f38289.equals(str)) {
                return c11349.m28429(this, i, i2, cArr);
            }
        }
        return new C11349(str).m28429(this, i, i2, (char[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13866(int i) {
        return this.f17402[i] & 255;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13869(int i) {
        byte[] bArr = this.f17402;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short m13864(int i) {
        byte[] bArr = this.f17402;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m13872(int i) {
        byte[] bArr = this.f17402;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m13870(int i) {
        return (((long) m13872(i)) << 32) | (((long) m13872(i + 4)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m13873(char[] cArr, int i) {
        int iM13869 = m13869(i);
        if (i == 0 || iM13869 == 0) {
            return null;
        }
        return m13871(cArr, iM13869);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m13871(char[] cArr, int i) {
        String[] strArr = this.f17398;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f17400[i];
        String strM13859 = m13859(cArr, i2 + 2, m13869(i2));
        strArr[i] = strM13859;
        return strM13859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m13859(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f17402;
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m13852(char[] cArr, int i) {
        return m13873(cArr, this.f17400[m13869(i)]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13867(char[] cArr, int i) {
        int[] iArr = this.f17400;
        int i2 = iArr[i];
        byte[] bArr = this.f17402;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m13872(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m13872(i2)));
            case 5:
                return Long.valueOf(m13870(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m13870(i2)));
            case 7:
                return C14172.m34261(m13873(cArr, i2));
            case 8:
                return m13873(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int iM13866 = m13866(i2);
                        int i3 = iArr[m13869(i2 + 1)];
                        int i4 = iArr[m13869(i3 + 2)];
                        return new C19110(iM13866, m13852(cArr, i3), m13873(cArr, i4), m13873(cArr, i4 + 2), bArr[i3 - 1] == 11);
                    case 16:
                        return C14172.m34258(m13873(cArr, i2));
                    case 17:
                        C3586[] c3586Arr = this.f17401;
                        C3586 c3586 = c3586Arr[i];
                        if (c3586 != null) {
                            return c3586;
                        }
                        int i5 = iArr[m13869(i2 + 2)];
                        String strM13873 = m13873(cArr, i5);
                        String strM13874 = m13873(cArr, i5 + 2);
                        int i6 = this.f17399[m13869(i2)];
                        C19110 c19110 = (C19110) m13867(cArr, m13869(i6));
                        int iM13869 = m13869(i6 + 2);
                        Object[] objArr = new Object[iM13869];
                        int i7 = i6 + 4;
                        for (int i8 = 0; i8 < iM13869; i8++) {
                            objArr[i8] = m13867(cArr, m13869(i7));
                            i7 += 2;
                        }
                        C3586 c3587 = new C3586(strM13873, strM13874, c19110, objArr);
                        c3586Arr[i] = c3587;
                        return c3587;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
