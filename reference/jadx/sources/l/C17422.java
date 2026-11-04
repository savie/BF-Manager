package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.chip.Chip;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: J204 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17422 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56642;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Shader f56643;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ColorStateList f56644;

    public C17422(Shader shader, ColorStateList colorStateList, int i) {
        this.f56643 = shader;
        this.f56644 = colorStateList;
        this.f56642 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17422 m40899(int i) {
        return new C17422(null, null, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Shader m40906() {
        return this.f56643;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40901() {
        return this.f56642;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40902(int i) {
        this.f56642 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m40904() {
        return this.f56643 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m40907() {
        ColorStateList colorStateList;
        return this.f56643 == null && (colorStateList = this.f56644) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40903(int[] iArr) {
        if (!m40907()) {
            return false;
        }
        ColorStateList colorStateList = this.f56644;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f56642) {
            return false;
        }
        this.f56642 = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m40905() {
        return m40904() || this.f56642 != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17422 m40900(Resources resources, int i, Resources.Theme theme) {
        try {
            return m40898(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17422 m40898(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        Resources resources2 = resources;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM39395 = C16676.m39395(resources2, xml, attributeSetAsAttributeSet, theme);
                return new C17422(null, colorStateListM39395, colorStateListM39395.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM8387 = C2506.m8387(resources2, theme, attributeSetAsAttributeSet, C16324.f52996);
        float f3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startX") != null ? typedArrayM8387.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startY") != null ? typedArrayM8387.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endX") != null ? typedArrayM8387.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endY") != null ? typedArrayM8387.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerX") != null ? typedArrayM8387.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerY") != null ? typedArrayM8387.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "type") != null ? typedArrayM8387.getInt(2, 0) : 0;
        int color = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startColor") != null ? typedArrayM8387.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null;
        int color2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null ? typedArrayM8387.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endColor") != null ? typedArrayM8387.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "tileMode") != null ? typedArrayM8387.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "gradientRadius") != null ? typedArrayM8387.getFloat(5, 0.0f) : 0.0f;
        typedArrayM8387.recycle();
        int depth = xml.getDepth() + 1;
        float f10 = f9;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f6;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM8388 = C2506.m8387(resources2, theme, attributeSetAsAttributeSet, C16324.f52994);
                boolean zHasValue = typedArrayM8388.hasValue(0);
                boolean zHasValue2 = typedArrayM8388.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM8388.getColor(0, 0);
                float f12 = typedArrayM8388.getFloat(1, 0.0f);
                typedArrayM8388.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            resources2 = resources;
            f5 = f;
            f4 = f2;
        }
        C24136 c24136 = arrayList2.size() > 0 ? new C24136(arrayList2, arrayList) : null;
        if (c24136 == null) {
            c24136 = z ? new C24136(color, color2, color3) : new C24136(color, color3);
        }
        if (i2 == 1) {
            float f13 = f8;
            float f14 = f7;
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = c24136.f78139;
            float[] fArr = c24136.f78140;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f14, f13, f10, iArr, fArr, tileMode);
        } else if (i2 != 2) {
            int[] iArr2 = c24136.f78139;
            float[] fArr2 = c24136.f78140;
            if (i3 != 1) {
                tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            radialGradient = new LinearGradient(f3, f2, f, f11, iArr2, fArr2, tileMode2);
        } else {
            radialGradient = new SweepGradient(f7, f8, c24136.f78139, c24136.f78140);
        }
        return new C17422(radialGradient, null, 0);
    }
}
