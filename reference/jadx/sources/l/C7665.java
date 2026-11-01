package l;

import android.content.Context;
import android.util.AttributeSet;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7665 extends AbstractC9077 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25354 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f25343 = Float.NaN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f25341 = Float.NaN;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f25355 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f25349 = Float.NaN;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f25353 = Float.NaN;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f25348 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f25342 = Float.NaN;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f25345 = Float.NaN;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f25350 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f25351 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f25352 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f25346 = Float.NaN;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f25347 = Float.NaN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f25344 = Float.NaN;

    public C7665() {
        this.f30944 = new HashMap();
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11119(Context context, AttributeSet attributeSet) {
        C10488.m26609(this, context.obtainStyledAttributes(attributeSet, C16029.f51877));
    }

    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo18025(HashSet hashSet) {
        if (!Float.isNaN(this.f25343)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f25341)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f25355)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f25349)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f25353)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f25348)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f25342)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f25352)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f25346)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f25347)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f25345)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f25350)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f25351)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f25344)) {
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo20250(HashMap map) {
        if (this.f25354 == -1) {
            return;
        }
        if (!Float.isNaN(this.f25343)) {
            map.put("alpha", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25341)) {
            map.put("elevation", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25355)) {
            map.put("rotation", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25349)) {
            map.put("rotationX", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25353)) {
            map.put("rotationY", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25348)) {
            map.put("transformPivotX", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25342)) {
            map.put("transformPivotY", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25352)) {
            map.put("translationX", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25346)) {
            map.put("translationY", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25347)) {
            map.put("translationZ", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25345)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25350)) {
            map.put("scaleX", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25351)) {
            map.put("scaleY", Integer.valueOf(this.f25354));
        }
        if (!Float.isNaN(this.f25344)) {
            map.put("progress", Integer.valueOf(this.f25354));
        }
        if (this.f30944.size() > 0) {
            Iterator it = this.f30944.keySet().iterator();
            while (it.hasNext()) {
                map.put(C0252.m1693("CUSTOM,", (String) it.next()), Integer.valueOf(this.f25354));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC9077
    /* JADX INFO: renamed from: ۙ */
    public final void mo11120(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC8102 abstractC8102 = (AbstractC8102) map.get(str);
            byte b = 7;
            if (str.startsWith("CUSTOM")) {
                C9824 c9824 = (C9824) this.f30944.get(str.substring(7));
                if (c9824 != null) {
                    ((C13747) abstractC8102).f45315.append(this.f30946, c9824);
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
                        if (!Float.isNaN(this.f25349)) {
                            abstractC8102.mo21317(this.f25349, this.f30946);
                        }
                        break;
                    case 1:
                        if (!Float.isNaN(this.f25353)) {
                            abstractC8102.mo21317(this.f25353, this.f30946);
                        }
                        break;
                    case 2:
                        if (!Float.isNaN(this.f25352)) {
                            abstractC8102.mo21317(this.f25352, this.f30946);
                        }
                        break;
                    case 3:
                        if (!Float.isNaN(this.f25346)) {
                            abstractC8102.mo21317(this.f25346, this.f30946);
                        }
                        break;
                    case 4:
                        if (!Float.isNaN(this.f25347)) {
                            abstractC8102.mo21317(this.f25347, this.f30946);
                        }
                        break;
                    case 5:
                        if (!Float.isNaN(this.f25344)) {
                            abstractC8102.mo21317(this.f25344, this.f30946);
                        }
                        break;
                    case 6:
                        if (!Float.isNaN(this.f25350)) {
                            abstractC8102.mo21317(this.f25350, this.f30946);
                        }
                        break;
                    case 7:
                        if (!Float.isNaN(this.f25351)) {
                            abstractC8102.mo21317(this.f25351, this.f30946);
                        }
                        break;
                    case 8:
                        if (!Float.isNaN(this.f25349)) {
                            abstractC8102.mo21317(this.f25348, this.f30946);
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.f25353)) {
                            abstractC8102.mo21317(this.f25342, this.f30946);
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.f25355)) {
                            abstractC8102.mo21317(this.f25355, this.f30946);
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.f25341)) {
                            abstractC8102.mo21317(this.f25341, this.f30946);
                        }
                        break;
                    case 12:
                        if (!Float.isNaN(this.f25345)) {
                            abstractC8102.mo21317(this.f25345, this.f30946);
                        }
                        break;
                    case 13:
                        if (!Float.isNaN(this.f25343)) {
                            abstractC8102.mo21317(this.f25343, this.f30946);
                        }
                        break;
                }
            }
        }
    }
}
