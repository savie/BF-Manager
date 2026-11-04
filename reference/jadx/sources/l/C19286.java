package l;

import android.content.Context;
import android.util.AttributeSet;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19286 extends AbstractC0641 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f62348 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f62352 = Float.NaN;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f62347 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f62355 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f62350 = Float.NaN;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f62351 = Float.NaN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f62343 = Float.NaN;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f62341 = Float.NaN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f62342 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f62349 = Float.NaN;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f62354 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f62353 = Float.NaN;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f62346 = Float.NaN;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f62344 = Float.NaN;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f62345 = Float.NaN;

    public C19286() {
        this.f2497 = new HashMap();
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2826(Context context, AttributeSet attributeSet) {
        C8099.m21980(this, context.obtainStyledAttributes(attributeSet, C1211.f4429));
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2828(HashSet hashSet) {
        if (!Float.isNaN(this.f62352)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f62347)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f62355)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f62350)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f62351)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f62343)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f62341)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f62353)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f62346)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f62344)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f62342)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f62349)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f62354)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f62345)) {
            hashSet.add("progress");
        }
        if (this.f2497.size() > 0) {
            Iterator it = this.f2497.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2829(HashMap map) {
        if (this.f62348 == -1) {
            return;
        }
        if (!Float.isNaN(this.f62352)) {
            map.put("alpha", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62347)) {
            map.put("elevation", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62355)) {
            map.put("rotation", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62350)) {
            map.put("rotationX", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62351)) {
            map.put("rotationY", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62343)) {
            map.put("transformPivotX", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62341)) {
            map.put("transformPivotY", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62353)) {
            map.put("translationX", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62346)) {
            map.put("translationY", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62344)) {
            map.put("translationZ", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62342)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62349)) {
            map.put("scaleX", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62354)) {
            map.put("scaleY", Integer.valueOf(this.f62348));
        }
        if (!Float.isNaN(this.f62345)) {
            map.put("progress", Integer.valueOf(this.f62348));
        }
        if (this.f2497.size() > 0) {
            Iterator it = this.f2497.keySet().iterator();
            while (it.hasNext()) {
                map.put(C25272.m56409("CUSTOM,", (String) it.next()), Integer.valueOf(this.f62348));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2827(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC21109 abstractC21109 = (AbstractC21109) map.get(str);
            byte b = 7;
            if (str.startsWith("CUSTOM")) {
                C15380 c15380 = (C15380) this.f2497.get(str.substring(7));
                if (c15380 != null) {
                    ((C1718) abstractC21109).f5875.append(this.f2499, c15380);
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189617:
                        if (!str.equals("scaleY")) {
                            b = -1;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = cb.k;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        if (!Float.isNaN(this.f62350)) {
                            abstractC21109.mo6084(this.f62350, this.f2499);
                        }
                        break;
                    case 1:
                        if (!Float.isNaN(this.f62351)) {
                            abstractC21109.mo6084(this.f62351, this.f2499);
                        }
                        break;
                    case 2:
                        if (!Float.isNaN(this.f62353)) {
                            abstractC21109.mo6084(this.f62353, this.f2499);
                        }
                        break;
                    case 3:
                        if (!Float.isNaN(this.f62346)) {
                            abstractC21109.mo6084(this.f62346, this.f2499);
                        }
                        break;
                    case 4:
                        if (!Float.isNaN(this.f62344)) {
                            abstractC21109.mo6084(this.f62344, this.f2499);
                        }
                        break;
                    case 5:
                        if (!Float.isNaN(this.f62345)) {
                            abstractC21109.mo6084(this.f62345, this.f2499);
                        }
                        break;
                    case 6:
                        if (!Float.isNaN(this.f62349)) {
                            abstractC21109.mo6084(this.f62349, this.f2499);
                        }
                        break;
                    case 7:
                        if (!Float.isNaN(this.f62354)) {
                            abstractC21109.mo6084(this.f62354, this.f2499);
                        }
                        break;
                    case 8:
                        if (!Float.isNaN(this.f62350)) {
                            abstractC21109.mo6084(this.f62343, this.f2499);
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.f62351)) {
                            abstractC21109.mo6084(this.f62341, this.f2499);
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.f62355)) {
                            abstractC21109.mo6084(this.f62355, this.f2499);
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.f62347)) {
                            abstractC21109.mo6084(this.f62347, this.f2499);
                        }
                        break;
                    case 12:
                        if (!Float.isNaN(this.f62342)) {
                            abstractC21109.mo6084(this.f62342, this.f2499);
                        }
                        break;
                    case 13:
                        if (!Float.isNaN(this.f62352)) {
                            abstractC21109.mo6084(this.f62352, this.f2499);
                        }
                        break;
                }
            }
        }
    }
}
