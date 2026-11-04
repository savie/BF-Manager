package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۖۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes3.dex */
public final class C2370 extends AbstractC21936 implements Animatable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Animator.AnimatorListener f7629;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f7630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f7631;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Context f7632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0879 f7633;

    public C2370(Context context, int i) {
        this.f7629 = null;
        this.f7631 = null;
        this.f7630 = new C18778(this);
        this.f7632 = context;
        this.f7633 = new C0879();
    }

    public C2370() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2370 m8053(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C2370 c2370 = new C2370(context, 0);
            Drawable drawableM24392 = C9217.m24392(context.getResources(), i, context.getTheme());
            c2370.f70810 = drawableM24392;
            drawableM24392.setCallback(c2370.f7630);
            new C9081(c2370.f70810.getConstantState());
            return c2370;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m8054(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2370 m8054(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C2370 c2370 = new C2370(context, 0);
        c2370.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c2370;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f70810 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C9081(this.f70810.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7633.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0879 c0879 = this.f7633;
        c0879.f3272.draw(canvas);
        if (c0879.f3269.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7633.f3272.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f7633.f3272.setState(iArr);
    }

    @Override // l.AbstractC21936, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f7633.f3272.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f7633.f3272.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f7633.f3272.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7633.f3272.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return C0597.m2696(drawable);
        }
        return this.f7633.f3272.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2700(drawable, i);
        } else {
            this.f7633.f3272.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2690(drawable, colorStateList);
        } else {
            this.f7633.f3272.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2693(drawable, mode);
        } else {
            this.f7633.f3272.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f7633.f3272.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f7633.f3272.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f7633.f3272.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f7633.f3272.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f7633.f3272.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f7633.f3272.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f7633.f3272.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C0879 c0879;
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2692(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0879 = this.f7633;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM8387 = C2506.m8387(resources, theme, attributeSet, C18032.f59037);
                    int resourceId = typedArrayM8387.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C24920 c24920M55517 = C24920.m55517(resources, resourceId, theme);
                        c24920M55517.m55521();
                        c24920M55517.setCallback(this.f7630);
                        C24920 c24920 = c0879.f3272;
                        if (c24920 != null) {
                            c24920.setCallback(null);
                        }
                        c0879.f3272 = c24920M55517;
                    }
                    typedArrayM8387.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C18032.f59044);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f7632;
                        if (context != null) {
                            Animator animatorM19057 = C6845.m19057(context, resourceId2);
                            animatorM19057.setTarget(c0879.f3272.m55520(string));
                            if (c0879.f3271 == null) {
                                c0879.f3271 = new ArrayList();
                                c0879.f3270 = new C14307();
                            }
                            c0879.f3271.add(animatorM19057);
                            c0879.f3270.put(animatorM19057, string);
                        } else {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0879.f3269 == null) {
            c0879.f3269 = new AnimatorSet();
        }
        c0879.f3269.playTogether(c0879.f3271);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // l.AbstractC21936, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            C0597.m2691(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return C0597.m2694(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f7633.f3269.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0879 c0879 = this.f7633;
        if (c0879.f3269.isStarted()) {
            return;
        }
        c0879.f3269.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7633.f3269.end();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8055(AbstractC7591 abstractC7591) {
        Drawable drawable = this.f70810;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC7591.getPlatformCallback());
            return;
        }
        if (abstractC7591 == null) {
            return;
        }
        if (this.f7631 == null) {
            this.f7631 = new ArrayList();
        }
        if (this.f7631.contains(abstractC7591)) {
            return;
        }
        this.f7631.add(abstractC7591);
        if (this.f7629 == null) {
            this.f7629 = new C9827(this);
        }
        this.f7633.f3269.addListener(this.f7629);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8056(AbstractC7591 abstractC7591) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f70810;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC7591.getPlatformCallback());
        }
        ArrayList arrayList = this.f7631;
        if (arrayList == null || abstractC7591 == null) {
            return;
        }
        arrayList.remove(abstractC7591);
        if (this.f7631.size() != 0 || (animatorListener = this.f7629) == null) {
            return;
        }
        this.f7633.f3269.removeListener(animatorListener);
        this.f7629 = null;
    }
}
