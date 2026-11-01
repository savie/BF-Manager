package l;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public class C11644 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6663 f39158 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5937 f39157 = new C5937();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f39159 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11644 m29081(InputStream inputStream) {
        return new C12350().m30711(inputStream, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11644 m29083(InputStream inputStream) {
        return new C12350().m30711(inputStream, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Picture m29085(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        C2739 c2739 = new C2739();
        c2739.f10531 = new C5562(0.0f, 0.0f, i, i2);
        new C18699(canvasBeginRecording, false).m43236(this, c2739);
        picture.endRecording();
        return picture;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29091(Canvas canvas, RectF rectF) {
        C2739 c2739 = new C2739();
        c2739.f10531 = new C5562(rectF.left, rectF.top, rectF.width(), rectF.height());
        new C18699(canvas, true).m43236(this, c2739);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29090(Canvas canvas) {
        C2739 c2739 = new C2739();
        if (c2739.f10531 == null) {
            c2739.f10531 = new C5562(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C18699(canvas, true).m43236(this, c2739);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m29084() {
        if (this.f39158 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m29079().f19074;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29097(float f) {
        C6663 c6663 = this.f39158;
        if (c6663 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c6663.f22520 = new C10502(f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m29096() {
        if (this.f39158 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m29079().f19075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29088(float f) {
        C6663 c6663 = this.f39158;
        if (c6663 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c6663.f22517 = new C10502(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29089(float f, float f2) {
        C6663 c6663 = this.f39158;
        if (c6663 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c6663.f51260 = new C5562(0.0f, 0.0f, f, f2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RectF m29095() {
        C6663 c6663 = this.f39158;
        if (c6663 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C5562 c5562 = c6663.f51260;
        if (c5562 == null) {
            return null;
        }
        return new RectF(c5562.f19077, c5562.f19076, c5562.m15347(), c5562.m15348());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6663 m29094() {
        return this.f39158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29093(C6663 c6663) {
        this.f39158 = c6663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8075 m29087(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strM29082 = m29082(str);
        if (strM29082.length() <= 1 || !strM29082.startsWith("#") || (strSubstring = strM29082.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f39158.f28299)) {
            return this.f39158;
        }
        HashMap map = this.f39159;
        if (map.containsKey(strSubstring)) {
            return (AbstractC8075) map.get(strSubstring);
        }
        AbstractC8075 abstractC8075M29080 = m29080(this.f39158, strSubstring);
        map.put(strSubstring, abstractC8075M29080);
        return abstractC8075M29080;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m29082(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C5562 m29079() {
        EnumC3135 enumC3135;
        EnumC3135 enumC3136;
        EnumC3135 enumC3137;
        EnumC3135 enumC3138;
        float fM26652;
        EnumC3135 enumC3139;
        C6663 c6663 = this.f39158;
        C10502 c10502 = c6663.f22520;
        C10502 c10503 = c6663.f22517;
        if (c10502 == null || c10502.m26657() || (enumC3135 = c10502.f35990) == (enumC3136 = EnumC3135.percent) || enumC3135 == (enumC3137 = EnumC3135.em) || enumC3135 == (enumC3138 = EnumC3135.ex)) {
            return new C5562(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM26653 = c10502.m26652(96.0f);
        if (c10503 != null) {
            if (c10503.m26657() || (enumC3139 = c10503.f35990) == enumC3136 || enumC3139 == enumC3137 || enumC3139 == enumC3138) {
                return new C5562(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM26652 = c10503.m26652(96.0f);
        } else {
            C5562 c5562 = this.f39158.f51260;
            fM26652 = c5562 != null ? (c5562.f19075 * fM26653) / c5562.f19074 : fM26653;
        }
        return new C5562(0.0f, 0.0f, fM26653, fM26652);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29092(C5937 c5937) {
        this.f39157.m16208(c5937);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m29086() {
        return this.f39157.m16207();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m29098() {
        return !this.f39157.m16210();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8075 m29080(InterfaceC17952 interfaceC17952, String str) {
        AbstractC8075 abstractC8075M29080;
        AbstractC8075 abstractC8075 = (AbstractC8075) interfaceC17952;
        if (str.equals(abstractC8075.f28299)) {
            return abstractC8075;
        }
        for (Object obj : interfaceC17952.getChildren()) {
            if (obj instanceof AbstractC8075) {
                AbstractC8075 abstractC8076 = (AbstractC8075) obj;
                if (str.equals(abstractC8076.f28299)) {
                    return abstractC8076;
                }
                if ((obj instanceof InterfaceC17952) && (abstractC8075M29080 = m29080((InterfaceC17952) obj, str)) != null) {
                    return abstractC8075M29080;
                }
            }
        }
        return null;
    }
}
