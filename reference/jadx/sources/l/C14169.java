package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܳ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14169 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f46490;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f46491;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f46492;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46493;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f46494;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f46495;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f46496;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f46497;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f46498;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final CharSequence f46499;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46500 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f46501;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f46502;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18503 f46503;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34249(int i) {
        return i == 15 || i == 19 || i == 8 || i == 17;
    }

    public C14169(CharSequence charSequence, C4943 c4943, C23289 c23289, C12052 c12052, C5701 c5701, boolean z, C18503 c18503) {
        String string;
        this.f46499 = charSequence;
        this.f46498 = z;
        if (c12052.m29954()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c12052.m29953());
            if (iMax < 0) {
                throw new IllegalArgumentException(C8479.m22141(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C2271.m6966(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f46494 = string;
        this.f46493 = c5701.m15727();
        this.f46490 = c5701.m15729().isEmpty() ? C3894.m11327(charSequence) : c5701.m15729();
        this.f46502 = c5701.m15728();
        this.f46503 = c18503;
        int[] iArr = new int[c4943.size()];
        Arrays.fill(iArr, -1);
        for (InterfaceC19761 interfaceC19761 : c4943.m13723()) {
            C3894.m11326();
            if (interfaceC19761.mo22512() == 0 && interfaceC19761.getType() != -1) {
                iArr[interfaceC19761.mo22511()] = this.f46500.size();
                this.f46500.add(interfaceC19761);
            }
        }
        int[] iArr2 = new int[this.f46500.size()];
        this.f46492 = iArr2;
        Arrays.fill(iArr2, -1);
        int size = this.f46500.size() + 1;
        this.f46491 = new int[size];
        this.f46496 = new int[size];
        this.f46495 = new boolean[size];
        this.f46497 = new boolean[this.f46500.size()];
        this.f46501 = new boolean[this.f46500.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c23289);
        while (!arrayDeque.isEmpty()) {
            C3894.m11326();
            InterfaceC14988 interfaceC14988 = (InterfaceC14988) arrayDeque.pop();
            if (interfaceC14988 instanceof C23289) {
                C23289 c232810 = (C23289) interfaceC14988;
                int iMo1058 = c232810.mo1058();
                if (iMo1058 == 5 || iMo1058 == 6 || iMo1058 == 7 || iMo1058 == 8) {
                    InterfaceC19761 interfaceC19762 = c232810.f75536;
                    InterfaceC19761 interfaceC19763 = c232810.f75537;
                    if (interfaceC19762 != null && interfaceC19763 != null && interfaceC19762.mo22511() >= 0 && interfaceC19763.mo22511() >= 0) {
                        int i2 = iArr[interfaceC19762.mo22511()];
                        int i3 = iArr[interfaceC19763.mo22511()];
                        if (i2 >= 0 && i3 > i2) {
                            int iM34251 = m34251(i2);
                            int iM34252 = m34251(i3);
                            if ((iM34251 == 15 && iM34252 == 16) || ((iM34251 == 17 && iM34252 == 18) || ((iM34251 == 8 || iM34251 == 19) && iM34252 == 20))) {
                                int[] iArr3 = this.f46492;
                                iArr3[i2] = i3;
                                iArr3[i3] = i2;
                            }
                        }
                    }
                }
                for (int childCount = c232810.getChildCount() - 1; childCount >= 0; childCount--) {
                    arrayDeque.push(c232810.mo22136(childCount));
                }
            }
        }
        for (int i4 = 0; i4 < this.f46500.size(); i4++) {
            C3894.m11326();
            if (m34249(m34251(i4)) && this.f46492[i4] < 0) {
                m34246(i4, this.f46500.size() + 1);
                return;
            }
            if (m34251(i4) == 7) {
                this.f46495[i4 + 1] = true;
            }
            if (m34251(i4) == 24 && ((InterfaceC19761) this.f46500.get(i4)).getText().equals("\\")) {
                this.f46495[i4 + 1] = true;
            }
            int iM34253 = m34251(i4);
            if ((iM34253 == 16 || iM34253 == 20 || iM34253 == 18) && this.f46492[i4] < 0) {
                boolean[] zArr = this.f46495;
                zArr[i4 + 1] = true;
                zArr[i4] = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34253(EnumC16990 enumC16990) {
        ArrayList arrayList = this.f46500;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int[] iArr = this.f46491;
        iArr[size] = 1;
        iArr[0] = 1;
        if (enumC16990 != EnumC16990.COMPONENT_VALUES) {
            m34247(0, arrayList.size(), 0, enumC16990 == EnumC16990.DECLARATION_LIST);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:218:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0301  */
    /* JADX WARN: Code duplicated, block: B:223:0x0315  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:227:0x033b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0341  */
    /* JADX WARN: Code duplicated, block: B:231:0x0359  */
    /* JADX WARN: Code duplicated, block: B:242:0x0383  */
    /* JADX WARN: Code duplicated, block: B:246:0x0395  */
    /* JADX WARN: Code duplicated, block: B:248:0x039c A[PHI: r4 r9
      0x039c: PHI (r4v19 int) = (r4v4 int), (r4v4 int), (r4v21 int) binds: [B:224:0x0331, B:228:0x033f, B:388:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r9v9 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v2 java.util.ArrayList), (r9v11 java.util.ArrayList) binds: [B:224:0x0331, B:228:0x033f, B:388:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:255:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:257:0x03be  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:273:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:294:0x042d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0434  */
    /* JADX WARN: Code duplicated, block: B:297:0x0444  */
    /* JADX WARN: Code duplicated, block: B:299:0x0448  */
    /* JADX WARN: Code duplicated, block: B:301:0x044c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0457  */
    /* JADX WARN: Code duplicated, block: B:305:0x045e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0463  */
    /* JADX WARN: Code duplicated, block: B:332:0x04b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:344:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:347:0x04dd A[LOOP:2: B:343:0x04d1->B:347:0x04dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:350:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34247(int i, int i2, int i3, boolean z) {
        int[] iArr;
        int i4;
        int i5;
        int length;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMo22510;
        int i15;
        ArrayList arrayList;
        int i16;
        int iMo22511;
        int iMo22508;
        CharSequence charSequence;
        int i17;
        byte b;
        int i18;
        boolean z3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int[] iArr2 = this.f46496;
        int i24 = i;
        Arrays.fill(iArr2, i24, i2, i3);
        while (i24 < i2) {
            C3894.m11326();
            int iM34251 = m34251(i24);
            int[] iArr3 = this.f46491;
            if (iM34251 == 22) {
                iArr3[i24] = 1;
                i24++;
                if (i24 < i2) {
                    iArr3[i24] = 3;
                }
            } else {
                ArrayList arrayList2 = this.f46500;
                boolean z4 = z && (i23 = i24 + 1) < i2 && m34251(i24) == 14 && m34251(i23) == 21 && AbstractC9230.m23751(((InterfaceC19761) arrayList2.get(i24)).getText()).startsWith("--");
                int i25 = i24;
                while (true) {
                    iArr = this.f46492;
                    if (i25 < i2) {
                        C3894.m11326();
                        i4 = 1;
                        int iM34252 = m34251(i25);
                        if (m34249(iM34252)) {
                            int i26 = iArr[i25];
                            if (i26 < 0 || i26 >= i2) {
                                m34246(i24, i2);
                                return;
                            } else if (iM34252 != 15 || z4) {
                                i25 = i26 + 1;
                            } else {
                                i5 = i25;
                            }
                        } else if (iM34252 != 22) {
                            if (iM34252 == 16 || iM34252 == 20 || iM34252 == 18) {
                                m34246(i24, i25 + 1);
                            } else {
                                i25++;
                            }
                        }
                    } else {
                        i4 = 1;
                    }
                    i5 = -1;
                }
                boolean z5 = this.f46498;
                if (i5 >= 0) {
                    int i27 = iArr[i5];
                    if (m34251(i24) != 9) {
                        length = (this.f46494.length() * i3) + this.f46493.length();
                        i6 = i24;
                        i7 = 23;
                        while (i6 < i5) {
                            C3894.m11326();
                            iMo22510 = (((InterfaceC19761) arrayList2.get(i6)).mo22510() - ((InterfaceC19761) arrayList2.get(i6)).mo22508()) + 1 + length;
                            if (i6 > i24) {
                                i15 = i24;
                                arrayList = arrayList2;
                                break;
                            }
                            i16 = i6 - 1;
                            if (m34251(i16) == i7) {
                                i15 = i24;
                                arrayList = arrayList2;
                            } else {
                                if (m34251(i6) != i7) {
                                    i15 = i24;
                                    arrayList = arrayList2;
                                    break;
                                }
                                iMo22511 = ((InterfaceC19761) arrayList2.get(i16)).mo22510() + 1;
                                iMo22508 = ((InterfaceC19761) arrayList2.get(i6)).mo22508();
                                while (true) {
                                    if (iMo22511 < iMo22508) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    charSequence = this.f46499;
                                    arrayList = arrayList2;
                                    i15 = i24;
                                    if (charSequence.charAt(iMo22511) != '/') {
                                        if (AbstractC9230.m23750(charSequence.charAt(iMo22511))) {
                                            iMo22511++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                        }
                                    } else if (AbstractC9230.m23750(charSequence.charAt(iMo22511))) {
                                        iMo22511++;
                                        arrayList2 = arrayList;
                                        i24 = i15;
                                    }
                                }
                            }
                            iMo22510++;
                            break;
                            break;
                            length = iMo22510;
                            i6++;
                            i7 = 23;
                            arrayList2 = arrayList;
                            i24 = i15;
                        }
                        i8 = i24;
                        if (z5) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        while (i8 < i5) {
                            C3894.m11326();
                            if (!m34249(m34251(i8))) {
                                if (m34251(i8) == 23) {
                                    iArr3[i8] = i4;
                                    i12 = i8 + 1;
                                    if (i12 < i5) {
                                        if (z2) {
                                            i13 = 3;
                                        } else {
                                            i13 = 2;
                                        }
                                        iArr3[i12] = i13;
                                    }
                                }
                            } else if (m34251(i8) == 23) {
                                iArr3[i8] = i4;
                                i12 = i8 + 1;
                                if (i12 < i5) {
                                    if (z2) {
                                        i13 = 3;
                                    } else {
                                        i13 = 2;
                                    }
                                    iArr3[i12] = i13;
                                }
                            }
                            i8++;
                        }
                        iArr3[i5] = 2;
                        i9 = i5 + 1;
                        if (i9 == i27) {
                            i10 = 1;
                        } else {
                            i10 = 3;
                        }
                        iArr3[i27] = i10;
                        iArr2[i27] = i3;
                        i11 = 3;
                        if (i9 < i27) {
                            iArr3[i9] = 3;
                            m34247(i9, i27, i3 + 1, true);
                        }
                    } else {
                        String strM23749 = AbstractC9230.m23749(AbstractC9230.m23751(((InterfaceC19761) arrayList2.get(i24)).getText()));
                        strM23749.getClass();
                        switch (strM23749.hashCode()) {
                            case -2010008239:
                                if (!strM23749.equals("@styleset")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -1638716285:
                                if (!strM23749.equals("@-moz-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -1580274675:
                                if (!strM23749.equals("@top-center")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case -1565019305:
                                if (!strM23749.equals("@position-try")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case -1376175420:
                                if (!strM23749.equals("@supports")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case -1324184772:
                                if (!strM23749.equals("@right-bottom")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case -1278440229:
                                if (!strM23749.equals("@font-face")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case -1262235164:
                                if (!strM23749.equals("@right-top")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case -1152996743:
                                if (!strM23749.equals("@bottom-left-corner")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case -1138628731:
                                if (!strM23749.equals("@keyframes")) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case -1029700792:
                                if (!strM23749.equals("@bottom-right-corner")) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            case -1015297370:
                                if (!strM23749.equals("@right-middle")) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case -1006843036:
                                if (!strM23749.equals("@top-right")) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case -1002353161:
                                if (!strM23749.equals("@bottom-center")) {
                                    b = -1;
                                } else {
                                    b = cb.k;
                                }
                                break;
                            case -984014295:
                                if (!strM23749.equals("@bottom-left")) {
                                    b = -1;
                                } else {
                                    b = cb.f77931l;
                                }
                                break;
                            case -725398081:
                                if (!strM23749.equals("@top-left")) {
                                    b = -1;
                                } else {
                                    b = 15;
                                }
                                break;
                            case -706109931:
                                if (!strM23749.equals("@property")) {
                                    b = -1;
                                } else {
                                    b = 16;
                                }
                                break;
                            case -595813521:
                                if (!strM23749.equals("@annotation")) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case -442928718:
                                if (!strM23749.equals("@font-palette-values")) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case -434011078:
                                if (!strM23749.equals("@bottom-right")) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case -431592131:
                                if (!strM23749.equals("@view-transition")) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case -391400291:
                                if (!strM23749.equals("@-moz-document")) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case -116166108:
                                if (!strM23749.equals("@starting-style")) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case -102919103:
                                if (!strM23749.equals("@container")) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case -41902889:
                                if (!strM23749.equals("@font-feature-values")) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 42653863:
                                if (!strM23749.equals("@-webkit-keyframes")) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 62538447:
                                if (!strM23749.equals("@page")) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 82937215:
                                if (!strM23749.equals("@ornaments")) {
                                    b = -1;
                                } else {
                                    b = 27;
                                }
                                break;
                            case 286681635:
                                if (!strM23749.equals("@top-left-corner")) {
                                    b = -1;
                                } else {
                                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                }
                                break;
                            case 451773024:
                                if (!strM23749.equals("@counter-style")) {
                                    b = -1;
                                } else {
                                    b = 29;
                                }
                                break;
                            case 594607521:
                                if (!strM23749.equals("@character-variant")) {
                                    b = -1;
                                } else {
                                    b = 30;
                                }
                                break;
                            case 650655966:
                                if (!strM23749.equals("@top-right-corner")) {
                                    b = -1;
                                } else {
                                    b = bo.j;
                                }
                                break;
                            case 1026618993:
                                if (!strM23749.equals("@left-bottom")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_CS3;
                                }
                                break;
                            case 1148752219:
                                if (!strM23749.equals("@document")) {
                                    b = -1;
                                } else {
                                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                                }
                                break;
                            case 1335506395:
                                if (!strM23749.equals("@left-middle")) {
                                    b = -1;
                                } else {
                                    b = 34;
                                }
                                break;
                            case 1935015185:
                                if (!strM23749.equals("@layer")) {
                                    b = -1;
                                } else {
                                    b = 35;
                                }
                                break;
                            case 1936037796:
                                if (!strM23749.equals("@media")) {
                                    b = -1;
                                } else {
                                    b = 36;
                                }
                                break;
                            case 1941530132:
                                if (!strM23749.equals("@scope")) {
                                    b = -1;
                                } else {
                                    b = 37;
                                }
                                break;
                            case 1942112594:
                                if (!strM23749.equals("@swash")) {
                                    b = -1;
                                } else {
                                    b = 38;
                                }
                                break;
                            case 2004302543:
                                if (!strM23749.equals("@left-top")) {
                                    b = -1;
                                } else {
                                    b = 39;
                                }
                                break;
                            case 2117962288:
                                if (!strM23749.equals("@stylistic")) {
                                    b = -1;
                                } else {
                                    b = 40;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
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
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
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
                                length = (this.f46494.length() * i3) + this.f46493.length();
                                i6 = i24;
                                i7 = 23;
                                while (i6 < i5) {
                                    C3894.m11326();
                                    iMo22510 = (((InterfaceC19761) arrayList2.get(i6)).mo22510() - ((InterfaceC19761) arrayList2.get(i6)).mo22508()) + 1 + length;
                                    if (i6 > i24) {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    i16 = i6 - 1;
                                    if (m34251(i16) == i7) {
                                        if (m34251(i6) != i7) {
                                            i15 = i24;
                                            arrayList = arrayList2;
                                        }
                                        iMo22511 = ((InterfaceC19761) arrayList2.get(i16)).mo22510() + 1;
                                        iMo22508 = ((InterfaceC19761) arrayList2.get(i6)).mo22508();
                                        while (true) {
                                            if (iMo22511 < iMo22508) {
                                                i15 = i24;
                                                arrayList = arrayList2;
                                            }
                                            charSequence = this.f46499;
                                            arrayList = arrayList2;
                                            i15 = i24;
                                            if (charSequence.charAt(iMo22511) != '/' && (i17 = iMo22511 + 1) < iMo22508 && charSequence.charAt(i17) == '*') {
                                                int iM48079 = C21460.m48079("*/", charSequence, iMo22511 + 2);
                                                if (iM48079 >= 0 && iM48079 < iMo22508) {
                                                    iMo22511 = iM48079 + 1;
                                                }
                                                break;
                                            } else if (AbstractC9230.m23750(charSequence.charAt(iMo22511))) {
                                            }
                                            iMo22511++;
                                            arrayList2 = arrayList;
                                            i24 = i15;
                                            break;
                                        }
                                        break;
                                    } else {
                                        i15 = i24;
                                        arrayList = arrayList2;
                                    }
                                    iMo22510++;
                                    break;
                                    length = iMo22510;
                                    i6++;
                                    i7 = 23;
                                    arrayList2 = arrayList;
                                    i24 = i15;
                                }
                                i8 = i24;
                                if (z5 || length <= this.f46502) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                while (i8 < i5) {
                                    C3894.m11326();
                                    if (!m34249(m34251(i8)) && (i14 = iArr[i8]) >= 0) {
                                        i8 = i14;
                                    } else if (m34251(i8) == 23) {
                                        iArr3[i8] = i4;
                                        i12 = i8 + 1;
                                        if (i12 < i5) {
                                            if (z2) {
                                                i13 = 3;
                                            } else {
                                                i13 = 2;
                                            }
                                            iArr3[i12] = i13;
                                        }
                                    }
                                    i8++;
                                }
                                iArr3[i5] = 2;
                                i9 = i5 + 1;
                                if (i9 == i27) {
                                    i10 = 1;
                                } else {
                                    i10 = 3;
                                }
                                iArr3[i27] = i10;
                                iArr2[i27] = i3;
                                i11 = 3;
                                if (i9 < i27) {
                                    iArr3[i9] = 3;
                                    m34247(i9, i27, i3 + 1, true);
                                }
                                break;
                            default:
                                m34246(i24, i27 + 1);
                                i11 = 3;
                                break;
                        }
                    }
                    int i28 = i27 + 1;
                    if (i28 < i2) {
                        iArr3[i28] = i11;
                    }
                    i24 = i28;
                } else {
                    int i29 = i24;
                    if (!z || (i22 = i29 + 1) >= i25) {
                        i18 = i29;
                    } else {
                        i18 = i29;
                        if (m34251(i18) == 14 && m34251(i22) == 21) {
                            z3 = true;
                        }
                        if (z3) {
                            iArr3[i18 + 1] = 1;
                            if (z4) {
                                m34246(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                            } else {
                                i20 = i18 + 2;
                                if (i20 < i25) {
                                    iArr3[i20] = 2;
                                    while (i20 < i25) {
                                        C3894.m11326();
                                        if (m34251(i20) == 23) {
                                            iArr3[i20] = 1;
                                            i21 = i20 + 1;
                                            if (i21 < i25) {
                                                iArr3[i21] = 2;
                                            }
                                        }
                                        i20++;
                                    }
                                }
                            }
                        } else if (m34251(i18) != 9 && m34251(i18) != 4 && m34251(i18) != 5) {
                            m34246(i18, Math.min(arrayList2.size(), i25 + 1));
                        }
                        if (i25 >= i2 && m34251(i25) == 22) {
                            if (!z4) {
                                iArr3[i25] = 1;
                            }
                            if (z5 && z3 && !z4 && i25 + 1 == i2 && i2 < arrayList2.size() && m34251(i2) == 16) {
                                this.f46497[i25] = true;
                            }
                            i25++;
                            if (i25 < i2) {
                                iArr3[i25] = 3;
                            }
                        } else {
                            if (!z5 && z3 && !z4 && i18 + 2 < i25 && i25 == i2 && i2 < arrayList2.size() && m34251(i2) == 16) {
                                i19 = i18;
                                while (true) {
                                    if (i19 <= i25) {
                                        C3894.m11326();
                                        if (!this.f46495[i19]) {
                                            i19++;
                                        }
                                    } else {
                                        this.f46501[i25 - 1] = true;
                                    }
                                }
                            }
                            if (i25 == i18) {
                                i25++;
                            }
                        }
                        i24 = i25;
                    }
                    z3 = false;
                    if (z3) {
                        iArr3[i18 + 1] = 1;
                        if (z4) {
                            m34246(i18 + 2, Math.min(arrayList2.size(), i25 + 1));
                        } else {
                            i20 = i18 + 2;
                            if (i20 < i25) {
                                iArr3[i20] = 2;
                                while (i20 < i25) {
                                    C3894.m11326();
                                    if (m34251(i20) == 23) {
                                        iArr3[i20] = 1;
                                        i21 = i20 + 1;
                                        if (i21 < i25) {
                                            iArr3[i21] = 2;
                                        }
                                    }
                                    i20++;
                                }
                            }
                        }
                    } else if (m34251(i18) != 9) {
                        m34246(i18, Math.min(arrayList2.size(), i25 + 1));
                    }
                    if (i25 >= i2) {
                        if (!z5) {
                            i19 = i18;
                            while (true) {
                                if (i19 <= i25) {
                                    C3894.m11326();
                                    if (!this.f46495[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f46501[i25 - 1] = true;
                                }
                            }
                        }
                        if (i25 == i18) {
                            i25++;
                        }
                    } else {
                        if (!z5) {
                            i19 = i18;
                            while (true) {
                                if (i19 <= i25) {
                                    C3894.m11326();
                                    if (!this.f46495[i19]) {
                                        i19++;
                                    }
                                } else {
                                    this.f46501[i25 - 1] = true;
                                }
                            }
                        }
                        if (i25 == i18) {
                            i25++;
                        }
                    }
                    i24 = i25;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34252() throws Throwable {
        int i = 0;
        int iMo22510 = 0;
        InterfaceC19761 interfaceC19761 = null;
        while (true) {
            ArrayList arrayList = this.f46500;
            int size = arrayList.size();
            CharSequence charSequence = this.f46499;
            if (i < size) {
                C3894.m11326();
                InterfaceC19761 interfaceC19762 = (InterfaceC19761) arrayList.get(i);
                if (this.f46497[i]) {
                    m34248(C21460.m48081(iMo22510, interfaceC19762.mo22508(), charSequence), i, interfaceC19761, (InterfaceC19761) null);
                    iMo22510 = interfaceC19762.mo22510() + 1;
                } else {
                    m34248(C21460.m48081(iMo22510, interfaceC19762.mo22508(), charSequence), i, interfaceC19761, interfaceC19762);
                    C18503 c18503 = this.f46503;
                    if (c18503.length() == 0 && !this.f46498) {
                        c18503.append((CharSequence) this.f46493);
                    }
                    c18503.m42896(interfaceC19762.mo22508(), interfaceC19762.mo22510() + 1, charSequence);
                    if (this.f46501[i]) {
                        c18503.append(';');
                    }
                    iMo22510 = interfaceC19762.mo22510() + 1;
                    interfaceC19761 = interfaceC19762;
                }
                i++;
            } else {
                m34248(C21460.m48081(iMo22510, charSequence.length(), charSequence), arrayList.size(), interfaceC19761, (InterfaceC19761) null);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34248(String str, int i, InterfaceC19761 interfaceC19761, InterfaceC19761 interfaceC19762) throws Throwable {
        int i2;
        boolean z = this.f46495[i];
        C18503 c18503 = this.f46503;
        if (z) {
            c18503.append((CharSequence) str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int length = str.length();
            boolean z5 = this.f46498;
            if (i3 >= length) {
                if (!z5 && z2) {
                    c18503.append((CharSequence) str);
                    return;
                }
                int i4 = this.f46491[i];
                if (z5) {
                    if (z3) {
                        c18503.append((CharSequence) sb);
                    }
                    if (z4 && i4 == 0 && interfaceC19761 != null && interfaceC19762 != null) {
                        c18503.append(' ');
                        return;
                    }
                    if (z3) {
                        return;
                    }
                    if (m34250(interfaceC19762) || (!str.isEmpty() && C18171.m42293(interfaceC19761, interfaceC19762))) {
                        c18503.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
                if (interfaceC19762 == null || interfaceC19761 == null) {
                    return;
                }
                if (i4 == 3) {
                    c18503.append((CharSequence) this.f46490).append((CharSequence) this.f46493);
                    for (int i5 = 0; i5 < this.f46496[i]; i5++) {
                        c18503.append((CharSequence) this.f46494);
                    }
                    return;
                }
                if (i4 == 2 || (i4 == 0 && z4)) {
                    c18503.append(' ');
                    return;
                } else {
                    if (m34250(interfaceC19762) || (!str.isEmpty() && C18171.m42293(interfaceC19761, interfaceC19762))) {
                        c18503.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
            }
            if ((i3 & 1023) == 0) {
                C3894.m11326();
            }
            char cCharAt = str.charAt(i3);
            if (AbstractC9230.m23750(cCharAt)) {
                i3++;
                z4 = true;
            } else if (cCharAt == '/' && (i2 = i3 + 1) < str.length() && str.charAt(i2) == '*') {
                int i6 = i3 + 2;
                int iIndexOf = str.indexOf("*/", i6);
                boolean z6 = iIndexOf < 0;
                int length2 = z6 ? str.length() : iIndexOf + 2;
                if (!z5 || z6 || (i6 < length2 && str.charAt(i6) == '!')) {
                    sb.append((CharSequence) str, i3, length2);
                    z3 = true;
                } else {
                    String strM23749 = AbstractC9230.m23749(str.substring(i3, length2));
                    if (strM23749.contains("@license") || strM23749.contains("@preserve")) {
                        sb.append((CharSequence) str, i3, length2);
                        z3 = true;
                    }
                }
                z2 = true;
                i3 = length2;
            } else {
                c18503.append((CharSequence) str);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m34250(InterfaceC19761 interfaceC19761) {
        C18503 c18503 = this.f46503;
        int length = c18503.length();
        return interfaceC19761 != null && length >= 2 && c18503.charAt(length + (-2)) == '<' && c18503.charAt(length - 1) == '!' && interfaceC19761.getText().startsWith("--");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34246(int i, int i2) {
        boolean[] zArr = this.f46495;
        Arrays.fill(zArr, i, Math.min(zArr.length, i2), true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m34251(int i) {
        return ((InterfaceC19761) this.f46500.get(i)).getType();
    }
}
