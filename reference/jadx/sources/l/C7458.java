package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۜ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V8K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7458 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f24567;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f24568;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f24569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f24570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19546 f24571;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7458 f24572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f24573;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f24574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f24575;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f24576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f24577;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f24578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String[] f24579;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7458 m20466(String str) {
        return new C7458(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7458 m20467(String str, long j, long j2, C19546 c19546, String[] strArr, String str2, String str3, C7458 c7458) {
        return new C7458(str, null, j, j2, c19546, strArr, str2, str3, c7458);
    }

    public C7458(String str, String str2, long j, long j2, C19546 c19546, String[] strArr, String str3, String str4, C7458 c7458) {
        this.f24574 = str;
        this.f24575 = str2;
        this.f24570 = str4;
        this.f24571 = c19546;
        this.f24579 = strArr;
        this.f24578 = str2 != null;
        this.f24567 = j;
        this.f24577 = j2;
        str3.getClass();
        this.f24569 = str3;
        this.f24572 = c7458;
        this.f24573 = new HashMap();
        this.f24576 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20476(long j) {
        long j2 = this.f24577;
        long j3 = this.f24567;
        if (j3 == -9223372036854775807L && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j >= j2) {
            return j3 <= j && j < j2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20475(C7458 c7458) {
        if (this.f24568 == null) {
            this.f24568 = new ArrayList();
        }
        this.f24568.add(c7458);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7458 m20474(int i) {
        ArrayList arrayList = this.f24568;
        if (arrayList == null) {
            throw new IndexOutOfBoundsException();
        }
        return (C7458) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20472() {
        ArrayList arrayList = this.f24568;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] m20477() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m20471(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20471(TreeSet treeSet, boolean z) {
        String str = this.f24574;
        boolean zEquals = am.ax.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f24570 != null)) {
            long j = this.f24567;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f24577;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f24568 == null) {
            return;
        }
        for (int i = 0; i < this.f24568.size(); i++) {
            ((C7458) this.f24568.get(i)).m20471(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20473(long j, Map map, HashMap map2, HashMap map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        m20468(j, this.f24569, arrayList);
        TreeMap treeMap = new TreeMap();
        m20470(j, false, this.f24569, treeMap);
        m20469(j, map, map2, this.f24569, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C10595 c10595 = (C10595) map2.get(pair.first);
                c10595.getClass();
                C5866 c5866 = new C5866();
                c5866.m17077(bitmapDecodeByteArray);
                c5866.m17086(c10595.f33635);
                c5866.m17088(0);
                c5866.m17075(c10595.f33632, 0);
                c5866.m17076(c10595.f33638);
                c5866.m17091(c10595.f33633);
                c5866.m17074(c10595.f33630);
                c5866.m17082(c10595.f33629);
                arrayList2.add(c5866.m17073());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C10595 c10596 = (C10595) map2.get(entry.getKey());
            c10596.getClass();
            C5866 c5867 = (C5866) entry.getValue();
            CharSequence charSequenceM17083 = c5867.m17083();
            charSequenceM17083.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM17083;
            for (C2983 c2983 : (C2983[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2983.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c2983), spannableStringBuilder.getSpanEnd(c2983), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c5867.m17075(c10596.f33632, c10596.f33636);
            c5867.m17076(c10596.f33638);
            c5867.m17086(c10596.f33635);
            c5867.m17091(c10596.f33633);
            c5867.m17087(c10596.f33634, c10596.f33631);
            c5867.m17082(c10596.f33629);
            arrayList2.add(c5867.m17073());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20468(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f24569;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m20476(j) && "div".equals(this.f24574) && (str2 = this.f24570) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m20472(); i++) {
            m20474(i).m20468(j, str, arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20470(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f24573;
        map.clear();
        HashMap map2 = this.f24576;
        map2.clear();
        String str2 = this.f24574;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f24569;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f24578 && z) {
            SpannableStringBuilder spannableStringBuilderM20465 = m20465(str4, treeMap);
            String str5 = this.f24575;
            str5.getClass();
            spannableStringBuilderM20465.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m20465(str4, treeMap).append('\n');
            return;
        }
        if (m20476(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceM17083 = ((C5866) entry.getValue()).m17083();
                charSequenceM17083.getClass();
                map.put(str6, Integer.valueOf(charSequenceM17083.length()));
            }
            boolean zEquals = am.ax.equals(str2);
            for (int i = 0; i < m20472(); i++) {
                m20474(i).m20470(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM20466 = m20465(str4, treeMap);
                int length = spannableStringBuilderM20466.length() - 1;
                while (length >= 0 && spannableStringBuilderM20466.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM20466.charAt(length) != '\n') {
                    spannableStringBuilderM20466.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceM17084 = ((C5866) entry2.getValue()).m17083();
                charSequenceM17084.getClass();
                map2.put(str7, Integer.valueOf(charSequenceM17084.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m20465(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C5866 c5866 = new C5866();
            c5866.m17079(new SpannableStringBuilder());
            treeMap.put(str, c5866);
        }
        CharSequence charSequenceM17083 = ((C5866) treeMap.get(str)).m17083();
        charSequenceM17083.getClass();
        return (SpannableStringBuilder) charSequenceM17083;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02bd A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20469(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        C7458 c7458;
        C19546 c19546M50769;
        float f;
        float f2;
        int i;
        if (m20476(j)) {
            String str2 = this.f24569;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f24576.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f24573;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C5866 c5866 = (C5866) treeMap.get(str4);
                    c5866.getClass();
                    C10595 c10595 = (C10595) map2.get(str3);
                    c10595.getClass();
                    int i2 = c10595.f33629;
                    C19546 c19546M507610 = C22530.m50769(this.f24571, this.f24579, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c5866.m17083();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c5866.m17079(spannableStringBuilder);
                    }
                    if (c19546M507610 != null) {
                        if (c19546M507610.m45102() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(c19546M507610.m45102()), iIntValue, iIntValue2, 33);
                        }
                        if (c19546M507610.m45091()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c19546M507610.m45118()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c19546M507610.m45097()) {
                            C8485.m22803(spannableStringBuilder, new ForegroundColorSpan(c19546M507610.m45092()), iIntValue, iIntValue2);
                        }
                        if (c19546M507610.m45106()) {
                            C8485.m22803(spannableStringBuilder, new BackgroundColorSpan(c19546M507610.m45082()), iIntValue, iIntValue2);
                        }
                        if (c19546M507610.m45113() != null) {
                            C8485.m22803(spannableStringBuilder, new TypefaceSpan(c19546M507610.m45113()), iIntValue, iIntValue2);
                        }
                        if (c19546M507610.m45081() != null) {
                            C8949 c8949M45081 = c19546M507610.m45081();
                            c8949M45081.getClass();
                            int i3 = c8949M45081.f29193;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = c8949M45081.f29191;
                            }
                            int i4 = c8949M45081.f29192;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            C8485.m22803(spannableStringBuilder, new C23766(i3, i, i4), iIntValue, iIntValue2);
                        }
                        int iM45119 = c19546M507610.m45119();
                        if (iM45119 == 2) {
                            C7458 c7459 = this.f24572;
                            while (true) {
                                if (c7459 == null) {
                                    c7459 = null;
                                    break;
                                }
                                C19546 c19546M507611 = C22530.m50769(c7459.f24571, c7459.f24579, map);
                                if (c19546M507611 != null && c19546M507611.m45119() == 1) {
                                    break;
                                } else {
                                    c7459 = c7459.f24572;
                                }
                            }
                            if (c7459 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c7459);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c7458 = null;
                                        break;
                                    }
                                    c7458 = (C7458) arrayDeque.pop();
                                    C19546 c19546M507612 = C22530.m50769(c7458.f24571, c7458.f24579, map);
                                    if (c19546M507612 != null && c19546M507612.m45119() == 3) {
                                        break;
                                    }
                                    int iM20472 = c7458.m20472();
                                    while (true) {
                                        iM20472--;
                                        if (iM20472 >= 0) {
                                            arrayDeque.push(c7458.m20474(iM20472));
                                        }
                                    }
                                }
                                if (c7458 != null) {
                                    if (c7458.m20472() != 1 || c7458.m20474(0).f24575 == null) {
                                        C1896.m6513("Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c7458.m20474(0).f24575;
                                        String str6 = C7116.f23455;
                                        C19546 c19546M507613 = C22530.m50769(c7458.f24571, c7458.f24579, map);
                                        int iM45096 = c19546M507613 != null ? c19546M507613.m45096() : -1;
                                        if (iM45096 == -1 && (c19546M50769 = C22530.m50769(c7459.f24571, c7459.f24579, map)) != null) {
                                            iM45096 = c19546M50769.m45096();
                                        }
                                        spannableStringBuilder.setSpan(new C16306(str5, iM45096), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM45119 == 3 || iM45119 == 4) {
                            spannableStringBuilder.setSpan(new C2983(), iIntValue, iIntValue2, 33);
                        }
                        if (c19546M507610.m45117()) {
                            C8485.m22803(spannableStringBuilder, new C17052(), iIntValue, iIntValue2);
                        }
                        int iM45099 = c19546M507610.m45099();
                        if (iM45099 == 1) {
                            it = it2;
                            C8485.m22803(spannableStringBuilder, new AbsoluteSizeSpan((int) c19546M507610.m45103(), true), iIntValue, iIntValue2);
                        } else if (iM45099 != 2) {
                            if (iM45099 != 3) {
                                f = 100.0f;
                                it = it2;
                            } else {
                                float fM45103 = c19546M507610.m45103() / 100.0f;
                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                int length = relativeSizeSpanArr.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i5];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        fM45103 = relativeSizeSpan.getSizeChange() * fM45103;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        f2 = fM45103;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    } else {
                                        f2 = fM45103;
                                    }
                                    i5++;
                                    it2 = it3;
                                    fM45103 = f2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(fM45103), iIntValue, iIntValue2, 33);
                            }
                            if (!am.ax.equals(this.f24574)) {
                                if (c19546M507610.m45101() != Float.MAX_VALUE) {
                                    c5866.m17081((c19546M507610.m45101() * (-90.0f)) / f);
                                }
                                if (c19546M507610.m45100() != null) {
                                    c5866.m17089(c19546M507610.m45100());
                                }
                                if (c19546M507610.m45090() != null) {
                                    c5866.m17078(c19546M507610.m45090());
                                }
                            }
                        } else {
                            it = it2;
                            C8485.m22803(spannableStringBuilder, new RelativeSizeSpan(c19546M507610.m45103()), iIntValue, iIntValue2);
                        }
                        f = 100.0f;
                        if (!am.ax.equals(this.f24574)) {
                            if (c19546M507610.m45101() != Float.MAX_VALUE) {
                                c5866.m17081((c19546M507610.m45101() * (-90.0f)) / f);
                            }
                            if (c19546M507610.m45100() != null) {
                                c5866.m17089(c19546M507610.m45100());
                            }
                            if (c19546M507610.m45090() != null) {
                                c5866.m17078(c19546M507610.m45090());
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            for (int i6 = 0; i6 < m20472(); i6++) {
                m20474(i6).m20469(j, map, map2, str3, treeMap);
            }
        }
    }
}
