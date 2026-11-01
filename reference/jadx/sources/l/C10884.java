package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public class C10884 extends C5444 implements InterfaceC4697 {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static boolean f36999;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RectF f37000;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f37001;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public long f37002;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public EnumC5944 f37003;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f37004;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37005;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Interpolator f37006;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public long f37007;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f37008;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public float f37009;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f37010;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f37011;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f37012;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public float f37013;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f37014;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f37015;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15823 f37016;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f37017;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f37018;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f37019;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37020;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f37021;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f37022;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f37023;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f37024;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37025;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f37026;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f37027;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public float f37028;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f37029;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f37030;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f37031;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37032;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f37033;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public boolean f37034;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f37035;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C18954 f37036;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f37037;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f37038;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public View f37039;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37040;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f37041;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20761 f37042;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f37043;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f37044;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f37045;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C20056 f37046;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37047;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C3121 f37048;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f37049;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f37050;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C21070 f37051;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public float f37052;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f37053;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f37054;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C12295 f37055;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // l.InterfaceC3556
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // l.InterfaceC3556
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public C10884(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37037 = 0.0f;
        this.f37047 = -1;
        this.f37040 = -1;
        this.f37025 = -1;
        this.f37050 = 0;
        this.f37010 = 0;
        this.f37027 = true;
        this.f37004 = new HashMap();
        this.f37038 = 0L;
        this.f37009 = 1.0f;
        this.f37052 = 0.0f;
        this.f37028 = 0.0f;
        this.f37013 = 0.0f;
        this.f37033 = false;
        this.f37029 = 0;
        this.f37005 = false;
        this.f37036 = new C18954();
        this.f37042 = new C20761(this);
        this.f37032 = false;
        this.f37014 = false;
        this.f37019 = null;
        this.f37024 = null;
        this.f37015 = null;
        this.f37022 = 0;
        this.f37002 = -1L;
        this.f37031 = 0.0f;
        this.f37045 = 0;
        this.f37044 = 0.0f;
        this.f37020 = false;
        this.f37051 = new C21070();
        this.f37012 = false;
        this.f37003 = EnumC5944.UNDEFINED;
        this.f37046 = new C20056(this);
        this.f37021 = false;
        this.f37000 = new RectF();
        this.f37039 = null;
        this.f37023 = new ArrayList();
        m27258(attributeSet);
    }

    public C10884(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37037 = 0.0f;
        this.f37047 = -1;
        this.f37040 = -1;
        this.f37025 = -1;
        this.f37050 = 0;
        this.f37010 = 0;
        this.f37027 = true;
        this.f37004 = new HashMap();
        this.f37038 = 0L;
        this.f37009 = 1.0f;
        this.f37052 = 0.0f;
        this.f37028 = 0.0f;
        this.f37013 = 0.0f;
        this.f37033 = false;
        this.f37029 = 0;
        this.f37005 = false;
        this.f37036 = new C18954();
        this.f37042 = new C20761(this);
        this.f37032 = false;
        this.f37014 = false;
        this.f37019 = null;
        this.f37024 = null;
        this.f37015 = null;
        this.f37022 = 0;
        this.f37002 = -1L;
        this.f37031 = 0.0f;
        this.f37045 = 0;
        this.f37044 = 0.0f;
        this.f37020 = false;
        this.f37051 = new C21070();
        this.f37012 = false;
        this.f37003 = EnumC5944.UNDEFINED;
        this.f37046 = new C20056(this);
        this.f37021 = false;
        this.f37000 = new RectF();
        this.f37039 = null;
        this.f37023 = new ArrayList();
        m27258(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27282(EnumC5944 enumC5944) {
        EnumC5944 enumC5945 = EnumC5944.FINISHED;
        if (enumC5944 == enumC5945 && this.f37040 == -1) {
            return;
        }
        EnumC5944 enumC5946 = this.f37003;
        this.f37003 = enumC5944;
        EnumC5944 enumC5947 = EnumC5944.MOVING;
        if (enumC5946 == enumC5947 && enumC5944 == enumC5947) {
            m27272();
        }
        int i = C7355.f24421[enumC5946.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC5944 == enumC5945) {
                m27275();
                return;
            }
            return;
        }
        if (enumC5944 == enumC5947) {
            m27272();
        }
        if (enumC5944 == enumC5945) {
            m27275();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27283(C9473 c9473) {
        this.f37048.m9411(c9473);
        m27282(EnumC5944.SETUP);
        int i = this.f37040;
        C9473 c9474 = this.f37048.f11764;
        if (i == (c9474 == null ? -1 : c9474.f32053)) {
            this.f37028 = 1.0f;
            this.f37052 = 1.0f;
            this.f37013 = 1.0f;
        } else {
            this.f37028 = 0.0f;
            this.f37052 = 0.0f;
            this.f37013 = 0.0f;
        }
        this.f37007 = c9473.m24273() ? -1L : System.nanoTime();
        int iM9415 = this.f37048.m9415();
        C9473 c9475 = this.f37048.f11764;
        int i2 = c9475 != null ? c9475.f32053 : -1;
        if (iM9415 == this.f37047 && i2 == this.f37025) {
            return;
        }
        this.f37047 = iM9415;
        this.f37025 = i2;
        this.f37048.m9408(iM9415, i2);
        C18144 c18144M9407 = this.f37048.m9407(this.f37047);
        C18144 c18144M9408 = this.f37048.m9407(this.f37025);
        C20056 c20056 = this.f37046;
        c20056.m45419(c18144M9407, c18144M9408);
        int i3 = this.f37047;
        int i4 = this.f37025;
        c20056.f64199 = i3;
        c20056.f64198 = i4;
        c20056.m45420();
        c20056.m45420();
        invalidate();
    }

    @Override // l.C5444
    public final void loadLayoutDescription(int i) {
        C20056 c20056 = this.f37046;
        if (i != 0) {
            try {
                this.f37048 = new C3121(getContext(), this, i);
                if (super.isAttachedToWindow()) {
                    this.f37048.m9412(this);
                    c20056.m45419(this.f37048.m9407(this.f37047), this.f37048.m9407(this.f37025));
                    c20056.m45420();
                    invalidate();
                    this.f37048.m9414(isRtl());
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.f37048 = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 float, still in use, count: 1, list:
          (r3v1 float) from 0x0022: INVOKE (r0v7 int) = 
          (r0v6 l.ￜﾽￜﾺ)
          (-1 int)
          (r3v1 float)
          (wrap int:0x001f: IGET (r12v0 'this' l.ￛﾧￛﾡ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:1835) l.ￛﾧￛﾡ.ￜﾽ int)
          (r13v0 int)
         VIRTUAL call: l.ￜﾽￜﾺ.ￛﾙ(float, float, int, int):int A[FORCE_ASSIGN_INLINE, MD:(float, float, int, int):int (m), WRAPPED] (LINE:1835)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:148)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:117)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:115)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27279(int r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10884.m27279(int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27281(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f37055 == null) {
                this.f37055 = new C12295(this);
            }
            C12295 c12295 = this.f37055;
            c12295.f41117 = i;
            c12295.f41116 = i2;
            return;
        }
        C3121 c3121 = this.f37048;
        if (c3121 != null) {
            this.f37047 = i;
            this.f37025 = i2;
            c3121.m9408(i, i2);
            C18144 c18144M9407 = this.f37048.m9407(i);
            C18144 c18144M9408 = this.f37048.m9407(i2);
            C20056 c20056 = this.f37046;
            c20056.m45419(c18144M9407, c18144M9408);
            c20056.m45420();
            invalidate();
            this.f37028 = 0.0f;
            m27276(0.0f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27289(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.f37055 == null) {
                this.f37055 = new C12295(this);
            }
            this.f37055.f41118 = f;
            return;
        }
        if (f <= 0.0f) {
            this.f37040 = this.f37047;
            if (this.f37028 == 0.0f) {
                m27282(EnumC5944.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f37040 = this.f37025;
            if (this.f37028 == 1.0f) {
                m27282(EnumC5944.FINISHED);
            }
        } else {
            this.f37040 = -1;
            m27282(EnumC5944.MOVING);
        }
        if (this.f37048 == null) {
            return;
        }
        this.f37034 = true;
        this.f37013 = f;
        this.f37052 = f;
        this.f37007 = -1L;
        this.f37038 = -1L;
        this.f37006 = null;
        this.f37033 = true;
        invalidate();
    }

    @Override // l.C5444
    public final void setState(int i, int i2, int i3) {
        m27282(EnumC5944.SETUP);
        this.f37040 = i;
        this.f37047 = -1;
        this.f37025 = -1;
        C13206 c13206 = this.mConstraintLayoutSpec;
        if (c13206 != null) {
            c13206.m32676(i2, i3, i);
            return;
        }
        C3121 c3121 = this.f37048;
        if (c3121 != null) {
            c3121.m9407(i).m42246((C5444) this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27277(float f, float f2, int i) {
        C9473 c9473;
        float fM24357;
        if (this.f37048 == null || this.f37028 == f) {
            return;
        }
        this.f37005 = true;
        this.f37038 = System.nanoTime();
        float fM9417 = this.f37048.m9417() / 1000.0f;
        this.f37009 = fM9417;
        this.f37013 = f;
        this.f37033 = true;
        C18954 c18954 = this.f37036;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            }
            float f3 = this.f37028;
            float fM9405 = this.f37048.m9405();
            C3121 c3121 = this.f37048;
            C9473 c9474 = c3121.f11764;
            this.f37036.m43661(f3, f, f2, fM9417, fM9405, (c9474 == null || c9474.f32057 == null) ? 0.0f : c3121.f11764.f32057.m24357());
            int i2 = this.f37040;
            this.f37013 = f;
            this.f37040 = i2;
            this.f37006 = c18954;
        } else {
            C20761 c20761 = this.f37042;
            if (i == 4) {
                float f4 = this.f37028;
                float fM9406 = this.f37048.m9405();
                c20761.f67560 = f2;
                c20761.f67558 = f4;
                c20761.f67559 = fM9406;
                this.f37006 = c20761;
            } else if (i == 5) {
                float f5 = this.f37028;
                float fM9407 = this.f37048.m9405();
                if (f2 > 0.0f) {
                    float f6 = f2 / fM9407;
                    if (((f2 * f6) - (((fM9407 * f6) * f6) / 2.0f)) + f5 > 1.0f) {
                        float f7 = this.f37028;
                        float fM9408 = this.f37048.m9405();
                        c20761.f67560 = f2;
                        c20761.f67558 = f7;
                        c20761.f67559 = fM9408;
                        this.f37006 = c20761;
                    } else {
                        float f8 = this.f37028;
                        float f9 = this.f37009;
                        float fM9409 = this.f37048.m9405();
                        C3121 c3122 = this.f37048;
                        c9473 = c3122.f11764;
                        if (c9473 != null || c9473.f32057 == null) {
                            fM24357 = 0.0f;
                        } else {
                            fM24357 = c3122.f11764.f32057.m24357();
                        }
                        this.f37036.m43661(f8, f, f2, f9, fM9409, fM24357);
                        this.f37037 = 0.0f;
                        int i3 = this.f37040;
                        this.f37013 = f;
                        this.f37040 = i3;
                        this.f37006 = c18954;
                    }
                } else {
                    float f10 = (-f2) / fM9407;
                    if ((((fM9407 * f10) * f10) / 2.0f) + (f2 * f10) + f5 < 0.0f) {
                        float f11 = this.f37028;
                        float fM94010 = this.f37048.m9405();
                        c20761.f67560 = f2;
                        c20761.f67558 = f11;
                        c20761.f67559 = fM94010;
                        this.f37006 = c20761;
                    } else {
                        float f12 = this.f37028;
                        float f13 = this.f37009;
                        float fM94011 = this.f37048.m9405();
                        C3121 c3123 = this.f37048;
                        c9473 = c3123.f11764;
                        if (c9473 != null) {
                            fM24357 = 0.0f;
                        } else {
                            fM24357 = 0.0f;
                        }
                        this.f37036.m43661(f12, f, f2, f13, fM94011, fM24357);
                        this.f37037 = 0.0f;
                        int i4 = this.f37040;
                        this.f37013 = f;
                        this.f37040 = i4;
                        this.f37006 = c18954;
                    }
                }
            }
        }
        this.f37034 = false;
        this.f37038 = System.nanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27276(float f) {
        C3121 c3121 = this.f37048;
        if (c3121 == null) {
            return;
        }
        float f2 = this.f37028;
        float f3 = this.f37052;
        if (f2 != f3 && this.f37034) {
            this.f37028 = f3;
        }
        float f4 = this.f37028;
        if (f4 == f) {
            return;
        }
        this.f37005 = false;
        this.f37013 = f;
        this.f37009 = c3121.m9417() / 1000.0f;
        m27289(this.f37013);
        this.f37006 = this.f37048.m9416();
        this.f37034 = false;
        this.f37038 = System.nanoTime();
        this.f37033 = true;
        this.f37052 = f4;
        this.f37028 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27284(C11235 c11235, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo22816 = this.f37037;
        float f3 = this.f37028;
        if (this.f37006 != null) {
            float fSignum = Math.signum(this.f37013 - f3);
            float interpolation2 = this.f37006.getInterpolation(this.f37028 + 1.0E-5f);
            interpolation = this.f37006.getInterpolation(this.f37028);
            fMo22816 = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / this.f37009;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.f37006;
        if (interpolator instanceof AbstractInterpolatorC8767) {
            fMo22816 = ((AbstractInterpolatorC8767) interpolator).mo22816();
        }
        C8061 c8061 = (C8061) this.f37004.get(c11235);
        if ((i & 1) == 0) {
            c8061.m21222(interpolation, c11235.getWidth(), c11235.getHeight(), f, f2, fArr);
        } else {
            c8061.m21221(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo22816;
            fArr[1] = fArr[1] * fMo22816;
        }
    }

    @Override // l.C5444, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C3121 c3121;
        C9473 c9473;
        if (this.f37020 || this.f37040 != -1 || (c3121 = this.f37048) == null || (c9473 = c3121.f11764) == null || c9473.m24279() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C19660.m44788(context, this.f37047) + "->" + C19660.m44788(context, this.f37025) + " (pos:" + this.f37028 + " Dpos/Dt:" + this.f37037;
    }

    @Override // l.C5444, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f37048 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f37050 == i && this.f37010 == i2) ? false : true;
        if (this.f37021) {
            this.f37021 = false;
            m27286();
            m27251();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f37050 = i;
        this.f37010 = i2;
        int iM9415 = this.f37048.m9415();
        C9473 c9473 = this.f37048.f11764;
        int i3 = c9473 == null ? -1 : c9473.f32053;
        C20056 c20056 = this.f37046;
        if ((!z3 && iM9415 == c20056.f64199 && i3 == c20056.f64198) || this.f37047 == -1) {
            z = true;
        } else {
            super.onMeasure(i, i2);
            c20056.m45419(this.f37048.m9407(iM9415), this.f37048.m9407(i3));
            c20056.m45420();
            c20056.f64199 = iM9415;
            c20056.f64198 = i3;
            z = false;
        }
        if (this.f37020 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iM46640 = this.mLayoutWidget.m46640() + getPaddingRight() + getPaddingLeft();
            int iM46619 = this.mLayoutWidget.m46619() + paddingBottom;
            int i4 = this.f37011;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f37026;
                iM46640 = (int) ((this.f37049 * (this.f37035 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f37008;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f37017;
                iM46619 = (int) ((this.f37049 * (this.f37054 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM46640, iM46619);
        }
        float fSignum = Math.signum(this.f37013 - this.f37028);
        long jNanoTime = System.nanoTime();
        Interpolator interpolator = this.f37006;
        float interpolation = this.f37028 + (!(interpolator instanceof C18954) ? (((jNanoTime - this.f37007) * fSignum) * 1.0E-9f) / this.f37009 : 0.0f);
        if (this.f37034) {
            interpolation = this.f37013;
        }
        if ((fSignum <= 0.0f || interpolation < this.f37013) && (fSignum > 0.0f || interpolation > this.f37013)) {
            z2 = false;
        } else {
            interpolation = this.f37013;
        }
        if (interpolator != null && !z2) {
            if (this.f37005) {
                interpolation = interpolator.getInterpolation((jNanoTime - this.f37038) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > 0.0f && interpolation >= this.f37013) || (fSignum <= 0.0f && interpolation <= this.f37013)) {
            interpolation = this.f37013;
        }
        this.f37049 = interpolation;
        int childCount = getChildCount();
        long jNanoTime2 = System.nanoTime();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C8061 c8061 = (C8061) this.f37004.get(childAt);
            if (c8061 != null) {
                c8061.m21231(interpolation, jNanoTime2, childAt, this.f37051);
            }
        }
        if (this.f37020) {
            requestLayout();
        }
    }

    @Override // l.InterfaceC3556
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C9473 c9473;
        C3121 c3121 = this.f37048;
        return (c3121 == null || (c9473 = c3121.f11764) == null || c9473.m24278() == null || (this.f37048.f11764.m24278().m24351() & 2) != 0) ? false : true;
    }

    @Override // l.InterfaceC3556
    public final void onStopNestedScroll(View view, int i) {
        C3121 c3121 = this.f37048;
        if (c3121 == null) {
            return;
        }
        float f = this.f37041;
        float f2 = this.f37001;
        float f3 = f / f2;
        float f4 = this.f37030 / f2;
        C9473 c9473 = c3121.f11764;
        if (c9473 == null || c9473.f32057 == null) {
            return;
        }
        c3121.f11764.f32057.m24348(f3, f4);
    }

    @Override // l.InterfaceC4697
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f37032 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f37032 = false;
    }

    @Override // l.InterfaceC3556
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C9473 c9473;
        C9514 c9514M24278;
        int iM24355;
        C3121 c3121 = this.f37048;
        if (c3121 == null || (c9473 = c3121.f11764) == null || !c9473.m24281()) {
            return;
        }
        C9473 c9474 = this.f37048.f11764;
        if (c9474 == null || !c9474.m24281() || (c9514M24278 = c9474.m24278()) == null || (iM24355 = c9514M24278.m24355()) == -1 || view.getId() == iM24355) {
            C3121 c3122 = this.f37048;
            if (c3122 != null) {
                C9473 c9475 = c3122.f11764;
                if ((c9475 == null || c9475.f32057 == null) ? false : c3122.f11764.f32057.m24349()) {
                    float f = this.f37052;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c9474.m24278() != null && (this.f37048.f11764.m24278().m24351() & 1) != 0) {
                C3121 c3123 = this.f37048;
                float f2 = i;
                float f3 = i2;
                C9473 c9476 = c3123.f11764;
                float fM24360 = (c9476 == null || c9476.f32057 == null) ? 0.0f : c3123.f11764.f32057.m24360(f2, f3);
                float f4 = this.f37028;
                if ((f4 <= 0.0f && fM24360 < 0.0f) || (f4 >= 1.0f && fM24360 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC10178((ViewGroup) view));
                    return;
                }
            }
            float f5 = this.f37052;
            long jNanoTime = System.nanoTime();
            float f6 = i;
            this.f37041 = f6;
            float f7 = i2;
            this.f37030 = f7;
            this.f37001 = (float) ((jNanoTime - this.f37043) * 1.0E-9d);
            this.f37043 = jNanoTime;
            C3121 c3124 = this.f37048;
            C9473 c9477 = c3124.f11764;
            if (c9477 != null && c9477.f32057 != null) {
                c3124.f11764.f32057.m24358(f6, f7);
            }
            if (f5 != this.f37052) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m27285(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f37032 = true;
        }
    }

    @Override // l.C5444, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        m27285(false);
        super.dispatchDraw(canvas);
        if (this.f37048 == null) {
            return;
        }
        if ((this.f37029 & 1) == 1 && !isInEditMode()) {
            this.f37022++;
            long jNanoTime = System.nanoTime();
            long j = this.f37002;
            if (j != -1) {
                long j2 = jNanoTime - j;
                if (j2 > 200000000) {
                    this.f37031 = ((int) ((this.f37022 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f37022 = 0;
                    this.f37002 = jNanoTime;
                }
            } else {
                this.f37002 = jNanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f = ((int) (this.f37028 * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f37031);
            sb.append(" fps ");
            int i = this.f37047;
            StringBuilder sbM23356 = C9023.m23356(C22697.m50267(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f37025;
            sbM23356.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            sbM23356.append(" (progress: ");
            sbM23356.append(f);
            sbM23356.append(" ) state=");
            int i3 = this.f37040;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            sbM23356.append(resourceEntryName);
            String string = sbM23356.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f37029 > 1) {
            if (this.f37016 == null) {
                this.f37016 = new C15823(this);
            }
            this.f37016.m37607(canvas, this.f37004, this.f37048.m9417(), this.f37029);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27285(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f37007 == -1) {
            this.f37007 = System.nanoTime();
        }
        float f2 = this.f37028;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f37040 = -1;
        }
        boolean z4 = false;
        if (this.f37014 || (this.f37033 && (z || this.f37013 != f2))) {
            float fSignum = Math.signum(this.f37013 - f2);
            long jNanoTime = System.nanoTime();
            Interpolator interpolator = this.f37006;
            if (interpolator instanceof AbstractInterpolatorC8767) {
                f = 0.0f;
            } else {
                f = (((jNanoTime - this.f37007) * fSignum) * 1.0E-9f) / this.f37009;
                this.f37037 = f;
            }
            float f3 = this.f37028 + f;
            if (this.f37034) {
                f3 = this.f37013;
            }
            if ((fSignum <= 0.0f || f3 < this.f37013) && (fSignum > 0.0f || f3 > this.f37013)) {
                z2 = false;
            } else {
                f3 = this.f37013;
                this.f37033 = false;
                z2 = true;
            }
            this.f37028 = f3;
            this.f37052 = f3;
            this.f37007 = jNanoTime;
            if (interpolator != null && !z2) {
                if (this.f37005) {
                    interpolation = interpolator.getInterpolation((jNanoTime - this.f37038) * 1.0E-9f);
                    this.f37028 = interpolation;
                    this.f37007 = jNanoTime;
                    Interpolator interpolator2 = this.f37006;
                    if (interpolator2 instanceof AbstractInterpolatorC8767) {
                        float fMo22816 = ((AbstractInterpolatorC8767) interpolator2).mo22816();
                        this.f37037 = fMo22816;
                        if (Math.abs(fMo22816) * this.f37009 <= 1.0E-5f) {
                            this.f37033 = false;
                        }
                        if (fMo22816 > 0.0f && interpolation >= 1.0f) {
                            this.f37028 = 1.0f;
                            this.f37033 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo22816 < 0.0f && interpolation <= 0.0f) {
                            this.f37028 = 0.0f;
                            this.f37033 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f37006;
                    if (interpolator3 instanceof AbstractInterpolatorC8767) {
                        this.f37037 = ((AbstractInterpolatorC8767) interpolator3).mo22816();
                    } else {
                        this.f37037 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f37037) > 1.0E-5f) {
                m27282(EnumC5944.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.f37013) || (fSignum <= 0.0f && f3 <= this.f37013)) {
                f3 = this.f37013;
                this.f37033 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f37033 = false;
                m27282(EnumC5944.FINISHED);
            }
            int childCount = getChildCount();
            this.f37014 = false;
            long jNanoTime2 = System.nanoTime();
            this.f37049 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C8061 c8061 = (C8061) this.f37004.get(childAt);
                if (c8061 != null) {
                    this.f37014 = c8061.m21231(f3, jNanoTime2, childAt, this.f37051) | this.f37014;
                }
            }
            boolean z5 = (fSignum > 0.0f && f3 >= this.f37013) || (fSignum <= 0.0f && f3 <= this.f37013);
            if (!this.f37014 && !this.f37033 && z5) {
                m27282(EnumC5944.FINISHED);
            }
            if (this.f37020) {
                requestLayout();
            }
            this.f37014 = (!z5) | this.f37014;
            if (f3 > 0.0f || (i = this.f37047) == -1 || this.f37040 == i) {
                z4 = false;
            } else {
                this.f37040 = i;
                this.f37048.m9407(i).m42248(this);
                m27282(EnumC5944.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f37040;
                int i4 = this.f37025;
                if (i3 != i4) {
                    this.f37040 = i4;
                    this.f37048.m9407(i4).m42248(this);
                    m27282(EnumC5944.FINISHED);
                    z4 = true;
                }
            }
            if (this.f37014 || this.f37033) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m27282(EnumC5944.FINISHED);
            }
            if ((!this.f37014 && this.f37033 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m27286();
            }
        }
        float f4 = this.f37028;
        if (f4 >= 1.0f) {
            int i5 = this.f37040;
            int i6 = this.f37025;
            z3 = i5 == i6 ? z4 : true;
            this.f37040 = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.f37040;
                int i8 = this.f37047;
                z3 = i7 == i8 ? z4 : true;
                this.f37040 = i8;
            }
            this.f37021 |= z4;
            if (z4 && !this.f37012) {
                requestLayout();
            }
            this.f37052 = this.f37028;
        }
        z4 = z3;
        this.f37021 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f37052 = this.f37028;
    }

    @Override // l.C5444, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f37012 = true;
        try {
            if (this.f37048 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f37053 != i5 || this.f37018 != i6) {
                this.f37046.m45420();
                invalidate();
                m27285(true);
            }
            this.f37053 = i5;
            this.f37018 = i6;
        } finally {
            this.f37012 = false;
        }
    }

    @Override // l.C5444
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27258(AttributeSet attributeSet) {
        C3121 c3121;
        C3121 c3122;
        f36999 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51884);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f37048 = new C3121(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f37040 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f37013 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f37033 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f37029 == 0) {
                        this.f37029 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f37029 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f37048 = null;
            }
        }
        if (this.f37029 != 0 && (c3122 = this.f37048) != null) {
            int iM9415 = c3122.m9415();
            C3121 c3123 = this.f37048;
            C18144 c18144M9407 = c3123.m9407(c3123.m9415());
            C19660.m44788(getContext(), iM9415);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (c18144M9407.m42240(childAt.getId()) == null) {
                    C19660.m44790(childAt);
                }
            }
            int[] iArrM42250 = c18144M9407.m42250();
            for (int i3 = 0; i3 < iArrM42250.length; i3++) {
                int i4 = iArrM42250[i3];
                C19660.m44788(getContext(), i4);
                findViewById(iArrM42250[i3]);
                c18144M9407.m42254(i4);
                c18144M9407.m42258(i4);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (C9473 c9473 : this.f37048.m9406()) {
                C9473 c9474 = this.f37048.f11764;
                c9473.m24276(getContext());
                int iM24274 = c9473.m24274();
                int iM24280 = c9473.m24280();
                C19660.m44788(getContext(), iM24274);
                C19660.m44788(getContext(), iM24280);
                sparseIntArray.get(iM24274);
                sparseIntArray2.get(iM24280);
                sparseIntArray.put(iM24274, iM24280);
                sparseIntArray2.put(iM24280, iM24274);
                this.f37048.m9407(iM24274);
                this.f37048.m9407(iM24280);
            }
        }
        if (this.f37040 != -1 || (c3121 = this.f37048) == null) {
            return;
        }
        this.f37040 = c3121.m9415();
        this.f37047 = this.f37048.m9415();
        C9473 c9475 = this.f37048.f11764;
        this.f37025 = c9475 != null ? c9475.f32053 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27262(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m27262(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        float left = view.getLeft() + f;
        float top = view.getTop() + f2;
        float right = f + view.getRight();
        float bottom = f2 + view.getBottom();
        RectF rectF = this.f37000;
        rectF.set(left, top, right, bottom);
        if (motionEvent.getAction() == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C9473 c9473;
        C9514 c9514M24278;
        int iM24355;
        RectF rectFM24361;
        C3121 c3121 = this.f37048;
        if (c3121 == null || !this.f37027 || (c9473 = c3121.f11764) == null || !c9473.m24281() || (c9514M24278 = c9473.m24278()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFM24361 = c9514M24278.m24361(this, new RectF())) != null && !rectFM24361.contains(motionEvent.getX(), motionEvent.getY())) || (iM24355 = c9514M24278.m24355()) == -1) {
            return false;
        }
        View view = this.f37039;
        if (view == null || view.getId() != iM24355) {
            this.f37039 = findViewById(iM24355);
        }
        View view2 = this.f37039;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f37039.getTop();
        float right = this.f37039.getRight();
        float bottom = this.f37039.getBottom();
        RectF rectF = this.f37000;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m27262(0.0f, 0.0f, this.f37039, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3121 c3121 = this.f37048;
        if (c3121 != null && this.f37027 && c3121.m9419()) {
            C9473 c9473 = this.f37048.f11764;
            if (c9473 != null && !c9473.m24281()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f37048.m9409(motionEvent, this.f37040, this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C9473 c9473;
        int i;
        super.onAttachedToWindow();
        C3121 c3121 = this.f37048;
        if (c3121 != null && (i = this.f37040) != -1) {
            C18144 c18144M9407 = c3121.m9407(i);
            this.f37048.m9412(this);
            if (c18144M9407 != null) {
                c18144M9407.m42246((C5444) this);
            }
            this.f37047 = this.f37040;
        }
        m27286();
        C12295 c12295 = this.f37055;
        if (c12295 != null) {
            C10884 c10884 = c12295.f41115;
            int i2 = c12295.f41117;
            if (i2 != -1 || c12295.f41116 != -1) {
                if (i2 == -1) {
                    c10884.m27279(c12295.f41116);
                } else {
                    int i3 = c12295.f41116;
                    if (i3 == -1) {
                        c10884.setState(i2, -1, -1);
                    } else {
                        c10884.m27281(i2, i3);
                    }
                }
                c10884.m27282(EnumC5944.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(c12295.f41118)) {
                    return;
                }
                c10884.m27289(c12295.f41118);
                return;
            }
            float f = c12295.f41118;
            if (!super.isAttachedToWindow()) {
                if (c10884.f37055 == null) {
                    c10884.f37055 = new C12295(c10884);
                }
                c10884.f37055.f41118 = f;
            } else {
                c10884.m27289(f);
                c10884.m27282(EnumC5944.MOVING);
                c10884.f37037 = Float.NaN;
                c10884.m27276(1.0f);
            }
            c12295.f41118 = Float.NaN;
            c12295.f41117 = -1;
            c12295.f41116 = -1;
            return;
        }
        C3121 c3122 = this.f37048;
        if (c3122 == null || (c9473 = c3122.f11764) == null || c9473.m24275() != 4) {
            return;
        }
        m27276(1.0f);
        m27282(EnumC5944.SETUP);
        m27282(EnumC5944.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C3121 c3121 = this.f37048;
        if (c3121 != null) {
            c3121.m9414(isRtl());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27286() {
        C3121 c3121;
        C9473 c9473;
        C3121 c3122 = this.f37048;
        if (c3122 == null) {
            return;
        }
        if (c3122.m9418(this, this.f37040)) {
            requestLayout();
            return;
        }
        int i = this.f37040;
        if (i != -1) {
            this.f37048.m9413(this, i);
        }
        if (!this.f37048.m9419() || (c9473 = (c3121 = this.f37048).f11764) == null || c9473.f32057 == null) {
            return;
        }
        c3121.f11764.f32057.m24362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27280(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        C8061 c8061 = (C8061) this.f37004.get(viewById);
        if (c8061 != null) {
            c8061.m21221(f, f2, f3, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27278(float f, boolean z, int i) {
        ArrayList arrayList = this.f37015;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC17233) it.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m27272() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f37015;
        if (arrayList2 == null || arrayList2.isEmpty() || this.f37044 == this.f37052) {
            return;
        }
        if (this.f37045 != -1 && (arrayList = this.f37015) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC17233) it.next()).getClass();
            }
        }
        this.f37045 = -1;
        this.f37044 = this.f37052;
        ArrayList arrayList3 = this.f37015;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((InterfaceC17233) it2.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27275() {
        ArrayList arrayList = this.f37015;
        if (arrayList != null && !arrayList.isEmpty() && this.f37045 == -1) {
            this.f37045 = this.f37040;
            ArrayList arrayList2 = this.f37023;
            int iIntValue = !arrayList2.isEmpty() ? ((Integer) C19084.m43861(arrayList2, 1)).intValue() : -1;
            int i = this.f37040;
            if (iIntValue != i && i != -1) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        m27251();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m27251() {
        ArrayList arrayList = this.f37015;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.f37023;
        for (Integer num : arrayList2) {
            ArrayList<InterfaceC17233> arrayList3 = this.f37015;
            if (arrayList3 != null) {
                for (InterfaceC17233 interfaceC17233 : arrayList3) {
                    num.getClass();
                    interfaceC17233.getClass();
                }
            }
        }
        arrayList2.clear();
    }

    @Override // l.C5444, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C19350) {
            C19350 c19350 = (C19350) view;
            if (this.f37015 == null) {
                this.f37015 = new ArrayList();
            }
            this.f37015.add(c19350);
            if (c19350.m44356()) {
                if (this.f37019 == null) {
                    this.f37019 = new ArrayList();
                }
                this.f37019.add(c19350);
            }
            if (c19350.m44355()) {
                if (this.f37024 == null) {
                    this.f37024 = new ArrayList();
                }
                this.f37024.add(c19350);
            }
        }
    }

    @Override // l.C5444, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f37019;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f37024;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27287() {
        return this.f37047;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27288() {
        return this.f37025;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27274() {
        return this.f37027;
    }
}
