package l;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes.dex */
public final class C24151 extends AbstractC5035 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f78161;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f78162;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f78163;

    public C24151(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, boolean z) {
        super(parcelFileDescriptor);
        this.f78163 = str;
        this.f78162 = str2;
        this.f78161 = z;
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return new File(this.f78163).getName();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() {
        return C7742.m21077(this.f78161).m38060(this.f78163, this.f78162);
    }

    @Override // l.AbstractC5035, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f78162.equals("r")) {
            try {
                super.close();
            } catch (IOException unused) {
            }
        } else {
            super.close();
        }
    }
}
