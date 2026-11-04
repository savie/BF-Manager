package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Arrays;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20602 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f65961;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65962;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f65963;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f65964;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f65965;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public String f65966;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f65967;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f65968;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f65969;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f65970;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f65971;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65972;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f65973;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f65974;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f65975;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f65976;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f65977;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f65978;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f65979;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f65980;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f65981;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f65982;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f65983;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public float f65984;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65985;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f65986;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f65987;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int[] f65988;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f65989;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f65990;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65991;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f65992;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65994;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f65995;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65996;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f65997;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f65998;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f65999;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f66000;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f66001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66002;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f66003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f66004;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public float f66005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f66006;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f66007;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f66008;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f66009;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f66010;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f66011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f66012;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f66013;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66014;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66015;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66016;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f66017;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f66018;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f66019;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f66020;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f66021;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f66022;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f66023;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47188(C20602 c20602) {
        this.f65975 = c20602.f65975;
        this.f66023 = c20602.f66023;
        this.f65973 = c20602.f65973;
        this.f65997 = c20602.f65997;
        this.f65994 = c20602.f65994;
        this.f66012 = c20602.f66012;
        this.f66004 = c20602.f66004;
        this.f65978 = c20602.f65978;
        this.f65993 = c20602.f65993;
        this.f65999 = c20602.f65999;
        this.f66019 = c20602.f66019;
        this.f65971 = c20602.f65971;
        this.f66021 = c20602.f66021;
        this.f66016 = c20602.f66016;
        this.f65985 = c20602.f65985;
        this.f65972 = c20602.f65972;
        this.f66011 = c20602.f66011;
        this.f65990 = c20602.f65990;
        this.f66018 = c20602.f66018;
        this.f65998 = c20602.f65998;
        this.f65964 = c20602.f65964;
        this.f65995 = c20602.f65995;
        this.f65987 = c20602.f65987;
        this.f65996 = c20602.f65996;
        this.f65991 = c20602.f65991;
        this.f66008 = c20602.f66008;
        this.f66022 = c20602.f66022;
        this.f66000 = c20602.f66000;
        this.f66001 = c20602.f66001;
        this.f65981 = c20602.f65981;
        this.f66003 = c20602.f66003;
        this.f65977 = c20602.f65977;
        this.f66014 = c20602.f66014;
        this.f66002 = c20602.f66002;
        this.f65969 = c20602.f65969;
        this.f65989 = c20602.f65989;
        this.f65970 = c20602.f65970;
        this.f65976 = c20602.f65976;
        this.f65968 = c20602.f65968;
        this.f66010 = c20602.f66010;
        this.f66020 = c20602.f66020;
        this.f66005 = c20602.f66005;
        this.f65967 = c20602.f65967;
        this.f65982 = c20602.f65982;
        this.f66013 = c20602.f66013;
        this.f65963 = c20602.f65963;
        this.f65962 = c20602.f65962;
        this.f65980 = c20602.f65980;
        this.f65979 = c20602.f65979;
        this.f66007 = c20602.f66007;
        this.f66006 = c20602.f66006;
        this.f65984 = c20602.f65984;
        this.f65983 = c20602.f65983;
        this.f65986 = c20602.f65986;
        this.f66017 = c20602.f66017;
        this.f65992 = c20602.f65992;
        this.f66009 = c20602.f66009;
        int[] iArr = c20602.f65988;
        if (iArr != null) {
            this.f65988 = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f65988 = null;
        }
        this.f65966 = c20602.f65966;
        this.f65965 = c20602.f65965;
        this.f65974 = c20602.f65974;
        this.f66015 = c20602.f66015;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f65961 = sparseIntArray;
        sparseIntArray.append(39, 24);
        sparseIntArray.append(40, 25);
        sparseIntArray.append(42, 28);
        sparseIntArray.append(43, 29);
        sparseIntArray.append(48, 35);
        sparseIntArray.append(47, 34);
        sparseIntArray.append(21, 4);
        sparseIntArray.append(20, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(56, 6);
        sparseIntArray.append(57, 7);
        sparseIntArray.append(28, 17);
        sparseIntArray.append(29, 18);
        sparseIntArray.append(30, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(44, 31);
        sparseIntArray.append(45, 32);
        sparseIntArray.append(27, 10);
        sparseIntArray.append(26, 9);
        sparseIntArray.append(60, 13);
        sparseIntArray.append(63, 16);
        sparseIntArray.append(61, 14);
        sparseIntArray.append(58, 11);
        sparseIntArray.append(62, 15);
        sparseIntArray.append(59, 12);
        sparseIntArray.append(51, 38);
        sparseIntArray.append(37, 37);
        sparseIntArray.append(36, 39);
        sparseIntArray.append(50, 40);
        sparseIntArray.append(35, 20);
        sparseIntArray.append(49, 36);
        sparseIntArray.append(25, 5);
        sparseIntArray.append(38, 76);
        sparseIntArray.append(46, 76);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(19, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(22, 61);
        sparseIntArray.append(24, 62);
        sparseIntArray.append(23, 63);
        sparseIntArray.append(55, 69);
        sparseIntArray.append(34, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47187(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4433);
        this.f65973 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f65961;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.f65965 = typedArrayObtainStyledAttributes.getBoolean(index, this.f65965);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.f65972 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65972);
                        break;
                    case 2:
                        this.f66014 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66014);
                        break;
                    case 3:
                        this.f65985 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65985);
                        break;
                    case 4:
                        this.f66016 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f66016);
                        break;
                    case 5:
                        this.f65987 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f66022 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f66022);
                        break;
                    case 7:
                        this.f66000 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f66000);
                        break;
                    case 8:
                        this.f66002 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66002);
                        break;
                    case 9:
                        this.f65998 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65998);
                        break;
                    case 10:
                        this.f66018 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f66018);
                        break;
                    case 11:
                        this.f65968 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65968);
                        break;
                    case 12:
                        this.f66010 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66010);
                        break;
                    case 13:
                        this.f65989 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65989);
                        break;
                    case 14:
                        this.f65976 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65976);
                        break;
                    case 15:
                        this.f66020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66020);
                        break;
                    case 16:
                        this.f65970 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65970);
                        break;
                    case 17:
                        this.f65994 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f65994);
                        break;
                    case 18:
                        this.f66012 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f66012);
                        break;
                    case 19:
                        this.f66004 = typedArrayObtainStyledAttributes.getFloat(index, this.f66004);
                        break;
                    case 20:
                        this.f65964 = typedArrayObtainStyledAttributes.getFloat(index, this.f65964);
                        break;
                    case 21:
                        this.f65997 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f65997);
                        break;
                    case 22:
                        this.f66023 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f66023);
                        break;
                    case 23:
                        this.f65981 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65981);
                        break;
                    case 24:
                        this.f65978 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65978);
                        break;
                    case 25:
                        this.f65993 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65993);
                        break;
                    case 26:
                        this.f66001 = typedArrayObtainStyledAttributes.getInt(index, this.f66001);
                        break;
                    case 27:
                        this.f66003 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66003);
                        break;
                    case 28:
                        this.f65999 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65999);
                        break;
                    case 29:
                        this.f66019 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f66019);
                        break;
                    case 30:
                        this.f65969 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65969);
                        break;
                    case 31:
                        this.f66011 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f66011);
                        break;
                    case 32:
                        this.f65990 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65990);
                        break;
                    case 33:
                        this.f65977 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65977);
                        break;
                    case 34:
                        this.f66021 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f66021);
                        break;
                    case 35:
                        this.f65971 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65971);
                        break;
                    case 36:
                        this.f65995 = typedArrayObtainStyledAttributes.getFloat(index, this.f65995);
                        break;
                    case 37:
                        this.f65967 = typedArrayObtainStyledAttributes.getFloat(index, this.f65967);
                        break;
                    case 38:
                        this.f66005 = typedArrayObtainStyledAttributes.getFloat(index, this.f66005);
                        break;
                    case 39:
                        this.f65982 = typedArrayObtainStyledAttributes.getInt(index, this.f65982);
                        break;
                    case 40:
                        this.f66013 = typedArrayObtainStyledAttributes.getInt(index, this.f66013);
                        break;
                    default:
                        switch (i2) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f65963 = typedArrayObtainStyledAttributes.getInt(index, this.f65963);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f65962 = typedArrayObtainStyledAttributes.getInt(index, this.f65962);
                                break;
                            case 56:
                                this.f65980 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65980);
                                break;
                            case 57:
                                this.f65979 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65979);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f66007 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66007);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f66006 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66006);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f65996 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f65996);
                                        break;
                                    case 62:
                                        this.f65991 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f65991);
                                        break;
                                    case 63:
                                        this.f66008 = typedArrayObtainStyledAttributes.getFloat(index, this.f66008);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.f65984 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.f65983 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                break;
                                            case 72:
                                                this.f65986 = typedArrayObtainStyledAttributes.getInt(index, this.f65986);
                                                break;
                                            case 73:
                                                this.f66017 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f66017);
                                                break;
                                            case 74:
                                                this.f65966 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f66015 = typedArrayObtainStyledAttributes.getBoolean(index, this.f66015);
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                            case 77:
                                                this.f66009 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.f65974 = typedArrayObtainStyledAttributes.getBoolean(index, this.f65974);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
