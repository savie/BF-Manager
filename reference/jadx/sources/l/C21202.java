package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21202 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8 A[LOOP:4: B:117:0x01cc->B:119:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0236  */
    /* JADX WARN: Code duplicated, block: B:187:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47665(CharSequence charSequence, C12052 c12052, String str, C16969 c16969, C18503 c18503) {
        boolean[] zArr;
        int i;
        int i2;
        C7797 c7797;
        int iMax;
        boolean z;
        try {
            ArrayList<InterfaceC19761> arrayListM13723 = C6385.m17522(charSequence, c16969).m13723();
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            InterfaceC19761 interfaceC19761 = null;
            int i3 = 0;
            boolean z2 = true;
            try {
                for (InterfaceC19761 interfaceC19762 : arrayListM13723) {
                    c16969.m39762();
                    int type = interfaceC19762.getType();
                    if (type != -1) {
                        if (interfaceC19762.mo22512() == 0) {
                            if (arrayDeque.isEmpty() && interfaceC19761 != null && interfaceC19761.mo22508() >= i3 && ((type == 18 || type == 10 || type == 7 || type == 14 || type == 8 || type == 5 || type == 21 || type == 3 || type == 4) && C14853.m35537(interfaceC19761.mo22510() + 1, interfaceC19762.mo22508(), charSequence))) {
                                for (int iMo22508 = interfaceC19762.mo22508(); iMo22508 > i3; iMo22508--) {
                                    char cCharAt = charSequence.charAt(iMo22508 - 1);
                                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != 11) {
                                        if (iMo22508 > i3) {
                                            arrayList.add(new C7797(i3, iMo22508, true));
                                            i3 = iMo22508;
                                        }
                                    }
                                }
                                if (iMo22508 > i3) {
                                    arrayList.add(new C7797(i3, iMo22508, true));
                                    i3 = iMo22508;
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
                                        throw C6385.m17523(EnumC8129.LIMIT, "Recovery nesting limit exceeded");
                                    }
                                    if (type == 1 && arrayDeque.isEmpty()) {
                                        int iMo22510 = interfaceC19762.mo22510() + 1;
                                        arrayList.add(new C7797(i3, iMo22510, true));
                                        i3 = iMo22510;
                                    }
                                    interfaceC19761 = interfaceC19762;
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
                        arrayList.add(new C7797(i3, length, z));
                    }
                    zArr = new boolean[arrayList.size()];
                    i = 0;
                    for (InterfaceC19761 interfaceC19763 : arrayListM13723) {
                        c16969.m39762();
                        if (!C14853.m35538(interfaceC19763)) {
                            while (i < arrayList.size() && interfaceC19763.mo22508() >= ((C7797) arrayList.get(i)).f25668) {
                                i++;
                            }
                            for (iMax = Math.max(0, i - 1); iMax < Math.min(arrayList.size(), i + 2); iMax++) {
                                zArr[iMax] = true;
                            }
                        }
                    }
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        c16969.m39762();
                        c7797 = (C7797) arrayList.get(i2);
                        if (c7797.f25666 || zArr[i2]) {
                            m47664(charSequence, c7797.f25667, c7797.f25668, c16969, c18503);
                        } else {
                            CharSequence c17499 = new C17499(c7797.f25667, c7797.f25668, charSequence);
                            C18503 c18503M42895 = c18503.m42895();
                            try {
                                try {
                                    C6385.m17525(c17499, c12052, str, c16969, c18503M42895);
                                    c17499 = c18503M42895;
                                } catch (C19418 e) {
                                    if (e.f62576 != EnumC8129.SYNTAX) {
                                        throw e;
                                    }
                                }
                                m47664(c17499, 0, c17499.length(), c16969, c18503);
                                c18503M42895.close();
                            } catch (Throwable th) {
                                try {
                                    c18503M42895.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    C6385.m17524(charSequence, arrayListM13723, c18503, C6385.m17522(c18503, c16969).m13723(), c16969);
                    return;
                }
                C6385.m17524(charSequence, arrayListM13723, c18503, C6385.m17522(c18503, c16969).m13723(), c16969);
                return;
            } catch (C19418 e2) {
                if (e2.f62576 == EnumC8129.SYNTAX) {
                    throw C6385.m17523(EnumC8129.CHANGED, "Formatted output could not be tokenized");
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
                arrayList.add(new C7797(i3, length2, z));
            }
            zArr = new boolean[arrayList.size()];
            i = 0;
            while (r0.hasNext()) {
                c16969.m39762();
                if (!C14853.m35538(interfaceC19763)) {
                    while (i < arrayList.size()) {
                        i++;
                    }
                    while (iMax < Math.min(arrayList.size(), i + 2)) {
                        zArr[iMax] = true;
                    }
                }
            }
            while (i2 < arrayList.size()) {
                c16969.m39762();
                c7797 = (C7797) arrayList.get(i2);
                if (c7797.f25666) {
                    m47664(charSequence, c7797.f25667, c7797.f25668, c16969, c18503);
                } else {
                    m47664(charSequence, c7797.f25667, c7797.f25668, c16969, c18503);
                }
            }
        } catch (C19418 e3) {
            if (e3.f62576 != EnumC8129.SYNTAX) {
                throw e3;
            }
            m47664(charSequence, 0, charSequence.length(), c16969, c18503);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47664(CharSequence charSequence, int i, int i2, C16969 c16969, C18503 c18503) {
        if (i2 - i > 1048576 - c18503.length()) {
            throw C6385.m17523(EnumC8129.LIMIT, "Formatted source length limit exceeded");
        }
        while (i < i2) {
            c16969.m39762();
            int i3 = i + 4096;
            c18503.m42896(i, Math.min(i2, i3), charSequence);
            i = i3;
        }
        c16969.m39762();
    }
}
