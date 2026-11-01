package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۘ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3589 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean f13208;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13209;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13210;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C12763 f13211;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C9186 f13212;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13213;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13214;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C9186 f13215;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13216;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13217;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C9186 f13218;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C9186 f13219;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9186 f13220;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f13221 = new AtomicLong();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C9186 f13222;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f13223;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f13224;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f13225;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PopupWindow f13226;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f13227;

    static {
        C9186 c9186 = new C9186("");
        f13213 = c9186;
        C9186 c9187 = new C9186("");
        f13209 = c9187;
        f13210 = new C9186("");
        f13220 = new C9186(null);
        C9186 c9188 = new C9186(null);
        f13215 = c9188;
        f13217 = new C9186(null);
        C9186 c9189 = new C9186(Boolean.FALSE);
        f13219 = c9189;
        C9186 c91810 = new C9186(0);
        f13216 = c91810;
        C9186 c91811 = new C9186(0);
        f13214 = c91811;
        f13222 = new C9186(0);
        C9186 c91812 = new C9186(0);
        f13218 = c91812;
        C9186 c91813 = new C9186(Integer.valueOf(C2758.m8420()));
        f13212 = c91813;
        c9186.m44961((InterfaceC10597) new C15460());
        c9187.m44961((InterfaceC10597) new C21809());
        c9188.m44961((InterfaceC10597) new C18281());
        c9189.m44961((InterfaceC10597) new C18987());
        c91810.m44961((InterfaceC10597) new C19693());
        c91811.m44961((InterfaceC10597) new C9110());
        c91812.m44961((InterfaceC10597) new C10521());
        c91813.m44961((InterfaceC10597) new C7698());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10647(AbstractActivityC12483 abstractActivityC12483) {
        if (abstractActivityC12483 instanceof ActivityC6412) {
            abstractActivityC12483.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.ܿۧ, l.᩻ۘ᩺] */
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
    public C3589(final AbstractActivityC12483 abstractActivityC12483) {
        ImageView imageView;
        C22515 c22515;
        this.f13224 = abstractActivityC12483;
        final DialogInterfaceC19356 dialogInterfaceC19356M21252 = abstractActivityC12483.buildDialog().m21252();
        final C5444 c5444 = (C5444) abstractActivityC12483.m30995(R.layout.MT_Protector);
        final C18144 c18144 = new C18144();
        final C18144 c18145 = new C18144();
        c18144.m42253(c5444);
        c18145.m42253((C5444) LayoutInflater.from(abstractActivityC12483).inflate(R.layout.MT_Protector, (ViewGroup) null));
        if (abstractActivityC12483.getResources().getConfiguration().orientation == 2) {
            c18145.m42246(c5444);
        }
        final ?? r2 = new InterfaceC17295() { // from class: l.᩻ۘ᩺
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                int i = ((Configuration) obj).orientation;
                C5444 c5445 = c5444;
                if (i == 2) {
                    c18145.m42246(c5445);
                } else {
                    c18144.m42246(c5445);
                }
            }
        };
        InterfaceC5657 interfaceC5657 = new InterfaceC5657() { // from class: l.ܳۘ᩺
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                EnumC1651 enumC1652 = EnumC1651.ON_START;
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                C23458 c23458 = r2;
                if (enumC1651 == enumC1652) {
                    abstractActivityC12484.mo4085(c23458);
                    abstractActivityC12484.mo4079(c23458);
                } else if (enumC1651 == EnumC1651.ON_STOP) {
                    abstractActivityC12484.mo4085(c23458);
                }
            }
        };
        AbstractC3062 lifecycle = dialogInterfaceC19356M21252.getLifecycle();
        lifecycle.mo9171(interfaceC5657);
        if (lifecycle.mo9170().m24173(EnumC9414.STARTED)) {
            abstractActivityC12483.mo4079((InterfaceC17295) r2);
        }
        dialogInterfaceC19356M21252.m44370((ViewGroup) c5444);
        TextView textView = (TextView) c5444.findViewById(R.id.textView1);
        TextView textView2 = (TextView) c5444.findViewById(R.id.textView2);
        final C15697 c15697 = (C15697) c5444.findViewById(R.id.MT_Protector);
        final SeekBar seekBar = (SeekBar) c5444.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) c5444.findViewById(R.id.textView3);
        final TextView textView4 = (TextView) c5444.findViewById(R.id.textView4);
        final ImageView imageView2 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        ImageView imageView3 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        ImageView imageView4 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        final ImageView imageView5 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        ImageView imageView6 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC22523.m50034(textView);
        ViewOnClickListenerC22523.m50034(textView2);
        c15697.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۚ᩶۬
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final C6936 c6936M125;
                final Main mainM47527 = C21094.m47527();
                if (mainM47527 == null || (c6936M125 = mainM47527.m125()) == null || !mainM47527.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
                    return false;
                }
                Drawable drawable = (Drawable) C3589.f13220.m44956();
                if (drawable instanceof C10396) {
                    final C10396 c10396 = (C10396) drawable;
                    C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                    c8067BuildDialog.m21277((CharSequence) C3589.f13213.m44956());
                    c8067BuildDialog.m21253(R.string.MT_Protector);
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩶۬
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C3589.m10645(c6936M125, c10396, mainM47527);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21269();
                    return true;
                }
                if (drawable instanceof C8985) {
                    return false;
                }
                C15829.m37611(R.string.MT_Protector);
                return true;
            }
        });
        ImageView imageView7 = (ImageView) c5444.findViewById(R.id.MT_Protector);
        this.f13227 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: l.᩻᩶۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3589.m10638(view, abstractActivityC12483, dialogInterfaceC19356M21252);
            }
        });
        final boolean zM45991 = C20368.m45991();
        if ((abstractActivityC12483 instanceof Main) || (abstractActivityC12483 instanceof ActivityC6412)) {
            imageView = imageView4;
            c22515 = new InterfaceC17295() { // from class: l.᩹᩶۬
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    boolean zM45992 = C20368.m45991();
                    final boolean z = zM45991;
                    if (z == zM45992) {
                        return;
                    }
                    final C3589 c3589 = this.f73481;
                    final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21252;
                    final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                    c5444.post(new Runnable() { // from class: l.ܺ᩶۬
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3589.m10643(c3589, dialogInterfaceC19356, z, abstractActivityC12484);
                        }
                    });
                }
            };
        } else {
            imageView = imageView4;
            c22515 = 0;
        }
        int i = 1;
        f13213.m44959(dialogInterfaceC19356M21252, new C22092(i, textView));
        f13210.m44959(dialogInterfaceC19356M21252, new C22092(i, textView2));
        f13220.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.֨᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                Drawable drawable = (Drawable) obj;
                C15697 c15698 = c15697;
                if (c15698.getDrawable() != drawable) {
                    c15698.setImageDrawable(drawable);
                }
                c15698.m37402();
            }
        });
        f13219.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.۬᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = bool.booleanValue() ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                ImageView imageView8 = imageView2;
                imageView8.setImageResource(i2);
                imageView8.setContentDescription(C16737.m39288(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector));
                c15697.m37401(bool.booleanValue());
            }
        });
        f13214.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.ۘ᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                textView4.setText(C3589.m10660(((Integer) obj).intValue()));
            }
        });
        int i2 = 0;
        f13216.m44959(dialogInterfaceC19356M21252, new C6992(i2, textView3));
        f13218.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.᩺᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                SeekBar seekBar2 = seekBar;
                seekBar2.setMax(iIntValue);
                Integer num = (Integer) C3589.f13222.m44956();
                C13638.requireNonNull(num);
                seekBar2.setProgress(num.intValue());
            }
        });
        C13638.requireNonNull(seekBar);
        f13222.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.۠᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                seekBar.setProgress(((Integer) obj).intValue());
            }
        });
        f13212.m44959(dialogInterfaceC19356M21252, new InterfaceC10597() { // from class: l.֡᩶۬
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                int i3;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                float[] fArr = C2758.f10570;
                if (iIntValue == 1) {
                    i3 = R.drawable.MT_Protector;
                } else if (iIntValue != 2) {
                    i3 = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                } else {
                    i3 = R.drawable.MT_Protector;
                }
                ImageView imageView8 = imageView5;
                imageView8.setImageResource(i3);
                imageView8.setContentDescription(C16737.m39288(C2758.m8414(num.intValue())));
            }
        });
        seekBar.setOnSeekBarChangeListener(new C2052(textView3));
        final C22959 c22959M50800 = C22959.m50800();
        imageView2.setOnClickListener(new ViewOnClickListenerC0922(dialogInterfaceC19356M21252, c22959M50800, 3));
        imageView3.setOnClickListener(new ViewOnClickListenerC16870(i2, dialogInterfaceC19356M21252, c22959M50800));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.۫᩶۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3589.m10650(dialogInterfaceC19356M21252, c22959M50800);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩶۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3589.m10649(dialogInterfaceC19356M21252, abstractActivityC12483, imageView2);
            }
        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۛ᩶۬
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int iM8420 = C2758.m8420();
                C12667 c12667 = new C12667(abstractActivityC12483);
                c12667.m31500(C2758.m8414(iM8420), imageView2);
                C16737.m39274(new RunnableC1774(2, c12667), SnackbarManager.SHORT_DURATION_MS);
                return true;
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩶۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3589.m10642(this.f37982, dialogInterfaceC19356M21252, abstractActivityC12483, c5444);
            }
        });
        c5444.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4295(this, abstractActivityC12483, c22515, C21843.m48614(abstractActivityC12483), new C9815(dialogInterfaceC19356M21252), new C3463(this)));
        c5444.setAlpha(0.0f);
        ObjectAnimator.ofFloat(c5444, "alpha", 0.0f, 1.0f).setDuration(400L).start();
        dialogInterfaceC19356M21252.m44362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10645(C6936 c6936, C10396 c10396, Main main) {
        C11545 c11545M18646 = c6936.m18646();
        AbstractC20745 abstractC20745M28771 = c11545M18646.m28771(f13211.f42567.mo7410().mo7989().m46718() + ".png", false);
        try {
            try {
                OutputStream outputStreamMo33976 = abstractC20745M28771.mo33976(false);
                try {
                    c10396.getBitmap().compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo33976);
                    c11545M18646.m28787(abstractC20745M28771);
                    if (outputStreamMo33976 != null) {
                        outputStreamMo33976.close();
                    }
                    C21094.m47530();
                } catch (Throwable th) {
                    if (outputStreamMo33976 != null) {
                        try {
                            outputStreamMo33976.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                C21094.m47530();
                throw th3;
            }
        } catch (IOException e) {
            main.m31002(e, (DialogInterface.OnDismissListener) null);
            abstractC20745M28771.mo24647();
            C21094.m47530();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10643(C3589 c3589, DialogInterfaceC19356 dialogInterfaceC19356, boolean z, AbstractActivityC12483 abstractActivityC12483) {
        if (!dialogInterfaceC19356.m44375() || z == C20368.m45991()) {
            return;
        }
        c3589.f13225 = true;
        boolean z2 = c3589.f13227.getVisibility() == 0;
        dialogInterfaceC19356.dismiss();
        C3589 c35810 = new C3589(abstractActivityC12483);
        c35810.f13223 = c3589.f13223;
        if (z2) {
            c35810.m10667();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m10665(DialogInterfaceC19356 dialogInterfaceC19356, C22959 c22959) {
        C12763 c12763 = f13211;
        if (c12763 == null || c12763.f42565.mo20296()) {
            dialogInterfaceC19356.dismiss();
        } else if (c22959.m50802()) {
            f13211.m31738();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m10657(DialogInterfaceC19356 dialogInterfaceC19356, C22959 c22959) {
        C12763 c12763 = f13211;
        if (c12763 == null || c12763.f42565.mo20296()) {
            dialogInterfaceC19356.dismiss();
        } else if (c22959.m50802()) {
            f13211.m31741();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10650(DialogInterfaceC19356 dialogInterfaceC19356, C22959 c22959) {
        C12763 c12763 = f13211;
        if (c12763 == null || c12763.f42565.mo20296()) {
            dialogInterfaceC19356.dismiss();
        } else if (c22959.m50802()) {
            f13211.m31737();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10649(DialogInterfaceC19356 dialogInterfaceC19356, AbstractActivityC12483 abstractActivityC12483, ImageView imageView) {
        C12763 c12763 = f13211;
        if (c12763 == null || c12763.f42565.mo20296()) {
            dialogInterfaceC19356.dismiss();
            return;
        }
        int iM8419 = C2758.m8419();
        C12667 c12667 = new C12667(abstractActivityC12483);
        c12667.m31500(C2758.m8414(iM8419), imageView);
        C16737.m39274(new RunnableC1774(2, c12667), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10642(final C3589 c3589, DialogInterfaceC19356 dialogInterfaceC19356, AbstractActivityC12483 abstractActivityC12483, C5444 c5444) {
        C12763 c12763 = f13211;
        if (c12763 == null || c12763.f42565.mo20296()) {
            dialogInterfaceC19356.dismiss();
            return;
        }
        View viewM8421 = f13211.f42567.m8421(abstractActivityC12483);
        int width = c5444.getWidth();
        int height = c5444.getHeight();
        viewM8421.measure(View.MeasureSpec.makeMeasureSpec(width < height ? (width * 2) / 3 : width / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        Drawable drawableM37904 = C15945.m37904(abstractActivityC12483, R.drawable.MT_Protector);
        Rect rect = new Rect();
        drawableM37904.getPadding(rect);
        final PopupWindow popupWindow = new PopupWindow(viewM8421, viewM8421.getMeasuredWidth() + rect.left + rect.right, viewM8421.getMeasuredHeight() + rect.top + rect.bottom, true);
        c3589.f13226 = popupWindow;
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩶᩶۬
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C3589.m10641(this.f66092, popupWindow);
            }
        });
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.setBackgroundDrawable(drawableM37904);
        int[] iArr = new int[2];
        c5444.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - rect.right;
        iArr[1] = iArr[1] - rect.bottom;
        popupWindow.setInputMethodMode(2);
        popupWindow.showAtLocation(c5444, 85, iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10641(C3589 c3589, PopupWindow popupWindow) {
        if (c3589.f13226 == popupWindow) {
            c3589.f13226 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10646(AbstractC9677 abstractC9677, List list, int i) {
        C15586.m37239();
        C12763 c12763 = f13211;
        if (c12763 != null) {
            c12763.m31736(false);
        }
        m10663(((InterfaceC2557) list.get(i)).getName());
        C12763 c12764 = new C12763(abstractC9677, list, i, C7118.m19008(abstractC9677, list, i));
        f13211 = c12764;
        c12764.m31733();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10651(C21830 c21830, int i) {
        C15586.m37239();
        C12763 c12763 = f13211;
        if (c12763 != null) {
            c12763.m31736(false);
        }
        String name = ((InterfaceC2557) c21830.m48602().get(c21830.m48601())).getName();
        int iMax = Math.max(i, 0);
        f13213.mo23642(C20979.m47147(name));
        f13209.mo23642("");
        f13210.mo23642("");
        f13220.mo23642(C8985.m23292());
        f13215.mo23642((Object) null);
        f13217.mo23642((Object) null);
        f13219.mo23642(Boolean.FALSE);
        int i2 = (int) (((long) iMax) / 1000);
        f13216.mo23642(Integer.valueOf((i2 % 60) | ((i2 / 60) << 16)));
        f13214.mo23642((Object) 0);
        f13218.mo23642((Object) 0);
        f13222.mo23642(Integer.valueOf(iMax / 50));
        C12763 c12764 = new C12763(c21830.m48600(), c21830.m48602(), c21830.m48601(), true);
        f13211 = c12764;
        int iMax2 = Math.max(i, 0);
        c12764.f42575 = iMax2;
        c12764.f42571 = iMax2 > 0;
        c12764.f42574 = false;
        final C12763 c12765 = f13211;
        final int i3 = c12765.f42566 + 1;
        c12765.f42566 = i3;
        final C13689 c13689Mo7413 = c12765.f42567.mo7413();
        final InterfaceC2557 interfaceC2557M7401 = C2427.m7401(c13689Mo7413);
        C4716.f16636.execute(new Runnable() { // from class: l.ۖ֡۬
            @Override // java.lang.Runnable
            public final void run() {
                C7573 c7573;
                C13689 c13689 = c13689Mo7413;
                try {
                    c7573 = C20979.m47148(c13689, interfaceC2557M7401);
                } catch (Exception unused) {
                    c7573 = new C7573(new C20979(c13689, null, null, null), 0L);
                }
                C16737.m39273(new RunnableC5001(c12765, i3, c13689, c7573, 0));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10667() {
        this.f13227.setVisibility(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m10663(String str) {
        f13213.mo23642(C20979.m47147(str));
        f13209.mo23642(C16737.m39288(R.string.MT_Protector));
        f13210.mo23642(C16737.m39288(R.string.MT_Protector));
        f13220.mo23642(C8985.m23292());
        f13219.mo23642(Boolean.FALSE);
        f13216.mo23642((Object) 0);
        f13214.mo23642((Object) 0);
        f13218.mo23642((Object) 0);
        f13222.mo23642((Object) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10635(long j) {
        int i = (int) (j / 1000);
        return ((i / 60) << 16) | (i % 60);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m10660(int i) {
        int i2 = i >>> 16;
        int i3 = i & 255;
        if (i3 < 10) {
            return i2 + ":0" + i3;
        }
        return i2 + ":" + i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10638(View view, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        C12763 c12763 = f13211;
        if (c12763 != null) {
            InterfaceC2557 interfaceC2557Mo7410 = c12763.f42567.mo7410();
            if (interfaceC2557Mo7410 instanceof C6794) {
                dialogInterfaceC19356.dismiss();
                Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC5947.class);
                intent.setData(((C6794) interfaceC2557Mo7410).mo7989().m46732());
                abstractActivityC12483.startActivity(intent);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10653(InterfaceC2557 interfaceC2557, AbstractC9677 abstractC9677) {
        C12763 c12763 = f13211;
        if (c12763 == null) {
            return false;
        }
        InterfaceC8530 interfaceC8530 = c12763.f42565;
        if (interfaceC8530.mo20296() || !interfaceC8530.isPlaying()) {
            return false;
        }
        C2758 c2758 = c12763.f42567;
        return C2427.m7401((C13689) c2758.get(c2758.mo7403())).equals(interfaceC2557) && c12763.f42573 == abstractC9677;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C12763 m10654() {
        return f13211;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m10664(AbstractActivityC12483 abstractActivityC12483) {
        C12763 c12763 = f13211;
        if (c12763 != null && !c12763.f42565.mo20296()) {
            new C3589(abstractActivityC12483);
            return;
        }
        if (ApplicationC0716.f2992.contains("mpl")) {
            new C14754(abstractActivityC12483).m10243();
            return;
        }
        C15829.m37618(R.string.MT_Protector);
        if (abstractActivityC12483 instanceof ActivityC6412) {
            abstractActivityC12483.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10648(C12763 c12763) {
        if (f13211 == c12763) {
            f13211 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m10666() {
        return f13208;
    }
}
