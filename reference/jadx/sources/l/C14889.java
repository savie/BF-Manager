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

/* JADX INFO: renamed from: l.ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C14889 extends C7127 implements InterfaceC17480 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C0776 f48648;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22650 f48649;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f48650;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f48647 = -1;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f48651 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14889 m35585(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        Drawable drawableM13329;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            C14889 c14889 = new C14889(null, null);
            TypedArray typedArrayM30834 = C12398.m30834(resources2, theme2, attributeSet2, C15595.f50714);
            int i = 1;
            c14889.setVisible(typedArrayM30834.getBoolean(1, true), true);
            C0776 c0776 = c14889.f48648;
            c0776.f58698 |= C20533.m46313(typedArrayM30834);
            int i2 = 2;
            c0776.f58695 = typedArrayM30834.getBoolean(2, c0776.f58695);
            int i3 = 3;
            c0776.f58708 = typedArrayM30834.getBoolean(3, c0776.f58708);
            int i4 = 4;
            c0776.f58711 = typedArrayM30834.getInt(4, c0776.f58711);
            c0776.f58704 = typedArrayM30834.getInt(5, c0776.f58704);
            boolean z = false;
            c14889.setDither(typedArrayM30834.getBoolean(0, c0776.f58694));
            c14889.m20662(resources2);
            typedArrayM30834.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                    break;
                }
                if (next3 == i2 && depth <= depth2) {
                    if (!xmlResourceParser.getName().equals("item")) {
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray typedArrayM30835 = C12398.m30834(resources2, theme2, attributeSet2, C15595.f50715);
                            int resourceId = typedArrayM30835.getResourceId(2, -1);
                            int resourceId2 = typedArrayM30835.getResourceId(1, -1);
                            int resourceId3 = typedArrayM30835.getResourceId(z ? 1 : 0, -1);
                            drawableM13329 = resourceId3 > 0 ? C4800.m13323().m13329(context2, resourceId3) : null;
                            boolean z2 = typedArrayM30835.getBoolean(3, z);
                            typedArrayM30835.recycle();
                            if (drawableM13329 == null) {
                                do {
                                    next = xmlResourceParser.next();
                                } while (next == i4);
                                if (next != 2) {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                                if (xmlResourceParser.getName().equals("animated-vector")) {
                                    drawableM13329 = C3631.m10733(context, resources, xmlResourceParser, attributeSet, theme);
                                } else {
                                    drawableM13329 = C20533.m46314(resources, xmlResourceParser, attributeSet, theme);
                                }
                            }
                            if (drawableM13329 == null) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (resourceId == -1 || resourceId2 == -1) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                            }
                            C0776 c0777 = c14889.f48648;
                            int iM42702 = c0777.m42702(drawableM13329);
                            long j = resourceId;
                            long j2 = resourceId2;
                            long j3 = (j << 32) | j2;
                            long j4 = z2 ? 8589934592L : 0L;
                            long j5 = iM42702;
                            c0777.f3355.m22705(j3, Long.valueOf(j5 | j4));
                            if (z2) {
                                c0777.f3355.m22705((j2 << 32) | j, Long.valueOf(j5 | Blake2xsDigest.MAX_NUMBER_BLOCKS | j4));
                            }
                            i = 1;
                            z = false;
                            i2 = 2;
                            i3 = 3;
                            i4 = 4;
                        }
                        context2 = context;
                        resources2 = resources;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                    } else {
                        TypedArray typedArrayM30836 = C12398.m30834(resources2, theme2, attributeSet2, C15595.f50716);
                        int resourceId4 = typedArrayM30836.getResourceId(z ? 1 : 0, z ? 1 : 0);
                        int resourceId5 = typedArrayM30836.getResourceId(i, -1);
                        drawableM13329 = resourceId5 > 0 ? C4800.m13323().m13329(context2, resourceId5) : null;
                        typedArrayM30836.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i5 = 0;
                        for (int i6 = 0; i6 < attributeCount; i6++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i7 = i5 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i6, z)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i5] = attributeNameResource;
                                i5 = i7;
                            }
                        }
                        int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i5);
                        if (drawableM13329 == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == i4);
                            if (next2 != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("vector")) {
                                drawableM13329 = C19861.m45106(resources, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableM13329 = C20533.m46314(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM13329 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        C0776 c0778 = c14889.f48648;
                        int iM42703 = c0778.m42702(drawableM13329);
                        c0778.f34010[iM42703] = iArrTrimStateSet;
                        c0778.f3354.m40149(iM42703, Integer.valueOf(resourceId4));
                    }
                    i = 1;
                    i2 = 2;
                    i3 = 3;
                    context2 = context;
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                }
            }
            c14889.onStateChange(c14889.getState());
            return c14889;
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // l.C7833, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC22650 abstractC22650 = this.f48649;
        if (abstractC22650 != null && (visible || z2)) {
            if (z) {
                abstractC22650.mo10675();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // l.C7833, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC22650 abstractC22650 = this.f48649;
        if (abstractC22650 != null) {
            abstractC22650.mo10673();
            this.f48649 = null;
            m20664(this.f48647);
            this.f48647 = -1;
            this.f48651 = -1;
        }
    }

    public C14889(C0776 c0776, Resources resources) {
        mo19029(new C0776(c0776, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // l.C7127, l.C7833, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f48650) {
            super.mutate();
            this.f48648.mo3328();
            this.f48650 = true;
        }
        return this;
    }

    @Override // l.C7833
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18416 mo20661() {
        return new C0776(this.f48648, this, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    @Override // l.C7127, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iM20665;
        int iIntValue;
        AbstractC22650 c21944;
        boolean z = false;
        C0776 c0776 = this.f48648;
        int iM25175 = c0776.m25175(iArr);
        if (iM25175 < 0) {
            iM25175 = c0776.m25175(StateSet.WILD_CARD);
        }
        if (iM25175 != m20665()) {
            AbstractC22650 abstractC22650 = this.f48649;
            if (abstractC22650 != null) {
                if (iM25175 != this.f48647) {
                    if (iM25175 == this.f48651 && abstractC22650.mo10674()) {
                        abstractC22650.mo10676();
                        this.f48647 = this.f48651;
                        this.f48651 = iM25175;
                    } else {
                        iM20665 = this.f48647;
                        abstractC22650.mo10673();
                    }
                }
                z = true;
            } else {
                iM20665 = m20665();
            }
            this.f48649 = null;
            this.f48651 = -1;
            this.f48647 = -1;
            C0776 c0777 = this.f48648;
            if (iM20665 < 0) {
                c0777.getClass();
                iIntValue = 0;
            } else {
                iIntValue = ((Integer) c0777.f3354.m40144(iM20665, (Integer) 0)).intValue();
            }
            int iIntValue2 = iM25175 < 0 ? 0 : ((Integer) c0777.f3354.m40144(iM25175, (Integer) 0)).intValue();
            if (iIntValue2 == 0 || iIntValue == 0) {
                if (m20664(iM25175)) {
                    z = true;
                }
            } else {
                long j = (((long) iIntValue) << 32) | ((long) iIntValue2);
                int iLongValue = (int) ((Long) c0777.f3355.m22709(j, -1L)).longValue();
                if (iLongValue < 0) {
                    if (m20664(iM25175)) {
                        z = true;
                    }
                } else {
                    boolean z2 = (((Long) c0777.f3355.m22709(j, -1L)).longValue() & 8589934592L) != 0;
                    m20664(iLongValue);
                    Object current = getCurrent();
                    if (current instanceof AnimationDrawable) {
                        c21944 = new C3598((AnimationDrawable) current, (((Long) c0777.f3355.m22709(j, -1L)).longValue() & Blake2xsDigest.MAX_NUMBER_BLOCKS) != 0, z2);
                    } else if (current instanceof C3631) {
                        c21944 = new C12772((C3631) current);
                    } else if (!(current instanceof Animatable)) {
                        if (m20664(iM25175)) {
                            z = true;
                        }
                    } else {
                        c21944 = new C21944((Animatable) current);
                    }
                    c21944.mo10675();
                    this.f48649 = c21944;
                    this.f48651 = iM20665;
                    this.f48647 = iM25175;
                    z = true;
                }
            }
        }
        Drawable current2 = getCurrent();
        return current2 != null ? current2.setState(iArr) | z : z;
    }

    @Override // l.C7127, l.C7833
    /* JADX INFO: renamed from: ۙ */
    public final void mo19029(AbstractC18416 abstractC18416) {
        super.mo19029(abstractC18416);
        if (abstractC18416 instanceof C0776) {
            this.f48648 = (C0776) abstractC18416;
        }
    }
}
