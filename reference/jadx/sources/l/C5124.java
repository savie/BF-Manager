package l;

import java.nio.charset.StandardCharsets;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: l.ۚۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YU */
/* JADX INFO: loaded from: classes3.dex */
public class C5124 implements InterfaceC20478 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f17834;

    @Override // l.InterfaceC20478
    public int size() {
        return (((String) this.f17834).length() * 2) + 4;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public int mo1806(int i, byte[] bArr) {
        C4850.m13546(3, i, bArr);
        int i2 = i + 2;
        byte[] bytes = ((String) this.f17834).getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        C4850.m13546(0L, length, bArr);
        return (length + 2) - i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14277(int i) {
        ((WebSettingsBoundaryInterface) this.f17834).setForceDark(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo14276() {
        ((WebSettingsBoundaryInterface) this.f17834).setForceDarkBehavior(1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo14278() {
        ((WebSettingsBoundaryInterface) this.f17834).setAlgorithmicDarkeningAllowed(false);
    }
}
