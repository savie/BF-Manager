package l;

/* JADX INFO: renamed from: l.֫ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WAFF */
/* JADX INFO: loaded from: classes2.dex */
public class C1709 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1709 mo6075(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1709 mo6076(String str, String str2) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6077() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6078(Object obj, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6079(String str, String str2, String str3) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[PHI: r3
      0x0113: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v7 int) binds: [B:105:0x0111, B:102:0x010a, B:100:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ed  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6074(int i, CharSequence charSequence) {
        int iCharCount;
        boolean z;
        boolean z2;
        int i2 = i;
        if (i2 <= 1) {
            return 0;
        }
        int i3 = -1;
        boolean z3 = false;
        while (true) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            iCharCount = i2 - Character.charCount(iCodePointBefore);
            if (iCodePointBefore <= 127) {
                if (z3) {
                    return i3;
                }
            } else if (19968 > iCodePointBefore || iCodePointBefore > 40869) {
                if (iCodePointBefore == 65533) {
                    if (z3) {
                        return i3;
                    }
                } else if (!C9383.m24706(iCodePointBefore) || iCodePointBefore == 65039) {
                    if (iCodePointBefore != 8205) {
                        if (iCodePointBefore == 8419 && iCharCount >= 1) {
                            int i4 = iCharCount - 1;
                            char cCharAt = charSequence.charAt(i4);
                            if (cCharAt == 65039 && iCharCount >= 2) {
                                int i5 = iCharCount - 2;
                                char cCharAt2 = charSequence.charAt(i5);
                                int i6 = C19080.f61794;
                                if (('0' <= cCharAt2 && cCharAt2 <= '9') || cCharAt2 == '#' || cCharAt2 == '*') {
                                    if (!z3) {
                                        return i5;
                                    }
                                }
                            } else {
                                int i7 = C19080.f61794;
                                if (('0' <= cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') {
                                    if (!z3) {
                                        return i4;
                                    }
                                }
                            }
                            return i3;
                        }
                        if (iCodePointBefore != 65039) {
                            z = false;
                        } else {
                            if (iCharCount > 0) {
                                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
                                int i8 = C19080.f61794;
                                if ((48 <= iCodePointBefore && iCodePointBefore <= 57) || iCodePointBefore == 35 || iCodePointBefore == 42 || C19080.m44193(iCodePointBefore)) {
                                    iCharCount -= Character.charCount(iCodePointBefore);
                                    z = true;
                                } else if (z3) {
                                }
                                return i3;
                            }
                            if (z3) {
                                return i3;
                            }
                        }
                        if (iCharCount >= 2) {
                            if (127462 <= iCodePointBefore && iCodePointBefore <= 127487) {
                                int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount);
                                if (127462 <= iCodePointBefore2 && iCodePointBefore2 <= 127487) {
                                    iCharCount -= 2;
                                }
                            } else if (iCodePointBefore == 917631) {
                                int i9 = iCharCount;
                                while (true) {
                                    int iCodePointBefore3 = Character.codePointBefore(charSequence, i9);
                                    if (917536 > iCodePointBefore3 || iCodePointBefore3 > 917630) {
                                        if (iCodePointBefore3 == 127988) {
                                            i9 -= 2;
                                            z2 = true;
                                        }
                                        if (z2) {
                                            iCharCount = i9;
                                        }
                                    } else {
                                        i9 -= 2;
                                        if (i9 < 2) {
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                        iCharCount = i9;
                                    }
                                }
                            } else if (127995 <= iCodePointBefore && iCodePointBefore <= 127999) {
                                if (C19080.m44193(Character.codePointBefore(charSequence, iCharCount))) {
                                    iCharCount -= 2;
                                    z = true;
                                }
                            } else if (C19080.m44193(iCodePointBefore)) {
                                z = true;
                            }
                        } else if (C19080.m44193(iCodePointBefore)) {
                            z = true;
                        }
                        if (z) {
                            if (iCharCount >= 3 && charSequence.charAt(iCharCount - 1) == 8205) {
                                z3 = true;
                                int i10 = iCharCount;
                                i2 = iCharCount - 1;
                                i3 = i10;
                            }
                        } else if (z3) {
                            return i3;
                        }
                        return iCharCount;
                    }
                    if (z3) {
                        return i3;
                    }
                } else if (z3) {
                    return i3;
                }
            } else if (z3) {
                return i3;
            }
        }
        return iCharCount;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b A[DONT_INVERT, EDGE_INSN: B:33:0x004b->B:105:0x0102 BREAK  A[LOOP:0: B:6:0x0007->B:109:0x010b]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00d0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6073(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        boolean zM44193;
        int iCodePointAt;
        boolean z;
        if (i >= i2 - 1) {
            return i2;
        }
        int i5 = -1;
        boolean z2 = false;
        while (true) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt > 127) {
                if (19968 <= cCharAt && cCharAt <= 40869) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (cCharAt == 65533) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (C9383.m24706(cCharAt)) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (cCharAt == 8205) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                int iCodePointAt2 = Character.codePointAt(charSequence, i);
                int iCharCount = Character.charCount(iCodePointAt2) + i;
                int i6 = i2 - iCharCount;
                if (i6 >= 2) {
                    if (127462 <= iCodePointAt2 && iCodePointAt2 <= 127487) {
                        int iCodePointAt3 = Character.codePointAt(charSequence, iCharCount);
                        if (127462 <= iCodePointAt3 && iCodePointAt3 <= 127487) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    } else if (iCodePointAt2 == 127988) {
                        int i7 = i6;
                        int i8 = iCharCount;
                        while (true) {
                            int iCodePointAt4 = Character.codePointAt(charSequence, i8);
                            if (917536 > iCodePointAt4 || iCodePointAt4 > 917630) {
                                if (iCodePointAt4 == 917631) {
                                    i7 -= 2;
                                    i8 += 2;
                                    z = true;
                                }
                                if (z) {
                                    iCharCount = i8;
                                    i6 = i7;
                                }
                            } else {
                                i7 -= 2;
                                i8 += 2;
                                if (i7 < 2) {
                                }
                            }
                            z = false;
                            if (z) {
                                iCharCount = i8;
                                i6 = i7;
                            }
                        }
                    } else {
                        zM44193 = C19080.m44193(iCodePointAt2);
                        if (zM44193 && 127995 <= (iCodePointAt = Character.codePointAt(charSequence, iCharCount)) && iCodePointAt <= 127999) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    }
                    zM44193 = false;
                } else {
                    zM44193 = C19080.m44193(iCodePointAt2);
                }
                if (i6 >= 1 && charSequence.charAt(iCharCount) == 65039) {
                    iCharCount++;
                    i6--;
                    zM44193 = true;
                }
                if (!zM44193) {
                    if (z2) {
                        break;
                    }
                } else if (i6 >= 3 && charSequence.charAt(iCharCount) == 8205) {
                    i = iCharCount + 1;
                    z2 = true;
                    i5 = iCharCount;
                }
                return iCharCount;
            }
            int i9 = C19080.f61794;
            if ((('0' <= cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') && (i3 = i + 1) < i2) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 != 65039 || (i4 = i + 2) >= i2 || charSequence.charAt(i4) != 8419) {
                    if (cCharAt2 != 8419) {
                        if (!z2) {
                            break;
                        }
                        return i + 1;
                    }
                    if (z2) {
                        break;
                    }
                    return i + 2;
                }
                if (z2) {
                    break;
                }
                return i + 3;
            }
            if (!z2) {
                break;
            }
            return i + 1;
        }
        return i5;
    }
}
