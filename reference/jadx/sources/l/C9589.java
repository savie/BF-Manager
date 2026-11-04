package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C9589 extends AbstractC0641 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31026 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31033 = -1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f31022 = Float.NaN;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f31024 = 0.0f;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f31021 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31020 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f31030 = Float.NaN;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f31025 = Float.NaN;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f31018 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f31027 = Float.NaN;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f31023 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f31034 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f31028 = Float.NaN;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f31029 = Float.NaN;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f31032 = Float.NaN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f31019 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f31031 = Float.NaN;

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2827(HashMap map) {
        throw null;
    }

    public C9589() {
        this.f2497 = new HashMap();
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2826(Context context, AttributeSet attributeSet) {
        C1387.m5087(this, context.obtainStyledAttributes(attributeSet, C1211.f4423));
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2828(HashSet hashSet) {
        if (!Float.isNaN(this.f31030)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f31025)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f31018)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f31023)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f31034)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f31028)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f31029)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f31027)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f31032)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f31019)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f31031)) {
            hashSet.add("translationZ");
        }
        if (this.f2497.size() > 0) {
            Iterator it = this.f2497.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25060(HashMap map) {
        float f;
        float f2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C15380 c15380 = (C15380) this.f2497.get(str.substring(7));
                if (c15380 != null && c15380.m36840() == EnumC19856.FLOAT_TYPE) {
                    ((AbstractC17553) map.get(str)).m41210(this.f2499, this.f31033, this.f31020, this.f31022, this.f31024, c15380.m36845(), c15380);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f31023;
                        f2 = f;
                        break;
                    case "rotationY":
                        f = this.f31034;
                        f2 = f;
                        break;
                    case "translationX":
                        f = this.f31032;
                        f2 = f;
                        break;
                    case "translationY":
                        f = this.f31019;
                        f2 = f;
                        break;
                    case "translationZ":
                        f = this.f31031;
                        f2 = f;
                        break;
                    case "progress":
                        f = this.f31021;
                        f2 = f;
                        break;
                    case "scaleX":
                        f = this.f31028;
                        f2 = f;
                        break;
                    case "scaleY":
                        f = this.f31029;
                        f2 = f;
                        break;
                    case "rotation":
                        f = this.f31018;
                        f2 = f;
                        break;
                    case "elevation":
                        f = this.f31025;
                        f2 = f;
                        break;
                    case "transitionPathRotate":
                        f = this.f31027;
                        f2 = f;
                        break;
                    case "alpha":
                        f = this.f31030;
                        f2 = f;
                        break;
                    case "waveOffset":
                        f = this.f31024;
                        f2 = f;
                        break;
                    default:
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2)) {
                    ((AbstractC17553) map.get(str)).m41209(this.f2499, this.f31033, this.f31020, this.f31022, this.f31024, f2);
                }
            }
        }
    }
}
