package l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ᩴۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18699 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static HashSet f60661;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11644 f60662;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Stack f60664;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Canvas f60666;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Stack f60667;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Stack f60671;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f60672;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22933 f60673;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Matrix f60668 = new Matrix();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Matrix f60670 = new Matrix();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float[] f60663 = new float[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5562 f60665 = new C5562(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f60669 = 96.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43185(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public C18699(Canvas canvas, boolean z) {
        this.f60666 = canvas;
        this.f60672 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m43234() {
        return this.f60669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m43235() {
        return this.f60673.f74547.getTextSize();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m43238() {
        return this.f60673.f74547.getTextSize() / 2.0f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5562 m43237() {
        C22933 c22933 = this.f60673;
        C5562 c5562 = c22933.f74545;
        return c5562 != null ? c5562 : c22933.f74550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43236(C11644 c11644, C2739 c2739) {
        this.f60662 = c11644;
        C6663 c6663M29094 = c11644.m29094();
        if (c6663M29094 == null) {
            return;
        }
        C5562 c5562 = c6663M29094.f51260;
        C11913 c11913 = c6663M29094.f24454;
        this.f60673 = new C22933();
        this.f60671 = new Stack();
        m43217(this.f60673, C3840.m11167());
        C22933 c22933 = this.f60673;
        c22933.f74550 = null;
        c22933.f74546 = false;
        this.f60671.push(new C22933(c22933));
        this.f60664 = new Stack();
        this.f60667 = new Stack();
        Boolean bool = c6663M29094.f28301;
        if (bool != null) {
            this.f60673.f74546 = bool.booleanValue();
        }
        m43223();
        C5562 c5563 = new C5562(c2739.f10531);
        C10502 c10502 = c6663M29094.f22520;
        if (c10502 != null) {
            c5563.f19074 = c10502.m26654(this, c5563.f19074);
        }
        C10502 c10503 = c6663M29094.f22517;
        if (c10503 != null) {
            c5563.f19075 = c10503.m26654(this, c5563.f19075);
        }
        m43203(c6663M29094, c5563, c5562, c11913);
        m43183();
    }

    /* JADX WARN: Code duplicated, block: B:306:0x059e A[EDGE_INSN: B:306:0x059e->B:310:0x05b1 BREAK  A[LOOP:1: B:254:0x0494->B:260:0x04a5]] */
    /* JADX WARN: Code duplicated, block: B:309:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:376:0x0697 A[PHI: r14
      0x0697: PHI (r14v9 ??) = (r14v1 ??), (r14v2 ??), (r14v3 ??), (r14v4 ??), (r14v5 ??), (r14v6 ??), (r14v7 ??), (r14v8 ??), (r14v11 ??) binds: [B:548:0x093e, B:501:0x086e, B:467:0x07f7, B:439:0x0794, B:403:0x06ff, B:375:0x0695, B:351:0x063d, B:323:0x05d8, B:204:0x03de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ᩴۤܶ] */
    /* JADX WARN: Type inference failed for: r14v1, types: [l.۠ۡܶ, l.ۧۡܶ, l.ܳۡܶ, l.ܿۡܶ, l.ᩴۡܶ] */
    /* JADX WARN: Type inference failed for: r14v11, types: [l.۟ۡܶ, l.۠ۡܶ, l.ۡ᩵ܶ, l.ᩴۡܶ] */
    /* JADX WARN: Type inference failed for: r14v2, types: [l.۠ۡܶ, l.ۧ᩵ܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.۠ۡܶ, l.ۧ᩵ܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ, l.᩻᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l.۟᩵ܶ, l.۠ۡܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v5, types: [l.۠ۡܶ, l.ܶ᩵ܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v6, types: [l.֨᩵ܶ, l.۠ۡܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v7, types: [l.۠ۡܶ, l.ܳ᩵ܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v8, types: [l.۠ۡܶ, l.ܽ᩵ܶ, l.ᩴۡܶ, l.ᩴ᩵ܶ] */
    /* JADX WARN: Type inference failed for: r14v9, types: [l.ᩴۡܶ] */
    /* JADX WARN: Type inference failed for: r4v25, types: [l.ۡۡܶ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43204(C8781 c8781) {
        ?? r14;
        RectF rectF;
        C10502 c10502;
        String str;
        int iIndexOf;
        Set setMo36273;
        C10502 c10503;
        AbstractC8075 abstractC8075M29087;
        Boolean bool;
        if (c8781 instanceof InterfaceC20379) {
            return;
        }
        m43223();
        if ((c8781 instanceof AbstractC8075) && (bool = ((AbstractC8075) c8781).f28301) != null) {
            this.f60673.f74546 = bool.booleanValue();
        }
        if (c8781 instanceof C6663) {
            C6663 c6663 = (C6663) c8781;
            m43203(c6663, m43197(c6663.f22518, c6663.f22519, c6663.f22520, c6663.f22517), c6663.f51260, c6663.f24454);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            boolean zM43226 = true;
            float fM26656 = 0.0f;
            if (c8781 instanceof C4587) {
                C4587 c4587 = (C4587) c8781;
                Canvas canvas = this.f60666;
                C10502 c10504 = c4587.f16249;
                if ((c10504 == null || !c10504.m26657()) && ((c10503 = c4587.f16248) == null || !c10503.m26657())) {
                    m43218(this.f60673, c4587);
                    if (m43222() && (abstractC8075M29087 = c4587.f30200.m29087(c4587.f16245)) != null) {
                        Matrix matrix = c4587.f29124;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        C10502 c10505 = c4587.f16246;
                        float fM26658 = c10505 != null ? c10505.m26658(this) : 0.0f;
                        C10502 c10506 = c4587.f16247;
                        canvas.translate(fM26658, c10506 != null ? c10506.m26656(this) : 0.0f);
                        m43230(c4587, c4587.f60583);
                        boolean zM43227 = m43226();
                        m43210(c4587);
                        if (abstractC8075M29087 instanceof C6663) {
                            C6663 c6664 = (C6663) abstractC8075M29087;
                            C5562 c5562M43197 = m43197(null, null, c4587.f16249, c4587.f16248);
                            m43223();
                            m43203(c6664, c5562M43197, c6664.f51260, c6664.f24454);
                            m43183();
                        } else if (abstractC8075M29087 instanceof C0313) {
                            C10502 c10507 = c4587.f16249;
                            if (c10507 == null) {
                                c10507 = new C10502(100.0f, EnumC3135.percent);
                            }
                            C10502 c10508 = c4587.f16248;
                            if (c10508 == null) {
                                c10508 = new C10502(100.0f, EnumC3135.percent);
                            }
                            C5562 c5562M43198 = m43197(null, null, c10507, c10508);
                            m43223();
                            C0313 c0313 = (C0313) abstractC8075M29087;
                            if (c5562M43198.f19074 != 0.0f && c5562M43198.f19075 != 0.0f) {
                                C11913 c11913 = c0313.f24454;
                                if (c11913 == null) {
                                    c11913 = C11913.f40002;
                                }
                                m43218(this.f60673, c0313);
                                C22933 c22933 = this.f60673;
                                c22933.f74550 = c5562M43198;
                                if (!c22933.f74552.f14325.booleanValue()) {
                                    C5562 c5562 = this.f60673.f74550;
                                    m43199(c5562.f19077, c5562.f19076, c5562.f19074, c5562.f19075);
                                }
                                C5562 c5563 = c0313.f51260;
                                if (c5563 != null) {
                                    canvas.concat(m43188(this.f60673.f74550, c5563, c11913));
                                    this.f60673.f74545 = c0313.f51260;
                                } else {
                                    C5562 c5564 = this.f60673.f74550;
                                    canvas.translate(c5564.f19077, c5564.f19076);
                                }
                                boolean zM43228 = m43226();
                                m43208(c0313, true);
                                if (zM43228) {
                                    m43201(c0313.f60583);
                                }
                                m43224(c0313);
                            }
                            m43183();
                        } else {
                            m43204(abstractC8075M29087);
                        }
                        this.f60667.pop();
                        this.f60664.pop();
                        if (zM43227) {
                            m43201(c4587.f60583);
                        }
                        m43224(c4587);
                    }
                }
            } else if (c8781 instanceof C20070) {
                C20070 c20070 = (C20070) c8781;
                m43218(this.f60673, c20070);
                if (m43222()) {
                    Matrix matrix2 = c20070.f29124;
                    if (matrix2 != null) {
                        this.f60666.concat(matrix2);
                    }
                    m43230(c20070, c20070.f60583);
                    boolean zM43229 = m43226();
                    String language = Locale.getDefault().getLanguage();
                    for (?? r4 : c20070.f49442) {
                        if (r4 instanceof InterfaceC22892) {
                            InterfaceC22892 interfaceC22892 = (InterfaceC22892) r4;
                            if (interfaceC22892.mo36278() == null && ((setMo36273 = interfaceC22892.mo36273()) == null || (!setMo36273.isEmpty() && setMo36273.contains(language)))) {
                                Set setMo36271 = interfaceC22892.mo36271();
                                if (setMo36271 != null) {
                                    if (f60661 == null) {
                                        synchronized (C18699.class) {
                                            HashSet hashSet = new HashSet();
                                            f60661 = hashSet;
                                            hashSet.add("Structure");
                                            f60661.add("BasicStructure");
                                            f60661.add("ConditionalProcessing");
                                            f60661.add("Image");
                                            f60661.add("Style");
                                            f60661.add("ViewportAttribute");
                                            f60661.add("Shape");
                                            f60661.add("BasicText");
                                            f60661.add("PaintAttribute");
                                            f60661.add("BasicPaintAttribute");
                                            f60661.add("OpacityAttribute");
                                            f60661.add("BasicGraphicsAttribute");
                                            f60661.add("Marker");
                                            f60661.add("Gradient");
                                            f60661.add("Pattern");
                                            f60661.add("Clip");
                                            f60661.add("BasicClip");
                                            f60661.add("Mask");
                                            f60661.add("View");
                                        }
                                    }
                                    if (setMo36271.isEmpty() || !f60661.containsAll(setMo36271)) {
                                    }
                                }
                                Set setMo36276 = interfaceC22892.mo36276();
                                if (setMo36276 == null) {
                                    Set setMo36280 = interfaceC22892.mo36280();
                                    if (setMo36280 == null) {
                                        m43204(r4);
                                        break;
                                    }
                                    setMo36280.isEmpty();
                                } else {
                                    setMo36276.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM43229) {
                        m43201(c20070.f60583);
                    }
                    m43224(c20070);
                }
            } else if (c8781 instanceof C8385) {
                C8385 c8385 = (C8385) c8781;
                m43218(this.f60673, c8385);
                if (m43222()) {
                    Matrix matrix3 = c8385.f29124;
                    if (matrix3 != null) {
                        this.f60666.concat(matrix3);
                    }
                    m43230(c8385, c8385.f60583);
                    boolean zM432210 = m43226();
                    m43208(c8385, true);
                    if (zM432210) {
                        m43201(c8385.f60583);
                    }
                    m43224(c8385);
                }
            } else if (c8781 instanceof C9091) {
                r14 = (C9091) c8781;
                Canvas canvas2 = this.f60666;
                C10502 c10509 = r14.f31000;
                if (c10509 != null && !c10509.m26657() && (c10502 = r14.f31002) != null && !c10502.m26657() && (str = r14.f30999) != null) {
                    C11913 c11914 = r14.f24454;
                    if (c11914 == null) {
                        c11914 = C11913.f40002;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C5562 c5565 = new C5562(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        m43218(this.f60673, r14);
                        if (m43222() && m43231()) {
                            Matrix matrix4 = r14.f31003;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C10502 c105010 = r14.f31001;
                            float fM26659 = c105010 != null ? c105010.m26658(this) : 0.0f;
                            C10502 c105011 = r14.f30998;
                            float fM26657 = c105011 != null ? c105011.m26656(this) : 0.0f;
                            float fM266510 = r14.f31000.m26658(this);
                            float fM266511 = r14.f31002.m26658(this);
                            C22933 c22934 = this.f60673;
                            c22934.f74550 = new C5562(fM26659, fM26657, fM266510, fM266511);
                            if (!c22934.f74552.f14325.booleanValue()) {
                                C5562 c5566 = this.f60673.f74550;
                                m43199(c5566.f19077, c5566.f19076, c5566.f19074, c5566.f19075);
                            }
                            r14.f60583 = this.f60673.f74550;
                            m43224(r14);
                            m43230(r14, r14.f60583);
                            boolean zM432211 = m43226();
                            m43233();
                            canvas2.save();
                            canvas2.concat(m43188(this.f60673.f74550, c5565, c11914));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f60673.f74552.f14330 == EnumC2429.optimizeSpeed ? 0 : 2));
                            canvas2.restore();
                            if (zM432211) {
                                m43201(r14.f60583);
                            }
                        }
                    }
                }
            } else if (c8781 instanceof C16851) {
                r14 = (C16851) c8781;
                Canvas canvas3 = this.f60666;
                if (r14.f53918 != null) {
                    m43218(this.f60673, r14);
                    if (m43222() && m43231()) {
                        C22933 c22935 = this.f60673;
                        if (c22935.f74549 || c22935.f74551) {
                            Matrix matrix5 = r14.f61420;
                            if (matrix5 != null) {
                                canvas3.concat(matrix5);
                            }
                            Path path = new C1059(r14.f53918).f4909;
                            if (r14.f60583 == null) {
                                r14.f60583 = m43196(path);
                            }
                            m43224(r14);
                            m43211(r14);
                            m43230(r14, r14.f60583);
                            C5562 c5567 = r14.f60583;
                            if (this.f60673.f74552.f14359.floatValue() >= 1.0f && this.f60673.f74552.f14331 == null) {
                                zM43226 = false;
                            } else if (this.f60672 && !canvas3.isHardwareAccelerated()) {
                                C3840 c3840 = this.f60673.f74552;
                                if (c3840.f14331 == null && c3840.f14327 == null && c3840.f14340 == null && c3840.f14344 == null && !(c3840.f14332 instanceof C0622) && !(c3840.f14358 instanceof C0622) && c3840.f14356 != EnumC13014.NonScalingStroke) {
                                    float[] fArr = new float[9];
                                    canvas3.getMatrix().getValues(fArr);
                                    int i = 0;
                                    while (true) {
                                        if (i >= 9) {
                                            if (fArr[1] != 0.0f || fArr[3] != 0.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 1.0f) {
                                                zM43226 = m43226();
                                                break;
                                            }
                                            float fAbs = Math.abs(fArr[0]);
                                            float fAbs2 = Math.abs(fArr[4]);
                                            if (fAbs != 0.0f && fAbs2 != 0.0f) {
                                                C22933 c22936 = this.f60673;
                                                if (!c22936.f74549) {
                                                    c5567.getClass();
                                                    rectF = new RectF(c5567.f19077, c5567.f19076, c5567.m15347(), c5567.m15348());
                                                    float f = -fM26656;
                                                    rectF.inset(f - (2.0f / fAbs), f - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left)) {
                                                        zM43226 = m43226();
                                                        break;
                                                    } else {
                                                        zM43226 = m43226();
                                                        break;
                                                    }
                                                }
                                                float strokeWidth = c22936.f74548.getStrokeWidth();
                                                if (strokeWidth > 0.0f) {
                                                    fM26656 = (this.f60673.f74548.getStrokeJoin() == Paint.Join.MITER ? Math.max(2.0f, this.f60673.f74548.getStrokeMiter()) : 2.0f) * strokeWidth * 0.5f;
                                                    c5567.getClass();
                                                    rectF = new RectF(c5567.f19077, c5567.f19076, c5567.m15347(), c5567.m15348());
                                                    float f2 = -fM26656;
                                                    rectF.inset(f2 - (2.0f / fAbs), f2 - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left) && !Float.isInfinite(rectF.left) && !Float.isNaN(rectF.top) && !Float.isInfinite(rectF.top) && !Float.isNaN(rectF.right) && !Float.isInfinite(rectF.right) && !Float.isNaN(rectF.bottom) && !Float.isInfinite(rectF.bottom)) {
                                                        canvas3.clipRect(rectF);
                                                        canvas3.saveLayerAlpha(rectF, m43185(this.f60673.f74552.f14359.floatValue()), 31);
                                                        this.f60671.push(this.f60673);
                                                        break;
                                                    }
                                                    zM43226 = m43226();
                                                    break;
                                                }
                                                zM43226 = m43226();
                                                break;
                                            }
                                            zM43226 = m43226();
                                            break;
                                        }
                                        float f3 = fArr[i];
                                        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
                                            zM43226 = m43226();
                                            break;
                                        }
                                        i++;
                                    }
                                } else {
                                    zM43226 = m43226();
                                }
                            } else {
                                zM43226 = m43226();
                            }
                            C22933 c22937 = this.f60673;
                            if (c22937.f74551) {
                                EnumC3444 enumC3444 = c22937.f74552.f14361;
                                path.setFillType((enumC3444 == null || enumC3444 != EnumC3444.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m43212(r14, path);
                            }
                            if (this.f60673.f74549) {
                                m43229(path);
                            }
                            m43213(r14);
                            if (zM43226) {
                                m43201(r14.f60583);
                            }
                        }
                    }
                }
            } else if (c8781 instanceof C14735) {
                r14 = (C14735) c8781;
                C10502 c105012 = r14.f48169;
                if (c105012 != null && r14.f48171 != null && !c105012.m26657() && !r14.f48171.m26657()) {
                    m43218(this.f60673, r14);
                    if (m43222() && m43231()) {
                        Matrix matrix6 = r14.f61420;
                        if (matrix6 != null) {
                            this.f60666.concat(matrix6);
                        }
                        Path pathM43191 = m43191(r14);
                        m43224(r14);
                        m43211(r14);
                        m43230(r14, r14.f60583);
                        boolean zM432212 = m43226();
                        if (this.f60673.f74551) {
                            m43212(r14, pathM43191);
                        }
                        if (this.f60673.f74549) {
                            m43229(pathM43191);
                        }
                        if (zM432212) {
                            m43201(r14.f60583);
                        }
                    }
                }
            } else if (c8781 instanceof C1328) {
                r14 = (C1328) c8781;
                C10502 c105013 = r14.f5630;
                if (c105013 != null && !c105013.m26657()) {
                    m43218(this.f60673, r14);
                    if (m43222() && m43231()) {
                        Matrix matrix7 = r14.f61420;
                        if (matrix7 != null) {
                            this.f60666.concat(matrix7);
                        }
                        Path pathM43189 = m43189(r14);
                        m43224(r14);
                        m43211(r14);
                        m43230(r14, r14.f60583);
                        boolean zM432213 = m43226();
                        if (this.f60673.f74551) {
                            m43212(r14, pathM43189);
                        }
                        if (this.f60673.f74549) {
                            m43229(pathM43189);
                        }
                        if (zM432213) {
                            m43201(r14.f60583);
                        }
                    }
                }
            } else if (c8781 instanceof C15441) {
                r14 = (C15441) c8781;
                C10502 c105014 = r14.f50324;
                if (c105014 != null && r14.f50322 != null && !c105014.m26657() && !r14.f50322.m26657()) {
                    m43218(this.f60673, r14);
                    if (m43222() && m43231()) {
                        Matrix matrix8 = r14.f61420;
                        if (matrix8 != null) {
                            this.f60666.concat(matrix8);
                        }
                        Path pathM43192 = m43192(r14);
                        m43224(r14);
                        m43211(r14);
                        m43230(r14, r14.f60583);
                        boolean zM432214 = m43226();
                        if (this.f60673.f74551) {
                            m43212(r14, pathM43192);
                        }
                        if (this.f60673.f74549) {
                            m43229(pathM43192);
                        }
                        if (zM432214) {
                            m43201(r14.f60583);
                        }
                    }
                }
            } else if (c8781 instanceof C7679) {
                r14 = (C7679) c8781;
                m43218(this.f60673, r14);
                if (m43222() && m43231() && this.f60673.f74549) {
                    Matrix matrix9 = r14.f61420;
                    if (matrix9 != null) {
                        this.f60666.concat(matrix9);
                    }
                    C10502 c105015 = r14.f25427;
                    float fM266512 = c105015 == null ? 0.0f : c105015.m26658(this);
                    C10502 c105016 = r14.f25428;
                    float fM266513 = c105016 == null ? 0.0f : c105016.m26656(this);
                    C10502 c105017 = r14.f25425;
                    float fM266514 = c105017 == null ? 0.0f : c105017.m26658(this);
                    C10502 c105018 = r14.f25426;
                    fM26656 = c105018 != null ? c105018.m26656(this) : 0.0f;
                    if (r14.f60583 == null) {
                        r14.f60583 = new C5562(Math.min(fM266512, fM266514), Math.min(fM266513, fM26656), Math.abs(fM266514 - fM266512), Math.abs(fM26656 - fM266513));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fM266512, fM266513);
                    path2.lineTo(fM266514, fM26656);
                    m43224(r14);
                    m43211(r14);
                    m43230(r14, r14.f60583);
                    boolean zM432215 = m43226();
                    m43229(path2);
                    m43213(r14);
                    if (zM432215) {
                        m43201(r14.f60583);
                    }
                }
            } else if (c8781 instanceof C23907) {
                r14 = (C23907) c8781;
                m43218(this.f60673, r14);
                if (m43222() && m43231()) {
                    C22933 c22938 = this.f60673;
                    if (c22938.f74549 || c22938.f74551) {
                        Matrix matrix10 = r14.f61420;
                        if (matrix10 != null) {
                            this.f60666.concat(matrix10);
                        }
                        if (r14.f37927.length >= 2) {
                            Path pathM43190 = m43190((C11207) r14);
                            m43224(r14);
                            m43211(r14);
                            m43230(r14, r14.f60583);
                            boolean zM432216 = m43226();
                            if (this.f60673.f74551) {
                                m43212(r14, pathM43190);
                            }
                            if (this.f60673.f74549) {
                                m43229(pathM43190);
                            }
                            m43213(r14);
                            if (zM432216) {
                                m43201(r14.f60583);
                            }
                        }
                    }
                }
            } else if (c8781 instanceof C11207) {
                r14 = (C11207) c8781;
                m43218(this.f60673, r14);
                if (m43222() && m43231()) {
                    C22933 c22939 = this.f60673;
                    if (c22939.f74549 || c22939.f74551) {
                        Matrix matrix11 = r14.f61420;
                        if (matrix11 != null) {
                            this.f60666.concat(matrix11);
                        }
                        if (r14.f37927.length >= 2) {
                            Path pathM43193 = m43190((C11207) r14);
                            m43224(r14);
                            EnumC3444 enumC3445 = this.f60673.f74552.f14361;
                            pathM43193.setFillType((enumC3445 == null || enumC3445 != EnumC3444.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            m43211(r14);
                            m43230(r14, r14.f60583);
                            boolean zM432217 = m43226();
                            if (this.f60673.f74551) {
                                m43212(r14, pathM43193);
                            }
                            if (this.f60673.f74549) {
                                m43229(pathM43193);
                            }
                            m43213(r14);
                            if (zM432217) {
                                m43201(r14.f60583);
                            }
                        }
                    }
                }
            } else if (c8781 instanceof C17247) {
                r14 = (C17247) c8781;
                m43218(this.f60673, r14);
                if (m43222()) {
                    Matrix matrix12 = r14.f54951;
                    if (matrix12 != null) {
                        this.f60666.concat(matrix12);
                    }
                    ArrayList arrayList = r14.f47304;
                    float fM266515 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C10502) r14.f47304.get(0)).m26658(this);
                    ArrayList arrayList2 = r14.f47307;
                    float fM266516 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C10502) r14.f47307.get(0)).m26656(this);
                    ArrayList arrayList3 = r14.f47305;
                    float fM266517 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10502) r14.f47305.get(0)).m26658(this);
                    ArrayList arrayList4 = r14.f47306;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fM26656 = ((C10502) r14.f47306.get(0)).m26656(this);
                    }
                    EnumC5252 enumC5252M43232 = m43232();
                    if (enumC5252M43232 != EnumC5252.Start) {
                        float fM43184 = m43184(r14);
                        if (enumC5252M43232 == EnumC5252.Middle) {
                            fM43184 /= 2.0f;
                        }
                        fM266515 -= fM43184;
                    }
                    if (r14.f60583 == null) {
                        C15172 c15172 = new C15172(this, fM266515, fM266516);
                        m43207(r14, c15172);
                        RectF rectF2 = c15172.f49552;
                        r14.f60583 = new C5562(rectF2.left, rectF2.top, rectF2.width(), c15172.f49552.height());
                    }
                    m43224(r14);
                    m43211(r14);
                    m43230(r14, r14.f60583);
                    boolean zM432218 = m43226();
                    m43207(r14, new C3881(this, fM266515 + fM266517, fM266516 + fM26656));
                    if (zM432218) {
                        m43201(r14.f60583);
                    }
                }
            }
        }
        m43183();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43208(AbstractC15131 abstractC15131, boolean z) {
        if (z) {
            m43210((InterfaceC17952) abstractC15131);
        }
        Iterator it = abstractC15131.f49442.iterator();
        while (it.hasNext()) {
            m43204((C8781) it.next());
        }
        if (z) {
            this.f60667.pop();
            this.f60664.pop();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m43223() {
        this.f60666.save();
        this.f60671.push(this.f60673);
        this.f60673 = new C22933(this.f60673);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m43183() {
        this.f60666.restore();
        this.f60673 = (C22933) this.f60671.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43210(InterfaceC17952 interfaceC17952) {
        this.f60667.push(interfaceC17952);
        Canvas canvas = this.f60666;
        Matrix matrix = this.f60670;
        canvas.getMatrix(matrix);
        Matrix matrix2 = new Matrix();
        Stack stack = this.f60664;
        if (!matrix.invert(matrix2)) {
            matrix2 = null;
        }
        stack.push(matrix2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43218(C22933 c22933, AbstractC8075 abstractC8075) {
        boolean z = abstractC8075.f30201 == null;
        C3840 c3840 = c22933.f74552;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c3840.f14351 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c3840.f14325 = bool;
        c3840.f14347 = null;
        c3840.f14355 = null;
        c3840.f14359 = fValueOf;
        c3840.f14360 = C4150.f15175;
        c3840.f14346 = fValueOf;
        c3840.f14331 = null;
        c3840.f14343 = null;
        c3840.f14329 = fValueOf;
        c3840.f14324 = null;
        c3840.f14350 = fValueOf;
        c3840.f14356 = EnumC13014.None;
        C3840 c3841 = abstractC8075.f28300;
        if (c3841 != null) {
            m43217(c22933, c3841);
        }
        if (this.f60662.m29098()) {
            for (C17226 c17226 : (ArrayList) this.f60662.m29086()) {
                if (C1703.m5660(c17226.f54891, abstractC8075)) {
                    m43217(c22933, c17226.f54892);
                }
            }
        }
        C3840 c3842 = abstractC8075.f28297;
        if (c3842 != null) {
            m43217(c22933, c3842);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020b A[LOOP:3: B:104:0x0205->B:106:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43212(AbstractC18658 abstractC18658, Path path) {
        float fM26658;
        float fM26656;
        float fM26657;
        float fM26659;
        Canvas canvas;
        C11913 c11913;
        Iterator it;
        AbstractC10192 abstractC10192 = this.f60673.f74552.f14332;
        boolean z = abstractC10192 instanceof C0622;
        Canvas canvas2 = this.f60666;
        if (z) {
            AbstractC8075 abstractC8075M29087 = this.f60662.m29087(((C0622) abstractC10192).f2710);
            if (abstractC8075M29087 instanceof C6267) {
                C6267 c6267 = (C6267) abstractC8075M29087;
                Boolean bool = c6267.f21245;
                boolean z2 = bool != null && bool.booleanValue();
                String str = c6267.f21250;
                if (str != null) {
                    m43202(c6267, str);
                }
                if (z2) {
                    C10502 c10502 = c6267.f21249;
                    fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
                    C10502 c10503 = c6267.f21251;
                    fM26657 = c10503 != null ? c10503.m26656(this) : 0.0f;
                    C10502 c10504 = c6267.f21252;
                    fM26659 = c10504 != null ? c10504.m26658(this) : 0.0f;
                    C10502 c10505 = c6267.f21246;
                    fM26656 = c10505 != null ? c10505.m26656(this) : 0.0f;
                } else {
                    C10502 c10506 = c6267.f21249;
                    float fM26654 = c10506 != null ? c10506.m26654(this, 1.0f) : 0.0f;
                    C10502 c10507 = c6267.f21251;
                    float fM26655 = c10507 != null ? c10507.m26654(this, 1.0f) : 0.0f;
                    C10502 c10508 = c6267.f21252;
                    float fM266510 = c10508 != null ? c10508.m26654(this, 1.0f) : 0.0f;
                    C10502 c10509 = c6267.f21246;
                    float fM266511 = c10509 != null ? c10509.m26654(this, 1.0f) : 0.0f;
                    C5562 c5562 = abstractC18658.f60583;
                    float f = c5562.f19077;
                    float f2 = c5562.f19074;
                    fM26658 = (fM26654 * f2) + f;
                    float f3 = c5562.f19076;
                    float f4 = c5562.f19075;
                    float f5 = fM266510 * f2;
                    fM26656 = fM266511 * f4;
                    fM26657 = (fM26655 * f4) + f3;
                    fM26659 = f5;
                }
                if (fM26659 == 0.0f || fM26656 == 0.0f) {
                    return;
                }
                C11913 c11914 = c6267.f24454;
                if (c11914 == null) {
                    c11914 = C11913.f40002;
                }
                m43223();
                canvas2.clipPath(path);
                C22933 c22933 = new C22933();
                m43217(c22933, C3840.m11167());
                c22933.f74552.f14325 = Boolean.FALSE;
                m43205(c6267, c22933);
                this.f60673 = c22933;
                C5562 c5563 = abstractC18658.f60583;
                Matrix matrix = c6267.f21248;
                if (matrix != null) {
                    canvas2.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c6267.f21248.invert(matrix2)) {
                        C5562 c5564 = abstractC18658.f60583;
                        float f6 = c5564.f19077;
                        float f7 = c5564.f19076;
                        float fM15347 = c5564.m15347();
                        C5562 c5565 = abstractC18658.f60583;
                        float f8 = c5565.f19076;
                        float fM15348 = c5565.m15347();
                        float fM15349 = abstractC18658.f60583.m15348();
                        C5562 c5566 = abstractC18658.f60583;
                        float[] fArr = {f6, f7, fM15347, f8, fM15348, fM15349, c5566.f19077, c5566.m15348()};
                        matrix2.mapPoints(fArr);
                        float f9 = fArr[0];
                        float f10 = fArr[1];
                        RectF rectF = new RectF(f9, f10, f9, f10);
                        for (int i = 2; i <= 6; i += 2) {
                            float f11 = fArr[i];
                            if (f11 < rectF.left) {
                                rectF.left = f11;
                            }
                            if (f11 > rectF.right) {
                                rectF.right = f11;
                            }
                            float f12 = fArr[i + 1];
                            if (f12 < rectF.top) {
                                rectF.top = f12;
                            }
                            if (f12 > rectF.bottom) {
                                rectF.bottom = f12;
                            }
                        }
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        c5563 = new C5562(f13, f14, rectF.right - f13, rectF.bottom - f14);
                    }
                }
                float fFloor = (((float) Math.floor((c5563.f19077 - fM26658) / fM26659)) * fM26659) + fM26658;
                float fM153410 = c5563.m15347();
                float fM153411 = c5563.m15348();
                C5562 c5567 = new C5562(0.0f, 0.0f, fM26659, fM26656);
                boolean zM43226 = m43226();
                for (float fFloor2 = (((float) Math.floor((c5563.f19076 - fM26657) / fM26656)) * fM26656) + fM26657; fFloor2 < fM153411; fFloor2 += fM26656) {
                    float f15 = fFloor;
                    while (f15 < fM153410) {
                        c5567.f19077 = f15;
                        c5567.f19076 = fFloor2;
                        m43223();
                        if (!this.f60673.f74552.f14325.booleanValue()) {
                            m43199(c5567.f19077, c5567.f19076, c5567.f19074, c5567.f19075);
                        }
                        C5562 c5568 = c6267.f51260;
                        if (c5568 != null) {
                            c11913 = c11914;
                            canvas = canvas2;
                            canvas.concat(m43188(c5567, c5568, c11913));
                        } else {
                            canvas = canvas2;
                            c11913 = c11914;
                            Boolean bool2 = c6267.f21247;
                            boolean z3 = bool2 == null || bool2.booleanValue();
                            canvas.translate(f15, fFloor2);
                            if (!z3) {
                                C5562 c5569 = abstractC18658.f60583;
                                canvas.scale(c5569.f19074, c5569.f19075);
                            }
                            it = c6267.f49442.iterator();
                            while (it.hasNext()) {
                                m43204((C8781) it.next());
                            }
                            m43183();
                            f15 += fM26659;
                            c11914 = c11913;
                            canvas2 = canvas;
                        }
                        it = c6267.f49442.iterator();
                        while (it.hasNext()) {
                            m43204((C8781) it.next());
                        }
                        m43183();
                        f15 += fM26659;
                        c11914 = c11913;
                        canvas2 = canvas;
                    }
                }
                if (zM43226) {
                    m43201(c6267.f60583);
                }
                m43183();
                return;
            }
        }
        canvas2.drawPath(path, this.f60673.f74547);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43229(Path path) {
        C22933 c22933 = this.f60673;
        EnumC13014 enumC13014 = c22933.f74552.f14356;
        EnumC13014 enumC13015 = EnumC13014.NonScalingStroke;
        Canvas canvas = this.f60666;
        if (enumC13014 == enumC13015) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = this.f60673.f74548.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, this.f60673.f74548);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, c22933.f74548);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43203(C6663 c6663, C5562 c5562, C5562 c5563, C11913 c11913) {
        if (c5562.f19074 == 0.0f || c5562.f19075 == 0.0f) {
            return;
        }
        if (c11913 == null && (c11913 = c6663.f24454) == null) {
            c11913 = C11913.f40002;
        }
        m43218(this.f60673, c6663);
        if (m43222()) {
            C22933 c22933 = this.f60673;
            c22933.f74550 = c5562;
            if (!c22933.f74552.f14325.booleanValue()) {
                C5562 c5564 = this.f60673.f74550;
                m43199(c5564.f19077, c5564.f19076, c5564.f19074, c5564.f19075);
            }
            m43230(c6663, this.f60673.f74550);
            Canvas canvas = this.f60666;
            if (c5563 != null) {
                canvas.concat(m43188(this.f60673.f74550, c5563, c11913));
                this.f60673.f74545 = c6663.f51260;
            } else {
                C5562 c5565 = this.f60673.f74550;
                canvas.translate(c5565.f19077, c5565.f19076);
            }
            boolean zM43226 = m43226();
            m43233();
            m43208((AbstractC15131) c6663, true);
            if (zM43226) {
                m43201(c6663.f60583);
            }
            m43224(c6663);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5562 m43197(C10502 c10502, C10502 c10503, C10502 c10504, C10502 c10505) {
        float fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
        float fM26656 = c10503 != null ? c10503.m26656(this) : 0.0f;
        C5562 c5562M43237 = m43237();
        return new C5562(fM26658, fM26656, c10504 != null ? c10504.m26658(this) : c5562M43237.f19074, c10505 != null ? c10505.m26656(this) : c5562M43237.f19075);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m43224(AbstractC18658 abstractC18658) {
        Matrix matrix;
        if (abstractC18658.f30201 == null || abstractC18658.f60583 == null || (matrix = (Matrix) this.f60664.peek()) == null) {
            return;
        }
        Matrix matrix2 = this.f60668;
        matrix2.set(matrix);
        Canvas canvas = this.f60666;
        Matrix matrix3 = this.f60670;
        canvas.getMatrix(matrix3);
        matrix2.preConcat(matrix3);
        C5562 c5562 = abstractC18658.f60583;
        float f = c5562.f19077;
        float[] fArr = this.f60663;
        fArr[6] = f;
        fArr[0] = f;
        float f2 = c5562.f19076;
        fArr[3] = f2;
        fArr[1] = f2;
        float fM15347 = c5562.m15347();
        fArr[4] = fM15347;
        fArr[2] = fM15347;
        float fM15348 = abstractC18658.f60583.m15348();
        fArr[7] = fM15348;
        fArr[5] = fM15348;
        matrix2.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = f4;
        float f6 = f3;
        for (int i = 2; i <= 6; i += 2) {
            float f7 = fArr[i];
            if (f7 < f3) {
                f3 = f7;
            }
            if (f7 > f6) {
                f6 = f7;
            }
            float f8 = fArr[i + 1];
            if (f8 < f4) {
                f4 = f8;
            }
            if (f8 > f5) {
                f5 = f8;
            }
        }
        AbstractC18658 abstractC18659 = (AbstractC18658) this.f60667.peek();
        C5562 c5563 = abstractC18659.f60583;
        if (c5563 == null) {
            abstractC18659.f60583 = new C5562(f3, f4, f6 - f3, f5 - f4);
            return;
        }
        C5562 c5564 = this.f60665;
        c5564.f19077 = f3;
        c5564.f19076 = f4;
        c5564.f19074 = f6 - f3;
        c5564.f19075 = f5 - f4;
        c5563.getClass();
        float f9 = c5564.f19077;
        if (f9 < c5563.f19077) {
            c5563.f19077 = f9;
        }
        float f10 = c5564.f19076;
        if (f10 < c5563.f19076) {
            c5563.f19076 = f10;
        }
        if (c5564.m15347() > c5563.m15347()) {
            c5563.f19074 = c5564.m15347() - c5563.f19077;
        }
        if (c5564.m15348() > c5563.m15348()) {
            c5563.f19075 = c5564.m15348() - c5563.f19076;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43201(C5562 c5562) {
        if (this.f60673.f74552.f14331 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f60666;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C16146 c16146 = (C16146) this.f60662.m29087(this.f60673.f74552.f14331);
            m43209(c16146, c5562);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m43209(c16146, c5562);
            canvas.restore();
            canvas.restore();
        }
        m43183();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m43226() {
        AbstractC8075 abstractC8075M29087;
        if (this.f60673.f74552.f14359.floatValue() >= 1.0f && this.f60673.f74552.f14331 == null) {
            return false;
        }
        this.f60666.saveLayerAlpha(null, m43185(this.f60673.f74552.f14359.floatValue()), 31);
        this.f60671.push(this.f60673);
        C22933 c22933 = new C22933(this.f60673);
        this.f60673 = c22933;
        String str = c22933.f74552.f14331;
        if (str != null && ((abstractC8075M29087 = this.f60662.m29087(str)) == null || !(abstractC8075M29087 instanceof C16146))) {
            C3840 c3840 = this.f60673.f74552;
            String str2 = c3840.f14331;
            c3840.f14331 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5562 m43196(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C5562(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private EnumC5252 m43232() {
        EnumC5252 enumC5252;
        C3840 c3840 = this.f60673.f74552;
        if (c3840.f14341 == EnumC1018.LTR || (enumC5252 = c3840.f14357) == EnumC5252.Middle) {
            return c3840.f14357;
        }
        EnumC5252 enumC5253 = EnumC5252.Start;
        return enumC5252 == enumC5253 ? EnumC5252.End : enumC5253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43207(AbstractC10898 abstractC10898, AbstractC21521 abstractC21521) {
        float f;
        float fM26656;
        float fM26658;
        EnumC5252 enumC5252M43232;
        AbstractC8075 abstractC8075M29087;
        if (m43222()) {
            Iterator it = abstractC10898.f49442.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C8781 c8781 = (C8781) it.next();
                if (c8781 instanceof C9487) {
                    abstractC21521.mo11256(m43195(((C9487) c8781).f32086, z, !it.hasNext()));
                } else if (abstractC21521.mo18118((AbstractC10898) c8781)) {
                    float fM26657 = 0.0f;
                    if (c8781 instanceof C23598) {
                        m43223();
                        C23598 c23598 = (C23598) c8781;
                        m43218(this.f60673, c23598);
                        if (m43222() && m43231() && (abstractC8075M29087 = c23598.f30200.m29087(c23598.f76450)) != null) {
                            C16851 c16851 = (C16851) abstractC8075M29087;
                            Path path = new C1059(c16851.f53918).f4909;
                            Matrix matrix = c16851.f61420;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            C10502 c10502 = c23598.f76451;
                            fM26657 = c10502 != null ? c10502.m26654(this, pathMeasure.getLength()) : 0.0f;
                            EnumC5252 enumC5252M43233 = m43232();
                            if (enumC5252M43233 != EnumC5252.Start) {
                                float fM43184 = m43184((AbstractC10898) c23598);
                                if (enumC5252M43233 == EnumC5252.Middle) {
                                    fM43184 /= 2.0f;
                                }
                                fM26657 -= fM43184;
                            }
                            m43211((AbstractC18658) c23598.mo16244());
                            boolean zM43226 = m43226();
                            m43207(c23598, new C13055(this, path, fM26657));
                            if (zM43226) {
                                m43201(c23598.f60583);
                            }
                        }
                        m43183();
                    } else if (c8781 instanceof C12309) {
                        m43223();
                        C12309 c12309 = (C12309) c8781;
                        m43218(this.f60673, c12309);
                        if (m43222()) {
                            ArrayList arrayList = c12309.f47304;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC21521 instanceof C3881;
                            if (z3) {
                                float fM26659 = !z2 ? ((C3881) abstractC21521).f14511 : ((C10502) c12309.f47304.get(0)).m26658(this);
                                ArrayList arrayList2 = c12309.f47307;
                                fM26656 = (arrayList2 == null || arrayList2.size() == 0) ? ((C3881) abstractC21521).f14510 : ((C10502) c12309.f47307.get(0)).m26656(this);
                                ArrayList arrayList3 = c12309.f47305;
                                fM26658 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10502) c12309.f47305.get(0)).m26658(this);
                                ArrayList arrayList4 = c12309.f47306;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fM26657 = ((C10502) c12309.f47306.get(0)).m26656(this);
                                }
                                f = fM26657;
                                fM26657 = fM26659;
                            } else {
                                f = 0.0f;
                                fM26656 = 0.0f;
                                fM26658 = 0.0f;
                            }
                            if (z2 && (enumC5252M43232 = m43232()) != EnumC5252.Start) {
                                float fM43185 = m43184((AbstractC10898) c12309);
                                if (enumC5252M43232 == EnumC5252.Middle) {
                                    fM43185 /= 2.0f;
                                }
                                fM26657 -= fM43185;
                            }
                            m43211((AbstractC18658) c12309.mo16244());
                            if (z3) {
                                C3881 c3881 = (C3881) abstractC21521;
                                c3881.f14511 = fM26657 + fM26658;
                                c3881.f14510 = fM26656 + f;
                            }
                            boolean zM43227 = m43226();
                            m43207(c12309, abstractC21521);
                            if (zM43227) {
                                m43201(c12309.f60583);
                            }
                        }
                        m43183();
                    } else if (c8781 instanceof C16542) {
                        m43223();
                        C16542 c16542 = (C16542) c8781;
                        m43218(this.f60673, c16542);
                        if (m43222()) {
                            m43211((AbstractC18658) c16542.mo16244());
                            AbstractC8075 abstractC8075M29088 = c8781.f30200.m29087(c16542.f53133);
                            if (abstractC8075M29088 != null && (abstractC8075M29088 instanceof AbstractC10898)) {
                                StringBuilder sb = new StringBuilder();
                                m43206((AbstractC10898) abstractC8075M29088, sb);
                                if (sb.length() > 0) {
                                    abstractC21521.mo11256(sb.toString());
                                }
                            }
                        }
                        m43183();
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m43184(AbstractC10898 abstractC10898) {
        C17993 c17993 = new C17993(this);
        m43207(abstractC10898, c17993);
        return c17993.f57533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43206(AbstractC10898 abstractC10898, StringBuilder sb) {
        Iterator it = abstractC10898.f49442.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C8781 c8781 = (C8781) it.next();
            if (c8781 instanceof AbstractC10898) {
                m43206((AbstractC10898) c8781, sb);
            } else if (c8781 instanceof C9487) {
                sb.append(m43195(((C9487) c8781).f32086, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m43195(String str, boolean z, boolean z2) {
        if (this.f60673.f74546) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m43222() {
        Boolean bool = this.f60673.f74552.f14351;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean m43231() {
        Boolean bool = this.f60673.f74552.f14342;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11 != 8) goto L37;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix m43188(l.C5562 r9, l.C5562 r10, l.C11913 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L9b
            l.ۙ᩵ܶ r1 = r11.m29718()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r9.f19074
            float r2 = r10.f19074
            float r1 = r1 / r2
            float r2 = r9.f19075
            float r3 = r10.f19075
            float r2 = r2 / r3
            float r3 = r10.f19077
            float r3 = -r3
            float r4 = r10.f19076
            float r4 = -r4
            l.ۨ᩵ܶ r5 = l.C11913.f40001
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L35
            float r10 = r9.f19077
            float r9 = r9.f19076
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            l.ܰ᩵ܶ r5 = r11.m29719()
            l.ܰ᩵ܶ r6 = l.EnumC14030.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r9.f19074
            float r2 = r2 / r1
            float r5 = r9.f19075
            float r5 = r5 / r1
            int[] r6 = l.C2470.f9827
            l.ۙ᩵ܶ r7 = r11.m29718()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L67
        L5e:
            float r7 = r10.f19074
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r10.f19074
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            l.ۙ᩵ܶ r11 = r11.m29718()
            int r11 = r11.ordinal()
            r11 = r6[r11]
            r2 = 2
            if (r11 == r2) goto L89
            r2 = 3
            if (r11 == r2) goto L85
            r2 = 5
            if (r11 == r2) goto L89
            r2 = 6
            if (r11 == r2) goto L85
            r2 = 7
            if (r11 == r2) goto L89
            r2 = 8
            if (r11 == r2) goto L85
            goto L8e
        L85:
            float r10 = r10.f19075
            float r10 = r10 - r5
            goto L8d
        L89:
            float r10 = r10.f19075
            float r10 = r10 - r5
            float r10 = r10 / r8
        L8d:
            float r4 = r4 - r10
        L8e:
            float r10 = r9.f19077
            float r9 = r9.f19076
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18699.m43188(l.ۚ᩵ܶ, l.ۚ᩵ܶ, l.ۨ᩵ܶ):android.graphics.Matrix");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43221(C3840 c3840, long j) {
        return (j & c3840.f14333) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43217(C22933 c22933, C3840 c3840) {
        if (m43221(c3840, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c22933.f74552.f14349 = c3840.f14349;
        }
        if (m43221(c3840, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c22933.f74552.f14359 = c3840.f14359;
        }
        boolean zM43221 = m43221(c3840, 1L);
        C4150 c4150 = C4150.f15174;
        if (zM43221) {
            c22933.f74552.f14332 = c3840.f14332;
            AbstractC10192 abstractC10192 = c3840.f14332;
            c22933.f74551 = (abstractC10192 == null || abstractC10192 == c4150) ? false : true;
        }
        if (m43221(c3840, 4L)) {
            c22933.f74552.f14339 = c3840.f14339;
        }
        if (m43221(c3840, 6149L)) {
            m43219(c22933, true, c22933.f74552.f14332);
        }
        if (m43221(c3840, 2L)) {
            c22933.f74552.f14361 = c3840.f14361;
        }
        if (m43221(c3840, 8L)) {
            c22933.f74552.f14358 = c3840.f14358;
            AbstractC10192 abstractC10193 = c3840.f14358;
            c22933.f74549 = (abstractC10193 == null || abstractC10193 == c4150) ? false : true;
        }
        if (m43221(c3840, 16L)) {
            c22933.f74552.f14338 = c3840.f14338;
        }
        if (m43221(c3840, 6168L)) {
            m43219(c22933, false, c22933.f74552.f14358);
        }
        if (m43221(c3840, 34359738368L)) {
            c22933.f74552.f14356 = c3840.f14356;
        }
        if (m43221(c3840, 32L)) {
            C3840 c3841 = c22933.f74552;
            C10502 c10502 = c3840.f14334;
            c3841.f14334 = c10502;
            c22933.f74548.setStrokeWidth(c10502.m26653(this));
        }
        if (m43221(c3840, 64L)) {
            C3840 c3842 = c22933.f74552;
            Paint paint = c22933.f74548;
            c3842.f14335 = c3840.f14335;
            int i = C2470.f9829[c3840.f14335.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m43221(c3840, 128L)) {
            C3840 c3843 = c22933.f74552;
            Paint paint2 = c22933.f74548;
            c3843.f14354 = c3840.f14354;
            int i2 = C2470.f9828[c3840.f14354.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m43221(c3840, 256L)) {
            c22933.f74552.f14336 = c3840.f14336;
            c22933.f74548.setStrokeMiter(c3840.f14336.floatValue());
        }
        if (m43221(c3840, 512L)) {
            c22933.f74552.f14352 = c3840.f14352;
        }
        if (m43221(c3840, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)) {
            c22933.f74552.f14353 = c3840.f14353;
        }
        Typeface typefaceM43194 = null;
        if (m43221(c3840, 1536L)) {
            C3840 c3844 = c22933.f74552;
            Paint paint3 = c22933.f74548;
            C10502[] c10502Arr = c3844.f14352;
            if (c10502Arr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c10502Arr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fM26653 = c3844.f14352[i4 % length].m26653(this);
                    fArr[i4] = fM26653;
                    f += fM26653;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fM26654 = c3844.f14353.m26653(this);
                    if (fM26654 < 0.0f) {
                        fM26654 = (fM26654 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fM26654));
                }
            }
        }
        if (m43221(c3840, 16384L)) {
            float fM43235 = m43235();
            c22933.f74552.f14326 = c3840.f14326;
            c22933.f74547.setTextSize(c3840.f14326.m26654(this, fM43235));
            c22933.f74548.setTextSize(c3840.f14326.m26654(this, fM43235));
        }
        if (m43221(c3840, 8192L)) {
            c22933.f74552.f14345 = c3840.f14345;
        }
        if (m43221(c3840, X931RNG.BLOCK64_RESEED_MAX)) {
            if (c3840.f14328.intValue() == -1 && c22933.f74552.f14328.intValue() > 100) {
                C3840 c3845 = c22933.f74552;
                c3845.f14328 = Integer.valueOf(c3845.f14328.intValue() - 100);
            } else if (c3840.f14328.intValue() == 1 && c22933.f74552.f14328.intValue() < 900) {
                C3840 c3846 = c22933.f74552;
                c3846.f14328 = Integer.valueOf(c3846.f14328.intValue() + 100);
            } else {
                c22933.f74552.f14328 = c3840.f14328;
            }
        }
        if (m43221(c3840, 65536L)) {
            c22933.f74552.f14337 = c3840.f14337;
        }
        if (m43221(c3840, 106496L)) {
            C3840 c3847 = c22933.f74552;
            ArrayList arrayList = c3847.f14345;
            if (arrayList != null && this.f60662 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceM43194 = m43194((String) it.next(), c3847.f14328, c3847.f14337)) == null) {
                }
            }
            if (typefaceM43194 == null) {
                typefaceM43194 = m43194("serif", c3847.f14328, c3847.f14337);
            }
            c22933.f74547.setTypeface(typefaceM43194);
            c22933.f74548.setTypeface(typefaceM43194);
        }
        if (m43221(c3840, 131072L)) {
            C3840 c3848 = c22933.f74552;
            Paint paint4 = c22933.f74548;
            Paint paint5 = c22933.f74547;
            c3848.f14348 = c3840.f14348;
            EnumC22186 enumC22186 = c3840.f14348;
            EnumC22186 enumC22187 = EnumC22186.LineThrough;
            paint5.setStrikeThruText(enumC22186 == enumC22187);
            EnumC22186 enumC22188 = c3840.f14348;
            EnumC22186 enumC22189 = EnumC22186.Underline;
            paint5.setUnderlineText(enumC22188 == enumC22189);
            paint4.setStrikeThruText(c3840.f14348 == enumC22187);
            paint4.setUnderlineText(c3840.f14348 == enumC22189);
        }
        if (m43221(c3840, 68719476736L)) {
            c22933.f74552.f14341 = c3840.f14341;
        }
        if (m43221(c3840, 262144L)) {
            c22933.f74552.f14357 = c3840.f14357;
        }
        if (m43221(c3840, 524288L)) {
            c22933.f74552.f14325 = c3840.f14325;
        }
        if (m43221(c3840, 2097152L)) {
            c22933.f74552.f14327 = c3840.f14327;
        }
        if (m43221(c3840, 4194304L)) {
            c22933.f74552.f14340 = c3840.f14340;
        }
        if (m43221(c3840, X931RNG.BLOCK128_RESEED_MAX)) {
            c22933.f74552.f14344 = c3840.f14344;
        }
        if (m43221(c3840, 16777216L)) {
            c22933.f74552.f14351 = c3840.f14351;
        }
        if (m43221(c3840, 33554432L)) {
            c22933.f74552.f14342 = c3840.f14342;
        }
        if (m43221(c3840, 1048576L)) {
            c22933.f74552.f14347 = c3840.f14347;
        }
        if (m43221(c3840, 268435456L)) {
            c22933.f74552.f14355 = c3840.f14355;
        }
        if (m43221(c3840, 536870912L)) {
            c22933.f74552.f14323 = c3840.f14323;
        }
        if (m43221(c3840, 1073741824L)) {
            c22933.f74552.f14331 = c3840.f14331;
        }
        if (m43221(c3840, 67108864L)) {
            c22933.f74552.f14360 = c3840.f14360;
        }
        if (m43221(c3840, 134217728L)) {
            c22933.f74552.f14346 = c3840.f14346;
        }
        if (m43221(c3840, 8589934592L)) {
            c22933.f74552.f14324 = c3840.f14324;
        }
        if (m43221(c3840, 17179869184L)) {
            c22933.f74552.f14350 = c3840.f14350;
        }
        if (m43221(c3840, 137438953472L)) {
            c22933.f74552.f14330 = c3840.f14330;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43219(C22933 c22933, boolean z, AbstractC10192 abstractC10192) {
        int i;
        C3840 c3840 = c22933.f74552;
        float fFloatValue = (z ? c3840.f14339 : c3840.f14338).floatValue();
        if (abstractC10192 instanceof C4150) {
            i = ((C4150) abstractC10192).f15176;
        } else if (!(abstractC10192 instanceof C6973)) {
            return;
        } else {
            i = c22933.f74552.f14349.f15176;
        }
        int iM43186 = m43186(fFloatValue, i);
        if (z) {
            c22933.f74547.setColor(iM43186);
        } else {
            c22933.f74548.setColor(iM43186);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m43194(String str, Integer num, EnumC4546 enumC4546) {
        int i;
        boolean z = enumC4546 == EnumC4546.Italic;
        if (num.intValue() > 500) {
            i = z ? 3 : 1;
        } else {
            i = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "serif":
                return Typeface.create(Typeface.SERIF, i);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43186(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43199(float f, float f2, float f3, float f4) {
        float fM26658 = f3 + f;
        float fM26656 = f4 + f2;
        C22496 c22496 = this.f60673.f74552.f14347;
        if (c22496 != null) {
            f += c22496.f73443.m26658(this);
            f2 += this.f60673.f74552.f14347.f73440.m26656(this);
            fM26658 -= this.f60673.f74552.f14347.f73442.m26658(this);
            fM26656 -= this.f60673.f74552.f14347.f73441.m26656(this);
        }
        this.f60666.clipRect(f, f2, fM26658, fM26656);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m43233() {
        int iM43186;
        C3840 c3840 = this.f60673.f74552;
        AbstractC10192 abstractC10192 = c3840.f14324;
        if (abstractC10192 instanceof C4150) {
            iM43186 = ((C4150) abstractC10192).f15176;
        } else if (!(abstractC10192 instanceof C6973)) {
            return;
        } else {
            iM43186 = c3840.f14349.f15176;
        }
        Float f = c3840.f14350;
        if (f != null) {
            iM43186 = m43186(f.floatValue(), iM43186);
        }
        this.f60666.drawColor(iM43186);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43200(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC17556 interfaceC17556) {
        double dAcos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC17556.mo4008(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (d2 * dCos) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        float f8 = fAbs;
        float f9 = fAbs2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos2 = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = (d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d;
        double d28 = d26 / dSqrt3;
        if (d28 < -1.0d) {
            dAcos = 3.141592653589793d;
        } else {
            dAcos = d28 > 1.0d ? 0.0d : Math.acos(d28);
        }
        double d29 = d27 * dAcos;
        if (!z2 && d29 > 0.0d) {
            d29 -= 6.283185307179586d;
        } else if (z2 && d29 < 0.0d) {
            d29 += 6.283185307179586d;
        }
        double d30 = d29 % 6.283185307179586d;
        double d31 = dAcos2 % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d30) * 2.0d) / 3.141592653589793d);
        double d32 = d30 / ((double) iCeil);
        double d33 = d32 / 2.0d;
        double dSin2 = (Math.sin(d33) * 1.3333333333333333d) / (Math.cos(d33) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            int i4 = iCeil;
            double d34 = (((double) i2) * d32) + d31;
            double dCos2 = Math.cos(d34);
            double dSin3 = Math.sin(d34);
            fArr[i3] = (float) (dCos2 - (dSin2 * dSin3));
            double d35 = d20;
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d36 = d34 + d32;
            double dCos3 = Math.cos(d36);
            double dSin4 = Math.sin(d36);
            fArr[i3 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i3 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            int i5 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i5] = (float) dSin4;
            i2++;
            i = i;
            d31 = d31;
            d32 = d32;
            iCeil = i4;
            dSin2 = dSin2;
            d20 = d35;
        }
        int i6 = i;
        Matrix matrix = new Matrix();
        matrix.postScale(f8, f9);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i6 - 2] = f6;
        fArr[i6 - 1] = f7;
        for (int i7 = 0; i7 < i6; i7 += 6) {
            interfaceC17556.mo4006(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43213(AbstractC18968 abstractC18968) {
        C21084 c21084;
        C21084 c21085;
        C21084 c21086;
        ArrayList arrayList;
        float f;
        float f2;
        ArrayList arrayListM14666;
        int size;
        C3840 c3840 = this.f60673.f74552;
        String str = c3840.f14327;
        if (str == null && c3840.f14340 == null && c3840.f14344 == null) {
            return;
        }
        if (str == null) {
            c21084 = null;
        } else {
            AbstractC8075 abstractC8075M29087 = abstractC18968.f30200.m29087(str);
            if (abstractC8075M29087 != null) {
                c21084 = (C21084) abstractC8075M29087;
            } else {
                String str2 = this.f60673.f74552.f14327;
                c21084 = null;
            }
        }
        String str3 = this.f60673.f74552.f14340;
        if (str3 == null) {
            c21085 = null;
        } else {
            AbstractC8075 abstractC8075M29088 = abstractC18968.f30200.m29087(str3);
            if (abstractC8075M29088 != null) {
                c21085 = (C21084) abstractC8075M29088;
            } else {
                String str4 = this.f60673.f74552.f14340;
                c21085 = null;
            }
        }
        String str5 = this.f60673.f74552.f14344;
        if (str5 == null) {
            c21086 = null;
        } else {
            AbstractC8075 abstractC8075M29089 = abstractC18968.f30200.m29087(str5);
            if (abstractC8075M29089 != null) {
                c21086 = (C21084) abstractC8075M29089;
            } else {
                String str6 = this.f60673.f74552.f14344;
                c21086 = null;
            }
        }
        if (abstractC18968 instanceof C16851) {
            arrayListM14666 = new C5293(this, ((C16851) abstractC18968).f53918).m14666();
        } else {
            if (abstractC18968 instanceof C7679) {
                C7679 c7679 = (C7679) abstractC18968;
                C10502 c10502 = c7679.f25427;
                float fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
                C10502 c10503 = c7679.f25428;
                float fM26656 = c10503 != null ? c10503.m26656(this) : 0.0f;
                C10502 c10504 = c7679.f25425;
                float fM26659 = c10504 != null ? c10504.m26658(this) : 0.0f;
                C10502 c10505 = c7679.f25426;
                float fM26657 = c10505 != null ? c10505.m26656(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f3 = fM26659 - fM26658;
                float f4 = fM26657 - fM26656;
                arrayList.add(new C22227(fM26658, fM26656, f3, f4));
                arrayList.add(new C22227(fM26659, fM26657, f3, f4));
            } else {
                C11207 c11207 = (C11207) abstractC18968;
                int length = c11207.f37927.length;
                if (length < 2) {
                    arrayListM14666 = null;
                } else {
                    arrayList = new ArrayList();
                    float[] fArr = c11207.f37927;
                    C22227 c22227 = new C22227(fArr[0], fArr[1], 0.0f, 0.0f);
                    int i = 2;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    while (true) {
                        f = c22227.f72686;
                        f2 = c22227.f72684;
                        if (i >= length) {
                            break;
                        }
                        float[] fArr2 = c11207.f37927;
                        float f7 = fArr2[i];
                        float f8 = fArr2[i + 1];
                        c22227.m49351(f7, f8);
                        arrayList.add(c22227);
                        c22227 = new C22227(f7, f8, f7 - f2, f8 - f);
                        i += 2;
                        f6 = f8;
                        f5 = f7;
                    }
                    if (c11207 instanceof C23907) {
                        float[] fArr3 = c11207.f37927;
                        float f9 = fArr3[0];
                        if (f5 != f9) {
                            float f10 = fArr3[1];
                            if (f6 != f10) {
                                c22227.m49351(f9, f10);
                                arrayList.add(c22227);
                                C22227 c22228 = new C22227(f9, f10, f9 - f2, f10 - f);
                                c22228.m49352((C22227) arrayList.get(0));
                                arrayList.add(c22228);
                                arrayList.set(0, c22228);
                            }
                        }
                    } else {
                        arrayList.add(c22227);
                    }
                }
            }
            arrayListM14666 = arrayList;
        }
        if (arrayListM14666 == null || (size = arrayListM14666.size()) == 0) {
            return;
        }
        C3840 c3841 = this.f60673.f74552;
        c3841.f14344 = null;
        c3841.f14340 = null;
        c3841.f14327 = null;
        if (c21084 != null) {
            m43215(c21084, (C22227) arrayListM14666.get(0));
        }
        if (c21085 != null && arrayListM14666.size() > 2) {
            int i2 = 1;
            C22227 c22229 = (C22227) arrayListM14666.get(0);
            C22227 c222210 = (C22227) arrayListM14666.get(1);
            while (i2 < size - 1) {
                i2++;
                C22227 c222211 = (C22227) arrayListM14666.get(i2);
                if (c222210.f72687) {
                    float f11 = c222210.f72685;
                    float f12 = c222210.f72688;
                    float f13 = c222210.f72684;
                    float f14 = f13 - c22229.f72684;
                    float f15 = c222210.f72686;
                    float f16 = ((f15 - c22229.f72686) * f12) + (f14 * f11);
                    if (f16 == 0.0f) {
                        f16 = ((c222211.f72684 - f13) * f11) + ((c222211.f72686 - f15) * f12);
                    }
                    if (f16 <= 0.0f && (f16 != 0.0f || (f11 <= 0.0f && f12 < 0.0f))) {
                        c222210.f72685 = -f11;
                        c222210.f72688 = -f12;
                    }
                }
                m43215(c21085, c222210);
                c22229 = c222210;
                c222210 = c222211;
            }
        }
        if (c21086 != null) {
            m43215(c21086, (C22227) arrayListM14666.get(size - 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        if (r8 != 8) goto L67;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m43215(l.C21084 r13, l.C22227 r14) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18699.m43215(l.᩷᩵ܶ, l.᩹ۤܶ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22933 m43198(AbstractC8075 abstractC8075) {
        C22933 c22933 = new C22933();
        m43217(c22933, C3840.m11167());
        m43205(abstractC8075, c22933);
        return c22933;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43205(C8781 c8781, C22933 c22933) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c8781 instanceof AbstractC8075) {
                arrayList.add(0, (AbstractC8075) c8781);
            }
            Object obj = c8781.f30201;
            if (obj == null) {
                break;
            } else {
                c8781 = (C8781) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m43218(c22933, (AbstractC8075) it.next());
        }
        C22933 c22934 = this.f60673;
        c22933.f74545 = c22934.f74545;
        c22933.f74550 = c22934.f74550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43211(AbstractC18658 abstractC18658) {
        AbstractC10192 abstractC10192 = this.f60673.f74552.f14332;
        if (abstractC10192 instanceof C0622) {
            m43220(true, abstractC18658.f60583, (C0622) abstractC10192);
        }
        AbstractC10192 abstractC10193 = this.f60673.f74552.f14358;
        if (abstractC10193 instanceof C0622) {
            m43220(false, abstractC18658.f60583, (C0622) abstractC10193);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43220(boolean z, C5562 c5562, C0622 c0622) {
        float fM26654;
        float fM26655;
        float fM26656;
        float fM26657;
        float f;
        float f2;
        float f3;
        AbstractC8075 abstractC8075M29087 = this.f60662.m29087(c0622.f2710);
        int i = 0;
        int i2 = 0;
        if (abstractC8075M29087 == null) {
            AbstractC10192 abstractC10192 = c0622.f2709;
            if (abstractC10192 != null) {
                m43219(this.f60673, z, abstractC10192);
                return;
            } else if (z) {
                this.f60673.f74551 = false;
                return;
            } else {
                this.f60673.f74549 = false;
                return;
            }
        }
        boolean z2 = abstractC8075M29087 instanceof C19364;
        C4150 c4150 = C4150.f15175;
        float f4 = -1.0f;
        if (z2) {
            C19364 c19364 = (C19364) abstractC8075M29087;
            String str = c19364.f70581;
            if (str != null) {
                m43216(c19364, str);
            }
            Boolean bool = c19364.f70578;
            boolean z3 = bool != null && bool.booleanValue();
            C22933 c22933 = this.f60673;
            Paint paint = z ? c22933.f74547 : c22933.f74548;
            if (z3) {
                C5562 c5562M43237 = m43237();
                C10502 c10502 = c19364.f62421;
                float fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
                C10502 c10503 = c19364.f62420;
                float fM26659 = c10503 != null ? c10503.m26656(this) : 0.0f;
                C10502 c10504 = c19364.f62419;
                float fM266510 = c10504 != null ? c10504.m26658(this) : c5562M43237.f19074;
                C10502 c10505 = c19364.f62418;
                f3 = fM266510;
                f = fM26658;
                f2 = fM26659;
                fM26657 = c10505 != null ? c10505.m26656(this) : 0.0f;
            } else {
                C10502 c10506 = c19364.f62421;
                float fM266511 = c10506 != null ? c10506.m26654(this, 1.0f) : 0.0f;
                C10502 c10507 = c19364.f62420;
                float fM266512 = c10507 != null ? c10507.m26654(this, 1.0f) : 0.0f;
                C10502 c10508 = c19364.f62419;
                float fM266513 = c10508 != null ? c10508.m26654(this, 1.0f) : 1.0f;
                C10502 c10509 = c19364.f62418;
                fM26657 = c10509 != null ? c10509.m26654(this, 1.0f) : 0.0f;
                f = fM266511;
                f2 = fM266512;
                f3 = fM266513;
            }
            m43223();
            this.f60673 = m43198((AbstractC8075) c19364);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c5562.f19077, c5562.f19076);
                matrix.preScale(c5562.f19074, c5562.f19075);
            }
            Matrix matrix2 = c19364.f70577;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c19364.f70579.size();
            if (size == 0) {
                m43183();
                if (z) {
                    this.f60673.f74551 = false;
                    return;
                } else {
                    this.f60673.f74549 = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c19364.f70579.iterator();
            while (it.hasNext()) {
                C9796 c9796 = (C9796) ((C8781) it.next());
                Float f5 = c9796.f33522;
                float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
                if (i == 0 || fFloatValue >= f4) {
                    fArr[i] = fFloatValue;
                    f4 = fFloatValue;
                } else {
                    fArr[i] = f4;
                }
                m43223();
                m43218(this.f60673, c9796);
                C3840 c3840 = this.f60673.f74552;
                C4150 c4151 = (C4150) c3840.f14360;
                if (c4151 == null) {
                    c4151 = c4150;
                }
                iArr[i] = m43186(c3840.f14346.floatValue(), c4151.f15176);
                i++;
                m43183();
            }
            if ((f == f3 && f2 == fM26657) || size == 1) {
                m43183();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            EnumC18262 enumC18262 = c19364.f70580;
            if (enumC18262 != null) {
                if (enumC18262 == EnumC18262.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC18262 == EnumC18262.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m43183();
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, fM26657, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m43185(this.f60673.f74552.f14339.floatValue()));
            return;
        }
        if (abstractC8075M29087 instanceof C20775) {
            C20775 c20775 = (C20775) abstractC8075M29087;
            String str2 = c20775.f70581;
            if (str2 != null) {
                m43216(c20775, str2);
            }
            Boolean bool2 = c20775.f70578;
            boolean z4 = bool2 != null && bool2.booleanValue();
            C22933 c22934 = this.f60673;
            Paint paint2 = z ? c22934.f74547 : c22934.f74548;
            if (z4) {
                C10502 c105010 = new C10502(50.0f, EnumC3135.percent);
                C10502 c105011 = c20775.f67577;
                fM26654 = c105011 != null ? c105011.m26658(this) : c105010.m26658(this);
                C10502 c105012 = c20775.f67574;
                fM26655 = c105012 != null ? c105012.m26656(this) : c105010.m26656(this);
                C10502 c105013 = c20775.f67576;
                fM26656 = c105013 != null ? c105013.m26653(this) : c105010.m26653(this);
            } else {
                C10502 c105014 = c20775.f67577;
                fM26654 = c105014 != null ? c105014.m26654(this, 1.0f) : 0.5f;
                C10502 c105015 = c20775.f67574;
                fM26655 = c105015 != null ? c105015.m26654(this, 1.0f) : 0.5f;
                C10502 c105016 = c20775.f67576;
                fM26656 = c105016 != null ? c105016.m26654(this, 1.0f) : 0.5f;
            }
            float f6 = fM26656;
            float f7 = fM26654;
            float f8 = fM26655;
            m43223();
            this.f60673 = m43198((AbstractC8075) c20775);
            Matrix matrix3 = new Matrix();
            if (!z4) {
                matrix3.preTranslate(c5562.f19077, c5562.f19076);
                matrix3.preScale(c5562.f19074, c5562.f19075);
            }
            Matrix matrix4 = c20775.f70577;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c20775.f70579.size();
            if (size2 == 0) {
                m43183();
                if (z) {
                    this.f60673.f74551 = false;
                    return;
                } else {
                    this.f60673.f74549 = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator it2 = c20775.f70579.iterator();
            while (it2.hasNext()) {
                C9796 c9797 = (C9796) ((C8781) it2.next());
                Float f9 = c9797.f33522;
                float fFloatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                if (i2 == 0 || fFloatValue2 >= f4) {
                    fArr2[i2] = fFloatValue2;
                    f4 = fFloatValue2;
                } else {
                    fArr2[i2] = f4;
                }
                m43223();
                m43218(this.f60673, c9797);
                C3840 c3841 = this.f60673.f74552;
                C4150 c4152 = (C4150) c3841.f14360;
                if (c4152 == null) {
                    c4152 = c4150;
                }
                iArr2[i2] = m43186(c3841.f14346.floatValue(), c4152.f15176);
                i2++;
                m43183();
            }
            if (f6 == 0.0f || size2 == 1) {
                m43183();
                paint2.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            EnumC18262 enumC18263 = c20775.f70580;
            if (enumC18263 != null) {
                if (enumC18263 == EnumC18262.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (enumC18263 == EnumC18262.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            m43183();
            RadialGradient radialGradient = new RadialGradient(f7, f8, f6, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint2.setShader(radialGradient);
            paint2.setAlpha(m43185(this.f60673.f74552.f14339.floatValue()));
            return;
        }
        if (abstractC8075M29087 instanceof C2033) {
            C2033 c2033 = (C2033) abstractC8075M29087;
            if (z) {
                if (m43221(c2033.f28300, 2147483648L)) {
                    C22933 c22935 = this.f60673;
                    C3840 c3842 = c22935.f74552;
                    AbstractC10192 abstractC10193 = c2033.f28300.f14343;
                    c3842.f14332 = abstractC10193;
                    c22935.f74551 = abstractC10193 != null;
                }
                if (m43221(c2033.f28300, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                    this.f60673.f74552.f14339 = c2033.f28300.f14329;
                }
                if (m43221(c2033.f28300, 6442450944L)) {
                    C22933 c22936 = this.f60673;
                    m43219(c22936, z, c22936.f74552.f14332);
                    return;
                }
                return;
            }
            if (m43221(c2033.f28300, 2147483648L)) {
                C22933 c22937 = this.f60673;
                C3840 c3843 = c22937.f74552;
                AbstractC10192 abstractC10194 = c2033.f28300.f14343;
                c3843.f14358 = abstractC10194;
                c22937.f74549 = abstractC10194 != null;
            }
            if (m43221(c2033.f28300, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                this.f60673.f74552.f14338 = c2033.f28300.f14329;
            }
            if (m43221(c2033.f28300, 6442450944L)) {
                C22933 c22938 = this.f60673;
                m43219(c22938, z, c22938.f74552.f14358);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43216(AbstractC21790 abstractC21790, String str) {
        AbstractC8075 abstractC8075M29087 = abstractC21790.f30200.m29087(str);
        if (abstractC8075M29087 == null || !(abstractC8075M29087 instanceof AbstractC21790) || abstractC8075M29087 == abstractC21790) {
            return;
        }
        AbstractC21790 abstractC21791 = (AbstractC21790) abstractC8075M29087;
        if (abstractC21790.f70578 == null) {
            abstractC21790.f70578 = abstractC21791.f70578;
        }
        if (abstractC21790.f70577 == null) {
            abstractC21790.f70577 = abstractC21791.f70577;
        }
        if (abstractC21790.f70580 == null) {
            abstractC21790.f70580 = abstractC21791.f70580;
        }
        if (abstractC21790.f70579.isEmpty()) {
            abstractC21790.f70579 = abstractC21791.f70579;
        }
        try {
            if (abstractC21790 instanceof C19364) {
                C19364 c19364 = (C19364) abstractC21790;
                C19364 c19365 = (C19364) abstractC8075M29087;
                if (c19364.f62421 == null) {
                    c19364.f62421 = c19365.f62421;
                }
                if (c19364.f62420 == null) {
                    c19364.f62420 = c19365.f62420;
                }
                if (c19364.f62419 == null) {
                    c19364.f62419 = c19365.f62419;
                }
                if (c19364.f62418 == null) {
                    c19364.f62418 = c19365.f62418;
                }
            } else {
                m43214((C20775) abstractC21790, (C20775) abstractC8075M29087);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC21791.f70581;
        if (str2 != null) {
            m43216(abstractC21790, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43214(C20775 c20775, C20775 c20776) {
        if (c20775.f67577 == null) {
            c20775.f67577 = c20776.f67577;
        }
        if (c20775.f67574 == null) {
            c20775.f67574 = c20776.f67574;
        }
        if (c20775.f67576 == null) {
            c20775.f67576 = c20776.f67576;
        }
        if (c20775.f67575 == null) {
            c20775.f67575 = c20776.f67575;
        }
        if (c20775.f67573 == null) {
            c20775.f67573 = c20776.f67573;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43230(AbstractC18658 abstractC18658, C5562 c5562) {
        Path pathM43193;
        if (this.f60673.f74552.f14355 == null || (pathM43193 = m43193(abstractC18658, c5562)) == null) {
            return;
        }
        this.f60666.clipPath(pathM43193);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m43193(AbstractC18658 abstractC18658, C5562 c5562) {
        Path pathM43227;
        AbstractC8075 abstractC8075M29087 = abstractC18658.f30200.m29087(this.f60673.f74552.f14355);
        if (abstractC8075M29087 == null) {
            String str = this.f60673.f74552.f14355;
            return null;
        }
        C13324 c13324 = (C13324) abstractC8075M29087;
        this.f60671.push(this.f60673);
        this.f60673 = m43198((AbstractC8075) c13324);
        Boolean bool = c13324.f44234;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c5562.f19077, c5562.f19076);
            matrix.preScale(c5562.f19074, c5562.f19075);
        }
        Matrix matrix2 = c13324.f29124;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C8781 c8781 : c13324.f49442) {
            if ((c8781 instanceof AbstractC18658) && (pathM43227 = m43227((AbstractC18658) c8781)) != null) {
                path.op(pathM43227, Path.Op.UNION);
            }
        }
        if (this.f60673.f74552.f14355 != null) {
            if (c13324.f60583 == null) {
                c13324.f60583 = m43196(path);
            }
            Path pathM43193 = m43193(c13324, c13324.f60583);
            if (pathM43193 != null) {
                path.op(pathM43193, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f60673 = (C22933) this.f60671.pop();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    @TargetApi(19)
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Path m43227(AbstractC18658 abstractC18658) {
        Path path;
        Path pathM43193;
        this.f60671.push(this.f60673);
        C22933 c22933 = new C22933(this.f60673);
        this.f60673 = c22933;
        m43218(c22933, abstractC18658);
        if (!m43222() || !m43231()) {
            this.f60673 = (C22933) this.f60671.pop();
            return null;
        }
        if (abstractC18658 instanceof C4587) {
            C4587 c4587 = (C4587) abstractC18658;
            AbstractC8075 abstractC8075M29087 = abstractC18658.f30200.m29087(c4587.f16245);
            if (abstractC8075M29087 == null) {
                this.f60673 = (C22933) this.f60671.pop();
                return null;
            }
            if (!(abstractC8075M29087 instanceof AbstractC18658)) {
                this.f60673 = (C22933) this.f60671.pop();
                return null;
            }
            path = m43227((AbstractC18658) abstractC8075M29087);
            if (path != null) {
                if (c4587.f60583 == null) {
                    c4587.f60583 = m43196(path);
                }
                Matrix matrix = c4587.f29124;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f60673.f74552.f14355 != null && (pathM43193 = m43193(abstractC18658, abstractC18658.f60583)) != null) {
                    path.op(pathM43193, Path.Op.INTERSECT);
                }
                this.f60673 = (C22933) this.f60671.pop();
                return path;
            }
            return null;
        }
        if (abstractC18658 instanceof AbstractC18968) {
            AbstractC18968 abstractC18968 = (AbstractC18968) abstractC18658;
            if (abstractC18658 instanceof C16851) {
                path = new C1059(((C16851) abstractC18658).f53918).f4909;
                if (abstractC18658.f60583 == null) {
                    abstractC18658.f60583 = m43196(path);
                }
            } else if (abstractC18658 instanceof C14735) {
                path = m43191((C14735) abstractC18658);
            } else if (abstractC18658 instanceof C1328) {
                path = m43189((C1328) abstractC18658);
            } else if (abstractC18658 instanceof C15441) {
                path = m43192((C15441) abstractC18658);
            } else {
                path = abstractC18658 instanceof C11207 ? m43190((C11207) abstractC18658) : null;
            }
            if (path != null) {
                if (abstractC18968.f60583 == null) {
                    abstractC18968.f60583 = m43196(path);
                }
                Matrix matrix2 = abstractC18968.f61420;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(m43182());
                if (this.f60673.f74552.f14355 != null) {
                    path.op(pathM43193, Path.Op.INTERSECT);
                }
                this.f60673 = (C22933) this.f60671.pop();
                return path;
            }
            return null;
        }
        if (abstractC18658 instanceof C17247) {
            C17247 c17247 = (C17247) abstractC18658;
            ArrayList arrayList = c17247.f47304;
            float fM26656 = 0.0f;
            float fM26658 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C10502) c17247.f47304.get(0)).m26658(this);
            ArrayList arrayList2 = c17247.f47307;
            float fM26657 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C10502) c17247.f47307.get(0)).m26656(this);
            ArrayList arrayList3 = c17247.f47305;
            float fM26659 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10502) c17247.f47305.get(0)).m26658(this);
            ArrayList arrayList4 = c17247.f47306;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fM26656 = ((C10502) c17247.f47306.get(0)).m26656(this);
            }
            if (this.f60673.f74552.f14357 != EnumC5252.Start) {
                float fM43184 = m43184((AbstractC10898) c17247);
                if (this.f60673.f74552.f14357 == EnumC5252.Middle) {
                    fM43184 /= 2.0f;
                }
                fM26658 -= fM43184;
            }
            if (c17247.f60583 == null) {
                C15172 c15172 = new C15172(this, fM26658, fM26657);
                m43207(c17247, c15172);
                RectF rectF = c15172.f49552;
                c17247.f60583 = new C5562(rectF.left, rectF.top, rectF.width(), c15172.f49552.height());
            }
            path = new Path();
            m43207(c17247, new C6704(this, fM26658 + fM26659, fM26657 + fM26656, path));
            Matrix matrix3 = c17247.f54951;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(m43182());
            if (this.f60673.f74552.f14355 != null) {
                path.op(pathM43193, Path.Op.INTERSECT);
            }
            this.f60673 = (C22933) this.f60671.pop();
            return path;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private Path.FillType m43182() {
        EnumC3444 enumC3444 = this.f60673.f74552.f14323;
        if (enumC3444 != null && enumC3444 == EnumC3444.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m43191(C14735 c14735) {
        float fM26658;
        float fM26656;
        Path path;
        C10502 c10502 = c14735.f48168;
        if (c10502 == null && c14735.f48172 == null) {
            fM26658 = 0.0f;
            fM26656 = 0.0f;
        } else {
            if (c10502 == null) {
                fM26658 = c14735.f48172.m26656(this);
            } else if (c14735.f48172 == null) {
                fM26658 = c10502.m26658(this);
            } else {
                fM26658 = c10502.m26658(this);
                fM26656 = c14735.f48172.m26656(this);
            }
            fM26656 = fM26658;
        }
        float fMin = Math.min(fM26658, c14735.f48169.m26658(this) / 2.0f);
        float fMin2 = Math.min(fM26656, c14735.f48171.m26656(this) / 2.0f);
        C10502 c10503 = c14735.f48170;
        float fM26659 = c10503 != null ? c10503.m26658(this) : 0.0f;
        C10502 c10504 = c14735.f48167;
        float fM26657 = c10504 != null ? c10504.m26656(this) : 0.0f;
        float fM266510 = c14735.f48169.m26658(this);
        float fM266511 = c14735.f48171.m26656(this);
        if (c14735.f60583 == null) {
            c14735.f60583 = new C5562(fM26659, fM26657, fM266510, fM266511);
        }
        float f = fM266510 + fM26659;
        float f2 = fM26657 + fM266511;
        Path path2 = new Path();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            path = path2;
            path.moveTo(fM26659, fM26657);
            path.lineTo(f, fM26657);
            path.lineTo(f, f2);
            path.lineTo(fM26659, f2);
            path.lineTo(fM26659, fM26657);
        } else {
            float f3 = fMin * 0.5522848f;
            float f4 = 0.5522848f * fMin2;
            float f5 = fM26657 + fMin2;
            path2.moveTo(fM26659, f5);
            float f6 = f5 - f4;
            float f7 = fM26659 + fMin;
            float f8 = f7 - f3;
            path2.cubicTo(fM26659, f6, f8, fM26657, f7, fM26657);
            float f9 = f - fMin;
            path2.lineTo(f9, fM26657);
            float f10 = f9 + f3;
            path2.cubicTo(f10, fM26657, f, f6, f, f5);
            float f11 = f2 - fMin2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, fM26659, f12, fM26659, f11);
            path.lineTo(fM26659, f5);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m43189(C1328 c1328) {
        C10502 c10502 = c1328.f5629;
        float fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
        C10502 c10503 = c1328.f5628;
        float fM26656 = c10503 != null ? c10503.m26656(this) : 0.0f;
        float fM26653 = c1328.f5630.m26653(this);
        float f = fM26658 - fM26653;
        float f2 = fM26656 - fM26653;
        float f3 = fM26658 + fM26653;
        float f4 = fM26656 + fM26653;
        if (c1328.f60583 == null) {
            float f5 = 2.0f * fM26653;
            c1328.f60583 = new C5562(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fM26653;
        Path path = new Path();
        path.moveTo(fM26658, f2);
        float f7 = fM26658 + f6;
        float f8 = fM26656 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fM26656);
        float f9 = fM26656 + f6;
        path.cubicTo(f3, f9, f7, f4, fM26658, f4);
        float f10 = fM26658 - f6;
        path.cubicTo(f10, f4, f, f9, f, fM26656);
        path.cubicTo(f, f8, f10, f2, fM26658, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m43192(C15441 c15441) {
        C10502 c10502 = c15441.f50323;
        float fM26658 = c10502 != null ? c10502.m26658(this) : 0.0f;
        C10502 c10503 = c15441.f50321;
        float fM26656 = c10503 != null ? c10503.m26656(this) : 0.0f;
        float fM26659 = c15441.f50324.m26658(this);
        float fM26657 = c15441.f50322.m26656(this);
        float f = fM26658 - fM26659;
        float f2 = fM26656 - fM26657;
        float f3 = fM26658 + fM26659;
        float f4 = fM26656 + fM26657;
        if (c15441.f60583 == null) {
            c15441.f60583 = new C5562(f, f2, fM26659 * 2.0f, 2.0f * fM26657);
        }
        float f5 = fM26659 * 0.5522848f;
        float f6 = 0.5522848f * fM26657;
        Path path = new Path();
        path.moveTo(fM26658, f2);
        float f7 = fM26658 + f5;
        float f8 = fM26656 - f6;
        float f9 = fM26656;
        path.cubicTo(f7, f2, f3, f8, f3, f9);
        float f10 = f6 + fM26656;
        path.cubicTo(f3, f10, f7, f4, fM26658, f4);
        float f11 = fM26658 - f5;
        path.cubicTo(f11, f4, f, f10, f, f9);
        path.cubicTo(f, f8, f11, f2, fM26658, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Path m43190(C11207 c11207) {
        Path path = new Path();
        float[] fArr = c11207.f37927;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c11207.f37927;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c11207 instanceof C23907) {
            path.close();
        }
        if (c11207.f60583 == null) {
            c11207.f60583 = m43196(path);
        }
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43202(C6267 c6267, String str) {
        AbstractC8075 abstractC8075M29087 = c6267.f30200.m29087(str);
        if (abstractC8075M29087 == null || !(abstractC8075M29087 instanceof C6267) || abstractC8075M29087 == c6267) {
            return;
        }
        C6267 c6268 = (C6267) abstractC8075M29087;
        if (c6267.f21245 == null) {
            c6267.f21245 = c6268.f21245;
        }
        if (c6267.f21247 == null) {
            c6267.f21247 = c6268.f21247;
        }
        if (c6267.f21248 == null) {
            c6267.f21248 = c6268.f21248;
        }
        if (c6267.f21249 == null) {
            c6267.f21249 = c6268.f21249;
        }
        if (c6267.f21251 == null) {
            c6267.f21251 = c6268.f21251;
        }
        if (c6267.f21252 == null) {
            c6267.f21252 = c6268.f21252;
        }
        if (c6267.f21246 == null) {
            c6267.f21246 = c6268.f21246;
        }
        if (c6267.f49442.isEmpty()) {
            c6267.f49442 = c6268.f49442;
        }
        if (c6267.f51260 == null) {
            c6267.f51260 = c6268.f51260;
        }
        if (c6267.f24454 == null) {
            c6267.f24454 = c6268.f24454;
        }
        String str2 = c6268.f21250;
        if (str2 != null) {
            m43202(c6267, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43209(C16146 c16146, C5562 c5562) {
        float fM26658;
        float fM26656;
        Boolean bool = c16146.f52174;
        if (bool != null && bool.booleanValue()) {
            C10502 c10502 = c16146.f52177;
            fM26658 = c10502 != null ? c10502.m26658(this) : c5562.f19074;
            C10502 c10503 = c16146.f52175;
            fM26656 = c10503 != null ? c10503.m26656(this) : c5562.f19075;
        } else {
            C10502 c10504 = c16146.f52177;
            float fM26654 = c10504 != null ? c10504.m26654(this, 1.0f) : 1.2f;
            C10502 c10505 = c16146.f52175;
            float fM26655 = c10505 != null ? c10505.m26654(this, 1.0f) : 1.2f;
            fM26658 = fM26654 * c5562.f19074;
            fM26656 = fM26655 * c5562.f19075;
        }
        if (fM26658 == 0.0f || fM26656 == 0.0f) {
            return;
        }
        m43223();
        C22933 c22933M43198 = m43198((AbstractC8075) c16146);
        this.f60673 = c22933M43198;
        c22933M43198.f74552.f14359 = Float.valueOf(1.0f);
        boolean zM43226 = m43226();
        Canvas canvas = this.f60666;
        canvas.save();
        Boolean bool2 = c16146.f52176;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c5562.f19077, c5562.f19076);
            canvas.scale(c5562.f19074, c5562.f19075);
        }
        m43208((AbstractC15131) c16146, false);
        canvas.restore();
        if (zM43226) {
            m43201(c5562);
        }
        m43183();
    }
}
