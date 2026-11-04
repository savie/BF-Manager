package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۧ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11857 implements InterfaceC5486, AdapterView.OnItemClickListener, InterfaceC1076 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9685 f38203;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f38204;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f38205;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f38206;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f38207;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1380 f38208;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f38209;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f38210;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f38211;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f38212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f38213 = new ForegroundColorSpan(C3296.f10738);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38214;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f38215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38216;

    public C11857(C16332 c16332) {
        this.f38206 = c16332;
        C1380 c1380 = new C1380(c16332.requireContext(), 255);
        this.f38208 = c1380;
        c1380.m5066(this);
        c16332.f53032.m53905((InterfaceC1076) this);
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
    @Override // l.InterfaceC5486
    /* JADX INFO: renamed from: ۙ */
    public final void mo6299(ArrayList arrayList) {
        char c;
        char c2;
        String strMo15351;
        C17824 c17824;
        int i;
        int i2;
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        C16332 c16332 = this.f38206;
        c16332.f53032.mo52301(arrayList);
        int iM53968 = c16332.f53032.m53968();
        int iM53882 = c16332.f53032.m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        InterfaceC19106 interfaceC19106M54021 = c16332.f53032.m54021();
        if (iM53968 != iM53882) {
            String strMo15352 = interfaceC19106M54021.mo15351(iM53968, iM53882);
            if (strMo15352.matches("L[^\\s;()]+;")) {
                this.f38214 = 0;
                this.f38215 = strMo15352;
                m29709(arrayList, iM53968, iM53882);
                return;
            }
        }
        Object objMo14424 = c16332.f53027.mo14424();
        if (objMo14424 instanceof C9685) {
            int iM43913 = C18910.m43913(iM53968, interfaceC19106M54021);
            int iM43895 = C18910.m43895(iM53968, interfaceC19106M54021);
            if (iM43895 >= iM53882) {
                String strMo15353 = interfaceC19106M54021.mo15351(iM43913, iM43895);
                C4245 c4245Matcher = C16332.f53019.matcher((CharSequence) strMo15353);
                if (c4245Matcher.matches()) {
                    this.f38214 = 3;
                    this.f38210 = c4245Matcher.group(3);
                    this.f38205 = c4245Matcher.start(3) + iM43913;
                    this.f38203 = (C9685) objMo14424;
                    m29709(arrayList, c4245Matcher.start(3) + iM43913, c4245Matcher.end(3) + iM43913);
                    return;
                }
                C4245 c4245Matcher2 = C16332.f53021.matcher((CharSequence) strMo15353);
                if (c4245Matcher2.matches()) {
                    for (int i7 = 1; i7 <= 3; i7++) {
                        int iStart = c4245Matcher2.start(i7) + iM43913;
                        int iEnd = c4245Matcher2.end(i7) + iM43913;
                        if (iStart <= iM53968 && iM53882 <= iEnd) {
                            this.f38214 = 3;
                            this.f38210 = c4245Matcher2.group(i7);
                            this.f38205 = iStart;
                            this.f38203 = (C9685) objMo14424;
                            m29709(arrayList, iStart, iEnd);
                            return;
                        }
                    }
                }
            }
        }
        char c3 = '-';
        char c4 = '>';
        if (iM53968 > 0) {
            while (true) {
                iM53968--;
                if (iM53968 < 0) {
                    break;
                }
                char cCharAt2 = interfaceC19106M54021.charAt(iM53968);
                if (" \t\n\r,(){}[]:;\"'".indexOf(cCharAt2) != -1) {
                    iM53968++;
                    break;
                }
                if (cCharAt2 == '>' && iM53968 > 0 && interfaceC19106M54021.charAt(iM53968 - 1) == '-') {
                    iM53968--;
                    break;
                }
            }
            if (iM53968 == -1) {
                iM53968 = 0;
            }
        }
        while (true) {
            c = ' ';
            if (iM53882 >= interfaceC19106M54021.length()) {
                break;
            }
            char cCharAt3 = interfaceC19106M54021.charAt(iM53882);
            if (cCharAt3 == ';') {
                iM53882++;
                break;
            }
            if (cCharAt3 == ' ' || cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '(' || cCharAt3 == ':') {
                break;
            } else {
                iM53882++;
            }
        }
        while (iM53968 < iM53882) {
            char cCharAt4 = interfaceC19106M54021.charAt(iM53968);
            if (cCharAt4 != 'F') {
                char c5 = 'L';
                if (cCharAt4 == 'L') {
                    String strMo15354 = interfaceC19106M54021.mo15351(iM53968, iM53882);
                    if (strMo15354.matches("L[^\\s;]+;")) {
                        this.f38214 = 0;
                        this.f38215 = strMo15354;
                        m29709(arrayList, iM53968, iM53882);
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
                            if (interfaceC19106M54021.charAt(iM53968) == c3 && (i6 = iM53968 + 1) < interfaceC19106M54021.length() && interfaceC19106M54021.charAt(i6) == c4) {
                                this.f38216 = iM53968 + 2;
                                c2 = 1;
                            } else {
                                this.f38216 = iM53968;
                                c2 = 0;
                            }
                            int i8 = iM53968;
                            int i9 = 0;
                            while (true) {
                                int i10 = i8 - 1;
                                if (i10 >= 0) {
                                    char cCharAt5 = interfaceC19106M54021.charAt(i10);
                                    if (c2 == 0) {
                                        if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                            i8 = i10;
                                        } else if (cCharAt5 == '>' && i10 > 0) {
                                            i8 -= 2;
                                            if (interfaceC19106M54021.charAt(i8) == '-') {
                                                c2 = 1;
                                            }
                                        }
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (c2 != 1) {
                                        if (c2 == 2) {
                                            if (cCharAt5 != c && cCharAt5 != '\t' && cCharAt5 != '\n' && cCharAt5 != '\r') {
                                                strMo15351 = (cCharAt5 == c5 && (i10 <= 0 || " \n\r\t,}".indexOf(interfaceC19106M54021.charAt(i8 + (-2))) != -1)) ? interfaceC19106M54021.mo15351(i10, i9) : null;
                                            }
                                            if (strMo15351 != null) {
                                                c17824 = new C17824(interfaceC19106M54021, iM53968);
                                                try {
                                                    c17824.m41668();
                                                    i = this.f38216;
                                                    c17824.m41669(":( \t\n\r");
                                                    i2 = c17824.f58480;
                                                    c17824.m41668();
                                                    if (c17824.f58480 < interfaceC19106M54021.length()) {
                                                        int i11 = c17824.f58480;
                                                        c17824.f58480 = i11 + 1;
                                                        cCharAt = interfaceC19106M54021.charAt(i11);
                                                        if (cCharAt == ':') {
                                                            c17824.m41668();
                                                            int i12 = c17824.f58480;
                                                            c17824.m41669(" \t\n\r");
                                                            int i13 = c17824.f58480;
                                                            this.f38214 = 1;
                                                            this.f38215 = strMo15351;
                                                            this.f38211 = interfaceC19106M54021.mo15351(i, i2);
                                                            this.f38204 = interfaceC19106M54021.mo15351(i12, i13);
                                                            m29709(arrayList, this.f38216, i13);
                                                            return;
                                                        }
                                                        if (cCharAt == '(') {
                                                            c17824.m41668();
                                                            i3 = c17824.f58480;
                                                            c17824.m41669(") \t\n\r");
                                                            i4 = c17824.f58480;
                                                            c17824.m41668();
                                                            if (c17824.f58480 < interfaceC19106M54021.length()) {
                                                                i5 = c17824.f58480;
                                                                c17824.f58480 = i5 + 1;
                                                                if (interfaceC19106M54021.charAt(i5) == ')') {
                                                                    c17824.m41668();
                                                                    int i14 = c17824.f58480;
                                                                    c17824.m41669(" \t\n\r");
                                                                    int i15 = c17824.f58480;
                                                                    this.f38214 = 2;
                                                                    this.f38215 = strMo15351;
                                                                    this.f38209 = interfaceC19106M54021.mo15351(i, i2);
                                                                    this.f38207 = interfaceC19106M54021.mo15351(i3, i4);
                                                                    this.f38212 = interfaceC19106M54021.mo15351(i14, i15);
                                                                    m29709(arrayList, this.f38216, i15);
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
                                if (strMo15351 != null) {
                                    c17824 = new C17824(interfaceC19106M54021, iM53968);
                                    c17824.m41668();
                                    i = this.f38216;
                                    c17824.m41669(":( \t\n\r");
                                    i2 = c17824.f58480;
                                    c17824.m41668();
                                    if (c17824.f58480 < interfaceC19106M54021.length()) {
                                        int i16 = c17824.f58480;
                                        c17824.f58480 = i16 + 1;
                                        cCharAt = interfaceC19106M54021.charAt(i16);
                                        if (cCharAt == ':') {
                                            c17824.m41668();
                                            int i17 = c17824.f58480;
                                            c17824.m41669(" \t\n\r");
                                            int i18 = c17824.f58480;
                                            this.f38214 = 1;
                                            this.f38215 = strMo15351;
                                            this.f38211 = interfaceC19106M54021.mo15351(i, i2);
                                            this.f38204 = interfaceC19106M54021.mo15351(i17, i18);
                                            m29709(arrayList, this.f38216, i18);
                                            return;
                                        }
                                        if (cCharAt == '(') {
                                            c17824.m41668();
                                            i3 = c17824.f58480;
                                            c17824.m41669(") \t\n\r");
                                            i4 = c17824.f58480;
                                            c17824.m41668();
                                            if (c17824.f58480 < interfaceC19106M54021.length()) {
                                                i5 = c17824.f58480;
                                                c17824.f58480 = i5 + 1;
                                                if (interfaceC19106M54021.charAt(i5) == ')') {
                                                    c17824.m41668();
                                                    int i19 = c17824.f58480;
                                                    c17824.m41669(" \t\n\r");
                                                    int i110 = c17824.f58480;
                                                    this.f38214 = 2;
                                                    this.f38215 = strMo15351;
                                                    this.f38209 = interfaceC19106M54021.mo15351(i, i2);
                                                    this.f38207 = interfaceC19106M54021.mo15351(i3, i4);
                                                    this.f38212 = interfaceC19106M54021.mo15351(i19, i110);
                                                    m29709(arrayList, this.f38216, i110);
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
            iM53968++;
            c3 = '-';
            c = ' ';
            c4 = '>';
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۚ᩶ۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29709(ArrayList arrayList, int i, int i2) {
        C16332 c16332 = this.f38206;
        C10155 c10155M54061 = c16332.f53032.m54061();
        c10155M54061.f32517 = true;
        c10155M54061.f32518 = i;
        c10155M54061.f32519 = i2;
        c16332.f53032.invalidate();
        arrayList.add(new C2163(this, new InterfaceC0818() { // from class: l.ۚ᩶ۧ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                C11857.m29710(this.f20179, (C24132) obj);
            }
        }, c10155M54061));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29710(C11857 c11857, C24132 c24132) {
        C15301 c15301;
        C1380 c1380 = c11857.f38208;
        ForegroundColorSpan foregroundColorSpan = c11857.f38213;
        C16332 c16332 = c11857.f38206;
        if (c16332.f53026) {
            int i = 3;
            if (c11857.f38214 != 3) {
                String strM5124 = C1402.m5124(1, 1, c11857.f38215);
                String strM46605 = c16332.f53033.m46605(strM5124);
                if (!c16332.f53033.m46617(strM46605)) {
                    ((ActivityC0848) c16332.requireActivity()).m40400("Class not found: " + strM5124.replace('/', '.'), false);
                    return;
                }
                int i2 = c11857.f38214;
                if (i2 == 1) {
                    c15301 = new C15301(7);
                    c15301.f50019 = 0;
                    c15301.f50022 = c11857.f38211.length();
                    c15301.f50018 = c11857.f38211;
                    c15301.f50020 = c11857.f38204;
                } else if (i2 == 2) {
                    c15301 = new C15301(3);
                    c15301.f50019 = 0;
                    c15301.f50022 = c11857.f38209.length();
                    c15301.f50018 = c11857.f38209;
                    c15301.f50020 = c11857.f38212;
                    c15301.f50014 = c11857.f38207;
                } else {
                    c15301 = null;
                }
                ((ActivityC0848) c16332.requireActivity()).m3431(strM46605, c15301);
                c16332.f53033.m46575(strM46605);
                return;
            }
            int iM25269 = c11857.f38203.m25269();
            int iM25268 = c11857.f38203.m25268();
            ArrayList arrayList = new ArrayList();
            String strMo15351 = c24132.m54021().mo15351(iM25269, iM25268);
            C4245 c4245Matcher = C16332.f53019.matcher((CharSequence) strMo15351);
            while (c4245Matcher.find()) {
                if (c11857.f38210.equals(c4245Matcher.group(i))) {
                    String strTrim = c4245Matcher.group().trim();
                    int iStart = c4245Matcher.start(i) + iM25269;
                    C25284 c25284 = new C25284("[" + (c24132.m54067(iStart) + 1) + "]  " + strTrim);
                    c25284.m56465(iStart);
                    if (iStart == c11857.f38205) {
                        c25284.setSpan(foregroundColorSpan, 0, c25284.length(), 17);
                    }
                    arrayList.add(c25284);
                    i = 3;
                }
            }
            C4245 c4245Matcher2 = C16332.f53021.matcher((CharSequence) strMo15351);
            while (c4245Matcher2.find()) {
                for (int i3 = 1; i3 <= 3; i3++) {
                    if (c11857.f38210.equals(c4245Matcher2.group(i3))) {
                        String strTrim2 = c4245Matcher2.group().trim();
                        if (strTrim2.length() > 200) {
                            strTrim2 = C18969.m44060(200, strTrim2);
                        }
                        int iStart2 = c4245Matcher2.start(i3) + iM25269;
                        C25284 c25285 = new C25284("[" + (c24132.m54067(iStart2) + 1) + "]  " + strTrim2);
                        c25285.m56465(iStart2);
                        if (iStart2 == c11857.f38205) {
                            c25285.setSpan(foregroundColorSpan, 0, c25285.length(), 17);
                        }
                        int iIndexOf = c4245Matcher2.group().indexOf(46) - TextUtils.indexOf((CharSequence) c25285, '.');
                        int iStart3 = (c4245Matcher2.start(i3) - c4245Matcher2.start()) - iIndexOf;
                        int iEnd = (c4245Matcher2.end(i3) - c4245Matcher2.start()) - iIndexOf;
                        if (iEnd <= c25285.length()) {
                            c25285.setSpan(new StyleSpan(1), iStart3, iEnd, 17);
                        }
                        arrayList.add(c25285);
                    }
                }
            }
            Collections.sort(arrayList);
            c1380.m5067(arrayList);
            c1380.m5069(c24132, c24132.m53968());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1380 c1380 = this.f38208;
        C25284 c25284 = (C25284) c1380.m5064(i);
        C16332 c16332 = this.f38206;
        c16332.f53032.m54044();
        c16332.f53032.mo52339(c25284.m56464());
        c16332.f53032.m54077(false);
        c1380.m5065();
    }

    @Override // l.InterfaceC1076
    /* JADX INFO: renamed from: ۙ */
    public final void mo4037() {
        this.f38208.m5065();
    }
}
