package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15117 extends AbstractC9077 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49383 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f49371 = Float.NaN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f49369 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f49370 = Float.NaN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f49372 = Float.NaN;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f49384 = Float.NaN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f49379 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f49378 = Float.NaN;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f49382 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f49380 = Float.NaN;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f49374 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f49381 = Float.NaN;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f49377 = Float.NaN;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f49373 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f49376 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f49375 = 0.0f;

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11120(HashMap map) {
        throw null;
    }

    public C15117() {
        this.f30944 = new HashMap();
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11119(Context context, AttributeSet attributeSet) {
        C22878.m50643(this, context.obtainStyledAttributes(attributeSet, C16029.f51882));
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo18025(HashSet hashSet) {
        if (!Float.isNaN(this.f49371)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f49369)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f49370)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f49372)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f49384)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f49380)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f49374)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f49381)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f49379)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f49378)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f49382)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f49377)) {
            hashSet.add("progress");
        }
        if (this.f30944.size() > 0) {
            Iterator it = this.f30944.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ܰ */
    public final void mo20250(HashMap map) {
        if (this.f49383 == -1) {
            return;
        }
        if (!Float.isNaN(this.f49371)) {
            map.put("alpha", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49369)) {
            map.put("elevation", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49370)) {
            map.put("rotation", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49372)) {
            map.put("rotationX", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49384)) {
            map.put("rotationY", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49380)) {
            map.put("translationX", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49374)) {
            map.put("translationY", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49381)) {
            map.put("translationZ", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49379)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49378)) {
            map.put("scaleX", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49378)) {
            map.put("scaleY", Integer.valueOf(this.f49383));
        }
        if (!Float.isNaN(this.f49377)) {
            map.put("progress", Integer.valueOf(this.f49383));
        }
        if (this.f30944.size() > 0) {
            Iterator it = this.f30944.keySet().iterator();
            while (it.hasNext()) {
                map.put(C0252.m1693("CUSTOM,", (String) it.next()), Integer.valueOf(this.f49383));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36240(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC23625 abstractC23625 = (AbstractC23625) map.get(str);
            if (str.startsWith("CUSTOM")) {
                C9824 c9824 = (C9824) this.f30944.get(str.substring(7));
                if (c9824 != null) {
                    C8808 c8808 = (C8808) abstractC23625;
                    int i = this.f30946;
                    float f = this.f49376;
                    int i2 = this.f49373;
                    float f2 = this.f49375;
                    c8808.f30292.append(i, c9824);
                    c8808.f30291.append(i, new float[]{f, f2});
                    c8808.f76538 = Math.max(c8808.f76538, i2);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f49372)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49372, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f49384)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49384, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f49380)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49380, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f49374)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49374, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f49381)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49381, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f49377)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49377, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f49378)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49378, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f49382)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49382, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f49370)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49370, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f49369)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49369, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f49379)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49379, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f49371)) {
                            break;
                        } else {
                            abstractC23625.mo22925(this.f49371, this.f49376, this.f49375, this.f30946, this.f49373);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
