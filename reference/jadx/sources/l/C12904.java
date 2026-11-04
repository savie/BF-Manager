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

/* JADX INFO: renamed from: l.۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12904 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MotionEvent f41261;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8668 f41262;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f41263;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f41264;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public SparseArray f41265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f41266;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC2637 f41267;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SparseIntArray f41268;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15141 f41269;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f41270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21855 f41272;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f41273;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f41274;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f41275;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15141 f41276;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f41277;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f41278;

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31953(int i, int i2) {
        int iM23351;
        int iM23352;
        ArrayList arrayList;
        Iterator it;
        C15141 c15141;
        C15141 c15142;
        C15141 c15143;
        C8668 c8668 = this.f41262;
        if (c8668 != null) {
            iM23351 = c8668.m23351(i);
            if (iM23351 == -1) {
                iM23351 = i;
            }
            iM23352 = this.f41262.m23351(i2);
            if (iM23352 == -1) {
            }
            arrayList = this.f41274;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c15141 = this.f41269;
                    for (C15141 c15144 : this.f41263) {
                        if (c15144.f49407 == i2) {
                            c15141 = c15144;
                        }
                    }
                    c15142 = new C15141(this, c15141);
                    c15142.f49397 = iM23351;
                    c15142.f49407 = iM23352;
                    if (iM23351 != -1) {
                        arrayList.add(c15142);
                    }
                    this.f41276 = c15142;
                    return;
                }
                c15143 = (C15141) it.next();
                if ((c15143.f49407 != iM23352 && c15143.f49397 == iM23351) || (c15143.f49407 == i2 && c15143.f49397 == i)) {
                    break;
                }
            }
            this.f41276 = c15143;
            if (c15143.f49406 != null) {
                this.f41276.f49406.m37432(this.f41277);
            }
        }
        iM23351 = i;
        iM23352 = i2;
        arrayList = this.f41274;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c15141 = this.f41269;
                while (r8.hasNext()) {
                    if (c15144.f49407 == i2) {
                        c15141 = c15144;
                    }
                }
                c15142 = new C15141(this, c15141);
                c15142.f49397 = iM23351;
                c15142.f49407 = iM23352;
                if (iM23351 != -1) {
                    arrayList.add(c15142);
                }
                this.f41276 = c15142;
                return;
            }
            c15143 = (C15141) it.next();
            if (c15143.f49407 != iM23352) {
            }
        }
        this.f41276 = c15143;
        if (c15143.f49406 != null) {
            this.f41276.f49406.m37432(this.f41277);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31955(C15141 c15141) {
        this.f41276 = c15141;
        if (c15141.f49406 != null) {
            this.f41276.f49406.m37432(this.f41277);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31958(C21855 c21855, int i) {
        View viewFindViewById;
        View viewFindViewById2;
        ArrayList<C15141> arrayList = this.f41274;
        for (C15141 c15141 : arrayList) {
            if (c15141.f49402.size() > 0) {
                Iterator it = c15141.f49402.iterator();
                while (it.hasNext()) {
                    int i2 = ((ViewOnClickListenerC19617) it.next()).f63231;
                    if (i2 != -1 && (viewFindViewById2 = c21855.findViewById(i2)) != null) {
                        viewFindViewById2.setOnClickListener(null);
                    }
                }
            }
        }
        ArrayList<C15141> arrayList2 = this.f41263;
        for (C15141 c15142 : arrayList2) {
            if (c15142.f49402.size() > 0) {
                Iterator it2 = c15142.f49402.iterator();
                while (it2.hasNext()) {
                    int i3 = ((ViewOnClickListenerC19617) it2.next()).f63231;
                    if (i3 != -1 && (viewFindViewById = c21855.findViewById(i3)) != null) {
                        viewFindViewById.setOnClickListener(null);
                    }
                }
            }
        }
        for (C15141 c15143 : arrayList) {
            if (c15143.f49402.size() > 0) {
                Iterator it3 = c15143.f49402.iterator();
                while (it3.hasNext()) {
                    ((ViewOnClickListenerC19617) it3.next()).m45268(c21855, i, c15143);
                }
            }
        }
        for (C15141 c15144 : arrayList2) {
            if (c15144.f49402.size() > 0) {
                Iterator it4 = c15144.f49402.iterator();
                while (it4.hasNext()) {
                    ((ViewOnClickListenerC19617) it4.next()).m45268(c21855, i, c15144);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m31951() {
        return this.f41274;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31964(C21855 c21855, int i) {
        if (this.f41267 != null) {
            return false;
        }
        for (C15141 c15141 : this.f41274) {
            if (c15141.f49395 != 0 && this.f41276 != c15141) {
                if (i == c15141.f49397 && (c15141.f49395 == 4 || c15141.f49395 == 2)) {
                    EnumC4701 enumC4701 = EnumC4701.FINISHED;
                    c21855.m49547(enumC4701);
                    c21855.m49548(c15141);
                    if (c15141.f49395 != 4) {
                        c21855.m49554(1.0f);
                        c21855.m49550(true);
                        c21855.m49547(EnumC4701.SETUP);
                        c21855.m49547(EnumC4701.MOVING);
                        c21855.m49547(enumC4701);
                        c21855.m49552();
                        return true;
                    }
                    c21855.m49541(1.0f);
                    c21855.m49547(EnumC4701.SETUP);
                    c21855.m49547(EnumC4701.MOVING);
                    return true;
                }
                if (i == c15141.f49407 && (c15141.f49395 == 3 || c15141.f49395 == 1)) {
                    EnumC4701 enumC4702 = EnumC4701.FINISHED;
                    c21855.m49547(enumC4702);
                    c21855.m49548(c15141);
                    if (c15141.f49395 != 3) {
                        c21855.m49554(0.0f);
                        c21855.m49550(true);
                        c21855.m49547(EnumC4701.SETUP);
                        c21855.m49547(EnumC4701.MOVING);
                        c21855.m49547(enumC4702);
                        c21855.m49552();
                        return true;
                    }
                    c21855.m49541(0.0f);
                    c21855.m49547(EnumC4701.SETUP);
                    c21855.m49547(EnumC4701.MOVING);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31959(boolean z) {
        this.f41277 = z;
        C15141 c15141 = this.f41276;
        if (c15141 == null || c15141.f49406 == null) {
            return;
        }
        this.f41276.f49406.m37432(this.f41277);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C12904(Context context, C21855 c21855, int i) {
        C15141 c15141 = null;
        this.f41262 = null;
        this.f41276 = null;
        ArrayList arrayList = new ArrayList();
        this.f41274 = arrayList;
        this.f41269 = null;
        this.f41263 = new ArrayList();
        this.f41265 = new SparseArray();
        this.f41275 = new HashMap();
        this.f41268 = new SparseIntArray();
        this.f41273 = 400;
        this.f41271 = 0;
        this.f41264 = false;
        this.f41270 = false;
        this.f41272 = c21855;
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
                                m31945(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c15141.f49410.add(new C16061(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals(AbstractC0329.LOG_TAG)) {
                                c15141 = new C15141(this, context, xml);
                                arrayList.add(c15141);
                                if (this.f41276 == null && !c15141.f49398) {
                                    this.f41276 = c15141;
                                    if (c15141.f49406 != null) {
                                        this.f41276.f49406.m37432(this.f41277);
                                    }
                                }
                                if (c15141.f49398) {
                                    if (c15141.f49407 == -1) {
                                        this.f41269 = c15141;
                                    } else {
                                        this.f41263.add(c15141);
                                    }
                                    arrayList.remove(c15141);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c15141.m36435(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c15141 == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c15141.f49406 = new C15666(context, this.f41272, xml);
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m31949(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f41262 = new C8668(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f41265.put(R.id.MT_Protector, new C4194());
        this.f41275.put("motion_base", Integer.valueOf(R.id.MT_Protector));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31949(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4437);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f41273 = typedArrayObtainStyledAttributes.getInt(index, this.f41273);
            } else if (index == 1) {
                this.f41271 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m31943(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31945(Context context, XmlResourceParser xmlResourceParser) {
        C4194 c4194 = new C4194();
        c4194.m13401();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM31943 = -1;
        int iM31944 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM31944 = m31943(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iM31943 = m31943(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f41275.put(attributeValue, Integer.valueOf(iM31943));
            }
        }
        if (iM31943 != -1) {
            int i2 = this.f41272.f69644;
            c4194.m13389(context, xmlResourceParser);
            if (iM31944 != -1) {
                this.f41268.put(iM31943, iM31944);
            }
            this.f41265.put(iM31943, c4194);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4194 m31952(int i) {
        int iM23351;
        C8668 c8668 = this.f41262;
        if (c8668 != null && (iM23351 = c8668.m23351(i)) != -1) {
            i = iM23351;
        }
        SparseArray sparseArray = this.f41265;
        if (sparseArray.get(i) == null) {
            C18540.m43116(this.f41272.getContext(), i);
            return (C4194) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C4194) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31956(C21283 c21283) {
        C15141 c15141 = this.f41276;
        if (c15141 != null) {
            Iterator it = c15141.f49410.iterator();
            while (it.hasNext()) {
                ((C16061) it.next()).m38219(c21283);
            }
        } else {
            C15141 c15142 = this.f41269;
            if (c15142 != null) {
                Iterator it2 = c15142.f49410.iterator();
                while (it2.hasNext()) {
                    ((C16061) it2.next()).m38219(c21283);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31961() {
        Iterator it = this.f41274.iterator();
        while (it.hasNext()) {
            if (((C15141) it.next()).f49406 != null) {
                return true;
            }
        }
        C15141 c15141 = this.f41276;
        return (c15141 == null || c15141.f49406 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31954(MotionEvent motionEvent, int i, C21855 c21855) {
        InterfaceC2637 interfaceC2637;
        InterfaceC2637 interfaceC2638;
        MotionEvent motionEvent2;
        C15141 c15141;
        int iM23351;
        Iterator it;
        RectF rectF = new RectF();
        InterfaceC2637 interfaceC2639 = this.f41267;
        C21855 c21856 = this.f41272;
        if (interfaceC2639 == null) {
            c21856.getClass();
            this.f41267 = C8603.m23115();
        }
        VelocityTracker velocityTracker = ((C8603) this.f41267).f28101;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f41266 = motionEvent.getRawX();
                this.f41278 = motionEvent.getRawY();
                this.f41261 = motionEvent;
                this.f41264 = false;
                if (this.f41276.f49406 != null) {
                    RectF rectFM37430 = this.f41276.f49406.m37430(c21856, rectF);
                    if (rectFM37430 == null || rectFM37430.contains(this.f41261.getX(), this.f41261.getY())) {
                        RectF rectFM37441 = this.f41276.f49406.m37441(c21856, rectF);
                        if (rectFM37441 != null && !rectFM37441.contains(this.f41261.getX(), this.f41261.getY())) {
                            this.f41270 = true;
                        } else {
                            this.f41270 = false;
                        }
                        this.f41276.f49406.m37438(this.f41266, this.f41278);
                        return;
                    }
                    this.f41261 = null;
                    this.f41264 = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.f41264) {
                float rawY = motionEvent.getRawY() - this.f41278;
                float rawX = motionEvent.getRawX() - this.f41266;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f41261) == null) {
                    return;
                }
                if (i != -1) {
                    C8668 c8668 = this.f41262;
                    if (c8668 == null || (iM23351 = c8668.m23351(i)) == -1) {
                        iM23351 = i;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C15141 c15142 : this.f41274) {
                        if (c15142.f49397 == iM23351 || c15142.f49407 == iM23351) {
                            arrayList.add(c15142);
                        }
                    }
                    RectF rectF2 = new RectF();
                    Iterator it2 = arrayList.iterator();
                    float f = 0.0f;
                    c15141 = null;
                    while (it2.hasNext()) {
                        C15141 c15143 = (C15141) it2.next();
                        if (c15143.f49400 || c15143.f49406 == null) {
                            it = it2;
                        } else {
                            c15143.f49406.m37432(this.f41277);
                            RectF rectFM37442 = c15143.f49406.m37441(c21856, rectF2);
                            if (rectFM37442 != null) {
                                it = it2;
                                if (!rectFM37442.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                }
                            } else {
                                it = it2;
                            }
                            RectF rectFM37443 = c15143.f49406.m37441(c21856, rectF2);
                            if (rectFM37443 == null || rectFM37443.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                float fM37428 = c15143.f49406.m37428(rawX, rawY) * (c15143.f49407 == i ? -1.0f : 1.1f);
                                if (fM37428 > f) {
                                    f = fM37428;
                                    c15141 = c15143;
                                }
                            }
                        }
                        it2 = it;
                    }
                } else {
                    c15141 = this.f41276;
                }
                if (c15141 != null) {
                    c21855.m49548(c15141);
                    RectF rectFM37444 = this.f41276.f49406.m37441(c21856, rectF);
                    this.f41270 = (rectFM37444 == null || rectFM37444.contains(this.f41261.getX(), this.f41261.getY())) ? false : true;
                    this.f41276.f49406.m37436(this.f41266, this.f41278);
                }
            }
        }
        if (this.f41264) {
            return;
        }
        C15141 c15144 = this.f41276;
        if (c15144 != null && c15144.f49406 != null && !this.f41270) {
            this.f41276.f49406.m37431(motionEvent, this.f41267);
        }
        this.f41266 = motionEvent.getRawX();
        this.f41278 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC2637 = this.f41267) == null) {
            return;
        }
        C8603 c8603 = (C8603) interfaceC2637;
        VelocityTracker velocityTracker2 = c8603.f28101;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            interfaceC2638 = null;
            c8603.f28101 = null;
        } else {
            interfaceC2638 = null;
        }
        this.f41267 = interfaceC2638;
        int i2 = c21855.f69627;
        if (i2 != -1) {
            m31964(c21855, i2);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m31962() {
        C15141 c15141 = this.f41276;
        if (c15141 == null) {
            return -1;
        }
        return c15141.f49397;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Interpolator m31960() {
        int i = this.f41276.f49408;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f41272.getContext(), this.f41276.f49405);
        }
        if (i == -1) {
            return new InterpolatorC22601(C12573.m31287(this.f41276.f49401));
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31963() {
        C15141 c15141 = this.f41276;
        if (c15141 != null) {
            return c15141.f49396;
        }
        return this.f41273;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m31965() {
        C15141 c15141 = this.f41276;
        if (c15141 == null || c15141.f49406 == null) {
            return 0.0f;
        }
        return this.f41276.f49406.m37439();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31957(C21855 c21855) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f41265;
            if (i < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.f41268;
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
                m31948(iKeyAt);
                i++;
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ((C4194) sparseArray.valueAt(i4)).m13403(c21855);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31948(int i) {
        SparseIntArray sparseIntArray = this.f41268;
        int i2 = sparseIntArray.get(i);
        if (i2 > 0) {
            m31948(sparseIntArray.get(i));
            SparseArray sparseArray = this.f41265;
            C4194 c4194 = (C4194) sparseArray.get(i);
            C4194 c4195 = (C4194) sparseArray.get(i2);
            if (c4195 == null) {
                C18540.m43116(this.f41272.getContext(), i2);
            } else {
                c4194.m13390(c4195);
                sparseIntArray.put(i, -1);
            }
        }
    }
}
