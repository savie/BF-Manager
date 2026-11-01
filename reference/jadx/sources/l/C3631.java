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

/* JADX INFO: renamed from: l.ۘ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes3.dex */
public final class C3631 extends AbstractC17743 implements Animatable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f13337;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f13338;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Animator.AnimatorListener f13339;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Context f13340;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0809 f13341;

    public C3631(Context context, int i) {
        this.f13339 = null;
        this.f13337 = null;
        this.f13338 = new C5043(this);
        this.f13340 = context;
        this.f13341 = new C0809();
    }

    public C3631() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3631 m10732(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C3631 c3631 = new C3631(context, 0);
            Drawable drawableM39101 = C16631.m39101(context.getResources(), i, context.getTheme());
            c3631.f56306 = drawableM39101;
            drawableM39101.setCallback(c3631.f13338);
            new C12805(c3631.f56306.getConstantState());
            return c3631;
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
            return m10733(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3631 m10733(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C3631 c3631 = new C3631(context, 0);
        c3631.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c3631;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f56306 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C12805(this.f56306.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f13341.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0809 c0809 = this.f13341;
        c0809.f3427.draw(canvas);
        if (c0809.f3428.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f13341.f3427.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f13341.f3427.setState(iArr);
    }

    @Override // l.AbstractC17743, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f13341.f3427.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f13341.f3427.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f13341.f3427.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13341.f3427.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return C7603.m20136(drawable);
        }
        return this.f13341.f3427.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20138(drawable, i);
        } else {
            this.f13341.f3427.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20129(drawable, colorStateList);
        } else {
            this.f13341.f3427.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20132(drawable, mode);
        } else {
            this.f13341.f3427.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f13341.f3427.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f13341.f3427.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f13341.f3427.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f13341.f3427.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f13341.f3427.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f13341.f3427.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f13341.f3427.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C0809 c0809;
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20131(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0809 = this.f13341;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM30834 = C12398.m30834(resources, theme, attributeSet, C13511.f44627);
                    int resourceId = typedArrayM30834.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C19861 c19861M45105 = C19861.m45105(resources, resourceId, theme);
                        c19861M45105.m45109();
                        c19861M45105.setCallback(this.f13338);
                        C19861 c19861 = c0809.f3427;
                        if (c19861 != null) {
                            c19861.setCallback(null);
                        }
                        c0809.f3427 = c19861M45105;
                    }
                    typedArrayM30834.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C13511.f44632);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f13340;
                        if (context != null) {
                            Animator animatorM50244 = C22683.m50244(context, resourceId2);
                            animatorM50244.setTarget(c0809.f3427.m45108(string));
                            if (c0809.f3430 == null) {
                                c0809.f3430 = new ArrayList();
                                c0809.f3429 = new C21445();
                            }
                            c0809.f3430.add(animatorM50244);
                            c0809.f3429.put(animatorM50244, string);
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
        if (c0809.f3428 == null) {
            c0809.f3428 = new AnimatorSet();
        }
        c0809.f3428.playTogether(c0809.f3430);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // l.AbstractC17743, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            C7603.m20130(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return C7603.m20133(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f13341.f3428.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0809 c0809 = this.f13341;
        if (c0809.f3428.isStarted()) {
            return;
        }
        c0809.f3428.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f13341.f3428.end();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10734(AbstractC2220 abstractC2220) {
        Drawable drawable = this.f56306;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC2220.getPlatformCallback());
            return;
        }
        if (abstractC2220 == null) {
            return;
        }
        if (this.f13337 == null) {
            this.f13337 = new ArrayList();
        }
        if (this.f13337.contains(abstractC2220)) {
            return;
        }
        this.f13337.add(abstractC2220);
        if (this.f13339 == null) {
            this.f13339 = new C21977(this);
        }
        this.f13341.f3428.addListener(this.f13339);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10735(AbstractC2220 abstractC2220) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f56306;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC2220.getPlatformCallback());
        }
        ArrayList arrayList = this.f13337;
        if (arrayList == null || abstractC2220 == null) {
            return;
        }
        arrayList.remove(abstractC2220);
        if (this.f13337.size() != 0 || (animatorListener = this.f13339) == null) {
            return;
        }
        this.f13341.f3428.removeListener(animatorListener);
        this.f13339 = null;
    }
}
