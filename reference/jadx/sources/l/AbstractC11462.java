package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۨۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11462 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f38582;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f38583;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f38584;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22501 f38585;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f38586;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f38587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f38588;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13579 f38589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38590;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f38591;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38592;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38593;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f38594;

    /* JADX INFO: renamed from: ۟ۧۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f38574 = {1900, -13134, -13127, -13122, -13058, -13123, -13148, -13058, -13152, -13124, -13147, -13149};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f38576 = {0, 1, 4, 3, 2, 5, 6, 7, 8, 9};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile int f38581 = (int) (System.currentTimeMillis() % 10000000);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f38577 = new AtomicLong();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f38573 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f38579 = new C20903(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f38575 = new C15965(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f38578 = new C20198(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f38580 = new C0441(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֡ */
    public abstract AbstractC9677 mo13029();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13030();

    /* JADX INFO: renamed from: ۗ */
    public abstract boolean mo13031();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable mo28619(boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23626(String str, boolean z) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23627(InterfaceC2557 interfaceC2557) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13033(C11545 c11545, List list, Runnable runnable);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13034(C11545 c11545, C11545 c11546);

    /* JADX INFO: renamed from: ۙۙ */
    public boolean mo23629() {
        return false;
    }

    /* JADX INFO: renamed from: ۛ */
    public abstract boolean mo13036();

    /* JADX INFO: renamed from: ۢ */
    public void mo23632() {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract List mo13037();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo13038(C11545 c11545);

    /* JADX INFO: renamed from: ۨ */
    public boolean mo23633(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract String mo13039();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo28635(C11545 c11545) {
        return null;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC20745 mo13040(InterfaceC2557 interfaceC2557);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo28636() {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo13041(String str);

    /* JADX INFO: renamed from: ܰۙ */
    public abstract boolean mo13042();

    /* JADX INFO: renamed from: ܳ */
    public int mo23635() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean mo28638() {
        return false;
    }

    /* JADX INFO: renamed from: ᩹ */
    public abstract C6086 mo13045();

    /* JADX INFO: renamed from: ᩻ */
    public abstract List mo13046();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC4674 mo28630() {
        return new C19369(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:65:0x0227 A[PHI: r4 r6 r7 r16
      0x0227: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:64:0x0225, B:56:0x01e6, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:64:0x0225, B:56:0x01e6, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:64:0x0225, B:56:0x01e6, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v23 int) = (r16v8 int), (r16v11 int), (r16v25 int) binds: [B:64:0x0225, B:56:0x01e6, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0259 A[PHI: r1 r3 r8 r10 r16 r17
      0x0259: PHI (r1v4 java.lang.String) = 
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v3 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
     binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v5 int) binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r10v3 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r16v29 int) = (r16v7 int), (r16v16 int), (r16v17 int), (r16v18 int), (r16v22 int), (r16v24 int), (r16v33 int) binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r17v3 l.᩷۠ۚ) = (r17v1 l.᩷۠ۚ), (r17v2 l.᩷۠ۚ), (r17v1 l.᩷۠ۚ), (r17v1 l.᩷۠ۚ), (r17v1 l.᩷۠ۚ), (r17v1 l.᩷۠ۚ), (r17v1 l.᩷۠ۚ) binds: [B:68:0x0257, B:44:0x0155, B:40:0x0130, B:36:0x010d, B:20:0x0079, B:14:0x0050, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x028e A[PHI: r2 r5 r16
      0x028e: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]) binds: [B:72:0x028c, B:60:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:72:0x028c, B:60:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r16v9 int) = (r16v6 int), (r16v10 int) binds: [B:72:0x028c, B:60:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List m28631() {
        int iM45029;
        int i;
        int i2;
        int i3;
        String strM8160 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1967220265;
        int i12 = C0050.f912;
        int i13 = C1025.f4800;
        int iM450210 = (C19806.m45029("֡ۚ") + i12) * 29;
        int i14 = ((iM450210 ^ i13) * (-26375)) ^ (-1914397700);
        int i15 = iM450210 ^ (-1947529764);
        AbstractC20745 abstractC20745M46711 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i13) * 8041) >> 31));
            switch (i16) {
                case -2123918256:
                case 355831743:
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ܿۙ") ^ i12) * (-31);
                        i = ((iM45029 ^ i13) * (-21279)) ^ (-1331132599);
                        i2 = 1697089621;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i12;
                        i = ((iM45029 ^ i13) * 21905) ^ (-1085034597);
                        i2 = -1519363659;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -2102249447:
                case 2104700027:
                    i16 = i16;
                    abstractC20745M46711 = C11904.f39935.m46711();
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = C19806.m45029("ۘᩳ") ^ i12;
                        i = ((iM45029 ^ i13) * 25859) ^ 1691444346;
                        i2 = 1343328248;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1797642012:
                case 228685043:
                    return C2431.f9738;
                case -1543691476:
                case 1805828755:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0671.m3008() >= 0) {
                        i16 = i16;
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = C19806.m45029("۬۠") ^ i13;
                        i16 = i16;
                        i = ((iM45029 ^ i12) * (-8527)) ^ (-1562012985);
                        i2 = 12119894;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1519049669:
                case -472133030:
                    C1977.m6356();
                    RunnableC1564.m5345();
                    return null;
                case -1221913109:
                case 141827332:
                    i16 = i16;
                    i4 = s + 3266;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("֡֨") + i12) * (-85);
                        i = ((iM45029 ^ i13) * 17843) ^ (-1363817057);
                        i2 = -1598600170;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۫") ^ i12) * (-17);
                        i = ((iM45029 ^ i13) * 4195) ^ 1767396238;
                        i2 = -469434853;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1162233451:
                case 429605461:
                    i16 = i16;
                    if (AbstractC0464.m2315(strM8160, RunnableC3388.m10056(sArr2, i9, i10, i8))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۡ") + i12) * 97;
                        i = ((iM45029 ^ i13) * (-22003)) ^ (-101939936);
                        i2 = -547197395;
                        i3 = i16;
                        i15 = iM45029 ^ i2;
                        i14 = i;
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i13;
                        i14 = ((iM11306 ^ i12) * 29741) ^ 1744446502;
                        i3 = i16;
                        i15 = iM11306 ^ 1147876242;
                    }
                    i11 = i3;
                    break;
                case -1091310931:
                case 1624681330:
                    i16 = i16;
                    c = 0;
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = (i12 - C19806.m45029("᩸ۡ")) * (-39);
                        i = ((iM45029 ^ i13) * 9791) ^ 1987838366;
                        i2 = -1862137230;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -894079603:
                case 611573343:
                    i16 = i16;
                    int i17 = i6 + i7;
                    if ((i17 + i17) - i5 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۢ") ^ i13;
                        i = ((iM45029 ^ i12) * 23021) ^ 1935810150;
                        i2 = -1899807617;
                    } else {
                        iM45029 = (i12 - C19806.m45029("۬᩹")) * 61;
                        i = ((iM45029 ^ i13) * (-2777)) ^ (-46144418);
                        i2 = 1544044863;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -851286243:
                case -150826728:
                    i16 = i16;
                    s = sArr[c];
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("ܿۙ") ^ i12) * (-31);
                        i = ((iM45029 ^ i13) * (-21279)) ^ (-1331132599);
                        i2 = 1697089621;
                    } else {
                        iM45029 = C19806.m45029("۠ۘ") ^ i13;
                        i = ((iM45029 ^ i12) * 5987) ^ 855357203;
                        i2 = -658165197;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -804665619:
                case -388667150:
                    i16 = i16;
                    C3286.m9798();
                    iM45029 = C19806.m45029("ܳۤ") ^ i12;
                    i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                    i2 = -1343115864;
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -648939020:
                case 354966200:
                    if (C1937.f7317 < 0) {
                        iM45029 = C19806.m45029("۬۠") ^ i13;
                        i16 = i16;
                        i = ((iM45029 ^ i12) * (-8527)) ^ (-1562012985);
                        i2 = 12119894;
                    } else {
                        i16 = i16;
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ֫") ^ i13) * (-31);
                        i = ((iM45029 ^ i12) * 7697) ^ 1577964894;
                        i2 = -1348457918;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -526528024:
                case 2045082561:
                    i8 = 7282;
                    iM45029 = (C19806.m45029("֡۬") + i13) * 19;
                    i = ((iM45029 ^ i12) * (-7227)) ^ (-911063229);
                    i2 = 3247669;
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -394199033:
                case 722269200:
                    i16 = i16;
                    sArr = f38574;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (C19806.m45029("֡֨") + i12) * (-85);
                        i = ((iM45029 ^ i13) * 17843) ^ (-1363817057);
                        i2 = -1598600170;
                    } else {
                        iM45029 = C19806.m45029("۬ܶ") ^ i13;
                        i = ((iM45029 ^ i12) * 25663) ^ (-2058411707);
                        i2 = -1335393673;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -272705937:
                case 355389558:
                    if (C0629.f2722 > 0) {
                        i16 = i16;
                        iM45029 = (C19806.m45029("ܿۙ") ^ i12) * (-31);
                        i = ((iM45029 ^ i13) * (-21279)) ^ (-1331132599);
                        i2 = 1697089621;
                        i3 = i16;
                        i15 = iM45029 ^ i2;
                        i14 = i;
                        i11 = i3;
                    }
                    i16 = i16;
                    iM45029 = C19806.m45029("ܳۤ") ^ i12;
                    i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                    i2 = -1343115864;
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -130969711:
                case 2066260308:
                    i16 = i16;
                    i9 = 1;
                    i10 = 11;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ֫") ^ i13) * (-31);
                        i = ((iM45029 ^ i12) * 7697) ^ 1577964894;
                        i2 = -1348457918;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i13;
                        i = ((iM45029 ^ i12) * (-16711)) ^ (-1219165204);
                        i2 = 1778951162;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 51721990:
                case 492146354:
                    return this.f38586;
                case 62305472:
                case 1067371142:
                    i16 = i16;
                    sArr2 = f38574;
                    if (C1419.m4973()) {
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩺") + i13) * q.h;
                        i = ((iM45029 ^ i12) * (-19835)) ^ 1670137914;
                        i2 = -1670267900;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 473692288:
                case 1210262239:
                    i16 = i16;
                    strM8160 = C2642.m8160(abstractC20745M46711);
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۧ") ^ i12) * 95;
                        i = ((iM45029 ^ i13) * (-28771)) ^ 1396838058;
                        i2 = 2083520661;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 594303778:
                case 1584540930:
                    i8 = 52432;
                    iM45029 = (C19806.m45029("֡۬") + i13) * 19;
                    i = ((iM45029 ^ i12) * (-7227)) ^ (-911063229);
                    i2 = 3247669;
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                default:
                    i16 = i16;
                    i7 = 10666756;
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ܳۤ") ^ i12;
                        i = ((iM45029 ^ i13) * 22319) ^ (-632373934);
                        i2 = -1343115864;
                    } else {
                        iM45029 = C19806.m45029("᩶᩹") ^ i13;
                        i = ((iM45029 ^ i12) * (-27407)) ^ (-757707731);
                        i2 = 436721537;
                    }
                    i3 = i16;
                    i15 = iM45029 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
            }
        }
    }

    public AbstractC11462(int i, String str) {
        this.f38590 = true;
        this.f38586 = Collections.EMPTY_LIST;
        this.f38589 = new C13579();
        synchronized (AbstractC11462.class) {
            int i2 = f38581;
            f38581 = i2 + 1;
            this.f38583 = i2;
        }
        this.f38593 = i;
        this.f38587 = mo28615();
        mo28628(str);
    }

    public AbstractC11462(C17367 c17367) {
        this.f38590 = true;
        this.f38586 = Collections.EMPTY_LIST;
        C13579 c13579 = new C13579();
        this.f38589 = c13579;
        this.f38583 = c17367.readInt();
        this.f38593 = c17367.readInt();
        mo28628(c17367.m40458());
        String strM40448 = c17367.m40448();
        this.f38587 = strM40448 == null ? null : C5553.m15313(strM40448, new String[0]);
        this.f38588 = c17367.m40448();
        this.f38590 = c17367.m40461();
        c13579.m33192(c17367);
        int iM40462 = c17367.m40462();
        ArrayList arrayList = new ArrayList(iM40462);
        for (int i = 0; i < iM40462; i++) {
            arrayList.add(new C23540(c17367));
        }
        m28622((List) arrayList);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo13032(C11018 c11018) {
        c11018.writeInt(this.f38583);
        c11018.writeInt(this.f38593);
        c11018.m27786(this.f38582);
        AbstractC20745 abstractC20745 = this.f38587;
        c11018.m27783(abstractC20745 == null ? null : abstractC20745.mo33986());
        c11018.m27783(this.f38588);
        c11018.m27784(this.f38590);
        this.f38589.m33191(c11018);
        List listM28631 = m28631();
        c11018.mo24508(listM28631.size());
        Iterator it = listM28631.iterator();
        while (it.hasNext()) {
            ((C23540) it.next()).m51885(c11018);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m28617() {
        return this.f38583;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m28632() {
        return this.f38593;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 mo28615() {
        return C11904.f39939.m46688("_" + mo13039().toLowerCase());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo28628(String str) {
        this.f38582 = m28608(str);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m28629() {
        return this.f38582;
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo13043() {
        return m28614(this.f38582);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String mo28639() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m28640() {
        return mo28638() ? mo28639() : this.f38582;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String mo28637() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo23741(boolean z) {
        mo13029().mo10267(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28626(C21422 c21422, ArrayList arrayList) {
        if (c21422.m47977()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C22501 c22501 = this.f38585;
        if (c22501 != null) {
            if (c22501.m50018("arsc")) {
                arrayList2.add(new C15446());
            } else if (this.f38585.m50018("dex")) {
                arrayList2.add(new C8390());
            } else if (this.f38585.m50018("folder")) {
                arrayList2.add(new C11212());
            } else if (this.f38585.m50018("zip") || this.f38585.m50017()) {
                arrayList2.add(new C15136());
            } else if (this.f38585.m50018("apk")) {
                arrayList2.add(new C8390());
                arrayList2.add(new C15136(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C15446());
                arrayList2.add(new C6978());
            } else {
                arrayList2.add(new C11608());
            }
            if (!this.f38585.m50018("folder")) {
                C22501 c22502 = this.f38585;
                if (c22502.f73455 == c22502.f73452) {
                    arrayList2.add(new C3449());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM28609 = m28609();
        if (arrayList2.size() % 2 != 0 && !C21485.m48102().mo1960(c21422)) {
            arrayList.set(iM28609, (AbstractC4674) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static int m28609() {
        int[] iArrM47153 = DialogInterfaceOnDismissListenerC20991.m47153();
        int length = iArrM47153.length;
        for (int i = 0; i < length; i++) {
            if (iArrM47153[i] == 8) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unknown item command id: 8");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4674 mo28620(C21422 c21422) {
        return C22669.m50200(c21422);
    }

    /* JADX INFO: renamed from: ܰ */
    public AbstractC4674 mo23634(C21422 c21422) {
        return C16547.m38950();
    }

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC4674 mo23638() {
        return C23603.m52034();
    }

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC4674 mo23637() {
        return C5963.m16251();
    }

    /* JADX INFO: renamed from: ܶ */
    public AbstractC4674 mo23636() {
        return C0318.m1959();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC4674 mo28642() {
        return C15842.m37666();
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC4674 mo13044() {
        return C17252.m40216();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4674 mo28641() {
        return C21485.m48102();
    }

    /* JADX INFO: renamed from: ۜ */
    public AbstractC4674 mo23631() {
        return C20780.m46771();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28624(C11545 c11545, InterfaceC2557 interfaceC2557) {
        C8265.m21685(c11545, interfaceC2557);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28622(List list) {
        this.f38586 = (List) C13638.requireNonNullElse(list, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28621(ArrayList arrayList) {
        if (this.f38586.isEmpty()) {
            m28622((List) arrayList);
            return;
        }
        Set set = (Set) C9030.stream(arrayList).map(new C7497(0)).collect(C1890.toSet());
        ArrayList arrayList2 = new ArrayList();
        for (C23540 c23540 : this.f38586) {
            if (!set.contains(c23540.m51888().toLowerCase())) {
                arrayList2.add(c23540);
            }
        }
        arrayList2.addAll(arrayList);
        m28622((List) arrayList2);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m28634() {
        return this.f38588;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m28616(String str) {
        this.f38588 = C8265.m21667(str);
    }

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC13848 mo23624() {
        return C18225.f58201;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23628(C11545 c11545, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28623(final C11545 c11545) {
        List<C23540> listM28631 = m28631();
        if (listM28631.isEmpty()) {
            return;
        }
        long jM51887 = 0;
        boolean z = false;
        final AbstractC20745 abstractC20745M51884 = null;
        for (C23540 c23540 : listM28631) {
            if (c23540.m51886()) {
                c23540.m51889();
                if (abstractC20745M51884 == null || c23540.m51887() > jM51887) {
                    abstractC20745M51884 = c23540.m51884();
                    jM51887 = c23540.m51887();
                }
                z = true;
            }
        }
        if (z) {
            c11545.m28832();
            SpannableString spannableString = new SpannableString(C16737.m39288(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(C16737.m39288(R.string.MT_Protector));
            spannableString2.setSpan(new ForegroundColorSpan(C20368.f65988), 0, spannableString2.length(), 17);
            C8067 c8067BuildDialog = c11545.m28824().buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21265(false);
            c8067BuildDialog.m21272(spannableString, new DialogInterface.OnClickListener() { // from class: l.ۤ۬᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC11462.m28612(this.f35386, c11545, abstractC20745M51884);
                }
            });
            c8067BuildDialog.m21262(spannableString2, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28612(AbstractC11462 abstractC11462, C11545 c11545, AbstractC20745 abstractC20745) {
        C11545 c11545M28833 = c11545.m28833();
        c11545M28833.m28832();
        c11545M28833.m28763(abstractC20745.getName());
        c11545M28833.m28812(abstractC20745.m46737(), true);
        synchronized (abstractC11462) {
            abstractC11462.f38590 = false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28627() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            this.f38594 = true;
            AbstractC20745 abstractC20745 = this.f38587;
            z = false;
            if (abstractC20745 != null && this.f38590) {
                if (this.f38592 != 0) {
                    this.f38591 = true;
                } else {
                    if (abstractC20745 == null || !abstractC20745.mo33975()) {
                        z2 = false;
                    } else {
                        abstractC20745.mo24647();
                    }
                    z = z2;
                }
            }
        }
        if (z) {
            C21094.m47530();
        }
        Object objMo13029 = mo13029();
        if (objMo13029 instanceof AutoCloseable) {
            C19431.m44468((AutoCloseable) objMo13029);
        }
        mo13030();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m28618(String str) {
        synchronized (this) {
            AbstractC20745 abstractC20745 = this.f38587;
            if (abstractC20745 != null && !this.f38594) {
                AbstractC20745 abstractC20745Mo24641 = abstractC20745.mo24641();
                for (AbstractC20745 abstractC20745Mo24642 = C5553.m15313(str, new String[0]).mo24641(); abstractC20745Mo24642 != null; abstractC20745Mo24642 = abstractC20745Mo24642.m46689()) {
                    if (abstractC20745Mo24641.equals(abstractC20745Mo24642)) {
                        long jIncrementAndGet = f38577.incrementAndGet();
                        f38573.put(Long.valueOf(jIncrementAndGet), this);
                        this.f38592++;
                        return jIncrementAndGet;
                    }
                }
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28611(long j) {
        AbstractC11462 abstractC11462;
        if (j == 0 || (abstractC11462 = (AbstractC11462) f38573.remove(Long.valueOf(j))) == null) {
            return;
        }
        synchronized (abstractC11462) {
            int i = abstractC11462.f38592;
            if (i <= 0) {
                return;
            }
            boolean z = true;
            int i2 = i - 1;
            abstractC11462.f38592 = i2;
            boolean z2 = false;
            if (i2 == 0 && abstractC11462.f38591) {
                abstractC11462.f38591 = false;
                AbstractC20745 abstractC20745 = abstractC11462.f38587;
                if (abstractC20745 == null || !abstractC20745.mo33975()) {
                    z = false;
                } else {
                    abstractC20745.mo24647();
                }
                z2 = z;
            }
            if (z2) {
                C16737.m39273(new RunnableC15163(0));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 m28633() {
        return new C16670(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11026 m28610(int i, boolean z) {
        return new C12437(i, z);
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11026 m28613() {
        return new C17375(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28625(C11545 c11545, InterfaceC2557 interfaceC2557, InterfaceC3263 interfaceC3263) {
        C10840 c10840 = new C10840(interfaceC2557);
        mo13033(c11545, Collections.singletonList(c10840), new RunnableC10945(4, interfaceC3263, c10840));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m28608(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m28614(String str) {
        if (str.length() <= 2000) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        StringBuilder sb = new StringBuilder("/");
        for (String strSubstring : strArrSplit) {
            if (!strSubstring.isEmpty()) {
                if (strSubstring.length() > 500) {
                    strSubstring = strSubstring.substring(0, 500);
                }
                sb.append(strSubstring);
                sb.append('/');
            }
        }
        return sb.toString();
    }
}
