package l;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes5.dex */
public final class C15579 extends AbstractC13384 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f50643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f50644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f50645;

    public C15579(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, boolean z) {
        super(parcelFileDescriptor);
        this.f50645 = str;
        this.f50643 = str2;
        this.f50644 = z;
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return new File(this.f50645).getName();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() {
        return C12051.m29947(this.f50644).m20575(this.f50645, this.f50643);
    }

    @Override // l.AbstractC13384, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f50643.equals("r")) {
            try {
                super.close();
            } catch (IOException unused) {
            }
        } else {
            super.close();
        }
    }
}
