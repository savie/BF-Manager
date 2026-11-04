package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12385 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24320 f39758;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f39759;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39760;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12385(C24320 c24320, BufferedInputStream bufferedInputStream, String str, boolean z) {
        super(bufferedInputStream);
        this.f39758 = c24320;
        this.f39760 = str;
        this.f39759 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        String str = this.f39760;
        C24320 c24320 = this.f39758;
        try {
            int i = super.read();
            if (i == -1 && !this.f39757) {
                this.f39757 = true;
                C21054.m48114(c24320.f78725.mo4294(), str);
            }
            return i;
        } catch (C16227 e) {
            C21054.m48111(c24320.f78725.mo4294(), str);
            if (this.f39759) {
                C18902.m43874();
            }
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str = this.f39760;
        C24320 c24320 = this.f39758;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && !this.f39757) {
                this.f39757 = true;
                C21054.m48114(c24320.f78725.mo4294(), str);
            }
            return i3;
        } catch (C16227 e) {
            C21054.m48111(c24320.f78725.mo4294(), str);
            if (this.f39759) {
                C18902.m43874();
            }
            throw e;
        }
    }
}
