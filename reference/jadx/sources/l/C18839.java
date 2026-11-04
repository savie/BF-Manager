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

/* JADX INFO: renamed from: l.ᩳۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54J3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18839 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC15037 f61195;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13791 f61196;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13617 f61197;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43695(AbstractC7431 abstractC7431, C24061 c24061) {
        m43696(abstractC7431.f24464, c24061);
        int[] iArr = C7652.f25222;
        EnumC22260 enumC22260 = abstractC7431.f34921;
        int i = iArr[enumC22260.ordinal()];
        if (i == 2) {
            C3702 c3702 = (C3702) abstractC7431;
            c24061.mo10796(m43692(c3702.f12712), 178, c3702.f12713, c3702.f12711);
            return;
        }
        if (i == 3) {
            C3702 c3703 = (C3702) abstractC7431;
            c24061.mo10796(m43692(c3703.f12712), 180, c3703.f12713, c3703.f12711);
            return;
        }
        switch (i) {
            case 21:
                String str = ((C1465) abstractC7431).f5117;
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
                                                    c24061.mo10811(188, 8);
                                                    break;
                                                case 'C':
                                                    c24061.mo10811(188, 5);
                                                    break;
                                                case 'D':
                                                    c24061.mo10811(188, 7);
                                                    break;
                                            }
                                        }
                                    } else {
                                        c24061.mo10811(188, 4);
                                        break;
                                    }
                                } else {
                                    c24061.mo10811(188, 11);
                                    break;
                                }
                            } else {
                                c24061.mo10811(188, 10);
                                break;
                            }
                        } else {
                            c24061.mo10811(188, 9);
                            break;
                        }
                    }
                    c24061.mo10808(189, C3105.m10130(str).m10142());
                } else {
                    c24061.mo10811(188, 6);
                }
                break;
            case 22:
            case 23:
                c24061.mo10808(enumC22260 == EnumC22260.CHECK_CAST ? 192 : 193, m43692(((C1465) abstractC7431).f5117));
                break;
            case 24:
                C17872 c17872 = (C17872) abstractC7431;
                String str2 = abstractC7431.f24464.f34923;
                String str3 = c17872.f58577;
                if (!str2.equals(str3)) {
                    char cCharAt2 = str2.charAt(0);
                    if (cCharAt2 != 'F') {
                        if (cCharAt2 != 'S' && cCharAt2 != 'Z' && cCharAt2 != 'I') {
                            if (cCharAt2 == 'J') {
                                char cCharAt3 = str3.charAt(0);
                                if (cCharAt3 == 'D') {
                                    c24061.mo10787(138);
                                    break;
                                } else if (cCharAt3 == 'F') {
                                    c24061.mo10787(137);
                                    break;
                                } else if (cCharAt3 == 'I') {
                                    c24061.mo10787(136);
                                    break;
                                }
                            } else {
                                switch (cCharAt2) {
                                    case 'D':
                                        char cCharAt4 = str3.charAt(0);
                                        if (cCharAt4 == 'F') {
                                            c24061.mo10787(144);
                                            break;
                                        } else if (cCharAt4 == 'I') {
                                            c24061.mo10787(142);
                                            break;
                                        } else if (cCharAt4 == 'J') {
                                            c24061.mo10787(143);
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
                                            c24061.mo10787(145);
                                            break;
                                        case 'C':
                                            c24061.mo10787(146);
                                            break;
                                        case 'D':
                                            c24061.mo10787(135);
                                            break;
                                    }
                                } else {
                                    c24061.mo10787(147);
                                    break;
                                }
                            } else {
                                c24061.mo10787(133);
                                break;
                            }
                        } else {
                            c24061.mo10787(134);
                            break;
                        }
                    } else {
                        char cCharAt6 = str3.charAt(0);
                        if (cCharAt6 == 'D') {
                            c24061.mo10787(141);
                            break;
                        } else if (cCharAt6 == 'I') {
                            c24061.mo10787(139);
                            break;
                        } else if (cCharAt6 == 'J') {
                            c24061.mo10787(140);
                            break;
                        }
                    }
                }
                break;
            case 25:
                c24061.mo10787(190);
                break;
            case 26:
                c24061.mo10787(m43691(116, abstractC7431.f34923));
                break;
            case 27:
                if (abstractC7431.f24464.f34923.equals("I")) {
                    c24061.mo10795((Object) (-1));
                    c24061.mo10787(m43691(130, abstractC7431.f34923));
                } else if (abstractC7431.f24464.f34923.equals("J")) {
                    c24061.mo10795((Object) (-1L));
                    c24061.mo10787(m43691(130, abstractC7431.f34923));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43702(C13617 c13617) {
        this.f61197 = c13617;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43703(C13791 c13791) {
        this.f61196 = c13791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43704(AbstractC15037 abstractC15037) {
        this.f61195 = abstractC15037;
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
    public final void m43701() {
        char cCharAt;
        int i;
        int iIntValue;
        String strSubstring;
        int iM43691;
        int i2;
        boolean z;
        byte[] bArrM43700;
        int i3;
        int iM43692;
        int i4;
        byte[] bArrArray;
        for (AbstractC12563 abstractC12563 : this.f61196.f43750) {
            if (abstractC12563.f40344 == EnumC20768.LABEL) {
                ((C11817) abstractC12563).f38144 = new C10562();
            }
        }
        C13791 c13791 = this.f61196;
        C24061 c24061 = new C24061(this.f61195);
        int i5 = 0;
        Iterator it = c13791.f43751.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C4448) it.next()).f15916);
        }
        new HashMap();
        for (AbstractC12563 abstractC12564 : c13791.f43750) {
            switch (C7652.f25221[abstractC12564.f40344.ordinal()]) {
                case 1:
                    C11817 c11817 = (C11817) abstractC12564;
                    C10562 c10562 = c11817.f38144;
                    c24061.mo10800(c10562);
                    int i6 = c11817.f38145;
                    if (i6 >= 0) {
                        c24061.mo10813(i6, c10562);
                    }
                    break;
                case 2:
                    AbstractC3614 abstractC3614 = (AbstractC3614) abstractC12564;
                    AbstractC11071 abstractC11071 = abstractC3614.f12388;
                    AbstractC11071 abstractC11072 = abstractC3614.f12387;
                    int i7 = C7652.f25222[abstractC11071.f34921.ordinal()];
                    if (i7 == 1) {
                        int i8 = ((C4448) abstractC11071).f15916;
                        if (abstractC11072.f34921 != EnumC22260.LOCAL || i8 != ((C4448) abstractC11072).f15916) {
                            if (abstractC11071.f34923.charAt(0) != 'I') {
                                m43696(abstractC11072, c24061);
                                if (i8 >= 0) {
                                    c24061.mo10814(m43691(54, abstractC11071.f34923), i8);
                                } else if (abstractC11071.f34923.equals("V")) {
                                    cCharAt = abstractC11071.f34923.charAt(0);
                                    if (cCharAt == 'D' && cCharAt != 'J') {
                                        c24061.mo10787(87);
                                    } else {
                                        c24061.mo10787(88);
                                    }
                                }
                            } else {
                                EnumC22260 enumC22260 = abstractC11072.f34921;
                                if (enumC22260 == EnumC22260.ADD) {
                                    if (m43699(abstractC11072.mo27979(), i8) && abstractC11072.mo27977().f34921 == EnumC22260.CONSTANT) {
                                        int iIntValue2 = ((Integer) ((C16380) abstractC11072.mo27977()).f53172).intValue();
                                        if (iIntValue2 < -32768 || iIntValue2 > 32767) {
                                            m43696(abstractC11072, c24061);
                                            if (i8 >= 0) {
                                                c24061.mo10814(m43691(54, abstractC11071.f34923), i8);
                                            } else if (abstractC11071.f34923.equals("V")) {
                                                cCharAt = abstractC11071.f34923.charAt(0);
                                                if (cCharAt == 'D') {
                                                    c24061.mo10787(88);
                                                } else {
                                                    c24061.mo10787(88);
                                                }
                                            }
                                        } else {
                                            c24061.mo10788(i8, iIntValue2);
                                        }
                                    } else if (!m43699(abstractC11072.mo27977(), i8) || abstractC11072.mo27979().f34921 != EnumC22260.CONSTANT || (iIntValue = ((Integer) ((C16380) abstractC11072.mo27979()).f53172).intValue()) < -32768 || iIntValue > 32767) {
                                        m43696(abstractC11072, c24061);
                                        if (i8 >= 0) {
                                            c24061.mo10814(m43691(54, abstractC11071.f34923), i8);
                                        } else if (abstractC11071.f34923.equals("V")) {
                                            cCharAt = abstractC11071.f34923.charAt(0);
                                            if (cCharAt == 'D') {
                                                c24061.mo10787(88);
                                            } else {
                                                c24061.mo10787(88);
                                            }
                                        }
                                    } else {
                                        c24061.mo10788(i8, iIntValue);
                                    }
                                } else if (enumC22260 == EnumC22260.SUB && m43699(abstractC11072.mo27979(), i8) && abstractC11072.mo27977().f34921 == EnumC22260.CONSTANT && (i = -((Integer) ((C16380) abstractC11072.mo27977()).f53172).intValue()) >= -32768 && i <= 32767) {
                                    c24061.mo10788(i8, i);
                                } else {
                                    m43696(abstractC11072, c24061);
                                    if (i8 >= 0) {
                                        c24061.mo10814(m43691(54, abstractC11071.f34923), i8);
                                    } else if (abstractC11071.f34923.equals("V")) {
                                        cCharAt = abstractC11071.f34923.charAt(0);
                                        if (cCharAt == 'D') {
                                            c24061.mo10787(88);
                                        } else {
                                            c24061.mo10787(88);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i7 == 2) {
                        C19364 c19364 = (C19364) abstractC11071;
                        String str = c19364.f62554;
                        m43696(abstractC11072, c24061);
                        m43694(abstractC11072.f34923, str, c24061);
                        c24061.mo10796(m43692(c19364.f62555), 179, c19364.f62553, str);
                    } else if (i7 == 3) {
                        C3702 c3702 = (C3702) abstractC11071;
                        String str2 = c3702.f12711;
                        m43696(c3702.f24464, c24061);
                        m43696(abstractC11072, c24061);
                        m43694(abstractC11072.f34923, str2, c24061);
                        c24061.mo10796(m43692(c3702.f12712), 181, c3702.f12713, str2);
                    } else if (i7 == 4) {
                        C25332 c25332 = (C25332) abstractC11071;
                        m43696(c25332.f44724, c24061);
                        m43696(c25332.f44725, c24061);
                        m43696(abstractC11072, c24061);
                        String str3 = c25332.f44724.f34923;
                        String str4 = c25332.f34923;
                        if (str3.charAt(0) == '[') {
                            String strSubstring2 = str3.substring(1);
                            m43694(abstractC11072.f34923, strSubstring2, c24061);
                            c24061.mo10787(m43691(79, strSubstring2));
                        } else {
                            c24061.mo10787(m43691(79, str4));
                        }
                    }
                    break;
                case 3:
                    AbstractC3614 abstractC3615 = (AbstractC3614) abstractC12564;
                    if (abstractC3615.f12387.f34921 == EnumC22260.EXCEPTION_REF) {
                        int i9 = ((C4448) abstractC3615.f12388).f15916;
                        if (i9 >= 0) {
                            c24061.mo10814(58, i9);
                        } else {
                            c24061.mo10787(87);
                        }
                    }
                    break;
                case 4:
                    AbstractC3614 abstractC3616 = (AbstractC3614) abstractC12564;
                    AbstractC11071 abstractC11073 = abstractC3616.f12387;
                    if (abstractC11073.f34921 == EnumC22260.CONSTANT) {
                        Object obj = ((C16380) abstractC11073).f53172;
                        int length = Array.getLength(obj);
                        String str5 = abstractC3616.f12388.f34923;
                        strSubstring = str5.charAt(i5) == '[' ? str5.substring(1) : "I";
                        try {
                            if (this.f61197 == null || !"BSIJ".contains(strSubstring)) {
                                i3 = 79;
                                iM43692 = m43691(i3, strSubstring);
                                m43696(abstractC3616.f12388, c24061);
                                while (i4 < length) {
                                    c24061.mo10787(89);
                                    c24061.mo10795(Integer.valueOf(i4));
                                    c24061.mo10795(Array.get(obj, i4));
                                    c24061.mo10787(iM43692);
                                }
                                c24061.mo10787(87);
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
                                    m43696(abstractC3616.f12388, c24061);
                                    c24061.mo10795((Object) 0);
                                    m43697(c24061, bArrArray, strSubstring);
                                    c24061.mo10795((Object) 0);
                                    c24061.mo10795(Integer.valueOf(length));
                                    try {
                                        c24061.mo10792(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused) {
                                        i3 = 79;
                                        iM43692 = m43691(i3, strSubstring);
                                        m43696(abstractC3616.f12388, c24061);
                                        for (i4 = 0; i4 < length; i4++) {
                                            c24061.mo10787(89);
                                            c24061.mo10795(Integer.valueOf(i4));
                                            c24061.mo10795(Array.get(obj, i4));
                                            c24061.mo10787(iM43692);
                                        }
                                        c24061.mo10787(87);
                                    }
                                } else {
                                    i3 = 79;
                                }
                                iM43692 = m43691(i3, strSubstring);
                                m43696(abstractC3616.f12388, c24061);
                                while (i4 < length) {
                                    c24061.mo10787(89);
                                    c24061.mo10795(Integer.valueOf(i4));
                                    c24061.mo10795(Array.get(obj, i4));
                                    c24061.mo10787(iM43692);
                                }
                                c24061.mo10787(87);
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    } else {
                        C20856 c20856 = (C20856) abstractC11073;
                        int length2 = c20856.f17809.length;
                        String str6 = abstractC3616.f12388.f34923;
                        strSubstring = str6.charAt(0) == '[' ? str6.substring(1) : "I";
                        try {
                            if (this.f61197 == null || !"BSIJ".contains(strSubstring)) {
                                iM43691 = m43691(79, strSubstring);
                                m43696(abstractC3616.f12388, c24061);
                                while (i2 < length2) {
                                    c24061.mo10787(89);
                                    c24061.mo10795(Integer.valueOf(i2));
                                    m43696(c20856.f17809[i2], c24061);
                                    c24061.mo10787(iM43691);
                                }
                                c24061.mo10787(87);
                            } else {
                                AbstractC11071[] abstractC11071Arr = c20856.f17809;
                                int length3 = abstractC11071Arr.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length3) {
                                        z = true;
                                    } else if (abstractC11071Arr[i10].f34921 != EnumC22260.CONSTANT) {
                                        z = false;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (z && (bArrM43700 = m43700(c20856.f17809, strSubstring)) != null && bArrM43700.length > 500) {
                                    m43696(abstractC3616.f12388, c24061);
                                    c24061.mo10795((Object) 0);
                                    m43697(c24061, bArrM43700, strSubstring);
                                    c24061.mo10795((Object) 0);
                                    c24061.mo10795(Integer.valueOf(length2));
                                    try {
                                        c24061.mo10792(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                    } catch (Exception unused3) {
                                        iM43691 = m43691(79, strSubstring);
                                        m43696(abstractC3616.f12388, c24061);
                                        for (i2 = 0; i2 < length2; i2++) {
                                            c24061.mo10787(89);
                                            c24061.mo10795(Integer.valueOf(i2));
                                            m43696(c20856.f17809[i2], c24061);
                                            c24061.mo10787(iM43691);
                                        }
                                        c24061.mo10787(87);
                                    }
                                    break;
                                }
                                iM43691 = m43691(79, strSubstring);
                                m43696(abstractC3616.f12388, c24061);
                                while (i2 < length2) {
                                    c24061.mo10787(89);
                                    c24061.mo10795(Integer.valueOf(i2));
                                    m43696(c20856.f17809[i2], c24061);
                                    c24061.mo10787(iM43691);
                                }
                                c24061.mo10787(87);
                            }
                            break;
                        } catch (Exception unused4) {
                        }
                    }
                    break;
                case 5:
                    c24061.mo10793(167, ((C13309) abstractC12564).f42481.f38144);
                    break;
                case 6:
                    C5852 c5852 = (C5852) abstractC12564;
                    C10562 c10563 = c5852.f20087.f38144;
                    AbstractC11071 abstractC11074 = c5852.f76980;
                    AbstractC11071 abstractC11071Mo27979 = abstractC11074.mo27979();
                    EnumC22260 enumC22261 = abstractC11074.f34921;
                    AbstractC11071 abstractC11071Mo27977 = abstractC11074.mo27977();
                    char cCharAt2 = abstractC11071Mo27979.f34923.charAt(i5);
                    if (cCharAt2 != 'L' && cCharAt2 != '[') {
                        if (!m43698(abstractC11071Mo27979) && !m43698(abstractC11071Mo27977)) {
                            m43696(abstractC11071Mo27979, c24061);
                            m43696(abstractC11071Mo27977, c24061);
                            switch (C7652.f25222[enumC22261.ordinal()]) {
                                case 6:
                                    c24061.mo10793(DHParameters.DEFAULT_MINIMUM_LENGTH, c10563);
                                    break;
                                case 7:
                                    c24061.mo10793(159, c10563);
                                    break;
                                case 8:
                                    c24061.mo10793(162, c10563);
                                    break;
                                case 9:
                                    c24061.mo10793(163, c10563);
                                    break;
                                case 10:
                                    c24061.mo10793(164, c10563);
                                    break;
                                case 11:
                                    c24061.mo10793(161, c10563);
                                    break;
                            }
                        } else {
                            if (m43698(abstractC11071Mo27977)) {
                                m43696(abstractC11071Mo27979, c24061);
                            } else {
                                m43696(abstractC11071Mo27977, c24061);
                            }
                            switch (C7652.f25222[enumC22261.ordinal()]) {
                                case 6:
                                    c24061.mo10793(EnumC24309.f78687, c10563);
                                    break;
                                case 7:
                                    c24061.mo10793(153, c10563);
                                    break;
                                case 8:
                                    c24061.mo10793(156, c10563);
                                    break;
                                case 9:
                                    c24061.mo10793(157, c10563);
                                    break;
                                case 10:
                                    c24061.mo10793(158, c10563);
                                    break;
                                case 11:
                                    c24061.mo10793(155, c10563);
                                    break;
                            }
                        }
                    } else {
                        if (m43698(abstractC11071Mo27979) || m43698(abstractC11071Mo27977)) {
                            if (m43698(abstractC11071Mo27977)) {
                                m43696(abstractC11071Mo27979, c24061);
                            } else {
                                m43696(abstractC11071Mo27977, c24061);
                            }
                            c24061.mo10793(enumC22261 == EnumC22260.EQ ? 198 : 199, c10563);
                        } else {
                            m43696(abstractC11071Mo27979, c24061);
                            m43696(abstractC11071Mo27977, c24061);
                            c24061.mo10793(enumC22261 == EnumC22260.EQ ? 165 : 166, c10563);
                        }
                        break;
                    }
                    break;
                case 7:
                    m43696(((C18530) abstractC12564).f76980, c24061);
                    c24061.mo10787(194);
                    break;
                case 8:
                    m43696(((C18530) abstractC12564).f76980, c24061);
                    c24061.mo10787(195);
                    break;
                case 9:
                    break;
                case 10:
                    AbstractC11071 abstractC11075 = ((C18530) abstractC12564).f76980;
                    m43696(abstractC11075, c24061);
                    m43694(abstractC11075.f34923, c13791.f43753, c24061);
                    c24061.mo10787(m43691(172, abstractC11075.f34923));
                    break;
                case 11:
                    c24061.mo10787(177);
                    break;
                case 12:
                    C25244 c25244 = (C25244) abstractC12564;
                    m43696(c25244.f76980, c24061);
                    int length4 = c25244.f50568.length;
                    C10562[] c10562Arr = new C10562[length4];
                    for (int i11 = 0; i11 < length4; i11++) {
                        c10562Arr[i11] = c25244.f50568[i11].f38144;
                    }
                    c24061.mo10802(c25244.f50567.f38144, c25244.f81569, c10562Arr);
                    break;
                case 13:
                    C14800 c14800 = (C14800) abstractC12564;
                    m43696(c14800.f76980, c24061);
                    int length5 = c14800.f50568.length;
                    C10562[] c10562Arr2 = new C10562[length5];
                    for (int i12 = 0; i12 < length5; i12++) {
                        c10562Arr2[i12] = c14800.f50568[i12].f38144;
                    }
                    int i13 = c14800.f48421;
                    c24061.mo10790(i13, (length5 + i13) - 1, c14800.f50567.f38144, c10562Arr2);
                    break;
                case 14:
                    m43696(((C18530) abstractC12564).f76980, c24061);
                    c24061.mo10787(191);
                    break;
                case 15:
                    AbstractC11071 abstractC11071Mo31271 = abstractC12564.mo31271();
                    m43696(abstractC11071Mo31271, c24061);
                    String str7 = abstractC11071Mo31271.f34923;
                    if (abstractC11071Mo31271.f34921 == EnumC22260.INVOKE_NEW) {
                        c24061.mo10787(87);
                    } else if (!"V".equals(str7)) {
                        char cCharAt3 = str7.charAt(i5);
                        if (cCharAt3 == 'D' || cCharAt3 == 'J') {
                            c24061.mo10787(88);
                        } else {
                            c24061.mo10787(87);
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("not support st: " + abstractC12564.f40344);
            }
            i5 = 0;
        }
        C13791 c13792 = this.f61196;
        AbstractC15037 abstractC15037 = this.f61195;
        for (C13397 c13397 : c13792.f43748) {
            AbstractC12563 abstractC12563M31273 = c13397.f42695;
            while (true) {
                abstractC12563M31273 = abstractC12563M31273.m31273();
                if (abstractC12563M31273 == null || abstractC12563M31273 == c13397.f42694) {
                    break;
                }
                if (abstractC12563M31273.f40344 != EnumC20768.LABEL) {
                    int i14 = 0;
                    while (true) {
                        C11817[] c11817Arr = c13397.f42696;
                        if (i14 < c11817Arr.length) {
                            String str8 = c13397.f42697[i14];
                            abstractC15037.mo10801(c13397.f42695.f38144, c13397.f42694.f38144, c11817Arr[i14].f38144, str8 == null ? null : C3105.m10130(str8).m10142());
                            i14++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43692(String str) {
        return C3105.m10130(str).m10142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43697(C24061 c24061, byte[] bArr, String str) {
        String strM43693 = m43693(bArr);
        if (strM43693.length() > 65535) {
            c24061.mo10808(187, "java/lang/StringBuilder");
            c24061.mo10787(89);
            c24061.mo10792(183, "java/lang/StringBuilder", "<init>", "()V", false);
            for (int i = 0; i < strM43693.length(); i += 65500) {
                c24061.mo10795(strM43693.substring(i, Math.min(65500, strM43693.length() - i) + i));
                c24061.mo10792(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            }
            c24061.mo10792(182, "java/lang/StringBuilder", AnnotationHandler.STRING, "()Ljava/lang/String;", false);
        } else {
            c24061.mo10795(strM43693);
        }
        String strM43692 = m43692(this.f61197.f43260);
        C13617 c13617 = this.f61197;
        if (c13617.f43261 == null) {
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            c13617.f43261 = "$d2j$hex$" + m43693(bArr2);
        }
        c24061.mo10792(184, strM43692, C12669.m31438(new StringBuilder(), c13617.f43261, "$decode_", str), C25272.m56409("(Ljava/lang/String;)[", str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43699(AbstractC11071 abstractC11071, int i) {
        return abstractC11071.f34921 == EnumC22260.LOCAL && ((C4448) abstractC11071).f15916 == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43694(String str, String str2, C24061 c24061) {
        char cCharAt = str2.charAt(0);
        if (cCharAt == 'B') {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 == 'C' || cCharAt2 == 'I' || cCharAt2 == 'S') {
                c24061.mo10787(145);
                return;
            }
            return;
        }
        if (cCharAt == 'C') {
            if (str.charAt(0) != 'I') {
                return;
            }
            c24061.mo10787(146);
        } else {
            if (cCharAt != 'S') {
                return;
            }
            char cCharAt3 = str.charAt(0);
            if (cCharAt3 == 'C' || cCharAt3 == 'I') {
                c24061.mo10787(147);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43698(AbstractC11071 abstractC11071) {
        if (abstractC11071.f34921 != EnumC22260.CONSTANT) {
            return false;
        }
        Object obj = ((C16380) abstractC11071).f53172;
        Integer num = 0;
        return num.equals(obj) || C16380.f53171.equals(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43691(int i, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt == 'S') {
                    return C3105.f10048.m10137(i);
                }
                C3105 c3105 = C3105.f10045;
                if (cCharAt == 'I') {
                    return c3105.m10137(i);
                }
                if (cCharAt == 'J') {
                    return C3105.f10051.m10137(i);
                }
                if (cCharAt == 'Z') {
                    return C3105.f10050.m10137(i);
                }
                if (cCharAt != '[') {
                    switch (cCharAt) {
                        case 'B':
                            return C3105.f10047.m10137(i);
                        case 'C':
                            return C3105.f10046.m10137(i);
                        case 'D':
                            return C3105.f10044.m10137(i);
                        default:
                            return c3105.m10137(i);
                    }
                }
            }
            return C3105.m10130("La;").m10137(i);
        }
        return C3105.f10043.m10137(i);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0307  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43696(AbstractC11071 abstractC11071, C24061 c24061) {
        int iIntValue;
        int i;
        int i2;
        byte[] bArrM43700;
        int i3 = C7652.f25220[abstractC11071.f34922.ordinal()];
        char c = 1;
        if (i3 == 1) {
            int i4 = C7652.f25222[abstractC11071.f34921.ordinal()];
            if (i4 == 1) {
                c24061.mo10814(m43691(21, abstractC11071.f34923), ((C4448) abstractC11071).f15916);
                return;
            }
            if (i4 == 2) {
                C19364 c19364 = (C19364) abstractC11071;
                c24061.mo10796(m43692(c19364.f62555), 178, c19364.f62553, c19364.f62554);
                return;
            }
            if (i4 != 5) {
                if (i4 != 12) {
                    return;
                }
                c24061.mo10808(187, m43692(((C14888) abstractC11071).f48648));
                return;
            }
            C16380 c16380 = (C16380) abstractC11071;
            if (c16380.f53172.equals(C16380.f53171)) {
                c24061.mo10787(1);
                return;
            }
            Object obj = c16380.f53172;
            if ((obj instanceof C15855) || (obj instanceof C20331) || (obj instanceof C12126)) {
                c24061.mo10795(C5172.m15592(obj));
                return;
            } else {
                c24061.mo10795(obj);
                return;
            }
        }
        if (i3 == 2) {
            m43695((AbstractC7431) abstractC11071, c24061);
            return;
        }
        int i5 = 0;
        if (i3 == 3) {
            AbstractC14142 abstractC14142 = (AbstractC14142) abstractC11071;
            String str = abstractC14142.f44725.f34923;
            m43696(abstractC14142.f44724, c24061);
            EnumC22260 enumC22260 = abstractC14142.f34921;
            EnumC22260 enumC22261 = EnumC22260.ADD;
            if (enumC22260 == enumC22261 || enumC22260 == EnumC22260.SUB) {
                AbstractC11071 abstractC11072 = abstractC14142.f44725;
                if (abstractC11072.f34921 == EnumC22260.CONSTANT) {
                    C16380 c16381 = (C16380) abstractC11072;
                    char cCharAt = c16381.f34923.charAt(0);
                    if (cCharAt == 'B') {
                        iIntValue = ((Integer) c16381.f53172).intValue();
                        if (iIntValue < 0) {
                            c24061.mo10795(Integer.valueOf(-iIntValue));
                            c24061.mo10787(m43691(enumC22260 == enumC22261 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'D') {
                        double dDoubleValue = ((Double) c16381.f53172).doubleValue();
                        if (dDoubleValue < 0.0d) {
                            c24061.mo10795(Double.valueOf(-dDoubleValue));
                            c24061.mo10787(m43691(enumC22260 == enumC22261 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'F') {
                        float fFloatValue = ((Float) c16381.f53172).floatValue();
                        if (fFloatValue < 0.0f) {
                            c24061.mo10795(Float.valueOf(-fFloatValue));
                            c24061.mo10787(m43691(enumC22260 == enumC22261 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'S' || cCharAt == 'I') {
                        iIntValue = ((Integer) c16381.f53172).intValue();
                        if (iIntValue < 0) {
                            c24061.mo10795(Integer.valueOf(-iIntValue));
                            c24061.mo10787(m43691(enumC22260 == enumC22261 ? 100 : 96, str));
                            return;
                        }
                    } else if (cCharAt == 'J') {
                        long jLongValue = ((Long) c16381.f53172).longValue();
                        if (jLongValue < 0) {
                            c24061.mo10795(Long.valueOf(-jLongValue));
                            c24061.mo10787(m43691(enumC22260 == enumC22261 ? 100 : 96, str));
                            return;
                        }
                    }
                }
            }
            m43696(abstractC14142.f44725, c24061);
            String str2 = abstractC14142.f44724.f34923;
            int i6 = C7652.f25222[enumC22260.ordinal()];
            if (i6 == 4) {
                String str3 = abstractC14142.f34923;
                if (str2.charAt(0) == '[') {
                    c24061.mo10787(m43691(46, str2.substring(1)));
                    return;
                } else {
                    c24061.mo10787(m43691(46, str3));
                    return;
                }
            }
            switch (i6) {
                case 28:
                    c24061.mo10787(m43691(96, str));
                    return;
                case 29:
                    c24061.mo10787(m43691(100, str));
                    return;
                case 30:
                case 31:
                case 32:
                case 33:
                    c24061.mo10787(m43691(108, str));
                    return;
                case 34:
                    c24061.mo10787(m43691(IShizukuService.Stub.TRANSACTION_isHidden, str));
                    return;
                case 35:
                    c24061.mo10787(m43691(UMErrorCode.E_UM_BE_DEFLATE_FAILED, str));
                    return;
                case 36:
                    c24061.mo10787(m43691(126, str));
                    return;
                case 37:
                    c24061.mo10787(m43691(128, str));
                    return;
                case 38:
                    c24061.mo10787(m43691(130, str));
                    return;
                case 39:
                    c24061.mo10787(m43691(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, str2));
                    return;
                case 40:
                    c24061.mo10787(m43691(122, str2));
                    return;
                case 41:
                    c24061.mo10787(m43691(124, str2));
                    return;
                case 42:
                    c24061.mo10787(148);
                    return;
                case 43:
                    c24061.mo10787(150);
                    return;
                case 44:
                    c24061.mo10787(152);
                    return;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c24061.mo10787(149);
                    return;
                case 46:
                    c24061.mo10787(151);
                    return;
                default:
                    return;
            }
        }
        if (i3 != 4) {
            return;
        }
        AbstractC5106 abstractC5106 = (AbstractC5106) abstractC11071;
        EnumC22260 enumC22262 = abstractC5106.f34921;
        Object[] objArrCopyOf = null;
        String strSubstring = null;
        if (enumC22262 == EnumC22260.FILLED_ARRAY) {
            C20856 c20856 = (C20856) abstractC5106;
            String str4 = c20856.f34923;
            int iM43691 = 79;
            if (str4.charAt(0) == '[') {
                strSubstring = str4.substring(1);
                iM43691 = m43691(79, strSubstring);
            }
            try {
                if (this.f61197 != null && strSubstring != null && "BSIJ".contains(strSubstring)) {
                    for (AbstractC11071 abstractC11073 : c20856.f17809) {
                        if (abstractC11073.f34921 != EnumC22260.CONSTANT) {
                            c = 0;
                            break;
                        }
                    }
                    if (c != 0 && (bArrM43700 = m43700(c20856.f17809, strSubstring)) != null && bArrM43700.length > 500) {
                        m43697(c24061, bArrM43700, strSubstring);
                        return;
                    }
                }
                while (true) {
                    AbstractC11071[] abstractC11071Arr = c20856.f17809;
                    if (i5 >= abstractC11071Arr.length) {
                        return;
                    }
                    if (abstractC11071Arr[i5] != null) {
                        c24061.mo10787(89);
                        c24061.mo10795(Integer.valueOf(i5));
                        m43696(c20856.f17809[i5], c24061);
                        String str5 = c20856.f17809[i5].f34923;
                        if (strSubstring != null) {
                            m43694(str5, strSubstring, c24061);
                        }
                        c24061.mo10787(iM43691);
                    }
                    i5++;
                }
            } catch (Exception unused) {
            }
            m43695((AbstractC7431) new C1465(EnumC22260.NEW_ARRAY, C23840.m53165(c20856.f17809.length), c20856.f66762), c24061);
        } else {
            switch (C7652.f25222[enumC22262.ordinal()]) {
                case 13:
                case 14:
                case 16:
                case 17:
                    break;
                case 15:
                    c24061.mo10808(187, m43692(((C6686) abstractC5106).f22277.m10371()));
                    c24061.mo10787(89);
                    break;
                case 18:
                    for (AbstractC11071 abstractC11074 : abstractC5106.f17809) {
                        m43696(abstractC11074, c24061);
                    }
                    C21602 c21602 = (C21602) abstractC5106;
                    StringBuilder sb = new StringBuilder();
                    while (i5 < c21602.f69012) {
                        sb.append('[');
                        i5++;
                    }
                    sb.append(c21602.f69013);
                    c24061.mo10791(abstractC5106.f17809.length, sb.toString());
                    return;
                case 19:
                    C12651 c12651 = (C12651) abstractC5106;
                    C24807 c24807 = c12651.f40564;
                    String[] strArrM30292 = c24807.m55324().m30292();
                    AbstractC11071[] abstractC11071Arr2 = c12651.f17809;
                    if (strArrM30292.length == abstractC11071Arr2.length) {
                        for (int i7 = 0; i7 < abstractC11071Arr2.length; i7++) {
                            AbstractC11071 abstractC11075 = abstractC11071Arr2[i7];
                            m43696(abstractC11075, c24061);
                            m43694(abstractC11075.f34923, strArrM30292[i7], c24061);
                        }
                    } else if (strArrM30292.length + 1 == abstractC11071Arr2.length) {
                        m43696(abstractC11071Arr2[0], c24061);
                        for (int i8 = 1; i8 < abstractC11071Arr2.length; i8++) {
                            AbstractC11071 abstractC11076 = abstractC11071Arr2[i8];
                            m43696(abstractC11076, c24061);
                            m43694(abstractC11076.f34923, strArrM30292[i8 - 1], c24061);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    String strM55322 = c24807.m55322();
                    String strM30290 = c24807.m55324().m30290();
                    C4597 c4597M15596 = C5172.m15596(c24807.m55321());
                    Object[] objArrM55323 = c24807.m55323();
                    if (objArrM55323 != null) {
                        objArrCopyOf = Arrays.copyOf(objArrM55323, objArrM55323.length);
                        while (i5 < objArrCopyOf.length) {
                            objArrCopyOf[i5] = C5172.m15592(objArrCopyOf[i5]);
                            i5++;
                        }
                    }
                    c24061.mo10798(strM55322, strM30290, c4597M15596, objArrCopyOf);
                    return;
                case 20:
                    C24586 c24586 = (C24586) abstractC5106;
                    C12126 c12126 = c24586.f79669;
                    C3177 c3177 = c24586.f79670;
                    String[] strArrM30293 = c12126.m30292();
                    AbstractC11071[] abstractC11071Arr3 = c24586.f17809;
                    m43696(abstractC11071Arr3[0], c24061);
                    for (int i9 = 1; i9 < abstractC11071Arr3.length; i9++) {
                        AbstractC11071 abstractC11077 = abstractC11071Arr3[i9];
                        m43696(abstractC11077, c24061);
                        m43694(abstractC11077.f34923, strArrM30293[i9 - 1], c24061);
                    }
                    c24061.mo10792(182, m43692(c3177.m10371()), c3177.m10374(), c12126.m30290(), false);
                    return;
                default:
                    return;
            }
            C6686 c6686 = (C6686) abstractC5106;
            C3177 c3178 = c6686.f22277;
            if (enumC22262 == EnumC22260.INVOKE_STATIC || enumC22262 == EnumC22260.INVOKE_NEW) {
                i = 0;
            } else {
                m43696(abstractC5106.f17809[0], c24061);
                i = 1;
            }
            int i10 = 0;
            while (true) {
                AbstractC11071[] abstractC11071Arr4 = abstractC5106.f17809;
                if (i >= abstractC11071Arr4.length) {
                    switch (C7652.f25222[enumC22262.ordinal()]) {
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
                    C12126 c12126M10373 = c3178.m10373();
                    if (c6686.f34921 == EnumC22260.INVOKE_NEW) {
                        c12126M10373 = new C12126("V", c12126M10373.m30292());
                    }
                    c24061.mo10792(i2, m43692(c3178.m10371()), c3178.m10374(), c12126M10373.m30290(), i2 == 185);
                    return;
                }
                AbstractC11071 abstractC11078 = abstractC11071Arr4[i];
                m43696(abstractC11078, c24061);
                m43694(abstractC11078.f34923, c3178.m10375()[i10], c24061);
                i++;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43693(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43700(AbstractC11071[] abstractC11071Arr, String str) {
        str.getClass();
        int i = 0;
        switch (str) {
            case "B":
                byte[] bArr = new byte[abstractC11071Arr.length];
                int length = abstractC11071Arr.length;
                while (i < length) {
                    bArr[i] = ((Number) ((C16380) abstractC11071Arr[i]).f53172).byteValue();
                    i++;
                }
                return bArr;
            case "I":
                int length2 = abstractC11071Arr.length;
                int[] iArr = new int[length2];
                int length3 = abstractC11071Arr.length;
                while (i < length3) {
                    iArr[i] = ((Number) ((C16380) abstractC11071Arr[i]).f53172).intValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 * 4);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.asIntBuffer().put(iArr);
                return byteBufferAllocate.array();
            case "J":
                int length4 = abstractC11071Arr.length;
                long[] jArr = new long[length4];
                int length5 = abstractC11071Arr.length;
                while (i < length5) {
                    jArr[i] = ((Number) ((C16380) abstractC11071Arr[i]).f53172).longValue();
                    i++;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length4 * 8);
                byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate2.asLongBuffer().put(jArr);
                return byteBufferAllocate2.array();
            case "S":
                int length6 = abstractC11071Arr.length;
                short[] sArr = new short[length6];
                int length7 = abstractC11071Arr.length;
                while (i < length7) {
                    sArr[i] = ((Number) ((C16380) abstractC11071Arr[i]).f53172).shortValue();
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
