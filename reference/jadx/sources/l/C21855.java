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
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes.dex */
public class C21855 extends C16872 implements InterfaceC21745 {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f69626;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69627;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f69628;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f69629;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f69630;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f69631;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f69632;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f69633;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C14810 f69634;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f69635;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f69636;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f69637;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public float f69638;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f69639;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f69640;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f69641;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f69642;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f69643;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f69644;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f69645;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashMap f69646;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69647;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f69648;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C7112 f69649;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1146 f69650;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f69651;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f69652;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public float f69653;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f69654;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f69655;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f69656;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public EnumC4701 f69657;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f69658;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f69659;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f69660;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public View f69661;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C10335 f69662;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public float f69663;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f69664;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f69665;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f69666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RectF f69667;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public float f69668;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10094 f69669;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f69670;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f69671;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f69672;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C9348 f69673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69674;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C12904 f69675;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69676;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public boolean f69677;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Interpolator f69678;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public long f69679;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f69680;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f69681;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f69682;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // l.InterfaceC4591
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // l.InterfaceC4591
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public C21855(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69665 = 0.0f;
        this.f69674 = -1;
        this.f69627 = -1;
        this.f69629 = -1;
        this.f69666 = 0;
        this.f69631 = 0;
        this.f69652 = true;
        this.f69646 = new HashMap();
        this.f69660 = 0L;
        this.f69659 = 1.0f;
        this.f69663 = 0.0f;
        this.f69653 = 0.0f;
        this.f69638 = 0.0f;
        this.f69676 = false;
        this.f69644 = 0;
        this.f69647 = false;
        this.f69634 = new C14810();
        this.f69669 = new C10094(this);
        this.f69640 = false;
        this.f69671 = false;
        this.f69681 = null;
        this.f69641 = null;
        this.f69672 = null;
        this.f69642 = 0;
        this.f69656 = -1L;
        this.f69639 = 0.0f;
        this.f69680 = 0;
        this.f69664 = 0.0f;
        this.f69635 = false;
        this.f69662 = new C10335();
        this.f69637 = false;
        this.f69657 = EnumC4701.UNDEFINED;
        this.f69673 = new C9348(this);
        this.f69655 = false;
        this.f69667 = new RectF();
        this.f69661 = null;
        this.f69643 = new ArrayList();
        m49519(attributeSet);
    }

