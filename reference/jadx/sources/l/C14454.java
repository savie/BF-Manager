package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14454 implements InterfaceC19392 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f47399 = "payload.bin".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14413 f47400;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f47401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18686 f47402;

    public C14454(C18686 c18686, int i, C14413 c14413) {
        this.f47402 = c18686;
        this.f47401 = i;
        this.f47400 = c14413;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14454 m34853(String str, String str2, int i, C14413 c14413, C1752 c1752) throws Throwable {
        C5079 c5079M39297 = C16737.m39297();
        if (i > 0 && i <= 16) {
            C1711 c1711 = new C1711(c5079M39297, str, str2, c14413, c1752);
            C14413 c14413M5708 = c1711.m5708();
            C1388 c1388M44887 = C19734.m44887(c1711);
            try {
                long length = c1388M44887.length();
                C2455 c2455M7445 = C2455.m7445(c1388M44887, new C7309());
                try {
                    try {
                        C12107 entry = c2455M7445.getEntry("payload.bin");
                        if (entry == null) {
                            throw new C8142(R.string.MT_Protector);
                        }
                        m34854(entry, length);
                        C1388 c1388Mo4868 = c2455M7445.m7467().mo4868(entry.m30099(), entry.getSize());
                        try {
                            C18686 c18686 = new C18686(c1388Mo4868);
                            String strM34852 = m34852(c18686);
                            if (c14413 != null) {
                                c14413.m34681(strM34852);
                            }
                            try {
                                C14454 c14454 = new C14454(c18686, i, c14413M5708.m34684(strM34852));
                                c2455M7445.close();
                                return c14454;
                            } catch (Throwable th) {
                                th = th;
                                c1388Mo4868 = null;
                                if (c1388Mo4868 != null) {
                                    c1388Mo4868.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            c2455M7445.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c1388M44887 = null;
                    if (c1388M44887 != null) {
                        c1388M44887.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            throw new IOException("Download thread count must be between 1 and 16");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34852(C18686 c18686) {
        MessageDigest messageDigestM49421 = C22253.m49421();
        C11018 c11018 = new C11018();
        ArrayList<C9474> arrayList = (ArrayList) c18686.mo34856();
        c11018.writeInt(arrayList.size());
        c11018.m27793(messageDigestM49421);
        c11018.m27774();
        for (C9474 c9474 : arrayList) {
            byte[] byteArray = c9474.f32063.toByteArray();
            c11018.writeInt(byteArray.length);
            c11018.m27791(c9474.m24283());
            c11018.m27791(c9474.m24282());
            c11018.m27793(messageDigestM49421);
            c11018.m27774();
            messageDigestM49421.update(byteArray);
        }
        return C22253.m49424(messageDigestM49421.digest());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34854(C12107 c12107, long j) throws IOException {
        if (c12107.m30133()) {
            throw new IOException("payload.bin is encrypted");
        }
        if (c12107.m30119() != 0) {
            throw new IOException("payload.bin is compressed");
        }
        long size = c12107.getSize();
        long jM30138 = c12107.m30138();
        long jM30099 = c12107.m30099();
        if (size <= 0 || jM30138 != size) {
            throw new IOException("payload.bin has inconsistent ZIP sizes");
        }
        if (jM30099 < 0 || jM30099 > j || size > j - jM30099) {
            throw new IOException("payload.bin exceeds the remote ZIP bounds");
        }
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final List mo34856() {
        return C0561.unmodifiableList(this.f47402.mo34856());
    }

    @Override // l.InterfaceC19392
    public final C9474 getEntry(String str) {
        return this.f47402.getEntry(str);
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9474 mo34857(String str) {
        return this.f47402.mo34857(str);
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34860(C9474 c9474, C1388 c1388, InterfaceC22920 interfaceC22920) throws IOException {
        try {
            m34861(c9474, c1388, interfaceC22920, this.f47401);
        } catch (InterruptedIOException e) {
            if (!interfaceC22920.mo1827()) {
                throw e;
            }
        }
    }

    @Override // l.InterfaceC19392
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2599 mo34858(C9474 c9474) throws IOException {
        if (c9474 != null) {
            String strM24284 = c9474.m24284();
            C18686 c18686 = this.f47402;
            if (c18686.getEntry(strM24284) == c9474) {
                return c18686.mo34858(c9474);
            }
        }
        throw new IOException("Payload entry does not belong to this remote payload");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34861(C9474 c9474, C1388 c1388, InterfaceC22920 interfaceC22920, int i) throws IOException {
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        String strM24284 = c9474.m24284();
        C18686 c18686 = this.f47402;
        if (c18686.getEntry(strM24284) != c9474) {
            throw new IOException("Payload entry does not belong to this remote payload");
        }
        C23231 c23231 = c9474.f32063;
        if (!c23231.hasNewPartitionInfo()) {
            throw new IOException("Missing new partition info: " + c9474.m24284());
        }
        C22525 newPartitionInfo = c23231.getNewPartitionInfo();
        if (!newPartitionInfo.hasSize() || !newPartitionInfo.hasHash()) {
            throw new IOException("Missing partition size or hash: " + c9474.m24284());
        }
        long size = newPartitionInfo.getSize();
        byte[] bArrM52259 = newPartitionInfo.getHash().m52259();
        if (size != c9474.m24283() || bArrM52259.length != 32) {
            throw new IOException("Invalid partition verification metadata: " + c9474.m24284());
        }
        c18686.m43171(c9474, c1388, interfaceC22920, i);
        if (interfaceC22920.mo1827()) {
            throw new InterruptedIOException("Payload extraction was canceled");
        }
        C8516 c8516 = new C8516(Math.max(size, 1L));
        c8516.m22241(new C1172(3, interfaceC22920));
        c8516.m22242(0);
        c1388.flush();
        long length = c1388.length();
        if (length != size) {
            StringBuilder sbM39970 = C17114.m39970("Extracted partition size mismatch: expected ", ", actual ", size);
            sbM39970.append(length);
            sbM39970.append(" (");
            sbM39970.append(c9474.m24284());
            sbM39970.append(')');
            throw new IOException(sbM39970.toString());
        }
        MessageDigest messageDigestM49421 = C22253.m49421();
        int i2 = 524288;
        byte[] bArr = new byte[524288];
        long j = 0;
        c1388.seek(0L);
        long j2 = size;
        while (j2 > j) {
            if (interfaceC22920.mo1827()) {
                throw new InterruptedIOException("Payload extraction was canceled");
            }
            int iMin = (int) Math.min(j2, i2);
            c1388.m4864(bArr, 0, iMin);
            messageDigestM49421.update(bArr, 0, iMin);
            j2 -= (long) iMin;
            c8516.m22242(iMin);
            i2 = 524288;
            j = 0;
        }
        if (size == j) {
            c8516.m22242(1);
        }
        byte[] bArrDigest = messageDigestM49421.digest();
        if (MessageDigest.isEqual(bArrM52259, bArrDigest)) {
            return;
        }
        throw new IOException("Partition SHA-256 mismatch: expected " + C22253.m49424(bArrM52259) + ", actual " + C22253.m49424(bArrDigest) + " (" + c9474.m24284() + ')');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14413 m34859() {
        return this.f47400;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47402.close();
    }
}
