package l;

import android.view.View;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18644 implements Comparable {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f60442;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f60452 = 1.0f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f60447 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f60440 = 0.0f;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f60456 = 0.0f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f60451 = 0.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f60441 = 0.0f;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f60446 = 1.0f;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f60443 = 1.0f;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f60449 = Float.NaN;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f60454 = Float.NaN;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f60444 = 0.0f;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f60450 = 0.0f;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f60448 = 0.0f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f60453 = Float.NaN;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f60445 = Float.NaN;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f60455 = new LinkedHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((C18644) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43125(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43128(C18644 c18644, HashSet hashSet) {
        if (m43125(this.f60452, c18644.f60452)) {
            hashSet.add("alpha");
        }
        if (m43125(this.f60440, c18644.f60440)) {
            hashSet.add("elevation");
        }
        int i = this.f60442;
        int i2 = c18644.f60442;
        if (i != i2 && this.f60447 == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m43125(this.f60456, c18644.f60456)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f60453) || !Float.isNaN(c18644.f60453)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f60445) || !Float.isNaN(c18644.f60445)) {
            hashSet.add("progress");
        }
        if (m43125(this.f60451, c18644.f60451)) {
            hashSet.add("rotationX");
        }
        if (m43125(this.f60441, c18644.f60441)) {
            hashSet.add("rotationY");
        }
        if (m43125(this.f60449, c18644.f60449)) {
            hashSet.add("transformPivotX");
        }
        if (m43125(this.f60454, c18644.f60454)) {
            hashSet.add("transformPivotY");
        }
        if (m43125(this.f60446, c18644.f60446)) {
            hashSet.add("scaleX");
        }
        if (m43125(this.f60443, c18644.f60443)) {
            hashSet.add("scaleY");
        }
        if (m43125(this.f60444, c18644.f60444)) {
            hashSet.add("translationX");
        }
        if (m43125(this.f60450, c18644.f60450)) {
            hashSet.add("translationY");
        }
        if (m43125(this.f60448, c18644.f60448)) {
            hashSet.add("translationZ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43126(int i, HashMap map) {
        for (String str : map.keySet()) {
            AbstractC8102 abstractC8102 = (AbstractC8102) map.get(str);
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
                    abstractC8102.mo21317(Float.isNaN(this.f60451) ? 0.0f : this.f60451, i);
                    break;
                case 1:
                    abstractC8102.mo21317(Float.isNaN(this.f60441) ? 0.0f : this.f60441, i);
                    break;
                case 2:
                    abstractC8102.mo21317(Float.isNaN(this.f60444) ? 0.0f : this.f60444, i);
                    break;
                case 3:
                    abstractC8102.mo21317(Float.isNaN(this.f60450) ? 0.0f : this.f60450, i);
                    break;
                case 4:
                    abstractC8102.mo21317(Float.isNaN(this.f60448) ? 0.0f : this.f60448, i);
                    break;
                case 5:
                    abstractC8102.mo21317(Float.isNaN(this.f60445) ? 0.0f : this.f60445, i);
                    break;
                case 6:
                    abstractC8102.mo21317(Float.isNaN(this.f60446) ? 1.0f : this.f60446, i);
                    break;
                case 7:
                    abstractC8102.mo21317(Float.isNaN(this.f60443) ? 1.0f : this.f60443, i);
                    break;
                case 8:
                    abstractC8102.mo21317(Float.isNaN(this.f60449) ? 0.0f : this.f60449, i);
                    break;
                case 9:
                    abstractC8102.mo21317(Float.isNaN(this.f60454) ? 0.0f : this.f60454, i);
                    break;
                case 10:
                    abstractC8102.mo21317(Float.isNaN(this.f60456) ? 0.0f : this.f60456, i);
                    break;
                case 11:
                    abstractC8102.mo21317(Float.isNaN(this.f60440) ? 0.0f : this.f60440, i);
                    break;
                case 12:
                    abstractC8102.mo21317(Float.isNaN(this.f60453) ? 0.0f : this.f60453, i);
                    break;
                case 13:
                    abstractC8102.mo21317(Float.isNaN(this.f60452) ? 1.0f : this.f60452, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f60455;
                        if (linkedHashMap.containsKey(str2)) {
                            C9824 c9824 = (C9824) linkedHashMap.get(str2);
                            if (abstractC8102 instanceof C13747) {
                                ((C13747) abstractC8102).f45315.append(i, c9824);
                            } else {
                                c9824.m24932();
                                C13638.toString(abstractC8102);
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43127(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f60442 = view.getVisibility();
        this.f60452 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f60440 = view.getElevation();
        this.f60456 = view.getRotation();
        this.f60451 = view.getRotationX();
        this.f60441 = view.getRotationY();
        this.f60446 = view.getScaleX();
        this.f60443 = view.getScaleY();
        this.f60449 = view.getPivotX();
        this.f60454 = view.getPivotY();
        this.f60444 = view.getTranslationX();
        this.f60450 = view.getTranslationY();
        this.f60448 = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43129(C20719 c20719, C18144 c18144, int i) {
        c20719.m46630();
        c20719.m46639();
        C4032 c4032M42252 = c18144.m42252(i);
        C15323 c15323 = c4032M42252.f14904;
        C23084 c23084 = c4032M42252.f14902;
        int i2 = c15323.f49908;
        this.f60447 = i2;
        int i3 = c15323.f49910;
        this.f60442 = i3;
        this.f60452 = (i3 == 0 || i2 != 0) ? c15323.f49909 : 0.0f;
        C21672 c21672 = c4032M42252.f14907;
        boolean z = c21672.f70284;
        this.f60440 = c21672.f70289;
        this.f60456 = c21672.f70282;
        this.f60451 = c21672.f70285;
        this.f60441 = c21672.f70292;
        this.f60446 = c21672.f70281;
        this.f60443 = c21672.f70288;
        this.f60449 = c21672.f70283;
        this.f60454 = c21672.f70286;
        this.f60444 = c21672.f70293;
        this.f60450 = c21672.f70290;
        this.f60448 = c21672.f70291;
        C23188.m51213(c23084.f75003);
        this.f60453 = c23084.f75009;
        this.f60445 = c4032M42252.f14904.f49911;
        for (String str : c4032M42252.f14906.keySet()) {
            C9824 c9824 = (C9824) c4032M42252.f14906.get(str);
            if (c9824.m24927() != EnumC2061.STRING_TYPE) {
                this.f60455.put(str, c9824);
            }
        }
    }
}
