package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6367 extends AbstractC0641 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f21506 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f21510 = Float.NaN;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f21505 = Float.NaN;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f21499 = Float.NaN;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f21503 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f21514 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f21507 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f21508 = Float.NaN;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f21509 = Float.NaN;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f21512 = Float.NaN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f21500 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f21511 = Float.NaN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f21501 = Float.NaN;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f21513 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f21502 = Float.NaN;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f21504 = 0.0f;

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2827(HashMap map) {
        throw null;
    }

    public C6367() {
        this.f2497 = new HashMap();
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2826(Context context, AttributeSet attributeSet) {
        C12332.m30755(this, context.obtainStyledAttributes(attributeSet, C1211.f4427));
    }

    @Override // l.AbstractC0641
    /* JADX INFO: renamed from: ۙ */
    public final void mo2828(HashSet hashSet) {
        if (!Float.isNaN(this.f21510)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f21505)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f21499)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f21503)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f21514)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f21512)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f21500)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f21511)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f21507)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f21508)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f21509)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f21501)) {
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
        if (this.f21506 == -1) {
            return;
        }
        if (!Float.isNaN(this.f21510)) {
            map.put("alpha", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21505)) {
            map.put("elevation", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21499)) {
            map.put("rotation", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21503)) {
            map.put("rotationX", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21514)) {
            map.put("rotationY", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21512)) {
            map.put("translationX", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21500)) {
            map.put("translationY", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21511)) {
            map.put("translationZ", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21507)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21508)) {
            map.put("scaleX", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21508)) {
            map.put("scaleY", Integer.valueOf(this.f21506));
        }
        if (!Float.isNaN(this.f21501)) {
            map.put("progress", Integer.valueOf(this.f21506));
        }
        if (this.f2497.size() > 0) {
            Iterator it = this.f2497.keySet().iterator();
            while (it.hasNext()) {
                map.put(C25272.m56409("CUSTOM,", (String) it.next()), Integer.valueOf(this.f21506));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18109(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC11191 abstractC11191 = (AbstractC11191) map.get(str);
            if (str.startsWith("CUSTOM")) {
                C15380 c15380 = (C15380) this.f2497.get(str.substring(7));
                if (c15380 != null) {
                    C0226 c0226 = (C0226) abstractC11191;
                    int i = this.f2499;
                    float f = this.f21502;
                    int i2 = this.f21513;
                    float f2 = this.f21504;
                    c0226.f1465.append(i, c15380);
                    c0226.f1466.append(i, new float[]{f, f2});
                    c0226.f35298 = Math.max(c0226.f35298, i2);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f21503)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21503, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f21514)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21514, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f21512)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21512, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f21500)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21500, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f21511)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21511, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f21501)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21501, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f21508)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21508, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f21509)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21509, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f21499)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21499, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f21505)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21505, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f21507)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21507, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f21510)) {
                            break;
                        } else {
                            abstractC11191.mo1699(this.f21510, this.f21502, this.f21504, this.f2499, this.f21513);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
