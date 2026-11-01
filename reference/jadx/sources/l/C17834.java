package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17834 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView f56468;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Message f56469;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f56471;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f56472;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f56473;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f56474;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Button f56475;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Window f56476;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ListAdapter f56477;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public TextView f56478;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Button f56479;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f56480;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence f56481;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f56482;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC7957 f56483;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence f56484;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Context f56485;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f56486;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public View f56487;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f56488;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f56490;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f56491;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f56492;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f56493;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f56494;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public View f56495;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19229 f56496;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public CharSequence f56497;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Drawable f56498;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56499;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21362 f56500;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Drawable f56501;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Message f56502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Handler f56505;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Button f56506;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f56507;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f56508;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Message f56509;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f56510;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56470 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56504 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f56503 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f56489 = new ViewOnClickListenerC4428(this);

    public C17834(Context context, DialogInterfaceC7957 dialogInterfaceC7957, Window window) {
        this.f56485 = context;
        this.f56483 = dialogInterfaceC7957;
        this.f56476 = window;
        this.f56505 = new HandlerC22774(dialogInterfaceC7957);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C12108.f40538, R.attr.MT_Protector, 0);
        this.f56494 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f56491 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f56510 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f56486 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f56499 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f56471 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f56472 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC7957.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m41410(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m41410(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void m41411() {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        this.f56483.setContentView(this.f56494);
        Window window = this.f56476;
        View viewFindViewById2 = window.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewInflate = this.f56495;
        Context context = this.f56485;
        if (viewInflate == null) {
            viewInflate = this.f56490 != 0 ? LayoutInflater.from(context).inflate(this.f56490, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m41410(viewInflate)) {
            window.setFlags(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.MT_Protector);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f56470) {
                frameLayout.setPadding(this.f56480, this.f56493, this.f56508, this.f56473);
            }
            if (this.f56500 != null) {
                ((LinearLayout.LayoutParams) ((C3306) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById7 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById8 = viewGroup.findViewById(R.id.MT_Protector);
        ViewGroup viewGroupM41408 = m41408(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM41409 = m41408(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM414010 = m41408(viewFindViewById8, viewFindViewById5);
        C19229 c19229 = (C19229) window.findViewById(R.id.MT_Protector);
        this.f56496 = c19229;
        c19229.setFocusable(false);
        this.f56496.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM41409.findViewById(android.R.id.message);
        this.f56488 = textView;
        if (textView != null) {
            CharSequence charSequence = this.f56481;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f56496.removeView(this.f56488);
                if (this.f56500 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f56496.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.f56496);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f56500, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM41409.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM414010.findViewById(android.R.id.button1);
        this.f56506 = button2;
        View.OnClickListener onClickListener = this.f56489;
        button2.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(this.f56484);
        int i3 = this.f56472;
        if (zIsEmpty && this.f56501 == null) {
            this.f56506.setVisibility(8);
            i = 0;
        } else {
            this.f56506.setText(this.f56484);
            Drawable drawable = this.f56501;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                this.f56506.setCompoundDrawables(this.f56501, null, null, null);
            }
            this.f56506.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM414010.findViewById(android.R.id.button2);
        this.f56479 = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f56492) && this.f56507 == null) {
            this.f56479.setVisibility(8);
        } else {
            this.f56479.setText(this.f56492);
            Drawable drawable2 = this.f56507;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                this.f56479.setCompoundDrawables(this.f56507, null, null, null);
            }
            this.f56479.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM414010.findViewById(android.R.id.button3);
        this.f56475 = button4;
        button4.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f56497) && this.f56482 == null) {
            this.f56475.setVisibility(8);
            view = null;
        } else {
            this.f56475.setText(this.f56497);
            Drawable drawable3 = this.f56482;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                this.f56475.setCompoundDrawables(this.f56482, null, null, null);
                view = null;
            } else {
                view = null;
            }
            this.f56475.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = this.f56506;
            } else if (i == 2) {
                button = this.f56479;
            } else if (i == 4) {
                button = this.f56475;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (i == 0) {
            viewGroupM414010.setVisibility(8);
        }
        if (this.f56487 != null) {
            viewGroupM41408.addView(this.f56487, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.MT_Protector).setVisibility(8);
        } else {
            this.f56468 = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(this.f56474) && this.f56471) {
                TextView textView2 = (TextView) window.findViewById(R.id.MT_Protector);
                this.f56478 = textView2;
                textView2.setText(this.f56474);
                int i4 = this.f56504;
                if (i4 != 0) {
                    this.f56468.setImageResource(i4);
                } else {
                    Drawable drawable4 = this.f56498;
                    if (drawable4 != null) {
                        this.f56468.setImageDrawable(drawable4);
                    } else {
                        this.f56478.setPadding(this.f56468.getPaddingLeft(), this.f56468.getPaddingTop(), this.f56468.getPaddingRight(), this.f56468.getPaddingBottom());
                        this.f56468.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.MT_Protector).setVisibility(8);
                this.f56468.setVisibility(8);
                viewGroupM41408.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM41408 == null || viewGroupM41408.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM414010.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM41409.findViewById(R.id.MT_Protector)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            C19229 c192210 = this.f56496;
            if (c192210 != null) {
                c192210.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f56481 == null && this.f56500 == null) ? view : viewGroupM41408.findViewById(R.id.MT_Protector);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupM41409.findViewById(R.id.MT_Protector);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        C21362 c21362 = this.f56500;
        if (c21362 != null) {
            c21362.m47894(z3, z4);
        }
        if (!z2) {
            ViewGroup viewGroup3 = this.f56500;
            if (viewGroup3 == null) {
                viewGroup3 = this.f56496;
            }
            if (viewGroup3 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i5 = z3 | i2;
                View viewFindViewById11 = window.findViewById(R.id.MT_Protector);
                View viewFindViewById12 = window.findViewById(R.id.MT_Protector);
                if (Build.VERSION.SDK_INT >= 23) {
                    C5031.m13995(viewGroup3, i5, 3);
                    if (viewFindViewById11 != null) {
                        viewGroupM41409.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM41409.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i5 & 1) == 0) {
                        viewGroupM41409.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i5 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupM41409.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (this.f56481 != null) {
                            this.f56496.m44177(new C13602(viewFindViewById11, view));
                            this.f56496.post(new RunnableC11485(this, viewFindViewById11, view));
                        } else {
                            C21362 c21363 = this.f56500;
                            if (c21363 != null) {
                                c21363.setOnScrollListener(new C2311(viewFindViewById11, view));
                                this.f56500.post(new RunnableC5134(this, viewFindViewById11, view));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM41409.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupM41409.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        C21362 c21364 = this.f56500;
        if (c21364 == null || (listAdapter = this.f56477) == null) {
            return;
        }
        c21364.setAdapter(listAdapter);
        int i6 = this.f56503;
        if (i6 > -1) {
            c21364.setItemChecked(i6, true);
            c21364.setSelection(i6);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41420(CharSequence charSequence) {
        this.f56474 = charSequence;
        TextView textView = this.f56478;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41415(View view) {
        this.f56487 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41417(CharSequence charSequence) {
        this.f56481 = charSequence;
        TextView textView = this.f56488;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41418(int i) {
        this.f56495 = null;
        this.f56490 = i;
        this.f56470 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41419(View view) {
        this.f56495 = view;
        this.f56490 = 0;
        this.f56470 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41416(View view, int i, int i2, int i3, int i4) {
        this.f56495 = view;
        this.f56490 = 0;
        this.f56470 = true;
        this.f56480 = i;
        this.f56493 = i2;
        this.f56508 = i3;
        this.f56473 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41413(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f56505.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f56497 = charSequence;
            this.f56509 = messageObtainMessage;
            this.f56482 = drawable;
        } else if (i == -2) {
            this.f56492 = charSequence;
            this.f56469 = messageObtainMessage;
            this.f56507 = drawable;
        } else {
            if (i == -1) {
                this.f56484 = charSequence;
                this.f56502 = messageObtainMessage;
                this.f56501 = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41412(int i) {
        this.f56498 = null;
        this.f56504 = i;
        ImageView imageView = this.f56468;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f56468.setImageResource(this.f56504);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41414(Drawable drawable) {
        this.f56498 = drawable;
        this.f56504 = 0;
        ImageView imageView = this.f56468;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f56468.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewGroup m41408(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41409(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
