package l;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes3.dex */
public class C4147 extends C15179 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f14091;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C20555 f14092;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f14093;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public float f14094;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C23255 f14095;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f14096;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7960 f14097;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14098;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final int f14099;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f14100;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC12350 f14101;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public float f14102;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C23255 f14103;

    public C4147(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14091 = new ArrayList();
        this.f14093 = new int[2];
        this.f14101 = new RunnableC12350(0, this);
        this.f14099 = ViewConfiguration.get(context).getScaledTouchSlop();
        m36514(new C6385(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13293(C4147 c4147) {
        c4147.f14098 = true;
        C20555 c20555 = c4147.f14092;
        if (c20555 != null && c20555.isAttachedToWindow() && c20555.isPressed()) {
            c20555.performLongClick();
        }
    }

    @Override // l.C15179, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        RunnableC12350 runnableC12350 = this.f14101;
        if (actionMasked == 0) {
            View viewM30017 = C11972.m30017(this, motionEvent.getX(), motionEvent.getY());
            if (viewM30017 instanceof C20555) {
                C20555 c20555 = (C20555) viewM30017;
                this.f14094 = motionEvent.getX();
                this.f14102 = motionEvent.getY();
                this.f14092 = c20555;
                int[] iArr = this.f14093;
                getLocationInWindow(iArr);
                int i = (int) (iArr[0] + this.f14094);
                int i2 = (int) (iArr[1] + this.f14102);
                c20555.getLocationInWindow(iArr);
                this.f14092.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
                this.f14092.setPressed(true);
                this.f14098 = false;
                this.f14096 = false;
                Handler handlerM49077 = C21576.m49077();
                handlerM49077.removeCallbacks(runnableC12350);
                handlerM49077.postDelayed(runnableC12350, ViewConfiguration.getLongPressTimeout());
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f14096 && this.f14092 != null) {
                    float fAbs = Math.abs(this.f14094 - motionEvent.getX());
                    float f = this.f14099;
                    if (fAbs > f || Math.abs(this.f14102 - motionEvent.getY()) > f) {
                        this.f14096 = true;
                        if (!this.f14098) {
                            C21576.m49077().removeCallbacks(runnableC12350);
                        }
                        this.f14092.setPressed(false);
                        this.f14092 = null;
                    }
                }
            } else if (actionMasked == 3 && this.f14092 != null) {
                if (!this.f14098) {
                    C21576.m49077().removeCallbacks(runnableC12350);
                }
                this.f14092.setPressed(false);
                this.f14092 = null;
            }
        } else if (this.f14092 != null) {
            if (!this.f14098) {
                C21576.m49077().removeCallbacks(runnableC12350);
                this.f14092.performClick();
            }
            this.f14092.setPressed(false);
            this.f14092 = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // l.C15179, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (C24285 c24285 : this.f14091) {
            int i4 = c24285.f78607;
            C23539 c23539 = c24285.f78606;
            if (i4 != i) {
                c23539.measure(i, 0);
                c24285.f78608 = c23539.getMeasuredHeight();
                c24285.f78604 = c23539.m52746();
                c24285.f78607 = i;
            }
            int i5 = c24285.f78608;
            if (i5 > i3) {
                i3 = i5;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        } else if (View.MeasureSpec.getSize(i2) > i3) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13297(ArrayList arrayList, InterfaceC7960 interfaceC7960, C23255 c23255, C23255 c23256) {
        this.f14097 = interfaceC7960;
        this.f14103 = c23255;
        this.f14095 = c23256;
        m13296(arrayList);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13296(ArrayList arrayList) {
        ArrayList<C24285> arrayList2;
        int i;
        C20555 c20555;
        if (this.f14097 == null || this.f14103 == null || this.f14095 == null) {
            return;
        }
        this.f14100 = arrayList;
        int size = arrayList.size();
        while (true) {
            arrayList2 = this.f14091;
            if (size <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new C24285(this, arrayList2.size()));
            }
        }
        while (size < arrayList2.size()) {
            C2764.m9138(arrayList2, 1);
        }
        for (C24285 c24285 : arrayList2) {
            int i2 = c24285.f78603;
            C23539 c23539 = c24285.f78606;
            List listM6080 = ((C1711) arrayList.get(i2)).m6080();
            C4147 c4147 = c24285.f78605;
            InterfaceC7960 interfaceC7960 = c4147.f14097;
            C23255 c23255 = c4147.f14103;
            C23255 c23256 = c4147.f14095;
            int childCount = c23539.getChildCount();
            ArrayList arrayList3 = new ArrayList(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = c23539.getChildAt(i3);
                if (childAt instanceof C20555) {
                    arrayList3.add((C20555) childAt);
                }
            }
            c23539.removeAllViews();
            int i4 = 0;
            for (C16626 c16626 : (ArrayList) listM6080) {
                if (i4 < arrayList3.size()) {
                    i = i4 + 1;
                    c20555 = (C20555) arrayList3.get(i4);
                } else {
                    i = i4;
                    c20555 = new C20555(c23539.getContext());
                }
                c20555.getClass();
                c20555.setText(c16626.m39346());
                C24132 c24132Mo10928 = interfaceC7960.mo10928();
                if (c24132Mo10928 != null) {
                    c20555.setTextColor(c24132Mo10928.m53954());
                }
                ViewOnClickListenerC3401 viewOnClickListenerC3401 = new ViewOnClickListenerC3401(c16626, c23255, c23256, interfaceC7960);
                c20555.setOnClickListener(viewOnClickListenerC3401);
                c20555.setOnLongClickListener(viewOnClickListenerC3401);
                c20555.setClickable(false);
                c20555.setLongClickable(false);
                c23539.addView(c20555);
                i4 = i;
            }
            c24285.f78607 = 0;
            c23539.setScrollY(0);
            c23539.m52742();
            c23539.m52745();
        }
        int iM36517 = m36517();
        m36514(new C6385(this));
        if (iM36517 >= 0 && iM36517 < size) {
            m36527(iM36517);
        } else if (iM36517 == size) {
            m36527(iM36517 - 1);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m13299() {
        Iterator it = this.f14091.iterator();
        while (it.hasNext()) {
            int i = ((C24285) it.next()).f78604;
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24285 m13300() {
        int iM36517 = m36517();
        if (iM36517 < 0) {
            return null;
        }
        ArrayList arrayList = this.f14091;
        if (iM36517 < arrayList.size()) {
            return (C24285) arrayList.get(iM36517);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13298() {
        Iterator it = this.f14091.iterator();
        while (it.hasNext()) {
            C23539 c23539 = ((C24285) it.next()).f78606;
            c23539.setScrollY(0);
            c23539.m52742();
            c23539.m52745();
        }
    }
}
