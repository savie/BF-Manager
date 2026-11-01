package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20365 extends AbstractC9077 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65957 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f65946 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f65949 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f65948 = 0.0f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f65950 = Float.NaN;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f65955 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f65944 = Float.NaN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f65942 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f65943 = Float.NaN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f65952 = Float.NaN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f65945 = Float.NaN;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f65958 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f65951 = Float.NaN;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f65956 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f65953 = Float.NaN;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f65947 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f65954 = Float.NaN;

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11120(HashMap map) {
        throw null;
    }

    public C20365() {
        this.f30944 = new HashMap();
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11119(Context context, AttributeSet attributeSet) {
        C16132.m38187(this, context.obtainStyledAttributes(attributeSet, C16029.f51889));
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo18025(HashSet hashSet) {
        if (!Float.isNaN(this.f65944)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f65942)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f65943)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f65945)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f65958)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f65951)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f65956)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f65952)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f65953)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f65947)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f65954)) {
            hashSet.add("translationZ");
        }
        if (this.f30944.size() > 0) {
            Iterator it = this.f30944.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45980(HashMap map) {
        float f;
        float f2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C9824 c9824 = (C9824) this.f30944.get(str.substring(7));
                if (c9824 != null && c9824.m24927() == EnumC2061.FLOAT_TYPE) {
                    ((AbstractC22172) map.get(str)).m49192(this.f30946, this.f65946, this.f65955, this.f65949, this.f65948, c9824.m24932(), c9824);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f65945;
                        f2 = f;
                        break;
                    case "rotationY":
                        f = this.f65958;
                        f2 = f;
                        break;
                    case "translationX":
                        f = this.f65953;
                        f2 = f;
                        break;
                    case "translationY":
                        f = this.f65947;
                        f2 = f;
                        break;
                    case "translationZ":
                        f = this.f65954;
                        f2 = f;
                        break;
                    case "progress":
                        f = this.f65950;
                        f2 = f;
                        break;
                    case "scaleX":
                        f = this.f65951;
                        f2 = f;
                        break;
                    case "scaleY":
                        f = this.f65956;
                        f2 = f;
                        break;
                    case "rotation":
                        f = this.f65943;
                        f2 = f;
                        break;
                    case "elevation":
                        f = this.f65942;
                        f2 = f;
                        break;
                    case "transitionPathRotate":
                        f = this.f65952;
                        f2 = f;
                        break;
                    case "alpha":
                        f = this.f65944;
                        f2 = f;
                        break;
                    case "waveOffset":
                        f = this.f65948;
                        f2 = f;
                        break;
                    default:
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2)) {
                    ((AbstractC22172) map.get(str)).m49191(this.f30946, this.f65946, this.f65955, this.f65949, this.f65948, f2);
                }
            }
        }
    }
}
