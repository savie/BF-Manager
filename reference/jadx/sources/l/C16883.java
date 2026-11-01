package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16883 implements InterfaceC7317 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public File f53987;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12257 f53988;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public OutputStream f53989;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f53990;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f53991;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f53992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16178 f53993;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f53994;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6859 f53995;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f53996;

    public C16883(InterfaceC16178 interfaceC16178) {
        interfaceC16178.getClass();
        this.f53993 = interfaceC16178;
        this.f53994 = 5242880L;
        this.f53990 = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
    }

    @Override // l.InterfaceC7317
    /* JADX INFO: renamed from: ۙ */
    public final void mo19523(C12257 c12257) throws C20411 {
        int i = c12257.f41012;
        c12257.f41013.getClass();
        if (c12257.f41017 == -1 && (i & 2) == 2) {
            this.f53988 = null;
            return;
        }
        this.f53988 = c12257;
        this.f53996 = (i & 4) == 4 ? this.f53994 : C17492.FOREVER_NS;
        this.f53991 = 0L;
        try {
            m39549(c12257);
        } catch (IOException e) {
            throw new C20411(e);
        }
    }

    @Override // l.InterfaceC7317
    public final void write(byte[] bArr, int i, int i2) throws C20411 {
        C12257 c12257 = this.f53988;
        if (c12257 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f53992 == this.f53996) {
                    m39548();
                    m39549(c12257);
                }
                int iMin = (int) Math.min(i2 - i3, this.f53996 - this.f53992);
                OutputStream outputStream = this.f53989;
                String str = C17983.f57504;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f53992 += j;
                this.f53991 += j;
            } catch (IOException e) {
                throw new C20411(e);
            }
        }
    }

    @Override // l.InterfaceC7317
    public final void close() throws C20411 {
        if (this.f53988 == null) {
            return;
        }
        try {
            m39548();
        } catch (IOException e) {
            throw new C20411(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39549(C12257 c12257) {
        long j = c12257.f41017;
        long jMin = j != -1 ? Math.min(j - this.f53991, this.f53996) : -1L;
        String str = c12257.f41013;
        String str2 = C17983.f57504;
        this.f53987 = this.f53993.mo36697(str, c12257.f41009 + this.f53991, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f53987);
        int i = this.f53990;
        if (i > 0) {
            C6859 c6859 = this.f53995;
            if (c6859 == null) {
                this.f53995 = new C6859(fileOutputStream, i);
            } else {
                c6859.m18482(fileOutputStream);
            }
            this.f53989 = this.f53995;
        } else {
            this.f53989 = fileOutputStream;
        }
        this.f53992 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39548() {
        OutputStream outputStream = this.f53989;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C17983.m41837(this.f53989);
            this.f53989 = null;
            File file = this.f53987;
            this.f53987 = null;
            this.f53993.mo36700(file, this.f53992);
        } catch (Throwable th) {
            C17983.m41837(this.f53989);
            this.f53989 = null;
            File file2 = this.f53987;
            this.f53987 = null;
            file2.delete();
            throw th;
        }
    }
}
