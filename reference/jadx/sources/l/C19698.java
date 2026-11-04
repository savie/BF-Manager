package l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ᩴ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19698 extends AbstractC15222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Matrix f63423;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63424;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f63425;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f63426;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f63427;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f63428;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f63429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f63430;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f63431;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f63432;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f63433;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19698(C19698 c19698, C14307 c14307) {
        AbstractC12985 c10747;
        super(0);
        this.f63423 = new Matrix();
        this.f63424 = new ArrayList();
        this.f63429 = 0.0f;
        this.f63432 = 0.0f;
        this.f63430 = 0.0f;
        this.f63428 = 1.0f;
        this.f63425 = 1.0f;
        this.f63427 = 0.0f;
        this.f63433 = 0.0f;
        Matrix matrix = new Matrix();
        this.f63426 = matrix;
        this.f63431 = null;
        this.f63429 = c19698.f63429;
        this.f63432 = c19698.f63432;
        this.f63430 = c19698.f63430;
        this.f63428 = c19698.f63428;
        this.f63425 = c19698.f63425;
        this.f63427 = c19698.f63427;
        this.f63433 = c19698.f63433;
        String str = c19698.f63431;
        this.f63431 = str;
        if (str != null) {
            c14307.put(str, this);
        }
        matrix.set(c19698.f63426);
        ArrayList arrayList = c19698.f63424;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C19698) {
                this.f63424.add(new C19698((C19698) obj, c14307));
            } else {
                if (!(obj instanceof C22682)) {
                    if (!(obj instanceof C10747)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c10747 = new C10747((C10747) obj);
                } else {
                    C22682 c22682 = (C22682) obj;
                    C22682 c22683 = new C22682(c22682);
                    c22683.f73657 = 0.0f;
                    c22683.f73651 = 1.0f;
                    c22683.f73656 = 1.0f;
                    c22683.f73652 = 0.0f;
                    c22683.f73653 = 1.0f;
                    c22683.f73654 = 0.0f;
                    c22683.f73648 = Paint.Cap.BUTT;
                    c22683.f73647 = Paint.Join.MITER;
                    c22683.f73649 = 4.0f;
                    c22683.f73650 = c22682.f73650;
                    c22683.f73657 = c22682.f73657;
                    c22683.f73651 = c22682.f73651;
                    c22683.f73655 = c22682.f73655;
                    c22683.f41617 = c22682.f41617;
                    c22683.f73656 = c22682.f73656;
                    c22683.f73652 = c22682.f73652;
                    c22683.f73653 = c22682.f73653;
                    c22683.f73654 = c22682.f73654;
                    c22683.f73648 = c22682.f73648;
                    c22683.f73647 = c22682.f73647;
                    c22683.f73649 = c22682.f73649;
                    c10747 = c22683;
                }
                this.f63424.add(c10747);
                Object obj2 = c10747.f41618;
                if (obj2 != null) {
                    c14307.put(obj2, c10747);
                }
            }
        }
    }

    public C19698() {
        super(0);
        this.f63423 = new Matrix();
        this.f63424 = new ArrayList();
        this.f63429 = 0.0f;
        this.f63432 = 0.0f;
        this.f63430 = 0.0f;
        this.f63428 = 1.0f;
        this.f63425 = 1.0f;
        this.f63427 = 0.0f;
        this.f63433 = 0.0f;
        this.f63426 = new Matrix();
        this.f63431 = null;
    }

    public String getGroupName() {
        return this.f63431;
    }

    public Matrix getLocalMatrix() {
        return this.f63426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45395(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM8387 = C2506.m8387(resources, theme, attributeSet, C18032.f59036);
        float f = this.f63429;
        if (C2506.m8390(xmlPullParser, "rotation")) {
            f = typedArrayM8387.getFloat(5, f);
        }
        this.f63429 = f;
        this.f63432 = typedArrayM8387.getFloat(1, this.f63432);
        this.f63430 = typedArrayM8387.getFloat(2, this.f63430);
        float f2 = this.f63428;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            f2 = typedArrayM8387.getFloat(3, f2);
        }
        this.f63428 = f2;
        float f3 = this.f63425;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            f3 = typedArrayM8387.getFloat(4, f3);
        }
        this.f63425 = f3;
        float f4 = this.f63427;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            f4 = typedArrayM8387.getFloat(6, f4);
        }
        this.f63427 = f4;
        float f5 = this.f63433;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            f5 = typedArrayM8387.getFloat(7, f5);
        }
        this.f63433 = f5;
        String string = typedArrayM8387.getString(0);
        if (string != null) {
            this.f63431 = string;
        }
        m45394();
        typedArrayM8387.recycle();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45394() {
        Matrix matrix = this.f63426;
        matrix.reset();
        matrix.postTranslate(-this.f63432, -this.f63430);
        matrix.postScale(this.f63428, this.f63425);
        matrix.postRotate(this.f63429, 0.0f, 0.0f);
        matrix.postTranslate(this.f63427 + this.f63432, this.f63433 + this.f63430);
    }

    public float getRotation() {
        return this.f63429;
    }

    public void setRotation(float f) {
        if (f != this.f63429) {
            this.f63429 = f;
            m45394();
        }
    }

    public float getPivotX() {
        return this.f63432;
    }

    public void setPivotX(float f) {
        if (f != this.f63432) {
            this.f63432 = f;
            m45394();
        }
    }

    public float getPivotY() {
        return this.f63430;
    }

    public void setPivotY(float f) {
        if (f != this.f63430) {
            this.f63430 = f;
            m45394();
        }
    }

    public float getScaleX() {
        return this.f63428;
    }

    public void setScaleX(float f) {
        if (f != this.f63428) {
            this.f63428 = f;
            m45394();
        }
    }

    public float getScaleY() {
        return this.f63425;
    }

    public void setScaleY(float f) {
        if (f != this.f63425) {
            this.f63425 = f;
            m45394();
        }
    }

    public float getTranslateX() {
        return this.f63427;
    }

    public void setTranslateX(float f) {
        if (f != this.f63427) {
            this.f63427 = f;
            m45394();
        }
    }

    public float getTranslateY() {
        return this.f63433;
    }

    public void setTranslateY(float f) {
        if (f != this.f63433) {
            this.f63433 = f;
            m45394();
        }
    }

    @Override // l.AbstractC15222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo36573() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f63424;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC15222) arrayList.get(i)).mo36573()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC15222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo36574(int[] iArr) {
        int i = 0;
        boolean zMo36574 = false;
        while (true) {
            ArrayList arrayList = this.f63424;
            if (i >= arrayList.size()) {
                return zMo36574;
            }
            zMo36574 |= ((AbstractC15222) arrayList.get(i)).mo36574(iArr);
            i++;
        }
    }
}
