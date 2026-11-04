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

/* JADX INFO: renamed from: l.ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4194 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f15338;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f15339 = {0, 4, 8};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f15341 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15342 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f15340 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15338 = sparseIntArray;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3448 m13396(int i) {
        return m13383(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13390(C4194 c4194) {
        HashMap map = c4194.f15340;
        for (Integer num : map.keySet()) {
            num.getClass();
            C3448 c3448 = (C3448) map.get(num);
            HashMap map2 = this.f15340;
            if (!map2.containsKey(num)) {
                map2.put(num, new C3448());
            }
            C3448 c3449 = (C3448) map2.get(num);
            C20602 c20602 = c3449.f11241;
            if (!c20602.f65973) {
                c20602.m47188(c3448.f11241);
            }
            C6432 c6432 = c3449.f11244;
            if (!c6432.f21665) {
                C6432 c6433 = c3448.f11244;
                c6432.f21665 = c6433.f21665;
                c6432.f21664 = c6433.f21664;
                c6432.f21662 = c6433.f21662;
                c6432.f21663 = c6433.f21663;
                c6432.f21666 = c6433.f21666;
            }
            C24332 c24332 = c3449.f11243;
            if (!c24332.f78916) {
                c24332.m54378(c3448.f11243);
            }
            C12397 c12397 = c3449.f11246;
            if (!c12397.f39888) {
                c12397.m30868(c3448.f11246);
            }
            for (String str : c3448.f11245.keySet()) {
                if (!c3449.f11245.containsKey(str)) {
                    c3449.f11245.put(str, c3448.f11245.get(str));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13403(C21855 c21855) {
        int childCount = c21855.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21855.getChildAt(i);
            C11651 c11651 = (C11651) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f15342 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f15340;
            if (!map.containsKey(numValueOf)) {
                map.put(Integer.valueOf(id), new C3448());
            }
            C3448 c3448 = (C3448) map.get(Integer.valueOf(id));
            C20602 c20602 = c3448.f11241;
            C6432 c6432 = c3448.f11244;
            C24332 c24332 = c3448.f11243;
            if (!c20602.f65973) {
                c3448.m11240(id, c11651);
                if (childAt instanceof AbstractC13143) {
                    AbstractC13143 abstractC13143 = (AbstractC13143) childAt;
                    c20602.f65988 = Arrays.copyOf(abstractC13143.f42036, abstractC13143.f42035);
                    if (childAt instanceof C10905) {
                        C10905 c10905 = (C10905) childAt;
                        c20602.f66015 = c10905.m27678();
                        c20602.f65986 = c10905.m27675();
                        c20602.f66017 = c10905.m27676();
                    }
                }
                c20602.f65973 = true;
            }
            if (!c6432.f21665) {
                c6432.f21664 = childAt.getVisibility();
                c6432.f21662 = childAt.getAlpha();
                c6432.f21665 = true;
            }
            if (!c24332.f78916) {
                c24332.f78916 = true;
                c24332.f78924 = childAt.getRotation();
                c24332.f78922 = childAt.getRotationX();
                c24332.f78919 = childAt.getRotationY();
                c24332.f78918 = childAt.getScaleX();
                c24332.f78915 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c24332.f78913 = pivotX;
                    c24332.f78917 = pivotY;
                }
                c24332.f78925 = childAt.getTranslationX();
                c24332.f78920 = childAt.getTranslationY();
                c24332.f78921 = childAt.getTranslationZ();
                if (c24332.f78914) {
                    c24332.f78923 = childAt.getElevation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13397(C16872 c16872) {
        C4194 c4194 = this;
        int childCount = c16872.getChildCount();
        HashMap map = c4194.f15340;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = c16872.getChildAt(i);
            C11651 c11651 = (C11651) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c4194.f15342 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C3448());
            }
            C3448 c3448 = (C3448) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c4194.f15341;
            for (String str : map3.keySet()) {
                C15380 c15380 = (C15380) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C15380(c15380, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C15380(c15380, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            c3448.f11245 = map2;
            C6432 c6432 = c3448.f11244;
            C20602 c20602 = c3448.f11241;
            C24332 c24332 = c3448.f11243;
            c3448.m11240(id, c11651);
            c6432.f21664 = childAt.getVisibility();
            c6432.f21662 = childAt.getAlpha();
            c24332.f78924 = childAt.getRotation();
            c24332.f78922 = childAt.getRotationX();
            c24332.f78919 = childAt.getRotationY();
            c24332.f78918 = childAt.getScaleX();
            c24332.f78915 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c24332.f78913 = pivotX;
                c24332.f78917 = pivotY;
            }
            c24332.f78925 = childAt.getTranslationX();
            c24332.f78920 = childAt.getTranslationY();
            c24332.f78921 = childAt.getTranslationZ();
            if (c24332.f78914) {
                c24332.f78923 = childAt.getElevation();
            }
            if (childAt instanceof C10905) {
                C10905 c10905 = (C10905) childAt;
                c20602.f66015 = c10905.m27678();
                c20602.f65988 = Arrays.copyOf(c10905.f42036, c10905.f42035);
                c20602.f65986 = c10905.m27675();
                c20602.f66017 = c10905.m27676();
            }
            i++;
            c4194 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13393(C21348 c21348) {
        int childCount = c21348.getChildCount();
        HashMap map = this.f15340;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21348.getChildAt(i);
            C14634 c14634 = (C14634) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f15342 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C3448());
            }
            C3448 c3448 = (C3448) map.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC13143) {
                C3448.m11244(c3448, (AbstractC13143) childAt, id, c14634);
            }
            c3448.m11241(id, c14634);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13392(C16872 c16872) {
        m13402(c16872);
        c16872.setConstraintSet(null);
        c16872.requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13394(C21855 c21855) {
        int childCount = c21855.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21855.getChildAt(i);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f15340;
            if (!map.containsKey(numValueOf)) {
                C18540.m43118(childAt);
            } else {
                if (this.f15342 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id))) {
                    C15380.m36839(childAt, ((C3448) map.get(Integer.valueOf(id))).f11245);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13391(AbstractC13143 abstractC13143, C10445 c10445, C14634 c14634, SparseArray sparseArray) {
        int id = abstractC13143.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashMap map = this.f15340;
        if (map.containsKey(numValueOf)) {
            C3448 c3448 = (C3448) map.get(Integer.valueOf(id));
            if (c10445 instanceof C14174) {
                abstractC13143.mo27672(c3448, (C14174) c10445, c14634, sparseArray);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13387(int i, C14634 c14634) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f15340;
        if (map.containsKey(numValueOf)) {
            ((C3448) map.get(Integer.valueOf(i))).m11259(c14634);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13402(C16872 c16872) {
        int childCount = c16872.getChildCount();
        HashMap map = this.f15340;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = c16872.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                C18540.m43118(childAt);
            } else {
                if (this.f15342 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C3448 c3448 = (C3448) map.get(Integer.valueOf(id));
                    if (childAt instanceof C10905) {
                        c3448.f11241.f65992 = 1;
                    }
                    C20602 c20602 = c3448.f11241;
                    C6432 c6432 = c3448.f11244;
                    C24332 c24332 = c3448.f11243;
                    int i2 = c20602.f65992;
                    if (i2 != -1 && i2 == 1) {
                        C10905 c10905 = (C10905) childAt;
                        c10905.setId(id);
                        c10905.m27677(c20602.f65986);
                        c10905.m27671(c20602.f66017);
                        c10905.m27674(c20602.f66015);
                        int[] iArr = c20602.f65988;
                        if (iArr != null) {
                            c10905.m32673(iArr);
                        } else {
                            String str = c20602.f65966;
                            if (str != null) {
                                int[] iArrM13381 = m13381(c10905, str);
                                c20602.f65988 = iArrM13381;
                                c10905.m32673(iArrM13381);
                            }
                        }
                    }
                    C11651 c11651 = (C11651) childAt.getLayoutParams();
                    c11651.m29333();
                    c3448.m11259(c11651);
                    C15380.m36839(childAt, c3448.f11245);
                    childAt.setLayoutParams(c11651);
                    if (c6432.f21666 == 0) {
                        childAt.setVisibility(c6432.f21664);
                    }
                    childAt.setAlpha(c6432.f21662);
                    childAt.setRotation(c24332.f78924);
                    childAt.setRotationX(c24332.f78922);
                    childAt.setRotationY(c24332.f78919);
                    childAt.setScaleX(c24332.f78918);
                    childAt.setScaleY(c24332.f78915);
                    if (!Float.isNaN(c24332.f78913)) {
                        childAt.setPivotX(c24332.f78913);
                    }
                    if (!Float.isNaN(c24332.f78917)) {
                        childAt.setPivotY(c24332.f78917);
                    }
                    childAt.setTranslationX(c24332.f78925);
                    childAt.setTranslationY(c24332.f78920);
                    childAt.setTranslationZ(c24332.f78921);
                    if (c24332.f78914) {
                        childAt.setElevation(c24332.f78923);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C3448 c3449 = (C3448) map.get(num);
            C20602 c20603 = c3449.f11241;
            int i3 = c20603.f65992;
            if (i3 != -1 && i3 == 1) {
                C10905 c10906 = new C10905(c16872.getContext());
                c10906.setId(num.intValue());
                int[] iArr2 = c20603.f65988;
                if (iArr2 != null) {
                    c10906.m32673(iArr2);
                } else {
                    String str2 = c20603.f65966;
                    if (str2 != null) {
                        int[] iArrM13382 = m13381(c10906, str2);
                        c20603.f65988 = iArrM13382;
                        c10906.m32673(iArrM13382);
                    }
                }
                c10906.m27677(c20603.f65986);
                c10906.m27671(c20603.f66017);
                C11651 c11651GenerateDefaultLayoutParams = c16872.generateDefaultLayoutParams();
                c10906.m32674();
                c3449.m11259(c11651GenerateDefaultLayoutParams);
                c16872.addView(c10906, c11651GenerateDefaultLayoutParams);
            }
            if (c20603.f65975) {
                View c7923 = new C7923(c16872.getContext());
                c7923.setId(num.intValue());
                C11651 c11651GenerateDefaultLayoutParams2 = c16872.generateDefaultLayoutParams();
                c3449.m11259(c11651GenerateDefaultLayoutParams2);
                c16872.addView(c7923, c11651GenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m13399(int i) {
        return m13383(i).f11244.f21666;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m13404(int i) {
        return m13383(i).f11244.f21664;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13400(int i) {
        return m13383(i).f11241.f65997;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m13398(int i) {
        return m13383(i).f11241.f66023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13386(int i, int i2, int i3, float f) {
        C20602 c20602 = m13383(i).f11241;
        c20602.f65996 = i2;
        c20602.f65991 = i3;
        c20602.f66008 = f;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C3448 m13383(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f15340;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new C3448());
        }
        return (C3448) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13388(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C3448 c3448M13380 = m13380(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c3448M13380.f11241.f65975 = true;
                    }
                    this.f15340.put(Integer.valueOf(c3448M13380.f11242), c3448M13380);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13389(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            C3448 c3448M13380 = null;
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
                                if (c3448M13380 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c3448M13380.f11241.m47187(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (c3448M13380 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c3448M13380.f11246.m30867(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (c3448M13380 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c3448M13380.f11244.m18208(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (c3448M13380 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                c3448M13380.f11243.m54377(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (name.equals("Guideline")) {
                                c3448M13380 = m13380(context, Xml.asAttributeSet(xmlResourceParser));
                                C20602 c20602 = c3448M13380.f11241;
                                c20602.f65975 = true;
                                c20602.f65973 = true;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                c3448M13380 = m13380(context, Xml.asAttributeSet(xmlResourceParser));
                                c3448M13380.f11241.f65992 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            } else {
                                if (c3448M13380 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                C15380.m36838(context, xmlResourceParser, c3448M13380.f11245);
                            }
                            break;
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                c3448M13380 = m13380(context, Xml.asAttributeSet(xmlResourceParser));
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
                        this.f15340.put(Integer.valueOf(c3448M13380.f11242), c3448M13380);
                        c3448M13380 = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m13384(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3448 m13380(Context context, AttributeSet attributeSet) {
        C3448 c3448 = new C3448();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4422);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C6432 c6432 = c3448.f11244;
            C12397 c12397 = c3448.f11246;
            C24332 c24332 = c3448.f11243;
            C20602 c20602 = c3448.f11241;
            if (index != 1 && 23 != index && 24 != index) {
                c12397.f39888 = true;
                c20602.f65973 = true;
                c6432.f21665 = true;
                c24332.f78916 = true;
            }
            SparseIntArray sparseIntArray = f15338;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c20602.f65972 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65972);
                    break;
                case 2:
                    c20602.f66014 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66014);
                    break;
                case 3:
                    c20602.f65985 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65985);
                    break;
                case 4:
                    c20602.f66016 = m13384(typedArrayObtainStyledAttributes, index, c20602.f66016);
                    break;
                case 5:
                    c20602.f65987 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c20602.f66022 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c20602.f66022);
                    break;
                case 7:
                    c20602.f66000 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c20602.f66000);
                    break;
                case 8:
                    c20602.f66002 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66002);
                    break;
                case 9:
                    c20602.f65998 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65998);
                    break;
                case 10:
                    c20602.f66018 = m13384(typedArrayObtainStyledAttributes, index, c20602.f66018);
                    break;
                case 11:
                    c20602.f65968 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65968);
                    break;
                case 12:
                    c20602.f66010 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66010);
                    break;
                case 13:
                    c20602.f65989 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65989);
                    break;
                case 14:
                    c20602.f65976 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65976);
                    break;
                case 15:
                    c20602.f66020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66020);
                    break;
                case 16:
                    c20602.f65970 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65970);
                    break;
                case 17:
                    c20602.f65994 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c20602.f65994);
                    break;
                case 18:
                    c20602.f66012 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c20602.f66012);
                    break;
                case 19:
                    c20602.f66004 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f66004);
                    break;
                case 20:
                    c20602.f65964 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f65964);
                    break;
                case 21:
                    c20602.f65997 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c20602.f65997);
                    break;
                case 22:
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, c6432.f21664);
                    c6432.f21664 = i2;
                    c6432.f21664 = f15339[i2];
                    break;
                case 23:
                    c20602.f66023 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c20602.f66023);
                    break;
                case 24:
                    c20602.f65981 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65981);
                    break;
                case 25:
                    c20602.f65978 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65978);
                    break;
                case 26:
                    c20602.f65993 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65993);
                    break;
                case 27:
                    c20602.f66001 = typedArrayObtainStyledAttributes.getInt(index, c20602.f66001);
                    break;
                case 28:
                    c20602.f66003 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66003);
                    break;
                case 29:
                    c20602.f65999 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65999);
                    break;
                case 30:
                    c20602.f66019 = m13384(typedArrayObtainStyledAttributes, index, c20602.f66019);
                    break;
                case 31:
                    c20602.f65969 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65969);
                    break;
                case 32:
                    c20602.f66011 = m13384(typedArrayObtainStyledAttributes, index, c20602.f66011);
                    break;
                case 33:
                    c20602.f65990 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65990);
                    break;
                case 34:
                    c20602.f65977 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65977);
                    break;
                case 35:
                    c20602.f66021 = m13384(typedArrayObtainStyledAttributes, index, c20602.f66021);
                    break;
                case 36:
                    c20602.f65971 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65971);
                    break;
                case 37:
                    c20602.f65995 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f65995);
                    break;
                case 38:
                    c3448.f11242 = typedArrayObtainStyledAttributes.getResourceId(index, c3448.f11242);
                    break;
                case 39:
                    c20602.f65967 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f65967);
                    break;
                case 40:
                    c20602.f66005 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f66005);
                    break;
                case 41:
                    c20602.f65982 = typedArrayObtainStyledAttributes.getInt(index, c20602.f65982);
                    break;
                case 42:
                    c20602.f66013 = typedArrayObtainStyledAttributes.getInt(index, c20602.f66013);
                    break;
                case 43:
                    c6432.f21662 = typedArrayObtainStyledAttributes.getFloat(index, c6432.f21662);
                    break;
                case 44:
                    c24332.f78914 = true;
                    c24332.f78923 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78923);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c24332.f78922 = typedArrayObtainStyledAttributes.getFloat(index, c24332.f78922);
                    break;
                case 46:
                    c24332.f78919 = typedArrayObtainStyledAttributes.getFloat(index, c24332.f78919);
                    break;
                case 47:
                    c24332.f78918 = typedArrayObtainStyledAttributes.getFloat(index, c24332.f78918);
                    break;
                case 48:
                    c24332.f78915 = typedArrayObtainStyledAttributes.getFloat(index, c24332.f78915);
                    break;
                case 49:
                    c24332.f78913 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78913);
                    break;
                case 50:
                    c24332.f78917 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78917);
                    break;
                case 51:
                    c24332.f78925 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78925);
                    break;
                case 52:
                    c24332.f78920 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78920);
                    break;
                case 53:
                    c24332.f78921 = typedArrayObtainStyledAttributes.getDimension(index, c24332.f78921);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    c20602.f65963 = typedArrayObtainStyledAttributes.getInt(index, c20602.f65963);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    c20602.f65962 = typedArrayObtainStyledAttributes.getInt(index, c20602.f65962);
                    break;
                case 56:
                    c20602.f65980 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65980);
                    break;
                case 57:
                    c20602.f65979 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65979);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    c20602.f66007 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66007);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    c20602.f66006 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66006);
                    break;
                case 60:
                    c24332.f78924 = typedArrayObtainStyledAttributes.getFloat(index, c24332.f78924);
                    break;
                case 61:
                    c20602.f65996 = m13384(typedArrayObtainStyledAttributes, index, c20602.f65996);
                    break;
                case 62:
                    c20602.f65991 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f65991);
                    break;
                case 63:
                    c20602.f66008 = typedArrayObtainStyledAttributes.getFloat(index, c20602.f66008);
                    break;
                case 64:
                    c12397.f39883 = m13384(typedArrayObtainStyledAttributes, index, c12397.f39883);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        c12397.f39885 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        c12397.f39885 = C12573.f40368[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c12397.f39884 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c12397.f39886 = typedArrayObtainStyledAttributes.getFloat(index, c12397.f39886);
                    break;
                case 68:
                    c6432.f21663 = typedArrayObtainStyledAttributes.getFloat(index, c6432.f21663);
                    break;
                case 69:
                    c20602.f65984 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c20602.f65983 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c20602.f65986 = typedArrayObtainStyledAttributes.getInt(index, c20602.f65986);
                    break;
                case 73:
                    c20602.f66017 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c20602.f66017);
                    break;
                case 74:
                    c20602.f65966 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c20602.f66015 = typedArrayObtainStyledAttributes.getBoolean(index, c20602.f66015);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    c12397.f39887 = typedArrayObtainStyledAttributes.getInt(index, c12397.f39887);
                    break;
                case 77:
                    c20602.f66009 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c6432.f21666 = typedArrayObtainStyledAttributes.getInt(index, c6432.f21666);
                    break;
                case 79:
                    c12397.f39889 = typedArrayObtainStyledAttributes.getFloat(index, c12397.f39889);
                    break;
                case 80:
                    c20602.f65965 = typedArrayObtainStyledAttributes.getBoolean(index, c20602.f65965);
                    break;
                case 81:
                    c20602.f65974 = typedArrayObtainStyledAttributes.getBoolean(index, c20602.f65974);
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
        return c3448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m13381(C10905 c10905, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = c10905.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C10159.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c10905.isInEditMode() && (c10905.getParent() instanceof C16872) && (designInformation = ((C16872) c10905.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3448 m13385(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f15340;
        if (map.containsKey(numValueOf)) {
            return (C3448) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m13395() {
        Integer[] numArr = (Integer[]) this.f15340.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13401() {
        this.f15342 = false;
    }
}
