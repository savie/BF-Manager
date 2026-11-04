package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13077 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8 A[LOOP:4: B:117:0x01cc->B:119:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x023b  */
    /* JADX WARN: Code duplicated, block: B:187:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32553(CharSequence charSequence, C13406 c13406, String str, C25012 c25012, C11228 c11228) {
        boolean[] zArr;
        int i;
        int i2;
        C15314 c15314;
        int iMax;
        boolean z;
        try {
            ArrayList<InterfaceC8743> arrayListM11539 = C16060.m38213(charSequence, c25012).m11539();
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            InterfaceC8743 interfaceC8743 = null;
            int i3 = 0;
            boolean z2 = true;
            try {
                for (InterfaceC8743 interfaceC8744 : arrayListM11539) {
                    c25012.m55844();
                    int type = interfaceC8744.getType();
                    if (type != -1) {
                        if (interfaceC8744.mo23441() == 0) {
                            if (arrayDeque.isEmpty() && interfaceC8743 != null && interfaceC8743.mo23442() >= i3 && ((type == 18 || type == 10 || type == 7 || type == 14 || type == 8 || type == 5 || type == 21 || type == 3 || type == 4) && C20536.m47091(interfaceC8743.mo23440() + 1, interfaceC8744.mo23442(), charSequence))) {
                                for (int iMo23442 = interfaceC8744.mo23442(); iMo23442 > i3; iMo23442--) {
                                    char cCharAt = charSequence.charAt(iMo23442 - 1);
                                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != 11) {
                                        if (iMo23442 > i3) {
                                            arrayList.add(new C15314(i3, iMo23442, true));
                                            i3 = iMo23442;
                                        }
                                    }
                                }
                                if (iMo23442 > i3) {
                                    arrayList.add(new C15314(i3, iMo23442, true));
                                    i3 = iMo23442;
                                }
                            }
                            if (type == 21 && arrayDeque.isEmpty()) {
                                z2 = false;
                            } else {
                                if (type == 17) {
                                    arrayDeque.push(6);
                                } else if (type == 30) {
                                    arrayDeque.push(31);
                                } else if (type != 31) {
                                    switch (type) {
                                        case 5:
                                            if (!arrayDeque.isEmpty() && (((Integer) arrayDeque.peek()).intValue() == 14 || ((Integer) arrayDeque.peek()).intValue() == 7)) {
                                                arrayDeque.pop();
                                            }
                                            arrayDeque.push(6);
                                            break;
                                        case 6:
                                        case 9:
                                            if (arrayDeque.isEmpty() || ((Integer) arrayDeque.pop()).intValue() != type) {
                                                z2 = false;
                                            }
                                            break;
                                        case 7:
                                        case 14:
                                            arrayDeque.push(Integer.valueOf(type));
                                            break;
                                        case 8:
                                            arrayDeque.push(9);
                                            break;
                                        case 10:
                                            arrayDeque.push(6);
                                            break;
                                        case 11:
                                        case 12:
                                        case 13:
                                            if (arrayDeque.isEmpty()) {
                                                z2 = false;
                                            }
                                            break;
                                        default:
                                            switch (type) {
                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                    arrayDeque.push(46);
                                                    break;
                                                case 46:
                                                case 48:
                                                    if (arrayDeque.isEmpty()) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    break;
                                                case 47:
                                                    arrayDeque.push(48);
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (arrayDeque.isEmpty()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (arrayDeque.size() > 256) {
                                        throw C16060.m38214(EnumC4590.LIMIT, "Recovery nesting limit exceeded");
                                    }
                                    if (type == 1 && arrayDeque.isEmpty()) {
                                        int iMo23440 = interfaceC8744.mo23440() + 1;
                                        arrayList.add(new C15314(i3, iMo23440, true));
                                        i3 = iMo23440;
                                    }
                                    interfaceC8743 = interfaceC8744;
                                }
                            }
                        }
                    }
                    if (i3 < charSequence.length()) {
                        int length = charSequence.length();
                        if (z2 || !arrayDeque.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        arrayList.add(new C15314(i3, length, z));
                    }
                    zArr = new boolean[arrayList.size()];
                    i = 0;
                    for (InterfaceC8743 interfaceC8745 : arrayListM11539) {
                        c25012.m55844();
                        if (!C20536.m47092(interfaceC8745)) {
                            while (i < arrayList.size() && interfaceC8745.mo23442() >= ((C15314) arrayList.get(i)).f50055) {
                                i++;
                            }
                            for (iMax = Math.max(0, i - 1); iMax < Math.min(arrayList.size(), i + 2); iMax++) {
                                zArr[iMax] = true;
                            }
                        }
                    }
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        c25012.m55844();
                        c15314 = (C15314) arrayList.get(i2);
                        if (c15314.f50053 || zArr[i2]) {
                            m32552(charSequence, c15314.f50054, c15314.f50055, c25012, c11228);
                        } else {
                            CharSequence c18334 = new C18334(c15314.f50054, c15314.f50055, charSequence);
                            C11228 c11228M28291 = c11228.m28291();
                            try {
                                try {
                                    C16060.m38216(c18334, c13406, str, c25012, true, c11228M28291);
                                    c18334 = c11228M28291;
                                } catch (C21744 e) {
                                    if (e.f69354 != EnumC4590.SYNTAX) {
                                        throw e;
                                    }
                                }
                                m32552(c18334, 0, c18334.length(), c25012, c11228);
                                c11228M28291.close();
                            } catch (Throwable th) {
                                try {
                                    c11228M28291.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    C16060.m38215(charSequence, arrayListM11539, c11228, C16060.m38213(c11228, c25012).m11539(), c25012);
                    return;
                }
                C16060.m38215(charSequence, arrayListM11539, c11228, C16060.m38213(c11228, c25012).m11539(), c25012);
                return;
            } catch (C21744 e2) {
                if (e2.f69354 == EnumC4590.SYNTAX) {
                    throw C16060.m38214(EnumC4590.CHANGED, "Formatted output could not be tokenized");
                }
                throw e2;
            }
            if (i3 < charSequence.length()) {
                int length2 = charSequence.length();
                if (z2) {
                    z = false;
                } else {
                    z = false;
                }
                arrayList.add(new C15314(i3, length2, z));
            }
            zArr = new boolean[arrayList.size()];
            i = 0;
            while (r0.hasNext()) {
                c25012.m55844();
                if (!C20536.m47092(interfaceC8745)) {
                    while (i < arrayList.size()) {
                        i++;
                    }
                    while (iMax < Math.min(arrayList.size(), i + 2)) {
                        zArr[iMax] = true;
                    }
                }
            }
            while (i2 < arrayList.size()) {
                c25012.m55844();
                c15314 = (C15314) arrayList.get(i2);
                if (c15314.f50053) {
                    m32552(charSequence, c15314.f50054, c15314.f50055, c25012, c11228);
                } else {
                    m32552(charSequence, c15314.f50054, c15314.f50055, c25012, c11228);
                }
            }
        } catch (C21744 e3) {
            if (e3.f69354 != EnumC4590.SYNTAX) {
                throw e3;
            }
            m32552(charSequence, 0, charSequence.length(), c25012, c11228);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32552(CharSequence charSequence, int i, int i2, C25012 c25012, C11228 c11228) {
        if (i2 - i > 1048576 - c11228.length()) {
            throw C16060.m38214(EnumC4590.LIMIT, "Formatted source length limit exceeded");
        }
        while (i < i2) {
            c25012.m55844();
            int i3 = i + 4096;
            c11228.m28292(i, Math.min(i2, i3), charSequence);
            i = i3;
        }
        c25012.m55844();
    }
}
