package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f30476;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30477;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4700 f30478;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30479;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11228 f30480;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30481;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f30482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30484;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f30486;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30483 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30485 = -1;

    public C9391(C4700 c4700, C13406 c13406, C14151 c14151, boolean z, C11228 c11228) {
        String string;
        char cCharAt;
        this.f30478 = c4700;
        this.f30482 = z;
        if (c13406.m33049()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c13406.m33047());
            if (iMax < 0) {
                throw new IllegalArgumentException(C13645.m33382(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C14442.m34864(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f30486 = string;
        this.f30477 = c14151.m34372();
        String strM34374 = "\n";
        if (!z) {
            if (c14151.m34374().isEmpty()) {
                CharSequence charSequence = c4700.f16591;
                for (int i2 = 0; i2 < charSequence.length() && (cCharAt = charSequence.charAt(i2)) != '\n'; i2++) {
                    if (cCharAt == '\r') {
                        int i3 = i2 + 1;
                        if (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') {
                            strM34374 = "\r";
                            break;
                        } else {
                            strM34374 = "\r\n";
                            break;
                        }
                    }
                }
            } else {
                strM34374 = c14151.m34374();
            }
        }
        this.f30476 = strM34374;
        this.f30480 = c11228;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:163:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0236  */
    /* JADX WARN: Code duplicated, block: B:165:0x023e  */
    /* JADX WARN: Code duplicated, block: B:207:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:230:0x0361 A[PHI: r16 r19
      0x0361: PHI (r16v4 l.ۙۚ᩻) = (r16v6 l.ۙۚ᩻), (r16v6 l.ۙۚ᩻), (r16v9 l.ۙۚ᩻), (r16v9 l.ۙۚ᩻) binds: [B:243:0x0393, B:245:0x039b, B:227:0x0359, B:229:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r19v5 int) = (r19v7 int), (r19v7 int), (r19v8 int), (r19v8 int) binds: [B:243:0x0393, B:245:0x039b, B:227:0x0359, B:229:0x035f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:291:0x041d  */
    /* JADX WARN: Code duplicated, block: B:373:0x051b  */
    /* JADX WARN: Code duplicated, block: B:419:0x05ad A[PHI: r20 r21 r22
      0x05ad: PHI (r20v15 java.util.ArrayList) = 
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v13 java.util.ArrayList)
      (r20v16 java.util.ArrayList)
     binds: [B:330:0x04a2, B:332:0x04a8, B:334:0x04ae, B:336:0x04b6, B:338:0x04bc, B:389:0x0554, B:391:0x055a, B:394:0x0563, B:396:0x0569, B:399:0x0572, B:401:0x0578, B:403:0x0580, B:405:0x0586, B:408:0x058d, B:410:0x0593, B:412:0x0599, B:414:0x05a1, B:382:0x053f, B:384:0x0545, B:386:0x054d, B:374:0x051c, B:418:0x05a9] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r21v6 int) = 
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v5 int)
      (r21v7 int)
     binds: [B:330:0x04a2, B:332:0x04a8, B:334:0x04ae, B:336:0x04b6, B:338:0x04bc, B:389:0x0554, B:391:0x055a, B:394:0x0563, B:396:0x0569, B:399:0x0572, B:401:0x0578, B:403:0x0580, B:405:0x0586, B:408:0x058d, B:410:0x0593, B:412:0x0599, B:414:0x05a1, B:382:0x053f, B:384:0x0545, B:386:0x054d, B:374:0x051c, B:418:0x05a9] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r22v5 boolean) = 
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v4 boolean)
      (r22v6 boolean)
     binds: [B:330:0x04a2, B:332:0x04a8, B:334:0x04ae, B:336:0x04b6, B:338:0x04bc, B:389:0x0554, B:391:0x055a, B:394:0x0563, B:396:0x0569, B:399:0x0572, B:401:0x0578, B:403:0x0580, B:405:0x0586, B:408:0x058d, B:410:0x0593, B:412:0x0599, B:414:0x05a1, B:382:0x053f, B:384:0x0545, B:386:0x054d, B:374:0x051c, B:418:0x05a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:422:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:425:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:430:0x05db  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24718() {
        C4700 c4700;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        boolean z;
        boolean z2;
        C14612 c14612;
        int i2;
        int type;
        int i3;
        C9391 c9391 = this;
        C4700 c4701 = c9391.f30478;
        CharSequence charSequence3 = c4701.f16591;
        ArrayList arrayList = c4701.f16598;
        InterfaceC8743 interfaceC8743 = null;
        int i4 = 0;
        int iMo23440 = 0;
        boolean zM50934 = false;
        while (i4 < arrayList.size()) {
            C7155.m19727();
            InterfaceC8743 interfaceC8744 = (InterfaceC8743) arrayList.get(i4);
            c9391.f30481 += c4701.f16595[i4];
            int type2 = interfaceC8744.getType();
            if (type2 == 141) {
                arrayList = arrayList;
                CharSequence charSequence4 = charSequence3;
                c4700 = c4701;
                charSequence = charSequence4;
            } else {
                int iMo23442 = interfaceC8744.mo23442();
                String strM43743 = C18856.m43743(iMo23440, iMo23442, charSequence3);
                C11228 c11228 = c9391.f30480;
                if (type2 == -1) {
                    if (c4701.m14591(i4, 16)) {
                        c11228.append((CharSequence) strM43743);
                        return;
                    }
                    return;
                }
                boolean z3 = c9391.f30482;
                if (z3 && c4701.m14591(i4, 8)) {
                    zM50934 |= C22600.m50934(strM43743);
                    iMo23440 = interfaceC8744.mo23440() + 1;
                } else {
                    boolean z4 = type2 == 3 || type2 == 4 || type2 == 1 || type2 == 2;
                    if (z3 && z4 && !c4701.m14591(i4, 16)) {
                        String text = interfaceC8744.getText();
                        if (!text.startsWith("#!") && !text.startsWith("/*!") && !text.startsWith("///") && !text.contains("@license") && !text.contains("@preserve") && !text.contains("@copyright") && !text.contains("@ts-") && !text.contains("#__PURE__") && !text.contains("@__PURE__") && !text.contains("sourceURL=")) {
                            if (c4701.m14591(i4, 32)) {
                                c9391.m24717(c9391.f30481);
                            }
                            zM50934 |= C22600.m50934(strM43743) || C22600.m50934(interfaceC8744.getText());
                            iMo23440 = interfaceC8744.mo23440() + 1;
                        }
                    }
                    if (interfaceC8743 == null) {
                        if (c4701.m14591(i4, 16)) {
                            c11228.append((CharSequence) strM43743);
                        } else if (!z3) {
                            c11228.append((CharSequence) c9391.f30477);
                        }
                    } else {
                        if (c4701.m14591(i4, 16) || c4701.m14591(i4, 64)) {
                            c11228.append((CharSequence) strM43743);
                        } else {
                            boolean z5 = zM50934 || C22600.m50934(strM43743);
                            int type3 = interfaceC8743.getType();
                            boolean z6 = type3 == 3 || type3 == 1 || type3 == 2;
                            if (z3 || !c4701.m14591(i4, 128)) {
                                charSequence2 = charSequence3;
                            } else {
                                int i5 = 0;
                                boolean z7 = false;
                                charSequence2 = charSequence3;
                                while (true) {
                                    if (i5 < strM43743.length()) {
                                        if ((i5 & 1023) == 0) {
                                            C7155.m19727();
                                        }
                                        char cCharAt = strM43743.charAt(i5);
                                        i = iMo23442;
                                        InterfaceC8743 interfaceC8745 = interfaceC8743;
                                        if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                                            if (z7) {
                                                c11228.append((CharSequence) c9391.f30476);
                                                c9391.m24717(z4 ? c9391.m24715(i4) : c9391.f30481);
                                            } else {
                                                if (cCharAt == '\r' && (i3 = i5 + 1) < strM43743.length() && strM43743.charAt(i3) == '\n') {
                                                    i5 = i3;
                                                }
                                                z7 = true;
                                            }
                                        }
                                        i5++;
                                        iMo23442 = i;
                                        interfaceC8743 = interfaceC8745;
                                    }
                                    z = z3;
                                }
                            }
                            InterfaceC8743 interfaceC8746 = interfaceC8743;
                            i = iMo23442;
                            if (z6) {
                                c9391.m24717((z3 || !z4) ? c9391.f30481 : c9391.m24715(i4));
                            } else if (z3 || !z4) {
                                if (!z3 && c4701.m14588(i4) == 2) {
                                    c9391.m24717(c9391.f30481);
                                } else if (!z3) {
                                    if (c4701.m14588(i4) == 1) {
                                        m24716();
                                    } else if (c4701.m14588(i4) != 3) {
                                        String text2 = interfaceC8746.getText();
                                        String text3 = interfaceC8744.getText();
                                        int iM14592 = c4701.m14592(interfaceC8746.mo23438());
                                        if (iM14592 >= 0) {
                                            type2 = type2;
                                            c4701 = c4701;
                                            if ((((InterfaceC8743) arrayList.get(iM14592)).getType() == 98 || ((InterfaceC8743) arrayList.get(iM14592)).getType() == 97) && (text3.equals("[") || text3.equals(MotionUtils.EASING_TYPE_FORMAT_START))) {
                                                arrayList = arrayList;
                                                i4 = i4;
                                                z = z3;
                                                z2 = false;
                                            }
                                            if (z2) {
                                                m24716();
                                            }
                                        } else {
                                            c4701 = c4701;
                                            type2 = type2;
                                        }
                                        if ((text2.equals("*") && iM14592 >= 0 && ((InterfaceC8743) arrayList.get(iM14592)).getType() == 23) || C22600.m50935(interfaceC8746, interfaceC8744)) {
                                            arrayList = arrayList;
                                        } else {
                                            if (text3.equals(".") || text3.equals("?.")) {
                                                arrayList = arrayList;
                                            } else if (text2.equals("=") || text3.equals("=")) {
                                                arrayList = arrayList;
                                            } else {
                                                switch (text2) {
                                                    case "satisfies":
                                                    case "extends":
                                                    case "import":
                                                    case "module":
                                                    case "as":
                                                    case "in":
                                                    case "of":
                                                    case "case":
                                                    case "from":
                                                        arrayList = arrayList;
                                                        break;
                                                    default:
                                                        if (text2.equals(l.d)) {
                                                            arrayList = arrayList;
                                                            if (C22600.m50933(text3.charAt(0))) {
                                                            }
                                                            z2 = true;
                                                            break;
                                                        } else {
                                                            arrayList = arrayList;
                                                        }
                                                        if (!text3.equals(",")) {
                                                            i4 = i4;
                                                            if (!text3.equals(l.b)) {
                                                                z = z3;
                                                                if (!text3.equals(MotionUtils.EASING_TYPE_FORMAT_END) && !text3.equals("]") && !text2.equals(".") && !text2.equals("?.") && !text2.equals(MotionUtils.EASING_TYPE_FORMAT_START) && !text2.equals("[") && !text3.equals(":") && (!text3.equals("[") || text2.equals("return") || text2.equals("throw") || text2.equals("yield"))) {
                                                                    if (!text2.equals(":") && !text2.equals(",") && !text2.equals(l.b) && !text2.equals("=>") && !text3.equals("=>")) {
                                                                        if (text3.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
                                                                            switch (text2) {
                                                                                case "switch":
                                                                                case "if":
                                                                                case "for":
                                                                                case "with":
                                                                                case "catch":
                                                                                case "while":
                                                                                case "function":
                                                                                    z2 = true;
                                                                                    break;
                                                                            }
                                                                        } else if (text3.equals("{")) {
                                                                            z2 = !text2.equals("${");
                                                                            break;
                                                                        } else if ((text2.equals(l.d) && (text3.equals("else") || text3.equals("catch") || text3.equals("finally"))) || text2.equals("=") || text3.equals("=") || text2.equals("?") || text3.equals("?") || text2.equals("|") || text3.equals("|") || text2.equals(a.p) || text3.equals(a.p) || text2.equals("return") || text2.equals("throw") || text2.equals("yield") || text2.equals("new")) {
                                                                            z2 = true;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z2 = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z2 = false;
                                                            break;
                                                        }
                                                        z = z3;
                                                        z2 = false;
                                                        break;
                                                }
                                                if (z2) {
                                                    m24716();
                                                }
                                            }
                                            i4 = i4;
                                            z = z3;
                                            z2 = false;
                                            if (z2) {
                                                m24716();
                                            }
                                        }
                                        i4 = i4;
                                        z = z3;
                                        z2 = true;
                                        if (z2) {
                                            m24716();
                                        }
                                    }
                                } else {
                                    if (z5 && !c4701.m14591(interfaceC8746.mo23438(), 4) && interfaceC8744.getType() != 92) {
                                        String text4 = interfaceC8746.getText();
                                        int iM14593 = c4701.m14592(interfaceC8746.mo23438());
                                        boolean z8 = iM14593 >= 0 && (((InterfaceC8743) arrayList.get(iM14593)).getType() == 98 || ((InterfaceC8743) arrayList.get(iM14593)).getType() == 97);
                                        if ((!text4.equals("yield") || (c14612 = c4701.f16593) == null || c14612.m35256(interfaceC8746.mo23442())) && !z8 && (text4.equals("return") || text4.equals("throw") || text4.equals("yield") || text4.equals("break") || text4.equals("continue") || text4.equals("async"))) {
                                            c9391.m24717(c9391.f30481);
                                        }
                                    }
                                    if (!c4701.m14591(interfaceC8746.mo23438(), 4) && c4701.m14588(i4) != 3 && C22600.m50935(interfaceC8746, interfaceC8744)) {
                                        m24716();
                                    }
                                }
                            } else if (type2 == 4) {
                                c9391.m24715(i4);
                                if (!c9391.f30479 && !c4701.m14591(c9391.f30483, 80)) {
                                    if (!C22600.m50934(interfaceC8744.getText()) && c4701.m14588(c9391.f30483) != 2 && (i2 = c9391.f30485) >= 0 && (type = ((InterfaceC8743) arrayList.get(i2)).getType()) != 87 && type != 89 && type != 91 && type != 99 && type != 135) {
                                        switch (type) {
                                            case 93:
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case 95:
                                                break;
                                            default:
                                                if (!z5) {
                                                    m24716();
                                                } else {
                                                    c9391.m24717(c9391.m24715(i4));
                                                }
                                                break;
                                        }
                                    }
                                    c9391.m24717(c9391.f30484);
                                } else if (!z5) {
                                    c9391.m24717(c9391.m24715(i4));
                                } else {
                                    m24716();
                                }
                            } else if (!z5) {
                                c9391.m24717(c9391.m24715(i4));
                            } else {
                                m24716();
                            }
                            z = z3;
                        }
                        charSequence = charSequence2;
                        c11228.m28292(i, interfaceC8744.mo23440() + 1, charSequence);
                        if (z) {
                            c4700 = c4701;
                            i4 = i4;
                            if (c4700.m14591(i4, 4) && type2 != 93) {
                                c11228.append(';');
                            }
                        } else {
                            c4700 = c4701;
                            i4 = i4;
                        }
                        iMo23440 = interfaceC8744.mo23440() + 1;
                        interfaceC8743 = interfaceC8744;
                        zM50934 = false;
                    }
                    charSequence2 = charSequence3;
                    i = iMo23442;
                    z = z3;
                    charSequence = charSequence2;
                    c11228.m28292(i, interfaceC8744.mo23440() + 1, charSequence);
                    if (z) {
                        c4700 = c4701;
                        i4 = i4;
                        if (c4700.m14591(i4, 4)) {
                            c11228.append(';');
                        }
                    } else {
                        c4700 = c4701;
                        i4 = i4;
                    }
                    iMo23440 = interfaceC8744.mo23440() + 1;
                    interfaceC8743 = interfaceC8744;
                    zM50934 = false;
                }
                arrayList = arrayList;
                CharSequence charSequence5 = charSequence3;
                c4700 = c4701;
                charSequence = charSequence5;
            }
            i4++;
            c9391 = this;
            arrayList = arrayList;
            C4700 c4702 = c4700;
            charSequence3 = charSequence;
            c4701 = c4702;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m24715(int i) {
        int i2;
        if (i >= this.f30483) {
            C4700 c4700 = this.f30478;
            this.f30485 = c4700.m14592(i);
            this.f30483 = c4700.m14593(i);
            int i3 = this.f30481;
            while (true) {
                i++;
                i2 = this.f30483;
                if (i > i2) {
                    break;
                }
                i3 += c4700.f16595[i];
            }
            this.f30479 = c4700.m14594(this.f30485, i2);
            this.f30484 = Math.max(this.f30481, i3);
        }
        return this.f30484;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24716() throws Throwable {
        char cCharAt;
        C11228 c11228 = this.f30480;
        if (c11228.length() == 0 || (cCharAt = c11228.charAt(c11228.length() - 1)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
            return;
        }
        c11228.append(' ');
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24717(int i) {
        String str = this.f30476;
        C11228 c11228 = this.f30480;
        c11228.append((CharSequence) str);
        if (this.f30482) {
            return;
        }
        c11228.append((CharSequence) this.f30477);
        int iMax = Math.max(0, i);
        if (iMax < 0) {
            throw new IllegalArgumentException(C13645.m33382(iMax, "count is negative: "));
        }
        String string = this.f30486;
        int length = string.length();
        if (iMax == 0 || length == 0) {
            string = "";
        } else if (iMax != 1) {
            if (string.length() > Integer.MAX_VALUE / iMax) {
                throw new OutOfMemoryError("Repeating " + string.length() + " bytes String " + iMax + " times will produce a String exceeding maximum size.");
            }
            StringBuilder sb = new StringBuilder(length * iMax);
            for (int i2 = 0; i2 < iMax; i2++) {
                sb.append(string);
            }
            string = sb.toString();
        }
        c11228.append((CharSequence) string);
    }
}
