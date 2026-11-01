package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: renamed from: l.۫۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12428 extends AbstractC16661 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f41464;

    public C12428() {
        super(new C21599("XZ Stream or its Index has grown too big"));
        this.f41464 = new ArrayList();
    }

    @Override // l.AbstractC16661
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30885(long j, long j2) throws C21599 {
        super.mo30885(j, j2);
        this.f41464.add(new C6077(j, j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30886(OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, crc32);
        checkedOutputStream.write(0);
        C15956.m37939(checkedOutputStream, this.f53412);
        for (C6077 c6077 : this.f41464) {
            C15956.m37939(checkedOutputStream, c6077.f20585);
            C15956.m37939(checkedOutputStream, c6077.f20584);
        }
        for (int iM39125 = m39125(); iM39125 > 0; iM39125--) {
            checkedOutputStream.write(0);
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    @Override // l.AbstractC16661
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo30887() {
        return m39126() + this.f53413 + 12 + 12;
    }
}
