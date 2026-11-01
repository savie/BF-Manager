package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9473 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f32043;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f32044;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f32045;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32046;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f32047;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f32048;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f32049;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f32050;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32051;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32052;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32053;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f32054;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f32055;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f32056;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C9514 f32057;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3121 f32058;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f32059;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f32060;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24279() {
        return this.f32054;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24277(Context context, XmlResourceParser xmlResourceParser) {
        this.f32055.add(new ViewOnClickListenerC1710(context, this, xmlResourceParser));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24275() {
        return this.f32046;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24280() {
        return this.f32053;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m24274() {
        return this.f32051;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9514 m24278() {
        return this.f32057;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m24281() {
        return !this.f32043;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24276(Context context) {
        if (this.f32051 != -1) {
            context.getResources().getResourceEntryName(this.f32051);
        }
        if (this.f32053 == -1) {
            return;
        }
        context.getResources().getResourceEntryName(this.f32053);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m24273() {
        return (this.f32050 & 1) != 0;
    }

    public C9473(C3121 c3121, C9473 c9473) {
        this.f32045 = -1;
        this.f32048 = false;
        this.f32053 = -1;
        this.f32051 = -1;
        this.f32044 = 0;
        this.f32059 = null;
        this.f32047 = -1;
        this.f32052 = 400;
        this.f32049 = 0.0f;
        this.f32060 = new ArrayList();
        this.f32057 = null;
        this.f32055 = new ArrayList();
        this.f32046 = 0;
        this.f32043 = false;
        this.f32056 = -1;
        this.f32054 = 0;
        this.f32050 = 0;
        this.f32058 = c3121;
        if (c9473 != null) {
            this.f32056 = c9473.f32056;
            this.f32044 = c9473.f32044;
            this.f32059 = c9473.f32059;
            this.f32047 = c9473.f32047;
            this.f32052 = c9473.f32052;
            this.f32060 = c9473.f32060;
            this.f32049 = c9473.f32049;
            this.f32054 = c9473.f32054;
        }
    }

    public C9473(C3121 c3121, Context context, XmlResourceParser xmlResourceParser) {
        this.f32045 = -1;
        this.f32048 = false;
        this.f32053 = -1;
        this.f32051 = -1;
        this.f32044 = 0;
        this.f32059 = null;
        this.f32047 = -1;
        this.f32052 = 400;
        this.f32049 = 0.0f;
        this.f32060 = new ArrayList();
        this.f32057 = null;
        this.f32055 = new ArrayList();
        this.f32046 = 0;
        this.f32043 = false;
        this.f32056 = -1;
        this.f32054 = 0;
        this.f32050 = 0;
        this.f32052 = c3121.f11767;
        this.f32054 = c3121.f11774;
        this.f32058 = c3121;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51893);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f32053 = typedArrayObtainStyledAttributes.getResourceId(index, this.f32053);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f32053))) {
                    C18144 c18144 = new C18144();
                    c18144.m42243(context, this.f32053);
                    c3121.f11771.append(this.f32053, c18144);
                }
            } else if (index == 3) {
                this.f32051 = typedArrayObtainStyledAttributes.getResourceId(index, this.f32051);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f32051))) {
                    C18144 c18145 = new C18144();
                    c18145.m42243(context, this.f32051);
                    c3121.f11771.append(this.f32051, c18145);
                }
            } else if (index == 6) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f32047 = resourceId;
                    if (resourceId != -1) {
                        this.f32044 = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f32059 = string;
                    if (string.indexOf("/") > 0) {
                        this.f32047 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f32044 = -2;
                    } else {
                        this.f32044 = -1;
                    }
                } else {
                    this.f32044 = typedArrayObtainStyledAttributes.getInteger(index, this.f32044);
                }
            } else if (index == 4) {
                this.f32052 = typedArrayObtainStyledAttributes.getInt(index, this.f32052);
            } else if (index == 8) {
                this.f32049 = typedArrayObtainStyledAttributes.getFloat(index, this.f32049);
            } else if (index == 1) {
                this.f32046 = typedArrayObtainStyledAttributes.getInteger(index, this.f32046);
            } else if (index == 0) {
                this.f32045 = typedArrayObtainStyledAttributes.getResourceId(index, this.f32045);
            } else if (index == 9) {
                this.f32043 = typedArrayObtainStyledAttributes.getBoolean(index, this.f32043);
            } else if (index == 7) {
                this.f32056 = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f32054 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f32050 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f32051 == -1) {
            this.f32048 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
