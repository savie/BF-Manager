package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2581 implements InterfaceC20481 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f8285 = "payload.bin".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8286;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7319 f8287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23465 f8288;

    public C2581(C23465 c23465, int i, C7319 c7319) {
        this.f8288 = c23465;
        this.f8286 = i;
        this.f8287 = c7319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2581 m8637(String str, String str2, int i, C7319 c7319, C8547 c8547) throws Throwable {
        C24363 c24363M49093 = C21576.m49093();
        if (i > 0 && i <= 16) {
            C14030 c14030 = new C14030(c24363M49093, str, str2, c7319, c8547);
            C7319 c7319M34161 = c14030.m34161();
            C13961 c13961M29495 = C11746.m29495(c14030);
            try {
                long length = c13961M29495.length();
                C22941 c22941M51702 = C22941.m51702(c13961M29495, new C12669(8));
                try {
                    try {
                        C8002 entry = c22941M51702.getEntry("payload.bin");
                        if (entry == null) {
                            throw new C3090(R.string.MT_Protector);
                        }
                        m8638(entry, length);
                        C13961 c13961Mo34033 = c22941M51702.m51735().mo34033(entry.m21811(), entry.getSize());
                        try {
                            C23465 c23465 = new C23465(c13961Mo34033);
                            String strM8636 = m8636(c23465);
                            if (c7319 != null) {
                                c7319.m20070(strM8636);
                            }
                            try {
                                C2581 c2581 = new C2581(c23465, i, c7319M34161.m20073(strM8636));
                                c22941M51702.close();
                                return c2581;
                            } catch (Throwable th) {
                                th = th;
                                c13961Mo34033 = null;
                                if (c13961Mo34033 != null) {
                                    c13961Mo34033.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            c22941M51702.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c13961M29495 = null;
                    if (c13961M29495 != null) {
                        c13961M29495.close();
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
    public static String m8636(C23465 c23465) {
        MessageDigest messageDigestM36179 = C15022.m36179();
        C6178 c6178 = new C6178();
        ArrayList<C4819> arrayList = (ArrayList) c23465.mo8645();
        c6178.writeInt(arrayList.size());
        c6178.m17805(messageDigestM36179);
        c6178.m17793();
        for (C4819 c4819 : arrayList) {
            byte[] byteArray = c4819.f16862.toByteArray();
            c6178.writeInt(byteArray.length);
            c6178.m17803(c4819.m14850());
            c6178.m17803(c4819.m14849());
            c6178.m17805(messageDigestM36179);
            c6178.m17793();
            messageDigestM36179.update(byteArray);
        }
        return C15022.m36182(messageDigestM36179.digest());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8638(C8002 c8002, long j) throws IOException {
        if (c8002.m21856()) {
            throw new IOException("payload.bin is encrypted");
        }
        if (c8002.m21826() != 0) {
            throw new IOException("payload.bin is compressed");
        }
        long size = c8002.getSize();
        long jM21838 = c8002.m21838();
        long jM21811 = c8002.m21811();
        if (size <= 0 || jM21838 != size) {
            throw new IOException("payload.bin has inconsistent ZIP sizes");
        }
        if (jM21811 < 0 || jM21811 > j || size > j - jM21811) {
            throw new IOException("payload.bin exceeds the remote ZIP bounds");
        }
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final List mo8645() {
        return C4681.unmodifiableList(this.f8288.mo8645());
    }

    @Override // l.InterfaceC20481
    public final C4819 getEntry(String str) {
        return this.f8288.getEntry(str);
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4819 mo8640(String str) {
        return this.f8288.mo8640(str);
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8643(C4819 c4819, C13961 c13961, InterfaceC24957 interfaceC24957) throws IOException {
        try {
            m8644(c4819, c13961, interfaceC24957, this.f8286);
        } catch (InterruptedIOException e) {
            if (!interfaceC24957.mo13156()) {
                throw e;
            }
        }
    }

    @Override // l.InterfaceC20481
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20177 mo8642(C4819 c4819) throws IOException {
        if (c4819 != null) {
            String strM14851 = c4819.m14851();
            C23465 c23465 = this.f8288;
            if (c23465.getEntry(strM14851) == c4819) {
                return c23465.mo8642(c4819);
            }
        }
        throw new IOException("Payload entry does not belong to this remote payload");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8644(C4819 c4819, C13961 c13961, InterfaceC24957 interfaceC24957, int i) throws IOException {
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        String strM14851 = c4819.m14851();
        C23465 c23465 = this.f8288;
        if (c23465.getEntry(strM14851) != c4819) {
            throw new IOException("Payload entry does not belong to this remote payload");
        }
        C24935 c24935 = c4819.f16862;
        if (!c24935.hasNewPartitionInfo()) {
            throw new IOException("Missing new partition info: " + c4819.m14851());
        }
        C15237 newPartitionInfo = c24935.getNewPartitionInfo();
        if (!newPartitionInfo.hasSize() || !newPartitionInfo.hasHash()) {
            throw new IOException("Missing partition size or hash: " + c4819.m14851());
        }
        long size = newPartitionInfo.getSize();
        byte[] bArrM40222 = newPartitionInfo.getHash().m40222();
        if (size != c4819.m14850() || bArrM40222.length != 32) {
            throw new IOException("Invalid partition verification metadata: " + c4819.m14851());
        }
        c23465.m52676(c4819, c13961, interfaceC24957, i);
        if (interfaceC24957.mo13156()) {
            throw new InterruptedIOException("Payload extraction was canceled");
        }
        C3374 c3374 = new C3374(Math.max(size, 1L));
        c3374.m11078(new C25360(interfaceC24957));
        c3374.m11079(0);
        c13961.flush();
        long length = c13961.length();
        if (length != size) {
            StringBuilder sbM8289 = C2458.m8289("Extracted partition size mismatch: expected ", ", actual ", size);
            sbM8289.append(length);
            sbM8289.append(" (");
            sbM8289.append(c4819.m14851());
            sbM8289.append(')');
            throw new IOException(sbM8289.toString());
        }
        MessageDigest messageDigestM36179 = C15022.m36179();
        int i2 = 524288;
        byte[] bArr = new byte[524288];
        long j = 0;
        c13961.seek(0L);
        long j2 = size;
        while (j2 > j) {
            if (interfaceC24957.mo13156()) {
                throw new InterruptedIOException("Payload extraction was canceled");
            }
            int iMin = (int) Math.min(j2, i2);
            c13961.readFully(bArr, 0, iMin);
            messageDigestM36179.update(bArr, 0, iMin);
            j2 -= (long) iMin;
            c3374.m11079(iMin);
            i2 = 524288;
            j = 0;
        }
        if (size == j) {
            c3374.m11079(1);
        }
        byte[] bArrDigest = messageDigestM36179.digest();
        if (MessageDigest.isEqual(bArrM40222, bArrDigest)) {
            return;
        }
        throw new IOException("Partition SHA-256 mismatch: expected " + C15022.m36182(bArrM40222) + ", actual " + C15022.m36182(bArrDigest) + " (" + c4819.m14851() + ')');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7319 m8641() {
        return this.f8287;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8288.close();
    }
}
