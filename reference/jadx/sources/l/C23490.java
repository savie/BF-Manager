package l;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes.dex */
public final class C23490 extends AbstractC3352 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Matrix f75950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75951;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f75952;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f75953;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f75954;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f75955;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f75956;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f75957;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f75958;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f75959;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f75960;

    public C23490(C23490 c23490, C14307 c14307) {
        AbstractC20506 c17522;
        this.f75950 = new Matrix();
        this.f75951 = new ArrayList();
        this.f75956 = 0.0f;
        this.f75959 = 0.0f;
        this.f75957 = 0.0f;
        this.f75955 = 1.0f;
        this.f75952 = 1.0f;
        this.f75954 = 0.0f;
        this.f75960 = 0.0f;
        Matrix matrix = new Matrix();
        this.f75953 = matrix;
        this.f75958 = null;
        this.f75956 = c23490.f75956;
        this.f75959 = c23490.f75959;
        this.f75957 = c23490.f75957;
        this.f75955 = c23490.f75955;
        this.f75952 = c23490.f75952;
        this.f75954 = c23490.f75954;
        this.f75960 = c23490.f75960;
        String str = c23490.f75958;
        this.f75958 = str;
        if (str != null) {
            c14307.put(str, this);
        }
        matrix.set(c23490.f75953);
        ArrayList arrayList = c23490.f75951;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C23490) {
                this.f75951.add(new C23490((C23490) obj, c14307));
            } else {
                if (!(obj instanceof C16030)) {
                    if (!(obj instanceof C17522)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c17522 = new C17522((C17522) obj);
                } else {
                    C16030 c16030 = (C16030) obj;
                    C16030 c16031 = new C16030(c16030);
                    c16031.f52005 = 0.0f;
                    c16031.f52002 = 1.0f;
                    c16031.f52007 = 1.0f;
                    c16031.f52008 = 0.0f;
                    c16031.f52006 = 1.0f;
                    c16031.f52004 = 0.0f;
                    c16031.f51999 = Paint.Cap.BUTT;
                    c16031.f52001 = Paint.Join.MITER;
                    c16031.f52009 = 4.0f;
                    c16031.f52000 = c16030.f52000;
                    c16031.f52005 = c16030.f52005;
                    c16031.f52002 = c16030.f52002;
                    c16031.f52003 = c16030.f52003;
                    c16031.f65696 = c16030.f65696;
                    c16031.f52007 = c16030.f52007;
                    c16031.f52008 = c16030.f52008;
                    c16031.f52006 = c16030.f52006;
                    c16031.f52004 = c16030.f52004;
                    c16031.f51999 = c16030.f51999;
                    c16031.f52001 = c16030.f52001;
                    c16031.f52009 = c16030.f52009;
                    c17522 = c16031;
                }
                this.f75951.add(c17522);
                Object obj2 = c17522.f65699;
                if (obj2 != null) {
                    c14307.put(obj2, c17522);
                }
            }
        }
    }

    public C23490() {
        this.f75950 = new Matrix();
        this.f75951 = new ArrayList();
        this.f75956 = 0.0f;
        this.f75959 = 0.0f;
        this.f75957 = 0.0f;
        this.f75955 = 1.0f;
        this.f75952 = 1.0f;
        this.f75954 = 0.0f;
        this.f75960 = 0.0f;
        this.f75953 = new Matrix();
        this.f75958 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m52684() {
        return this.f75958;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52683(XmlResourceParserC9734 xmlResourceParserC9734, C21246 c21246) {
        C12367 c12367M18165 = C6402.m18165(xmlResourceParserC9734, C4782.f16776, c21246);
        float fM30852 = this.f75956;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "rotation") != null) {
            fM30852 = c12367M18165.m30852(fM30852, 5);
        }
        this.f75956 = fM30852;
        this.f75959 = c12367M18165.m30852(this.f75959, 1);
        this.f75957 = c12367M18165.m30852(this.f75957, 2);
        float fM30853 = this.f75955;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            fM30853 = c12367M18165.m30852(fM30853, 3);
        }
        this.f75955 = fM30853;
        float fM30854 = this.f75952;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            fM30854 = c12367M18165.m30852(fM30854, 4);
        }
        this.f75952 = fM30854;
        float fM30855 = this.f75954;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            fM30855 = c12367M18165.m30852(fM30855, 6);
        }
        this.f75954 = fM30855;
        float fM30856 = this.f75960;
        if (xmlResourceParserC9734.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            fM30856 = c12367M18165.m30852(fM30856, 7);
        }
        this.f75960 = fM30856;
        String strM30849 = c12367M18165.m30849(0);
        if (strM30849 != null) {
            this.f75958 = strM30849;
        }
        Matrix matrix = this.f75953;
        matrix.reset();
        matrix.postTranslate(-this.f75959, -this.f75957);
        matrix.postScale(this.f75955, this.f75952);
        matrix.postRotate(this.f75956, 0.0f, 0.0f);
        matrix.postTranslate(this.f75954 + this.f75959, this.f75960 + this.f75957);
    }

    @Override // l.AbstractC3352
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11001() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f75951;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3352) arrayList.get(i)).mo11001()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC3352
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11002(int[] iArr) {
        int i = 0;
        boolean zMo11002 = false;
        while (true) {
            ArrayList arrayList = this.f75951;
            if (i >= arrayList.size()) {
                return zMo11002;
            }
            zMo11002 |= ((AbstractC3352) arrayList.get(i)).mo11002(iArr);
            i++;
        }
    }
}
