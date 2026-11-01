package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۜ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7096 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f23780;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f23781;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f23782;

    public C7096(String str, byte[] bArr, String str2) {
        this.f23781 = str;
        this.f23780 = str2;
        this.f23782 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7096)) {
            return false;
        }
        C7096 c7096 = (C7096) obj;
        return C13638.equals(this.f23781, c7096.f23781) && C13638.equals(this.f23780, c7096.f23780) && C13638.equals(this.f23782, c7096.f23782);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f23782) + C0589.m2789(C13638.hashCode(this.f23781) * 31, 31, this.f23780);
    }

    public final String toString() {
        Object[] objArr = {this.f23781, this.f23780, this.f23782};
        String[] strArrSplit = "title;author;image".length() == 0 ? new String[0] : "title;author;image".split(l.b);
        StringBuilder sb = new StringBuilder("WavID3Info[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m18969() {
        return this.f23781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18970() {
        return this.f23780;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m18971() {
        return this.f23782;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7096 m18967(C1388 c1388) {
        try {
            c1388.seek(0L);
            if (c1388.readInt() == 1179011410) {
                c1388.skipBytes(4);
                if (c1388.readInt() == 1163280727) {
                    while (c1388.available() > 8) {
                        int i = c1388.readInt();
                        int i2 = c1388.readInt();
                        if (i == 540238953) {
                            if ((c1388.readInt() & 16777215) != 3359817) {
                                break;
                            }
                            c1388.skipBytes(2);
                            C1388 c1388M4865 = c1388.m4865(c1388.m4862(), ((c1388.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21) | ((c1388.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | ((c1388.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (c1388.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
                            byte[] bArr = null;
                            String strM18968 = null;
                            String strM18969 = null;
                            while (c1388M4865.available() > 10) {
                                int i3 = c1388M4865.readInt();
                                int iReverseBytes = Integer.reverseBytes(c1388M4865.readInt());
                                c1388M4865.skipBytes(2);
                                if (i3 == 0) {
                                    break;
                                }
                                if (i3 == 1128878145) {
                                    long filePointer = c1388M4865.getFilePointer() + ((long) iReverseBytes);
                                    c1388M4865.skipBytes(1);
                                    while (c1388M4865.readByte() != 0) {
                                    }
                                    c1388M4865.skipBytes(1);
                                    while (c1388M4865.readByte() != 0) {
                                    }
                                    int filePointer2 = (int) (filePointer - c1388M4865.getFilePointer());
                                    if (filePointer2 > 0) {
                                        bArr = new byte[filePointer2];
                                        c1388M4865.m4864(bArr, 0, filePointer2);
                                    }
                                } else if (i3 == 844384596) {
                                    byte[] bArr2 = new byte[iReverseBytes];
                                    c1388M4865.m4864(bArr2, 0, iReverseBytes);
                                    strM18968 = m18968(bArr2);
                                } else if (i3 == 826626132) {
                                    byte[] bArr3 = new byte[iReverseBytes];
                                    c1388M4865.m4864(bArr3, 0, iReverseBytes);
                                    strM18969 = m18968(bArr3);
                                } else if (i3 == 843403348 && strM18969 == null) {
                                    byte[] bArr4 = new byte[iReverseBytes];
                                    c1388M4865.m4864(bArr4, 0, iReverseBytes);
                                    strM18969 = m18968(bArr4);
                                } else {
                                    c1388M4865.skipBytes(iReverseBytes);
                                }
                            }
                            return new C7096(strM18968, bArr, strM18969);
                        }
                        c1388.skipBytes(i2);
                    }
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x003b  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18968(byte[] bArr) {
        Charset charset;
        int i;
        if (bArr.length < 1) {
            return null;
        }
        byte b = bArr[0];
        if (b == 1) {
            charset = StandardCharsets.UTF_16;
        } else if (b == 2) {
            charset = StandardCharsets.UTF_16BE;
        } else if (b == 3) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = StandardCharsets.ISO_8859_1;
        }
        int i2 = 1;
        while (i2 < bArr.length) {
            Charset charset2 = StandardCharsets.UTF_16;
            if (charset == charset2) {
                int i3 = i2 + 1;
                if (i3 < bArr.length && bArr[i2] == 0 && bArr[i3] == 0) {
                    break;
                }
                if (charset == charset2) {
                    i = 2;
                } else {
                    i = 1;
                }
                i2 += i;
            } else {
                if (bArr[i2] == 0) {
                    break;
                }
                if (charset == charset2) {
                    i = 2;
                } else {
                    i = 1;
                }
                i2 += i;
            }
        }
        return new String(bArr, 1, i2 - 1, charset);
    }
}
