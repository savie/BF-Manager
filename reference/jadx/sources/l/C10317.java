package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۢᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10317 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f32916;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f32917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f32918;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f32919;

    public C10317(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C10317(long j, byte[] bArr, int i, int i2) {
        this.f32917 = i;
        this.f32919 = i2;
        this.f32918 = j;
        this.f32916 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10317 m26584(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8826.f28838[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C10317(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10317 m26585(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8826.f28838[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C10317(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10317 m26586(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(C8826.f28858);
        return new C10317(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10317 m26587(C9571 c9571, ByteOrder byteOrder) {
        C9571[] c9571Arr = {c9571};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8826.f28838[5]]);
        byteBufferWrap.order(byteOrder);
        C9571 c9572 = c9571Arr[0];
        byteBufferWrap.putInt((int) c9572.f30970);
        byteBufferWrap.putInt((int) c9572.f30969);
        return new C10317(5, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(C8826.f28849[this.f32917]);
        sb.append(", data length:");
        return C12669.m31437(this.f32916.length, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Serializable, l.ۡᩴۙ[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.io.Serializable, l.ۡᩴۙ[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Serializable m26591(ByteOrder byteOrder) throws Throwable {
        C19268 c19268;
        byte b;
        byte[] bArr = this.f32916;
        C19268 c19269 = null;
        try {
            c19268 = new C19268(bArr);
            try {
                c19268.m44603(byteOrder);
                int i = this.f32917;
                int length = 0;
                int i2 = this.f32919;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, C8826.f28858);
                            try {
                                c19268.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + UTF8.S_P3A)});
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= C8826.f28853.length) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= C8826.f28853.length) {
                                    length = C8826.f28853.length;
                                } else if (bArr[i3] == C8826.f28853[i3]) {
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
                                    c19268.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            c19268.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i2];
                        while (length < i2) {
                            r12[length] = c19268.readUnsignedShort();
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i2];
                        while (length < i2) {
                            r13[length] = ((long) c19268.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new C9571[i2];
                        while (length < i2) {
                            r14[length] = new C9571(((long) c19268.readInt()) & 4294967295L, ((long) c19268.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = c19268.readShort();
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = c19268.readInt();
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new C9571[i2];
                        while (length < i2) {
                            r17[length] = new C9571(c19268.readInt(), c19268.readInt());
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = c19268.readFloat();
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = c19268.readDouble();
                            length++;
                        }
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            c19268.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (c19268 != null) {
                    try {
                        c19268.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c19269 = c19268;
                if (c19269 != null) {
                    try {
                        c19269.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            c19268 = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m26588(ByteOrder byteOrder) throws Throwable {
        Object objM26591 = m26591(byteOrder);
        if (objM26591 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM26591 instanceof String) {
            return Double.parseDouble((String) objM26591);
        }
        if (objM26591 instanceof long[]) {
            long[] jArr = (long[]) objM26591;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM26591 instanceof int[]) {
            int[] iArr = (int[]) objM26591;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM26591 instanceof double[]) {
            double[] dArr = (double[]) objM26591;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM26591 instanceof C9571[]) {
            C9571[] c9571Arr = (C9571[]) objM26591;
            if (c9571Arr.length == 1) {
                C9571 c9571 = c9571Arr[0];
                return c9571.f30970 / c9571.f30969;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26590(ByteOrder byteOrder) {
        Object objM26591 = m26591(byteOrder);
        if (objM26591 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM26591 instanceof String) {
            return Integer.parseInt((String) objM26591);
        }
        if (objM26591 instanceof long[]) {
            long[] jArr = (long[]) objM26591;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM26591 instanceof int[]) {
            int[] iArr = (int[]) objM26591;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m26589(ByteOrder byteOrder) {
        Object objM26591 = m26591(byteOrder);
        if (objM26591 == null) {
            return null;
        }
        if (objM26591 instanceof String) {
            return (String) objM26591;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM26591 instanceof long[]) {
            long[] jArr = (long[]) objM26591;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM26591 instanceof int[]) {
            int[] iArr = (int[]) objM26591;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM26591 instanceof double[]) {
            double[] dArr = (double[]) objM26591;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM26591 instanceof C9571[])) {
            return null;
        }
        C9571[] c9571Arr = (C9571[]) objM26591;
        while (i < c9571Arr.length) {
            sb.append(c9571Arr[i].f30970);
            sb.append('/');
            sb.append(c9571Arr[i].f30969);
            i++;
            if (i != c9571Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
