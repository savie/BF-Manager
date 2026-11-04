package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6GY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6707 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f22305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f22306;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String[] f22307;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f22308;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f22309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f22310;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f22311;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f22304 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile SoftReference f22303 = new SoftReference(null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6707 m18719() {
        C6707 c6707;
        C6707 c6708 = (C6707) f22303.get();
        if (c6708 != null) {
            return c6708;
        }
        synchronized (f22304) {
            c6707 = (C6707) f22303.get();
            if (c6707 == null) {
                InputStream resourceAsStream = C6707.class.getResourceAsStream("/assets/a");
                if (resourceAsStream == null) {
                    throw new IOException("Class set asset not found: /assets/a");
                }
                try {
                    C6707 c6709 = new C6707(C20244.m46522(C24653.m55007(resourceAsStream), 0));
                    resourceAsStream.close();
                    f22303 = new SoftReference(c6709);
                    c6707 = c6709;
                } catch (Throwable th) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return c6707;
    }

    public C6707(byte[] bArr) throws IOException {
        this.f22310 = bArr;
        C12672 c12672 = new C12672(this, 0, bArr.length);
        if (c12672.readInt() != 1297367891 || c12672.readInt() != 1) {
            throw new IOException("Unsupported shared class set format");
        }
        int i = c12672.readInt();
        this.f22311 = i;
        int iPosition = c12672.position();
        this.f22309 = iPosition;
        if (i < 17 || i > c12672.m31447()) {
            throw new IOException("Invalid embedded class set length");
        }
        C12672 c12673 = new C12672(this, iPosition, i);
        byte[] bArr2 = new byte[8];
        c12673.readFully(bArr2);
        if (!"jadx-cst".equals(new String(bArr2, StandardCharsets.US_ASCII)) || c12673.readUnsignedByte() != 5 || c12673.readInt() != 34) {
            throw new IOException("Expected JADX v5 API 34 class set");
        }
        int i2 = c12673.readInt();
        if (i2 <= 0 || i2 > c12673.m31447() / 6) {
            throw new IOException("Invalid class count");
        }
        this.f22307 = new String[i2];
        this.f22305 = new int[i2];
        this.f22308 = new int[i2];
        this.f22306 = new HashMap(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c12673.readInt();
            int unsignedByte = c12673.readUnsignedByte();
            if (unsignedByte < 1 || unsignedByte > 3) {
                throw new IOException("Invalid class source");
            }
            String strM31444 = c12673.m31444();
            this.f22307[i3] = "L" + strM31444.replace('.', '/') + ';';
            if (strM31444.isEmpty() || this.f22306.put(this.f22307[i3], Integer.valueOf(i3)) != null) {
                throw new IOException("Invalid or duplicate class name");
            }
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.f22305[i4] = c12673.position();
            c12673.m31449(false);
            c12673.m31445(0, false);
            int unsignedShort = c12673.readUnsignedShort();
            for (int i5 = 0; i5 < unsignedShort; i5++) {
                c12673.m31446(false);
            }
        }
        if (c12673.m31447() != 0) {
            throw new IOException("Trailing embedded class set data");
        }
        int i6 = this.f22309;
        int i7 = this.f22311;
        C12672 c12674 = new C12672(this, i6 + i7, (bArr.length - i6) - i7);
        for (int i8 = 0; i8 < i2; i8++) {
            this.f22308[i8] = c12674.position();
            for (int i9 = 0; i9 < 2; i9++) {
                int unsignedShort2 = c12674.readUnsignedShort();
                for (int i10 = 0; i10 < unsignedShort2; i10++) {
                    String strM31448 = c12674.m31448();
                    int unsignedShort3 = c12674.readUnsignedShort();
                    if (i9 == 0) {
                        if (strM31448.indexOf(58) <= 0) {
                            throw new IOException("Invalid supplemental member");
                        }
                    } else {
                        if (strM31448.indexOf(40) <= 0 || (unsignedShort3 & 66) != 64) {
                            throw new IOException("Invalid supplemental member");
                        }
                    }
                }
            }
        }
        if (c12674.m31447() != 0) {
            throw new IOException("Trailing shared class set data");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteArrayInputStream m18721() {
        return new ByteArrayInputStream(this.f22310, this.f22309, this.f22311);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3723 m18722(String str) throws IOException {
        Integer num = (Integer) this.f22306.get(str);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        int[] iArr = this.f22305;
        C12672 c12672 = new C12672(this, iArr[iIntValue], (this.f22309 + this.f22311) - iArr[num.intValue()]);
        List listM31449 = c12672.m31449(true);
        c12672.m31445(0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int unsignedShort = c12672.readUnsignedShort();
        for (int i = 0; i < unsignedShort; i++) {
            C20877 c20877M31446 = c12672.m31446(true);
            String str2 = c20877M31446.f66826;
            (((c20877M31446.f66825 & 10) != 0 || str2.startsWith("<init>(") || str2.startsWith("<clinit>(")) ? arrayList : arrayList2).add(str2);
        }
        int iIntValue2 = num.intValue();
        int[] iArr2 = this.f22308;
        C12672 c12673 = new C12672(this, iArr2[iIntValue2], this.f22310.length - iArr2[num.intValue()]);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int unsignedShort2 = c12673.readUnsignedShort();
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            ((c12673.readUnsignedShort() & 8) != 0 ? arrayList3 : arrayList4).add(c12673.m31448());
        }
        int unsignedShort3 = c12673.readUnsignedShort();
        for (int i3 = 0; i3 < unsignedShort3; i3++) {
            String strM31448 = c12673.m31448();
            (((c12673.readUnsignedShort() & 10) != 0 || strM31448.startsWith("<init>(") || strM31448.startsWith("<clinit>(")) ? arrayList : arrayList2).add(strM31448);
        }
        return new C3723(str, listM31449, arrayList3, arrayList4, arrayList, arrayList2);
    }
}
