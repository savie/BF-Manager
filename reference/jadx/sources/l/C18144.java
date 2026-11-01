package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18144 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f58022 = {0, 4, 8};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f58023;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f58025 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58026 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f58024 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f58023 = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_attachUserService, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_isHidden, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4032 m42252(int i) {
        return m42233(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42249(C18144 c18144) {
        HashMap map = c18144.f58024;
        for (Integer num : map.keySet()) {
            num.getClass();
            C4032 c4032 = (C4032) map.get(num);
            HashMap map2 = this.f58024;
            if (!map2.containsKey(num)) {
                map2.put(num, new C4032());
            }
            C4032 c4033 = (C4032) map2.get(num);
            C6855 c6855 = c4033.f14903;
            if (!c6855.f23079) {
                c6855.m18481(c4032.f14903);
            }
            C15323 c15323 = c4033.f14904;
            if (!c15323.f49912) {
                C15323 c15324 = c4032.f14904;
                c15323.f49912 = c15324.f49912;
                c15323.f49910 = c15324.f49910;
                c15323.f49909 = c15324.f49909;
                c15323.f49911 = c15324.f49911;
                c15323.f49908 = c15324.f49908;
            }
            C21672 c21672 = c4033.f14907;
            if (!c21672.f70287) {
                c21672.m48404(c4032.f14907);
            }
            C23084 c23084 = c4033.f14902;
            if (!c23084.f75008) {
                c23084.m51081(c4032.f14902);
            }
            for (String str : c4032.f14906.keySet()) {
                if (!c4033.f14906.containsKey(str)) {
                    c4033.f14906.put(str, c4032.f14906.get(str));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42257(C10884 c10884) {
        int childCount = c10884.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10884.getChildAt(i);
            C11795 c11795 = (C11795) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f58026 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f58024;
            if (!map.containsKey(numValueOf)) {
                map.put(Integer.valueOf(id), new C4032());
            }
            C4032 c4032 = (C4032) map.get(Integer.valueOf(id));
            C6855 c6855 = c4032.f14903;
            C15323 c15323 = c4032.f14904;
            C21672 c21672 = c4032.f14907;
            if (!c6855.f23079) {
                c4032.m11534(id, c11795);
                if (childAt instanceof AbstractC3472) {
                    AbstractC3472 abstractC3472 = (AbstractC3472) childAt;
                    c6855.f23085 = Arrays.copyOf(abstractC3472.f12747, abstractC3472.f12751);
                    if (childAt instanceof C23935) {
                        C23935 c23935 = (C23935) childAt;
                        c6855.f23103 = c23935.m52762();
                        c6855.f23097 = c23935.m52767();
                        c6855.f23074 = c23935.m52765();
                    }
                }
                c6855.f23079 = true;
            }
            if (!c15323.f49912) {
                c15323.f49910 = childAt.getVisibility();
                c15323.f49909 = childAt.getAlpha();
                c15323.f49912 = true;
            }
            if (!c21672.f70287) {
                c21672.f70287 = true;
                c21672.f70282 = childAt.getRotation();
                c21672.f70285 = childAt.getRotationX();
                c21672.f70292 = childAt.getRotationY();
                c21672.f70281 = childAt.getScaleX();
                c21672.f70288 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c21672.f70283 = pivotX;
                    c21672.f70286 = pivotY;
                }
                c21672.f70293 = childAt.getTranslationX();
                c21672.f70290 = childAt.getTranslationY();
                c21672.f70291 = childAt.getTranslationZ();
                if (c21672.f70284) {
                    c21672.f70289 = childAt.getElevation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42253(C5444 c5444) {
        C18144 c18144 = this;
        int childCount = c5444.getChildCount();
        HashMap map = c18144.f58024;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = c5444.getChildAt(i);
            C11795 c11795 = (C11795) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c18144.f58026 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C4032());
            }
            C4032 c4032 = (C4032) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c18144.f58025;
            for (String str : map3.keySet()) {
                C9824 c9824 = (C9824) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C9824(c9824, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C9824(c9824, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            c4032.f14906 = map2;
            C15323 c15323 = c4032.f14904;
            C6855 c6855 = c4032.f14903;
            C21672 c21672 = c4032.f14907;
            c4032.m11534(id, c11795);
            c15323.f49910 = childAt.getVisibility();
            c15323.f49909 = childAt.getAlpha();
            c21672.f70282 = childAt.getRotation();
            c21672.f70285 = childAt.getRotationX();
            c21672.f70292 = childAt.getRotationY();
            c21672.f70281 = childAt.getScaleX();
            c21672.f70288 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c21672.f70283 = pivotX;
                c21672.f70286 = pivotY;
            }
            c21672.f70293 = childAt.getTranslationX();
            c21672.f70290 = childAt.getTranslationY();
            c21672.f70291 = childAt.getTranslationZ();
            if (c21672.f70284) {
                c21672.f70289 = childAt.getElevation();
            }
            if (childAt instanceof C23935) {
                C23935 c23935 = (C23935) childAt;
                c6855.f23103 = c23935.m52762();
                c6855.f23085 = Arrays.copyOf(c23935.f12747, c23935.f12751);
                c6855.f23097 = c23935.m52767();
                c6855.f23074 = c23935.m52765();
            }
            i++;
            c18144 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42247(C8267 c8267) {
        int childCount = c8267.getChildCount();
        HashMap map = this.f58024;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c8267.getChildAt(i);
            C18850 c18850 = (C18850) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f58026 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C4032());
            }
            C4032 c4032 = (C4032) map.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC3472) {
                C4032.m11538(c4032, (AbstractC3472) childAt, id, c18850);
            }
            c4032.m11535(id, c18850);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42246(C5444 c5444) {
        m42256(c5444);
        c5444.setConstraintSet(null);
        c5444.requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42248(C10884 c10884) {
        int childCount = c10884.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10884.getChildAt(i);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f58024;
            if (!map.containsKey(numValueOf)) {
                C19660.m44790(childAt);
            } else {
                if (this.f58026 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id))) {
                    C9824.m24926(childAt, ((C4032) map.get(Integer.valueOf(id))).f14906);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42245(AbstractC3472 abstractC3472, C20719 c20719, C18850 c18850, SparseArray sparseArray) {
        int id = abstractC3472.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashMap map = this.f58024;
        if (map.containsKey(numValueOf)) {
            C4032 c4032 = (C4032) map.get(Integer.valueOf(id));
            if (c20719 instanceof C17191) {
                abstractC3472.mo8329(c4032, (C17191) c20719, c18850, sparseArray);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42242(int i, C18850 c18850) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f58024;
        if (map.containsKey(numValueOf)) {
            ((C4032) map.get(Integer.valueOf(i))).m11539(c18850);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42256(C5444 c5444) {
        int childCount = c5444.getChildCount();
        HashMap map = this.f58024;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = c5444.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                C19660.m44790(childAt);
            } else {
                if (this.f58026 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C4032 c4032 = (C4032) map.get(Integer.valueOf(id));
                    if (childAt instanceof C23935) {
                        c4032.f14903.f23071 = 1;
                    }
                    C6855 c6855 = c4032.f14903;
                    C15323 c15323 = c4032.f14904;
                    C21672 c21672 = c4032.f14907;
                    int i2 = c6855.f23071;
                    if (i2 != -1 && i2 == 1) {
                        C23935 c23935 = (C23935) childAt;
                        c23935.setId(id);
                        c23935.m52766(c6855.f23097);
                        c23935.m52763(c6855.f23074);
                        c23935.m52764(c6855.f23103);
                        int[] iArr = c6855.f23085;
                        if (iArr != null) {
                            c23935.m10201(iArr);
                        } else {
                            String str = c6855.f23077;
                            if (str != null) {
                                int[] iArrM42236 = m42236(c23935, str);
                                c6855.f23085 = iArrM42236;
                                c23935.m10201(iArrM42236);
                            }
                        }
                    }
                    C11795 c11795 = (C11795) childAt.getLayoutParams();
                    c11795.m29478();
                    c4032.m11539(c11795);
                    C9824.m24926(childAt, c4032.f14906);
                    childAt.setLayoutParams(c11795);
                    if (c15323.f49908 == 0) {
                        childAt.setVisibility(c15323.f49910);
                    }
                    childAt.setAlpha(c15323.f49909);
                    childAt.setRotation(c21672.f70282);
                    childAt.setRotationX(c21672.f70285);
                    childAt.setRotationY(c21672.f70292);
                    childAt.setScaleX(c21672.f70281);
                    childAt.setScaleY(c21672.f70288);
                    if (!Float.isNaN(c21672.f70283)) {
                        childAt.setPivotX(c21672.f70283);
                    }
                    if (!Float.isNaN(c21672.f70286)) {
                        childAt.setPivotY(c21672.f70286);
                    }
                    childAt.setTranslationX(c21672.f70293);
                    childAt.setTranslationY(c21672.f70290);
                    childAt.setTranslationZ(c21672.f70291);
                    if (c21672.f70284) {
                        childAt.setElevation(c21672.f70289);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C4032 c4033 = (C4032) map.get(num);
            C6855 c6856 = c4033.f14903;
            int i3 = c6856.f23071;
            if (i3 != -1 && i3 == 1) {
                C23935 c23936 = new C23935(c5444.getContext());
                c23936.setId(num.intValue());
                int[] iArr2 = c6856.f23085;
                if (iArr2 != null) {
                    c23936.m10201(iArr2);
                } else {
                    String str2 = c6856.f23077;
                    if (str2 != null) {
                        int[] iArrM42237 = m42236(c23936, str2);
                        c6856.f23085 = iArrM42237;
                        c23936.m10201(iArrM42237);
                    }
                }
                c23936.m52766(c6856.f23097);
                c23936.m52763(c6856.f23074);
                C11795 c11795GenerateDefaultLayoutParams = c5444.generateDefaultLayoutParams();
                c23936.m10202();
                c4033.m11539(c11795GenerateDefaultLayoutParams);
                c5444.addView(c23936, c11795GenerateDefaultLayoutParams);
            }
            if (c6856.f23101) {
                View c10384 = new C10384(c5444.getContext());
                c10384.setId(num.intValue());
                C11795 c11795GenerateDefaultLayoutParams2 = c5444.generateDefaultLayoutParams();
                c4033.m11539(c11795GenerateDefaultLayoutParams2);
                c5444.addView(c10384, c11795GenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m42251(int i) {
        return m42233(i).f14904.f49908;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42239(int i) {
        return m42233(i).f14904.f49910;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m42254(int i) {
        return m42233(i).f14903.f23126;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m42258(int i) {
        return m42233(i).f14903.f23128;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42241(int i, int i2, int i3, float f) {
        C6855 c6855 = m42233(i).f14903;
        c6855.f23125 = i2;
        c6855.f23070 = i3;
        c6855.f23080 = f;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C4032 m42233(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f58024;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new C4032());
        }
        return (C4032) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42243(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C4032 c4032M42235 = m42235(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c4032M42235.f14903.f23101 = true;
                    }
                    this.f58024.put(Integer.valueOf(c4032M42235.f14905), c4032M42235);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42244(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            C4032 c4032M42235 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (c4032M42235 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c4032M42235.f14903.m18480(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (c4032M42235 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c4032M42235.f14902.m51080(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (c4032M42235 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c4032M42235.f14904.m36684(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (c4032M42235 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c4032M42235.f14907.m48403(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (name.equals("Guideline")) {
                                c4032M42235 = m42235(context, Xml.asAttributeSet(xmlResourceParser));
                                C6855 c6855 = c4032M42235.f14903;
                                c6855.f23101 = true;
                                c6855.f23079 = true;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                c4032M42235 = m42235(context, Xml.asAttributeSet(xmlResourceParser));
                                c4032M42235.f14903.f23071 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            } else {
                                if (c4032M42235 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                C9824.m24925(context, xmlResourceParser, c4032M42235.f14906);
                            }
                            break;
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                c4032M42235 = m42235(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if ("ConstraintSet".equals(name2)) {
                        return;
                    }
                    if (name2.equalsIgnoreCase("Constraint")) {
                        this.f58024.put(Integer.valueOf(c4032M42235.f14905), c4032M42235);
                        c4032M42235 = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m42238(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4032 m42235(Context context, AttributeSet attributeSet) {
        C4032 c4032 = new C4032();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51880);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C15323 c15323 = c4032.f14904;
            C23084 c23084 = c4032.f14902;
            C21672 c21672 = c4032.f14907;
            C6855 c6855 = c4032.f14903;
            if (index != 1 && 23 != index && 24 != index) {
                c23084.f75008 = true;
                c6855.f23079 = true;
                c15323.f49912 = true;
                c21672.f70287 = true;
            }
            SparseIntArray sparseIntArray = f58023;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c6855.f23078 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23078);
                    break;
                case 2:
                    c6855.f23102 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23102);
                    break;
                case 3:
                    c6855.f23096 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23096);
                    break;
                case 4:
                    c6855.f23073 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23073);
                    break;
                case 5:
                    c6855.f23084 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c6855.f23127 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c6855.f23127);
                    break;
                case 7:
                    c6855.f23105 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c6855.f23105);
                    break;
                case 8:
                    c6855.f23123 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23123);
                    break;
                case 9:
                    c6855.f23113 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23113);
                    break;
                case 10:
                    c6855.f23115 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23115);
                    break;
                case 11:
                    c6855.f23088 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23088);
                    break;
                case 12:
                    c6855.f23117 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23117);
                    break;
                case 13:
                    c6855.f23090 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23090);
                    break;
                case 14:
                    c6855.f23093 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23093);
                    break;
                case 15:
                    c6855.f23086 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23086);
                    break;
                case 16:
                    c6855.f23121 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23121);
                    break;
                case 17:
                    c6855.f23107 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c6855.f23107);
                    break;
                case 18:
                    c6855.f23119 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c6855.f23119);
                    break;
                case 19:
                    c6855.f23068 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23068);
                    break;
                case 20:
                    c6855.f23095 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23095);
                    break;
                case 21:
                    c6855.f23126 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c6855.f23126);
                    break;
                case 22:
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, c15323.f49910);
                    c15323.f49910 = i2;
                    c15323.f49910 = f58022[i2];
                    break;
                case 23:
                    c6855.f23128 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c6855.f23128);
                    break;
                case 24:
                    c6855.f23072 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23072);
                    break;
                case 25:
                    c6855.f23092 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23092);
                    break;
                case 26:
                    c6855.f23075 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23075);
                    break;
                case 27:
                    c6855.f23106 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23106);
                    break;
                case 28:
                    c6855.f23124 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23124);
                    break;
                case 29:
                    c6855.f23114 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23114);
                    break;
                case 30:
                    c6855.f23116 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23116);
                    break;
                case 31:
                    c6855.f23089 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23089);
                    break;
                case 32:
                    c6855.f23118 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23118);
                    break;
                case 33:
                    c6855.f23091 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23091);
                    break;
                case 34:
                    c6855.f23094 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23094);
                    break;
                case 35:
                    c6855.f23087 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23087);
                    break;
                case 36:
                    c6855.f23122 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23122);
                    break;
                case 37:
                    c6855.f23108 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23108);
                    break;
                case 38:
                    c4032.f14905 = typedArrayObtainStyledAttributes.getResourceId(index, c4032.f14905);
                    break;
                case 39:
                    c6855.f23104 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23104);
                    break;
                case 40:
                    c6855.f23069 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23069);
                    break;
                case 41:
                    c6855.f23129 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23129);
                    break;
                case 42:
                    c6855.f23120 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23120);
                    break;
                case 43:
                    c15323.f49909 = typedArrayObtainStyledAttributes.getFloat(index, c15323.f49909);
                    break;
                case 44:
                    c21672.f70284 = true;
                    c21672.f70289 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70289);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c21672.f70285 = typedArrayObtainStyledAttributes.getFloat(index, c21672.f70285);
                    break;
                case 46:
                    c21672.f70292 = typedArrayObtainStyledAttributes.getFloat(index, c21672.f70292);
                    break;
                case 47:
                    c21672.f70281 = typedArrayObtainStyledAttributes.getFloat(index, c21672.f70281);
                    break;
                case 48:
                    c21672.f70288 = typedArrayObtainStyledAttributes.getFloat(index, c21672.f70288);
                    break;
                case 49:
                    c21672.f70283 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70283);
                    break;
                case 50:
                    c21672.f70286 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70286);
                    break;
                case 51:
                    c21672.f70293 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70293);
                    break;
                case 52:
                    c21672.f70290 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70290);
                    break;
                case 53:
                    c21672.f70291 = typedArrayObtainStyledAttributes.getDimension(index, c21672.f70291);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    c6855.f23110 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23110);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    c6855.f23109 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23109);
                    break;
                case 56:
                    c6855.f23099 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23099);
                    break;
                case 57:
                    c6855.f23098 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23098);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    c6855.f23112 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23112);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    c6855.f23111 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23111);
                    break;
                case 60:
                    c21672.f70282 = typedArrayObtainStyledAttributes.getFloat(index, c21672.f70282);
                    break;
                case 61:
                    c6855.f23125 = m42238(typedArrayObtainStyledAttributes, index, c6855.f23125);
                    break;
                case 62:
                    c6855.f23070 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23070);
                    break;
                case 63:
                    c6855.f23080 = typedArrayObtainStyledAttributes.getFloat(index, c6855.f23080);
                    break;
                case 64:
                    c23084.f75005 = m42238(typedArrayObtainStyledAttributes, index, c23084.f75005);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        c23084.f75003 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        c23084.f75003 = C23188.f75244[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c23084.f75007 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c23084.f75009 = typedArrayObtainStyledAttributes.getFloat(index, c23084.f75009);
                    break;
                case 68:
                    c15323.f49911 = typedArrayObtainStyledAttributes.getFloat(index, c15323.f49911);
                    break;
                case 69:
                    c6855.f23083 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c6855.f23082 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c6855.f23097 = typedArrayObtainStyledAttributes.getInt(index, c6855.f23097);
                    break;
                case 73:
                    c6855.f23074 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c6855.f23074);
                    break;
                case 74:
                    c6855.f23077 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c6855.f23103 = typedArrayObtainStyledAttributes.getBoolean(index, c6855.f23103);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    c23084.f75006 = typedArrayObtainStyledAttributes.getInt(index, c23084.f75006);
                    break;
                case 77:
                    c6855.f23081 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c15323.f49908 = typedArrayObtainStyledAttributes.getInt(index, c15323.f49908);
                    break;
                case 79:
                    c23084.f75004 = typedArrayObtainStyledAttributes.getFloat(index, c23084.f75004);
                    break;
                case 80:
                    c6855.f23076 = typedArrayObtainStyledAttributes.getBoolean(index, c6855.f23076);
                    break;
                case 81:
                    c6855.f23100 = typedArrayObtainStyledAttributes.getBoolean(index, c6855.f23100);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c4032;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m42236(C23935 c23935, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = c23935.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C20967.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c23935.isInEditMode() && (c23935.getParent() instanceof C5444) && (designInformation = ((C5444) c23935.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4032 m42240(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f58024;
        if (map.containsKey(numValueOf)) {
            return (C4032) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m42250() {
        Integer[] numArr = (Integer[]) this.f58024.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42255() {
        this.f58026 = false;
    }
}
