package l;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8412 extends AbstractC19701 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f29160;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f29161;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Matrix f29162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29163;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f29164;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f29165;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Matrix f29166;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f29167;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f29168;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f29169;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f29170;

    public C8412(C8412 c8412, C21445 c21445) {
        AbstractC9118 c18289;
        this.f29162 = new Matrix();
        this.f29163 = new ArrayList();
        this.f29169 = 0.0f;
        this.f29161 = 0.0f;
        this.f29164 = 0.0f;
        this.f29160 = 1.0f;
        this.f29167 = 1.0f;
        this.f29165 = 0.0f;
        this.f29170 = 0.0f;
        Matrix matrix = new Matrix();
        this.f29166 = matrix;
        this.f29168 = null;
        this.f29169 = c8412.f29169;
        this.f29161 = c8412.f29161;
        this.f29164 = c8412.f29164;
        this.f29160 = c8412.f29160;
        this.f29167 = c8412.f29167;
        this.f29165 = c8412.f29165;
        this.f29170 = c8412.f29170;
        String str = c8412.f29168;
        this.f29168 = str;
        if (str != null) {
            c21445.put(str, this);
        }
        matrix.set(c8412.f29166);
        ArrayList arrayList = c8412.f29163;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C8412) {
                this.f29163.add(new C8412((C8412) obj, c21445));
            } else {
                if (!(obj instanceof C18995)) {
                    if (!(obj instanceof C18289)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c18289 = new C18289((C18289) obj);
                } else {
                    C18995 c18995 = (C18995) obj;
                    C18995 c18996 = new C18995(c18995);
                    c18996.f61481 = 0.0f;
                    c18996.f61476 = 1.0f;
                    c18996.f61478 = 1.0f;
                    c18996.f61483 = 0.0f;
                    c18996.f61484 = 1.0f;
                    c18996.f61482 = 0.0f;
                    c18996.f61477 = Paint.Cap.BUTT;
                    c18996.f61479 = Paint.Join.MITER;
                    c18996.f61486 = 4.0f;
                    c18996.f61480 = c18995.f61480;
                    c18996.f61481 = c18995.f61481;
                    c18996.f61476 = c18995.f61476;
                    c18996.f61485 = c18995.f61485;
                    c18996.f31053 = c18995.f31053;
                    c18996.f61478 = c18995.f61478;
                    c18996.f61483 = c18995.f61483;
                    c18996.f61484 = c18995.f61484;
                    c18996.f61482 = c18995.f61482;
                    c18996.f61477 = c18995.f61477;
                    c18996.f61479 = c18995.f61479;
                    c18996.f61486 = c18995.f61486;
                    c18289 = c18996;
                }
                this.f29163.add(c18289);
                Object obj2 = c18289.f31052;
                if (obj2 != null) {
                    c21445.put(obj2, c18289);
                }
            }
        }
    }

    public C8412() {
        this.f29162 = new Matrix();
        this.f29163 = new ArrayList();
        this.f29169 = 0.0f;
        this.f29161 = 0.0f;
        this.f29164 = 0.0f;
        this.f29160 = 1.0f;
        this.f29167 = 1.0f;
        this.f29165 = 0.0f;
        this.f29170 = 0.0f;
        this.f29166 = new Matrix();
        this.f29168 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m22045() {
        return this.f29168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22042(XmlResourceParserC11068 xmlResourceParserC11068, C6037 c6037) {
        C21027 c21027M38116 = C16089.m38116(xmlResourceParserC11068, C21271.f69265, c6037);
        float fM47397 = this.f29169;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "rotation") != null) {
            fM47397 = c21027M38116.m47397(fM47397, 5);
        }
        this.f29169 = fM47397;
        this.f29161 = c21027M38116.m47397(this.f29161, 1);
        this.f29164 = c21027M38116.m47397(this.f29164, 2);
        float fM47398 = this.f29160;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            fM47398 = c21027M38116.m47397(fM47398, 3);
        }
        this.f29160 = fM47398;
        float fM47399 = this.f29167;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            fM47399 = c21027M38116.m47397(fM47399, 4);
        }
        this.f29167 = fM47399;
        float fM473910 = this.f29165;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            fM473910 = c21027M38116.m47397(fM473910, 6);
        }
        this.f29165 = fM473910;
        float fM473911 = this.f29170;
        if (xmlResourceParserC11068.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            fM473911 = c21027M38116.m47397(fM473911, 7);
        }
        this.f29170 = fM473911;
        String strM47394 = c21027M38116.m47394(0);
        if (strM47394 != null) {
            this.f29168 = strM47394;
        }
        Matrix matrix = this.f29166;
        matrix.reset();
        matrix.postTranslate(-this.f29161, -this.f29164);
        matrix.postScale(this.f29160, this.f29167);
        matrix.postRotate(this.f29169, 0.0f, 0.0f);
        matrix.postTranslate(this.f29165 + this.f29161, this.f29170 + this.f29164);
    }

    @Override // l.AbstractC19701
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22043() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f29163;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC19701) arrayList.get(i)).mo22043()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC19701
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22044(int[] iArr) {
        int i = 0;
        boolean zMo22044 = false;
        while (true) {
            ArrayList arrayList = this.f29163;
            if (i >= arrayList.size()) {
                return zMo22044;
            }
            zMo22044 |= ((AbstractC19701) arrayList.get(i)).mo22044(iArr);
            i++;
        }
    }
}
