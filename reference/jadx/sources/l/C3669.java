package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3669 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17930 f12615;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12616;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C23807 f12617;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f12618;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12619;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12620;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12621;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f12622 = new AtomicLong();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12623;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17930 f12625;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C17930 f12626;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C17930 f12627;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C17930 f12628;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C17930 f12629;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f12630;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ImageView f12631;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f12632;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12633;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogC7990 f12634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PopupWindow f12635;

    static {
        C17930 c17930 = new C17930("");
        f12619 = c17930;
        C17930 c17931 = new C17930("");
        f12620 = c17931;
        f12629 = new C17930("");
        f12623 = new C17930(null);
        C17930 c17932 = new C17930(null);
        f12615 = c17932;
        f12627 = new C17930(null);
        C17930 c17933 = new C17930(Boolean.FALSE);
        f12621 = c17933;
        C17930 c17934 = new C17930(0);
        f12625 = c17934;
        C17930 c17935 = new C17930(0);
        f12628 = c17935;
        f12624 = new C17930(0);
        C17930 c17936 = new C17930(0);
        f12616 = c17936;
        C17930 c17937 = new C17930(Integer.valueOf(C11369.m28688()));
        f12626 = c17937;
        c17930.m40351((InterfaceC16438) new C12115());
        c17931.m40351((InterfaceC16438) new C6150());
        c17932.m40351((InterfaceC16438) new C24050());
        c17933.m40351((InterfaceC16438) new C3912());
        c17934.m40351((InterfaceC16438) new C21066());
        c17935.m40351((InterfaceC16438) new C18082());
        c17936.m40351((InterfaceC16438) new C0183());
        c17937.m40351((InterfaceC16438) new C7641());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11940(AbstractActivityC17204 abstractActivityC17204) {
        if (abstractActivityC17204 instanceof ActivityC20823) {
            abstractActivityC17204.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.֨֨, l.ܿ᩶᩻] */
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
    public C3669(final AbstractActivityC17204 abstractActivityC17204) {
        ImageView imageView;
        C16590 c16590;
        this.f12630 = abstractActivityC17204;
        final DialogInterfaceC8327 dialogInterfaceC8327M7999 = abstractActivityC17204.buildDialog().m7999();
        final C16872 c16872 = (C16872) abstractActivityC17204.m40395(R.layout.MT_Protector);
        final C4194 c4194 = new C4194();
        final C4194 c4195 = new C4194();
        c4194.m13397(c16872);
        c4195.m13397((C16872) LayoutInflater.from(abstractActivityC17204).inflate(R.layout.MT_Protector, (ViewGroup) null));
        if (abstractActivityC17204.getResources().getConfiguration().orientation == 2) {
            c4195.m13392(c16872);
        }
        final ?? r2 = new InterfaceC0818() { // from class: l.ܿ᩶᩻
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                int i = ((Configuration) obj).orientation;
                C16872 c16873 = c16872;
                if (i == 2) {
                    c4195.m13392(c16873);
                } else {
                    c4194.m13392(c16873);
                }
            }
        };
        InterfaceC5252 interfaceC5252 = new InterfaceC5252() { // from class: l.֡᩶᩻
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                EnumC9330 enumC9331 = EnumC9330.ON_START;
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                C18583 c18583 = r2;
                if (enumC9330 == enumC9331) {
                    abstractActivityC17205.mo16529(c18583);
                    abstractActivityC17205.mo16526(c18583);
                } else if (enumC9330 == EnumC9330.ON_STOP) {
                    abstractActivityC17205.mo16529(c18583);
                }
            }
        };
        AbstractC8585 lifecycle = dialogInterfaceC8327M7999.getLifecycle();
        lifecycle.mo23077(interfaceC5252);
        if (lifecycle.mo23076().m8762(EnumC2619.STARTED)) {
            abstractActivityC17204.mo16526((InterfaceC0818) r2);
        }
        dialogInterfaceC8327M7999.m22429((ViewGroup) c16872);
        TextView textView = (TextView) c16872.findViewById(R.id.textView1);
        TextView textView2 = (TextView) c16872.findViewById(R.id.textView2);
        final C3667 c3667 = (C3667) c16872.findViewById(R.id.MT_Protector);
        final SeekBar seekBar = (SeekBar) c16872.findViewById(R.id.MT_Protector);
        final TextView textView3 = (TextView) c16872.findViewById(R.id.textView3);
        TextView textView4 = (TextView) c16872.findViewById(R.id.textView4);
        final ImageView imageView2 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        ImageView imageView3 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        ImageView imageView4 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        final ImageView imageView5 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        ImageView imageView6 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC15284.m36686(textView);
        ViewOnClickListenerC15284.m36686(textView2);
        c3667.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩻ۙ֫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C3669.m11934(this.f80244, abstractActivityC17204);
                return true;
            }
        });
        ImageView imageView7 = (ImageView) c16872.findViewById(R.id.MT_Protector);
        this.f12631 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩷֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3669.m11927(view, abstractActivityC17204, dialogInterfaceC8327M7999);
            }
        });
        final boolean zM10878 = C3296.m10878();
        if ((abstractActivityC17204 instanceof Main) || (abstractActivityC17204 instanceof ActivityC20823)) {
            imageView = imageView3;
            c16590 = new InterfaceC0818() { // from class: l.ܺۙ֫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    boolean zM10879 = C3296.m10878();
                    final boolean z = zM10878;
                    if (z == zM10879) {
                        return;
                    }
                    final C3669 c3669 = this.f53670;
                    final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M7999;
                    final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                    c16872.post(new Runnable() { // from class: l.ۢۙ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3669.m11933(c3669, dialogInterfaceC8327, z, abstractActivityC17205);
                        }
                    });
                }
            };
        } else {
            imageView = imageView3;
            c16590 = 0;
        }
        int i = 0;
        f12619.m40350(dialogInterfaceC8327M7999, new C19787(i, textView));
        f12629.m40350(dialogInterfaceC8327M7999, new C19787(i, textView2));
        f12623.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.ܽۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                Drawable drawable = (Drawable) obj;
                String string = drawable instanceof C0448 ? abstractActivityC17204.getString(R.string.MT_Protector) : null;
                C3667 c3668 = c3667;
                c3668.setContentDescription(string);
                if (c3668.getDrawable() != drawable) {
                    c3668.setImageDrawable(drawable);
                }
                c3668.m11923();
            }
        });
        f12621.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.ܶۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = bool.booleanValue() ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                ImageView imageView8 = imageView2;
                imageView8.setImageResource(i2);
                imageView8.setContentDescription(C21576.m49088(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector));
                c3667.m11922(bool.booleanValue());
            }
        });
        f12628.m40350(dialogInterfaceC8327M7999, new C23304(i, textView4));
        f12625.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.ۗۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                textView3.setText(C3669.m11953(((Integer) obj).intValue()));
            }
        });
        f12616.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.᩵ۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                SeekBar seekBar2 = seekBar;
                seekBar2.setMax(iIntValue);
                Integer num = (Integer) C3669.f12624.m40346();
                C17359.requireNonNull(num);
                seekBar2.setProgress(num.intValue());
            }
        });
        C17359.requireNonNull(seekBar);
        f12624.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.ܰۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                seekBar.setProgress(((Integer) obj).intValue());
            }
        });
        f12626.m40350(dialogInterfaceC8327M7999, new InterfaceC16438() { // from class: l.ۡۙ֫
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                int i2;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                float[] fArr = C11369.f35782;
                if (iIntValue == 1) {
                    i2 = R.drawable.MT_Protector;
                } else if (iIntValue != 2) {
                    i2 = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                } else {
                    i2 = R.drawable.MT_Protector;
                }
                ImageView imageView8 = imageView5;
                imageView8.setImageResource(i2);
                imageView8.setContentDescription(C21576.m49088(C11369.m28684(num.intValue())));
            }
        });
        seekBar.setOnSeekBarChangeListener(new C20077(textView3));
        final C24720 c24720M55197 = C24720.m55197();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۙ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3669.m11958(dialogInterfaceC8327M7999, c24720M55197);
            }
        });
        imageView.setOnClickListener(new ViewOnClickListenerC8386(i, dialogInterfaceC8327M7999, c24720M55197));
        imageView4.setOnClickListener(new ViewOnClickListenerC6895(i, dialogInterfaceC8327M7999, c24720M55197));
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.۬ۙ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3669.m11937(dialogInterfaceC8327M7999, abstractActivityC17204, imageView2);
            }
        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۙ᩷֫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int iM28688 = C11369.m28688();
                C1299 c1299 = new C1299(abstractActivityC17204);
                c1299.m4705(C11369.m28684(iM28688), imageView2);
                C21576.m49069(new RunnableC13815(1, c1299), SnackbarManager.SHORT_DURATION_MS);
                return true;
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: l.᩷᩷֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3669.m11932(this.f72240, dialogInterfaceC8327M7999, abstractActivityC17204, c16872);
            }
        });
        c16872.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5907(this, abstractActivityC17204, c16590, C7247.m19877(abstractActivityC17204), new C15601(dialogInterfaceC8327M7999), new C13364(this)));
        c16872.setAlpha(0.0f);
        ObjectAnimator.ofFloat(c16872, "alpha", 0.0f, 1.0f).setDuration(400L).start();
        dialogInterfaceC8327M7999.m22432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11934(final C3669 c3669, AbstractActivityC17204 abstractActivityC17204) {
        Drawable drawable = (Drawable) f12623.m40346();
        if (drawable instanceof C0448) {
            C0448 c0448 = (C0448) drawable;
            if (c0448.getBitmap() != null && !c0448.getBitmap().isRecycled()) {
                if (c3669.f12634 != null) {
                    return;
                }
                C23807 c23807 = f12617;
                DialogC7990 dialogC7990 = new DialogC7990(abstractActivityC17204, c0448.getBitmap(), (String) f12619.m40346(), C8947.m23910(new StringBuilder(), c23807 == null ? "cover" : c23807.f77124.mo3303().mo8093().m49874(), ".png"));
                c3669.f12634 = dialogC7990;
                dialogC7990.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ᩳۙ֫
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f61186.f12634 = null;
                    }
                });
                dialogC7990.show();
                return;
            }
        }
        if (drawable == null || (drawable instanceof C18347)) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11933(C3669 c3669, DialogInterfaceC8327 dialogInterfaceC8327, boolean z, AbstractActivityC17204 abstractActivityC17204) {
        if (!dialogInterfaceC8327.m22434() || z == C3296.m10878()) {
            return;
        }
        c3669.f12632 = true;
        boolean z2 = c3669.f12631.getVisibility() == 0;
        dialogInterfaceC8327.dismiss();
        C3669 c36610 = new C3669(abstractActivityC17204);
        c36610.f12633 = c3669.f12633;
        if (z2) {
            c36610.m11962();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11958(DialogInterfaceC8327 dialogInterfaceC8327, C24720 c24720) {
        C23807 c23807 = f12617;
        if (c23807 == null || c23807.f77115.mo2982()) {
            dialogInterfaceC8327.dismiss();
        } else if (c24720.m55199()) {
            f12617.m53127();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m11947(DialogInterfaceC8327 dialogInterfaceC8327, C24720 c24720) {
        C23807 c23807 = f12617;
        if (c23807 == null || c23807.f77115.mo2982()) {
            dialogInterfaceC8327.dismiss();
        } else if (c24720.m55199()) {
            f12617.m53128();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11938(DialogInterfaceC8327 dialogInterfaceC8327, C24720 c24720) {
        C23807 c23807 = f12617;
        if (c23807 == null || c23807.f77115.mo2982()) {
            dialogInterfaceC8327.dismiss();
        } else if (c24720.m55199()) {
            f12617.m53129();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11937(DialogInterfaceC8327 dialogInterfaceC8327, AbstractActivityC17204 abstractActivityC17204, ImageView imageView) {
        C23807 c23807 = f12617;
        if (c23807 == null || c23807.f77115.mo2982()) {
            dialogInterfaceC8327.dismiss();
            return;
        }
        int iM28683 = C11369.m28683();
        C1299 c1299 = new C1299(abstractActivityC17204);
        c1299.m4705(C11369.m28684(iM28683), imageView);
        C21576.m49069(new RunnableC13815(1, c1299), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11932(final C3669 c3669, DialogInterfaceC8327 dialogInterfaceC8327, AbstractActivityC17204 abstractActivityC17204, C16872 c16872) {
        C23807 c23807 = f12617;
        if (c23807 == null || c23807.f77115.mo2982()) {
            dialogInterfaceC8327.dismiss();
            return;
        }
        View viewM28689 = f12617.f77124.m28689(abstractActivityC17204);
        int width = c16872.getWidth();
        int height = c16872.getHeight();
        viewM28689.measure(View.MeasureSpec.makeMeasureSpec(width < height ? (width * 2) / 3 : width / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        Drawable drawableM2186 = C0385.m2186(abstractActivityC17204, R.drawable.MT_Protector);
        Rect rect = new Rect();
        drawableM2186.getPadding(rect);
        final PopupWindow popupWindow = new PopupWindow(viewM28689, viewM28689.getMeasuredWidth() + rect.left + rect.right, viewM28689.getMeasuredHeight() + rect.top + rect.bottom, true);
        c3669.f12635 = popupWindow;
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.֨ۙ֫
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C3669.m11931(this.f3448, popupWindow);
            }
        });
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.setBackgroundDrawable(drawableM2186);
        int[] iArr = new int[2];
        c16872.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - rect.right;
        iArr[1] = iArr[1] - rect.bottom;
        popupWindow.setInputMethodMode(2);
        popupWindow.showAtLocation(c16872, 85, iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11931(C3669 c3669, PopupWindow popupWindow) {
        if (c3669.f12635 == popupWindow) {
            c3669.f12635 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11936(AbstractC7629 abstractC7629, List list, int i) {
        C1432.m5166();
        C23807 c23807 = f12617;
        if (c23807 != null) {
            c23807.m53126(false);
        }
        m11957(((InterfaceC2386) list.get(i)).getName());
        C23807 c23808 = new C23807(abstractC7629, list, i, C19331.m44719(abstractC7629, list, i));
        f12617 = c23808;
        c23808.m53132();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11939(C12184 c12184, int i) {
        C1432.m5166();
        C23807 c23807 = f12617;
        if (c23807 != null) {
            c23807.m53126(false);
        }
        String name = ((InterfaceC2386) c12184.m30460().get(c12184.m30458())).getName();
        int iMax = Math.max(i, 0);
        f12619.mo40353(C19093.m44205(name));
        f12620.mo40353("");
        f12629.mo40353("");
        f12623.mo40353(C18347.m42804());
        f12615.mo40353((Object) null);
        f12627.mo40353((Object) null);
        f12621.mo40353(Boolean.FALSE);
        int i2 = (int) (((long) iMax) / 1000);
        f12625.mo40353(Integer.valueOf((i2 % 60) | ((i2 / 60) << 16)));
        f12628.mo40353((Object) 0);
        f12616.mo40353((Object) 0);
        f12624.mo40353(Integer.valueOf(iMax / 50));
        C23807 c23808 = new C23807(c12184.m30459(), c12184.m30460(), c12184.m30458(), true);
        f12617 = c23808;
        int iMax2 = Math.max(i, 0);
        c23808.f77127 = iMax2;
        c23808.f77125 = iMax2 > 0;
        c23808.f77121 = false;
        final C23807 c23809 = f12617;
        final int i3 = c23809.f77116 + 1;
        c23809.f77116 = i3;
        final C14902 c14902Mo3301 = c23809.f77124.mo3301();
        final InterfaceC2386 interfaceC2386M3293 = C0823.m3293(c14902Mo3301);
        C5261.f18540.execute(new Runnable() { // from class: l.᩻᩷֫
            @Override // java.lang.Runnable
            public final void run() {
                final C7906 c7906;
                final C14902 c14902 = c14902Mo3301;
                try {
                    c7906 = C19093.m44206(c14902, interfaceC2386M3293);
                } catch (Exception unused) {
                    c7906 = new C7906(new C19093(c14902, null, null, null), 0L);
                }
                final C23807 c238010 = c23809;
                final int i4 = i3;
                C21576.m49068(new Runnable() { // from class: l.ܺ᩷֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23807.m53110(c238010, i4, c14902, c7906);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11962() {
        this.f12631.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11957(String str) {
        f12619.mo40353(C19093.m44205(str));
        f12620.mo40353(C21576.m49088(R.string.MT_Protector));
        f12629.mo40353(C21576.m49088(R.string.MT_Protector));
        f12623.mo40353(C18347.m42804());
        f12621.mo40353(Boolean.FALSE);
        f12625.mo40353((Object) 0);
        f12628.mo40353((Object) 0);
        f12616.mo40353((Object) 0);
        f12624.mo40353((Object) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11925(long j) {
        int i = (int) (j / 1000);
        return ((i / 60) << 16) | (i % 60);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m11953(int i) {
        int i2 = i >>> 16;
        int i3 = i & 255;
        if (i3 < 10) {
            return i2 + ":0" + i3;
        }
        return i2 + ":" + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11927(View view, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        C23807 c23807 = f12617;
        if (c23807 != null) {
            InterfaceC2386 interfaceC2386Mo3303 = c23807.f77124.mo3303();
            if (interfaceC2386Mo3303 instanceof C6004) {
                dialogInterfaceC8327.dismiss();
                Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC19683.class);
                intent.setData(((C6004) interfaceC2386Mo3303).mo8093().m49836());
                abstractActivityC17204.startActivity(intent);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11943(InterfaceC2386 interfaceC2386, AbstractC7629 abstractC7629) {
        C23807 c23807 = f12617;
        if (c23807 == null) {
            return false;
        }
        InterfaceC0686 interfaceC0686 = c23807.f77115;
        if (interfaceC0686.mo2982() || !interfaceC0686.isPlaying()) {
            return false;
        }
        C11369 c11369 = c23807.f77124;
        return C0823.m3293((C14902) c11369.get(c11369.mo3299())).equals(interfaceC2386) && c23807.f77123 == abstractC7629;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C23807 m11951() {
        return f12617;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11959(AbstractActivityC17204 abstractActivityC17204) {
        C23807 c23807 = f12617;
        if (c23807 != null && !c23807.f77115.mo2982()) {
            new C3669(abstractActivityC17204);
            return;
        }
        if (ApplicationC17729.f58258.contains("mpl")) {
            new C23061(abstractActivityC17204).m8197();
            return;
        }
        C22673.m51159(R.string.MT_Protector);
        if (abstractActivityC17204 instanceof ActivityC20823) {
            abstractActivityC17204.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11941(C23807 c23807) {
        if (f12617 == c23807) {
            f12617 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m11949() {
        return f12618;
    }
}
