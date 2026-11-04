package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: l.֫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69WV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2083 {
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7171(byte[] bArr, boolean z) {
        int iMin;
        int i = 3;
        if (!z) {
            iMin = bArr.length;
        } else {
            iMin = Math.min(bArr.length, 10485760);
            int iM8269 = C2448.m8269(Math.min(bArr.length, 32768), bArr);
            int i2 = 1;
            if (iM8269 == C2448.f7850 || iM8269 == C2448.f7861) {
                if (iMin > 0) {
                    int i3 = iMin - 1;
                    while (i3 >= 0 && (bArr[i3] & 192) == 128) {
                        i3--;
                    }
                    if (i3 < 0) {
                        iMin = 0;
                    } else {
                        int i4 = bArr[i3] & 255;
                        if (i4 >= 128) {
                            if (i4 >= 194 && i4 <= 223) {
                                i2 = 2;
                            } else if (i4 >= 224 && i4 <= 239) {
                                i2 = 3;
                            } else if (i4 >= 240 && i4 <= 244) {
                                i2 = 4;
                            }
                        }
                        if (i2 + i3 > iMin) {
                            iMin = i3;
                        }
                    }
                }
            } else if (iM8269 == C2448.f7858) {
                iMin = m7170(bArr, iMin, false);
            } else if (iM8269 == C2448.f7859) {
                iMin = m7170(bArr, iMin, true);
            } else if (iM8269 == C2448.f7857 || iM8269 == C2448.f7864) {
                int iM7169 = iMin - m7169(iMin, bArr);
                if (iM7169 > 0) {
                    iMin -= iM7169 % 4;
                }
            } else if (iM8269 != -1) {
                Charset charsetM8272 = C2448.m8272(iM8269);
                int iMax = Math.max(0, iMin - 16);
                for (int i5 = iMin; i5 >= iMax; i5--) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = charsetM8272.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i5));
                        iMin = i5;
                        break;
                    } catch (CharacterCodingException unused) {
                    }
                }
            }
        }
        int i6 = C2448.f7850;
        int iM82610 = C2448.m8269(Math.min(iMin, 32768), bArr);
        if (iM82610 == -1) {
            return null;
        }
        if (iM82610 == C2448.f7850 || iM82610 == C2448.f7861) {
            if (C18856.m43754(iMin, bArr)) {
                iMin -= 3;
            } else {
                i = 0;
            }
        } else if (iM82610 == C2448.f7858) {
            if (C18856.m43747(iMin, bArr)) {
                iMin -= 2;
                i = 2;
            } else {
                i = 0;
            }
        } else {
            if (iM82610 == C2448.f7859) {
                if (C18856.m43757(iMin, bArr)) {
                    iMin -= 2;
                    i = 2;
                }
            } else if (iM82610 != C2448.f7857 ? !(iM82610 != C2448.f7864 || !C18856.m43758(iMin, bArr)) : C18856.m43753(iMin, bArr)) {
                iMin -= 4;
                i = 4;
            }
            i = 0;
        }
        return new String(bArr, i, iMin, C2448.m8272(iM82610));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m7176(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(C22150.f71346), 0, bArr, 0, str.length());
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7173(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10348 m7172(C10348 c10348, C10348 c10349) {
        if (c10348 == c10349) {
            return c10348;
        }
        int size = c10348.size();
        if (c10349.size() != size) {
            throw new C16074("mismatched stack depths", null);
        }
        C10348 c10348M26618 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC22239 interfaceC22239M26614 = c10348.m26614(i);
            InterfaceC22239 interfaceC22239M26615 = c10349.m26614(i);
            InterfaceC22239 interfaceC22239M7175 = m7175(interfaceC22239M26614, interfaceC22239M26615);
            if (interfaceC22239M7175 != interfaceC22239M26614) {
                if (c10348M26618 == null) {
                    c10348M26618 = c10348.m26618();
                }
                if (interfaceC22239M7175 == null) {
                    throw new C16074("incompatible: " + interfaceC22239M26614 + ", " + interfaceC22239M26615, null);
                }
                try {
                    c10348M26618.m26615(i, interfaceC22239M7175);
                } catch (C16074 e) {
                    e.m12508("...while merging stack[" + C5306.m15934(i) + "]");
                    throw e;
                }
                e.m12508("...while merging stack[" + C5306.m15934(i) + "]");
                throw e;
            }
        }
        if (c10348M26618 == null) {
            return c10348;
        }
        c10348M26618.mo15005();
        return c10348M26618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7170(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int iM7169 = i - m7169(i, bArr);
        if (iM7169 > 0) {
            i -= iM7169 % 2;
        }
        if (i - m7169(i, bArr) >= 2) {
            int i4 = i - 2;
            if (z) {
                i2 = bArr[i4] & 255;
                i3 = (bArr[i - 1] & 255) << 8;
            } else {
                i2 = (bArr[i4] & 255) << 8;
                i3 = bArr[i - 1] & 255;
            }
            int i5 = i3 | i2;
            if (i5 >= 55296 && i5 <= 56319) {
                return i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC22239 m7175(InterfaceC22239 interfaceC22239, InterfaceC22239 interfaceC222310) {
        if (interfaceC22239 == null || interfaceC22239.equals(interfaceC222310)) {
            return interfaceC22239;
        }
        if (interfaceC222310 == null) {
            return null;
        }
        C5085 type = interfaceC22239.getType();
        C5085 type2 = interfaceC222310.getType();
        if (type == type2) {
            return type;
        }
        if (type.m15374() && type2.m15374()) {
            C5085 c5085 = C5085.f17762;
            if (type == c5085) {
                return type2;
            }
            if (type2 == c5085) {
                return type;
            }
            if (type.m15369() && type2.m15369()) {
                InterfaceC22239 interfaceC22239M7175 = m7175(type.m15378(), type2.m15378());
                if (interfaceC22239M7175 == null) {
                    return C5085.f17733;
                }
                return ((C5085) interfaceC22239M7175).m15377();
            }
            return C5085.f17733;
        }
        if (type.m15372() && type2.m15372()) {
            return C5085.f17753;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7169(int i, byte[] bArr) {
        int i2;
        if ((i >= 4 && bArr[0] == 0 && bArr[1] == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) || (i >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && bArr[2] == 0 && bArr[3] == 0)) {
            return 4;
        }
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 3;
        }
        return (i < 2 || !(((i2 = bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) || (i2 == 255 && (bArr[1] & 255) == 254))) ? 0 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7174(InterfaceC22239 interfaceC22239, InterfaceC22239 interfaceC222310) {
        C5085 type = interfaceC22239.getType();
        C5085 type2 = interfaceC222310.getType();
        if (type.equals(type2)) {
            return true;
        }
        int iMo8408 = type.mo8408();
        int iMo8409 = type2.mo8408();
        if (iMo8408 == 10) {
            type = C5085.f17733;
            iMo8408 = 9;
        }
        if (iMo8409 == 10) {
            type2 = C5085.f17733;
            iMo8409 = 9;
        }
        if (iMo8408 != 9 || iMo8409 != 9) {
            return type.m15372() && type2.m15372();
        }
        C5085 c5085 = C5085.f17762;
        if (type == c5085) {
            return false;
        }
        if (type2 == c5085 || type == C5085.f17733) {
            return true;
        }
        if (!type.m15369()) {
            return !type2.m15369() || type == C5085.f17755 || type == C5085.f17757;
        }
        if (!type2.m15369()) {
            return false;
        }
        do {
            type = type.m15378();
            type2 = type2.m15378();
            if (!type.m15369()) {
                break;
            }
        } while (type2.m15369());
        return m7174(type, type2);
    }
}
