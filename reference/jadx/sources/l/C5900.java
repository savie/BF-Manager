package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5900 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static long f20109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f20110;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f20111;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f20112;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC8017 f20113;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5938 f20114;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f20115;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f20116;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC16484 f20117;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C9264 f20118;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f20119;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6606 f20120;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f20121;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f20122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20123;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f20124;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11545 f20125;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC19306 f20126;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1501 f20127;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f20128;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC16962 f20129;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f20130;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f20131;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f20132;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.ViewTreeObserver$OnPreDrawListener, l.᩵ۜ᩹] */
    public C5900(C11545 c11545, final C6606 c6606) {
        C5938 c5938 = new C5938(new C0255(this));
        this.f20114 = c5938;
        this.f20118 = new C9264();
        this.f20131 = Collections.EMPTY_LIST;
        this.f20122 = -1;
        this.f20132 = -1;
        this.f20124 = -1;
        this.f20123 = -1;
        this.f20121 = new int[0];
        this.f20119 = true;
        this.f20116 = C17492.FOREVER_NS;
        this.f20113 = new RunnableC8017(0, this);
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.᩵ۜ᩹
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C5900.m16143(this.f62291);
                return true;
            }
        };
        this.f20126 = r1;
        this.f20125 = c11545;
        this.f20120 = c6606;
        this.f20129 = new ViewOnTouchListenerC16962(this, c6606);
        c5938.m38885(c6606);
        c6606.setAdapter((ListAdapter) c5938);
        this.f20127 = new C1501(new C8723(this), new C10134(0, this));
        c6606.getViewTreeObserver().addOnPreDrawListener(r1);
        c6606.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC15779(this));
        c11545.m28824().getLifecycle().mo9171(new InterfaceC5657() { // from class: l.۟ۜ᩹
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                C5900.m16148(this.f24280, c6606, interfaceC1423, enumC1651);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16148(C5900 c5900, C6606 c6606, InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            c5900.m16137();
            c6606.getViewTreeObserver().removeOnPreDrawListener(c5900.f20126);
        } else if (interfaceC1423.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
            c5900.m16141(0L);
        } else {
            c5900.m16137();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16162(String str) {
        this.f20112 = str;
        this.f20115 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16168(String str) {
        m16142(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16142(String str, boolean z) {
        C17189 c17189;
        InterfaceC2557 interfaceC2557;
        int iM45983;
        C6606 c6606 = this.f20120;
        int childCount = c6606.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag = c6606.getChildAt(i2).getTag();
            if ((tag instanceof C17189) && (interfaceC2557 = (c17189 = (C17189) tag).f54811) != null && interfaceC2557.isDirectory() == z && interfaceC2557.getPath().equals(str)) {
                if (z) {
                    iM45983 = C20368.m45983(553648127, 620756991);
                } else {
                    iM45983 = C20368.m45983(889192447, 822083583);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(iM45983 & C20368.f66007), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                c17189.f54808.setBackground(transitionDrawable);
                if (z) {
                    transitionDrawable.startTransition(EnumC12167.f40710);
                    return;
                } else {
                    C16737.m39274(new RunnableC17894(i, transitionDrawable), 250L);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16160(int i, String str, String str2, List list) {
        ViewTreeObserverOnPreDrawListenerC16484 viewTreeObserverOnPreDrawListenerC16484 = this.f20117;
        if (viewTreeObserverOnPreDrawListenerC16484 != null) {
            viewTreeObserverOnPreDrawListenerC16484.m38751();
        }
        this.f20117 = new ViewTreeObserverOnPreDrawListenerC16484(this, i, str, str2, list);
        this.f20125.m28824().getLifecycle().mo9171(this.f20117);
        C6606 c6606 = this.f20120;
        c6606.getViewTreeObserver().addOnPreDrawListener(this.f20117);
        c6606.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16157() {
        return this.f20120.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16167(int i) {
        this.f20120.setSelection(i);
        C16737.m39274(new RunnableC18600(i, 0, this), 100L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16144(C5900 c5900, int i) {
        C6606 c6606 = c5900.f20120;
        int firstVisiblePosition = c6606.getFirstVisiblePosition();
        int lastVisiblePosition = c6606.getLastVisiblePosition();
        if (i < firstVisiblePosition || lastVisiblePosition < i) {
            c6606.setSelection(i);
        }
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
    public final void m16158(int i, int i2, String str, C0877 c0877) {
        m16162((String) null);
        C6606 c6606 = this.f20120;
        c6606.setSelection(i);
        ViewTreeObserverOnPreDrawListenerC20012 viewTreeObserverOnPreDrawListenerC20012 = new ViewTreeObserverOnPreDrawListenerC20012(this, c0877, i2, new RunnableC20717(0, this, str));
        c6606.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC20012);
        c6606.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC20012);
        c6606.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16161(int i, C10051 c10051) {
        ViewTreeObserverOnPreDrawListenerC20012 viewTreeObserverOnPreDrawListenerC20012 = new ViewTreeObserverOnPreDrawListenerC20012(this, c10051, i, null);
        C6606 c6606 = this.f20120;
        c6606.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC20012);
        c6606.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC20012);
        c6606.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5380 m16140(C5900 c5900, int i, View view, ViewGroup viewGroup) {
        C5380 c5380;
        View view2;
        C11545 c11545 = c5900.f20125;
        C17189 c17189 = view != null ? (C17189) view.getTag() : null;
        boolean z = false;
        if (view instanceof C5380) {
            C5380 c5381 = (C5380) view;
            c5381.m14934();
            view2 = view;
            c5380 = c5381;
        } else {
            C5380 c5382 = new C5380(viewGroup.getContext());
            c17189 = new C17189(z ? 1 : 0);
            c17189.f54808 = c5382.m14939();
            c17189.f54807 = c5382.m14931();
            c17189.f54810 = c5382.m14938();
            c17189.f54814 = c5382.m14940();
            c17189.f54813 = c5382.m14937();
            c17189.f54809 = c5382.m14936();
            c17189.f54806 = c5382.m14932();
            c5382.setTag(c17189);
            c5380 = c5382;
            view2 = c5382;
        }
        String str = c5900.f20112;
        if (str != null && System.currentTimeMillis() - c5900.f20115 > 800) {
            str = null;
        }
        try {
            InterfaceC2557 interfaceC2557M28769 = c11545.m28769(i);
            c17189.f54811 = interfaceC2557M28769;
            if (!c11545.m28821() || interfaceC2557M28769.isDirectory() || interfaceC2557M28769.mo7969()) {
                view2.setAlpha(1.0f);
            } else {
                view2.setAlpha(0.4f);
            }
            if (c11545.f38808.m36132()) {
                view2.setBackgroundColor(interfaceC2557M28769.isChecked() ? C20368.f65992 : 0);
            } else {
                view2.setBackgroundColor(0);
            }
            if (interfaceC2557M28769.mo7984()) {
                c5380.m14935(true);
                c17189.f54806.setText(interfaceC2557M28769.getName());
            } else {
                c5380.m14935(false);
                if (interfaceC2557M28769.mo7983()) {
                    c17189.f54807.setTextColor(C20368.f65973);
                } else {
                    c17189.f54807.setTextColor(C20368.f65976);
                }
                c17189.f54807.setText(interfaceC2557M28769.mo7963());
                if (str != null && str.equals(interfaceC2557M28769.getPath())) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C20368.f66007 & C20368.m45983(553648127, 620756991)), new ColorDrawable(0)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c17189.f54808.setBackground(transitionDrawable);
                    transitionDrawable.startTransition(EnumC12167.f40710);
                    c5900.f20112 = null;
                } else if (c17189.f54808.getBackground() != null) {
                    c17189.f54808.setBackground(null);
                }
                CharSequence charSequenceMo7973 = interfaceC2557M28769.mo7973();
                if (charSequenceMo7973 != null) {
                    c17189.f54810.setText(charSequenceMo7973);
                } else if (interfaceC2557M28769.mo7982()) {
                    long jMo7990 = interfaceC2557M28769.mo7990();
                    if (jMo7990 == -1) {
                        jMo7990 = interfaceC2557M28769.getSize();
                    }
                    c17189.f54810.setText(C1791.m5863(jMo7990));
                } else {
                    c17189.f54810.setText((CharSequence) null);
                }
                if (interfaceC2557M28769.mo7969()) {
                    c17189.f54814.setVisibility(4);
                    c17189.f54814.setText((CharSequence) null);
                    c17189.f54813.setText((CharSequence) null);
                    if (c17189.f54813.getVisibility() != 0) {
                        c17189.f54813.setVisibility(0);
                    }
                } else if (interfaceC2557M28769.mo7991()) {
                    c17189.f54814.setVisibility(4);
                    c17189.f54814.setText((CharSequence) null);
                    c17189.f54813.setVisibility(8);
                } else {
                    if (interfaceC2557M28769.mo7986()) {
                        c17189.f54814.setVisibility(0);
                        c17189.f54814.setText("->");
                    } else if (interfaceC2557M28769.mo7987()) {
                        c17189.f54814.setVisibility(0);
                        c17189.f54814.setText("* ");
                    } else {
                        c17189.f54814.setVisibility(4);
                        c17189.f54814.setText(" ");
                    }
                    CharSequence charSequenceMo7981 = interfaceC2557M28769.mo7981();
                    if (charSequenceMo7981 == null) {
                        int i2 = C0674.f2823;
                        charSequenceMo7981 = C5319.m14740(interfaceC2557M28769.getTime(), (i2 & 1) != 0, (i2 & 2) != 0);
                    }
                    c17189.f54813.setText(charSequenceMo7981);
                    if (c17189.f54813.getVisibility() != 0) {
                        c17189.f54813.setVisibility(0);
                    }
                }
                C14600 icon = interfaceC2557M28769.getIcon();
                if (icon != null) {
                    c17189.f54809.setImageDrawable(icon.m35074());
                }
            }
            int i3 = c17189.f54812;
            int i4 = C0674.f2825;
            if (i3 != i4) {
                c17189.f54812 = i4;
                c17189.f54807.setSingleLine(i4 == 1);
                c17189.f54807.setMaxLines(c17189.f54812);
            }
            int i5 = c17189.f54805;
            int i6 = C0674.f2831;
            if (i5 != i6) {
                c17189.f54805 = i6;
                if (i6 == 1) {
                    c17189.f54806.setTextSize(2, 15.0f);
                    c17189.f54807.setTextSize(2, 13.0f);
                    c17189.f54810.setTextSize(2, 10.0f);
                    c17189.f54814.setTextSize(2, 10.0f);
                    c17189.f54813.setTextSize(2, 10.0f);
                } else if (i6 == 2) {
                    c17189.f54806.setTextSize(2, 17.0f);
                    c17189.f54807.setTextSize(2, 15.0f);
                    c17189.f54810.setTextSize(2, 11.0f);
                    c17189.f54814.setTextSize(2, 11.0f);
                    c17189.f54813.setTextSize(2, 11.0f);
                } else if (i6 == 3) {
                    c17189.f54806.setTextSize(2, 19.0f);
                    c17189.f54807.setTextSize(2, 17.0f);
                    c17189.f54810.setTextSize(2, 12.0f);
                    c17189.f54814.setTextSize(2, 12.0f);
                    c17189.f54813.setTextSize(2, 12.0f);
                }
            }
        } catch (Exception unused) {
        }
        return (C5380) view2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m16151(int i) {
        f20110 = i;
        f20109 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16166() {
        m16154();
        C11545 c11545 = this.f20125;
        InterfaceC13848 interfaceC13848Mo23624 = c11545.m28817().mo23624();
        for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
            if (interfaceC2557.getIcon() == null) {
                interfaceC2557.mo7964(interfaceC13848Mo23624.mo7924(interfaceC2557));
                int iMo7926 = interfaceC13848Mo23624.mo7926(interfaceC2557);
                if (iMo7926 != 0) {
                    interfaceC2557.mo7975(iMo7926);
                }
            }
        }
        long j = f20109 + ((long) f20110);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C5938 c5938 = this.f20114;
        if (j > jUptimeMillis) {
            c5938.m30532(false);
        } else {
            c5938.m30532(true);
            c5938.m30530();
        }
        c5938.notifyDataSetChanged();
        m16141(0L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16156() {
        m16154();
        C11545 c11545 = this.f20125;
        InterfaceC13848 interfaceC13848Mo23624 = c11545.m28817().mo23624();
        for (InterfaceC2557 interfaceC2557 : c11545.m28795()) {
            interfaceC2557.mo7964(interfaceC13848Mo23624.mo7924(interfaceC2557));
            int iMo7926 = interfaceC13848Mo23624.mo7926(interfaceC2557);
            if (iMo7926 != 0) {
                interfaceC2557.mo7975(iMo7926);
            }
        }
        this.f20114.notifyDataSetChanged();
        m16141(0L);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m16164() {
        m16154();
        C5938 c5938 = this.f20114;
        c5938.m30532(false);
        c5938.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m16153(C5900 c5900) {
        c5900.f20116 = C17492.FOREVER_NS;
        c5900.f20120.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16141(long j) {
        if (this.f20125.m28824().getLifecycle().mo9170() == EnumC9414.DESTROYED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        if (jUptimeMillis >= this.f20116) {
            return;
        }
        C6606 c6606 = this.f20120;
        RunnableC8017 runnableC8017 = this.f20113;
        c6606.removeCallbacks(runnableC8017);
        this.f20116 = jUptimeMillis;
        c6606.postOnAnimationDelayed(runnableC8017, j);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m16154() {
        this.f20127.m5187();
        this.f20118.m23801();
        this.f20131 = Collections.EMPTY_LIST;
        this.f20123 = -1;
        this.f20124 = -1;
        this.f20132 = -1;
        this.f20122 = -1;
        this.f20121 = new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m16137() {
        if (!this.f20119) {
            m16154();
        }
        this.f20119 = true;
        this.f20120.removeCallbacks(this.f20113);
        this.f20116 = C17492.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16143(C5900 c5900) {
        int i;
        int i2;
        int iCompare;
        int i3;
        int i4;
        int top;
        C6606 c6606 = c5900.f20120;
        C11545 c11545 = c5900.f20125;
        if (!c11545.m28824().getLifecycle().mo9170().m24173(EnumC9414.STARTED) || !c6606.isShown() || !c6606.isAttachedToWindow()) {
            c5900.m16137();
            return;
        }
        if (c11545.m28800()) {
            c5900.m16137();
            c5900.m16141(80L);
            return;
        }
        c5900.f20119 = false;
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        if (abstractC11462M28817 != c5900.f20128 || !C13638.equals(abstractC11462M28817.m28629(), c5900.f20130)) {
            c5900.m16154();
            c5900.f20128 = abstractC11462M28817;
            c5900.f20130 = abstractC11462M28817.m28629();
        }
        int firstVisiblePosition = c6606.getFirstVisiblePosition();
        int childCount = c6606.getChildCount();
        int i5 = (firstVisiblePosition + childCount) - 1;
        if (childCount <= 0 || (i2 = c5900.f20123) < 0) {
            i = 0;
        } else {
            if (firstVisiblePosition >= i2) {
                int i6 = firstVisiblePosition - i2;
                int[] iArr = c5900.f20121;
                if (i6 < iArr.length) {
                    i4 = iArr[i6];
                    top = c6606.getChildAt(0).getTop();
                } else if (i2 < firstVisiblePosition && (i3 = i2 - firstVisiblePosition) < childCount) {
                    i4 = c5900.f20121[0];
                    top = c6606.getChildAt(i3).getTop();
                } else {
                    iCompare = Integer.compare(firstVisiblePosition, i2) * c6606.getHeight();
                }
                iCompare = i4 - top;
            } else {
                if (i2 < firstVisiblePosition) {
                }
                iCompare = Integer.compare(firstVisiblePosition, i2) * c6606.getHeight();
            }
            i = iCompare;
        }
        if (c5900.f20121.length != childCount) {
            c5900.f20121 = new int[childCount];
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            c5900.f20121[i7] = c6606.getChildAt(i7).getTop();
        }
        c5900.f20123 = childCount == 0 ? -1 : firstVisiblePosition;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int iM23800 = c5900.f20118.m23800(jUptimeMillis, i, c6606.getHeight(), c6606.m17934(), c6606.m17935());
        int iM23799 = c5900.f20118.m23799();
        if (firstVisiblePosition != c5900.f20122 || i5 != c5900.f20132 || iM23800 != c5900.f20124 || iM23799 != c5900.f20111) {
            c5900.f20131 = C9264.m23797(c11545.m28829(), firstVisiblePosition, i5, iM23800, iM23799);
            c5900.f20122 = firstVisiblePosition;
            c5900.f20132 = i5;
            c5900.f20124 = iM23800;
            c5900.f20111 = iM23799;
        }
        c5900.f20127.m5188(c5900.f20131, childCount, abstractC11462M28817, abstractC11462M28817.mo23624(), iM23800, jUptimeMillis);
        if (c6606.m17934()) {
            c5900.m16141(80L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16147(C5900 c5900, InterfaceC2557 interfaceC2557) {
        C6606 c6606 = c5900.f20120;
        int childCount = c6606.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = c6606.getChildAt(i).getTag();
            if (tag instanceof C17189) {
                C17189 c17189 = (C17189) tag;
                C14600 icon = interfaceC2557.getIcon();
                if (c17189.f54811 == interfaceC2557 && icon != null) {
                    C2830 c2830 = c17189.f54809;
                    if (c6606.m17934()) {
                        c2830.setImageDrawable(icon.m35074());
                        return;
                    }
                    Drawable drawable = c2830.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m35074()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c2830.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16159(int i, View view) {
        view.setBackgroundColor(C20368.f65992);
        C15073 c15073 = this.f20125.f38808;
        if (!c15073.m36132()) {
            c15073.m36144(i);
        } else if (c15073.m36148(i)) {
            m16164();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16165() {
        ApplicationC0716.m3134(this.f20125.f38808.m36149());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16163(int i) {
        List listM28829;
        C11545 c11545 = this.f20125;
        if (!c11545.m28821() && (listM28829 = c11545.m28829()) != null && i >= 0 && i < listM28829.size()) {
            return !((InterfaceC2557) listM28829.get(i)).mo7980();
        }
        return false;
    }
}
