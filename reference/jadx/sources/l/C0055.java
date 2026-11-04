package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.֡֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0055 implements InterfaceC13258 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f930;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6635[] f931;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ByteArrayOutputStream f932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10495 f933;

    public C0055(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, C6635[] c6635Arr, C10495 c10495) {
        this.f930 = bArr;
        this.f932 = byteArrayOutputStream;
        this.f931 = c6635Arr;
        this.f933 = c10495;
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        long j = c12512.f40174;
        byte[] bArr = this.f930;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 < length) {
            throw C9968.m25813("Appended bytes exceed the supported final file size.", j2, length);
        }
        try {
            InputStream inputStreamM31067 = c12512.m31067();
            try {
                this.f931[0] = C24535.m54816(inputStreamM31067, new C17954(this, bufferedOutputStream), c12512.f40174, this.f933, bArr);
                if (inputStreamM31067 != null) {
                    inputStreamM31067.close();
                }
            } catch (Throwable th) {
                if (inputStreamM31067 != null) {
                    try {
                        inputStreamM31067.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CharacterCodingException unused) {
            throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The original file is not valid complete text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
        } catch (C20805 e) {
            throw e.f66630;
        }
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo968() throws C10186 {
        C24535.m54817();
    }
}
