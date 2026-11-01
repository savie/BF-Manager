package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3121 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public SparseIntArray f11763;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9473 f11764;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public MotionEvent f11765;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f11766;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f11767;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f11768;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C16734 f11769;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC0299 f11770;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SparseArray f11771;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f11772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f11773;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11774;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f11775;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f11776;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f11777;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10884 f11778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9473 f11779;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f11780;

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9408(int i, int i2) {
        int iM39250;
        int iM39251;
        ArrayList arrayList;
        Iterator it;
        C9473 c9473;
        C9473 c9474;
        C9473 c9475;
        C16734 c16734 = this.f11769;
        if (c16734 != null) {
            iM39250 = c16734.m39250(i);
            if (iM39250 == -1) {
                iM39250 = i;
            }
            iM39251 = this.f11769.m39250(i2);
            if (iM39251 == -1) {
            }
            arrayList = this.f11777;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c9473 = this.f11779;
                    for (C9473 c9476 : this.f11766) {
                        if (c9476.f32053 == i2) {
                            c9473 = c9476;
                        }
                    }
                    c9474 = new C9473(this, c9473);
                    c9474.f32051 = iM39250;
                    c9474.f32053 = iM39251;
                    if (iM39250 != -1) {
                        arrayList.add(c9474);
                    }
                    this.f11764 = c9474;
                    return;
                }
                c9475 = (C9473) it.next();
                if ((c9475.f32053 != iM39251 && c9475.f32051 == iM39250) || (c9475.f32053 == i2 && c9475.f32051 == i)) {
                    break;
                }
            }
            this.f11764 = c9475;
            if (c9475.f32057 != null) {
                this.f11764.f32057.m24354(this.f11776);
            }
        }
        iM39250 = i;
        iM39251 = i2;
        arrayList = this.f11777;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c9473 = this.f11779;
                while (r8.hasNext()) {
                    if (c9476.f32053 == i2) {
                        c9473 = c9476;
                    }
                }
                c9474 = new C9473(this, c9473);
                c9474.f32051 = iM39250;
                c9474.f32053 = iM39251;
                if (iM39250 != -1) {
                    arrayList.add(c9474);
                }
                this.f11764 = c9474;
                return;
            }
            c9475 = (C9473) it.next();
            if (c9475.f32053 != iM39251) {
            }
        }
        this.f11764 = c9475;
        if (c9475.f32057 != null) {
            this.f11764.f32057.m24354(this.f11776);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9411(C9473 c9473) {
        this.f11764 = c9473;
        if (c9473.f32057 != null) {
            this.f11764.f32057.m24354(this.f11776);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9413(C10884 c10884, int i) {
        View viewFindViewById;
        View viewFindViewById2;
        ArrayList<C9473> arrayList = this.f11777;
        for (C9473 c9473 : arrayList) {
            if (c9473.f32055.size() > 0) {
                Iterator it = c9473.f32055.iterator();
                while (it.hasNext()) {
                    int i2 = ((ViewOnClickListenerC1710) it.next()).f6760;
                    if (i2 != -1 && (viewFindViewById2 = c10884.findViewById(i2)) != null) {
                        viewFindViewById2.setOnClickListener(null);
                    }
                }
            }
        }
        ArrayList<C9473> arrayList2 = this.f11766;
        for (C9473 c9474 : arrayList2) {
            if (c9474.f32055.size() > 0) {
                Iterator it2 = c9474.f32055.iterator();
                while (it2.hasNext()) {
                    int i3 = ((ViewOnClickListenerC1710) it2.next()).f6760;
                    if (i3 != -1 && (viewFindViewById = c10884.findViewById(i3)) != null) {
                        viewFindViewById.setOnClickListener(null);
                    }
                }
            }
        }
        for (C9473 c9475 : arrayList) {
            if (c9475.f32055.size() > 0) {
                Iterator it3 = c9475.f32055.iterator();
                while (it3.hasNext()) {
                    ((ViewOnClickListenerC1710) it3.next()).m5698(c10884, i, c9475);
                }
            }
        }
        for (C9473 c9476 : arrayList2) {
            if (c9476.f32055.size() > 0) {
                Iterator it4 = c9476.f32055.iterator();
                while (it4.hasNext()) {
                    ((ViewOnClickListenerC1710) it4.next()).m5698(c10884, i, c9476);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9406() {
        return this.f11777;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m9418(C10884 c10884, int i) {
        if (this.f11770 != null) {
            return false;
        }
        for (C9473 c9473 : this.f11777) {
            if (c9473.f32046 != 0 && this.f11764 != c9473) {
                if (i == c9473.f32051 && (c9473.f32046 == 4 || c9473.f32046 == 2)) {
                    EnumC5944 enumC5944 = EnumC5944.FINISHED;
                    c10884.m27282(enumC5944);
                    c10884.m27283(c9473);
                    if (c9473.f32046 != 4) {
                        c10884.m27289(1.0f);
                        c10884.m27285(true);
                        c10884.m27282(EnumC5944.SETUP);
                        c10884.m27282(EnumC5944.MOVING);
                        c10884.m27282(enumC5944);
                        c10884.m27286();
                        return true;
                    }
                    c10884.m27276(1.0f);
                    c10884.m27282(EnumC5944.SETUP);
                    c10884.m27282(EnumC5944.MOVING);
                    return true;
                }
                if (i == c9473.f32053 && (c9473.f32046 == 3 || c9473.f32046 == 1)) {
                    EnumC5944 enumC5945 = EnumC5944.FINISHED;
                    c10884.m27282(enumC5945);
                    c10884.m27283(c9473);
                    if (c9473.f32046 != 3) {
                        c10884.m27289(0.0f);
                        c10884.m27285(true);
                        c10884.m27282(EnumC5944.SETUP);
                        c10884.m27282(EnumC5944.MOVING);
                        c10884.m27282(enumC5945);
                        c10884.m27286();
                        return true;
                    }
                    c10884.m27276(0.0f);
                    c10884.m27282(EnumC5944.SETUP);
                    c10884.m27282(EnumC5944.MOVING);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9414(boolean z) {
        this.f11776 = z;
        C9473 c9473 = this.f11764;
        if (c9473 == null || c9473.f32057 == null) {
            return;
        }
        this.f11764.f32057.m24354(this.f11776);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C3121(Context context, C10884 c10884, int i) {
        C9473 c9473 = null;
        this.f11769 = null;
        this.f11764 = null;
        ArrayList arrayList = new ArrayList();
        this.f11777 = arrayList;
        this.f11779 = null;
        this.f11766 = new ArrayList();
        this.f11771 = new SparseArray();
        this.f11773 = new HashMap();
        this.f11763 = new SparseIntArray();
        this.f11767 = 400;
        this.f11774 = 0;
        this.f11772 = false;
        this.f11775 = false;
        this.f11778 = c10884;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m9400(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c9473.f32060.add(new C1004(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals(AbstractC11766.LOG_TAG)) {
                                c9473 = new C9473(this, context, xml);
                                arrayList.add(c9473);
                                if (this.f11764 == null && !c9473.f32048) {
                                    this.f11764 = c9473;
                                    if (c9473.f32057 != null) {
                                        this.f11764.f32057.m24354(this.f11776);
                                    }
                                }
                                if (c9473.f32048) {
                                    if (c9473.f32053 == -1) {
                                        this.f11779 = c9473;
                                    } else {
                                        this.f11766.add(c9473);
                                    }
                                    arrayList.remove(c9473);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c9473.m24277(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c9473 == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c9473.f32057 = new C9514(context, this.f11778, xml);
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m9404(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f11769 = new C16734(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f11771.put(R.id.MT_Protector, new C18144());
        this.f11773.put("motion_base", Integer.valueOf(R.id.MT_Protector));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9404(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51896);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f11767 = typedArrayObtainStyledAttributes.getInt(index, this.f11767);
            } else if (index == 1) {
                this.f11774 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m9398(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9400(Context context, XmlResourceParser xmlResourceParser) {
        C18144 c18144 = new C18144();
        c18144.m42255();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM9398 = -1;
        int iM9399 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM9399 = m9398(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iM9398 = m9398(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f11773.put(attributeValue, Integer.valueOf(iM9398));
            }
        }
        if (iM9398 != -1) {
            int i2 = this.f11778.f37029;
            c18144.m42244(context, xmlResourceParser);
            if (iM9399 != -1) {
                this.f11763.put(iM9398, iM9399);
            }
            this.f11771.put(iM9398, c18144);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18144 m9407(int i) {
        int iM39250;
        C16734 c16734 = this.f11769;
        if (c16734 != null && (iM39250 = c16734.m39250(i)) != -1) {
            i = iM39250;
        }
        SparseArray sparseArray = this.f11771;
        if (sparseArray.get(i) == null) {
            C19660.m44788(this.f11778.getContext(), i);
            return (C18144) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C18144) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9410(C8061 c8061) {
        C9473 c9473 = this.f11764;
        if (c9473 != null) {
            Iterator it = c9473.f32060.iterator();
            while (it.hasNext()) {
                ((C1004) it.next()).m3833(c8061);
            }
        } else {
            C9473 c9474 = this.f11779;
            if (c9474 != null) {
                Iterator it2 = c9474.f32060.iterator();
                while (it2.hasNext()) {
                    ((C1004) it2.next()).m3833(c8061);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m9419() {
        Iterator it = this.f11777.iterator();
        while (it.hasNext()) {
            if (((C9473) it.next()).f32057 != null) {
                return true;
            }
        }
        C9473 c9473 = this.f11764;
        return (c9473 == null || c9473.f32057 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9409(MotionEvent motionEvent, int i, C10884 c10884) {
        InterfaceC0299 interfaceC0299;
        InterfaceC0299 interfaceC02910;
        MotionEvent motionEvent2;
        C9473 c9473;
        int iM39250;
        Iterator it;
        RectF rectF = new RectF();
        InterfaceC0299 interfaceC02911 = this.f11770;
        C10884 c10885 = this.f11778;
        if (interfaceC02911 == null) {
            c10885.getClass();
            this.f11770 = C16528.m38900();
        }
        VelocityTracker velocityTracker = ((C16528) this.f11770).f53100;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f11768 = motionEvent.getRawX();
                this.f11780 = motionEvent.getRawY();
                this.f11765 = motionEvent;
                this.f11772 = false;
                if (this.f11764.f32057 != null) {
                    RectF rectFM24352 = this.f11764.f32057.m24352(c10885, rectF);
                    if (rectFM24352 == null || rectFM24352.contains(this.f11765.getX(), this.f11765.getY())) {
                        RectF rectFM24361 = this.f11764.f32057.m24361(c10885, rectF);
                        if (rectFM24361 != null && !rectFM24361.contains(this.f11765.getX(), this.f11765.getY())) {
                            this.f11775 = true;
                        } else {
                            this.f11775 = false;
                        }
                        this.f11764.f32057.m24356(this.f11768, this.f11780);
                        return;
                    }
                    this.f11765 = null;
                    this.f11772 = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.f11772) {
                float rawY = motionEvent.getRawY() - this.f11780;
                float rawX = motionEvent.getRawX() - this.f11768;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f11765) == null) {
                    return;
                }
                if (i != -1) {
                    C16734 c16734 = this.f11769;
                    if (c16734 == null || (iM39250 = c16734.m39250(i)) == -1) {
                        iM39250 = i;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C9473 c9474 : this.f11777) {
                        if (c9474.f32051 == iM39250 || c9474.f32053 == iM39250) {
                            arrayList.add(c9474);
                        }
                    }
                    RectF rectF2 = new RectF();
                    Iterator it2 = arrayList.iterator();
                    float f = 0.0f;
                    c9473 = null;
                    while (it2.hasNext()) {
                        C9473 c9475 = (C9473) it2.next();
                        if (c9475.f32043 || c9475.f32057 == null) {
                            it = it2;
                        } else {
                            c9475.f32057.m24354(this.f11776);
                            RectF rectFM24362 = c9475.f32057.m24361(c10885, rectF2);
                            if (rectFM24362 != null) {
                                it = it2;
                                if (!rectFM24362.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                }
                            } else {
                                it = it2;
                            }
                            RectF rectFM24363 = c9475.f32057.m24361(c10885, rectF2);
                            if (rectFM24363 == null || rectFM24363.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                float fM24350 = c9475.f32057.m24350(rawX, rawY) * (c9475.f32053 == i ? -1.0f : 1.1f);
                                if (fM24350 > f) {
                                    f = fM24350;
                                    c9473 = c9475;
                                }
                            }
                        }
                        it2 = it;
                    }
                } else {
                    c9473 = this.f11764;
                }
                if (c9473 != null) {
                    c10884.m27283(c9473);
                    RectF rectFM24364 = this.f11764.f32057.m24361(c10885, rectF);
                    this.f11775 = (rectFM24364 == null || rectFM24364.contains(this.f11765.getX(), this.f11765.getY())) ? false : true;
                    this.f11764.f32057.m24363(this.f11768, this.f11780);
                }
            }
        }
        if (this.f11772) {
            return;
        }
        C9473 c9476 = this.f11764;
        if (c9476 != null && c9476.f32057 != null && !this.f11775) {
            this.f11764.f32057.m24353(motionEvent, this.f11770);
        }
        this.f11768 = motionEvent.getRawX();
        this.f11780 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC0299 = this.f11770) == null) {
            return;
        }
        C16528 c16528 = (C16528) interfaceC0299;
        VelocityTracker velocityTracker2 = c16528.f53100;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            interfaceC02910 = null;
            c16528.f53100 = null;
        } else {
            interfaceC02910 = null;
        }
        this.f11770 = interfaceC02910;
        int i2 = c10884.f37040;
        if (i2 != -1) {
            m9418(c10884, i2);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m9415() {
        C9473 c9473 = this.f11764;
        if (c9473 == null) {
            return -1;
        }
        return c9473.f32051;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Interpolator m9416() {
        int i = this.f11764.f32044;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f11778.getContext(), this.f11764.f32047);
        }
        if (i == -1) {
            return new InterpolatorC14412(C23188.m51213(this.f11764.f32059));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m9417() {
        C9473 c9473 = this.f11764;
        if (c9473 != null) {
            return c9473.f32052;
        }
        return this.f11767;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m9405() {
        C9473 c9473 = this.f11764;
        if (c9473 == null || c9473.f32057 == null) {
            return 0.0f;
        }
        return this.f11764.f32057.m24359();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9412(C10884 c10884) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f11771;
            if (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.f11763;
                int i2 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i2 > 0) {
                    if (i2 == iKeyAt) {
                        return;
                    }
                    int i3 = size - 1;
                    if (size < 0) {
                        return;
                    }
                    i2 = sparseIntArray.get(i2);
                    size = i3;
                }
                m9403(iKeyAt);
                i++;
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ((C18144) sparseArray.valueAt(i4)).m42257(c10884);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9403(int i) {
        SparseIntArray sparseIntArray = this.f11763;
        int i2 = sparseIntArray.get(i);
        if (i2 > 0) {
            m9403(sparseIntArray.get(i));
            SparseArray sparseArray = this.f11771;
            C18144 c18144 = (C18144) sparseArray.get(i);
            C18144 c18145 = (C18144) sparseArray.get(i2);
            if (c18145 == null) {
                C19660.m44788(this.f11778.getContext(), i2);
            } else {
                c18144.m42249(c18145);
                sparseIntArray.put(i, -1);
            }
        }
    }
}
