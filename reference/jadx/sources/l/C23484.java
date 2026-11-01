package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩻ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23484 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f76038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f76039;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f76040;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f76041;

    public C23484(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C23484(long j, byte[] bArr, int i, int i2) {
        this.f76040 = i;
        this.f76038 = i2;
        this.f76041 = j;
        this.f76039 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23484 m51742(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3021.f11294[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C23484(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23484 m51743(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3021.f11294[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C23484(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23484 m51744(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(C3021.f11304);
        return new C23484(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23484 m51745(C1610 c1610, ByteOrder byteOrder) {
        C1610[] c1610Arr = {c1610};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3021.f11294[5]]);
        byteBufferWrap.order(byteOrder);
        C1610 c1611 = c1610Arr[0];
        byteBufferWrap.putInt((int) c1611.f6503);
        byteBufferWrap.putInt((int) c1611.f6502);
        return new C23484(5, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(C3021.f11312[this.f76040]);
        sb.append(", data length:");
        return C12441.m30911(this.f76039.length, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Serializable, l.֫ۚۙ[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.io.Serializable, l.֫ۚۙ[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Serializable m51746(ByteOrder byteOrder) throws Throwable {
        C10784 c10784;
        byte b;
        byte[] bArr = this.f76039;
        C10784 c10785 = null;
        try {
            c10784 = new C10784(bArr);
            try {
                c10784.m27081(byteOrder);
                int i = this.f76040;
                int length = 0;
                int i2 = this.f76038;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, C3021.f11304);
                            try {
                                c10784.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + UTF8.S_P3A)});
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= C3021.f11291.length) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= C3021.f11291.length) {
                                    length = C3021.f11291.length;
                                } else if (bArr[i3] == C3021.f11291[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    c10784.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            c10784.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i2];
                        while (length < i2) {
                            r12[length] = c10784.readUnsignedShort();
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i2];
                        while (length < i2) {
                            r13[length] = ((long) c10784.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new C1610[i2];
                        while (length < i2) {
                            r14[length] = new C1610(((long) c10784.readInt()) & 4294967295L, ((long) c10784.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = c10784.readShort();
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = c10784.readInt();
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new C1610[i2];
                        while (length < i2) {
                            r17[length] = new C1610(c10784.readInt(), c10784.readInt());
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = c10784.readFloat();
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = c10784.readDouble();
                            length++;
                        }
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            c10784.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (c10784 != null) {
                    try {
                        c10784.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c10785 = c10784;
                if (c10785 != null) {
                    try {
                        c10785.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            c10784 = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m51747(ByteOrder byteOrder) throws Throwable {
        Object objM51746 = m51746(byteOrder);
        if (objM51746 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM51746 instanceof String) {
            return Double.parseDouble((String) objM51746);
        }
        if (objM51746 instanceof long[]) {
            long[] jArr = (long[]) objM51746;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM51746 instanceof int[]) {
            int[] iArr = (int[]) objM51746;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM51746 instanceof double[]) {
            double[] dArr = (double[]) objM51746;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM51746 instanceof C1610[]) {
            C1610[] c1610Arr = (C1610[]) objM51746;
            if (c1610Arr.length == 1) {
                C1610 c1610 = c1610Arr[0];
                return c1610.f6503 / c1610.f6502;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51749(ByteOrder byteOrder) {
        Object objM51746 = m51746(byteOrder);
        if (objM51746 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM51746 instanceof String) {
            return Integer.parseInt((String) objM51746);
        }
        if (objM51746 instanceof long[]) {
            long[] jArr = (long[]) objM51746;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM51746 instanceof int[]) {
            int[] iArr = (int[]) objM51746;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m51748(ByteOrder byteOrder) {
        Object objM51746 = m51746(byteOrder);
        if (objM51746 == null) {
            return null;
        }
        if (objM51746 instanceof String) {
            return (String) objM51746;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM51746 instanceof long[]) {
            long[] jArr = (long[]) objM51746;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM51746 instanceof int[]) {
            int[] iArr = (int[]) objM51746;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM51746 instanceof double[]) {
            double[] dArr = (double[]) objM51746;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM51746 instanceof C1610[])) {
            return null;
        }
        C1610[] c1610Arr = (C1610[]) objM51746;
        while (i < c1610Arr.length) {
            sb.append(c1610Arr[i].f6503);
            sb.append('/');
            sb.append(c1610Arr[i].f6502);
            i++;
            if (i != c1610Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
