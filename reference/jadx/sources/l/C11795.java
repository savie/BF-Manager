package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes3.dex */
public class C11795 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f39598;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f39599;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f39600;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f39601;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39602;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f39603;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f39604;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f39605;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f39606;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f39607;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39608;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f39609;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f39610;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f39611;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f39612;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f39613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f39614;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f39615;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f39616;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f39617;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f39618;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f39619;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f39620;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f39621;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f39622;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39623;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f39624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39625;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f39626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39627;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f39628;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f39629;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f39630;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39631;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39633;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f39634;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f39635;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f39636;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f39637;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f39638;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f39639;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f39640;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f39641;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39642;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f39643;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f39644;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f39645;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39646;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f39647;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f39648;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f39649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39650;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f39651;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39652;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f39653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39654;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f39655;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39656;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f39657;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f39658;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f39659;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f39660;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C20719 f39661;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20719 m29477() {
        return this.f39661;
    }

    public C11795(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f39638 = -1;
        this.f39650 = -1;
        this.f39598 = -1.0f;
        this.f39602 = -1;
        this.f39622 = -1;
        this.f39617 = -1;
        this.f39653 = -1;
        this.f39641 = -1;
        this.f39599 = -1;
        this.f39627 = -1;
        this.f39633 = -1;
        this.f39608 = -1;
        this.f39610 = -1;
        this.f39656 = 0;
        this.f39603 = 0.0f;
        this.f39639 = -1;
        this.f39651 = -1;
        this.f39646 = -1;
        this.f39644 = -1;
        this.f39620 = -1;
        this.f39652 = -1;
        this.f39623 = -1;
        this.f39618 = -1;
        this.f39616 = -1;
        this.f39648 = -1;
        this.f39640 = 0.5f;
        this.f39630 = 0.5f;
        this.f39614 = null;
        this.f39658 = 1;
        this.f39612 = -1.0f;
        this.f39626 = -1.0f;
        this.f39629 = 0;
        this.f39643 = 0;
        this.f39609 = 0;
        this.f39605 = 0;
        this.f39611 = 0;
        this.f39604 = 0;
        this.f39628 = 0;
        this.f39634 = 0;
        this.f39601 = 1.0f;
        this.f39657 = 1.0f;
        this.f39636 = -1;
        this.f39654 = -1;
        this.f39607 = -1;
        this.f39631 = false;
        this.f39600 = false;
        this.f39606 = null;
        this.f39642 = true;
        this.f39613 = true;
        this.f39632 = false;
        this.f39625 = false;
        this.f39660 = false;
        this.f39635 = false;
        this.f39619 = -1;
        this.f39649 = -1;
        this.f39621 = -1;
        this.f39624 = -1;
        this.f39615 = -1;
        this.f39659 = -1;
        this.f39647 = 0.5f;
        this.f39661 = new C20719();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51890);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = C13912.f45826.get(index);
            switch (i3) {
                case 1:
                    this.f39607 = typedArrayObtainStyledAttributes.getInt(index, this.f39607);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f39610);
                    this.f39610 = resourceId;
                    if (resourceId == -1) {
                        this.f39610 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f39656 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39656);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f39603) % 360.0f;
                    this.f39603 = f;
                    if (f < 0.0f) {
                        this.f39603 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.f39638 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f39638);
                    break;
                case 6:
                    this.f39650 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f39650);
                    break;
                case 7:
                    this.f39598 = typedArrayObtainStyledAttributes.getFloat(index, this.f39598);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39602);
                    this.f39602 = resourceId2;
                    if (resourceId2 == -1) {
                        this.f39602 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39622);
                    this.f39622 = resourceId3;
                    if (resourceId3 == -1) {
                        this.f39622 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39617);
                    this.f39617 = resourceId4;
                    if (resourceId4 == -1) {
                        this.f39617 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39653);
                    this.f39653 = resourceId5;
                    if (resourceId5 == -1) {
                        this.f39653 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39641);
                    this.f39641 = resourceId6;
                    if (resourceId6 == -1) {
                        this.f39641 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39599);
                    this.f39599 = resourceId7;
                    if (resourceId7 == -1) {
                        this.f39599 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39627);
                    this.f39627 = resourceId8;
                    if (resourceId8 == -1) {
                        this.f39627 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39633);
                    this.f39633 = resourceId9;
                    if (resourceId9 == -1) {
                        this.f39633 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39608);
                    this.f39608 = resourceId10;
                    if (resourceId10 == -1) {
                        this.f39608 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39639);
                    this.f39639 = resourceId11;
                    if (resourceId11 == -1) {
                        this.f39639 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39651);
                    this.f39651 = resourceId12;
                    if (resourceId12 == -1) {
                        this.f39651 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39646);
                    this.f39646 = resourceId13;
                    if (resourceId13 == -1) {
                        this.f39646 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f39644);
                    this.f39644 = resourceId14;
                    if (resourceId14 == -1) {
                        this.f39644 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f39620 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39620);
                    break;
                case 22:
                    this.f39652 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39652);
                    break;
                case 23:
                    this.f39623 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39623);
                    break;
                case 24:
                    this.f39618 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39618);
                    break;
                case 25:
                    this.f39616 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39616);
                    break;
                case 26:
                    this.f39648 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39648);
                    break;
                case 27:
                    this.f39631 = typedArrayObtainStyledAttributes.getBoolean(index, this.f39631);
                    break;
                case 28:
                    this.f39600 = typedArrayObtainStyledAttributes.getBoolean(index, this.f39600);
                    break;
                case 29:
                    this.f39640 = typedArrayObtainStyledAttributes.getFloat(index, this.f39640);
                    break;
                case 30:
                    this.f39630 = typedArrayObtainStyledAttributes.getFloat(index, this.f39630);
                    break;
                case 31:
                    this.f39609 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.f39605 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.f39611 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39611);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f39611) == -2) {
                            this.f39611 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.f39628 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39628);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f39628) == -2) {
                            this.f39628 = -2;
                        }
                    }
                    break;
                case 35:
                    this.f39601 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f39601));
                    this.f39609 = 2;
                    break;
                case 36:
                    try {
                        this.f39604 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39604);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f39604) == -2) {
                            this.f39604 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.f39634 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f39634);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f39634) == -2) {
                            this.f39634 = -2;
                        }
                    }
                    break;
                case 38:
                    this.f39657 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f39657));
                    this.f39605 = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f39614 = string;
                            this.f39658 = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = this.f39614.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = this.f39614.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.f39658 = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.f39658 = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = this.f39614.indexOf(58);
                                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                    String strSubstring2 = this.f39614.substring(i, iIndexOf2);
                                    String strSubstring3 = this.f39614.substring(iIndexOf2 + 1);
                                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring2);
                                            float f3 = Float.parseFloat(strSubstring3);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (this.f39658 == 1) {
                                                    Math.abs(f3 / f2);
                                                } else {
                                                    Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                } else {
                                    String strSubstring4 = this.f39614.substring(i);
                                    if (strSubstring4.length() > 0) {
                                        Float.parseFloat(strSubstring4);
                                    }
                                }
                            }
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            this.f39612 = typedArrayObtainStyledAttributes.getFloat(index, this.f39612);
                            break;
                        case 46:
                            this.f39626 = typedArrayObtainStyledAttributes.getFloat(index, this.f39626);
                            break;
                        case 47:
                            this.f39629 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f39643 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f39636 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f39636);
                            break;
                        case 50:
                            this.f39654 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f39654);
                            break;
                        case 51:
                            this.f39606 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m29478();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29478() {
        this.f39625 = false;
        this.f39642 = true;
        this.f39613 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f39631) {
            this.f39642 = false;
            if (this.f39609 == 0) {
                this.f39609 = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f39600) {
            this.f39613 = false;
            if (this.f39605 == 0) {
                this.f39605 = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f39642 = false;
            if (i == 0 && this.f39609 == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f39631 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f39613 = false;
            if (i2 == 0 && this.f39605 == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f39600 = true;
            }
        }
        if (this.f39598 == -1.0f && this.f39638 == -1 && this.f39650 == -1) {
            return;
        }
        this.f39625 = true;
        this.f39642 = true;
        this.f39613 = true;
        if (!(this.f39661 instanceof C12253)) {
            this.f39661 = new C12253();
        }
        ((C12253) this.f39661).m30470(this.f39607);
    }

    public C11795(int i) {
        super(i, -2);
        this.f39638 = -1;
        this.f39650 = -1;
        this.f39598 = -1.0f;
        this.f39602 = -1;
        this.f39622 = -1;
        this.f39617 = -1;
        this.f39653 = -1;
        this.f39641 = -1;
        this.f39599 = -1;
        this.f39627 = -1;
        this.f39633 = -1;
        this.f39608 = -1;
        this.f39610 = -1;
        this.f39656 = 0;
        this.f39603 = 0.0f;
        this.f39639 = -1;
        this.f39651 = -1;
        this.f39646 = -1;
        this.f39644 = -1;
        this.f39620 = -1;
        this.f39652 = -1;
        this.f39623 = -1;
        this.f39618 = -1;
        this.f39616 = -1;
        this.f39648 = -1;
        this.f39640 = 0.5f;
        this.f39630 = 0.5f;
        this.f39614 = null;
        this.f39658 = 1;
        this.f39612 = -1.0f;
        this.f39626 = -1.0f;
        this.f39629 = 0;
        this.f39643 = 0;
        this.f39609 = 0;
        this.f39605 = 0;
        this.f39611 = 0;
        this.f39604 = 0;
        this.f39628 = 0;
        this.f39634 = 0;
        this.f39601 = 1.0f;
        this.f39657 = 1.0f;
        this.f39636 = -1;
        this.f39654 = -1;
        this.f39607 = -1;
        this.f39631 = false;
        this.f39600 = false;
        this.f39606 = null;
        this.f39642 = true;
        this.f39613 = true;
        this.f39632 = false;
        this.f39625 = false;
        this.f39660 = false;
        this.f39635 = false;
        this.f39619 = -1;
        this.f39649 = -1;
        this.f39621 = -1;
        this.f39624 = -1;
        this.f39615 = -1;
        this.f39659 = -1;
        this.f39647 = 0.5f;
        this.f39661 = new C20719();
    }

    public C11795(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f39638 = -1;
        this.f39650 = -1;
        this.f39598 = -1.0f;
        this.f39602 = -1;
        this.f39622 = -1;
        this.f39617 = -1;
        this.f39653 = -1;
        this.f39641 = -1;
        this.f39599 = -1;
        this.f39627 = -1;
        this.f39633 = -1;
        this.f39608 = -1;
        this.f39610 = -1;
        this.f39656 = 0;
        this.f39603 = 0.0f;
        this.f39639 = -1;
        this.f39651 = -1;
        this.f39646 = -1;
        this.f39644 = -1;
        this.f39620 = -1;
        this.f39652 = -1;
        this.f39623 = -1;
        this.f39618 = -1;
        this.f39616 = -1;
        this.f39648 = -1;
        this.f39640 = 0.5f;
        this.f39630 = 0.5f;
        this.f39614 = null;
        this.f39658 = 1;
        this.f39612 = -1.0f;
        this.f39626 = -1.0f;
        this.f39629 = 0;
        this.f39643 = 0;
        this.f39609 = 0;
        this.f39605 = 0;
        this.f39611 = 0;
        this.f39604 = 0;
        this.f39628 = 0;
        this.f39634 = 0;
        this.f39601 = 1.0f;
        this.f39657 = 1.0f;
        this.f39636 = -1;
        this.f39654 = -1;
        this.f39607 = -1;
        this.f39631 = false;
        this.f39600 = false;
        this.f39606 = null;
        this.f39642 = true;
        this.f39613 = true;
        this.f39632 = false;
        this.f39625 = false;
        this.f39660 = false;
        this.f39635 = false;
        this.f39619 = -1;
        this.f39649 = -1;
        this.f39621 = -1;
        this.f39624 = -1;
        this.f39615 = -1;
        this.f39659 = -1;
        this.f39647 = 0.5f;
        this.f39661 = new C20719();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    @TargetApi(17)
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f39621 = -1;
        this.f39624 = -1;
        this.f39619 = -1;
        this.f39649 = -1;
        this.f39615 = this.f39620;
        this.f39659 = this.f39623;
        float f = this.f39640;
        this.f39647 = f;
        int i8 = this.f39638;
        this.f39637 = i8;
        int i9 = this.f39650;
        this.f39655 = i9;
        float f2 = this.f39598;
        this.f39645 = f2;
        if (z2) {
            int i10 = this.f39639;
            if (i10 != -1) {
                this.f39621 = i10;
            } else {
                int i11 = this.f39651;
                if (i11 != -1) {
                    this.f39624 = i11;
                } else {
                    i2 = this.f39646;
                    if (i2 != -1) {
                        this.f39649 = i2;
                        z = true;
                    }
                    i3 = this.f39644;
                    if (i3 != -1) {
                        this.f39619 = i3;
                        z = true;
                    }
                    i4 = this.f39616;
                    if (i4 != -1) {
                        this.f39659 = i4;
                    }
                    i5 = this.f39648;
                    if (i5 != -1) {
                        this.f39615 = i5;
                    }
                    if (z) {
                        this.f39647 = 1.0f - f;
                    }
                    if (this.f39625 && this.f39607 == 1) {
                        if (f2 != -1.0f) {
                            this.f39645 = 1.0f - f2;
                            this.f39637 = -1;
                            this.f39655 = -1;
                        } else if (i8 != -1) {
                            this.f39655 = i8;
                            this.f39637 = -1;
                            this.f39645 = -1.0f;
                        } else if (i9 != -1) {
                            this.f39637 = i9;
                            this.f39655 = -1;
                            this.f39645 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f39646;
            if (i2 != -1) {
                this.f39649 = i2;
                z = true;
            }
            i3 = this.f39644;
            if (i3 != -1) {
                this.f39619 = i3;
                z = true;
            }
            i4 = this.f39616;
            if (i4 != -1) {
                this.f39659 = i4;
            }
            i5 = this.f39648;
            if (i5 != -1) {
                this.f39615 = i5;
            }
            if (z) {
                this.f39647 = 1.0f - f;
            }
            if (this.f39625) {
                if (f2 != -1.0f) {
                    this.f39645 = 1.0f - f2;
                    this.f39637 = -1;
                    this.f39655 = -1;
                } else if (i8 != -1) {
                    this.f39655 = i8;
                    this.f39637 = -1;
                    this.f39645 = -1.0f;
                } else if (i9 != -1) {
                    this.f39637 = i9;
                    this.f39655 = -1;
                    this.f39645 = -1.0f;
                }
            }
        } else {
            int i12 = this.f39639;
            if (i12 != -1) {
                this.f39649 = i12;
            }
            int i13 = this.f39651;
            if (i13 != -1) {
                this.f39619 = i13;
            }
            int i14 = this.f39646;
            if (i14 != -1) {
                this.f39621 = i14;
            }
            int i15 = this.f39644;
            if (i15 != -1) {
                this.f39624 = i15;
            }
            int i16 = this.f39616;
            if (i16 != -1) {
                this.f39615 = i16;
            }
            int i17 = this.f39648;
            if (i17 != -1) {
                this.f39659 = i17;
            }
        }
        if (this.f39646 == -1 && this.f39644 == -1 && this.f39651 == -1 && this.f39639 == -1) {
            int i18 = this.f39617;
            if (i18 != -1) {
                this.f39621 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f39653;
                if (i19 != -1) {
                    this.f39624 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f39602;
            if (i20 != -1) {
                this.f39619 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f39622;
            if (i21 != -1) {
                this.f39649 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
