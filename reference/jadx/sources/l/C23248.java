package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.᩺᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 54J3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20521 f75427;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9116 f75428;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9137 f75429;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51298(AbstractC7830 abstractC7830, C2785 c2785) {
        m51297(abstractC7830.f25764, c2785);
        int[] iArr = C7019.f23589;
        EnumC9947 enumC9947 = abstractC7830.f23823;
        int i = iArr[enumC9947.ordinal()];
        if (i == 2) {
            C9821 c9821 = (C9821) abstractC7830;
            c2785.mo33785(m51293(c9821.f33568), 178, c9821.f33570, c9821.f33569);
            return;
        }
        if (i == 3) {
            C9821 c9822 = (C9821) abstractC7830;
            c2785.mo33785(m51293(c9822.f33568), 180, c9822.f33570, c9822.f33569);
            return;
        }
        switch (i) {
            case 21:
                String str = ((C14886) abstractC7830).f48643;
                char cCharAt = str.charAt(0);
                if (cCharAt != 'F') {
                    if (cCharAt != 'L') {
                        if (cCharAt != 'S') {
                            if (cCharAt != 'I') {
                                if (cCharAt != 'J') {
                                    if (cCharAt != 'Z') {
                                        if (cCharAt != '[') {
                                            switch (cCharAt) {
                                                case 'B':
                                                    c2785.mo35172(188, 8);
                                                    break;
                                                case 'C':
                                                    c2785.mo35172(188, 5);
                                                    break;
                                                case 'D':
                                                    c2785.mo35172(188, 7);
                                                    break;
                                            }
                                        }
                                    } else {
                                        c2785.mo35172(188, 4);
                                        break;
                                    }
                                } else {
                                    c2785.mo35172(188, 11);
                                    break;
                                }
                            } else {
                                c2785.mo35172(188, 10);
                                break;
                            }
                        } else {
                            c2785.mo35172(188, 9);
                            break;
                        }
                    }
                    c2785.mo33790(189, C14172.m34263(str).m34266());
                } else {
                    c2785.mo35172(188, 6);
                }
                break;
            case 22:
            case 23:
                c2785.mo33790(enumC9947 == EnumC9947.CHECK_CAST ? 192 : 193, m51293(((C14886) abstractC7830).f48643));
                break;
            case 24:
                C23932 c23932 = (C23932) abstractC7830;
                String str2 = abstractC7830.f25764.f23821;
                String str3 = c23932.f77509;
                if (!str2.equals(str3)) {
                    char cCharAt2 = str2.charAt(0);
                    if (cCharAt2 != 'F') {
                        if (cCharAt2 != 'S' && cCharAt2 != 'Z' && cCharAt2 != 'I') {
                            if (cCharAt2 == 'J') {
                                char cCharAt3 = str3.charAt(0);
                                if (cCharAt3 == 'D') {
                                    c2785.mo35159(138);
                                    break;
                                } else if (cCharAt3 == 'F') {
                                    c2785.mo35159(137);
                                    break;
                                } else if (cCharAt3 == 'I') {
                                    c2785.mo35159(136);
                                    break;
                                }
                            } else {
                                switch (cCharAt2) {
                                    case 'D':
                                        char cCharAt4 = str3.charAt(0);
                                        if (cCharAt4 == 'F') {
                                            c2785.mo35159(144);
                                            break;
                                        } else if (cCharAt4 == 'I') {
                                            c2785.mo35159(142);
                                            break;
                                        } else if (cCharAt4 == 'J') {
                                            c2785.mo35159(143);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        char cCharAt5 = str3.charAt(0);
                        if (cCharAt5 != 'F') {
                            if (cCharAt5 != 'J') {
                                if (cCharAt5 != 'S') {
                                    switch (cCharAt5) {
                                        case 'B':
                                            c2785.mo35159(145);
                                            break;
                                        case 'C':
                                            c2785.mo35159(146);
                                            break;
                                        case 'D':
                                            c2785.mo35159(135);
                                            break;
                                    }
                                } else {
                                    c2785.mo35159(147);
                                    break;
                                }
                            } else {
                                c2785.mo35159(133);
                                break;
                            }
                        } else {
                            c2785.mo35159(134);
                            break;
                        }
                    } else {
                        char cCharAt6 = str3.charAt(0);
                        if (cCharAt6 == 'D') {
                            c2785.mo35159(141);
                            break;
                        } else if (cCharAt6 == 'I') {
                            c2785.mo35159(139);
                            break;
                        } else if (cCharAt6 == 'J') {
                            c2785.mo35159(140);
                            break;
                        }
                    }
                }
                break;
            case 25:
                c2785.mo35159(190);
                break;
            case 26:
                c2785.mo35159(m51292(116, abstractC7830.f23821));
                break;
            case 27:
                if (abstractC7830.f25764.f23821.equals("I")) {
                    c2785.mo8457((Object) (-1));
                    c2785.mo35159(m51292(130, abstractC7830.f23821));
                } else if (abstractC7830.f25764.f23821.equals("J")) {
                    c2785.mo8457((Object) (-1L));
                    c2785.mo35159(m51292(130, abstractC7830.f23821));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51304(C9137 c9137) {
        this.f75429 = c9137;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51303(C9116 c9116) {
        this.f75428 = c9116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51305(AbstractC20521 abstractC20521) {
        this.f75427 = abstractC20521;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0316  */
    /* JADX WARN: Code duplicated, block: B:125:0x0329 A[LOOP:5: B:124:0x0327->B:125:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c9 A[LOOP:7: B:152:0x03c7->B:153:0x03c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0549  */
    /* JADX WARN: Code duplicated, block: B:212:0x054e  */
    /* JADX WARN: Code duplicated, block: B:213:0x055a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0562  */
    /* JADX WARN: Code duplicated, block: B:217:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0571  */
    /* JADX WARN: Code duplicated, block: B:303:0x0585 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51302() {
        char cCharAt;
        int i;
        int iIntValue;
        String strSubstring;
        int iM51292;
        int i2;
        boolean z;
        byte[] bArrM51301;
        int i3;
        int iM51293;
        int i4;
        byte[] bArrArray;
        for (AbstractC4777 abstractC4777 : this.f75428.f31045) {
            if (abstractC4777.f16795 == EnumC2890.LABEL) {
                ((C17002) abstractC4777).f54352 = new C9938();
            }
        }
        C9116 c9116 = this.f75428;
        C2785 c2785 = new C2785(this.f75427);
        int i5 = 0;
        Iterator it = c9116.f31044.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C2184) it.next()).f7921);
        }
        new HashMap();
        for (AbstractC4777 abstractC4778 : c9116.f31045) {
            switch (C7019.f23588[abstractC4778.f16795.ordinal()]) {
                case 1:
                    C17002 c17002 = (C17002) abstractC4778;
                    C9938 c9938 = c17002.f54352;
                    c2785.mo35164(c9938);
                    int i6 = c17002.f54353;
                    if (i6 >= 0) {
                        c2785.mo35174(i6, c9938);
                    }
                    break;
                case 2:
                    AbstractC9242 abstractC9242 = (AbstractC9242) abstractC4778;
                    AbstractC7124 abstractC7124 = abstractC9242.f31402;
                    AbstractC7124 abstractC7125 = abstractC9242.f31401;
                    int i7 = C7019.f23589[abstractC7124.f23823.ordinal()];
                    if (i7 == 1) {
                        int i8 = ((C2184) abstractC7124).f7921;
                        if (abstractC7125.f23823 != EnumC9947.LOCAL || i8 != ((C2184) abstractC7125).f7921) {
                            if (abstractC7124.f23821.charAt(0) != 'I') {
                                m51297(abstractC7125, c2785);
                                if (i8 >= 0) {
                                    c2785.mo35158(m51292(54, abstractC7124.f23821), i8);
                                } else if (abstractC7124.f23821.equals("V")) {
                                    cCharAt = abstractC7124.f23821.charAt(0);
                                    if (cCharAt == 'D' && cCharAt != 'J') {
                                        c2785.mo35159(87);
                                    } else {
                                        c2785.mo35159(88);
                                    }
                                }
                            } else {
                                EnumC9947 enumC9947 = abstractC7125.f23823;
                                if (enumC9947 == EnumC9947.ADD) {
                                    if (m51300(abstractC7125.mo19024(), i8) && abstractC7125.mo19019().f23823 == EnumC9947.CONSTANT) {
                                        int iIntValue2 = ((Integer) ((C14760) abstractC7125.mo19019()).f48276).intValue();
                                        if (iIntValue2 < -32768 || iIntValue2 > 32767) {
                                            m51297(abstractC7125, c2785);
                                            if (i8 >= 0) {
                                                c2785.mo35158(m51292(54, abstractC7124.f23821), i8);
                                            } else if (abstractC7124.f23821.equals("V")) {
                                                cCharAt = abstractC7124.f23821.charAt(0);
                                                if (cCharAt == 'D') {
                                                    c2785.mo35159(88);
                                                } else {
                                                    c2785.mo35159(88);
                                                }
                                            }
                                        } else {
                                            c2785.mo35160(i8, iIntValue2);
                                        }
                                    } else if (!m51300(abstractC7125.mo19019(), i8) || abstractC7125.mo19024().f23823 != EnumC9947.CONSTANT || (iIntValue = ((Integer) ((C14760) abstractC7125.mo19024()).f48276).intValue()) < -32768 || iIntValue > 32767) {
                                        m51297(abstractC7125, c2785);
                                        if (i8 >= 0) {
                                            c2785.mo35158(m51292(54, abstractC7124.f23821), i8);
                                        } else if (abstractC7124.f23821.equals("V")) {
                                            cCharAt = abstractC7124.f23821.charAt(0);
                                            if (cCharAt == 'D') {
                                                c2785.mo35159(88);
                                            } else {
                                                c2785.mo35159(88);
                                            }
                                        }
                                    } else {
                                        c2785.mo35160(i8, iIntValue);
                                    }
                                } else if (enumC9947 == EnumC9947.SUB && m51300(abstractC7125.mo19024(), i8) && abstractC7125.mo19019().f23823 == EnumC9947.CONSTANT && (i = -((Integer) ((C14760) abstractC7125.mo19019()).f48276).intValue()) >= -32768 && i <= 32767) {
                                    c2785.mo35160(i8, i);
                                } else {
                                    m51297(abstractC7125, c2785);
                                    if (i8 >= 0) {
                                        c2785.mo35158(m51292(54, abstractC7124.f23821), i8);
                                    } else if (abstractC7124.f23821.equals("V")) {
                                        cCharAt = abstractC7124.f23821.charAt(0);
                                        if (cCharAt == 'D') {
                                            c2785.mo35159(88);
                                        } else {
                                            c2785.mo35159(88);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i7 == 2) {
                        C6418 c6418 = (C6418) abstractC7124;
                        String str = c6418.f21734;
                        m51297(abstractC7125, c2785);
                        m51295(abstractC7125.f23821, str, c2785);
                        c2785.mo33785(m51293(c6418.f21736), 179, c6418.f21735, str);
                    } else if (i7 == 3) {
                        C9821 c9821 = (C9821) abstractC7124;
                        String str2 = c9821.f33569;
                        m51297(c9821.f25764, c2785);
                        m51297(abstractC7125, c2785);
                        m51295(abstractC7125.f23821, str2, c2785);
                        c2785.mo33785(m51293(c9821.f33568), 181, c9821.f33570, str2);
                    } else if (i7 == 4) {
                        C6292 c6292 = (C6292) abstractC7124;
                        m51297(c6292.f61770, c2785);
                        m51297(c6292.f61771, c2785);
                        m51297(abstractC7125, c2785);
                        String str3 = c6292.f61770.f23821;
                        String str4 = c6292.f23821;
                        if (str3.charAt(0) == '[') {
                            String strSubstring2 = str3.substring(1);
                            m51295(abstractC7125.f23821, strSubstring2, c2785);
                            c2785.mo35159(m51292(79, strSubstring2));
                        } else {
                            c2785.mo35159(m51292(79, str4));
                        }
                    }
                    break;
                case 3:
                    AbstractC9242 abstractC9243 = (AbstractC9242) abstractC4778;
                    if (abstractC9243.f31401.f23823 == EnumC9947.EXCEPTION_REF) {
                        int i9 = ((C2184) abstractC9243.f31402).f7921;
                        if (i9 >= 0) {
                            c2785.mo35158(58, i9);
                        } else {
                            c2785.mo35159(87);
                        }
                    }
                    break;
                case 4:
                    AbstractC9242 abstractC9244 = (AbstractC9242) abstractC4778;
                    AbstractC7124 abstractC7126 = abstractC9244.f31401;
                    if (abstractC7126.f23823 == EnumC9947.CONSTANT) {
                        Object obj = ((C14760) abstractC7126).f48276;
                        int length = Array.getLength(obj);
                        String str5 = abstractC9244.f31402.f23821;
                        strSubstring = str5.charAt(i5) == '[' ? str5.substring(1) : "I";
                        try {
                            if (this.f75429 == null || !"BSIJ".contains(strSubstring)) {
                                i3 = 79;
                                iM51293 = m51292(i3, strSubstring);
                                m51297(abstractC9244.f31402, c2785);
                                while (i4 < length) {
                                    c2785.mo35159(89);
                                    c2785.mo8457(Integer.valueOf(i4));
                                    c2785.mo8457(Array.get(obj, i4));
                                    c2785.mo35159(iM51293);
                                }
                                c2785.mo35159(87);
                            } else {
                                if (obj instanceof byte[]) {
                                    bArrArray = (byte[]) obj;
                                } else if (obj instanceof short[]) {
                                    short[] sArr = (short[]) obj;
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sArr.length * 2);
                                    byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate.asShortBuffer().put(sArr);
                                    bArrArray = byteBufferAllocate.array();
                                } else if (obj instanceof int[]) {
                                    int[] iArr = (int[]) obj;
                                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iArr.length * 4);
                                    byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate2.asIntBuffer().put(iArr);
                                    bArrArray = byteBufferAllocate2.array();
                                } else if (obj instanceof long[]) {
                                    long[] jArr = (long[]) obj;
                                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(jArr.length * 8);
                                    byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferAllocate3.asLongBuffer().put(jArr);
                                    bArrArray = byteBufferAllocate3.array();
                                } else {
                                    bArrArray = null;
                                }
                                if (bArrArray != null && bArrArray.length > 500) {
                                    m51297(abstractC9244.f31402, c2785);
                                    c2785.mo8457((Object) 0);
                                    m51296(c2785, bArrArray, strSubstring);
                                    c2785.mo8457((Object) 0);
                                    c2785.mo8457(Integer.valueOf(length));
                                    try {
                                        c2785.mo33784(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused) {
                                        i3 = 79;
                                        iM51293 = m51292(i3, strSubstring);
                                        m51297(abstractC9244.f31402, c2785);
                                        for (i4 = 0; i4 < length; i4++) {
                                            c2785.mo35159(89);
                                            c2785.mo8457(Integer.valueOf(i4));
                                            c2785.mo8457(Array.get(obj, i4));
                                            c2785.mo35159(iM51293);
                                        }
                                        c2785.mo35159(87);
                                    }
                                } else {
                                    i3 = 79;
                                }
                                iM51293 = m51292(i3, strSubstring);
                                m51297(abstractC9244.f31402, c2785);
                                while (i4 < length) {
                                    c2785.mo35159(89);
                                    c2785.mo8457(Integer.valueOf(i4));
                                    c2785.mo8457(Array.get(obj, i4));
                                    c2785.mo35159(iM51293);
                                }
                                c2785.mo35159(87);
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    } else {
                        C3469 c3469 = (C3469) abstractC7126;
                        int length2 = c3469.f29544.length;
                        String str6 = abstractC9244.f31402.f23821;
                        strSubstring = str6.charAt(0) == '[' ? str6.substring(1) : "I";
                        try {
                            if (this.f75429 == null || !"BSIJ".contains(strSubstring)) {
                                iM51292 = m51292(79, strSubstring);
                                m51297(abstractC9244.f31402, c2785);
                                while (i2 < length2) {
                                    c2785.mo35159(89);
                                    c2785.mo8457(Integer.valueOf(i2));
                                    m51297(c3469.f29544[i2], c2785);
                                    c2785.mo35159(iM51292);
                                }
                                c2785.mo35159(87);
                            } else {
                                AbstractC7124[] abstractC7124Arr = c3469.f29544;
                                int length3 = abstractC7124Arr.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length3) {
                                        z = true;
                                    } else if (abstractC7124Arr[i10].f23823 != EnumC9947.CONSTANT) {
                                        z = false;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (z && (bArrM51301 = m51301(c3469.f29544, strSubstring)) != null && bArrM51301.length > 500) {
                                    m51297(abstractC9244.f31402, c2785);
                                    c2785.mo8457((Object) 0);
                                    m51296(c2785, bArrM51301, strSubstring);
                                    c2785.mo8457((Object) 0);
                                    c2785.mo8457(Integer.valueOf(length2));
                                    try {
                                        c2785.mo33784(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused3) {
                                        iM51292 = m51292(79, strSubstring);
                                        m51297(abstractC9244.f31402, c2785);
                                        for (i2 = 0; i2 < length2; i2++) {
                                            c2785.mo35159(89);
                                            c2785.mo8457(Integer.valueOf(i2));
                                            m51297(c3469.f29544[i2], c2785);
                                            c2785.mo35159(iM51292);
                                        }
                                        c2785.mo35159(87);
                                    }
                                    break;
                                }
                                iM51292 = m51292(79, strSubstring);
                                m51297(abstractC9244.f31402, c2785);
                                while (i2 < length2) {
                                    c2785.mo35159(89);
                                    c2785.mo8457(Integer.valueOf(i2));
                                    m51297(c3469.f29544[i2], c2785);
                                    c2785.mo35159(iM51292);
                                }
                                c2785.mo35159(87);
                            }
                            break;
                        } catch (Exception unused4) {
                        }
                    }
                    break;
                case 5:
                    c2785.mo35162(167, ((C0068) abstractC4778).f965.f54352);
                    break;
                case 6:
                    C16297 c16297 = (C16297) abstractC4778;
                    C9938 c9939 = c16297.f52495.f54352;
                    AbstractC7124 abstractC7127 = c16297.f6011;
                    AbstractC7124 abstractC7124Mo19024 = abstractC7127.mo19024();
                    EnumC9947 enumC9948 = abstractC7127.f23823;
                    AbstractC7124 abstractC7124Mo19019 = abstractC7127.mo19019();
                    char cCharAt2 = abstractC7124Mo19024.f23821.charAt(i5);
                    if (cCharAt2 != 'L' && cCharAt2 != '[') {
                        if (!m51299(abstractC7124Mo19024) && !m51299(abstractC7124Mo19019)) {
                            m51297(abstractC7124Mo19024, c2785);
                            m51297(abstractC7124Mo19019, c2785);
                            switch (C7019.f23589[enumC9948.ordinal()]) {
                                case 6:
                                    c2785.mo35162(DHParameters.DEFAULT_MINIMUM_LENGTH, c9939);
                                    break;
                                case 7:
                                    c2785.mo35162(159, c9939);
                                    break;
                                case 8:
                                    c2785.mo35162(162, c9939);
                                    break;
                                case 9:
                                    c2785.mo35162(163, c9939);
                                    break;
                                case 10:
                                    c2785.mo35162(164, c9939);
                                    break;
                                case 11:
                                    c2785.mo35162(161, c9939);
                                    break;
                            }
                        } else {
                            if (m51299(abstractC7124Mo19019)) {
                                m51297(abstractC7124Mo19024, c2785);
                            } else {
                                m51297(abstractC7124Mo19019, c2785);
                            }
                            switch (C7019.f23589[enumC9948.ordinal()]) {
                                case 6:
                                    c2785.mo35162(EnumC2300.f8185, c9939);
                                    break;
                                case 7:
                                    c2785.mo35162(153, c9939);
                                    break;
                                case 8:
                                    c2785.mo35162(156, c9939);
                                    break;
                                case 9:
                                    c2785.mo35162(157, c9939);
                                    break;
                                case 10:
                                    c2785.mo35162(158, c9939);
                                    break;
                                case 11:
                                    c2785.mo35162(155, c9939);
                                    break;
                            }
                        }
                    } else {
                        if (m51299(abstractC7124Mo19024) || m51299(abstractC7124Mo19019)) {
                            if (m51299(abstractC7124Mo19019)) {
                                m51297(abstractC7124Mo19024, c2785);
                            } else {
                                m51297(abstractC7124Mo19019, c2785);
                            }
                            c2785.mo35162(enumC9948 == EnumC9947.EQ ? 198 : 199, c9939);
                        } else {
                            m51297(abstractC7124Mo19024, c2785);
                            m51297(abstractC7124Mo19019, c2785);
                            c2785.mo35162(enumC9948 == EnumC9947.EQ ? 165 : 166, c9939);
                        }
                        break;
                    }
                    break;
                case 7:
                    m51297(((C1249) abstractC4778).f6011, c2785);
                    c2785.mo35159(194);
                    break;
                case 8:
                    m51297(((C1249) abstractC4778).f6011, c2785);
                    c2785.mo35159(195);
                    break;
                case 9:
                    break;
                case 10:
                    AbstractC7124 abstractC7128 = ((C1249) abstractC4778).f6011;
                    m51297(abstractC7128, c2785);
                    m51295(abstractC7128.f23821, c9116.f31038, c2785);
                    c2785.mo35159(m51292(172, abstractC7128.f23821));
                    break;
                case 11:
                    c2785.mo35159(177);
                    break;
                case 12:
                    C5713 c5713 = (C5713) abstractC4778;
                    m51297(c5713.f6011, c2785);
                    int length4 = c5713.f63630.length;
                    C9938[] c9938Arr = new C9938[length4];
                    for (int i11 = 0; i11 < length4; i11++) {
                        c9938Arr[i11] = c5713.f63630[i11].f54352;
                    }
                    c2785.mo35165(c5713.f63629.f54352, c5713.f19463, c9938Arr);
                    break;
                case 13:
                    C5483 c5483 = (C5483) abstractC4778;
                    m51297(c5483.f6011, c2785);
                    int length5 = c5483.f63630.length;
                    C9938[] c9938Arr2 = new C9938[length5];
                    for (int i12 = 0; i12 < length5; i12++) {
                        c9938Arr2[i12] = c5483.f63630[i12].f54352;
                    }
                    int i13 = c5483.f18868;
                    c2785.mo35161(i13, (length5 + i13) - 1, c5483.f63629.f54352, c9938Arr2);
                    break;
                case 14:
                    m51297(((C1249) abstractC4778).f6011, c2785);
                    c2785.mo35159(191);
                    break;
                case 15:
                    AbstractC7124 abstractC7124Mo5126 = abstractC4778.mo5126();
                    m51297(abstractC7124Mo5126, c2785);
                    String str7 = abstractC7124Mo5126.f23821;
                    if (abstractC7124Mo5126.f23823 == EnumC9947.INVOKE_NEW) {
                        c2785.mo35159(87);
                    } else if (!"V".equals(str7)) {
                        char cCharAt3 = str7.charAt(i5);
                        if (cCharAt3 == 'D' || cCharAt3 == 'J') {
                            c2785.mo35159(88);
                        } else {
                            c2785.mo35159(87);
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("not support st: " + abstractC4778.f16795);
            }
            i5 = 0;
        }
        C9116 c9117 = this.f75428;
        AbstractC20521 abstractC20521 = this.f75427;
        for (C16876 c16876 : c9117.f31040) {
            AbstractC4777 abstractC4777M13247 = c16876.f53976;
            while (true) {
                abstractC4777M13247 = abstractC4777M13247.m13247();
                if (abstractC4777M13247 == null || abstractC4777M13247 == c16876.f53975) {
                    break;
                }
                if (abstractC4777M13247.f16795 != EnumC2890.LABEL) {
                    int i14 = 0;
                    while (true) {
                        C17002[] c17002Arr = c16876.f53977;
                        if (i14 < c17002Arr.length) {
                            String str8 = c16876.f53974[i14];
                            abstractC20521.mo33788(c16876.f53976.f54352, c16876.f53975.f54352, c17002Arr[i14].f54352, str8 == null ? null : C14172.m34263(str8).m34266());
                            i14++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51293(String str) {
        return C14172.m34263(str).m34266();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51296(C2785 c2785, byte[] bArr, String str) {
        String strM51294 = m51294(bArr);
        if (strM51294.length() > 65535) {
            c2785.mo33790(187, "java/lang/StringBuilder");
            c2785.mo35159(89);
            c2785.mo33784(183, "java/lang/StringBuilder", "<init>", "()V", false);
            for (int i = 0; i < strM51294.length(); i += 65500) {
                c2785.mo8457(strM51294.substring(i, Math.min(65500, strM51294.length() - i) + i));
                c2785.mo33784(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            }
            c2785.mo33784(182, "java/lang/StringBuilder", AnnotationHandler.STRING, "()Ljava/lang/String;", false);
        } else {
            c2785.mo8457(strM51294);
        }
        String strM51293 = m51293(this.f75429.f31080);
        C9137 c9137 = this.f75429;
        if (c9137.f31081 == null) {
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            c9137.f31081 = "$d2j$hex$" + m51294(bArr2);
        }
        c2785.mo33784(184, strM51293, C1694.m5622(new StringBuilder(), c9137.f31081, "$decode_", str), C0252.m1693("(Ljava/lang/String;)[", str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51300(AbstractC7124 abstractC7124, int i) {
        return abstractC7124.f23823 == EnumC9947.LOCAL && ((C2184) abstractC7124).f7921 == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51295(String str, String str2, C2785 c2785) {
        char cCharAt = str2.charAt(0);
        if (cCharAt == 'B') {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 == 'C' || cCharAt2 == 'I' || cCharAt2 == 'S') {
                c2785.mo35159(145);
                return;
            }
            return;
        }
        if (cCharAt == 'C') {
            if (str.charAt(0) != 'I') {
                return;
            }
            c2785.mo35159(146);
        } else {
            if (cCharAt != 'S') {
                return;
            }
            char cCharAt3 = str.charAt(0);
            if (cCharAt3 == 'C' || cCharAt3 == 'I') {
                c2785.mo35159(147);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51299(AbstractC7124 abstractC7124) {
        if (abstractC7124.f23823 != EnumC9947.CONSTANT) {
            return false;
        }
        Object obj = ((C14760) abstractC7124).f48276;
        Integer num = 0;
        return num.equals(obj) || C14760.f48275.equals(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51292(int i, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    return C14172.f46512.m34267(i);
                }
                C14172 c14172 = C14172.f46510;
                if (cCharAt == 'I') {
                    return c14172.m34267(i);
                }
                if (cCharAt == 'J') {
                    return C14172.f46515.m34267(i);
                }
                if (cCharAt == 'Z') {
                    return C14172.f46509.m34267(i);
                }
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case 'B':
                            return C14172.f46514.m34267(i);
                        case 'C':
                            return C14172.f46507.m34267(i);
                        case 'D':
                            return C14172.f46511.m34267(i);
                        default:
                            return c14172.m34267(i);
                    }
                }
            }
            return C14172.m34263("La;").m34267(i);
        }
        return C14172.f46508.m34267(i);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0307  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51297(AbstractC7124 abstractC7124, C2785 c2785) {
        int iIntValue;
        int i;
        int i2;
        byte[] bArrM51301;
        int i3 = C7019.f23587[abstractC7124.f23822.ordinal()];
        char c = 1;
        if (i3 == 1) {
            int i4 = C7019.f23589[abstractC7124.f23823.ordinal()];
            if (i4 == 1) {
                c2785.mo35158(m51292(21, abstractC7124.f23821), ((C2184) abstractC7124).f7921);
                return;
            }
            if (i4 == 2) {
                C6418 c6418 = (C6418) abstractC7124;
                c2785.mo33785(m51293(c6418.f21736), 178, c6418.f21735, c6418.f21734);
                return;
            }
            if (i4 != 5) {
                if (i4 != 12) {
                    return;
                }
                c2785.mo33790(187, m51293(((C5007) abstractC7124).f17419));
                return;
            }
            C14760 c14760 = (C14760) abstractC7124;
            if (c14760.f48276.equals(C14760.f48275)) {
                c2785.mo35159(1);
                return;
            }
            Object obj = c14760.f48276;
            if ((obj instanceof C1686) || (obj instanceof C4902) || (obj instanceof C14076)) {
                c2785.mo8457(C10548.m26689(obj));
                return;
            } else {
                c2785.mo8457(obj);
                return;
            }
        }
        if (i3 == 2) {
            m51298((AbstractC7830) abstractC7124, c2785);
            return;
        }
        int i5 = 0;
        if (i3 == 3) {
            AbstractC19119 abstractC19119 = (AbstractC19119) abstractC7124;
            String str = abstractC19119.f61771.f23821;
            m51297(abstractC19119.f61770, c2785);
            EnumC9947 enumC9947 = abstractC19119.f23823;
            EnumC9947 enumC9948 = EnumC9947.ADD;
            if (enumC9947 == enumC9948 || enumC9947 == EnumC9947.SUB) {
                AbstractC7124 abstractC7125 = abstractC19119.f61771;
                if (abstractC7125.f23823 == EnumC9947.CONSTANT) {
                    C14760 c14761 = (C14760) abstractC7125;
                    char cCharAt = c14761.f23821.charAt(0);
                    if (cCharAt == 'B') {
                        iIntValue = ((Integer) c14761.f48276).intValue();
                        if (iIntValue < 0) {
                            c2785.mo8457(Integer.valueOf(-iIntValue));
                            c2785.mo35159(m51292(enumC9947 == enumC9948 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'D') {
                        double dDoubleValue = ((Double) c14761.f48276).doubleValue();
                        if (dDoubleValue < 0.0d) {
                            c2785.mo8457(Double.valueOf(-dDoubleValue));
                            c2785.mo35159(m51292(enumC9947 == enumC9948 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'F') {
                        float fFloatValue = ((Float) c14761.f48276).floatValue();
                        if (fFloatValue < 0.0f) {
                            c2785.mo8457(Float.valueOf(-fFloatValue));
                            c2785.mo35159(m51292(enumC9947 == enumC9948 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'S' || cCharAt == 'I') {
                        iIntValue = ((Integer) c14761.f48276).intValue();
                        if (iIntValue < 0) {
                            c2785.mo8457(Integer.valueOf(-iIntValue));
                            c2785.mo35159(m51292(enumC9947 == enumC9948 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'J') {
                        long jLongValue = ((Long) c14761.f48276).longValue();
                        if (jLongValue < 0) {
                            c2785.mo8457(Long.valueOf(-jLongValue));
                            c2785.mo35159(m51292(enumC9947 == enumC9948 ? 100 : 96, str));
                            return;
                        }
                    }
                }
            }
            m51297(abstractC19119.f61771, c2785);
            String str2 = abstractC19119.f61770.f23821;
            int i6 = C7019.f23589[enumC9947.ordinal()];
            if (i6 == 4) {
                String str3 = abstractC19119.f23821;
                if (str2.charAt(0) == '[') {
                    c2785.mo35159(m51292(46, str2.substring(1)));
                    return;
                } else {
                    c2785.mo35159(m51292(46, str3));
                    return;
                }
            }
            switch (i6) {
                case 28:
                    c2785.mo35159(m51292(96, str));
                    return;
                case 29:
                    c2785.mo35159(m51292(100, str));
                    return;
                case 30:
                case 31:
                case 32:
                case 33:
                    c2785.mo35159(m51292(108, str));
                    return;
                case 34:
                    c2785.mo35159(m51292(IShizukuService.Stub.TRANSACTION_isHidden, str));
                    return;
                case 35:
                    c2785.mo35159(m51292(UMErrorCode.E_UM_BE_DEFLATE_FAILED, str));
                    return;
                case 36:
                    c2785.mo35159(m51292(126, str));
                    return;
                case 37:
                    c2785.mo35159(m51292(128, str));
                    return;
                case 38:
                    c2785.mo35159(m51292(130, str));
                    return;
                case 39:
                    c2785.mo35159(m51292(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, str2));
                    return;
                case 40:
                    c2785.mo35159(m51292(122, str2));
                    return;
                case 41:
                    c2785.mo35159(m51292(124, str2));
                    return;
                case 42:
                    c2785.mo35159(148);
                    return;
                case 43:
                    c2785.mo35159(150);
                    return;
                case 44:
                    c2785.mo35159(152);
                    return;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c2785.mo35159(149);
                    return;
                case 46:
                    c2785.mo35159(151);
                    return;
                default:
                    return;
            }
        }
        if (i3 != 4) {
            return;
        }
        AbstractC8536 abstractC8536 = (AbstractC8536) abstractC7124;
        EnumC9947 enumC9949 = abstractC8536.f23823;
        Object[] objArrCopyOf = null;
        String strSubstring = null;
        if (enumC9949 == EnumC9947.FILLED_ARRAY) {
            C3469 c3469 = (C3469) abstractC8536;
            String str4 = c3469.f23821;
            int iM51292 = 79;
            if (str4.charAt(0) == '[') {
                strSubstring = str4.substring(1);
                iM51292 = m51292(79, strSubstring);
            }
            try {
                if (this.f75429 != null && strSubstring != null && "BSIJ".contains(strSubstring)) {
                    for (AbstractC7124 abstractC7126 : c3469.f29544) {
                        if (abstractC7126.f23823 != EnumC9947.CONSTANT) {
                            c = 0;
                            break;
                        }
                    }
                    if (c != 0 && (bArrM51301 = m51301(c3469.f29544, strSubstring)) != null && bArrM51301.length > 500) {
                        m51296(c2785, bArrM51301, strSubstring);
                        return;
                    }
                }
                while (true) {
                    AbstractC7124[] abstractC7124Arr = c3469.f29544;
                    if (i5 >= abstractC7124Arr.length) {
                        return;
                    }
                    if (abstractC7124Arr[i5] != null) {
                        c2785.mo35159(89);
                        c2785.mo8457(Integer.valueOf(i5));
                        m51297(c3469.f29544[i5], c2785);
                        String str5 = c3469.f29544[i5].f23821;
                        if (strSubstring != null) {
                            m51295(str5, strSubstring, c2785);
                        }
                        c2785.mo35159(iM51292);
                    }
                    i5++;
                }
            } catch (Exception unused) {
            }
            m51298((AbstractC7830) new C14886(EnumC9947.NEW_ARRAY, C2058.m6556(c3469.f29544.length), c3469.f12741), c2785);
        } else {
            switch (C7019.f23589[enumC9949.ordinal()]) {
                case 13:
                case 14:
                case 16:
                case 17:
                    break;
                case 15:
                    c2785.mo33790(187, m51293(((C13475) abstractC8536).f44541.m9294()));
                    c2785.mo35159(89);
                    break;
                case 18:
                    for (AbstractC7124 abstractC7127 : abstractC8536.f29544) {
                        m51297(abstractC7127, c2785);
                    }
                    C21941 c21941 = (C21941) abstractC8536;
                    StringBuilder sb = new StringBuilder();
                    while (i5 < c21941.f71170) {
                        sb.append('[');
                        i5++;
                    }
                    sb.append(c21941.f71171);
                    c2785.mo33783(abstractC8536.f29544.length, sb.toString());
                    return;
                case 19:
                    C4301 c4301 = (C4301) abstractC8536;
                    C10860 c10860 = c4301.f15469;
                    String[] strArrM34051 = c10860.m27212().m34051();
                    AbstractC7124[] abstractC7124Arr2 = c4301.f29544;
                    if (strArrM34051.length == abstractC7124Arr2.length) {
                        for (int i7 = 0; i7 < abstractC7124Arr2.length; i7++) {
                            AbstractC7124 abstractC7128 = abstractC7124Arr2[i7];
                            m51297(abstractC7128, c2785);
                            m51295(abstractC7128.f23821, strArrM34051[i7], c2785);
                        }
                    } else if (strArrM34051.length + 1 == abstractC7124Arr2.length) {
                        m51297(abstractC7124Arr2[0], c2785);
                        for (int i8 = 1; i8 < abstractC7124Arr2.length; i8++) {
                            AbstractC7124 abstractC7129 = abstractC7124Arr2[i8];
                            m51297(abstractC7129, c2785);
                            m51295(abstractC7129.f23821, strArrM34051[i8 - 1], c2785);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    String strM27214 = c10860.m27214();
                    String strM34049 = c10860.m27212().m34049();
                    C19110 c19110M26693 = C10548.m26693(c10860.m27213());
                    Object[] objArrM27215 = c10860.m27215();
                    if (objArrM27215 != null) {
                        objArrCopyOf = Arrays.copyOf(objArrM27215, objArrM27215.length);
                        while (i5 < objArrCopyOf.length) {
                            objArrCopyOf[i5] = C10548.m26689(objArrCopyOf[i5]);
                            i5++;
                        }
                    }
                    c2785.mo33787(strM27214, strM34049, c19110M26693, objArrCopyOf);
                    return;
                case 20:
                    C11358 c11358 = (C11358) abstractC8536;
                    C14076 c14076 = c11358.f38308;
                    C3097 c3097 = c11358.f38309;
                    String[] strArrM34052 = c14076.m34051();
                    AbstractC7124[] abstractC7124Arr3 = c11358.f29544;
                    m51297(abstractC7124Arr3[0], c2785);
                    for (int i9 = 1; i9 < abstractC7124Arr3.length; i9++) {
                        AbstractC7124 abstractC71210 = abstractC7124Arr3[i9];
                        m51297(abstractC71210, c2785);
                        m51295(abstractC71210.f23821, strArrM34052[i9 - 1], c2785);
                    }
                    c2785.mo33784(182, m51293(c3097.m9294()), c3097.m9295(), c14076.m34049(), false);
                    return;
                default:
                    return;
            }
            C13475 c13475 = (C13475) abstractC8536;
            C3097 c3098 = c13475.f44541;
            if (enumC9949 == EnumC9947.INVOKE_STATIC || enumC9949 == EnumC9947.INVOKE_NEW) {
                i = 0;
            } else {
                m51297(abstractC8536.f29544[0], c2785);
                i = 1;
            }
            int i10 = 0;
            while (true) {
                AbstractC7124[] abstractC7124Arr4 = abstractC8536.f29544;
                if (i >= abstractC7124Arr4.length) {
                    switch (C7019.f23589[enumC9949.ordinal()]) {
                        case 13:
                            i2 = 182;
                            break;
                        case 14:
                            i2 = 185;
                            break;
                        case 15:
                        case 16:
                            i2 = 183;
                            break;
                        case 17:
                            i2 = 184;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    C14076 c14076M9293 = c3098.m9293();
                    if (c13475.f23823 == EnumC9947.INVOKE_NEW) {
                        c14076M9293 = new C14076("V", c14076M9293.m34051());
                    }
                    c2785.mo33784(i2, m51293(c3098.m9294()), c3098.m9295(), c14076M9293.m34049(), i2 == 185);
                    return;
                }
                AbstractC7124 abstractC71211 = abstractC7124Arr4[i];
                m51297(abstractC71211, c2785);
                m51295(abstractC71211.f23821, c3098.m9291()[i10], c2785);
                i++;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51294(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m51301(AbstractC7124[] abstractC7124Arr, String str) {
        str.getClass();
        int i = 0;
        switch (str) {
            case "B":
                byte[] bArr = new byte[abstractC7124Arr.length];
                int length = abstractC7124Arr.length;
                while (i < length) {
                    bArr[i] = ((Number) ((C14760) abstractC7124Arr[i]).f48276).byteValue();
                    i++;
                }
                return bArr;
            case "I":
                int length2 = abstractC7124Arr.length;
                int[] iArr = new int[length2];
                int length3 = abstractC7124Arr.length;
                while (i < length3) {
                    iArr[i] = ((Number) ((C14760) abstractC7124Arr[i]).f48276).intValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 * 4);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.asIntBuffer().put(iArr);
                return byteBufferAllocate.array();
            case "J":
                int length4 = abstractC7124Arr.length;
                long[] jArr = new long[length4];
                int length5 = abstractC7124Arr.length;
                while (i < length5) {
                    jArr[i] = ((Number) ((C14760) abstractC7124Arr[i]).f48276).longValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length4 * 8);
                byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate2.asLongBuffer().put(jArr);
                return byteBufferAllocate2.array();
            case "S":
                int length6 = abstractC7124Arr.length;
                short[] sArr = new short[length6];
                int length7 = abstractC7124Arr.length;
                while (i < length7) {
                    sArr[i] = ((Number) ((C14760) abstractC7124Arr[i]).f48276).shortValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(length6 * 2);
                byteBufferAllocate3.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate3.asShortBuffer().put(sArr);
                return byteBufferAllocate3.array();
            default:
                return null;
        }
    }
}
