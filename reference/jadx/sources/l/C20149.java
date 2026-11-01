package l;

/* JADX INFO: renamed from: l.᩶ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1G7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20149 implements InterfaceC19429, InterfaceC15690 {
    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public void mo7690(InterfaceC6599 interfaceC6599) {
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public void mo7696() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45563(String str) {
        System.out.println(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[PHI: r3
      0x0113: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v7 int) binds: [B:105:0x0111, B:102:0x010a, B:100:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ed  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45559(int i, CharSequence charSequence) {
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
                } else if (!C9739.m24695(iCodePointBefore) || iCodePointBefore == 65039) {
                    if (iCodePointBefore != 8205) {
                        if (iCodePointBefore == 8419 && iCharCount >= 1) {
                            int i4 = iCharCount - 1;
                            char cCharAt = charSequence.charAt(i4);
                            if (cCharAt == 65039 && iCharCount >= 2) {
                                int i5 = iCharCount - 2;
                                char cCharAt2 = charSequence.charAt(i5);
                                int i6 = C23850.f77103;
                                if (('0' <= cCharAt2 && cCharAt2 <= '9') || cCharAt2 == '#' || cCharAt2 == '*') {
                                    if (!z3) {
                                        return i5;
                                    }
                                }
                            } else {
                                int i7 = C23850.f77103;
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
                                int i8 = C23850.f77103;
                                if ((48 <= iCodePointBefore && iCodePointBefore <= 57) || iCodePointBefore == 35 || iCodePointBefore == 42 || C23850.m52576(iCodePointBefore)) {
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
                                if (C23850.m52576(Character.codePointBefore(charSequence, iCharCount))) {
                                    iCharCount -= 2;
                                    z = true;
                                }
                            } else if (C23850.m52576(iCodePointBefore)) {
                                z = true;
                            }
                        } else if (C23850.m52576(iCodePointBefore)) {
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

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC8011 mo7684(int i, int i2) {
        return new C7928();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45564(InterfaceC23218 interfaceC23218, AbstractC14730 abstractC14730) {
        int i = 0;
        AbstractC14730 abstractC14730M35261 = abstractC14730;
        while (abstractC14730M35261 != null) {
            AbstractC14730 abstractC14730M35270 = abstractC14730M35261.m35270();
            int iMo2831 = abstractC14730M35270 != null ? abstractC14730M35270.mo2831() : 0;
            AbstractC14730 abstractC14730M35273 = abstractC14730M35261.m35273();
            interfaceC23218.mo20359(abstractC14730M35261, i);
            if (abstractC14730M35270 != null && !abstractC14730M35261.m35266()) {
                if (iMo2831 == abstractC14730M35270.mo2831()) {
                    abstractC14730M35261 = abstractC14730M35270.m35261(abstractC14730M35261.m35267());
                } else if (abstractC14730M35273 == null) {
                    i--;
                    abstractC14730M35261 = abstractC14730M35270;
                } else {
                    abstractC14730M35261 = abstractC14730M35273;
                }
            }
            if (abstractC14730M35261.mo2831() > 0) {
                abstractC14730M35261 = abstractC14730M35261.m35261(0);
                i++;
            } else {
                while (abstractC14730M35261.m35273() == null && i > 0) {
                    interfaceC23218.mo20358(abstractC14730M35261, i);
                    abstractC14730M35261 = abstractC14730M35261.m35270();
                    i--;
                }
                interfaceC23218.mo20358(abstractC14730M35261, i);
                if (abstractC14730M35261 == abstractC14730) {
                    return;
                } else {
                    abstractC14730M35261 = abstractC14730M35261.m35273();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static IndexOutOfBoundsException m45565(int i, int i2) {
        return new IndexOutOfBoundsException(C2271.m6967("index=", i, i2, ", length="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21680 m45562(InterfaceC15456 interfaceC15456, InterfaceC14771 interfaceC14771) {
        C13465.m32966(interfaceC15456, "<this>");
        C13465.m32966(interfaceC14771, "completion");
        if (interfaceC15456 instanceof AbstractC21680) {
            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
        }
        InterfaceC22386 context = interfaceC14771.getContext();
        return context == C1218.f5350 ? new C4040(interfaceC15456, interfaceC14771) : new C6863(interfaceC14771, context, interfaceC15456);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b A[DONT_INVERT, EDGE_INSN: B:33:0x004b->B:105:0x0102 BREAK  A[LOOP:0: B:6:0x0007->B:109:0x010b]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00d0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45558(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        boolean zM52576;
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
                if (C9739.m24695(cCharAt)) {
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
                        zM52576 = C23850.m52576(iCodePointAt2);
                        if (zM52576 && 127995 <= (iCodePointAt = Character.codePointAt(charSequence, iCharCount)) && iCodePointAt <= 127999) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    }
                    zM52576 = false;
                } else {
                    zM52576 = C23850.m52576(iCodePointAt2);
                }
                if (i6 >= 1 && charSequence.charAt(iCharCount) == 65039) {
                    iCharCount++;
                    i6--;
                    zM52576 = true;
                }
                if (!zM52576) {
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
            int i9 = C23850.f77103;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14771 m45560(InterfaceC8400 interfaceC8400, Object obj, InterfaceC14771 interfaceC14771) {
        C13465.m32966(interfaceC8400, "<this>");
        C13465.m32966(interfaceC14771, "completion");
        if (interfaceC8400 instanceof AbstractC21680) {
            return ((AbstractC21680) interfaceC8400).mo20747(obj, interfaceC14771);
        }
        InterfaceC22386 context = interfaceC14771.getContext();
        return context == C1218.f5350 ? new C23092(interfaceC8400, obj, interfaceC14771) : new C15331(interfaceC14771, context, interfaceC8400, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14771 m45561(InterfaceC14771 interfaceC14771) {
        C13465.m32966(interfaceC14771, "<this>");
        AbstractC18858 abstractC18858 = interfaceC14771 instanceof AbstractC18858 ? (AbstractC18858) interfaceC14771 : null;
        return abstractC18858 != null ? abstractC18858.m43493() : interfaceC14771;
    }
}
