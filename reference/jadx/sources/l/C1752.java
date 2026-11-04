package l;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes2.dex */
public class C1752 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC21012 f5980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3286 f5982 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8528 f5979 = new C8528();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f5981 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6190(InterfaceC21012 interfaceC21012) {
        this.f5980 = interfaceC21012;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21012 m6194() {
        return this.f5980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1752 m6176(InputStream inputStream) {
        return new C8463().m22777(inputStream, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1752 m6180(InputStream inputStream) {
        return new C8463().m22777(inputStream, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Picture m6181(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        C5350 c5350 = new C5350();
        c5350.f18786 = new C1621(0.0f, 0.0f, i, i2);
        new C3989(canvasBeginRecording, false).m12904(this, c5350);
        picture.endRecording();
        return picture;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6187(Canvas canvas, RectF rectF) {
        C5350 c5350 = new C5350();
        c5350.f18786 = new C1621(rectF.left, rectF.top, rectF.width(), rectF.height());
        new C3989(canvas, true).m12904(this, c5350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6186(Canvas canvas) {
        C5350 c5350 = new C5350();
        if (c5350.f18786 == null) {
            c5350.f18786 = new C1621(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C3989(canvas, true).m12904(this, c5350);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m6197() {
        if (this.f5982 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m6178().f5585;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6196(float f) {
        C3286 c3286 = this.f5982;
        if (c3286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c3286.f10711 = new C18028(f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m6195() {
        if (this.f5982 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m6178().f5582;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6184(float f) {
        C3286 c3286 = this.f5982;
        if (c3286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c3286.f10708 = new C18028(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6185(float f, float f2) {
        C3286 c3286 = this.f5982;
        if (c3286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c3286.f32108 = new C1621(0.0f, 0.0f, f, f2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RectF m6191() {
        C3286 c3286 = this.f5982;
        if (c3286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C1621 c1621 = c3286.f32108;
        if (c1621 == null) {
            return null;
        }
        return new RectF(c1621.f5584, c1621.f5583, c1621.m5719(), c1621.m5720());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3286 m6193() {
        return this.f5982;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6188(C3286 c3286) {
        this.f5982 = c3286;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14472 m6183(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strM6179 = m6179(str);
        if (strM6179.length() <= 1 || !strM6179.startsWith("#") || (strSubstring = strM6179.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f5982.f45545)) {
            return this.f5982;
        }
        HashMap map = this.f5981;
        if (map.containsKey(strSubstring)) {
            return (AbstractC14472) map.get(strSubstring);
        }
        AbstractC14472 abstractC14472M6177 = m6177(this.f5982, strSubstring);
        map.put(strSubstring, abstractC14472M6177);
        return abstractC14472M6177;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m6179(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C1621 m6178() {
        EnumC15175 enumC15175;
        EnumC15175 enumC15176;
        EnumC15175 enumC15177;
        EnumC15175 enumC15178;
        float fM42028;
        EnumC15175 enumC15179;
        C3286 c3286 = this.f5982;
        C18028 c18028 = c3286.f10711;
        C18028 c18029 = c3286.f10708;
        if (c18028 == null || c18028.m42034() || (enumC15175 = c18028.f59026) == (enumC15176 = EnumC15175.percent) || enumC15175 == (enumC15177 = EnumC15175.em) || enumC15175 == (enumC15178 = EnumC15175.ex)) {
            return new C1621(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM42029 = c18028.m42028(96.0f);
        if (c18029 != null) {
            if (c18029.m42034() || (enumC15179 = c18029.f59026) == enumC15176 || enumC15179 == enumC15177 || enumC15179 == enumC15178) {
                return new C1621(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM42028 = c18029.m42028(96.0f);
        } else {
            C1621 c1621 = this.f5982.f32108;
            fM42028 = c1621 != null ? (c1621.f5582 * fM42029) / c1621.f5585 : fM42029;
        }
        return new C1621(0.0f, 0.0f, fM42029, fM42028);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6189(C8528 c8528) {
        this.f5979.m22843(c8528);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m6182() {
        return this.f5979.m22841();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m6192() {
        return !this.f5979.m22844();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14472 m6177(InterfaceC24170 interfaceC24170, String str) {
        AbstractC14472 abstractC14472M6177;
        AbstractC14472 abstractC14472 = (AbstractC14472) interfaceC24170;
        if (str.equals(abstractC14472.f45545)) {
            return abstractC14472;
        }
        for (Object obj : interfaceC24170.getChildren()) {
            if (obj instanceof AbstractC14472) {
                AbstractC14472 abstractC14473 = (AbstractC14472) obj;
                if (str.equals(abstractC14473.f45545)) {
                    return abstractC14473;
                }
                if ((obj instanceof InterfaceC24170) && (abstractC14472M6177 = m6177((InterfaceC24170) obj, str)) != null) {
                    return abstractC14472M6177;
                }
            }
        }
        return null;
    }
}
