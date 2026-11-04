package l;

import android.view.View;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14569 implements Comparable {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f45919;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f45914 = 1.0f;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f45904 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f45915 = 0.0f;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f45910 = 0.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f45905 = 0.0f;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f45909 = 0.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f45907 = 1.0f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f45913 = 1.0f;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f45908 = Float.NaN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f45916 = Float.NaN;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f45906 = 0.0f;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f45918 = 0.0f;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f45912 = 0.0f;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f45903 = Float.NaN;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f45911 = Float.NaN;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f45917 = new LinkedHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((C14569) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35143(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35147(C14569 c14569, HashSet hashSet) {
        if (m35143(this.f45914, c14569.f45914)) {
            hashSet.add("alpha");
        }
        if (m35143(this.f45915, c14569.f45915)) {
            hashSet.add("elevation");
        }
        int i = this.f45919;
        int i2 = c14569.f45919;
        if (i != i2 && this.f45904 == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m35143(this.f45910, c14569.f45910)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f45903) || !Float.isNaN(c14569.f45903)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f45911) || !Float.isNaN(c14569.f45911)) {
            hashSet.add("progress");
        }
        if (m35143(this.f45905, c14569.f45905)) {
            hashSet.add("rotationX");
        }
        if (m35143(this.f45909, c14569.f45909)) {
            hashSet.add("rotationY");
        }
        if (m35143(this.f45908, c14569.f45908)) {
            hashSet.add("transformPivotX");
        }
        if (m35143(this.f45916, c14569.f45916)) {
            hashSet.add("transformPivotY");
        }
        if (m35143(this.f45907, c14569.f45907)) {
            hashSet.add("scaleX");
        }
        if (m35143(this.f45913, c14569.f45913)) {
            hashSet.add("scaleY");
        }
        if (m35143(this.f45906, c14569.f45906)) {
            hashSet.add("translationX");
        }
        if (m35143(this.f45918, c14569.f45918)) {
            hashSet.add("translationY");
        }
        if (m35143(this.f45912, c14569.f45912)) {
            hashSet.add("translationZ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35144(int i, HashMap map) {
        for (String str : map.keySet()) {
            AbstractC21109 abstractC21109 = (AbstractC21109) map.get(str);
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = cb.k;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    abstractC21109.mo6084(Float.isNaN(this.f45905) ? 0.0f : this.f45905, i);
                    break;
                case 1:
                    abstractC21109.mo6084(Float.isNaN(this.f45909) ? 0.0f : this.f45909, i);
                    break;
                case 2:
                    abstractC21109.mo6084(Float.isNaN(this.f45906) ? 0.0f : this.f45906, i);
                    break;
                case 3:
                    abstractC21109.mo6084(Float.isNaN(this.f45918) ? 0.0f : this.f45918, i);
                    break;
                case 4:
                    abstractC21109.mo6084(Float.isNaN(this.f45912) ? 0.0f : this.f45912, i);
                    break;
                case 5:
                    abstractC21109.mo6084(Float.isNaN(this.f45911) ? 0.0f : this.f45911, i);
                    break;
                case 6:
                    abstractC21109.mo6084(Float.isNaN(this.f45907) ? 1.0f : this.f45907, i);
                    break;
                case 7:
                    abstractC21109.mo6084(Float.isNaN(this.f45913) ? 1.0f : this.f45913, i);
                    break;
                case 8:
                    abstractC21109.mo6084(Float.isNaN(this.f45908) ? 0.0f : this.f45908, i);
                    break;
                case 9:
                    abstractC21109.mo6084(Float.isNaN(this.f45916) ? 0.0f : this.f45916, i);
                    break;
                case 10:
                    abstractC21109.mo6084(Float.isNaN(this.f45910) ? 0.0f : this.f45910, i);
                    break;
                case 11:
                    abstractC21109.mo6084(Float.isNaN(this.f45915) ? 0.0f : this.f45915, i);
                    break;
                case 12:
                    abstractC21109.mo6084(Float.isNaN(this.f45903) ? 0.0f : this.f45903, i);
                    break;
                case 13:
                    abstractC21109.mo6084(Float.isNaN(this.f45914) ? 1.0f : this.f45914, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f45917;
                        if (linkedHashMap.containsKey(str2)) {
                            C15380 c15380 = (C15380) linkedHashMap.get(str2);
                            if (abstractC21109 instanceof C1718) {
                                ((C1718) abstractC21109).f5875.append(i, c15380);
                            } else {
                                c15380.m36845();
                                C17359.toString(abstractC21109);
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35145(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f45919 = view.getVisibility();
        this.f45914 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f45915 = view.getElevation();
        this.f45910 = view.getRotation();
        this.f45905 = view.getRotationX();
        this.f45909 = view.getRotationY();
        this.f45907 = view.getScaleX();
        this.f45913 = view.getScaleY();
        this.f45908 = view.getPivotX();
        this.f45916 = view.getPivotY();
        this.f45906 = view.getTranslationX();
        this.f45918 = view.getTranslationY();
        this.f45912 = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35146(C10445 c10445, C4194 c4194, int i) {
        c10445.m26840();
        c10445.m26856();
        C3448 c3448M13396 = c4194.m13396(i);
        C6432 c6432 = c3448M13396.f11244;
        C12397 c12397 = c3448M13396.f11246;
        int i2 = c6432.f21666;
        this.f45904 = i2;
        int i3 = c6432.f21664;
        this.f45919 = i3;
        this.f45914 = (i3 == 0 || i2 != 0) ? c6432.f21662 : 0.0f;
        C24332 c24332 = c3448M13396.f11243;
        boolean z = c24332.f78914;
        this.f45915 = c24332.f78923;
        this.f45910 = c24332.f78924;
        this.f45905 = c24332.f78922;
        this.f45909 = c24332.f78919;
        this.f45907 = c24332.f78918;
        this.f45913 = c24332.f78915;
        this.f45908 = c24332.f78913;
        this.f45916 = c24332.f78917;
        this.f45906 = c24332.f78925;
        this.f45918 = c24332.f78920;
        this.f45912 = c24332.f78921;
        C12573.m31287(c12397.f39885);
        this.f45903 = c12397.f39886;
        this.f45911 = c3448M13396.f11244.f21663;
        for (String str : c3448M13396.f11245.keySet()) {
            C15380 c15380 = (C15380) c3448M13396.f11245.get(str);
            if (c15380.m36840() != EnumC19856.STRING_TYPE) {
                this.f45917.put(str, c15380);
            }
        }
    }
}