    public C21855(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69665 = 0.0f;
        this.f69674 = -1;
        this.f69627 = -1;
        this.f69629 = -1;
        this.f69666 = 0;
        this.f69631 = 0;
        this.f69652 = true;
        this.f69646 = new HashMap();
        this.f69660 = 0L;
        this.f69659 = 1.0f;
        this.f69663 = 0.0f;
        this.f69653 = 0.0f;
        this.f69638 = 0.0f;
        this.f69676 = false;
        this.f69644 = 0;
        this.f69647 = false;
        this.f69634 = new C14810();
        this.f69669 = new C10094(this);
        this.f69640 = false;
        this.f69671 = false;
        this.f69681 = null;
        this.f69641 = null;
        this.f69672 = null;
        this.f69642 = 0;
        this.f69656 = -1L;
        this.f69639 = 0.0f;
        this.f69680 = 0;
        this.f69664 = 0.0f;
        this.f69635 = false;
        this.f69662 = new C10335();
        this.f69637 = false;
        this.f69657 = EnumC4701.UNDEFINED;
        this.f69673 = new C9348(this);
        this.f69655 = false;
        this.f69667 = new RectF();
        this.f69661 = null;
        this.f69643 = new ArrayList();
        m49519(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49547(EnumC4701 enumC4701) {
        EnumC4701 enumC4702 = EnumC4701.FINISHED;
        if (enumC4701 == enumC4702 && this.f69627 == -1) {
            return;
        }
        EnumC4701 enumC4703 = this.f69657;
        this.f69657 = enumC4701;
        EnumC4701 enumC4704 = EnumC4701.MOVING;
        if (enumC4703 == enumC4704 && enumC4701 == enumC4704) {
            m49532();
        }
        int i = C19045.f61726[enumC4703.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC4701 == enumC4702) {
                m49540();
                return;
            }
            return;
        }
        if (enumC4701 == enumC4704) {
            m49532();
        }
        if (enumC4701 == enumC4702) {
            m49540();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49548(C15141 c15141) {
        this.f69675.m31955(c15141);
        m49547(EnumC4701.SETUP);
        int i = this.f69627;
        C15141 c15142 = this.f69675.f41276;
        if (i == (c15142 == null ? -1 : c15142.f49407)) {
            this.f69653 = 1.0f;
            this.f69663 = 1.0f;
            this.f69638 = 1.0f;
        } else {
            this.f69653 = 0.0f;
            this.f69663 = 0.0f;
            this.f69638 = 0.0f;
        }
        this.f69679 = c15141.m36437() ? -1L : System.nanoTime();
        int iM31962 = this.f69675.m31962();
        C15141 c15143 = this.f69675.f41276;
        int i2 = c15143 != null ? c15143.f49407 : -1;
        if (iM31962 == this.f69674 && i2 == this.f69629) {
            return;
        }
        this.f69674 = iM31962;
        this.f69629 = i2;
        this.f69675.m31953(iM31962, i2);
        C4194 c4194M31952 = this.f69675.m31952(this.f69674);
        C4194 c4194M31953 = this.f69675.m31952(this.f69629);
        C9348 c9348 = this.f69673;
        c9348.m24645(c4194M31952, c4194M31953);
        int i3 = this.f69674;
        int i4 = this.f69629;
        c9348.f30376 = i3;
        c9348.f30378 = i4;
        c9348.m24646();
        c9348.m24646();
        invalidate();
    }

    @Override // l.C16872
    public final void loadLayoutDescription(int i) {
        C9348 c9348 = this.f69673;
        if (i != 0) {
            try {
                this.f69675 = new C12904(getContext(), this, i);
                if (super.isAttachedToWindow()) {
                    this.f69675.m31957(this);
                    c9348.m24645(this.f69675.m31952(this.f69674), this.f69675.m31952(this.f69629));
                    c9348.m24646();
                    invalidate();
                    this.f69675.m31959(isRtl());
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.f69675 = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 float, still in use, count: 1, list:
          (r3v1 float) from 0x0022: INVOKE (r0v7 int) = 
          (r0v6 l.ￛﾠￜﾰ)
          (-1 int)
          (r3v1 float)
          (wrap int:0x001f: IGET (r12v0 'this' l.￡ﾩﾷￛﾛ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:1835) l.￡ﾩﾷￛﾛ.ￖﾡ int)
          (r13v0 int)
         VIRTUAL call: l.ￛﾠￜﾰ.ￛﾙ(float, float, int, int):int A[FORCE_ASSIGN_INLINE, MD:(float, float, int, int):int (m), WRAPPED] (LINE:1835)
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
    public final void m49544(int r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21855.m49544(int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49546(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f69649 == null) {
                this.f69649 = new C7112(this);
            }
            C7112 c7112 = this.f69649;
            c7112.f23436 = i;
            c7112.f23435 = i2;
            return;
        }
        C12904 c12904 = this.f69675;
        if (c12904 != null) {
            this.f69674 = i;
            this.f69629 = i2;
            c12904.m31953(i, i2);
            C4194 c4194M31952 = this.f69675.m31952(i);
            C4194 c4194M31953 = this.f69675.m31952(i2);
            C9348 c9348 = this.f69673;
            c9348.m24645(c4194M31952, c4194M31953);
            c9348.m24646();
            invalidate();
            this.f69653 = 0.0f;
            m49541(0.0f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49554(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.f69649 == null) {
                this.f69649 = new C7112(this);
            }
            this.f69649.f23437 = f;
            return;
        }
        if (f <= 0.0f) {
            this.f69627 = this.f69674;
            if (this.f69653 == 0.0f) {
                m49547(EnumC4701.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f69627 = this.f69629;
            if (this.f69653 == 1.0f) {
                m49547(EnumC4701.FINISHED);
            }
        } else {
            this.f69627 = -1;
            m49547(EnumC4701.MOVING);
        }
        if (this.f69675 == null) {
            return;
        }
        this.f69677 = true;
        this.f69638 = f;
        this.f69663 = f;
        this.f69679 = -1L;
        this.f69660 = -1L;
        this.f69678 = null;
        this.f69676 = true;
        invalidate();
    }

    @Override // l.C16872
    public final void setState(int i, int i2, int i3) {
        m49547(EnumC4701.SETUP);
        this.f69627 = i;
        this.f69674 = -1;
        this.f69629 = -1;
        C23586 c23586 = this.mConstraintLayoutSpec;
        if (c23586 != null) {
            c23586.m52832(i2, i3, i);
            return;
        }
        C12904 c12904 = this.f69675;
        if (c12904 != null) {
            c12904.m31952(i).m13392((C16872) this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49542(float f, float f2, int i) {
        C15141 c15141;
        float fM37433;
        if (this.f69675 == null || this.f69653 == f) {
            return;
        }
        this.f69647 = true;
        this.f69660 = System.nanoTime();
        float fM31963 = this.f69675.m31963() / 1000.0f;
        this.f69659 = fM31963;
        this.f69638 = f;
        this.f69676 = true;
        C14810 c14810 = this.f69634;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            }
            float f3 = this.f69653;
            float fM31965 = this.f69675.m31965();
            C12904 c12904 = this.f69675;
            C15141 c15142 = c12904.f41276;
            this.f69634.m35661(f3, f, f2, fM31963, fM31965, (c15142 == null || c15142.f49406 == null) ? 0.0f : c12904.f41276.f49406.m37433());
            int i2 = this.f69627;
            this.f69638 = f;
            this.f69627 = i2;
            this.f69678 = c14810;
        } else {
            C10094 c10094 = this.f69669;
            if (i == 4) {
                float f4 = this.f69653;
                float fM31966 = this.f69675.m31965();
                c10094.f32342 = f2;
                c10094.f32340 = f4;
                c10094.f32341 = fM31966;
                this.f69678 = c10094;
            } else if (i == 5) {
                float f5 = this.f69653;
                float fM31967 = this.f69675.m31965();
                if (f2 > 0.0f) {
                    float f6 = f2 / fM31967;
                    if (((f2 * f6) - (((fM31967 * f6) * f6) / 2.0f)) + f5 > 1.0f) {
                        float f7 = this.f69653;
                        float fM31968 = this.f69675.m31965();
                        c10094.f32342 = f2;
                        c10094.f32340 = f7;
                        c10094.f32341 = fM31968;
                        this.f69678 = c10094;
                    } else {
                        float f8 = this.f69653;
                        float f9 = this.f69659;
                        float fM31969 = this.f69675.m31965();
                        C12904 c12905 = this.f69675;
                        c15141 = c12905.f41276;
                        if (c15141 != null || c15141.f49406 == null) {
                            fM37433 = 0.0f;
                        } else {
                            fM37433 = c12905.f41276.f49406.m37433();
                        }
                        this.f69634.m35661(f8, f, f2, f9, fM31969, fM37433);
                        this.f69665 = 0.0f;
                        int i3 = this.f69627;
                        this.f69638 = f;
                        this.f69627 = i3;
                        this.f69678 = c14810;
                    }
                } else {
                    float f10 = (-f2) / fM31967;
                    if ((((fM31967 * f10) * f10) / 2.0f) + (f2 * f10) + f5 < 0.0f) {
                        float f11 = this.f69653;
                        float fM319610 = this.f69675.m31965();
                        c10094.f32342 = f2;
                        c10094.f32340 = f11;
                        c10094.f32341 = fM319610;
                        this.f69678 = c10094;
                    } else {
                        float f12 = this.f69653;
                        float f13 = this.f69659;
                        float fM319611 = this.f69675.m31965();
                        C12904 c12906 = this.f69675;
                        c15141 = c12906.f41276;
                        if (c15141 != null) {
                            fM37433 = 0.0f;
                        } else {
                            fM37433 = 0.0f;
                        }
                        this.f69634.m35661(f12, f, f2, f13, fM319611, fM37433);
                        this.f69665 = 0.0f;
                        int i4 = this.f69627;
                        this.f69638 = f;
                        this.f69627 = i4;
                        this.f69678 = c14810;
                    }
                }
            }
        }
        this.f69677 = false;
        this.f69660 = System.nanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49541(float f) {
        C12904 c12904 = this.f69675;
        if (c12904 == null) {
            return;
        }
        float f2 = this.f69653;
        float f3 = this.f69663;
        if (f2 != f3 && this.f69677) {
            this.f69653 = f3;
        }
        float f4 = this.f69653;
        if (f4 == f) {
            return;
        }
        this.f69647 = false;
        this.f69638 = f;
        this.f69659 = c12904.m31963() / 1000.0f;
        m49554(this.f69638);
        this.f69678 = this.f69675.m31960();
        this.f69677 = false;
        this.f69660 = System.nanoTime();
        this.f69676 = true;
        this.f69663 = f4;
        this.f69653 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49549(C22094 c22094, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo2206 = this.f69665;
        float f3 = this.f69653;
        if (this.f69678 != null) {
            float fSignum = Math.signum(this.f69638 - f3);
            float interpolation2 = this.f69678.getInterpolation(this.f69653 + 1.0E-5f);
            interpolation = this.f69678.getInterpolation(this.f69653);
            fMo2206 = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / this.f69659;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.f69678;
        if (interpolator instanceof AbstractInterpolatorC0400) {
            fMo2206 = ((AbstractInterpolatorC0400) interpolator).mo2206();
        }
        C21283 c21283 = (C21283) this.f69646.get(c22094);
        if ((i & 1) == 0) {
            c21283.m48456(interpolation, c22094.getWidth(), c22094.getHeight(), f, f2, fArr);
        } else {
            c21283.m48455(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo2206;
            fArr[1] = fArr[1] * fMo2206;
        }
    }

    @Override // l.C16872, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C12904 c12904;
        C15141 c15141;
        if (this.f69635 || this.f69627 != -1 || (c12904 = this.f69675) == null || (c15141 = c12904.f41276) == null || c15141.m36436() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C18540.m43116(context, this.f69674) + "->" + C18540.m43116(context, this.f69629) + " (pos:" + this.f69653 + " Dpos/Dt:" + this.f69665;
    }

    @Override // l.C16872, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f69675 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f69666 == i && this.f69631 == i2) ? false : true;
        if (this.f69655) {
            this.f69655 = false;
            m49552();
            m49528();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f69666 = i;
        this.f69631 = i2;
        int iM31962 = this.f69675.m31962();
        C15141 c15141 = this.f69675.f41276;
        int i3 = c15141 == null ? -1 : c15141.f49407;
        C9348 c9348 = this.f69673;
        if ((!z3 && iM31962 == c9348.f30376 && i3 == c9348.f30378) || this.f69674 == -1) {
            z = true;
        } else {
            super.onMeasure(i, i2);
            c9348.m24645(this.f69675.m31952(iM31962), this.f69675.m31952(i3));
            c9348.m24646();
            c9348.f30376 = iM31962;
            c9348.f30378 = i3;
            z = false;
        }
        if (this.f69635 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iM26806 = this.mLayoutWidget.m26806() + getPaddingRight() + getPaddingLeft();
            int iM26823 = this.mLayoutWidget.m26823() + paddingBottom;
            int i4 = this.f69632;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f69630;
                iM26806 = (int) ((this.f69636 * (this.f69633 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f69658;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f69651;
                iM26823 = (int) ((this.f69636 * (this.f69648 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM26806, iM26823);
        }
        float fSignum = Math.signum(this.f69638 - this.f69653);
        long jNanoTime = System.nanoTime();
        Interpolator interpolator = this.f69678;
        float interpolation = this.f69653 + (!(interpolator instanceof C14810) ? (((jNanoTime - this.f69679) * fSignum) * 1.0E-9f) / this.f69659 : 0.0f);
        if (this.f69677) {
            interpolation = this.f69638;
        }
        if ((fSignum <= 0.0f || interpolation < this.f69638) && (fSignum > 0.0f || interpolation > this.f69638)) {
            z2 = false;
        } else {
            interpolation = this.f69638;
        }
        if (interpolator != null && !z2) {
            if (this.f69647) {
                interpolation = interpolator.getInterpolation((jNanoTime - this.f69660) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > 0.0f && interpolation >= this.f69638) || (fSignum <= 0.0f && interpolation <= this.f69638)) {
            interpolation = this.f69638;
        }
        this.f69636 = interpolation;
        int childCount = getChildCount();
        long jNanoTime2 = System.nanoTime();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C21283 c21283 = (C21283) this.f69646.get(childAt);
            if (c21283 != null) {
                c21283.m48465(interpolation, jNanoTime2, childAt, this.f69662);
            }
        }
        if (this.f69635) {
            requestLayout();
        }
    }

    @Override // l.InterfaceC4591
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C15141 c15141;
        C12904 c12904 = this.f69675;
        return (c12904 == null || (c15141 = c12904.f41276) == null || c15141.m36439() == null || (this.f69675.f41276.m36439().m37429() & 2) != 0) ? false : true;
    }

    @Override // l.InterfaceC4591
    public final void onStopNestedScroll(View view, int i) {
        C12904 c12904 = this.f69675;
        if (c12904 == null) {
            return;
        }
        float f = this.f69628;
        float f2 = this.f69668;
        float f3 = f / f2;
        float f4 = this.f69645 / f2;
        C15141 c15141 = c12904.f41276;
        if (c15141 == null || c15141.f49406 == null) {
            return;
        }
        c12904.f41276.f49406.m37442(f3, f4);
    }

    @Override // l.InterfaceC21745
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f69640 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f69640 = false;
    }

    @Override // l.InterfaceC4591
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C15141 c15141;
        C15666 c15666M36439;
        int iM37437;
        C12904 c12904 = this.f69675;
        if (c12904 == null || (c15141 = c12904.f41276) == null || !c15141.m36438()) {
            return;
        }
        C15141 c15142 = this.f69675.f41276;
        if (c15142 == null || !c15142.m36438() || (c15666M36439 = c15142.m36439()) == null || (iM37437 = c15666M36439.m37437()) == -1 || view.getId() == iM37437) {
            C12904 c12905 = this.f69675;
            if (c12905 != null) {
                C15141 c15143 = c12905.f41276;
                if ((c15143 == null || c15143.f49406 == null) ? false : c12905.f41276.f49406.m37443()) {
                    float f = this.f69663;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c15142.m36439() != null && (this.f69675.f41276.m36439().m37429() & 1) != 0) {
                C12904 c12906 = this.f69675;
                float f2 = i;
                float f3 = i2;
                C15141 c15144 = c12906.f41276;
                float fM37440 = (c15144 == null || c15144.f49406 == null) ? 0.0f : c12906.f41276.f49406.m37440(f2, f3);
                float f4 = this.f69653;
                if ((f4 <= 0.0f && fM37440 < 0.0f) || (f4 >= 1.0f && fM37440 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC7858((ViewGroup) view));
                    return;
                }
            }
            float f5 = this.f69663;
            long jNanoTime = System.nanoTime();
            float f6 = i;
            this.f69628 = f6;
            float f7 = i2;
            this.f69645 = f7;
            this.f69668 = (float) ((jNanoTime - this.f69670) * 1.0E-9d);
            this.f69670 = jNanoTime;
            C12904 c12907 = this.f69675;
            C15141 c15145 = c12907.f41276;
            if (c15145 != null && c15145.f49406 != null) {
                c12907.f41276.f49406.m37434(f6, f7);
            }
            if (f5 != this.f69663) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m49550(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f69640 = true;
        }
    }

    @Override // l.C16872, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        m49550(false);
        super.dispatchDraw(canvas);
        if (this.f69675 == null) {
            return;
        }
        if ((this.f69644 & 1) == 1 && !isInEditMode()) {
            this.f69642++;
            long jNanoTime = System.nanoTime();
            long j = this.f69656;
            if (j != -1) {
                long j2 = jNanoTime - j;
                if (j2 > 200000000) {
                    this.f69639 = ((int) ((this.f69642 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f69642 = 0;
                    this.f69656 = jNanoTime;
                }
            } else {
                this.f69656 = jNanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f = ((int) (this.f69653 * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f69639);
            sb.append(" fps ");
            int i = this.f69674;
            StringBuilder sbM27333 = C10732.m27333(C8947.m23910(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f69629;
            sbM27333.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            sbM27333.append(" (progress: ");
            sbM27333.append(f);
            sbM27333.append(" ) state=");
            int i3 = this.f69627;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            sbM27333.append(resourceEntryName);
            String string = sbM27333.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f69644 > 1) {
            if (this.f69650 == null) {
                this.f69650 = new C1146(this);
            }
            this.f69650.m4240(canvas, this.f69646, this.f69675.m31963(), this.f69644);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49550(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f69679 == -1) {
            this.f69679 = System.nanoTime();
        }
        float f2 = this.f69653;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f69627 = -1;
        }
        boolean z4 = false;
        if (this.f69671 || (this.f69676 && (z || this.f69638 != f2))) {
            float fSignum = Math.signum(this.f69638 - f2);
            long jNanoTime = System.nanoTime();
            Interpolator interpolator = this.f69678;
            if (interpolator instanceof AbstractInterpolatorC0400) {
                f = 0.0f;
            } else {
                f = (((jNanoTime - this.f69679) * fSignum) * 1.0E-9f) / this.f69659;
                this.f69665 = f;
            }
            float f3 = this.f69653 + f;
            if (this.f69677) {
                f3 = this.f69638;
            }
            if ((fSignum <= 0.0f || f3 < this.f69638) && (fSignum > 0.0f || f3 > this.f69638)) {
                z2 = false;
            } else {
                f3 = this.f69638;
                this.f69676 = false;
                z2 = true;
            }
            this.f69653 = f3;
            this.f69663 = f3;
            this.f69679 = jNanoTime;
            if (interpolator != null && !z2) {
                if (this.f69647) {
                    interpolation = interpolator.getInterpolation((jNanoTime - this.f69660) * 1.0E-9f);
                    this.f69653 = interpolation;
                    this.f69679 = jNanoTime;
                    Interpolator interpolator2 = this.f69678;
                    if (interpolator2 instanceof AbstractInterpolatorC0400) {
                        float fMo2206 = ((AbstractInterpolatorC0400) interpolator2).mo2206();
                        this.f69665 = fMo2206;
                        if (Math.abs(fMo2206) * this.f69659 <= 1.0E-5f) {
                            this.f69676 = false;
                        }
                        if (fMo2206 > 0.0f && interpolation >= 1.0f) {
                            this.f69653 = 1.0f;
                            this.f69676 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo2206 < 0.0f && interpolation <= 0.0f) {
                            this.f69653 = 0.0f;
                            this.f69676 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f69678;
                    if (interpolator3 instanceof AbstractInterpolatorC0400) {
                        this.f69665 = ((AbstractInterpolatorC0400) interpolator3).mo2206();
                    } else {
                        this.f69665 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f69665) > 1.0E-5f) {
                m49547(EnumC4701.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.f69638) || (fSignum <= 0.0f && f3 <= this.f69638)) {
                f3 = this.f69638;
                this.f69676 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f69676 = false;
                m49547(EnumC4701.FINISHED);
            }
            int childCount = getChildCount();
            this.f69671 = false;
            long jNanoTime2 = System.nanoTime();
            this.f69636 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C21283 c21283 = (C21283) this.f69646.get(childAt);
                if (c21283 != null) {
                    this.f69671 = c21283.m48465(f3, jNanoTime2, childAt, this.f69662) | this.f69671;
                }
            }
            boolean z5 = (fSignum > 0.0f && f3 >= this.f69638) || (fSignum <= 0.0f && f3 <= this.f69638);
            if (!this.f69671 && !this.f69676 && z5) {
                m49547(EnumC4701.FINISHED);
            }
            if (this.f69635) {
                requestLayout();
            }
            this.f69671 = (!z5) | this.f69671;
            if (f3 > 0.0f || (i = this.f69674) == -1 || this.f69627 == i) {
                z4 = false;
            } else {
                this.f69627 = i;
                this.f69675.m31952(i).m13394(this);
                m49547(EnumC4701.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f69627;
                int i4 = this.f69629;
                if (i3 != i4) {
                    this.f69627 = i4;
                    this.f69675.m31952(i4).m13394(this);
                    m49547(EnumC4701.FINISHED);
                    z4 = true;
                }
            }
            if (this.f69671 || this.f69676) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m49547(EnumC4701.FINISHED);
            }
            if ((!this.f69671 && this.f69676 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m49552();
            }
        }
        float f4 = this.f69653;
        if (f4 >= 1.0f) {
            int i5 = this.f69627;
            int i6 = this.f69629;
            z3 = i5 == i6 ? z4 : true;
            this.f69627 = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.f69627;
                int i8 = this.f69674;
                z3 = i7 == i8 ? z4 : true;
                this.f69627 = i8;
            }
            this.f69655 |= z4;
            if (z4 && !this.f69637) {
                requestLayout();
            }
            this.f69663 = this.f69653;
        }
        z4 = z3;
        this.f69655 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f69663 = this.f69653;
    }

    @Override // l.C16872, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f69637 = true;
        try {
            if (this.f69675 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f69682 != i5 || this.f69654 != i6) {
                this.f69673.m24646();
                invalidate();
                m49550(true);
            }
            this.f69682 = i5;
            this.f69654 = i6;
        } finally {
            this.f69637 = false;
        }
    }

    @Override // l.C16872
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49519(AttributeSet attributeSet) {
        C12904 c12904;
        C12904 c12905;
        f69626 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4420);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f69675 = new C12904(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f69627 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f69638 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f69676 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f69644 == 0) {
                        this.f69644 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f69644 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f69675 = null;
            }
        }
        if (this.f69644 != 0 && (c12905 = this.f69675) != null) {
            int iM31962 = c12905.m31962();
            C12904 c12906 = this.f69675;
            C4194 c4194M31952 = c12906.m31952(c12906.m31962());
            C18540.m43116(getContext(), iM31962);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (c4194M31952.m13385(childAt.getId()) == null) {
                    C18540.m43118(childAt);
                }
            }
            int[] iArrM13395 = c4194M31952.m13395();
            for (int i3 = 0; i3 < iArrM13395.length; i3++) {
                int i4 = iArrM13395[i3];
                C18540.m43116(getContext(), i4);
                findViewById(iArrM13395[i3]);
                c4194M31952.m13400(i4);
                c4194M31952.m13398(i4);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (C15141 c15141 : this.f69675.m31951()) {
                C15141 c15142 = this.f69675.f41276;
                c15141.m36434(getContext());
                int iM36441 = c15141.m36441();
                int iM36440 = c15141.m36440();
                C18540.m43116(getContext(), iM36441);
                C18540.m43116(getContext(), iM36440);
                sparseIntArray.get(iM36441);
                sparseIntArray2.get(iM36440);
                sparseIntArray.put(iM36441, iM36440);
                sparseIntArray2.put(iM36440, iM36441);
                this.f69675.m31952(iM36441);
                this.f69675.m31952(iM36440);
            }
        }
        if (this.f69627 != -1 || (c12904 = this.f69675) == null) {
            return;
        }
        this.f69627 = c12904.m31962();
        this.f69674 = this.f69675.m31962();
        C15141 c15143 = this.f69675.f41276;
        this.f69629 = c15143 != null ? c15143.f49407 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49523(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m49523(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        float left = view.getLeft() + f;
        float top = view.getTop() + f2;
        float right = f + view.getRight();
        float bottom = f2 + view.getBottom();
        RectF rectF = this.f69667;
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
        C15141 c15141;
        C15666 c15666M36439;
        int iM37437;
        RectF rectFM37441;
        C12904 c12904 = this.f69675;
        if (c12904 == null || !this.f69652 || (c15141 = c12904.f41276) == null || !c15141.m36438() || (c15666M36439 = c15141.m36439()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFM37441 = c15666M36439.m37441(this, new RectF())) != null && !rectFM37441.contains(motionEvent.getX(), motionEvent.getY())) || (iM37437 = c15666M36439.m37437()) == -1) {
            return false;
        }
        View view = this.f69661;
        if (view == null || view.getId() != iM37437) {
            this.f69661 = findViewById(iM37437);
        }
        View view2 = this.f69661;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f69661.getTop();
        float right = this.f69661.getRight();
        float bottom = this.f69661.getBottom();
        RectF rectF = this.f69667;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m49523(0.0f, 0.0f, this.f69661, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C12904 c12904 = this.f69675;
        if (c12904 != null && this.f69652 && c12904.m31961()) {
            C15141 c15141 = this.f69675.f41276;
            if (c15141 != null && !c15141.m36438()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f69675.m31954(motionEvent, this.f69627, this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C15141 c15141;
        int i;
        super.onAttachedToWindow();
        C12904 c12904 = this.f69675;
        if (c12904 != null && (i = this.f69627) != -1) {
            C4194 c4194M31952 = c12904.m31952(i);
            this.f69675.m31957(this);
            if (c4194M31952 != null) {
                c4194M31952.m13392((C16872) this);
            }
            this.f69674 = this.f69627;
        }
        m49552();
        C7112 c7112 = this.f69649;
        if (c7112 != null) {
            C21855 c21855 = c7112.f23438;
            int i2 = c7112.f23436;
            if (i2 != -1 || c7112.f23435 != -1) {
                if (i2 == -1) {
                    c21855.m49544(c7112.f23435);
                } else {
                    int i3 = c7112.f23435;
                    if (i3 == -1) {
                        c21855.setState(i2, -1, -1);
                    } else {
                        c21855.m49546(i2, i3);
                    }
                }
                c21855.m49547(EnumC4701.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(c7112.f23437)) {
                    return;
                }
                c21855.m49554(c7112.f23437);
                return;
            }
            float f = c7112.f23437;
            if (!super.isAttachedToWindow()) {
                if (c21855.f69649 == null) {
                    c21855.f69649 = new C7112(c21855);
                }
                c21855.f69649.f23437 = f;
            } else {
                c21855.m49554(f);
                c21855.m49547(EnumC4701.MOVING);
                c21855.f69665 = Float.NaN;
                c21855.m49541(1.0f);
            }
            c7112.f23437 = Float.NaN;
            c7112.f23436 = -1;
            c7112.f23435 = -1;
            return;
        }
        C12904 c12905 = this.f69675;
        if (c12905 == null || (c15141 = c12905.f41276) == null || c15141.m36433() != 4) {
            return;
        }
        m49541(1.0f);
        m49547(EnumC4701.SETUP);
        m49547(EnumC4701.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C12904 c12904 = this.f69675;
        if (c12904 != null) {
            c12904.m31959(isRtl());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49552() {
        C12904 c12904;
        C15141 c15141;
        C12904 c12905 = this.f69675;
        if (c12905 == null) {
            return;
        }
        if (c12905.m31964(this, this.f69627)) {
            requestLayout();
            return;
        }
        int i = this.f69627;
        if (i != -1) {
            this.f69675.m31958(this, i);
        }
        if (!this.f69675.m31961() || (c15141 = (c12904 = this.f69675).f41276) == null || c15141.f49406 == null) {
            return;
        }
        c12904.f41276.f49406.m37435();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49545(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        C21283 c21283 = (C21283) this.f69646.get(viewById);
        if (c21283 != null) {
            c21283.m48455(f, f2, f3, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49543(float f, boolean z, int i) {
        ArrayList arrayList = this.f69672;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC13823) it.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49532() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f69672;
        if (arrayList2 == null || arrayList2.isEmpty() || this.f69664 == this.f69663) {
            return;
        }
        if (this.f69680 != -1 && (arrayList = this.f69672) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC13823) it.next()).getClass();
            }
        }
        this.f69680 = -1;
        this.f69664 = this.f69663;
        ArrayList arrayList3 = this.f69672;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((InterfaceC13823) it2.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49540() {
        ArrayList arrayList = this.f69672;
        if (arrayList != null && !arrayList.isEmpty() && this.f69680 == -1) {
            this.f69680 = this.f69627;
            ArrayList arrayList2 = this.f69643;
            int iIntValue = !arrayList2.isEmpty() ? ((Integer) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).intValue() : -1;
            int i = this.f69627;
            if (iIntValue != i && i != -1) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        m49528();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m49528() {
        ArrayList arrayList = this.f69672;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.f69643;
        for (Integer num : arrayList2) {
            ArrayList<InterfaceC13823> arrayList3 = this.f69672;
            if (arrayList3 != null) {
                for (InterfaceC13823 interfaceC13823 : arrayList3) {
                    num.getClass();
                    interfaceC13823.getClass();
                }
            }
        }
        arrayList2.clear();
    }

    @Override // l.C16872, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C18299) {
            C18299 c18299 = (C18299) view;
            if (this.f69672 == null) {
                this.f69672 = new ArrayList();
            }
            this.f69672.add(c18299);
            if (c18299.m42634()) {
                if (this.f69681 == null) {
                    this.f69681 = new ArrayList();
                }
                this.f69681.add(c18299);
            }
            if (c18299.m42635()) {
                if (this.f69641 == null) {
                    this.f69641 = new ArrayList();
                }
                this.f69641.add(c18299);
            }
        }
    }

    @Override // l.C16872, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f69681;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f69641;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49551() {
        return this.f69674;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m49553() {
        return this.f69629;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m49555() {
        return this.f69652;
    }
}
