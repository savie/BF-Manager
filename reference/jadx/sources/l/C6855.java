package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Arrays;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6855 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f23067;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f23068;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f23069;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f23070;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f23071;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23072;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23073;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f23074;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f23075;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f23076;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public String f23077;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23078;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f23079;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f23080;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f23081;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f23082;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public float f23083;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f23084;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int[] f23085;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f23086;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f23087;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f23088;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f23089;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f23090;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f23091;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f23092;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f23093;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f23094;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f23095;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f23096;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f23097;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23098;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f23099;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f23100;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23102;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f23103;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f23104;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f23105;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f23106;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23107;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f23108;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23109;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f23110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23111;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f23112;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23113;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f23114;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23115;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f23116;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f23117;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f23118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23119;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f23120;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23121;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f23122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23123;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f23124;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f23125;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f23126;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f23127;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f23128;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18481(C6855 c6855) {
        this.f23101 = c6855.f23101;
        this.f23128 = c6855.f23128;
        this.f23079 = c6855.f23079;
        this.f23126 = c6855.f23126;
        this.f23107 = c6855.f23107;
        this.f23119 = c6855.f23119;
        this.f23068 = c6855.f23068;
        this.f23092 = c6855.f23092;
        this.f23075 = c6855.f23075;
        this.f23114 = c6855.f23114;
        this.f23116 = c6855.f23116;
        this.f23122 = c6855.f23122;
        this.f23087 = c6855.f23087;
        this.f23073 = c6855.f23073;
        this.f23096 = c6855.f23096;
        this.f23078 = c6855.f23078;
        this.f23118 = c6855.f23118;
        this.f23091 = c6855.f23091;
        this.f23115 = c6855.f23115;
        this.f23113 = c6855.f23113;
        this.f23095 = c6855.f23095;
        this.f23108 = c6855.f23108;
        this.f23084 = c6855.f23084;
        this.f23125 = c6855.f23125;
        this.f23070 = c6855.f23070;
        this.f23080 = c6855.f23080;
        this.f23127 = c6855.f23127;
        this.f23105 = c6855.f23105;
        this.f23106 = c6855.f23106;
        this.f23072 = c6855.f23072;
        this.f23124 = c6855.f23124;
        this.f23094 = c6855.f23094;
        this.f23102 = c6855.f23102;
        this.f23123 = c6855.f23123;
        this.f23089 = c6855.f23089;
        this.f23090 = c6855.f23090;
        this.f23121 = c6855.f23121;
        this.f23093 = c6855.f23093;
        this.f23088 = c6855.f23088;
        this.f23117 = c6855.f23117;
        this.f23086 = c6855.f23086;
        this.f23069 = c6855.f23069;
        this.f23104 = c6855.f23104;
        this.f23129 = c6855.f23129;
        this.f23120 = c6855.f23120;
        this.f23110 = c6855.f23110;
        this.f23109 = c6855.f23109;
        this.f23099 = c6855.f23099;
        this.f23098 = c6855.f23098;
        this.f23112 = c6855.f23112;
        this.f23111 = c6855.f23111;
        this.f23083 = c6855.f23083;
        this.f23082 = c6855.f23082;
        this.f23097 = c6855.f23097;
        this.f23074 = c6855.f23074;
        this.f23071 = c6855.f23071;
        this.f23081 = c6855.f23081;
        int[] iArr = c6855.f23085;
        if (iArr != null) {
            this.f23085 = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f23085 = null;
        }
        this.f23077 = c6855.f23077;
        this.f23076 = c6855.f23076;
        this.f23100 = c6855.f23100;
        this.f23103 = c6855.f23103;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23067 = sparseIntArray;
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
    public final void m18480(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51891);
        this.f23079 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f23067;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.f23076 = typedArrayObtainStyledAttributes.getBoolean(index, this.f23076);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.f23078 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23078);
                        break;
                    case 2:
                        this.f23102 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23102);
                        break;
                    case 3:
                        this.f23096 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23096);
                        break;
                    case 4:
                        this.f23073 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23073);
                        break;
                    case 5:
                        this.f23084 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f23127 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23127);
                        break;
                    case 7:
                        this.f23105 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23105);
                        break;
                    case 8:
                        this.f23123 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23123);
                        break;
                    case 9:
                        this.f23113 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23113);
                        break;
                    case 10:
                        this.f23115 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23115);
                        break;
                    case 11:
                        this.f23088 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23088);
                        break;
                    case 12:
                        this.f23117 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23117);
                        break;
                    case 13:
                        this.f23090 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23090);
                        break;
                    case 14:
                        this.f23093 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23093);
                        break;
                    case 15:
                        this.f23086 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23086);
                        break;
                    case 16:
                        this.f23121 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23121);
                        break;
                    case 17:
                        this.f23107 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23107);
                        break;
                    case 18:
                        this.f23119 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23119);
                        break;
                    case 19:
                        this.f23068 = typedArrayObtainStyledAttributes.getFloat(index, this.f23068);
                        break;
                    case 20:
                        this.f23095 = typedArrayObtainStyledAttributes.getFloat(index, this.f23095);
                        break;
                    case 21:
                        this.f23126 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f23126);
                        break;
                    case 22:
                        this.f23128 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f23128);
                        break;
                    case 23:
                        this.f23072 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23072);
                        break;
                    case 24:
                        this.f23092 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23092);
                        break;
                    case 25:
                        this.f23075 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23075);
                        break;
                    case 26:
                        this.f23106 = typedArrayObtainStyledAttributes.getInt(index, this.f23106);
                        break;
                    case 27:
                        this.f23124 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23124);
                        break;
                    case 28:
                        this.f23114 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23114);
                        break;
                    case 29:
                        this.f23116 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23116);
                        break;
                    case 30:
                        this.f23089 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23089);
                        break;
                    case 31:
                        this.f23118 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23118);
                        break;
                    case 32:
                        this.f23091 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23091);
                        break;
                    case 33:
                        this.f23094 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23094);
                        break;
                    case 34:
                        this.f23087 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23087);
                        break;
                    case 35:
                        this.f23122 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23122);
                        break;
                    case 36:
                        this.f23108 = typedArrayObtainStyledAttributes.getFloat(index, this.f23108);
                        break;
                    case 37:
                        this.f23104 = typedArrayObtainStyledAttributes.getFloat(index, this.f23104);
                        break;
                    case 38:
                        this.f23069 = typedArrayObtainStyledAttributes.getFloat(index, this.f23069);
                        break;
                    case 39:
                        this.f23129 = typedArrayObtainStyledAttributes.getInt(index, this.f23129);
                        break;
                    case 40:
                        this.f23120 = typedArrayObtainStyledAttributes.getInt(index, this.f23120);
                        break;
                    default:
                        switch (i2) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f23110 = typedArrayObtainStyledAttributes.getInt(index, this.f23110);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f23109 = typedArrayObtainStyledAttributes.getInt(index, this.f23109);
                                break;
                            case 56:
                                this.f23099 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23099);
                                break;
                            case 57:
                                this.f23098 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23098);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f23112 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23112);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f23111 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23111);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f23125 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f23125);
                                        break;
                                    case 62:
                                        this.f23070 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23070);
                                        break;
                                    case 63:
                                        this.f23080 = typedArrayObtainStyledAttributes.getFloat(index, this.f23080);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.f23083 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.f23082 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                break;
                                            case 72:
                                                this.f23097 = typedArrayObtainStyledAttributes.getInt(index, this.f23097);
                                                break;
                                            case 73:
                                                this.f23074 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23074);
                                                break;
                                            case 74:
                                                this.f23077 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f23103 = typedArrayObtainStyledAttributes.getBoolean(index, this.f23103);
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                            case 77:
                                                this.f23081 = typedArrayObtainStyledAttributes.getString(index);
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
                this.f23100 = typedArrayObtainStyledAttributes.getBoolean(index, this.f23100);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
