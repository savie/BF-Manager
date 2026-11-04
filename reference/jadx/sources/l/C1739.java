package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W6O3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1739 {
    /* JADX WARN: Code duplicated, block: B:142:0x0182 A[EDGE_INSN: B:142:0x0182->B:98:0x0182 BREAK  A[LOOP:1: B:134:0x0058->B:92:0x016e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0158 A[Catch: ۤܽ᩻ -> 0x017b, TryCatch #3 {ۤܽ᩻ -> 0x017b, blocks: (B:9:0x0058, B:11:0x0060, B:14:0x006d, B:16:0x0073, B:19:0x0084, B:21:0x0094, B:23:0x009c, B:36:0x00b4, B:41:0x00c0, B:50:0x00d3, B:52:0x00d9, B:54:0x00df, B:56:0x00eb, B:58:0x00f3, B:60:0x00fb, B:62:0x0103, B:67:0x010f, B:71:0x011b, B:72:0x0122, B:75:0x012e, B:78:0x013c, B:81:0x014a, B:85:0x0158, B:87:0x015e, B:92:0x016e, B:90:0x016b, B:29:0x00a7, B:93:0x0172, B:94:0x017a), top: B:134:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015e A[Catch: ۤܽ᩻ -> 0x017b, TryCatch #3 {ۤܽ᩻ -> 0x017b, blocks: (B:9:0x0058, B:11:0x0060, B:14:0x006d, B:16:0x0073, B:19:0x0084, B:21:0x0094, B:23:0x009c, B:36:0x00b4, B:41:0x00c0, B:50:0x00d3, B:52:0x00d9, B:54:0x00df, B:56:0x00eb, B:58:0x00f3, B:60:0x00fb, B:62:0x0103, B:67:0x010f, B:71:0x011b, B:72:0x0122, B:75:0x012e, B:78:0x013c, B:81:0x014a, B:85:0x0158, B:87:0x015e, B:92:0x016e, B:90:0x016b, B:29:0x00a7, B:93:0x0172, B:94:0x017a), top: B:134:0x0058 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6146(CharSequence charSequence, boolean z, int i, C5049 c5049, C11228 c11228) {
        int iCodePointCount = Character.codePointCount(charSequence, 0, charSequence.length()) + 1;
        int[] iArr = new int[iCodePointCount];
        int iCharCount = 0;
        for (int i2 = 0; i2 < iCodePointCount; i2++) {
            iArr[i2] = iCharCount;
            if (iCharCount < charSequence.length()) {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
            }
        }
        C8755 c8755 = new C8755(new C22203(new C16947(charSequence, new RunnableC9500(c5049)), c5049), c5049);
        c8755.m24869();
        c8755.m24868(new C5468());
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        int i4 = 0;
        boolean z2 = true;
        boolean zEquals = false;
        while (true) {
            try {
                c5049.m15284();
                if (i3 >= 200000) {
                    throw C15489.m37050(EnumC19965.LIMIT, "Token count limit exceeded");
                }
                InterfaceC8743 interfaceC8743NextToken = c8755.nextToken();
                int type = interfaceC8743NextToken.getType();
                if (type == -1) {
                    if (i4 != 0 || !arrayDeque.isEmpty()) {
                        break;
                        break;
                    } else {
                        arrayList.add(Integer.valueOf(charSequence.length()));
                        break;
                    }
                }
                if (type == 103) {
                    String strTrim = interfaceC8743NextToken.getText().trim();
                    if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                        c11228.append(charSequence);
                        return;
                    }
                }
                if (type == 5 || type == 8) {
                    i4++;
                }
                if (type == 7 || type == 10) {
                    i4--;
                } else {
                    if (i4 <= 0 && interfaceC8743NextToken.mo23441() == 0) {
                        if (type != 102) {
                            if (type != 2 && type != 3) {
                                if (z2 && arrayDeque.isEmpty() && interfaceC8743NextToken.mo23437() == 0) {
                                    String text = interfaceC8743NextToken.getText();
                                    boolean z3 = text.equals("elif") || text.equals("else") || text.equals("except") || text.equals("finally") || text.equals("case");
                                    int i5 = iArr[interfaceC8743NextToken.mo23442()];
                                    if (i5 > 0 && !z3 && !zEquals) {
                                        arrayList.add(Integer.valueOf(i5));
                                    }
                                    zEquals = text.equals("@");
                                }
                                if (type == 12) {
                                    arrayDeque.push(15);
                                } else if (type == 13) {
                                    arrayDeque.push(16);
                                } else if (type == 14) {
                                    arrayDeque.push(17);
                                } else if (type == 15) {
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else if (((Integer) arrayDeque.pop()).intValue() != type) {
                                        break;
                                    }
                                } else if (type == 16 || type == 17) {
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                        break;
                                    } else if (((Integer) arrayDeque.pop()).intValue() != type) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (arrayDeque.isEmpty()) {
                            z2 = true;
                        }
                    }
                    i3++;
                }
                z2 = false;
                i3++;
            } catch (C11014 e) {
                if (e.f34787 != EnumC19965.SYNTAX) {
                    throw e;
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            c5049.m15284();
            CharSequence c18334 = new C18334(i6, iIntValue, charSequence);
            C11228 c11228M28291 = c11228.m28291();
            try {
                try {
                    C15489.m37052(c18334, z, i, c5049, true, c11228M28291);
                    c18334 = c11228M28291;
                } catch (C11014 e2) {
                    if (e2.f34787 == EnumC19965.LIMIT) {
                        throw e2;
                    }
                }
                c11228.append(c18334);
                c11228M28291.close();
                if (c11228.length() > 1048576) {
                    throw C15489.m37050(EnumC19965.LIMIT, "Formatted source length limit exceeded");
                }
                i6 = iIntValue;
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
        c11228.m28292(i6, charSequence.length(), charSequence);
        if (c11228.length() > 1048576) {
            throw C15489.m37050(EnumC19965.LIMIT, "Formatted source length limit exceeded");
        }
        c5049.m15284();
    }
}
