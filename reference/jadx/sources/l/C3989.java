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
import android.graphics.Rect;
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

/* JADX INFO: renamed from: l.ۘۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3989 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashSet f13642;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Stack f13643;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Stack f13647;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1752 f13648;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f13649;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Stack f13650;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Canvas f13651;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20397 f13654;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f13646 = new Matrix();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Matrix f13652 = new Matrix();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float[] f13653 = new float[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1621 f13644 = new C1621(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f13645 = 96.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12853(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public C3989(Canvas canvas, boolean z) {
        this.f13651 = canvas;
        this.f13649 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m12907() {
        return this.f13645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m12903() {
        return this.f13654.f65381.getTextSize();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m12906() {
        return this.f13654.f65381.getTextSize() / 2.0f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1621 m12905() {
        C20397 c20397 = this.f13654;
        C1621 c1621 = c20397.f65384;
        return c1621 != null ? c1621 : c20397.f65382;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12904(C1752 c1752, C5350 c5350) {
        this.f13648 = c1752;
        C3286 c3286M6193 = c1752.m6193();
        if (c3286M6193 == null) {
            return;
        }
        C1621 c1621 = c3286M6193.f32108;
        C12807 c12807 = c3286M6193.f25547;
        this.f13654 = new C20397();
        this.f13650 = new Stack();
        m12885(this.f13654, C23424.m52623());
        C20397 c20397 = this.f13654;
        c20397.f65382 = null;
        c20397.f65388 = false;
        this.f13650.push(new C20397(c20397));
        this.f13643 = new Stack();
        this.f13647 = new Stack();
        Boolean bool = c3286M6193.f45544;
        if (bool != null) {
            this.f13654.f65388 = bool.booleanValue();
        }
        m12893();
        C1621 c1622 = new C1621(c5350.f18786);
        C18028 c18028 = c3286M6193.f10711;
        if (c18028 != null) {
            c1622.f5585 = c18028.m42030(this, c1622.f5585);
        }
        C18028 c18029 = c3286M6193.f10708;
        if (c18029 != null) {
            c1622.f5582 = c18029.m42030(this, c1622.f5582);
        }
        m12870(c3286M6193, c1622, c1621, c12807);
        m12851();
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0349  */
    /* JADX WARN: Code duplicated, block: B:328:0x05d9 A[EDGE_INSN: B:328:0x05d9->B:332:0x05ec BREAK  A[LOOP:1: B:276:0x04cf->B:282:0x04e0]] */
    /* JADX WARN: Code duplicated, block: B:331:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:398:0x06d2 A[PHI: r15
      0x06d2: PHI (r15v9 ??) = (r15v1 ??), (r15v2 ??), (r15v3 ??), (r15v4 ??), (r15v5 ??), (r15v6 ??), (r15v7 ??), (r15v8 ??), (r15v11 ??) binds: [B:570:0x097d, B:523:0x08a9, B:489:0x0832, B:461:0x07cf, B:425:0x073a, B:397:0x06d0, B:373:0x0678, B:345:0x0613, B:226:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [l.ۘۜܺ] */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۘ۠ܺ, l.ۙۜܺ, l.ۜ۠ܺ, l.ۤۜܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v11, types: [l.ۘ۠ܺ, l.۟۠ܺ, l.ܰۖܺ, l.ܰ۠ܺ, l.ܿ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l.ۘ۠ܺ, l.ۛۖܺ, l.۬ۖܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v3, types: [l.ۘ۠ܺ, l.ۙ۠ܺ, l.ۛۖܺ, l.۬ۖܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v4, types: [l.֡ۖܺ, l.ۘ۠ܺ, l.ۛۖܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v5, types: [l.ۗۖܺ, l.ۘ۠ܺ, l.ۛۖܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v6, types: [l.ۘ۠ܺ, l.ۛۖܺ, l.ܰ۠ܺ, l.᩻ۖܺ] */
    /* JADX WARN: Type inference failed for: r15v7, types: [l.ۘ۠ܺ, l.ۛۖܺ, l.ܰ۠ܺ, l.᩷۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v8, types: [l.ۘ۠ܺ, l.ۛۖܺ, l.ۡۖܺ, l.ܰ۠ܺ] */
    /* JADX WARN: Type inference failed for: r15v9, types: [l.ۘ۠ܺ] */
    /* JADX WARN: Type inference failed for: r4v29, types: [l.ܿ۠ܺ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12879(C18202 c18202) {
        ?? r15;
        RectF rectF;
        C18028 c18028;
        Bitmap bitmapDecodeByteArray;
        int iIndexOf;
        Set setMo17931;
        C18028 c18029;
        AbstractC14472 abstractC14472M6183;
        Boolean bool;
        if (c18202 instanceof InterfaceC9823) {
            return;
        }
        m12893();
        if ((c18202 instanceof AbstractC14472) && (bool = ((AbstractC14472) c18202).f45544) != null) {
            this.f13654.f65388 = bool.booleanValue();
        }
        if (c18202 instanceof C3286) {
            C3286 c3286 = (C3286) c18202;
            m12870(c3286, m12865(c3286.f10710, c3286.f10709, c3286.f10711, c3286.f10708), c3286.f32108, c3286.f25547);
        } else {
            boolean zM12890 = true;
            float fM42032 = 0.0f;
            if (c18202 instanceof C12938) {
                C12938 c12938 = (C12938) c18202;
                Canvas canvas = this.f13651;
                C18028 c180210 = c12938.f41490;
                if ((c180210 == null || !c180210.m42034()) && ((c18029 = c12938.f41491) == null || !c18029.m42034())) {
                    m12884(this.f13654, c12938);
                    if (m12897() && (abstractC14472M6183 = c12938.f59446.m6183(c12938.f41487)) != null) {
                        Matrix matrix = c12938.f77641;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        C18028 c180211 = c12938.f41489;
                        float fM42033 = c180211 != null ? c180211.m42033(this) : 0.0f;
                        C18028 c180212 = c12938.f41488;
                        canvas.translate(fM42033, c180212 != null ? c180212.m42032(this) : 0.0f);
                        m12901(c12938, c12938.f13763);
                        boolean zM12891 = m12890();
                        m12887(c12938);
                        if (abstractC14472M6183 instanceof C3286) {
                            C3286 c3287 = (C3286) abstractC14472M6183;
                            C1621 c1621M12865 = m12865(null, null, c12938.f41490, c12938.f41491);
                            m12893();
                            m12870(c3287, c1621M12865, c3287.f32108, c3287.f25547);
                            m12851();
                        } else if (abstractC14472M6183 instanceof C9251) {
                            C18028 c180213 = c12938.f41490;
                            if (c180213 == null) {
                                c180213 = new C18028(100.0f, EnumC15175.percent);
                            }
                            C18028 c180214 = c12938.f41491;
                            if (c180214 == null) {
                                c180214 = new C18028(100.0f, EnumC15175.percent);
                            }
                            C1621 c1621M12866 = m12865(null, null, c180213, c180214);
                            m12893();
                            C9251 c9251 = (C9251) abstractC14472M6183;
                            if (c1621M12866.f5585 != 0.0f && c1621M12866.f5582 != 0.0f) {
                                C12807 c12807 = c9251.f25547;
                                if (c12807 == null) {
                                    c12807 = C12807.f41036;
                                }
                                m12884(this.f13654, c9251);
                                C20397 c20397 = this.f13654;
                                c20397.f65382 = c1621M12866;
                                if (!c20397.f65385.f75828.booleanValue()) {
                                    C1621 c1621 = this.f13654.f65382;
                                    m12867(c1621.f5584, c1621.f5583, c1621.f5585, c1621.f5582);
                                }
                                C1621 c1622 = c9251.f32108;
                                if (c1622 != null) {
                                    canvas.concat(m12856(this.f13654.f65382, c1622, c12807));
                                    this.f13654.f65384 = c9251.f32108;
                                } else {
                                    C1621 c1623 = this.f13654.f65382;
                                    canvas.translate(c1623.f5584, c1623.f5583);
                                }
                                boolean zM12892 = m12890();
                                m12878(c9251, true);
                                if (zM12892) {
                                    m12869(c9251.f13763);
                                }
                                m12891(c9251);
                            }
                            m12851();
                        } else {
                            m12879(abstractC14472M6183);
                        }
                        this.f13647.pop();
                        this.f13643.pop();
                        if (zM12891) {
                            m12869(c12938.f13763);
                        }
                        m12891(c12938);
                    }
                }
            } else if (c18202 instanceof C1049) {
                C1049 c1049 = (C1049) c18202;
                m12884(this.f13654, c1049);
                if (m12897()) {
                    Matrix matrix2 = c1049.f77641;
                    if (matrix2 != null) {
                        this.f13651.concat(matrix2);
                    }
                    m12901(c1049, c1049.f13763);
                    boolean zM12893 = m12890();
                    String language = Locale.getDefault().getLanguage();
                    for (?? r4 : c1049.f39383) {
                        if (r4 instanceof InterfaceC20440) {
                            InterfaceC20440 interfaceC20440 = (InterfaceC20440) r4;
                            if (interfaceC20440.mo17937() == null && ((setMo17931 = interfaceC20440.mo17931()) == null || (!setMo17931.isEmpty() && setMo17931.contains(language)))) {
                                Set setMo17939 = interfaceC20440.mo17939();
                                if (setMo17939 != null) {
                                    if (f13642 == null) {
                                        synchronized (C3989.class) {
                                            HashSet hashSet = new HashSet();
                                            f13642 = hashSet;
                                            hashSet.add("Structure");
                                            f13642.add("BasicStructure");
                                            f13642.add("ConditionalProcessing");
                                            f13642.add("Image");
                                            f13642.add("Style");
                                            f13642.add("ViewportAttribute");
                                            f13642.add("Shape");
                                            f13642.add("BasicText");
                                            f13642.add("PaintAttribute");
                                            f13642.add("BasicPaintAttribute");
                                            f13642.add("OpacityAttribute");
                                            f13642.add("BasicGraphicsAttribute");
                                            f13642.add("Marker");
                                            f13642.add("Gradient");
                                            f13642.add("Pattern");
                                            f13642.add("Clip");
                                            f13642.add("BasicClip");
                                            f13642.add("Mask");
                                            f13642.add("View");
                                        }
                                    }
                                    if (setMo17939.isEmpty() || !f13642.containsAll(setMo17939)) {
                                    }
                                }
                                Set setMo17936 = interfaceC20440.mo17936();
                                if (setMo17936 == null) {
                                    Set setMo17935 = interfaceC20440.mo17935();
                                    if (setMo17935 == null) {
                                        m12879(r4);
                                        break;
                                    }
                                    setMo17935.isEmpty();
                                } else {
                                    setMo17936.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM12893) {
                        m12869(c1049.f13763);
                    }
                    m12891(c1049);
                }
            } else if (c18202 instanceof C23996) {
                C23996 c23996 = (C23996) c18202;
                m12884(this.f13654, c23996);
                if (m12897()) {
                    Matrix matrix3 = c23996.f77641;
                    if (matrix3 != null) {
                        this.f13651.concat(matrix3);
                    }
                    m12901(c23996, c23996.f13763);
                    boolean zM12894 = m12890();
                    m12878(c23996, true);
                    if (zM12894) {
                        m12869(c23996.f13763);
                    }
                    m12891(c23996);
                }
            } else if (c18202 instanceof C14298) {
                r15 = (C14298) c18202;
                Canvas canvas2 = this.f13651;
                C18028 c180215 = r15.f45144;
                if (c180215 != null && !c180215.m42034() && (c18028 = r15.f45146) != null && !c18028.m42034() && r15.f45142 != null) {
                    C12807 c12808 = r15.f25547;
                    if (c12808 == null) {
                        c12808 = C12807.f41036;
                    }
                    InterfaceC21012 interfaceC21012M6194 = r15.f59446.m6194();
                    C10743 c10743Mo18846 = interfaceC21012M6194 == null ? null : interfaceC21012M6194.mo18846(r15.f45142);
                    if (interfaceC21012M6194 == null) {
                        String str = r15.f45142;
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception unused) {
                                bitmapDecodeByteArray = null;
                            }
                        } else {
                            bitmapDecodeByteArray = null;
                        }
                    } else if (c10743Mo18846 == null) {
                        bitmapDecodeByteArray = null;
                    } else {
                        bitmapDecodeByteArray = c10743Mo18846.f34105;
                    }
                    if ((bitmapDecodeByteArray != null || interfaceC21012M6194 != null) && bitmapDecodeByteArray != null) {
                        C1621 c1624 = new C1621(0.0f, 0.0f, c10743Mo18846 == null ? bitmapDecodeByteArray.getWidth() : c10743Mo18846.f34106, c10743Mo18846 == null ? bitmapDecodeByteArray.getHeight() : c10743Mo18846.f34107);
                        m12884(this.f13654, r15);
                        if (m12897() && m12896()) {
                            Matrix matrix4 = r15.f45145;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C18028 c180216 = r15.f45143;
                            float fM42034 = c180216 != null ? c180216.m42033(this) : 0.0f;
                            C18028 c180217 = r15.f45147;
                            float fM42035 = c180217 != null ? c180217.m42032(this) : 0.0f;
                            float fM42036 = r15.f45144.m42033(this);
                            float fM42037 = r15.f45146.m42033(this);
                            C20397 c20398 = this.f13654;
                            c20398.f65382 = new C1621(fM42034, fM42035, fM42036, fM42037);
                            if (!c20398.f65385.f75828.booleanValue()) {
                                C1621 c1625 = this.f13654.f65382;
                                m12867(c1625.f5584, c1625.f5583, c1625.f5585, c1625.f5582);
                            }
                            r15.f13763 = this.f13654.f65382;
                            m12891(r15);
                            m12901(r15, r15.f13763);
                            boolean zM12895 = m12890();
                            m12902();
                            canvas2.save();
                            canvas2.concat(m12856(this.f13654.f65382, c1624, c12808));
                            Paint paint = new Paint(this.f13654.f65385.f75816 == EnumC11489.optimizeSpeed ? 0 : 2);
                            if (c10743Mo18846 == null) {
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, paint);
                            } else {
                                canvas2.drawBitmap(bitmapDecodeByteArray, (Rect) null, new RectF(0.0f, 0.0f, c10743Mo18846.f34106, c10743Mo18846.f34107), paint);
                            }
                            canvas2.restore();
                            if (zM12895) {
                                m12869(r15.f13763);
                            }
                        }
                    }
                }
            } else if (c18202 instanceof C9077) {
                r15 = (C9077) c18202;
                Canvas canvas3 = this.f13651;
                if (r15.f29506 != null) {
                    m12884(this.f13654, r15);
                    if (m12897() && m12896()) {
                        C20397 c20399 = this.f13654;
                        if (c20399.f65383 || c20399.f65387) {
                            Matrix matrix5 = r15.f20824;
                            if (matrix5 != null) {
                                canvas3.concat(matrix5);
                            }
                            Path path = new C17413(r15.f29506).f56611;
                            if (r15.f13763 == null) {
                                r15.f13763 = m12864(path);
                            }
                            m12891(r15);
                            m12871(r15);
                            m12901(r15, r15.f13763);
                            C1621 c1626 = r15.f13763;
                            if (this.f13654.f65385.f75832.floatValue() >= 1.0f && this.f13654.f65385.f75839 == null) {
                                zM12890 = false;
                            } else if (this.f13649 && !canvas3.isHardwareAccelerated()) {
                                C23424 c23424 = this.f13654.f65385;
                                if (c23424.f75839 == null && c23424.f75844 == null && c23424.f75825 == null && c23424.f75843 == null && !(c23424.f75824 instanceof C0875) && !(c23424.f75835 instanceof C0875) && c23424.f75842 != EnumC15964.NonScalingStroke) {
                                    float[] fArr = new float[9];
                                    canvas3.getMatrix().getValues(fArr);
                                    int i = 0;
                                    while (true) {
                                        if (i >= 9) {
                                            if (fArr[1] != 0.0f || fArr[3] != 0.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 1.0f) {
                                                zM12890 = m12890();
                                                break;
                                            }
                                            float fAbs = Math.abs(fArr[0]);
                                            float fAbs2 = Math.abs(fArr[4]);
                                            if (fAbs != 0.0f && fAbs2 != 0.0f) {
                                                C20397 c203910 = this.f13654;
                                                if (!c203910.f65383) {
                                                    c1626.getClass();
                                                    rectF = new RectF(c1626.f5584, c1626.f5583, c1626.m5719(), c1626.m5720());
                                                    float f = -fM42032;
                                                    rectF.inset(f - (2.0f / fAbs), f - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left)) {
                                                        zM12890 = m12890();
                                                        break;
                                                    } else {
                                                        zM12890 = m12890();
                                                        break;
                                                    }
                                                }
                                                float strokeWidth = c203910.f65386.getStrokeWidth();
                                                if (strokeWidth > 0.0f) {
                                                    fM42032 = (this.f13654.f65386.getStrokeJoin() == Paint.Join.MITER ? Math.max(2.0f, this.f13654.f65386.getStrokeMiter()) : 2.0f) * strokeWidth * 0.5f;
                                                    c1626.getClass();
                                                    rectF = new RectF(c1626.f5584, c1626.f5583, c1626.m5719(), c1626.m5720());
                                                    float f2 = -fM42032;
                                                    rectF.inset(f2 - (2.0f / fAbs), f2 - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left) && !Float.isInfinite(rectF.left) && !Float.isNaN(rectF.top) && !Float.isInfinite(rectF.top) && !Float.isNaN(rectF.right) && !Float.isInfinite(rectF.right) && !Float.isNaN(rectF.bottom) && !Float.isInfinite(rectF.bottom)) {
                                                        canvas3.clipRect(rectF);
                                                        canvas3.saveLayerAlpha(rectF, m12853(this.f13654.f65385.f75832.floatValue()), 31);
                                                        this.f13650.push(this.f13654);
                                                        break;
                                                    }
                                                    zM12890 = m12890();
                                                    break;
                                                }
                                                zM12890 = m12890();
                                                break;
                                            }
                                            zM12890 = m12890();
                                            break;
                                        }
                                        float f3 = fArr[i];
                                        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
                                            zM12890 = m12890();
                                            break;
                                        }
                                        i++;
                                    }
                                } else {
                                    zM12890 = m12890();
                                }
                            } else {
                                zM12890 = m12890();
                            }
                            C20397 c203911 = this.f13654;
                            if (c203911.f65387) {
                                EnumC15218 enumC15218 = c203911.f65385.f75823;
                                path.setFillType((enumC15218 == null || enumC15218 != EnumC15218.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m12872(r15, path);
                            }
                            if (this.f13654.f65383) {
                                m12900(path);
                            }
                            m12875(r15);
                            if (zM12890) {
                                m12869(r15.f13763);
                            }
                        }
                    }
                }
            } else if (c18202 instanceof C21932) {
                r15 = (C21932) c18202;
                C18028 c180218 = r15.f70805;
                if (c180218 != null && r15.f70807 != null && !c180218.m42034() && !r15.f70807.m42034()) {
                    m12884(this.f13654, r15);
                    if (m12897() && m12896()) {
                        Matrix matrix6 = r15.f20824;
                        if (matrix6 != null) {
                            this.f13651.concat(matrix6);
                        }
                        Path pathM12860 = m12860(r15);
                        m12891(r15);
                        m12871(r15);
                        m12901(r15, r15.f13763);
                        boolean zM12896 = m12890();
                        if (this.f13654.f65387) {
                            m12872(r15, pathM12860);
                        }
                        if (this.f13654.f65383) {
                            m12900(pathM12860);
                        }
                        if (zM12896) {
                            m12869(r15.f13763);
                        }
                    }
                }
            } else if (c18202 instanceof C24742) {
                r15 = (C24742) c18202;
                C18028 c180219 = r15.f80121;
                if (c180219 != null && !c180219.m42034()) {
                    m12884(this.f13654, r15);
                    if (m12897() && m12896()) {
                        Matrix matrix7 = r15.f20824;
                        if (matrix7 != null) {
                            this.f13651.concat(matrix7);
                        }
                        Path pathM12861 = m12861(r15);
                        m12891(r15);
                        m12871(r15);
                        m12901(r15, r15.f13763);
                        boolean zM12897 = m12890();
                        if (this.f13654.f65387) {
                            m12872(r15, pathM12861);
                        }
                        if (this.f13654.f65383) {
                            m12900(pathM12861);
                        }
                        if (zM12897) {
                            m12869(r15.f13763);
                        }
                    }
                }
            } else if (c18202 instanceof C3112) {
                r15 = (C3112) c18202;
                C18028 c180220 = r15.f10083;
                if (c180220 != null && r15.f10082 != null && !c180220.m42034() && !r15.f10082.m42034()) {
                    m12884(this.f13654, r15);
                    if (m12897() && m12896()) {
                        Matrix matrix8 = r15.f20824;
                        if (matrix8 != null) {
                            this.f13651.concat(matrix8);
                        }
                        Path pathM12857 = m12857(r15);
                        m12891(r15);
                        m12871(r15);
                        m12901(r15, r15.f13763);
                        boolean zM12898 = m12890();
                        if (this.f13654.f65387) {
                            m12872(r15, pathM12857);
                        }
                        if (this.f13654.f65383) {
                            m12900(pathM12857);
                        }
                        if (zM12898) {
                            m12869(r15.f13763);
                        }
                    }
                }
            } else if (c18202 instanceof C0129) {
                r15 = (C0129) c18202;
                m12884(this.f13654, r15);
                if (m12897() && m12896() && this.f13654.f65383) {
                    Matrix matrix9 = r15.f20824;
                    if (matrix9 != null) {
                        this.f13651.concat(matrix9);
                    }
                    C18028 c180221 = r15.f1086;
                    float fM42038 = c180221 == null ? 0.0f : c180221.m42033(this);
                    C18028 c180222 = r15.f1085;
                    float fM42039 = c180222 == null ? 0.0f : c180222.m42032(this);
                    C18028 c180223 = r15.f1083;
                    float fM420310 = c180223 == null ? 0.0f : c180223.m42033(this);
                    C18028 c180224 = r15.f1084;
                    fM42032 = c180224 != null ? c180224.m42032(this) : 0.0f;
                    if (r15.f13763 == null) {
                        r15.f13763 = new C1621(Math.min(fM42038, fM420310), Math.min(fM42039, fM42032), Math.abs(fM420310 - fM42038), Math.abs(fM42032 - fM42039));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fM42038, fM42039);
                    path2.lineTo(fM420310, fM42032);
                    m12891(r15);
                    m12871(r15);
                    m12901(r15, r15.f13763);
                    boolean zM12899 = m12890();
                    m12900(path2);
                    m12875(r15);
                    if (zM12899) {
                        m12869(r15.f13763);
                    }
                }
            } else if (c18202 instanceof C4778) {
                r15 = (C4778) c18202;
                m12884(this.f13654, r15);
                if (m12897() && m12896()) {
                    C20397 c203912 = this.f13654;
                    if (c203912.f65383 || c203912.f65387) {
                        Matrix matrix10 = r15.f20824;
                        if (matrix10 != null) {
                            this.f13651.concat(matrix10);
                        }
                        if (r15.f43041.length >= 2) {
                            Path pathM12859 = m12859((C13552) r15);
                            m12891(r15);
                            m12871(r15);
                            m12901(r15, r15.f13763);
                            boolean zM128910 = m12890();
                            if (this.f13654.f65387) {
                                m12872(r15, pathM12859);
                            }
                            if (this.f13654.f65383) {
                                m12900(pathM12859);
                            }
                            m12875(r15);
                            if (zM128910) {
                                m12869(r15.f13763);
                            }
                        }
                    }
                }
            } else if (c18202 instanceof C13552) {
                r15 = (C13552) c18202;
                m12884(this.f13654, r15);
                if (m12897() && m12896()) {
                    C20397 c203913 = this.f13654;
                    if (c203913.f65383 || c203913.f65387) {
                        Matrix matrix11 = r15.f20824;
                        if (matrix11 != null) {
                            this.f13651.concat(matrix11);
                        }
                        if (r15.f43041.length >= 2) {
                            Path pathM128510 = m12859((C13552) r15);
                            m12891(r15);
                            EnumC15218 enumC15219 = this.f13654.f65385.f75823;
                            pathM128510.setFillType((enumC15219 == null || enumC15219 != EnumC15218.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            m12871(r15);
                            m12901(r15, r15.f13763);
                            boolean zM128911 = m12890();
                            if (this.f13654.f65387) {
                                m12872(r15, pathM128510);
                            }
                            if (this.f13654.f65383) {
                                m12900(pathM128510);
                            }
                            m12875(r15);
                            if (zM128911) {
                                m12869(r15.f13763);
                            }
                        }
                    }
                }
            } else if (c18202 instanceof C7015) {
                r15 = (C7015) c18202;
                m12884(this.f13654, r15);
                if (m12897()) {
                    Matrix matrix12 = r15.f23146;
                    if (matrix12 != null) {
                        this.f13651.concat(matrix12);
                    }
                    ArrayList arrayList = r15.f33967;
                    float fM420311 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C18028) r15.f33967.get(0)).m42033(this);
                    ArrayList arrayList2 = r15.f33969;
                    float fM420312 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C18028) r15.f33969.get(0)).m42032(this);
                    ArrayList arrayList3 = r15.f33968;
                    float fM420313 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C18028) r15.f33968.get(0)).m42033(this);
                    ArrayList arrayList4 = r15.f33970;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fM42032 = ((C18028) r15.f33970.get(0)).m42032(this);
                    }
                    EnumC24916 enumC24916M12895 = m12895();
                    if (enumC24916M12895 != EnumC24916.Start) {
                        float fM12852 = m12852(r15);
                        if (enumC24916M12895 == EnumC24916.Middle) {
                            fM12852 /= 2.0f;
                        }
                        fM420311 -= fM12852;
                    }
                    if (r15.f13763 == null) {
                        C12192 c12192 = new C12192(this, fM420311, fM420312);
                        m12874(r15, c12192);
                        RectF rectF2 = c12192.f39197;
                        r15.f13763 = new C1621(rectF2.left, rectF2.top, rectF2.width(), c12192.f39197.height());
                    }
                    m12891(r15);
                    m12871(r15);
                    m12901(r15, r15.f13763);
                    boolean zM128912 = m12890();
                    m12874(r15, new C23381(this, fM420311 + fM420313, fM420312 + fM42032));
                    if (zM128912) {
                        m12869(r15.f13763);
                    }
                }
            }
        }
        m12851();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12878(AbstractC12235 abstractC12235, boolean z) {
        if (z) {
            m12887((InterfaceC24170) abstractC12235);
        }
        Iterator it = abstractC12235.f39383.iterator();
        while (it.hasNext()) {
            m12879((C18202) it.next());
        }
        if (z) {
            this.f13647.pop();
            this.f13643.pop();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m12893() {
        this.f13651.save();
        this.f13650.push(this.f13654);
        this.f13654 = new C20397(this.f13654);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12851() {
        this.f13651.restore();
        this.f13654 = (C20397) this.f13650.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12887(InterfaceC24170 interfaceC24170) {
        this.f13647.push(interfaceC24170);
        Canvas canvas = this.f13651;
        Matrix matrix = this.f13652;
        canvas.getMatrix(matrix);
        Matrix matrix2 = new Matrix();
        Stack stack = this.f13643;
        if (!matrix.invert(matrix2)) {
            matrix2 = null;
        }
        stack.push(matrix2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12884(C20397 c20397, AbstractC14472 abstractC14472) {
        boolean z = abstractC14472.f59447 == null;
        C23424 c23424 = c20397.f65385;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c23424.f75838 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c23424.f75828 = bool;
        c23424.f75830 = null;
        c23424.f75841 = null;
        c23424.f75832 = fValueOf;
        c23424.f75847 = C17282.f56307;
        c23424.f75834 = fValueOf;
        c23424.f75839 = null;
        c23424.f75817 = null;
        c23424.f75812 = fValueOf;
        c23424.f75837 = null;
        c23424.f75810 = fValueOf;
        c23424.f75842 = EnumC15964.None;
        C23424 c23425 = abstractC14472.f45542;
        if (c23425 != null) {
            m12885(c20397, c23425);
        }
        if (this.f13648.m6192()) {
            for (C2562 c2562 : (ArrayList) this.f13648.m6182()) {
                if (C21758.m49322(c2562.f8233, abstractC14472)) {
                    m12885(c20397, c2562.f8234);
                }
            }
        }
        C23424 c23426 = abstractC14472.f45543;
        if (c23426 != null) {
            m12885(c20397, c23426);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020b A[LOOP:3: B:104:0x0205->B:106:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12872(AbstractC4032 abstractC4032, Path path) {
        float fM42033;
        float fM42032;
        float fM42034;
        float fM42035;
        Canvas canvas;
        C12807 c12807;
        Iterator it;
        AbstractC0303 abstractC0303 = this.f13654.f65385.f75824;
        boolean z = abstractC0303 instanceof C0875;
        Canvas canvas2 = this.f13651;
        if (z) {
            AbstractC14472 abstractC14472M6183 = this.f13648.m6183(((C0875) abstractC0303).f3262);
            if (abstractC14472M6183 instanceof C6841) {
                C6841 c6841 = (C6841) abstractC14472M6183;
                Boolean bool = c6841.f22751;
                boolean z2 = bool != null && bool.booleanValue();
                String str = c6841.f22749;
                if (str != null) {
                    m12876(c6841, str);
                }
                if (z2) {
                    C18028 c18028 = c6841.f22748;
                    fM42033 = c18028 != null ? c18028.m42033(this) : 0.0f;
                    C18028 c18029 = c6841.f22750;
                    fM42034 = c18029 != null ? c18029.m42032(this) : 0.0f;
                    C18028 c180210 = c6841.f22745;
                    fM42035 = c180210 != null ? c180210.m42033(this) : 0.0f;
                    C18028 c180211 = c6841.f22744;
                    fM42032 = c180211 != null ? c180211.m42032(this) : 0.0f;
                } else {
                    C18028 c180212 = c6841.f22748;
                    float fM42030 = c180212 != null ? c180212.m42030(this, 1.0f) : 0.0f;
                    C18028 c180213 = c6841.f22750;
                    float fM42031 = c180213 != null ? c180213.m42030(this, 1.0f) : 0.0f;
                    C18028 c180214 = c6841.f22745;
                    float fM42036 = c180214 != null ? c180214.m42030(this, 1.0f) : 0.0f;
                    C18028 c180215 = c6841.f22744;
                    float fM42037 = c180215 != null ? c180215.m42030(this, 1.0f) : 0.0f;
                    C1621 c1621 = abstractC4032.f13763;
                    float f = c1621.f5584;
                    float f2 = c1621.f5585;
                    fM42033 = (fM42030 * f2) + f;
                    float f3 = c1621.f5583;
                    float f4 = c1621.f5582;
                    float f5 = fM42036 * f2;
                    fM42032 = fM42037 * f4;
                    fM42034 = (fM42031 * f4) + f3;
                    fM42035 = f5;
                }
                if (fM42035 == 0.0f || fM42032 == 0.0f) {
                    return;
                }
                C12807 c12808 = c6841.f25547;
                if (c12808 == null) {
                    c12808 = C12807.f41036;
                }
                m12893();
                canvas2.clipPath(path);
                C20397 c20397 = new C20397();
                m12885(c20397, C23424.m52623());
                c20397.f65385.f75828 = Boolean.FALSE;
                m12880(c6841, c20397);
                this.f13654 = c20397;
                C1621 c1622 = abstractC4032.f13763;
                Matrix matrix = c6841.f22746;
                if (matrix != null) {
                    canvas2.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c6841.f22746.invert(matrix2)) {
                        C1621 c1623 = abstractC4032.f13763;
                        float f6 = c1623.f5584;
                        float f7 = c1623.f5583;
                        float fM5719 = c1623.m5719();
                        C1621 c1624 = abstractC4032.f13763;
                        float f8 = c1624.f5583;
                        float fM57110 = c1624.m5719();
                        float fM5720 = abstractC4032.f13763.m5720();
                        C1621 c1625 = abstractC4032.f13763;
                        float[] fArr = {f6, f7, fM5719, f8, fM57110, fM5720, c1625.f5584, c1625.m5720()};
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
                        c1622 = new C1621(f13, f14, rectF.right - f13, rectF.bottom - f14);
                    }
                }
                float fFloor = (((float) Math.floor((c1622.f5584 - fM42033) / fM42035)) * fM42035) + fM42033;
                float fM57111 = c1622.m5719();
                float fM5721 = c1622.m5720();
                C1621 c1626 = new C1621(0.0f, 0.0f, fM42035, fM42032);
                boolean zM12890 = m12890();
                for (float fFloor2 = (((float) Math.floor((c1622.f5583 - fM42034) / fM42032)) * fM42032) + fM42034; fFloor2 < fM5721; fFloor2 += fM42032) {
                    float f15 = fFloor;
                    while (f15 < fM57111) {
                        c1626.f5584 = f15;
                        c1626.f5583 = fFloor2;
                        m12893();
                        if (!this.f13654.f65385.f75828.booleanValue()) {
                            m12867(c1626.f5584, c1626.f5583, c1626.f5585, c1626.f5582);
                        }
                        C1621 c1627 = c6841.f32108;
                        if (c1627 != null) {
                            c12807 = c12808;
                            canvas = canvas2;
                            canvas.concat(m12856(c1626, c1627, c12807));
                        } else {
                            canvas = canvas2;
                            c12807 = c12808;
                            Boolean bool2 = c6841.f22747;
                            boolean z3 = bool2 == null || bool2.booleanValue();
                            canvas.translate(f15, fFloor2);
                            if (!z3) {
                                C1621 c1628 = abstractC4032.f13763;
                                canvas.scale(c1628.f5585, c1628.f5582);
                            }
                            it = c6841.f39383.iterator();
                            while (it.hasNext()) {
                                m12879((C18202) it.next());
                            }
                            m12851();
                            f15 += fM42035;
                            c12808 = c12807;
                            canvas2 = canvas;
                        }
                        it = c6841.f39383.iterator();
                        while (it.hasNext()) {
                            m12879((C18202) it.next());
                        }
                        m12851();
                        f15 += fM42035;
                        c12808 = c12807;
                        canvas2 = canvas;
                    }
                }
                if (zM12890) {
                    m12869(c6841.f13763);
                }
                m12851();
                return;
            }
        }
        canvas2.drawPath(path, this.f13654.f65381);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m12900(Path path) {
        C20397 c20397 = this.f13654;
        EnumC15964 enumC15964 = c20397.f65385.f75842;
        EnumC15964 enumC15965 = EnumC15964.NonScalingStroke;
        Canvas canvas = this.f13651;
        if (enumC15964 == enumC15965) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = this.f13654.f65386.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, this.f13654.f65386);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, c20397.f65386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12870(C3286 c3286, C1621 c1621, C1621 c1622, C12807 c12807) {
        if (c1621.f5585 == 0.0f || c1621.f5582 == 0.0f) {
            return;
        }
        if (c12807 == null && (c12807 = c3286.f25547) == null) {
            c12807 = C12807.f41036;
        }
        m12884(this.f13654, c3286);
        if (m12897()) {
            C20397 c20397 = this.f13654;
            c20397.f65382 = c1621;
            if (!c20397.f65385.f75828.booleanValue()) {
                C1621 c1623 = this.f13654.f65382;
                m12867(c1623.f5584, c1623.f5583, c1623.f5585, c1623.f5582);
            }
            m12901(c3286, this.f13654.f65382);
            Canvas canvas = this.f13651;
            if (c1622 != null) {
                canvas.concat(m12856(this.f13654.f65382, c1622, c12807));
                this.f13654.f65384 = c3286.f32108;
            } else {
                C1621 c1624 = this.f13654.f65382;
                canvas.translate(c1624.f5584, c1624.f5583);
            }
            boolean zM12890 = m12890();
            m12902();
            m12878((AbstractC12235) c3286, true);
            if (zM12890) {
                m12869(c3286.f13763);
            }
            m12891(c3286);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1621 m12865(C18028 c18028, C18028 c18029, C18028 c180210, C18028 c180211) {
        float fM42033 = c18028 != null ? c18028.m42033(this) : 0.0f;
        float fM42032 = c18029 != null ? c18029.m42032(this) : 0.0f;
        C1621 c1621M12905 = m12905();
        return new C1621(fM42033, fM42032, c180210 != null ? c180210.m42033(this) : c1621M12905.f5585, c180211 != null ? c180211.m42032(this) : c1621M12905.f5582);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m12891(AbstractC4032 abstractC4032) {
        Matrix matrix;
        if (abstractC4032.f59447 == null || abstractC4032.f13763 == null || (matrix = (Matrix) this.f13643.peek()) == null) {
            return;
        }
        Matrix matrix2 = this.f13646;
        matrix2.set(matrix);
        Canvas canvas = this.f13651;
        Matrix matrix3 = this.f13652;
        canvas.getMatrix(matrix3);
        matrix2.preConcat(matrix3);
        C1621 c1621 = abstractC4032.f13763;
        float f = c1621.f5584;
        float[] fArr = this.f13653;
        fArr[6] = f;
        fArr[0] = f;
        float f2 = c1621.f5583;
        fArr[3] = f2;
        fArr[1] = f2;
        float fM5719 = c1621.m5719();
        fArr[4] = fM5719;
        fArr[2] = fM5719;
        float fM5720 = abstractC4032.f13763.m5720();
        fArr[7] = fM5720;
        fArr[5] = fM5720;
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
        AbstractC4032 abstractC4033 = (AbstractC4032) this.f13647.peek();
        C1621 c1622 = abstractC4033.f13763;
        if (c1622 == null) {
            abstractC4033.f13763 = new C1621(f3, f4, f6 - f3, f5 - f4);
            return;
        }
        C1621 c1623 = this.f13644;
        c1623.f5584 = f3;
        c1623.f5583 = f4;
        c1623.f5585 = f6 - f3;
        c1623.f5582 = f5 - f4;
        c1622.getClass();
        float f9 = c1623.f5584;
        if (f9 < c1622.f5584) {
            c1622.f5584 = f9;
        }
        float f10 = c1623.f5583;
        if (f10 < c1622.f5583) {
            c1622.f5583 = f10;
        }
        if (c1623.m5719() > c1622.m5719()) {
            c1622.f5585 = c1623.m5719() - c1622.f5584;
        }
        if (c1623.m5720() > c1622.m5720()) {
            c1622.f5582 = c1623.m5720() - c1622.f5583;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12869(C1621 c1621) {
        if (this.f13654.f65385.f75839 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f13651;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C18774 c18774 = (C18774) this.f13648.m6183(this.f13654.f65385.f75839);
            m12881(c18774, c1621);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m12881(c18774, c1621);
            canvas.restore();
            canvas.restore();
        }
        m12851();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m12890() {
        AbstractC14472 abstractC14472M6183;
        if (this.f13654.f65385.f75832.floatValue() >= 1.0f && this.f13654.f65385.f75839 == null) {
            return false;
        }
        this.f13651.saveLayerAlpha(null, m12853(this.f13654.f65385.f75832.floatValue()), 31);
        this.f13650.push(this.f13654);
        C20397 c20397 = new C20397(this.f13654);
        this.f13654 = c20397;
        String str = c20397.f65385.f75839;
        if (str != null && ((abstractC14472M6183 = this.f13648.m6183(str)) == null || !(abstractC14472M6183 instanceof C18774))) {
            C23424 c23424 = this.f13654.f65385;
            String str2 = c23424.f75839;
            c23424.f75839 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1621 m12864(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C1621(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private EnumC24916 m12895() {
        EnumC24916 enumC24916;
        C23424 c23424 = this.f13654.f65385;
        if (c23424.f75820 == EnumC17456.LTR || (enumC24916 = c23424.f75815) == EnumC24916.Middle) {
            return c23424.f75815;
        }
        EnumC24916 enumC24917 = EnumC24916.Start;
        return enumC24916 == enumC24917 ? EnumC24916.End : enumC24917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12874(AbstractC4735 abstractC4735, AbstractC6227 abstractC6227) {
        float f;
        float fM42032;
        float fM42033;
        EnumC24916 enumC24916M12895;
        AbstractC14472 abstractC14472M6183;
        if (m12897()) {
            Iterator it = abstractC4735.f39383.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C18202 c18202 = (C18202) it.next();
                if (c18202 instanceof C19651) {
                    abstractC6227.mo10602(m12863(((C19651) c18202).f63296, z, !it.hasNext()));
                } else if (abstractC6227.mo10603((AbstractC4735) c18202)) {
                    float fM42034 = 0.0f;
                    if (c18202 instanceof C21889) {
                        m12893();
                        C21889 c21889 = (C21889) c18202;
                        m12884(this.f13654, c21889);
                        if (m12897() && m12896() && (abstractC14472M6183 = c21889.f59446.m6183(c21889.f70722)) != null) {
                            C9077 c9077 = (C9077) abstractC14472M6183;
                            Path path = new C17413(c9077.f29506).f56611;
                            Matrix matrix = c9077.f20824;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            C18028 c18028 = c21889.f70723;
                            fM42034 = c18028 != null ? c18028.m42030(this, pathMeasure.getLength()) : 0.0f;
                            EnumC24916 enumC24916M12896 = m12895();
                            if (enumC24916M12896 != EnumC24916.Start) {
                                float fM12852 = m12852((AbstractC4735) c21889);
                                if (enumC24916M12896 == EnumC24916.Middle) {
                                    fM12852 /= 2.0f;
                                }
                                fM42034 -= fM12852;
                            }
                            m12871((AbstractC4032) c21889.mo8467());
                            boolean zM12890 = m12890();
                            m12874(c21889, new C15921(this, path, fM42034));
                            if (zM12890) {
                                m12869(c21889.f13763);
                            }
                        }
                        m12851();
                    } else if (c18202 instanceof C8506) {
                        m12893();
                        C8506 c8506 = (C8506) c18202;
                        m12884(this.f13654, c8506);
                        if (m12897()) {
                            ArrayList arrayList = c8506.f33967;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC6227 instanceof C23381;
                            if (z3) {
                                float fM42035 = !z2 ? ((C23381) abstractC6227).f75689 : ((C18028) c8506.f33967.get(0)).m42033(this);
                                ArrayList arrayList2 = c8506.f33969;
                                fM42032 = (arrayList2 == null || arrayList2.size() == 0) ? ((C23381) abstractC6227).f75688 : ((C18028) c8506.f33969.get(0)).m42032(this);
                                ArrayList arrayList3 = c8506.f33968;
                                fM42033 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C18028) c8506.f33968.get(0)).m42033(this);
                                ArrayList arrayList4 = c8506.f33970;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fM42034 = ((C18028) c8506.f33970.get(0)).m42032(this);
                                }
                                f = fM42034;
                                fM42034 = fM42035;
                            } else {
                                f = 0.0f;
                                fM42032 = 0.0f;
                                fM42033 = 0.0f;
                            }
                            if (z2 && (enumC24916M12895 = m12895()) != EnumC24916.Start) {
                                float fM12853 = m12852((AbstractC4735) c8506);
                                if (enumC24916M12895 == EnumC24916.Middle) {
                                    fM12853 /= 2.0f;
                                }
                                fM42034 -= fM12853;
                            }
                            m12871((AbstractC4032) c8506.mo8467());
                            if (z3) {
                                C23381 c23381 = (C23381) abstractC6227;
                                c23381.f75689 = fM42034 + fM42033;
                                c23381.f75688 = fM42032 + f;
                            }
                            boolean zM12891 = m12890();
                            m12874(c8506, abstractC6227);
                            if (zM12891) {
                                m12869(c8506.f13763);
                            }
                        }
                        m12851();
                    } else if (c18202 instanceof C2540) {
                        m12893();
                        C2540 c2540 = (C2540) c18202;
                        m12884(this.f13654, c2540);
                        if (m12897()) {
                            m12871((AbstractC4032) c2540.mo8467());
                            AbstractC14472 abstractC14472M6184 = c18202.f59446.m6183(c2540.f8121);
                            if (abstractC14472M6184 != null && (abstractC14472M6184 instanceof AbstractC4735)) {
                                StringBuilder sb = new StringBuilder();
                                m12873((AbstractC4735) abstractC14472M6184, sb);
                                if (sb.length() > 0) {
                                    abstractC6227.mo10602(sb.toString());
                                }
                            }
                        }
                        m12851();
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m12852(AbstractC4735 abstractC4735) {
        C24127 c24127 = new C24127(this);
        m12874(abstractC4735, c24127);
        return c24127.f77973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12873(AbstractC4735 abstractC4735, StringBuilder sb) {
        Iterator it = abstractC4735.f39383.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C18202 c18202 = (C18202) it.next();
            if (c18202 instanceof AbstractC4735) {
                m12873((AbstractC4735) c18202, sb);
            } else if (c18202 instanceof C19651) {
                sb.append(m12863(((C19651) c18202).f63296, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m12863(String str, boolean z, boolean z2) {
        if (this.f13654.f65388) {
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m12897() {
        Boolean bool = this.f13654.f65385.f75838;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean m12896() {
        Boolean bool = this.f13654.f65385.f75821;
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
    public static android.graphics.Matrix m12856(l.C1621 r9, l.C1621 r10, l.C12807 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L9b
            l.ᩴۖܺ r1 = r11.m31770()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r9.f5585
            float r2 = r10.f5585
            float r1 = r1 / r2
            float r2 = r9.f5582
            float r3 = r10.f5582
            float r2 = r2 / r3
            float r3 = r10.f5584
            float r3 = -r3
            float r4 = r10.f5583
            float r4 = -r4
            l.۫ۖܺ r5 = l.C12807.f41037
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L35
            float r10 = r9.f5584
            float r9 = r9.f5583
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            l.ܳۖܺ r5 = r11.m31771()
            l.ܳۖܺ r6 = l.EnumC15044.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r9.f5585
            float r2 = r2 / r1
            float r5 = r9.f5582
            float r5 = r5 / r1
            int[] r6 = l.C11446.f35964
            l.ᩴۖܺ r7 = r11.m31770()
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
            float r7 = r10.f5585
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r10.f5585
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            l.ᩴۖܺ r11 = r11.m31770()
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
            float r10 = r10.f5582
            float r10 = r10 - r5
            goto L8d
        L89:
            float r10 = r10.f5582
            float r10 = r10 - r5
            float r10 = r10 / r8
        L8d:
            float r4 = r4 - r10
        L8e:
            float r10 = r9.f5584
            float r9 = r9.f5583
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3989.m12856(l.֫ۖܺ, l.֫ۖܺ, l.۫ۖܺ):android.graphics.Matrix");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12889(C23424 c23424, long j) {
        return (j & c23424.f75826) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12885(C20397 c20397, C23424 c23424) {
        if (m12889(c23424, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c20397.f65385.f75809 = c23424.f75809;
        }
        if (m12889(c23424, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c20397.f65385.f75832 = c23424.f75832;
        }
        boolean zM12889 = m12889(c23424, 1L);
        C17282 c17282 = C17282.f56306;
        if (zM12889) {
            c20397.f65385.f75824 = c23424.f75824;
            AbstractC0303 abstractC0303 = c23424.f75824;
            c20397.f65387 = (abstractC0303 == null || abstractC0303 == c17282) ? false : true;
        }
        if (m12889(c23424, 4L)) {
            c20397.f65385.f75811 = c23424.f75811;
        }
        if (m12889(c23424, 6149L)) {
            m12886(c20397, true, c20397.f65385.f75824);
        }
        if (m12889(c23424, 2L)) {
            c20397.f65385.f75823 = c23424.f75823;
        }
        if (m12889(c23424, 8L)) {
            c20397.f65385.f75835 = c23424.f75835;
            AbstractC0303 abstractC0304 = c23424.f75835;
            c20397.f65383 = (abstractC0304 == null || abstractC0304 == c17282) ? false : true;
        }
        if (m12889(c23424, 16L)) {
            c20397.f65385.f75818 = c23424.f75818;
        }
        if (m12889(c23424, 6168L)) {
            m12886(c20397, false, c20397.f65385.f75835);
        }
        if (m12889(c23424, 34359738368L)) {
            c20397.f65385.f75842 = c23424.f75842;
        }
        if (m12889(c23424, 32L)) {
            C23424 c23425 = c20397.f65385;
            C18028 c18028 = c23424.f75846;
            c23425.f75846 = c18028;
            c20397.f65386.setStrokeWidth(c18028.m42029(this));
        }
        if (m12889(c23424, 64L)) {
            C23424 c23426 = c20397.f65385;
            Paint paint = c20397.f65386;
            c23426.f75814 = c23424.f75814;
            int i = C11446.f35966[c23424.f75814.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m12889(c23424, 128L)) {
            C23424 c23427 = c20397.f65385;
            Paint paint2 = c20397.f65386;
            c23427.f75840 = c23424.f75840;
            int i2 = C11446.f35965[c23424.f75840.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m12889(c23424, 256L)) {
            c20397.f65385.f75827 = c23424.f75827;
            c20397.f65386.setStrokeMiter(c23424.f75827.floatValue());
        }
        if (m12889(c23424, 512L)) {
            c20397.f65385.f75833 = c23424.f75833;
        }
        if (m12889(c23424, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)) {
            c20397.f65385.f75845 = c23424.f75845;
        }
        Typeface typefaceM12862 = null;
        if (m12889(c23424, 1536L)) {
            C23424 c23428 = c20397.f65385;
            Paint paint3 = c20397.f65386;
            C18028[] c18028Arr = c23428.f75833;
            if (c18028Arr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c18028Arr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fM42029 = c23428.f75833[i4 % length].m42029(this);
                    fArr[i4] = fM42029;
                    f += fM42029;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fM420210 = c23428.f75845.m42029(this);
                    if (fM420210 < 0.0f) {
                        fM420210 = (fM420210 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fM420210));
                }
            }
        }
        if (m12889(c23424, 16384L)) {
            float fM12903 = m12903();
            c20397.f65385.f75822 = c23424.f75822;
            c20397.f65381.setTextSize(c23424.f75822.m42030(this, fM12903));
            c20397.f65386.setTextSize(c23424.f75822.m42030(this, fM12903));
        }
        if (m12889(c23424, 8192L)) {
            c20397.f65385.f75813 = c23424.f75813;
        }
        if (m12889(c23424, X931RNG.BLOCK64_RESEED_MAX)) {
            if (c23424.f75829.intValue() == -1 && c20397.f65385.f75829.intValue() > 100) {
                C23424 c23429 = c20397.f65385;
                c23429.f75829 = Integer.valueOf(c23429.f75829.intValue() - 100);
            } else if (c23424.f75829.intValue() == 1 && c20397.f65385.f75829.intValue() < 900) {
                C23424 c234210 = c20397.f65385;
                c234210.f75829 = Integer.valueOf(c234210.f75829.intValue() + 100);
            } else {
                c20397.f65385.f75829 = c23424.f75829;
            }
        }
        if (m12889(c23424, 65536L)) {
            c20397.f65385.f75819 = c23424.f75819;
        }
        if (m12889(c23424, 106496L)) {
            C23424 c234211 = c20397.f65385;
            ArrayList arrayList = c234211.f75813;
            if (arrayList != null && this.f13648 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceM12862 = m12862((String) it.next(), c234211.f75829, c234211.f75819)) == null) {
                }
            }
            if (typefaceM12862 == null) {
                typefaceM12862 = m12862("serif", c234211.f75829, c234211.f75819);
            }
            c20397.f65381.setTypeface(typefaceM12862);
            c20397.f65386.setTypeface(typefaceM12862);
        }
        if (m12889(c23424, 131072L)) {
            C23424 c234212 = c20397.f65385;
            Paint paint4 = c20397.f65386;
            Paint paint5 = c20397.f65381;
            c234212.f75831 = c23424.f75831;
            EnumC16710 enumC16710 = c23424.f75831;
            EnumC16710 enumC16711 = EnumC16710.LineThrough;
            paint5.setStrikeThruText(enumC16710 == enumC16711);
            EnumC16710 enumC16712 = c23424.f75831;
            EnumC16710 enumC16713 = EnumC16710.Underline;
            paint5.setUnderlineText(enumC16712 == enumC16713);
            paint4.setStrikeThruText(c23424.f75831 == enumC16711);
            paint4.setUnderlineText(c23424.f75831 == enumC16713);
        }
        if (m12889(c23424, 68719476736L)) {
            c20397.f65385.f75820 = c23424.f75820;
        }
        if (m12889(c23424, 262144L)) {
            c20397.f65385.f75815 = c23424.f75815;
        }
        if (m12889(c23424, 524288L)) {
            c20397.f65385.f75828 = c23424.f75828;
        }
        if (m12889(c23424, 2097152L)) {
            c20397.f65385.f75844 = c23424.f75844;
        }
        if (m12889(c23424, 4194304L)) {
            c20397.f65385.f75825 = c23424.f75825;
        }
        if (m12889(c23424, X931RNG.BLOCK128_RESEED_MAX)) {
            c20397.f65385.f75843 = c23424.f75843;
        }
        if (m12889(c23424, 16777216L)) {
            c20397.f65385.f75838 = c23424.f75838;
        }
        if (m12889(c23424, 33554432L)) {
            c20397.f65385.f75821 = c23424.f75821;
        }
        if (m12889(c23424, 1048576L)) {
            c20397.f65385.f75830 = c23424.f75830;
        }
        if (m12889(c23424, 268435456L)) {
            c20397.f65385.f75841 = c23424.f75841;
        }
        if (m12889(c23424, 536870912L)) {
            c20397.f65385.f75836 = c23424.f75836;
        }
        if (m12889(c23424, 1073741824L)) {
            c20397.f65385.f75839 = c23424.f75839;
        }
        if (m12889(c23424, 67108864L)) {
            c20397.f65385.f75847 = c23424.f75847;
        }
        if (m12889(c23424, 134217728L)) {
            c20397.f65385.f75834 = c23424.f75834;
        }
        if (m12889(c23424, 8589934592L)) {
            c20397.f65385.f75837 = c23424.f75837;
        }
        if (m12889(c23424, 17179869184L)) {
            c20397.f65385.f75810 = c23424.f75810;
        }
        if (m12889(c23424, 137438953472L)) {
            c20397.f65385.f75816 = c23424.f75816;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12886(C20397 c20397, boolean z, AbstractC0303 abstractC0303) {
        int i;
        C23424 c23424 = c20397.f65385;
        float fFloatValue = (z ? c23424.f75811 : c23424.f75818).floatValue();
        if (abstractC0303 instanceof C17282) {
            i = ((C17282) abstractC0303).f56308;
        } else if (!(abstractC0303 instanceof C15790)) {
            return;
        } else {
            i = c20397.f65385.f75809.f56308;
        }
        int iM12854 = m12854(fFloatValue, i);
        if (z) {
            c20397.f65381.setColor(iM12854);
        } else {
            c20397.f65386.setColor(iM12854);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m12862(String str, Integer num, EnumC12981 enumC12981) {
        int i;
        boolean z = enumC12981 == EnumC12981.Italic;
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
    public static int m12854(float f, int i) {
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
    private void m12867(float f, float f2, float f3, float f4) {
        float fM42033 = f3 + f;
        float fM42032 = f4 + f2;
        C11315 c11315 = this.f13654.f65385.f75830;
        if (c11315 != null) {
            f += c11315.f35663.m42033(this);
            f2 += this.f13654.f65385.f75830.f35664.m42032(this);
            fM42033 -= this.f13654.f65385.f75830.f35662.m42033(this);
            fM42032 -= this.f13654.f65385.f75830.f35661.m42032(this);
        }
        this.f13651.clipRect(f, f2, fM42033, fM42032);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m12902() {
        int iM12854;
        C23424 c23424 = this.f13654.f65385;
        AbstractC0303 abstractC0303 = c23424.f75837;
        if (abstractC0303 instanceof C17282) {
            iM12854 = ((C17282) abstractC0303).f56308;
        } else if (!(abstractC0303 instanceof C15790)) {
            return;
        } else {
            iM12854 = c23424.f75809.f56308;
        }
        Float f = c23424.f75810;
        if (f != null) {
            iM12854 = m12854(f.floatValue(), iM12854);
        }
        this.f13651.drawColor(iM12854);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12868(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC8332 interfaceC8332) {
        double dAcos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC8332.mo8042(f6, f7);
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
            interfaceC8332.mo8039(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12875(AbstractC6096 abstractC6096) {
        C7587 c7587;
        C7587 c7588;
        C7587 c7589;
        ArrayList arrayList;
        float f;
        float f2;
        ArrayList arrayListM55398;
        int size;
        C23424 c23424 = this.f13654.f65385;
        String str = c23424.f75844;
        if (str == null && c23424.f75825 == null && c23424.f75843 == null) {
            return;
        }
        if (str == null) {
            c7587 = null;
        } else {
            AbstractC14472 abstractC14472M6183 = abstractC6096.f59446.m6183(str);
            if (abstractC14472M6183 != null) {
                c7587 = (C7587) abstractC14472M6183;
            } else {
                String str2 = this.f13654.f65385.f75844;
                c7587 = null;
            }
        }
        String str3 = this.f13654.f65385.f75825;
        if (str3 == null) {
            c7588 = null;
        } else {
            AbstractC14472 abstractC14472M6184 = abstractC6096.f59446.m6183(str3);
            if (abstractC14472M6184 != null) {
                c7588 = (C7587) abstractC14472M6184;
            } else {
                String str4 = this.f13654.f65385.f75825;
                c7588 = null;
            }
        }
        String str5 = this.f13654.f65385.f75843;
        if (str5 == null) {
            c7589 = null;
        } else {
            AbstractC14472 abstractC14472M6185 = abstractC6096.f59446.m6183(str5);
            if (abstractC14472M6185 != null) {
                c7589 = (C7587) abstractC14472M6185;
            } else {
                String str6 = this.f13654.f65385.f75843;
                c7589 = null;
            }
        }
        if (abstractC6096 instanceof C9077) {
            arrayListM55398 = new C24873(this, ((C9077) abstractC6096).f29506).m55398();
        } else {
            if (abstractC6096 instanceof C0129) {
                C0129 c0129 = (C0129) abstractC6096;
                C18028 c18028 = c0129.f1086;
                float fM42033 = c18028 != null ? c18028.m42033(this) : 0.0f;
                C18028 c18029 = c0129.f1085;
                float fM42032 = c18029 != null ? c18029.m42032(this) : 0.0f;
                C18028 c180210 = c0129.f1083;
                float fM42034 = c180210 != null ? c180210.m42033(this) : 0.0f;
                C18028 c180211 = c0129.f1084;
                float fM42035 = c180211 != null ? c180211.m42032(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f3 = fM42034 - fM42033;
                float f4 = fM42035 - fM42032;
                arrayList.add(new C16667(fM42033, fM42032, f3, f4));
                arrayList.add(new C16667(fM42034, fM42035, f3, f4));
            } else {
                C13552 c13552 = (C13552) abstractC6096;
                int length = c13552.f43041.length;
                if (length < 2) {
                    arrayListM55398 = null;
                } else {
                    arrayList = new ArrayList();
                    float[] fArr = c13552.f43041;
                    C16667 c16667 = new C16667(fArr[0], fArr[1], 0.0f, 0.0f);
                    int i = 2;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    while (true) {
                        f = c16667.f53843;
                        f2 = c16667.f53845;
                        if (i >= length) {
                            break;
                        }
                        float[] fArr2 = c13552.f43041;
                        float f7 = fArr2[i];
                        float f8 = fArr2[i + 1];
                        c16667.m39376(f7, f8);
                        arrayList.add(c16667);
                        c16667 = new C16667(f7, f8, f7 - f2, f8 - f);
                        i += 2;
                        f6 = f8;
                        f5 = f7;
                    }
                    if (c13552 instanceof C4778) {
                        float[] fArr3 = c13552.f43041;
                        float f9 = fArr3[0];
                        if (f5 != f9) {
                            float f10 = fArr3[1];
                            if (f6 != f10) {
                                c16667.m39376(f9, f10);
                                arrayList.add(c16667);
                                C16667 c16668 = new C16667(f9, f10, f9 - f2, f10 - f);
                                c16668.m39377((C16667) arrayList.get(0));
                                arrayList.add(c16668);
                                arrayList.set(0, c16668);
                            }
                        }
                    } else {
                        arrayList.add(c16667);
                    }
                }
            }
            arrayListM55398 = arrayList;
        }
        if (arrayListM55398 == null || (size = arrayListM55398.size()) == 0) {
            return;
        }
        C23424 c23425 = this.f13654.f65385;
        c23425.f75843 = null;
        c23425.f75825 = null;
        c23425.f75844 = null;
        if (c7587 != null) {
            m12877(c7587, (C16667) arrayListM55398.get(0));
        }
        if (c7588 != null && arrayListM55398.size() > 2) {
            int i2 = 1;
            C16667 c16669 = (C16667) arrayListM55398.get(0);
            C16667 c166610 = (C16667) arrayListM55398.get(1);
            while (i2 < size - 1) {
                i2++;
                C16667 c166611 = (C16667) arrayListM55398.get(i2);
                if (c166610.f53842) {
                    float f11 = c166610.f53841;
                    float f12 = c166610.f53844;
                    float f13 = c166610.f53845;
                    float f14 = f13 - c16669.f53845;
                    float f15 = c166610.f53843;
                    float f16 = ((f15 - c16669.f53843) * f12) + (f14 * f11);
                    if (f16 == 0.0f) {
                        f16 = ((c166611.f53845 - f13) * f11) + ((c166611.f53843 - f15) * f12);
                    }
                    if (f16 <= 0.0f && (f16 != 0.0f || (f11 <= 0.0f && f12 < 0.0f))) {
                        c166610.f53841 = -f11;
                        c166610.f53844 = -f12;
                    }
                }
                m12877(c7588, c166610);
                c16669 = c166610;
                c166610 = c166611;
            }
        }
        if (c7589 != null) {
            m12877(c7589, (C16667) arrayListM55398.get(size - 1));
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
    private void m12877(l.C7587 r13, l.C16667 r14) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3989.m12877(l.۟ۖܺ, l.ܺۜܺ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20397 m12866(AbstractC14472 abstractC14472) {
        C20397 c20397 = new C20397();
        m12885(c20397, C23424.m52623());
        m12880(abstractC14472, c20397);
        return c20397;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12880(C18202 c18202, C20397 c20397) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c18202 instanceof AbstractC14472) {
                arrayList.add(0, (AbstractC14472) c18202);
            }
            Object obj = c18202.f59447;
            if (obj == null) {
                break;
            } else {
                c18202 = (C18202) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m12884(c20397, (AbstractC14472) it.next());
        }
        C20397 c20398 = this.f13654;
        c20397.f65384 = c20398.f65384;
        c20397.f65382 = c20398.f65382;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12871(AbstractC4032 abstractC4032) {
        AbstractC0303 abstractC0303 = this.f13654.f65385.f75824;
        if (abstractC0303 instanceof C0875) {
            m12888(true, abstractC4032.f13763, (C0875) abstractC0303);
        }
        AbstractC0303 abstractC0304 = this.f13654.f65385.f75835;
        if (abstractC0304 instanceof C0875) {
            m12888(false, abstractC4032.f13763, (C0875) abstractC0304);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12888(boolean z, C1621 c1621, C0875 c0875) {
        float fM42030;
        float fM42031;
        float fM42032;
        float fM42033;
        float f;
        float f2;
        float f3;
        AbstractC14472 abstractC14472M6183 = this.f13648.m6183(c0875.f3262);
        int i = 0;
        int i2 = 0;
        if (abstractC14472M6183 == null) {
            AbstractC0303 abstractC0303 = c0875.f3261;
            if (abstractC0303 != null) {
                m12886(this.f13654, z, abstractC0303);
                return;
            } else if (z) {
                this.f13654.f65387 = false;
                return;
            } else {
                this.f13654.f65383 = false;
                return;
            }
        }
        boolean z2 = abstractC14472M6183 instanceof C21186;
        C17282 c17282 = C17282.f56307;
        float f4 = -1.0f;
        if (z2) {
            C21186 c21186 = (C21186) abstractC14472M6183;
            String str = c21186.f65079;
            if (str != null) {
                m12883(c21186, str);
            }
            Boolean bool = c21186.f65077;
            boolean z3 = bool != null && bool.booleanValue();
            C20397 c20397 = this.f13654;
            Paint paint = z ? c20397.f65381 : c20397.f65386;
            if (z3) {
                C1621 c1621M12905 = m12905();
                C18028 c18028 = c21186.f67656;
                float fM42034 = c18028 != null ? c18028.m42033(this) : 0.0f;
                C18028 c18029 = c21186.f67657;
                float fM42035 = c18029 != null ? c18029.m42032(this) : 0.0f;
                C18028 c180210 = c21186.f67655;
                float fM42036 = c180210 != null ? c180210.m42033(this) : c1621M12905.f5585;
                C18028 c180211 = c21186.f67654;
                f3 = fM42036;
                f = fM42034;
                f2 = fM42035;
                fM42033 = c180211 != null ? c180211.m42032(this) : 0.0f;
            } else {
                C18028 c180212 = c21186.f67656;
                float fM42037 = c180212 != null ? c180212.m42030(this, 1.0f) : 0.0f;
                C18028 c180213 = c21186.f67657;
                float fM42038 = c180213 != null ? c180213.m42030(this, 1.0f) : 0.0f;
                C18028 c180214 = c21186.f67655;
                float fM42039 = c180214 != null ? c180214.m42030(this, 1.0f) : 1.0f;
                C18028 c180215 = c21186.f67654;
                fM42033 = c180215 != null ? c180215.m42030(this, 1.0f) : 0.0f;
                f = fM42037;
                f2 = fM42038;
                f3 = fM42039;
            }
            m12893();
            this.f13654 = m12866((AbstractC14472) c21186);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c1621.f5584, c1621.f5583);
                matrix.preScale(c1621.f5585, c1621.f5582);
            }
            Matrix matrix2 = c21186.f65075;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c21186.f65076.size();
            if (size == 0) {
                m12851();
                if (z) {
                    this.f13654.f65387 = false;
                    return;
                } else {
                    this.f13654.f65383 = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c21186.f65076.iterator();
            while (it.hasNext()) {
                C19694 c19694 = (C19694) ((C18202) it.next());
                Float f5 = c19694.f63420;
                float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
                if (i == 0 || fFloatValue >= f4) {
                    fArr[i] = fFloatValue;
                    f4 = fFloatValue;
                } else {
                    fArr[i] = f4;
                }
                m12893();
                m12884(this.f13654, c19694);
                C23424 c23424 = this.f13654.f65385;
                C17282 c17283 = (C17282) c23424.f75847;
                if (c17283 == null) {
                    c17283 = c17282;
                }
                iArr[i] = m12854(c23424.f75834.floatValue(), c17283.f56308);
                i++;
                m12851();
            }
            if ((f == f3 && f2 == fM42033) || size == 1) {
                m12851();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            EnumC12061 enumC12061 = c21186.f65078;
            if (enumC12061 != null) {
                if (enumC12061 == EnumC12061.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC12061 == EnumC12061.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m12851();
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, fM42033, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m12853(this.f13654.f65385.f75811.floatValue()));
            return;
        }
        if (abstractC14472M6183 instanceof C18948) {
            C18948 c18948 = (C18948) abstractC14472M6183;
            String str2 = c18948.f65079;
            if (str2 != null) {
                m12883(c18948, str2);
            }
            Boolean bool2 = c18948.f65077;
            boolean z4 = bool2 != null && bool2.booleanValue();
            C20397 c20398 = this.f13654;
            Paint paint2 = z ? c20398.f65381 : c20398.f65386;
            if (z4) {
                C18028 c180216 = new C18028(50.0f, EnumC15175.percent);
                C18028 c180217 = c18948.f61450;
                fM42030 = c180217 != null ? c180217.m42033(this) : c180216.m42033(this);
                C18028 c180218 = c18948.f61449;
                fM42031 = c180218 != null ? c180218.m42032(this) : c180216.m42032(this);
                C18028 c180219 = c18948.f61451;
                fM42032 = c180219 != null ? c180219.m42029(this) : c180216.m42029(this);
            } else {
                C18028 c180220 = c18948.f61450;
                fM42030 = c180220 != null ? c180220.m42030(this, 1.0f) : 0.5f;
                C18028 c180221 = c18948.f61449;
                fM42031 = c180221 != null ? c180221.m42030(this, 1.0f) : 0.5f;
                C18028 c180222 = c18948.f61451;
                fM42032 = c180222 != null ? c180222.m42030(this, 1.0f) : 0.5f;
            }
            float f6 = fM42032;
            float f7 = fM42030;
            float f8 = fM42031;
            m12893();
            this.f13654 = m12866((AbstractC14472) c18948);
            Matrix matrix3 = new Matrix();
            if (!z4) {
                matrix3.preTranslate(c1621.f5584, c1621.f5583);
                matrix3.preScale(c1621.f5585, c1621.f5582);
            }
            Matrix matrix4 = c18948.f65075;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c18948.f65076.size();
            if (size2 == 0) {
                m12851();
                if (z) {
                    this.f13654.f65387 = false;
                    return;
                } else {
                    this.f13654.f65383 = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator it2 = c18948.f65076.iterator();
            while (it2.hasNext()) {
                C19694 c19695 = (C19694) ((C18202) it2.next());
                Float f9 = c19695.f63420;
                float fFloatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                if (i2 == 0 || fFloatValue2 >= f4) {
                    fArr2[i2] = fFloatValue2;
                    f4 = fFloatValue2;
                } else {
                    fArr2[i2] = f4;
                }
                m12893();
                m12884(this.f13654, c19695);
                C23424 c23425 = this.f13654.f65385;
                C17282 c17284 = (C17282) c23425.f75847;
                if (c17284 == null) {
                    c17284 = c17282;
                }
                iArr2[i2] = m12854(c23425.f75834.floatValue(), c17284.f56308);
                i2++;
                m12851();
            }
            if (f6 == 0.0f || size2 == 1) {
                m12851();
                paint2.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            EnumC12061 enumC12062 = c18948.f65078;
            if (enumC12062 != null) {
                if (enumC12062 == EnumC12061.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (enumC12062 == EnumC12061.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            m12851();
            RadialGradient radialGradient = new RadialGradient(f7, f8, f6, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint2.setShader(radialGradient);
            paint2.setAlpha(m12853(this.f13654.f65385.f75811.floatValue()));
            return;
        }
        if (abstractC14472M6183 instanceof C22678) {
            C22678 c22678 = (C22678) abstractC14472M6183;
            if (z) {
                if (m12889(c22678.f45542, 2147483648L)) {
                    C20397 c20399 = this.f13654;
                    C23424 c23426 = c20399.f65385;
                    AbstractC0303 abstractC0304 = c22678.f45542.f75817;
                    c23426.f75824 = abstractC0304;
                    c20399.f65387 = abstractC0304 != null;
                }
                if (m12889(c22678.f45542, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                    this.f13654.f65385.f75811 = c22678.f45542.f75812;
                }
                if (m12889(c22678.f45542, 6442450944L)) {
                    C20397 c203910 = this.f13654;
                    m12886(c203910, z, c203910.f65385.f75824);
                    return;
                }
                return;
            }
            if (m12889(c22678.f45542, 2147483648L)) {
                C20397 c203911 = this.f13654;
                C23424 c23427 = c203911.f65385;
                AbstractC0303 abstractC0305 = c22678.f45542.f75817;
                c23427.f75835 = abstractC0305;
                c203911.f65383 = abstractC0305 != null;
            }
            if (m12889(c22678.f45542, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                this.f13654.f65385.f75818 = c22678.f45542.f75812;
            }
            if (m12889(c22678.f45542, 6442450944L)) {
                C20397 c203912 = this.f13654;
                m12886(c203912, z, c203912.f65385.f75835);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12883(AbstractC20266 abstractC20266, String str) {
        AbstractC14472 abstractC14472M6183 = abstractC20266.f59446.m6183(str);
        if (abstractC14472M6183 == null || !(abstractC14472M6183 instanceof AbstractC20266) || abstractC14472M6183 == abstractC20266) {
            return;
        }
        AbstractC20266 abstractC20267 = (AbstractC20266) abstractC14472M6183;
        if (abstractC20266.f65077 == null) {
            abstractC20266.f65077 = abstractC20267.f65077;
        }
        if (abstractC20266.f65075 == null) {
            abstractC20266.f65075 = abstractC20267.f65075;
        }
        if (abstractC20266.f65078 == null) {
            abstractC20266.f65078 = abstractC20267.f65078;
        }
        if (abstractC20266.f65076.isEmpty()) {
            abstractC20266.f65076 = abstractC20267.f65076;
        }
        try {
            if (abstractC20266 instanceof C21186) {
                C21186 c21186 = (C21186) abstractC20266;
                C21186 c21187 = (C21186) abstractC14472M6183;
                if (c21186.f67656 == null) {
                    c21186.f67656 = c21187.f67656;
                }
                if (c21186.f67657 == null) {
                    c21186.f67657 = c21187.f67657;
                }
                if (c21186.f67655 == null) {
                    c21186.f67655 = c21187.f67655;
                }
                if (c21186.f67654 == null) {
                    c21186.f67654 = c21187.f67654;
                }
            } else {
                m12882((C18948) abstractC20266, (C18948) abstractC14472M6183);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC20267.f65079;
        if (str2 != null) {
            m12883(abstractC20266, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12882(C18948 c18948, C18948 c18949) {
        if (c18948.f61450 == null) {
            c18948.f61450 = c18949.f61450;
        }
        if (c18948.f61449 == null) {
            c18948.f61449 = c18949.f61449;
        }
        if (c18948.f61451 == null) {
            c18948.f61451 = c18949.f61451;
        }
        if (c18948.f61452 == null) {
            c18948.f61452 = c18949.f61452;
        }
        if (c18948.f61448 == null) {
            c18948.f61448 = c18949.f61448;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m12901(AbstractC4032 abstractC4032, C1621 c1621) {
        Path pathM12858;
        if (this.f13654.f65385.f75841 == null || (pathM12858 = m12858(abstractC4032, c1621)) == null) {
            return;
        }
        this.f13651.clipPath(pathM12858);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m12858(AbstractC4032 abstractC4032, C1621 c1621) {
        Path pathM12898;
        AbstractC14472 abstractC14472M6183 = abstractC4032.f59446.m6183(this.f13654.f65385.f75841);
        if (abstractC14472M6183 == null) {
            String str = this.f13654.f65385.f75841;
            return null;
        }
        C16536 c16536 = (C16536) abstractC14472M6183;
        this.f13650.push(this.f13654);
        this.f13654 = m12866((AbstractC14472) c16536);
        Boolean bool = c16536.f53532;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c1621.f5584, c1621.f5583);
            matrix.preScale(c1621.f5585, c1621.f5582);
        }
        Matrix matrix2 = c16536.f77641;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C18202 c18202 : c16536.f39383) {
            if ((c18202 instanceof AbstractC4032) && (pathM12898 = m12898((AbstractC4032) c18202)) != null) {
                path.op(pathM12898, Path.Op.UNION);
            }
        }
        if (this.f13654.f65385.f75841 != null) {
            if (c16536.f13763 == null) {
                c16536.f13763 = m12864(path);
            }
            Path pathM12858 = m12858(c16536, c16536.f13763);
            if (pathM12858 != null) {
                path.op(pathM12858, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f13654 = (C20397) this.f13650.pop();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    @TargetApi(19)
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Path m12898(AbstractC4032 abstractC4032) {
        Path path;
        Path pathM12858;
        this.f13650.push(this.f13654);
        C20397 c20397 = new C20397(this.f13654);
        this.f13654 = c20397;
        m12884(c20397, abstractC4032);
        if (!m12897() || !m12896()) {
            this.f13654 = (C20397) this.f13650.pop();
            return null;
        }
        if (abstractC4032 instanceof C12938) {
            C12938 c12938 = (C12938) abstractC4032;
            AbstractC14472 abstractC14472M6183 = abstractC4032.f59446.m6183(c12938.f41487);
            if (abstractC14472M6183 == null) {
                this.f13654 = (C20397) this.f13650.pop();
                return null;
            }
            if (!(abstractC14472M6183 instanceof AbstractC4032)) {
                this.f13654 = (C20397) this.f13650.pop();
                return null;
            }
            path = m12898((AbstractC4032) abstractC14472M6183);
            if (path != null) {
                if (c12938.f13763 == null) {
                    c12938.f13763 = m12864(path);
                }
                Matrix matrix = c12938.f77641;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f13654.f65385.f75841 != null && (pathM12858 = m12858(abstractC4032, abstractC4032.f13763)) != null) {
                    path.op(pathM12858, Path.Op.INTERSECT);
                }
                this.f13654 = (C20397) this.f13650.pop();
                return path;
            }
            return null;
        }
        if (abstractC4032 instanceof AbstractC6096) {
            AbstractC6096 abstractC6096 = (AbstractC6096) abstractC4032;
            if (abstractC4032 instanceof C9077) {
                path = new C17413(((C9077) abstractC4032).f29506).f56611;
                if (abstractC4032.f13763 == null) {
                    abstractC4032.f13763 = m12864(path);
                }
            } else if (abstractC4032 instanceof C21932) {
                path = m12860((C21932) abstractC4032);
            } else if (abstractC4032 instanceof C24742) {
                path = m12861((C24742) abstractC4032);
            } else if (abstractC4032 instanceof C3112) {
                path = m12857((C3112) abstractC4032);
            } else {
                path = abstractC4032 instanceof C13552 ? m12859((C13552) abstractC4032) : null;
            }
            if (path != null) {
                if (abstractC6096.f13763 == null) {
                    abstractC6096.f13763 = m12864(path);
                }
                Matrix matrix2 = abstractC6096.f20824;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(m12894());
                if (this.f13654.f65385.f75841 != null) {
                    path.op(pathM12858, Path.Op.INTERSECT);
                }
                this.f13654 = (C20397) this.f13650.pop();
                return path;
            }
            return null;
        }
        if (abstractC4032 instanceof C7015) {
            C7015 c7015 = (C7015) abstractC4032;
            ArrayList arrayList = c7015.f33967;
            float fM42032 = 0.0f;
            float fM42033 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C18028) c7015.f33967.get(0)).m42033(this);
            ArrayList arrayList2 = c7015.f33969;
            float fM42034 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C18028) c7015.f33969.get(0)).m42032(this);
            ArrayList arrayList3 = c7015.f33968;
            float fM42035 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C18028) c7015.f33968.get(0)).m42033(this);
            ArrayList arrayList4 = c7015.f33970;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fM42032 = ((C18028) c7015.f33970.get(0)).m42032(this);
            }
            if (this.f13654.f65385.f75815 != EnumC24916.Start) {
                float fM12852 = m12852((AbstractC4735) c7015);
                if (this.f13654.f65385.f75815 == EnumC24916.Middle) {
                    fM12852 /= 2.0f;
                }
                fM42033 -= fM12852;
            }
            if (c7015.f13763 == null) {
                C12192 c12192 = new C12192(this, fM42033, fM42034);
                m12874(c7015, c12192);
                RectF rectF = c12192.f39197;
                c7015.f13763 = new C1621(rectF.left, rectF.top, rectF.width(), c12192.f39197.height());
            }
            path = new Path();
            m12874(c7015, new C3243(this, fM42033 + fM42035, fM42034 + fM42032, path));
            Matrix matrix3 = c7015.f23146;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(m12894());
            if (this.f13654.f65385.f75841 != null) {
                path.op(pathM12858, Path.Op.INTERSECT);
            }
            this.f13654 = (C20397) this.f13650.pop();
            return path;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private Path.FillType m12894() {
        EnumC15218 enumC15218 = this.f13654.f65385.f75836;
        if (enumC15218 != null && enumC15218 == EnumC15218.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m12860(C21932 c21932) {
        float fM42033;
        float fM42032;
        Path path;
        C18028 c18028 = c21932.f70803;
        if (c18028 == null && c21932.f70806 == null) {
            fM42033 = 0.0f;
            fM42032 = 0.0f;
        } else {
            if (c18028 == null) {
                fM42033 = c21932.f70806.m42032(this);
            } else if (c21932.f70806 == null) {
                fM42033 = c18028.m42033(this);
            } else {
                fM42033 = c18028.m42033(this);
                fM42032 = c21932.f70806.m42032(this);
            }
            fM42032 = fM42033;
        }
        float fMin = Math.min(fM42033, c21932.f70805.m42033(this) / 2.0f);
        float fMin2 = Math.min(fM42032, c21932.f70807.m42032(this) / 2.0f);
        C18028 c18029 = c21932.f70804;
        float fM42034 = c18029 != null ? c18029.m42033(this) : 0.0f;
        C18028 c180210 = c21932.f70808;
        float fM42035 = c180210 != null ? c180210.m42032(this) : 0.0f;
        float fM42036 = c21932.f70805.m42033(this);
        float fM42037 = c21932.f70807.m42032(this);
        if (c21932.f13763 == null) {
            c21932.f13763 = new C1621(fM42034, fM42035, fM42036, fM42037);
        }
        float f = fM42036 + fM42034;
        float f2 = fM42035 + fM42037;
        Path path2 = new Path();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            path = path2;
            path.moveTo(fM42034, fM42035);
            path.lineTo(f, fM42035);
            path.lineTo(f, f2);
            path.lineTo(fM42034, f2);
            path.lineTo(fM42034, fM42035);
        } else {
            float f3 = fMin * 0.5522848f;
            float f4 = 0.5522848f * fMin2;
            float f5 = fM42035 + fMin2;
            path2.moveTo(fM42034, f5);
            float f6 = f5 - f4;
            float f7 = fM42034 + fMin;
            float f8 = f7 - f3;
            path2.cubicTo(fM42034, f6, f8, fM42035, f7, fM42035);
            float f9 = f - fMin;
            path2.lineTo(f9, fM42035);
            float f10 = f9 + f3;
            path2.cubicTo(f10, fM42035, f, f6, f, f5);
            float f11 = f2 - fMin2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, fM42034, f12, fM42034, f11);
            path.lineTo(fM42034, f5);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m12861(C24742 c24742) {
        C18028 c18028 = c24742.f80122;
        float fM42033 = c18028 != null ? c18028.m42033(this) : 0.0f;
        C18028 c18029 = c24742.f80120;
        float fM42032 = c18029 != null ? c18029.m42032(this) : 0.0f;
        float fM42029 = c24742.f80121.m42029(this);
        float f = fM42033 - fM42029;
        float f2 = fM42032 - fM42029;
        float f3 = fM42033 + fM42029;
        float f4 = fM42032 + fM42029;
        if (c24742.f13763 == null) {
            float f5 = 2.0f * fM42029;
            c24742.f13763 = new C1621(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fM42029;
        Path path = new Path();
        path.moveTo(fM42033, f2);
        float f7 = fM42033 + f6;
        float f8 = fM42032 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fM42032);
        float f9 = fM42032 + f6;
        path.cubicTo(f3, f9, f7, f4, fM42033, f4);
        float f10 = fM42033 - f6;
        path.cubicTo(f10, f4, f, f9, f, fM42032);
        path.cubicTo(f, f8, f10, f2, fM42033, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Path m12857(C3112 c3112) {
        C18028 c18028 = c3112.f10084;
        float fM42033 = c18028 != null ? c18028.m42033(this) : 0.0f;
        C18028 c18029 = c3112.f10081;
        float fM42032 = c18029 != null ? c18029.m42032(this) : 0.0f;
        float fM42034 = c3112.f10083.m42033(this);
        float fM42035 = c3112.f10082.m42032(this);
        float f = fM42033 - fM42034;
        float f2 = fM42032 - fM42035;
        float f3 = fM42033 + fM42034;
        float f4 = fM42032 + fM42035;
        if (c3112.f13763 == null) {
            c3112.f13763 = new C1621(f, f2, fM42034 * 2.0f, 2.0f * fM42035);
        }
        float f5 = fM42034 * 0.5522848f;
        float f6 = 0.5522848f * fM42035;
        Path path = new Path();
        path.moveTo(fM42033, f2);
        float f7 = fM42033 + f5;
        float f8 = fM42032 - f6;
        float f9 = fM42032;
        path.cubicTo(f7, f2, f3, f8, f3, f9);
        float f10 = f6 + fM42032;
        path.cubicTo(f3, f10, f7, f4, fM42033, f4);
        float f11 = fM42033 - f5;
        path.cubicTo(f11, f4, f, f10, f, f9);
        path.cubicTo(f, f8, f11, f2, fM42033, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Path m12859(C13552 c13552) {
        Path path = new Path();
        float[] fArr = c13552.f43041;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c13552.f43041;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c13552 instanceof C4778) {
            path.close();
        }
        if (c13552.f13763 == null) {
            c13552.f13763 = m12864(path);
        }
        return path;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12876(C6841 c6841, String str) {
        AbstractC14472 abstractC14472M6183 = c6841.f59446.m6183(str);
        if (abstractC14472M6183 == null || !(abstractC14472M6183 instanceof C6841) || abstractC14472M6183 == c6841) {
            return;
        }
        C6841 c6842 = (C6841) abstractC14472M6183;
        if (c6841.f22751 == null) {
            c6841.f22751 = c6842.f22751;
        }
        if (c6841.f22747 == null) {
            c6841.f22747 = c6842.f22747;
        }
        if (c6841.f22746 == null) {
            c6841.f22746 = c6842.f22746;
        }
        if (c6841.f22748 == null) {
            c6841.f22748 = c6842.f22748;
        }
        if (c6841.f22750 == null) {
            c6841.f22750 = c6842.f22750;
        }
        if (c6841.f22745 == null) {
            c6841.f22745 = c6842.f22745;
        }
        if (c6841.f22744 == null) {
            c6841.f22744 = c6842.f22744;
        }
        if (c6841.f39383.isEmpty()) {
            c6841.f39383 = c6842.f39383;
        }
        if (c6841.f32108 == null) {
            c6841.f32108 = c6842.f32108;
        }
        if (c6841.f25547 == null) {
            c6841.f25547 = c6842.f25547;
        }
        String str2 = c6842.f22749;
        if (str2 != null) {
            m12876(c6841, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12881(C18774 c18774, C1621 c1621) {
        float fM42033;
        float fM42032;
        Boolean bool = c18774.f60978;
        if (bool != null && bool.booleanValue()) {
            C18028 c18028 = c18774.f60980;
            fM42033 = c18028 != null ? c18028.m42033(this) : c1621.f5585;
            C18028 c18029 = c18774.f60979;
            fM42032 = c18029 != null ? c18029.m42032(this) : c1621.f5582;
        } else {
            C18028 c180210 = c18774.f60980;
            float fM42030 = c180210 != null ? c180210.m42030(this, 1.0f) : 1.2f;
            C18028 c180211 = c18774.f60979;
            float fM42031 = c180211 != null ? c180211.m42030(this, 1.0f) : 1.2f;
            fM42033 = fM42030 * c1621.f5585;
            fM42032 = fM42031 * c1621.f5582;
        }
        if (fM42033 == 0.0f || fM42032 == 0.0f) {
            return;
        }
        m12893();
        C20397 c20397M12866 = m12866((AbstractC14472) c18774);
        this.f13654 = c20397M12866;
        c20397M12866.f65385.f75832 = Float.valueOf(1.0f);
        boolean zM12890 = m12890();
        Canvas canvas = this.f13651;
        canvas.save();
        Boolean bool2 = c18774.f60981;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c1621.f5584, c1621.f5583);
            canvas.scale(c1621.f5585, c1621.f5582);
        }
        m12878((AbstractC12235) c18774, false);
        canvas.restore();
        if (zM12890) {
            m12869(c1621);
        }
        m12851();
    }
}
