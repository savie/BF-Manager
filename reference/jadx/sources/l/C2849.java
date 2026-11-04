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
import java.util.List;

/* JADX INFO: renamed from: l.ۖᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2849 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public MenuItem.OnMenuItemClickListener f9370;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ImageButton f9371;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Interpolator f9372;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f9373;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1358 f9374;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f9375;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f9376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC0612 f9377;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f9378;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9381;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9560 f9382;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9383;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Size f9384;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Size f9385;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Drawable f9386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Interpolator f9389;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Interpolator f9391;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9392;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9393;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f9394;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f9395;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9397;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public EnumC8815 f9399;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9400;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public EnumC8815 f9401;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9402;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C5087 f9403;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9405;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f9406;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Interpolator f9408;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f9410;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9412;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f9414;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Size f9415;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f9416;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final Rect f9390 = new Rect();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Point f9396 = new Point();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int[] f9407 = new int[2];

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Region f9380 = new Region();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Object f9398 = C20572.m47170(new C5833(this));

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f9411 = new RunnableC3595(this);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f9379 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f9404 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f9409 = new ViewOnClickListenerC20749(this);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final Rect f9388 = new Rect();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9417 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9375(C2849 c2849, C23556 c23556) {
        c23556.m52757().setEmpty();
        c23556.m52758().setEmpty();
        c23556.m52759().set(c2849.f9380);
        c23556.m52760();
    }

    public C2849(Context context, View view) {
        boolean z;
        EnumC8815 enumC8815 = EnumC8815.PREFER_SHOW_ALL;
        this.f9401 = enumC8815;
        this.f9399 = enumC8815;
        HandlerC0612 handlerC0612 = new HandlerC0612(this);
        this.f9377 = handlerC0612;
        C17359.requireNonNull(view);
        this.f9394 = view;
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.isLightTheme});
            z = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z = true;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z ? R.style.Theme.DeviceDefault.Light : R.style.Theme.DeviceDefault);
        this.f9406 = contextThemeWrapper;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setContentDescription("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f9412 = viewGroup;
        C8070 c8070 = new C8070(viewGroup.getContext(), handlerC0612);
        PopupWindow popupWindow = new PopupWindow(c8070);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c8070.addView(viewGroup);
        this.f9378 = popupWindow;
        this.f9376 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9395 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9375 = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9402 = dimensionPixelSize;
        this.f9391 = new InterpolatorC19257();
        this.f9389 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_slow_in);
        this.f9408 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.linear_out_slow_in);
        this.f9372 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_linear_in);
        Drawable drawable = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9410 = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9386 = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9397 = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9393 = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        final ImageButton imageButton = (ImageButton) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ۧᩳᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2849.m9373(this.f38115, imageButton);
            }
        });
        imageButton.setOnTouchListener(new ViewOnTouchListenerC13290(this));
        this.f9371 = imageButton;
        if (!(imageButton.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        imageButton.measure(0, 0);
        this.f9385 = new Size(imageButton.getMeasuredWidth(), imageButton.getMeasuredHeight());
        this.f9381 = new C17019(this, contextThemeWrapper);
        this.f9382 = new C9560(this, contextThemeWrapper, dimensionPixelSize);
        final C1358 c1358 = new C1358(this);
        c1358.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c1358.setDivider(null);
        c1358.setDividerHeight(0);
        c1358.setAdapter((ListAdapter) new C17765(this, contextThemeWrapper));
        c1358.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.֫ᩳᩴ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C2849.m9374(this.f6970, c1358, i);
            }
        });
        this.f9374 = c1358;
        AnimationAnimationListenerC23733 animationAnimationListenerC23733 = new AnimationAnimationListenerC23733(this);
        AnimationSet animationSet = new AnimationSet(true);
        this.f9383 = animationSet;
        animationSet.setAnimationListener(animationAnimationListenerC23733);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f9387 = animationSet2;
        animationSet2.setAnimationListener(animationAnimationListenerC23733);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.f9413 = animatorSet;
        this.f9392 = m9362(viewGroup, 150, new C12544(this));
        this.f9400 = m9362(viewGroup, 0, new C6579(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9407() {
        int i = this.f9375;
        int i2 = this.f9395;
        return i + i2 + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9370(List list, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        LinkedHashMap linkedHashMap = this.f9404;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            linkedHashMap.put(C10306.m26554(menuItem), menuItem);
        }
        this.f9370 = onMenuItemClickListener;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9406() {
        this.f9417 = true;
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
    public final void m9402(ArrayList arrayList, MenuItem.OnMenuItemClickListener onMenuItemClickListener, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C1358 c1358;
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
        C1358 c1359;
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
        this.f9377.m2732();
        Collection collectionValues = this.f9404.values();
        int size3 = arrayList.size();
        int size4 = collectionValues.size();
        View view = this.f9394;
        boolean z6 = true;
        if (size3 != size4) {
            m9399();
            m9385();
            viewGroup = null;
            this.f9384 = null;
            this.f9415 = null;
            this.f9414 = false;
            viewGroup2 = this.f9381;
            viewGroup2.removeAllViews();
            c1358 = this.f9374;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) c1358.getAdapter();
            arrayAdapter2.clear();
            c1358.setAdapter((ListAdapter) arrayAdapter2);
            this.f9412.removeAllViews();
            m9370(arrayList, onMenuItemClickListener);
            Rect rect2 = this.f9390;
            view.getWindowVisibleDisplayFrame(rect2);
            iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect2.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
            linkedList = new LinkedList();
            linkedList2 = new LinkedList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                menuItem2 = (MenuItem) it.next();
                if (((InterfaceMenuItemC22709) menuItem2).mo6059()) {
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
                size = this.f9385;
                if (!zIsEmpty) {
                    menuItem = (MenuItem) linkedList.peek();
                    C17359.requireNonNull(menuItem);
                    if (!z || !((InterfaceMenuItemC22709) menuItem).mo6059()) {
                        viewInflate = LayoutInflater.from(this.f9406).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m9368(viewInflate, menuItem, this.f9402, z6);
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
                        viewInflate.setTag(C10306.m26554(menuItem));
                        viewInflate.setOnClickListener(this.f9409);
                        tooltipText = ((InterfaceMenuItemC22709) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C22666.m51122(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC13290(this));
                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                        layoutParams.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c1358 = c1358;
                    }
                }
                c1358 = c1358;
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
            this.f9415 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) c1358.getAdapter();
                arrayAdapter.clear();
                size2 = linkedList.size();
                for (i3 = 0; i3 < size2; i3++) {
                    arrayAdapter.add((MenuItem) linkedList.get(i3));
                }
                c1359 = c1358;
                c1359.setAdapter((ListAdapter) arrayAdapter);
                if (this.f9405) {
                    c1359.setY(0.0f);
                } else {
                    c1359.setY(size.getHeight());
                }
                count = c1359.getAdapter().getCount();
                iMax = 0;
                for (i4 = 0; i4 < count; i4++) {
                    iMax = Math.max(this.f9382.m24982((MenuItem) c1359.getAdapter().getItem(i4)), iMax);
                }
                Size size5 = new Size(Math.max(iMax, size.getWidth()), m9361(10));
                this.f9384 = size5;
                m9367(c1359, size5);
            }
            m9388();
        } else {
            Iterator it2 = collectionValues.iterator();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (!this.f9417) {
                        view = view;
                        m9370(arrayList, onMenuItemClickListener);
                    }
                } else if (!C10306.m26554((MenuItem) it3.next()).equals(C10306.m26554((MenuItem) it2.next()))) {
                }
                m9399();
                m9385();
                viewGroup = null;
                this.f9384 = null;
                this.f9415 = null;
                this.f9414 = false;
                viewGroup2 = this.f9381;
                viewGroup2.removeAllViews();
                c1358 = this.f9374;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) c1358.getAdapter();
                arrayAdapter3.clear();
                c1358.setAdapter((ListAdapter) arrayAdapter3);
                this.f9412.removeAllViews();
                m9370(arrayList, onMenuItemClickListener);
                Rect rect3 = this.f9390;
                view.getWindowVisibleDisplayFrame(rect3);
                iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect3.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
                linkedList = new LinkedList();
                linkedList2 = new LinkedList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    menuItem2 = (MenuItem) it.next();
                    if (((InterfaceMenuItemC22709) menuItem2).mo6059()) {
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
                    size = this.f9385;
                    if (!zIsEmpty) {
                        menuItem = (MenuItem) linkedList.peek();
                        C17359.requireNonNull(menuItem);
                        if (!z) {
                        }
                        viewInflate = LayoutInflater.from(this.f9406).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m9368(viewInflate, menuItem, this.f9402, z6);
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
                        viewInflate.setTag(C10306.m26554(menuItem));
                        viewInflate.setOnClickListener(this.f9409);
                        tooltipText = ((InterfaceMenuItemC22709) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C22666.m51122(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC13290(this));
                        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                        layoutParams2.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams2);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c1358 = c1358;
                    }
                    c1358 = c1358;
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
                this.f9415 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) c1358.getAdapter();
                    arrayAdapter.clear();
                    size2 = linkedList.size();
                    while (i3 < size2) {
                        arrayAdapter.add((MenuItem) linkedList.get(i3));
                    }
                    c1359 = c1358;
                    c1359.setAdapter((ListAdapter) arrayAdapter);
                    if (this.f9405) {
                        c1359.setY(0.0f);
                    } else {
                        c1359.setY(size.getHeight());
                    }
                    count = c1359.getAdapter().getCount();
                    iMax = 0;
                    while (i4 < count) {
                        iMax = Math.max(this.f9382.m24982((MenuItem) c1359.getAdapter().getItem(i4)), iMax);
                    }
                    Size size6 = new Size(Math.max(iMax, size.getWidth()), m9361(10));
                    this.f9384 = size6;
                    m9367(c1359, size6);
                }
                m9388();
            }
        }
        boolean zM9408 = m9408();
        Rect rect4 = this.f9388;
        Point point = this.f9396;
        PopupWindow popupWindow = this.f9378;
        if (zM9408) {
            if (!rect4.equals(rect)) {
                C17359.requireNonNull(rect);
                if (m9408() && popupWindow.isShowing()) {
                    m9385();
                    m9365(rect);
                    m9359();
                    popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
                }
            }
        } else {
            C17359.requireNonNull(rect);
            if (!m9408()) {
                this.f9416 = false;
                this.f9379 = false;
                this.f9392.cancel();
                this.f9400.cancel();
                m9385();
                m9365(rect);
                m9359();
                popupWindow.setClippingEnabled(false);
                popupWindow.showAtLocation(view, 0, point.x, point.y);
                ViewTreeObserver viewTreeObserver = popupWindow.getContentView().getRootView().getViewTreeObserver();
                Object obj = this.f9398;
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
                this.f9413.start();
            }
        }
        this.f9417 = false;
        rect4.set(rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9399() {
        if (this.f9379) {
            return;
        }
        this.f9416 = false;
        this.f9379 = true;
        this.f9400.cancel();
        this.f9377.m2732();
        this.f9392.start();
        C5087 c5087 = this.f9403;
        if (c5087 != null) {
            C4937.forEach(((C0134) ((InterfaceC11052) c5087.f17779)).f1097, new C22683());
        }
        this.f9380.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9401(long j) {
        if (this.f9379) {
            return;
        }
        this.f9377.m2733(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9371(C2849 c2849, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c2849.f9377.m2734();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9405() {
        if (m9408()) {
            this.f9416 = true;
            this.f9400.start();
            this.f9380.setEmpty();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m9408() {
        return (this.f9379 || this.f9416) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9400(float f) {
        this.f9412.getBackground().setAlpha((int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9403(C5087 c5087) {
        this.f9403 = c5087;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m9385() {
        this.f9412.clearAnimation();
        this.f9381.animate().cancel();
        this.f9374.animate().cancel();
        this.f9397.stop();
        this.f9393.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m9398() {
        ImageButton imageButton = this.f9371;
        imageButton.setEnabled(true);
        C1358 c1358 = this.f9374;
        c1358.awakenScrollBars();
        boolean z = this.f9414;
        PopupWindow popupWindow = this.f9378;
        int i = this.f9395;
        Size size = this.f9385;
        int i2 = this.f9376;
        ViewGroup viewGroup = this.f9381;
        ViewGroup viewGroup2 = this.f9412;
        if (z) {
            Size size2 = this.f9384;
            m9367(viewGroup2, size2);
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(4);
            c1358.setAlpha(1.0f);
            c1358.setVisibility(0);
            imageButton.setImageDrawable(this.f9410);
            if (m9377()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size2.getWidth() - size.getWidth());
                c1358.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size2.getWidth()) - i2);
                viewGroup.setX(-viewGroup2.getX());
                imageButton.setX(0.0f);
                c1358.setX(0.0f);
            }
            if (this.f9405) {
                viewGroup2.setY(i);
                viewGroup.setY(size2.getHeight() - viewGroup2.getHeight());
                imageButton.setY(size2.getHeight() - size.getHeight());
                c1358.setY(0.0f);
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c1358.setY(size.getHeight());
            return;
        }
        Size size3 = this.f9415;
        m9367(viewGroup2, size3);
        viewGroup.setAlpha(1.0f);
        viewGroup.setVisibility(0);
        c1358.setAlpha(0.0f);
        c1358.setVisibility(4);
        imageButton.setImageDrawable(this.f9386);
        if (this.f9384 != null) {
            if (m9377()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(0.0f);
                c1358.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size3.getWidth()) - i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size3.getWidth() - size.getWidth());
                c1358.setX(size3.getWidth() - this.f9384.getWidth());
            }
            if (this.f9405) {
                viewGroup2.setY((this.f9384.getHeight() + i) - size3.getHeight());
                viewGroup.setY(0.0f);
                imageButton.setY(0.0f);
                c1358.setY(size3.getHeight() - this.f9384.getHeight());
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c1358.setY(size.getHeight());
            return;
        }
        viewGroup2.setX(i2);
        viewGroup2.setY(i);
        viewGroup.setX(0.0f);
        viewGroup.setY(0.0f);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m9388() {
        int iMax;
        Size size = this.f9415;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.f9415.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.f9384;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.f9384.getHeight());
        }
        int i = (this.f9376 * 2) + iMax2;
        PopupWindow popupWindow = this.f9378;
        popupWindow.setWidth(i);
        popupWindow.setHeight((this.f9395 * 2) + iMax);
        Size size3 = this.f9415;
        if (size3 == null || this.f9384 == null) {
            return;
        }
        int width = size3.getWidth() - this.f9384.getWidth();
        int height = this.f9384.getHeight() - this.f9415.getHeight();
        this.f9373 = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.f9412.getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9365(Rect rect) {
        View view = this.f9394;
        Rect rect2 = this.f9390;
        view.getWindowVisibleDisplayFrame(rect2);
        int i = rect2.left;
        int i2 = rect2.right;
        PopupWindow popupWindow = this.f9378;
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
        int i8 = this.f9395;
        int i9 = i8 * 2;
        int i10 = this.f9375;
        int i11 = i10 + i9;
        int i12 = i;
        if (this.f9384 != null) {
            int iM9361 = m9361(2) + i9;
            int iM9362 = m9361(5) + i9;
            int i13 = (rect2.bottom - rect.top) + i11;
            int i14 = (rect.bottom - rect2.top) + i11;
            if (i5 >= iM9361) {
                if (i5 >= iM9362 || i14 >= i13) {
                    m9393(i5 - i9);
                    iMax = rect.top - popupWindow.getHeight();
                    this.f9405 = true;
                } else {
                    m9393(i13 - i9);
                    iMax = rect.top - i11;
                    this.f9405 = false;
                }
            } else if (i5 >= i11 && i13 >= iM9361) {
                m9393(i13 - i9);
                iMax = rect.top - i11;
                this.f9405 = false;
            } else if (i7 >= iM9361) {
                m9393(i7 - i9);
                iMax = rect.bottom;
                this.f9405 = false;
            } else if (i7 >= i11 && rect2.height() >= iM9361) {
                m9393(i14 - i9);
                iMax = (rect.bottom + i11) - popupWindow.getHeight();
                this.f9405 = true;
            } else {
                m9393(rect2.height() - i9);
                iMax = rect2.top;
                this.f9405 = false;
            }
        } else if (i5 >= i11) {
            iMax = i3 - i11;
        } else if (i7 < i11) {
            iMax = i7 >= i10 ? iMax - i8 : Math.max(i4, i3 - i11);
        }
        View rootView = view.getRootView();
        int[] iArr = this.f9407;
        rootView.getLocationOnScreen(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.f9396.set(i12 - (i15 - iArr[0]), iMax - (i16 - iArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m9380() {
        int width;
        int height;
        C17359.requireNonNull(this.f9415);
        if (this.f9414) {
            C17359.requireNonNull(this.f9384);
            width = this.f9384.getWidth();
            height = this.f9384.getHeight();
        } else {
            width = this.f9415.getWidth();
            height = this.f9415.getHeight();
        }
        ViewGroup viewGroup = this.f9412;
        this.f9380.set((int) viewGroup.getX(), (int) viewGroup.getY(), ((int) viewGroup.getX()) + width, ((int) viewGroup.getY()) + height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m9377() {
        ContextThemeWrapper contextThemeWrapper = this.f9406;
        return (contextThemeWrapper.getApplicationInfo().flags & 4194304) == 4194304 && contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9393(int i) {
        if (this.f9384 != null) {
            int height = i - this.f9385.getHeight();
            int i2 = this.f9375;
            int iM9361 = m9361((height - (i2 / 2)) / i2);
            if (this.f9384.getHeight() != iM9361) {
                this.f9384 = new Size(this.f9384.getWidth(), iM9361);
            }
            m9367(this.f9374, this.f9384);
            boolean z = this.f9414;
            ViewGroup viewGroup = this.f9412;
            if (z) {
                m9367(viewGroup, this.f9384);
                if (this.f9405) {
                    float height2 = this.f9384.getHeight() - iM9361;
                    viewGroup.setY(viewGroup.getY() + height2);
                    ImageButton imageButton = this.f9371;
                    imageButton.setY(imageButton.getY() - height2);
                }
            } else {
                m9367(viewGroup, this.f9415);
            }
            m9388();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9359() {
        ViewGroup viewGroup = this.f9412;
        viewGroup.removeAllViews();
        if (this.f9384 != null) {
            viewGroup.addView(this.f9374);
        }
        viewGroup.addView(this.f9381);
        if (this.f9384 != null) {
            viewGroup.addView(this.f9371);
        }
        m9398();
        m9380();
        if (m9377()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.f9411);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m9360(C2849 c2849) {
        ImageButton imageButton = c2849.f9371;
        ViewGroup viewGroup = c2849.f9412;
        if (c2849.f9405) {
            c2849.f9381.setY(viewGroup.getHeight() - c2849.f9415.getHeight());
            imageButton.setY(viewGroup.getHeight() - imageButton.getHeight());
            c2849.f9374.setY(viewGroup.getHeight() - c2849.f9384.getHeight());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m9361(int i) {
        int iMax = Math.max(2, i);
        C1358 c1358 = this.f9374;
        int iMin = Math.min(10, Math.min(iMax, c1358.getCount()));
        int count = c1358.getCount();
        int i2 = this.f9375;
        return this.f9385.getHeight() + (iMin * i2) + (iMin < count ? (int) (i2 * 0.5f) : 0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m9382() {
        int i = this.f9373;
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
    public static void m9373(C2849 c2849, ImageButton imageButton) {
        AnimatedVectorDrawable animatedVectorDrawable = c2849.f9397;
        Interpolator interpolator = c2849.f9408;
        C1358 c1358 = c2849.f9374;
        ViewGroup viewGroup = c2849.f9381;
        Interpolator interpolator2 = c2849.f9391;
        ImageButton imageButton2 = c2849.f9371;
        ViewGroup viewGroup2 = c2849.f9412;
        Interpolator interpolator3 = c2849.f9389;
        AnimatedVectorDrawable animatedVectorDrawable2 = c2849.f9393;
        if (c2849.f9414) {
            imageButton.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            AnimationSet animationSet = c2849.f9387;
            int width = c2849.f9415.getWidth();
            int width2 = viewGroup2.getWidth();
            float x = viewGroup2.getX();
            C21495 c21495 = new C21495(c2849, width, width2, x, x + viewGroup2.getWidth());
            C18511 c18511 = new C18511(c2849, c2849.f9415.getHeight(), viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = imageButton2.getX();
            C25225 c25225 = new C25225(c2849, x2, c2849.m9377() ? (x2 - width2) + imageButton2.getWidth() : (width2 + x2) - imageButton2.getWidth(), width2);
            c21495.setInterpolator(interpolator3);
            c21495.setDuration(c2849.m9382());
            c18511.setInterpolator(interpolator2);
            c18511.setDuration(c2849.m9382());
            c25225.setInterpolator(interpolator3);
            c25225.setDuration(c2849.m9382());
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c21495);
            animationSet.addAnimation(c18511);
            animationSet.addAnimation(c25225);
            viewGroup2.startAnimation(animationSet);
            c2849.f9414 = false;
            viewGroup.animate().alpha(1.0f).withLayer().setInterpolator(c2849.f9372).setDuration(100L).start();
            c1358.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        imageButton.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        AnimationSet animationSet2 = c2849.f9383;
        int width3 = c2849.f9384.getWidth();
        int height = c2849.f9384.getHeight();
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        C24479 c24479 = new C24479(c2849, width3, width4, x3, viewGroup2.getWidth() + x3);
        C4341 c4341 = new C4341(c2849, height, height2, y);
        float x4 = imageButton2.getX();
        C14781 c14781 = new C14781(c2849, x4, c2849.m9377() ? (width3 + x4) - imageButton2.getWidth() : (x4 - width3) + imageButton2.getWidth(), width4);
        c24479.setInterpolator(interpolator2);
        c24479.setDuration(c2849.m9382());
        c4341.setInterpolator(interpolator3);
        c4341.setDuration(c2849.m9382());
        c14781.setInterpolator(interpolator3);
        c14781.setDuration(c2849.m9382());
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c24479);
        animationSet2.addAnimation(c4341);
        animationSet2.addAnimation(c14781);
        viewGroup2.startAnimation(animationSet2);
        c2849.f9414 = true;
        viewGroup.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        c1358.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9374(C2849 c2849, C1358 c1358, int i) {
        MenuItem menuItem = (MenuItem) c1358.getAdapter().getItem(i);
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c2849.f9370;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m9396(C2849 c2849) {
        AnimationSet animationSet = c2849.f9387;
        AnimationSet animationSet2 = c2849.f9383;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9366(View view, int i, int i2) {
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
    public static void m9367(View view, Size size) {
        m9366(view, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m9394(ViewGroup viewGroup, int i) {
        m9366(viewGroup, i, viewGroup.getLayoutParams().height);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9369(ViewGroup viewGroup, int i) {
        m9366(viewGroup, viewGroup.getLayoutParams().width, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m9363(C2849 c2849, ContextThemeWrapper contextThemeWrapper, MenuItem menuItem, int i) {
        View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        if (menuItem != null) {
            c2849.m9368(viewInflate, menuItem, i, false);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m9368(View view, MenuItem menuItem, int i, boolean z) {
        EnumC8815 enumC8815 = z ? this.f9401 : this.f9399;
        boolean zIsEmpty = TextUtils.isEmpty(menuItem.getTitle());
        boolean z2 = true;
        boolean z3 = menuItem.getIcon() != null;
        boolean z4 = enumC8815.f28817 && !zIsEmpty;
        boolean z5 = enumC8815.f28818 && z3;
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
        CharSequence contentDescription = ((InterfaceMenuItemC22709) menuItem).getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            view.setContentDescription(menuItem.getTitle());
        } else {
            view.setContentDescription(contentDescription);
        }
        if (!z || zIsEmpty || z2) {
            return;
        }
        C22666.m51122(view, String.valueOf(menuItem.getTitle()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9404(EnumC8815 enumC8815, EnumC8815 enumC8816) {
        C17359.requireNonNull(enumC8815);
        this.f9401 = enumC8815;
        C17359.requireNonNull(enumC8816);
        this.f9399 = enumC8816;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m9362(ViewGroup viewGroup, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }
}
