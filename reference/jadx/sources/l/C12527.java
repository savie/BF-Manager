package l;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۫ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12527 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public MenuItemOnMenuItemClickListenerC10640 f41900;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f41901;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16760 f41903;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f41904;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f41906;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Interpolator f41907;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC7587 f41909;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f41911;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f41912;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ImageButton f41913;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Interpolator f41914;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f41916;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Interpolator f41917;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f41918;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f41919;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Size f41920;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Size f41921;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f41922;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f41923;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f41924;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f41926;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f41927;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Size f41929;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f41930;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C23340 f41931;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f41933;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable f41934;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f41935;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f41936;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Interpolator f41937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f41939;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public EnumC17465 f41941;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f41943;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f41944;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public EnumC17465 f41945;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0531 f41946;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Rect f41908 = new Rect();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Point f41942 = new Point();

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int[] f41905 = new int[2];

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Region f41902 = new Region();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f41940 = C7622.m20152(new C11821(this));

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f41910 = new RunnableC23110(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41925 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41938 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f41932 = new ViewOnClickListenerC15349(this);

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Rect f41928 = new Rect();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f41915 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31104(C12527 c12527, C9034 c9034) {
        c9034.m23368().setEmpty();
        c9034.m23369().setEmpty();
        c9034.m23370().set(c12527.f41902);
        c9034.m23367();
    }

    public C12527(Context context, View view) {
        boolean z;
        EnumC17465 enumC17465 = EnumC17465.PREFER_SHOW_ALL;
        this.f41945 = enumC17465;
        this.f41941 = enumC17465;
        HandlerC7587 handlerC7587 = new HandlerC7587(this);
        this.f41909 = handlerC7587;
        this.f41919 = view;
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.isLightTheme});
            z = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z = true;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z ? R.style.Theme.DeviceDefault.Light : R.style.Theme.DeviceDefault);
        this.f41911 = contextThemeWrapper;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setContentDescription("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f41904 = viewGroup;
        C20993 c20993 = new C20993(viewGroup.getContext(), handlerC7587);
        PopupWindow popupWindow = new PopupWindow(c20993);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c20993.addView(viewGroup);
        this.f41906 = popupWindow;
        this.f41916 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f41939 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f41936 = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f41930 = dimensionPixelSize;
        this.f41937 = new InterpolatorC16055();
        this.f41914 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_slow_in);
        this.f41917 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.linear_out_slow_in);
        this.f41907 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_linear_in);
        Drawable drawable = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f41927 = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f41934 = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f41912 = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f41943 = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        final ImageButton imageButton = (ImageButton) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ۚܽۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C12527.m31102(this.f18841, imageButton);
            }
        });
        imageButton.setOnTouchListener(new ViewOnTouchListenerC13938(this));
        this.f41913 = imageButton;
        if (!(imageButton.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        imageButton.measure(0, 0);
        this.f41921 = new Size(imageButton.getMeasuredWidth(), imageButton.getMeasuredHeight());
        this.f41918 = new C1236(this, contextThemeWrapper);
        this.f41903 = new C16760(this, contextThemeWrapper, dimensionPixelSize);
        final C0531 c0531 = new C0531(this);
        c0531.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c0531.setDivider(null);
        c0531.setDividerHeight(0);
        c0531.setAdapter((ListAdapter) new C13232(this, contextThemeWrapper));
        c0531.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۖܽۚ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C12527.m31103(this.f10302, c0531, i);
            }
        });
        this.f41946 = c0531;
        AnimationAnimationListenerC6881 animationAnimationListenerC6881 = new AnimationAnimationListenerC6881(this);
        AnimationSet animationSet = new AnimationSet(true);
        this.f41933 = animationSet;
        animationSet.setAnimationListener(animationAnimationListenerC6881);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f41922 = animationSet2;
        animationSet2.setAnimationListener(animationAnimationListenerC6881);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.f41923 = animatorSet;
        this.f41901 = m31091(viewGroup, 150, new C21698(this));
        this.f41944 = m31091(viewGroup, 0, new C18170(this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31132() {
        int i = this.f41936;
        int i2 = this.f41939;
        return i + i2 + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31099(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10640 menuItemOnMenuItemClickListenerC10640) {
        LinkedHashMap linkedHashMap = this.f41938;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            linkedHashMap.put(C20288.m45781(menuItem), menuItem);
        }
        this.f41900 = menuItemOnMenuItemClickListenerC10640;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31131() {
        this.f41915 = true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:31:0x011e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x0129  */
    /* JADX WARN: Code duplicated, block: B:37:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0159  */
    /* JADX WARN: Code duplicated, block: B:41:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0162  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8 A[LOOP:3: B:65:0x01e6->B:66:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0202  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[LOOP:4: B:72:0x0214->B:73:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0249  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31128(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10640 menuItemOnMenuItemClickListenerC10640, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C0531 c0531;
        int iMin;
        LinkedList linkedList;
        LinkedList linkedList2;
        Iterator it;
        boolean z;
        int i;
        boolean zIsEmpty;
        Size size;
        int i2;
        boolean z2;
        ArrayAdapter arrayAdapter;
        int size2;
        int i3;
        C0531 c0532;
        int count;
        int i4;
        int iMax;
        MenuItem menuItem;
        View viewInflate;
        boolean z3;
        int iMin2;
        boolean z4;
        boolean z5;
        CharSequence tooltipText;
        MenuItem menuItem2;
        this.f41909.m20106();
        Collection collectionValues = this.f41938.values();
        int size3 = arrayList.size();
        int size4 = collectionValues.size();
        View view = this.f41919;
        boolean z6 = true;
        if (size3 != size4) {
            m31125();
            m31087();
            viewGroup = null;
            this.f41929 = null;
            this.f41920 = null;
            this.f41935 = false;
            viewGroup2 = this.f41918;
            viewGroup2.removeAllViews();
            c0531 = this.f41946;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) c0531.getAdapter();
            arrayAdapter2.clear();
            c0531.setAdapter((ListAdapter) arrayAdapter2);
            this.f41904.removeAllViews();
            m31099(arrayList, menuItemOnMenuItemClickListenerC10640);
            Rect rect2 = this.f41908;
            view.getWindowVisibleDisplayFrame(rect2);
            iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect2.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
            linkedList = new LinkedList();
            linkedList2 = new LinkedList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                menuItem2 = (MenuItem) it.next();
                if (((InterfaceMenuItemC9720) menuItem2).mo4158()) {
                    linkedList2.add(menuItem2);
                } else {
                    linkedList.add(menuItem2);
                }
            }
            linkedList.addAll(linkedList2);
            viewGroup2.removeAllViews();
            viewGroup2.setPaddingRelative(0, 0, 0, 0);
            z = true;
            i = iMin;
            while (true) {
                zIsEmpty = linkedList.isEmpty();
                size = this.f41921;
                if (!zIsEmpty) {
                    menuItem = (MenuItem) linkedList.peek();
                    C13638.requireNonNull(menuItem);
                    if (!z || !((InterfaceMenuItemC9720) menuItem).mo4158()) {
                        viewInflate = LayoutInflater.from(this.f41911).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m31097(viewInflate, menuItem, this.f41930, z6);
                        if (z) {
                            viewInflate.setPaddingRelative((int) (((double) viewInflate.getPaddingStart()) * 1.5d), viewInflate.getPaddingTop(), viewInflate.getPaddingEnd(), viewInflate.getPaddingBottom());
                        }
                        if (linkedList.size() == z6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            viewInflate.setPaddingRelative(viewInflate.getPaddingStart(), viewInflate.getPaddingTop(), (int) (((double) viewInflate.getPaddingEnd()) * 1.5d), viewInflate.getPaddingBottom());
                        }
                        viewInflate.measure(0, 0);
                        iMin2 = Math.min(viewInflate.getMeasuredWidth(), iMin);
                        if (iMin2 <= i - size.getWidth()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 || iMin2 > i) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z4 && !z5) {
                            break;
                        }
                        viewInflate.setTag(C20288.m45781(menuItem));
                        viewInflate.setOnClickListener(this.f41932);
                        tooltipText = ((InterfaceMenuItemC9720) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C5031.m14011(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC13938(this));
                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                        layoutParams.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c0531 = c0531;
                    }
                }
                c0531 = c0531;
                view = view;
                break;
            }
            if (linkedList.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                viewGroup2.setPaddingRelative(0, 0, size.getWidth(), 0);
            }
            if (viewGroup2.getParent() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                throw new IllegalStateException((String) null);
            }
            viewGroup2.measure(i2, i2);
            this.f41920 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) c0531.getAdapter();
                arrayAdapter.clear();
                size2 = linkedList.size();
                for (i3 = 0; i3 < size2; i3++) {
                    arrayAdapter.add((MenuItem) linkedList.get(i3));
                }
                c0532 = c0531;
                c0532.setAdapter((ListAdapter) arrayAdapter);
                if (this.f41924) {
                    c0532.setY(0.0f);
                } else {
                    c0532.setY(size.getHeight());
                }
                count = c0532.getAdapter().getCount();
                iMax = 0;
                for (i4 = 0; i4 < count; i4++) {
                    iMax = Math.max(this.f41903.m39322((MenuItem) c0532.getAdapter().getItem(i4)), iMax);
                }
                Size size5 = new Size(Math.max(iMax, size.getWidth()), m31090(10));
                this.f41929 = size5;
                m31096(c0532, size5);
            }
            m31108();
        } else {
            Iterator it2 = collectionValues.iterator();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (!this.f41915) {
                        view = view;
                        m31099(arrayList, menuItemOnMenuItemClickListenerC10640);
                    }
                } else if (!C20288.m45781((MenuItem) it3.next()).equals(C20288.m45781((MenuItem) it2.next()))) {
                }
                m31125();
                m31087();
                viewGroup = null;
                this.f41929 = null;
                this.f41920 = null;
                this.f41935 = false;
                viewGroup2 = this.f41918;
                viewGroup2.removeAllViews();
                c0531 = this.f41946;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) c0531.getAdapter();
                arrayAdapter3.clear();
                c0531.setAdapter((ListAdapter) arrayAdapter3);
                this.f41904.removeAllViews();
                m31099(arrayList, menuItemOnMenuItemClickListenerC10640);
                Rect rect3 = this.f41908;
                view.getWindowVisibleDisplayFrame(rect3);
                iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect3.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
                linkedList = new LinkedList();
                linkedList2 = new LinkedList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    menuItem2 = (MenuItem) it.next();
                    if (((InterfaceMenuItemC9720) menuItem2).mo4158()) {
                        linkedList2.add(menuItem2);
                    } else {
                        linkedList.add(menuItem2);
                    }
                }
                linkedList.addAll(linkedList2);
                viewGroup2.removeAllViews();
                viewGroup2.setPaddingRelative(0, 0, 0, 0);
                z = true;
                i = iMin;
                while (true) {
                    zIsEmpty = linkedList.isEmpty();
                    size = this.f41921;
                    if (!zIsEmpty) {
                        menuItem = (MenuItem) linkedList.peek();
                        C13638.requireNonNull(menuItem);
                        if (!z) {
                        }
                        viewInflate = LayoutInflater.from(this.f41911).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m31097(viewInflate, menuItem, this.f41930, z6);
                        if (z) {
                            viewInflate.setPaddingRelative((int) (((double) viewInflate.getPaddingStart()) * 1.5d), viewInflate.getPaddingTop(), viewInflate.getPaddingEnd(), viewInflate.getPaddingBottom());
                        }
                        if (linkedList.size() == z6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            viewInflate.setPaddingRelative(viewInflate.getPaddingStart(), viewInflate.getPaddingTop(), (int) (((double) viewInflate.getPaddingEnd()) * 1.5d), viewInflate.getPaddingBottom());
                        }
                        viewInflate.measure(0, 0);
                        iMin2 = Math.min(viewInflate.getMeasuredWidth(), iMin);
                        if (iMin2 <= i - size.getWidth()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                        }
                        viewInflate.setTag(C20288.m45781(menuItem));
                        viewInflate.setOnClickListener(this.f41932);
                        tooltipText = ((InterfaceMenuItemC9720) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C5031.m14011(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC13938(this));
                        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                        layoutParams2.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams2);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c0531 = c0531;
                    }
                    c0531 = c0531;
                    view = view;
                    break;
                }
                if (linkedList.isEmpty()) {
                    i2 = 0;
                    viewGroup2.setPaddingRelative(0, 0, size.getWidth(), 0);
                } else {
                    i2 = 0;
                }
                if (viewGroup2.getParent() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    throw new IllegalStateException((String) null);
                }
                viewGroup2.measure(i2, i2);
                this.f41920 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) c0531.getAdapter();
                    arrayAdapter.clear();
                    size2 = linkedList.size();
                    while (i3 < size2) {
                        arrayAdapter.add((MenuItem) linkedList.get(i3));
                    }
                    c0532 = c0531;
                    c0532.setAdapter((ListAdapter) arrayAdapter);
                    if (this.f41924) {
                        c0532.setY(0.0f);
                    } else {
                        c0532.setY(size.getHeight());
                    }
                    count = c0532.getAdapter().getCount();
                    iMax = 0;
                    while (i4 < count) {
                        iMax = Math.max(this.f41903.m39322((MenuItem) c0532.getAdapter().getItem(i4)), iMax);
                    }
                    Size size6 = new Size(Math.max(iMax, size.getWidth()), m31090(10));
                    this.f41929 = size6;
                    m31096(c0532, size6);
                }
                m31108();
            }
        }
        boolean z7 = this.f41925;
        Rect rect4 = this.f41928;
        Point point = this.f41942;
        PopupWindow popupWindow = this.f41906;
        if (!z7) {
            if (!rect4.equals(rect)) {
                C13638.requireNonNull(rect);
                if (!this.f41925 && popupWindow.isShowing()) {
                    m31087();
                    m31094(rect);
                    m31084();
                    popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
                }
            }
        } else {
            C13638.requireNonNull(rect);
            if (this.f41925) {
                this.f41925 = false;
                this.f41901.cancel();
                this.f41944.cancel();
                m31087();
                m31094(rect);
                m31084();
                popupWindow.setClippingEnabled(false);
                popupWindow.showAtLocation(view, 0, point.x, point.y);
                ViewTreeObserver viewTreeObserver = popupWindow.getContentView().getRootView().getViewTreeObserver();
                Object obj = this.f41940;
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("removeOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused) {
                    }
                }
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("addOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused2) {
                    }
                }
                this.f41923.start();
            }
        }
        this.f41915 = false;
        rect4.set(rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31125() {
        if (this.f41925) {
            return;
        }
        this.f41925 = true;
        this.f41944.cancel();
        this.f41909.m20106();
        this.f41901.start();
        C23340 c23340 = this.f41931;
        if (c23340 != null) {
            C0356.forEach((ArrayList) ((C23648) ((InterfaceC1466) c23340.f75626)).f76574, new C15555());
        }
        this.f41902.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31127(long j) {
        if (this.f41925) {
            return;
        }
        this.f41909.m20107(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31100(C12527 c12527, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c12527.f41909.m20108();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31126(float f) {
        this.f41904.getBackground().setAlpha((int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31130(C23340 c23340) {
        this.f41931 = c23340;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m31087() {
        this.f41904.clearAnimation();
        this.f41918.animate().cancel();
        this.f41946.animate().cancel();
        this.f41912.stop();
        this.f41943.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m31089() {
        ImageButton imageButton = this.f41913;
        imageButton.setEnabled(true);
        C0531 c0531 = this.f41946;
        c0531.awakenScrollBars();
        boolean z = this.f41935;
        PopupWindow popupWindow = this.f41906;
        int i = this.f41939;
        Size size = this.f41921;
        int i2 = this.f41916;
        ViewGroup viewGroup = this.f41918;
        ViewGroup viewGroup2 = this.f41904;
        if (z) {
            Size size2 = this.f41929;
            m31096(viewGroup2, size2);
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(4);
            c0531.setAlpha(1.0f);
            c0531.setVisibility(0);
            imageButton.setImageDrawable(this.f41927);
            if (m31123()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size2.getWidth() - size.getWidth());
                c0531.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size2.getWidth()) - i2);
                viewGroup.setX(-viewGroup2.getX());
                imageButton.setX(0.0f);
                c0531.setX(0.0f);
            }
            if (this.f41924) {
                viewGroup2.setY(i);
                viewGroup.setY(size2.getHeight() - viewGroup2.getHeight());
                imageButton.setY(size2.getHeight() - size.getHeight());
                c0531.setY(0.0f);
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c0531.setY(size.getHeight());
            return;
        }
        Size size3 = this.f41920;
        m31096(viewGroup2, size3);
        viewGroup.setAlpha(1.0f);
        viewGroup.setVisibility(0);
        c0531.setAlpha(0.0f);
        c0531.setVisibility(4);
        imageButton.setImageDrawable(this.f41934);
        if (this.f41929 != null) {
            if (m31123()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(0.0f);
                c0531.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size3.getWidth()) - i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size3.getWidth() - size.getWidth());
                c0531.setX(size3.getWidth() - this.f41929.getWidth());
            }
            if (this.f41924) {
                viewGroup2.setY((this.f41929.getHeight() + i) - size3.getHeight());
                viewGroup.setY(0.0f);
                imageButton.setY(0.0f);
                c0531.setY(size3.getHeight() - this.f41929.getHeight());
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c0531.setY(size.getHeight());
            return;
        }
        viewGroup2.setX(i2);
        viewGroup2.setY(i);
        viewGroup.setX(0.0f);
        viewGroup.setY(0.0f);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m31108() {
        int iMax;
        Size size = this.f41920;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.f41920.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.f41929;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.f41929.getHeight());
        }
        int i = (this.f41916 * 2) + iMax2;
        PopupWindow popupWindow = this.f41906;
        popupWindow.setWidth(i);
        popupWindow.setHeight((this.f41939 * 2) + iMax);
        Size size3 = this.f41920;
        if (size3 == null || this.f41929 == null) {
            return;
        }
        int width = size3.getWidth() - this.f41929.getWidth();
        int height = this.f41929.getHeight() - this.f41920.getHeight();
        this.f41926 = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.f41904.getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31094(Rect rect) {
        View view = this.f41919;
        Rect rect2 = this.f41908;
        view.getWindowVisibleDisplayFrame(rect2);
        int i = rect2.left;
        int i2 = rect2.right;
        PopupWindow popupWindow = this.f41906;
        int width = i2 - popupWindow.getWidth();
        int iCenterX = rect.centerX() - (popupWindow.getWidth() / 2);
        if (iCenterX >= i) {
            i = iCenterX > width ? width : iCenterX;
        }
        int i3 = rect.top;
        int i4 = rect2.top;
        int i5 = i3 - i4;
        int i6 = rect2.bottom;
        int iMax = rect.bottom;
        int i7 = i6 - iMax;
        int i8 = this.f41939;
        int i9 = i8 * 2;
        int i10 = this.f41936;
        int i11 = i10 + i9;
        int i12 = i;
        if (this.f41929 != null) {
            int iM31090 = m31090(2) + i9;
            int iM31091 = m31090(5) + i9;
            int i13 = (rect2.bottom - rect.top) + i11;
            int i14 = (rect.bottom - rect2.top) + i11;
            if (i5 >= iM31090) {
                if (i5 >= iM31091 || i14 >= i13) {
                    m31115(i5 - i9);
                    iMax = rect.top - popupWindow.getHeight();
                    this.f41924 = true;
                } else {
                    m31115(i13 - i9);
                    iMax = rect.top - i11;
                    this.f41924 = false;
                }
            } else if (i5 >= i11 && i13 >= iM31090) {
                m31115(i13 - i9);
                iMax = rect.top - i11;
                this.f41924 = false;
            } else if (i7 >= iM31090) {
                m31115(i7 - i9);
                iMax = rect.bottom;
                this.f41924 = false;
            } else if (i7 >= i11 && rect2.height() >= iM31090) {
                m31115(i14 - i9);
                iMax = (rect.bottom + i11) - popupWindow.getHeight();
                this.f41924 = true;
            } else {
                m31115(rect2.height() - i9);
                iMax = rect2.top;
                this.f41924 = false;
            }
        } else if (i5 >= i11) {
            iMax = i3 - i11;
        } else if (i7 < i11) {
            iMax = i7 >= i10 ? iMax - i8 : Math.max(i4, i3 - i11);
        }
        View rootView = view.getRootView();
        int[] iArr = this.f41905;
        rootView.getLocationOnScreen(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.f41942.set(i12 - (i15 - iArr[0]), iMax - (i16 - iArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void m31113() {
        int width;
        int height;
        C13638.requireNonNull(this.f41920);
        if (this.f41935) {
            C13638.requireNonNull(this.f41929);
            width = this.f41929.getWidth();
            height = this.f41929.getHeight();
        } else {
            width = this.f41920.getWidth();
            height = this.f41920.getHeight();
        }
        ViewGroup viewGroup = this.f41904;
        this.f41902.set((int) viewGroup.getX(), (int) viewGroup.getY(), ((int) viewGroup.getX()) + width, ((int) viewGroup.getY()) + height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m31123() {
        ContextThemeWrapper contextThemeWrapper = this.f41911;
        return (contextThemeWrapper.getApplicationInfo().flags & 4194304) == 4194304 && contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31115(int i) {
        if (this.f41929 != null) {
            int height = i - this.f41921.getHeight();
            int i2 = this.f41936;
            int iM31090 = m31090((height - (i2 / 2)) / i2);
            if (this.f41929.getHeight() != iM31090) {
                this.f41929 = new Size(this.f41929.getWidth(), iM31090);
            }
            m31096(this.f41946, this.f41929);
            boolean z = this.f41935;
            ViewGroup viewGroup = this.f41904;
            if (z) {
                m31096(viewGroup, this.f41929);
                if (this.f41924) {
                    float height2 = this.f41929.getHeight() - iM31090;
                    viewGroup.setY(viewGroup.getY() + height2);
                    ImageButton imageButton = this.f41913;
                    imageButton.setY(imageButton.getY() - height2);
                }
            } else {
                m31096(viewGroup, this.f41920);
            }
            m31108();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m31084() {
        ViewGroup viewGroup = this.f41904;
        viewGroup.removeAllViews();
        if (this.f41929 != null) {
            viewGroup.addView(this.f41946);
        }
        viewGroup.addView(this.f41918);
        if (this.f41929 != null) {
            viewGroup.addView(this.f41913);
        }
        m31089();
        m31113();
        if (m31123()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.f41910);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static void m31109(C12527 c12527) {
        ImageButton imageButton = c12527.f41913;
        ViewGroup viewGroup = c12527.f41904;
        if (c12527.f41924) {
            c12527.f41918.setY(viewGroup.getHeight() - c12527.f41920.getHeight());
            imageButton.setY(viewGroup.getHeight() - imageButton.getHeight());
            c12527.f41946.setY(viewGroup.getHeight() - c12527.f41929.getHeight());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m31090(int i) {
        int iMax = Math.max(2, i);
        C0531 c0531 = this.f41946;
        int iMin = Math.min(10, Math.min(iMax, c0531.getCount()));
        int count = c0531.getCount();
        int i2 = this.f41936;
        return this.f41921.getHeight() + (iMin * i2) + (iMin < count ? (int) (i2 * 0.5f) : 0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m31105() {
        int i = this.f41926;
        if (i < 150) {
            return Math.max(200, 0);
        }
        if (i > 300) {
            return 300;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return 250;
        }
        return (int) (ValueAnimator.getDurationScale() * 250);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31102(C12527 c12527, ImageButton imageButton) {
        AnimatedVectorDrawable animatedVectorDrawable = c12527.f41912;
        Interpolator interpolator = c12527.f41917;
        C0531 c0531 = c12527.f41946;
        ViewGroup viewGroup = c12527.f41918;
        Interpolator interpolator2 = c12527.f41937;
        ImageButton imageButton2 = c12527.f41913;
        ViewGroup viewGroup2 = c12527.f41904;
        Interpolator interpolator3 = c12527.f41914;
        AnimatedVectorDrawable animatedVectorDrawable2 = c12527.f41943;
        if (c12527.f41935) {
            imageButton.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            AnimationSet animationSet = c12527.f41922;
            int width = c12527.f41920.getWidth();
            int width2 = viewGroup2.getWidth();
            float x = viewGroup2.getX();
            C8999 c8999 = new C8999(c12527, width, width2, x, x + viewGroup2.getWidth());
            C10410 c10410 = new C10410(c12527, c12527.f41920.getHeight(), viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = imageButton2.getX();
            C22404 c22404 = new C22404(c12527, x2, c12527.m31123() ? (x2 - width2) + imageButton2.getWidth() : (width2 + x2) - imageButton2.getWidth(), width2);
            c8999.setInterpolator(interpolator3);
            c8999.setDuration(c12527.m31105());
            c10410.setInterpolator(interpolator2);
            c10410.setDuration(c12527.m31105());
            c22404.setInterpolator(interpolator3);
            c22404.setDuration(c12527.m31105());
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c8999);
            animationSet.addAnimation(c10410);
            animationSet.addAnimation(c22404);
            viewGroup2.startAnimation(animationSet);
            c12527.f41935 = false;
            viewGroup.animate().alpha(1.0f).withLayer().setInterpolator(c12527.f41907).setDuration(100L).start();
            c0531.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        imageButton.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        AnimationSet animationSet2 = c12527.f41933;
        int width3 = c12527.f41929.getWidth();
        int height = c12527.f41929.getHeight();
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        C18876 c18876 = new C18876(c12527, width3, width4, x3, viewGroup2.getWidth() + x3);
        C8293 c8293 = new C8293(c12527, height, height2, y);
        float x4 = imageButton2.getX();
        C19582 c19582 = new C19582(c12527, x4, c12527.m31123() ? (width3 + x4) - imageButton2.getWidth() : (x4 - width3) + imageButton2.getWidth(), width4);
        c18876.setInterpolator(interpolator2);
        c18876.setDuration(c12527.m31105());
        c8293.setInterpolator(interpolator3);
        c8293.setDuration(c12527.m31105());
        c19582.setInterpolator(interpolator3);
        c19582.setDuration(c12527.m31105());
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c18876);
        animationSet2.addAnimation(c8293);
        animationSet2.addAnimation(c19582);
        viewGroup2.startAnimation(animationSet2);
        c12527.f41935 = true;
        viewGroup.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        c0531.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31103(C12527 c12527, C0531 c0531, int i) {
        MenuItem menuItem = (MenuItem) c0531.getAdapter().getItem(i);
        MenuItemOnMenuItemClickListenerC10640 menuItemOnMenuItemClickListenerC10640 = c12527.f41900;
        if (menuItemOnMenuItemClickListenerC10640 != null) {
            menuItemOnMenuItemClickListenerC10640.onMenuItemClick(menuItem);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m31119(C12527 c12527) {
        AnimationSet animationSet = c12527.f41922;
        AnimationSet animationSet2 = c12527.f41933;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31095(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31096(View view, Size size) {
        m31095(view, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31116(ViewGroup viewGroup, int i) {
        m31095(viewGroup, i, viewGroup.getLayoutParams().height);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31098(ViewGroup viewGroup, int i) {
        m31095(viewGroup, viewGroup.getLayoutParams().width, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m31092(C12527 c12527, ContextThemeWrapper contextThemeWrapper, MenuItem menuItem, int i) {
        View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        if (menuItem != null) {
            c12527.m31097(viewInflate, menuItem, i, false);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31097(View view, MenuItem menuItem, int i, boolean z) {
        EnumC17465 enumC17465 = z ? this.f41945 : this.f41941;
        boolean zIsEmpty = TextUtils.isEmpty(menuItem.getTitle());
        boolean z2 = true;
        boolean z3 = menuItem.getIcon() != null;
        boolean z4 = enumC17465.f55576 && !zIsEmpty;
        boolean z5 = enumC17465.f55578 && z3;
        if (z5 || z4) {
            z2 = z4;
        } else if (zIsEmpty) {
            if (z3) {
                z5 = true;
            }
            z2 = z4;
        }
        TextView textView = (TextView) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        textView.setEllipsize(null);
        if (z2) {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        } else {
            textView.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        if (z5) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(menuItem.getIcon());
            textView.setPaddingRelative(i, 0, 0, 0);
        } else {
            imageView.setVisibility(8);
            textView.setPaddingRelative(0, 0, 0, 0);
        }
        CharSequence contentDescription = ((InterfaceMenuItemC9720) menuItem).getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            view.setContentDescription(menuItem.getTitle());
        } else {
            view.setContentDescription(contentDescription);
        }
        if (!z || zIsEmpty || z2) {
            return;
        }
        C5031.m14011(view, String.valueOf(menuItem.getTitle()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31129(EnumC17465 enumC17465, EnumC17465 enumC17466) {
        C13638.requireNonNull(enumC17465);
        this.f41945 = enumC17465;
        C13638.requireNonNull(enumC17466);
        this.f41941 = enumC17466;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m31091(ViewGroup viewGroup, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }
}
