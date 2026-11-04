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

/* JADX INFO: renamed from: l.ܶ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15723 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f51084;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC10502 f51085;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC24675 f51089;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f51092;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC7299 f51094;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51097;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51098;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0477 f51099;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f51100;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7299 f51103;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public String f51105;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51107;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0808 f51109;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f51114;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C8878 f51115;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f51116;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public Runnable f51117;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f51120;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C15723 f51121;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0477 f51124;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f51126;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C19978 f51127;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC21360 f51128;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9866 f51132;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C14010 f51133;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Socket f51137;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f51138;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21360 f51141;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f51144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f51146;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f51149;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51151;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f51090 = "SSH-2.0-JSCH_2.27.6".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f51125 = 0;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f51143 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String[] f51110 = null;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51139 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51134 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f51136 = true;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f51106 = true;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51145 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f51086 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f51112 = true;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f51095 = false;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51147 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Thread f51096 = null;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public Object f51091 = new Object();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51123 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51152 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Hashtable f51150 = null;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f51135 = 1;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f51087 = null;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51113 = false;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public volatile long f51101 = 0;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f51153 = 6;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51130 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public byte[] f51129 = null;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public ThreadFactoryC11248 f51111 = new ThreadFactoryC11248(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51142 = false;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f51140 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f51118 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51104 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f51122 = false;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f51131 = null;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int[] f51093 = new int[1];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int[] f51102 = new int[1];

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f51119 = 8;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51148 = 8;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17215 f51088 = new C17215();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9623 f51108 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37616(C15723 c15723) {
        this.f51121 = c15723;
    }

    public C15723(C19978 c19978, String str, String str2, int i) throws C2079 {
        String property = null;
        this.f51092 = "127.0.0.1";
        this.f51149 = 22;
        this.f51105 = null;
        this.f51127 = c19978;
        C9866 c9866 = new C9866();
        this.f51132 = c9866;
        this.f51133 = new C14010(c9866);
        this.f51105 = str;
        this.f51092 = str2;
        this.f51149 = i;
        if (str == null) {
            try {
                property = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
            this.f51105 = property;
        }
        if (this.f51105 == null) {
            throw new C2079("username is not given.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37609(Runnable runnable) {
        this.f51117 = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c3, code lost:
    
        r14.f51104 = false;
        r14.f51122 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37608() throws l.C2079 {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15723.m37608():void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC12519 m37602(C9866 c9866) throws C2079 {
        boolean z;
        int iM25658 = c9866.m25658();
        boolean z2 = true;
        if (iM25658 != c9866.m25672()) {
            c9866.m25650();
            this.f51126 = new byte[c9866.f31752 - 5];
        } else {
            this.f51126 = new byte[(iM25658 - 1) - c9866.m25650()];
        }
        byte[] bArr = c9866.f31750;
        int i = c9866.f31751;
        byte[] bArr2 = this.f51126;
        int i2 = 0;
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        if (this.f51145) {
            if (this.f51112 || this.f51095) {
                C9866 c9867 = new C9866(this.f51126);
                c9867.f31751 = 17;
                byte[] bArrM25649 = c9867.m25649();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= bArrM25649.length) {
                        z = false;
                        break;
                    }
                    while (i3 < bArrM25649.length && bArrM25649[i3] != 44) {
                        i3++;
                    }
                    if (i4 != i3 && "kex-strict-s-v00@openssh.com".equals(C9011.m24048(i4, i3 - i4, bArrM25649))) {
                        z = true;
                        break;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                }
                this.f51086 = z;
                if (this.f51086) {
                    this.f51127.m45899().getClass();
                    if (this.f51125 != 1) {
                        throw new C16248("KEXINIT not first packet from server");
                    }
                } else if (this.f51095) {
                    throw new C16248("Strict KEX not supported by server");
                }
            }
            if (this.f51136) {
                C9866 c9868 = new C9866(this.f51126);
                c9868.f31751 = 17;
                byte[] bArrM256410 = c9868.m25649();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= bArrM256410.length) {
                        z2 = false;
                        break;
                    }
                    while (i5 < bArrM256410.length && bArrM256410[i5] != 44) {
                        i5++;
                    }
                    if (i6 != i5) {
                        if ("ext-info-s".equals(C9011.m24048(i6, i5 - i6, bArrM256410))) {
                            break;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    }
                }
                this.f51134 = z2;
                if (this.f51134) {
                    this.f51127.m45899().getClass();
                }
            }
        }
        if (!this.f51104) {
            m37598();
        }
        byte[] bArr3 = this.f51126;
        byte[] bArr4 = this.f51138;
        String[] strArr = new String[10];
        C9866 c9869 = new C9866(bArr3);
        c9869.f31751 = 17;
        C9866 c98610 = new C9866(bArr4);
        c98610.f31751 = 17;
        this.f51127.m45899().getClass();
        int i7 = 0;
        for (int i8 = 10; i7 < i8; i8 = 10) {
            byte[] bArrM256411 = c9869.m25649();
            byte[] bArrM256412 = c98610.m25649();
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArrM256412.length) {
                while (i9 < bArrM256412.length && bArrM256412[i9] != 44) {
                    i9++;
                }
                if (i10 == i9) {
                    int length = bArrM256412.length;
                    Charset charset = StandardCharsets.UTF_8;
                    throw new C15502(i7, new String(bArrM256412, i2, length, charset), new String(bArrM256411, i2, bArrM256411.length, charset));
                }
                String strM24048 = C9011.m24048(i10, i9 - i10, bArrM256412);
                int i11 = 0;
                int i12 = 0;
                while (i12 < bArrM256411.length) {
                    while (i12 < bArrM256411.length && bArrM256411[i12] != 44) {
                        i12++;
                    }
                    if (i11 == i12) {
                        int length2 = bArrM256412.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        throw new C15502(i7, new String(bArrM256412, 0, length2, charset2), new String(bArrM256411, 0, bArrM256411.length, charset2));
                    }
                    if (strM24048.equals(C9011.m24048(i11, i12 - i11, bArrM256411))) {
                        strArr[i7] = strM24048;
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
                int length3 = bArrM256412.length;
                Charset charset3 = StandardCharsets.UTF_8;
                throw new C15502(i7, new String(bArrM256412, 0, length3, charset3), new String(bArrM256411, 0, bArrM256411.length, charset3));
            }
            i7++;
            i2 = 0;
        }
        try {
            if (((InterfaceC21360) Class.forName(m37607(strArr[3])).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null)).mo3927()) {
                strArr[5] = null;
            }
            if (((InterfaceC21360) Class.forName(m37607(strArr[2])).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null)).mo3927()) {
                strArr[4] = null;
            }
            this.f51127.m45899().getClass();
            this.f51110 = strArr;
            if (strArr[0].equals("ext-info-c") || this.f51110[0].equals("ext-info-s") || this.f51110[0].equals("kex-strict-c-v00@openssh.com") || this.f51110[0].equals("kex-strict-s-v00@openssh.com")) {
                throw new C2079("Invalid Kex negotiated: " + this.f51110[0]);
            }
            if (!this.f51147 && (this.f51110[2].equals("none") || this.f51110[3].equals("none"))) {
                throw new C2079("NONE Cipher should not be chosen before authentification is successed.");
            }
            try {
                AbstractC12519 abstractC12519 = (AbstractC12519) Class.forName(m37607(this.f51110[0])).asSubclass(AbstractC12519.class).getDeclaredConstructor(null).newInstance(null);
                byte[] bArr5 = this.f51116;
                byte[] bArr6 = this.f51090;
                byte[] bArr7 = this.f51126;
                byte[] bArr8 = this.f51138;
                abstractC12519.f40188 = this;
                abstractC12519.mo2919(this, bArr5, bArr6, bArr7, bArr8);
                return abstractC12519;
            } catch (Exception | LinkageError e) {
                throw new C2079(e.toString(), e);
            }
        } catch (Exception | LinkageError e2) {
            throw new C2079(e2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] m37617() {
        return this.f51131;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m37598() throws C2079 {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        if (this.f51104) {
            return;
        }
        String strM37607 = m37607("cipher.c2s");
        String strM37608 = m37607("cipher.s2c");
        String strM37609 = m37607("CheckCiphers");
        C19978 c19978 = this.f51127;
        int i = -1;
        if (strM37609 == null || strM37609.length() == 0) {
            strArr = null;
        } else {
            c19978.m45899().getClass();
            String strM376010 = m37607("cipher.c2s");
            String strM376011 = m37607("cipher.s2c");
            Vector vector = new Vector();
            for (String str : C9011.m24057(strM37609)) {
                if ((strM376011.indexOf(str) != -1 || strM376010.indexOf(str) != -1) && !m37604(m37607(str))) {
                    vector.addElement(str);
                }
            }
            if (vector.size() == 0) {
                strArr = null;
            } else {
                strArr = new String[vector.size()];
                System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
                c19978.m45899().getClass();
            }
        }
        if (strArr != null && strArr.length > 0) {
            this.f51127.m45899().getClass();
            strM37607 = C9011.m24049(strM37607, strArr);
            strM37608 = C9011.m24049(strM37608, strArr);
            if (strM37607 == null || strM37608 == null) {
                throw new C2079("There are not any available ciphers.");
            }
            this.f51127.m45899().getClass();
        }
        String str2 = strM37608;
        String strM376012 = m37607("mac.c2s");
        String strM376013 = m37607("mac.s2c");
        String strM376014 = m37607("CheckMacs");
        C19978 c19979 = this.f51127;
        if (strM376014 == null || strM376014.length() == 0) {
            strArr2 = null;
        } else {
            c19979.m45899().getClass();
            String strM376015 = m37607("mac.c2s");
            String strM376016 = m37607("mac.s2c");
            Vector vector2 = new Vector();
            String[] strArrM24057 = C9011.m24057(strM376014);
            int i2 = 0;
            while (i2 < strArrM24057.length) {
                String str3 = strArrM24057[i2];
                if (strM376016.indexOf(str3) != i || strM376015.indexOf(str3) != i) {
                    try {
                        InterfaceC7299 interfaceC7299 = (InterfaceC7299) Class.forName(m37607(str3)).asSubclass(InterfaceC7299.class).getDeclaredConstructor(null).newInstance(null);
                        interfaceC7299.init(new byte[interfaceC7299.getBlockSize()]);
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
                c19979.m45899().getClass();
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            this.f51127.m45899().getClass();
            String strM24049 = C9011.m24049(strM376012, strArr2);
            String strM240410 = C9011.m24049(strM376013, strArr2);
            if (strM24049 == null || strM240410 == null) {
                throw new C2079("There are not any available macs.");
            }
            this.f51127.m45899().getClass();
        }
        String strM376017 = m37607("kex");
        String strM376018 = m37607("CheckKexes");
        C19978 c199710 = this.f51127;
        if (strM376018 == null || strM376018.length() == 0) {
            strArr3 = null;
        } else {
            c199710.m45899().getClass();
            Vector vector3 = new Vector();
            String[] strArrM24058 = C9011.m24057(strM376018);
            for (int i3 = 0; i3 < strArrM24058.length; i3++) {
                try {
                    AbstractC12519 abstractC12519 = (AbstractC12519) Class.forName(m37607(strArrM24058[i3])).asSubclass(AbstractC12519.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC12519.f40188 = this;
                    abstractC12519.mo2919(this, null, null, null, null);
                } catch (Exception | LinkageError unused2) {
                    vector3.addElement(strArrM24058[i3]);
                }
            }
            if (vector3.size() == 0) {
                strArr3 = null;
            } else {
                strArr3 = new String[vector3.size()];
                System.arraycopy(vector3.toArray(), 0, strArr3, 0, vector3.size());
                c199710.m45899().getClass();
            }
        }
        if (strArr3 != null && strArr3.length > 0) {
            this.f51127.m45899().getClass();
            strM376017 = C9011.m24049(strM376017, strArr3);
            if (strM376017 == null) {
                throw new C2079("There are not any available kexes.");
            }
            this.f51127.m45899().getClass();
        }
        if (this.f51136 && !this.f51147) {
            strM376017 = C14483.m34972(strM376017, ",ext-info-c");
        }
        if ((this.f51112 || this.f51095) && this.f51145) {
            strM376017 = C14483.m34972(strM376017, ",kex-strict-c-v00@openssh.com");
        }
        String strM376019 = m37607("server_host_key");
        String strM376020 = m37607("CheckSignatures");
        C19978 c199711 = this.f51127;
        if (strM376020 == null || strM376020.length() == 0) {
            strArr4 = null;
        } else {
            c199711.m45899().getClass();
            Vector vector4 = new Vector();
            String[] strArrM24059 = C9011.m24057(strM376020);
            for (int i4 = 0; i4 < strArrM24059.length; i4++) {
                try {
                    ((InterfaceC11994) Class.forName(C19978.m45892(strArrM24059[i4])).asSubclass(InterfaceC11994.class).getDeclaredConstructor(null).newInstance(null)).init();
                } catch (Exception | LinkageError unused3) {
                    vector4.addElement(strArrM24059[i4]);
                }
            }
            if (vector4.size() == 0) {
                strArr4 = null;
            } else {
                strArr4 = new String[vector4.size()];
                System.arraycopy(vector4.toArray(), 0, strArr4, 0, vector4.size());
                c199711.m45899().getClass();
            }
        }
        this.f51131 = strArr4;
        if (strArr4 != null && strArr4.length > 0) {
            this.f51127.m45899().getClass();
            strM376019 = C9011.m24049(strM376019, strArr4);
            if (strM376019 == null) {
                throw new C2079("There are not any available sig algorithm.");
            }
            this.f51127.m45899().getClass();
        }
        if (m37607("prefer_known_host_key_types").equals("yes")) {
            this.f51127.m45899().getClass();
            InterfaceC2912 interfaceC2912M45894 = this.f51127.m45894();
            String string = this.f51092;
            if (this.f51149 != 22) {
                StringBuilder sbM51387 = C22783.m51387("[", string, "]:");
                sbM51387.append(this.f51149);
                string = sbM51387.toString();
            }
            C9623[] c9623ArrM24950 = ((C9535) interfaceC2912M45894).m24950(string, (String) null);
            if (c9623ArrM24950.length > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(Arrays.asList(C9011.m24057(strM376019)));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String str5 = (str4.equals("rsa-sha2-256") || str4.equals("rsa-sha2-512") || str4.equals("ssh-rsa-sha224@ssh.com") || str4.equals("ssh-rsa-sha256@ssh.com") || str4.equals("ssh-rsa-sha384@ssh.com") || str4.equals("ssh-rsa-sha512@ssh.com")) ? OpenSSHPublicKeyUtil.RSA : str4;
                    for (C9623 c9623 : c9623ArrM24950) {
                        if (c9623.m25127().equals(str5)) {
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
                    strM376019 = sb.toString();
                }
            }
            this.f51127.m45899().getClass();
        }
        this.f51101 = System.currentTimeMillis();
        this.f51104 = true;
        C9866 c9866 = new C9866();
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 20);
        synchronized (f51085) {
            f51085.mo20077(c9866.f31752, 16, c9866.f31750);
            c9866.m25659(16);
        }
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673(C9011.m24055(strM376017, charset));
        c9866.m25673(C9011.m24055(strM376019, charset));
        c9866.m25673(C9011.m24055(strM37607, charset));
        c9866.m25673(C9011.m24055(str2, charset));
        c9866.m25673(C9011.m24055(m37607("mac.c2s"), charset));
        c9866.m25673(C9011.m24055(m37607("mac.s2c"), charset));
        c9866.m25673(C9011.m24055(m37607("compression.c2s"), charset));
        c9866.m25673(C9011.m24055(m37607("compression.s2c"), charset));
        c9866.m25673(C9011.m24055(m37607("lang.c2s"), charset));
        c9866.m25673(C9011.m24055(m37607("lang.s2c"), charset));
        c9866.m25651((byte) 0);
        c9866.m25669(0);
        c9866.f31751 = 5;
        int iM25672 = c9866.m25672();
        byte[] bArr = new byte[iM25672];
        this.f51138 = bArr;
        c9866.m25653(0, iM25672, bArr);
        m37627(c14010);
        this.f51127.m45899().getClass();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37600() throws C2079 {
        C14010 c14010 = this.f51133;
        c14010.m34100();
        this.f51132.m25651((byte) 7);
        this.f51132.m25669(1);
        C9866 c9866 = this.f51132;
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673(C9011.m24055("ext-info-in-auth@openssh.com", charset));
        this.f51132.m25673(C9011.m24055("0", charset));
        m37627(c14010);
        this.f51127.m45899().getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37591(String str, int i, AbstractC12519 abstractC12519) throws C23708, C16994, C5808 {
        C9535 c9535;
        int iM24948;
        boolean z;
        String strM37607 = m37607("StrictHostKeyChecking");
        byte[] bArr = abstractC12519.f40185;
        String strM31080 = abstractC12519.m31080();
        InterfaceC1421 interfaceC1421 = null;
        try {
            interfaceC1421 = (InterfaceC1421) Class.forName(abstractC12519.f40188.m37607(abstractC12519.f40188.m37607("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC12519.f40188.f51127.m45899().getClass();
        }
        String strM24050 = C9011.m24050(interfaceC1421, abstractC12519.f40185);
        String str2 = i != 22 ? "[" + str + "]:" + i : str;
        InterfaceC2912 interfaceC2912M45894 = this.f51127.m45894();
        if (m37607("HashKnownHosts").equals("yes") && C1402.m5130(interfaceC2912M45894)) {
            C1333 c1333 = new C1333((C9535) interfaceC2912M45894, "", str2, 0, bArr, null);
            c1333.m4903();
            this.f51108 = c1333;
        } else {
            this.f51108 = new C9623(str2, 0, bArr);
        }
        synchronized (interfaceC2912M45894) {
            c9535 = (C9535) interfaceC2912M45894;
            iM24948 = c9535.m24948(str2, bArr);
        }
        if ((strM37607.equals("ask") || strM37607.equals("yes")) && iM24948 == 2) {
            synchronized (interfaceC2912M45894) {
            }
            if (this.f51109 != null) {
                if (strM37607.equals("ask")) {
                    this.f51109.getClass();
                    synchronized (interfaceC2912M45894) {
                        c9535.m24951(str2, abstractC12519.m31078());
                    }
                    z = true;
                } else {
                    this.f51109.getClass();
                }
            }
            throw new C5808(C25272.m56409("HostKey has been changed: ", str2));
        }
        z = false;
        if ((strM37607.equals("ask") || strM37607.equals("yes")) && iM24948 != 0 && !z) {
            if (strM37607.equals("yes")) {
                throw new C23708(C25272.m56409("reject HostKey: ", str2));
            }
            if (this.f51109 == null) {
                if (iM24948 != 1) {
                    throw new C5808(C25272.m56409("HostKey has been changed: ", str2));
                }
                StringBuilder sbM10406 = C3188.m10406("UnknownHostKey: ", str2, ". ", strM31080, " key fingerprint is ");
                sbM10406.append(strM24050);
                throw new C23708(sbM10406.toString());
            }
            z = true;
        }
        if (strM37607.equals("no") && 1 == iM24948) {
            z = true;
        }
        if (iM24948 == 0) {
            C9623[] c9623ArrM24950 = c9535.m24950(str2, abstractC12519.m31078());
            byte[] bArrM24056 = C9011.m24056(bArr, bArr.length, true);
            String str3 = new String(bArrM24056, 0, bArrM24056.length, StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < c9623ArrM24950.length; i2++) {
                byte[] bArr2 = c9623ArrM24950[i2].f31134;
                byte[] bArrM24057 = C9011.m24056(bArr2, bArr2.length, true);
                if (new String(bArrM24057, 0, bArrM24057.length, StandardCharsets.UTF_8).equals(str3) && c9623ArrM24950[i2].f31133.equals("@revoked")) {
                    this.f51127.m45899().getClass();
                    throw new C16994(C25272.m56409("revoked HostKey: ", str2));
                }
            }
        }
        if (iM24948 == 0) {
            this.f51127.m45899().getClass();
        }
        if (z) {
            this.f51127.m45899().getClass();
        }
        if (z) {
            synchronized (interfaceC2912M45894) {
                c9535.m24949(this.f51108, this.f51109);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC8375 m37624(String str) throws C2079 {
        if (!this.f51139) {
            throw new C2079("session is down");
        }
        try {
            AbstractC8375 abstractC8375M37601 = m37601(str);
            if (abstractC8375M37601 != null) {
                abstractC8375M37601.mo13414();
                if (abstractC8375M37601 instanceof C1969) {
                    this.f51127.getClass();
                }
                return abstractC8375M37601;
            }
            this.f51127.m45899().getClass();
            return null;
        } catch (Exception unused) {
            this.f51127.m45899().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37614(C14010 c14010) {
        InterfaceC7299 interfaceC7299;
        InterfaceC0477 interfaceC0477 = this.f51124;
        boolean z = false;
        if (interfaceC0477 != null) {
            C9866 c9866 = c14010.f44379;
            int i = c9866.f31752;
            int[] iArr = this.f51102;
            iArr[0] = i;
            c9866.f31750 = interfaceC0477.mo2310(c9866.f31750, iArr);
            c14010.f44379.f31752 = iArr[0];
        }
        InterfaceC21360 interfaceC21360 = this.f51128;
        int i2 = interfaceC21360 != null ? this.f51148 : 8;
        boolean z2 = interfaceC21360 != null && interfaceC21360.mo3926();
        InterfaceC21360 interfaceC21361 = this.f51128;
        boolean z3 = interfaceC21361 != null && interfaceC21361.mo3927();
        boolean z4 = (z2 || z3 || this.f51128 == null || (interfaceC7299 = this.f51094) == null || !interfaceC7299.mo2726()) ? false : true;
        if (!z2 && !z3 && !z4) {
            z = true;
        }
        c14010.m34101(i2, z);
        C9866 c9867 = c14010.f44379;
        byte[] bArr = c9867.f31750;
        if (z2) {
            this.f51128.mo3921(this.f51143);
            this.f51128.mo3922(0, bArr, 4, bArr, 0);
            this.f51128.mo3929(0, bArr, c9867.f31752, bArr, 0);
            c9867.m25659(this.f51128.mo3928());
            return;
        }
        if (z3) {
            this.f51128.mo3924(bArr);
            this.f51128.mo3929(4, bArr, c9867.f31752 - 4, bArr, 4);
            c9867.m25659(this.f51128.mo3928());
            return;
        }
        if (z4) {
            this.f51128.mo3922(4, bArr, c9867.f31752 - 4, bArr, 4);
            this.f51094.mo19965(this.f51143);
            this.f51094.mo19966(c9867.f31752, c9867.f31750);
            this.f51094.mo19967(c9867.f31752, c9867.f31750);
            c9867.m25659(this.f51094.getBlockSize());
            return;
        }
        InterfaceC7299 interfaceC72910 = this.f51094;
        if (interfaceC72910 != null) {
            interfaceC72910.mo19965(this.f51143);
            this.f51094.mo19966(c9867.f31752, c9867.f31750);
            this.f51094.mo19967(c9867.f31752, c9867.f31750);
        }
        InterfaceC21360 interfaceC21362 = this.f51128;
        if (interfaceC21362 != null) {
            interfaceC21362.mo3922(0, bArr, c9867.f31752, bArr, 0);
        }
        InterfaceC7299 interfaceC72911 = this.f51094;
        if (interfaceC72911 != null) {
            c9867.m25659(interfaceC72911.getBlockSize());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC8375 m37590(int i) {
        Lock lock = this.f51118.readLock();
        lock.lock();
        try {
            for (AbstractC8375 abstractC8375 : this.f51140) {
                if (abstractC8375.f27480 == i) {
                    return abstractC8375;
                }
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37613(C9866 c9866) throws IOException {
        char c;
        boolean z;
        InterfaceC7299 interfaceC7299;
        InterfaceC21360 interfaceC21360 = this.f51141;
        char c2 = 1;
        boolean z2 = interfaceC21360 != null && interfaceC21360.mo3926();
        InterfaceC21360 interfaceC21361 = this.f51141;
        boolean z3 = interfaceC21361 != null && interfaceC21361.mo3927();
        boolean z4 = (z2 || z3 || this.f51141 == null || (interfaceC7299 = this.f51103) == null || !interfaceC7299.mo2726()) ? false : true;
        while (true) {
            c9866.m25674();
            if (z2) {
                this.f51115.m23758(c9866.f31752, 4, c9866.f31750);
                c9866.f31752 += 4;
                this.f51141.mo3921(this.f51125);
                byte[] bArr = new byte[4];
                this.f51141.mo3922(0, c9866.f31750, 4, bArr, 0);
                int i = ((bArr[c2] << 16) & 16711680) | ((bArr[0] << 24) & (-16777216)) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
                if (i < 5 || i > 262144) {
                    break;
                }
                int iMo3928 = this.f51141.mo3928() + i;
                int i2 = c9866.f31752;
                int i3 = i2 + iMo3928;
                byte[] bArr2 = c9866.f31750;
                if (i3 > bArr2.length) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i2);
                    c9866.f31750 = bArr3;
                }
                if (iMo3928 % this.f51119 != 0) {
                    this.f51127.m45899().getClass();
                    m37592(c9866, this.f51141, this.f51103, 0, 262144 - this.f51119);
                    throw null;
                }
                this.f51115.m23758(c9866.f31752, iMo3928, c9866.f31750);
                int iMo3929 = iMo3928 - this.f51141.mo3928();
                c9866.f31752 += iMo3929;
                try {
                    InterfaceC21360 interfaceC21362 = this.f51141;
                    byte[] bArr4 = c9866.f31750;
                    interfaceC21362.mo3929(0, bArr4, iMo3929 + 4, bArr4, 0);
                    System.arraycopy(bArr, 0, c9866.f31750, 0, 4);
                } catch (AEADBadTagException e) {
                    throw new C2079("Packet corrupt", e);
                }
            } else if (z3 || z4) {
                this.f51115.m23758(c9866.f31752, 4, c9866.f31750);
                c9866.f31752 += 4;
                byte[] bArr5 = c9866.f31750;
                int iMo39210 = (65280 & (bArr5[2] << 8)) | (16711680 & (bArr5[1] << 16)) | ((-16777216) & (bArr5[0] << 24)) | (bArr5[3] & 255);
                if (iMo39210 < 5 || iMo39210 > 262144) {
                    m37592(c9866, this.f51141, this.f51103, 0, 262144);
                    throw null;
                }
                if (z3) {
                    iMo39210 += this.f51141.mo3928();
                }
                int i4 = iMo39210;
                int i5 = c9866.f31752;
                int i6 = i5 + i4;
                byte[] bArr6 = c9866.f31750;
                if (i6 > bArr6.length) {
                    byte[] bArr7 = new byte[i6];
                    System.arraycopy(bArr6, 0, bArr7, 0, i5);
                    c9866.f31750 = bArr7;
                }
                if (i4 % this.f51119 != 0) {
                    this.f51127.m45899().getClass();
                    m37592(c9866, this.f51141, this.f51103, 0, 262144 - this.f51119);
                    throw null;
                }
                this.f51115.m23758(c9866.f31752, i4, c9866.f31750);
                c9866.f31752 += i4;
                if (z3) {
                    try {
                        this.f51141.mo3924(c9866.f31750);
                        InterfaceC21360 interfaceC21363 = this.f51141;
                        byte[] bArr8 = c9866.f31750;
                        interfaceC21363.mo3929(4, bArr8, i4, bArr8, 4);
                        c9866.f31752 -= this.f51141.mo3928();
                    } catch (AEADBadTagException e2) {
                        throw new C2079("Packet corrupt", e2);
                    }
                } else {
                    this.f51103.mo19965(this.f51125);
                    this.f51103.mo19966(c9866.f31752, c9866.f31750);
                    this.f51103.mo19967(0, this.f51151);
                    C8878 c8878 = this.f51115;
                    byte[] bArr9 = this.f51097;
                    c8878.m23758(0, bArr9.length, bArr9);
                    if (!C9011.m24063(this.f51151, this.f51097)) {
                        throw new C2079("Packet corrupt");
                    }
                    InterfaceC21360 interfaceC21364 = this.f51141;
                    byte[] bArr10 = c9866.f31750;
                    interfaceC21364.mo3922(4, bArr10, i4, bArr10, 4);
                }
            } else {
                this.f51115.m23758(c9866.f31752, this.f51119, c9866.f31750);
                int i7 = c9866.f31752;
                int i8 = this.f51119;
                c9866.f31752 = i7 + i8;
                InterfaceC21360 interfaceC21365 = this.f51141;
                if (interfaceC21365 != null) {
                    byte[] bArr11 = c9866.f31750;
                    interfaceC21365.mo3922(0, bArr11, i8, bArr11, 0);
                }
                byte[] bArr12 = c9866.f31750;
                int i9 = (65280 & (bArr12[2] << 8)) | (16711680 & (bArr12[1] << 16)) | ((-16777216) & (bArr12[0] << 24)) | (bArr12[3] & 255);
                if (i9 < 5 || i9 > 262144) {
                    m37592(c9866, this.f51141, this.f51103, 0, 262144);
                    throw null;
                }
                int i10 = (i9 + 4) - this.f51119;
                int i11 = c9866.f31752;
                int i12 = i11 + i10;
                if (i12 > bArr12.length) {
                    byte[] bArr13 = new byte[i12];
                    System.arraycopy(bArr12, 0, bArr13, 0, i11);
                    c9866.f31750 = bArr13;
                }
                if (i10 % this.f51119 != 0) {
                    this.f51127.m45899().getClass();
                    m37592(c9866, this.f51141, this.f51103, 0, 262144 - this.f51119);
                    throw null;
                }
                if (i10 > 0) {
                    this.f51115.m23758(c9866.f31752, i10, c9866.f31750);
                    c9866.f31752 += i10;
                    InterfaceC21360 interfaceC21366 = this.f51141;
                    if (interfaceC21366 != null) {
                        byte[] bArr14 = c9866.f31750;
                        int i13 = this.f51119;
                        interfaceC21366.mo3922(i13, bArr14, i10, bArr14, i13);
                    }
                }
                InterfaceC7299 interfaceC72910 = this.f51103;
                if (interfaceC72910 != null) {
                    interfaceC72910.mo19965(this.f51125);
                    this.f51103.mo19966(c9866.f31752, c9866.f31750);
                    this.f51103.mo19967(0, this.f51151);
                    C8878 c8879 = this.f51115;
                    byte[] bArr15 = this.f51097;
                    c8879.m23758(0, bArr15.length, bArr15);
                    if (!C9011.m24063(this.f51151, this.f51097)) {
                        int i14 = this.f51119;
                        if (i10 + i14 > 262144) {
                            throw new IOException("MAC Error");
                        }
                        m37592(c9866, this.f51141, this.f51103, c9866.f31752, (262144 - i10) - i14);
                        throw null;
                    }
                }
                c9866 = c9866;
            }
            int i15 = this.f51125 + 1;
            this.f51125 = i15;
            if (i15 == 0 && ((this.f51112 || this.f51095) && this.f51145)) {
                throw new C16248("incoming sequence number wrapped during initial KEX");
            }
            InterfaceC0477 interfaceC0477 = this.f51099;
            if (interfaceC0477 != null) {
                byte[] bArr16 = c9866.f31750;
                byte b = bArr16[4];
                int[] iArr = this.f51093;
                c = 5;
                iArr[0] = (c9866.f31752 - 5) - b;
                byte[] bArrMo2309 = interfaceC0477.mo2309(bArr16, iArr);
                if (bArrMo2309 != null) {
                    c9866.f31750 = bArrMo2309;
                    c9866.f31752 = this.f51093[0] + 5;
                } else {
                    this.f51127.m45899().getClass();
                }
                c9866.f31751 = 0;
                return;
            }
            c = 5;
            int i16 = c9866.f31750[c] & 255;
            if (i16 == 1) {
                c9866.f31751 = 0;
                c9866.m25658();
                c9866.m25657();
                int iM25658 = c9866.m25658();
                byte[] bArrM25649 = c9866.m25649();
                byte[] bArrM256410 = c9866.m25649();
                int length = bArrM25649.length;
                Charset charset = StandardCharsets.UTF_8;
                throw new C17740("SSH_MSG_DISCONNECT: " + iM25658 + " " + new String(bArrM25649, 0, length, charset) + " " + new String(bArrM256410, 0, bArrM256410.length, charset));
            }
            if (!this.f51145 || !this.f51086) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        c9866.f31751 = 0;
                        c9866.m25658();
                        c9866.m25657();
                        c9866.m25658();
                        this.f51127.m45899().getClass();
                    } else if (i16 == 4) {
                        c9866.f31751 = 0;
                        c9866.m25658();
                        c9866.m25657();
                    } else if (i16 == 93) {
                        c9866.f31751 = 0;
                        c9866.m25658();
                        c9866.m25657();
                        AbstractC8375 abstractC8375M37590 = m37590(c9866.m25658());
                        if (abstractC8375M37590 != null) {
                            abstractC8375M37590.m22539(c9866.m25662());
                        }
                    } else if (i16 == 7) {
                        c9866.f31751 = 0;
                        c9866.m25658();
                        c9866.m25657();
                        if (!this.f51136 || this.f51147 || this.f51104) {
                            this.f51127.m45899().getClass();
                            z = true;
                        } else {
                            this.f51127.m45899().getClass();
                            z = false;
                        }
                        long jM25662 = c9866.m25662();
                        for (long j = 0; j < jM25662; j++) {
                            byte[] bArrM256411 = c9866.m25649();
                            byte[] bArrM256412 = c9866.m25649();
                            if (!z) {
                                int length2 = bArrM256411.length;
                                Charset charset2 = StandardCharsets.UTF_8;
                                if (new String(bArrM256411, 0, length2, charset2).equals("server-sig-algs")) {
                                    String str = new String(bArrM256412, 0, bArrM256412.length, charset2);
                                    this.f51127.m45899().getClass();
                                    if (this.f51113) {
                                        str = !str.isEmpty() ? str.concat(",rsa-sha2-256,rsa-sha2-512") : "rsa-sha2-256,rsa-sha2-512";
                                        this.f51127.m45899().getClass();
                                    }
                                    this.f51087 = C9011.m24057(str);
                                }
                            }
                        }
                    } else if (i16 == 52) {
                        this.f51147 = true;
                        if (this.f51099 == null && this.f51124 == null) {
                            m37597(this.f51110[6]);
                            m37596(this.f51110[7]);
                        }
                    }
                }
                c2 = 1;
            }
            c9866.f31751 = 0;
            return;
        }
        m37592(c9866, this.f51141, this.f51103, 0, 262144);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37592(C9866 c9866, InterfaceC21360 interfaceC21360, InterfaceC7299 interfaceC7299, int i, int i2) throws C2079 {
        IOException e;
        if (interfaceC21360.mo3925() && (interfaceC7299 == null || !interfaceC7299.mo2726())) {
            if (interfaceC7299 != null) {
                interfaceC7299.mo19965(this.f51125);
                interfaceC7299.mo19966(i, c9866.f31750);
            }
            while (i2 > 0) {
                try {
                    c9866.m25674();
                    byte[] bArr = c9866.f31750;
                    int length = i2 > bArr.length ? bArr.length : i2;
                    this.f51115.m23758(0, length, bArr);
                    if (interfaceC7299 != null) {
                        interfaceC7299.mo19966(length, c9866.f31750);
                    }
                    i2 -= length;
                } catch (IOException e2) {
                    e = e2;
                    this.f51127.m45899().getClass();
                }
            }
            e = null;
            if (interfaceC7299 != null) {
                interfaceC7299.mo19967(0, c9866.f31750);
            }
            C2079 c2079 = new C2079("Packet corrupt");
            if (e != null) {
                c2079.addSuppressed(e);
                throw c2079;
            }
            throw c2079;
        }
        throw new C2079("Packet corrupt");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m37622() {
        return this.f51107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37593(AbstractC12519 abstractC12519) {
        try {
            m37603(abstractC12519);
            C9011.m24062(abstractC12519.f40189);
            abstractC12519.f40189 = null;
            this.f51104 = false;
            if (this.f51086) {
                this.f51125 = 0;
                this.f51127.m45899().getClass();
            }
        } catch (Throwable th) {
            C9011.m24062(abstractC12519.f40189);
            abstractC12519.f40189 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m37603(AbstractC12519 abstractC12519) throws C2079 {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = abstractC12519.f40189;
        byte[] bArr4 = abstractC12519.f40184;
        InterfaceC1421 interfaceC1421 = abstractC12519.f40187;
        if (this.f51107 == null) {
            byte[] bArr5 = new byte[bArr4.length];
            this.f51107 = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        }
        this.f51132.m25674();
        this.f51132.m25671(bArr3);
        this.f51132.m25671(bArr4);
        this.f51132.m25651((byte) 65);
        this.f51132.m25671(this.f51107);
        C9866 c9866 = this.f51132;
        interfaceC1421.mo5157(c9866.f31752, c9866.f31750);
        this.f51114 = interfaceC1421.mo5158();
        C9866 c9867 = this.f51132;
        int i = c9867.f31752;
        int length = (i - this.f51107.length) - 1;
        byte[] bArr6 = c9867.f31750;
        bArr6[length] = (byte) (bArr6[length] + 1);
        interfaceC1421.mo5157(i, bArr6);
        this.f51146 = interfaceC1421.mo5158();
        C9866 c9868 = this.f51132;
        byte[] bArr7 = c9868.f31750;
        bArr7[length] = (byte) (bArr7[length] + 1);
        interfaceC1421.mo5157(c9868.f31752, bArr7);
        this.f51098 = interfaceC1421.mo5158();
        C9866 c9869 = this.f51132;
        byte[] bArr8 = c9869.f31750;
        bArr8[length] = (byte) (bArr8[length] + 1);
        interfaceC1421.mo5157(c9869.f31752, bArr8);
        this.f51144 = interfaceC1421.mo5158();
        C9866 c98610 = this.f51132;
        byte[] bArr9 = c98610.f31750;
        bArr9[length] = (byte) (bArr9[length] + 1);
        interfaceC1421.mo5157(c98610.f31752, bArr9);
        this.f51120 = interfaceC1421.mo5158();
        C9866 c98611 = this.f51132;
        byte[] bArr10 = c98611.f31750;
        bArr10[length] = (byte) (bArr10[length] + 1);
        interfaceC1421.mo5157(c98611.f31752, bArr10);
        this.f51100 = interfaceC1421.mo5158();
        try {
            this.f51141 = (InterfaceC21360) Class.forName(m37607(this.f51110[3])).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize = this.f51141.getBlockSize();
                bArr = this.f51144;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.f51132.m25674();
                C9866 c98612 = this.f51132;
                c98612.getClass();
                c98612.m25670(0, bArr3.length, bArr3);
                C9866 c98613 = this.f51132;
                c98613.getClass();
                c98613.m25670(0, bArr4.length, bArr4);
                this.f51132.m25671(this.f51144);
                C9866 c98614 = this.f51132;
                interfaceC1421.mo5157(c98614.f31752, c98614.f31750);
                byte[] bArrMo5158 = interfaceC1421.mo5158();
                byte[] bArr11 = this.f51144;
                byte[] bArr12 = new byte[bArr11.length + bArrMo5158.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(bArrMo5158, 0, bArr12, this.f51144.length, bArrMo5158.length);
                this.f51144 = bArr12;
            }
            this.f51141.mo3923(1, bArr, this.f51146);
            this.f51119 = this.f51141.mo3930();
            if (!this.f51141.mo3927()) {
                InterfaceC7299 interfaceC7299 = (InterfaceC7299) Class.forName(m37607(this.f51110[5])).asSubclass(InterfaceC7299.class).getDeclaredConstructor(null).newInstance(null);
                this.f51103 = interfaceC7299;
                byte[] bArrM37594 = m37594(this.f51132, bArr3, bArr4, this.f51100, interfaceC1421, interfaceC7299.getBlockSize());
                this.f51100 = bArrM37594;
                this.f51103.init(bArrM37594);
                this.f51151 = new byte[this.f51103.getBlockSize()];
                this.f51097 = new byte[this.f51103.getBlockSize()];
            }
            this.f51128 = (InterfaceC21360) Class.forName(m37607(this.f51110[2])).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize2 = this.f51128.getBlockSize();
                bArr2 = this.f51098;
                if (blockSize2 <= bArr2.length) {
                    break;
                }
                this.f51132.m25674();
                C9866 c98615 = this.f51132;
                c98615.getClass();
                c98615.m25670(0, bArr3.length, bArr3);
                C9866 c98616 = this.f51132;
                c98616.getClass();
                c98616.m25670(0, bArr4.length, bArr4);
                this.f51132.m25671(this.f51098);
                C9866 c98617 = this.f51132;
                interfaceC1421.mo5157(c98617.f31752, c98617.f31750);
                byte[] bArrMo5159 = interfaceC1421.mo5158();
                byte[] bArr13 = this.f51098;
                byte[] bArr14 = new byte[bArr13.length + bArrMo5159.length];
                System.arraycopy(bArr13, 0, bArr14, 0, bArr13.length);
                System.arraycopy(bArrMo5159, 0, bArr14, this.f51098.length, bArrMo5159.length);
                this.f51098 = bArr14;
            }
            this.f51128.mo3923(0, bArr2, this.f51114);
            this.f51148 = this.f51128.mo3930();
            if (!this.f51128.mo3927()) {
                InterfaceC7299 interfaceC72910 = (InterfaceC7299) Class.forName(m37607(this.f51110[4])).asSubclass(InterfaceC7299.class).getDeclaredConstructor(null).newInstance(null);
                this.f51094 = interfaceC72910;
                byte[] bArrM37595 = m37594(this.f51132, bArr3, bArr4, this.f51120, interfaceC1421, interfaceC72910.getBlockSize());
                this.f51120 = bArrM37595;
                this.f51094.init(bArrM37595);
            }
            m37597(this.f51110[6]);
            m37596(this.f51110[7]);
        } catch (Exception | LinkageError e) {
            if (!(e instanceof C2079)) {
                throw new C2079(e.toString(), e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37594(C9866 c9866, byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC1421 interfaceC1421, int i) {
        int blockSize = interfaceC1421.getBlockSize();
        while (bArr3.length < i) {
            c9866.m25674();
            c9866.m25671(bArr);
            c9866.m25671(bArr2);
            c9866.m25670(0, bArr3.length, bArr3);
            interfaceC1421.mo5157(c9866.f31752, c9866.f31750);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(interfaceC1421.mo5158(), 0, bArr4, bArr3.length, blockSize);
            C9011.m24062(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r20.f27470 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (r20.m22541() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r20.f27484 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r7 = r20.f27484;
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
    
        if (r18.f51128 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        r10 = r18.f51148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r11 = r18.f51094;
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
    
        r12 = r19.f44379;
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
    
        r10 = l.C24579.m54897(r13, r15, r11, 32);
        r11 = r12.f31750;
        r15 = r11.length;
        r14 = ((r12.f31752 + r10) - 14) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r15 >= r14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
    
        r14 = new byte[r14];
        java.lang.System.arraycopy(r11, 0, r14, 0, r11.length);
        r12.f31750 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r11 = r12.f31750;
        java.lang.System.arraycopy(r11, r13, r11, r10, (r12.f31752 - 14) - r9);
        r12.f31752 = 10;
        r12.m25669(r9);
        r12.f31752 = r13;
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r14 = 5;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r9 = r19.f44379.f31750[r14];
        r11 = r20.f27478;
        r6 = r6 - ((int) r7);
        r20.f27484 -= r7;
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
    
        m37595(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r6 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r7 = r19.f44379;
        r8 = r7.f31750;
        java.lang.System.arraycopy(r8, r10, r8, 14, r6);
        r7.f31750[r14] = r9;
        r7.f31752 = 6;
        r7.m25669(r11);
        r7.m25669(r6);
        r7.f31752 = r6 + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0112, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
    
        if (r18.f51104 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if (r20.f27484 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r20.f27484 -= r9;
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
    public final void m37615(l.C14010 r19, l.AbstractC8375 r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15723.m37615(l.۬ܿܶ, l.۠ۘܶ, int):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37627(C14010 c14010) throws C2079 {
        long j = 0;
        while (this.f51104) {
            if (j <= 0 || System.currentTimeMillis() - this.f51101 <= j || this.f51122) {
                byte b = c14010.f44379.f31750[5];
                if (b == 20 || b == 21 || b == 30 || b == 31 || b == 31 || b == 32 || b == 33 || b == 34 || b == 1) {
                    break;
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new C2079("timeout in waiting for rekeying process.");
            }
        }
        m37595(c14010);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37595(C14010 c14010) {
        boolean z = this.f51145;
        boolean z2 = this.f51086;
        boolean z3 = this.f51112;
        boolean z4 = this.f51095;
        boolean z5 = c14010.f44379.f31750[5] == 21 && z2;
        synchronized (this.f51091) {
            m37614(c14010);
            C8878 c8878 = this.f51115;
            if (c8878 != null) {
                OutputStream outputStream = c8878.f29003;
                C9866 c9866 = c14010.f44379;
                outputStream.write(c9866.f31750, 0, c9866.f31752);
                c8878.f29003.flush();
                int i = this.f51143 + 1;
                this.f51143 = i;
                if (i == 0 && ((z3 || z4) && z)) {
                    throw new C16248("outgoing sequence number wrapped during initial KEX");
                }
                if (z5) {
                    this.f51143 = 0;
                }
            }
        }
        if (!z5 || this.f51115 == null) {
            return;
        }
        this.f51127.m45899().getClass();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37629() {
        AbstractC8375 abstractC8375M37590;
        int i;
        byte b;
        this.f51089 = new RunnableC24675(this);
        C9866 c9866 = new C9866();
        C14010 c14010 = new C14010(c9866);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            AbstractC12519 abstractC12519M37602 = null;
            while (true) {
                int i2 = 0;
                while (true) {
                    try {
                        if (this.f51139 && this.f51089 != null) {
                            try {
                                m37613(c9866);
                                int i3 = c9866.f31750[5] & 255;
                                if (abstractC12519M37602 != null && abstractC12519M37602.mo2921() == i3) {
                                    this.f51101 = System.currentTimeMillis();
                                    boolean zMo2920 = abstractC12519M37602.mo2920(c9866);
                                    if (!zMo2920) {
                                        throw new C2079("verify: " + zMo2920);
                                    }
                                } else if (i3 == 20) {
                                    abstractC12519M37602 = m37602(c9866);
                                } else if (i3 != 21) {
                                    switch (i3) {
                                        case 80:
                                            c9866.m25658();
                                            c9866.m25657();
                                            c9866.m25649();
                                            if (c9866.m25650() != 0) {
                                                c14010.m34100();
                                                c9866.m25651((byte) 82);
                                                m37627(c14010);
                                            }
                                            break;
                                        case 81:
                                        case 82:
                                            Thread threadM40432 = this.f51088.m40432();
                                            if (threadM40432 != null) {
                                                this.f51088.getClass();
                                                if (i3 == 81 && this.f51088.m40430() == 0) {
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    this.f51088.m40431(c9866.m25658());
                                                }
                                                threadM40432.interrupt();
                                            }
                                            break;
                                        default:
                                            switch (i3) {
                                                case 90:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    byte[] bArrM25649 = c9866.m25649();
                                                    String str = new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                                                    if ("forwarded-tcpip".equals(str) || (("x11".equals(str) && this.f51123) || ("auth-agent@openssh.com".equals(str) && this.f51152))) {
                                                        final AbstractC8375 abstractC8375M37624 = m37624(str);
                                                        if (abstractC8375M37624 == null) {
                                                            this.f51127.m45899().getClass();
                                                            c14010.m34100();
                                                            c9866.m25651((byte) 92);
                                                            c9866.m25669(c9866.m25658());
                                                            c9866.m25669(4);
                                                            byte[] bArr = C9011.f29358;
                                                            c9866.m25673(bArr);
                                                            c9866.m25660(0, bArr.length, bArr);
                                                            m37627(c14010);
                                                        } else {
                                                            abstractC8375M37624.mo16726(c9866);
                                                            ThreadFactoryC11248 threadFactoryC11248 = this.f51111;
                                                            Runnable runnable = new Runnable() { // from class: l.ܺ֡ܶ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    abstractC8375M37624.mo6777();
                                                                }
                                                            };
                                                            threadFactoryC11248.getClass();
                                                            Thread thread = new Thread(runnable);
                                                            thread.setName("Channel " + str + " " + this.f51092);
                                                            thread.start();
                                                        }
                                                    } else {
                                                        this.f51127.m45899().getClass();
                                                        c14010.m34100();
                                                        c9866.m25651((byte) 92);
                                                        c9866.m25669(c9866.m25658());
                                                        c9866.m25669(1);
                                                        byte[] bArr2 = C9011.f29358;
                                                        c9866.m25673(bArr2);
                                                        c9866.m25660(0, bArr2.length, bArr2);
                                                        m37627(c14010);
                                                    }
                                                    break;
                                                case 91:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37591 = m37590(c9866.m25658());
                                                    int iM25658 = c9866.m25658();
                                                    long jM25662 = c9866.m25662();
                                                    int iM25659 = c9866.m25658();
                                                    if (abstractC8375M37591 != null) {
                                                        abstractC8375M37591.m22550(jM25662);
                                                        abstractC8375M37591.f27477 = iM25659;
                                                        abstractC8375M37591.f27485 = true;
                                                        abstractC8375M37591.m22549(iM25658);
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37592 = m37590(c9866.m25658());
                                                    if (abstractC8375M37592 != null) {
                                                        c9866.m25658();
                                                        abstractC8375M37592.f27470 = true;
                                                        abstractC8375M37592.m22549(0);
                                                    }
                                                    break;
                                                case 93:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37593 = m37590(c9866.m25658());
                                                    if (abstractC8375M37593 != null) {
                                                        abstractC8375M37593.m22539(c9866.m25662());
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                    c9866.m25658();
                                                    c9866.m25650();
                                                    c9866.m25650();
                                                    abstractC8375M37590 = m37590(c9866.m25658());
                                                    int iM256510 = c9866.m25658();
                                                    int i4 = c9866.f31751;
                                                    c9866.f31751 = i4 + iM256510;
                                                    iArr[0] = i4;
                                                    iArr2[0] = iM256510;
                                                    byte[] bArr3 = c9866.f31750;
                                                    if (abstractC8375M37590 != null && iM256510 != 0) {
                                                        try {
                                                            try {
                                                                abstractC8375M37590.mo19148(bArr3, iArr[0], iM256510);
                                                                abstractC8375M37590.f27471 -= iArr2[0];
                                                                if (abstractC8375M37590.f27471 >= abstractC8375M37590.f27468 / 2) {
                                                                    continue;
                                                                } else {
                                                                    c14010.m34100();
                                                                    c9866.m25651((byte) 93);
                                                                    c9866.m25669(abstractC8375M37590.f27478);
                                                                    c9866.m25669(abstractC8375M37590.f27468 - abstractC8375M37590.f27471);
                                                                    synchronized (abstractC8375M37590) {
                                                                        if (!abstractC8375M37590.f27470) {
                                                                            m37627(c14010);
                                                                        }
                                                                    }
                                                                    i = abstractC8375M37590.f27468;
                                                                    abstractC8375M37590.f27471 = i;
                                                                }
                                                            } catch (Exception unused) {
                                                                continue;
                                                            }
                                                        } catch (Exception unused2) {
                                                            abstractC8375M37590.m22548();
                                                        }
                                                    }
                                                    break;
                                                case 95:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    abstractC8375M37590 = m37590(c9866.m25658());
                                                    c9866.m25658();
                                                    int iM256511 = c9866.m25658();
                                                    int i5 = c9866.f31751;
                                                    c9866.f31751 = i5 + iM256511;
                                                    iArr[0] = i5;
                                                    iArr2[0] = iM256511;
                                                    if (abstractC8375M37590 != null && iM256511 != 0) {
                                                        try {
                                                            abstractC8375M37590.f27476.getClass();
                                                            throw null;
                                                        } catch (NullPointerException unused3) {
                                                            abstractC8375M37590.f27471 -= iArr2[0];
                                                            if (abstractC8375M37590.f27471 < abstractC8375M37590.f27468 / 2) {
                                                                c14010.m34100();
                                                                c9866.m25651((byte) 93);
                                                                c9866.m25669(abstractC8375M37590.f27478);
                                                                c9866.m25669(abstractC8375M37590.f27468 - abstractC8375M37590.f27471);
                                                                synchronized (abstractC8375M37590) {
                                                                    if (!abstractC8375M37590.f27470) {
                                                                        m37627(c14010);
                                                                    }
                                                                    i = abstractC8375M37590.f27468;
                                                                    abstractC8375M37590.f27471 = i;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 96:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37594 = m37590(c9866.m25658());
                                                    if (abstractC8375M37594 != null) {
                                                        abstractC8375M37594.mo19149();
                                                    }
                                                    break;
                                                case 97:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37595 = m37590(c9866.m25658());
                                                    if (abstractC8375M37595 != null) {
                                                        abstractC8375M37595.m22548();
                                                    }
                                                    break;
                                                case 98:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    int iM256512 = c9866.m25658();
                                                    byte[] bArrM256410 = c9866.m25649();
                                                    boolean z = c9866.m25650() != 0;
                                                    AbstractC8375 abstractC8375M37596 = m37590(iM256512);
                                                    if (abstractC8375M37596 != null) {
                                                        if (new String(bArrM256410, 0, bArrM256410.length, StandardCharsets.UTF_8).equals("exit-status")) {
                                                            c9866.m25658();
                                                            b = 99;
                                                        } else {
                                                            b = 100;
                                                        }
                                                        if (z) {
                                                            c14010.m34100();
                                                            c9866.m25651(b);
                                                            c9866.m25669(abstractC8375M37596.f27478);
                                                            m37627(c14010);
                                                        }
                                                    }
                                                    break;
                                                case q.f /* 99 */:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37597 = m37590(c9866.m25658());
                                                    if (abstractC8375M37597 != null) {
                                                        abstractC8375M37597.f27479 = 1;
                                                    }
                                                    break;
                                                case 100:
                                                    c9866.m25658();
                                                    c9866.m25657();
                                                    AbstractC8375 abstractC8375M37598 = m37590(c9866.m25658());
                                                    if (abstractC8375M37598 != null) {
                                                        abstractC8375M37598.f27479 = 0;
                                                    }
                                                    break;
                                                default:
                                                    throw new IOException("Unknown SSH message type " + i3);
                                            }
                                            break;
                                    }
                                } else {
                                    C14010 c14011 = this.f51133;
                                    c14011.m34100();
                                    this.f51132.m25651((byte) 21);
                                    m37627(c14011);
                                    this.f51127.m45899().getClass();
                                    m37593(abstractC12519M37602);
                                }
                            } catch (InterruptedIOException e) {
                                if (!this.f51104 && i2 < this.f51135) {
                                    C9866 c9867 = new C9866();
                                    C14010 c14012 = new C14010(c9867);
                                    c14012.m34100();
                                    c9867.m25651(UTF8.S_P4A);
                                    c9867.m25673(f51084);
                                    c9867.m25651((byte) 1);
                                    m37627(c14012);
                                } else if (!this.f51104 || i2 >= this.f51135) {
                                    throw e;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception unused4) {
                        this.f51104 = false;
                        this.f51127.m45899().getClass();
                    }
                }
            }
        }
        try {
            m37625();
        } catch (NullPointerException | Exception unused5) {
        }
        this.f51139 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37612(AbstractC8375 abstractC8375) {
        Lock lockWriteLock = this.f51118.writeLock();
        lockWriteLock.lock();
        try {
            this.f51140.remove(abstractC8375);
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37625() {
        if (this.f51139) {
            this.f51127.m45899().getClass();
            Lock lockWriteLock = this.f51118.writeLock();
            lockWriteLock.lock();
            try {
                this.f51142 = true;
                ArrayList arrayList = new ArrayList(this.f51140);
                lockWriteLock.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractC8375) it.next()).m22548();
                    } catch (Exception unused) {
                        this.f51127.m45899().getClass();
                    }
                }
                this.f51139 = false;
                C21691.m49230(this);
                C5698.m16724(this);
                C14646.m35276(this);
                synchronized (this.f51091) {
                    if (this.f51096 != null) {
                        Thread.yield();
                        this.f51096.interrupt();
                        this.f51096 = null;
                    }
                }
                this.f51089 = null;
                try {
                    C8878 c8878 = this.f51115;
                    if (c8878 != null) {
                        InputStream inputStream = c8878.f29002;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        OutputStream outputStream = this.f51115.f29003;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f51115.getClass();
                    }
                    Socket socket = this.f51137;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception unused2) {
                }
                this.f51115 = null;
                this.f51137 = null;
                lockWriteLock.lock();
                try {
                    this.f51142 = false;
                    this.f51140.clear();
                    lockWriteLock.unlock();
                    this.f51125 = 0;
                    this.f51143 = 0;
                    this.f51145 = true;
                    this.f51086 = false;
                    this.f51134 = false;
                    this.f51087 = null;
                    this.f51127.m45901(this);
                } catch (Throwable th) {
                    lockWriteLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                lockWriteLock.unlock();
                throw th2;
            }
        }
        C15723 c15723 = this.f51121;
        if (c15723 != null) {
            c15723.m37625();
            this.f51121 = null;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ThreadFactoryC11248 m37621() {
        return this.f51111;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37606(String str, int i, int i2, String str2) {
        C21691 c21691M49229 = C21691.m49229(this, str, i, str2, i2);
        RunnableC4537 runnableC4537 = new RunnableC4537(c21691M49229);
        this.f51111.getClass();
        Thread thread = new Thread(runnableC4537);
        thread.setName("PortWatcher Thread for " + str2);
        thread.start();
        return c21691M49229.f69226;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37597(java.lang.String r5) {
        /*
            r4 = this;
            l.֡ܰܶ r0 = r4.f51124
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            r2 = 0
            if (r1 == 0) goto L13
            r4.f51124 = r2
            if (r0 == 0) goto L6e
            r0.end()
            return
        L13:
            java.lang.String r1 = r4.m37607(r5)
            if (r1 == 0) goto L6e
            java.lang.String r3 = "zlib"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L2d
            boolean r3 = r4.f51147
            if (r3 == 0) goto L6e
            java.lang.String r3 = "zlib@openssh.com"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L6e
        L2d:
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.Class<l.֡ܰܶ> r1 = l.InterfaceC0477.class
            java.lang.Class r5 = r5.asSubclass(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            l.֡ܰܶ r5 = (l.InterfaceC0477) r5     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r4.f51124 = r5     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r5 = "compression_level"
            java.lang.String r5 = r4.m37607(r5)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L5b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L5b
            goto L4f
        L4e:
            r5 = 6
        L4f:
            l.֡ܰܶ r1 = r4.f51124     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r2 = 1
            r1.mo2308(r2, r5, r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 == 0) goto L6e
            r0.end()
            goto L6e
        L5b:
            r5 = move-exception
            goto L68
        L5d:
            r5 = move-exception
            l.֫ܿܶ r1 = new l.֫ܿܶ     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: l.C15723.m37597(java.lang.String):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004d */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37596(java.lang.String r5) {
        /*
            r4 = this;
            l.֡ܰܶ r0 = r4.f51099
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            r2 = 0
            if (r1 == 0) goto L13
            r4.f51099 = r2
            if (r0 == 0) goto L60
            r0.end()
            return
        L13:
            java.lang.String r1 = r4.m37607(r5)
            if (r1 == 0) goto L60
            java.lang.String r3 = "zlib"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L2d
            boolean r3 = r4.f51147
            if (r3 == 0) goto L60
            java.lang.String r3 = "zlib@openssh.com"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L60
        L2d:
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Class<l.֡ܰܶ> r1 = l.InterfaceC0477.class
            java.lang.Class r5 = r5.asSubclass(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            l.֡ܰܶ r5 = (l.InterfaceC0477) r5     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r4.f51099 = r5     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r1 = 0
            r5.mo2308(r1, r1, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r0 == 0) goto L60
            r0.end()
            return
        L4d:
            r5 = move-exception
            goto L5a
        L4f:
            r5 = move-exception
            l.֫ܿܶ r1 = new l.֫ܿܶ     // Catch: java.lang.Throwable -> L4d
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
        throw new UnsupportedOperationException("Method not decompiled: l.C15723.m37596(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private AbstractC8375 m37601(String str) {
        C13595 c13595;
        C1969 c1969 = str.equals(d.aw) ? new C1969() : null;
        if (str.equals("shell")) {
            C6444 c6444 = new C6444();
            c6444.f6611 = true;
            c1969 = c6444;
        }
        C1969 c22852 = c1969;
        if (str.equals("exec")) {
            c22852 = new C22852();
        }
        AbstractC8375 c14646 = c22852;
        if (str.equals("x11")) {
            c14646 = new C14646();
        }
        AbstractC8375 c6884 = c14646;
        if (str.equals("auth-agent@openssh.com")) {
            c6884 = new C6884();
        }
        AbstractC8375 c22106 = c6884;
        if (str.equals("direct-tcpip")) {
            c22106 = new C22106();
        }
        AbstractC8375 c5698 = c22106;
        if (str.equals("forwarded-tcpip")) {
            c5698 = new C5698();
        }
        AbstractC8375 abstractC8375 = c5698;
        if (str.equals("sftp")) {
            C20614 c20614 = new C20614();
            c20614.m47229(m37607("use_sftp_write_flush_workaround").equals("yes"));
            abstractC8375 = c20614;
        }
        AbstractC8375 abstractC8376 = abstractC8375;
        if (str.equals("subsystem")) {
            C4206 c4206 = new C4206();
            c4206.f15359 = true;
            c4206.f15360 = "";
            abstractC8376 = c4206;
        }
        AbstractC8375 abstractC8377 = abstractC8376;
        if (str.equals("direct-streamlocal@openssh.com")) {
            c13595 = new C13595();
        }
        if (abstractC8377 == null) {
            abstractC8377 = c13595;
            return null;
        }
        abstractC8377 = c13595;
        Lock lockWriteLock = this.f51118.writeLock();
        lockWriteLock.lock();
        try {
            if (this.f51142 || !this.f51139) {
                return null;
            }
            abstractC8377.f27469 = this;
            this.f51140.add(abstractC8377);
            return abstractC8377;
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String[] m37623() {
        return this.f51087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37611(InterfaceC0808 interfaceC0808) {
        this.f51109 = interfaceC0808;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0808 m37605() {
        return this.f51109;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37610(String str, String str2) throws Throwable {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2 == null ? null : str2.getBytes();
        C19978 c19978 = this.f51127;
        c19978.m45897(C14098.m34255(c19978.f64193, "builtin", bytes), bytes2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m37619(String str) {
        if (str != null) {
            byte[] bArr = C9011.f29358;
            this.f51129 = C9011.m24055(str, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37626(String str, String str2) {
        synchronized (this.f51091) {
            if (this.f51150 == null) {
                this.f51150 = new Hashtable();
            }
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                this.f51150.put("PubkeyAcceptedAlgorithms", str2);
            } else {
                this.f51150.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37607(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable hashtable = this.f51150;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String strM45892 = C19978.m45892(str);
        if (strM45892 != null) {
            return strM45892;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37620() {
        return this.f51139;
    }

    static {
        byte[] bArr = C9011.f29358;
        f51084 = "keepalive@jcraft.com".getBytes(StandardCharsets.UTF_8);
        C9011.m24065("no-more-sessions@openssh.com");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m37604(String str) {
        try {
            InterfaceC21360 interfaceC21360 = (InterfaceC21360) Class.forName(str).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC21360.mo3923(0, new byte[interfaceC21360.getBlockSize()], new byte[interfaceC21360.mo3930()]);
            return true;
        } catch (Exception | LinkageError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m37599() {
        if (m37607("ClearAllForwardings").equals("yes")) {
            return;
        }
        this.f51127.getClass();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC8790 m37628() {
        return this.f51127.m45899();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37618() {
        InterfaceC21360 interfaceC21360 = this.f51128;
        InterfaceC7299 interfaceC7299 = this.f51094;
        int blockSize = 20;
        if (interfaceC21360 != null && (interfaceC21360.mo3926() || interfaceC21360.mo3927())) {
            if (interfaceC21360.mo3928() > 20) {
                blockSize = interfaceC21360.mo3928();
            }
        } else if (interfaceC7299 != null && interfaceC7299.getBlockSize() > 20) {
            blockSize = interfaceC7299.getBlockSize();
        }
        return blockSize + 64;
    }
}
