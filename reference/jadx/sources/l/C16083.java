package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C16083 extends C14591 implements InterfaceC8800 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f52122;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f52123;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f52124;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17575 f52125;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C1914 f52126;

    public C16083() {
        this(null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16083 m38243(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        Drawable drawableM51616;
        int next;
        int next2;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C16083 c16083 = new C16083();
        TypedArray typedArrayM8387 = C2506.m8387(resources, theme, attributeSet, C18321.f59766);
        int i = 1;
        c16083.setVisible(typedArrayM8387.getBoolean(1, true), true);
        C1914 c1914 = c16083.f52126;
        c1914.f65815 |= C21305.m48542(typedArrayM8387);
        int i2 = 2;
        c1914.f65810 = typedArrayM8387.getBoolean(2, c1914.f65810);
        int i3 = 3;
        c1914.f65831 = typedArrayM8387.getBoolean(3, c1914.f65831);
        c1914.f65806 = typedArrayM8387.getInt(4, c1914.f65806);
        c1914.f65819 = typedArrayM8387.getInt(5, c1914.f65819);
        boolean z = false;
        c16083.setDither(typedArrayM8387.getBoolean(0, c1914.f65817));
        c16083.m30824(resources);
        typedArrayM8387.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (!xmlResourceParser.getName().equals("item")) {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayM8388 = C2506.m8387(resources, theme, attributeSet, C18321.f59767);
                        int resourceId = typedArrayM8388.getResourceId(2, -1);
                        int resourceId2 = typedArrayM8388.getResourceId(1, -1);
                        int resourceId3 = typedArrayM8388.getResourceId(z ? 1 : 0, -1);
                        drawableM51616 = resourceId3 > 0 ? C22884.m51609().m51616(context, resourceId3) : null;
                        boolean z2 = typedArrayM8388.getBoolean(3, z);
                        typedArrayM8388.recycle();
                        if (drawableM51616 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableM51616 = C2370.m8054(context, resources, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableM51616 = C21305.m48543(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM51616 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId == -1 || resourceId2 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        c16083.f52126.m6581(resourceId, resourceId2, drawableM51616, z2);
                        i = 1;
                        z = false;
                    }
                    i2 = 2;
                    i3 = 3;
                } else {
                    TypedArray typedArrayM8389 = C2506.m8387(resources, theme, attributeSet, C18321.f59768);
                    int resourceId4 = typedArrayM8389.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId5 = typedArrayM8389.getResourceId(i, -1);
                    drawableM51616 = resourceId5 > 0 ? C22884.m51609().m51616(context, resourceId5) : null;
                    typedArrayM8389.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i4 = 0;
                    for (int i5 = 0; i5 < attributeCount; i5++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i6 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i5, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i4] = attributeNameResource;
                            i4 = i6;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i4);
                    if (drawableM51616 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableM51616 = C24920.m55518(resources, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableM51616 = C21305.m48543(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM51616 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C1914 c1915 = c16083.f52126;
                    int iM47127 = c1915.m47127(drawableM51616);
                    c1915.f14105[iM47127] = iArrTrimStateSet;
                    c1915.f6439.m8077(iM47127, Integer.valueOf(resourceId4));
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
        c16083.onStateChange(c16083.getState());
        return c16083;
    }

    @Override // l.C12354, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC17575 abstractC17575 = this.f52125;
        if (abstractC17575 != null && (visible || z2)) {
            if (z) {
                abstractC17575.mo16628();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38245(int[] iArr, Drawable drawable, int i) {
        C1914 c1914 = this.f52126;
        int iM47127 = c1914.m47127(drawable);
        c1914.f14105[iM47127] = iArr;
        c1914.f6439.m8077(iM47127, Integer.valueOf(i));
        onStateChange(getState());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38244(int i, int i2, AnimationDrawable animationDrawable) {
        this.f52126.m6581(i, i2, animationDrawable, false);
    }

    @Override // l.C12354, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC17575 abstractC17575 = this.f52125;
        if (abstractC17575 != null) {
            abstractC17575.mo16629();
            this.f52125 = null;
            m30827(this.f52123);
            this.f52123 = -1;
            this.f52124 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    @Override // l.C14591, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iM30828;
        int iIntValue;
        int iIntValue2;
        AbstractC17575 c5643;
        C1914 c1914 = this.f52126;
        int iM13305 = c1914.m13305(iArr);
        if (iM13305 < 0) {
            iM13305 = c1914.m13305(StateSet.WILD_CARD);
        }
        boolean z = false;
        if (iM13305 != m30828()) {
            AbstractC17575 abstractC17575 = this.f52125;
            if (abstractC17575 != null) {
                if (iM13305 != this.f52123) {
                    if (iM13305 == this.f52124 && abstractC17575.mo41239()) {
                        abstractC17575.mo41240();
                        this.f52123 = this.f52124;
                        this.f52124 = iM13305;
                    } else {
                        iM30828 = this.f52123;
                        abstractC17575.mo16629();
                    }
                }
                z = true;
            } else {
                iM30828 = m30828();
            }
            this.f52125 = null;
            this.f52124 = -1;
            this.f52123 = -1;
            C1914 c1915 = this.f52126;
            if (iM30828 < 0) {
                c1915.getClass();
                iIntValue = 0;
            } else {
                C2375 c2375 = c1915.f6439;
                c2375.getClass();
                iIntValue = ((Integer) C8341.m22449(c2375, iM30828)).intValue();
            }
            if (iM13305 < 0) {
                iIntValue2 = 0;
            } else {
                C2375 c2376 = c1915.f6439;
                c2376.getClass();
                iIntValue2 = ((Integer) C8341.m22449(c2376, iM13305)).intValue();
            }
            if (iIntValue2 == 0 || iIntValue == 0) {
                if (m30827(iM13305)) {
                    z = true;
                }
            } else {
                long j = ((long) iIntValue2) | (((long) iIntValue) << 32);
                int iLongValue = (int) ((Long) c1915.f6440.m43579(j)).longValue();
                if (iLongValue < 0) {
                    if (m30827(iM13305)) {
                        z = true;
                    }
                } else {
                    boolean z2 = (((Long) c1915.f6440.m43579(j)).longValue() & 8589934592L) != 0;
                    m30827(iLongValue);
                    Object current = getCurrent();
                    if (current instanceof AnimationDrawable) {
                        c5643 = new C25035((AnimationDrawable) current, (((Long) c1915.f6440.m43579(j)).longValue() & Blake2xsDigest.MAX_NUMBER_BLOCKS) != 0, z2);
                    } else if (current instanceof C2370) {
                        c5643 = new C11608((C2370) current);
                    } else if (!(current instanceof Animatable)) {
                        if (m30827(iM13305)) {
                            z = true;
                        }
                    } else {
                        c5643 = new C5643((Animatable) current);
                    }
                    c5643.mo16628();
                    this.f52125 = c5643;
                    this.f52124 = iM30828;
                    this.f52123 = iM13305;
                    z = true;
                }
            }
        }
        Drawable current2 = getCurrent();
        return current2 != null ? current2.setState(iArr) | z : z;
    }

    public C16083(C1914 c1914, Resources resources) {
        this.f52123 = -1;
        this.f52124 = -1;
        mo30825(new C1914(c1914, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // l.C14591, l.C12354, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f52122) {
            super.mutate();
            this.f52126.mo6582();
            this.f52122 = true;
        }
        return this;
    }

    @Override // l.C12354
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20559 mo30823() {
        return new C1914(this.f52126, this, null);
    }

    @Override // l.C14591, l.C12354
    /* JADX INFO: renamed from: ۙ */
    public final void mo30825(AbstractC20559 abstractC20559) {
        super.mo30825(abstractC20559);
        if (abstractC20559 instanceof C1914) {
            this.f52126 = (C1914) abstractC20559;
        }
    }
}
