package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۡۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R89U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8823 extends AbstractC19406 implements Closeable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumSet f30339;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f30340;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f30341;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2243 f30342;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30343;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6396 f30344;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30345;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f30346;

    static {
        EnumC3055 enumC3055 = EnumC3055.STATUS_SUCCESS;
        EnumC3055 enumC3056 = EnumC3055.STATUS_BUFFER_OVERFLOW;
        f30341 = EnumSet.of(enumC3055, enumC3056);
        f30339 = EnumSet.of(enumC3055, enumC3056, EnumC3055.STATUS_END_OF_FILE);
        f30340 = EnumSet.of(enumC3055);
    }

    public C8823(C20858 c20858, C2243 c2243, String str) {
        super(c20858, c2243.m47744().m20821());
        this.f30342 = c2243;
        this.f30344 = ((C0481) m44457(new C20238(c20858.m46888().m4290().m11484(), c20858.m46886(), c2243.m47744().m20822(), EnumC14864.Impersonation, EnumSet.of(EnumC14346.FILE_READ_DATA, EnumC14346.FILE_WRITE_DATA), null, EnumSet.of(EnumC13182.FILE_SHARE_READ, EnumC13182.FILE_SHARE_WRITE), EnumC7808.FILE_OPEN_IF, null, new C11748(c2243.m47755(), str)), EnumSet.of(EnumC3055.STATUS_SUCCESS))).m2354();
        this.f30343 = Math.min(c2243.m47744().m20821().m38670(), c20858.m46888().m4290().m11485());
        this.f30345 = Math.min(c2243.m47744().m20821().m38662(), c20858.m46888().m4290().m11486());
        this.f30346 = Math.min(c2243.m47744().m20821().m38672(), c20858.m46888().m4290().m11483());
    }

    public final byte[] read() {
        C2225 c2225;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            c2225 = (C2225) m44457(new C11399(m44458(), this.f30344, m44459(), this.f30342.m47744().m20822(), 0L, this.f30345), f30339);
            try {
                byteArrayOutputStream.write(c2225.m6848());
            } catch (IOException e) {
                throw new C13865(e);
            }
        } while (EnumC3055.m9149(((C1186) c2225.mo25478()).m4349()).equals(EnumC3055.STATUS_BUFFER_OVERFLOW));
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f30342.mo6887(this.f30344);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m22959(byte[] bArr) throws IOException {
        C6126 c6126 = (C6126) m44457(new C17415(m44458(), m44459(), this.f30342.m47744().m20822(), 1163287L, this.f30344, new C3923(0L, bArr.length, bArr), this.f30343), f30341);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        try {
            byteArrayOutputStream.write(c6126.m17104());
            if (EnumC3055.m9149(((C1186) c6126.mo25478()).m4349()).equals(EnumC3055.STATUS_BUFFER_OVERFLOW)) {
                byteArrayOutputStream.write(read());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C13865(e);
        }
    }

    public final void write(byte[] bArr) {
    }
}
