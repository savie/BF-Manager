package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15141 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49393;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f49394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49395;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49398;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49399;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f49400;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f49401;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f49402;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49403;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12904 f49404;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f49405;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C15666 f49406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f49407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49409;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f49410;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36436() {
        return this.f49403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36435(Context context, XmlResourceParser xmlResourceParser) {
        this.f49402.add(new ViewOnClickListenerC19617(context, this, xmlResourceParser));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36433() {
        return this.f49395;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36440() {
        return this.f49407;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m36441() {
        return this.f49397;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15666 m36439() {
        return this.f49406;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36438() {
        return !this.f49400;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36434(Context context) {
        if (this.f49397 != -1) {
            context.getResources().getResourceEntryName(this.f49397);
        }
        if (this.f49407 == -1) {
            return;
        }
        context.getResources().getResourceEntryName(this.f49407);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m36437() {
        return (this.f49399 & 1) != 0;
    }

    public C15141(C12904 c12904, C15141 c15141) {
        this.f49393 = -1;
        this.f49398 = false;
        this.f49407 = -1;
        this.f49397 = -1;
        this.f49408 = 0;
        this.f49401 = null;
        this.f49405 = -1;
        this.f49396 = 400;
        this.f49394 = 0.0f;
        this.f49410 = new ArrayList();
        this.f49406 = null;
        this.f49402 = new ArrayList();
        this.f49395 = 0;
        this.f49400 = false;
        this.f49409 = -1;
        this.f49403 = 0;
        this.f49399 = 0;
        this.f49404 = c12904;
        if (c15141 != null) {
            this.f49409 = c15141.f49409;
            this.f49408 = c15141.f49408;
            this.f49401 = c15141.f49401;
            this.f49405 = c15141.f49405;
            this.f49396 = c15141.f49396;
            this.f49410 = c15141.f49410;
            this.f49394 = c15141.f49394;
            this.f49403 = c15141.f49403;
        }
    }

    public C15141(C12904 c12904, Context context, XmlResourceParser xmlResourceParser) {
        this.f49393 = -1;
        this.f49398 = false;
        this.f49407 = -1;
        this.f49397 = -1;
        this.f49408 = 0;
        this.f49401 = null;
        this.f49405 = -1;
        this.f49396 = 400;
        this.f49394 = 0.0f;
        this.f49410 = new ArrayList();
        this.f49406 = null;
        this.f49402 = new ArrayList();
        this.f49395 = 0;
        this.f49400 = false;
        this.f49409 = -1;
        this.f49403 = 0;
        this.f49399 = 0;
        this.f49396 = c12904.f41273;
        this.f49403 = c12904.f41271;
        this.f49404 = c12904;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4418);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f49407 = typedArrayObtainStyledAttributes.getResourceId(index, this.f49407);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f49407))) {
                    C4194 c4194 = new C4194();
                    c4194.m13388(context, this.f49407);
                    c12904.f41265.append(this.f49407, c4194);
                }
            } else if (index == 3) {
                this.f49397 = typedArrayObtainStyledAttributes.getResourceId(index, this.f49397);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f49397))) {
                    C4194 c4195 = new C4194();
                    c4195.m13388(context, this.f49397);
                    c12904.f41265.append(this.f49397, c4195);
                }
            } else if (index == 6) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f49405 = resourceId;
                    if (resourceId != -1) {
                        this.f49408 = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f49401 = string;
                    if (string.indexOf("/") > 0) {
                        this.f49405 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f49408 = -2;
                    } else {
                        this.f49408 = -1;
                    }
                } else {
                    this.f49408 = typedArrayObtainStyledAttributes.getInteger(index, this.f49408);
                }
            } else if (index == 4) {
                this.f49396 = typedArrayObtainStyledAttributes.getInt(index, this.f49396);
            } else if (index == 8) {
                this.f49394 = typedArrayObtainStyledAttributes.getFloat(index, this.f49394);
            } else if (index == 1) {
                this.f49395 = typedArrayObtainStyledAttributes.getInteger(index, this.f49395);
            } else if (index == 0) {
                this.f49393 = typedArrayObtainStyledAttributes.getResourceId(index, this.f49393);
            } else if (index == 9) {
                this.f49400 = typedArrayObtainStyledAttributes.getBoolean(index, this.f49400);
            } else if (index == 7) {
                this.f49409 = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f49403 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f49399 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f49397 == -1) {
            this.f49398 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
