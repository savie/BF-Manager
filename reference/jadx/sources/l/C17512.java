package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.ܿᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17512 implements InterfaceC7034 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ByteArrayOutputStream f55681;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20958[] f55682;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f55683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5518 f55684;

    public C17512(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, C20958[] c20958Arr, C5518 c5518) {
        this.f55683 = bArr;
        this.f55681 = byteArrayOutputStream;
        this.f55682 = c20958Arr;
        this.f55684 = c5518;
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
        long j = c21145.f68868;
        byte[] bArr = this.f55683;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 < length) {
            throw C23884.m52647("Appended bytes exceed the supported final file size.", j2, length);
        }
        try {
            InputStream inputStreamM47580 = c21145.m47580();
            try {
                this.f55682[0] = C16020.m37994(inputStreamM47580, new C12574(this, bufferedOutputStream), c21145.f68868, this.f55684, bArr);
                if (inputStreamM47580 != null) {
                    inputStreamM47580.close();
                }
            } catch (Throwable th) {
                if (inputStreamM47580 != null) {
                    try {
                        inputStreamM47580.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CharacterCodingException unused) {
            throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The original file is not valid complete text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
        } catch (C10375 e) {
            throw e.f35544;
        }
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2748() throws C12731 {
        C16020.m37995();
    }
}
