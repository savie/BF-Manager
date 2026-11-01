package com.amazonaws.internal;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.OutputStream;
import java.security.DigestInputStream;
import l.C10235;
import l.InterfaceC20818;

/* JADX INFO: loaded from: classes.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware, InterfaceC20818 {
    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo279() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).mo279();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        if (j <= 0) {
            return j;
        }
        int iMin = (int) Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, j);
        byte[] bArr = new byte[iMin];
        long j2 = j;
        while (j2 > 0) {
            int i = read(bArr, 0, (int) Math.min(j2, iMin));
            if (i == -1) {
                if (j2 == j) {
                    return -1L;
                }
                return j - j2;
            }
            j2 -= (long) i;
        }
        return j;
    }
}
