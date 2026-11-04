package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۜ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7364 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24218;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6774 f24219;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8855 f24220;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f24221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f24222;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f24223;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f24224;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24226;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f24227;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24228;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24229;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f24230;

    /* JADX INFO: renamed from: ۬۠֡, reason: not valid java name and contains not printable characters */
    private static final short[] f24213 = {6169, -12321, -12332, -12333, -12397, -12336, -12343, -12397, -12339, -12335, -12344, -12338};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f24212 = {0, 1, 4, 3, 2, 5, 6, 7, 8, 9};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static volatile int f24210 = (int) (System.currentTimeMillis() % 10000000);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f24211 = new AtomicLong();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f24217 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f24216 = new C3635(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f24209 = new C20789(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f24214 = new C12584(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f24215 = new C6619(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֨ */
    public abstract List mo10160();

    /* JADX INFO: renamed from: ۖ */
    public int mo18795() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable mo20195(boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18796(String str, boolean z) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18797(InterfaceC2386 interfaceC2386) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10162(C8614 c8614, List list, Runnable runnable);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10163(C8614 c8614, C8614 c8615);

    /* JADX INFO: renamed from: ۙۙ */
    public boolean mo18799() {
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo18800() {
    }

    /* JADX INFO: renamed from: ۟ */
    public abstract String mo10164();

    /* JADX INFO: renamed from: ۠ */
    public abstract void mo10165();

    /* JADX INFO: renamed from: ۡ */
    public abstract List mo10166();

    /* JADX INFO: renamed from: ۢ */
    public abstract boolean mo10167();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo10168(C8614 c8614);

    /* JADX INFO: renamed from: ۤ */
    public boolean mo18801(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract boolean mo10170();

    /* JADX INFO: renamed from: ܳ */
    public abstract C21535 mo10171();

    /* JADX INFO: renamed from: ܿ */
    public abstract AbstractC7629 mo10174();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo20209() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String mo20213(C8614 c8614) {
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract AbstractC22044 mo10176(InterfaceC2386 interfaceC2386);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo20215() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo10177(String str);

    /* JADX INFO: renamed from: ᩷ۙ */
    public abstract boolean mo10178();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC9843 mo20192() {
        return new C17015(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    public AbstractC7364(int i, String str) {
        this.f24228 = true;
        this.f24227 = Collections.EMPTY_LIST;
        this.f24220 = new C8855();
        synchronized (AbstractC7364.class) {
            int i2 = f24210;
            f24210 = i2 + 1;
            this.f24229 = i2;
        }
        this.f24224 = i;
        this.f24222 = mo20216();
        mo20211(str);
    }

    public AbstractC7364(C20348 c20348) {
        this.f24228 = true;
        this.f24227 = Collections.EMPTY_LIST;
        C8855 c8855 = new C8855();
        this.f24220 = c8855;
        this.f24229 = c20348.readInt();
        this.f24224 = c20348.readInt();
        mo20211(c20348.m46758());
        String strM46742 = c20348.m46742();
        this.f24222 = strM46742 == null ? null : C14584.m35193(strM46742, new String[0]);
        this.f24221 = c20348.m46742();
        this.f24228 = c20348.m46753();
        c8855.m23724(c20348);
        int iM46749 = c20348.m46749();
        ArrayList arrayList = new ArrayList(iM46749);
        for (int i = 0; i < iM46749; i++) {
            arrayList.add(new C21120(c20348));
        }
        m20198((List) arrayList);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10161(C6178 c6178) {
        c6178.writeInt(this.f24229);
        c6178.writeInt(this.f24224);
        c6178.m17800(this.f24223);
        AbstractC22044 abstractC22044 = this.f24222;
        c6178.m17787(abstractC22044 == null ? null : abstractC22044.mo4294());
        c6178.m17787(this.f24221);
        c6178.m17789(this.f24228);
        this.f24220.m23723(c6178);
        List listM20206 = m20206();
        c6178.mo17812(listM20206.size());
        Iterator it = listM20206.iterator();
        while (it.hasNext()) {
            ((C21120) it.next()).m48216(c6178);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20191() {
        return this.f24229;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m20204() {
        return this.f24224;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22044 mo20216() {
        return C6382.f21565.m49857("_" + mo10164().toLowerCase());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo20211(String str) {
        this.f24223 = m20187(str);
    }

    /* JADX INFO: renamed from: ֡ */
    public String mo10159() {
        return m20188(this.f24223);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m20218() {
        return this.f24223;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String mo20212() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m20193() {
        return mo20209() ? mo20212() : this.f24223;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo20207() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo20214(boolean z) {
        mo10174().mo20837(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20202(C12915 c12915, ArrayList arrayList) {
        if (c12915.m31988()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C6774 c6774 = this.f24219;
        if (c6774 != null) {
            if (c6774.m18897("arsc")) {
                arrayList2.add(new C15195());
            } else if (this.f24219.m18897("dex")) {
                arrayList2.add(new C1772());
            } else if (this.f24219.m18897("folder")) {
                arrayList2.add(new C14449());
            } else if (this.f24219.m18897("zip") || this.f24219.m18896()) {
                arrayList2.add(new C5829());
            } else if (this.f24219.m18897("apk")) {
                arrayList2.add(new C5829(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C10720());
                arrayList2.add(new C15195());
                arrayList2.add(new C1772());
            } else {
                arrayList2.add(new C8483());
            }
            if (!this.f24219.m18897("folder")) {
                arrayList2.add(new C9974());
            }
            if (!this.f24219.m18897("folder")) {
                C6774 c6775 = this.f24219;
                if (c6775.f22590 == c6775.f22594) {
                    if (c6775.m18897("dex")) {
                        arrayList2.add(0, new C18925());
                    } else {
                        arrayList2.add(new C18925());
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM20190 = m20190();
        if (arrayList2.size() % 2 != 0 && !C2100.m7268().mo2481(c12915)) {
            arrayList.set(iM20190, (AbstractC9843) arrayList2.remove(0));
        }
        m20189(arrayList2);
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20189(ArrayList arrayList) {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            if (i2 >= arrayList.size()) {
                return;
            }
            if ((arrayList.get(i) instanceof C1772) && (arrayList.get(i2) instanceof C9974)) {
                arrayList.add(i2, (AbstractC9843) arrayList.remove(0));
                return;
            }
            i += 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[PHI: r1 r10 r16 r17
      0x0133: PHI (r1v6 java.lang.String) = (r1v1 java.lang.String), (r1v3 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String) binds: [B:39:0x0131, B:35:0x010c, B:31:0x00ec, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r10v5 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:39:0x0131, B:35:0x010c, B:31:0x00ec, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r16v32 int) = (r16v16 int), (r16v17 int), (r16v18 int), (r16v33 int) binds: [B:39:0x0131, B:35:0x010c, B:31:0x00ec, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r17v5 l.᩷ۨᩴ) = (r17v2 l.᩷ۨᩴ), (r17v1 l.᩷ۨᩴ), (r17v1 l.᩷ۨᩴ), (r17v1 l.᩷ۨᩴ) binds: [B:39:0x0131, B:35:0x010c, B:31:0x00ec, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0229 A[PHI: r4 r8 r16
      0x0229: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:62:0x0227, B:50:0x01c5, B:17:0x0075, B:15:0x0071, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:62:0x0227, B:50:0x01c5, B:17:0x0075, B:15:0x0071, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r16v28 int) = (r16v8 int), (r16v11 int), (r16v23 int), (r16v24 int), (r16v33 int) binds: [B:62:0x0227, B:50:0x01c5, B:17:0x0075, B:15:0x0071, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025f A[PHI: r3 r5 r6 r7 r11 r12 r16
      0x025f: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r16v19 int) = (r16v7 int), (r16v9 int), (r16v10 int), (r16v20 int) binds: [B:66:0x025d, B:58:0x0209, B:54:0x01e7, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0293 A[PHI: r2 r16
      0x0293: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:70:0x0291, B:15:0x0071, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v25 int) = (r16v6 int), (r16v24 int), (r16v27 int) binds: [B:70:0x0291, B:15:0x0071, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List m20206() {
        int iM2761;
        int i;
        int i2;
        int i3;
        String strM12926 = null;
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
        int i11 = -560519956;
        int i12 = AbstractC0116.f1064;
        int i13 = C1146.f4234;
        int iM2762 = (i12 - C0619.m2761("᩸ۜ")) * 53;
        int i14 = ((iM2762 ^ i13) * (-14393)) ^ 1135570766;
        int i15 = iM2762 ^ (-387119077);
        AbstractC22044 abstractC22044M49856 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i13) * 17833) >> 31));
            switch (i16) {
                case -2026373757:
                case 1005862739:
                    i16 = i16;
                    C0269.m1775();
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ᩴ᩺") ^ i12;
                        i = ((iM2761 ^ i13) * (-23567)) ^ 866214623;
                        i2 = 960170870;
                    } else {
                        iM2761 = (i12 - C0773.m3169("ܺܺ")) * (-115);
                        i = ((iM2761 ^ i13) * (-12899)) ^ 1628272282;
                        i2 = -881760335;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1976393309:
                case 768340208:
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C1519.m5403()) {
                        iM2761 = (i12 - C0773.m3169("֡ۚ")) * (-79);
                        i = ((iM2761 ^ i13) * 6933) ^ 1055091889;
                        i2 = 123131551;
                    } else {
                        iM2761 = (C0773.m3169("۟᩵") ^ i13) * 37;
                        i = ((iM2761 ^ i12) * 12917) ^ 705469014;
                        i2 = -632315561;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1908764647:
                case 1829525796:
                    i16 = i16;
                    if (C2419.m8175(strM12926, C1783.m6233(sArr2, i9, i10, i8))) {
                        iM2761 = C0773.m3169("֫ۢ") ^ i12;
                        i = ((iM2761 ^ i13) * 17205) ^ 127819569;
                        i2 = 623492581;
                        i3 = i16;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                    } else {
                        int iM2763 = (C0619.m2761("ܰ᩸") + i13) * (-65);
                        i14 = ((iM2763 ^ i12) * 1971) ^ 1228725571;
                        i3 = i16;
                        i15 = iM2763 ^ 1431020408;
                    }
                    i11 = i3;
                    break;
                case -1337286797:
                case 1705276750:
                    return C3292.f10718;
                case -1299839209:
                case 1755951898:
                    i16 = i16;
                    abstractC22044M49856 = C6382.f21570.m49856();
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("᩵ܳ") + i12) * (-113);
                        i = ((iM2761 ^ i13) * 9303) ^ 944405725;
                        i2 = -1707252410;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ᩹") ^ i12) * (-55);
                        i = ((iM2761 ^ i13) * (-18977)) ^ (-871262942);
                        i2 = -1539870942;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1227247936:
                case -335049279:
                    if (C0487.f2131 > 0) {
                        i16 = i16;
                        iM2761 = C0773.m3169("ᩴ᩺") ^ i12;
                        i = ((iM2761 ^ i13) * (-23567)) ^ 866214623;
                        i2 = 960170870;
                    } else {
                        iM2761 = (i13 - C0619.m2761("ۙۜ")) * 69;
                        i16 = i16;
                        i = ((iM2761 ^ i12) * (-30017)) ^ 1873528137;
                        i2 = 390904728;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1180093688:
                case -1155428622:
                    i16 = i16;
                    strM12926 = C3998.m12926(abstractC22044M49856);
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("᩵ܳ") + i12) * (-113);
                        i = ((iM2761 ^ i13) * 9303) ^ 944405725;
                        i2 = -1707252410;
                    } else {
                        iM2761 = (i12 - C0773.m3169("۠᩻")) * (-39);
                        i = ((iM2761 ^ i13) * (-3745)) ^ (-1994353901);
                        i2 = 194361864;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1108246548:
                case -344906728:
                    i16 = i16;
                    i7 = 171086400;
                    if (C2023.f6737) {
                        iM2761 = (i12 - C0773.m3169("ܺܺ")) * (-115);
                        i = ((iM2761 ^ i13) * (-12899)) ^ 1628272282;
                        i2 = -881760335;
                    } else {
                        iM2761 = C0773.m3169("᩹ۤ") ^ i13;
                        i = ((iM2761 ^ i12) * 4011) ^ (-52448611);
                        i2 = 1412615411;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -776160671:
                case 1151079514:
                    i16 = i16;
                    i4 = s + 13080;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("۟᩵") ^ i13) * 37;
                        i = ((iM2761 ^ i12) * 12917) ^ 705469014;
                        i2 = -632315561;
                    } else {
                        iM2761 = C0619.m2761("ܿۚ") ^ i12;
                        i = ((iM2761 ^ i13) * 11021) ^ 640861266;
                        i2 = 701884983;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -649969635:
                case 1540949139:
                    i16 = i16;
                    if (C0619.f2439) {
                        iM2761 = (i12 - C0773.m3169("ܺܺ")) * (-115);
                        i = ((iM2761 ^ i13) * (-12899)) ^ 1628272282;
                        i2 = -881760335;
                    } else {
                        iM2761 = (C0773.m3169("᩵ܳ") + i12) * (-113);
                        i = ((iM2761 ^ i13) * 9303) ^ 944405725;
                        i2 = -1707252410;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -595579193:
                case 981558696:
                    i16 = i16;
                    c = 0;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("۟᩵") ^ i13) * 37;
                        i = ((iM2761 ^ i12) * 12917) ^ 705469014;
                        i2 = -632315561;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ֡") + i12) * (-99);
                        i = ((iM2761 ^ i13) * 1117) ^ 2038163131;
                        i2 = 180748280;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -465000070:
                case 2089540992:
                    i16 = i16;
                    int i17 = i6 + i7;
                    if (i5 - (i17 + i17) > 0) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i13;
                        i = ((iM2761 ^ i12) * (-15899)) ^ 1877694139;
                        i2 = -1472662438;
                    } else {
                        iM2761 = (i12 - C0773.m3169("ۡۘ")) * 59;
                        i = ((iM2761 ^ i13) * (-11129)) ^ (-1170889833);
                        i2 = -615269753;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -326441535:
                case 1812029850:
                    i16 = i16;
                    s = sArr[c];
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i12 - C0773.m3169("ܺܺ")) * (-115);
                        i = ((iM2761 ^ i13) * (-12899)) ^ 1628272282;
                        i2 = -881760335;
                    } else {
                        iM2761 = (i13 - C0773.m3169("ܳۘ")) * 85;
                        i = ((iM2761 ^ i12) * 12823) ^ (-692883776);
                        i2 = 1178824032;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -273034008:
                case 1902528309:
                    i16 = i16;
                    i9 = 1;
                    i10 = 11;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("۟᩵") ^ i13) * 37;
                        i = ((iM2761 ^ i12) * 12917) ^ 705469014;
                        i2 = -632315561;
                    } else {
                        iM2761 = C0619.m2761("ۢۡ") ^ i13;
                        i = ((iM2761 ^ i12) * 19059) ^ 376396238;
                        i2 = 1044582948;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 153167796:
                case 698514304:
                    i8 = 53181;
                    iM2761 = (i13 - C0619.m2761("۬ܽ")) * 19;
                    i = ((iM2761 ^ i12) * 28857) ^ 1779433578;
                    i2 = 1884827833;
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 406920297:
                case 1984060729:
                    i8 = 18896;
                    iM2761 = (i13 - C0619.m2761("۬ܽ")) * 19;
                    i = ((iM2761 ^ i12) * 28857) ^ 1779433578;
                    i2 = 1884827833;
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 557315790:
                case 1967699330:
                    return this.f24227;
                case 642917163:
                case 1025947724:
                    i16 = i16;
                    C2702.m8876();
                    iM2761 = (i12 - C0773.m3169("ܺܺ")) * (-115);
                    i = ((iM2761 ^ i13) * (-12899)) ^ 1628272282;
                    i2 = -881760335;
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 827470883:
                case 2141858427:
                    i16 = i16;
                    sArr = f24213;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ᩴ᩺") ^ i12;
                        i = ((iM2761 ^ i13) * (-23567)) ^ 866214623;
                        i2 = 960170870;
                    } else {
                        iM2761 = C0619.m2761("ܳ۫") ^ i13;
                        i = ((iM2761 ^ i12) * (-30327)) ^ 1877299385;
                        i2 = -1963401806;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 1425957617:
                case 2083099591:
                    i16 = i16;
                    sArr2 = f24213;
                    if (C23916.m53419() != 0) {
                        iM2761 = (C0773.m3169("᩵ܳ") + i12) * (-113);
                        i = ((iM2761 ^ i13) * 9303) ^ 944405725;
                        i2 = -1707252410;
                    } else {
                        iM2761 = C0773.m3169("ܽܶ") ^ i13;
                        i = ((iM2761 ^ i12) * 7635) ^ (-49675016);
                        i2 = -1054867794;
                    }
                    i3 = i16;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                default:
                    RunnableC0334.m2063();
                    C0862.m3503();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static int m20190() {
        int[] iArrM11713 = DialogInterfaceOnDismissListenerC3610.m11713();
        int length = iArrM11713.length;
        for (int i = 0; i < length; i++) {
            if (iArrM11713[i] == 8) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unknown item command id: 8");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9843 mo20196(C12915 c12915) {
        return C19540.m45071(c12915);
    }

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC9843 mo18808(C12915 c12915) {
        return C24475.m54720();
    }

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC9843 mo18807() {
        return C0608.m2724();
    }

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC9843 mo18809() {
        return C21491.m48895();
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractC9843 mo18805() {
        return C6575.m18497();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC9843 mo20219() {
        return C20745.m47434();
    }

    /* JADX INFO: renamed from: ܶ */
    public AbstractC9843 mo10173() {
        return C14777.m35587();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9843 mo20208() {
        return C2100.m7268();
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC9843 mo18802() {
        return C3591.m11646();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20200(C8614 c8614, InterfaceC2386 interfaceC2386) {
        C1663.m5985(c8614, interfaceC2386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20198(List list) {
        this.f24227 = (List) C17359.requireNonNullElse(list, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20197(ArrayList arrayList) {
        if (this.f24227.isEmpty()) {
            m20198((List) arrayList);
            return;
        }
        Set set = (Set) C1170.stream(arrayList).map(new C23773(0)).collect(C2025.toSet());
        ArrayList arrayList2 = new ArrayList();
        for (C21120 c21120 : this.f24227) {
            if (!set.contains(c21120.m48220().toLowerCase())) {
                arrayList2.add(c21120);
            }
        }
        arrayList2.addAll(arrayList);
        m20198((List) arrayList2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m20203() {
        return this.f24221;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20217(String str) {
        this.f24221 = C1663.m5965(str);
    }

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC0895 mo10169() {
        return C2166.f7145;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18798(C8614 c8614, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20199(final C8614 c8614) {
        List<C21120> listM20206 = m20206();
        if (listM20206.isEmpty()) {
            return;
        }
        long jM48217 = 0;
        boolean z = false;
        final AbstractC22044 abstractC22044M48215 = null;
        for (C21120 c21120 : listM20206) {
            if (c21120.m48219()) {
                c21120.m48218();
                if (abstractC22044M48215 == null || c21120.m48217() > jM48217) {
                    abstractC22044M48215 = c21120.m48215();
                    jM48217 = c21120.m48217();
                }
                z = true;
            }
        }
        if (z) {
            c8614.m23210();
            SpannableString spannableString = new SpannableString(C21576.m49088(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(C21576.m49088(R.string.MT_Protector));
            spannableString2.setSpan(new ForegroundColorSpan(C3296.f10741), 0, spannableString2.length(), 17);
            C2361 c2361BuildDialog = c8614.m23233().buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8012(false);
            c2361BuildDialog.m8019(spannableString, new DialogInterface.OnClickListener() { // from class: l.ܽ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC7364.m20185(this.f58426, c8614, abstractC22044M48215);
                }
            });
            c2361BuildDialog.m8009(spannableString2, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20185(AbstractC7364 abstractC7364, C8614 c8614, AbstractC22044 abstractC22044) {
        C8614 c8614M23236 = c8614.m23236();
        c8614M23236.m23210();
        c8614M23236.m23230(abstractC22044.getName());
        c8614M23236.m23226(abstractC22044.m49881(), true);
        synchronized (abstractC7364) {
            abstractC7364.f24228 = false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m20210() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            this.f24230 = true;
            AbstractC22044 abstractC22044 = this.f24222;
            z = false;
            if (abstractC22044 != null && this.f24228) {
                if (this.f24226 != 0) {
                    this.f24225 = true;
                } else {
                    if (abstractC22044 == null || !abstractC22044.mo2934()) {
                        z2 = false;
                    } else {
                        abstractC22044.mo4296();
                    }
                    z = z2;
                }
            }
        }
        if (z) {
            C6331.m18055();
        }
        Object objMo10174 = mo10174();
        if (objMo10174 instanceof AutoCloseable) {
            C20244.m46520((AutoCloseable) objMo10174);
        }
        mo10165();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m20194(String str) {
        synchronized (this) {
            AbstractC22044 abstractC22044 = this.f24222;
            if (abstractC22044 != null && !this.f24230) {
                AbstractC22044 abstractC22044Mo4284 = abstractC22044.mo4284();
                for (AbstractC22044 abstractC22044Mo4285 = C14584.m35193(str, new String[0]).mo4284(); abstractC22044Mo4285 != null; abstractC22044Mo4285 = abstractC22044Mo4285.m49858()) {
                    if (abstractC22044Mo4284.equals(abstractC22044Mo4285)) {
                        long jIncrementAndGet = f24211.incrementAndGet();
                        f24217.put(Long.valueOf(jIncrementAndGet), this);
                        this.f24226++;
                        return jIncrementAndGet;
                    }
                }
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20184(long j) {
        AbstractC7364 abstractC7364;
        if (j == 0 || (abstractC7364 = (AbstractC7364) f24217.remove(Long.valueOf(j))) == null) {
            return;
        }
        synchronized (abstractC7364) {
            int i = abstractC7364.f24226;
            if (i <= 0) {
                return;
            }
            boolean z = true;
            int i2 = i - 1;
            abstractC7364.f24226 = i2;
            boolean z2 = false;
            if (i2 == 0 && abstractC7364.f24225) {
                abstractC7364.f24225 = false;
                AbstractC22044 abstractC22044 = abstractC7364.f24222;
                if (abstractC22044 == null || !abstractC22044.mo2934()) {
                    z = false;
                } else {
                    abstractC22044.mo4296();
                }
                z2 = z;
            }
            if (z2) {
                C21576.m49068(new RunnableC22951(1));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 m20205() {
        return new C24519(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC18551 m20183(int i, boolean z) {
        return new C4381(i, z);
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC18551 m20186() {
        return new C14821(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20201(C8614 c8614, InterfaceC2386 interfaceC2386, InterfaceC9600 interfaceC9600) {
        C14406 c14406 = new C14406(interfaceC2386);
        mo10162(c8614, Collections.singletonList(c14406), new RunnableC16313(0, interfaceC9600, c14406));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m20187(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m20188(String str) {
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
