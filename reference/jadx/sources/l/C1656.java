package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C1656 implements InterfaceC20146 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public OutputStream f5729;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5730;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f5731;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15079 f5732;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f5733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public File f5734;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5735;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f5736;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9112 f5737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C25368 f5738;

    public C1656(InterfaceC15079 interfaceC15079) {
        interfaceC15079.getClass();
        this.f5732 = interfaceC15079;
        this.f5731 = 5242880L;
        this.f5730 = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
    }

    @Override // l.InterfaceC20146
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5947(C25368 c25368) throws C12842 {
        int i = c25368.f81906;
        c25368.f81911.getClass();
        if (c25368.f81910 == -1 && (i & 2) == 2) {
            this.f5738 = null;
            return;
        }
        this.f5738 = c25368;
        this.f5735 = (i & 4) == 4 ? this.f5731 : C25227.FOREVER_NS;
        this.f5736 = 0L;
        try {
            m5946(c25368);
        } catch (IOException e) {
            throw new C12842(e);
        }
    }

    @Override // l.InterfaceC20146
    public final void write(byte[] bArr, int i, int i2) throws C12842 {
        C25368 c25368 = this.f5738;
        if (c25368 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f5733 == this.f5735) {
                    m5945();
                    m5946(c25368);
                }
                int iMin = (int) Math.min(i2 - i3, this.f5735 - this.f5733);
                OutputStream outputStream = this.f5729;
                String str = C7116.f23455;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f5733 += j;
                this.f5736 += j;
            } catch (IOException e) {
                throw new C12842(e);
            }
        }
    }

    @Override // l.InterfaceC20146
    public final void close() throws C12842 {
        if (this.f5738 == null) {
            return;
        }
        try {
            m5945();
        } catch (IOException e) {
            throw new C12842(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m5946(C25368 c25368) {
        long j = c25368.f81910;
        long jMin = j != -1 ? Math.min(j - this.f5736, this.f5735) : -1L;
        String str = c25368.f81911;
        String str2 = C7116.f23455;
        this.f5734 = this.f5732.mo22516(str, c25368.f81909 + this.f5736, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f5734);
        int i = this.f5730;
        if (i > 0) {
            C9112 c9112 = this.f5737;
            if (c9112 == null) {
                this.f5737 = new C9112(fileOutputStream, i);
            } else {
                c9112.m24265(fileOutputStream);
            }
            this.f5729 = this.f5737;
        } else {
            this.f5729 = fileOutputStream;
        }
        this.f5733 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5945() {
        OutputStream outputStream = this.f5729;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C7116.m19484(this.f5729);
            this.f5729 = null;
            File file = this.f5734;
            this.f5734 = null;
            this.f5732.mo22519(file, this.f5733);
        } catch (Throwable th) {
            C7116.m19484(this.f5729);
            this.f5729 = null;
            File file2 = this.f5734;
            this.f5734 = null;
            file2.delete();
            throw th;
        }
    }
}
