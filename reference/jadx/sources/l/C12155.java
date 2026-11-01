package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12155 implements InterfaceC19517, AdapterView.OnItemClickListener, InterfaceC15887 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40681;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f40682;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f40683;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f40684;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f40685;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f40686;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f40687;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2233 f40688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40689;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f40690 = new ForegroundColorSpan(C20368.f65970);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1154 f40691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f40692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f40694;

    public C12155(C23444 c23444) {
        this.f40684 = c23444;
        C2233 c2233 = new C2233(c23444.requireContext(), 255);
        this.f40688 = c2233;
        c2233.m6863(this);
        c23444.f75915.m16875((InterfaceC15887) this);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e5 A[Catch: EOFException -> 0x028f, TRY_LEAVE, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01f5 A[Catch: EOFException -> 0x028f, TRY_ENTER, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0215  */
    /* JADX WARN: Code duplicated, block: B:133:0x0219 A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0230 A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:137:0x023e A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:141:0x026a A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:148:0x028f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // l.InterfaceC19517
    /* JADX INFO: renamed from: ۙ */
    public final void mo5518(ArrayList arrayList) {
        char c;
        char c2;
        String strMo2396;
        C10744 c10744;
        int i;
        int i2;
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        C23444 c23444 = this.f40684;
        c23444.f75915.m16858(arrayList);
        int iM16916 = c23444.f75915.m16916();
        int iM17020 = c23444.f75915.m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        InterfaceC2916 interfaceC2916M17000 = c23444.f75915.m17000();
        if (iM16916 != iM17020) {
            String strMo2397 = interfaceC2916M17000.mo2396(iM16916, iM17020);
            if (strMo2397.matches("L[^\\s;()]+;")) {
                this.f40681 = 0;
                this.f40692 = strMo2397;
                m30237(arrayList, iM16916, iM17020);
                return;
            }
        }
        Object objMo10751 = c23444.f75894.mo10751();
        if (objMo10751 instanceof C1154) {
            int iM6126 = C1877.m6126(iM16916, interfaceC2916M17000);
            int iM6115 = C1877.m6115(iM16916, interfaceC2916M17000);
            if (iM6115 >= iM17020) {
                String strMo2398 = interfaceC2916M17000.mo2396(iM6126, iM6115);
                C6222 c6222Matcher = C23444.f75888.matcher((CharSequence) strMo2398);
                if (c6222Matcher.matches()) {
                    this.f40681 = 3;
                    this.f40694 = c6222Matcher.group(3);
                    this.f40689 = c6222Matcher.start(3) + iM6126;
                    this.f40691 = (C1154) objMo10751;
                    m30237(arrayList, c6222Matcher.start(3) + iM6126, c6222Matcher.end(3) + iM6126);
                    return;
                }
                C6222 c6222Matcher2 = C23444.f75886.matcher((CharSequence) strMo2398);
                if (c6222Matcher2.matches()) {
                    for (int i7 = 1; i7 <= 3; i7++) {
                        int iStart = c6222Matcher2.start(i7) + iM6126;
                        int iEnd = c6222Matcher2.end(i7) + iM6126;
                        if (iStart <= iM16916 && iM17020 <= iEnd) {
                            this.f40681 = 3;
                            this.f40694 = c6222Matcher2.group(i7);
                            this.f40689 = iStart;
                            this.f40691 = (C1154) objMo10751;
                            m30237(arrayList, iStart, iEnd);
                            return;
                        }
                    }
                }
            }
        }
        char c3 = '-';
        char c4 = '>';
        if (iM16916 > 0) {
            while (true) {
                iM16916--;
                if (iM16916 < 0) {
                    break;
                }
                char cCharAt2 = interfaceC2916M17000.charAt(iM16916);
                if (" \t\n\r,(){}[]:;\"'".indexOf(cCharAt2) != -1) {
                    iM16916++;
                    break;
                }
                if (cCharAt2 == '>' && iM16916 > 0 && interfaceC2916M17000.charAt(iM16916 - 1) == '-') {
                    iM16916--;
                    break;
                }
            }
            if (iM16916 == -1) {
                iM16916 = 0;
            }
        }
        while (true) {
            c = ' ';
            if (iM17020 >= interfaceC2916M17000.length()) {
                break;
            }
            char cCharAt3 = interfaceC2916M17000.charAt(iM17020);
            if (cCharAt3 == ';') {
                iM17020++;
                break;
            }
            if (cCharAt3 == ' ' || cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '(' || cCharAt3 == ':') {
                break;
            } else {
                iM17020++;
            }
        }
        while (iM16916 < iM17020) {
            char cCharAt4 = interfaceC2916M17000.charAt(iM16916);
            if (cCharAt4 != 'F') {
                char c5 = 'L';
                if (cCharAt4 == 'L') {
                    String strMo2399 = interfaceC2916M17000.mo2396(iM16916, iM17020);
                    if (strMo2399.matches("L[^\\s;]+;")) {
                        this.f40681 = 0;
                        this.f40692 = strMo2399;
                        m30237(arrayList, iM16916, iM17020);
                        return;
                    }
                    return;
                }
                if (cCharAt4 != 'S' && cCharAt4 != 'V' && cCharAt4 != 'Z' && cCharAt4 != 'I' && cCharAt4 != 'J') {
                    switch (cCharAt4) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            if (interfaceC2916M17000.charAt(iM16916) == c3 && (i6 = iM16916 + 1) < interfaceC2916M17000.length() && interfaceC2916M17000.charAt(i6) == c4) {
                                this.f40693 = iM16916 + 2;
                                c2 = 1;
                            } else {
                                this.f40693 = iM16916;
                                c2 = 0;
                            }
                            int i8 = iM16916;
                            int i9 = 0;
                            while (true) {
                                int i10 = i8 - 1;
                                if (i10 >= 0) {
                                    char cCharAt5 = interfaceC2916M17000.charAt(i10);
                                    if (c2 == 0) {
                                        if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                            i8 = i10;
                                        } else if (cCharAt5 == '>' && i10 > 0) {
                                            i8 -= 2;
                                            if (interfaceC2916M17000.charAt(i8) == '-') {
                                                c2 = 1;
                                            }
                                        }
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (c2 != 1) {
                                        if (c2 == 2) {
                                            if (cCharAt5 != c && cCharAt5 != '\t' && cCharAt5 != '\n' && cCharAt5 != '\r') {
                                                strMo2396 = (cCharAt5 == c5 && (i10 <= 0 || " \n\r\t,}".indexOf(interfaceC2916M17000.charAt(i8 + (-2))) != -1)) ? interfaceC2916M17000.mo2396(i10, i9) : null;
                                            }
                                            if (strMo2396 != null) {
                                                c10744 = new C10744(interfaceC2916M17000, iM16916);
                                                try {
                                                    c10744.m27039();
                                                    i = this.f40693;
                                                    c10744.m27040(":( \t\n\r");
                                                    i2 = c10744.f36639;
                                                    c10744.m27039();
                                                    if (c10744.f36639 < interfaceC2916M17000.length()) {
                                                        int i11 = c10744.f36639;
                                                        c10744.f36639 = i11 + 1;
                                                        cCharAt = interfaceC2916M17000.charAt(i11);
                                                        if (cCharAt == ':') {
                                                            c10744.m27039();
                                                            int i12 = c10744.f36639;
                                                            c10744.m27040(" \t\n\r");
                                                            int i13 = c10744.f36639;
                                                            this.f40681 = 1;
                                                            this.f40692 = strMo2396;
                                                            this.f40685 = interfaceC2916M17000.mo2396(i, i2);
                                                            this.f40687 = interfaceC2916M17000.mo2396(i12, i13);
                                                            m30237(arrayList, this.f40693, i13);
                                                            return;
                                                        }
                                                        if (cCharAt == '(') {
                                                            c10744.m27039();
                                                            i3 = c10744.f36639;
                                                            c10744.m27040(") \t\n\r");
                                                            i4 = c10744.f36639;
                                                            c10744.m27039();
                                                            if (c10744.f36639 < interfaceC2916M17000.length()) {
                                                                i5 = c10744.f36639;
                                                                c10744.f36639 = i5 + 1;
                                                                if (interfaceC2916M17000.charAt(i5) == ')') {
                                                                    c10744.m27039();
                                                                    int i14 = c10744.f36639;
                                                                    c10744.m27040(" \t\n\r");
                                                                    int i15 = c10744.f36639;
                                                                    this.f40681 = 2;
                                                                    this.f40692 = strMo2396;
                                                                    this.f40682 = interfaceC2916M17000.mo2396(i, i2);
                                                                    this.f40686 = interfaceC2916M17000.mo2396(i3, i4);
                                                                    this.f40683 = interfaceC2916M17000.mo2396(i14, i15);
                                                                    m30237(arrayList, this.f40693, i15);
                                                                    return;
                                                                }
                                                            }
                                                            throw new EOFException();
                                                        }
                                                        return;
                                                    }
                                                    throw new EOFException();
                                                } catch (EOFException unused) {
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        i8 = i10;
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                        i8 = i10;
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (cCharAt5 == ';') {
                                        c2 = 2;
                                        c5 = 'L';
                                        i9 = i8;
                                        i8 = i10;
                                    }
                                }
                                if (strMo2396 != null) {
                                    c10744 = new C10744(interfaceC2916M17000, iM16916);
                                    c10744.m27039();
                                    i = this.f40693;
                                    c10744.m27040(":( \t\n\r");
                                    i2 = c10744.f36639;
                                    c10744.m27039();
                                    if (c10744.f36639 < interfaceC2916M17000.length()) {
                                        int i16 = c10744.f36639;
                                        c10744.f36639 = i16 + 1;
                                        cCharAt = interfaceC2916M17000.charAt(i16);
                                        if (cCharAt == ':') {
                                            c10744.m27039();
                                            int i17 = c10744.f36639;
                                            c10744.m27040(" \t\n\r");
                                            int i18 = c10744.f36639;
                                            this.f40681 = 1;
                                            this.f40692 = strMo2396;
                                            this.f40685 = interfaceC2916M17000.mo2396(i, i2);
                                            this.f40687 = interfaceC2916M17000.mo2396(i17, i18);
                                            m30237(arrayList, this.f40693, i18);
                                            return;
                                        }
                                        if (cCharAt == '(') {
                                            c10744.m27039();
                                            i3 = c10744.f36639;
                                            c10744.m27040(") \t\n\r");
                                            i4 = c10744.f36639;
                                            c10744.m27039();
                                            if (c10744.f36639 < interfaceC2916M17000.length()) {
                                                i5 = c10744.f36639;
                                                c10744.f36639 = i5 + 1;
                                                if (interfaceC2916M17000.charAt(i5) == ')') {
                                                    c10744.m27039();
                                                    int i19 = c10744.f36639;
                                                    c10744.m27040(" \t\n\r");
                                                    int i110 = c10744.f36639;
                                                    this.f40681 = 2;
                                                    this.f40692 = strMo2396;
                                                    this.f40682 = interfaceC2916M17000.mo2396(i, i2);
                                                    this.f40686 = interfaceC2916M17000.mo2396(i3, i4);
                                                    this.f40683 = interfaceC2916M17000.mo2396(i19, i110);
                                                    m30237(arrayList, this.f40693, i110);
                                                    return;
                                                }
                                            }
                                            throw new EOFException();
                                        }
                                        return;
                                    }
                                    throw new EOFException();
                                }
                                return;
                            }
                    }
                }
            }
            iM16916++;
            c3 = '-';
            c = ' ';
            c4 = '>';
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.֡ۘۜ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30237(ArrayList arrayList, int i, int i2) {
        C23444 c23444 = this.f40684;
        C4555 c4555M17026 = c23444.f75915.m17026();
        c4555M17026.f16178 = true;
        c4555M17026.f16179 = i;
        c4555M17026.f16180 = i2;
        c23444.f75915.invalidate();
        arrayList.add(new C16388(this, new InterfaceC17295() { // from class: l.֡ۘۜ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                C12155.m30238(this.f1239, (C6111) obj);
            }
        }, c4555M17026));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30238(C12155 c12155, C6111 c6111) {
        C8500 c8500;
        C2233 c2233 = c12155.f40688;
        ForegroundColorSpan foregroundColorSpan = c12155.f40690;
        C23444 c23444 = c12155.f40684;
        if (c23444.f75898) {
            int i = 3;
            if (c12155.f40681 != 3) {
                String strM46498 = C20630.m46498(1, 1, c12155.f40692);
                String strM16567 = c23444.f75896.m16567(strM46498);
                if (!c23444.f75896.m16563(strM16567)) {
                    ((ActivityC5677) c23444.requireActivity()).m31000("Class not found: " + strM46498.replace('/', '.'), false);
                    return;
                }
                int i2 = c12155.f40681;
                if (i2 == 1) {
                    c8500 = new C8500(7);
                    c8500.f29470 = 0;
                    c8500.f29473 = c12155.f40685.length();
                    c8500.f29466 = c12155.f40685;
                    c8500.f29465 = c12155.f40687;
                } else if (i2 == 2) {
                    c8500 = new C8500(3);
                    c8500.f29470 = 0;
                    c8500.f29473 = c12155.f40682.length();
                    c8500.f29466 = c12155.f40682;
                    c8500.f29465 = c12155.f40683;
                    c8500.f29467 = c12155.f40686;
                } else {
                    c8500 = null;
                }
                ((ActivityC5677) c23444.requireActivity()).m15660(strM16567, c8500);
                c23444.f75896.m16532(strM16567);
                return;
            }
            int iM4246 = c12155.f40691.m4246();
            int iM4251 = c12155.f40691.m4251();
            ArrayList arrayList = new ArrayList();
            String strMo2396 = c6111.m17000().mo2396(iM4246, iM4251);
            C6222 c6222Matcher = C23444.f75888.matcher((CharSequence) strMo2396);
            while (c6222Matcher.find()) {
                if (c12155.f40694.equals(c6222Matcher.group(i))) {
                    String strTrim = c6222Matcher.group().trim();
                    int iStart = c6222Matcher.start(i) + iM4246;
                    C17093 c17093 = new C17093("[" + (c6111.m16981(iStart) + 1) + "]  " + strTrim);
                    c17093.m39874(iStart);
                    if (iStart == c12155.f40689) {
                        c17093.setSpan(foregroundColorSpan, 0, c17093.length(), 17);
                    }
                    arrayList.add(c17093);
                    i = 3;
                }
            }
            C6222 c6222Matcher2 = C23444.f75886.matcher((CharSequence) strMo2396);
            while (c6222Matcher2.find()) {
                for (int i3 = 1; i3 <= 3; i3++) {
                    if (c12155.f40694.equals(c6222Matcher2.group(i3))) {
                        String strTrim2 = c6222Matcher2.group().trim();
                        if (strTrim2.length() > 200) {
                            strTrim2 = C13012.m32189(200, strTrim2);
                        }
                        int iStart2 = c6222Matcher2.start(i3) + iM4246;
                        C17093 c17094 = new C17093("[" + (c6111.m16981(iStart2) + 1) + "]  " + strTrim2);
                        c17094.m39874(iStart2);
                        if (iStart2 == c12155.f40689) {
                            c17094.setSpan(foregroundColorSpan, 0, c17094.length(), 17);
                        }
                        int iIndexOf = c6222Matcher2.group().indexOf(46) - TextUtils.indexOf((CharSequence) c17094, '.');
                        int iStart3 = (c6222Matcher2.start(i3) - c6222Matcher2.start()) - iIndexOf;
                        int iEnd = (c6222Matcher2.end(i3) - c6222Matcher2.start()) - iIndexOf;
                        if (iEnd <= c17094.length()) {
                            c17094.setSpan(new StyleSpan(1), iStart3, iEnd, 17);
                        }
                        arrayList.add(c17094);
                    }
                }
            }
            Collections.sort(arrayList);
            c2233.m6864(arrayList);
            c2233.m6865(c6111, c6111.m16916());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2233 c2233 = this.f40688;
        C17093 c17093 = (C17093) c2233.m6861(i);
        C23444 c23444 = this.f40684;
        c23444.f75915.m16934();
        c23444.f75915.mo17029(c17093.m39873());
        c23444.f75915.m16992(false);
        c2233.m6862();
    }

    @Override // l.InterfaceC15887
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30239() {
        this.f40688.m6862();
    }
}
