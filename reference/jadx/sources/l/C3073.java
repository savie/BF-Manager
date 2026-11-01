package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۗۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3073 {

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11569;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20008 f11570;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f11573;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C3073 f11574;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19074 f11576;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f11577;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11583;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3964 f11584;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f11585;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f11589;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public Runnable f11590;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11592;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC10130 f11593;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public String f11598;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10130 f11600;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public RunnableC14364 f11602;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f11603;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C7930 f11604;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11606;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f11607;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f11609;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f11611;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC3964 f11615;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public Socket f11620;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC1142 f11621;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f11624;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1142 f11626;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11630;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14904 f11631;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C7307 f11632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f11633;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C0168 f11634;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f11581 = "SSH-2.0-JSCH_2.27.6".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f11616 = 0;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f11628 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String[] f11637 = null;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11586 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f11571 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f11619 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f11605 = true;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11610 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11617 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f11587 = true;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11594 = false;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11578 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Thread f11629 = null;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public Object f11582 = new Object();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f11580 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f11635 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Hashtable f11591 = null;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f11572 = 1;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f11618 = null;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11588 = false;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f11608 = 0;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f11636 = 6;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11613 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11622 = null;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ThreadFactoryC23536 f11638 = new ThreadFactoryC23536();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11627 = false;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f11625 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f11595 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11597 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11579 = false;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f11614 = null;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int[] f11612 = new int[1];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f11599 = new int[1];

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f11596 = 8;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f11623 = 8;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9425 f11601 = new C9425();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17807 f11575 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9235(C3073 c3073) {
        this.f11574 = c3073;
    }

    public C3073(C0168 c0168, String str, String str2, int i) throws C5813 {
        String property = null;
        this.f11611 = "127.0.0.1";
        this.f11624 = 22;
        this.f11598 = null;
        this.f11634 = c0168;
        C14904 c14904 = new C14904();
        this.f11631 = c14904;
        this.f11632 = new C7307(c14904);
        this.f11598 = str;
        this.f11611 = str2;
        this.f11624 = i;
        if (str == null) {
            try {
                property = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
            this.f11598 = property;
        }
        if (this.f11598 == null) {
            throw new C5813("username is not given.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9233(Runnable runnable) {
        this.f11590 = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c3, code lost:
    
        r14.f11597 = false;
        r14.f11579 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9232() throws l.C5813 {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3073.m9232():void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC11541 m9221(C14904 c14904) throws C5813 {
        boolean z;
        int iM35638 = c14904.m35638();
        boolean z2 = true;
        if (iM35638 != c14904.m35626()) {
            c14904.m35629();
            this.f11633 = new byte[c14904.f48681 - 5];
        } else {
            this.f11633 = new byte[(iM35638 - 1) - c14904.m35629()];
        }
        byte[] bArr = c14904.f48679;
        int i = c14904.f48680;
        byte[] bArr2 = this.f11633;
        int i2 = 0;
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        if (this.f11610) {
            if (this.f11587 || this.f11594) {
                C14904 c14905 = new C14904(this.f11633);
                c14905.f48680 = 17;
                byte[] bArrM35628 = c14905.m35628();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= bArrM35628.length) {
                        z = false;
                        break;
                    }
                    while (i3 < bArrM35628.length && bArrM35628[i3] != 44) {
                        i3++;
                    }
                    if (i4 != i3 && "kex-strict-s-v00@openssh.com".equals(C8491.m22168(i4, i3 - i4, bArrM35628))) {
                        z = true;
                        break;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                }
                this.f11617 = z;
                if (this.f11617) {
                    this.f11634.m1333().getClass();
                    if (this.f11616 != 1) {
                        throw new C9342("KEXINIT not first packet from server");
                    }
                } else if (this.f11594) {
                    throw new C9342("Strict KEX not supported by server");
                }
            }
            if (this.f11619) {
                C14904 c14906 = new C14904(this.f11633);
                c14906.f48680 = 17;
                byte[] bArrM35629 = c14906.m35628();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= bArrM35629.length) {
                        z2 = false;
                        break;
                    }
                    while (i5 < bArrM35629.length && bArrM35629[i5] != 44) {
                        i5++;
                    }
                    if (i6 != i5) {
                        if ("ext-info-s".equals(C8491.m22168(i6, i5 - i6, bArrM35629))) {
                            break;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    }
                }
                this.f11571 = z2;
                if (this.f11571) {
                    this.f11634.m1333().getClass();
                }
            }
        }
        if (!this.f11597) {
            m9224();
        }
        byte[] bArr3 = this.f11633;
        byte[] bArr4 = this.f11585;
        String[] strArr = new String[10];
        C14904 c14907 = new C14904(bArr3);
        c14907.f48680 = 17;
        C14904 c14908 = new C14904(bArr4);
        c14908.f48680 = 17;
        this.f11634.m1333().getClass();
        int i7 = 0;
        for (int i8 = 10; i7 < i8; i8 = 10) {
            byte[] bArrM356210 = c14907.m35628();
            byte[] bArrM356211 = c14908.m35628();
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArrM356211.length) {
                while (i9 < bArrM356211.length && bArrM356211[i9] != 44) {
                    i9++;
                }
                if (i10 == i9) {
                    int length = bArrM356211.length;
                    Charset charset = StandardCharsets.UTF_8;
                    throw new C16397(i7, new String(bArrM356211, i2, length, charset), new String(bArrM356210, i2, bArrM356210.length, charset));
                }
                String strM22168 = C8491.m22168(i10, i9 - i10, bArrM356211);
                int i11 = 0;
                int i12 = 0;
                while (i12 < bArrM356210.length) {
                    while (i12 < bArrM356210.length && bArrM356210[i12] != 44) {
                        i12++;
                    }
                    if (i11 == i12) {
                        int length2 = bArrM356211.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        throw new C16397(i7, new String(bArrM356211, 0, length2, charset2), new String(bArrM356210, 0, bArrM356210.length, charset2));
                    }
                    if (strM22168.equals(C8491.m22168(i11, i12 - i11, bArrM356210))) {
                        strArr[i7] = strM22168;
                        break;
                    }
                    i12++;
                    i11 = i12;
                }
                i2 = 0;
                i10 = i9 + 1;
                i9 = i10;
            }
            if (i9 == 0) {
                strArr[i7] = "";
            } else if (strArr[i7] == null) {
                int length3 = bArrM356211.length;
                Charset charset3 = StandardCharsets.UTF_8;
                throw new C16397(i7, new String(bArrM356211, 0, length3, charset3), new String(bArrM356210, 0, bArrM356210.length, charset3));
            }
            i7++;
            i2 = 0;
        }
        try {
            if (((InterfaceC1142) Class.forName(m9231(strArr[3])).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null)).mo2389()) {
                strArr[5] = null;
            }
            if (((InterfaceC1142) Class.forName(m9231(strArr[2])).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null)).mo2389()) {
                strArr[4] = null;
            }
            this.f11634.m1333().getClass();
            this.f11637 = strArr;
            if (strArr[0].equals("ext-info-c") || this.f11637[0].equals("ext-info-s") || this.f11637[0].equals("kex-strict-c-v00@openssh.com") || this.f11637[0].equals("kex-strict-s-v00@openssh.com")) {
                throw new C5813("Invalid Kex negotiated: " + this.f11637[0]);
            }
            if (!this.f11578 && (this.f11637[2].equals("none") || this.f11637[3].equals("none"))) {
                throw new C5813("NONE Cipher should not be chosen before authentification is successed.");
            }
            try {
                AbstractC11541 abstractC11541 = (AbstractC11541) Class.forName(m9231(this.f11637[0])).asSubclass(AbstractC11541.class).getDeclaredConstructor(null).newInstance(null);
                byte[] bArr5 = this.f11589;
                byte[] bArr6 = this.f11581;
                byte[] bArr7 = this.f11633;
                byte[] bArr8 = this.f11585;
                abstractC11541.f38778 = this;
                abstractC11541.mo3494(this, bArr5, bArr6, bArr7, bArr8);
                return abstractC11541;
            } catch (Exception | LinkageError e) {
                throw new C5813(e.toString(), e);
            }
        } catch (Exception | LinkageError e2) {
            throw new C5813(e2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String[] m9245() {
        return this.f11614;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m9224() throws C5813 {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        if (this.f11597) {
            return;
        }
        String strM9231 = m9231("cipher.c2s");
        String strM9232 = m9231("cipher.s2c");
        String strM9233 = m9231("CheckCiphers");
        C0168 c0168 = this.f11634;
        int i = -1;
        if (strM9233 == null || strM9233.length() == 0) {
            strArr = null;
        } else {
            c0168.m1333().getClass();
            String strM9234 = m9231("cipher.c2s");
            String strM9235 = m9231("cipher.s2c");
            Vector vector = new Vector();
            for (String str : C8491.m22177(strM9233)) {
                if ((strM9235.indexOf(str) != -1 || strM9234.indexOf(str) != -1) && !m9213(m9231(str))) {
                    vector.addElement(str);
                }
            }
            if (vector.size() == 0) {
                strArr = null;
            } else {
                strArr = new String[vector.size()];
                System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
                c0168.m1333().getClass();
            }
        }
        if (strArr != null && strArr.length > 0) {
            this.f11634.m1333().getClass();
            strM9231 = C8491.m22169(strM9231, strArr);
            strM9232 = C8491.m22169(strM9232, strArr);
            if (strM9231 == null || strM9232 == null) {
                throw new C5813("There are not any available ciphers.");
            }
            this.f11634.m1333().getClass();
        }
        String str2 = strM9232;
        String strM9236 = m9231("mac.c2s");
        String strM9237 = m9231("mac.s2c");
        String strM9238 = m9231("CheckMacs");
        C0168 c0169 = this.f11634;
        if (strM9238 == null || strM9238.length() == 0) {
            strArr2 = null;
        } else {
            c0169.m1333().getClass();
            String strM9239 = m9231("mac.c2s");
            String strM92310 = m9231("mac.s2c");
            Vector vector2 = new Vector();
            String[] strArrM22177 = C8491.m22177(strM9238);
            int i2 = 0;
            while (i2 < strArrM22177.length) {
                String str3 = strArrM22177[i2];
                if (strM92310.indexOf(str3) != i || strM9239.indexOf(str3) != i) {
                    try {
                        InterfaceC10130 interfaceC10130 = (InterfaceC10130) Class.forName(m9231(str3)).asSubclass(InterfaceC10130.class).getDeclaredConstructor(null).newInstance(null);
                        interfaceC10130.init(new byte[interfaceC10130.getBlockSize()]);
                    } catch (Exception | LinkageError unused) {
                        vector2.addElement(str3);
                    }
                }
                i2++;
                i = -1;
            }
            if (vector2.size() == 0) {
                strArr2 = null;
            } else {
                strArr2 = new String[vector2.size()];
                System.arraycopy(vector2.toArray(), 0, strArr2, 0, vector2.size());
                c0169.m1333().getClass();
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            this.f11634.m1333().getClass();
            String strM22169 = C8491.m22169(strM9236, strArr2);
            String strM221610 = C8491.m22169(strM9237, strArr2);
            if (strM22169 == null || strM221610 == null) {
                throw new C5813("There are not any available macs.");
            }
            this.f11634.m1333().getClass();
        }
        String strM92311 = m9231("kex");
        String strM92312 = m9231("CheckKexes");
        C0168 c01610 = this.f11634;
        if (strM92312 == null || strM92312.length() == 0) {
            strArr3 = null;
        } else {
            c01610.m1333().getClass();
            Vector vector3 = new Vector();
            String[] strArrM22178 = C8491.m22177(strM92312);
            for (int i3 = 0; i3 < strArrM22178.length; i3++) {
                try {
                    AbstractC11541 abstractC11541 = (AbstractC11541) Class.forName(m9231(strArrM22178[i3])).asSubclass(AbstractC11541.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC11541.f38778 = this;
                    abstractC11541.mo3494(this, null, null, null, null);
                } catch (Exception | LinkageError unused2) {
                    vector3.addElement(strArrM22178[i3]);
                }
            }
            if (vector3.size() == 0) {
                strArr3 = null;
            } else {
                strArr3 = new String[vector3.size()];
                System.arraycopy(vector3.toArray(), 0, strArr3, 0, vector3.size());
                c01610.m1333().getClass();
            }
        }
        if (strArr3 != null && strArr3.length > 0) {
            this.f11634.m1333().getClass();
            strM92311 = C8491.m22169(strM92311, strArr3);
            if (strM92311 == null) {
                throw new C5813("There are not any available kexes.");
            }
            this.f11634.m1333().getClass();
        }
        if (this.f11619 && !this.f11578) {
            strM92311 = C15489.m37076(strM92311, ",ext-info-c");
        }
        if ((this.f11587 || this.f11594) && this.f11610) {
            strM92311 = C15489.m37076(strM92311, ",kex-strict-c-v00@openssh.com");
        }
        String strM92313 = m9231("server_host_key");
        String strM92314 = m9231("CheckSignatures");
        C0168 c01611 = this.f11634;
        if (strM92314 == null || strM92314.length() == 0) {
            strArr4 = null;
        } else {
            c01611.m1333().getClass();
            Vector vector4 = new Vector();
            String[] strArrM22179 = C8491.m22177(strM92314);
            for (int i4 = 0; i4 < strArrM22179.length; i4++) {
                try {
                    ((InterfaceC2845) Class.forName(C0168.m1327(strArrM22179[i4])).asSubclass(InterfaceC2845.class).getDeclaredConstructor(null).newInstance(null)).init();
                } catch (Exception | LinkageError unused3) {
                    vector4.addElement(strArrM22179[i4]);
                }
            }
            if (vector4.size() == 0) {
                strArr4 = null;
            } else {
                strArr4 = new String[vector4.size()];
                System.arraycopy(vector4.toArray(), 0, strArr4, 0, vector4.size());
                c01611.m1333().getClass();
            }
        }
        this.f11614 = strArr4;
        if (strArr4 != null && strArr4.length > 0) {
            this.f11634.m1333().getClass();
            strM92313 = C8491.m22169(strM92313, strArr4);
            if (strM92313 == null) {
                throw new C5813("There are not any available sig algorithm.");
            }
            this.f11634.m1333().getClass();
        }
        if (m9231("prefer_known_host_key_types").equals("yes")) {
            this.f11634.m1333().getClass();
            InterfaceC18513 interfaceC18513M1329 = this.f11634.m1329();
            String string = this.f11611;
            if (this.f11624 != 22) {
                StringBuilder sbM30914 = C12441.m30914("[", string, "]:");
                sbM30914.append(this.f11624);
                string = sbM30914.toString();
            }
            C17807[] c17807ArrM21109 = ((C8013) interfaceC18513M1329).m21109(string, (String) null);
            if (c17807ArrM21109.length > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(Arrays.asList(C8491.m22177(strM92313)));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String str5 = (str4.equals("rsa-sha2-256") || str4.equals("rsa-sha2-512") || str4.equals("ssh-rsa-sha224@ssh.com") || str4.equals("ssh-rsa-sha256@ssh.com") || str4.equals("ssh-rsa-sha384@ssh.com") || str4.equals("ssh-rsa-sha512@ssh.com")) ? OpenSSHPublicKeyUtil.RSA : str4;
                    for (C17807 c17807 : c17807ArrM21109) {
                        if (c17807.m41394().equals(str5)) {
                            arrayList.add(str4);
                            it.remove();
                            break;
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    arrayList.addAll(arrayList2);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ",");
                            }
                        }
                    }
                    strM92313 = sb.toString();
                }
            }
            this.f11634.m1333().getClass();
        }
        this.f11608 = System.currentTimeMillis();
        this.f11597 = true;
        C14904 c14904 = new C14904();
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 20);
        synchronized (f11570) {
            f11570.mo26724(c14904.f48681, 16, c14904.f48679);
            c14904.m35639(16);
        }
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627(C8491.m22175(strM92311, charset));
        c14904.m35627(C8491.m22175(strM92313, charset));
        c14904.m35627(C8491.m22175(strM9231, charset));
        c14904.m35627(C8491.m22175(str2, charset));
        c14904.m35627(C8491.m22175(m9231("mac.c2s"), charset));
        c14904.m35627(C8491.m22175(m9231("mac.s2c"), charset));
        c14904.m35627(C8491.m22175(m9231("compression.c2s"), charset));
        c14904.m35627(C8491.m22175(m9231("compression.s2c"), charset));
        c14904.m35627(C8491.m22175(m9231("lang.c2s"), charset));
        c14904.m35627(C8491.m22175(m9231("lang.s2c"), charset));
        c14904.m35630((byte) 0);
        c14904.m35644(0);
        c14904.f48680 = 5;
        int iM35626 = c14904.m35626();
        byte[] bArr = new byte[iM35626];
        this.f11585 = bArr;
        c14904.m35632(0, iM35626, bArr);
        m9249(c7307);
        this.f11634.m1333().getClass();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m9225() throws C5813 {
        C7307 c7307 = this.f11632;
        c7307.m19501();
        this.f11631.m35630((byte) 7);
        this.f11631.m35644(1);
        C14904 c14904 = this.f11631;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627(C8491.m22175("ext-info-in-auth@openssh.com", charset));
        this.f11631.m35627(C8491.m22175("0", charset));
        m9249(c7307);
        this.f11634.m1333().getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9215(String str, int i, AbstractC11541 abstractC11541) throws C2990, C17102, C14281 {
        C8013 c8013;
        int iM21107;
        boolean z;
        String strM9231 = m9231("StrictHostKeyChecking");
        byte[] bArr = abstractC11541.f38779;
        String strM28720 = abstractC11541.m28720();
        InterfaceC21335 interfaceC21335 = null;
        try {
            interfaceC21335 = (InterfaceC21335) Class.forName(abstractC11541.f38778.m9231(abstractC11541.f38778.m9231("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC11541.f38778.f11634.m1333().getClass();
        }
        String strM22170 = C8491.m22170(interfaceC21335, abstractC11541.f38779);
        String str2 = i != 22 ? "[" + str + "]:" + i : str;
        InterfaceC18513 interfaceC18513M1329 = this.f11634.m1329();
        if (m9231("HashKnownHosts").equals("yes") && C6009.m16315(interfaceC18513M1329)) {
            C18596 c18596 = new C18596((C8013) interfaceC18513M1329, "", str2, 0, bArr, null);
            c18596.m42996();
            this.f11575 = c18596;
        } else {
            this.f11575 = new C17807(str2, 0, bArr);
        }
        synchronized (interfaceC18513M1329) {
            c8013 = (C8013) interfaceC18513M1329;
            iM21107 = c8013.m21107(str2, bArr);
        }
        if ((strM9231.equals("ask") || strM9231.equals("yes")) && iM21107 == 2) {
            synchronized (interfaceC18513M1329) {
            }
            if (this.f11576 != null) {
                if (strM9231.equals("ask")) {
                    this.f11576.getClass();
                    synchronized (interfaceC18513M1329) {
                        c8013.m21110(str2, abstractC11541.m28718());
                    }
                    z = true;
                } else {
                    this.f11576.getClass();
                }
            }
            throw new C17102(C0252.m1693("HostKey has been changed: ", str2));
        }
        z = false;
        if ((strM9231.equals("ask") || strM9231.equals("yes")) && iM21107 != 0 && !z) {
            if (strM9231.equals("yes")) {
                throw new C2990(C0252.m1693("reject HostKey: ", str2));
            }
            if (this.f11576 == null) {
                if (iM21107 != 1) {
                    throw new C17102(C0252.m1693("HostKey has been changed: ", str2));
                }
                StringBuilder sbM30515 = C12278.m30515("UnknownHostKey: ", str2, ". ", strM28720, " key fingerprint is ");
                sbM30515.append(strM22170);
                throw new C2990(sbM30515.toString());
            }
            z = true;
        }
        if (strM9231.equals("no") && 1 == iM21107) {
            z = true;
        }
        if (iM21107 == 0) {
            C17807[] c17807ArrM21109 = c8013.m21109(str2, abstractC11541.m28718());
            byte[] bArrM22176 = C8491.m22176(bArr, bArr.length, true);
            String str3 = new String(bArrM22176, 0, bArrM22176.length, StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < c17807ArrM21109.length; i2++) {
                byte[] bArr2 = c17807ArrM21109[i2].f56433;
                byte[] bArrM22177 = C8491.m22176(bArr2, bArr2.length, true);
                if (new String(bArrM22177, 0, bArrM22177.length, StandardCharsets.UTF_8).equals(str3) && c17807ArrM21109[i2].f56432.equals("@revoked")) {
                    this.f11634.m1333().getClass();
                    throw new C14281(C0252.m1693("revoked HostKey: ", str2));
                }
            }
        }
        if (iM21107 == 0) {
            this.f11634.m1333().getClass();
        }
        if (z) {
            this.f11634.m1333().getClass();
        }
        if (z) {
            synchronized (interfaceC18513M1329) {
                c8013.m21108(this.f11575, this.f11576);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7848 m9246(String str) throws C5813 {
        if (!this.f11586) {
            throw new C5813("session is down");
        }
        try {
            AbstractC7848 abstractC7848M9219 = m9219(str);
            if (abstractC7848M9219 != null) {
                abstractC7848M9219.mo12933();
                if (abstractC7848M9219 instanceof C17020) {
                    this.f11634.getClass();
                }
                return abstractC7848M9219;
            }
            this.f11634.m1333().getClass();
            return null;
        } catch (Exception unused) {
            this.f11634.m1333().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9236(C7307 c7307) {
        InterfaceC10130 interfaceC10130;
        InterfaceC3964 interfaceC3964 = this.f11615;
        boolean z = false;
        if (interfaceC3964 != null) {
            C14904 c14904 = c7307.f24279;
            int i = c14904.f48681;
            int[] iArr = this.f11599;
            iArr[0] = i;
            c14904.f48679 = interfaceC3964.mo11451(c14904.f48679, iArr);
            c7307.f24279.f48681 = iArr[0];
        }
        InterfaceC1142 interfaceC1142 = this.f11621;
        int i2 = interfaceC1142 != null ? this.f11623 : 8;
        boolean z2 = interfaceC1142 != null && interfaceC1142.mo2390();
        InterfaceC1142 interfaceC1143 = this.f11621;
        boolean z3 = interfaceC1143 != null && interfaceC1143.mo2389();
        boolean z4 = (z2 || z3 || this.f11621 == null || (interfaceC10130 = this.f11593) == null || !interfaceC10130.mo3163()) ? false : true;
        if (!z2 && !z3 && !z4) {
            z = true;
        }
        c7307.m19502(i2, z);
        C14904 c14905 = c7307.f24279;
        byte[] bArr = c14905.f48679;
        if (z2) {
            this.f11621.mo2384(this.f11628);
            this.f11621.mo2385(0, bArr, 4, bArr, 0);
            this.f11621.mo2392(0, bArr, c14905.f48681, bArr, 0);
            c14905.m35639(this.f11621.mo2391());
            return;
        }
        if (z3) {
            this.f11621.mo2387(bArr);
            this.f11621.mo2392(4, bArr, c14905.f48681 - 4, bArr, 4);
            c14905.m35639(this.f11621.mo2391());
            return;
        }
        if (z4) {
            this.f11621.mo2385(4, bArr, c14905.f48681 - 4, bArr, 4);
            this.f11593.mo3161(this.f11628);
            this.f11593.mo3162(c14905.f48681, c14905.f48679);
            this.f11593.mo3164(c14905.f48681, c14905.f48679);
            c14905.m35639(this.f11593.getBlockSize());
            return;
        }
        InterfaceC10130 interfaceC10131 = this.f11593;
        if (interfaceC10131 != null) {
            interfaceC10131.mo3161(this.f11628);
            this.f11593.mo3162(c14905.f48681, c14905.f48679);
            this.f11593.mo3164(c14905.f48681, c14905.f48679);
        }
        InterfaceC1142 interfaceC1144 = this.f11621;
        if (interfaceC1144 != null) {
            interfaceC1144.mo2385(0, bArr, c14905.f48681, bArr, 0);
        }
        InterfaceC10130 interfaceC10132 = this.f11593;
        if (interfaceC10132 != null) {
            c14905.m35639(interfaceC10132.getBlockSize());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC7848 m9214(int i) {
        Lock lock = this.f11595.readLock();
        lock.lock();
        try {
            for (AbstractC7848 abstractC7848 : this.f11625) {
                if (abstractC7848.f25814 == i) {
                    return abstractC7848;
                }
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9239(C14904 c14904) throws IOException {
        char c;
        boolean z;
        InterfaceC10130 interfaceC10130;
        InterfaceC1142 interfaceC1142 = this.f11626;
        char c2 = 1;
        boolean z2 = interfaceC1142 != null && interfaceC1142.mo2390();
        InterfaceC1142 interfaceC1143 = this.f11626;
        boolean z3 = interfaceC1143 != null && interfaceC1143.mo2389();
        boolean z4 = (z2 || z3 || this.f11626 == null || (interfaceC10130 = this.f11600) == null || !interfaceC10130.mo3163()) ? false : true;
        while (true) {
            c14904.m35650();
            if (z2) {
                this.f11604.m20933(c14904.f48681, 4, c14904.f48679);
                c14904.f48681 += 4;
                this.f11626.mo2384(this.f11616);
                byte[] bArr = new byte[4];
                this.f11626.mo2385(0, c14904.f48679, 4, bArr, 0);
                int i = ((bArr[c2] << 16) & 16711680) | ((bArr[0] << 24) & (-16777216)) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
                if (i < 5 || i > 262144) {
                    break;
                }
                int iMo2391 = this.f11626.mo2391() + i;
                int i2 = c14904.f48681;
                int i3 = i2 + iMo2391;
                byte[] bArr2 = c14904.f48679;
                if (i3 > bArr2.length) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i2);
                    c14904.f48679 = bArr3;
                }
                if (iMo2391 % this.f11596 != 0) {
                    this.f11634.m1333().getClass();
                    m9217(c14904, this.f11626, this.f11600, 0, 262144 - this.f11596);
                    throw null;
                }
                this.f11604.m20933(c14904.f48681, iMo2391, c14904.f48679);
                int iMo2392 = iMo2391 - this.f11626.mo2391();
                c14904.f48681 += iMo2392;
                try {
                    InterfaceC1142 interfaceC1144 = this.f11626;
                    byte[] bArr4 = c14904.f48679;
                    interfaceC1144.mo2392(0, bArr4, iMo2392 + 4, bArr4, 0);
                    System.arraycopy(bArr, 0, c14904.f48679, 0, 4);
                } catch (AEADBadTagException e) {
                    throw new C5813("Packet corrupt", e);
                }
            } else if (z3 || z4) {
                this.f11604.m20933(c14904.f48681, 4, c14904.f48679);
                c14904.f48681 += 4;
                byte[] bArr5 = c14904.f48679;
                int iMo2393 = (65280 & (bArr5[2] << 8)) | (16711680 & (bArr5[1] << 16)) | ((-16777216) & (bArr5[0] << 24)) | (bArr5[3] & 255);
                if (iMo2393 < 5 || iMo2393 > 262144) {
                    m9217(c14904, this.f11626, this.f11600, 0, 262144);
                    throw null;
                }
                if (z3) {
                    iMo2393 += this.f11626.mo2391();
                }
                int i4 = iMo2393;
                int i5 = c14904.f48681;
                int i6 = i5 + i4;
                byte[] bArr6 = c14904.f48679;
                if (i6 > bArr6.length) {
                    byte[] bArr7 = new byte[i6];
                    System.arraycopy(bArr6, 0, bArr7, 0, i5);
                    c14904.f48679 = bArr7;
                }
                if (i4 % this.f11596 != 0) {
                    this.f11634.m1333().getClass();
                    m9217(c14904, this.f11626, this.f11600, 0, 262144 - this.f11596);
                    throw null;
                }
                this.f11604.m20933(c14904.f48681, i4, c14904.f48679);
                c14904.f48681 += i4;
                if (z3) {
                    try {
                        this.f11626.mo2387(c14904.f48679);
                        InterfaceC1142 interfaceC1145 = this.f11626;
                        byte[] bArr8 = c14904.f48679;
                        interfaceC1145.mo2392(4, bArr8, i4, bArr8, 4);
                        c14904.f48681 -= this.f11626.mo2391();
                    } catch (AEADBadTagException e2) {
                        throw new C5813("Packet corrupt", e2);
                    }
                } else {
                    this.f11600.mo3161(this.f11616);
                    this.f11600.mo3162(c14904.f48681, c14904.f48679);
                    this.f11600.mo3164(0, this.f11592);
                    C7930 c7930 = this.f11604;
                    byte[] bArr9 = this.f11630;
                    c7930.m20933(0, bArr9.length, bArr9);
                    if (!C8491.m22183(this.f11592, this.f11630)) {
                        throw new C5813("Packet corrupt");
                    }
                    InterfaceC1142 interfaceC1146 = this.f11626;
                    byte[] bArr10 = c14904.f48679;
                    interfaceC1146.mo2385(4, bArr10, i4, bArr10, 4);
                }
            } else {
                this.f11604.m20933(c14904.f48681, this.f11596, c14904.f48679);
                int i7 = c14904.f48681;
                int i8 = this.f11596;
                c14904.f48681 = i7 + i8;
                InterfaceC1142 interfaceC1147 = this.f11626;
                if (interfaceC1147 != null) {
                    byte[] bArr11 = c14904.f48679;
                    interfaceC1147.mo2385(0, bArr11, i8, bArr11, 0);
                }
                byte[] bArr12 = c14904.f48679;
                int i9 = (65280 & (bArr12[2] << 8)) | (16711680 & (bArr12[1] << 16)) | ((-16777216) & (bArr12[0] << 24)) | (bArr12[3] & 255);
                if (i9 < 5 || i9 > 262144) {
                    m9217(c14904, this.f11626, this.f11600, 0, 262144);
                    throw null;
                }
                int i10 = (i9 + 4) - this.f11596;
                int i11 = c14904.f48681;
                int i12 = i11 + i10;
                if (i12 > bArr12.length) {
                    byte[] bArr13 = new byte[i12];
                    System.arraycopy(bArr12, 0, bArr13, 0, i11);
                    c14904.f48679 = bArr13;
                }
                if (i10 % this.f11596 != 0) {
                    this.f11634.m1333().getClass();
                    m9217(c14904, this.f11626, this.f11600, 0, 262144 - this.f11596);
                    throw null;
                }
                if (i10 > 0) {
                    this.f11604.m20933(c14904.f48681, i10, c14904.f48679);
                    c14904.f48681 += i10;
                    InterfaceC1142 interfaceC1148 = this.f11626;
                    if (interfaceC1148 != null) {
                        byte[] bArr14 = c14904.f48679;
                        int i13 = this.f11596;
                        interfaceC1148.mo2385(i13, bArr14, i10, bArr14, i13);
                    }
                }
                InterfaceC10130 interfaceC10131 = this.f11600;
                if (interfaceC10131 != null) {
                    interfaceC10131.mo3161(this.f11616);
                    this.f11600.mo3162(c14904.f48681, c14904.f48679);
                    this.f11600.mo3164(0, this.f11592);
                    C7930 c7931 = this.f11604;
                    byte[] bArr15 = this.f11630;
                    c7931.m20933(0, bArr15.length, bArr15);
                    if (!C8491.m22183(this.f11592, this.f11630)) {
                        int i14 = this.f11596;
                        if (i10 + i14 > 262144) {
                            throw new IOException("MAC Error");
                        }
                        m9217(c14904, this.f11626, this.f11600, c14904.f48681, (262144 - i10) - i14);
                        throw null;
                    }
                }
                c14904 = c14904;
            }
            int i15 = this.f11616 + 1;
            this.f11616 = i15;
            if (i15 == 0 && ((this.f11587 || this.f11594) && this.f11610)) {
                throw new C9342("incoming sequence number wrapped during initial KEX");
            }
            InterfaceC3964 interfaceC3964 = this.f11584;
            if (interfaceC3964 != null) {
                byte[] bArr16 = c14904.f48679;
                byte b = bArr16[4];
                int[] iArr = this.f11612;
                c = 5;
                iArr[0] = (c14904.f48681 - 5) - b;
                byte[] bArrMo11450 = interfaceC3964.mo11450(bArr16, iArr);
                if (bArrMo11450 != null) {
                    c14904.f48679 = bArrMo11450;
                    c14904.f48681 = this.f11612[0] + 5;
                } else {
                    this.f11634.m1333().getClass();
                }
                c14904.f48680 = 0;
                return;
            }
            c = 5;
            int i16 = c14904.f48679[c] & 255;
            if (i16 == 1) {
                c14904.f48680 = 0;
                c14904.m35638();
                c14904.m35642();
                int iM35638 = c14904.m35638();
                byte[] bArrM35628 = c14904.m35628();
                byte[] bArrM35629 = c14904.m35628();
                int length = bArrM35628.length;
                Charset charset = StandardCharsets.UTF_8;
                throw new C1579("SSH_MSG_DISCONNECT: " + iM35638 + " " + new String(bArrM35628, 0, length, charset) + " " + new String(bArrM35629, 0, bArrM35629.length, charset));
            }
            if (!this.f11610 || !this.f11617) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        c14904.f48680 = 0;
                        c14904.m35638();
                        c14904.m35642();
                        c14904.m35638();
                        this.f11634.m1333().getClass();
                    } else if (i16 == 4) {
                        c14904.f48680 = 0;
                        c14904.m35638();
                        c14904.m35642();
                    } else if (i16 == 93) {
                        c14904.f48680 = 0;
                        c14904.m35638();
                        c14904.m35642();
                        AbstractC7848 abstractC7848M9214 = m9214(c14904.m35638());
                        if (abstractC7848M9214 != null) {
                            abstractC7848M9214.m20732(c14904.m35637());
                        }
                    } else if (i16 == 7) {
                        c14904.f48680 = 0;
                        c14904.m35638();
                        c14904.m35642();
                        if (!this.f11619 || this.f11578 || this.f11597) {
                            this.f11634.m1333().getClass();
                            z = true;
                        } else {
                            this.f11634.m1333().getClass();
                            z = false;
                        }
                        long jM35637 = c14904.m35637();
                        for (long j = 0; j < jM35637; j++) {
                            byte[] bArrM356210 = c14904.m35628();
                            byte[] bArrM356211 = c14904.m35628();
                            if (!z) {
                                int length2 = bArrM356210.length;
                                Charset charset2 = StandardCharsets.UTF_8;
                                if (new String(bArrM356210, 0, length2, charset2).equals("server-sig-algs")) {
                                    String str = new String(bArrM356211, 0, bArrM356211.length, charset2);
                                    this.f11634.m1333().getClass();
                                    if (this.f11588) {
                                        str = !str.isEmpty() ? str.concat(",rsa-sha2-256,rsa-sha2-512") : "rsa-sha2-256,rsa-sha2-512";
                                        this.f11634.m1333().getClass();
                                    }
                                    this.f11618 = C8491.m22177(str);
                                }
                            }
                        }
                    } else if (i16 == 52) {
                        this.f11578 = true;
                        if (this.f11584 == null && this.f11615 == null) {
                            m9226(this.f11637[6]);
                            m9212(this.f11637[7]);
                        }
                    }
                }
                c2 = 1;
            }
            c14904.f48680 = 0;
            return;
        }
        m9217(c14904, this.f11626, this.f11600, 0, 262144);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9217(C14904 c14904, InterfaceC1142 interfaceC1142, InterfaceC10130 interfaceC10130, int i, int i2) throws C5813 {
        IOException e;
        if (interfaceC1142.mo2388() && (interfaceC10130 == null || !interfaceC10130.mo3163())) {
            if (interfaceC10130 != null) {
                interfaceC10130.mo3161(this.f11616);
                interfaceC10130.mo3162(i, c14904.f48679);
            }
            while (i2 > 0) {
                try {
                    c14904.m35650();
                    byte[] bArr = c14904.f48679;
                    int length = i2 > bArr.length ? bArr.length : i2;
                    this.f11604.m20933(0, length, bArr);
                    if (interfaceC10130 != null) {
                        interfaceC10130.mo3162(length, c14904.f48679);
                    }
                    i2 -= length;
                } catch (IOException e2) {
                    e = e2;
                    this.f11634.m1333().getClass();
                }
            }
            e = null;
            if (interfaceC10130 != null) {
                interfaceC10130.mo3164(0, c14904.f48679);
            }
            C5813 c5813 = new C5813("Packet corrupt");
            if (e != null) {
                c5813.addSuppressed(e);
                throw c5813;
            }
            throw c5813;
        }
        throw new C5813("Packet corrupt");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m9250() {
        return this.f11606;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9216(AbstractC11541 abstractC11541) {
        try {
            m9222(abstractC11541);
            C8491.m22182(abstractC11541.f38780);
            abstractC11541.f38780 = null;
            this.f11597 = false;
            if (this.f11617) {
                this.f11616 = 0;
                this.f11634.m1333().getClass();
            }
        } catch (Throwable th) {
            C8491.m22182(abstractC11541.f38780);
            abstractC11541.f38780 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9222(AbstractC11541 abstractC11541) throws C5813 {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = abstractC11541.f38780;
        byte[] bArr4 = abstractC11541.f38777;
        InterfaceC21335 interfaceC21335 = abstractC11541.f38781;
        if (this.f11606 == null) {
            byte[] bArr5 = new byte[bArr4.length];
            this.f11606 = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        }
        this.f11631.m35650();
        this.f11631.m35646(bArr3);
        this.f11631.m35646(bArr4);
        this.f11631.m35630((byte) 65);
        this.f11631.m35646(this.f11606);
        C14904 c14904 = this.f11631;
        interfaceC21335.mo3065(c14904.f48681, c14904.f48679);
        this.f11603 = interfaceC21335.mo3066();
        C14904 c14905 = this.f11631;
        int i = c14905.f48681;
        int length = (i - this.f11606.length) - 1;
        byte[] bArr6 = c14905.f48679;
        bArr6[length] = (byte) (bArr6[length] + 1);
        interfaceC21335.mo3065(i, bArr6);
        this.f11577 = interfaceC21335.mo3066();
        C14904 c14906 = this.f11631;
        byte[] bArr7 = c14906.f48679;
        bArr7[length] = (byte) (bArr7[length] + 1);
        interfaceC21335.mo3065(c14906.f48681, bArr7);
        this.f11583 = interfaceC21335.mo3066();
        C14904 c14907 = this.f11631;
        byte[] bArr8 = c14907.f48679;
        bArr8[length] = (byte) (bArr8[length] + 1);
        interfaceC21335.mo3065(c14907.f48681, bArr8);
        this.f11609 = interfaceC21335.mo3066();
        C14904 c14908 = this.f11631;
        byte[] bArr9 = c14908.f48679;
        bArr9[length] = (byte) (bArr9[length] + 1);
        interfaceC21335.mo3065(c14908.f48681, bArr9);
        this.f11573 = interfaceC21335.mo3066();
        C14904 c14909 = this.f11631;
        byte[] bArr10 = c14909.f48679;
        bArr10[length] = (byte) (bArr10[length] + 1);
        interfaceC21335.mo3065(c14909.f48681, bArr10);
        this.f11607 = interfaceC21335.mo3066();
        try {
            this.f11626 = (InterfaceC1142) Class.forName(m9231(this.f11637[3])).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize = this.f11626.getBlockSize();
                bArr = this.f11609;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.f11631.m35650();
                C14904 c149010 = this.f11631;
                c149010.getClass();
                c149010.m35645(0, bArr3.length, bArr3);
                C14904 c149011 = this.f11631;
                c149011.getClass();
                c149011.m35645(0, bArr4.length, bArr4);
                this.f11631.m35646(this.f11609);
                C14904 c149012 = this.f11631;
                interfaceC21335.mo3065(c149012.f48681, c149012.f48679);
                byte[] bArrMo3066 = interfaceC21335.mo3066();
                byte[] bArr11 = this.f11609;
                byte[] bArr12 = new byte[bArr11.length + bArrMo3066.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(bArrMo3066, 0, bArr12, this.f11609.length, bArrMo3066.length);
                this.f11609 = bArr12;
            }
            this.f11626.mo2386(1, bArr, this.f11577);
            this.f11596 = this.f11626.mo2383();
            if (!this.f11626.mo2389()) {
                InterfaceC10130 interfaceC10130 = (InterfaceC10130) Class.forName(m9231(this.f11637[5])).asSubclass(InterfaceC10130.class).getDeclaredConstructor(null).newInstance(null);
                this.f11600 = interfaceC10130;
                byte[] bArrM9218 = m9218(this.f11631, bArr3, bArr4, this.f11607, interfaceC21335, interfaceC10130.getBlockSize());
                this.f11607 = bArrM9218;
                this.f11600.init(bArrM9218);
                this.f11592 = new byte[this.f11600.getBlockSize()];
                this.f11630 = new byte[this.f11600.getBlockSize()];
            }
            this.f11621 = (InterfaceC1142) Class.forName(m9231(this.f11637[2])).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize2 = this.f11621.getBlockSize();
                bArr2 = this.f11583;
                if (blockSize2 <= bArr2.length) {
                    break;
                }
                this.f11631.m35650();
                C14904 c149013 = this.f11631;
                c149013.getClass();
                c149013.m35645(0, bArr3.length, bArr3);
                C14904 c149014 = this.f11631;
                c149014.getClass();
                c149014.m35645(0, bArr4.length, bArr4);
                this.f11631.m35646(this.f11583);
                C14904 c149015 = this.f11631;
                interfaceC21335.mo3065(c149015.f48681, c149015.f48679);
                byte[] bArrMo3067 = interfaceC21335.mo3066();
                byte[] bArr13 = this.f11583;
                byte[] bArr14 = new byte[bArr13.length + bArrMo3067.length];
                System.arraycopy(bArr13, 0, bArr14, 0, bArr13.length);
                System.arraycopy(bArrMo3067, 0, bArr14, this.f11583.length, bArrMo3067.length);
                this.f11583 = bArr14;
            }
            this.f11621.mo2386(0, bArr2, this.f11603);
            this.f11623 = this.f11621.mo2383();
            if (!this.f11621.mo2389()) {
                InterfaceC10130 interfaceC10131 = (InterfaceC10130) Class.forName(m9231(this.f11637[4])).asSubclass(InterfaceC10130.class).getDeclaredConstructor(null).newInstance(null);
                this.f11593 = interfaceC10131;
                byte[] bArrM9219 = m9218(this.f11631, bArr3, bArr4, this.f11573, interfaceC21335, interfaceC10131.getBlockSize());
                this.f11573 = bArrM9219;
                this.f11593.init(bArrM9219);
            }
            m9226(this.f11637[6]);
            m9212(this.f11637[7]);
        } catch (Exception | LinkageError e) {
            if (!(e instanceof C5813)) {
                throw new C5813(e.toString(), e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m9218(C14904 c14904, byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC21335 interfaceC21335, int i) {
        int blockSize = interfaceC21335.getBlockSize();
        while (bArr3.length < i) {
            c14904.m35650();
            c14904.m35646(bArr);
            c14904.m35646(bArr2);
            c14904.m35645(0, bArr3.length, bArr3);
            interfaceC21335.mo3065(c14904.f48681, c14904.f48679);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(interfaceC21335.mo3066(), 0, bArr4, bArr3.length, blockSize);
            C8491.m22182(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r20.f25813 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (r20.m20735() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r20.f25823 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r7 = r20.f25823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r7 <= r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        if (r7 == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0087, code lost:
    
        r9 = (int) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        if (r18.f11621 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        r10 = r18.f11623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r11 = r18.f11593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        r11 = r11.getBlockSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        r12 = r19.f24279;
        r13 = r9 + 14;
        r15 = (-r13) & (r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r15 >= r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        r15 = r15 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        r10 = l.C8015.m21118(r13, r15, r11, 32);
        r11 = r12.f48679;
        r15 = r11.length;
        r14 = ((r12.f48681 + r10) - 14) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r15 >= r14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
    
        r14 = new byte[r14];
        java.lang.System.arraycopy(r11, 0, r14, 0, r11.length);
        r12.f48679 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r11 = r12.f48679;
        java.lang.System.arraycopy(r11, r13, r11, r10, (r12.f48681 - 14) - r9);
        r12.f48681 = 10;
        r12.m35644(r9);
        r12.f48681 = r13;
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r14 = 5;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r9 = r19.f24279.f48679[r14];
        r11 = r20.f25821;
        r6 = r6 - ((int) r7);
        r20.f25823 -= r7;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        r14 = 5;
        r11 = -1;
        r7 = false;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ed, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
    
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f0, code lost:
    
        m9220(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r6 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r7 = r19.f24279;
        r8 = r7.f48679;
        java.lang.System.arraycopy(r8, r10, r8, 14, r6);
        r7.f48679[r14] = r9;
        r7.f48681 = 6;
        r7.m35644(r11);
        r7.m35644(r6);
        r7.f48681 = r6 + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0112, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
    
        if (r18.f11597 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if (r20.f25823 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r20.f25823 -= r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0126, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012b, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        throw new java.io.IOException("channel is broken");
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9237(l.C7307 r19, l.AbstractC7848 r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3073.m9237(l.۟ۜᩳ, l.۠֨ᩳ, int):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9249(C7307 c7307) throws C5813 {
        long j = 0;
        while (this.f11597) {
            if (j <= 0 || System.currentTimeMillis() - this.f11608 <= j || this.f11579) {
                byte b = c7307.f24279.f48679[5];
                if (b == 20 || b == 21 || b == 30 || b == 31 || b == 31 || b == 32 || b == 33 || b == 34 || b == 1) {
                    break;
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new C5813("timeout in waiting for rekeying process.");
            }
        }
        m9220(c7307);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9220(C7307 c7307) {
        boolean z = this.f11610;
        boolean z2 = this.f11617;
        boolean z3 = this.f11587;
        boolean z4 = this.f11594;
        boolean z5 = c7307.f24279.f48679[5] == 21 && z2;
        synchronized (this.f11582) {
            m9236(c7307);
            C7930 c7930 = this.f11604;
            if (c7930 != null) {
                OutputStream outputStream = c7930.f26045;
                C14904 c14904 = c7307.f24279;
                outputStream.write(c14904.f48679, 0, c14904.f48681);
                c7930.f26045.flush();
                int i = this.f11628 + 1;
                this.f11628 = i;
                if (i == 0 && ((z3 || z4) && z)) {
                    throw new C9342("outgoing sequence number wrapped during initial KEX");
                }
                if (z5) {
                    this.f11628 = 0;
                }
            }
        }
        if (!z5 || this.f11604 == null) {
            return;
        }
        this.f11634.m1333().getClass();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m9251() {
        AbstractC7848 abstractC7848M9214;
        int i;
        byte b;
        this.f11602 = new RunnableC14364(this);
        C14904 c14904 = new C14904();
        C7307 c7307 = new C7307(c14904);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            AbstractC11541 abstractC11541M9221 = null;
            while (true) {
                int i2 = 0;
                while (true) {
                    try {
                        if (this.f11586 && this.f11602 != null) {
                            try {
                                m9239(c14904);
                                int i3 = c14904.f48679[5] & 255;
                                if (abstractC11541M9221 != null && abstractC11541M9221.mo3496() == i3) {
                                    this.f11608 = System.currentTimeMillis();
                                    boolean zMo3495 = abstractC11541M9221.mo3495(c14904);
                                    if (!zMo3495) {
                                        throw new C5813("verify: " + zMo3495);
                                    }
                                } else if (i3 == 20) {
                                    abstractC11541M9221 = m9221(c14904);
                                } else if (i3 != 21) {
                                    switch (i3) {
                                        case 80:
                                            c14904.m35638();
                                            c14904.m35642();
                                            c14904.m35628();
                                            if (c14904.m35629() != 0) {
                                                c7307.m19501();
                                                c14904.m35630((byte) 82);
                                                m9249(c7307);
                                            }
                                            break;
                                        case 81:
                                        case 82:
                                            Thread threadM24186 = this.f11601.m24186();
                                            if (threadM24186 != null) {
                                                this.f11601.getClass();
                                                if (i3 == 81 && this.f11601.m24184() == 0) {
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    this.f11601.m24185(c14904.m35638());
                                                }
                                                threadM24186.interrupt();
                                            }
                                            break;
                                        default:
                                            switch (i3) {
                                                case 90:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    byte[] bArrM35628 = c14904.m35628();
                                                    String str = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                                                    if ("forwarded-tcpip".equals(str) || (("x11".equals(str) && this.f11580) || ("auth-agent@openssh.com".equals(str) && this.f11635))) {
                                                        final AbstractC7848 abstractC7848M9246 = m9246(str);
                                                        if (abstractC7848M9246 == null) {
                                                            this.f11634.m1333().getClass();
                                                            c7307.m19501();
                                                            c14904.m35630((byte) 92);
                                                            c14904.m35644(c14904.m35638());
                                                            c14904.m35644(4);
                                                            byte[] bArr = C8491.f29422;
                                                            c14904.m35627(bArr);
                                                            c14904.m35640(0, bArr.length, bArr);
                                                            m9249(c7307);
                                                        } else {
                                                            abstractC7848M9246.mo20733(c14904);
                                                            ThreadFactoryC23536 threadFactoryC23536 = this.f11638;
                                                            Runnable runnable = new Runnable() { // from class: l.֫ۜᩳ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    abstractC7848M9246.mo19047();
                                                                }
                                                            };
                                                            threadFactoryC23536.getClass();
                                                            Thread thread = new Thread(runnable);
                                                            thread.setName("Channel " + str + " " + this.f11611);
                                                            thread.start();
                                                        }
                                                    } else {
                                                        this.f11634.m1333().getClass();
                                                        c7307.m19501();
                                                        c14904.m35630((byte) 92);
                                                        c14904.m35644(c14904.m35638());
                                                        c14904.m35644(1);
                                                        byte[] bArr2 = C8491.f29422;
                                                        c14904.m35627(bArr2);
                                                        c14904.m35640(0, bArr2.length, bArr2);
                                                        m9249(c7307);
                                                    }
                                                    break;
                                                case 91:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M9215 = m9214(c14904.m35638());
                                                    int iM35638 = c14904.m35638();
                                                    long jM35637 = c14904.m35637();
                                                    int iM35639 = c14904.m35638();
                                                    if (abstractC7848M9215 != null) {
                                                        abstractC7848M9215.m20739(jM35637);
                                                        abstractC7848M9215.f25822 = iM35639;
                                                        abstractC7848M9215.f25827 = true;
                                                        abstractC7848M9215.m20738(iM35638);
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M9216 = m9214(c14904.m35638());
                                                    if (abstractC7848M9216 != null) {
                                                        c14904.m35638();
                                                        abstractC7848M9216.f25813 = true;
                                                        abstractC7848M9216.m20738(0);
                                                    }
                                                    break;
                                                case 93:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M9217 = m9214(c14904.m35638());
                                                    if (abstractC7848M9217 != null) {
                                                        abstractC7848M9217.m20732(c14904.m35637());
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                    c14904.m35638();
                                                    c14904.m35629();
                                                    c14904.m35629();
                                                    abstractC7848M9214 = m9214(c14904.m35638());
                                                    int iM356310 = c14904.m35638();
                                                    int i4 = c14904.f48680;
                                                    c14904.f48680 = i4 + iM356310;
                                                    iArr[0] = i4;
                                                    iArr2[0] = iM356310;
                                                    byte[] bArr3 = c14904.f48679;
                                                    if (abstractC7848M9214 != null && iM356310 != 0) {
                                                        try {
                                                            try {
                                                                abstractC7848M9214.mo20734(bArr3, iArr[0], iM356310);
                                                                abstractC7848M9214.f25819 -= iArr2[0];
                                                                if (abstractC7848M9214.f25819 >= abstractC7848M9214.f25812 / 2) {
                                                                    continue;
                                                                } else {
                                                                    c7307.m19501();
                                                                    c14904.m35630((byte) 93);
                                                                    c14904.m35644(abstractC7848M9214.f25821);
                                                                    c14904.m35644(abstractC7848M9214.f25812 - abstractC7848M9214.f25819);
                                                                    synchronized (abstractC7848M9214) {
                                                                        if (!abstractC7848M9214.f25813) {
                                                                            m9249(c7307);
                                                                        }
                                                                    }
                                                                    i = abstractC7848M9214.f25812;
                                                                    abstractC7848M9214.f25819 = i;
                                                                }
                                                            } catch (Exception unused) {
                                                                continue;
                                                            }
                                                        } catch (Exception unused2) {
                                                            abstractC7848M9214.m20737();
                                                        }
                                                    }
                                                    break;
                                                case 95:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    abstractC7848M9214 = m9214(c14904.m35638());
                                                    c14904.m35638();
                                                    int iM356311 = c14904.m35638();
                                                    int i5 = c14904.f48680;
                                                    c14904.f48680 = i5 + iM356311;
                                                    iArr[0] = i5;
                                                    iArr2[0] = iM356311;
                                                    if (abstractC7848M9214 != null && iM356311 != 0) {
                                                        try {
                                                            abstractC7848M9214.f25826.getClass();
                                                            throw null;
                                                        } catch (NullPointerException unused3) {
                                                            abstractC7848M9214.f25819 -= iArr2[0];
                                                            if (abstractC7848M9214.f25819 < abstractC7848M9214.f25812 / 2) {
                                                                c7307.m19501();
                                                                c14904.m35630((byte) 93);
                                                                c14904.m35644(abstractC7848M9214.f25821);
                                                                c14904.m35644(abstractC7848M9214.f25812 - abstractC7848M9214.f25819);
                                                                synchronized (abstractC7848M9214) {
                                                                    if (!abstractC7848M9214.f25813) {
                                                                        m9249(c7307);
                                                                    }
                                                                    i = abstractC7848M9214.f25812;
                                                                    abstractC7848M9214.f25819 = i;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 96:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M9218 = m9214(c14904.m35638());
                                                    if (abstractC7848M9218 != null) {
                                                        abstractC7848M9218.mo20729();
                                                    }
                                                    break;
                                                case 97:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M9219 = m9214(c14904.m35638());
                                                    if (abstractC7848M9219 != null) {
                                                        abstractC7848M9219.m20737();
                                                    }
                                                    break;
                                                case 98:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    int iM356312 = c14904.m35638();
                                                    byte[] bArrM35629 = c14904.m35628();
                                                    boolean z = c14904.m35629() != 0;
                                                    AbstractC7848 abstractC7848M92110 = m9214(iM356312);
                                                    if (abstractC7848M92110 != null) {
                                                        if (new String(bArrM35629, 0, bArrM35629.length, StandardCharsets.UTF_8).equals("exit-status")) {
                                                            c14904.m35638();
                                                            b = 99;
                                                        } else {
                                                            b = 100;
                                                        }
                                                        if (z) {
                                                            c7307.m19501();
                                                            c14904.m35630(b);
                                                            c14904.m35644(abstractC7848M92110.f25821);
                                                            m9249(c7307);
                                                        }
                                                    }
                                                    break;
                                                case q.f /* 99 */:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M92111 = m9214(c14904.m35638());
                                                    if (abstractC7848M92111 != null) {
                                                        abstractC7848M92111.f25825 = 1;
                                                    }
                                                    break;
                                                case 100:
                                                    c14904.m35638();
                                                    c14904.m35642();
                                                    AbstractC7848 abstractC7848M92112 = m9214(c14904.m35638());
                                                    if (abstractC7848M92112 != null) {
                                                        abstractC7848M92112.f25825 = 0;
                                                    }
                                                    break;
                                                default:
                                                    throw new IOException("Unknown SSH message type " + i3);
                                            }
                                            break;
                                    }
                                } else {
                                    C7307 c7308 = this.f11632;
                                    c7308.m19501();
                                    this.f11631.m35630((byte) 21);
                                    m9249(c7308);
                                    this.f11634.m1333().getClass();
                                    m9216(abstractC11541M9221);
                                }
                            } catch (InterruptedIOException e) {
                                if (!this.f11597 && i2 < this.f11572) {
                                    C14904 c14905 = new C14904();
                                    C7307 c7309 = new C7307(c14905);
                                    c7309.m19501();
                                    c14905.m35630(UTF8.S_P4A);
                                    c14905.m35627(f11569);
                                    c14905.m35630((byte) 1);
                                    m9249(c7309);
                                } else if (!this.f11597 || i2 >= this.f11572) {
                                    throw e;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception unused4) {
                        this.f11597 = false;
                        this.f11634.m1333().getClass();
                    }
                }
            }
        }
        try {
            m9247();
        } catch (NullPointerException | Exception unused5) {
        }
        this.f11586 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9238(AbstractC7848 abstractC7848) {
        Lock lockWriteLock = this.f11595.writeLock();
        lockWriteLock.lock();
        try {
            this.f11625.remove(abstractC7848);
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9247() {
        if (this.f11586) {
            this.f11634.m1333().getClass();
            Lock lockWriteLock = this.f11595.writeLock();
            lockWriteLock.lock();
            try {
                this.f11627 = true;
                ArrayList arrayList = new ArrayList(this.f11625);
                lockWriteLock.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractC7848) it.next()).m20737();
                    } catch (Exception unused) {
                        this.f11634.m1333().getClass();
                    }
                }
                this.f11586 = false;
                C15775.m37518(this);
                C12082.m30069(this);
                C22310.m49475(this);
                synchronized (this.f11582) {
                    if (this.f11629 != null) {
                        Thread.yield();
                        this.f11629.interrupt();
                        this.f11629 = null;
                    }
                }
                this.f11602 = null;
                try {
                    C7930 c7930 = this.f11604;
                    if (c7930 != null) {
                        InputStream inputStream = c7930.f26044;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        OutputStream outputStream = this.f11604.f26045;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f11604.getClass();
                    }
                    Socket socket = this.f11620;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception unused2) {
                }
                this.f11604 = null;
                this.f11620 = null;
                lockWriteLock.lock();
                try {
                    this.f11627 = false;
                    this.f11625.clear();
                    lockWriteLock.unlock();
                    this.f11616 = 0;
                    this.f11628 = 0;
                    this.f11610 = true;
                    this.f11617 = false;
                    this.f11571 = false;
                    this.f11618 = null;
                    this.f11634.m1335(this);
                } catch (Throwable th) {
                    lockWriteLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                lockWriteLock.unlock();
                throw th2;
            }
        }
        C3073 c3073 = this.f11574;
        if (c3073 != null) {
            c3073.m9247();
            this.f11574 = null;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ThreadFactoryC23536 m9227() {
        return this.f11638;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9230(String str, int i, int i2, String str2) {
        C15775 c15775M37517 = C15775.m37517(this, str, i, str2, i2);
        RunnableC20713 runnableC20713 = new RunnableC20713(c15775M37517);
        this.f11638.getClass();
        Thread thread = new Thread(runnableC20713);
        thread.setName("PortWatcher Thread for " + str2);
        thread.start();
        return c15775M37517.f51093;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9226(java.lang.String r5) {
        /*
            r4 = this;
            l.ۘ۬ᩳ r0 = r4.f11615
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            r2 = 0
            if (r1 == 0) goto L13
            r4.f11615 = r2
            if (r0 == 0) goto L6e
            r0.end()
            return
        L13:
            java.lang.String r1 = r4.m9231(r5)
            if (r1 == 0) goto L6e
            java.lang.String r3 = "zlib"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L2d
            boolean r3 = r4.f11578
            if (r3 == 0) goto L6e
            java.lang.String r3 = "zlib@openssh.com"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L6e
        L2d:
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.Class<l.ۘ۬ᩳ> r1 = l.InterfaceC3964.class
            java.lang.Class r5 = r5.asSubclass(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            l.ۘ۬ᩳ r5 = (l.InterfaceC3964) r5     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r4.f11615 = r5     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r5 = "compression_level"
            java.lang.String r5 = r4.m9231(r5)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L5b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L5b
            goto L4f
        L4e:
            r5 = 6
        L4f:
            l.ۘ۬ᩳ r1 = r4.f11615     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r2 = 1
            r1.mo11449(r2, r5, r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 == 0) goto L6e
            r0.end()
            goto L6e
        L5b:
            r5 = move-exception
            goto L68
        L5d:
            r5 = move-exception
            l.ۛۘᩳ r1 = new l.ۛۘᩳ     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L68:
            if (r0 == 0) goto L6d
            r0.end()
        L6d:
            throw r5
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3073.m9226(java.lang.String):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004d */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9212(java.lang.String r5) {
        /*
            r4 = this;
            l.ۘ۬ᩳ r0 = r4.f11584
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            r2 = 0
            if (r1 == 0) goto L13
            r4.f11584 = r2
            if (r0 == 0) goto L60
            r0.end()
            return
        L13:
            java.lang.String r1 = r4.m9231(r5)
            if (r1 == 0) goto L60
            java.lang.String r3 = "zlib"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L2d
            boolean r3 = r4.f11578
            if (r3 == 0) goto L60
            java.lang.String r3 = "zlib@openssh.com"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L60
        L2d:
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Class<l.ۘ۬ᩳ> r1 = l.InterfaceC3964.class
            java.lang.Class r5 = r5.asSubclass(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            l.ۘ۬ᩳ r5 = (l.InterfaceC3964) r5     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r4.f11584 = r5     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r1 = 0
            r5.mo11449(r1, r1, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r0 == 0) goto L60
            r0.end()
            return
        L4d:
            r5 = move-exception
            goto L5a
        L4f:
            r5 = move-exception
            l.ۛۘᩳ r1 = new l.ۛۘᩳ     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L5a:
            if (r0 == 0) goto L5f
            r0.end()
        L5f:
            throw r5
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3073.m9212(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private AbstractC7848 m9219(String str) {
        C8554 c8554;
        C17020 c17020 = str.equals(d.aw) ? new C17020() : null;
        if (str.equals("shell")) {
            C11727 c11727 = new C11727();
            c11727.f54378 = true;
            c17020 = c11727;
        }
        C17020 c15610 = c17020;
        if (str.equals("exec")) {
            c15610 = new C15610();
        }
        AbstractC7848 c22310 = c15610;
        if (str.equals("x11")) {
            c22310 = new C22310();
        }
        AbstractC7848 c19137 = c22310;
        if (str.equals("auth-agent@openssh.com")) {
            c19137 = new C19137();
        }
        AbstractC7848 c7142 = c19137;
        if (str.equals("direct-tcpip")) {
            c7142 = new C7142();
        }
        AbstractC7848 c12082 = c7142;
        if (str.equals("forwarded-tcpip")) {
            c12082 = new C12082();
        }
        AbstractC7848 abstractC7848 = c12082;
        if (str.equals("sftp")) {
            C4670 c4670 = new C4670();
            c4670.m12930(m9231("use_sftp_write_flush_workaround").equals("yes"));
            abstractC7848 = c4670;
        }
        AbstractC7848 abstractC7849 = abstractC7848;
        if (str.equals("subsystem")) {
            C5376 c5376 = new C5376();
            c5376.f18574 = true;
            c5376.f18575 = "";
            abstractC7849 = c5376;
        }
        AbstractC7848 abstractC78410 = abstractC7849;
        if (str.equals("direct-streamlocal@openssh.com")) {
            c8554 = new C8554();
        }
        if (abstractC78410 == null) {
            abstractC78410 = c8554;
            return null;
        }
        abstractC78410 = c8554;
        Lock lockWriteLock = this.f11595.writeLock();
        lockWriteLock.lock();
        try {
            if (this.f11627 || !this.f11586) {
                return null;
            }
            abstractC78410.f25816 = this;
            this.f11625.add(abstractC78410);
            return abstractC78410;
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] m9241() {
        return this.f11618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9240(InterfaceC19074 interfaceC19074) {
        this.f11576 = interfaceC19074;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19074 m9229() {
        return this.f11576;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9234(String str, String str2) throws Throwable {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2 == null ? null : str2.getBytes();
        C0168 c0168 = this.f11634;
        c0168.m1332(C8636.m22435(c0168.f1261, "builtin", bytes), bytes2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9244(String str) {
        if (str != null) {
            byte[] bArr = C8491.f29422;
            this.f11622 = C8491.m22175(str, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9248(String str, String str2) {
        synchronized (this.f11582) {
            if (this.f11591 == null) {
                this.f11591 = new Hashtable();
            }
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                this.f11591.put("PubkeyAcceptedAlgorithms", str2);
            } else {
                this.f11591.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9231(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable hashtable = this.f11591;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String strM1327 = C0168.m1327(str);
        if (strM1327 != null) {
            return strM1327;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m9242() {
        return this.f11586;
    }

    static {
        byte[] bArr = C8491.f29422;
        f11569 = "keepalive@jcraft.com".getBytes(StandardCharsets.UTF_8);
        C8491.m22185("no-more-sessions@openssh.com");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m9213(String str) {
        try {
            InterfaceC1142 interfaceC1142 = (InterfaceC1142) Class.forName(str).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC1142.mo2386(0, new byte[interfaceC1142.getBlockSize()], new byte[interfaceC1142.mo2383()]);
            return true;
        } catch (Exception | LinkageError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m9223() {
        if (m9231("ClearAllForwardings").equals("yes")) {
            return;
        }
        this.f11634.getClass();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8719 m9228() {
        return this.f11634.m1333();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9243() {
        InterfaceC1142 interfaceC1142 = this.f11621;
        InterfaceC10130 interfaceC10130 = this.f11593;
        int blockSize = 20;
        if (interfaceC1142 != null && (interfaceC1142.mo2390() || interfaceC1142.mo2389())) {
            if (interfaceC1142.mo2391() > 20) {
                blockSize = interfaceC1142.mo2391();
            }
        } else if (interfaceC10130 != null && interfaceC10130.getBlockSize() > 20) {
            blockSize = interfaceC10130.getBlockSize();
        }
        return blockSize + 64;
    }
}
