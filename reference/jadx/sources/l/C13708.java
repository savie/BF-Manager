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

/* JADX INFO: renamed from: l.ܰۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes4.dex */
public class C13708 extends C19383 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f45195;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public float f45196;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4433 f45197;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f45198;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C9784 f45199;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f45200;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C10948 f45201;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public float f45202;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f45203;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC7448 f45204;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public final int f45205;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f45206;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C10948 f45207;

    public C13708(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45198 = new ArrayList();
        this.f45203 = new int[2];
        this.f45204 = new RunnableC7448(2, this);
        this.f45205 = ViewConfiguration.get(context).getScaledTouchSlop();
        m44420(new C3432(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33408(C13708 c13708) {
        c13708.f45206 = true;
        C9784 c9784 = c13708.f45199;
        if (c9784 != null && c9784.isAttachedToWindow() && c9784.isPressed()) {
            c9784.performLongClick();
        }
    }

    @Override // l.C19383, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        RunnableC7448 runnableC7448 = this.f45204;
        if (actionMasked == 0) {
            View viewM11514 = C4010.m11514(this, motionEvent.getX(), motionEvent.getY());
            if (viewM11514 instanceof C9784) {
                C9784 c9784 = (C9784) viewM11514;
                this.f45202 = motionEvent.getX();
                this.f45196 = motionEvent.getY();
                this.f45199 = c9784;
                int[] iArr = this.f45203;
                getLocationInWindow(iArr);
                int i = (int) (iArr[0] + this.f45202);
                int i2 = (int) (iArr[1] + this.f45196);
                c9784.getLocationInWindow(iArr);
                this.f45199.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
                this.f45199.setPressed(true);
                this.f45206 = false;
                this.f45195 = false;
                Handler handlerM39278 = C16737.m39278();
                handlerM39278.removeCallbacks(runnableC7448);
                handlerM39278.postDelayed(runnableC7448, ViewConfiguration.getLongPressTimeout());
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f45195 && this.f45199 != null) {
                    float fAbs = Math.abs(this.f45202 - motionEvent.getX());
                    float f = this.f45205;
                    if (fAbs > f || Math.abs(this.f45196 - motionEvent.getY()) > f) {
                        this.f45195 = true;
                        if (!this.f45206) {
                            C16737.m39278().removeCallbacks(runnableC7448);
                        }
                        this.f45199.setPressed(false);
                        this.f45199 = null;
                    }
                }
            } else if (actionMasked == 3 && this.f45199 != null) {
                if (!this.f45206) {
                    C16737.m39278().removeCallbacks(runnableC7448);
                }
                this.f45199.setPressed(false);
                this.f45199 = null;
            }
        } else if (this.f45199 != null) {
            if (!this.f45206) {
                C16737.m39278().removeCallbacks(runnableC7448);
                this.f45199.performClick();
            }
            this.f45199.setPressed(false);
            this.f45199 = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // l.C19383, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (C4534 c4534 : this.f45198) {
            int i4 = c4534.f16131;
            C14723 c14723 = c4534.f16129;
            if (i4 != i) {
                c14723.measure(i, 0);
                c4534.f16127 = c14723.getMeasuredHeight();
                c4534.f16130 = c14723.m35251();
                c4534.f16131 = i;
            }
            int i5 = c4534.f16127;
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
    public final void m33414(ArrayList arrayList, InterfaceC4433 interfaceC4433, C10948 c10948, C10948 c10949) {
        this.f45197 = interfaceC4433;
        this.f45207 = c10948;
        this.f45201 = c10949;
        m33413(arrayList);
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
    public final void m33413(ArrayList arrayList) {
        ArrayList<C4534> arrayList2;
        int i;
        C9784 c9784;
        if (this.f45197 == null || this.f45207 == null || this.f45201 == null) {
            return;
        }
        this.f45200 = arrayList;
        int size = arrayList.size();
        while (true) {
            arrayList2 = this.f45198;
            if (size <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new C4534(this, arrayList2.size()));
            }
        }
        while (size < arrayList2.size()) {
            C19028.m43762(arrayList2, 1);
        }
        for (C4534 c4534 : arrayList2) {
            int i2 = c4534.f16128;
            C14723 c14723 = c4534.f16129;
            List listM23579 = ((C9166) arrayList.get(i2)).m23579();
            C13708 c13708 = c4534.f16132;
            InterfaceC4433 interfaceC4433 = c13708.f45197;
            C10948 c10948 = c13708.f45207;
            C10948 c10949 = c13708.f45201;
            int childCount = c14723.getChildCount();
            ArrayList arrayList3 = new ArrayList(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = c14723.getChildAt(i3);
                if (childAt instanceof C9784) {
                    arrayList3.add((C9784) childAt);
                }
            }
            c14723.removeAllViews();
            int i4 = 0;
            for (C21159 c21159 : (ArrayList) listM23579) {
                if (i4 < arrayList3.size()) {
                    i = i4 + 1;
                    c9784 = (C9784) arrayList3.get(i4);
                } else {
                    i = i4;
                    c9784 = new C9784(c14723.getContext());
                }
                c9784.getClass();
                c9784.setText(c21159.m47614());
                C6111 c6111Mo11315 = interfaceC4433.mo11315();
                if (c6111Mo11315 != null) {
                    c9784.setTextColor(c6111Mo11315.m16832());
                }
                ViewOnClickListenerC2021 viewOnClickListenerC2021 = new ViewOnClickListenerC2021(c21159, c10948, c10949, interfaceC4433);
                c9784.setOnClickListener(viewOnClickListenerC2021);
                c9784.setOnLongClickListener(viewOnClickListenerC2021);
                c9784.setClickable(false);
                c9784.setLongClickable(false);
                c14723.addView(c9784);
                i4 = i;
            }
            c4534.f16131 = 0;
            c14723.setScrollY(0);
            c14723.m35247();
            c14723.m35250();
        }
        int iM44426 = m44426();
        m44420(new C3432(this));
        if (iM44426 >= 0 && iM44426 < size) {
            m44413(iM44426);
        } else if (iM44426 == size) {
            m44413(iM44426 - 1);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m33415() {
        Iterator it = this.f45198.iterator();
        while (it.hasNext()) {
            int i = ((C4534) it.next()).f16130;
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4534 m33411() {
        int iM44426 = m44426();
        if (iM44426 < 0) {
            return null;
        }
        ArrayList arrayList = this.f45198;
        if (iM44426 < arrayList.size()) {
            return (C4534) arrayList.get(iM44426);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m33412() {
        Iterator it = this.f45198.iterator();
        while (it.hasNext()) {
            C14723 c14723 = ((C4534) it.next()).f16129;
            c14723.setScrollY(0);
            c14723.m35247();
            c14723.m35250();
        }
    }
}
