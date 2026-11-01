package l;

import android.text.SpannableString;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ᩳۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes4.dex */
public final class C18025 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18731 f57634;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11413 f57636;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f57639;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f57640;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f57637 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0822 f57641 = new C0822();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4855 f57638 = new C4855(1);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14690 f57635 = C14690.m35219("(-?[0-9]+(\\.[0-9]*)?)[dimps]?");

    public C18025(C18731 c18731) {
        this.f57634 = c18731;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41980(C11413 c11413, String str) {
        int i;
        String lowerCase;
        C19576 c19576;
        String lowerCase2;
        int iIndexOf;
        C18731 c18731 = this.f57634;
        this.f57640 = c18731.f60760.m35682();
        boolean zEquals = c11413.equals(this.f57636);
        C0822<SpannableString> c0822 = this.f57641;
        if (!zEquals) {
            this.f57636 = c11413;
            this.f57637 = 0;
            c0822.clear();
        }
        str.getClass();
        String str2 = null;
        if (str.startsWith("@") || str.startsWith("?")) {
            int iIndexOf2 = str.indexOf(47);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57640);
            sb.append(":");
            boolean z = str.indexOf(sb.toString()) == 1;
            C4855 c4855 = this.f57638;
            if (iIndexOf2 == -1) {
                boolean zStartsWith = str.startsWith("?");
                int i2 = zStartsWith ? 1 : 2;
                if (this.f57637 != i2) {
                    this.f57637 = i2;
                    c0822.clear();
                    if (!zStartsWith || !this.f57636.f38431.equals("id")) {
                        InterfaceC6432 interfaceC6432M16369 = c18731.f60751.m16369();
                        if (interfaceC6432M16369 != null) {
                            m41979(interfaceC6432M16369, zStartsWith);
                        }
                        if (interfaceC6432M16369 == null || !interfaceC6432M16369.mo17616()) {
                            m41979(C13530.m33074(), zStartsWith);
                        }
                        c0822.sort(c4855);
                    }
                }
            } else {
                String strSubstring = z ? str.substring(this.f57640.length() + 2, iIndexOf2) : str.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                String lowerCase3 = str.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f57637 == i4) {
                    if (!strSubstring.equals(this.f57639)) {
                    }
                    i = i3;
                    str2 = lowerCase3;
                } else {
                    this.f57637 = i4;
                }
                this.f57639 = strSubstring;
                c0822.clear();
                InterfaceC6432 interfaceC6432M163610 = c18731.f60751.m16369();
                if (z && (interfaceC6432M163610 == null || !interfaceC6432M163610.mo17616())) {
                    interfaceC6432M163610 = C13530.m33074();
                }
                String strM50267 = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strM50267 = C22697.m50267(C9023.m23356(strM50267), this.f57640, ":");
                }
                String strM5594 = C1679.m5594(strM50267, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m41978(interfaceC6432M163610, i5, strM5594);
                if (z) {
                    m41978(c18731.f60751.m16369(), i5, strM5594);
                }
                c0822.sort(c4855);
                i = i3;
                str2 = lowerCase3;
            }
            lowerCase = str.toLowerCase();
            c19576 = new C19576();
            for (SpannableString spannableString : c0822) {
                spannableString.removeSpan(c18731.f60753);
                spannableString.removeSpan(c18731.f60762);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c19576.m44683(spannableString, 0);
                    spannableString.setSpan(c18731.f60753, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(str2, i)) != -1) {
                    c19576.m44683(spannableString, iIndexOf);
                    spannableString.setSpan(c18731.f60753, 0, i, 33);
                    spannableString.setSpan(c18731.f60762, iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
            c18731.f60761.clear();
            c19576.m44684(c18731.f60761);
            if (c18731.f60761.size() == 1 || !((SpannableString) c18731.f60761.get(0)).toString().equals(str)) {
            }
            c18731.f60761.clear();
            return;
        }
        this.f57637 = 0;
        c0822.clear();
        C11413 c11414 = this.f57636;
        if ((c11414.f38427 & 65536) != 0) {
            for (C21996 c21996 : c11414.f38429) {
                c0822.m3417(new SpannableString(c21996.f71327));
            }
        }
        if ((this.f57636.f38427 & 8) != 0) {
            c0822.m3417(new SpannableString("true"));
            c0822.m3417(new SpannableString("false"));
        }
        if ((this.f57636.f38427 & 64) != 0) {
            C6222 c6222Matcher = this.f57635.matcher((CharSequence) str);
            if (c6222Matcher.matches()) {
                String strGroup = c6222Matcher.group(1);
                boolean zContains = this.f57636.f38431.toLowerCase().contains(TextBundle.TEXT_ENTRY);
                if (zContains) {
                    c0822.m3417(new SpannableString(C15489.m37076(strGroup, "sp")));
                }
                c0822.m3417(new SpannableString(C15489.m37076(strGroup, "dp")));
                c0822.m3417(new SpannableString(C15489.m37076(strGroup, "in")));
                c0822.m3417(new SpannableString(C15489.m37076(strGroup, "mm")));
                c0822.m3417(new SpannableString(C15489.m37076(strGroup, "pt")));
                c0822.m3417(new SpannableString(C15489.m37076(strGroup, "px")));
                if (!zContains) {
                    c0822.m3417(new SpannableString(C15489.m37076(strGroup, "sp")));
                }
            }
        }
        i = -1;
        lowerCase = str.toLowerCase();
        c19576 = new C19576();
        while (r2.hasNext()) {
            spannableString.removeSpan(c18731.f60753);
            spannableString.removeSpan(c18731.f60762);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c19576.m44683(spannableString, 0);
                spannableString.setSpan(c18731.f60753, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        c18731.f60761.clear();
        c19576.m44684(c18731.f60761);
        if (c18731.f60761.size() == 1) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x021c  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:309:0x0436 A[PHI: r16 r17 r18 r22
      0x0436: PHI (r16v3 java.util.Iterator) = 
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r17v1 l.֨ۖۚ) = 
      (r17v0 l.֨ۖۚ)
      (r17v0 l.֨ۖۚ)
      (r17v0 l.֨ۖۚ)
      (r17v0 l.֨ۖۚ)
      (r17v0 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
      (r17v2 l.֨ۖۚ)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r18v3 boolean) = 
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r22v4 java.util.Iterator) = 
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0445  */
    /* JADX WARN: Code duplicated, block: B:315:0x0449  */
    /* JADX WARN: Code duplicated, block: B:317:0x044f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0475  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41979(InterfaceC6432 interfaceC6432, boolean z) {
        Iterator it;
        Iterator it2;
        boolean z2;
        C0822 c0822;
        byte b;
        boolean zEquals;
        C18025 c18025;
        Iterator it3 = interfaceC6432.mo17615().iterator();
        C18025 c18026 = this;
        while (it3.hasNext()) {
            InterfaceC17721 interfaceC17721 = (InterfaceC17721) it3.next();
            boolean z3 = interfaceC17721.mo19106() == 1;
            Iterator it4 = interfaceC17721.mo19112().iterator();
            while (it4.hasNext()) {
                String typeName = ((InterfaceC19133) it4.next()).getTypeName();
                C0822 c0823 = c18026.f57641;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z3) {
                            c0823.m3417(new SpannableString(C22697.m50267(new StringBuilder("?"), c18026.f57640, ":attr/")));
                        } else {
                            c0823.m3417(new SpannableString("?attr/"));
                        }
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                } else if (!typeName.equals("attr")) {
                    C11413 c11413 = c18026.f57636;
                    int i = c11413.f38427;
                    String str = c11413.f38431;
                    if (str.equals(typeName)) {
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        c0822 = c0823;
                    } else {
                        int i2 = i & 1;
                        if (i2 != 0 || i == 0) {
                            it = it3;
                            it2 = it4;
                            c0822 = c0823;
                            switch (str) {
                                case "layout_above":
                                    b = 0;
                                    break;
                                case "layout_below":
                                    b = 1;
                                    break;
                                case "labelFor":
                                    b = 2;
                                    break;
                                case "entries":
                                    b = 3;
                                    break;
                                case "bitmap":
                                    b = 4;
                                    break;
                                case "button":
                                    b = 5;
                                    break;
                                case "keyboardLayout":
                                    b = 6;
                                    break;
                                case "hand_minute":
                                    b = 7;
                                    break;
                                case "toScene":
                                    b = 8;
                                    break;
                                case "layout":
                                    b = 9;
                                    break;
                                case "entryValues":
                                    b = 10;
                                    break;
                                case "drawable":
                                    b = 11;
                                    break;
                                case "tabStripLeft":
                                    b = 12;
                                    break;
                                case "defaultValue":
                                    b = cb.k;
                                    break;
                                case "resource":
                                    b = cb.f77931l;
                                    break;
                                case "id":
                                    b = 15;
                                    break;
                                case "dial":
                                    b = 16;
                                    break;
                                case "hand_hour":
                                    b = 17;
                                    break;
                                case "fromScene":
                                    b = 18;
                                    break;
                                case "thumb":
                                    b = 19;
                                    break;
                                case "checkMark":
                                    b = 20;
                                    break;
                                case "tabStripRight":
                                    b = 21;
                                    break;
                                case "windowContentOverlay":
                                    b = 22;
                                    break;
                                case "animation":
                                    b = 23;
                                    break;
                                case "windowFrame":
                                    b = 24;
                                    break;
                                case "tickMark":
                                    b = 25;
                                    break;
                                case "interpolator":
                                    b = 26;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            z2 = z3;
                            switch (b) {
                                case 0:
                                case 1:
                                case 2:
                                case 15:
                                    zEquals = typeName.equals("id");
                                    break;
                                case 3:
                                case 10:
                                case 13:
                                    zEquals = typeName.equals("array");
                                    break;
                                case 4:
                                case 5:
                                case 7:
                                case 11:
                                case 12:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 24:
                                case 25:
                                    if (!typeName.equals("drawable") && !typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) && !typeName.equals("mipmap")) {
                                        zEquals = false;
                                        break;
                                    }
                                    break;
                                case 6:
                                    zEquals = typeName.equals("raw");
                                    break;
                                case 8:
                                case 9:
                                case 18:
                                    zEquals = typeName.equals("layout");
                                    break;
                                case 14:
                                    zEquals = typeName.equals(DocumentReader.RESERVED);
                                    break;
                                case 23:
                                case 26:
                                    if (!typeName.equals("anim") && !typeName.equals("animator")) {
                                        zEquals = false;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!str.endsWith("Id") && !str.startsWith("layout_to") && !str.startsWith("layout_align")) {
                                        if (!str.equals("style") && !str.contains("Appearance") && !str.contains("Style") && !str.contains("Theme")) {
                                            if (!str.startsWith("background") && !str.startsWith("textCheckMark") && !str.startsWith("divider") && !str.startsWith("textSelectHandle") && !str.contains("Background") && !str.contains("Drawable") && !str.contains("Indicator") && !str.contains("Divider") && !str.contains("Overlay") && !str.contains("Icon") && !str.contains("Thumb") && !str.contains("Track") && !str.contains("Arrow") && !str.endsWith("Banner")) {
                                                if (!str.equals("transition")) {
                                                    if (!str.contains(AbstractC11766.LOG_TAG)) {
                                                        if (!str.contains("Layout")) {
                                                            if (!str.equals("animation") && !str.contains("Animation") && !str.contains("Animator")) {
                                                                if (str.startsWith("interpolator")) {
                                                                    if (!typeName.equals("anim") && !typeName.equals("animator") && !typeName.equals("interpolator")) {
                                                                        zEquals = false;
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (!typeName.equals("anim") && !typeName.equals("animator")) {
                                                                zEquals = false;
                                                                break;
                                                            }
                                                        } else {
                                                            zEquals = typeName.equals("layout");
                                                            break;
                                                        }
                                                    } else {
                                                        zEquals = typeName.equals(DocumentReader.RESERVED);
                                                        break;
                                                    }
                                                } else {
                                                    zEquals = typeName.equals("transition");
                                                    break;
                                                }
                                            } else if (!typeName.equals("drawable") && !typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) && !typeName.equals("mipmap")) {
                                                zEquals = false;
                                                break;
                                            }
                                        } else {
                                            zEquals = typeName.equals("style");
                                            break;
                                        }
                                    } else {
                                        zEquals = typeName.equals("id");
                                        break;
                                    }
                                    break;
                            }
                            if (zEquals) {
                                if (z2) {
                                    StringBuilder sb = new StringBuilder("@");
                                    c18025 = this;
                                    sb.append(c18025.f57640);
                                    sb.append(":");
                                    sb.append(typeName);
                                    sb.append("/");
                                    c0822.m3417(new SpannableString(sb.toString()));
                                } else {
                                    c18025 = this;
                                    c0822.m3417(new SpannableString(C16523.m38890("@", typeName, "/")));
                                }
                                c18026 = c18025;
                            } else {
                                c18026 = this;
                            }
                            it3 = it;
                            it4 = it2;
                            z3 = z2;
                        } else {
                            it = it3;
                            it2 = it4;
                            z2 = z3;
                            c0822 = c0823;
                        }
                        switch (typeName) {
                            case "fraction":
                                if ((i & 128) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "string":
                                if ((i & 2) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "raw":
                                zEquals = str.equals("keyboardLayout");
                                break;
                            case "xml":
                                zEquals = str.equals("resource");
                                break;
                            case "bool":
                                if ((i & 8) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "menu":
                                zEquals = str.contains("menu");
                                break;
                            case "color":
                                if ((i & 16) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "dimen":
                                if ((i & 64) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "integer":
                                if ((i & 4) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            default:
                                if (i2 == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                        }
                        if (zEquals) {
                            c18026 = this;
                        } else {
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder("@");
                                c18025 = this;
                                sb2.append(c18025.f57640);
                                sb2.append(":");
                                sb2.append(typeName);
                                sb2.append("/");
                                c0822.m3417(new SpannableString(sb2.toString()));
                            } else {
                                c18025 = this;
                                c0822.m3417(new SpannableString(C16523.m38890("@", typeName, "/")));
                            }
                            c18026 = c18025;
                        }
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                    zEquals = true;
                    if (zEquals) {
                        c18026 = this;
                    } else {
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder("@");
                            c18025 = this;
                            sb3.append(c18025.f57640);
                            sb3.append(":");
                            sb3.append(typeName);
                            sb3.append("/");
                            c0822.m3417(new SpannableString(sb3.toString()));
                        } else {
                            c18025 = this;
                            c0822.m3417(new SpannableString(C16523.m38890("@", typeName, "/")));
                        }
                        c18026 = c18025;
                    }
                    it3 = it;
                    it4 = it2;
                    z3 = z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41978(InterfaceC6432 interfaceC6432, int i, String str) {
        InterfaceC3609 interfaceC3609Mo31753;
        if (interfaceC6432 == null) {
            return;
        }
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(this.f57639)) {
                        int iMo1519 = interfaceC19133.mo1519();
                        for (int i2 = 0; i2 < iMo1519; i2++) {
                            for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo25271()) {
                                if (interfaceC12783.mo31756(i2) && (interfaceC3609Mo31753 = interfaceC12783.mo31753(i2)) != null) {
                                    StringBuilder sbM23356 = C9023.m23356(str);
                                    sbM23356.append(interfaceC3609Mo31753.mo7645());
                                    this.f57641.m3417(new SpannableString(sbM23356.toString()));
                                    break;
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
