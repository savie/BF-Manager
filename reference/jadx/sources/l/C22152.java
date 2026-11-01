package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes.dex */
public final class C22152 implements InterfaceC18624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16508 f72464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3218 f72465;

    public C22152(C16508 c16508, C3218 c3218) {
        this.f72464 = c16508;
        this.f72465 = c3218;
    }

    @Override // l.InterfaceC18624
    /* JADX INFO: renamed from: ۙ */
    public final int mo43073(long j, byte[] bArr, int i, int i2) {
        int iM9640 = this.f72465.m9640(j, bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (iM9640 == 0) {
            return -1;
        }
        return iM9640;
    }

    @Override // l.InterfaceC18624
    public final void close() throws IOException {
        IOException iOExceptionM38788 = this.f72464.m38788(this.f72465, (IOException) null);
        if (iOExceptionM38788 != null) {
            throw iOExceptionM38788;
        }
    }
}
