package l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.᩵֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19155 extends AbstractC8572 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f61875;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f61876;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Matrix f61877;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61878;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f61879;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f61880;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Matrix f61881;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f61882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f61883;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f61884;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f61885;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19155(C19155 c19155, C21445 c21445) {
        AbstractC9983 c18449;
        super(0);
        this.f61877 = new Matrix();
        this.f61878 = new ArrayList();
        this.f61884 = 0.0f;
        this.f61876 = 0.0f;
        this.f61879 = 0.0f;
        this.f61875 = 1.0f;
        this.f61882 = 1.0f;
        this.f61880 = 0.0f;
        this.f61885 = 0.0f;
        Matrix matrix = new Matrix();
        this.f61881 = matrix;
        this.f61883 = null;
        this.f61884 = c19155.f61884;
        this.f61876 = c19155.f61876;
        this.f61879 = c19155.f61879;
        this.f61875 = c19155.f61875;
        this.f61882 = c19155.f61882;
        this.f61880 = c19155.f61880;
        this.f61885 = c19155.f61885;
        String str = c19155.f61883;
        this.f61883 = str;
        if (str != null) {
            c21445.put(str, this);
        }
        matrix.set(c19155.f61881);
        ArrayList arrayList = c19155.f61878;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C19155) {
                this.f61878.add(new C19155((C19155) obj, c21445));
            } else {
                if (!(obj instanceof C7866)) {
                    if (!(obj instanceof C18449)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c18449 = new C18449((C18449) obj);
                } else {
                    C7866 c7866 = (C7866) obj;
                    C7866 c7867 = new C7866(c7866);
                    c7867.f25896 = 0.0f;
                    c7867.f25895 = 1.0f;
                    c7867.f25887 = 1.0f;
                    c7867.f25893 = 0.0f;
                    c7867.f25892 = 1.0f;
                    c7867.f25894 = 0.0f;
                    c7867.f25891 = Paint.Cap.BUTT;
                    c7867.f25888 = Paint.Join.MITER;
                    c7867.f25890 = 4.0f;
                    c7867.f25886 = c7866.f25886;
                    c7867.f25896 = c7866.f25896;
                    c7867.f25895 = c7866.f25895;
                    c7867.f25889 = c7866.f25889;
                    c7867.f34113 = c7866.f34113;
                    c7867.f25887 = c7866.f25887;
                    c7867.f25893 = c7866.f25893;
                    c7867.f25892 = c7866.f25892;
                    c7867.f25894 = c7866.f25894;
                    c7867.f25891 = c7866.f25891;
                    c7867.f25888 = c7866.f25888;
                    c7867.f25890 = c7866.f25890;
                    c18449 = c7867;
                }
                this.f61878.add(c18449);
                Object obj2 = c18449.f34114;
                if (obj2 != null) {
                    c21445.put(obj2, c18449);
                }
            }
        }
    }

    public C19155() {
        super(0);
        this.f61877 = new Matrix();
        this.f61878 = new ArrayList();
        this.f61884 = 0.0f;
        this.f61876 = 0.0f;
        this.f61879 = 0.0f;
        this.f61875 = 1.0f;
        this.f61882 = 1.0f;
        this.f61880 = 0.0f;
        this.f61885 = 0.0f;
        this.f61881 = new Matrix();
        this.f61883 = null;
    }

    public String getGroupName() {
        return this.f61883;
    }

    public Matrix getLocalMatrix() {
        return this.f61881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43968(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM30834 = C12398.m30834(resources, theme, attributeSet, C13511.f44626);
        float f = this.f61884;
        if (C12398.m30837(xmlPullParser, "rotation")) {
            f = typedArrayM30834.getFloat(5, f);
        }
        this.f61884 = f;
        this.f61876 = typedArrayM30834.getFloat(1, this.f61876);
        this.f61879 = typedArrayM30834.getFloat(2, this.f61879);
        float f2 = this.f61875;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            f2 = typedArrayM30834.getFloat(3, f2);
        }
        this.f61875 = f2;
        float f3 = this.f61882;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            f3 = typedArrayM30834.getFloat(4, f3);
        }
        this.f61882 = f3;
        float f4 = this.f61880;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            f4 = typedArrayM30834.getFloat(6, f4);
        }
        this.f61880 = f4;
        float f5 = this.f61885;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            f5 = typedArrayM30834.getFloat(7, f5);
        }
        this.f61885 = f5;
        String string = typedArrayM30834.getString(0);
        if (string != null) {
            this.f61883 = string;
        }
        m43967();
        typedArrayM30834.recycle();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43967() {
        Matrix matrix = this.f61881;
        matrix.reset();
        matrix.postTranslate(-this.f61876, -this.f61879);
        matrix.postScale(this.f61875, this.f61882);
        matrix.postRotate(this.f61884, 0.0f, 0.0f);
        matrix.postTranslate(this.f61880 + this.f61876, this.f61885 + this.f61879);
    }

    public float getRotation() {
        return this.f61884;
    }

    public void setRotation(float f) {
        if (f != this.f61884) {
            this.f61884 = f;
            m43967();
        }
    }

    public float getPivotX() {
        return this.f61876;
    }

    public void setPivotX(float f) {
        if (f != this.f61876) {
            this.f61876 = f;
            m43967();
        }
    }

    public float getPivotY() {
        return this.f61879;
    }

    public void setPivotY(float f) {
        if (f != this.f61879) {
            this.f61879 = f;
            m43967();
        }
    }

    public float getScaleX() {
        return this.f61875;
    }

    public void setScaleX(float f) {
        if (f != this.f61875) {
            this.f61875 = f;
            m43967();
        }
    }

    public float getScaleY() {
        return this.f61882;
    }

    public void setScaleY(float f) {
        if (f != this.f61882) {
            this.f61882 = f;
            m43967();
        }
    }

    public float getTranslateX() {
        return this.f61880;
    }

    public void setTranslateX(float f) {
        if (f != this.f61880) {
            this.f61880 = f;
            m43967();
        }
    }

    public float getTranslateY() {
        return this.f61885;
    }

    public void setTranslateY(float f) {
        if (f != this.f61885) {
            this.f61885 = f;
            m43967();
        }
    }

    @Override // l.AbstractC8572
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20764() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f61878;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC8572) arrayList.get(i)).mo20764()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC8572
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20765(int[] iArr) {
        int i = 0;
        boolean zMo20765 = false;
        while (true) {
            ArrayList arrayList = this.f61878;
            if (i >= arrayList.size()) {
                return zMo20765;
            }
            zMo20765 |= ((AbstractC8572) arrayList.get(i)).mo20765(iArr);
            i++;
        }
    }
}
