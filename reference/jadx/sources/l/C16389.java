package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܶ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L6P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16389 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f53181;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53182 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53183;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f53184;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f53185;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f53186;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f53187;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f53188;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f53189;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11228 f53190;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f53191;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f53192;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f53193;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f53194;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean[] f53195;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean[] f53196;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38889(int i) {
        return i == 15 || i == 19 || i == 8 || i == 17;
    }

    public C16389(CharSequence charSequence, C3523 c3523, C7998 c7998, C13406 c13406, C11914 c11914, boolean z, C11228 c11228) {
        String string;
        this.f53191 = charSequence;
        this.f53193 = z;
        this.f53189 = c13406.m33048();
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
        this.f53188 = string;
        this.f53183 = c11914.m29865();
        this.f53184 = c11914.m29867().isEmpty() ? C18870.m43768(charSequence) : c11914.m29867();
        this.f53187 = c11914.m29866();
        this.f53190 = c11228;
        int[] iArr = new int[c3523.size()];
        Arrays.fill(iArr, -1);
        for (InterfaceC8743 interfaceC8743 : c3523.m11539()) {
            C18870.m43769();
            if (interfaceC8743.mo23441() == 0 && interfaceC8743.getType() != -1) {
                iArr[interfaceC8743.mo23438()] = this.f53182.size();
                this.f53182.add(interfaceC8743);
            }
        }
        int[] iArr2 = new int[this.f53182.size()];
        this.f53186 = iArr2;
        Arrays.fill(iArr2, -1);
        int size = this.f53182.size() + 1;
        this.f53194 = new int[size];
        this.f53185 = new int[size];
        this.f53192 = new byte[size];
        this.f53196 = new boolean[size];
        this.f53181 = new boolean[this.f53182.size()];
        this.f53195 = new boolean[this.f53182.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c7998);
        while (!arrayDeque.isEmpty()) {
            C18870.m43769();
            InterfaceC19383 interfaceC19383 = (InterfaceC19383) arrayDeque.pop();
            if (interfaceC19383 instanceof C7998) {
                C7998 c7999 = (C7998) interfaceC19383;
                int iMo1229 = c7999.mo1229();
                if (iMo1229 == 5 || iMo1229 == 6 || iMo1229 == 7 || iMo1229 == 8) {
                    InterfaceC8743 interfaceC8744 = c7999.f26549;
                    InterfaceC8743 interfaceC8745 = c7999.f26548;
                    if (interfaceC8744 != null && interfaceC8745 != null && interfaceC8744.mo23438() >= 0 && interfaceC8745.mo23438() >= 0) {
                        int i2 = iArr[interfaceC8744.mo23438()];
                        int i3 = iArr[interfaceC8745.mo23438()];
                        if (i2 >= 0 && i3 > i2) {
                            int iM38891 = m38891(i2);
                            int iM38892 = m38891(i3);
                            if ((iM38891 == 15 && iM38892 == 16) || ((iM38891 == 17 && iM38892 == 18) || ((iM38891 == 8 || iM38891 == 19) && iM38892 == 20))) {
                                int[] iArr3 = this.f53186;
                                iArr3[i2] = i3;
                                iArr3[i3] = i2;
                            }
                        }
                    }
                }
                for (int childCount = c7999.getChildCount() - 1; childCount >= 0; childCount--) {
                    arrayDeque.push(c7999.mo9151(childCount));
                }
            }
        }
        for (int i4 = 0; i4 < this.f53182.size(); i4++) {
            C18870.m43769();
            if (m38889(m38891(i4)) && this.f53186[i4] < 0) {
                m38887(i4, "Unclosed CSS delimiter");
                m38885(i4, this.f53182.size() + 1);
                return;
            }
            if (m38891(i4) == 7) {
                m38887(i4, "Unterminated CSS string");
                this.f53196[i4 + 1] = true;
            }
            if (m38891(i4) == 24 && ((InterfaceC8743) this.f53182.get(i4)).getText().equals("\\")) {
                m38887(i4, "Invalid CSS escape");
                this.f53196[i4 + 1] = true;
            }
            int iM38893 = m38891(i4);
            if ((iM38893 == 16 || iM38893 == 20 || iM38893 == 18) && this.f53186[i4] < 0) {
                m38887(i4, "Unexpected CSS closing delimiter");
                boolean[] zArr = this.f53196;
                zArr[i4 + 1] = true;
                zArr[i4] = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38887(int i, String str) {
        if (this.f53189) {
            throw C9919.m25740(str, this.f53191, ((InterfaceC8743) this.f53182.get(i)).mo23442());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38893(EnumC2220 enumC2220) {
        ArrayList arrayList = this.f53182;
        if (arrayList.isEmpty()) {
            if (enumC2220 != EnumC2220.COMPONENT_VALUES) {
                this.f53192[0] = 4;
                return;
            }
            return;
        }
        int size = arrayList.size();
        int[] iArr = this.f53194;
        iArr[size] = 1;
        iArr[0] = 1;
        if (enumC2220 != EnumC2220.COMPONENT_VALUES) {
            m38886(0, arrayList.size(), 0, enumC2220 == EnumC2220.DECLARATION_LIST);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x015c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x016a  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0178  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0186  */
    /* JADX WARN: Code duplicated, block: B:114:0x018a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0194  */
    /* JADX WARN: Code duplicated, block: B:118:0x0198  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01be  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:138:0x01de  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:149:0x0204  */
    /* JADX WARN: Code duplicated, block: B:150:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x0212  */
    /* JADX WARN: Code duplicated, block: B:154:0x0216  */
    /* JADX WARN: Code duplicated, block: B:157:0x0220  */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:161:0x022e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0232  */
    /* JADX WARN: Code duplicated, block: B:165:0x023c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0240  */
    /* JADX WARN: Code duplicated, block: B:169:0x024a  */
    /* JADX WARN: Code duplicated, block: B:170:0x024e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0258  */
    /* JADX WARN: Code duplicated, block: B:174:0x025c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0266  */
    /* JADX WARN: Code duplicated, block: B:178:0x026a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0274  */
    /* JADX WARN: Code duplicated, block: B:182:0x0278  */
    /* JADX WARN: Code duplicated, block: B:185:0x0282  */
    /* JADX WARN: Code duplicated, block: B:186:0x0286  */
    /* JADX WARN: Code duplicated, block: B:189:0x0290  */
    /* JADX WARN: Code duplicated, block: B:190:0x0294  */
    /* JADX WARN: Code duplicated, block: B:193:0x029e  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:198:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:202:0x02be  */
    /* JADX WARN: Code duplicated, block: B:205:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:209:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:213:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x02df  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:221:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:225:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:226:0x0300  */
    /* JADX WARN: Code duplicated, block: B:229:0x0309  */
    /* JADX WARN: Code duplicated, block: B:230:0x030b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0314  */
    /* JADX WARN: Code duplicated, block: B:234:0x0316  */
    /* JADX WARN: Code duplicated, block: B:236:0x031a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0323  */
    /* JADX WARN: Code duplicated, block: B:239:0x0337  */
    /* JADX WARN: Code duplicated, block: B:241:0x0356  */
    /* JADX WARN: Code duplicated, block: B:243:0x0360  */
    /* JADX WARN: Code duplicated, block: B:245:0x0366  */
    /* JADX WARN: Code duplicated, block: B:247:0x037e  */
    /* JADX WARN: Code duplicated, block: B:249:0x038c  */
    /* JADX WARN: Code duplicated, block: B:258:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:264:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:269:0x03db  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:275:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:280:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:282:0x0401  */
    /* JADX WARN: Code duplicated, block: B:284:0x0407 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x0409  */
    /* JADX WARN: Code duplicated, block: B:286:0x040b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0410  */
    /* JADX WARN: Code duplicated, block: B:293:0x041c  */
    /* JADX WARN: Code duplicated, block: B:294:0x041e  */
    /* JADX WARN: Code duplicated, block: B:297:0x0425  */
    /* JADX WARN: Code duplicated, block: B:298:0x042e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0437  */
    /* JADX WARN: Code duplicated, block: B:303:0x043c  */
    /* JADX WARN: Code duplicated, block: B:312:0x045d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0462  */
    /* JADX WARN: Code duplicated, block: B:317:0x0469  */
    /* JADX WARN: Code duplicated, block: B:318:0x0479  */
    /* JADX WARN: Code duplicated, block: B:320:0x047d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0482  */
    /* JADX WARN: Code duplicated, block: B:324:0x048d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0494  */
    /* JADX WARN: Code duplicated, block: B:327:0x0498  */
    /* JADX WARN: Code duplicated, block: B:329:0x049c  */
    /* JADX WARN: Code duplicated, block: B:331:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:337:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:354:0x04f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:355:0x04f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:366:0x0514  */
    /* JADX WARN: Code duplicated, block: B:369:0x051e A[LOOP:5: B:365:0x0512->B:369:0x051e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:372:0x052a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:386:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:400:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x0140  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0152  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38886(int i, int i2, int i3, boolean z) {
        byte b;
        int i4;
        boolean z2;
        int i5;
        int[] iArr;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int length;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMo23440;
        int i24;
        ArrayList arrayList;
        int i25;
        int i26;
        int iMo23441;
        int iMo23442;
        CharSequence charSequence;
        int i27;
        int i28;
        String strM12070;
        byte b2;
        int iM38891;
        int i29;
        int i30 = i;
        int i31 = i2;
        int[] iArr2 = this.f53185;
        Arrays.fill(iArr2, i30, i31, i3);
        int i32 = i30 < i31 ? 2 : 0;
        byte[] bArr = this.f53192;
        bArr[i30] = (byte) (i32 | 4);
        int i33 = 1;
        bArr[i31] = (byte) ((i30 < i31 ? 1 : 0) | 4);
        int i34 = i30;
        while (i34 < i31) {
            C18870.m43769();
            if (i34 > i30) {
                bArr[i34] = 7;
            }
            int iM38892 = m38891(i34);
            int[] iArr3 = this.f53194;
            if (iM38892 == 22) {
                iArr3[i34] = i33;
                i34++;
                if (i34 < i31) {
                    iArr3[i34] = 3;
                }
            } else {
                ArrayList arrayList2 = this.f53182;
                if (z) {
                    int i35 = i34 + 1;
                    i4 = 3;
                    if (i35 < i31 && m38891(i34) == 14 && m38891(i35) == 21 && AbstractC3711.m12072(((InterfaceC8743) arrayList2.get(i34)).getText()).startsWith("--")) {
                        z2 = true;
                        b = 7;
                    } else {
                        b = 7;
                    }
                    i5 = i34;
                    while (true) {
                        iArr = this.f53186;
                        if (i5 < i31) {
                            C18870.m43769();
                            iM38891 = m38891(i5);
                            if (m38889(iM38891)) {
                                i29 = iArr[i5];
                                if (i29 >= 0 || i29 >= i31) {
                                    m38885(i34, i31);
                                    return;
                                } else if (iM38891 != 15 || z2) {
                                    i5 = i29 + 1;
                                } else {
                                    i6 = i5;
                                }
                            } else if (iM38891 != 22) {
                                if (iM38891 != 16 || iM38891 == 20 || iM38891 == 18) {
                                    m38885(i34, i5 + 1);
                                } else {
                                    i5++;
                                }
                            }
                        }
                        i6 = -1;
                    }
                    z3 = this.f53193;
                    if (i6 >= 0) {
                        i14 = iArr[i6];
                        if (m38891(i34) == 9) {
                            length = (this.f53188.length() * i3) + this.f53183.length();
                            i15 = i34;
                            i16 = 23;
                            while (i15 < i6) {
                                C18870.m43769();
                                iMo23440 = (((InterfaceC8743) arrayList2.get(i15)).mo23440() - ((InterfaceC8743) arrayList2.get(i15)).mo23442()) + 1 + length;
                                if (i15 > i34) {
                                    i26 = i15 - 1;
                                    i24 = i34;
                                    if (m38891(i26) != i16) {
                                        if (m38891(i15) != i16) {
                                            iMo23441 = ((InterfaceC8743) arrayList2.get(i26)).mo23440() + 1;
                                            iMo23442 = ((InterfaceC8743) arrayList2.get(i15)).mo23442();
                                            while (true) {
                                                if (iMo23441 < iMo23442) {
                                                    charSequence = this.f53191;
                                                    arrayList = arrayList2;
                                                    i25 = i4;
                                                    if (charSequence.charAt(iMo23441) != '/') {
                                                        if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                            iMo23441++;
                                                            arrayList2 = arrayList;
                                                            i4 = i25;
                                                        }
                                                    } else if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                        iMo23441++;
                                                        arrayList2 = arrayList;
                                                        i4 = i25;
                                                    }
                                                }
                                            }
                                        }
                                        length = iMo23440;
                                        i15++;
                                        i16 = 23;
                                        i34 = i24;
                                        arrayList2 = arrayList;
                                        i4 = i25;
                                    } else {
                                        arrayList = arrayList2;
                                        i25 = i4;
                                    }
                                    iMo23440++;
                                    length = iMo23440;
                                    i15++;
                                    i16 = 23;
                                    i34 = i24;
                                    arrayList2 = arrayList;
                                    i4 = i25;
                                } else {
                                    i24 = i34;
                                }
                                arrayList = arrayList2;
                                i25 = i4;
                                length = iMo23440;
                                i15++;
                                i16 = 23;
                                i34 = i24;
                                arrayList2 = arrayList;
                                i4 = i25;
                            }
                            int i36 = i34;
                            i17 = i4;
                            if (z3) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            i18 = i36;
                            while (i18 < i6) {
                                C18870.m43769();
                                if (!m38889(m38891(i18))) {
                                    if (m38891(i18) == 23) {
                                        iArr3[i18] = 1;
                                        i21 = i18 + 1;
                                        if (i21 < i6) {
                                            if (z5) {
                                                i22 = 3;
                                            } else {
                                                i22 = 2;
                                            }
                                            iArr3[i21] = i22;
                                            if (z5) {
                                                bArr[i21] = b;
                                            }
                                        }
                                    }
                                } else if (m38891(i18) == 23) {
                                    iArr3[i18] = 1;
                                    i21 = i18 + 1;
                                    if (i21 < i6) {
                                        if (z5) {
                                            i22 = 3;
                                        } else {
                                            i22 = 2;
                                        }
                                        iArr3[i21] = i22;
                                        if (z5) {
                                            bArr[i21] = b;
                                        }
                                    }
                                }
                                i18++;
                            }
                            iArr3[i6] = 2;
                            i19 = i6 + 1;
                            if (i19 == i14) {
                                i20 = 1;
                            } else {
                                i20 = 3;
                            }
                            iArr3[i14] = i20;
                            iArr2[i14] = i3;
                            if (i19 < i14) {
                                iArr3[i19] = i17;
                                m38886(i19, i14, i3 + 1, true);
                            } else {
                                bArr[i14] = 4;
                            }
                        } else {
                            strM12070 = AbstractC3711.m12070(AbstractC3711.m12072(((InterfaceC8743) arrayList2.get(i34)).getText()));
                            strM12070.getClass();
                            switch (strM12070.hashCode()) {
                                case -2010008239:
                                    if (strM12070.equals("@styleset")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                case -1638716285:
                                    if (strM12070.equals("@-moz-keyframes")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case -1580274675:
                                    if (strM12070.equals("@top-center")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case -1565019305:
                                    if (strM12070.equals("@position-try")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 3;
                                    }
                                    break;
                                case -1376175420:
                                    if (strM12070.equals("@supports")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 4;
                                    }
                                    break;
                                case -1324184772:
                                    if (strM12070.equals("@right-bottom")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 5;
                                    }
                                    break;
                                case -1278440229:
                                    if (strM12070.equals("@font-face")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 6;
                                    }
                                    break;
                                case -1262235164:
                                    if (strM12070.equals("@right-top")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 7;
                                    }
                                    break;
                                case -1152996743:
                                    if (strM12070.equals("@bottom-left-corner")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 8;
                                    }
                                    break;
                                case -1138628731:
                                    if (strM12070.equals("@keyframes")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 9;
                                    }
                                    break;
                                case -1029700792:
                                    if (strM12070.equals("@bottom-right-corner")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 10;
                                    }
                                    break;
                                case -1015297370:
                                    if (strM12070.equals("@right-middle")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 11;
                                    }
                                    break;
                                case -1006843036:
                                    if (strM12070.equals("@top-right")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 12;
                                    }
                                    break;
                                case -1002353161:
                                    if (strM12070.equals("@bottom-center")) {
                                        b2 = -1;
                                    } else {
                                        b2 = cb.k;
                                    }
                                    break;
                                case -984014295:
                                    if (strM12070.equals("@bottom-left")) {
                                        b2 = -1;
                                    } else {
                                        b2 = cb.f82047l;
                                    }
                                    break;
                                case -725398081:
                                    if (strM12070.equals("@top-left")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 15;
                                    }
                                    break;
                                case -706109931:
                                    if (strM12070.equals("@property")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 16;
                                    }
                                    break;
                                case -595813521:
                                    if (strM12070.equals("@annotation")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 17;
                                    }
                                    break;
                                case -442928718:
                                    if (strM12070.equals("@font-palette-values")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 18;
                                    }
                                    break;
                                case -434011078:
                                    if (strM12070.equals("@bottom-right")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 19;
                                    }
                                    break;
                                case -431592131:
                                    if (strM12070.equals("@view-transition")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 20;
                                    }
                                    break;
                                case -391400291:
                                    if (strM12070.equals("@-moz-document")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 21;
                                    }
                                    break;
                                case -116166108:
                                    if (strM12070.equals("@starting-style")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 22;
                                    }
                                    break;
                                case -102919103:
                                    if (strM12070.equals("@container")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 23;
                                    }
                                    break;
                                case -41902889:
                                    if (strM12070.equals("@font-feature-values")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 24;
                                    }
                                    break;
                                case 42653863:
                                    if (strM12070.equals("@-webkit-keyframes")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 25;
                                    }
                                    break;
                                case 62538447:
                                    if (strM12070.equals("@page")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 26;
                                    }
                                    break;
                                case 82937215:
                                    if (strM12070.equals("@ornaments")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 27;
                                    }
                                    break;
                                case 286681635:
                                    if (strM12070.equals("@top-left-corner")) {
                                        b2 = -1;
                                    } else {
                                        b2 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                    }
                                    break;
                                case 451773024:
                                    if (strM12070.equals("@counter-style")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 29;
                                    }
                                    break;
                                case 594607521:
                                    if (strM12070.equals("@character-variant")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 30;
                                    }
                                    break;
                                case 650655966:
                                    if (strM12070.equals("@top-right-corner")) {
                                        b2 = -1;
                                    } else {
                                        b2 = bo.j;
                                    }
                                    break;
                                case 1026618993:
                                    if (strM12070.equals("@left-bottom")) {
                                        b2 = -1;
                                    } else {
                                        b2 = UTF8.S_CS3;
                                    }
                                    break;
                                case 1148752219:
                                    if (strM12070.equals("@document")) {
                                        b2 = -1;
                                    } else {
                                        b2 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                    }
                                    break;
                                case 1335506395:
                                    if (strM12070.equals("@left-middle")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 34;
                                    }
                                    break;
                                case 1935015185:
                                    if (strM12070.equals("@layer")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 35;
                                    }
                                    break;
                                case 1936037796:
                                    if (strM12070.equals("@media")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 36;
                                    }
                                    break;
                                case 1941530132:
                                    if (strM12070.equals("@scope")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 37;
                                    }
                                    break;
                                case 1942112594:
                                    if (strM12070.equals("@swash")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 38;
                                    }
                                    break;
                                case 2004302543:
                                    if (strM12070.equals("@left-top")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 39;
                                    }
                                    break;
                                case 2117962288:
                                    if (strM12070.equals("@stylistic")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 40;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                    length = (this.f53188.length() * i3) + this.f53183.length();
                                    i15 = i34;
                                    i16 = 23;
                                    while (i15 < i6) {
                                        C18870.m43769();
                                        iMo23440 = (((InterfaceC8743) arrayList2.get(i15)).mo23440() - ((InterfaceC8743) arrayList2.get(i15)).mo23442()) + 1 + length;
                                        if (i15 > i34) {
                                            i26 = i15 - 1;
                                            i24 = i34;
                                            if (m38891(i26) != i16) {
                                                if (m38891(i15) != i16) {
                                                    iMo23441 = ((InterfaceC8743) arrayList2.get(i26)).mo23440() + 1;
                                                    iMo23442 = ((InterfaceC8743) arrayList2.get(i15)).mo23442();
                                                    while (true) {
                                                        if (iMo23441 < iMo23442) {
                                                            charSequence = this.f53191;
                                                            arrayList = arrayList2;
                                                            i25 = i4;
                                                            if (charSequence.charAt(iMo23441) != '/' && (i27 = iMo23441 + 1) < iMo23442 && charSequence.charAt(i27) == '*') {
                                                                int iM43742 = C18856.m43742("*/", charSequence, iMo23441 + 2);
                                                                if (iM43742 >= 0 && iM43742 < iMo23442) {
                                                                    iMo23441 = iM43742 + 1;
                                                                }
                                                                break;
                                                            } else if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                            }
                                                            iMo23441++;
                                                            arrayList2 = arrayList;
                                                            i4 = i25;
                                                        }
                                                    }
                                                }
                                                length = iMo23440;
                                                i15++;
                                                i16 = 23;
                                                i34 = i24;
                                                arrayList2 = arrayList;
                                                i4 = i25;
                                            } else {
                                                arrayList = arrayList2;
                                                i25 = i4;
                                            }
                                            iMo23440++;
                                            length = iMo23440;
                                            i15++;
                                            i16 = 23;
                                            i34 = i24;
                                            arrayList2 = arrayList;
                                            i4 = i25;
                                        } else {
                                            i24 = i34;
                                        }
                                        arrayList = arrayList2;
                                        i25 = i4;
                                        length = iMo23440;
                                        i15++;
                                        i16 = 23;
                                        i34 = i24;
                                        arrayList2 = arrayList;
                                        i4 = i25;
                                    }
                                    int i37 = i34;
                                    i17 = i4;
                                    if (z3 || length <= this.f53187) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    i18 = i37;
                                    while (i18 < i6) {
                                        C18870.m43769();
                                        if (!m38889(m38891(i18)) && (i23 = iArr[i18]) >= 0) {
                                            i18 = i23;
                                        } else if (m38891(i18) == 23) {
                                            iArr3[i18] = 1;
                                            i21 = i18 + 1;
                                            if (i21 < i6) {
                                                if (z5) {
                                                    i22 = 3;
                                                } else {
                                                    i22 = 2;
                                                }
                                                iArr3[i21] = i22;
                                                if (z5) {
                                                    bArr[i21] = b;
                                                }
                                            }
                                        }
                                        i18++;
                                    }
                                    iArr3[i6] = 2;
                                    i19 = i6 + 1;
                                    if (i19 == i14) {
                                        i20 = 1;
                                    } else {
                                        i20 = 3;
                                    }
                                    iArr3[i14] = i20;
                                    iArr2[i14] = i3;
                                    if (i19 < i14) {
                                        iArr3[i19] = i17;
                                        m38886(i19, i14, i3 + 1, true);
                                    } else {
                                        bArr[i14] = 4;
                                    }
                                    break;
                                default:
                                    m38885(i34, i14 + 1);
                                    i17 = i4;
                                    break;
                            }
                        }
                        i28 = i14 + 1;
                        i7 = i2;
                        if (i28 < i7) {
                            iArr3[i28] = i17;
                        }
                        i34 = i28;
                    } else {
                        i7 = i31;
                        i8 = i34;
                        int i38 = i4;
                        if (z || (i13 = i8 + 1) >= i5) {
                            i9 = i8;
                        } else {
                            i9 = i8;
                            if (m38891(i9) == 14 && m38891(i13) == 21) {
                                z4 = true;
                            }
                            if (z4) {
                                iArr3[i9 + 1] = 1;
                                if (z2) {
                                    m38885(i9 + 2, Math.min(arrayList2.size(), i5 + 1));
                                } else {
                                    i11 = i9 + 2;
                                    if (i11 < i5) {
                                        iArr3[i11] = 2;
                                        while (i11 < i5) {
                                            C18870.m43769();
                                            if (m38891(i11) == 23) {
                                                iArr3[i11] = 1;
                                                i12 = i11 + 1;
                                                if (i12 < i5) {
                                                    iArr3[i12] = 2;
                                                }
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            } else if (m38891(i9) != 9 && m38891(i9) != 4 && m38891(i9) != 5) {
                                m38887(i9, "Invalid CSS rule or declaration");
                                m38885(i9, Math.min(arrayList2.size(), i5 + 1));
                            }
                            if (i5 >= i7 && m38891(i5) == 22) {
                                if (!z2) {
                                    iArr3[i5] = 1;
                                }
                                if (z3 && z4 && !z2 && i5 + 1 == i7 && i7 < arrayList2.size() && m38891(i7) == 16) {
                                    this.f53181[i5] = true;
                                }
                                i5++;
                                if (i5 < i7) {
                                    iArr3[i5] = i38;
                                }
                            } else {
                                if (!z3 && z4 && !z2 && i9 + 2 < i5 && i5 == i7 && i7 < arrayList2.size() && m38891(i7) == 16) {
                                    i10 = i9;
                                    while (true) {
                                        if (i10 <= i5) {
                                            C18870.m43769();
                                            if (!this.f53196[i10]) {
                                                i10++;
                                            }
                                        } else {
                                            this.f53195[i5 - 1] = true;
                                        }
                                    }
                                }
                                if (i5 == i9) {
                                    i5++;
                                }
                            }
                            i34 = i5;
                        }
                        z4 = false;
                        if (z4) {
                            iArr3[i9 + 1] = 1;
                            if (z2) {
                                m38885(i9 + 2, Math.min(arrayList2.size(), i5 + 1));
                            } else {
                                i11 = i9 + 2;
                                if (i11 < i5) {
                                    iArr3[i11] = 2;
                                    while (i11 < i5) {
                                        C18870.m43769();
                                        if (m38891(i11) == 23) {
                                            iArr3[i11] = 1;
                                            i12 = i11 + 1;
                                            if (i12 < i5) {
                                                iArr3[i12] = 2;
                                            }
                                        }
                                        i11++;
                                    }
                                }
                            }
                        } else if (m38891(i9) != 9) {
                            m38887(i9, "Invalid CSS rule or declaration");
                            m38885(i9, Math.min(arrayList2.size(), i5 + 1));
                        }
                        if (i5 >= i7) {
                            if (!z3) {
                                i10 = i9;
                                while (true) {
                                    if (i10 <= i5) {
                                        C18870.m43769();
                                        if (!this.f53196[i10]) {
                                            i10++;
                                        }
                                    } else {
                                        this.f53195[i5 - 1] = true;
                                    }
                                }
                            }
                            if (i5 == i9) {
                                i5++;
                            }
                        } else {
                            if (!z3) {
                                i10 = i9;
                                while (true) {
                                    if (i10 <= i5) {
                                        C18870.m43769();
                                        if (!this.f53196[i10]) {
                                            i10++;
                                        }
                                    } else {
                                        this.f53195[i5 - 1] = true;
                                    }
                                }
                            }
                            if (i5 == i9) {
                                i5++;
                            }
                        }
                        i34 = i5;
                    }
                    i33 = 1;
                    i31 = i7;
                    i30 = i;
                } else {
                    b = 7;
                    i4 = 3;
                }
                z2 = false;
                i5 = i34;
                while (true) {
                    iArr = this.f53186;
                    if (i5 < i31) {
                        C18870.m43769();
                        iM38891 = m38891(i5);
                        if (m38889(iM38891)) {
                            i29 = iArr[i5];
                            if (i29 >= 0) {
                            }
                            m38885(i34, i31);
                            return;
                        } else if (iM38891 != 22) {
                            if (iM38891 != 16) {
                            }
                            m38885(i34, i5 + 1);
                        }
                    }
                    i6 = -1;
                    z3 = this.f53193;
                    if (i6 >= 0) {
                        i14 = iArr[i6];
                        if (m38891(i34) == 9) {
                            length = (this.f53188.length() * i3) + this.f53183.length();
                            i15 = i34;
                            i16 = 23;
                            while (i15 < i6) {
                                C18870.m43769();
                                iMo23440 = (((InterfaceC8743) arrayList2.get(i15)).mo23440() - ((InterfaceC8743) arrayList2.get(i15)).mo23442()) + 1 + length;
                                if (i15 > i34) {
                                    i26 = i15 - 1;
                                    i24 = i34;
                                    if (m38891(i26) != i16) {
                                        if (m38891(i15) != i16) {
                                            iMo23441 = ((InterfaceC8743) arrayList2.get(i26)).mo23440() + 1;
                                            iMo23442 = ((InterfaceC8743) arrayList2.get(i15)).mo23442();
                                            while (true) {
                                                if (iMo23441 < iMo23442) {
                                                    charSequence = this.f53191;
                                                    arrayList = arrayList2;
                                                    i25 = i4;
                                                    if (charSequence.charAt(iMo23441) != '/') {
                                                        if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                            iMo23441++;
                                                            arrayList2 = arrayList;
                                                            i4 = i25;
                                                        }
                                                    } else if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                        iMo23441++;
                                                        arrayList2 = arrayList;
                                                        i4 = i25;
                                                    }
                                                }
                                            }
                                        }
                                        length = iMo23440;
                                        i15++;
                                        i16 = 23;
                                        i34 = i24;
                                        arrayList2 = arrayList;
                                        i4 = i25;
                                    } else {
                                        arrayList = arrayList2;
                                        i25 = i4;
                                    }
                                    iMo23440++;
                                    length = iMo23440;
                                    i15++;
                                    i16 = 23;
                                    i34 = i24;
                                    arrayList2 = arrayList;
                                    i4 = i25;
                                } else {
                                    i24 = i34;
                                }
                                arrayList = arrayList2;
                                i25 = i4;
                                length = iMo23440;
                                i15++;
                                i16 = 23;
                                i34 = i24;
                                arrayList2 = arrayList;
                                i4 = i25;
                            }
                            int i39 = i34;
                            i17 = i4;
                            if (z3) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            i18 = i39;
                            while (i18 < i6) {
                                C18870.m43769();
                                if (!m38889(m38891(i18))) {
                                    if (m38891(i18) == 23) {
                                        iArr3[i18] = 1;
                                        i21 = i18 + 1;
                                        if (i21 < i6) {
                                            if (z5) {
                                                i22 = 3;
                                            } else {
                                                i22 = 2;
                                            }
                                            iArr3[i21] = i22;
                                            if (z5) {
                                                bArr[i21] = b;
                                            }
                                        }
                                    }
                                } else if (m38891(i18) == 23) {
                                    iArr3[i18] = 1;
                                    i21 = i18 + 1;
                                    if (i21 < i6) {
                                        if (z5) {
                                            i22 = 3;
                                        } else {
                                            i22 = 2;
                                        }
                                        iArr3[i21] = i22;
                                        if (z5) {
                                            bArr[i21] = b;
                                        }
                                    }
                                }
                                i18++;
                            }
                            iArr3[i6] = 2;
                            i19 = i6 + 1;
                            if (i19 == i14) {
                                i20 = 1;
                            } else {
                                i20 = 3;
                            }
                            iArr3[i14] = i20;
                            iArr2[i14] = i3;
                            if (i19 < i14) {
                                iArr3[i19] = i17;
                                m38886(i19, i14, i3 + 1, true);
                            } else {
                                bArr[i14] = 4;
                            }
                        } else {
                            strM12070 = AbstractC3711.m12070(AbstractC3711.m12072(((InterfaceC8743) arrayList2.get(i34)).getText()));
                            strM12070.getClass();
                            switch (strM12070.hashCode()) {
                                case -2010008239:
                                    if (strM12070.equals("@styleset")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1638716285:
                                    if (strM12070.equals("@-moz-keyframes")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1580274675:
                                    if (strM12070.equals("@top-center")) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1565019305:
                                    if (strM12070.equals("@position-try")) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1376175420:
                                    if (strM12070.equals("@supports")) {
                                        b2 = 4;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1324184772:
                                    if (strM12070.equals("@right-bottom")) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1278440229:
                                    if (strM12070.equals("@font-face")) {
                                        b2 = 6;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1262235164:
                                    if (strM12070.equals("@right-top")) {
                                        b2 = 7;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1152996743:
                                    if (strM12070.equals("@bottom-left-corner")) {
                                        b2 = 8;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1138628731:
                                    if (strM12070.equals("@keyframes")) {
                                        b2 = 9;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1029700792:
                                    if (strM12070.equals("@bottom-right-corner")) {
                                        b2 = 10;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1015297370:
                                    if (strM12070.equals("@right-middle")) {
                                        b2 = 11;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1006843036:
                                    if (strM12070.equals("@top-right")) {
                                        b2 = 12;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1002353161:
                                    if (strM12070.equals("@bottom-center")) {
                                        b2 = cb.k;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -984014295:
                                    if (strM12070.equals("@bottom-left")) {
                                        b2 = cb.f82047l;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -725398081:
                                    if (strM12070.equals("@top-left")) {
                                        b2 = 15;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -706109931:
                                    if (strM12070.equals("@property")) {
                                        b2 = 16;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -595813521:
                                    if (strM12070.equals("@annotation")) {
                                        b2 = 17;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -442928718:
                                    if (strM12070.equals("@font-palette-values")) {
                                        b2 = 18;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -434011078:
                                    if (strM12070.equals("@bottom-right")) {
                                        b2 = 19;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -431592131:
                                    if (strM12070.equals("@view-transition")) {
                                        b2 = 20;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -391400291:
                                    if (strM12070.equals("@-moz-document")) {
                                        b2 = 21;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -116166108:
                                    if (strM12070.equals("@starting-style")) {
                                        b2 = 22;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -102919103:
                                    if (strM12070.equals("@container")) {
                                        b2 = 23;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -41902889:
                                    if (strM12070.equals("@font-feature-values")) {
                                        b2 = 24;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 42653863:
                                    if (strM12070.equals("@-webkit-keyframes")) {
                                        b2 = 25;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 62538447:
                                    if (strM12070.equals("@page")) {
                                        b2 = 26;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 82937215:
                                    if (strM12070.equals("@ornaments")) {
                                        b2 = 27;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 286681635:
                                    if (strM12070.equals("@top-left-corner")) {
                                        b2 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 451773024:
                                    if (strM12070.equals("@counter-style")) {
                                        b2 = 29;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 594607521:
                                    if (strM12070.equals("@character-variant")) {
                                        b2 = 30;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 650655966:
                                    if (strM12070.equals("@top-right-corner")) {
                                        b2 = bo.j;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1026618993:
                                    if (strM12070.equals("@left-bottom")) {
                                        b2 = UTF8.S_CS3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1148752219:
                                    if (strM12070.equals("@document")) {
                                        b2 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1335506395:
                                    if (strM12070.equals("@left-middle")) {
                                        b2 = 34;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1935015185:
                                    if (strM12070.equals("@layer")) {
                                        b2 = 35;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1936037796:
                                    if (strM12070.equals("@media")) {
                                        b2 = 36;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1941530132:
                                    if (strM12070.equals("@scope")) {
                                        b2 = 37;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1942112594:
                                    if (strM12070.equals("@swash")) {
                                        b2 = 38;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 2004302543:
                                    if (strM12070.equals("@left-top")) {
                                        b2 = 39;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 2117962288:
                                    if (strM12070.equals("@stylistic")) {
                                        b2 = 40;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                    length = (this.f53188.length() * i3) + this.f53183.length();
                                    i15 = i34;
                                    i16 = 23;
                                    while (i15 < i6) {
                                        C18870.m43769();
                                        iMo23440 = (((InterfaceC8743) arrayList2.get(i15)).mo23440() - ((InterfaceC8743) arrayList2.get(i15)).mo23442()) + 1 + length;
                                        if (i15 > i34) {
                                            i26 = i15 - 1;
                                            i24 = i34;
                                            if (m38891(i26) != i16) {
                                                if (m38891(i15) != i16) {
                                                    iMo23441 = ((InterfaceC8743) arrayList2.get(i26)).mo23440() + 1;
                                                    iMo23442 = ((InterfaceC8743) arrayList2.get(i15)).mo23442();
                                                    while (true) {
                                                        if (iMo23441 < iMo23442) {
                                                            charSequence = this.f53191;
                                                            arrayList = arrayList2;
                                                            i25 = i4;
                                                            if (charSequence.charAt(iMo23441) != '/') {
                                                                if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                                    iMo23441++;
                                                                    arrayList2 = arrayList;
                                                                    i4 = i25;
                                                                }
                                                            } else if (AbstractC3711.m12071(charSequence.charAt(iMo23441))) {
                                                                iMo23441++;
                                                                arrayList2 = arrayList;
                                                                i4 = i25;
                                                            }
                                                        }
                                                    }
                                                }
                                                length = iMo23440;
                                                i15++;
                                                i16 = 23;
                                                i34 = i24;
                                                arrayList2 = arrayList;
                                                i4 = i25;
                                            } else {
                                                arrayList = arrayList2;
                                                i25 = i4;
                                            }
                                            iMo23440++;
                                            length = iMo23440;
                                            i15++;
                                            i16 = 23;
                                            i34 = i24;
                                            arrayList2 = arrayList;
                                            i4 = i25;
                                        } else {
                                            i24 = i34;
                                        }
                                        arrayList = arrayList2;
                                        i25 = i4;
                                        length = iMo23440;
                                        i15++;
                                        i16 = 23;
                                        i34 = i24;
                                        arrayList2 = arrayList;
                                        i4 = i25;
                                    }
                                    int i310 = i34;
                                    i17 = i4;
                                    if (z3) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    i18 = i310;
                                    while (i18 < i6) {
                                        C18870.m43769();
                                        if (!m38889(m38891(i18))) {
                                            if (m38891(i18) == 23) {
                                                iArr3[i18] = 1;
                                                i21 = i18 + 1;
                                                if (i21 < i6) {
                                                    if (z5) {
                                                        i22 = 3;
                                                    } else {
                                                        i22 = 2;
                                                    }
                                                    iArr3[i21] = i22;
                                                    if (z5) {
                                                        bArr[i21] = b;
                                                    }
                                                }
                                            }
                                        } else if (m38891(i18) == 23) {
                                            iArr3[i18] = 1;
                                            i21 = i18 + 1;
                                            if (i21 < i6) {
                                                if (z5) {
                                                    i22 = 3;
                                                } else {
                                                    i22 = 2;
                                                }
                                                iArr3[i21] = i22;
                                                if (z5) {
                                                    bArr[i21] = b;
                                                }
                                            }
                                        }
                                        i18++;
                                    }
                                    iArr3[i6] = 2;
                                    i19 = i6 + 1;
                                    if (i19 == i14) {
                                        i20 = 1;
                                    } else {
                                        i20 = 3;
                                    }
                                    iArr3[i14] = i20;
                                    iArr2[i14] = i3;
                                    if (i19 < i14) {
                                        iArr3[i19] = i17;
                                        m38886(i19, i14, i3 + 1, true);
                                    } else {
                                        bArr[i14] = 4;
                                    }
                                    break;
                                default:
                                    m38885(i34, i14 + 1);
                                    i17 = i4;
                                    break;
                            }
                        }
                        i28 = i14 + 1;
                        i7 = i2;
                        if (i28 < i7) {
                            iArr3[i28] = i17;
                        }
                        i34 = i28;
                    } else {
                        i7 = i31;
                        i8 = i34;
                        int i311 = i4;
                        if (z) {
                            i9 = i8;
                            z4 = false;
                        } else {
                            i9 = i8;
                            z4 = false;
                        }
                        if (z4) {
                            iArr3[i9 + 1] = 1;
                            if (z2) {
                                m38885(i9 + 2, Math.min(arrayList2.size(), i5 + 1));
                            } else {
                                i11 = i9 + 2;
                                if (i11 < i5) {
                                    iArr3[i11] = 2;
                                    while (i11 < i5) {
                                        C18870.m43769();
                                        if (m38891(i11) == 23) {
                                            iArr3[i11] = 1;
                                            i12 = i11 + 1;
                                            if (i12 < i5) {
                                                iArr3[i12] = 2;
                                            }
                                        }
                                        i11++;
                                    }
                                }
                            }
                        } else if (m38891(i9) != 9) {
                            m38887(i9, "Invalid CSS rule or declaration");
                            m38885(i9, Math.min(arrayList2.size(), i5 + 1));
                        }
                        if (i5 >= i7) {
                            if (!z3) {
                                i10 = i9;
                                while (true) {
                                    if (i10 <= i5) {
                                        C18870.m43769();
                                        if (!this.f53196[i10]) {
                                            i10++;
                                        }
                                    } else {
                                        this.f53195[i5 - 1] = true;
                                    }
                                }
                            }
                            if (i5 == i9) {
                                i5++;
                            }
                        } else {
                            if (!z3) {
                                i10 = i9;
                                while (true) {
                                    if (i10 <= i5) {
                                        C18870.m43769();
                                        if (!this.f53196[i10]) {
                                            i10++;
                                        }
                                    } else {
                                        this.f53195[i5 - 1] = true;
                                    }
                                }
                            }
                            if (i5 == i9) {
                                i5++;
                            }
                        }
                        i34 = i5;
                    }
                    i33 = 1;
                    i31 = i7;
                    i30 = i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38892() throws Throwable {
        int i = 0;
        int iMo23440 = 0;
        InterfaceC8743 interfaceC8743 = null;
        while (true) {
            ArrayList arrayList = this.f53182;
            int size = arrayList.size();
            CharSequence charSequence = this.f53191;
            if (i < size) {
                C18870.m43769();
                InterfaceC8743 interfaceC8744 = (InterfaceC8743) arrayList.get(i);
                if (this.f53181[i]) {
                    m38888(C18856.m43743(iMo23440, interfaceC8744.mo23442(), charSequence), i, interfaceC8743, (InterfaceC8743) null);
                    iMo23440 = interfaceC8744.mo23440() + 1;
                } else {
                    m38888(C18856.m43743(iMo23440, interfaceC8744.mo23442(), charSequence), i, interfaceC8743, interfaceC8744);
                    C11228 c11228 = this.f53190;
                    if (c11228.length() == 0 && !this.f53193) {
                        c11228.append((CharSequence) this.f53183);
                    }
                    c11228.m28292(interfaceC8744.mo23442(), interfaceC8744.mo23440() + 1, charSequence);
                    if (this.f53195[i]) {
                        c11228.append(';');
                    }
                    iMo23440 = interfaceC8744.mo23440() + 1;
                    interfaceC8743 = interfaceC8744;
                }
                i++;
            } else {
                m38888(C18856.m43743(iMo23440, charSequence.length(), charSequence), arrayList.size(), interfaceC8743, (InterfaceC8743) null);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38888(String str, int i, InterfaceC8743 interfaceC8743, InterfaceC8743 interfaceC8744) throws Throwable {
        int i2;
        int i3;
        boolean z = this.f53196[i];
        C11228 c11228 = this.f53190;
        if (z) {
            c11228.append((CharSequence) str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int length = str.length();
            boolean z5 = this.f53193;
            if (i4 < length) {
                if ((i4 & 1023) == 0) {
                    C18870.m43769();
                }
                char cCharAt = str.charAt(i4);
                if (AbstractC3711.m12071(cCharAt)) {
                    i4++;
                    z4 = true;
                } else if (cCharAt == '/' && (i3 = i4 + 1) < str.length() && str.charAt(i3) == '*') {
                    int i5 = i4 + 2;
                    int iIndexOf = str.indexOf("*/", i5);
                    boolean z6 = iIndexOf < 0;
                    int length2 = z6 ? str.length() : iIndexOf + 2;
                    if (!z5 || z6 || (i5 < length2 && str.charAt(i5) == '!')) {
                        sb.append((CharSequence) str, i4, length2);
                        z3 = true;
                    } else {
                        String strM12070 = AbstractC3711.m12070(str.substring(i4, length2));
                        if (strM12070.contains("@license") || strM12070.contains("@preserve")) {
                            sb.append((CharSequence) str, i4, length2);
                            z3 = true;
                        }
                    }
                    z2 = true;
                    i4 = length2;
                } else {
                    c11228.append((CharSequence) str);
                    return;
                }
            } else {
                byte[] bArr = this.f53192;
                if (!z5 && z2) {
                    byte b = bArr[i];
                    if ((b & 4) == 0) {
                        c11228.append((CharSequence) str);
                        return;
                    }
                    boolean z7 = (b & 1) != 0;
                    int i6 = 0;
                    while (i6 < str.length()) {
                        C18870.m43769();
                        int iIndexOf2 = str.indexOf("/*", i6);
                        int length3 = iIndexOf2 < 0 ? str.length() : iIndexOf2;
                        boolean z8 = iIndexOf2 >= 0 || (bArr[i] & 2) != 0;
                        String strSubstring = str.substring(i6, length3);
                        int i7 = (z7 && z8) ? 2 : 1;
                        if ((interfaceC8743 == null && i6 == 0) || (interfaceC8744 == null && iIndexOf2 < 0)) {
                            i7 = 0;
                        }
                        c11228.append((CharSequence) C21338.m48564(strSubstring, i7, false, iIndexOf2 >= 0 || interfaceC8744 != null, new RunnableC17881()));
                        if (iIndexOf2 < 0) {
                            return;
                        }
                        int iIndexOf3 = str.indexOf("*/", iIndexOf2 + 2);
                        if (iIndexOf3 < 0) {
                            c11228.m28292(iIndexOf2, str.length(), str);
                            return;
                        } else {
                            i6 = iIndexOf3 + 2;
                            c11228.m28292(iIndexOf2, i6, str);
                            z7 = true;
                        }
                    }
                    return;
                }
                int i8 = this.f53194[i];
                if (z5) {
                    if (z3) {
                        c11228.append((CharSequence) sb);
                    }
                    if (z4 && i8 == 0 && interfaceC8743 != null && interfaceC8744 != null) {
                        c11228.append(' ');
                        return;
                    }
                    if (z3) {
                        return;
                    }
                    if (m38890(interfaceC8744) || (!str.isEmpty() && C2965.m9658(interfaceC8743, interfaceC8744))) {
                        c11228.append((CharSequence) (z4 ? " " : "/**/"));
                        return;
                    }
                    return;
                }
                if (interfaceC8744 == null || interfaceC8743 == null) {
                    return;
                }
                if (i8 != 3) {
                    if (i8 == 2 || (i8 == 0 && z4)) {
                        c11228.append(' ');
                        return;
                    } else {
                        if (m38890(interfaceC8744) || (!str.isEmpty() && C2965.m9658(interfaceC8743, interfaceC8744))) {
                            c11228.append((CharSequence) (z4 ? " " : "/**/"));
                            return;
                        }
                        return;
                    }
                }
                int i9 = bArr[i] & 3;
                String str2 = this.f53184;
                if (i9 == 3) {
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < str.length()) {
                        if ((i10 & 1023) == 0) {
                            C18870.m43769();
                        }
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 == '\r' || cCharAt2 == '\n') {
                            i11++;
                            if (i11 == 2) {
                                c11228.append((CharSequence) str2);
                                break;
                            } else if (cCharAt2 == '\r' && (i2 = i10 + 1) < str.length() && str.charAt(i2) == '\n') {
                                i10 = i2;
                            }
                        }
                        i10++;
                    }
                }
                c11228.append((CharSequence) str2).append((CharSequence) this.f53183);
                for (int i12 = 0; i12 < this.f53185[i]; i12++) {
                    c11228.append((CharSequence) this.f53188);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38890(InterfaceC8743 interfaceC8743) {
        C11228 c11228 = this.f53190;
        int length = c11228.length();
        return interfaceC8743 != null && length >= 2 && c11228.charAt(length + (-2)) == '<' && c11228.charAt(length - 1) == '!' && interfaceC8743.getText().startsWith("--");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38885(int i, int i2) {
        boolean[] zArr = this.f53196;
        Arrays.fill(zArr, i, Math.min(zArr.length, i2), true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m38891(int i) {
        return ((InterfaceC8743) this.f53182.get(i)).getType();
    }
}
