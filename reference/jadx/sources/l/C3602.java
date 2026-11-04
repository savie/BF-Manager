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

/* JADX INFO: renamed from: l.ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3602 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12309;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f12310;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Button f12311;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Window f12312;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23307 f12313;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f12314;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Handler f12315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ListAdapter f12316;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public TextView f12317;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f12318;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f12319;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f12320;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f12321;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f12322;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f12323;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f12324;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f12325;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f12327;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f12328;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f12329;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Message f12330;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f12332;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Drawable f12333;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f12334;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f12335;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Drawable f12336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public CharSequence f12337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Button f12338;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView f12339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23740 f12340;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Button f12341;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f12342;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12345;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public View f12346;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12347;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f12348;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Message f12349;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC12551 f12350;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Message f12351;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12331 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12344 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f12343 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f12326 = new ViewOnClickListenerC11059(this);

    public C3602(Context context, DialogInterfaceC12551 dialogInterfaceC12551, Window window) {
        this.f12329 = context;
        this.f12350 = dialogInterfaceC12551;
        this.f12312 = window;
        this.f12315 = new HandlerC17772(dialogInterfaceC12551);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C10401.f33072, R.attr.MT_Protector, 0);
        this.f12345 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f12322 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f12324 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f12321 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f12309 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f12323 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12347 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC12551.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m11670(View view) {
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
            if (m11670(viewGroup.getChildAt(childCount))) {
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
    public final void m11671() {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        this.f12350.setContentView(this.f12345);
        Window window = this.f12312;
        View viewFindViewById2 = window.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewInflate = this.f12346;
        Context context = this.f12329;
        if (viewInflate == null) {
            viewInflate = this.f12327 != 0 ? LayoutInflater.from(context).inflate(this.f12327, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m11670(viewInflate)) {
            window.setFlags(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.MT_Protector);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f12331) {
                frameLayout.setPadding(this.f12342, this.f12319, this.f12335, this.f12348);
            }
            if (this.f12340 != null) {
                ((LinearLayout.LayoutParams) ((C22182) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById7 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById8 = viewGroup.findViewById(R.id.MT_Protector);
        ViewGroup viewGroupM11668 = m11668(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM11669 = m11668(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM116610 = m11668(viewFindViewById8, viewFindViewById5);
        C23307 c23307 = (C23307) window.findViewById(R.id.MT_Protector);
        this.f12313 = c23307;
        c23307.setFocusable(false);
        this.f12313.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM11669.findViewById(android.R.id.message);
        this.f12310 = textView;
        if (textView != null) {
            CharSequence charSequence = this.f12325;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f12313.removeView(this.f12310);
                if (this.f12340 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f12313.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.f12313);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f12340, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM11669.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM116610.findViewById(android.R.id.button1);
        this.f12338 = button2;
        View.OnClickListener onClickListener = this.f12326;
        button2.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(this.f12314);
        int i3 = this.f12347;
        if (zIsEmpty && this.f12336 == null) {
            this.f12338.setVisibility(8);
            i = 0;
        } else {
            this.f12338.setText(this.f12314);
            Drawable drawable = this.f12336;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                this.f12338.setCompoundDrawables(this.f12336, null, null, null);
            }
            this.f12338.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM116610.findViewById(android.R.id.button2);
        this.f12341 = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f12318) && this.f12334 == null) {
            this.f12341.setVisibility(8);
        } else {
            this.f12341.setText(this.f12318);
            Drawable drawable2 = this.f12334;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                this.f12341.setCompoundDrawables(this.f12334, null, null, null);
            }
            this.f12341.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM116610.findViewById(android.R.id.button3);
        this.f12311 = button4;
        button4.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f12337) && this.f12328 == null) {
            this.f12311.setVisibility(8);
            view = null;
        } else {
            this.f12311.setText(this.f12337);
            Drawable drawable3 = this.f12328;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                this.f12311.setCompoundDrawables(this.f12328, null, null, null);
                view = null;
            } else {
                view = null;
            }
            this.f12311.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = this.f12338;
            } else if (i == 2) {
                button = this.f12341;
            } else if (i == 4) {
                button = this.f12311;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (i == 0) {
            viewGroupM116610.setVisibility(8);
        }
        if (this.f12320 != null) {
            viewGroupM11668.addView(this.f12320, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.MT_Protector).setVisibility(8);
        } else {
            this.f12339 = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(this.f12332) && this.f12323) {
                TextView textView2 = (TextView) window.findViewById(R.id.MT_Protector);
                this.f12317 = textView2;
                textView2.setText(this.f12332);
                int i4 = this.f12344;
                if (i4 != 0) {
                    this.f12339.setImageResource(i4);
                } else {
                    Drawable drawable4 = this.f12333;
                    if (drawable4 != null) {
                        this.f12339.setImageDrawable(drawable4);
                    } else {
                        this.f12317.setPadding(this.f12339.getPaddingLeft(), this.f12339.getPaddingTop(), this.f12339.getPaddingRight(), this.f12339.getPaddingBottom());
                        this.f12339.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.MT_Protector).setVisibility(8);
                this.f12339.setVisibility(8);
                viewGroupM11668.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM11668 == null || viewGroupM11668.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM116610.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM11669.findViewById(R.id.MT_Protector)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            C23307 c23308 = this.f12313;
            if (c23308 != null) {
                c23308.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f12325 == null && this.f12340 == null) ? view : viewGroupM11668.findViewById(R.id.MT_Protector);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupM11669.findViewById(R.id.MT_Protector);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        C23740 c23740 = this.f12340;
        if (c23740 != null) {
            c23740.m53008(z3, z4);
        }
        if (!z2) {
            ViewGroup viewGroup3 = this.f12340;
            if (viewGroup3 == null) {
                viewGroup3 = this.f12313;
            }
            if (viewGroup3 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i5 = z3 | i2;
                View viewFindViewById11 = window.findViewById(R.id.MT_Protector);
                View viewFindViewById12 = window.findViewById(R.id.MT_Protector);
                if (Build.VERSION.SDK_INT >= 23) {
                    C22666.m51101(viewGroup3, i5, 3);
                    if (viewFindViewById11 != null) {
                        viewGroupM11669.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM11669.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i5 & 1) == 0) {
                        viewGroupM11669.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i5 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupM11669.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (this.f12325 != null) {
                            this.f12313.m52437(new C22994(viewFindViewById11, view));
                            this.f12313.post(new RunnableC20010(this, viewFindViewById11, view));
                        } else {
                            C23740 c23741 = this.f12340;
                            if (c23741 != null) {
                                c23741.setOnScrollListener(new C15534(viewFindViewById11, view));
                                this.f12340.post(new RunnableC13297(this, viewFindViewById11, view));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM11669.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupM11669.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        C23740 c23742 = this.f12340;
        if (c23742 == null || (listAdapter = this.f12316) == null) {
            return;
        }
        c23742.setAdapter(listAdapter);
        int i6 = this.f12343;
        if (i6 > -1) {
            c23742.setItemChecked(i6, true);
            c23742.setSelection(i6);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11680(CharSequence charSequence) {
        this.f12332 = charSequence;
        TextView textView = this.f12317;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11675(View view) {
        this.f12320 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11677(CharSequence charSequence) {
        this.f12325 = charSequence;
        TextView textView = this.f12310;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11678(int i) {
        this.f12346 = null;
        this.f12327 = i;
        this.f12331 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11679(View view) {
        this.f12346 = view;
        this.f12327 = 0;
        this.f12331 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11676(View view, int i, int i2, int i3, int i4) {
        this.f12346 = view;
        this.f12327 = 0;
        this.f12331 = true;
        this.f12342 = i;
        this.f12319 = i2;
        this.f12335 = i3;
        this.f12348 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11673(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f12315.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f12337 = charSequence;
            this.f12351 = messageObtainMessage;
            this.f12328 = drawable;
        } else if (i == -2) {
            this.f12318 = charSequence;
            this.f12330 = messageObtainMessage;
            this.f12334 = drawable;
        } else {
            if (i == -1) {
                this.f12314 = charSequence;
                this.f12349 = messageObtainMessage;
                this.f12336 = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11672(int i) {
        this.f12333 = null;
        this.f12344 = i;
        ImageView imageView = this.f12339;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f12339.setImageResource(this.f12344);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11674(Drawable drawable) {
        this.f12333 = drawable;
        this.f12344 = 0;
        ImageView imageView = this.f12339;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f12339.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewGroup m11668(View view, View view2) {
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
    public static void m11669(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
