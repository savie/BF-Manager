package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: renamed from: l.᩸᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RM */
/* JADX INFO: loaded from: classes.dex */
public final class C23124 extends AbstractC11189 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74989;

    public C23124() {
        super(new C18428("XZ Stream or its Index has grown too big"));
        this.f74989 = new ArrayList();
    }

    @Override // l.AbstractC11189
    /* JADX INFO: renamed from: ۙ */
    public final void mo28193(long j, long j2) throws C18428 {
        super.mo28193(j, j2);
        this.f74989.add(new C15664(j, j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52059(OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, crc32);
        checkedOutputStream.write(0);
        C7241.m19866(checkedOutputStream, this.f35293);
        for (C15664 c15664 : this.f74989) {
            C7241.m19866(checkedOutputStream, c15664.f50931);
            C7241.m19866(checkedOutputStream, c15664.f50930);
        }
        for (int iM28192 = m28192(); iM28192 > 0; iM28192--) {
            checkedOutputStream.write(0);
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    @Override // l.AbstractC11189
    /* JADX INFO: renamed from: ۤ */
    public final long mo28194() {
        return m28195() + this.f35289 + 12 + 12;
    }
}
