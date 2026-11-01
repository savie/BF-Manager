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

/* JADX INFO: renamed from: l.ܶ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15109 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15109 f49333;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f49334;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f49335;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f49336;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f49337;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8759 f49338;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f49339;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f49340;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f49341;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f49342;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f49343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f49344;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String[] f49345;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15109 m36183(String str) {
        return new C15109(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15109 m36184(String str, long j, long j2, C8759 c8759, String[] strArr, String str2, String str3, C15109 c15109) {
        return new C15109(str, null, j, j2, c8759, strArr, str2, str3, c15109);
    }

    public C15109(String str, String str2, long j, long j2, C8759 c8759, String[] strArr, String str3, String str4, C15109 c15109) {
        this.f49342 = str;
        this.f49343 = str2;
        this.f49339 = str4;
        this.f49338 = c8759;
        this.f49345 = strArr;
        this.f49334 = str2 != null;
        this.f49335 = j;
        this.f49341 = j2;
        str3.getClass();
        this.f49340 = str3;
        this.f49333 = c15109;
        this.f49344 = new HashMap();
        this.f49337 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36193(long j) {
        long j2 = this.f49341;
        long j3 = this.f49335;
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
    public final void m36192(C15109 c15109) {
        if (this.f49336 == null) {
            this.f49336 = new ArrayList();
        }
        this.f49336.add(c15109);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15109 m36191(int i) {
        ArrayList arrayList = this.f49336;
        if (arrayList == null) {
            throw new IndexOutOfBoundsException();
        }
        return (C15109) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36189() {
        ArrayList arrayList = this.f49336;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] m36194() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m36188(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36188(TreeSet treeSet, boolean z) {
        String str = this.f49342;
        boolean zEquals = am.ax.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f49339 != null)) {
            long j = this.f49335;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f49341;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f49336 == null) {
            return;
        }
        for (int i = 0; i < this.f49336.size(); i++) {
            ((C15109) this.f49336.get(i)).m36188(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m36190(long j, Map map, HashMap map2, HashMap map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        m36185(j, this.f49340, arrayList);
        TreeMap treeMap = new TreeMap();
        m36187(j, false, this.f49340, treeMap);
        m36186(j, map, map2, this.f49340, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C8053 c8053 = (C8053) map2.get(pair.first);
                c8053.getClass();
                C20369 c20369 = new C20369();
                c20369.m46000(bitmapDecodeByteArray);
                c20369.m46009(c8053.f28203);
                c20369.m46011(0);
                c20369.m45998(c8053.f28200, 0);
                c20369.m45999(c8053.f28195);
                c20369.m45994(c8053.f28199);
                c20369.m45997(c8053.f28197);
                c20369.m46007(c8053.f28196);
                arrayList2.add(c20369.m45996());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C8053 c8054 = (C8053) map2.get(entry.getKey());
            c8054.getClass();
            C20369 c203610 = (C20369) entry.getValue();
            CharSequence charSequenceM46003 = c203610.m46003();
            charSequenceM46003.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM46003;
            for (C6641 c6641 : (C6641[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C6641.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c6641), spannableStringBuilder.getSpanEnd(c6641), (CharSequence) "");
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
            c203610.m45998(c8054.f28200, c8054.f28198);
            c203610.m45999(c8054.f28195);
            c203610.m46009(c8054.f28203);
            c203610.m45994(c8054.f28199);
            c203610.m46010(c8054.f28194, c8054.f28201);
            c203610.m46007(c8054.f28196);
            arrayList2.add(c203610.m45996());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36185(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f49340;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m36193(j) && "div".equals(this.f49342) && (str2 = this.f49339) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m36189(); i++) {
            m36191(i).m36185(j, str, arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36187(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f49344;
        map.clear();
        HashMap map2 = this.f49337;
        map2.clear();
        String str2 = this.f49342;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f49340;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f49334 && z) {
            SpannableStringBuilder spannableStringBuilderM36182 = m36182(str4, treeMap);
            String str5 = this.f49343;
            str5.getClass();
            spannableStringBuilderM36182.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m36182(str4, treeMap).append('\n');
            return;
        }
        if (m36193(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceM46003 = ((C20369) entry.getValue()).m46003();
                charSequenceM46003.getClass();
                map.put(str6, Integer.valueOf(charSequenceM46003.length()));
            }
            boolean zEquals = am.ax.equals(str2);
            for (int i = 0; i < m36189(); i++) {
                m36191(i).m36187(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM36183 = m36182(str4, treeMap);
                int length = spannableStringBuilderM36183.length() - 1;
                while (length >= 0 && spannableStringBuilderM36183.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM36183.charAt(length) != '\n') {
                    spannableStringBuilderM36183.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceM46004 = ((C20369) entry2.getValue()).m46003();
                charSequenceM46004.getClass();
                map2.put(str7, Integer.valueOf(charSequenceM46004.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m36182(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C20369 c20369 = new C20369();
            c20369.m46002(new SpannableStringBuilder());
            treeMap.put(str, c20369);
        }
        CharSequence charSequenceM46003 = ((C20369) treeMap.get(str)).m46003();
        charSequenceM46003.getClass();
        return (SpannableStringBuilder) charSequenceM46003;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02bd A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36186(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        C15109 c15109;
        C8759 c8759M44336;
        float f;
        float f2;
        int i;
        if (m36193(j)) {
            String str2 = this.f49340;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f49337.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f49344;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C20369 c20369 = (C20369) treeMap.get(str4);
                    c20369.getClass();
                    C8053 c8053 = (C8053) map2.get(str3);
                    c8053.getClass();
                    int i2 = c8053.f28196;
                    C8759 c8759M44337 = C19342.m44336(this.f49338, this.f49345, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c20369.m46003();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c20369.m46002(spannableStringBuilder);
                    }
                    if (c8759M44337 != null) {
                        if (c8759M44337.m22762() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(c8759M44337.m22762()), iIntValue, iIntValue2, 33);
                        }
                        if (c8759M44337.m22746()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c8759M44337.m22743()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c8759M44337.m22745()) {
                            C23805.m52454(spannableStringBuilder, new ForegroundColorSpan(c8759M44337.m22747()), iIntValue, iIntValue2);
                        }
                        if (c8759M44337.m22761()) {
                            C23805.m52454(spannableStringBuilder, new BackgroundColorSpan(c8759M44337.m22731()), iIntValue, iIntValue2);
                        }
                        if (c8759M44337.m22726() != null) {
                            C23805.m52454(spannableStringBuilder, new TypefaceSpan(c8759M44337.m22726()), iIntValue, iIntValue2);
                        }
                        if (c8759M44337.m22744() != null) {
                            C22870 c22870M22744 = c8759M44337.m22744();
                            c22870M22744.getClass();
                            int i3 = c22870M22744.f74392;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = c22870M22744.f74390;
                            }
                            int i4 = c22870M22744.f74391;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            C23805.m52454(spannableStringBuilder, new C23897(i3, i, i4), iIntValue, iIntValue2);
                        }
                        int iM22764 = c8759M44337.m22764();
                        if (iM22764 == 2) {
                            C15109 c151010 = this.f49333;
                            while (true) {
                                if (c151010 == null) {
                                    c151010 = null;
                                    break;
                                }
                                C8759 c8759M44338 = C19342.m44336(c151010.f49338, c151010.f49345, map);
                                if (c8759M44338 != null && c8759M44338.m22764() == 1) {
                                    break;
                                } else {
                                    c151010 = c151010.f49333;
                                }
                            }
                            if (c151010 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c151010);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c15109 = null;
                                        break;
                                    }
                                    c15109 = (C15109) arrayDeque.pop();
                                    C8759 c8759M44339 = C19342.m44336(c15109.f49338, c15109.f49345, map);
                                    if (c8759M44339 != null && c8759M44339.m22764() == 3) {
                                        break;
                                    }
                                    int iM36189 = c15109.m36189();
                                    while (true) {
                                        iM36189--;
                                        if (iM36189 >= 0) {
                                            arrayDeque.push(c15109.m36191(iM36189));
                                        }
                                    }
                                }
                                if (c15109 != null) {
                                    if (c15109.m36189() != 1 || c15109.m36191(0).f49343 == null) {
                                        C0303.m1851("Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c15109.m36191(0).f49343;
                                        String str6 = C17983.f57504;
                                        C8759 c8759M443310 = C19342.m44336(c15109.f49338, c15109.f49345, map);
                                        int iM22742 = c8759M443310 != null ? c8759M443310.m22742() : -1;
                                        if (iM22742 == -1 && (c8759M44336 = C19342.m44336(c151010.f49338, c151010.f49345, map)) != null) {
                                            iM22742 = c8759M44336.m22742();
                                        }
                                        spannableStringBuilder.setSpan(new C11197(str5, iM22742), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM22764 == 3 || iM22764 == 4) {
                            spannableStringBuilder.setSpan(new C6641(), iIntValue, iIntValue2, 33);
                        }
                        if (c8759M44337.m22760()) {
                            C23805.m52454(spannableStringBuilder, new C17546(), iIntValue, iIntValue2);
                        }
                        int iM22763 = c8759M44337.m22763();
                        if (iM22763 == 1) {
                            it = it2;
                            C23805.m52454(spannableStringBuilder, new AbsoluteSizeSpan((int) c8759M44337.m22739(), true), iIntValue, iIntValue2);
                        } else if (iM22763 != 2) {
                            if (iM22763 != 3) {
                                f = 100.0f;
                                it = it2;
                            } else {
                                float fM22739 = c8759M44337.m22739() / 100.0f;
                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                int length = relativeSizeSpanArr.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i5];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        fM22739 = relativeSizeSpan.getSizeChange() * fM22739;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        f2 = fM22739;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    } else {
                                        f2 = fM22739;
                                    }
                                    i5++;
                                    it2 = it3;
                                    fM22739 = f2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(fM22739), iIntValue, iIntValue2, 33);
                            }
                            if (!am.ax.equals(this.f49342)) {
                                if (c8759M44337.m22758() != Float.MAX_VALUE) {
                                    c20369.m46006((c8759M44337.m22758() * (-90.0f)) / f);
                                }
                                if (c8759M44337.m22759() != null) {
                                    c20369.m46012(c8759M44337.m22759());
                                }
                                if (c8759M44337.m22751() != null) {
                                    c20369.m46001(c8759M44337.m22751());
                                }
                            }
                        } else {
                            it = it2;
                            C23805.m52454(spannableStringBuilder, new RelativeSizeSpan(c8759M44337.m22739()), iIntValue, iIntValue2);
                        }
                        f = 100.0f;
                        if (!am.ax.equals(this.f49342)) {
                            if (c8759M44337.m22758() != Float.MAX_VALUE) {
                                c20369.m46006((c8759M44337.m22758() * (-90.0f)) / f);
                            }
                            if (c8759M44337.m22759() != null) {
                                c20369.m46012(c8759M44337.m22759());
                            }
                            if (c8759M44337.m22751() != null) {
                                c20369.m46001(c8759M44337.m22751());
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            for (int i6 = 0; i6 < m36189(); i6++) {
                m36191(i6).m36186(j, map, map2, str3, treeMap);
            }
        }
    }
}
