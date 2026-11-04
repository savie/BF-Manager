package l;

import android.text.SpannableString;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ᩴᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes5.dex */
public final class C20025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2600 f64324;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f64325;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15549 f64327;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f64330;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f64329 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7346 f64328 = new C7346();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16287 f64326 = new C16287(1);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18415 f64331 = C18415.m42925("(-?[0-9]+(\\.[0-9]*)?)[dimps]?");

    public C20025(C15549 c15549) {
        this.f64327 = c15549;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46071(C2600 c2600, String str) {
        int i;
        String lowerCase;
        C3681 c3681;
        String lowerCase2;
        int iIndexOf;
        C15549 c15549 = this.f64327;
        this.f64330 = c15549.f50580.m51604();
        boolean zEquals = c2600.equals(this.f64324);
        C7346<SpannableString> c7346 = this.f64328;
        if (!zEquals) {
            this.f64324 = c2600;
            this.f64329 = 0;
            c7346.clear();
        }
        str.getClass();
        String str2 = null;
        if (str.startsWith("@") || str.startsWith("?")) {
            int iIndexOf2 = str.indexOf(47);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f64330);
            sb.append(":");
            boolean z = str.indexOf(sb.toString()) == 1;
            C16287 c16287 = this.f64326;
            if (iIndexOf2 == -1) {
                boolean zStartsWith = str.startsWith("?");
                int i2 = zStartsWith ? 1 : 2;
                if (this.f64329 != i2) {
                    this.f64329 = i2;
                    c7346.clear();
                    if (!zStartsWith || !this.f64324.f8356.equals("id")) {
                        InterfaceC7206 interfaceC7206M48424 = c15549.f50576.m48424();
                        if (interfaceC7206M48424 != null) {
                            m46070(interfaceC7206M48424, zStartsWith);
                        }
                        if (interfaceC7206M48424 == null || !interfaceC7206M48424.mo19789()) {
                            m46070(C15407.m36884(), zStartsWith);
                        }
                        c7346.sort(c16287);
                    }
                }
            } else {
                String strSubstring = z ? str.substring(this.f64330.length() + 2, iIndexOf2) : str.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                String lowerCase3 = str.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f64329 == i4) {
                    if (!strSubstring.equals(this.f64325)) {
                    }
                    i = i3;
                    str2 = lowerCase3;
                } else {
                    this.f64329 = i4;
                }
                this.f64325 = strSubstring;
                c7346.clear();
                InterfaceC7206 interfaceC7206M48425 = c15549.f50576.m48424();
                if (z && (interfaceC7206M48425 == null || !interfaceC7206M48425.mo19789())) {
                    interfaceC7206M48425 = C15407.m36884();
                }
                String strM23910 = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strM23910 = C8947.m23910(C10732.m27333(strM23910), this.f64330, ":");
                }
                String strM46451 = C20196.m46451(strM23910, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m46069(interfaceC7206M48425, i5, strM46451);
                if (z) {
                    m46069(c15549.f50576.m48424(), i5, strM46451);
                }
                c7346.sort(c16287);
                i = i3;
                str2 = lowerCase3;
            }
            lowerCase = str.toLowerCase();
            c3681 = new C3681();
            for (SpannableString spannableString : c7346) {
                spannableString.removeSpan(c15549.f50574);
                spannableString.removeSpan(c15549.f50582);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c3681.m11973(spannableString, 0);
                    spannableString.setSpan(c15549.f50574, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(str2, i)) != -1) {
                    c3681.m11973(spannableString, iIndexOf);
                    spannableString.setSpan(c15549.f50574, 0, i, 33);
                    spannableString.setSpan(c15549.f50582, iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
            c15549.f50579.clear();
            c3681.m11974(c15549.f50579);
            if (c15549.f50579.size() == 1 || !((SpannableString) c15549.f50579.get(0)).toString().equals(str)) {
            }
            c15549.f50579.clear();
            return;
        }
        this.f64329 = 0;
        c7346.clear();
        C2600 c2601 = this.f64324;
        if ((c2601.f8357 & 65536) != 0) {
            for (C13786 c13786 : c2601.f8355) {
                c7346.m20162(new SpannableString(c13786.f43733));
            }
        }
        if ((this.f64324.f8357 & 8) != 0) {
            c7346.m20162(new SpannableString("true"));
            c7346.m20162(new SpannableString("false"));
        }
        if ((this.f64324.f8357 & 64) != 0) {
            C4245 c4245Matcher = this.f64331.matcher((CharSequence) str);
            if (c4245Matcher.matches()) {
                String strGroup = c4245Matcher.group(1);
                boolean zContains = this.f64324.f8356.toLowerCase().contains(TextBundle.TEXT_ENTRY);
                if (zContains) {
                    c7346.m20162(new SpannableString(C14483.m34972(strGroup, "sp")));
                }
                c7346.m20162(new SpannableString(C14483.m34972(strGroup, "dp")));
                c7346.m20162(new SpannableString(C14483.m34972(strGroup, "in")));
                c7346.m20162(new SpannableString(C14483.m34972(strGroup, "mm")));
                c7346.m20162(new SpannableString(C14483.m34972(strGroup, "pt")));
                c7346.m20162(new SpannableString(C14483.m34972(strGroup, "px")));
                if (!zContains) {
                    c7346.m20162(new SpannableString(C14483.m34972(strGroup, "sp")));
                }
            }
        }
        i = -1;
        lowerCase = str.toLowerCase();
        c3681 = new C3681();
        while (r2.hasNext()) {
            spannableString.removeSpan(c15549.f50574);
            spannableString.removeSpan(c15549.f50582);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c3681.m11973(spannableString, 0);
                spannableString.setSpan(c15549.f50574, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        c15549.f50579.clear();
        c3681.m11974(c15549.f50579);
        if (c15549.f50579.size() == 1) {
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
      0x0436: PHI (r17v1 l.ۜᩴᩴ) = 
      (r17v0 l.ۜᩴᩴ)
      (r17v0 l.ۜᩴᩴ)
      (r17v0 l.ۜᩴᩴ)
      (r17v0 l.ۜᩴᩴ)
      (r17v0 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
      (r17v2 l.ۜᩴᩴ)
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
    private void m46070(InterfaceC7206 interfaceC7206, boolean z) {
        Iterator it;
        Iterator it2;
        boolean z2;
        C7346 c7346;
        byte b;
        boolean zEquals;
        C20025 c20025;
        Iterator it3 = interfaceC7206.mo15672().iterator();
        C20025 c20026 = this;
        while (it3.hasNext()) {
            InterfaceC10869 interfaceC10869 = (InterfaceC10869) it3.next();
            boolean z3 = interfaceC10869.mo27607() == 1;
            Iterator it4 = interfaceC10869.mo19822().iterator();
            while (it4.hasNext()) {
                String typeName = ((InterfaceC15344) it4.next()).getTypeName();
                C7346 c7347 = c20026.f64328;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z3) {
                            c7347.m20162(new SpannableString(C8947.m23910(new StringBuilder("?"), c20026.f64330, ":attr/")));
                        } else {
                            c7347.m20162(new SpannableString("?attr/"));
                        }
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                } else if (!typeName.equals("attr")) {
                    C2600 c2600 = c20026.f64324;
                    int i = c2600.f8357;
                    String str = c2600.f8356;
                    if (str.equals(typeName)) {
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        c7346 = c7347;
                    } else {
                        int i2 = i & 1;
                        if (i2 != 0 || i == 0) {
                            it = it3;
                            it2 = it4;
                            c7346 = c7347;
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
                                    b = cb.f82047l;
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
                                                    if (!str.contains(AbstractC0329.LOG_TAG)) {
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
                                    c20025 = this;
                                    sb.append(c20025.f64330);
                                    sb.append(":");
                                    sb.append(typeName);
                                    sb.append("/");
                                    c7346.m20162(new SpannableString(sb.toString()));
                                } else {
                                    c20025 = this;
                                    c7346.m20162(new SpannableString(C14442.m34865("@", typeName, "/")));
                                }
                                c20026 = c20025;
                            } else {
                                c20026 = this;
                            }
                            it3 = it;
                            it4 = it2;
                            z3 = z2;
                        } else {
                            it = it3;
                            it2 = it4;
                            z2 = z3;
                            c7346 = c7347;
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
                            c20026 = this;
                        } else {
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder("@");
                                c20025 = this;
                                sb2.append(c20025.f64330);
                                sb2.append(":");
                                sb2.append(typeName);
                                sb2.append("/");
                                c7346.m20162(new SpannableString(sb2.toString()));
                            } else {
                                c20025 = this;
                                c7346.m20162(new SpannableString(C14442.m34865("@", typeName, "/")));
                            }
                            c20026 = c20025;
                        }
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                    zEquals = true;
                    if (zEquals) {
                        c20026 = this;
                    } else {
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder("@");
                            c20025 = this;
                            sb3.append(c20025.f64330);
                            sb3.append(":");
                            sb3.append(typeName);
                            sb3.append("/");
                            c7346.m20162(new SpannableString(sb3.toString()));
                        } else {
                            c20025 = this;
                            c7346.m20162(new SpannableString(C14442.m34865("@", typeName, "/")));
                        }
                        c20026 = c20025;
                    }
                    it3 = it;
                    it4 = it2;
                    z3 = z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46069(InterfaceC7206 interfaceC7206, int i, String str) {
        InterfaceC8697 interfaceC8697Mo9076;
        if (interfaceC7206 == null) {
            return;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(this.f64325)) {
                        int iMo4328 = interfaceC15344.mo4328();
                        for (int i2 = 0; i2 < iMo4328; i2++) {
                            for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                                if (interfaceC2731.mo9075(i2) && (interfaceC8697Mo9076 = interfaceC2731.mo9076(i2)) != null) {
                                    StringBuilder sbM27333 = C10732.m27333(str);
                                    sbM27333.append(interfaceC8697Mo9076.mo18156());
                                    this.f64328.m20162(new SpannableString(sbM27333.toString()));
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
